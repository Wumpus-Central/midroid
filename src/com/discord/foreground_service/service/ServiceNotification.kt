package com.discord.foreground_service.service

import android.app.Notification
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.os.Build.VERSION
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.os.e
import com.discord.foreground_service.utils.ForegroundServiceUtilsKt
import com.discord.notifications.actions.intents.GenericAction
import com.discord.notifications.actions.intents.NotificationAction
import com.discord.notifications.renderer.R
import java.util.Comparator
import kotlin.jvm.internal.q
import nh.w
import qh.a

internal object ServiceNotification {
   private const val FOREGROUND_NOTIFICATION_CHANNEL: String = "mediaConnections"
   private const val FOREGROUND_NOTIFICATION_ID: Int = 8761
   private const val FOREGROUND_NOTIFICATION_LIMIT: Int = 5
   private const val FOREGROUND_NOTIFICATION_TAG: String = "FOREGROUND_NOTIFICATION_TAG"

   private final val notificationManagerCompat: NotificationManagerCompat
      private final get() {
         val var2: NotificationManagerCompat = NotificationManagerCompat.g(var1);
         q.g(var2, "from(...)");
         return var2;
      }


   private fun buildNotification(context: Context, serviceNotificationConfiguration: ServiceNotificationConfiguration): Notification {
      val var4: NotificationCompat.Builder = new NotificationCompat.Builder(var1, "mediaConnections").x(var2.getTitle()).w(var2.getContent());
      val var3: ServiceNotificationConfiguration.Action = var2.getContentAction();
      val var7: PendingIntent;
      if (var3 != null) {
         var7 = NotificationAction.DefaultImpls.toPendingIntent$default(
            new GenericAction(var3.getTag(), var3.getTaskName(), var3.getData()), var1, 0, true, 2, null
         );
      } else {
         var7 = null;
      }

      val var8: NotificationCompat.Builder = var4.v(var7).T(R.drawable.ic_notification_24dp).K(true).S(true);

      for (ServiceNotificationConfiguration.Action var5 : var2.getAuxiliaryActions()) {
         var8.a(
            0,
            var5.getTitle(),
            NotificationAction.DefaultImpls.toPendingIntent$default(
               new GenericAction(var5.getTag(), var5.getTaskName(), var5.getData()), var1, 0, false, 2, null
            )
         );
      }

      val var6: Notification = var8.A(e.a(w.a("permissionType", var2.getType().ordinal()))).g();
      q.g(var6, "build(...)");
      return var6;
   }

   public fun Context.clearNotifications() {
      q.h(var1, "<this>");

      for (int var2 = 0; var2 < 6; var2++) {
         this.getNotificationManagerCompat(var1).b("FOREGROUND_NOTIFICATION_TAG", var2);
      }
   }

   public fun Service.startForegroundCompat(context: Context, serviceNotificationConfigurations: List<ServiceNotificationConfiguration>) {
      q.h(var1, "<this>");
      q.h(var2, "context");
      q.h(var3, "serviceNotificationConfigurations");
      var3 = i.I0(var3, new Comparator() {
         @Override
         public final int compare(T var1, T var2) {
            return a.d((var1 as ServiceNotificationConfiguration).getPriority(), (var2 as ServiceNotificationConfiguration).getPriority());
         }
      });
      var var5: ServiceNotificationConfiguration = i.e0(var3) as ServiceNotificationConfiguration;
      var3 = i.W(var3, 1);
      ForegroundServiceUtilsKt.startForegroundCompat(var1, 8761, this.buildNotification(var2, var5));

      for (int var4 = 0; var4 < 6; var4++) {
         var5 = i.h0(var3, var4) as ServiceNotificationConfiguration;
         if (var5 != null) {
            val var9: Notification = this.buildNotification(var2, var5);
            if (VERSION.SDK_INT < 33 || androidx.core.content.a.a(var2, "android.permission.POST_NOTIFICATIONS") == 0) {
               this.getNotificationManagerCompat(var1).o("FOREGROUND_NOTIFICATION_TAG", var4, var9);
            }
         } else {
            this.getNotificationManagerCompat(var1).b("FOREGROUND_NOTIFICATION_TAG", var4);
         }
      }
   }
}
