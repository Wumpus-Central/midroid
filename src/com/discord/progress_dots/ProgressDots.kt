package com.discord.progress_dots

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.progress_dots.databinding.ProgressDotsViewBinding
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nProgressDots.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressDots.kt\ncom/discord/progress_dots/ProgressDots\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,98:1\n1863#2,2:99\n255#3:101\n255#3:102\n*S KotlinDebug\n*F\n+ 1 ProgressDots.kt\ncom/discord/progress_dots/ProgressDots\n*L\n68#1:99,2\n91#1:101\n36#1:102\n*E\n"])
public class ProgressDots  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(var1, var2, var3) {
   private final val binding: ProgressDotsViewBinding
   private final val dotsAnimationTimeMs: Int
   private final val dotsAnimationStaggerTimeMs: Long
   private final var isRunning: Boolean

   fun ProgressDots(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun ProgressDots(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var4: ProgressDotsViewBinding = ProgressDotsViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var4;
      var3 = this.getResources().getInteger(R.integer.progress_dots_animation_time);
      this.dotsAnimationTimeMs = var3;
      this.dotsAnimationStaggerTimeMs = (long)(var3 / 1.5);
      this.setupColors();
      var4.viewProgressDots3.setOnScaleDownCompleteListener(new com.discord.progress_dots.c(this));
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
      val var2: java.util.Iterator = CollectionsKt.o(
            new ProgressDot[]{this.binding.viewProgressDots1, this.binding.viewProgressDots2, this.binding.viewProgressDots3}
         )
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
      ViewBackgroundUtilsKt.setBackgroundOval$default(var1, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
      var1 = this.binding.viewProgressDots2;
      ViewBackgroundUtilsKt.setBackgroundOval$default(var1, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
      var1 = this.binding.viewProgressDots3;
      ViewBackgroundUtilsKt.setBackgroundOval$default(var1, ThemeManagerKt.getTheme().getTextNormal(), 0, 2, null);
   }
}
