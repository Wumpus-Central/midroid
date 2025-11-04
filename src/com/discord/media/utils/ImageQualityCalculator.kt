package com.discord.media.utils

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Bitmap.Config
import android.graphics.BitmapFactory.Options
import gu.m0
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineScope

public object ImageQualityCalculator {
   private const val SSIM_C1: Float = 6.5025F
   private const val SSIM_C2: Float = 58.5225F
   private const val SSIM_WINDOW_SIZE: Int = 8
   private const val SSIM_WINDOW_STRIDE: Int = 4
   private const val RGB_TO_GRAYSCALE_RED_WEIGHT: Float = 0.299F
   private const val RGB_TO_GRAYSCALE_GREEN_WEIGHT: Float = 0.587F
   private const val RGB_TO_GRAYSCALE_BLUE_WEIGHT: Float = 0.114F
   private const val MAX_PROCESSING_DIMENSION: Int = 4096
   private const val MAX_PIXEL_VALUE_8BIT: Double = 255.0
   private const val PSNR_DECIBEL_COEFFICIENT: Double = 20.0
   private const val RGB_CHANNEL_COUNT: Int = 3

   private fun calculateInSampleSize(width: Int, height: Int, maxDimension: Int): Int {
      if (var2 <= var3 && var1 <= var3) {
         return 1;
      } else {
         var2 = var2 / 2;
         val var5: Int = var1 / 2;
         var1 = 1;

         while (var2 / var1 >= var3 && var5 / var1 >= var3) {
            var1 *= 2;
         }

         return var1;
      }
   }

   private fun calculatePSNR(originalPixels: IntArray, compressedPixels: IntArray, width: Int, height: Int): Double {
      var4 = var3 * var4;
      var3 = 0;

      var var5: Double;
      for (var5 = 0.0; var3 < var4; var3++) {
         var5 += (double)((var1[var3] shr 16 and 255) - (var2[var3] shr 16 and 255)) * ((var1[var3] shr 16 and 255) - (var2[var3] shr 16 and 255))
            + (double)((var1[var3] shr 8 and 255) - (var2[var3] shr 8 and 255)) * ((var1[var3] shr 8 and 255) - (var2[var3] shr 8 and 255))
            + (double)((var1[var3] and 255) - (var2[var3] and 255)) * ((var1[var3] and 255) - (var2[var3] and 255));
      }

      return if (var5 / (var4 * 3.0) == 0.0) java.lang.Double.POSITIVE_INFINITY else Math.log10(255.0 / Math.sqrt(var5 / ((double)var4 * 3.0))) * 20.0;
   }

   private fun calculateSSIM(originalPixels: IntArray, compressedPixels: IntArray, width: Int, height: Int): Double {
      return this.calculateSSIMFromGrayscale(this.convertToGrayscale(var1, var3, var4), this.convertToGrayscale(var2, var3, var4), var3, var4);
   }

   private fun calculateSSIMFromGrayscale(original: FloatArray, compressed: FloatArray, width: Int, height: Int): Double {
      val var15: Int = qt.c.c(0, var4 - 8, 4);
      var var7: Double;
      if (var15 >= 0) {
         var4 = 0;
         var var12: Int = 0;
         var var5: Double = 0.0;

         while (true) {
            val var14: Int = qt.c.c(0, var3 - 8, 4);
            var7 = var5;
            var var11: Int = var4;
            if (var14 >= 0) {
               var var13: Int = 0;
               var11 = var4;
               var7 = var5;

               while (true) {
                  val var9: Double = this.calculateWindowSSIM(var1, var2, var3, var13, var12, 8, 6.5025F, 58.5225F);
                  var5 = var7;
                  var4 = var11;
                  if (!java.lang.Double.isInfinite(var9)) {
                     var5 = var7;
                     var4 = var11;
                     if (!java.lang.Double.isNaN(var9)) {
                        var5 = var7 + var9;
                        var4 = var11 + 1;
                     }
                  }

                  var7 = var5;
                  var11 = var4;
                  if (var13 == var14) {
                     break;
                  }

                  var13 += 4;
                  var7 = var5;
                  var11 = var4;
               }
            }

            if (var12 == var15) {
               var3 = var11;
               break;
            }

            var12 += 4;
            var5 = var7;
            var4 = var11;
         }
      } else {
         var7 = 0.0;
         var3 = 0;
      }

      return if (var3 > 0) var7 / var3 else 0.0;
   }

