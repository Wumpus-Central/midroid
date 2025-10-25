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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nAudioPlayerWipeAnimatorManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioPlayerWipeAnimatorManager.kt\ncom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 4 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,184:1\n1#2:185\n85#3,18:186\n27#4:204\n*S KotlinDebug\n*F\n+ 1 AudioPlayerWipeAnimatorManager.kt\ncom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager\n*L\n177#1:186,18\n38#1:204\n*E\n"])
public class AudioPlayerWipeAnimatorManager(context: Context, binding: AudioPlayerViewBinding) {
   private final val brand500: Int
   private final val argbEvaluator: ArgbEvaluator

   private final val buttonContainerDefaultDrawable: Drawable?
      private final get() {
         return this.buttonContainerDefaultDrawable$delegate.getValue() as Drawable;
      }


   private final val buttonContainerActiveDrawable: ColorDrawable
      private final get() {
         return this.buttonContainerActiveDrawable$delegate.getValue() as ColorDrawable;
      }


   private final val scaleAnimator: ValueAnimator
      private final get() {
         return this.scaleAnimator$delegate.getValue() as ValueAnimator;
      }


   private final val textColorAnimator: ValueAnimator
      private final get() {
         return this.textColorAnimator$delegate.getValue() as ValueAnimator;
      }


   private final val buttonIconColorAnimator: ValueAnimator
      private final get() {
         return this.buttonIconColorAnimator$delegate.getValue() as ValueAnimator;
      }


   private final val progressColorAnimator: ValueAnimator
      private final get() {
         return this.progressColorAnimator$delegate.getValue() as ValueAnimator;
      }


   private final var animateToPlay: Boolean
   private final var animatorSet: AnimatorSet?

   init {
      this.brand500 = var1.getColor(color.brand_500);
      this.argbEvaluator = new ArgbEvaluator();
      this.buttonContainerDefaultDrawable$delegate = xa.l.a(new D(var1));
      this.buttonContainerActiveDrawable$delegate = xa.l.a(new E());
      this.scaleAnimator$delegate = xa.l.a(new F(var2, this));
      this.textColorAnimator$delegate = xa.l.a(new G(var2));
      this.buttonIconColorAnimator$delegate = xa.l.a(new H(var2));
      this.progressColorAnimator$delegate = xa.l.a(new I(var2));
   }

   @JvmStatic
   fun `buttonContainerActiveDrawable_delegate$lambda$2`(): ColorDrawable {
      val var0: ColorDrawable = new ColorDrawable(-1);
      var0.setAlpha(0);
      return var0;
   }

   @JvmStatic
   fun `buttonContainerDefaultDrawable_delegate$lambda$0`(var0: Context): Drawable {
      val var1: Int;
      if (ThemeManager.INSTANCE.isThemeLight()) {
         var1 = R.drawable.drawable_audio_play_button_gradient_light;
      } else {
         var1 = R.drawable.drawable_audio_play_button_gradient_dark;
      }

      return GetDrawableCompatKt.getDrawableCompat(var0, var1);
   }

   @JvmStatic
   fun `buttonIconColorAnimator_delegate$lambda$13`(var0: AudioPlayerViewBinding): ValueAnimator {
      val var1: ValueAnimator = ValueAnimator.ofArgb(new int[]{-1, -16777216});
      var1.addUpdateListener(new z(var0));
      return var1;
   }

