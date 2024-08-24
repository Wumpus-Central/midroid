package com.discord.react_gesture_handler

import com.discord.react_gesture_handler.blocking_touch.BlockingGestureViewManager
import com.discord.react_gesture_handler.passthrough_touch.PassthroughTouchViewManager
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import java.util.ArrayList
import kotlin.jvm.internal.r

public class DiscordGestureHandlerPackage : ReactPackage {
   public open fun createNativeModules(reactContext: ReactApplicationContext): MutableList<NativeModule> {
      r.h(var1, "reactContext");
      return new ArrayList<>();
   }

   public open fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<*, LayoutShadowNode>> {
      r.h(var1, "reactContext");
      return h.o(new ViewManager[]{new BlockingGestureViewManager(), new PassthroughTouchViewManager(), new DiscordGestureHandlerRootViewManager()});
   }
}
