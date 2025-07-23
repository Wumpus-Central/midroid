package com.discord.icons.media

import android.net.Uri
import android.net.Uri.Builder
import java.util.ArrayList
import kotlin.jvm.internal.r

internal object MediaProxy {
   internal const val IMAGE_SIZE_ASSET_DEFAULT_PX: Int = 160
   private final val MEDIA_PROXY_SIZES: Array<Int>

   private fun getMediaProxySize(size: Int): Int {
      var var8: Array<Int> = MEDIA_PROXY_SIZES;
      val var9: ArrayList = new ArrayList();
      var var3: Int = var8.length;

      for (int var2 = 0; var2 < var3; var2++) {
         val var7: Int = var8[var2];
         if (var8[var2].intValue() <= var1) {
            var9.add(var7);
         }
      }

      val var11: java.util.Iterator = var9.iterator();
      val var6: Boolean = var11.hasNext();
      val var22: Any = null;
      var var17: Any;
      if (!var6) {
         var17 = null;
      } else {
         var17 = (Integer)var11.next();
         if (var11.hasNext()) {
            var var13: Int = var17.intValue();
            var8 = var17;

            do {
               val var10: Any = var11.next();
               val var5: Int = (var10 as java.lang.Number).intValue();
               var17 = var8;
               var3 = var13;
               if (var13 < var5) {
                  var17 = (Integer)var10;
                  var3 = var5;
               }

               var8 = var17;
               var13 = var3;
            } while (var11.hasNext());
         }
      }

      var17 = var17;
      if (var17 != null && (double)var1 / var17.intValue() <= 1.25) {
         return var17;
      } else {
         var8 = MEDIA_PROXY_SIZES;
         var3 = MEDIA_PROXY_SIZES.length;
         var var14: Int = 0;

         while (true) {
            var17 = (Integer)var22;
            if (var14 >= var3) {
               break;
            }

            var17 = var8[var14];
            if (var8[var14].intValue() >= var1) {
               break;
            }

            var14++;
         }

         if (var17 != null) {
            var1 = var17;
         } else {
            var1 = (c.l0(MEDIA_PROXY_SIZES) as java.lang.Number).intValue();
         }

         return var1;
      }
   }

   public fun withSize(urlWithoutExtension: String, animated: Boolean, size: Int?, imageHash: String?): String {
      r.h(var1, "urlWithoutExtension");
      val var5: Boolean;
      if (var2 && MediaExtensionKt.isImageHashAnimated(var4)) {
         var5 = true;
      } else {
         var5 = false;
      }

      val var6: java.lang.String = MediaExtensionKt.getMediaExtension(var5);
      val var9: StringBuilder = new StringBuilder();
      var9.append(var1);
      var9.append(".");
      var9.append(var6);
      val var7: Builder = Uri.parse(var9.toString()).buildUpon();
      if (var3 != null && var3 > 0) {
         var7.appendQueryParameter("size", java.lang.String.valueOf(this.getMediaProxySize(var3)));
      }

      if (var2) {
         var7.appendQueryParameter("animated", "true");
      }

      var1 = var7.build().toString();
      r.g(var1, "toString(...)");
      return var1;
   }
}
