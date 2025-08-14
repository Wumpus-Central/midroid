package com.discord.fast_connect

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider

public class FastConnectPackage : BaseReactPackage {
   public open fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      val var3: FastConnectModule;
      if (var1 == "NativeFastConnectModule") {
         var3 = new FastConnectModule(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider("NativeFastConnectModule", true);
   }
}
