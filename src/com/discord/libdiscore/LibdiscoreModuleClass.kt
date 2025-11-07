package com.discord.libdiscore

import android.content.Context
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder
import java.io.File
import java.util.concurrent.atomic.AtomicBoolean

public open class LibdiscoreModuleClass {
   private final val isInit: AtomicBoolean = new AtomicBoolean(false)

   private external fun jniBridgeJSIFunctions(context: ReactApplicationContext, jsiPtr: Long, callInvokerHolder: CallInvokerHolder) {
   }

   private external fun jniGetConfigTreatmentId(experimentName: String): Int {
   }

   private external fun jniInitLibDiscore(cacheBasePath: String) {
   }

   public fun bridgeJSIFunctions(context: ReactApplicationContext, jsiPtr: Long, callInvokerHolder: CallInvokerHolder) {
      if (this.isInit.get()) {
         this.jniBridgeJSIFunctions(var1, var2, var4);
      } else {
         throw new IllegalStateException("LibdiscoreModule not initialized. Call LibdiscoreModule.init(context) first.");
      }
   }

   public fun getConfigTreatmentId(experimentName: String): Int {
      if (this.isInit.get()) {
         return this.jniGetConfigTreatmentId(var1);
      } else {
         throw new IllegalStateException("LibdiscoreModule not initialized. Call LibdiscoreModule.init(context) first.");
      }
   }

   public fun init(context: Context) {
      if (!this.isInit.get()) {
         var var2: File;
         try {
            System.loadLibrary("libdiscore-rn-jsi-module");
            var2 = new File(var1.getCacheDir(), "libdiscore");
            if (!var2.exists()) {
               var2.mkdirs();
            }
         } catch (var4: Exception) {
            var4.printStackTrace();
            return;
         }

         try {
            val var5: java.lang.String = var2.getAbsolutePath();
            this.jniInitLibDiscore(var5);
            this.isInit.set(true);
         } catch (var3: Exception) {
            var3.printStackTrace();
         }
      }
   }
}
