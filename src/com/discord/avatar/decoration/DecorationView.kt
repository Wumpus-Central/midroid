package com.discord.avatar.decoration

import android.content.Context
import android.util.AttributeSet
import com.discord.image.animated_image.apng.APNGImageView
import com.discord.image.animated_image.apng.APNGView
import kotlin.jvm.internal.q

public class DecorationView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : APNGImageView {
   fun DecorationView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun DecorationView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
   }

   public fun asDecoration(url: String, widthDp: Int?, heightDp: Int?, animate: Boolean) {
      q.h(var1, "url");
      this.inflateApngView(false);
      this.getApngView().loadImage(new APNGView.Config(var1, var4, false, var2, var3, "decorations"));
      this.resetViews(this.getApngView(), false);
   }
}
