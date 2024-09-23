package com.discord.minibsdiff

import java.io.File
import java.io.InputStream
import java.io.OutputStream
import java.io.RandomAccessFile
import java.util.Arrays
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import sk.j
import tk.a

public object BSDiff {
   private final val BSDIFF_CONFIG_MAGIC: ByteArray
   private const val BUFFER_SIZE_BYTES: Long = 1000000L

   @JvmStatic
   fun {
      val var0: ByteArray = "MBSDIF43".getBytes(a.b);
      q.g(var0, "getBytes(...)");
      BSDIFF_CONFIG_MAGIC = var0;
   }

   private fun bspatchStreamingInner(
      oldRandomAccessFile: RandomAccessFile,
      oldInputStream: InputStream,
      ctrlInputStream: InputStream,
      diffInputStream: InputStream,
      extraInputStream: InputStream,
      newOutputStream: OutputStream
   ) {
      val var21: ByteArray = new byte[1000000];
      val var20: ByteArray = new byte[1000000];
      if (!Arrays.equals(InputStreamUtilsKt.readNBytesCompat(var3, 8), BSDIFF_CONFIG_MAGIC)) {
         throw new BSDiff.BsPatchError("Bad magic config header for patch file!");
      } else {
         var var13: Long = InputStreamUtilsKt.readOffset(var3);
         var var11: Long = InputStreamUtilsKt.readOffset(var3);
         val var9: Long = InputStreamUtilsKt.readOffset(var3);
         val var24: Long = 32 + var13;
         InputStreamUtilsKt.skipNBytesCompat(var4, (long)32 + var13);
         InputStreamUtilsKt.skipNBytesCompat(var5, var24 + var11);
         var11 = 0L;

         while (var11 < var9) {
            val var15: Long = InputStreamUtilsKt.readOffset(var3);
            val var17: Long = InputStreamUtilsKt.readOffset(var3);
            var13 = InputStreamUtilsKt.readOffset(var3);
            if (var11 + var15 + var17 > var9) {
               throw new BSDiff.BsPatchError("Corrupted patch, attempting to make new file that's too big");
            }

            var var19: java.util.Iterator = this.chunkRange(var15).iterator();

            while (var19.hasNext()) {
               val var8: Int = (var19.next() as java.lang.Number).intValue();
               InputStreamUtilsKt.readNBytesCompat(var2, var21, 0, var8);
               InputStreamUtilsKt.readNBytesCompat(var4, var20, 0, var8);

               for (int var7 = 0; var7 < var8; var7++) {
                  var21[var7] += var20[var7];
               }

               var6.write(var21, 0, var8);
            }

            var19 = this.chunkRange(var17).iterator();

            while (var19.hasNext()) {
               val var22: Int = (var19.next() as java.lang.Number).intValue();
               InputStreamUtilsKt.readNBytesCompat(var5, var21, 0, var22);
               var6.write(var21, 0, var22);
            }

            var1.seek(var1.getFilePointer() + var13);
            var11 += var15 + var17;
         }

         var6.close();
      }
   }

   private fun chunkRange(total: Long): Sequence<Int> {
      return j.y(i.T(f.q(f.s(0, var1), 1000000L)), new Function1(var1) {
         final long $total;

         {
            super(1);
            this.$total = var1;
         }

         public final Integer invoke(long var1) {
            return (int)Math.min(this.$total - var1, 1000000L);
         }
      });
   }

