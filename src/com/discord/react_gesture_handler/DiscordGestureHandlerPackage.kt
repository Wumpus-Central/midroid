package com.discord.react_gesture_handler

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.discord.react_gesture_handler.blocking_touch.BlockingGestureViewManager
import com.discord.react_gesture_handler.passthrough_touch.PassthroughTouchViewManager
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager

public class DiscordGestureHandlerPackage : BaseReactPackage {
   public open fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, LayoutShadowNode>> {
      return CollectionsKt.n(new ViewManager[]{new BlockingGestureViewManager(), new PassthroughTouchViewManager(), new DiscordGestureHandlerRootViewManager()});
   }

   public open fun getModule(name: String, reactContext: ReactApplicationContext): Nothing? {
      return null;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(null, false, 3, null);
   }
}
