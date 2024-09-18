package com.discord.blur

import com.discord.react.utilities.InitialPropsViewGroupManager
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import kotlin.jvm.internal.q

public class BlurViewPackage : ReactPackage {
   public open fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
      q.h(var1, "reactContext");
      return kotlin.collections.i.k();
   }

   public open fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
      q.h(var1, "reactContext");
      return kotlin.collections.i.q(new InitialPropsViewGroupManager[]{new BlurViewManager(), new BlurViewTargetManager()});
   }
}
