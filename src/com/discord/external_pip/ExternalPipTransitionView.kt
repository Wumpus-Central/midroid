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
import kotlin.jvm.internal.q

public class ExternalPipTransitionView(context: Context) : View {
   init {
      q.h(var1, "context");
      super(var1);
      this.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
      this.setTag(transitionViewTag);
      this.setLayoutParams(new LayoutParams(-1, -1));
   }

   private fun fadeOut(
      animDelay: Long = (long)var0.getResources().getInteger(17694720),
      animDuration: Long = (long)var0.getResources().getInteger(17694721),
      onComplete: () -> Unit
   ): Boolean {
      return this.postDelayed(new g(this, var3, var5), var1);
   }

   @JvmStatic
   fun `fadeOut$lambda$0`(var0: ExternalPipTransitionView, var1: Long, var3: Function0) {
      q.h(var0, "this$0");
      q.h(var3, "$onComplete");
      var0.animate().alpha(0.0F).setDuration(var1).setListener(new AnimatorListenerAdapter(var3) {
         final Function0 $onComplete;

         {
            this.$onComplete = var1;
         }

         public void onAnimationEnd(Animator var1) {
            q.h(var1, "animation");
            this.$onComplete.invoke();
         }
      });
   }

   public companion object {
      private final val transitionViewTag: String

      public fun tryHide(activity: Activity?, animate: Boolean) {
         var var3: ViewGroup = null;
         val var4: View;
         if (var1 != null) {
            var4 = ActivityExtensionsKt.getRootView(var1);
         } else {
            var4 = null;
         }

         if (var4 is ViewGroup) {
            var3 = var4 as ViewGroup;
         }

         if (var3 != null) {
            val var5: ExternalPipTransitionView = var3.findViewWithTag(ExternalPipTransitionView.access$getTransitionViewTag$cp()) as ExternalPipTransitionView;
            if (var5 != null) {
               if (var2) {
                  ExternalPipTransitionView.fadeOut$default(var5, 0L, 0L, new Function0(var3, var5) {
                     final ExternalPipTransitionView $transitionView;
                     final ViewGroup $viewRoot;

                     {
                        super(0);
                        this.$viewRoot = var1;
                        this.$transitionView = var2;
                     }

                     public final void invoke() {
                        this.$viewRoot.removeView(this.$transitionView);
                     }
                  }, 3, null);
               } else {
                  var3.removeView(var5);
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
            q.g(var5, "getContext(...)");
            var4.addView(new ExternalPipTransitionView(var5));
         }
      }
   }
}