   @JvmStatic
   fun `buttonIconColorAnimator_delegate$lambda$13$lambda$12$lambda$11`(var0: AudioPlayerViewBinding, var1: ValueAnimator) {
      val var2: SimpleDraweeView = var0.button;
      val var3: Any = var1.getAnimatedValue();
      ColorUtilsKt.setTintColor(var2, var3 as Int);
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
         x.a(var7, var2);
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

   @JvmStatic
   fun `progressColorAnimator_delegate$lambda$17`(var0: AudioPlayerViewBinding): ValueAnimator {
      val var1: ValueAnimator = ValueAnimator.ofArgb(new int[]{-1, ThemeManagerKt.getTheme().getInteractiveActive()});
      var1.addUpdateListener(new C(var0));
      return var1;
   }

   @JvmStatic
   fun `progressColorAnimator_delegate$lambda$17$lambda$16$lambda$15`(var0: AudioPlayerViewBinding, var1: ValueAnimator) {
      val var2: AudioWaveView = var0.wave;
      val var3: Any = var1.getAnimatedValue();
      var2.setAudioProgressPaintColor(var3 as Int);
   }

   @JvmStatic
   fun `scaleAnimator_delegate$lambda$5`(var0: AudioPlayerViewBinding, var1: AudioPlayerWipeAnimatorManager): ValueAnimator {
      val var2: ValueAnimator = ValueAnimator.ofFloat(new float[]{0.0F, 1.0F});
      var2.addUpdateListener(new B(var0, var1));
      return var2;
   }

   @JvmStatic
   fun `scaleAnimator_delegate$lambda$5$lambda$4$lambda$3`(var0: AudioPlayerViewBinding, var1: AudioPlayerWipeAnimatorManager, var2: ValueAnimator) {
      var var7: Drawable = (Drawable)var2.getAnimatedValue();
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
      var7 = var1.getButtonContainerDefaultDrawable();
      if (var7 != null) {
         var7.setAlpha((int)((var5 - var4) * (float)255));
      }

      var1.getButtonContainerActiveDrawable().setAlpha((int)(var4 * (float)255));
      var0.buttonContainer.setBackground(new LayerDrawable(new Drawable[]{var1.getButtonContainerDefaultDrawable(), var1.getButtonContainerActiveDrawable()}));
      val var6: View = var0.buttonContainer;
      ViewClippingUtilsKt.clipToCircle(var6);
   }

   @JvmStatic
   fun `textColorAnimator_delegate$lambda$9`(var0: AudioPlayerViewBinding): ValueAnimator {
      val var1: ValueAnimator = ValueAnimator.ofArgb(new int[]{ThemeManagerKt.getTheme().getInteractiveNormal(), -1});
      var1.addUpdateListener(new A(var0));
      return var1;
   }

   @JvmStatic
   fun `textColorAnimator_delegate$lambda$9$lambda$8$lambda$7`(var0: AudioPlayerViewBinding, var1: ValueAnimator) {
      val var2: SimpleDraweeSpanTextView = var0.text;
      val var3: Any = var1.getAnimatedValue();
      var2.setTextColor(var3 as Int);
   }

   public fun startAnimator(animateToPlay: Boolean, shouldAnimate: Boolean) {
      var var7: Long = 0L;
      if (var2) {
         if (this.animateToPlay == var1) {
            return;
         }

         var7 = 0L;
         if (this.animateToPlay != var1) {
            var7 = 0L;
            if (this.animatorSet != null) {
               var var3: Long = 0L;
               if (VERSION.SDK_INT >= 26) {
                  if (this.animatorSet != null) {
                     var3 = this.animatorSet.getDuration();
                  } else {
                     var3 = 0L;
                  }

                  if (this.animatorSet != null) {
                     var7 = y.a(this.animatorSet);
                  } else {
                     var7 = 0L;
                  }

                  var var15: java.lang.Long = var3 - var7;
                  var3 = var15.longValue();
                  if (0L > var3 || var3 >= 201L) {
                     var15 = null;
                  }

                  var3 = 0L;
                  if (var15 != null) {
                     var3 = var15;
                  }
               }

               var7 = var3;
               if (this.animatorSet != null) {
                  this.animatorSet.cancel();
                  var7 = var3;
               }
            }
         }
      }

      this.animateToPlay = var1;
      val var17: AnimatorSet = this.getAnimatorSet(var1, var7, var2);
      var17.start();
      this.animatorSet = var17;
   }

   public companion object {
      private const val WASH_ANIMATION_MS: Long
   }
}
