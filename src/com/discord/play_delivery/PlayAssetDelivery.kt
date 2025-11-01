package com.discord.play_delivery

import android.content.Context
import com.discord.logging.Log
import com.google.android.gms.tasks.Task
import com.google.android.play.core.assetpacks.AssetPackLocation
import com.google.android.play.core.assetpacks.AssetPackState
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener
import java.lang.ref.WeakReference
import java.util.LinkedHashMap
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nPlayAssetDelivery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayAssetDelivery.kt\ncom/discord/play_delivery/PlayAssetDelivery\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 com.google.android.play:asset-delivery-ktx@@2.3.0\ncom/google/android/play/core/ktx/AssetPackManagerKtxKt\n*L\n1#1,151:1\n381#2,7:152\n44#3:159\n*S KotlinDebug\n*F\n+ 1 PlayAssetDelivery.kt\ncom/discord/play_delivery/PlayAssetDelivery\n*L\n112#1:152,7\n28#1:159\n*E\n"])
public object PlayAssetDelivery {
   private const val TAG: String = "PlayAssetDelivery"
   private final lateinit var assetPackManagerWeakRef: WeakReference<bj.a>
   private final var assetDeliveryAvailable: Boolean = true
   private final val pendingCallbacks: MutableMap<String, MutableList<(Boolean) -> Unit>> = new LinkedHashMap()
   private final val assetPackLocations: MutableMap<String, AssetPackLocation> = new LinkedHashMap()
   private final val assetPackStateUpdateListener: AssetPackStateUpdateListener = new a()

   @JvmStatic
   fun `assetPackStateUpdateListener$lambda$0`(var0: AssetPackState) {
      var var1: WeakReference = assetPackManagerWeakRef;
      if (assetPackManagerWeakRef == null) {
         Intrinsics.throwUninitializedPropertyAccessException("assetPackManagerWeakRef");
         var1 = null;
      }

      val var7: bj.a = var1.get() as bj.a;
      if (var7 != null) {
         val var11: java.lang.String = var0.h();
         var var8: java.lang.Boolean;
         if (var0.i() == 4) {
            val var5: AssetPackLocation = var7.c(var11);
            if (var5 != null) {
               assetPackLocations.put(var11, var5);
            }

            val var6: Log = Log.INSTANCE;
            val var10: StringBuilder = new StringBuilder();
            var10.append("Download of ");
            var10.append(var11);
            var10.append(" Asset complete");
            Log.i$default(var6, "PlayAssetDelivery", var10.toString(), null, 4, null);
            var8 = java.lang.Boolean.TRUE;
         } else {
            label34: {
               if (var0.i() != 5) {
                  var8 = null;
                  if (var0.i() != 6) {
                     break label34;
                  }
               }

               val var4: Log = Log.INSTANCE;
               val var9: StringBuilder = new StringBuilder();
               var9.append("Download of ");
               var9.append(var11);
               var9.append(" Asset failed");
               Log.i$default(var4, "PlayAssetDelivery", var9.toString(), null, 4, null);
               var8 = java.lang.Boolean.FALSE;
            }
         }

         if (var8 != null) {
            INSTANCE.flushAssetCallbacksWithResult(var11, var8);
         }
      }
   }

