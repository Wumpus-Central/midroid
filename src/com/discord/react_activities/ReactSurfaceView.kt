package com.discord.react_activities

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.view.MotionEvent
import android.view.View
import com.facebook.react.runtime.ReactSurfaceImpl
import java.util.WeakHashMap

@SuppressLint(["ViewConstructor"])
public class ReactSurfaceView(context: Context, surface: ReactSurfaceImpl) : com.facebook.react.runtime.ReactSurfaceView(var1, var2), RootViewInterface {
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
   fun `dispatchDraw$lambda$0`(var0: ReactSurfaceView, var1: Canvas): Unit {
      var0.dispatchDraw(var1);
      return Unit.a;
   }

   protected open fun dispatchDraw(canvas: Canvas) {
      this.helper.handleDispatchDraw(this, new b(this, var1));
   }

   public open fun onInterceptTouchEvent(e: MotionEvent): Boolean {
      this.helper.handleInterceptTouchEvent(var1);
      return super.onInterceptTouchEvent(var1);
   }
}
