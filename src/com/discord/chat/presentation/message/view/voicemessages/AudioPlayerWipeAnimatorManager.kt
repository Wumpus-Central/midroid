package com.discord.chat.presentation.message.view.voicemessages

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.animation.Animator.AnimatorListener
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.os.Build.VERSION
import android.view.View
import com.discord.chat.R
import com.discord.chat.databinding.AudioPlayerViewBinding
import com.discord.misc.utilities.drawable.GetDrawableCompatKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.theme.ThemeManager
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

public class AudioPlayerWipeAnimatorManager(context: Context, binding: AudioPlayerViewBinding) {
   private final var animateToPlay: Boolean
   private final var animatorSet: AnimatorSet?
   private final val argbEvaluator: ArgbEvaluator
   private final val brand500: Int

   private final val buttonContainerActiveDrawable: ColorDrawable
      private final get() {
         return this.buttonContainerActiveDrawable$delegate.getValue() as ColorDrawable;
      }


   private final val buttonContainerDefaultDrawable: Drawable?
      private final get() {
         return this.buttonContainerDefaultDrawable$delegate.getValue() as Drawable;
      }


   private final val buttonIconColorAnimator: ValueAnimator
      private final get() {
         return this.buttonIconColorAnimator$delegate.getValue() as ValueAnimator;
      }


   private final val progressColorAnimator: ValueAnimator
      private final get() {
         return this.progressColorAnimator$delegate.getValue() as ValueAnimator;
      }


   private final val scaleAnimator: ValueAnimator
      private final get() {
         return this.scaleAnimator$delegate.getValue() as ValueAnimator;
      }


   private final val textColorAnimator: ValueAnimator
      private final get() {
         return this.textColorAnimator$delegate.getValue() as ValueAnimator;
      }


