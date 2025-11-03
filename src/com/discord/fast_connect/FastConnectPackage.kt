package com.discord.fast_connect

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider

public class FastConnectPackage : BaseReactPackage {
   public override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      return if (var1 == "NativeFastConnectModule") new FastConnectModule(var2) else null;
   }

   public override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider("NativeFastConnectModule", true);
   }
}
