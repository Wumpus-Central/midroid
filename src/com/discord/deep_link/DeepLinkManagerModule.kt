package com.discord.deep_link

import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import fm.v

public class DeepLinkManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   @ReactMethod
   public fun getInitialURL(promise: Promise) {
      val var3: Pair = DeepLinks.INSTANCE.getInitialUrl();
      if (var3 != null) {
         val var2: java.lang.String = var3.a() as java.lang.String;
         val var4: java.lang.Boolean = var3.b() as java.lang.Boolean;
         var4;
         var1.resolve(NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("url", var2), v.a("isDeferred", var4)}));
      } else {
         var1.resolve(null);
      }
   }

   public open fun getName(): String {
      return "DeepLinkManager";
   }
}
