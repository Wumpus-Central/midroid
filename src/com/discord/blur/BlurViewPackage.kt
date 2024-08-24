package com.discord.blur

import com.discord.react.utilities.InitialPropsViewGroupManager
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import kotlin.jvm.internal.r

public class BlurViewPackage : ReactPackage {
   public open fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
      r.h(var1, "reactContext");
      return kotlin.collections.h.i();
   }

   public open fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
      r.h(var1, "reactContext");
      return kotlin.collections.h.o(new InitialPropsViewGroupManager[]{new BlurViewManager(), new BlurViewTargetManager()});
   }
}
