package com.discord.react_gesture_handler

import com.discord.react_gesture_handler.blocking_touch.BlockingGestureViewManager
import com.discord.react_gesture_handler.passthrough_touch.PassthroughTouchViewManager
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import java.util.ArrayList
import kotlin.jvm.internal.q

public class DiscordGestureHandlerPackage : ReactPackage {
   public override fun createNativeModules(reactContext: ReactApplicationContext): MutableList<NativeModule> {
      q.h(var1, "reactContext");
      return new ArrayList<>();
   }

   public override fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<*, LayoutShadowNode>> {
      q.h(var1, "reactContext");
      return i.p(new ViewManager[]{new BlockingGestureViewManager(), new PassthroughTouchViewManager(), new DiscordGestureHandlerRootViewManager()});
   }
}