   private fun fetchAssetPackLocation(assetPackName: String, successCallback: ((Boolean) -> Unit)? = null): AssetPackLocation? {
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
      // 000: getstatic com/discord/play_delivery/PlayAssetDelivery.assetPackManagerWeakRef Ljava/lang/ref/WeakReference;
      // 003: astore 4
      // 005: aload 4
      // 007: astore 3
      // 008: aload 4
      // 00a: ifnonnull 014
      // 00d: ldc "assetPackManagerWeakRef"
      // 00f: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 012: aconst_null
      // 013: astore 3
      // 014: aload 3
      // 015: invokevirtual java/lang/ref/Reference.get ()Ljava/lang/Object;
      // 018: checkcast bj/a
      // 01b: astore 5
      // 01d: aload 5
      // 01f: ifnull 02e
      // 022: aload 5
      // 024: aload 1
      // 025: invokeinterface bj/a.c (Ljava/lang/String;)Lcom/google/android/play/core/assetpacks/AssetPackLocation; 2
      // 02a: astore 3
      // 02b: goto 030
      // 02e: aconst_null
      // 02f: astore 3
      // 030: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 033: astore 4
      // 035: new java/lang/StringBuilder
      // 038: dup
      // 039: invokespecial java/lang/StringBuilder.<init> ()V
      // 03c: astore 6
      // 03e: aload 6
      // 040: ldc "Fetching "
      // 042: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 045: pop
      // 046: aload 6
      // 048: aload 1
      // 049: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04c: pop
      // 04d: aload 6
      // 04f: ldc " Asset"
      // 051: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 054: pop
      // 055: aload 4
      // 057: ldc "PlayAssetDelivery"
      // 059: aload 6
      // 05b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 05e: aconst_null
      // 05f: bipush 4
      // 060: aconst_null
      // 061: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 064: aload 5
      // 066: ifnonnull 079
      // 069: aload 2
      // 06a: ifnull 077
      // 06d: aload 2
      // 06e: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 071: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 076: pop
      // 077: aconst_null
      // 078: areturn
      // 079: aload 3
      // 07a: ifnonnull 126
      // 07d: getstatic com/discord/lifecycle/AppLifecycle.INSTANCE Lcom/discord/lifecycle/AppLifecycle;
      // 080: invokevirtual com/discord/lifecycle/AppLifecycle.isForegrounded ()Z
      // 083: ifne 0c0
      // 086: new java/lang/StringBuilder
      // 089: dup
      // 08a: invokespecial java/lang/StringBuilder.<init> ()V
      // 08d: astore 3
      // 08e: aload 3
      // 08f: ldc "Skipping fetch for "
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: pop
      // 095: aload 3
      // 096: aload 1
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: pop
      // 09b: aload 3
      // 09c: ldc ": app not in foreground"
      // 09e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a1: pop
      // 0a2: aload 4
      // 0a4: ldc "PlayAssetDelivery"
      // 0a6: aload 3
      // 0a7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0aa: aconst_null
      // 0ab: bipush 4
      // 0ac: aconst_null
      // 0ad: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 0b0: aload 2
      // 0b1: ifnull 0be
      // 0b4: aload 2
      // 0b5: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 0b8: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0bd: pop
      // 0be: aconst_null
      // 0bf: areturn
      // 0c0: aload 2
      // 0c1: ifnull 10d
      // 0c4: getstatic com/discord/play_delivery/PlayAssetDelivery.pendingCallbacks Ljava/util/Map;
      // 0c7: astore 6
      // 0c9: aload 6
      // 0cb: monitorenter
      // 0cc: aload 6
      // 0ce: aload 1
      // 0cf: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d4: astore 4
      // 0d6: aload 4
      // 0d8: astore 3
      // 0d9: aload 4
      // 0db: ifnonnull 0f7
      // 0de: new java/util/ArrayList
      // 0e1: astore 3
      // 0e2: aload 3
      // 0e3: invokespecial java/util/ArrayList.<init> ()V
      // 0e6: aload 6
      // 0e8: aload 1
      // 0e9: aload 3
      // 0ea: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0ef: pop
      // 0f0: goto 0f7
      // 0f3: astore 1
      // 0f4: goto 108
      // 0f7: aload 3
      // 0f8: checkcast java/util/List
      // 0fb: aload 2
      // 0fc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 101: pop
      // 102: aload 6
      // 104: monitorexit
      // 105: goto 10d
      // 108: aload 6
      // 10a: monitorexit
      // 10b: aload 1
      // 10c: athrow
      // 10d: aload 5
      // 10f: aload 1
      // 110: invokestatic kotlin/collections/CollectionsKt.e (Ljava/lang/Object;)Ljava/util/List;
      // 113: invokeinterface bj/a.b (Ljava/util/List;)Lcom/google/android/gms/tasks/Task; 2
      // 118: new com/discord/play_delivery/b
      // 11b: dup
      // 11c: aload 1
      // 11d: invokespecial com/discord/play_delivery/b.<init> (Ljava/lang/String;)V
      // 120: invokevirtual com/google/android/gms/tasks/Task.addOnCompleteListener (Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;
      // 123: pop
      // 124: aconst_null
      // 125: areturn
      // 126: aload 2
      // 127: ifnull 134
      // 12a: aload 2
      // 12b: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 12e: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 133: pop
      // 134: getstatic com/discord/play_delivery/PlayAssetDelivery.assetPackLocations Ljava/util/Map;
      // 137: aload 1
      // 138: aload 3
      // 139: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 13e: pop
      // 13f: aload 3
      // 140: areturn
   }

