package com.discord.react_gesture_handler

import com.facebook.react.uimanager.ThemedReactContext
import com.swmansion.gesturehandler.react.RNGestureHandlerRootView
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager
import kotlin.jvm.internal.r

internal class DiscordGestureHandlerRootViewManager : RNGestureHandlerRootViewManager {
   public open fun canOverrideExistingModule(): Boolean {
      return true;
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): RNGestureHandlerRootView {
      r.h(var1, "reactContext");
      return new DiscordGestureHandlerEnabledRootView(var1);
   }
}
