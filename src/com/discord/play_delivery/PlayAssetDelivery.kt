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
   private final lateinit var assetPackManagerWeakRef: WeakReference<W7.a>
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

      val var7: W7.a = var1.get() as W7.a;
      if (var7 != null) {
         val var11: java.lang.String = var0.h();
         var var9: java.lang.Boolean;
         if (var0.i() == 4) {
            val var4: AssetPackLocation = var7.c(var11);
            if (var4 != null) {
               assetPackLocations.put(var11, var4);
            }

            val var5: Log = Log.INSTANCE;
            val var8: StringBuilder = new StringBuilder();
            var8.append("Download of ");
            var8.append(var11);
            var8.append(" Asset complete");
            Log.i$default(var5, "PlayAssetDelivery", var8.toString(), null, 4, null);
            var9 = java.lang.Boolean.TRUE;
         } else {
            label26: {
               if (var0.i() != 5) {
                  var9 = null;
                  if (var0.i() != 6) {
                     break label26;
                  }
               }

               val var10: Log = Log.INSTANCE;
               val var6: StringBuilder = new StringBuilder();
               var6.append("Download of ");
               var6.append(var11);
               var6.append(" Asset failed");
               Log.i$default(var10, "PlayAssetDelivery", var6.toString(), null, 4, null);
               var9 = java.lang.Boolean.FALSE;
            }
         }

         if (var9 != null) {
            INSTANCE.flushAssetCallbacksWithResult(var11, var9);
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
      // 003: astore 5
      // 005: aconst_null
      // 006: astore 4
      // 008: aload 5
      // 00a: astore 3
      // 00b: aload 5
      // 00d: ifnonnull 017
      // 010: ldc "assetPackManagerWeakRef"
      // 012: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 015: aconst_null
      // 016: astore 3
      // 017: aload 3
      // 018: invokevirtual java/lang/ref/Reference.get ()Ljava/lang/Object;
      // 01b: checkcast W7/a
      // 01e: astore 6
      // 020: aload 6
      // 022: ifnull 031
      // 025: aload 6
      // 027: aload 1
      // 028: invokeinterface W7/a.c (Ljava/lang/String;)Lcom/google/android/play/core/assetpacks/AssetPackLocation; 2
      // 02d: astore 3
      // 02e: goto 033
      // 031: aconst_null
      // 032: astore 3
      // 033: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 036: astore 5
      // 038: new java/lang/StringBuilder
      // 03b: dup
      // 03c: invokespecial java/lang/StringBuilder.<init> ()V
      // 03f: astore 7
      // 041: aload 7
      // 043: ldc "Fetching "
      // 045: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 048: pop
      // 049: aload 7
      // 04b: aload 1
      // 04c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04f: pop
      // 050: aload 7
      // 052: ldc " Asset"
      // 054: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 057: pop
      // 058: aload 5
      // 05a: ldc "PlayAssetDelivery"
      // 05c: aload 7
      // 05e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 061: aconst_null
      // 062: bipush 4
      // 063: aconst_null
      // 064: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 067: aload 6
      // 069: ifnonnull 083
      // 06c: aload 4
      // 06e: astore 1
      // 06f: aload 2
      // 070: ifnull 14f
      // 073: aload 2
      // 074: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 077: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 07c: pop
      // 07d: aload 4
      // 07f: astore 1
      // 080: goto 14f
      // 083: aload 3
      // 084: ifnonnull 134
      // 087: getstatic com/discord/lifecycle/AppLifecycle.INSTANCE Lcom/discord/lifecycle/AppLifecycle;
      // 08a: invokevirtual com/discord/lifecycle/AppLifecycle.isForegrounded ()Z
      // 08d: ifne 0ca
      // 090: new java/lang/StringBuilder
      // 093: dup
      // 094: invokespecial java/lang/StringBuilder.<init> ()V
      // 097: astore 3
      // 098: aload 3
      // 099: ldc "Skipping fetch for "
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: pop
      // 09f: aload 3
      // 0a0: aload 1
      // 0a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a4: pop
      // 0a5: aload 3
      // 0a6: ldc ": app not in foreground"
      // 0a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ab: pop
      // 0ac: aload 5
      // 0ae: ldc "PlayAssetDelivery"
      // 0b0: aload 3
      // 0b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b4: aconst_null
      // 0b5: bipush 4
      // 0b6: aconst_null
      // 0b7: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 0ba: aload 2
      // 0bb: ifnull 0c8
      // 0be: aload 2
      // 0bf: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 0c2: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c7: pop
      // 0c8: aconst_null
      // 0c9: areturn
      // 0ca: aload 2
      // 0cb: ifnull 117
      // 0ce: getstatic com/discord/play_delivery/PlayAssetDelivery.pendingCallbacks Ljava/util/Map;
      // 0d1: astore 7
      // 0d3: aload 7
      // 0d5: monitorenter
      // 0d6: aload 7
      // 0d8: aload 1
      // 0d9: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0de: astore 5
      // 0e0: aload 5
      // 0e2: astore 3
      // 0e3: aload 5
      // 0e5: ifnonnull 101
      // 0e8: new java/util/ArrayList
      // 0eb: astore 3
      // 0ec: aload 3
      // 0ed: invokespecial java/util/ArrayList.<init> ()V
      // 0f0: aload 7
      // 0f2: aload 1
      // 0f3: aload 3
      // 0f4: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0f9: pop
      // 0fa: goto 101
      // 0fd: astore 1
      // 0fe: goto 112
      // 101: aload 3
      // 102: checkcast java/util/List
      // 105: aload 2
      // 106: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 10b: pop
      // 10c: aload 7
      // 10e: monitorexit
      // 10f: goto 117
      // 112: aload 7
      // 114: monitorexit
      // 115: aload 1
      // 116: athrow
      // 117: aload 6
      // 119: aload 1
      // 11a: invokestatic kotlin/collections/CollectionsKt.e (Ljava/lang/Object;)Ljava/util/List;
      // 11d: invokeinterface W7/a.b (Ljava/util/List;)Lcom/google/android/gms/tasks/Task; 2
      // 122: new com/discord/play_delivery/b
      // 125: dup
      // 126: aload 1
      // 127: invokespecial com/discord/play_delivery/b.<init> (Ljava/lang/String;)V
      // 12a: invokevirtual com/google/android/gms/tasks/Task.addOnCompleteListener (Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;
      // 12d: pop
      // 12e: aload 4
      // 130: astore 1
      // 131: goto 14f
      // 134: aload 2
      // 135: ifnull 142
      // 138: aload 2
      // 139: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 13c: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 141: pop
      // 142: getstatic com/discord/play_delivery/PlayAssetDelivery.assetPackLocations Ljava/util/Map;
      // 145: aload 1
      // 146: aload 3
      // 147: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 14c: pop
      // 14d: aload 3
      // 14e: astore 1
      // 14f: aload 1
      // 150: areturn
   }

   @JvmStatic
   fun `fetchAssetPackLocation$lambda$3`(var0: java.lang.String, var1: Task) {
      if (var1.j() != null) {
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
      val var6: AssetPackLocation = assetPackLocations.get(var1);
      var var4: AssetPackLocation = var6;
      if (var6 == null) {
         if (var2) {
            var4 = this.fetchAssetPackLocation(var1, var3);
         } else {
            var4 = null;
         }
      }

      var var7: java.lang.String;
      if (var4 == null) {
         var7 = null;
      } else if (var4.c() == 1) {
         var7 = null;
      } else {
         var7 = null;
         if (var4.c() == 0) {
            if (var4.b() == null) {
               val var8: Log = Log.INSTANCE;
               val var9: StringBuilder = new StringBuilder();
               var9.append("Asset ");
               var9.append(var1);
               var9.append(" has been fetched and is in storage,but doesn't have a valid storage path.");
               Log.w$default(var8, "PlayAssetDelivery", var9.toString(), null, 4, null);
               var7 = null;
            } else {
               var7 = var4.b();
            }
         }
      }

      return var7;
   }

   public fun initialize(applicationContext: Context) {
      val var2: W7.a = com.google.android.play.core.assetpacks.b.a(var1);
      var2.a(assetPackStateUpdateListener);
      assetPackManagerWeakRef = new WeakReference<>(var2);
   }

   public fun isAssetDeliveryAvailable(): Boolean {
      return assetDeliveryAvailable;
   }
}
