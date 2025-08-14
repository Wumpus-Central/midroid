package com.discord.deep_link

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

public class DynamicLinkManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   @ReactMethod
   public fun getInitialURL(promise: Promise) {
      var1.resolve(null);
   }

   public open fun getName(): String {
      return "DynamicLinkManager";
   }
}
