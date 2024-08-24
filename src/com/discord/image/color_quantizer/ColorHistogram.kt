package com.discord.image.color_quantizer

import java.util.Arrays
import kotlin.jvm.internal.r

internal class ColorHistogram(pixels: IntArray) {
   public final val colorCounts: IntArray
   public final val colors: IntArray
   public final val numberOfColors: Int

   init {
      r.h(var1, "pixels");
      super();
      Arrays.sort(var1);
      val var2: Int = ColorHistogram.Companion.access$countDistinctColors(Companion, var1);
      this.numberOfColors = var2;
      this.colors = new int[var2];
      this.colorCounts = new int[var2];
      this.countFrequencies(var1);
   }

   private fun countFrequencies(pixels: IntArray) {
      val var2: Int = var1.length;
      var var3: Int = 0;
      val var8: Boolean;
      if (var2 == 0) {
         var8 = true;
      } else {
         var8 = false;
      }

      if (!var8) {
         var var4: Int = var1[0];
         this.colors[0] = var1[0];
         this.colorCounts[0] = 1;
         if (var1.length != 1) {
            val var6: Int = var1.length;

            for (int var9 = 1; var9 < var6; var9++) {
               val var5: Int = var1[var9];
               if (var1[var9] == var4) {
                  this.colorCounts[var3]++;
               } else {
                  var3++;
                  this.colors[var3] = var5;
                  this.colorCounts[var3] = 1;
                  var4 = var5;
               }
            }
         }
      }
   }

   public companion object {
      private fun countDistinctColors(pixels: IntArray): Int {
         if (var1.length < 2) {
            return var1.length;
         } else {
            var var6: Int = var1[0];
            val var8: Int = var1.length;
            var var2: Int = 1;
            var var4: Int = 1;

            while (var2 < var8) {
               val var7: Int = var1[var2];
               var var5: Int = var6;
               var var3: Int = var4;
               if (var7 != var6) {
                  var3 = var4 + 1;
                  var5 = var7;
               }

               var2++;
               var6 = var5;
               var4 = var3;
            }

            return var4;
         }
      }
   }
}
