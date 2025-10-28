package com.discord.core

import Ja.v
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
            val var7: ContentResolver = var0.getContentResolver();
            val var6: java.lang.String = var1.getLastPathSegment();
            var5 = Thumbnails.getThumbnail(var7, java.lang.Long.parseLong(var6), 1, null);
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
      // 032: istore 4
      // 034: bipush 0
      // 035: istore 5
      // 037: iload 6
      // 039: ifeq 100
      // 03c: getstatic com/discord/core/ThumbnailLoader.serialLock Ljava/lang/Object;
      // 03f: astore 2
      // 040: aload 2
      // 041: monitorenter
      // 042: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 045: astore 3
      // 046: aload 7
      // 048: bipush 20
      // 04a: invokestatic kotlin/text/StringsKt.f1 (Ljava/lang/String;I)Ljava/lang/String;
      // 04d: astore 9
      // 04f: new java/lang/StringBuilder
      // 052: astore 8
      // 054: aload 8
      // 056: invokespecial java/lang/StringBuilder.<init> ()V
      // 059: aload 8
      // 05b: ldc "\ud83d\udd04 LOAD START - URI: "
      // 05d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 060: pop
      // 061: aload 8
      // 063: aload 9
      // 065: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 068: pop
      // 069: aload 8
      // 06b: ldc " - Serialized: "
      // 06d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 070: pop
      // 071: aload 8
      // 073: iload 6
      // 075: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 078: pop
      // 079: aload 3
      // 07a: ldc "ThumbnailLoader"
      // 07c: aload 8
      // 07e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 081: aconst_null
      // 082: bipush 4
      // 083: aconst_null
      // 084: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 087: aload 1
      // 088: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 08d: checkcast android/graphics/Bitmap
      // 090: astore 1
      // 091: iload 5
      // 093: istore 4
      // 095: aload 1
      // 096: ifnull 0a6
      // 099: aload 1
      // 09a: invokevirtual android/graphics/Bitmap.getAllocationByteCount ()I
      // 09d: istore 4
      // 09f: goto 0a6
      // 0a2: astore 1
      // 0a3: goto 0fc
      // 0a6: aload 7
      // 0a8: bipush 20
      // 0aa: invokestatic kotlin/text/StringsKt.f1 (Ljava/lang/String;I)Ljava/lang/String;
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
      // 0f7: aload 2
      // 0f8: monitorexit
      // 0f9: goto 1a4
      // 0fc: aload 2
      // 0fd: monitorexit
      // 0fe: aload 1
      // 0ff: athrow
      // 100: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 103: astore 2
      // 104: aload 7
      // 106: bipush 20
      // 108: invokestatic kotlin/text/StringsKt.f1 (Ljava/lang/String;I)Ljava/lang/String;
      // 10b: astore 3
      // 10c: new java/lang/StringBuilder
      // 10f: dup
      // 110: invokespecial java/lang/StringBuilder.<init> ()V
      // 113: astore 8
      // 115: aload 8
      // 117: ldc "\ud83d\udd04 LOAD START - URI: "
      // 119: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11c: pop
      // 11d: aload 8
      // 11f: aload 3
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: pop
      // 124: aload 8
      // 126: ldc " - Serialized: "
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12b: pop
      // 12c: aload 8
      // 12e: iload 6
      // 130: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 133: pop
      // 134: aload 2
      // 135: ldc "ThumbnailLoader"
      // 137: aload 8
      // 139: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13c: aconst_null
      // 13d: bipush 4
      // 13e: aconst_null
      // 13f: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 142: aload 1
      // 143: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 148: checkcast android/graphics/Bitmap
      // 14b: astore 1
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