   @JvmStatic
   fun `fetchAssetPackLocation$lambda$3`(var0: java.lang.String, var1: Task) {
      if (var1.k() != null) {
         assetDeliveryAvailable = false;
         INSTANCE.flushAssetCallbacksWithResult(var0, false);
      }
   }

   private fun flushAssetCallbacksWithResult(assetPackName: String, result: Boolean) {
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
      // 00: getstatic com/discord/play_delivery/PlayAssetDelivery.pendingCallbacks Ljava/util/Map;
      // 03: astore 3
      // 04: aload 3
      // 05: monitorenter
      // 06: aload 3
      // 07: aload 1
      // 08: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d: checkcast java/util/List
      // 10: astore 1
      // 11: aload 1
      // 12: ifnull 4c
      // 15: aload 1
      // 16: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1b: astore 4
      // 1d: aload 4
      // 1f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 24: ifeq 42
      // 27: aload 4
      // 29: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2e: checkcast kotlin/jvm/functions/Function1
      // 31: iload 2
      // 32: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 35: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3a: pop
      // 3b: goto 1d
      // 3e: astore 1
      // 3f: goto 4f
      // 42: aload 1
      // 43: invokeinterface java/util/List.clear ()V 1
      // 48: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 4b: astore 1
      // 4c: aload 3
      // 4d: monitorexit
      // 4e: return
      // 4f: aload 3
      // 50: monitorexit
      // 51: aload 1
      // 52: athrow
   }

   public fun getAssetPackLocation(assetPackName: String, tryToFetch: Boolean, successCallback: ((Boolean) -> Unit)? = null): String? {
      val var5: AssetPackLocation = assetPackLocations.get(var1);
      var var4: AssetPackLocation = var5;
      if (var5 == null) {
         if (var2) {
            var4 = this.fetchAssetPackLocation(var1, var3);
         } else {
            var4 = null;
         }
      }

      if (var4 == null) {
         return null;
      } else if (var4.c() == 1) {
         return null;
      } else if (var4.c() == 0) {
         if (var4.b() == null) {
            val var6: Log = Log.INSTANCE;
            val var7: StringBuilder = new StringBuilder();
            var7.append("Asset ");
            var7.append(var1);
            var7.append(" has been fetched and is in storage,but doesn't have a valid storage path.");
            Log.w$default(var6, "PlayAssetDelivery", var7.toString(), null, 4, null);
            return null;
         } else {
            return var4.b();
         }
      } else {
         return null;
      }
   }

   public fun initialize(applicationContext: Context) {
      val var2: bj.a = com.google.android.play.core.assetpacks.b.a(var1);
      var2.a(assetPackStateUpdateListener);
      assetPackManagerWeakRef = new WeakReference<>(var2);
   }

   public fun isAssetDeliveryAvailable(): Boolean {
      return assetDeliveryAvailable;
   }
}
