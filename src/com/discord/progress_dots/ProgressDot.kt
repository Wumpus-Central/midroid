package com.discord.progress_dots

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.Animation.AnimationListener
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

public class ProgressDot  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : View {
   public final var onScaleDownCompleteListener: (() -> Unit)?
      internal set

   private final val scaleAndFadeDownAnimation: Animation
   private final val scaleAndFadeUpAnimation: Animation

   fun ProgressDot(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ProgressDot(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      val var5: Animation = AnimationUtils.loadAnimation(var1, R.anim.anim_progress_dots_scale_up);
      r.g(var5, "loadAnimation(context, R…m_progress_dots_scale_up)");
      this.scaleAndFadeUpAnimation = var5;
      val var4: Animation = AnimationUtils.loadAnimation(var1, R.anim.anim_progress_dots_scale_down);
      r.g(var4, "loadAnimation(context, R…progress_dots_scale_down)");
      this.scaleAndFadeDownAnimation = var4;
   }

   private fun startDownAnimation() {
      this.startAnimation(this.scaleAndFadeDownAnimation);
   }

   private fun startUpAnimation() {
      this.startAnimation(this.scaleAndFadeUpAnimation);
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.stop();
   }

   public fun start(delay: Long = 0L) {
      this.scaleAndFadeUpAnimation.setStartOffset(var1);
      this.scaleAndFadeUpAnimation.setAnimationListener(new ProgressDot.AnimationListenerImpl(new Function0<Unit>(this) {
         final ProgressDot this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            ProgressDot.access$startDownAnimation(this.this$0);
         }
      }));
      this.scaleAndFadeDownAnimation.setAnimationListener(new ProgressDot.AnimationListenerImpl(new Function0<Unit>(this) {
         final ProgressDot this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            val var1: Function0 = this.this$0.getOnScaleDownCompleteListener();
            if (var1 != null) {
               var1.invoke();
            }
         }
      }));
      this.startUpAnimation();
   }

   public fun stop() {
      this.scaleAndFadeUpAnimation.cancel();
      this.scaleAndFadeDownAnimation.cancel();
   }

   private open class AnimationListenerImpl(onComplete: () -> Unit) : AnimationListener {
      public final val onComplete: () -> Unit

      init {
         r.h(var1, "onComplete");
         super();
         this.onComplete = var1;
      }

      public open fun onAnimationEnd(animation: Animation?) {
         this.onComplete.invoke();
      }

      public open fun onAnimationRepeat(animation: Animation?) {
      }

      public open fun onAnimationStart(animation: Animation?) {
      }
   }
}
