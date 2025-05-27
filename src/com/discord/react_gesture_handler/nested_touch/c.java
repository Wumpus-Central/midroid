package com.discord.react_gesture_handler.nested_touch;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class c implements Function1 {
   public final NestedScrollOnTouchListener j;
   public final View k;

   public final Object invoke(Object var1) {
      return NestedScrollOnTouchListener.a(this.j, this.k, (MotionEvent)var1);
   }
}
