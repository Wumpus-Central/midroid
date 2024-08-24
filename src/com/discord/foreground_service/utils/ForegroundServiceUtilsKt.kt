package com.discord.foreground_service.utils

import android.app.Notification
import android.app.Service
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build.VERSION
import androidx.work.impl.foreground.c
import kotlin.jvm.internal.r

internal fun Service.startForegroundCompat(notificationId: Int, notification: Notification) {
   r.h(var0, "<this>");
   r.h(var2, "notification");
   if (VERSION.SDK_INT >= 29) {
      c.a(var0, var1, var2, 32);
   } else {
      var0.startForeground(var1, var2);
   }
}

internal fun Context.startForegroundServiceCompat(serviceIntent: Intent): ComponentName? {
   r.h(var0, "<this>");
   r.h(var1, "serviceIntent");
   val var2: ComponentName;
   if (VERSION.SDK_INT >= 26) {
      var2 = androidx.core.content.c.a(var0, var1);
   } else {
      var2 = var0.startService(var1);
   }

   return var2;
}
