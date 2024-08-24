package com.discord.mobile_voice_overlay.views

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.content.Context
import android.content.res.Configuration
import android.util.AttributeSet
import android.view.View
import android.view.View.OnAttachStateChangeListener
import android.view.WindowManager.LayoutParams
import androidx.core.view.f1
import com.discord.mobile_voice_overlay.utils.WindowUtils
import kotlin.jvm.internal.r

public abstract class OverlayDialog : OverlayBubbleWrap {
   public open var isMoving: Boolean
      public open get() {
         return false;
      }

      public open set(<anonymous parameter 0>) {
      }


   public final var onDialogClosed: (OverlayDialog) -> Unit
      internal set

   open fun OverlayDialog(var1: Context) {
      r.h(var1, "context");
      super(var1);
      this.onDialogClosed = <unrepresentable>.INSTANCE;
      this.setOnClickListener(new a(this));
      val var2: LayoutParams = this.getWindowLayoutParams();
      var2.width = -1;
      var2.height = -1;
      var2.x = 0;
      var2.y = 0;
      WindowUtils.INSTANCE.addFlag(var2, 2);
      var2.dimAmount = 0.5F;
      this.setStateListAnimator(null);
   }

   open fun OverlayDialog(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      super(var1, var2);
      this.onDialogClosed = <unrepresentable>.INSTANCE;
      this.setOnClickListener(new a(this));
      val var3: LayoutParams = this.getWindowLayoutParams();
      var3.width = -1;
      var3.height = -1;
      var3.x = 0;
      var3.y = 0;
      WindowUtils.INSTANCE.addFlag(var3, 2);
      var3.dimAmount = 0.5F;
      this.setStateListAnimator(null);
   }

   open fun OverlayDialog(var1: Context, var2: AttributeSet, var3: Int) {
      r.h(var1, "context");
      super(var1, var2, var3);
      this.onDialogClosed = <unrepresentable>.INSTANCE;
      this.setOnClickListener(new a(this));
      val var4: LayoutParams = this.getWindowLayoutParams();
      var4.width = -1;
      var4.height = -1;
      var4.x = 0;
      var4.y = 0;
      WindowUtils.INSTANCE.addFlag(var4, 2);
      var4.dimAmount = 0.5F;
      this.setStateListAnimator(null);
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: OverlayDialog, var1: View) {
      r.h(var0, "this$0");
      var0.closeDialog();
   }

   public fun closeDialog() {
      if (!f1.T(this)) {
         this.onDialogClosed.invoke(this);
      } else {
         val var1: Animator = this.getClosingAnimator();
         var1.addListener(new AnimatorListener(this) {
            final OverlayDialog this$0;

            {
               this.this$0 = var1;
            }

            public void onAnimationCancel(Animator var1) {
            }

            public void onAnimationEnd(Animator var1) {
               this.this$0.getOnDialogClosed().invoke(this.this$0);
            }

            public void onAnimationRepeat(Animator var1) {
            }

            public void onAnimationStart(Animator var1) {
            }
         });
         var1.start();
         this.addOnAttachStateChangeListener(new OnAttachStateChangeListener(var1) {
            final Animator $closingAnimator;

            {
               this.$closingAnimator = var1;
            }

            public void onViewAttachedToWindow(View var1) {
               r.h(var1, "v");
            }

            public void onViewDetachedFromWindow(View var1) {
               r.h(var1, "v");
               this.$closingAnimator.end();
            }
         });
      }
   }

   public abstract fun getClosingAnimator(): Animator {
   }

   protected override fun onConfigurationChanged(newConfig: Configuration?) {
      super.onConfigurationChanged(var1);
      this.getWindowLayoutParams().x = 0;
      this.getWindowLayoutParams().y = 0;
      this.updateViewLayout();
   }
}
