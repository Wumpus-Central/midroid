package com.discord.minibsdiff

import Q1.a
import java.io.File
import java.io.InputStream
import java.io.OutputStream
import java.io.RandomAccessFile
import java.util.Arrays

public object BSDiff {
   private final val BSDIFF_CONFIG_MAGIC: ByteArray
   private const val BUFFER_SIZE_BYTES: Long = 1000000L

   @JvmStatic
   fun {
      val var0: ByteArray = "MBSDIF43".getBytes(Charsets.UTF_8);
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
      return k.B(CollectionsKt.V(d.r(d.t(0, var1), 1000000L)), new a(var1));
   }

   @JvmStatic
   fun `chunkRange$lambda$0`(var0: Long, var2: Long): Int {
      return (int)Math.min(var0 - var2, 1000000L);
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
      // 00: aload 1
      // 01: ldc "oldPath"
      // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 2
      // 07: ldc "patchPath"
      // 09: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c: aload 3
      // 0d: ldc "newPath"
      // 0f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 12: new java/io/RandomAccessFile
      // 15: dup
      // 16: aload 1
      // 17: ldc "r"
      // 19: invokespecial java/io/RandomAccessFile.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 1c: astore 6
      // 1e: aload 6
      // 20: invokestatic com/discord/minibsdiff/RandomFileAccessInputStreamKt.inputStream (Ljava/io/RandomAccessFile;)Ljava/io/InputStream;
      // 23: astore 1
      // 24: new java/io/BufferedInputStream
      // 27: dup
      // 28: new java/io/FileInputStream
      // 2b: dup
      // 2c: aload 2
      // 2d: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 30: sipush 8192
      // 33: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;I)V
      // 36: astore 4
      // 38: new java/io/BufferedInputStream
      // 3b: dup
      // 3c: new java/io/FileInputStream
      // 3f: dup
      // 40: aload 2
      // 41: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 44: sipush 8192
      // 47: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;I)V
      // 4a: astore 5
      // 4c: new java/io/BufferedInputStream
      // 4f: dup
      // 50: new java/io/FileInputStream
      // 53: dup
      // 54: aload 2
      // 55: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 58: sipush 8192
      // 5b: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;I)V
      // 5e: astore 2
      // 5f: new java/io/BufferedOutputStream
      // 62: dup
      // 63: new java/io/FileOutputStream
      // 66: dup
      // 67: aload 3
      // 68: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 6b: sipush 8192
      // 6e: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;I)V
      // 71: astore 3
      // 72: getstatic com/discord/minibsdiff/BSDiff.INSTANCE Lcom/discord/minibsdiff/BSDiff;
      // 75: aload 6
      // 77: aload 1
      // 78: aload 4
      // 7a: aload 5
      // 7c: aload 2
      // 7d: aload 3
      // 7e: invokespecial com/discord/minibsdiff/BSDiff.bspatchStreamingInner (Ljava/io/RandomAccessFile;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/OutputStream;)V
      // 81: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 84: astore 6
      // 86: aload 3
      // 87: aconst_null
      // 88: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 8b: aload 2
      // 8c: aconst_null
      // 8d: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 90: aload 5
      // 92: aconst_null
      // 93: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 96: aload 4
      // 98: aconst_null
      // 99: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 9c: aload 1
      // 9d: aconst_null
      // 9e: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // a1: return
      // a2: astore 3
      // a3: goto e5
      // a6: astore 2
      // a7: goto da
      // aa: astore 2
      // ab: goto cf
      // ae: astore 6
      // b0: goto c3
      // b3: astore 7
      // b5: aload 7
      // b7: athrow
      // b8: astore 6
      // ba: aload 3
      // bb: aload 7
      // bd: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // c0: aload 6
      // c2: athrow
      // c3: aload 6
      // c5: athrow
      // c6: astore 3
      // c7: aload 2
      // c8: aload 6
      // ca: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // cd: aload 3
      // ce: athrow
      // cf: aload 2
      // d0: athrow
      // d1: astore 3
      // d2: aload 5
      // d4: aload 2
      // d5: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // d8: aload 3
      // d9: athrow
      // da: aload 2
      // db: athrow
      // dc: astore 3
      // dd: aload 4
      // df: aload 2
      // e0: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // e3: aload 3
      // e4: athrow
      // e5: aload 3
      // e6: athrow
      // e7: astore 2
      // e8: aload 1
      // e9: aload 3
      // ea: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // ed: aload 2
      // ee: athrow
   }

   public class BsPatchError(message: String) : Exception(var1)
}
