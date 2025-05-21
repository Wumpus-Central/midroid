package com.discord.chat.presentation.list

import android.animation.Animator
import android.animation.ValueAnimator
import android.animation.Animator.AnimatorListener
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.functions.Function1

@JvmSynthetic
fun a(var0: View, var1: ValueAnimator) {
   animateBackgroundColor$anim$lambda$2$lambda$1(var0, var1);
}

private fun View.animateBackgroundColor(delay: Long, startColor: Int, endColor: Int) {
   animateBackgroundColor$anim(var1, var0, var3, var4, new d(var4, var3, var1, var0));
}

fun `animateBackgroundColor$anim`(var0: Long, var2: View, var3: Int, var4: Int, var5: Function1) {
   val var6: ValueAnimator = ValueAnimator.ofArgb(new int[]{var3, var4});
   var6.addUpdateListener(new f(var2));
   kotlin.jvm.internal.q.e(var6);
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
      var5 = new e();
   }

   animateBackgroundColor$anim(var0, var2, var3, var4, (Function1)var5);
}

fun `animateBackgroundColor$anim$lambda$0`(var0: Animator): Unit {
   kotlin.jvm.internal.q.h(var0, "it");
   return Unit.a;
}

fun `animateBackgroundColor$anim$lambda$2$lambda$1`(var0: View, var1: ValueAnimator) {
   kotlin.jvm.internal.q.h(var1, "valueAnimator");
   val var2: Any = var1.getAnimatedValue();
   kotlin.jvm.internal.q.f(var2, "null cannot be cast to non-null type kotlin.Int");
   var0.setBackgroundColor(var2 as Int);
}

fun `animateBackgroundColor$lambda$3`(var0: Int, var1: Int, var2: Long, var4: View, var5: Animator): Unit {
   kotlin.jvm.internal.q.h(var5, "it");
   animateBackgroundColor$anim$default(var2, var4, var0, var1, null, 16, null);
   return Unit.a;
}

@JvmSynthetic
fun b(var0: Animator): Unit {
   return animateBackgroundColor$anim$lambda$0(var0);
}

@JvmSynthetic
fun c(var0: Int, var1: Int, var2: Long, var4: View, var5: Animator): Unit {
   return animateBackgroundColor$lambda$3(var0, var1, var2, var4, var5);
}

internal fun RecyclerView.chatListHighlightItemAtPosition(position: Int, delayMilliseconds: Long = 300L) {
   kotlin.jvm.internal.q.h(var0, "<this>");
   val var4: RecyclerView.LayoutManager = var0.getLayoutManager();
   if (var4 != null) {
      val var6: View = var4.findViewByPosition(var1);
      if (var6 != null) {
         val var5: Context = var0.getContext();
         kotlin.jvm.internal.q.g(var5, "getContext(...)");
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
