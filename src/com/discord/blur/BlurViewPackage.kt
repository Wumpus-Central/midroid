package com.discord.blur

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager

public class BlurViewPackage : BaseReactPackage {
   public open fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, LayoutShadowNode>> {
      return CollectionsKt.o(new ViewManager[]{new BlurViewManager(), new BlurViewTargetManager()});
   }

   public open fun getModule(name: String, reactContext: ReactApplicationContext): Nothing? {
      return null;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(null, false, 3, null);
   }
}
