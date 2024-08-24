package com.discord.media.utils

import android.graphics.Bitmap
import android.graphics.Bitmap.CompressFormat
import java.io.ByteArrayOutputStream
import kotlin.jvm.internal.r

internal object BitmapUtils {
   private const val DEFAULT_QUALITY: Int = 80

   public fun Bitmap.toByteArray(format: CompressFormat, quality: Int = 80): ByteArray {
      r.h(var1, "<this>");
      r.h(var2, "format");
      val var4: ByteArrayOutputStream = new ByteArrayOutputStream();
      var1.compress(var2, var3, var4);
      val var5: ByteArray = var4.toByteArray();
      r.g(var5, "ByteArrayOutputStream().…)\n        }.toByteArray()");
      return var5;
   }

   public fun Bitmap.toByteArray(mimeType: String, quality: Int = 80): ByteArray {
      r.h(var1, "<this>");
      r.h(var2, "mimeType");
      val var4: Int = var2.hashCode();
      if (var4 != -1487394660) {
         if (var4 != -879264467) {
            if (var4 == -879258763 && var2.equals("image/png")) {
               return this.toByteArray(var1, CompressFormat.PNG, var3);
            }

            return this.toByteArray(var1, CompressFormat.PNG, var3);
         }

         if (!var2.equals("image/jpg")) {
            return this.toByteArray(var1, CompressFormat.PNG, var3);
         }
      } else if (!var2.equals("image/jpeg")) {
         return this.toByteArray(var1, CompressFormat.PNG, var3);
      }

      return this.toByteArray(var1, CompressFormat.JPEG, var3);
   }
}
