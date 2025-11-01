package com.discord.core

import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build.VERSION
import android.provider.MediaStore.Images.Thumbnails
import android.util.Size
import com.discord.crash_reporting.CrashReporting
import ht.v

public object ThumbnailLoader {
   private final val serialLock: Any = new Object()
   private const val TAG: String = "ThumbnailLoader"
   public const val PREFS_NAME: String = "ThumbnailLoaderSettings"
   public const val KEY_SERIALIZED: String = "serialized"

   private fun isThumbnailLoaderSerialized(context: Context): Boolean {
      return var1.getSharedPreferences("ThumbnailLoaderSettings", 0).getBoolean("serialized", false);
   }

   @JvmStatic
   fun `loadThumbnail$lambda$0`(var0: Context, var1: Uri, var2: Size): Bitmap {
      try {
         if (VERSION.SDK_INT >= 29) {
            return var0.getContentResolver().loadThumbnail(var1, var2, null);
         } else {
            val var4: ContentResolver = var0.getContentResolver();
            val var5: java.lang.String = var1.getLastPathSegment();
            return Thumbnails.getThumbnail(var4, java.lang.Long.parseLong(var5), 1, null);
         }
      } catch (var3: Exception) {
         CrashReporting.addBreadcrumb$default(
            CrashReporting.INSTANCE,
            "ThumbnailLoader - Failed to load thumbnail",
            s0.m(new Pair[]{v.a("exception", var3.toString()), v.a("url", var1.toString())}),
            null,
            null,
            12,
            null
         );
         return null;
      }
   }

