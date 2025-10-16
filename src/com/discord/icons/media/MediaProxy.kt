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
