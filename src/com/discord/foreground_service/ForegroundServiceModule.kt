package com.discord.foreground_service

import com.discord.foreground_service.react.ForegroudServiceConfigurationParserKt
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import kotlin.jvm.internal.q

public class ForegroundServiceModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public open fun getName(): String {
      return "ForegroundServiceModule";
   }

   @ReactMethod
   public fun isServiceRunning(callback: Callback) {
      q.h(var1, "callback");
      var1.invoke(new Object[]{ForegroundServiceManager.Companion.getInstance().isRunning$foreground_service_release()});
   }

   @ReactMethod
   public fun startService(parameters: ReadableArray) {
      q.h(var1, "parameters");
      ForegroundServiceManager.Companion
         .getInstance()
         .startService$foreground_service_release(
            this.reactContext, ForegroudServiceConfigurationParserKt.parseList(ServiceNotificationConfiguration.Companion, var1)
         );
   }

   @ReactMethod
   public fun stopService() {
      ForegroundServiceManager.Companion.getInstance().stopService$foreground_service_release(this.reactContext);
   }
}
