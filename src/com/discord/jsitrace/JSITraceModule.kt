package com.discord.jsitrace

import com.discord.react.utilities.ReactContextExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import kotlin.jvm.internal.q

@ReactModule(name = "JSITrace")
public class JSITraceModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   private external fun nativeInstall(jsi: Long) {
   }

   public open fun getName(): String {
      return "JSITrace";
   }

   @ReactMethod(isBlockingSynchronousMethod = true)
   public fun install(): Boolean {
      if (!this.isEnabled()) {
         return false;
      } else {
         val var5: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var5, "getReactApplicationContext(...)");
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
      val var1: JSITraceCache = JSITraceCache.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      return var1.isEnabled(var2);
   }

   @ReactMethod
   public fun setEnabled(enabled: Boolean) {
      val var2: JSITraceCache = JSITraceCache.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      var2.setEnabled(var3, var1);
   }

   public companion object {
      public const val NAME: String
   }
}
