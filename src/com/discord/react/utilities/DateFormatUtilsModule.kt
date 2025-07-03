package com.discord.react.utilities

import com.discord.codegen.NativeDateFormatUtilsModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r

public class DateFormatUtilsModule(reactContext: ReactApplicationContext) : NativeDateFormatUtilsModuleSpec {
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public override fun activate(): Boolean {
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
