package com.discord.push_notification_monitor

import android.content.Context
import android.content.SharedPreferences
import androidx.core.app.NotificationManagerCompat
import com.discord.codegen.NativePushNotificationMonitorManagerSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.a

public class PushNotificationMonitorModule(reactContext: ReactApplicationContext) : NativePushNotificationMonitorManagerSpec {
   private final val reactContext: ReactApplicationContext

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public open fun areNotificationsEnabled(promise: Promise) {
      q.h(var1, "promise");
      var1.resolve(NotificationManagerCompat.g(this.reactContext).a());
   }

   public open fun clearLogs() {
      PushNotificationMonitor.INSTANCE.clearPushLog(this.reactContext);
   }

   public open fun getPushNotificationLogs(userId: String, promise: Promise) {
      q.h(var1, "userId");
      q.h(var2, "promise");
      val var3: a = Json.d;
      val var4: PushNotificationLog = PushNotificationMonitor.INSTANCE.getPushLog(this.reactContext, var1);
      var3.a();
      var2.resolve(var3.c(PushNotificationLog.Companion.serializer(), var4));
   }

   public companion object {
      public const val NAME: String

      public fun getPushNotificationLogStorage(context: Context): SharedPreferences {
         q.h(var1, "context");
         val var2: SharedPreferences = var1.getSharedPreferences("push_notification_monitor", 0);
         q.g(var2, "getSharedPreferences(...)");
         return var2;
      }
   }
}
