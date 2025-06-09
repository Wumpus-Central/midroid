package com.discord.notifications.react

import com.discord.notifications.client.NotificationClient
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.q

public class NotificationManager(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   @ReactMethod
   public fun clearNotificationsForChannel(channelId: String) {
      q.h(var1, "channelId");
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      var3.ackReactionNotifications(var2, var1);
   }

   public open fun getName(): String {
      return "DCDNotificationManager";
   }

   @ReactMethod
   public fun setShowFullscreenCallUI(enabled: Boolean) {
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      var3.setShowFullscreenCallUI(var2, var1);
   }

   @ReactMethod
   public fun setShowMissedCallNotifications(enabled: Boolean) {
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      var3.setShowMissedCallNotifications(var2, var1);
   }
}
