package com.discord.fast_connect

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import kotlin.jvm.internal.r

public class FastConnectPackage : BaseReactPackage {
   public open fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      r.h(var1, "name");
      r.h(var2, "reactContext");
      val var3: FastConnectModule;
      if (r.c(var1, "NativeFastConnectModule")) {
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
