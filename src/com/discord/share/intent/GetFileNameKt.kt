package com.discord.share.intent

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import kh.r
import kh.s
import kh.r.a
import kotlin.jvm.internal.q
import vh.c

internal fun ContentResolver.getFileName(uri: Uri): String {
   label45: {
      q.h(var0, "<this>");
      q.h(var1, "uri");

      label42:
      try {
         val var3: a = r.k;
         var18 = r.b(var0.query(var1, new java.lang.String[]{"_display_name"}, null, null, null));
      } catch (var7: java.lang.Throwable) {
         val var17: a = r.k;
         var18 = r.b(s.a(var7));
         break label42;
      }

      if (r.g(var18)) {
         var18 = null;
      }

      val var4: Cursor = var18 as Cursor;
      var var19: java.lang.String = null;
      if (var4 != null) {
         label36: {
            try {
               if (var4.moveToFirst()) {
                  var19 = var4.getString(0);
                  break label36;
               }
            } catch (var6: java.lang.Throwable) {
               val var21: java.lang.Throwable = var6;

               try {
                  throw var21;
               } catch (var5: java.lang.Throwable) {
                  c.a(var4, var6);
               }
            }

            var19 = "";
         }

         c.a(var4, null);
      }

      if (var19 == null) {
         var19 = "";
      }

      return var19;
   }
}
