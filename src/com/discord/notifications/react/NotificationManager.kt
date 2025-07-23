package com.discord.notifications.react

import com.discord.notifications.client.NotificationClient
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.r

public class NotificationManager(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   @ReactMethod
   public fun clearNotificationsForChannel(channelId: String) {
      r.h(var1, "channelId");
      val var2: NotificationClient = NotificationClient.Companion.getInstance();
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "getReactApplicationContext(...)");
      var2.ackReactionNotifications(var3, var1);
   }

   public open fun getName(): String {
      return "DCDNotificationManager";
   }

   @ReactMethod
   public fun setShowFullscreenCallUI(enabled: Boolean) {
      val var2: NotificationClient = NotificationClient.Companion.getInstance();
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "getReactApplicationContext(...)");
      var2.setShowFullscreenCallUI(var3, var1);
   }

   @ReactMethod
   public fun setShowMissedCallNotifications(enabled: Boolean) {
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "getReactApplicationContext(...)");
      var3.setShowMissedCallNotifications(var2, var1);
   }
}
