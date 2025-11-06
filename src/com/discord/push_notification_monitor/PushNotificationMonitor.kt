package com.discord.push_notification_monitor

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.a

@SourceDebugExtension(["SMAP\nPushNotificationMonitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushNotificationMonitor.kt\ncom/discord/push_notification_monitor/PushNotificationMonitor\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n123#2:74\n113#2:95\n41#3,6:75\n47#3,6:83\n41#3,6:89\n47#3,6:96\n1863#4,2:81\n*S KotlinDebug\n*F\n+ 1 PushNotificationMonitor.kt\ncom/discord/push_notification_monitor/PushNotificationMonitor\n*L\n35#1:74\n53#1:95\n43#1:75,6\n43#1:83,6\n52#1:89,6\n52#1:96,6\n44#1:81,2\n*E\n"])
public object PushNotificationMonitor {
   private const val MAX_PUSH_LOG_SIZE: Int = 100

   private fun writePushLog(context: Context, userId: String, pushLog: PushNotificationLog) {
      val var5: Editor = PushNotificationMonitorModule.Companion.getPushNotificationLogStorage(var1).edit();
      val var4: a = Json.d;
      Json.d.a();
      var5.putString(var2, var4.c(PushNotificationLog.Companion.serializer(), var3));
      var5.apply();
   }

   public fun clearPushLog(context: Context) {
      val var2: SharedPreferences = PushNotificationMonitorModule.Companion.getPushNotificationLogStorage(var1);
      val var3: Editor = var2.edit();
      val var4: java.util.Iterator = var2.getAll().keySet().iterator();

      while (var4.hasNext()) {
         var3.remove(var4.next() as java.lang.String);
      }

      var3.apply();
   }

   public fun getPushLog(context: Context, userId: String): PushNotificationLog {
      val var4: SharedPreferences = PushNotificationMonitorModule.Companion.getPushNotificationLogStorage(var1);
      if (var4.getString(var2, null) != null) {
         val var3: a = Json.d;
         var var5: java.lang.String = "";
         var2 = var4.getString(var2, "");
         if (var2 != null) {
            var5 = var2;
         }

         var3.a();
         return var3.b(PushNotificationLog.Companion.serializer(), var5) as PushNotificationLog;
      } else {
         return new PushNotificationLog(null, 1, null);
      }
   }

   public fun logPushNotification(context: Context, loggedInUserId: String, pushNotification: PushNotificationMeta) {
      val var4: java.util.List = CollectionsKt.k1(this.getPushLog(var1, var2).getPushNotifications());
      var4.add(var3);
      if (var4.size() == 100) {
         var4.remove(0);
      }

      this.writePushLog(var1, var2, new PushNotificationLog(var4));
   }
}
