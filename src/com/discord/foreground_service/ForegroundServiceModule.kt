package com.discord.foreground_service

import com.discord.crash_reporting.CrashReporting
import com.discord.foreground_service.react.ForegroudServiceConfigurationParserKt
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import kotlin.jvm.internal.r

public class ForegroundServiceModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public open fun getName(): String {
      return "ForegroundServiceModule";
   }

   @ReactMethod
   public fun isServiceRunning(callback: Callback) {
      r.h(var1, "callback");
      var1.invoke(new Object[]{ForegroundServiceManager.INSTANCE.isRunning$foreground_service_release()});
   }

   @ReactMethod
   public fun startService(parameters: ReadableArray) {
      r.h(var1, "parameters");
      val var2: java.util.List = ForegroudServiceConfigurationParserKt.parseList(ServiceNotificationConfiguration.Companion, var1);
      if (var2.isEmpty()) {
         CrashReporting.addBreadcrumb$default(
            CrashReporting.INSTANCE, "Couldn't start ForegroundService, no service configurations provided.", null, null, 6, null
         );
      } else {
         ForegroundServiceManager.INSTANCE.onRequestServiceCreateOrUpdate$foreground_service_release(this.reactContext, var2);
      }
   }

   @ReactMethod
   public fun stopService() {
      ForegroundServiceManager.INSTANCE.onRequestServiceDestroy$foreground_service_release(this.reactContext);
   }
}
