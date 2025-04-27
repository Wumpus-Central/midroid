package com.discord.fast_connect

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import kotlin.jvm.internal.q

public class FastConnectPackage : TurboReactPackage {
   public open fun getModule(moduleName: String, reactApplicationContext: ReactApplicationContext): NativeModule? {
      q.h(var1, "moduleName");
      q.h(var2, "reactApplicationContext");
      val var3: FastConnectModule;
      if (q.c(var1, "NativeFastConnectModule")) {
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
