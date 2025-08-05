package com.discord.react_activities

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.view.MotionEvent
import android.view.View
import java.util.WeakHashMap
import kotlin.jvm.internal.r

public class ReactRootView(context: Context) : com.facebook.react.ReactRootView, RootViewInterface {
   private final val helper: ReactViewHelper

   public open var exclusionRects: List<Rect>
      public open get() {
         return this.helper.getExclusionRects();
      }

      public open set(value) {
         r.h(var1, "value");
         this.helper.setExclusionRects(var1);
      }


   public open val onInterceptTouchEventListeners: WeakHashMap<View, ((MotionEvent) -> Unit)?>
      public open get() {
         return this.helper.getOnInterceptTouchEventListeners();
      }


   init {
      r.h(var1, "context");
      super(var1);
      this.helper = new ReactViewHelper();
   }

   @JvmStatic
   fun `dispatchDraw$lambda$0`(var0: ReactRootView, var1: Canvas): Unit {
      var0.dispatchDraw(var1);
      return Unit.a;
   }

   protected open fun dispatchDraw(canvas: Canvas) {
      r.h(var1, "canvas");
      this.helper.handleDispatchDraw(this, new a(this, var1));
   }

   public open fun onInterceptTouchEvent(e: MotionEvent): Boolean {
      r.h(var1, "e");
      this.helper.handleInterceptTouchEvent(var1);
      return super.onInterceptTouchEvent(var1);
   }
}
