package com.discord.mobile_voice_overlay.views

import android.animation.AnimatorInflater
import android.content.Context
import android.content.res.Configuration
import android.graphics.Point
import android.graphics.Rect
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.view.View.OnLayoutChangeListener
import android.view.WindowManager.LayoutParams
import androidx.core.view.r0
import androidx.dynamicanimation.animation.SpringAnimation
import com.discord.mobile_voice_overlay.R
import com.discord.mobile_voice_overlay.utils.WindowUtils
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import kotlin.reflect.KProperty

public abstract class OverlayBubbleWrap : OverlayView {
   protected final var windowLayoutParams: LayoutParams
   internal final var touchDispatchSideEffectHandler: (MotionEvent) -> Unit
   public final val insetMargins: Rect
   private final val moveThresholdPx: Int

   public open var isMoving: Boolean
      public open get() {
         return this.isMoving$delegate.getValue(this, $$delegatedProperties[0]) as java.lang.Boolean;
      }

      public open set(<set-?>) {
         this.isMoving$delegate.setValue(this, $$delegatedProperties[0], var1);
      }


   public final var onMovingStateChanged: ((Boolean) -> Unit)?
   private final val screenOffset: IntArray
   private final var deltaX: Int
   private final var deltaY: Int
   protected final val springAnimationX: SpringAnimation
   protected final val springAnimationY: SpringAnimation
   private final var actualPosition: Point
   private final var anchorPosition: Point?

   public final val centerX: Int
      public final get() {
         return this.windowLayoutParams.x + this.getWidth() / 2;
      }


   public final val centerY: Int
      public final get() {
         return this.windowLayoutParams.y + this.getHeight() / 2;
      }


   open fun OverlayBubbleWrap(var1: Context) {
      q.h(var1, "context");
      super(var1);
      val var2: LayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
      var2.gravity = 51;
      this.windowLayoutParams = var2;
      this.touchDispatchSideEffectHandler = <unrepresentable>.INSTANCE;
      this.insetMargins = new Rect();
      this.moveThresholdPx = this.getResources().getDimensionPixelOffset(R.dimen.movement_threshold_dp);
      this.setStateListAnimator(AnimatorInflater.loadStateListAnimator(this.getContext(), R.drawable.bubble_state_selector));
      val var3: kotlin.properties.a = kotlin.properties.a.a;
      this.isMoving$delegate = new kotlin.properties.c(java.lang.Boolean.FALSE, this) {
         final OverlayBubbleWrap this$0;

         {
            super(var1);
            this.this$0 = var2;
         }

         protected void afterChange(KProperty var1, java.lang.Boolean var2, java.lang.Boolean var3) {
            q.h(var1, "property");
            val var4: Boolean = var3 as java.lang.Boolean;
            if (var2 as java.lang.Boolean != var4) {
               val var5: Function1 = this.this$0.getOnMovingStateChanged();
               if (var5 != null) {
                  var5.invoke(var4);
               }

               if (var4) {
                  this.this$0.performHapticFeedback(1);
                  this.this$0.getSpringAnimationX().b();
                  this.this$0.getSpringAnimationY().b();
               }

               this.this$0.setPressed(var4);
            }
         }
      };
      this.screenOffset = new int[2];
      val var4: SpringAnimation = new SpringAnimation(this, androidx.dynamicanimation.animation.b.u, 0.0F);
      var4.j(50.0F);
      var4.p().f(200.0F);
      var4.p().d(0.75F);
      this.springAnimationX = var4;
      val var5: SpringAnimation = new SpringAnimation(this, androidx.dynamicanimation.animation.b.v, 0.0F);
      var5.j(50.0F);
      var5.p().d(0.75F);
      var5.p().f(200.0F);
      this.springAnimationY = var5;
      this.actualPosition = new Point(this.windowLayoutParams.x, this.windowLayoutParams.y);
   }

   open fun OverlayBubbleWrap(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      super(var1, var2);
      val var3: LayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
      var3.gravity = 51;
      this.windowLayoutParams = var3;
      this.touchDispatchSideEffectHandler = <unrepresentable>.INSTANCE;
      this.insetMargins = new Rect();
      this.moveThresholdPx = this.getResources().getDimensionPixelOffset(R.dimen.movement_threshold_dp);
      this.setStateListAnimator(AnimatorInflater.loadStateListAnimator(this.getContext(), R.drawable.bubble_state_selector));
      val var4: kotlin.properties.a = kotlin.properties.a.a;
      this.isMoving$delegate = new kotlin.properties.c(java.lang.Boolean.FALSE, this) {
         final OverlayBubbleWrap this$0;

         {
            super(var1);
            this.this$0 = var2;
         }

         protected void afterChange(KProperty var1, java.lang.Boolean var2, java.lang.Boolean var3) {
            q.h(var1, "property");
            val var4: Boolean = var3 as java.lang.Boolean;
            if (var2 as java.lang.Boolean != var4) {
               val var5: Function1 = this.this$0.getOnMovingStateChanged();
               if (var5 != null) {
                  var5.invoke(var4);
               }

               if (var4) {
                  this.this$0.performHapticFeedback(1);
                  this.this$0.getSpringAnimationX().b();
                  this.this$0.getSpringAnimationY().b();
               }

               this.this$0.setPressed(var4);
            }
         }
      };
      this.screenOffset = new int[2];
      val var5: SpringAnimation = new SpringAnimation(this, androidx.dynamicanimation.animation.b.u, 0.0F);
      var5.j(50.0F);
      var5.p().f(200.0F);
      var5.p().d(0.75F);
      this.springAnimationX = var5;
      val var6: SpringAnimation = new SpringAnimation(this, androidx.dynamicanimation.animation.b.v, 0.0F);
      var6.j(50.0F);
      var6.p().d(0.75F);
      var6.p().f(200.0F);
      this.springAnimationY = var6;
      this.actualPosition = new Point(this.windowLayoutParams.x, this.windowLayoutParams.y);
   }