   init {
      r.h(var1, "context");
      r.h(var2, "binding");
      super();
      this.brand500 = var1.getColor(color.brand_500);
      this.argbEvaluator = new ArgbEvaluator();
      this.buttonContainerDefaultDrawable$delegate = eh.l.b(new Function0<Drawable>(var1) {
         final Context $context;

         {
            super(0);
            this.$context = var1;
         }

         public final Drawable invoke() {
            val var2: Context = this.$context;
            val var1: Int;
            if (ThemeManager.INSTANCE.isThemeLight()) {
               var1 = R.drawable.drawable_audio_play_button_gradient_light;
            } else {
               var1 = R.drawable.drawable_audio_play_button_gradient_dark;
            }

            return GetDrawableCompatKt.getDrawableCompat(var2, var1);
         }
      });
      this.buttonContainerActiveDrawable$delegate = eh.l.b(<unrepresentable>.INSTANCE);
      this.scaleAnimator$delegate = eh.l.b(
         new Function0<ValueAnimator>(var2, this) {
            final AudioPlayerViewBinding $binding;
            final AudioPlayerWipeAnimatorManager this$0;

            {
               super(0);
               this.$binding = var1;
               this.this$0 = var2;
            }

            private static final void invoke$lambda$1$lambda$0(AudioPlayerViewBinding var0, AudioPlayerWipeAnimatorManager var1, ValueAnimator var2) {
               r.h(var0, "$binding");
               r.h(var1, "this$0");
               r.h(var2, "it");
               var var7: Drawable = (Drawable)var2.getAnimatedValue();
               r.f(var7, "null cannot be cast to non-null type kotlin.Float");
               val var4: Float = var7 as java.lang.Float;
               val var3: Float;
               if (var0.playerContainer.getWidth() > 0 && var0.wipe.getWidth() > 0) {
                  var3 = (float)var0.playerContainer.getWidth() / var0.wipe.getWidth() * 2;
               } else {
                  var3 = 0.0F;
               }

               val var5: Float = 1;
               val var10: Float = var3 * var4 + 1;
               var0.wipe.setScaleX(var3 * var4 + (float)1);
               var0.wipe.setScaleY(var10);
               var7 = AudioPlayerWipeAnimatorManager.access$getButtonContainerDefaultDrawable(var1);
               if (var7 != null) {
                  var7.setAlpha((int)((var5 - var4) * (float)255));
               }

               AudioPlayerWipeAnimatorManager.access$getButtonContainerActiveDrawable(var1).setAlpha((int)(var4 * (float)255));
               var0.buttonContainer
                  .setBackground(
                     new LayerDrawable(
                        new Drawable[]{
                           AudioPlayerWipeAnimatorManager.access$getButtonContainerDefaultDrawable(var1),
                           AudioPlayerWipeAnimatorManager.access$getButtonContainerActiveDrawable(var1)
                        }
                     )
                  );
               val var6: View = var0.buttonContainer;
               r.g(var0.buttonContainer, "binding.buttonContainer");
               ViewClippingUtilsKt.clipToCircle(var6);
            }

            public final ValueAnimator invoke() {
               val var1: ValueAnimator = ValueAnimator.ofFloat(new float[]{0.0F, 1.0F});
               var1.addUpdateListener(new o(this.$binding, this.this$0));
               return var1;
            }
         }
      );
      this.textColorAnimator$delegate = eh.l.b(new Function0<ValueAnimator>(var2) {
         final AudioPlayerViewBinding $binding;

         {
            super(0);
            this.$binding = var1;
         }

         private static final void invoke$lambda$1$lambda$0(AudioPlayerViewBinding var0, ValueAnimator var1) {
            r.h(var0, "$binding");
            r.h(var1, "it");
            val var2: SimpleDraweeSpanTextView = var0.text;
            val var3: Any = var1.getAnimatedValue();
            r.f(var3, "null cannot be cast to non-null type kotlin.Int");
            var2.setTextColor(var3 as Integer);
         }

         public final ValueAnimator invoke() {
            val var1: ValueAnimator = ValueAnimator.ofArgb(new int[]{ThemeManagerKt.getTheme().getInteractiveNormal(), -1});
            var1.addUpdateListener(new p(this.$binding));
            return var1;
         }
      });
      this.buttonIconColorAnimator$delegate = eh.l.b(new Function0<ValueAnimator>(var2) {
         final AudioPlayerViewBinding $binding;

         {
            super(0);
            this.$binding = var1;
         }

         private static final void invoke$lambda$1$lambda$0(AudioPlayerViewBinding var0, ValueAnimator var1) {
            r.h(var0, "$binding");
            r.h(var1, "it");
            val var2: SimpleDraweeView = var0.button;
            r.g(var0.button, "binding.button");
            val var3: Any = var1.getAnimatedValue();
            r.f(var3, "null cannot be cast to non-null type kotlin.Int");
            ColorUtilsKt.setTintColor(var2, var3 as Integer);
         }

         public final ValueAnimator invoke() {
            val var1: ValueAnimator = ValueAnimator.ofArgb(new int[]{-1, -16777216});
            var1.addUpdateListener(new m(this.$binding));
            return var1;
         }
      });
      this.progressColorAnimator$delegate = eh.l.b(new Function0<ValueAnimator>(var2) {
         final AudioPlayerViewBinding $binding;

         {
            super(0);
            this.$binding = var1;
         }

         private static final void invoke$lambda$1$lambda$0(AudioPlayerViewBinding var0, ValueAnimator var1) {
            r.h(var0, "$binding");
            r.h(var1, "it");
            val var2: AudioWaveView = var0.wave;
            val var3: Any = var1.getAnimatedValue();
            r.f(var3, "null cannot be cast to non-null type kotlin.Int");
            var2.setAudioProgressPaintColor(var3 as Integer);
         }

         public final ValueAnimator invoke() {
            val var1: ValueAnimator = ValueAnimator.ofArgb(new int[]{-1, ThemeManagerKt.getTheme().getInteractiveActive()});
            var1.addUpdateListener(new n(this.$binding));
            return var1;
         }
      });
   }

