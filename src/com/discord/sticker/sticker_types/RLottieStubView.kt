package com.discord.sticker.sticker_types

import android.content.Context
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.View
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.r

internal class RLottieStubView(context: Context) : View {
   private final val placeholder: ShapeDrawable

   init {
      r.h(var1, "context");
      super(var1);
      val var2: ShapeDrawable = new ShapeDrawable();
      var2.setShape(new OvalShape());
      var2.getPaint().setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
      this.placeholder = var2;
      this.setBackground(var2);
   }
}