   open fun OverlayBubbleWrap(var1: Context, var2: AttributeSet, var3: Int) {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var4: LayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
      var4.gravity = 51;
      this.windowLayoutParams = var4;
      this.touchDispatchSideEffectHandler = <unrepresentable>.INSTANCE;
      this.insetMargins = new Rect();
      this.moveThresholdPx = this.getResources().getDimensionPixelOffset(R.dimen.movement_threshold_dp);
      this.setStateListAnimator(AnimatorInflater.loadStateListAnimator(this.getContext(), R.drawable.bubble_state_selector));
      val var5: kotlin.properties.a = kotlin.properties.a.a;
      this.isMoving$delegate = new kotlin.properties.c(java.lang.Boolean.FALSE, this) {
         final OverlayBubbleWrap this$0;

         {
            super(var1);
            this.this$0 = var2;
         }

         protected void afterChange(KProperty var1, java.lang.Boolean var2, java.lang.Boolean var3) {
            q.h(var1, "property");
            val var4: Boolean = var3 as java.lang.Boolean;
            if (var2 as java.lang.Boolean != var4) {
               val var5: Function1 = this.this$0.getOnMovingStateChanged();
               if (var5 != null) {
                  var5.invoke(var4);
               }

               if (var4) {
                  this.this$0.performHapticFeedback(1);
                  this.this$0.getSpringAnimationX().b();
                  this.this$0.getSpringAnimationY().b();
               }

               this.this$0.setPressed(var4);
            }
         }
      };
      this.screenOffset = new int[2];
      val var6: SpringAnimation = new SpringAnimation(this, androidx.dynamicanimation.animation.b.u, 0.0F);
      var6.j(50.0F);
      var6.p().f(200.0F);
      var6.p().d(0.75F);
      this.springAnimationX = var6;
      val var7: SpringAnimation = new SpringAnimation(this, androidx.dynamicanimation.animation.b.v, 0.0F);
      var7.j(50.0F);
      var7.p().d(0.75F);
      var7.p().f(200.0F);
      this.springAnimationY = var7;
      this.actualPosition = new Point(this.windowLayoutParams.x, this.windowLayoutParams.y);
   }

   private fun SpringAnimation.animateTo(fromPosition: Float, toPosition: Float) {
      var1.b();
      var1.i(var2);
      var1.n(var3);
   }

   private inline fun boundAllowedArea(minValue: Int, desiredValue: Int, maxValue: Int): Int {
      return Math.min(Math.max(var1, var2), var3);
   }

   private fun computeScreenOffset() {
      this.getLocationOnScreen(this.screenOffset);
      this.screenOffset[0] = this.screenOffset[0] - this.windowLayoutParams.x;
      this.screenOffset[1] = this.screenOffset[1] - this.windowLayoutParams.y;
   }

   private fun setAnchorAround(centerX: Int, centerY: Int): Point {
      val var3: Point = new Point(var1 - this.getWidth() / 2, var2 - this.getHeight() / 2);
      this.setAnchorAt(var3);
      return var3;
   }

   private fun setAnchorAt(newAnchorPoint: Point) {
      this.actualPosition.x = (int)this.getX();
      this.actualPosition.y = (int)this.getY();
      this.anchorPosition = var1;
   }

   public open fun anchorOff(animate: Boolean = false) {
      this.anchorPosition = null;
      this.springAnimationX.b();
      this.springAnimationY.b();
      if (var1) {
         animateToCoordinate$default(this, this.actualPosition.x, this.actualPosition.y, null, 4, null);
      } else {
         val var4: LayoutParams = this.windowLayoutParams;
         val var3: Point = this.actualPosition;
         this.windowLayoutParams.x = this.actualPosition.x;
         var4.y = var3.y;
         this.updateViewLayout();
      }
   }

   public open fun anchorOn(targetView: View) {
      q.h(var1, "targetView");
      val var3: IntArray = WindowUtils.INSTANCE.getCenterPointOnScreen(var1, new int[2]);
      val var5: Point = this.setAnchorAround(var3[0] - this.screenOffset[0], var3[1] - this.screenOffset[1]);
      animateToCoordinate$default(this, var5.x, var5.y, null, 4, null);
   }

