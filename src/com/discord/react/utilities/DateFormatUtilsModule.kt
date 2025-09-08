package com.discord.react.utilities

import com.discord.codegen.NativeDateFormatUtilsModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class DateFormatUtilsModule(reactContext: ReactApplicationContext) : NativeDateFormatUtilsModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   public override fun activate(): Boolean {
      val var4: java.lang.Long = ReactContextExtensionsKt.jsiId(this.reactContext);
      val var1: Boolean;
      if (var4 != null) {
         var1 = JSINativeModule.INSTANCE.install(var4.longValue());
      } else {
         var1 = false;
      }

      return var1;
   }
}
