package com.discord.media.utils

import ad.m
import java.io.File
import java.io.InputStream
import okio.BufferedSink

internal fun InputStream.writeTo(outputFile: File): File {
   label18: {
      val var2: BufferedSink = m.c(m.j(var1, false, 1, null));

      try {
         var2.u0(m.l(var0));
      } catch (var4: java.lang.Throwable) {
         val var10: java.lang.Throwable = var4;

         try {
            throw var10;
         } catch (var3: java.lang.Throwable) {
            Na.c.a(var2, var4);
         }
      }

      Na.c.a(var2, null);
      return var1;
   }
}
