package com.discord.share.intent

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import kotlin.Result.a

internal fun ContentResolver.getFileName(uri: Uri): String {
   label44: {
      label41:
      try {
         val var2: a = Result.e;
         var16 = Result.b(var0.query(var1, new java.lang.String[]{"_display_name"}, null, null, null));
      } catch (var5: java.lang.Throwable) {
         val var15: a = Result.e;
         var16 = Result.b(c.a(var5));
         break label41;
      }

      var var19: Any = var16;
      if (Result.g(var16)) {
         var19 = null;
      }

      val var21: Cursor = var19 as Cursor;
      var var17: java.lang.String = "";
      if (var21 != null) {
         label35: {
            try {
               if (var21.moveToFirst()) {
                  var17 = var21.getString(0);
                  break label35;
               }
            } catch (var4: java.lang.Throwable) {
               val var18: java.lang.Throwable = var4;

               try {
                  throw var18;
               } catch (var3: java.lang.Throwable) {
                  tt.c.a(var21, var4);
               }
            }

            var17 = "";
         }

         tt.c.a(var21, null);
         if (var17 == null) {
            var17 = "";
         }
      }

      return var17;
   }
}
