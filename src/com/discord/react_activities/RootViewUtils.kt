package com.discord.react_activities

import android.app.Activity
import android.content.Context
import android.graphics.Rect
import android.view.MotionEvent
import android.view.View
import com.facebook.react.ReactDelegate
import com.facebook.react.bridge.ReactContext
import kotlin.jvm.internal.r

public object RootViewUtils {
   private final val EMPTY_EXCLUSION_RECTS: List<Rect> = i.e(new Rect(0, 0, 0, 0))

   private fun getRootView(view: View): RootViewInterface? {
      val var4: Context = var1.getContext();
      val var2: Boolean = var4 is ReactContext;
      var var3: RootViewInterface = null;
      val var5: ReactContext;
      if (var2) {
         var5 = var4 as ReactContext;
      } else {
         var5 = null;
      }

      if (var5 != null) {
         var3 = INSTANCE.getRootView(var5);
      }

      return var3;
   }

   public fun getRootView(context: ReactContext): RootViewInterface? {
      r.h(var1, "context");
      val var2: Activity = var1.getCurrentActivity();
      val var3: ReactActivity;
      if (var2 is ReactActivity) {
         var3 = var2 as ReactActivity;
      } else {
         var3 = null;
      }

      if (var3 != null) {
         val var4: ReactDelegate = var3.getReactDelegate();
         if (var4 != null) {
            val var5: com.facebook.react.ReactRootView = var4.getReactRootView();
            if (var5 != null) {
               val var6: RootViewInterface;
               if (var5 is RootViewInterface) {
                  var6 = var5 as RootViewInterface;
               } else {
                  var6 = null;
               }

               if (var6 != null) {
                  return var6;
               }
            }
         }
      }

      return null;
   }

   public fun setOnInterceptTouchEvent(view: View, callback: ((MotionEvent) -> Unit)?) {
      r.h(var1, "view");
      val var3: RootViewInterface = this.getRootView(var1);
      if (var3 != null) {
         var3.getOnInterceptTouchEventListeners().put(var1, var2);
      }
   }

   public fun setSystemGestureExclusionRects(context: ReactContext, exclusionRects: List<Rect>) {
      r.h(var1, "context");
      r.h(var2, "exclusionRects");
      var var3: java.util.List = var2;
      if (var2.isEmpty()) {
         var3 = EMPTY_EXCLUSION_RECTS;
      }

      val var4: RootViewInterface = this.getRootView(var1);
      if (var4 != null) {
         var4.setExclusionRects(var3);
         (var4 as View).invalidate();
      }
   }
}
