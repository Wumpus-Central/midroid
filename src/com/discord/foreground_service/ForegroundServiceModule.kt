package com.discord.foreground_service

import com.discord.foreground_service.react.ForegroudServiceConfigurationParserKt
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.discord.foreground_service.utils.Log
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray

public class ForegroundServiceModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   public open fun getName(): String {
      return "ForegroundServiceModule";
   }

   @ReactMethod
   public fun isServiceRunning(callback: Callback) {
      var1.invoke(new Object[]{ForegroundServiceManager.INSTANCE.isRunning$foreground_service_release()});
   }

   @ReactMethod
   public fun startService(parameters: ReadableArray) {
      val var3: java.util.List = ForegroudServiceConfigurationParserKt.parseList(ServiceNotificationConfiguration.Companion, var1);
      val var5: Log = Log.INSTANCE;
      val var2: Int = var3.size();
      val var4: StringBuilder = new StringBuilder();
      var4.append("startService: ForegroundService with ");
      var4.append(var2);
      var4.append(" configurations");
      Log.i$foreground_service_release$default(var5, var4.toString(), null, 2, null);
      if (var3.isEmpty()) {
         Log.i$foreground_service_release$default(var5, "Couldn't start ForegroundService, no service configurations provided.", null, 2, null);
      } else {
         ForegroundServiceManager.INSTANCE.onRequestServiceCreateOrUpdate$foreground_service_release(this.reactContext, var3);
      }
   }

   @ReactMethod
   public fun stopService() {
      Log.i$foreground_service_release$default(Log.INSTANCE, "stopService: Stopping ForegroundService", null, 2, null);
      ForegroundServiceManager.INSTANCE.onRequestServiceDestroy$foreground_service_release(this.reactContext);
   }
}
