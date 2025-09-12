package com.discord.portals

import com.discord.portals.from_js.PortalFromJsViewManager
import com.discord.portals.from_native.PortalFromNativeModule
import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager

public class PortalsPackage : BaseReactPackage {
   public override fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<*, LayoutShadowNode>> {
      return CollectionsKt.q(new ViewManager[]{new PortalFromNativeModule.ViewManager(), new PortalFromJsViewManager()});
   }

   public override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      val var3: PortalFromNativeModule;
      if (var1 == "NativePortalFromNativeModule") {
         var3 = new PortalFromNativeModule(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   public override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(CollectionsKt.e("NativePortalFromNativeModule"), false, 2, null);
   }
}
