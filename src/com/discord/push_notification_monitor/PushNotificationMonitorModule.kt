package com.discord.push_notification_monitor

import android.content.Context
import android.content.SharedPreferences
import androidx.core.app.NotificationManagerCompat
import com.discord.codegen.NativePushNotificationMonitorManagerSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json

public class PushNotificationMonitorModule(reactContext: ReactApplicationContext) : NativePushNotificationMonitorManagerSpec {
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public open fun areNotificationsEnabled(promise: Promise) {
      r.h(var1, "promise");
      var1.resolve(NotificationManagerCompat.g(this.reactContext).a());
   }

   public open fun clearLogs() {
      PushNotificationMonitor.INSTANCE.clearPushLog(this.reactContext);
   }

   public open fun getPushNotificationLogs(userId: String, promise: Promise) {
      r.h(var1, "userId");
      r.h(var2, "promise");
      val var3: Json.a = Json.d;
      val var4: PushNotificationLog = PushNotificationMonitor.INSTANCE.getPushLog(this.reactContext, var1);
      var3.a();
      var2.resolve(var3.c(PushNotificationLog.Companion.serializer(), var4));
   }

   public companion object {
      public const val NAME: String

      public fun getPushNotificationLogStorage(context: Context): SharedPreferences {
         r.h(var1, "context");
         val var2: SharedPreferences = var1.getSharedPreferences("push_notification_monitor", 0);
         r.g(var2, "context.getSharedPrefere…r\", Context.MODE_PRIVATE)");
         return var2;
      }
   }
}
