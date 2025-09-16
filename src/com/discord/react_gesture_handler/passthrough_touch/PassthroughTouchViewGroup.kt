package com.discord.react_gesture_handler.passthrough_touch

import android.annotation.SuppressLint
import android.content.Context
import android.view.MotionEvent
import com.facebook.react.uimanager.PointerEvents
import com.facebook.react.views.view.ReactViewGroup
import java.lang.reflect.Field

internal class PassthroughTouchViewGroup(context: Context) : ReactViewGroup(var1) {
   public final var onTouchDown: () -> Unit
      internal set

   init {
      val var2: Field = ReactViewGroup.class.getDeclaredField("mPointerEvents");
      var2.setAccessible(true);
      var2.set(this, PointerEvents.BOX_NONE);
      this.onTouchDown = new a();
   }

   @JvmStatic
   fun `onTouchDown$lambda$0`(): Unit {
      return Unit.a;
   }

   public open fun onInterceptTouchEvent(event: MotionEvent): Boolean {
      return false;
   }

   @SuppressLint(["ClickableViewAccessibility"])
   public open fun onTouchEvent(ev: MotionEvent): Boolean {
      if (var1.getAction() == 0) {
         this.onTouchDown.invoke();
      }

      return false;
   }
}
