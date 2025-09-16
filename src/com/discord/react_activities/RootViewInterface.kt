package com.discord.react_activities

import android.graphics.Rect
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import java.util.WeakHashMap

public interface RootViewInterface {
   public var exclusionRects: List<Rect>
      internal final set

   public val onInterceptTouchEventListeners: WeakHashMap<View, ((MotionEvent) -> Unit)?>

   public abstract fun setAppProperties(appProperties: Bundle?) {
   }
}
