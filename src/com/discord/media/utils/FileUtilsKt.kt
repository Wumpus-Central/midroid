package com.discord.media.utils

import hw.u
import java.io.File
import java.io.InputStream
import okio.BufferedSink

internal fun InputStream.writeTo(outputFile: File): File {
   label18: {
      val var2: BufferedSink = u.c(u.j(var1, false, 1, null));

      try {
         var2.s0(u.l(var0));
      } catch (var4: java.lang.Throwable) {
         val var9: java.lang.Throwable = var4;

         try {
            throw var9;
         } catch (var3: java.lang.Throwable) {
            tt.c.a(var2, var4);
         }
      }

      tt.c.a(var2, null);
      return var1;
   }
}
