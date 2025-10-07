package com.discord.view

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.swmansion.rnscreens.ScreenStack
import com.swmansion.rnscreens.ScreenStackViewManager

@ReactModule(canOverrideExistingModule = true, name = "RNSScreenStack")
public class ScreenStackViewManagerOverride : ScreenStackViewManager {
   protected open fun createViewInstance(reactContext: ThemedReactContext): ScreenStack {
      return new ScreenStackOverride(var1);
   }
}
