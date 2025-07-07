package com.discord.zoom_layout

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Matrix
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.View
import android.view.ViewGroup
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
import android.view.View.MeasureSpec
import android.view.View.OnLayoutChangeListener
import android.view.ViewGroup.LayoutParams
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt
import com.discord.zoom_layout.utils.ReactNativeScreensUtilsKt
import com.facebook.react.uimanager.MeasureSpecAssertions
import com.otaliastudios.zoom.ZoomEngine
import com.otaliastudios.zoom.ZoomLayout
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

@SuppressLint(["ViewConstructor"])
internal class ZoomLayoutFixed(context: Context, onUpdate: (ZoomLayoutFixed) -> Unit) : ZoomLayout {
   private final val pinchDetector: ScaleGestureDetector
   private final var gestureEnabled: Boolean
   private final val layoutChangeListener: OnLayoutChangeListener

   init {
      r.h(var1, "context");
      r.h(var2, "onUpdate");
      super(var1, null, 0, 6, null);
      this.pinchDetector = new ScaleGestureDetector(var1, new SimpleOnScaleGestureListener());
      this.gestureEnabled = true;
      this.layoutChangeListener = new a(this);
      this.setOverScrollHorizontal(false);
      this.setOverScrollVertical(false);
      this.setOverPinchable(false);
      this.getEngine().l(new com.otaliastudios.zoom.ZoomEngine.c(var2, this) {
         final Function1 $onUpdate;
         final ZoomLayoutFixed this$0;

         {
            this.$onUpdate = var1;
            this.this$0 = var2;
         }

         public void onIdle(ZoomEngine var1) {
            r.h(var1, "engine");
         }

         public void onUpdate(ZoomEngine var1, Matrix var2) {
            r.h(var1, "engine");
            r.h(var2, "matrix");
            this.$onUpdate.invoke(this.this$0);
         }
      });
   }

   @JvmStatic
   fun `layoutChangeListener$lambda$0`(
      var0: ZoomLayoutFixed, var1: View, var2: Int, var3: Int, var4: Int, var5: Int, var6: Int, var7: Int, var8: Int, var9: Int
   ) {
      var0.getEngine().Z((float)var1.getWidth(), (float)var1.getHeight(), true);
   }

   @JvmStatic
   fun `onMeasure$lambda$1`(var0: ZoomLayoutFixed) {
      var0.getViewTreeObserver().dispatchOnGlobalLayout();
   }

   public open fun addView(child: View, index: Int, params: LayoutParams) {
      r.h(var1, "child");
      r.h(var3, "params");
      ReactNativeScreensUtilsKt.maybeApplyReactNativeScreensFix(this);
      super.addView(var1, var2, var3);
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      val var1: View = this.getChildAt(0);
      if (var1 != null) {
         var1.removeOnLayoutChangeListener(this.layoutChangeListener);
      }
   }

   public open fun onGlobalLayout() {
      super.onGlobalLayout();
      val var1: View = this.getChildAt(0);
      if (var1 != null) {
         var1.addOnLayoutChangeListener(this.layoutChangeListener);
      }
   }

   protected open fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
      MeasureSpecAssertions.assertExplicitMeasureSpec(var1, var2);
      this.setMeasuredDimension(MeasureSpec.getSize(var1), MeasureSpec.getSize(var2));
      this.post(new b(this));
   }

   @SuppressLint(["ClickableViewAccessibility"])
   public open fun onTouchEvent(ev: MotionEvent): Boolean {
      r.h(var1, "ev");
      if (!this.gestureEnabled) {
         return true;
      } else {
         if (var1.getPointerCount() > 1 && this.pinchDetector.onTouchEvent(var1)) {
            val var2: ViewGroup = GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this);
            if (var2 != null) {
               var2.requestDisallowInterceptTouchEvent(true);
            }
         }

         return super.onTouchEvent(var1);
      }
   }

   public fun setGestureEnabled(gestureEnabled: Boolean) {
      this.gestureEnabled = var1;
   }
}
