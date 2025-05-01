package com.discord.codegen;

import Q2.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativePushNotificationMonitorModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativePushNotificationMonitorModule";

   public NativePushNotificationMonitorModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void clearLogs();

   public String getName() {
      return "NativePushNotificationMonitorModule";
   }

   @ReactMethod
   @a
   public abstract void getPushNotificationLogs(String var1, Promise var2);
}
