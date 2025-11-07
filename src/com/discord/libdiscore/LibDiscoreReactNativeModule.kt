package com.discord.libdiscore

import com.facebook.react.bridge.BaseJavaModule
import com.facebook.react.bridge.JavaScriptContextHolder
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder

public class LibDiscoreReactNativeModule(reactContext: ReactApplicationContext) : BaseJavaModule(var1) {
   @ReactMethod(isBlockingSynchronousMethod = true)
   public fun bridgeJSIFunctions(): Boolean {
      try {
         val var1: ReactApplicationContext = this.getReactApplicationContext();
         val var2: CallInvokerHolder = var1.getCatalystInstance().getJSCallInvokerHolder();
         val var4: LibdiscoreModule = LibdiscoreModule.INSTANCE;
         val var3: JavaScriptContextHolder = var1.getJavaScriptContextHolder();
         var4.bridgeJSIFunctions(var1, var3.get(), var2);
         return true;
      } catch (var5: Exception) {
         return false;
      }
   }

   public override fun getName(): String {
      return "LibDiscoreModule";
   }

   public companion object {
      public const val NAME: String
   }
}
