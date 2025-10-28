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
         val var2: ReactApplicationContext = this.getReactApplicationContext();
         val var3: CallInvokerHolder = var2.getCatalystInstance().getJSCallInvokerHolder();
         val var4: JavaScriptContextHolder = var2.getJavaScriptContextHolder();
         this.jniBridgeJSIFunctions(var2, var4.get(), var3);
      } catch (var5: Exception) {
         return false;
      }

      return true;
   }

   public override fun getName(): String {
      return "LibDiscoreModule";
   }

   public companion object {
      public const val NAME: String
   }
}
