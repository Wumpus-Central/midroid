package com.discord.minibsdiff

import java.io.InputStream
import java.io.RandomAccessFile
import kotlin.jvm.internal.q

internal class RandomFileAccessInputStream(randomAccessFile: RandomAccessFile) : InputStream {
   private final val randomAccessFile: RandomAccessFile

   init {
      q.h(var1, "randomAccessFile");
      super();
      this.randomAccessFile = var1;
   }

   public override fun close() {
      this.randomAccessFile.close();
   }

   public override fun read(): Int {
      return this.randomAccessFile.read();
   }

   public override fun read(b: ByteArray?): Int {
      return this.randomAccessFile.read(var1);
   }

   public override fun read(b: ByteArray?, off: Int, len: Int): Int {
      return this.randomAccessFile.read(var1, var2, var3);
   }
}