   public fun bspatchStreaming(oldPath: File, patchPath: File, newPath: File) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ldc "oldPath"
      // 003: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 006: aload 2
      // 007: ldc "patchPath"
      // 009: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 00c: aload 3
      // 00d: ldc "newPath"
      // 00f: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 012: new java/io/RandomAccessFile
      // 015: dup
      // 016: aload 1
      // 017: ldc "r"
      // 019: invokespecial java/io/RandomAccessFile.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 01c: astore 6
      // 01e: aload 6
      // 020: invokestatic com/discord/minibsdiff/RandomFileAccessInputStreamKt.inputStream (Ljava/io/RandomAccessFile;)Ljava/io/InputStream;
      // 023: astore 5
      // 025: new java/io/FileInputStream
      // 028: dup
      // 029: aload 2
      // 02a: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 02d: astore 1
      // 02e: aload 1
      // 02f: instanceof java/io/BufferedInputStream
      // 032: ifeq 03d
      // 035: aload 1
      // 036: checkcast java/io/BufferedInputStream
      // 039: astore 1
      // 03a: goto 049
      // 03d: new java/io/BufferedInputStream
      // 040: dup
      // 041: aload 1
      // 042: sipush 8192
      // 045: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;I)V
      // 048: astore 1
      // 049: new java/io/FileInputStream
      // 04c: dup
      // 04d: aload 2
      // 04e: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 051: astore 4
      // 053: aload 4
      // 055: instanceof java/io/BufferedInputStream
      // 058: ifeq 065
      // 05b: aload 4
      // 05d: checkcast java/io/BufferedInputStream
      // 060: astore 4
      // 062: goto 073
      // 065: new java/io/BufferedInputStream
      // 068: dup
      // 069: aload 4
      // 06b: sipush 8192
      // 06e: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;I)V
      // 071: astore 4
      // 073: new java/io/FileInputStream
      // 076: dup
      // 077: aload 2
      // 078: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 07b: astore 2
      // 07c: aload 2
      // 07d: instanceof java/io/BufferedInputStream
      // 080: ifeq 08b
      // 083: aload 2
      // 084: checkcast java/io/BufferedInputStream
      // 087: astore 2
      // 088: goto 097
      // 08b: new java/io/BufferedInputStream
      // 08e: dup
      // 08f: aload 2
      // 090: sipush 8192
      // 093: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;I)V
      // 096: astore 2
      // 097: new java/io/FileOutputStream
      // 09a: dup
      // 09b: aload 3
      // 09c: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 09f: astore 3
      // 0a0: aload 3
      // 0a1: instanceof java/io/BufferedOutputStream
      // 0a4: ifeq 0af
      // 0a7: aload 3
      // 0a8: checkcast java/io/BufferedOutputStream
      // 0ab: astore 3
      // 0ac: goto 0bb
      // 0af: new java/io/BufferedOutputStream
      // 0b2: dup
      // 0b3: aload 3
      // 0b4: sipush 8192
      // 0b7: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;I)V
      // 0ba: astore 3
      // 0bb: getstatic com/discord/minibsdiff/BSDiff.INSTANCE Lcom/discord/minibsdiff/BSDiff;
      // 0be: aload 6
      // 0c0: aload 5
      // 0c2: aload 1
      // 0c3: aload 4
      // 0c5: aload 2
      // 0c6: aload 3
      // 0c7: invokespecial com/discord/minibsdiff/BSDiff.bspatchStreamingInner (Ljava/io/RandomAccessFile;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/OutputStream;)V
      // 0ca: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 0cd: astore 6
      // 0cf: aload 3
      // 0d0: aconst_null
      // 0d1: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 0d4: aload 2
      // 0d5: aconst_null
      // 0d6: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 0d9: aload 4
      // 0db: aconst_null
      // 0dc: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 0df: aload 1
      // 0e0: aconst_null
      // 0e1: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 0e4: aload 5
      // 0e6: aconst_null
      // 0e7: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 0ea: return
      // 0eb: astore 2
      // 0ec: goto 12d
      // 0ef: astore 2
      // 0f0: goto 123
      // 0f3: astore 2
      // 0f4: goto 118
      // 0f7: astore 6
      // 0f9: goto 10c
      // 0fc: astore 6
      // 0fe: aload 6
      // 100: athrow
      // 101: astore 7
      // 103: aload 3
      // 104: aload 6
      // 106: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 109: aload 7
      // 10b: athrow
      // 10c: aload 6
      // 10e: athrow
      // 10f: astore 3
      // 110: aload 2
      // 111: aload 6
      // 113: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 116: aload 3
      // 117: athrow
      // 118: aload 2
      // 119: athrow
      // 11a: astore 3
      // 11b: aload 4
      // 11d: aload 2
      // 11e: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 121: aload 3
      // 122: athrow
      // 123: aload 2
      // 124: athrow
      // 125: astore 3
      // 126: aload 1
      // 127: aload 2
      // 128: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 12b: aload 3
      // 12c: athrow
      // 12d: aload 2
      // 12e: athrow
      // 12f: astore 1
      // 130: aload 5
      // 132: aload 2
      // 133: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 136: aload 1
      // 137: athrow
   }

   public class BsPatchError(message: String) : Exception {
      init {
         q.h(var1, "message");
         super(var1);
      }
   }
}