   private fun calculateWindowSSIM(original: FloatArray, compressed: FloatArray, width: Int, startX: Int, startY: Int, windowSize: Int, c1: Float, c2: Float): Double {
      var var25: Int = 0;
      var var13: Double = 0.0;
      var var17: Double = 0.0;
      var var15: Double = 0.0;
      var var11: Double = 0.0;

      var var9: Double;
      for (var9 = 0.0; var25 < var6; var25++) {
         for (int var26 = 0; var26 < var6; var26++) {
            val var19: Double = var1[(var5 + var25) * var3 + var4 + var26];
            val var21: Double = var2[(var5 + var25) * var3 + var4 + var26];
            var13 += var19;
            var17 += var21;
            var15 += var19 * var19;
            var11 += var21 * var21;
            var9 += var21 * var19;
         }
      }

      return if ((var13 / (var6 * var6) * (var13 / (var6 * var6)) + var17 / (var6 * var6) * (var17 / (var6 * var6)) + var7)
               * ((var15 - var13 * (var13 / (var6 * var6))) / (var6 * var6) + (var11 - var17 * (var17 / (var6 * var6))) / (var6 * var6) + var8)
            > 0.0)
         (var13 / (var6 * var6) * 2.0 * (var17 / (var6 * var6)) + var7)
            * ((var9 - var13 * (var17 / (var6 * var6))) / (var6 * var6) * 2.0 + var8)
            / (
               (var13 / (var6 * var6) * (var13 / (var6 * var6)) + var17 / (var6 * var6) * (var17 / (var6 * var6)) + var7)
                  * ((var15 - var13 * (var13 / (var6 * var6))) / (var6 * var6) + (var11 - var17 * (var17 / (var6 * var6))) / (var6 * var6) + var8)
            )
         else
         0.0;
   }

   private fun convertToGrayscale(pixels: IntArray, width: Int, height: Int): FloatArray {
      val var7: Int = var2 * var3;
      val var5: FloatArray = new float[var2 * var3];

      for (int var6 = 0; var6 < var7; var6++) {
         var5[var6] = (var1[var6] shr 16 and 255) * 0.299F + (var1[var6] shr 8 and 255) * 0.587F + (var1[var6] and 255) * 0.114F;
      }

      return var5;
   }

   private fun decodeByteArraySafely(data: ByteArray): Bitmap? {
      var var3: Int;
      var var4: Options;
      try {
         var4 = new Options();
         var4.inJustDecodeBounds = true;
         BitmapFactory.decodeByteArray(var1, 0, var1.length, var4);
         var3 = var4.outWidth;
      } catch (var7: Exception) {
         return null;
      }

      if (var3 > 0) {
         var var2: Int;
         try {
            var2 = var4.outHeight;
         } catch (var6: Exception) {
            return null;
         }

         if (var2 > 0) {
            try {
               var2 = this.calculateInSampleSize(var3, var2, 4096);
               var4 = new Options();
               var4.inSampleSize = var2;
               var4.inPreferredConfig = Config.ARGB_8888;
               var4.inPremultiplied = false;
               var4.inScaled = false;
               return BitmapFactory.decodeByteArray(var1, 0, var1.length, var4);
            } catch (var5: Exception) {
            }
         }
      }

      return null;
   }

