package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import n6.a;

public abstract class NativePushNotificationMonitorManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNNativePushNotificationMonitor";

   public NativePushNotificationMonitorManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void areNotificationsEnabled(Promise var1);

   @ReactMethod
   @a
   public abstract void clearLogs();

   public String getName() {
      return "RTNNativePushNotificationMonitor";
   }

   @ReactMethod
   @a
   public abstract void getPushNotificationLogs(String var1, Promise var2);
}
