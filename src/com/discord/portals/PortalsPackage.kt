package com.discord.portals

import com.discord.portals.from_js.PortalFromJsViewManager
import com.discord.portals.from_native.PortalFromNativeModule
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import kotlin.jvm.internal.q

public class PortalsPackage : ReactPackage {
   public open fun createNativeModules(reactContext: ReactApplicationContext): MutableList<NativeModule> {
      q.h(var1, "reactContext");
      return i.p(new NativeModule[]{new PortalFromNativeModule(var1)});
   }

   public open fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<*, LayoutShadowNode>> {
      q.h(var1, "reactContext");
      return i.p(new ViewManager[]{new PortalFromNativeModule.ViewManager(), new PortalFromJsViewManager()});
   }
}
