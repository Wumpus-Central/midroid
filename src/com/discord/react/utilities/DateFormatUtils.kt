package com.discord.react.utilities

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.r

public class DateFormatUtils(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   @ReactMethod(isBlockingSynchronousMethod = true)
   public fun activate(): Boolean {
      val var2: JSINativeModule = JSINativeModule.INSTANCE;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var1, "reactApplicationContext");
      return var2.install(ReactContextExtensionsKt.jsiId(var1));
   }

   public open fun getName(): String {
      return "DateFormatUtils";
   }
}
