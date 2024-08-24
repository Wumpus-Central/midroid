package com.discord.icons.media

import java.util.ArrayList
import kotlin.jvm.internal.r

internal object MediaProxy {
   internal const val IMAGE_SIZE_ASSET_DEFAULT_PX: Int = 160
   private final val MEDIA_PROXY_SIZES: Array<Int>

   private fun getMediaProxySize(size: Int): Int {
      var var7: Array<Int> = MEDIA_PROXY_SIZES;
      val var6: ArrayList = new ArrayList();
      var var4: Int = var7.length;
      var var2: Int = 0;

      while (true) {
         var var3: Int = 1;
         if (var2 >= var4) {
            val var10: java.util.Iterator = var6.iterator();
            val var5: Boolean = var10.hasNext();
            val var23: Any = null;
            var var18: Any;
            if (!var5) {
               var18 = null;
            } else {
               var18 = (Integer)var10.next();
               if (var10.hasNext()) {
                  var2 = var18.intValue();
                  var7 = var18;

                  do {
                     val var9: Any = var10.next();
                     var4 = (var9 as java.lang.Number).intValue();
                     var18 = var7;
                     var3 = var2;
                     if (var2 < var4) {
                        var18 = (Integer)var9;
                        var3 = var4;
                     }

                     var7 = var18;
                     var2 = var3;
                  } while (var10.hasNext());
               }
            }

            var18 = var18;
            if (var18 != null && (double)var1 / var18.intValue() <= 1.25) {
               return var18;
            } else {
               var7 = MEDIA_PROXY_SIZES;
               var4 = MEDIA_PROXY_SIZES.length;
               var2 = 0;

               while (true) {
                  var18 = (Integer)var23;
                  if (var2 >= var4) {
                     break;
                  }

                  var18 = var7[var2];
                  val var15: Boolean;
                  if (var7[var2].intValue() >= var1) {
                     var15 = true;
                  } else {
                     var15 = false;
                  }

                  if (var15) {
                     break;
                  }

                  var2++;
               }

               if (var18 != null) {
                  var1 = var18;
               } else {
                  var1 = (b.d0(MEDIA_PROXY_SIZES) as java.lang.Number).intValue();
               }

               return var1;
            }
         }

         val var8: Int = var7[var2];
         if (var7[var2].intValue() > var1) {
            var3 = 0;
         }

         if (var3) {
            var6.add(var8);
         }

         var2++;
      }
   }

   public fun withSize(url: String, size: Int?, params: String? = null): String {
      r.h(var1, "url");
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
