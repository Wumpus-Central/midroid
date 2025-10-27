package com.discord.safearea

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider

public class SafeAreaPackage : BaseReactPackage {
   public override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      val var3: SafeAreaInsetsModule;
      if (var1 == "NativeSafeAreaInsetsModule") {
         var3 = new SafeAreaInsetsModule(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   public override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(CollectionsKt.e("NativeSafeAreaInsetsModule"), false, 2, null);
   }
}
