package com.discord.foreground_service

import android.app.Service
import android.content.Context
import android.content.Intent
import com.discord.foreground_service.service.ServiceNotification
import com.discord.foreground_service.utils.ForegroundServiceUtilsKt
import com.discord.foreground_service.utils.Log
import com.discord.misc.utilities.threading.ThreadUtilsKt

internal class ForegroundService : Service {
   public open fun onBind(intent: Intent?): Nothing {
      throw new IllegalStateException("bindService is not supported. Use startForegroundServiceCompat");
   }

   public open fun onDestroy() {
      ForegroundServiceManager.INSTANCE.onServiceDestroyed$foreground_service_release();
   }

   public open fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
      val var6: Log = Log.INSTANCE;
      val var5: java.lang.String = tag;
      val var4: StringBuilder = new StringBuilder();
      var4.append("onStartCommand: intent ");
      var4.append(var1);
      var4.append(", flags ");
      var4.append(var2);
      var4.append(", startId ");
      var4.append(var3);
      Log.i$foreground_service_release$default(var6, var5, var4.toString(), null, 4, null);
      ForegroundServiceManager.INSTANCE.onServiceCreatedOrUpdated$foreground_service_release(this);
      return super.onStartCommand(var1, var2, var3);
   }

   public companion object {
      private final val tag: String
      private const val MINIMUM_SERVICE_LIFETIME: Long
      private final var lastServiceStartTime: Long
      internal const val EXTRA_PERMISSION_TYPE: String

      private fun getServiceIntent(context: Context): Intent {
         return new Intent(var1, ForegroundService::class.java);
      }

      @JvmStatic
      fun `stop$lambda$0`(var0: Context, var1: Service) {
         ForegroundService.Companion.stopInternal(var0, var1);
      }

      private fun stopInternal(context: Context, service: Service) {
         var2.stopForeground(1);
         var2.stopSelf();
         ServiceNotification.INSTANCE.clearNotifications(var1);
      }

      public fun start(context: Context, onError: (Exception) -> Unit) {
         try {
            ForegroundServiceUtilsKt.startForegroundServiceCompat(var1, this.getServiceIntent(var1));
            ForegroundService.access$setLastServiceStartTime$cp(System.currentTimeMillis());
         } catch (var3: Exception) {
            var2.invoke(var3);
         }
      }

      public fun stop(context: Context, service: Service) {
         val var3: Long = System.currentTimeMillis() - ForegroundService.access$getLastServiceStartTime$cp();
         if (var3 > 3000L) {
            this.stopInternal(var1, var2);
         } else {
            ThreadUtilsKt.getUiHandler().postDelayed(new a(var1, var2), 3000L - var3);
         }
      }
   }
}
