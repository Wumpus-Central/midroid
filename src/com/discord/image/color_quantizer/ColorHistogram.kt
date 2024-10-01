package com.discord.image.color_quantizer

import java.util.Arrays
import kotlin.jvm.internal.q

internal class ColorHistogram(pixels: IntArray) {
   public final val colorCounts: IntArray
   public final val colors: IntArray
   public final val numberOfColors: Int

   init {
      q.h(var1, "pixels");
      super();
      Arrays.sort(var1);
      val var2: Int = ColorHistogram.Companion.access$countDistinctColors(Companion, var1);
      this.numberOfColors = var2;
      this.colors = new int[var2];
      this.colorCounts = new int[var2];
      this.countFrequencies(var1);
   }

   private fun countFrequencies(pixels: IntArray) {
      if (var1.length != 0) {
         var var4: Int = 0;
         var var3: Int = var1[0];
         this.colors[0] = var1[0];
         this.colorCounts[0] = 1;
         if (var1.length != 1) {
            val var6: Int = var1.length;

            for (int var2 = 1; var2 < var6; var2++) {
               val var5: Int = var1[var2];
               if (var1[var2] == var3) {
                  this.colorCounts[var4]++;
               } else {
                  var4++;
                  this.colors[var4] = var5;
                  this.colorCounts[var4] = 1;
                  var3 = var5;
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
            var var5: Int = var1[0];
            val var8: Int = var1.length;
            var var2: Int = 1;
            var var3: Int = 1;

            while (var2 < var8) {
               val var7: Int = var1[var2];
               var var6: Int = var5;
               var var4: Int = var3;
               if (var7 != var5) {
                  var4 = var3 + 1;
                  var6 = var7;
               }

               var2++;
               var5 = var6;
               var3 = var4;
            }

            return var3;
         }
      }
   }
}
