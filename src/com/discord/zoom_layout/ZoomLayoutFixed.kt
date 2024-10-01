package com.discord.zoom_layout

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.View
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
import android.view.View.MeasureSpec
import android.view.View.OnLayoutChangeListener
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt
import com.facebook.react.uimanager.MeasureSpecAssertions
import com.otaliastudios.zoom.ZoomLayout
import kotlin.jvm.internal.q

public class ZoomLayoutFixed  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ZoomLayout {
   public final var gestureEnabled: Boolean
      internal set

   private final val layoutChangeListener: OnLayoutChangeListener
   private final val pinchDetector: ScaleGestureDetector

   fun ZoomLayoutFixed(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ZoomLayoutFixed(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      this.pinchDetector = new ScaleGestureDetector(var1, new SimpleOnScaleGestureListener());
      this.gestureEnabled = true;
      this.layoutChangeListener = new b(this);
   }

   @JvmStatic
   fun `layoutChangeListener$lambda$0`(
      var0: ZoomLayoutFixed, var1: View, var2: Int, var3: Int, var4: Int, var5: Int, var6: Int, var7: Int, var8: Int, var9: Int
   ) {
      q.h(var0, "this$0");
      var0.getEngine().Z((float)var1.getWidth(), (float)var1.getHeight(), true);
   }

   @JvmStatic
   fun `onMeasure$lambda$1`(var0: ZoomLayoutFixed) {
      q.h(var0, "this$0");
      var0.getViewTreeObserver().dispatchOnGlobalLayout();
   }

   protected override fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      val var1: View = this.getChildAt(0);
      if (var1 != null) {
         var1.removeOnLayoutChangeListener(this.layoutChangeListener);
      }
   }

   public override fun onGlobalLayout() {
      super.onGlobalLayout();
      val var1: View = this.getChildAt(0);
      if (var1 != null) {
         var1.addOnLayoutChangeListener(this.layoutChangeListener);
      }
   }

   protected override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
      MeasureSpecAssertions.assertExplicitMeasureSpec(var1, var2);
      this.setMeasuredDimension(MeasureSpec.getSize(var1), MeasureSpec.getSize(var2));
      this.post(new com.discord.zoom_layout.a(this));
   }

   @SuppressLint(["ClickableViewAccessibility"])
   public override fun onTouchEvent(ev: MotionEvent): Boolean {
      q.h(var1, "ev");
      if (!this.gestureEnabled) {
         return true;
      } else {
         if (var1.getPointerCount() > 1 && this.pinchDetector.onTouchEvent(var1)) {
            GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this).requestDisallowInterceptTouchEvent(true);
         }

         return super.onTouchEvent(var1);
      }
   }
}
