package com.discord.notifications.react

import com.discord.notifications.client.NotificationClient
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap
import kotlin.jvm.internal.q
import oh.r

public class PushNotificationCategoryModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public open fun getName(): String {
      return "DCDNotificationCategoryUtils";
   }

   @ReactMethod
   public fun registerNotificationCategories(localizedCategoryNames: ReadableMap) {
      q.h(var1, "localizedCategoryNames");
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      var3.initNotificationCategories(var2, NativeMapExtensionsKt.toStringMap(var1), r.h());
   }

   @ReactMethod
   public fun registerNotificationCategoriesAndGroups(localizedCategoryNames: ReadableMap, localizedGroupNames: ReadableMap) {
      q.h(var1, "localizedCategoryNames");
      q.h(var2, "localizedGroupNames");
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var4, "getReactApplicationContext(...)");
      var3.initNotificationCategories(var4, NativeMapExtensionsKt.toStringMap(var1), NativeMapExtensionsKt.toStringMap(var2));
   }

   @ReactMethod
   public fun registerNotificationReplyCategories(title: String, buttonTitle: String, inputPlaceholder: String, callback: Callback) {
      q.h(var1, "title");
      q.h(var2, "buttonTitle");
      q.h(var3, "inputPlaceholder");
      q.h(var4, "callback");
   }

   @ReactMethod
   public fun setIncomingRingtone(name: String) {
      q.h(var1, "name");
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      var3.setIncomingRingtone(var2, var1);
   }
}
