package com.discord.notifications.react

import com.discord.notifications.client.NotificationClient
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

public class NotificationManager(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   @ReactMethod
   public fun clearNotificationsForChannel(channelId: String) {
      val var2: NotificationClient = NotificationClient.Companion.getInstance();
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      var2.ackReactionNotifications(var3, var1);
   }

   public open fun getName(): String {
      return "DCDNotificationManager";
   }

   @ReactMethod
   public fun setShowFullscreenCallUI(enabled: Boolean) {
   }

   @ReactMethod
   public fun setShowMissedCallNotifications(enabled: Boolean) {
   }
}
