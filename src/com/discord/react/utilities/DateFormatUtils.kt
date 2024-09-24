package com.discord.react.utilities

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.q

public class DateFormatUtils(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   @ReactMethod(isBlockingSynchronousMethod = true)
   public fun activate(): Boolean {
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var4, "getReactApplicationContext(...)");
      val var5: java.lang.Long = ReactContextExtensionsKt.jsiId(var4);
      val var1: Boolean;
      if (var5 != null) {
         var1 = JSINativeModule.INSTANCE.install(var5.longValue());
      } else {
         var1 = false;
      }

      return var1;
   }

   public open fun getName(): String {
      return "DateFormatUtils";
   }
}
