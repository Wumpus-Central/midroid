package com.discord.progress_dots

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.progress_dots.databinding.ProgressDotsViewBinding
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.r

public class ProgressDots  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: ProgressDotsViewBinding
   private final val dotsAnimationTimeMs: Int
   private final val dotsAnimationStaggerTimeMs: Long
   private final var isRunning: Boolean

   fun ProgressDots(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ProgressDots(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      val var4: ProgressDotsViewBinding = ProgressDotsViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var4, "inflate(...)");
      this.binding = var4;
      var3 = this.getResources().getInteger(R.integer.progress_dots_animation_time);
      this.dotsAnimationTimeMs = var3;
      this.dotsAnimationStaggerTimeMs = (long)(var3 / 1.5);
      this.setupColors();
      var4.viewProgressDots3.setOnScaleDownCompleteListener(new c(this));
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: ProgressDots): Unit {
      if (var0.isAttachedToWindow() && var0.getVisibility() == 0) {
         var0.start(true);
      }

      return Unit.a;
   }

   private fun start(isReplay: Boolean = false) {
      if (!this.isRunning || var1) {
         val var2: Long;
         if (var1) {
            var2 = this.dotsAnimationStaggerTimeMs;
         } else {
            var2 = 0L;
         }

         this.binding.viewProgressDots1.start(var2);
         this.binding.viewProgressDots2.start(this.dotsAnimationStaggerTimeMs + var2);
         this.binding.viewProgressDots3.start(var2 + this.dotsAnimationStaggerTimeMs + this.dotsAnimationStaggerTimeMs);
         this.isRunning = true;
      }
   }

   private fun stop() {
      val var2: java.util.Iterator = i.n(new ProgressDot[]{this.binding.viewProgressDots1, this.binding.viewProgressDots2, this.binding.viewProgressDots3})
         .iterator();

      while (var2.hasNext()) {
         (var2.next() as ProgressDot).stop();
      }

      this.isRunning = false;
   }

   private fun syncPlayingState(isAttached: Boolean) {
      if (var1 && this.getVisibility() == 0) {
         start$default(this, false, 1, null);
      } else {
         this.stop();
      }
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      this.syncPlayingState(true);
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.syncPlayingState(false);
   }

   public open fun setVisibility(visibility: Int) {
      super.setVisibility(var1);
      this.syncPlayingState(this.isAttachedToWindow());
   }

   public fun setupColors() {
      var var1: ProgressDot = this.binding.viewProgressDots1;
      r.g(this.binding.viewProgressDots1, "viewProgressDots1");
      ViewBackgroundUtilsKt.setBackgroundOval$default(var1, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
      var1 = this.binding.viewProgressDots2;
      r.g(this.binding.viewProgressDots2, "viewProgressDots2");
      ViewBackgroundUtilsKt.setBackgroundOval$default(var1, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
      var1 = this.binding.viewProgressDots3;
      r.g(this.binding.viewProgressDots3, "viewProgressDots3");
      ViewBackgroundUtilsKt.setBackgroundOval$default(var1, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
   }
}
