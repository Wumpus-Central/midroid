package com.discord.share.intent

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import eh.s
import eh.r.a
import kotlin.jvm.internal.r
import oh.c

internal fun ContentResolver.getFileName(uri: Uri): String {
   label45: {
      r.h(var0, "<this>");
      r.h(var1, "uri");

      label42:
      try {
         val var3: a = eh.r.k;
         var18 = eh.r.b(var0.query(var1, new java.lang.String[]{"_display_name"}, null, null, null));
      } catch (var7: java.lang.Throwable) {
         val var17: a = eh.r.k;
         var18 = eh.r.b(s.a(var7));
         break label42;
      }

      if (eh.r.g(var18)) {
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
