package com.discord.media.utils

import dr.m
import java.io.File
import java.io.InputStream
import okio.BufferedSink

internal fun InputStream.writeTo(outputFile: File): File {
   label18: {
      val var2: BufferedSink = m.c(m.j(var1, false, 1, null));

      try {
         var2.q0(m.l(var0));
      } catch (var4: java.lang.Throwable) {
         val var10: java.lang.Throwable = var4;

         try {
            throw var10;
         } catch (var3: java.lang.Throwable) {
            pm.c.a(var2, var4);
         }
      }

      pm.c.a(var2, null);
      return var1;
   }
}
