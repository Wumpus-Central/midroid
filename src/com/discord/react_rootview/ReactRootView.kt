package com.discord.react_rootview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.view.MotionEvent
import android.view.View
import java.util.WeakHashMap

public class ReactRootView(context: Context) : com.facebook.react.ReactRootView(var1), RootViewInterface {
   private final val helper: ReactViewHelper = new ReactViewHelper()

   public open var exclusionRects: List<Rect>
      public open get() {
         return this.helper.getExclusionRects();
      }

      public open set(value) {
         this.helper.setExclusionRects(var1);
      }


   public open val onInterceptTouchEventListeners: WeakHashMap<View, ((MotionEvent) -> Unit)?>
      public open get() {
         return this.helper.getOnInterceptTouchEventListeners();
      }


   @JvmStatic
   fun `dispatchDraw$lambda$0`(var0: ReactRootView, var1: Canvas): Unit {
      var0.dispatchDraw(var1);
      return Unit.a;
   }

   protected open fun dispatchDraw(canvas: Canvas) {
      this.helper.handleDispatchDraw(this, new a(this, var1));
   }

   public open fun onInterceptTouchEvent(e: MotionEvent): Boolean {
      this.helper.handleInterceptTouchEvent(var1);
      return super.onInterceptTouchEvent(var1);
   }
}
