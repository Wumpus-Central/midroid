package com.discord.dynamic_link

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.r

public class DynamicLinkManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   @ReactMethod
   public fun getInitialURL(promise: Promise) {
      r.h(var1, "promise");
      var1.resolve(null);
   }

   public open fun getName(): String {
      return "DynamicLinkManager";
   }
}
