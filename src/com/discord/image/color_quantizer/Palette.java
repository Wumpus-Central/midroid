package com.discord.image.color_quantizer;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class Palette {
   private static final int CALCULATE_BITMAP_MIN_DIMENSION = 100;
   private static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
   private static final float MAX_DARK_LUMA = 0.45F;
   private static final float MAX_MUTED_SATURATION = 0.4F;
   private static final float MAX_NORMAL_LUMA = 0.7F;
   private static final float MIN_LIGHT_LUMA = 0.55F;
   private static final float MIN_NORMAL_LUMA = 0.3F;
   private static final float MIN_VIBRANT_SATURATION = 0.35F;
   private static final float TARGET_DARK_LUMA = 0.26F;
   private static final float TARGET_LIGHT_LUMA = 0.74F;
   private static final float TARGET_MUTED_SATURATION = 0.3F;
   private static final float TARGET_NORMAL_LUMA = 0.5F;
   private static final float TARGET_VIBRANT_SATURATION = 1.0F;
   private Swatch mDarkMutedSwatch;
   private Swatch mDarkVibrantSwatch;
   private final int mHighestPopulation;
   private Swatch mLightMutedColor;
   private Swatch mLightVibrantSwatch;
   private Swatch mMutedSwatch;
   private final List<Swatch> mSwatches;
   private Swatch mVibrantSwatch;

   private Palette(List<Swatch> var1) {
      this.mSwatches = var1;
      this.mHighestPopulation = this.findMaxPopulation();
      this.mVibrantSwatch = this.findColor(0.5F, 0.3F, 0.7F, 1.0F, 0.35F, 1.0F);
      this.mLightVibrantSwatch = this.findColor(0.74F, 0.55F, 1.0F, 1.0F, 0.35F, 1.0F);
      this.mDarkVibrantSwatch = this.findColor(0.26F, 0.0F, 0.45F, 1.0F, 0.35F, 1.0F);
      this.mMutedSwatch = this.findColor(0.5F, 0.3F, 0.7F, 0.3F, 0.0F, 0.4F);
      this.mLightMutedColor = this.findColor(0.74F, 0.55F, 1.0F, 0.3F, 0.0F, 0.4F);
      this.mDarkMutedSwatch = this.findColor(0.26F, 0.0F, 0.45F, 0.3F, 0.0F, 0.4F);
      this.generateEmptySwatches();
   }

   private static void checkBitmapParam(Bitmap var0) {
      if (var0 != null) {
         if (var0.isRecycled()) {
            throw new IllegalArgumentException("bitmap can not be recycled");
         }
      } else {
         throw new IllegalArgumentException("bitmap can not be null");
      }
   }

   private static void checkNumberColorsParam(int var0) {
      if (var0 < 1) {
         throw new IllegalArgumentException("numColors must be 1 of greater");
      }
   }

   private static float[] copyHslValues(Swatch var0) {
      float[] var1 = new float[3];
      System.arraycopy(var0.getHsl(), 0, var1, 0, 3);
      return var1;
   }

   private static float createComparisonValue(float var0, float var1, float var2, float var3, int var4, int var5) {
      return weightedMean(invertDiff(var0, var1), 3.0F, invertDiff(var2, var3), 6.5F, (float)var4 / var5, 0.5F);
   }

   private Swatch findColor(float var1, float var2, float var3, float var4, float var5, float var6) {
      Iterator var12 = this.mSwatches.iterator();
      Swatch var10 = null;
      float var7 = 0.0F;

      while (var12.hasNext()) {
         Swatch var11 = (Swatch)var12.next();
         float var9 = var11.getHsl()[1];
         float var8 = var11.getHsl()[2];
         if (var9 >= var5 && var9 <= var6 && var8 >= var2 && var8 <= var3 && !this.isAlreadySelected(var11)) {
            var8 = createComparisonValue(var9, var4, var8, var1, var11.getPopulation(), this.mHighestPopulation);
            if (var10 == null || var8 > var7) {
               var10 = var11;
               var7 = var8;
            }
         }
      }

      return var10;
   }

   private int findMaxPopulation() {
      Iterator var2 = this.mSwatches.iterator();
      int var1 = 0;

      while (var2.hasNext()) {
         var1 = Math.max(var1, ((Swatch)var2.next()).getPopulation());
      }

      return var1;
   }

   public static Palette generate(Bitmap var0) {
      return generate(var0, 16);
   }

   public static Palette generate(Bitmap var0, int var1) {
      checkBitmapParam(var0);
      checkNumberColorsParam(var1);
      Bitmap var2 = scaleBitmapDown(var0);
      ColorCutQuantizer var3 = ColorCutQuantizer.fromBitmap(var2, var1);
      if (var2 != var0) {
         var2.recycle();
      }

      return new Palette(var3.getQuantizedColors());
   }

   private void generateEmptySwatches() {
      if (this.mVibrantSwatch == null) {
         Swatch var1 = this.mDarkVibrantSwatch;
         if (var1 != null) {
            float[] var2 = copyHslValues(var1);
            var2[2] = 0.5F;
            this.mVibrantSwatch = new Swatch(ColorUtils.HSLtoRGB(var2), 0);
         }
      }

      if (this.mDarkVibrantSwatch == null) {
         Swatch var3 = this.mVibrantSwatch;
         if (var3 != null) {
            float[] var4 = copyHslValues(var3);
            var4[2] = 0.26F;
            this.mDarkVibrantSwatch = new Swatch(ColorUtils.HSLtoRGB(var4), 0);
         }
      }
   }

   private static float invertDiff(float var0, float var1) {
      return 1.0F - Math.abs(var0 - var1);
   }

   private boolean isAlreadySelected(Swatch var1) {
      boolean var2;
      if (this.mVibrantSwatch != var1
         && this.mDarkVibrantSwatch != var1
         && this.mLightVibrantSwatch != var1
         && this.mMutedSwatch != var1
         && this.mDarkMutedSwatch != var1
         && this.mLightMutedColor != var1) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   private static Bitmap scaleBitmapDown(Bitmap var0) {
      int var2 = Math.min(var0.getWidth(), var0.getHeight());
      if (var2 <= 100) {
         return var0;
      } else {
         float var1 = 100.0F / var2;
         return Bitmap.createScaledBitmap(var0, Math.round(var0.getWidth() * var1), Math.round(var0.getHeight() * var1), false);
      }
   }

   private static float weightedMean(float... var0) {
      float var2 = 0.0F;
      byte var5 = 0;

      float var1;
      for (var1 = 0.0F; var5 < var0.length; var5 += 2) {
         float var4 = var0[var5];
         float var3 = var0[var5 + 1];
         var2 += var4 * var3;
         var1 += var3;
      }

      return var2 / var1;
   }

   public int getDarkMutedColor(int var1) {
      Swatch var2 = this.mDarkMutedSwatch;
      if (var2 != null) {
         var1 = var2.getRgb();
      }

      return var1;
   }

   public Swatch getDarkMutedSwatch() {
      return this.mDarkMutedSwatch;
   }

   public int getDarkVibrantColor(int var1) {
      Swatch var2 = this.mDarkVibrantSwatch;
      if (var2 != null) {
         var1 = var2.getRgb();
      }

      return var1;
   }

   public Swatch getDarkVibrantSwatch() {
      return this.mDarkVibrantSwatch;
   }

   public int getLightMutedColor(int var1) {
      Swatch var2 = this.mLightMutedColor;
      if (var2 != null) {
         var1 = var2.getRgb();
      }

      return var1;
   }

   public Swatch getLightMutedSwatch() {
      return this.mLightMutedColor;
   }

   public int getLightVibrantColor(int var1) {
      Swatch var2 = this.mLightVibrantSwatch;
      if (var2 != null) {
         var1 = var2.getRgb();
      }

      return var1;
   }

   public Swatch getLightVibrantSwatch() {
      return this.mLightVibrantSwatch;
   }

   public int getMutedColor(int var1) {
      Swatch var2 = this.mMutedSwatch;
      if (var2 != null) {
         var1 = var2.getRgb();
      }

      return var1;
   }

   public Swatch getMutedSwatch() {
      return this.mMutedSwatch;
   }

   public List<Swatch> getSwatches() {
      return Collections.unmodifiableList(this.mSwatches);
   }

   public int getVibrantColor(int var1) {
      Swatch var2 = this.mVibrantSwatch;
      if (var2 != null) {
         var1 = var2.getRgb();
      }

      return var1;
   }

   public Swatch getVibrantSwatch() {
      return this.mVibrantSwatch;
   }
}
