package com.discord.foreground_service

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import com.discord.foreground_service.service.ServiceNotification
import com.discord.foreground_service.utils.ForegroundServiceUtilsKt
import com.discord.misc.utilities.threading.ThreadUtilsKt
import kotlin.jvm.internal.q

internal class ForegroundService : Service {
   public open fun onBind(intent: Intent?): IBinder? {
      return null;
   }

   public open fun onCreate() {
      ForegroundServiceManager.Companion.getInstance().onServiceCreated$foreground_service_release(this);
   }

   public open fun onDestroy() {
      ForegroundServiceManager.Companion.getInstance().onServiceDisconnected$foreground_service_release();
   }

   public open fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
      ForegroundServiceManager.Companion.getInstance().onServiceConnected$foreground_service_release(this);
      return super.onStartCommand(var1, var2, var3);
   }

   public companion object {
      private const val MINIMUM_SERVICE_LIFETIME: Long
      private final var lastServiceStartTime: Long

      private fun getServiceIntent(context: Context): Intent {
         return new Intent(var1, ForegroundService::class.java);
      }

      @JvmStatic
      fun `stop$lambda$0`(var0: Context, var1: Service) {
         q.h(var0, "$context");
         ForegroundService.Companion.stopInternal(var0, var1);
      }

      private fun stopInternal(context: Context, service: Service?) {
         if (var2 != null) {
            var2.stopForeground(1);
         }

         if (var2 != null) {
            var2.stopSelf();
         }

         var1.stopService(this.getServiceIntent(var1));
         ServiceNotification.INSTANCE.clearNotifications(var1);
      }

      public fun start(context: Context, onError: (Exception) -> Unit) {
         q.h(var1, "context");
         q.h(var2, "onError");

         try {
            ForegroundServiceUtilsKt.startForegroundServiceCompat(var1, this.getServiceIntent(var1));
            ForegroundService.access$setLastServiceStartTime$cp(System.currentTimeMillis());
         } catch (var3: Exception) {
            var2.invoke(var3);
         }
      }

      public fun stop(context: Context, service: Service?) {
         q.h(var1, "context");
         val var3: Long = System.currentTimeMillis() - ForegroundService.access$getLastServiceStartTime$cp();
         if (var3 > 3000L) {
            this.stopInternal(var1, var2);
         } else {
            ThreadUtilsKt.getUiHandler().postDelayed(new a(var1, var2), 3000L - var3);
         }
      }
   }
}
