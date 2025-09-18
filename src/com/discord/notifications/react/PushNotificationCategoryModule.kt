package com.discord.notifications.react

import com.discord.notifications.client.NotificationClient
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap

public class PushNotificationCategoryModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   public open fun getName(): String {
      return "DCDNotificationCategoryUtils";
   }

   @ReactMethod
   public fun registerNotificationCategories(localizedCategoryNames: ReadableMap) {
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      var3.initNotificationCategories(var2, NativeMapExtensionsKt.toStringMap(var1), L.h());
   }

   @ReactMethod
   public fun registerNotificationCategoriesAndGroups(localizedCategoryNames: ReadableMap, localizedGroupNames: ReadableMap) {
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      var3.initNotificationCategories(var4, NativeMapExtensionsKt.toStringMap(var1), NativeMapExtensionsKt.toStringMap(var2));
   }

   @ReactMethod
   public fun registerNotificationReplyCategories(title: String, buttonTitle: String, inputPlaceholder: String, callback: Callback) {
   }

   @ReactMethod
   public fun setIncomingRingtone(name: String) {
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      var3.setIncomingRingtone(var2, var1);
   }
}
