package com.discord.react_gesture_handler.blocking_touch

import android.content.Context
import android.view.MotionEvent
import android.view.ViewGroup
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt
import com.facebook.react.views.view.ReactViewGroup

internal class BlockingGestureViewGroup(context: Context) : ReactViewGroup(var1) {
   public open fun onInterceptTouchEvent(event: MotionEvent): Boolean {
      if (var1.getAction() == 0) {
         val var2: ViewGroup = GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this);
         if (var2 != null) {
            var2.requestDisallowInterceptTouchEvent(true);
         }
      }

      return super.onInterceptTouchEvent(var1);
   }
}
