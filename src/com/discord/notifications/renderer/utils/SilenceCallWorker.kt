package com.discord.notifications.renderer.utils

import android.app.Notification
import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.work.Data
import androidx.work.ListenableWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.l
import androidx.work.t
import androidx.work.ListenableWorker.Result
import com.discord.notifications.api.NotificationData
import com.discord.notifications.renderer.NotificationChannels
import java.util.concurrent.TimeUnit
import kotlin.jvm.internal.q

public class SilenceCallWorker(context: Context, workerParams: WorkerParameters) : Worker {
   init {
      q.h(var1, "context");
      q.h(var2, "workerParams");
      super(var1, var2);
   }

   public override fun doWork(): Result {
      val var1: java.lang.String = this.getInputData().i("tag");
      if (var1 == null) {
         val var7: ListenableWorker.Result = ListenableWorker.Result.c();
         q.g(var7, "success(...)");
         return var7;
      } else {
         val var2: java.lang.String = this.getInputData().i("notificationChannelId");
         if (var2 == null) {
            val var6: ListenableWorker.Result = ListenableWorker.Result.c();
            q.g(var6, "success(...)");
            return var6;
         } else {
            var var3: Context = this.getApplicationContext();
            q.g(var3, "getApplicationContext(...)");
            val var9: Notification = NotificationManagerUtilsKt.getActiveNotification(var3, var1);
            if (var9 == null) {
               val var5: ListenableWorker.Result = ListenableWorker.Result.c();
               q.g(var5, "success(...)");
               return var5;
            } else {
               val var8: NotificationCompat.Builder = new NotificationCompat.Builder(this.getApplicationContext(), var9).q(var2);
               q.g(var8, "setChannelId(...)");
               var3 = this.getApplicationContext();
               q.g(var3, "getApplicationContext(...)");
               NotificationManagerUtilsKt.notify$default(NotificationManagerUtilsKt.getNotificationManagerCompat(var3), var1, var8, 0, 4, null);
               val var4: ListenableWorker.Result = ListenableWorker.Result.c();
               q.g(var4, "success(...)");
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
         q.h(var1, "context");
         q.h(var2, "notification");
         val var3: Data = new Data.a()
            .e("tag", NotificationDataUtilsKt.getTag(var2))
            .e("notificationChannelId", NotificationChannels.INSTANCE.getSilenceCallChannelId())
            .a();
         q.g(var3, "build(...)");
         t.c(var1).a(((new l.a(SilenceCallWorker.class).i(30L, TimeUnit.SECONDS) as l.a).j(var3) as l.a).a());
      }
   }
}
