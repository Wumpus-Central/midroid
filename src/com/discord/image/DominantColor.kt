package com.discord.image

import android.graphics.Bitmap
import com.discord.image.color_quantizer.ColorCutQuantizer
import com.discord.image.color_quantizer.Swatch
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import x2.c

@SourceDebugExtension(["SMAP\nDominantColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DominantColor.kt\ncom/discord/image/DominantColor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1557#2:36\n1628#2,3:37\n1557#2:40\n1628#2,3:41\n*S KotlinDebug\n*F\n+ 1 DominantColor.kt\ncom/discord/image/DominantColor\n*L\n17#1:36\n17#1:37,3\n27#1:40\n27#1:41,3\n*E\n"])
public object DominantColor {
   private fun getPrimaryColorsForBitmap(bitmap: Bitmap): List<Int> {
      val var3: java.util.List = ColorCutQuantizer.Companion.fromBitmap(var1, 5).getQuantizedColors();
      if (var3.isEmpty()) {
         throw new DominantColor.NoSwatchesFoundException();
      } else {
         val var4: ArrayList = new ArrayList(CollectionsKt.w(var3, 10));
         val var5: java.util.Iterator = var3.iterator();

         while (var5.hasNext()) {
            var4.add((var5.next() as Swatch).getRgb());
         }

         return var4;
      }
   }

   public fun getRepresentativeColors(bitmap: Bitmap): List<Int>? {
      try {
         var6 = this.getPrimaryColorsForBitmap(var1);
         if (var6.isEmpty()) {
            return null;
         }
      } catch (var5: Exception) {
         return null;
      }

      var var8: java.util.Iterator;
      try {
         var7 = new ArrayList(CollectionsKt.w(var6, 10));
         var8 = var6.iterator();
      } catch (var3: Exception) {
         return null;
      }

      while (true) {
         try {
            if (!var8.hasNext()) {
               return var7;
            }

            var7.add(c.l((var8.next() as java.lang.Number).intValue(), 255));
         } catch (var4: Exception) {
            return null;
         }
      }
   }

   private class NoSwatchesFoundException : RuntimeException
}
