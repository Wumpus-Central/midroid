package com.discord.foreground_service.utils

import android.app.Notification
import android.app.Service
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build.VERSION
import d5.a
import d5.b
import kotlin.jvm.internal.q

internal fun Service.startForegroundCompat(notificationId: Int, notification: Notification) {
   q.h(var0, "<this>");
   q.h(var2, "notification");
   val var4: Int = VERSION.SDK_INT;
   if (VERSION.SDK_INT >= 29) {
      var var3: Short;
      val var5: Int = var2.extras.getInt("permissionType", -1);
      var3 = 1;
      label20:
      if (var5 != 0) {
         if (var5 != 1) {
            if (var5 != 2) {
               throw new IllegalStateException("Unknown service type".toString());
            }
         } else if (var4 >= 30) {
            var3 = 128;
            break label20;
         }

         var3 = 32;
      }

      b.a(var0, var1, var2, var3);
   } else {
      var0.startForeground(var1, var2);
   }
}

internal fun Context.startForegroundServiceCompat(serviceIntent: Intent): ComponentName? {
   q.h(var0, "<this>");
   q.h(var1, "serviceIntent");
   val var2: ComponentName;
   if (VERSION.SDK_INT >= 26) {
      var2 = a.a(var0, var1);
   } else {
      var2 = var0.startService(var1);
   }

   return var2;
}
