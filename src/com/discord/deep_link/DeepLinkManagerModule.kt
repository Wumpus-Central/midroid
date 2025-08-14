package com.discord.deep_link

import B9.s
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

public class DeepLinkManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   @ReactMethod
   public fun getInitialURL(promise: Promise) {
      val var3: Pair = DeepLinks.INSTANCE.getInitialUrl();
      if (var3 != null) {
         val var2: java.lang.String = var3.a() as java.lang.String;
         val var4: java.lang.Boolean = var3.b() as java.lang.Boolean;
         var4;
         var1.resolve(NativeMapExtensionsKt.nativeMapOf(s.a("url", var2), s.a("isDeferred", var4)));
      } else {
         var1.resolve(null);
      }
   }

   public open fun getName(): String {
      return "DeepLinkManager";
   }
}
