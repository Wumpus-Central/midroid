package com.discord.sticker.react

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import kotlin.jvm.internal.q

public class StickerPackage : TurboReactPackage {
   public open fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, LayoutShadowNode>> {
      q.h(var1, "reactContext");
      return i.n(new ViewManager[]{new StickerViewManagerAPNG(), new StickerViewManagerLottie()});
   }

   public open fun getModule(name: String, context: ReactApplicationContext): Nothing? {
      q.h(var1, "name");
      q.h(var2, "context");
      return null;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(null, false, 3, null);
   }
}
