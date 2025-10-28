package com.discord.jsitrace

import com.discord.react.utilities.ReactContextExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = "JSITrace")
public class JSITraceModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private external fun nativeInstall(jsi: Long) {
   }

   public override fun getName(): String {
      return "JSITrace";
   }

   @ReactMethod(isBlockingSynchronousMethod = true)
   public fun install(): Boolean {
      if (!this.isEnabled()) {
         return false;
      } else {
         val var5: ReactApplicationContext = this.getReactApplicationContext();
         val var8: java.lang.Long = ReactContextExtensionsKt.jsiId(var5);
         var var7: Boolean = false;
         if (var8 != null) {
            val var3: Long = var8;

            try {
               System.loadLibrary("jsitrace");
               this.nativeInstall(var3);
            } catch (var6: Exception) {
               return false;
            }

            var7 = true;
         }

         return var7;
      }
   }

   @ReactMethod(isBlockingSynchronousMethod = true)
   public fun isEnabled(): Boolean {
      val var2: JSITraceCache = JSITraceCache.INSTANCE;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      return var2.isEnabled(var1);
   }

   @ReactMethod
   public fun setEnabled(enabled: Boolean) {
      val var3: JSITraceCache = JSITraceCache.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      var3.setEnabled(var2, var1);
   }

   public companion object {
      public const val NAME: String
   }
}
