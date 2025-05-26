package com.discord.safearea

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import kotlin.jvm.internal.q

public class SafeAreaPackage : BaseReactPackage {
   public override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      q.h(var1, "name");
      q.h(var2, "reactContext");
      val var3: SafeAreaInsetsModule;
      if (q.c(var1, "NativeSafeAreaInsetsModule")) {
         var3 = new SafeAreaInsetsModule(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   public override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(i.e("NativeSafeAreaInsetsModule"), false, 2, null);
   }
}
