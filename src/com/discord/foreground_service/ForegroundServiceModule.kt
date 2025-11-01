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

   public override fun getName(): String {
      return "ForegroundServiceModule";
   }

   @ReactMethod
   public fun isServiceRunning(callback: Callback) {
      var1.invoke(ForegroundServiceManager.INSTANCE.isRunning$foreground_service_release());
   }

   @ReactMethod
   public fun startService(parameters: ReadableArray) {
      val var5: java.util.List = ForegroudServiceConfigurationParserKt.parseList(ServiceNotificationConfiguration.Companion, var1);
      val var4: Log = Log.INSTANCE;
      val var2: Int = var5.size();
      val var3: StringBuilder = new StringBuilder();
      var3.append("startService: ForegroundService with ");
      var3.append(var2);
      var3.append(" configurations");
      Log.i$foreground_service_release$default(var4, var3.toString(), null, 2, null);
      if (var5.isEmpty()) {
         Log.i$foreground_service_release$default(var4, "Couldn't start ForegroundService, no service configurations provided.", null, 2, null);
      } else {
         ForegroundServiceManager.INSTANCE.onRequestServiceCreateOrUpdate$foreground_service_release(this.reactContext, var5);
      }
   }

   @ReactMethod
   public fun stopService() {
      Log.i$foreground_service_release$default(Log.INSTANCE, "stopService: Stopping ForegroundService", null, 2, null);
      ForegroundServiceManager.INSTANCE.onRequestServiceDestroy$foreground_service_release(this.reactContext);
   }
}
