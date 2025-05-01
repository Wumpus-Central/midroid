package com.discord.intents

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import kotlin.jvm.internal.q

public class IntentsPackage : TurboReactPackage {
   public open fun getModule(name: String, context: ReactApplicationContext): NativeModule? {
      q.h(var1, "name");
      q.h(var2, "context");
      val var3: IntentsModule;
      if (q.c(var1, "NativeIntentsModule")) {
         var3 = new IntentsModule(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(i.e("NativeIntentsModule"), false, 2, null);
   }
}
