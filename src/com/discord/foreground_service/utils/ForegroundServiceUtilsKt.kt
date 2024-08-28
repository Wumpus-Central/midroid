package com.discord.foreground_service.utils

import android.app.Notification
import android.app.Service
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build.VERSION
import kotlin.jvm.internal.q
import t4.a
import t4.b

internal fun Service.startForegroundCompat(notificationId: Int, notification: Notification) {
   q.h(var0, "<this>");
   q.h(var2, "notification");
   if (VERSION.SDK_INT >= 29) {
      b.a(var0, var1, var2, 32);
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
