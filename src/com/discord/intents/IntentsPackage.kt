package com.discord.intents

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider

public class IntentsPackage : BaseReactPackage {
   public override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      if (var1 == "NativeIntentsModule") {
         return new IntentsModule(var2);
      } else {
         return if (var1 == "NativeLinkingModule") new LinkingModule(var2) else null;
      }
   }

   public override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(
         CollectionsKt.o(new java.lang.String[]{"NativeIntentsModule", "NativeLinkingModule"}), false, 2, null
      );
   }
}
