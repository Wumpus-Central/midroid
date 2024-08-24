package com.discord.notifications.renderer.utils

import android.app.Notification
import android.content.Context
import androidx.core.app.NotificationCompat.Builder
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.t
import androidx.work.Data.a
import androidx.work.ListenableWorker.Result
import com.discord.notifications.api.NotificationData
import com.discord.notifications.renderer.NotificationChannels
import java.util.concurrent.TimeUnit
import kotlin.jvm.internal.r

public class SilenceCallWorker(context: Context, workerParams: WorkerParameters) : Worker {
   init {
      r.h(var1, "context");
      r.h(var2, "workerParams");
      super(var1, var2);
   }

   public open fun doWork(): Result {
      val var1: java.lang.String = this.getInputData().i("tag");
      if (var1 == null) {
         val var7: Result = Result.c();
         r.g(var7, "success()");
         return var7;
      } else {
         val var2: java.lang.String = this.getInputData().i("notificationChannelId");
         if (var2 == null) {
            val var6: Result = Result.c();
            r.g(var6, "success()");
            return var6;
         } else {
            val var3: Context = this.getApplicationContext();
            r.g(var3, "applicationContext");
            val var9: Notification = NotificationManagerUtilsKt.getActiveNotification(var3, var1);
            if (var9 == null) {
               val var5: Result = Result.c();
               r.g(var5, "success()");
               return var5;
            } else {
               val var10: Builder = new Builder(this.getApplicationContext(), var9).q(var2);
               r.g(var10, "Builder(applicationConte…Id(notificationChannelId)");
               val var8: Context = this.getApplicationContext();
               r.g(var8, "applicationContext");
               NotificationManagerUtilsKt.notify$default(NotificationManagerUtilsKt.getNotificationManagerCompat(var8), var1, var10, 0, 4, null);
               val var4: Result = Result.c();
               r.g(var4, "success()");
               return var4;
            }
         }
      }
   }

   public companion object {
      private const val DELAYED_DURATION_SECS: Long
      private const val NOTIFICATION_CHANNEL_ID: String
      private const val TAG: String

      public fun runWorker(context: Context, notification: NotificationData) {
         r.h(var1, "context");
         r.h(var2, "notification");
         val var3: Data = new a()
            .e("tag", NotificationDataUtilsKt.getTag(var2))
            .e("notificationChannelId", NotificationChannels.INSTANCE.getSilenceCallChannelId())
            .a();
         r.g(var3, "Builder()\n              …\n                .build()");
         t.c(var1).a(((new androidx.work.l.a(SilenceCallWorker.class).i(30L, TimeUnit.SECONDS) as androidx.work.l.a).j(var3) as androidx.work.l.a).a());
      }
   }
}
