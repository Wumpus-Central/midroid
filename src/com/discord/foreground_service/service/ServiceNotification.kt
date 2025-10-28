package com.discord.foreground_service.service

import Ja.v
import Ma.a
import android.app.Notification
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.os.Build.VERSION
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.b
import com.discord.foreground_service.utils.ForegroundServiceUtilsKt
import com.discord.notifications.actions.intents.GenericAction
import com.discord.notifications.actions.intents.NotificationAction.DefaultImpls
import com.discord.notifications.renderer.R.drawable
import java.util.Comparator
import kotlin.jvm.internal.SourceDebugExtension
import v0.d

@SourceDebugExtension(["SMAP\nServiceNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceNotification.kt\ncom/discord/foreground_service/service/ServiceNotification\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1053#2:106\n1863#2,2:107\n*S KotlinDebug\n*F\n+ 1 ServiceNotification.kt\ncom/discord/foreground_service/service/ServiceNotification\n*L\n25#1:106\n83#1:107,2\n*E\n"])
internal object ServiceNotification {
   private const val FOREGROUND_NOTIFICATION_CHANNEL: String = "mediaConnections"
   private const val FOREGROUND_NOTIFICATION_ID: Int = 8761
   private const val FOREGROUND_NOTIFICATION_TAG: String = "FOREGROUND_NOTIFICATION_TAG"
   private const val FOREGROUND_NOTIFICATION_LIMIT: Int = 5

   private final val notificationManagerCompat: NotificationManagerCompat
      private final get() {
         val var2: NotificationManagerCompat = NotificationManagerCompat.g(var1);
         return var2;
      }


   private fun buildNotification(context: Context, serviceNotificationConfiguration: ServiceNotificationConfiguration): Notification {
      val var4: NotificationCompat.Builder = new NotificationCompat.Builder(var1, "mediaConnections").x(var2.getTitle()).w(var2.getContent());
      val var3: ServiceNotificationConfiguration.Action = var2.getContentAction();
      val var6: PendingIntent;
      if (var3 != null) {
         var6 = DefaultImpls.toPendingIntent$default(new GenericAction(var3.getTag(), var3.getTaskName(), var3.getData()), var1, 0, true, 2, null);
      } else {
         var6 = null;
      }

      val var5: NotificationCompat.Builder = var4.v(var6).T(drawable.ic_notification_24dp).K(true).S(true);

      for (ServiceNotificationConfiguration.Action var8 : var2.getAuxiliaryActions()) {
         var5.a(
            0,
            var8.getTitle(),
            DefaultImpls.toPendingIntent$default(new GenericAction(var8.getTag(), var8.getTaskName(), var8.getData()), var1, 0, false, 2, null)
         );
      }

      return var5.A(d.a(v.a("permissionType", var2.getType().ordinal()))).g();
   }

   public fun Context.clearNotifications() {
      for (int var2 = 0; var2 < 6; var2++) {
         this.getNotificationManagerCompat(var1).b("FOREGROUND_NOTIFICATION_TAG", var2);
      }
   }

   public fun Service.startForegroundCompat(context: Context, serviceNotificationConfigurations: List<ServiceNotificationConfiguration>) {
      val var5: java.util.List = CollectionsKt.M0(var3, new Comparator() {
         @Override
         public final int compare(T var1, T var2) {
            return a.d((var1 as ServiceNotificationConfiguration).getPriority(), (var2 as ServiceNotificationConfiguration).getPriority());
         }
      });
      val var6: Notification = this.buildNotification(var2, CollectionsKt.j0(var5) as ServiceNotificationConfiguration);
      ForegroundServiceUtilsKt.startForegroundCompat(var1, var2, 8761, var6);
      var3 = CollectionsKt.b0(var5, 1);

      for (int var4 = 0; var4 < 6; var4++) {
         val var8: ServiceNotificationConfiguration = CollectionsKt.l0(var3, var4) as ServiceNotificationConfiguration;
         if (var8 != null) {
            val var9: Notification = this.buildNotification(var2, var8);
            if (VERSION.SDK_INT < 33 || b.a(var2, "android.permission.POST_NOTIFICATIONS") == 0) {
               this.getNotificationManagerCompat(var1).o("FOREGROUND_NOTIFICATION_TAG", var4, var9);
            }
         } else {
            this.getNotificationManagerCompat(var1).b("FOREGROUND_NOTIFICATION_TAG", var4);
         }
      }
   }
}
