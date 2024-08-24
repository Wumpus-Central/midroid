package com.discord.avatar.decoration

import android.content.Context
import android.util.AttributeSet
import com.discord.image.animated_image.apng.APNGImageView
import com.discord.image.animated_image.apng.APNGView.Config
import kotlin.jvm.internal.r

public class DecorationView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : APNGImageView {
   fun DecorationView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun DecorationView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
   }

   public fun asDecoration(url: String, widthDp: Int?, heightDp: Int?, animate: Boolean) {
      r.h(var1, "url");
      this.inflateApngView(false);
      this.getApngView().loadImage(new Config(var1, var4, false, var2, var3, "decorations"));
      this.resetViews(this.getApngView(), false);
   }
}
