package com.discord.icons.media

import java.util.ArrayList
import kotlin.jvm.internal.q

internal object MediaProxy {
   internal const val IMAGE_SIZE_ASSET_DEFAULT_PX: Int = 160
   private final val MEDIA_PROXY_SIZES: Array<Int>

   private fun getMediaProxySize(size: Int): Int {
      var var7: Int = MEDIA_PROXY_SIZES;
      val var9: ArrayList = new ArrayList();
      var var3: Int = ((Object[])var7).length;

      for (int var2 = 0; var2 < var3; var2++) {
         val var8: Int = ((Object[])var7)[var2];
         if (((Object[])var7)[var2].intValue() <= var1) {
            var9.add(var8);
         }
      }

      val var11: java.util.Iterator = var9.iterator();
      val var6: Boolean = var11.hasNext();
      val var22: Any = null;
      if (!var6) {
         var7 = null;
      } else {
         var7 = (Integer[])var11.next();
         if (var11.hasNext()) {
            var var13: Int = (var7 as java.lang.Number).intValue();
            var var20: Any = var7;

            do {
               val var10: Any = var11.next();
               val var5: Int = (var10 as java.lang.Number).intValue();
               var7 = (Integer[])var20;
               var3 = var13;
               if (var13 < var5) {
                  var7 = (Integer[])var10;
                  var3 = var5;
               }

               var20 = var7;
               var13 = var3;
            } while (var11.hasNext());
         }
      }

      var7 = var7 as Int;
      if (var7 as Int != null && (double)var1 / (var7 as Int).intValue() <= 1.25) {
         return var7;
      } else {
         val var21: Array<Int> = MEDIA_PROXY_SIZES;
         var3 = MEDIA_PROXY_SIZES.length;
         var var14: Int = 0;

         while (true) {
            var7 = (Integer)var22;
            if (var14 >= var3) {
               break;
            }

            var7 = var21[var14];
            if (var21[var14].intValue() >= var1) {
               break;
            }

            var14++;
         }

         if (var7 != null) {
            var1 = var7;
         } else {
            var1 = (c.g0(MEDIA_PROXY_SIZES) as java.lang.Number).intValue();
         }

         return var1;
      }
   }

   public fun withSize(url: String, size: Int?, params: String? = null): String {
      q.h(var1, "url");
      var var5: java.lang.String = "";
      if (var2 != null && var2 > 0) {
         val var4: Int = this.getMediaProxySize(var2);
         var var12: java.lang.String = null;
         if (var3 != null) {
            val var13: StringBuilder = new StringBuilder();
            var13.append("&");
            var13.append(var3);
            var12 = var13.toString();
         }

         if (var12 != null) {
            var5 = var12;
         }

         val var14: StringBuilder = new StringBuilder();
         var14.append(var1);
         var14.append("?size=");
         var14.append(var4);
         var14.append(var5);
         var1 = var14.toString();
      } else {
         var var9: java.lang.String = null;
         if (var3 != null) {
            val var10: StringBuilder = new StringBuilder();
            var10.append("?");
            var10.append(var3);
            var9 = var10.toString();
         }

         if (var9 != null) {
            var5 = var9;
         }

         val var11: StringBuilder = new StringBuilder();
         var11.append(var1);
         var11.append(var5);
         var1 = var11.toString();
      }

      return var1;
   }
}
