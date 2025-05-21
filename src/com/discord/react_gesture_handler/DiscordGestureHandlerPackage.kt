package com.discord.react_gesture_handler

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.discord.react_gesture_handler.blocking_touch.BlockingGestureViewManager
import com.discord.react_gesture_handler.passthrough_touch.PassthroughTouchViewManager
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import kotlin.jvm.internal.q

public class DiscordGestureHandlerPackage : BaseReactPackage {
   public override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, LayoutShadowNode>> {
      q.h(var1, "reactContext");
      return i.n(new ViewManager[]{new BlockingGestureViewManager(), new PassthroughTouchViewManager(), new DiscordGestureHandlerRootViewManager()});
   }

   public open fun getModule(name: String, reactContext: ReactApplicationContext): Nothing? {
      q.h(var1, "name");
      q.h(var2, "reactContext");
      return null;
   }

   public override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(null, false, 3, null);
   }
}
