package com.discord.libdiscore

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import kotlin.jvm.internal.q

public class LibDiscorePackage : ReactPackage {
   public override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
      q.h(var1, "reactContext");
      return i.e(new LibDiscoreModule(var1));
   }

   public override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
      q.h(var1, "reactContext");
      return i.k();
   }
}