   private fun unpremultiplyPixels(pixels: IntArray): IntArray {
      val var8: IntArray = new int[var1.length];
      val var3: Int = var1.length;

      for (int var2 = 0; var2 < var3; var2++) {
         val var6: Int = var1[var2];
         val var4: Int = var1[var2] shr 24 and 255;
         if ((var1[var2] shr 24 and 255) != 0) {
            if (var4 != 255) {
               var8[var2] = kotlin.ranges.e.n((var6 and 255) * 255 / var4, 0, 255) or var4 shl 24 or kotlin.ranges.e.n(
                  (var6 shr 16 and 255) * 255 / var4, 0, 255
               ) shl 16 or kotlin.ranges.e.n((var6 shr 8 and 255) * 255 / var4, 0, 255) shl 8;
            } else {
               var8[var2] = var6;
            }
         } else {
            var8[var2] = 0;
         }
      }

      return var8;
   }

   public suspend fun calculateQualityMetrics(originalBitmap: Bitmap, compressedBitmap: Bitmap): com.discord.media.utils.ImageQualityCalculator.ImageQualityMetrics? {
      return gu.g.g(
         m0.a(),
         new Function2<CoroutineScope, Continuation<? super ImageQualityCalculator.ImageQualityMetrics>, Object>(var1, var2, null) {
            final Bitmap $compressedBitmap;
            final Bitmap $originalBitmap;
            int label;

            {
               super(2, var3);
               this.$originalBitmap = var1;
               this.$compressedBitmap = var2x;
            }

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               return new <anonymous constructor>(this.$originalBitmap, this.$compressedBitmap, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super ImageQualityCalculator.ImageQualityMetrics> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            public final Object invokeSuspend(Object var1) {
               ot.b.f();
               if (this.label == 0) {
                  kotlin.c.b(var1);

                  try {
                     if (this.$originalBitmap.getWidth() != this.$compressedBitmap.getWidth()
                        || this.$originalBitmap.getHeight() != this.$compressedBitmap.getHeight()) {
                        return null;
                     }
                  } catch (var17: Exception) {
                     return null;
                  }

                  var var4: Int;
                  var var5: Int;
                  try {
                     var5 = this.$originalBitmap.getWidth();
                     var4 = this.$originalBitmap.getHeight();
                  } catch (var16: Exception) {
                     return null;
                  }

                  val var6: Int = var5 * var4;

                  var var11: IntArray;
                  try {
                     var1 = new int[var6];
                     var11 = new int[var6];
                     this.$originalBitmap.getPixels(var1, 0, var5, 0, 0, var5, var4);
                     this.$compressedBitmap.getPixels(var11, 0, var5, 0, 0, var5, var4);
                     if (this.$originalBitmap.isPremultiplied()) {
                        var1 = ImageQualityCalculator.access$unpremultiplyPixels(ImageQualityCalculator.INSTANCE, var1);
                     }
                  } catch (var15: Exception) {
                     return null;
                  }

                  try {
                     if (this.$compressedBitmap.isPremultiplied()) {
                        var11 = ImageQualityCalculator.access$unpremultiplyPixels(ImageQualityCalculator.INSTANCE, var11);
                     }
                  } catch (var14: Exception) {
                     return null;
                  }

                  try {
                     val var7: Long = System.nanoTime();
                     val var12: ImageQualityCalculator = ImageQualityCalculator.INSTANCE;
                     return new ImageQualityCalculator.ImageQualityMetrics(
                        ImageQualityCalculator.access$calculatePSNR(ImageQualityCalculator.INSTANCE, var1, var11, var5, var4),
                        ImageQualityCalculator.access$calculateSSIM(var12, var1, var11, var5, var4),
                        (System.nanoTime() - var7) / 1000000L,
                        (System.nanoTime() - System.nanoTime()) / 1000000L
                     );
                  } catch (var13: Exception) {
                     return null;
                  }
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         },
         var3
      );
   }

   public suspend fun calculateQualityMetrics(originalData: ByteArray, compressedData: ByteArray): com.discord.media.utils.ImageQualityCalculator.ImageQualityMetrics? {
      return gu.g.g(m0.a(), new Function2<CoroutineScope, Continuation<? super ImageQualityCalculator.ImageQualityMetrics>, Object>(var1, var2, null) {
         final byte[] $compressedData;
         final byte[] $originalData;
         int label;

         {
            super(2, var3);
            this.$originalData = var1;
            this.$compressedData = var2x;
         }

         public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
            return new <anonymous constructor>(this.$originalData, this.$compressedData, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation<? super ImageQualityCalculator.ImageQualityMetrics> var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         // $VF: Duplicated exception handlers to handle obfuscated exceptions
         public final Object invokeSuspend(Object var1) {
            val var3: Any = ot.b.f();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               try {
                  kotlin.c.b(var1);
                  return var1;
               } catch (var8: Exception) {
               }
            } else {
               kotlin.c.b(var1);

               var var4: ImageQualityCalculator;
               var var5: Bitmap;
               try {
                  var4 = ImageQualityCalculator.INSTANCE;
                  var5 = ImageQualityCalculator.access$decodeByteArraySafely(ImageQualityCalculator.INSTANCE, this.$originalData);
                  var1 = ImageQualityCalculator.access$decodeByteArraySafely(var4, this.$compressedData);
               } catch (var7: Exception) {
                  return null;
               }

               if (var5 != null && var1 != null) {
                  try {
                     this.label = 1;
                     var1 = var4.calculateQualityMetrics(var5, var1, this);
                  } catch (var6: Exception) {
                     return null;
                  }

                  if (var1 === var3) {
                     return var3;
                  }

                  return var1;
               }
            }

            return null;
         }
      }, var3);
   }

   public data class ImageQualityMetrics(psnr: Double, ssim: Double, psnrCalculationTimeMs: Long, ssimCalculationTimeMs: Long) {
      public final val psnr: Double
      public final val ssim: Double
      public final val psnrCalculationTimeMs: Long
      public final val ssimCalculationTimeMs: Long

      init {
         this.psnr = var1;
         this.ssim = var3;
         this.psnrCalculationTimeMs = var5;
         this.ssimCalculationTimeMs = var7;
      }

      public operator fun component1(): Double {
         return this.psnr;
      }

      public operator fun component2(): Double {
         return this.ssim;
      }

      public operator fun component3(): Long {
         return this.psnrCalculationTimeMs;
      }

      public operator fun component4(): Long {
         return this.ssimCalculationTimeMs;
      }

      public fun copy(
         psnr: Double = var0.psnr,
         ssim: Double = var0.ssim,
         psnrCalculationTimeMs: Long = var0.psnrCalculationTimeMs,
         ssimCalculationTimeMs: Long = var0.ssimCalculationTimeMs
      ): com.discord.media.utils.ImageQualityCalculator.ImageQualityMetrics {
         return new ImageQualityCalculator.ImageQualityMetrics(var1, var3, var5, var7);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ImageQualityCalculator.ImageQualityMetrics) {
            return false;
         } else {
            var1 = var1;
            if (java.lang.Double.compare(this.psnr, var1.psnr) != 0) {
               return false;
            } else if (java.lang.Double.compare(this.ssim, var1.ssim) != 0) {
               return false;
            } else if (this.psnrCalculationTimeMs != var1.psnrCalculationTimeMs) {
               return false;
            } else {
               return this.ssimCalculationTimeMs == var1.ssimCalculationTimeMs;
            }
         }
      }

      public override fun hashCode(): Int {
         return ((java.lang.Double.hashCode(this.psnr) * 31 + java.lang.Double.hashCode(this.ssim)) * 31 + java.lang.Long.hashCode(this.psnrCalculationTimeMs))
               * 31
            + java.lang.Long.hashCode(this.ssimCalculationTimeMs);
      }

      public override fun toString(): String {
         val var1: Double = this.psnr;
         val var3: Double = this.ssim;
         val var5: Long = this.psnrCalculationTimeMs;
         val var7: Long = this.ssimCalculationTimeMs;
         val var9: StringBuilder = new StringBuilder();
         var9.append("ImageQualityMetrics(psnr=");
         var9.append(var1);
         var9.append(", ssim=");
         var9.append(var3);
         var9.append(", psnrCalculationTimeMs=");
         var9.append(var5);
         var9.append(", ssimCalculationTimeMs=");
         var9.append(var7);
         var9.append(")");
         return var9.toString();
      }
   }
}
