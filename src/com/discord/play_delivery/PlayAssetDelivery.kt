package com.discord.play_delivery

import android.content.Context
import com.discord.logging.Log
import com.google.android.gms.tasks.Task
import com.google.android.play.core.assetpacks.AssetPackLocation
import com.google.android.play.core.assetpacks.AssetPackState
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener
import java.lang.ref.WeakReference
import java.util.LinkedHashMap
import kotlin.jvm.internal.q

public object PlayAssetDelivery {
   private const val TAG: String = "PlayAssetDelivery"
   private final lateinit var assetPackManagerWeakRef: WeakReference<pc.a>
   private final var assetDeliveryAvailable: Boolean = true
   private final val pendingCallbacks: MutableMap<String, MutableList<(Boolean) -> Unit>> = new LinkedHashMap()
   private final val assetPackLocations: MutableMap<String, AssetPackLocation> = new LinkedHashMap()
   private final val assetPackStateUpdateListener: AssetPackStateUpdateListener = new a()

   @JvmStatic
   fun `assetPackStateUpdateListener$lambda$0`(var0: AssetPackState) {
      q.h(var0, "assetPackState");
      var var1: WeakReference = assetPackManagerWeakRef;
      if (assetPackManagerWeakRef == null) {
         q.y("assetPackManagerWeakRef");
         var1 = null;
      }

      val var7: pc.a = var1.get() as pc.a;
      if (var7 != null) {
         val var11: java.lang.String = var0.g();
         q.g(var11, "name()");
         var var9: java.lang.Boolean;
         if (var0.h() == 4) {
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
               if (var0.h() != 5) {
                  var9 = null;
                  if (var0.h() != 6) {
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
      // 012: invokestatic kotlin/jvm/internal/q.y (Ljava/lang/String;)V
      // 015: aconst_null
      // 016: astore 3
      // 017: aload 3
      // 018: invokevirtual java/lang/ref/Reference.get ()Ljava/lang/Object;
      // 01b: checkcast pc/a
      // 01e: astore 6
      // 020: aload 6
      // 022: ifnull 031
      // 025: aload 6
      // 027: aload 1
      // 028: invokeinterface pc/a.c (Ljava/lang/String;)Lcom/google/android/play/core/assetpacks/AssetPackLocation; 2
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
      // 070: ifnull 10c
      // 073: aload 2
      // 074: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 077: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 07c: pop
      // 07d: aload 4
      // 07f: astore 1
      // 080: goto 10c
      // 083: aload 3
      // 084: ifnonnull 0f1
      // 087: aload 2
      // 088: ifnull 0d4
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
      // 0a2: ifnonnull 0be
      // 0a5: new java/util/ArrayList
      // 0a8: astore 3
      // 0a9: aload 3
      // 0aa: invokespecial java/util/ArrayList.<init> ()V
      // 0ad: aload 7
      // 0af: aload 1
      // 0b0: aload 3
      // 0b1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0b6: pop
      // 0b7: goto 0be
      // 0ba: astore 1
      // 0bb: goto 0cf
      // 0be: aload 3
      // 0bf: checkcast java/util/List
      // 0c2: aload 2
      // 0c3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0c8: pop
      // 0c9: aload 7
      // 0cb: monitorexit
      // 0cc: goto 0d4
      // 0cf: aload 7
      // 0d1: monitorexit
      // 0d2: aload 1
      // 0d3: athrow
      // 0d4: aload 6
      // 0d6: aload 1
      // 0d7: invokestatic kotlin/collections/i.e (Ljava/lang/Object;)Ljava/util/List;
      // 0da: invokeinterface pc/a.b (Ljava/util/List;)Lcom/google/android/gms/tasks/Task; 2
      // 0df: new com/discord/play_delivery/b
      // 0e2: dup
      // 0e3: aload 1
      // 0e4: invokespecial com/discord/play_delivery/b.<init> (Ljava/lang/String;)V
      // 0e7: invokevirtual com/google/android/gms/tasks/Task.d (Lxb/d;)Lcom/google/android/gms/tasks/Task;
      // 0ea: pop
      // 0eb: aload 4
      // 0ed: astore 1
      // 0ee: goto 10c
      // 0f1: aload 2
      // 0f2: ifnull 0ff
      // 0f5: aload 2
      // 0f6: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 0f9: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0fe: pop
      // 0ff: getstatic com/discord/play_delivery/PlayAssetDelivery.assetPackLocations Ljava/util/Map;
      // 102: aload 1
      // 103: aload 3
      // 104: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 109: pop
      // 10a: aload 3
      // 10b: astore 1
      // 10c: aload 1
      // 10d: areturn
   }

   @JvmStatic
   fun `fetchAssetPackLocation$lambda$3`(var0: java.lang.String, var1: Task) {
      q.h(var0, "$assetPackName");
      q.h(var1, "it");
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
      // 10: astore 4
      // 12: aload 4
      // 14: ifnull 4d
      // 17: aload 4
      // 19: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1e: astore 1
      // 1f: aload 1
      // 20: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 25: ifeq 42
      // 28: aload 1
      // 29: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2e: checkcast kotlin/jvm/functions/Function1
      // 31: iload 2
      // 32: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 35: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3a: pop
      // 3b: goto 1f
      // 3e: astore 1
      // 3f: goto 50
      // 42: aload 4
      // 44: invokeinterface java/util/List.clear ()V 1
      // 49: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 4c: astore 1
      // 4d: aload 3
      // 4e: monitorexit
      // 4f: return
      // 50: aload 3
      // 51: monitorexit
      // 52: aload 1
      // 53: athrow
   }

   public fun getOrFetchAssetPackLocation(assetPackName: String, successCallback: ((Boolean) -> Unit)? = null): String? {
      q.h(var1, "assetPackName");
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
               val var7: Log = Log.INSTANCE;
               val var6: StringBuilder = new StringBuilder();
               var6.append("Asset ");
               var6.append(var1);
               var6.append(" has been fetched and is in storage,but doesn't have a valid storage path.");
               Log.w$default(var7, "PlayAssetDelivery", var6.toString(), null, 4, null);
               var5 = null;
            } else {
               var5 = var3.b();
            }
         }
      }

      return var5;
   }

   public fun initialize(applicationContext: Context) {
      q.h(var1, "applicationContext");
      val var2: pc.a = com.google.android.play.core.assetpacks.b.a(var1);
      q.g(var2, "getInstance(...)");
      var2.a(assetPackStateUpdateListener);
      assetPackManagerWeakRef = new WeakReference<>(var2);
   }

   public fun isAssetDeliveryAvailable(): Boolean {
      return assetDeliveryAvailable;
   }
}
