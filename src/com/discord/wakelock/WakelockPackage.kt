package com.discord.wakelock

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider

public class WakelockPackage : BaseReactPackage {
   public override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      if (var1 == "NativeScreenWakeLockModule") {
         return new ScreenWakeLockModule(var2);
      } else {
         return if (var1 == "NativeProximitySensorManagerModule") new ProximitySensorManagerModule(var2) else null;
      }
   }

   public override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(
         CollectionsKt.o(new java.lang.String[]{"NativeScreenWakeLockModule", "NativeProximitySensorManagerModule"}), false, 2, null
      );
   }
}
