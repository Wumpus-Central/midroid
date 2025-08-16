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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nReactRootView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactRootView.kt\ncom/discord/react_activities/ReactRootView\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,67:1\n216#2,2:68\n*S KotlinDebug\n*F\n+ 1 ReactRootView.kt\ncom/discord/react_activities/ReactRootView\n*L\n20#1:68,2\n*E\n"])
public class ReactRootView(context: Context) : com.facebook.react.ReactRootView(var1) {
   internal final var exclusionRects: List<Rect> = EMPTY_EXCLUSION_RECTS
   internal final val onInterceptTouchEventListeners: WeakHashMap<View, ((MotionEvent) -> Unit)?> = new WeakHashMap()

   protected open fun dispatchDraw(canvas: Canvas) {
      super.dispatchDraw(var1);
      if (VERSION.SDK_INT >= 29) {
         a.a(this, this.exclusionRects);
      }
   }

   public open fun onInterceptTouchEvent(e: MotionEvent): Boolean {
      val var3: java.util.Iterator = this.onInterceptTouchEventListeners.entrySet().iterator();

      while (var3.hasNext()) {
         val var2: Function1 = (var3.next() as Entry).getValue() as Function1;
         if (var2 != null) {
            var2.invoke(var1);
         }
      }

      return super.onInterceptTouchEvent(var1);
   }

   @SourceDebugExtension(["SMAP\nReactRootView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactRootView.kt\ncom/discord/react_activities/ReactRootView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"])
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
         return this.getReactRootView(var2);
      }

      public fun setOnInterceptTouchEvent(view: View, callback: ((MotionEvent) -> Unit)?) {
         val var3: ReactRootView = this.getReactRootView(var1);
         if (var3 != null) {
            var3.getOnInterceptTouchEventListeners$react_activity_release().put(var1, var2);
         }
      }

      public fun setSystemGestureExclusionRects(context: Context, exclusionRects: List<Rect>) {
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