   public fun loadThumbnail(context: Context, uri: Uri, size: Size): Bitmap? {
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
      // 000: aload 1
      // 001: ldc "context"
      // 003: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 006: aload 2
      // 007: ldc "uri"
      // 009: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00c: aload 3
      // 00d: ldc "size"
      // 00f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 012: aload 2
      // 013: invokevirtual android/net/Uri.toString ()Ljava/lang/String;
      // 016: astore 7
      // 018: aload 7
      // 01a: ldc "toString(...)"
      // 01c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 01f: aload 0
      // 020: aload 1
      // 021: invokespecial com/discord/core/ThumbnailLoader.isThumbnailLoaderSerialized (Landroid/content/Context;)Z
      // 024: istore 6
      // 026: new com/discord/core/a
      // 029: dup
      // 02a: aload 1
      // 02b: aload 2
      // 02c: aload 3
      // 02d: invokespecial com/discord/core/a.<init> (Landroid/content/Context;Landroid/net/Uri;Landroid/util/Size;)V
      // 030: astore 2
      // 031: bipush 0
      // 032: istore 4
      // 034: bipush 0
      // 035: istore 5
      // 037: iload 6
      // 039: ifeq 0ff
      // 03c: getstatic com/discord/core/ThumbnailLoader.serialLock Ljava/lang/Object;
      // 03f: astore 1
      // 040: aload 1
      // 041: monitorenter
      // 042: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 045: astore 3
      // 046: aload 7
      // 048: bipush 20
      // 04a: invokestatic kotlin/text/StringsKt.w1 (Ljava/lang/String;I)Ljava/lang/String;
      // 04d: astore 8
      // 04f: new java/lang/StringBuilder
      // 052: astore 9
      // 054: aload 9
      // 056: invokespecial java/lang/StringBuilder.<init> ()V
      // 059: aload 9
      // 05b: ldc "\ud83d\udd04 LOAD START - URI: "
      // 05d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 060: pop
      // 061: aload 9
      // 063: aload 8
      // 065: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 068: pop
      // 069: aload 9
      // 06b: ldc " - Serialized: "
      // 06d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 070: pop
      // 071: aload 9
      // 073: iload 6
      // 075: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 078: pop
      // 079: aload 3
      // 07a: ldc "ThumbnailLoader"
      // 07c: aload 9
      // 07e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 081: aconst_null
      // 082: bipush 4
      // 083: aconst_null
      // 084: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 087: aload 2
      // 088: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 08d: checkcast android/graphics/Bitmap
      // 090: astore 2
      // 091: iload 5
      // 093: istore 4
      // 095: aload 2
      // 096: ifnull 0a6
      // 099: aload 2
      // 09a: invokevirtual android/graphics/Bitmap.getAllocationByteCount ()I
      // 09d: istore 4
      // 09f: goto 0a6
      // 0a2: astore 2
      // 0a3: goto 0fb
      // 0a6: aload 7
      // 0a8: bipush 20
      // 0aa: invokestatic kotlin/text/StringsKt.w1 (Ljava/lang/String;I)Ljava/lang/String;
      // 0ad: astore 8
      // 0af: new java/lang/StringBuilder
      // 0b2: astore 7
      // 0b4: aload 7
      // 0b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b9: aload 7
      // 0bb: ldc "✅ LOAD END - URI: "
      // 0bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c0: pop
      // 0c1: aload 7
      // 0c3: aload 8
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: pop
      // 0c9: aload 7
      // 0cb: ldc " - Size: "
      // 0cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d0: pop
      // 0d1: aload 7
      // 0d3: iload 4
      // 0d5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d8: pop
      // 0d9: aload 7
      // 0db: ldc " bytes - Serialized: "
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: pop
      // 0e1: aload 7
      // 0e3: iload 6
      // 0e5: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 0e8: pop
      // 0e9: aload 3
      // 0ea: ldc "ThumbnailLoader"
      // 0ec: aload 7
      // 0ee: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f1: aconst_null
      // 0f2: bipush 4
      // 0f3: aconst_null
      // 0f4: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 0f7: aload 1
      // 0f8: monitorexit
      // 0f9: aload 2
      // 0fa: areturn
      // 0fb: aload 1
      // 0fc: monitorexit
      // 0fd: aload 2
      // 0fe: athrow
      // 0ff: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 102: astore 1
      // 103: aload 7
      // 105: bipush 20
      // 107: invokestatic kotlin/text/StringsKt.w1 (Ljava/lang/String;I)Ljava/lang/String;
      // 10a: astore 3
      // 10b: new java/lang/StringBuilder
      // 10e: dup
      // 10f: invokespecial java/lang/StringBuilder.<init> ()V
      // 112: astore 8
      // 114: aload 8
      // 116: ldc "\ud83d\udd04 LOAD START - URI: "
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: pop
      // 11c: aload 8
      // 11e: aload 3
      // 11f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 122: pop
      // 123: aload 8
      // 125: ldc " - Serialized: "
      // 127: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12a: pop
      // 12b: aload 8
      // 12d: iload 6
      // 12f: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 132: pop
      // 133: aload 1
      // 134: ldc "ThumbnailLoader"
      // 136: aload 8
      // 138: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13b: aconst_null
      // 13c: bipush 4
      // 13d: aconst_null
      // 13e: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 141: aload 2
      // 142: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 147: checkcast android/graphics/Bitmap
      // 14a: astore 2
      // 14b: aload 2
      // 14c: ifnull 155
      // 14f: aload 2
      // 150: invokevirtual android/graphics/Bitmap.getAllocationByteCount ()I
      // 153: istore 4
      // 155: aload 7
      // 157: bipush 20
      // 159: invokestatic kotlin/text/StringsKt.w1 (Ljava/lang/String;I)Ljava/lang/String;
      // 15c: astore 3
      // 15d: new java/lang/StringBuilder
      // 160: dup
      // 161: invokespecial java/lang/StringBuilder.<init> ()V
      // 164: astore 7
      // 166: aload 7
      // 168: ldc "✅ LOAD END - URI: "
      // 16a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16d: pop
      // 16e: aload 7
      // 170: aload 3
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: pop
      // 175: aload 7
      // 177: ldc " - Size: "
      // 179: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17c: pop
      // 17d: aload 7
      // 17f: iload 4
      // 181: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 184: pop
      // 185: aload 7
      // 187: ldc " bytes - Serialized: "
      // 189: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18c: pop
      // 18d: aload 7
      // 18f: iload 6
      // 191: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 194: pop
      // 195: aload 1
      // 196: ldc "ThumbnailLoader"
      // 198: aload 7
      // 19a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19d: aconst_null
      // 19e: bipush 4
      // 19f: aconst_null
      // 1a0: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 1a3: aload 2
      // 1a4: areturn
   }
}
