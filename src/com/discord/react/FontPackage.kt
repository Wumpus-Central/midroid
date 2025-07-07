package com.discord.react

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import kotlin.jvm.internal.r

public class FontPackage : BaseReactPackage {
   public open fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      r.h(var1, "name");
      r.h(var2, "reactContext");
      val var3: FontModule;
      if (r.c(var1, "NativeFontModule")) {
         var3 = new FontModule(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(i.e("NativeFontModule"), false, 2, null);
   }
}
