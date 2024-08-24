package com.discord.minibsdiff

import java.io.InputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.jvm.internal.r

internal fun InputStream.readNBytesCompat(b: ByteArray, off: Int, len: Int): Int {
   r.h(var0, "<this>");
   r.h(var1, "b");
   var var4: Int = 0;

   while (var4 < var3) {
      var4 += var0.read(var1, var2 + var4, var3 - var4);
   }

   return var4;
}

internal fun InputStream.readNBytesCompat(n: Int): ByteArray {
   r.h(var0, "<this>");
   val var3: ByteArray = new byte[var1];
   var var2: Int = 0;

   while (var2 < var1) {
      var2 += var0.read(var3, var2, var1 - var2);
   }

   return var3;
}

internal fun InputStream.readOffset(): Long {
   r.h(var0, "<this>");
   var var1: Long = ByteBuffer.wrap(readNBytesCompat(var0, 8)).order(ByteOrder.LITTLE_ENDIAN).getLong();
   if (0L != (java.lang.Long.MIN_VALUE and var1)) {
      var1 = -(var1 and java.lang.Long.MAX_VALUE);
   }

   return var1;
}

internal fun InputStream.skipNBytesCompat(n: Long) {
   r.h(var0, "<this>");
   var var3: Long = 0L;

   while (var3 < var1) {
      var3 += var0.skip(var1 - var3);
   }
}
