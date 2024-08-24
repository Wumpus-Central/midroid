package com.discord.misc.utilities.view

import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.PaintDrawable
import android.graphics.drawable.GradientDrawable.Orientation
import android.view.View
import com.discord.misc.utilities.drawable.GetDrawableCompatKt
import kotlin.jvm.internal.r

public fun View.setBackgroundDrawableRes(drawableResId: Int) {
   r.h(var0, "<this>");
   val var2: Context = var0.getContext();
   r.g(var2, "context");
   var0.setBackground(GetDrawableCompatKt.getDrawableCompat(var2, var1));
}

public fun View.setBackgroundOval(color: Int, radiusPx: Int = 0) {
   r.h(var0, "<this>");
   val var3: GradientDrawable = new GradientDrawable();
   var3.setShape(1);
   var3.setColor(var1);
   var3.setCornerRadius((float)var2);
   var0.setBackground(var3);
}

@JvmSynthetic
fun `setBackgroundOval$default`(var0: View, var1: Int, var2: Int, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = 0;
   }

   setBackgroundOval(var0, var1, var2);
}

public fun View.setBackgroundRectangle(
   color: Int,
   topStartRadius: Float = 0.0F,
   topEndRadius: Float = 0.0F,
   bottomEndRadius: Float = 0.0F,
   bottomStartRadius: Float = 0.0F,
   strokeColor: Int? = null,
   strokeWidth: Int = 0
) {
   r.h(var0, "<this>");
   val var8: GradientDrawable = new GradientDrawable();
   var8.setShape(0);
   if (var6 != null) {
      var8.setStroke(var7, var6);
   }

   var8.setCornerRadii(new float[]{var2, var2, var3, var3, var4, var4, var5, var5});
   var8.setColor(var1);
   var0.setBackground(var8);
}

public fun View.setBackgroundRectangle(color: Int, radiusPx: Int, strokeColor: Int? = null, strokeWidth: Int = 0) {
   r.h(var0, "<this>");
   val var6: Any;
   if (var3 != null) {
      val var5: GradientDrawable = new GradientDrawable();
      var5.setShape(0);
      var5.setStroke(var4, var3);
      var5.setCornerRadius((float)var2);
      var5.setColor(var1);
      var6 = var5;
   } else {
      var6 = new PaintDrawable(var1);
      var6.setCornerRadius((float)var2);
   }

   var0.setBackground((Drawable)var6);
}

public fun View.setBackgroundRectangle(
   colors: IntArray,
   gradientOrientation: Orientation,
   topStartRadius: Float = 0.0F,
   topEndRadius: Float = 0.0F,
   bottomEndRadius: Float = 0.0F,
   bottomStartRadius: Float = 0.0F,
   strokeColor: Int? = null,
   strokeWidth: Int = 0
) {
   r.h(var0, "<this>");
   r.h(var1, "colors");
   r.h(var2, "gradientOrientation");
   val var9: GradientDrawable = new GradientDrawable();
   var9.setShape(0);
   if (var7 != null) {
      var9.setStroke(var8, var7);
   }

   var9.setCornerRadii(new float[]{var3, var3, var4, var4, var5, var5, var6, var6});
   var9.setColors(var1);
   var9.setOrientation(var2);
   var0.setBackground(var9);
}

public fun View.setBackgroundRectangle(colors: IntArray, gradientOrientation: Orientation, radiusPx: Int, strokeColor: Int? = null, strokeWidth: Int = 0) {
   r.h(var0, "<this>");
   r.h(var1, "colors");
   r.h(var2, "gradientOrientation");
   val var6: GradientDrawable = new GradientDrawable();
   var6.setShape(0);
   if (var4 != null) {
      var6.setStroke(var5, var4);
   }

   var6.setCornerRadius((float)var3);
   var6.setColors(var1);
   var6.setOrientation(var2);
   var0.setBackground(var6);
}

@JvmSynthetic
fun `setBackgroundRectangle$default`(var0: View, var1: Int, var2: Float, var3: Float, var4: Float, var5: Float, var6: Int, var7: Int, var8: Int, var9: Any) {
   if ((var8 and 2) != 0) {
      var2 = 0.0F;
   }

   if ((var8 and 4) != 0) {
      var3 = 0.0F;
   }

   if ((var8 and 8) != 0) {
      var4 = 0.0F;
   }

   if ((var8 and 16) != 0) {
      var5 = 0.0F;
   }

   if ((var8 and 32) != 0) {
      var6 = null;
   }

   if ((var8 and 64) != 0) {
      var7 = 0;
   }

   setBackgroundRectangle(var0, var1, var2, var3, var4, var5, var6, var7);
}

@JvmSynthetic
fun `setBackgroundRectangle$default`(var0: View, var1: Int, var2: Int, var3: Int, var4: Int, var5: Int, var6: Any) {
   if ((var5 and 4) != 0) {
      var3 = null;
   }

   if ((var5 and 8) != 0) {
      var4 = 0;
   }

   setBackgroundRectangle(var0, var1, var2, var3, var4);
}

@JvmSynthetic
fun `setBackgroundRectangle$default`(
   var0: View, var1: IntArray, var2: Orientation, var3: Float, var4: Float, var5: Float, var6: Float, var7: Int, var8: Int, var9: Int, var10: Any
) {
   if ((var9 and 4) != 0) {
      var3 = 0.0F;
   }

   if ((var9 and 8) != 0) {
      var4 = 0.0F;
   }

   if ((var9 and 16) != 0) {
      var5 = 0.0F;
   }

   if ((var9 and 32) != 0) {
      var6 = 0.0F;
   }

   if ((var9 and 64) != 0) {
      var7 = null;
   }

   if ((var9 and 128) != 0) {
      var8 = 0;
   }

   setBackgroundRectangle(var0, var1, var2, var3, var4, var5, var6, var7, var8);
}

@JvmSynthetic
fun `setBackgroundRectangle$default`(var0: View, var1: IntArray, var2: Orientation, var3: Int, var4: Int, var5: Int, var6: Int, var7: Any) {
   if ((var6 and 8) != 0) {
      var4 = null;
   }

   if ((var6 and 16) != 0) {
      var5 = 0;
   }

   setBackgroundRectangle(var0, var1, var2, var3, var4, var5);
}
