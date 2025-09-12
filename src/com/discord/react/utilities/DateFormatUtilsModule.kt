package com.discord.react.utilities

import com.discord.codegen.NativeDateFormatUtilsModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class DateFormatUtilsModule(reactContext: ReactApplicationContext) : NativeDateFormatUtilsModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   public open fun activate(): Boolean {
      val var4: java.lang.Long = ReactContextExtensionsKt.jsiId(this.reactContext);
      val var3: Boolean;
      if (var4 != null) {
         var3 = JSINativeModule.INSTANCE.install(var4.longValue());
      } else {
         var3 = false;
      }

      return var3;
   }
}
