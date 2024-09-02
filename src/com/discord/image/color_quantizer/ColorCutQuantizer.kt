package com.discord.image.color_quantizer

import android.graphics.Bitmap
import android.graphics.Color
import android.util.SparseIntArray
import java.util.ArrayList
import java.util.Arrays
import java.util.Comparator
import java.util.PriorityQueue
import kotlin.jvm.internal.q

internal class ColorCutQuantizer private constructor(colorHistogram: ColorHistogram?, maxColors: Int) {
   private final val mColorPopulations: SparseIntArray
   private final val mColors: IntArray
   private final val mQuantizedColors: MutableList<Swatch>
   private final val mTempHsl: FloatArray = new float[3]

   public final val quantizedColors: List<Swatch>
      public final get() {
         return this.mQuantizedColors;
      }


   @JvmStatic
   fun `VBOX_COMPARATOR_VOLUME$lambda$2`(var0: ColorCutQuantizer.Vbox, var1: ColorCutQuantizer.Vbox): Int {
      return var1.getVolume() - var0.getVolume();
   }

   private fun generateAverageColors(vboxes: Collection<com.discord.image.color_quantizer.ColorCutQuantizer.Vbox>): MutableList<Swatch> {
      val var2: ArrayList = new ArrayList(var1.size());
      val var3: java.util.Iterator = var1.iterator();

      while (var3.hasNext()) {
         val var4: Swatch = (var3.next() as ColorCutQuantizer.Vbox).getAverageColor();
         if (!ColorCutQuantizer.Companion.access$shouldIgnoreColor(Companion, var4)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   private fun modifySignificantOctet(dimension: Int, lowIndex: Int, highIndex: Int) {
      var var4: Int = var2;
      if (var1 != -2) {
         if (var1 == -1) {
            while (var2 <= var3) {
               this.mColors[var2] = Color.rgb(this.mColors[var2] and 255, this.mColors[var2] shr 8 and 255, this.mColors[var2] shr 16 and 255);
               var2++;
            }
         }
      } else {
         while (var4 <= var3) {
            this.mColors[var4] = Color.rgb(this.mColors[var4] shr 8 and 255, this.mColors[var4] shr 16 and 255, this.mColors[var4] and 255);
            var4++;
         }
      }
   }

   private fun quantizePixels(maxColorIndex: Int, maxColors: Int): MutableList<Swatch> {
      val var3: PriorityQueue = new PriorityQueue<>(var2, VBOX_COMPARATOR_VOLUME);
      var3.offer(new ColorCutQuantizer.Vbox((int)this, 0, var1));
      this.splitBoxes(var3, var2);
      return this.generateAverageColors(var3);
   }

   private fun shouldIgnoreColor(color: Int): Boolean {
      val var2: Int = Color.alpha(var1);
      ColorUtils.RGBtoHSL(Color.red(var1), Color.green(var1), Color.blue(var1), this.mTempHsl);
      val var3: Boolean;
      if (var2 >= 250 && !ColorCutQuantizer.Companion.access$shouldIgnoreColor(Companion, this.mTempHsl)) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   private fun splitBoxes(queue: PriorityQueue<com.discord.image.color_quantizer.ColorCutQuantizer.Vbox>, maxSize: Int) {
      while (var1.size() < var2) {
         val var3: ColorCutQuantizer.Vbox = var1.poll() as ColorCutQuantizer.Vbox;
         if (var3 != null && var3.canSplit()) {
            var1.offer(var3.splitBox());
            var1.offer(var3);
            continue;
         }
         break;
      }
   }

   public companion object {
      private const val BLACK_MAX_LIGHTNESS: Float
      private const val COMPONENT_BLUE: Int
      private const val COMPONENT_GREEN: Int
      private const val COMPONENT_RED: Int
      private final val VBOX_COMPARATOR_VOLUME: Comparator<com.discord.image.color_quantizer.ColorCutQuantizer.Vbox>
      private const val WHITE_MIN_LIGHTNESS: Float

      private fun isBlack(hslColor: FloatArray): Boolean {
         val var2: Boolean;
         if (var1[2] <= 0.05F) {
            var2 = true;
         } else {
            var2 = false;
         }

         return var2;
      }

      private fun isNearRedILine(hslColor: FloatArray): Boolean {
         val var2: Float = var1[0];
         var var3: Boolean = false;
         if (10.0F <= var2) {
            var3 = false;
            if (var2 <= 37.0F) {
               var3 = false;
               if (var1[1] <= 0.82F) {
                  var3 = true;
               }
            }
         }

         return var3;
      }

      private fun isWhite(hslColor: FloatArray): Boolean {
         val var2: Boolean;
         if (var1[2] >= 0.95F) {
            var2 = true;
         } else {
            var2 = false;
         }

         return var2;
      }

      private fun shouldIgnoreColor(color: Swatch): Boolean {
         val var2: FloatArray = var1.getHsl();
         q.g(var2, "getHsl(...)");
         return this.shouldIgnoreColor(var2);
      }

      private fun shouldIgnoreColor(hslColor: FloatArray): Boolean {
         val var2: Boolean;
         if (!this.isWhite(var1) && !this.isBlack(var1) && !this.isNearRedILine(var1)) {
            var2 = false;
         } else {
            var2 = true;
         }

         return var2;
      }

      public fun fromBitmap(bitmap: Bitmap, maxColors: Int): ColorCutQuantizer {
         q.h(var1, "bitmap");
         val var4: Int = var1.getWidth();
         val var3: Int = var1.getHeight();
         val var5: IntArray = new int[var4 * var3];
         var1.getPixels(var5, 0, var4, 0, 0, var4, var3);
         return new ColorCutQuantizer(new ColorHistogram(var5), var2, null);
      }
   }

   private inner class Vbox(lowerIndex: Int, upperIndex: Int) {
      public final val averageColor: Swatch
         public final get() {
            var var6: Int = this.lowerIndex;
            val var8: Int = this.upperIndex;
            var var7: Int = 0;
            var var3: Int;
            var var4: Int;
            var var12: Int;
            if (this.lowerIndex <= this.upperIndex) {
               var12 = 0;
               var3 = 0;
               var4 = 0;

               while (true) {
                  val var10: Int = ColorCutQuantizer.access$getMColors$p(this.this$0)[var6];
                  val var9: Int = ColorCutQuantizer.access$getMColorPopulations$p(this.this$0).get(var10);
                  var7 += var9;
                  var12 += Color.red(var10) * var9;
                  var3 += Color.green(var10) * var9;
                  var4 += var9 * Color.blue(var10);
                  if (var6 == var8) {
                     var6 = var12;
                     var12 = var7;
                     break;
                  }

                  var6++;
               }
            } else {
               var3 = 0;
               var4 = 0;
               var6 = 0;
               var12 = 0;
            }

            return new Swatch(Math.round((float)var6 / (float)var12), Math.round((float)var3 / (float)var12), Math.round((float)var4 / (float)var12), var12);
         }


      public final val colorCount: Int
         public final get() {
            return this.upperIndex - this.lowerIndex;
         }


      public final val longestColorDimension: Int
         public final get() {
            val var1: Int = this.maxRed - this.minRed;
            val var2: Int = this.maxGreen - this.minGreen;
            val var3: Int = this.maxBlue - this.minBlue;
            val var4: Byte;
            if (var1 >= var2 && var1 >= this.maxBlue - this.minBlue) {
               var4 = -3;
            } else if (var2 >= var1 && var2 >= var3) {
               var4 = -2;
            } else {
               var4 = -1;
            }

            return var4;
         }


      private final val lowerIndex: Int
      private final var maxBlue: Int
      private final var maxGreen: Int
      private final var maxRed: Int
      private final var minBlue: Int
      private final var minGreen: Int
      private final var minRed: Int
      private final var upperIndex: Int

      public final val volume: Int
         public final get() {
            return (this.maxRed - this.minRed + 1) * (this.maxGreen - this.minGreen + 1) * (this.maxBlue - this.minBlue + 1);
         }


      init {
         this.this$0 = var1;
         this.lowerIndex = var2;
         this.upperIndex = var3;
         this.fitBox();
      }

      public fun canSplit(): Boolean {
         val var1: Int = this.getColorCount();
         var var2: Boolean = true;
         if (var1 <= 1) {
            var2 = false;
         }

         return var2;
      }

      public fun findSplitPoint(): Int {
         val var4: Int = this.getLongestColorDimension();
         ColorCutQuantizer.access$modifySignificantOctet(this.this$0, var4, this.lowerIndex, this.upperIndex);
         Arrays.sort(ColorCutQuantizer.access$getMColors$p(this.this$0), this.lowerIndex, this.upperIndex + 1);
         ColorCutQuantizer.access$modifySignificantOctet(this.this$0, var4, this.lowerIndex, this.upperIndex);
         val var2: Int = this.midPoint(var4);
         var var1: Int = this.lowerIndex;

         for (int var3 = this.upperIndex; var1 < var3; var1++) {
            val var5: Int = ColorCutQuantizer.access$getMColors$p(this.this$0)[var1];
            if (var4 != -3) {
               if (var4 != -2) {
                  if (var4 == -1 && Color.blue(var5) > var2) {
                     return var1;
                  }
               } else if (Color.green(var5) >= var2) {
                  return var1;
               }
            } else if (Color.red(var5) >= var2) {
               return var1;
            }
         }

         return this.lowerIndex;
      }

      public fun fitBox() {
         this.minBlue = 255;
         this.minGreen = 255;
         this.minRed = 255;
         this.maxBlue = 0;
         this.maxGreen = 0;
         this.maxRed = 0;
         var var1: Int = this.lowerIndex;
         val var2: Int = this.upperIndex;
         if (this.lowerIndex <= this.upperIndex) {
            while (true) {
               var var5: Int = ColorCutQuantizer.access$getMColors$p(this.this$0)[var1];
               val var3: Int = Color.red(var5);
               val var4: Int = Color.green(var5);
               var5 = Color.blue(var5);
               if (var3 > this.maxRed) {
                  this.maxRed = var3;
               }

               if (var3 < this.minRed) {
                  this.minRed = var3;
               }

               if (var4 > this.maxGreen) {
                  this.maxGreen = var4;
               }

               if (var4 < this.minGreen) {
                  this.minGreen = var4;
               }

               if (var5 > this.maxBlue) {
                  this.maxBlue = var5;
               }

               if (var5 < this.minBlue) {
                  this.minBlue = var5;
               }

               if (var1 == var2) {
                  break;
               }

               var1++;
            }
         }
      }

      public fun midPoint(dimension: Int): Int {
         if (var1 != -3) {
            if (var1 != -2) {
               if (var1 != -1) {
                  var1 = (this.minRed + this.maxRed) / 2;
               } else {
                  var1 = (this.minBlue + this.maxBlue) / 2;
               }
            } else {
               var1 = (this.minGreen + this.maxGreen) / 2;
            }
         } else {
            var1 = (this.minRed + this.maxRed) / 2;
         }

         return var1;
      }

      public fun splitBox(): com.discord.image.color_quantizer.ColorCutQuantizer.Vbox {
         if (this.canSplit()) {
            val var1: Int = this.findSplitPoint();
            val var2: ColorCutQuantizer.Vbox = this.this$0.new Vbox((int)this.this$0, var1 + 1, this.upperIndex);
            this.upperIndex = var1;
            this.fitBox();
            return var2;
         } else {
            throw new IllegalStateException("Can not split a box with only 1 color".toString());
         }
      }
   }
}
