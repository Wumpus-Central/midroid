package com.discord.libdiscore

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

public class LibDiscorePackage : ReactPackage {
   public override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
      return CollectionsKt.e(new LibDiscoreModule(var1));
   }

   public override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
      return CollectionsKt.k();
   }
}