   private fun getAnimatorSet(animateToPlay: Boolean, currentPlayTime: Long, shouldAnimate: Boolean): AnimatorSet {
      val var7: AnimatorSet = new AnimatorSet();
      var7.playTogether(
         new Animator[]{
            this.getScaleAnimator(var1), this.getTextColorAnimator(var1), this.getButtonIconColorAnimator(var1), this.getProgressColorAnimator(var1)
         }
      );
      val var5: Long;
      if (var4) {
         var5 = 200L;
      } else {
         var5 = 0L;
      }

      var7.setDuration(var5);
      if (VERSION.SDK_INT >= 26) {
         k.a(var7, var2);
      }

      var7.addListener(new AnimatorListener(this) {
         final AudioPlayerWipeAnimatorManager this$0;

         {
            this.this$0 = var1;
         }

         public void onAnimationCancel(Animator var1) {
         }

         public void onAnimationEnd(Animator var1) {
            AudioPlayerWipeAnimatorManager.access$setAnimatorSet$p(this.this$0, null);
         }

         public void onAnimationRepeat(Animator var1) {
         }

         public void onAnimationStart(Animator var1) {
         }
      });
      return var7;
   }

   private fun getButtonIconColorAnimator(shouldPlay: Boolean): ValueAnimator {
      val var2: ValueAnimator = this.getButtonIconColorAnimator();
      if (var1) {
         var2.setIntValues(new int[]{-1, this.brand500});
      } else {
         var2.setIntValues(new int[]{this.brand500, -1});
      }

      var2.setEvaluator(this.argbEvaluator);
      return var2;
   }

   private fun getProgressColorAnimator(shouldPlay: Boolean): ValueAnimator {
      val var2: ValueAnimator = this.getProgressColorAnimator();
      if (var1) {
         var2.setIntValues(new int[]{ThemeManagerKt.getTheme().getInteractiveActive(), -1});
      } else {
         var2.setIntValues(new int[]{-1, ThemeManagerKt.getTheme().getInteractiveActive()});
      }

      var2.setEvaluator(this.argbEvaluator);
      return var2;
   }

   private fun getScaleAnimator(shouldPlay: Boolean): ValueAnimator {
      val var2: ValueAnimator = this.getScaleAnimator();
      if (var1) {
         var2.setFloatValues(new float[]{0.0F, 1.0F});
      } else {
         var2.setFloatValues(new float[]{1.0F, 0.0F});
      }

      return var2;
   }

   private fun getTextColorAnimator(shouldPlay: Boolean): ValueAnimator {
      val var2: ValueAnimator = this.getTextColorAnimator();
      if (var1) {
         var2.setIntValues(new int[]{ThemeManagerKt.getTheme().getInteractiveNormal(), -1});
      } else {
         var2.setIntValues(new int[]{-1, ThemeManagerKt.getTheme().getInteractiveNormal()});
      }

      var2.setEvaluator(this.argbEvaluator);
      return var2;
   }

   public fun startAnimator(animateToPlay: Boolean, shouldAnimate: Boolean) {
      var var9: Long = 0L;
      if (var2) {
         if (this.animateToPlay == var1) {
            return;
         }

         var9 = 0L;
         if (this.animateToPlay != var1) {
            var9 = 0L;
            if (this.animatorSet != null) {
               var var5: Long = 0L;
               if (VERSION.SDK_INT >= 26) {
                  if (this.animatorSet != null) {
                     var5 = this.animatorSet.getDuration();
                  } else {
                     var5 = 0L;
                  }

                  if (this.animatorSet != null) {
                     var9 = l.a(this.animatorSet);
                  } else {
                     var9 = 0L;
                  }

                  var var17: java.lang.Long = var5 - var9;
                  var5 = var17.longValue();
                  var var3: Boolean = false;
                  if (0L <= var5) {
                     var3 = false;
                     if (var5 < 201L) {
                        var3 = true;
                     }
                  }

                  if (!var3) {
                     var17 = null;
                  }

                  var5 = 0L;
                  if (var17 != null) {
                     var5 = var17;
                  }
               }

               var9 = var5;
               if (this.animatorSet != null) {
                  this.animatorSet.cancel();
                  var9 = var5;
               }
            }
         }
      }

      this.animateToPlay = var1;
      val var19: AnimatorSet = this.getAnimatorSet(var1, var9, var2);
      var19.start();
      this.animatorSet = var19;
   }

   public companion object {
      private const val WASH_ANIMATION_MS: Long
   }
}
