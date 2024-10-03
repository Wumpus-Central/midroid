package com.discord.media.utils

import java.io.File
import java.io.InputStream
import kotlin.jvm.internal.q
import mm.m
import okio.BufferedSink
import vh.c

internal fun InputStream.writeTo(outputFile: File): File {
   label18: {
      q.h(var0, "<this>");
      q.h(var1, "outputFile");
      val var2: BufferedSink = m.c(m.j(var1, false, 1, null));

      try {
         var2.U0(m.l(var0));
      } catch (var4: java.lang.Throwable) {
         val var9: java.lang.Throwable = var4;

         try {
            throw var9;
         } catch (var3: java.lang.Throwable) {
            c.a(var2, var4);
         }
      }

      c.a(var2, null);
      return var1;
   }
}
