package com.discord.billing

import ac.K
import ac.U
import android.app.Activity
import androidx.lifecycle.LifecycleOwner
import com.android.billingclient.api.BillingClient
import com.android.billingclient.api.BillingResult
import com.android.billingclient.api.ProductDetails
import com.android.billingclient.api.Purchase
import com.discord.billing.types.ProductType
import com.discord.crash_reporting.CrashReporting
import com.discord.metric_monitor.MetricEvent
import com.discord.metric_monitor.MonitoringAgent
import com.discord.misc.utilities.backoff.ExponentialBackoff
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList
import java.util.concurrent.CancellationException
import kotlin.coroutines.Continuation
import kotlin.enums.EnumEntries
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope

@SourceDebugExtension(["SMAP\nBillingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingManager.kt\ncom/discord/billing/BillingManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,581:1\n1863#2,2:582\n1863#2,2:584\n1863#2,2:586\n1863#2,2:588\n*S KotlinDebug\n*F\n+ 1 BillingManager.kt\ncom/discord/billing/BillingManager\n*L\n216#1:582,2\n221#1:584,2\n272#1:586,2\n570#1:588,2\n*E\n"])
internal class BillingManager(reactContext: ReactApplicationContext,
   isProdBuild: Boolean,
   onConnectionUpdated: (Int) -> Unit,
   onPurchaseStateUpdated: (Int) -> Unit,
   onPurchaseUpdated: (String, String, String) -> Unit
) {
   private final val reactContext: ReactApplicationContext
   private final val isProdBuild: Boolean
   public final val onConnectionUpdated: (Int) -> Unit
   public final val onPurchaseStateUpdated: (Int) -> Unit
   public final val onPurchaseUpdated: (String, String, String) -> Unit
   private final var currentConnectionState: com.discord.billing.BillingManager.ConnectionState
   private final val connectionReadyListeners: MutableList<CompletableDeferred<Boolean>>
   private final val prodPackageName: String
   private final val devPackageName: String
   private final val allowedPackageNames: Set<String>
   private final lateinit var billingClient: BillingClient
   private final val billingClientStateListener: <unrepresentable>
   private final val backoff: ExponentialBackoff

   init {
      this.reactContext = var1;
      this.isProdBuild = var2;
      this.onConnectionUpdated = var3;
      this.onPurchaseStateUpdated = var4;
      this.onPurchaseUpdated = var5;
      this.currentConnectionState = BillingManager.ConnectionState.DISCONNECTED;
      this.connectionReadyListeners = new ArrayList<>();
      this.prodPackageName = "com.discord";
      this.devPackageName = "com.discord.debug.billingtesting";
      this.allowedPackageNames = Y.i(new java.lang.String[]{"com.discord", "com.discord.debug.billingtesting"});
      this.billingClientStateListener = new c2.c(this) {
         final BillingManager this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public void onBillingServiceDisconnected() {
            BillingManager.access$updateConnectionState(this.this$0, BillingManager.ConnectionState.DISCONNECTED);
            val var2: BillingClient = BillingManager.access$getBillingClient$p(this.this$0);
            var var1: BillingClient = var2;
            if (var2 == null) {
               Intrinsics.throwUninitializedPropertyAccessException("billingClient");
               var1 = null;
            }

            if (!var1.f()) {
               BillingManager.access$reconnect(this.this$0);
            }
         }

         @Override
         public void onBillingSetupFinished(BillingResult var1) {
            if (BillingManager.access$isNotOk(this.this$0, var1)) {
               BillingManager.access$reconnect(this.this$0);
            } else {
               BillingManager.access$getBackoff$p(this.this$0).succeed();
               BillingManager.access$updateConnectionState(this.this$0, BillingManager.ConnectionState.CONNECTED);
               BillingManager.loadPurchases$default(this.this$0, null, null, 3, null);
            }
         }
      };
      this.backoff = new ExponentialBackoff(U.d, 1000L, 300000L, 10);
   }

   private fun getCoroutineScope(context: ReactApplicationContext): CoroutineScope {
      val var3: Activity = var1.getCurrentActivity();
      val var2: Boolean = var3 is LifecycleOwner;
      var var4: Any = null;
      val var5: LifecycleOwner;
      if (var2) {
         var5 = var3 as LifecycleOwner;
      } else {
         var5 = null;
      }

      if (var5 != null) {
         var4 = androidx.lifecycle.p.a(var5);
      }

      if (var4 == null) {
         var4 = U.d;
      }

      return (CoroutineScope)var4;
   }

   private fun handlePurchases(billingResult: BillingResult, purchases: List<Purchase>?) {
      this.onPurchaseStateUpdated.invoke(var1.b());
      if (var2 != null && !var2.isEmpty()) {
         val var3: java.util.Iterator = var2.iterator();

         while (var3.hasNext()) {
            this.verifyPurchase(var3.next() as Purchase);
         }
      }
   }

   private operator fun ((Exception) -> Unit).invoke(errorMessage: String) {
      var1.invoke(new IllegalStateException(var2));
   }

   private fun isBillingClientReady(): Boolean {
      if (this.billingClient != null) {
         var var2: BillingClient = this.billingClient;
         if (this.billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            var2 = null;
         }

         if (var2.f()) {
            return true;
         }
      }

      return false;
   }

   private fun BillingResult.isNotOk(): Boolean {
      val var2: Boolean;
      if (var1.b() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private fun isRetryableError(billingResult: BillingResult): Boolean {
      val var2: Boolean;
      if (this.isNotOk(var1) && Y.i(new Integer[]{6, -1, 2, 12}).contains(var1.b())) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   @JvmStatic
   fun `loadPurchases$lambda$7`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `loadPurchases$lambda$8`(var0: Exception): Unit {
      return Unit.a;
   }

   private fun reconnect() {
      try {
         this.backoff.fail(new Function1<Continuation, Object>(this, null) {
            int label;
            final BillingManager this$0;

            {
               super(1, var2);
               this.this$0 = var1;
            }

            public final Continuation create(Continuation var1) {
               return new <anonymous constructor>(this.this$0, var1);
            }

            public final Object invoke(Continuation var1) {
               return (this.create(var1) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               Ca.b.e();
               if (this.label == 0) {
                  kotlin.c.b(var1);
                  val var2: BillingClient = BillingManager.access$getBillingClient$p(this.this$0);
                  var1 = var2;
                  if (var2 == null) {
                     Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                     var1 = null;
                  }

                  var1.l(BillingManager.access$getBillingClientStateListener$p(this.this$0));
                  BillingManager.access$updateConnectionState(this.this$0, BillingManager.ConnectionState.CONNECTING);
                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         });
      } catch (var3: Exception) {
         this.updateConnectionState(BillingManager.ConnectionState.ERROR);
      }
   }

   private suspend fun suspendUntilReady(timeoutMs: Long = ...): com.discord.billing.BillingManager.ClientReadyState {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 000: aload 3
      // 001: instanceof com/discord/billing/BillingManager$suspendUntilReady$1
      // 004: ifeq 02b
      // 007: aload 3
      // 008: checkcast com/discord/billing/BillingManager$suspendUntilReady$1
      // 00b: astore 5
      // 00d: aload 5
      // 00f: getfield com/discord/billing/BillingManager$suspendUntilReady$1.label I
      // 012: istore 4
      // 014: iload 4
      // 016: ldc_w -2147483648
      // 019: iand
      // 01a: ifeq 02b
      // 01d: aload 5
      // 01f: iload 4
      // 021: ldc_w -2147483648
      // 024: iadd
      // 025: putfield com/discord/billing/BillingManager$suspendUntilReady$1.label I
      // 028: goto 036
      // 02b: new com/discord/billing/BillingManager$suspendUntilReady$1
      // 02e: dup
      // 02f: aload 0
      // 030: aload 3
      // 031: invokespecial com/discord/billing/BillingManager$suspendUntilReady$1.<init> (Lcom/discord/billing/BillingManager;Lkotlin/coroutines/Continuation;)V
      // 034: astore 5
      // 036: aload 5
      // 038: getfield com/discord/billing/BillingManager$suspendUntilReady$1.result Ljava/lang/Object;
      // 03b: astore 8
      // 03d: invokestatic Ca/b.e ()Ljava/lang/Object;
      // 040: astore 7
      // 042: aload 5
      // 044: getfield com/discord/billing/BillingManager$suspendUntilReady$1.label I
      // 047: istore 4
      // 049: iload 4
      // 04b: ifeq 08d
      // 04e: iload 4
      // 050: bipush 1
      // 051: if_icmpne 082
      // 054: aload 5
      // 056: getfield com/discord/billing/BillingManager$suspendUntilReady$1.L$1 Ljava/lang/Object;
      // 059: checkcast kotlinx/coroutines/CompletableDeferred
      // 05c: astore 6
      // 05e: aload 5
      // 060: getfield com/discord/billing/BillingManager$suspendUntilReady$1.L$0 Ljava/lang/Object;
      // 063: checkcast com/discord/billing/BillingManager
      // 066: astore 7
      // 068: aload 6
      // 06a: astore 5
      // 06c: aload 7
      // 06e: astore 3
      // 06f: aload 8
      // 071: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 074: aload 6
      // 076: astore 5
      // 078: aload 7
      // 07a: astore 3
      // 07b: aload 8
      // 07d: astore 6
      // 07f: goto 138
      // 082: new java/lang/IllegalStateException
      // 085: dup
      // 086: ldc_w "call to 'resume' before 'invoke' with coroutine"
      // 089: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 08c: athrow
      // 08d: aload 8
      // 08f: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 092: aload 0
      // 093: invokespecial com/discord/billing/BillingManager.isBillingClientReady ()Z
      // 096: ifeq 09d
      // 099: getstatic com/discord/billing/BillingManager$ClientReadyState.IMMEDIATE Lcom/discord/billing/BillingManager$ClientReadyState;
      // 09c: areturn
      // 09d: aload 0
      // 09e: getfield com/discord/billing/BillingManager.currentConnectionState Lcom/discord/billing/BillingManager$ConnectionState;
      // 0a1: getstatic com/discord/billing/BillingManager$ConnectionState.DISCONNECTED Lcom/discord/billing/BillingManager$ConnectionState;
      // 0a4: if_acmpeq 0b1
      // 0a7: aload 0
      // 0a8: getfield com/discord/billing/BillingManager.currentConnectionState Lcom/discord/billing/BillingManager$ConnectionState;
      // 0ab: getstatic com/discord/billing/BillingManager$ConnectionState.ERROR Lcom/discord/billing/BillingManager$ConnectionState;
      // 0ae: if_acmpne 0b5
      // 0b1: aload 0
      // 0b2: invokespecial com/discord/billing/BillingManager.reconnect ()V
      // 0b5: aconst_null
      // 0b6: bipush 1
      // 0b7: aconst_null
      // 0b8: invokestatic ac/s.b (Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;
      // 0bb: astore 3
      // 0bc: aload 0
      // 0bd: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 0c0: astore 6
      // 0c2: aload 6
      // 0c4: monitorenter
      // 0c5: aload 0
      // 0c6: getfield com/discord/billing/BillingManager.currentConnectionState Lcom/discord/billing/BillingManager$ConnectionState;
      // 0c9: getstatic com/discord/billing/BillingManager$ConnectionState.CONNECTED Lcom/discord/billing/BillingManager$ConnectionState;
      // 0cc: if_acmpne 0dc
      // 0cf: getstatic com/discord/billing/BillingManager$ClientReadyState.IMMEDIATE Lcom/discord/billing/BillingManager$ClientReadyState;
      // 0d2: astore 3
      // 0d3: aload 6
      // 0d5: monitorexit
      // 0d6: aload 3
      // 0d7: areturn
      // 0d8: astore 3
      // 0d9: goto 178
      // 0dc: aload 0
      // 0dd: getfield com/discord/billing/BillingManager.currentConnectionState Lcom/discord/billing/BillingManager$ConnectionState;
      // 0e0: getstatic com/discord/billing/BillingManager$ConnectionState.ERROR Lcom/discord/billing/BillingManager$ConnectionState;
      // 0e3: if_acmpne 0ef
      // 0e6: getstatic com/discord/billing/BillingManager$ClientReadyState.TIMEOUT Lcom/discord/billing/BillingManager$ClientReadyState;
      // 0e9: astore 3
      // 0ea: aload 6
      // 0ec: monitorexit
      // 0ed: aload 3
      // 0ee: areturn
      // 0ef: aload 0
      // 0f0: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 0f3: aload 3
      // 0f4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f9: pop
      // 0fa: aload 6
      // 0fc: monitorexit
      // 0fd: new com/discord/billing/BillingManager$suspendUntilReady$3
      // 100: astore 6
      // 102: aload 6
      // 104: aload 3
      // 105: aconst_null
      // 106: invokespecial com/discord/billing/BillingManager$suspendUntilReady$3.<init> (Lkotlinx/coroutines/CompletableDeferred;Lkotlin/coroutines/Continuation;)V
      // 109: aload 5
      // 10b: aload 0
      // 10c: putfield com/discord/billing/BillingManager$suspendUntilReady$1.L$0 Ljava/lang/Object;
      // 10f: aload 5
      // 111: aload 3
      // 112: putfield com/discord/billing/BillingManager$suspendUntilReady$1.L$1 Ljava/lang/Object;
      // 115: aload 5
      // 117: bipush 1
      // 118: putfield com/discord/billing/BillingManager$suspendUntilReady$1.label I
      // 11b: lload 1
      // 11c: aload 6
      // 11e: aload 5
      // 120: invokestatic ac/t0.c (JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      // 123: astore 6
      // 125: aload 6
      // 127: aload 7
      // 129: if_acmpne 12f
      // 12c: aload 7
      // 12e: areturn
      // 12f: aload 0
      // 130: astore 7
      // 132: aload 3
      // 133: astore 5
      // 135: aload 7
      // 137: astore 3
      // 138: aload 6
      // 13a: checkcast com/discord/billing/BillingManager$ClientReadyState
      // 13d: astore 6
      // 13f: aload 6
      // 141: astore 3
      // 142: goto 170
      // 145: astore 5
      // 147: aload 0
      // 148: astore 5
      // 14a: aload 3
      // 14b: astore 6
      // 14d: aload 5
      // 14f: astore 3
      // 150: aload 6
      // 152: astore 5
      // 154: aload 3
      // 155: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 158: astore 6
      // 15a: aload 6
      // 15c: monitorenter
      // 15d: aload 3
      // 15e: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 161: aload 5
      // 163: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 168: pop
      // 169: aload 6
      // 16b: monitorexit
      // 16c: getstatic com/discord/billing/BillingManager$ClientReadyState.TIMEOUT Lcom/discord/billing/BillingManager$ClientReadyState;
      // 16f: astore 3
      // 170: aload 3
      // 171: areturn
      // 172: astore 3
      // 173: aload 6
      // 175: monitorexit
      // 176: aload 3
      // 177: athrow
      // 178: aload 6
      // 17a: monitorexit
      // 17b: aload 3
      // 17c: athrow
      // 17d: astore 6
      // 17f: goto 154
   }

   private fun trackBillingMetric(metricName: String, tags: List<String> = CollectionsKt.k()) {
      try {
         val var4: MonitoringAgent = MonitoringAgent.INSTANCE;
         val var5: StringBuilder = new StringBuilder();
         var5.append("billing_manager.");
         var5.append(var1);
         var4.increment(new MetricEvent(var5.toString(), var2));
      } catch (var6: Exception) {
      }
   }

   private fun updateConnectionState(state: com.discord.billing.BillingManager.ConnectionState) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: putfield com/discord/billing/BillingManager.currentConnectionState Lcom/discord/billing/BillingManager$ConnectionState;
      // 05: aload 0
      // 06: getfield com/discord/billing/BillingManager.onConnectionUpdated Lkotlin/jvm/functions/Function1;
      // 09: aload 1
      // 0a: invokevirtual com/discord/billing/BillingManager$ConnectionState.getValue ()I
      // 0d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 15: pop
      // 16: aload 1
      // 17: getstatic com/discord/billing/BillingManager$ConnectionState.CONNECTED Lcom/discord/billing/BillingManager$ConnectionState;
      // 1a: if_acmpne 66
      // 1d: aload 0
      // 1e: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 21: astore 1
      // 22: aload 1
      // 23: monitorenter
      // 24: aload 0
      // 25: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 28: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 2d: astore 2
      // 2e: aload 2
      // 2f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 34: ifeq 50
      // 37: aload 2
      // 38: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3d: checkcast kotlinx/coroutines/CompletableDeferred
      // 40: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 43: invokeinterface kotlinx/coroutines/CompletableDeferred.D0 (Ljava/lang/Object;)Z 2
      // 48: pop
      // 49: goto 2e
      // 4c: astore 2
      // 4d: goto 62
      // 50: aload 0
      // 51: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 54: invokeinterface java/util/List.clear ()V 1
      // 59: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 5c: astore 2
      // 5d: aload 1
      // 5e: monitorexit
      // 5f: goto b6
      // 62: aload 1
      // 63: monitorexit
      // 64: aload 2
      // 65: athrow
      // 66: aload 1
      // 67: getstatic com/discord/billing/BillingManager$ConnectionState.ERROR Lcom/discord/billing/BillingManager$ConnectionState;
      // 6a: if_acmpne b6
      // 6d: aload 0
      // 6e: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 71: astore 1
      // 72: aload 1
      // 73: monitorenter
      // 74: aload 0
      // 75: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 78: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 7d: astore 2
      // 7e: aload 2
      // 7f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 84: ifeq a0
      // 87: aload 2
      // 88: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8d: checkcast kotlinx/coroutines/CompletableDeferred
      // 90: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 93: invokeinterface kotlinx/coroutines/CompletableDeferred.D0 (Ljava/lang/Object;)Z 2
      // 98: pop
      // 99: goto 7e
      // 9c: astore 2
      // 9d: goto b2
      // a0: aload 0
      // a1: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // a4: invokeinterface java/util/List.clear ()V 1
      // a9: getstatic kotlin/Unit.a Lkotlin/Unit;
      // ac: astore 2
      // ad: aload 1
      // ae: monitorexit
      // af: goto b6
      // b2: aload 1
      // b3: monitorexit
      // b4: aload 2
      // b5: athrow
      // b6: return
   }

   private fun verifyPurchase(purchase: Purchase) {
      if (var1.g() == 1 && !var1.k() && this.allowedPackageNames.contains(var1.e())) {
         val var2: java.util.List = var1.f();

         for (java.lang.String var5 : var2) {
            val var3: Function3 = this.onPurchaseUpdated;
            val var6: java.lang.String = var1.i();
            val var7: java.lang.String = var1.e();
            var3.invoke(var6, var7, var5);
         }
      }
   }

   public fun close() {
      if (this.billingClient != null) {
         var var1: BillingClient = this.billingClient;
         if (this.billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            var1 = null;
         }

         var1.c();
         this.backoff.cancel();
         this.updateConnectionState(BillingManager.ConnectionState.DISCONNECTED);
      } else {
         this.updateConnectionState(BillingManager.ConnectionState.ERROR);
      }
   }

   public fun consumePurchase(purchaseToken: String, onSuccess: () -> Unit, onError: (BillingManagerException) -> Unit) {
      ac.f.d(this.getCoroutineScope(this.reactContext), K.a(), null, new Function2<CoroutineScope, Continuation, Object>(this, var3, var1, var2, null) {
         final Function1<BillingManagerException, Unit> $onError;
         final Function0<Unit> $onSuccess;
         final java.lang.String $purchaseToken;
         int label;
         final BillingManager this$0;

         {
            super(2, var5);
            this.this$0 = var1;
            this.$onError = var2x;
            this.$purchaseToken = var3;
            this.$onSuccess = var4;
         }

         private static final void invokeSuspend$lambda$0(BillingManager var0, Function1 var1x, Function0 var2x, BillingResult var3, java.lang.String var4) {
            if (BillingManager.access$isNotOk(var0, var3)) {
               var1x.invoke(BillingManagerException.Companion.fromBillingResult(var3.b()));
            } else {
               var2x.invoke();
            }
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, this.$onError, this.$purchaseToken, this.$onSuccess, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         // $VF: Duplicated exception handlers to handle obfuscated exceptions
         public final Object invokeSuspend(Object var1) {
            var var4: StringBuilder = (StringBuilder)Ca.b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               try {
                  kotlin.c.b(var1);
               } catch (var16: CancellationException) {
                  throw var16;
               } catch (var17: Exception) {
                  CrashReporting.captureException$default(CrashReporting.INSTANCE, var17, false, 2, null);
                  this.$onError.invoke(BillingManagerException.Companion.wrap(var17, "consumePurchase"));
                  return Unit.a;
               }
            } else {
               kotlin.c.b(var1);

               var var3: Any;
               try {
                  var1 = this.this$0;
                  this.label = 1;
                  var3 = BillingManager.suspendUntilReady$default(var1, 0L, this, 1, null);
               } catch (var14: CancellationException) {
                  throw var14;
               } catch (var15: Exception) {
                  CrashReporting.captureException$default(CrashReporting.INSTANCE, var15, false, 2, null);
                  this.$onError.invoke(BillingManagerException.Companion.wrap(var15, "consumePurchase"));
                  return Unit.a;
               }

               var1 = (BillingManager)var3;
               if (var3 === var4) {
                  return var4;
               }
            }

            try {
               val var24: BillingManager.ClientReadyState = var1 as BillingManager.ClientReadyState;
               var1 = this.this$0;
               val var5: java.lang.String = var24.getMetricValue();
               var4 = new StringBuilder();
               var4.append("client_ready:");
               var4.append(var5);
               BillingManager.access$trackBillingMetric(var1, "operation", CollectionsKt.n(new java.lang.String[]{"method:consume_purchase", var4.toString()}));
               if (var24 === BillingManager.ClientReadyState.TIMEOUT) {
                  this.$onError.invoke(new BillingManagerException.BillingClientNotReadyException());
                  return Unit.a;
               }
            } catch (var18: CancellationException) {
               throw var18;
            } catch (var19: Exception) {
               CrashReporting.captureException$default(CrashReporting.INSTANCE, var19, false, 2, null);
               this.$onError.invoke(BillingManagerException.Companion.wrap(var19, "consumePurchase"));
               return Unit.a;
            }

            var var25: BillingClient;
            try {
               var29 = c2.e.b().b(this.$purchaseToken).a();
               var25 = BillingManager.access$getBillingClient$p(this.this$0);
            } catch (var12: CancellationException) {
               throw var12;
            } catch (var13: Exception) {
               CrashReporting.captureException$default(CrashReporting.INSTANCE, var13, false, 2, null);
               this.$onError.invoke(BillingManagerException.Companion.wrap(var13, "consumePurchase"));
               return Unit.a;
            }

            var var22: BillingClient = var25;
            if (var25 == null) {
               try {
                  Intrinsics.throwUninitializedPropertyAccessException("billingClient");
               } catch (var10: CancellationException) {
                  throw var10;
               } catch (var11: Exception) {
                  CrashReporting.captureException$default(CrashReporting.INSTANCE, var11, false, 2, null);
                  this.$onError.invoke(BillingManagerException.Companion.wrap(var11, "consumePurchase"));
                  return Unit.a;
               }

               var22 = null;
            }

            try {
               var22.b(var29, new d(this.this$0, this.$onError, this.$onSuccess));
            } catch (var8: CancellationException) {
               throw var8;
            } catch (var9: Exception) {
               CrashReporting.captureException$default(CrashReporting.INSTANCE, var9, false, 2, null);
               this.$onError.invoke(BillingManagerException.Companion.wrap(var9, "consumePurchase"));
            }

            return Unit.a;
         }
      }, 2, null);
   }

   public fun getProducts(productIds: List<String>, productType: ProductType, reactPromise: Promise, onError: (BillingManagerException) -> Unit) {
      val var5: CoroutineScope = this.getCoroutineScope(this.reactContext);
      ac.f.d(
         var5,
         K.a(),
         null,
         new Function2<CoroutineScope, Continuation, Object>(this, var4, new ExponentialBackoff(var5, 0L, 0L, 0, 14, null), var3, var2, var1, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   ,
         2,
         null
      );
   }

   public fun loadPurchases(onSuccess: () -> Unit = new b(), onError: (Exception) -> Unit = new c()) {
      ac.f.d(
         this.getCoroutineScope(this.reactContext),
         K.a(),
         null,
         new Function2<CoroutineScope, Continuation, Object>(this, var2, var1, null) {
            final Function1<Exception, Unit> $onError;
            final Function0<Unit> $onSuccess;
            int label;
            final BillingManager this$0;

            {
               super(2, var4);
               this.this$0 = var1;
               this.$onError = var2x;
               this.$onSuccess = var3;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.this$0, this.$onError, this.$onSuccess, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            public final Object invokeSuspend(Object var1) {
               var var4: Any = Ca.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  try {
                     kotlin.c.b(var1);
                  } catch (var18: CancellationException) {
                     throw var18;
                  } catch (var19: Exception) {
                     CrashReporting.captureException$default(CrashReporting.INSTANCE, var19, false, 2, null);
                     this.$onError.invoke(var19);
                     return Unit.a;
                  }
               } else {
                  kotlin.c.b(var1);

                  var var3: Any;
                  try {
                     var1 = this.this$0;
                     this.label = 1;
                     var3 = BillingManager.suspendUntilReady$default(var1, 0L, this, 1, null);
                  } catch (var16: CancellationException) {
                     throw var16;
                  } catch (var17: Exception) {
                     CrashReporting.captureException$default(CrashReporting.INSTANCE, var17, false, 2, null);
                     this.$onError.invoke(var17);
                     return Unit.a;
                  }

                  var1 = (BillingManager)var3;
                  if (var3 === var4) {
                     return var4;
                  }
               }

               try {
                  val var5: BillingManager.ClientReadyState = var1 as BillingManager.ClientReadyState;
                  var4 = this.this$0;
                  val var27: java.lang.String = var5.getMetricValue();
                  val var23: StringBuilder = new StringBuilder();
                  var23.append("client_ready:");
                  var23.append(var27);
                  BillingManager.access$trackBillingMetric(
                     (BillingManager)var4, "operation", CollectionsKt.n(new java.lang.String[]{"method:load_purchases", var23.toString()})
                  );
                  if (var5 === BillingManager.ClientReadyState.TIMEOUT) {
                     this.$onError.invoke(new BillingManagerException.BillingClientNotReadyException());
                     return Unit.a;
                  }
               } catch (var20: CancellationException) {
                  throw var20;
               } catch (var21: Exception) {
                  CrashReporting.captureException$default(CrashReporting.INSTANCE, var21, false, 2, null);
                  this.$onError.invoke(var21);
                  return Unit.a;
               }

               var var28: BillingClient;
               try {
                  var28 = BillingManager.access$getBillingClient$p(this.this$0);
               } catch (var14: CancellationException) {
                  throw var14;
               } catch (var15: Exception) {
                  CrashReporting.captureException$default(CrashReporting.INSTANCE, var15, false, 2, null);
                  this.$onError.invoke(var15);
                  return Unit.a;
               }

               var var24: BillingClient = var28;
               if (var28 == null) {
                  try {
                     Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                  } catch (var12: CancellationException) {
                     throw var12;
                  } catch (var13: Exception) {
                     CrashReporting.captureException$default(CrashReporting.INSTANCE, var13, false, 2, null);
                     this.$onError.invoke(var13);
                     return Unit.a;
                  }

                  var24 = null;
               }

               try {
                  var24.k(c2.m.a().b("subs").a(), new f(this.this$0));
                  var28 = BillingManager.access$getBillingClient$p(this.this$0);
               } catch (var10: CancellationException) {
                  throw var10;
               } catch (var11: Exception) {
                  CrashReporting.captureException$default(CrashReporting.INSTANCE, var11, false, 2, null);
                  this.$onError.invoke(var11);
                  return Unit.a;
               }

               var var25: BillingClient = var28;
               if (var28 == null) {
                  try {
                     Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                  } catch (var8: CancellationException) {
                     throw var8;
                  } catch (var9: Exception) {
                     CrashReporting.captureException$default(CrashReporting.INSTANCE, var9, false, 2, null);
                     this.$onError.invoke(var9);
                     return Unit.a;
                  }

                  var25 = null;
               }

               try {
                  var25.k(c2.m.a().b("inapp").a(), new f(this.this$0));
                  this.$onSuccess.invoke();
               } catch (var6: CancellationException) {
                  throw var6;
               } catch (var7: Exception) {
                  CrashReporting.captureException$default(CrashReporting.INSTANCE, var7, false, 2, null);
                  this.$onError.invoke(var7);
               }

               return Unit.a;
            }
         },
         2,
         null
      );
   }

   public fun open() {
      val var3: BillingClient = BillingClient.h(this.reactContext).c(com.android.billingclient.api.d.c().b().a()).d(new a(this)).a();
      this.billingClient = var3;
      var var1: BillingClient = var3;
      if (var3 == null) {
         Intrinsics.throwUninitializedPropertyAccessException("billingClient");
         var1 = null;
      }

      if (!var1.f()) {
         try {
            var1 = this.billingClient;
         } catch (var6: Exception) {
            this.updateConnectionState(BillingManager.ConnectionState.ERROR);
            return;
         }

         if (var1 == null) {
            try {
               Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            } catch (var5: Exception) {
               this.updateConnectionState(BillingManager.ConnectionState.ERROR);
               return;
            }

            var1 = null;
         }

         try {
            var1.l(this.billingClientStateListener);
            this.updateConnectionState(BillingManager.ConnectionState.CONNECTING);
         } catch (var4: Exception) {
            this.updateConnectionState(BillingManager.ConnectionState.ERROR);
         }
      } else {
         this.updateConnectionState(BillingManager.ConnectionState.CONNECTED);
      }
   }

   public fun purchase(
      activity: Activity?,
      productId: String,
      productType: ProductType,
      userId: String,
      oldProductId: String? = null,
      purchaseToken: String? = null,
      offerId: String? = null,
      onSuccess: () -> Unit,
      onError: (BillingManagerException) -> Unit
   ) {
      if (var1 == null) {
         var9.invoke(new BillingManagerException.BillingException("Current React Activity not found"));
      } else {
         ac.f.d(
            this.getCoroutineScope(this.reactContext),
            K.a(),
            null,
            new Function2<CoroutineScope, Continuation, Object>(this, var9, var3, var2, var5, var6, var4, var7, var1, var8, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   ,
            2,
            null
         );
      }
   }

   private enum class ClientReadyState(metricValue: String) {
      AFTER_WAIT("after_wait"),
      IMMEDIATE("immediate"),
      TIMEOUT("timeout")
      public final val metricValue: String
      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private BillingManager.ClientReadyState[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<BillingManager.ClientReadyState> = $values();
         $VALUES = var0;
         $ENTRIES = Da.a.a(var0);
      }

      init {
         this.metricValue = var3;
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }

   private enum class ConnectionState(value: Int) {
      CONNECTED(2),
      CONNECTING(1),
      DISCONNECTED(0),
      ERROR(3)
      public final val value: Int
      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private BillingManager.ConnectionState[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<BillingManager.ConnectionState> = $values();
         $VALUES = var0;
         $ENTRIES = Da.a.a(var0);
      }

      init {
         this.value = var3;
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }

   public data class ProductDetailsResponse(billingResult: BillingResult, productDetails: List<ProductDetails>?) {
      public final val billingResult: BillingResult
      public final val productDetails: List<ProductDetails>?

      init {
         this.billingResult = var1;
         this.productDetails = var2;
      }

      public operator fun component1(): BillingResult {
         return this.billingResult;
      }

      public operator fun component2(): List<ProductDetails>? {
         return this.productDetails;
      }

      public fun copy(billingResult: BillingResult = var0.billingResult, productDetails: List<ProductDetails>? = var0.productDetails): com.discord.billing.BillingManager.ProductDetailsResponse {
         return new BillingManager.ProductDetailsResponse(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is BillingManager.ProductDetailsResponse) {
            return false;
         } else {
            var1 = var1;
            if (!(this.billingResult == var1.billingResult)) {
               return false;
            } else {
               return this.productDetails == var1.productDetails;
            }
         }
      }

      public override fun hashCode(): Int {
         val var2: Int = this.billingResult.hashCode();
         val var1: Int;
         if (this.productDetails == null) {
            var1 = 0;
         } else {
            var1 = this.productDetails.hashCode();
         }

         return var2 * 31 + var1;
      }

      public override fun toString(): String {
         val var1: BillingResult = this.billingResult;
         val var2: java.util.List = this.productDetails;
         val var3: StringBuilder = new StringBuilder();
         var3.append("ProductDetailsResponse(billingResult=");
         var3.append(var1);
         var3.append(", productDetails=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }
}
