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
         val var3: ReactApplicationContext = this.getReactApplicationContext();
         val var1: CallInvokerHolder = var3.getCatalystInstance().getJSCallInvokerHolder();
         val var2: JavaScriptContextHolder = var3.getJavaScriptContextHolder();
         this.jniBridgeJSIFunctions(var3, var2.get(), var1);
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
