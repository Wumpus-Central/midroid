package com.discord.thumbhash

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import kotlin.jvm.internal.r

public class ThumbhashPackage : ReactPackage {
   public override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
      r.h(var1, "reactContext");
      return h.i();
   }

   public override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
      r.h(var1, "reactContext");
      return h.o(new ImageWithThumbhashPlaceholderViewManager[]{new ImageWithThumbhashPlaceholderViewManager()});
   }
}
