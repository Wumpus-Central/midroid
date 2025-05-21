package com.discord.blur

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager

public class BlurViewPackage : BaseReactPackage {
   public override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, LayoutShadowNode>> {
      kotlin.jvm.internal.q.h(var1, "reactContext");
      return kotlin.collections.i.n(new ViewManager[]{new BlurViewManager(), new BlurViewTargetManager()});
   }

   public open fun getModule(name: String, reactContext: ReactApplicationContext): Nothing? {
      kotlin.jvm.internal.q.h(var1, "name");
      kotlin.jvm.internal.q.h(var2, "reactContext");
      return null;
   }

   public override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(null, false, 3, null);
   }
}
