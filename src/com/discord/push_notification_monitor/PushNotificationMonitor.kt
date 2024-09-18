package com.discord.push_notification_monitor

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.a

public object PushNotificationMonitor {
   private const val MAX_PUSH_LOG_SIZE: Int = 100

   private fun writePushLog(context: Context, userId: String, pushLog: PushNotificationLog) {
      val var5: Editor = PushNotificationMonitorModule.Companion.getPushNotificationLogStorage(var1).edit();
      q.g(var5, "editor");
      val var4: a = Json.d;
      Json.d.a();
      var5.putString(var2, var4.c(PushNotificationLog.Companion.serializer(), var3));
      var5.apply();
   }

   public fun clearPushLog(context: Context) {
      q.h(var1, "context");
      val var2: SharedPreferences = PushNotificationMonitorModule.Companion.getPushNotificationLogStorage(var1);
      val var3: Editor = var2.edit();
      q.g(var3, "editor");
      val var4: java.util.Iterator = var2.getAll().keySet().iterator();

      while (var4.hasNext()) {
         var3.remove(var4.next() as java.lang.String);
      }

      var3.apply();
   }

   public fun getPushLog(context: Context, userId: String): PushNotificationLog {
      q.h(var1, "context");
      q.h(var2, "userId");
      val var4: SharedPreferences = PushNotificationMonitorModule.Companion.getPushNotificationLogStorage(var1);
      val var6: PushNotificationLog;
      if (var4.getString(var2, null) != null) {
         val var3: a = Json.d;
         var var5: java.lang.String = "";
         var2 = var4.getString(var2, "");
         if (var2 != null) {
            var5 = var2;
         }

         var3.a();
         var6 = var3.b(PushNotificationLog.Companion.serializer(), var5) as PushNotificationLog;
      } else {
         var6 = new PushNotificationLog(null, 1, null);
      }

      return var6;
   }

   public fun logPushNotification(context: Context, loggedInUserId: String, pushNotification: PushNotificationMeta) {
      q.h(var1, "context");
      q.h(var2, "loggedInUserId");
      q.h(var3, "pushNotification");
      val var4: java.util.List = i.T0(this.getPushLog(var1, var2).getPushNotifications());
      var4.add(var3);
      if (var4.size() == 100) {
         var4.remove(0);
      }

      this.writePushLog(var1, var2, new PushNotificationLog(var4));
   }
}
