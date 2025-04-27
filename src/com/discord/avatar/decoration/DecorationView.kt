package com.discord.avatar.decoration

import android.content.Context
import android.util.AttributeSet
import com.discord.image.animated_image.apng.APNGImageView
import com.discord.image.animated_image.apng.APNGView
import com.discord.image.animated_image.apng.APNGView.Config
import kotlin.jvm.internal.q

public class DecorationView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : APNGImageView {
   private final var config: Config
   private final var isDirty: Boolean

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
      this.config = new APNGView.Config("", true, false, null, null, "decorations");
   }

   public fun maybeUpdateView() {
      if (this.isDirty) {
         this.getApngView().loadImage(this.config);
         this.resetViews(this.getApngView(), false);
         this.isDirty = false;
      }
   }

   public fun pause() {
      this.getApngView().pause();
   }

   public fun play() {
      this.getApngView().play();
   }

   public fun seek(positionMillis: Long) {
      this.getApngView().seek(var1);
   }

   public fun setAutoplay(autoplay: Boolean) {
      if (this.config.getAnimate() != var1) {
         this.config = APNGView.Config.copy$default(this.config, null, var1, false, null, null, null, 61, null);
         this.isDirty = true;
      }
   }

   public fun setUrl(url: String) {
      q.h(var1, "url");
      if (!q.c(this.config.getUrl(), var1)) {
         this.config = APNGView.Config.copy$default(this.config, var1, false, false, null, null, null, 62, null);
         this.isDirty = true;
      }
   }
}
