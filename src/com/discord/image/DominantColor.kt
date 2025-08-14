package com.discord.image

import android.graphics.Bitmap
import com.discord.image.color_quantizer.ColorCutQuantizer
import com.discord.image.color_quantizer.Swatch
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import y.c

@SourceDebugExtension(["SMAP\nDominantColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DominantColor.kt\ncom/discord/image/DominantColor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1557#2:36\n1628#2,3:37\n1557#2:40\n1628#2,3:41\n*S KotlinDebug\n*F\n+ 1 DominantColor.kt\ncom/discord/image/DominantColor\n*L\n17#1:36\n17#1:37,3\n27#1:40\n27#1:41,3\n*E\n"])
public object DominantColor {
   private fun getPrimaryColorsForBitmap(bitmap: Bitmap): List<Int> {
      val var2: java.util.List = ColorCutQuantizer.Companion.fromBitmap(var1, 5).getQuantizedColors();
      if (var2.isEmpty()) {
         throw new DominantColor.NoSwatchesFoundException();
      } else {
         val var3: ArrayList = new ArrayList(CollectionsKt.v(var2, 10));
         val var4: java.util.Iterator = var2.iterator();

         while (var4.hasNext()) {
            var3.add((var4.next() as Swatch).getRgb());
         }

         return var3;
      }
   }

   public fun getRepresentativeColors(bitmap: Bitmap): List<Int>? {
      var var3: java.util.List;
      try {
         var3 = this.getPrimaryColorsForBitmap(var1);
         if (var3.isEmpty()) {
            return null;
         }
      } catch (var6: Exception) {
         return null;
      }

      try {
         var7 = new ArrayList(CollectionsKt.v(var3, 10));
         var8 = var3.iterator();
      } catch (var5: Exception) {
         return null;
      }

      while (true) {
         try {
            if (!var8.hasNext()) {
               break;
            }

            var7.add(c.k((var8.next() as java.lang.Number).intValue(), 255));
         } catch (var4: Exception) {
            var7 = null;
            break;
         }
      }

      return var7;
   }

   private class NoSwatchesFoundException : RuntimeException
}
