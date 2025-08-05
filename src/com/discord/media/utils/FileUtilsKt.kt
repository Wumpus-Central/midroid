package com.discord.media.utils

import ec.m
import java.io.File
import java.io.InputStream
import kotlin.jvm.internal.r
import okio.BufferedSink

internal fun InputStream.writeTo(outputFile: File): File {
   label18: {
      r.h(var0, "<this>");
      r.h(var1, "outputFile");
      val var2: BufferedSink = m.c(m.j(var1, false, 1, null));

      try {
         var2.d1(m.l(var0));
      } catch (var4: java.lang.Throwable) {
         val var9: java.lang.Throwable = var4;

         try {
            throw var9;
         } catch (var3: java.lang.Throwable) {
            N9.c.a(var2, var4);
         }
      }

      N9.c.a(var2, null);
      return var1;
   }
}
