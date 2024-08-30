package com.discord.image.color_quantizer

import android.graphics.Color
import kotlin.jvm.internal.q

internal object ColorUtils {
   @JvmStatic
   public fun HSLtoRGB(hsl: FloatArray): Int {
      q.h(var0, "hsl");
      val var1: Float = var0[0];
      val var8: Float = (1.0F - Math.abs((float)2 * var0[2] - 1.0F)) * var0[1];
      val var4: Float = var0[2] - 0.5F * var8;
      val var9: Float = (1.0F - Math.abs(var1 / 60.0F % 2.0F - 1.0F)) * var8;
      var var5: Int;
      var var6: Int;
      var var7: Int;
      switch ((int)var1 / 60) {
         case 0:
            var5 = ak.a.b((var8 + var4) * 255.0F);
            var6 = ak.a.b((var9 + var4) * 255.0F);
            var7 = ak.a.b(var4 * 255.0F);
            break;
         case 1:
            var5 = ak.a.b((var9 + var4) * 255.0F);
            var6 = ak.a.b((var8 + var4) * 255.0F);
            var7 = ak.a.b(var4 * 255.0F);
            break;
         case 2:
            var5 = ak.a.b(var4 * 255.0F);
            var6 = ak.a.b((var8 + var4) * 255.0F);
            var7 = ak.a.b((var9 + var4) * 255.0F);
            break;
         case 3:
            var5 = ak.a.b(var4 * 255.0F);
            var6 = ak.a.b((var9 + var4) * 255.0F);
            var7 = ak.a.b((var8 + var4) * 255.0F);
            break;
         case 4:
            var5 = ak.a.b((var9 + var4) * 255.0F);
            var6 = ak.a.b(var4 * 255.0F);
            var7 = ak.a.b((var8 + var4) * 255.0F);
            break;
         case 5:
         case 6:
            var5 = ak.a.b((var8 + var4) * 255.0F);
            var6 = ak.a.b(var4 * 255.0F);
            var7 = ak.a.b((var9 + var4) * 255.0F);
            break;
         default:
            var7 = 0;
            var5 = 0;
            var6 = 0;
      }

      return Color.rgb(Math.max(0, Math.min(255, var5)), Math.max(0, Math.min(255, var6)), Math.max(0, Math.min(255, var7)));
   }

   @JvmStatic
   public fun RGBtoHSL(r: Int, g: Int, b: Int, hsl: FloatArray) {
      q.h(var3, "hsl");
      var var4: Float = var0 / 255.0F;
      val var10: Float = var1 / 255.0F;
      val var8: Float = var2 / 255.0F;
      val var9: Float = Math.max(var4, Math.max(var10, (float)var2 / 255.0F));
      val var7: Float = Math.min(var4, Math.min(var10, (float)var2 / 255.0F));
      var var5: Float = var9 - var7;
      val var6: Float = (var9 + var7) / 2.0F;
      if (var9 == var7) {
         var4 = 0.0F;
         var5 = 0.0F;
      } else {
         if (var9 == var4) {
            var4 = (var10 - var8) / var5 % 6.0F;
         } else if (var9 == var10) {
            var4 = (var8 - var4) / var5 + 2.0F;
         } else {
            var4 = (var4 - var10) / var5 + 4.0F;
         }

         var5 = var5 / (1.0F - Math.abs(2.0F * var6 - 1.0F));
      }

      var3[0] = var4 * 60.0F % 360.0F;
      var3[1] = var5;
      var3[2] = var6;
   }
}
