package com.discord.push_notification_monitor

import android.content.Context
import android.content.SharedPreferences
import com.discord.codegen.NativePushNotificationMonitorModuleSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.a

@SourceDebugExtension(["SMAP\nPushNotificationMonitorModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushNotificationMonitorModule.kt\ncom/discord/push_notification_monitor/PushNotificationMonitorModule\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,29:1\n113#2:30\n*S KotlinDebug\n*F\n+ 1 PushNotificationMonitorModule.kt\ncom/discord/push_notification_monitor/PushNotificationMonitorModule\n*L\n15#1:30\n*E\n"])
public class PushNotificationMonitorModule(reactContext: ReactApplicationContext) : NativePushNotificationMonitorModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   public override fun clearLogs() {
      PushNotificationMonitor.INSTANCE.clearPushLog(this.reactContext);
   }

   public override fun getPushNotificationLogs(userId: String, promise: Promise) {
      val var3: a = Json.d;
      val var4: PushNotificationLog = PushNotificationMonitor.INSTANCE.getPushLog(this.reactContext, var1);
      var3.a();
      var2.resolve(var3.c(PushNotificationLog.Companion.serializer(), var4));
   }

   public companion object {
      public fun getPushNotificationLogStorage(context: Context): SharedPreferences {
         val var2: SharedPreferences = var1.getSharedPreferences("push_notification_monitor", 0);
         return var2;
      }
   }
}
