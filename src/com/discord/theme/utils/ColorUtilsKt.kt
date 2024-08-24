package com.discord.theme.utils

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.content.res.Resources.Theme
import android.graphics.Color
import android.graphics.PorterDuff.Mode
import android.view.View
import android.widget.ImageView
import androidx.core.widget.g
import com.discord.theme.DiscordThemeObject
import com.discord.theme.ThemeManager
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.r
import kotlin.text.MatchResult.b
import sh.a
import vh.h

private final val hsv: FloatArray = new float[3]
private final val rgbaPattern: Regex = new Regex("rgba\\((\\d+),\\s*(\\d+),\\s*(\\d+),\\s*(\\d+(?:\\.\\d*)?|\\.\\d+)\\)")

private fun applySaturationFactor(color: Int): Int {
   val var6: Float = ThemeManager.INSTANCE.getSaturationFactor();
   val var8: Boolean;
   if (var6 == 1.0F) {
      var8 = true;
   } else {
      var8 = false;
   }

   if (!var8) {
      val var10: FloatArray = hsv;
      Color.colorToHSV(var0, hsv);
      var var3: Float = var10[1];
      var var1: Float = var10[2];
      val var7: Float = var10[2] * var3;
      val var4: Float = 2;
      val var5: Float = var1 - var7 / 2;
      var var11: Boolean;
      if (var1 - var7 / 2 == 0.0F) {
         var11 = true;
      } else {
         var11 = false;
      }

      var1 = var3;
      if (!var11) {
         if (var5 == 1.0F) {
            var11 = true;
         } else {
            var11 = false;
         }

         var1 = var3;
         if (!var11) {
            var1 = var7 / (1 - Math.abs(2.0F * var5 - 1.0F));
         }
      }

      var3 = var1 * var6 * Math.min(1.0F, 1.0F - var5) + var5;
      var11 = false;
      if (var3 == 0.0F) {
         var11 = true;
      }

      if (var11) {
         var1 = 0.0F;
      } else {
         var1 = var4 * (1.0F - var5 / var3);
      }

      var10[1] = var1;
      var10[2] = var3;
      var0 = Color.HSVToColor(var10);
   }

   return var0;
}

public fun argbWithAdjustedAlpha(color: Int, alpha: Float): Int {
   return Color.argb(a.b((float)Color.alpha(var0) * var1), Color.red(var0), Color.green(var0), Color.blue(var0));
}

public fun Context.getColorCompat(id: Int): Int {
   r.h(var0, "<this>");
   return applySaturationFactor(var0.getColor(var1));
}

public fun Resources.getColorCompat(id: Int, theme: Theme): Int {
   r.h(var0, "<this>");
   r.h(var2, "theme");
   return applySaturationFactor(var0.getColor(var1, var2));
}

public fun View.getColorCompat(colorRes: Int): Int {
   r.h(var0, "<this>");
   val var2: Context = var0.getContext();
   r.g(var2, "context");
   return getColorCompat(var2, var1);
}

public fun Context.getThemeColor(lightColorRes: Int, darkColorRes: Int): Int {
   r.h(var0, "<this>");
   return getThemeColor(var0, var1, var2, ThemeManagerKt.getTheme());
}

public fun Context.getThemeColor(lightColorRes: Int, darkColorRes: Int, theme: DiscordThemeObject): Int {
   r.h(var0, "<this>");
   r.h(var3, "theme");
   return getColorCompat(var0, var3.getColorRes(var1, var2));
}

public fun interpolateColors(colorA: Int, colorB: Int, t: Float, minT: Float = 0.0F, maxT: Float = 1.0F): Int {
   if (var2 <= var3) {
      return var0;
   } else if (var2 >= var4) {
      return var1;
   } else {
      val var9: Int = Color.red(var0);
      val var7: Int = Color.green(var0);
      val var5: Int = Color.blue(var0);
      var0 = Color.alpha(var0);
      return Color.argb(
         h.k((int)((float)var0 + (float)(Color.alpha(var1) - var0) * ((var2 - var3) / (var4 - var3))), 0, 255),
         h.k((int)((float)var9 + (float)(Color.red(var1) - var9) * ((var2 - var3) / (var4 - var3))), 0, 255),
         h.k((int)((float)var7 + (float)(Color.green(var1) - var7) * ((var2 - var3) / (var4 - var3))), 0, 255),
         h.k((int)((float)var5 + (float)(Color.blue(var1) - var5) * ((var2 - var3) / (var4 - var3))), 0, 255)
      );
   }
}

@JvmSynthetic
fun `interpolateColors$default`(var0: Int, var1: Int, var2: Float, var3: Float, var4: Float, var5: Int, var6: Any): Int {
   if ((var5 and 8) != 0) {
      var3 = 0.0F;
   }

   if ((var5 and 16) != 0) {
      var4 = 1.0F;
   }

   return interpolateColors(var0, var1, var2, var3, var4);
}

public fun rgbaToArgb(rgbaString: String?): Int {
   val var1: Int;
   if (var0 != null) {
      val var5: MatchResult = rgbaPattern.f(var0);
      if (var5 != null) {
         val var6: b = var5.a();
         var1 = Color.argb(
            (int)(java.lang.Double.parseDouble(var6.a().b().get(4) as java.lang.String) * (double)255),
            Integer.parseInt(var6.a().b().get(1) as java.lang.String),
            Integer.parseInt(var6.a().b().get(2) as java.lang.String),
            Integer.parseInt(var6.a().b().get(3) as java.lang.String)
         );
      } else {
         var1 = -16777216;
      }
   } else {
      var1 = 0;
   }

   return var1;
}

public fun ImageView.setTintColor(colorInt: Int?) {
   r.h(var0, "<this>");
   val var2: ColorStateList;
   if (var1 != null) {
      var2 = ColorStateList.valueOf(var1.intValue());
   } else {
      var2 = null;
   }

   g.c(var0, var2);
}

public fun SimpleDraweeView.setTintColor(colorInt: Int?) {
   r.h(var0, "<this>");
   if (var1 == null) {
      var0.clearColorFilter();
   } else {
      var0.setColorFilter(var1, Mode.SRC_IN);
   }
}
