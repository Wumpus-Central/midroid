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
      val var3: Any;
      if (q.c(var1, "NativeIntentsModule")) {
         var3 = new IntentsModule(var2);
      } else if (q.c(var1, "NativeLinkingModule")) {
         var3 = new LinkingModule(var2);
      } else {
         var3 = null;
      }

      return (NativeModule)var3;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(
         i.n(new java.lang.String[]{"NativeIntentsModule", "NativeLinkingModule"}), false, 2, null
      );
   }
}
