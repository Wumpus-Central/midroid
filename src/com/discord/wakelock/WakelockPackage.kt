package com.discord.wakelock

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import kotlin.jvm.internal.r

public class WakelockPackage : BaseReactPackage {
   public open fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      r.h(var1, "name");
      r.h(var2, "reactContext");
      val var3: Any;
      if (r.c(var1, "NativeScreenWakeLockModule")) {
         var3 = new ScreenWakeLockModule(var2);
      } else if (r.c(var1, "NativeProximitySensorManagerModule")) {
         var3 = new ProximitySensorManagerModule(var2);
      } else {
         var3 = null;
      }

      return (NativeModule)var3;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(
         i.n(new java.lang.String[]{"NativeScreenWakeLockModule", "NativeProximitySensorManagerModule"}), false, 2, null
      );
   }
}
