package com.discord.ripple

import android.content.res.ColorStateList
import android.graphics.drawable.RippleDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.shapes.RoundRectShape
import android.graphics.drawable.shapes.Shape
import android.view.View
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.r

public fun View.addCircleRipple(foreground: Boolean = false) {
   r.h(var0, "<this>");
   setDrawableRipple(var0, var1, new OvalShape());
}

@JvmSynthetic
fun `addCircleRipple$default`(var0: View, var1: Boolean, var2: Int, var3: Any) {
   if ((var2 and 1) != 0) {
      var1 = false;
   }

   addCircleRipple(var0, var1);
}

public fun View.addRipple(foreground: Boolean = false, cornerRadius: Int = 0) {
   r.h(var0, "<this>");
   val var3: Float = var2;
   val var4: FloatArray = new float[8];

   for (int var5 = 0; var5 < 8; var5++) {
      var4[var5] = var3;
   }

   setDrawableRipple(var0, var1, new RoundRectShape(var4, null, null));
}

@JvmSynthetic
fun `addRipple$default`(var0: View, var1: Boolean, var2: Int, var3: Int, var4: Any) {
   if ((var3 and 1) != 0) {
      var1 = false;
   }

   if ((var3 and 2) != 0) {
      var2 = 0;
   }

   addRipple(var0, var1, var2);
}

private fun View.setDrawableRipple(foreground: Boolean, maskShape: Shape) {
   val var3: RippleDrawable = new RippleDrawable(ColorStateList.valueOf(ThemeManagerKt.getTheme().getAndroidRipple()), null, new ShapeDrawable(var2));
   if (var1) {
      var0.setForeground(var3);
   } else {
      var0.setBackground(var3);
   }
}
