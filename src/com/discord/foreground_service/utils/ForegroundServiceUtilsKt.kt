package com.discord.foreground_service.utils

import M1.a
import android.app.Notification
import android.app.Service
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build.VERSION
import androidx.core.content.b
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import kotlin.jvm.internal.q

public fun hasMicrophonePermission(context: Context): Boolean {
   q.h(var0, "context");
   val var1: Boolean;
   if (b.a(var0, "android.permission.RECORD_AUDIO") == 0) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

internal fun Service.startForegroundCompat(context: Context, notificationId: Int, notification: Notification) {
   q.h(var0, "<this>");
   q.h(var1, "context");
   q.h(var3, "notification");
   if (VERSION.SDK_INT >= 29) {
      var var5: Int = 32;
      var var7: Int;
      if (VERSION.SDK_INT >= 30) {
         var7 = 128;
      } else {
         var7 = 32;
      }

      if (hasMicrophonePermission(var1)) {
         var5 = var7 or 32;
      }

      val var6: Int = var3.extras.getInt("permissionType", -1);
      if (var6 == ServiceNotificationConfiguration.Type.FILE_UPLOAD.ordinal()) {
         var7 = 1;
      } else if (var6 != ServiceNotificationConfiguration.Type.VOICE_CALL.ordinal()) {
         if (var6 != ServiceNotificationConfiguration.Type.SCREEN_SHARE.ordinal()) {
            throw new IllegalStateException("Unknown service type");
         }

         var7 = var5;
      }

      a.a(var0, var2, var3, var7);
   } else {
      var0.startForeground(var2, var3);
   }
}

internal fun Context.startForegroundServiceCompat(serviceIntent: Intent): ComponentName? {
   q.h(var0, "<this>");
   q.h(var1, "serviceIntent");
   val var2: ComponentName;
   if (VERSION.SDK_INT >= 26) {
      var2 = M1.b.a(var0, var1);
   } else {
      var2 = var0.startService(var1);
   }

   return var2;
}
