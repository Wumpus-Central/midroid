package com.discord.image

import android.graphics.Bitmap
import androidx.core.graphics.c
import com.discord.image.color_quantizer.ColorCutQuantizer
import com.discord.image.color_quantizer.Swatch
import java.util.ArrayList
import kotlin.jvm.internal.q

public object DominantColor {
   private fun getPrimaryColorsForBitmap(bitmap: Bitmap): List<Int> {
      val var3: java.util.List = ColorCutQuantizer.Companion.fromBitmap(var1, 5).getQuantizedColors();
      if (!(var3.isEmpty() xor true)) {
         throw new DominantColor.NoSwatchesFoundException();
      } else {
         val var4: ArrayList = new ArrayList(i.u(var3, 10));
         val var5: java.util.Iterator = var3.iterator();

         while (var5.hasNext()) {
            var4.add((var5.next() as Swatch).getRgb());
         }

         return var4;
      }
   }

   public fun getRepresentativeColors(bitmap: Bitmap): List<Int>? {
      q.h(var1, "bitmap");

      try {
         var8 = this.getPrimaryColorsForBitmap(var1);
         if (var8.isEmpty()) {
            return null;
         }
      } catch (var6: Exception) {
         return null;
      }

      var var9: java.util.Iterator;
      try {
         var7 = new ArrayList(i.u(var8, 10));
         var9 = var8.iterator();
      } catch (var5: Exception) {
         return null;
      }

      while (true) {
         try {
            if (!var9.hasNext()) {
               break;
            }

            var7.add(c.k((var9.next() as java.lang.Number).intValue(), 255));
         } catch (var4: Exception) {
            var7 = null;
            break;
         }
      }

      return var7;
   }

   private class NoSwatchesFoundException : RuntimeException
}
