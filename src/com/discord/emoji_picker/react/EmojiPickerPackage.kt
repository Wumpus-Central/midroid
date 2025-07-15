package com.discord.emoji_picker.react

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import kotlin.jvm.internal.r

public class EmojiPickerPackage : BaseReactPackage {
   public open fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, LayoutShadowNode>> {
      r.h(var1, "reactContext");
      return kotlin.collections.i.n(new ViewManager[]{new EmojiPickerViewManager(), new EmojiPickerRowViewManager()});
   }

   public open fun getModule(name: String, reactContext: ReactApplicationContext): Nothing? {
      r.h(var1, "name");
      r.h(var2, "reactContext");
      return null;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(null, false, 3, null);
   }
}
