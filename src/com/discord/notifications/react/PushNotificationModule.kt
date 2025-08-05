package com.discord.notifications.react

import A9.s
import B9.q
import W1.a
import W1.b
import W1.c
import W1.d
import com.discord.cache.Cache
import com.discord.notifications.client.NotificationClient
import com.discord.notifications.fcm.MessagingService
import com.discord.notifications.react.events.LocalNotificationEvent
import com.discord.notifications.react.events.NotificationEvent
import com.discord.notifications.react.events.RegisterEvent
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.WritableNativeMap
import com.facebook.react.common.LifecycleState
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r

public class PushNotificationModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(
         s.a("register", H.b(RegisterEvent.class)),
         s.a("notification", H.b(NotificationEvent.class)),
         s.a("localNotification", H.b(LocalNotificationEvent.class))
      );
      MessagingService.Companion.init();
      NotificationClient.Companion.getInstance().setShouldDisplayNotification(new a(this));
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: PushNotificationModule): Boolean {
      val var1: Boolean;
      if (var0.reactContext.getLifecycleState() != LifecycleState.RESUMED) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   @JvmStatic
   fun `registerEventListener$lambda$2`(var0: PushNotificationModule, var1: java.lang.String): Unit {
      r.h(var1, "token");
      var0.reactEvents.emitModuleEvent(var0.reactContext, new RegisterEvent(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `registerEventListener$lambda$3`(var0: PushNotificationModule, var1: java.util.Map): Unit {
      r.h(var1, "notification");
      var0.reactEvents.emitModuleEvent(var0.reactContext, new NotificationEvent(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `registerEventListener$lambda$4`(var0: PushNotificationModule, var1: java.util.Map): Unit {
      r.h(var1, "notification");
      var0.reactEvents.emitModuleEvent(var0.reactContext, new LocalNotificationEvent(var1));
      return Unit.a;
   }

   private fun updateAuthState() {
      val var2: Cache = Cache.Companion.get();
      var var1: Boolean = false;
      if (Cache.getToken$default(var2, false, 1, null) != null) {
         var1 = true;
      }

      val var4: NotificationClient = NotificationClient.Companion.getInstance();
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "getReactApplicationContext(...)");
      var4.setIsAuthed(var3, var1);
   }

   @ReactMethod
   public fun addListener(type: String) {
      r.h(var1, "type");
   }

   @ReactMethod
   public fun clearAllNotifications() {
      val var1: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "getReactApplicationContext(...)");
      var1.clearAllNotifications(var2);
   }

   @ReactMethod
   public fun getInitialNotification(promise: Promise) {
      r.h(var1, "promise");
      val var2: java.util.Map = NotificationClient.Companion.getInstance().getPendingNotification();
      val var3: WritableNativeMap;
      if (var2 != null) {
         var3 = NativeMapExtensionsKt.toNativeMap(var2);
      } else {
         var3 = null;
      }

      var1.resolve(var3);
   }

   @ReactMethod
   public fun getLightsEnabled(promise: Promise) {
      r.h(var1, "promise");
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "getReactApplicationContext(...)");
      var1.resolve(var3.isLightsEnabled(var2));
   }

   public open fun getName(): String {
      return "PushNotificationAndroid";
   }

   @ReactMethod
   public fun getSoundsEnabled(promise: Promise) {
      r.h(var1, "promise");
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "getReactApplicationContext(...)");
      var1.resolve(var3.isSoundsEnabled(var2));
   }

   @ReactMethod
   public fun getVibrationsEnabled(promise: Promise) {
      r.h(var1, "promise");
      val var2: NotificationClient = NotificationClient.Companion.getInstance();
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "getReactApplicationContext(...)");
      var1.resolve(var2.isVibrationsEnabled(var3));
   }

   @ReactMethod
   public fun handleDirectReplySuccess(notificationString: String) {
      r.h(var1, "notificationString");
      val var2: NotificationClient = NotificationClient.Companion.getInstance();
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "getReactApplicationContext(...)");
      var2.onDirectReplySuccess(var3, var1);
   }

   @ReactMethod
   public fun markNotificationAsDirectReply(channelId: String) {
      r.h(var1, "channelId");
      val var5: java.lang.Long = h.o(var1);
      if (var5 != null) {
         val var2: Long = var5.longValue();
         val var6: NotificationClient = NotificationClient.Companion.getInstance();
         val var4: ReactApplicationContext = this.getReactApplicationContext();
         r.g(var4, "getReactApplicationContext(...)");
         var6.markNotificationAsDirectReply(var4, var2);
      }
   }

   @ReactMethod
   public fun onRegisterNotificationToken() {
      this.updateAuthState();
   }

   @ReactMethod
   public fun presentLocalNotification(details: ReadableMap) {
      r.h(var1, "details");
      val var5: HashMap = var1.toHashMap();
      val var2: LinkedHashMap = new LinkedHashMap();

      for (Entry var3 : var5.entrySet()) {
         if (var3.getValue() != null) {
            var2.put(var3.getKey(), var3.getValue());
         }
      }

      val var7: LinkedHashMap = new LinkedHashMap(q.d(var2.size()));

      for (Entry var4 : var2.entrySet()) {
         val var8: Any = var4.getKey();
         val var10: Any = var4.getValue();
         r.e(var10);
         var7.put(var8, var10);
      }

      NotificationClient.Companion.getInstance().showLocalNotification(this.reactContext, var7);
   }

   @ReactMethod
   public fun registerEventListener(type: String) {
      r.h(var1, "type");
      val var2: Int = var1.hashCode();
      if (var2 != -690213213) {
         if (var2 != -145165322) {
            if (var2 == 595233003 && var1.equals("notification")) {
               NotificationClient.Companion.getInstance().setNotificationListener(new c(this));
               return;
            }
         } else if (var1.equals("localNotification")) {
            NotificationClient.Companion.getInstance().setLocalNotificationListener(new d(this));
            return;
         }
      } else if (var1.equals("register")) {
         NotificationClient.Companion.getInstance().setTokenListener(new b(this));
         return;
      }

      val var3: StringBuilder = new StringBuilder();
      var3.append("Unknown event type: ");
      var3.append(var1);
      throw new IllegalArgumentException(var3.toString());
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun setCurrentUser(username: String?, userId: String?) {
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var4, "getReactApplicationContext(...)");
      var3.setCurrentUser(var4, var1, var2);
   }

   @ReactMethod
   public fun setLightsEnabled(enabled: Boolean) {
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "getReactApplicationContext(...)");
      var3.setLightsEnabled(var2, var1);
   }

   @ReactMethod
   public fun setNotifyEveryTime(notifyEveryTime: Boolean) {
      val var3: NotificationClient = NotificationClient.Companion.getInstance();
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "getReactApplicationContext(...)");
      var3.setNotifyEveryTime(var2, var1);
   }

   @ReactMethod
   public fun setSoundsEnabled(enabled: Boolean) {
      val var2: NotificationClient = NotificationClient.Companion.getInstance();
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "getReactApplicationContext(...)");
      var2.setSoundsEnabled(var3, var1);
   }

   @ReactMethod
   public fun setVibrationsEnabled(enabled: Boolean) {
      val var2: NotificationClient = NotificationClient.Companion.getInstance();
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "getReactApplicationContext(...)");
      var2.setVibrationsEnabled(var3, var1);
   }

   @ReactMethod
   public fun shouldNotifyEveryTime(promise: Promise) {
      r.h(var1, "promise");
      val var2: NotificationClient = NotificationClient.Companion.getInstance();
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "getReactApplicationContext(...)");
      var1.resolve(var2.shouldNotifyEveryTime(var3));
   }

   public companion object {
      private const val EVENT_TYPE_REGISTER: String
      private const val EVENT_TYPE_NOTIFICATION: String
      private const val EVENT_TYPE_NOTIFICATION_LOCAL: String
   }
}
