package com.discord.icons.media

import android.net.Uri
import android.net.Uri.Builder
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nMediaProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaProxy.kt\ncom/discord/icons/media/MediaProxy\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n3829#2:76\n4344#2,2:77\n1310#2,2:93\n1971#3,14:79\n*S KotlinDebug\n*F\n+ 1 MediaProxy.kt\ncom/discord/icons/media/MediaProxy\n*L\n27#1:76\n27#1:77,2\n37#1:93,2\n27#1:79,14\n*E\n"])
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
            var1 = (h.l0(MEDIA_PROXY_SIZES) as java.lang.Number).intValue();
         }

         return var1;
      }
   }

   public fun withSize(urlWithoutExtension: String, animated: Boolean, size: Int?, imageHash: String?): String {
      val var5: Boolean;
      if (var2 && MediaExtensionKt.isImageHashAnimated(var4)) {
         var5 = true;
      } else {
         var5 = false;
      }

      var4 = MediaExtensionKt.getMediaExtension(var5);
      val var6: StringBuilder = new StringBuilder();
      var6.append(var1);
      var6.append(".");
      var6.append(var4);
      val var7: Builder = Uri.parse(var6.toString()).buildUpon();
      if (var3 != null && var3 > 0) {
         var7.appendQueryParameter("size", java.lang.String.valueOf(this.getMediaProxySize(var3)));
      }

      if (var2) {
         var7.appendQueryParameter("animated", "true");
      }

      var1 = var7.build().toString();
      return var1;
   }
}