   public fun animateToCoordinate(dockX: Int, dockY: Int, screenBounds: Rect = var0.getContext()) {
      q.h(var3, "screenBounds");
      val var5: Int = var3.right;
      this.animateTo(this.springAnimationX, (float)this.windowLayoutParams.x, (float)Math.min(Math.max(var3.left, var1), var5 - this.getWidth()));
      val var10: Int = this.screenOffset[1];
      val var12: Int = var3.bottom;
      this.animateTo(this.springAnimationY, (float)this.windowLayoutParams.y, (float)Math.min(Math.max(var3.top - var10, var2), var12 - this.getHeight()));
   }

   public open fun dispatchTouchEvent(motionEvent: MotionEvent): Boolean {
      q.h(var1, "motionEvent");
      val var2: Int = var1.getAction();
      if (var2 != 0) {
         if (var2 != 1) {
            if (var2 == 2) {
               if (!this.isMoving()) {
                  if (Math.abs(this.deltaX + this.windowLayoutParams.x - (int)var1.getRawX()) > this.moveThresholdPx) {
                     this.setMoving(true);
                  }
               } else {
                  this.actualPosition.x = (int)var1.getRawX() - this.deltaX;
                  this.actualPosition.y = (int)var1.getRawY() - this.deltaY;
                  if (this.isAttachedToWindow() && this.anchorPosition == null) {
                     val var4: LayoutParams = this.windowLayoutParams;
                     val var3: Point = this.actualPosition;
                     this.windowLayoutParams.x = this.actualPosition.x;
                     var4.y = var3.y;
                     this.updateViewLayout();
                  }
               }
            }
         } else if (this.isMoving()) {
            this.setMoving(false);
         }
      } else {
         this.deltaX = (int)var1.getRawX() - this.windowLayoutParams.x;
         this.deltaY = (int)var1.getRawY() - this.windowLayoutParams.y;
      }

      this.touchDispatchSideEffectHandler.invoke(var1);
      return super.dispatchTouchEvent(var1);
   }

   protected fun getAllowedAreaBounds(context: Context): Rect {
      q.h(var1, "context");
      val var4: Rect = WindowUtils.INSTANCE.getScreenSize(var1);
      val var3: Rect = this.insetMargins;
      var4.left = var4.left + this.insetMargins.left;
      var4.right = var4.right - var3.right;
      var4.top = var4.top + var3.top;
      var4.bottom = var4.bottom - var3.bottom;
      return var4;
   }

   public override fun getInitialLayoutParams(): LayoutParams {
      return this.windowLayoutParams;
   }

   public open fun getX(): Float {
      return this.windowLayoutParams.x;
   }

   public open fun getY(): Float {
      return this.windowLayoutParams.y;
   }

   public fun moveToAnchorPoint(): Point? {
      var var1: Point = this.anchorPosition;
      if (this.anchorPosition != null) {
         val var2: Point = this.actualPosition;
         this.actualPosition.x = this.anchorPosition.x;
         var2.y = var1.y;
      } else {
         var1 = null;
      }

      return var1;
   }

   protected open fun onConfigurationChanged(newConfig: Configuration?) {
      super.onConfigurationChanged(var1);
      this.updateViewLayout();
      if (r0.U(this) && !this.isLayoutRequested()) {
         access$computeScreenOffset(this);
      } else {
         this.addOnLayoutChangeListener(new OnLayoutChangeListener(this) {
            final OverlayBubbleWrap this$0;

            {
               this.this$0 = var1;
            }

            public void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
               var1.removeOnLayoutChangeListener(this);
               OverlayBubbleWrap.access$computeScreenOffset(this.this$0);
            }
         });
      }
   }

   public open fun onInterceptTouchEvent(motionEvent: MotionEvent): Boolean {
      q.h(var1, "motionEvent");
      val var2: Boolean;
      if (var1.getAction() == 2) {
         var2 = this.isMoving();
      } else {
         var2 = super.onInterceptTouchEvent(var1);
      }

      return var2;
   }

   protected open fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         this.computeScreenOffset();
      }
   }

   public fun setBubbleTouchable(isTouchable: Boolean) {
      WindowUtils.INSTANCE.setFlagTouchable(this.windowLayoutParams, var1);
      this.updateViewLayout();
   }

   public open fun setX(x: Float) {
      this.windowLayoutParams.x = (int)var1;
      this.updateViewLayout();
   }

   public open fun setY(y: Float) {
      this.windowLayoutParams.y = (int)var1;
      this.updateViewLayout();
   }

   protected fun updateViewLayout() {
      if (this.isAttachedToWindow() && this.isManagedByWindow()) {
         val var1: Any = this.getContext().getSystemService("window");
         q.f(var1, "null cannot be cast to non-null type android.view.WindowManager");
         (var1 as WindowManager).updateViewLayout(this, this.windowLayoutParams);
      }
   }
}
