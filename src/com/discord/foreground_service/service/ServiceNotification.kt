package com.discord.foreground_service.service

import android.app.Notification
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.os.Build.VERSION
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.NotificationCompat.Builder
import com.discord.foreground_service.utils.ForegroundServiceUtilsKt
import com.discord.notifications.actions.intents.GenericAction
import com.discord.notifications.actions.intents.NotificationAction.DefaultImpls
import com.discord.notifications.renderer.R.drawable
import hh.a
import java.util.Comparator
import kotlin.jvm.internal.r

internal object ServiceNotification {
   private const val FOREGROUND_NOTIFICATION_CHANNEL: String = "mediaConnections"
   private const val FOREGROUND_NOTIFICATION_ID: Int = 8761
   private const val FOREGROUND_NOTIFICATION_LIMIT: Int = 5
   private const val FOREGROUND_NOTIFICATION_TAG: String = "FOREGROUND_NOTIFICATION_TAG"

   private final val notificationManagerCompat: NotificationManagerCompat
      private final get() {
         val var2: NotificationManagerCompat = NotificationManagerCompat.g(var1);
         r.g(var2, "from(this)");
         return var2;
      }


   private fun buildNotification(context: Context, serviceNotificationConfiguration: ServiceNotificationConfiguration): Notification {
      val var4: Builder = new Builder(var1, "mediaConnections").x(var2.getTitle()).w(var2.getContent());
      val var3: ServiceNotificationConfiguration.Action = var2.getContentAction();
      val var7: PendingIntent;
      if (var3 != null) {
         var7 = DefaultImpls.toPendingIntent$default(new GenericAction(var3.getTag(), var3.getTaskName(), var3.getData()), var1, 0, true, 2, null);
      } else {
         var7 = null;
      }

      val var8: Builder = var4.v(var7).S(drawable.ic_notification_24dp).J(true).R(true);

      for (ServiceNotificationConfiguration.Action var9 : var2.getAuxiliaryActions()) {
         var8.a(
            0,
            var9.getTitle(),
            DefaultImpls.toPendingIntent$default(new GenericAction(var9.getTag(), var9.getTaskName(), var9.getData()), var1, 0, false, 2, null)
         );
      }

      val var5: Notification = var8.g();
      r.g(var5, "Builder(context, FOREGRO…   }\n            .build()");
      return var5;
   }

   public fun Context.clearNotifications() {
      r.h(var1, "<this>");

      for (int var2 = 0; var2 < 6; var2++) {
         this.getNotificationManagerCompat(var1).b("FOREGROUND_NOTIFICATION_TAG", var2);
      }
   }

   public fun Service.startForegroundCompat(context: Context, serviceNotificationConfigurations: List<ServiceNotificationConfiguration>) {
      r.h(var1, "<this>");
      r.h(var2, "context");
      r.h(var3, "serviceNotificationConfigurations");
      var3 = h.D0(var3, new Comparator() {
         @Override
         public final int compare(T var1, T var2) {
            return a.d((var1 as ServiceNotificationConfiguration).getPriority(), (var2 as ServiceNotificationConfiguration).getPriority());
         }
      });
      var var6: ServiceNotificationConfiguration = h.Z(var3) as ServiceNotificationConfiguration;
      var3 = h.R(var3, 1);
      ForegroundServiceUtilsKt.startForegroundCompat(var1, 8761, this.buildNotification(var2, var6));

      for (int var4 = 0; var4 < 6; var4++) {
         var6 = h.c0(var3, var4) as ServiceNotificationConfiguration;
         if (var6 != null) {
            val var10: Notification = this.buildNotification(var2, var6);
            val var5: Boolean;
            if (VERSION.SDK_INT >= 33 && androidx.core.content.a.a(var2, "android.permission.POST_NOTIFICATIONS") != 0) {
               var5 = false;
            } else {
               var5 = true;
            }

            if (var5) {
               this.getNotificationManagerCompat(var1).o("FOREGROUND_NOTIFICATION_TAG", var4, var10);
            }
         } else {
            this.getNotificationManagerCompat(var1).b("FOREGROUND_NOTIFICATION_TAG", var4);
         }
      }
   }
}
