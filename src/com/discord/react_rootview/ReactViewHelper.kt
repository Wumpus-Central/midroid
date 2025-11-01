package com.discord.react_rootview

import android.graphics.Rect
import android.os.Build.VERSION
import android.view.MotionEvent
import android.view.View
import java.util.WeakHashMap
import java.util.Map.Entry
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nReactViewHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactViewHelper.kt\ncom/discord/react_rootview/ReactViewHelper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,30:1\n216#2,2:31\n*S KotlinDebug\n*F\n+ 1 ReactViewHelper.kt\ncom/discord/react_rootview/ReactViewHelper\n*L\n14#1:31,2\n*E\n"])
public class ReactViewHelper {
   public final var exclusionRects: List<Rect> = EMPTY_EXCLUSION_RECTS
      internal set

   public final val onInterceptTouchEventListeners: WeakHashMap<View, ((MotionEvent) -> Unit)?> = new WeakHashMap()

   public fun handleDispatchDraw(view: View, superDispatchDraw: () -> Unit) {
      var2.invoke();
      if (VERSION.SDK_INT >= 29) {
         var1.setSystemGestureExclusionRects(this.exclusionRects);
      }
   }

   public fun handleInterceptTouchEvent(e: MotionEvent) {
      val var3: java.util.Iterator = this.onInterceptTouchEventListeners.entrySet().iterator();

      while (var3.hasNext()) {
         val var2: Function1 = (var3.next() as Entry).getValue() as Function1;
         if (var2 != null) {
            var2.invoke(var1);
         }
      }
   }

   public companion object {
      public final val EMPTY_EXCLUSION_RECTS: List<Rect>
   }
}
