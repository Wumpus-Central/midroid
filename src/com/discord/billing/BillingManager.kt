package com.discord.billing

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
import gu.m0
import gu.v0
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
      this.allowedPackageNames = b1.i(new java.lang.String[]{"com.discord", "com.discord.debug.billingtesting"});
      this.billingClientStateListener = new g7.c(this) {
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
      this.backoff = new ExponentialBackoff(v0.d, 1000L, 300000L, 10);
   }

   private fun getCoroutineScope(context: ReactApplicationContext): CoroutineScope {
      val var4: Activity = var1.getCurrentActivity();
      val var2: Boolean = var4 is LifecycleOwner;
      var var3: androidx.lifecycle.j = null;
      val var5: LifecycleOwner;
      if (var2) {
         var5 = var4 as LifecycleOwner;
      } else {
         var5 = null;
      }

      if (var5 != null) {
         var3 = androidx.lifecycle.p.a(var5);
      }

      return (CoroutineScope)(var3 ?: v0.d);
   }

   private fun handlePurchases(billingResult: BillingResult, purchases: List<Purchase>?) {
      this.onPurchaseStateUpdated.invoke(var1.b());
      if (var2 != null && !var2.isEmpty()) {
         val var4: java.util.Iterator = var2.iterator();

         while (var4.hasNext()) {
            this.verifyPurchase(var4.next() as Purchase);
         }
      }
   }

   private operator fun ((Exception) -> Unit).invoke(errorMessage: String) {
      var1.invoke(new IllegalStateException(var2));
   }

   private fun isBillingClientReady(): Boolean {
      if (this.billingClient != null) {
         var var1: BillingClient = this.billingClient;
         if (this.billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            var1 = null;
         }

         if (var1.f()) {
            return true;
         }
      }

      return false;
   }

   private fun BillingResult.isNotOk(): Boolean {
      return var1.b() != 0;
   }

   private fun isRetryableError(billingResult: BillingResult): Boolean {
      return this.isNotOk(var1) && b1.i(new Integer[]{6, -1, 2, 12}).contains(var1.b());
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
         this.backoff.fail(new Function1<Continuation<? super Unit>, Object>(this, null) {
            int label;
            final BillingManager this$0;

            {
               super(1, var2);
               this.this$0 = var1;
            }

            @Override
            public final Continuation<Unit> create(Continuation<?> var1) {
               return new <anonymous constructor>(this.this$0, var1);
            }

            public final Object invoke(Continuation<? super Unit> var1) {
               return (this.create(var1) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            @Override
            public final Object invokeSuspend(Object var1) {
               ot.b.f();
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
      // 03d: invokestatic ot/b.f ()Ljava/lang/Object;
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
      // 05c: astore 7
      // 05e: aload 5
      // 060: getfield com/discord/billing/BillingManager$suspendUntilReady$1.L$0 Ljava/lang/Object;
      // 063: checkcast com/discord/billing/BillingManager
      // 066: astore 6
      // 068: aload 7
      // 06a: astore 5
      // 06c: aload 6
      // 06e: astore 3
      // 06f: aload 8
      // 071: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 074: aload 7
      // 076: astore 5
      // 078: aload 6
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
      // 0b8: invokestatic gu/q.b (Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;
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
      // 0d9: goto 173
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
      // 120: invokestatic gu/t1.c (JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
      // 141: areturn
      // 142: astore 5
      // 144: aload 0
      // 145: astore 5
      // 147: aload 3
      // 148: astore 6
      // 14a: aload 5
      // 14c: astore 3
      // 14d: aload 6
      // 14f: astore 5
      // 151: aload 3
      // 152: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 155: astore 6
      // 157: aload 6
      // 159: monitorenter
      // 15a: aload 3
      // 15b: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 15e: aload 5
      // 160: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 165: pop
      // 166: aload 6
      // 168: monitorexit
      // 169: getstatic com/discord/billing/BillingManager$ClientReadyState.TIMEOUT Lcom/discord/billing/BillingManager$ClientReadyState;
      // 16c: areturn
      // 16d: astore 3
      // 16e: aload 6
      // 170: monitorexit
      // 171: aload 3
      // 172: athrow
      // 173: aload 6
      // 175: monitorexit
      // 176: aload 3
      // 177: athrow
      // 178: astore 6
      // 17a: goto 151
   }

   private fun trackBillingMetric(metricName: String, tags: List<String> = CollectionsKt.l()) {
      try {
         val var3: MonitoringAgent = MonitoringAgent.INSTANCE;
         val var4: StringBuilder = new StringBuilder();
         var4.append("billing_manager.");
         var4.append(var1);
         var3.increment(new MetricEvent(var4.toString(), var2));
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
      // 1a: if_acmpne 67
      // 1d: aload 0
      // 1e: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 21: astore 1
      // 22: aload 1
      // 23: monitorenter
      // 24: aload 0
      // 25: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 28: checkcast java/lang/Iterable
      // 2b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 30: astore 2
      // 31: aload 2
      // 32: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 37: ifeq 53
      // 3a: aload 2
      // 3b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 40: checkcast kotlinx/coroutines/CompletableDeferred
      // 43: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 46: invokeinterface kotlinx/coroutines/CompletableDeferred.D0 (Ljava/lang/Object;)Z 2
      // 4b: pop
      // 4c: goto 31
      // 4f: astore 2
      // 50: goto 63
      // 53: aload 0
      // 54: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 57: invokeinterface java/util/List.clear ()V 1
      // 5c: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 5f: astore 2
      // 60: aload 1
      // 61: monitorexit
      // 62: return
      // 63: aload 1
      // 64: monitorexit
      // 65: aload 2
      // 66: athrow
      // 67: aload 1
      // 68: getstatic com/discord/billing/BillingManager$ConnectionState.ERROR Lcom/discord/billing/BillingManager$ConnectionState;
      // 6b: if_acmpne b8
      // 6e: aload 0
      // 6f: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 72: astore 1
      // 73: aload 1
      // 74: monitorenter
      // 75: aload 0
      // 76: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // 79: checkcast java/lang/Iterable
      // 7c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 81: astore 2
      // 82: aload 2
      // 83: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 88: ifeq a4
      // 8b: aload 2
      // 8c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 91: checkcast kotlinx/coroutines/CompletableDeferred
      // 94: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 97: invokeinterface kotlinx/coroutines/CompletableDeferred.D0 (Ljava/lang/Object;)Z 2
      // 9c: pop
      // 9d: goto 82
      // a0: astore 2
      // a1: goto b4
      // a4: aload 0
      // a5: getfield com/discord/billing/BillingManager.connectionReadyListeners Ljava/util/List;
      // a8: invokeinterface java/util/List.clear ()V 1
      // ad: getstatic kotlin/Unit.a Lkotlin/Unit;
      // b0: astore 2
      // b1: aload 1
      // b2: monitorexit
      // b3: return
      // b4: aload 1
      // b5: monitorexit
      // b6: aload 2
      // b7: athrow
      // b8: return
   }

   private fun verifyPurchase(purchase: Purchase) {
      if (var1.g() == 1 && !var1.k() && this.allowedPackageNames.contains(var1.e())) {
         val var2: java.util.List = var1.f();

         for (java.lang.String var4 : var2) {
            val var7: Function3 = this.onPurchaseUpdated;
            val var3: java.lang.String = var1.i();
            val var5: java.lang.String = var1.e();
            var7.invoke(var3, var5, var4);
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
      gu.g.d(
         this.getCoroutineScope(this.reactContext),
         m0.a(),
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var3, var1, var2, null) {
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

            @Override
            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               return new <anonymous constructor>(this.this$0, this.$onError, this.$purchaseToken, this.$onSuccess, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            @Override
            public final Object invokeSuspend(Object var1) {
               label91: {
                  var var4: BillingManager.ClientReadyState = (BillingManager.ClientReadyState)ot.b.f();
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     try {
                        kotlin.c.b(var1);
                     } catch (var18: CancellationException) {
                        throw var18;
                     } catch (var19: Exception) {
                        var1 = var19;
                        break label91;
                     }
                  } else {
                     kotlin.c.b(var1);

                     try {
                        var1 = this.this$0;
                        this.label = 1;
                     } catch (var16: CancellationException) {
                        throw var16;
                     } catch (var17: Exception) {
                        var1 = var17;
                        break label91;
                     }

                     var var3: Any;
                     try {
                        var3 = BillingManager.suspendUntilReady$default(var1, 0L, this, 1, null);
                     } catch (var14: CancellationException) {
                        throw var14;
                     } catch (var15: Exception) {
                        var1 = var15;
                        break label91;
                     }

                     var1 = (BillingManager)var3;
                     if (var3 === var4) {
                        return var4;
                     }
                  }

                  try {
                     var4 = var1 as BillingManager.ClientReadyState;
                     var1 = this.this$0;
                     val var28: java.lang.String = var4.getMetricValue();
                     val var5: StringBuilder = new StringBuilder();
                     var5.append("client_ready:");
                     var5.append(var28);
                     BillingManager.access$trackBillingMetric(
                        var1, "operation", CollectionsKt.o(new java.lang.String[]{"method:consume_purchase", var5.toString()})
                     );
                     if (var4 === BillingManager.ClientReadyState.TIMEOUT) {
                        this.$onError.invoke(new BillingManagerException.BillingClientNotReadyException());
                        return Unit.a;
                     }
                  } catch (var20: CancellationException) {
                     throw var20;
                  } catch (var21: Exception) {
                     var1 = var21;
                     break label91;
                  }

                  var var29: BillingClient;
                  try {
                     var33 = g7.e.b().b(this.$purchaseToken).a();
                     var29 = BillingManager.access$getBillingClient$p(this.this$0);
                  } catch (var12: CancellationException) {
                     throw var12;
                  } catch (var13: Exception) {
                     var1 = var13;
                     break label91;
                  }

                  var var26: BillingClient = var29;
                  if (var29 == null) {
                     try {
                        Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                     } catch (var10: CancellationException) {
                        throw var10;
                     } catch (var11: Exception) {
                        var1 = var11;
                        break label91;
                     }

                     var26 = null;
                  }

                  try {
                     var26.b(var33, new com.discord.billing.d(this.this$0, this.$onError, this.$onSuccess));
                     return Unit.a;
                  } catch (var8: CancellationException) {
                     throw var8;
                  } catch (var9: Exception) {
                     var1 = var9;
                  }
               }

               CrashReporting.captureException$default(CrashReporting.INSTANCE, var1, false, 2, null);
               this.$onError.invoke(BillingManagerException.Companion.wrap(var1, "consumePurchase"));
               return Unit.a;
            }
         },
         2,
         null
      );
   }

   public fun getProducts(productIds: List<String>, productType: ProductType, reactPromise: Promise, onError: (BillingManagerException) -> Unit) {
      val var5: CoroutineScope = this.getCoroutineScope(this.reactContext);
      gu.g.d(
         var5,
         m0.a(),
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(
            this, var4, new ExponentialBackoff(var5, 0L, 0L, 0, 14, null), var3, var2, var1, null
         )// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   ,
         2,
         null
      );
   }

   public fun loadPurchases(onSuccess: () -> Unit = new com.discord.billing.b(), onError: (Exception) -> Unit = new com.discord.billing.c()) {
      gu.g.d(
         this.getCoroutineScope(this.reactContext),
         m0.a(),
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var2, var1, null) {
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

            @Override
            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               return new <anonymous constructor>(this.this$0, this.$onError, this.$onSuccess, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            @Override
            public final Object invokeSuspend(Object var1) {
               label111: {
                  var var4: BillingManager.ClientReadyState = (BillingManager.ClientReadyState)ot.b.f();
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     try {
                        kotlin.c.b(var1);
                     } catch (var20: CancellationException) {
                        throw var20;
                     } catch (var21: Exception) {
                        var1 = var21;
                        break label111;
                     }
                  } else {
                     kotlin.c.b(var1);

                     try {
                        var1 = this.this$0;
                        this.label = 1;
                     } catch (var18: CancellationException) {
                        throw var18;
                     } catch (var19: Exception) {
                        var1 = var19;
                        break label111;
                     }

                     var var3: Any;
                     try {
                        var3 = BillingManager.suspendUntilReady$default(var1, 0L, this, 1, null);
                     } catch (var16: CancellationException) {
                        throw var16;
                     } catch (var17: Exception) {
                        var1 = var17;
                        break label111;
                     }

                     var1 = (BillingManager)var3;
                     if (var3 === var4) {
                        return var4;
                     }
                  }

                  try {
                     var4 = var1 as BillingManager.ClientReadyState;
                     val var31: BillingManager = this.this$0;
                     val var5: java.lang.String = var4.getMetricValue();
                     val var27: StringBuilder = new StringBuilder();
                     var27.append("client_ready:");
                     var27.append(var5);
                     BillingManager.access$trackBillingMetric(
                        var31, "operation", CollectionsKt.o(new java.lang.String[]{"method:load_purchases", var27.toString()})
                     );
                     if (var4 === BillingManager.ClientReadyState.TIMEOUT) {
                        this.$onError.invoke(new BillingManagerException.BillingClientNotReadyException());
                        return Unit.a;
                     }
                  } catch (var22: CancellationException) {
                     throw var22;
                  } catch (var23: Exception) {
                     var1 = var23;
                     break label111;
                  }

                  var var32: BillingClient;
                  try {
                     var32 = BillingManager.access$getBillingClient$p(this.this$0);
                  } catch (var14: CancellationException) {
                     throw var14;
                  } catch (var15: Exception) {
                     var1 = var15;
                     break label111;
                  }

                  var var28: BillingClient = var32;
                  if (var32 == null) {
                     try {
                        Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                     } catch (var12: CancellationException) {
                        throw var12;
                     } catch (var13: Exception) {
                        var1 = var13;
                        break label111;
                     }

                     var28 = null;
                  }

                  try {
                     var28.k(g7.m.a().b("subs").a(), new com.discord.billing.f(this.this$0));
                     var32 = BillingManager.access$getBillingClient$p(this.this$0);
                  } catch (var10: CancellationException) {
                     throw var10;
                  } catch (var11: Exception) {
                     var1 = var11;
                     break label111;
                  }

                  var var29: BillingClient = var32;
                  if (var32 == null) {
                     try {
                        Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                     } catch (var8: CancellationException) {
                        throw var8;
                     } catch (var9: Exception) {
                        var1 = var9;
                        break label111;
                     }

                     var29 = null;
                  }

                  try {
                     var29.k(g7.m.a().b("inapp").a(), new com.discord.billing.f(this.this$0));
                     this.$onSuccess.invoke();
                     return Unit.a;
                  } catch (var6: CancellationException) {
                     throw var6;
                  } catch (var7: Exception) {
                     var1 = var7;
                  }
               }

               CrashReporting.captureException$default(CrashReporting.INSTANCE, var1, false, 2, null);
               this.$onError.invoke(var1);
               return Unit.a;
            }
         },
         2,
         null
      );
   }

   public fun open() {
      val var3: BillingClient = BillingClient.h(this.reactContext).c(com.android.billingclient.api.d.c().b().a()).d(new com.discord.billing.a(this)).a();
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
         gu.g.d(
            this.getCoroutineScope(this.reactContext),
            m0.a(),
            null,
            new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var9, var3, var2, var5, var6, var4, var7, var1, var8, null)// $VF: Couldn't be decompiled
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
         $ENTRIES = pt.a.a(var0);
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
         $ENTRIES = pt.a.a(var0);
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
         val var3: BillingResult = this.billingResult;
         val var1: java.util.List = this.productDetails;
         val var2: StringBuilder = new StringBuilder();
         var2.append("ProductDetailsResponse(billingResult=");
         var2.append(var3);
         var2.append(", productDetails=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }
}
