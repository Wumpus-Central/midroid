package com.discord.chat.presentation.list

import android.animation.Animator
import android.animation.ValueAnimator
import android.animation.Animator.AnimatorListener
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

@JvmSynthetic
fun a(var0: View, var1: ValueAnimator) {
   animateHighlightBackgroundColor$anim$4$lambda$3$lambda$2(var0, var1);
}

private fun View.animateBackgroundColor(delay: Long, startColor: Int, endColor: Int) {
   animateBackgroundColor$anim(
      var1,
      var0,
      var3,
      var4,
      new Function1<Animator, Unit>(var4, var3, var1, var0) {
         final long $delay;
         final int $endColor;
         final int $startColor;
         final View $this_animateBackgroundColor;

         {
            super(1);
            this.$endColor = var1;
            this.$startColor = var2;
            this.$delay = var3;
            this.$this_animateBackgroundColor = var5;
         }

         public final void invoke(Animator var1) {
            r.h(var1, "it");
            ChatListHighlightItemAtPositionKt.animateBackgroundColor$anim$default(
               this.$delay, this.$this_animateBackgroundColor, this.$endColor, this.$startColor, null, 16, null
            );
         }
      }
   );
}

fun `animateBackgroundColor$anim`(var0: Long, var2: View, var3: Int, var4: Int, var5: (Animator?) -> Unit) {
   val var6: ValueAnimator = ValueAnimator.ofArgb(new int[]{var3, var4});
   var6.addUpdateListener(new a(var2));
   r.g(var6, "animator");
   var6.addListener(new AnimatorListener(var5) {
      final Function1 $onEnd;

      {
         this.$onEnd = var1;
      }

      public void onAnimationCancel(Animator var1) {
      }

      public void onAnimationEnd(Animator var1) {
         this.$onEnd.invoke(var1);
      }

      public void onAnimationRepeat(Animator var1) {
      }

      public void onAnimationStart(Animator var1) {
      }
   });
   var6.setStartDelay(var0 + (long)100);
   var6.setDuration(600L);
   var6.start();
}

@JvmSynthetic
fun `animateBackgroundColor$anim$default`(var0: Long, var2: View, var3: Int, var4: Int, var5: Function1, var6: Int, var7: Any) {
   if ((var6 and 16) != 0) {
      var5 = <unrepresentable>.INSTANCE;
   }

   animateBackgroundColor$anim(var0, var2, var3, var4, (Function1<? super Animator, Unit>)var5);
}

fun `animateBackgroundColor$anim$lambda$1$lambda$0`(var0: View, var1: ValueAnimator) {
   r.h(var0, "$this_animateBackgroundColor");
   r.h(var1, "valueAnimator");
   val var2: Any = var1.getAnimatedValue();
   r.f(var2, "null cannot be cast to non-null type kotlin.Int");
   var0.setBackgroundColor(var2 as Integer);
}

private fun View.animateHighlightBackgroundColor(delay: Long, startColor: Int, fullColor: Int, endColor: Int) {
   animateHighlightBackgroundColor$anim$4(var1, var0, var3, var4, var5);
}

fun `animateHighlightBackgroundColor$anim$4`(var0: Long, var2: View, var3: Int, var4: Int, var5: Int) {
   val var6: ValueAnimator = ValueAnimator.ofArgb(new int[]{var3, var4, var4, var5});
   var6.addUpdateListener(new b(var2));
   var6.setStartDelay(var0 + (long)100);
   var6.setDuration(1000L);
   var6.start();
}

fun `animateHighlightBackgroundColor$anim$4$lambda$3$lambda$2`(var0: View, var1: ValueAnimator) {
   r.h(var0, "$this_animateHighlightBackgroundColor");
   r.h(var1, "valueAnimator");
   val var2: Any = var1.getAnimatedValue();
   r.f(var2, "null cannot be cast to non-null type kotlin.Int");
   var0.setBackgroundColor(var2 as Integer);
}

@JvmSynthetic
fun b(var0: View, var1: ValueAnimator) {
   animateBackgroundColor$anim$lambda$1$lambda$0(var0, var1);
}

internal fun RecyclerView.chatListEmphasizeHighlightItemAtPosition(position: Int, delayMilliseconds: Long = 300L) {
   r.h(var0, "<this>");
   val var4: LayoutManager = var0.getLayoutManager();
   if (var4 != null) {
      val var8: View = var4.findViewByPosition(var1);
      if (var8 != null) {
         val var5: Context = var0.getContext();
         r.g(var5, "context");
         var1 = ColorUtilsKt.getColorCompat(var5, 17170445);
         val var6: Context = var0.getContext();
         r.g(var6, "context");
         animateHighlightBackgroundColor(
            var8,
            var2,
            var1,
            ColorUtilsKt.getColorCompat(var6, ThemeManagerKt.getTheme().getColorRes(color.brand_new_360_alpha_20, color.brand_new_360_alpha_25)),
            ThemeManagerKt.getTheme().getBackgroundMessageHighlight()
         );
      }
   }
}

@JvmSynthetic
fun `chatListEmphasizeHighlightItemAtPosition$default`(var0: RecyclerView, var1: Int, var2: Long, var4: Int, var5: Any) {
   if ((var4 and 2) != 0) {
      var2 = 300L;
   }

   chatListEmphasizeHighlightItemAtPosition(var0, var1, var2);
}

internal fun RecyclerView.chatListHighlightItemAtPosition(position: Int, delayMilliseconds: Long = 300L) {
   r.h(var0, "<this>");
   val var4: LayoutManager = var0.getLayoutManager();
   if (var4 != null) {
      val var6: View = var4.findViewByPosition(var1);
      if (var6 != null) {
         val var5: Context = var0.getContext();
         r.g(var5, "context");
         animateBackgroundColor(var6, var2, ColorUtilsKt.getColorCompat(var5, 17170445), ThemeManagerKt.getTheme().getBackgroundModifierSelected());
      }
   }
}

@JvmSynthetic
fun `chatListHighlightItemAtPosition$default`(var0: RecyclerView, var1: Int, var2: Long, var4: Int, var5: Any) {
   if ((var4 and 2) != 0) {
      var2 = 300L;
   }

   chatListHighlightItemAtPosition(var0, var1, var2);
}
