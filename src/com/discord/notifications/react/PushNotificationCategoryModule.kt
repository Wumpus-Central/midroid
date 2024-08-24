package com.discord.notifications.react

import com.discord.notifications.client.NotificationClient
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap
import fh.s
import kotlin.jvm.internal.r

public class PushNotificationCategoryModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun getName(): String {
      return "DCDNotificationCategoryUtils";
   }

   @ReactMethod
   public fun registerNotificationCategories(localizedCategoryNames: ReadableMap) {
      r.h(var1, "localizedCategoryNames");
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "reactApplicationContext");
      var3.initNotificationCategories(var2, NativeMapExtensionsKt.toStringMap(var1), s.h());
   }

   @ReactMethod
   public fun registerNotificationCategoriesAndGroups(localizedCategoryNames: ReadableMap, localizedGroupNames: ReadableMap) {
      r.h(var1, "localizedCategoryNames");
      r.h(var2, "localizedGroupNames");
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var4, "reactApplicationContext");
      var3.initNotificationCategories(var4, NativeMapExtensionsKt.toStringMap(var1), NativeMapExtensionsKt.toStringMap(var2));
   }

   @ReactMethod
   public fun registerNotificationReplyCategories(title: String, buttonTitle: String, inputPlaceholder: String, callback: Callback) {
      r.h(var1, "title");
      r.h(var2, "buttonTitle");
      r.h(var3, "inputPlaceholder");
      r.h(var4, "callback");
   }

   @ReactMethod
   public fun setIncomingRingtone(name: String) {
      r.h(var1, "name");
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "reactApplicationContext");
      var3.setIncomingRingtone(var2, var1);
   }
}
