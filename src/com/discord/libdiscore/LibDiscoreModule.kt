package com.discord.libdiscore

import com.facebook.react.bridge.JavaScriptContextHolder
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder

public class LibDiscoreModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private external fun jniBridgeJSIFunctions(context: ReactApplicationContext, jsiPtr: Long, callInvokerHolder: CallInvokerHolder) {
   }

   private external fun jniInitLibDiscore(cacheBasePath: String) {
   }

   @ReactMethod(isBlockingSynchronousMethod = true)
   public fun bridgeJSIFunctions(): Boolean {
      try {
         val var1: ReactApplicationContext = this.getReactApplicationContext();
         val var2: CallInvokerHolder = var1.getCatalystInstance().getJSCallInvokerHolder();
         val var3: JavaScriptContextHolder = var1.getJavaScriptContextHolder();
         this.jniBridgeJSIFunctions(var1, var3.get(), var2);
         return true;
      } catch (var4: Exception) {
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
