package com.discord.react_activities

import android.app.Activity
import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.os.Build.VERSION
import android.view.MotionEvent
import android.view.View
import com.facebook.react.bridge.ReactContext
import java.util.WeakHashMap
import java.util.Map.Entry
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

public class ReactRootView(context: Context) : com.facebook.react.ReactRootView {
   internal final var exclusionRects: List<Rect>
   internal final val onInterceptTouchEventListeners: WeakHashMap<View, ((MotionEvent) -> Unit)?>

   init {
      r.h(var1, "context");
      super(var1);
      this.exclusionRects = EMPTY_EXCLUSION_RECTS;
      this.onInterceptTouchEventListeners = new WeakHashMap<>();
   }

   protected open fun dispatchDraw(canvas: Canvas) {
      r.h(var1, "canvas");
      super.dispatchDraw(var1);
      if (VERSION.SDK_INT >= 29) {
         this.setSystemGestureExclusionRects(this.exclusionRects);
      }
   }

   public open fun onInterceptTouchEvent(e: MotionEvent): Boolean {
      r.h(var1, "e");
      val var2: java.util.Iterator = this.onInterceptTouchEventListeners.entrySet().iterator();

      while (var2.hasNext()) {
         val var3: Function1 = (var2.next() as Entry).getValue() as Function1;
         if (var3 != null) {
            var3.invoke(var1);
         }
      }

      return super.onInterceptTouchEvent(var1);
   }

   public companion object {
      private final val EMPTY_EXCLUSION_RECTS: List<Rect>

      private fun Context.getReactRootView(): ReactRootView? {
         val var3: ReactContext;
         if (var1 is ReactContext) {
            var3 = var1 as ReactContext;
         } else {
            var3 = null;
         }

         var var5: ReactRootView = null;
         if (var3 != null) {
            val var6: Activity = var3.getCurrentActivity();
            var5 = null;
            if (var6 != null) {
               var5 = (var6 as ReactActivity).getRootView$react_activity_release();
            }
         }

         return var5;
      }

      private fun View.getReactRootView(): ReactRootView? {
         val var2: Context = var1.getContext();
         r.g(var2, "context");
         return this.getReactRootView(var2);
      }

      public fun setOnInterceptTouchEvent(view: View, callback: ((MotionEvent) -> Unit)?) {
         r.h(var1, "view");
         val var3: ReactRootView = this.getReactRootView(var1);
         if (var3 != null) {
            var3.getOnInterceptTouchEventListeners$react_activity_release().put(var1, var2);
         }
      }

      public fun setSystemGestureExclusionRects(context: Context, exclusionRects: List<Rect>) {
         r.h(var1, "context");
         r.h(var2, "exclusionRects");
         val var3: ReactRootView = this.getReactRootView(var1);
         if (var3 != null) {
            if (var2.isEmpty()) {
               var3.setExclusionRects$react_activity_release(ReactRootView.access$getEMPTY_EXCLUSION_RECTS$cp());
            } else {
               var3.setExclusionRects$react_activity_release(var2);
            }

            var3.invalidate();
         }
      }
   }
}
