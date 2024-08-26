package com.discord.jsitrace

import com.discord.react.utilities.ReactContextExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import kotlin.jvm.internal.r

@ReactModule(name = "JSITrace")
public class JSITraceModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   private external fun nativeInstall(jsi: Long) {
   }

   public open fun getName(): String {
      return "JSITrace";
   }

   @ReactMethod(isBlockingSynchronousMethod = true)
   public fun install(): Boolean {
      val var1: Boolean = false;

      try {
         if (!this.isEnabled()) {
            return var1;
         }

         System.loadLibrary("jsitrace");
         val var3: ReactApplicationContext = this.getReactApplicationContext();
         r.g(var3, "reactApplicationContext");
         this.nativeInstall(ReactContextExtensionsKt.jsiId(var3));
      } catch (var4: Exception) {
         return false;
      }

      return true;
   }

   @ReactMethod(isBlockingSynchronousMethod = true)
   public fun isEnabled(): Boolean {
      val var1: JSITraceCache = JSITraceCache.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "reactApplicationContext");
      return var1.isEnabled(var2);
   }

   @ReactMethod
   public fun setEnabled(enabled: Boolean) {
      val var3: JSITraceCache = JSITraceCache.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "reactApplicationContext");
      var3.setEnabled(var2, var1);
   }

   public companion object {
      public const val NAME: String
   }
}
