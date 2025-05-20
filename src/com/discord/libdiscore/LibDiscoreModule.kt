package com.discord.libdiscore

import com.facebook.react.bridge.JavaScriptContextHolder
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import java.io.File
import kotlin.jvm.internal.q

public class LibDiscoreModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);

      try {
         System.loadLibrary("libdiscore-rn-jsi-module");
         var4 = new File(this.getReactApplicationContext().getCacheDir(), "libdiscore");
         if (!var4.exists()) {
            var4.mkdirs();
         }
      } catch (var3: Exception) {
         var3.printStackTrace();
         return;
      }

      try {
         val var5: java.lang.String = var4.getAbsolutePath();
         q.g(var5, "getAbsolutePath(...)");
         this.jniInitLibDiscore(var5);
      } catch (var2: Exception) {
         var2.printStackTrace();
      }
   }

   private external fun jniBridgeJSIFunctions(context: ReactApplicationContext, jsiPtr: Long) {
   }

   private external fun jniInitLibDiscore(cacheBasePath: String) {
   }

   @ReactMethod(isBlockingSynchronousMethod = true)
   public fun bridgeJSIFunctions(): Boolean {
      try {
         val var2: ReactApplicationContext = this.getReactApplicationContext();
         q.e(var2);
         val var3: JavaScriptContextHolder = var2.getJavaScriptContextHolder();
         q.e(var3);
         this.jniBridgeJSIFunctions(var2, var3.get());
      } catch (var4: Exception) {
         return false;
      }

      return true;
   }

   public open fun getName(): String {
      return "LibDiscoreModule";
   }

   public companion object {
      public const val NAME: String
   }
}
