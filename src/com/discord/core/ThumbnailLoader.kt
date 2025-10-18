package com.discord.core

import Da.v
import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build.VERSION
import android.provider.MediaStore.Images.Thumbnails
import android.util.Size
import com.discord.crash_reporting.CrashReporting

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
            var5 = a.a(var0.getContentResolver(), var1, var2, null);
         } else {
            val var6: ContentResolver = var0.getContentResolver();
            val var7: java.lang.String = var1.getLastPathSegment();
            var5 = Thumbnails.getThumbnail(var6, java.lang.Long.parseLong(var7), 1, null);
         }
      } catch (var4: Exception) {
         CrashReporting.addBreadcrumb$default(
            CrashReporting.INSTANCE,
            "ThumbnailLoader - Failed to load thumbnail",
            O.m(new Pair[]{v.a("exception", var4.toString()), v.a("url", var1.toString())}),
            null,
            null,
            12,
            null
         );
         var5 = null;
      }

      return var5;
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
      // 026: new com/discord/core/b
      // 029: dup
      // 02a: aload 1
      // 02b: aload 2
      // 02c: aload 3
      // 02d: invokespecial com/discord/core/b.<init> (Landroid/content/Context;Landroid/net/Uri;Landroid/util/Size;)V
      // 030: astore 1
      // 031: bipush 0
      // 032: istore 5
      // 034: bipush 0
      // 035: istore 4
      // 037: iload 6
      // 039: ifeq 0fc
      // 03c: getstatic com/discord/core/ThumbnailLoader.serialLock Ljava/lang/Object;
      // 03f: astore 2
      // 040: aload 2
      // 041: monitorenter
      // 042: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 045: astore 3
      // 046: aload 7
      // 048: bipush 20
      // 04a: invokestatic kotlin/text/StringsKt.f1 (Ljava/lang/String;I)Ljava/lang/String;
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
      // 087: aload 1
      // 088: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 08d: checkcast android/graphics/Bitmap
      // 090: astore 1
      // 091: aload 1
      // 092: ifnull 0a2
      // 095: aload 1
      // 096: invokevirtual android/graphics/Bitmap.getAllocationByteCount ()I
      // 099: istore 4
      // 09b: goto 0a2
      // 09e: astore 1
      // 09f: goto 0f8
      // 0a2: aload 7
      // 0a4: bipush 20
      // 0a6: invokestatic kotlin/text/StringsKt.f1 (Ljava/lang/String;I)Ljava/lang/String;
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
      // 0e5: aload 3
      // 0e6: ldc "ThumbnailLoader"
      // 0e8: aload 7
      // 0ea: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ed: aconst_null
      // 0ee: bipush 4
      // 0ef: aconst_null
      // 0f0: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 0f3: aload 2
      // 0f4: monitorexit
      // 0f5: goto 1a4
      // 0f8: aload 2
      // 0f9: monitorexit
      // 0fa: aload 1
      // 0fb: athrow
      // 0fc: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 0ff: astore 2
      // 100: aload 7
      // 102: bipush 20
      // 104: invokestatic kotlin/text/StringsKt.f1 (Ljava/lang/String;I)Ljava/lang/String;
      // 107: astore 3
      // 108: new java/lang/StringBuilder
      // 10b: dup
      // 10c: invokespecial java/lang/StringBuilder.<init> ()V
      // 10f: astore 8
      // 111: aload 8
      // 113: ldc "\ud83d\udd04 LOAD START - URI: "
      // 115: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 118: pop
      // 119: aload 8
      // 11b: aload 3
      // 11c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11f: pop
      // 120: aload 8
      // 122: ldc " - Serialized: "
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: pop
      // 128: aload 8
      // 12a: iload 6
      // 12c: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 12f: pop
      // 130: aload 2
      // 131: ldc "ThumbnailLoader"
      // 133: aload 8
      // 135: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 138: aconst_null
      // 139: bipush 4
      // 13a: aconst_null
      // 13b: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 13e: aload 1
      // 13f: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 144: checkcast android/graphics/Bitmap
      // 147: astore 1
      // 148: iload 5
      // 14a: istore 4
      // 14c: aload 1
      // 14d: ifnull 156
      // 150: aload 1
      // 151: invokevirtual android/graphics/Bitmap.getAllocationByteCount ()I
      // 154: istore 4
      // 156: aload 7
      // 158: bipush 20
      // 15a: invokestatic kotlin/text/StringsKt.f1 (Ljava/lang/String;I)Ljava/lang/String;
      // 15d: astore 3
      // 15e: new java/lang/StringBuilder
      // 161: dup
      // 162: invokespecial java/lang/StringBuilder.<init> ()V
      // 165: astore 7
      // 167: aload 7
      // 169: ldc "✅ LOAD END - URI: "
      // 16b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16e: pop
      // 16f: aload 7
      // 171: aload 3
      // 172: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 175: pop
      // 176: aload 7
      // 178: ldc " - Size: "
      // 17a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17d: pop
      // 17e: aload 7
      // 180: iload 4
      // 182: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 185: pop
      // 186: aload 7
      // 188: ldc " bytes - Serialized: "
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18d: pop
      // 18e: aload 7
      // 190: iload 6
      // 192: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 195: pop
      // 196: aload 2
      // 197: ldc "ThumbnailLoader"
      // 199: aload 7
      // 19b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19e: aconst_null
      // 19f: bipush 4
      // 1a0: aconst_null
      // 1a1: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 1a4: aload 1
      // 1a5: areturn
   }
}
