package com.discord.self_measured_view

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ReactStylesDiffMap
import com.facebook.react.uimanager.StateWrapper
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager

@ReactModule(name = "DCDSelfMeasuredView")
public class SelfMeasuredViewManager : ViewGroupManager<SelfMeasuredView> {
   protected open fun createViewInstance(reactContext: ThemedReactContext): SelfMeasuredView {
      return new SelfMeasuredView(var1, null, 0, 6, null);
   }

   public override fun getName(): String {
      return "DCDSelfMeasuredView";
   }

   public open fun updateState(view: SelfMeasuredView, props: ReactStylesDiffMap?, stateWrapper: StateWrapper?) {
      var1.setStateWrapper(var3);
   }

   public companion object {
      public const val NAME: String
   }
}
