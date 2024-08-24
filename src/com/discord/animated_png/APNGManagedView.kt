package com.discord.animated_png

import android.content.Context
import android.util.AttributeSet
import com.discord.image.animated_image.apng.APNGImageView
import com.discord.image.animated_image.apng.APNGView.Config
import kotlin.jvm.internal.r

public class APNGManagedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : APNGImageView {
   fun APNGManagedView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun APNGManagedView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
   }

   public fun asApng(url: String) {
      r.h(var1, "url");
      APNGImageView.inflateApngView$default(this, false, 1, null);
      this.getApngView().loadImage(new Config(var1, true, false, null, null, "animated_pngs", 4, null));
      APNGImageView.resetViews$default(this, this.getApngView(), false, 2, null);
   }
}
