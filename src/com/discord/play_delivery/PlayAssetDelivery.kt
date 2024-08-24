package com.discord.play_delivery

import android.content.Context
import com.discord.logging.Log
import com.google.android.gms.tasks.Task
import com.google.android.play.core.assetpacks.AssetPackLocation
import com.google.android.play.core.assetpacks.AssetPackState
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener
import java.lang.ref.WeakReference
import java.util.LinkedHashMap
import kotlin.jvm.internal.r

public object PlayAssetDelivery {
   private const val TAG: String = "PlayAssetDelivery"
   private final lateinit var assetPackManagerWeakRef: WeakReference<hc.a>
   private final var assetDeliveryAvailable: Boolean = true
   private final val pendingCallbacks: MutableMap<String, MutableList<(Boolean) -> Unit>> = new LinkedHashMap()
   private final val assetPackLocations: MutableMap<String, AssetPackLocation> = new LinkedHashMap()
   private final val assetPackStateUpdateListener: AssetPackStateUpdateListener = new a()

   @JvmStatic
   fun `assetPackStateUpdateListener$lambda$0`(var0: AssetPackState) {
      r.h(var0, "assetPackState");
      var var1: WeakReference = assetPackManagerWeakRef;
      if (assetPackManagerWeakRef == null) {
         r.y("assetPackManagerWeakRef");
         var1 = null;
      }

      val var7: hc.a = var1.get() as hc.a;
      if (var7 != null) {
         val var11: java.lang.String = var0.g();
         r.g(var11, "name()");
         var var9: java.lang.Boolean;
         if (var0.h() == 4) {
            val var4: AssetPackLocation = var7.c(var11);
            if (var4 != null) {
               assetPackLocations.put(var11, var4);
            }

            val var8: Log = Log.INSTANCE;
            val var5: StringBuilder = new StringBuilder();
            var5.append("Download of ");
            var5.append(var11);
            var5.append(" Asset complete");
            Log.i$default(var8, "PlayAssetDelivery", var5.toString(), null, 4, null);
            var9 = java.lang.Boolean.TRUE;
         } else {
            label26: {
               if (var0.h() != 5) {
                  var9 = null;
                  if (var0.h() != 6) {
                     break label26;
                  }
               }

               val var6: Log = Log.INSTANCE;
               val var10: StringBuilder = new StringBuilder();
               var10.append("Download of ");
               var10.append(var11);
               var10.append(" Asset failed");
               Log.i$default(var6, "PlayAssetDelivery", var10.toString(), null, 4, null);
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:555)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
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
      // 012: invokestatic kotlin/jvm/internal/r.y (Ljava/lang/String;)V
      // 015: aconst_null
      // 016: astore 3
      // 017: aload 3
      // 018: invokevirtual java/lang/ref/Reference.get ()Ljava/lang/Object;
      // 01b: checkcast hc/a
      // 01e: astore 6
      // 020: aload 6
      // 022: ifnull 031
      // 025: aload 6
      // 027: aload 1
      // 028: invokeinterface hc/a.c (Ljava/lang/String;)Lcom/google/android/play/core/assetpacks/AssetPackLocation; 2
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
      // 070: ifnull 106
      // 073: aload 2
      // 074: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 077: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 07c: pop
      // 07d: aload 4
      // 07f: astore 1
      // 080: goto 106
      // 083: aload 3
      // 084: ifnonnull 0eb
      // 087: aload 2
      // 088: ifnull 0ce
      // 08b: getstatic com/discord/play_delivery/PlayAssetDelivery.pendingCallbacks Ljava/util/Map;
      // 08e: astore 7
      // 090: aload 7
      // 092: monitorenter
      // 093: aload 7
      // 095: aload 1
      // 096: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 09b: astore 5
      // 09d: aload 5
      // 09f: astore 3
      // 0a0: aload 5
      // 0a2: ifnonnull 0b7
      // 0a5: new java/util/ArrayList
      // 0a8: astore 3
      // 0a9: aload 3
      // 0aa: invokespecial java/util/ArrayList.<init> ()V
      // 0ad: aload 7
      // 0af: aload 1
      // 0b0: aload 3
      // 0b1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0b6: pop
      // 0b7: aload 3
      // 0b8: checkcast java/util/List
      // 0bb: aload 2
      // 0bc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0c1: pop
      // 0c2: aload 7
      // 0c4: monitorexit
      // 0c5: goto 0ce
      // 0c8: astore 1
      // 0c9: aload 7
      // 0cb: monitorexit
      // 0cc: aload 1
      // 0cd: athrow
      // 0ce: aload 6
      // 0d0: aload 1
      // 0d1: invokestatic kotlin/collections/h.d (Ljava/lang/Object;)Ljava/util/List;
      // 0d4: invokeinterface hc/a.b (Ljava/util/List;)Lcom/google/android/gms/tasks/Task; 2
      // 0d9: new com/discord/play_delivery/b
      // 0dc: dup
      // 0dd: aload 1
      // 0de: invokespecial com/discord/play_delivery/b.<init> (Ljava/lang/String;)V
      // 0e1: invokevirtual com/google/android/gms/tasks/Task.c (Lhb/d;)Lcom/google/android/gms/tasks/Task;
      // 0e4: pop
      // 0e5: aload 4
      // 0e7: astore 1
      // 0e8: goto 106
      // 0eb: aload 2
      // 0ec: ifnull 0f9
      // 0ef: aload 2
      // 0f0: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 0f3: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0f8: pop
      // 0f9: getstatic com/discord/play_delivery/PlayAssetDelivery.assetPackLocations Ljava/util/Map;
      // 0fc: aload 1
      // 0fd: aload 3
      // 0fe: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 103: pop
      // 104: aload 3
      // 105: astore 1
      // 106: aload 1
      // 107: areturn
   }

   @JvmStatic
   fun `fetchAssetPackLocation$lambda$3`(var0: java.lang.String, var1: Task) {
      r.h(var0, "$assetPackName");
      r.h(var1, "it");
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:555)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
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
      // 10: astore 4
      // 12: aload 4
      // 14: ifnull 49
      // 17: aload 4
      // 19: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1e: astore 1
      // 1f: aload 1
      // 20: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 25: ifeq 3e
      // 28: aload 1
      // 29: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2e: checkcast kotlin/jvm/functions/Function1
      // 31: iload 2
      // 32: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 35: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3a: pop
      // 3b: goto 1f
      // 3e: aload 4
      // 40: invokeinterface java/util/List.clear ()V 1
      // 45: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 48: astore 1
      // 49: aload 3
      // 4a: monitorexit
      // 4b: return
      // 4c: astore 1
      // 4d: aload 3
      // 4e: monitorexit
      // 4f: aload 1
      // 50: athrow
   }

   public fun getOrFetchAssetPackLocation(assetPackName: String, successCallback: ((Boolean) -> Unit)? = null): String? {
      r.h(var1, "assetPackName");
      val var4: AssetPackLocation = assetPackLocations.get(var1);
      var var3: AssetPackLocation = var4;
      if (var4 == null) {
         var3 = this.fetchAssetPackLocation(var1, var2);
      }

      var var5: java.lang.String;
      if (var3 == null) {
         var5 = null;
      } else if (var3.c() == 1) {
         var5 = null;
      } else {
         var5 = null;
         if (var3.c() == 0) {
            if (var3.b() == null) {
               val var6: Log = Log.INSTANCE;
               val var7: StringBuilder = new StringBuilder();
               var7.append("Asset ");
               var7.append(var1);
               var7.append(" has been fetched and is in storage,but doesn't have a valid storage path.");
               Log.w$default(var6, "PlayAssetDelivery", var7.toString(), null, 4, null);
               var5 = null;
            } else {
               var5 = var3.b();
            }
         }
      }

      return var5;
   }

   public fun initialize(applicationContext: Context) {
      r.h(var1, "applicationContext");
      val var2: hc.a = com.google.android.play.core.assetpacks.b.a(var1);
      r.g(var2, "getInstance(applicationContext)");
      var2.a(assetPackStateUpdateListener);
      assetPackManagerWeakRef = new WeakReference<>(var2);
   }

   public fun isAssetDeliveryAvailable(): Boolean {
      return assetDeliveryAvailable;
   }
}
