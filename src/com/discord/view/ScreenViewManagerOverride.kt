package com.discord.view

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.swmansion.rnscreens.Screen
import com.swmansion.rnscreens.ScreenViewManager

@ReactModule(canOverrideExistingModule = true, name = "RNSScreen")
public class ScreenViewManagerOverride : ScreenViewManager {
   protected open fun createViewInstance(reactContext: ThemedReactContext): Screen {
      return new ScreenOverride(var1);
   }
}
