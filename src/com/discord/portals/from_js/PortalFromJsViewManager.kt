package com.discord.portals.from_js

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.views.view.ReactViewGroup
import com.facebook.react.views.view.ReactViewManager

@ReactModule(name = "PortalToNativeView")
internal class PortalFromJsViewManager : ReactViewManager {
   public open fun createViewInstance(context: ThemedReactContext): ReactViewGroup {
      return new PortalFromJsViewHost(var1);
   }

   public open fun getName(): String {
      return "PortalToNativeView";
   }

   protected open fun onAfterUpdateTransaction(view: ReactViewGroup) {
      super.onAfterUpdateTransaction(var1);
      (var1 as PortalFromJsViewHost).onAfterUpdateTransaction();
   }

   public open fun onDropViewInstance(view: ReactViewGroup) {
      super.onDropViewInstance(var1);
      (var1 as PortalFromJsViewHost).onDropViewInstance();
   }

   @ReactProp(name = "portalId")
   public fun setPortalId(view: ReactViewGroup, value: String) {
      (var1 as PortalFromJsViewHost).setPortalId(var2);
   }

   public companion object {
      internal const val NAME: String
   }
}
