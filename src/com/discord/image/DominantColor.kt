package com.discord.image

import android.graphics.Bitmap
import androidx.core.graphics.f0
import com.discord.image.color_quantizer.ColorCutQuantizer
import com.discord.image.color_quantizer.Swatch
import java.util.ArrayList
import kotlin.jvm.internal.r

public object DominantColor {
   private fun getPrimaryColorsForBitmap(bitmap: Bitmap): List<Int> {
      val var2: java.util.List = ColorCutQuantizer.Companion.fromBitmap(var1, 5).getQuantizedColors();
      if (!(var2.isEmpty() xor true)) {
         throw new DominantColor.NoSwatchesFoundException();
      } else {
         val var3: ArrayList = new ArrayList(h.t(var2, 10));
         val var4: java.util.Iterator = var2.iterator();

         while (var4.hasNext()) {
            var3.add((var4.next() as Swatch).getRgb());
         }

         return var3;
      }
   }

   public fun getRepresentativeColors(bitmap: Bitmap): List<Int>? {
      r.h(var1, "bitmap");

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
         var7 = new ArrayList(h.t(var3, 10));
         var8 = var3.iterator();
      } catch (var5: Exception) {
         return null;
      }

      while (true) {
         try {
            if (!var8.hasNext()) {
               break;
            }

            var7.add(f0.k((var8.next() as java.lang.Number).intValue(), 255));
         } catch (var4: Exception) {
            var7 = null;
            break;
         }
      }

      return var7;
   }

   private class NoSwatchesFoundException : RuntimeException
}
