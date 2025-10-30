package com.discord.core

import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build.VERSION
import android.provider.MediaStore.Images.Thumbnails
import android.util.Size
import com.discord.crash_reporting.CrashReporting
import fm.v

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
            n0.m(new Pair[]{v.a("exception", var3.toString()), v.a("url", var1.toString())}),
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
      // 087: aload 2
      // 088: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 08d: checkcast android/graphics/Bitmap
      // 090: astore 2
      // 091: aload 2
      // 092: ifnull 0a2
      // 095: aload 2
      // 096: invokevirtual android/graphics/Bitmap.getAllocationByteCount ()I
      // 099: istore 4
      // 09b: goto 0a2
      // 09e: astore 2
      // 09f: goto 0f7
      // 0a2: aload 7
      // 0a4: bipush 20
      // 0a6: invokestatic kotlin/text/StringsKt.f1 (Ljava/lang/String;I)Ljava/lang/String;
      // 0a9: astore 7
      // 0ab: new java/lang/StringBuilder
      // 0ae: astore 8
      // 0b0: aload 8
      // 0b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b5: aload 8
      // 0b7: ldc "✅ LOAD END - URI: "
      // 0b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bc: pop
      // 0bd: aload 8
      // 0bf: aload 7
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: pop
      // 0c5: aload 8
      // 0c7: ldc " - Size: "
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: pop
      // 0cd: aload 8
      // 0cf: iload 4
      // 0d1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d4: pop
      // 0d5: aload 8
      // 0d7: ldc " bytes - Serialized: "
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: pop
      // 0dd: aload 8
      // 0df: iload 6
      // 0e1: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 0e4: pop
      // 0e5: aload 3
      // 0e6: ldc "ThumbnailLoader"
      // 0e8: aload 8
      // 0ea: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ed: aconst_null
      // 0ee: bipush 4
      // 0ef: aconst_null
      // 0f0: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 0f3: aload 1
      // 0f4: monitorexit
      // 0f5: aload 2
      // 0f6: areturn
      // 0f7: aload 1
      // 0f8: monitorexit
      // 0f9: aload 2
      // 0fa: athrow
      // 0fb: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 0fe: astore 1
      // 0ff: aload 7
      // 101: bipush 20
      // 103: invokestatic kotlin/text/StringsKt.f1 (Ljava/lang/String;I)Ljava/lang/String;
      // 106: astore 3
      // 107: new java/lang/StringBuilder
      // 10a: dup
      // 10b: invokespecial java/lang/StringBuilder.<init> ()V
      // 10e: astore 8
      // 110: aload 8
      // 112: ldc "\ud83d\udd04 LOAD START - URI: "
      // 114: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 117: pop
      // 118: aload 8
      // 11a: aload 3
      // 11b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11e: pop
      // 11f: aload 8
      // 121: ldc " - Serialized: "
      // 123: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 126: pop
      // 127: aload 8
      // 129: iload 6
      // 12b: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 12e: pop
      // 12f: aload 1
      // 130: ldc "ThumbnailLoader"
      // 132: aload 8
      // 134: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 137: aconst_null
      // 138: bipush 4
      // 139: aconst_null
      // 13a: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 13d: aload 2
      // 13e: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 143: checkcast android/graphics/Bitmap
      // 146: astore 2
      // 147: iload 5
      // 149: istore 4
      // 14b: aload 2
      // 14c: ifnull 155
      // 14f: aload 2
      // 150: invokevirtual android/graphics/Bitmap.getAllocationByteCount ()I
      // 153: istore 4
      // 155: aload 7
      // 157: bipush 20
      // 159: invokestatic kotlin/text/StringsKt.f1 (Ljava/lang/String;I)Ljava/lang/String;
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
