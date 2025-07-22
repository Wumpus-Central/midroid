package com.discord.share.intent

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import kotlin.Result.a
import kotlin.jvm.internal.r

internal fun ContentResolver.getFileName(uri: Uri): String {
   label44: {
      r.h(var0, "<this>");
      r.h(var1, "uri");

      label41:
      try {
         val var2: a = Result.k;
         var15 = Result.b(var0.query(var1, new java.lang.String[]{"_display_name"}, null, null, null));
      } catch (var5: java.lang.Throwable) {
         val var18: a = Result.k;
         var15 = Result.b(c.a(var5));
         break label41;
      }

      var var19: Any = var15;
      if (Result.g(var15)) {
         var19 = null;
      }

      val var21: Cursor = var19 as Cursor;
      var var16: java.lang.String = "";
      if (var21 != null) {
         label35: {
            try {
               if (var21.moveToFirst()) {
                  var16 = var21.getString(0);
                  break label35;
               }
            } catch (var4: java.lang.Throwable) {
               val var17: java.lang.Throwable = var4;

               try {
                  throw var17;
               } catch (var3: java.lang.Throwable) {
                  L9.c.a(var21, var4);
               }
            }

            var16 = "";
         }

         L9.c.a(var21, null);
         if (var16 == null) {
            var16 = "";
         }
      }

      return var16;
   }
}
