package com.discord.media.utils

import cc.m
import java.io.File
import java.io.InputStream
import kotlin.jvm.internal.q
import okio.BufferedSink

internal fun InputStream.writeTo(outputFile: File): File {
   label18: {
      q.h(var0, "<this>");
      q.h(var1, "outputFile");
      val var2: BufferedSink = m.c(m.j(var1, false, 1, null));

      try {
         var2.b1(m.l(var0));
      } catch (var4: java.lang.Throwable) {
         val var10: java.lang.Throwable = var4;

         try {
            throw var10;
         } catch (var3: java.lang.Throwable) {
            L9.c.a(var2, var4);
         }
      }

      L9.c.a(var2, null);
      return var1;
   }
}
