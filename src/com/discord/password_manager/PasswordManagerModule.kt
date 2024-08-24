package com.discord.password_manager

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.r

public class PasswordManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun getName(): String {
      return "OnePasswordManager";
   }

   @ReactMethod
   public fun isSupported(promise: Promise) {
      r.h(var1, "promise");
      var1.resolve(java.lang.Boolean.FALSE);
   }
}
