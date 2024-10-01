package com.discord.thumbhash

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import kotlin.jvm.internal.q

public class ThumbhashPackage : ReactPackage {
   public open fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
      q.h(var1, "reactContext");
      return i.k();
   }

   public open fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
      q.h(var1, "reactContext");
      return i.q(new ImageWithThumbhashPlaceholderViewManager[]{new ImageWithThumbhashPlaceholderViewManager()});
   }
}
