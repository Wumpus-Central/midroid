package com.discord.image.color_quantizer;

import android.graphics.Color;
import java.util.Arrays;

public final class Swatch {
   final int mBlue;
   final int mGreen;
   private float[] mHsl;
   final int mPopulation;
   final int mRed;
   final int mRgb;

   Swatch(int var1, int var2) {
      this.mRed = Color.red(var1);
      this.mGreen = Color.green(var1);
      this.mBlue = Color.blue(var1);
      this.mRgb = var1;
      this.mPopulation = var2;
   }

   Swatch(int var1, int var2, int var3, int var4) {
      this.mRed = var1;
      this.mGreen = var2;
      this.mBlue = var3;
      this.mRgb = Color.rgb(var1, var2, var3);
      this.mPopulation = var4;
   }

   public float[] getHsl() {
      if (this.mHsl == null) {
         float[] var1 = new float[3];
         this.mHsl = var1;
         ColorUtils.RGBtoHSL(this.mRed, this.mGreen, this.mBlue, var1);
      }

      return this.mHsl;
   }

   public int getPopulation() {
      return this.mPopulation;
   }

   public int getRgb() {
      return this.mRgb;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(Swatch.class.getSimpleName());
      var1.append(" ");
      var1.append("[");
      var1.append(Integer.toHexString(this.getRgb()));
      var1.append(']');
      var1.append("[HSL: ");
      var1.append(Arrays.toString(this.getHsl()));
      var1.append(']');
      var1.append("[Population: ");
      var1.append(this.mPopulation);
      var1.append(']');
      return var1.toString();
   }
}
