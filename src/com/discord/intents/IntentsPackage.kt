package com.discord.intents

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider

public class IntentsPackage : BaseReactPackage {
   public open fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      val var3: Any;
      if (var1 == "NativeIntentsModule") {
         var3 = new IntentsModule(var2);
      } else if (var1 == "NativeLinkingModule") {
         var3 = new LinkingModule(var2);
      } else {
         var3 = null;
      }

      return (NativeModule)var3;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(
         CollectionsKt.n(new java.lang.String[]{"NativeIntentsModule", "NativeLinkingModule"}), false, 2, null
      );
   }
}
