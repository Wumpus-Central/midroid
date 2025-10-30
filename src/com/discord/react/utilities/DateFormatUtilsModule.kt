package com.discord.react.utilities

import com.discord.codegen.NativeDateFormatUtilsModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class DateFormatUtilsModule(reactContext: ReactApplicationContext) : NativeDateFormatUtilsModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   public open fun activate(): Boolean {
      val var3: java.lang.Long = ReactContextExtensionsKt.jsiId(this.reactContext);
      return var3 != null && JSINativeModule.INSTANCE.install(var3.longValue());
   }
}
