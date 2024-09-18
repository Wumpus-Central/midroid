package com.discord.react_gesture_handler.blocking_touch

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.viewmanagers.BlockingGestureViewManagerDelegate
import com.facebook.react.viewmanagers.BlockingGestureViewManagerInterface
import kotlin.jvm.internal.q

@ReactModule(name = "BlockingGestureView")
internal class BlockingGestureViewManager : ViewGroupManager<BlockingGestureViewGroup>, BlockingGestureViewManagerInterface<BlockingGestureViewGroup> {
   private final val mDelegate: BlockingGestureViewManagerDelegate<BlockingGestureViewGroup, BlockingGestureViewManager> =
      new BlockingGestureViewManagerDelegate(this)

   protected open fun createViewInstance(reactContext: ThemedReactContext): BlockingGestureViewGroup {
      q.h(var1, "reactContext");
      return new BlockingGestureViewGroup(var1);
   }

   protected open fun getDelegate(): BlockingGestureViewManagerDelegate<BlockingGestureViewGroup, BlockingGestureViewManager> {
      return this.mDelegate;
   }

   public open fun getName(): String {
      return "BlockingGestureView";
   }

   public companion object {
      public const val NAME: String
   }
}
