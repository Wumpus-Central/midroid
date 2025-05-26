package com.discord.fast_connect

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import kotlin.jvm.internal.q

public class FastConnectPackage : BaseReactPackage {
   public override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      q.h(var1, "name");
      q.h(var2, "reactContext");
      val var3: FastConnectModule;
      if (q.c(var1, "NativeFastConnectModule")) {
         var3 = new FastConnectModule(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   public override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider("NativeFastConnectModule", true);
   }
}
