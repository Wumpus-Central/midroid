package com.discord.react_gesture_handler.blocking_touch

import android.content.Context
import android.view.MotionEvent
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt
import com.facebook.react.views.view.ReactViewGroup
import kotlin.jvm.internal.q

internal class BlockingGestureViewGroup(context: Context) : ReactViewGroup {
   init {
      q.h(var1, "context");
      super(var1);
   }

   public open fun onInterceptTouchEvent(event: MotionEvent): Boolean {
      q.h(var1, "event");
      if (var1.getAction() == 0) {
         GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this).requestDisallowInterceptTouchEvent(true);
      }

      return super.onInterceptTouchEvent(var1);
   }
}
