package com.discord.share.intent

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import kotlin.Result.a
import kotlin.jvm.internal.q

internal fun ContentResolver.getFileName(uri: Uri): String {
   label44: {
      q.h(var0, "<this>");
      q.h(var1, "uri");

      label41:
      try {
         val var2: a = Result.k;
         var15 = Result.b(var0.query(var1, new java.lang.String[]{"_display_name"}, null, null, null));
      } catch (var5: java.lang.Throwable) {
         val var17: a = Result.k;
         var15 = Result.b(c.a(var5));
         break label41;
      }

      var var18: Any = var15;
      if (Result.g(var15)) {
         var18 = null;
      }

      val var21: Cursor = var18 as Cursor;
      var var16: java.lang.String = "";
      if (var21 != null) {
         label35: {
            try {
               if (var21.moveToFirst()) {
                  var16 = var21.getString(0);
                  break label35;
               }
            } catch (var4: java.lang.Throwable) {
               var18 = var4;

               try {
                  throw var18;
               } catch (var3: java.lang.Throwable) {
                  s9.c.a(var21, var4);
               }
            }

            var16 = "";
         }

         s9.c.a(var21, null);
         if (var16 == null) {
            var16 = "";
         }
      }

      return var16;
   }
}
