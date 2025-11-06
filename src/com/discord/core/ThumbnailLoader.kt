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
            val var5: ContentResolver = var0.getContentResolver();
            val var4: java.lang.String = var1.getLastPathSegment();
            return Thumbnails.getThumbnail(var5, java.lang.Long.parseLong(var4), 1, null);
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
      // 030: astore 3
      // 031: bipush 0
      // 032: istore 5
      // 034: bipush 0
      // 035: istore 4
      // 037: iload 6
      // 039: ifeq 0fb
      // 03c: getstatic com/discord/core/ThumbnailLoader.serialLock Ljava/lang/Object;
      // 03f: astore 1
      // 040: aload 1
      // 041: monitorenter
      // 042: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 045: astore 2
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
      // 079: aload 2
      // 07a: ldc "ThumbnailLoader"
      // 07c: aload 9
      // 07e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 081: aconst_null
      // 082: bipush 4
      // 083: aconst_null
      // 084: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 087: aload 3
      // 088: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 08d: checkcast android/graphics/Bitmap
      // 090: astore 3
      // 091: aload 3
      // 092: ifnull 0a2
      // 095: aload 3
      // 096: invokevirtual android/graphics/Bitmap.getAllocationByteCount ()I
      // 099: istore 4
      // 09b: goto 0a2
      // 09e: astore 2
      // 09f: goto 0f7
      // 0a2: aload 7
      // 0a4: bipush 20
      // 0a6: invokestatic kotlin/text/StringsKt.w1 (Ljava/lang/String;I)Ljava/lang/String;
      // 0a9: astore 8
      // 0ab: new java/lang/StringBuilder
      // 0ae: astore 7
      // 0b0: aload 7
      // 0b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b5: aload 7
      // 0b7: ldc "✅ LOAD END - URI: "
      // 0b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bc: pop
      // 0bd: aload 7
      // 0bf: aload 8
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: pop
      // 0c5: aload 7
      // 0c7: ldc " - Size: "
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: pop
      // 0cd: aload 7
      // 0cf: iload 4
      // 0d1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d4: pop
      // 0d5: aload 7
      // 0d7: ldc " bytes - Serialized: "
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: pop
      // 0dd: aload 7
      // 0df: iload 6
      // 0e1: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 0e4: pop
      // 0e5: aload 2
      // 0e6: ldc "ThumbnailLoader"
      // 0e8: aload 7
      // 0ea: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ed: aconst_null
      // 0ee: bipush 4
      // 0ef: aconst_null
      // 0f0: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 0f3: aload 1
      // 0f4: monitorexit
      // 0f5: aload 3
      // 0f6: areturn
      // 0f7: aload 1
      // 0f8: monitorexit
      // 0f9: aload 2
      // 0fa: athrow
      // 0fb: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 0fe: astore 1
      // 0ff: aload 7
      // 101: bipush 20
      // 103: invokestatic kotlin/text/StringsKt.w1 (Ljava/lang/String;I)Ljava/lang/String;
      // 106: astore 8
      // 108: new java/lang/StringBuilder
      // 10b: dup
      // 10c: invokespecial java/lang/StringBuilder.<init> ()V
      // 10f: astore 2
      // 110: aload 2
      // 111: ldc "\ud83d\udd04 LOAD START - URI: "
      // 113: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 116: pop
      // 117: aload 2
      // 118: aload 8
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d: pop
      // 11e: aload 2
      // 11f: ldc " - Serialized: "
      // 121: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 124: pop
      // 125: aload 2
      // 126: iload 6
      // 128: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 12b: pop
      // 12c: aload 1
      // 12d: ldc "ThumbnailLoader"
      // 12f: aload 2
      // 130: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 133: aconst_null
      // 134: bipush 4
      // 135: aconst_null
      // 136: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 139: aload 3
      // 13a: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 13f: checkcast android/graphics/Bitmap
      // 142: astore 2
      // 143: iload 5
      // 145: istore 4
      // 147: aload 2
      // 148: ifnull 151
      // 14b: aload 2
      // 14c: invokevirtual android/graphics/Bitmap.getAllocationByteCount ()I
      // 14f: istore 4
      // 151: aload 7
      // 153: bipush 20
      // 155: invokestatic kotlin/text/StringsKt.w1 (Ljava/lang/String;I)Ljava/lang/String;
      // 158: astore 3
      // 159: new java/lang/StringBuilder
      // 15c: dup
      // 15d: invokespecial java/lang/StringBuilder.<init> ()V
      // 160: astore 7
      // 162: aload 7
      // 164: ldc "✅ LOAD END - URI: "
      // 166: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 169: pop
      // 16a: aload 7
      // 16c: aload 3
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 170: pop
      // 171: aload 7
      // 173: ldc " - Size: "
      // 175: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 178: pop
      // 179: aload 7
      // 17b: iload 4
      // 17d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 180: pop
      // 181: aload 7
      // 183: ldc " bytes - Serialized: "
      // 185: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 188: pop
      // 189: aload 7
      // 18b: iload 6
      // 18d: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 190: pop
      // 191: aload 1
      // 192: ldc "ThumbnailLoader"
      // 194: aload 7
      // 196: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 199: aconst_null
      // 19a: bipush 4
      // 19b: aconst_null
      // 19c: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 19f: aload 2
      // 1a0: areturn
   }
}
