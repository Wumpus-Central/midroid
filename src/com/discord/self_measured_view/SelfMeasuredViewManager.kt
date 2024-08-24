package com.discord.self_measured_view

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ReactStylesDiffMap
import com.facebook.react.uimanager.StateWrapper
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import kotlin.jvm.internal.r

@ReactModule(name = "DCDSelfMeasuredView")
public class SelfMeasuredViewManager : ViewGroupManager<SelfMeasuredView> {
   protected open fun createViewInstance(reactContext: ThemedReactContext): SelfMeasuredView {
      r.h(var1, "reactContext");
      return new SelfMeasuredView(var1, null, 0, 6, null);
   }

   public open fun getName(): String {
      return "DCDSelfMeasuredView";
   }

   public open fun updateState(view: SelfMeasuredView, props: ReactStylesDiffMap?, stateWrapper: StateWrapper?) {
      r.h(var1, "view");
      var1.getFabricViewStateManager().setStateWrapper(var3);
   }

   public companion object {
      public const val NAME: String
   }
}
