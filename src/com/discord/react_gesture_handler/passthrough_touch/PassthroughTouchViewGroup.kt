package com.discord.react_gesture_handler.passthrough_touch

import android.annotation.SuppressLint
import android.content.Context
import android.view.MotionEvent
import com.facebook.react.uimanager.PointerEvents
import com.facebook.react.views.view.ReactViewGroup
import java.lang.reflect.Field
import kotlin.jvm.internal.q

internal class PassthroughTouchViewGroup(context: Context) : ReactViewGroup {
   public final var onTouchDown: () -> Unit
      internal set

   init {
      q.h(var1, "context");
      super(var1);
      val var2: Field = ReactViewGroup.class.getDeclaredField("mPointerEvents");
      var2.setAccessible(true);
      var2.set(this, PointerEvents.BOX_NONE);
      this.onTouchDown = <unrepresentable>.INSTANCE;
   }

   public override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
      q.h(var1, "event");
      return false;
   }

   @SuppressLint(["ClickableViewAccessibility"])
   public override fun onTouchEvent(ev: MotionEvent): Boolean {
      q.h(var1, "ev");
      if (var1.getAction() == 0) {
         this.onTouchDown.invoke();
      }

      return false;
   }
}
