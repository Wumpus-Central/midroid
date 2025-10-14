package com.discord.external_pip

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.functions.Function0

public class ExternalPipTransitionView(context: Context) : View(var1) {
   init {
      this.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
      this.setTag(transitionViewTag);
      this.setLayoutParams(new LayoutParams(-1, -1));
   }

   private fun fadeOut(
      animDelay: Long = (long)var0.getResources().getInteger(17694720),
      animDuration: Long = (long)var0.getResources().getInteger(17694721),
      onComplete: () -> Unit
   ): Boolean {
      return this.postDelayed(new i(this, var3, var5), var1);
   }

   @JvmStatic
   fun `fadeOut$lambda$0`(var0: ExternalPipTransitionView, var1: Long, var3: Function0) {
      var0.animate().alpha(0.0F).setDuration(var1).setListener(new AnimatorListenerAdapter(var3) {
         final Function0<Unit> $onComplete;

         {
            this.$onComplete = var1;
         }

         public void onAnimationEnd(Animator var1) {
            this.$onComplete.invoke();
         }
      });
   }

   public companion object {
      private final val transitionViewTag: String

      @JvmStatic
      fun `tryHide$lambda$0`(var0: ViewGroup, var1: ExternalPipTransitionView): Unit {
         var0.removeView(var1);
         return Unit.a;
      }

      public fun tryHide(activity: Activity?, animate: Boolean) {
         val var3: View;
         if (var1 != null) {
            var3 = ActivityExtensionsKt.getRootView(var1);
         } else {
            var3 = null;
         }

         var var5: ViewGroup = null;
         if (var3 is ViewGroup) {
            var5 = var3 as ViewGroup;
         }

         if (var5 != null) {
            val var6: ExternalPipTransitionView = var5.findViewWithTag(ExternalPipTransitionView.access$getTransitionViewTag$cp()) as ExternalPipTransitionView;
            if (var6 != null) {
               if (var2) {
                  ExternalPipTransitionView.fadeOut$default(var6, 0L, 0L, new j(var5, var6), 3, null);
               } else {
                  var5.removeView(var6);
               }
            }
         }
      }

      public fun tryShow(activity: Activity?) {
         this.tryHide(var1, false);
         val var2: View;
         if (var1 != null) {
            var2 = ActivityExtensionsKt.getRootView(var1);
         } else {
            var2 = null;
         }

         var var4: ViewGroup = null;
         if (var2 is ViewGroup) {
            var4 = var2 as ViewGroup;
         }

         if (var4 != null) {
            val var5: Context = var4.getContext();
            var4.addView(new ExternalPipTransitionView(var5));
         }
      }
   }
}
