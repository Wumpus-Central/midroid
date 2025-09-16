package com.discord.foreground_service

import android.app.Service
import android.content.Context
import android.content.Intent
import com.discord.crash_reporting.CrashReporting
import com.discord.foreground_service.service.ServiceNotification
import com.discord.foreground_service.utils.ForegroundServiceUtilsKt
import com.discord.foreground_service.utils.Log
import com.discord.misc.utilities.threading.ThreadUtilsKt

internal class ForegroundService : Service {
   private fun captureTimeoutException(startId: Int, fgsType: Int? = null) {
      var var4: CrashReporting;
      label11: {
         var4 = CrashReporting.INSTANCE;
         if (var2 != null) {
            val var3: java.lang.String = ForegroundServiceUtilsKt.toForegroundServiceTypeString(var2);
            var5 = var3;
            if (var3 != null) {
               break label11;
            }
         }

         var5 = "null";
      }

      val var6: StringBuilder = new StringBuilder();
      var6.append("ForegroundService has timed out. startId: ");
      var6.append(var1);
      var6.append(", type: ");
      var6.append(var5);
      CrashReporting.captureException$default(var4, new Exception(var6.toString()), false, 2, null);
   }

   public open fun onBind(intent: Intent?): Nothing {
      throw new IllegalStateException("bindService is not supported. Use startForegroundServiceCompat");
   }

   public open fun onDestroy() {
      ForegroundServiceManager.INSTANCE.onServiceDestroyed$foreground_service_release();
   }

   public open fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
      val var4: Log = Log.INSTANCE;
      val var5: StringBuilder = new StringBuilder();
      var5.append("onStartCommand: intent ");
      var5.append(var1);
      var5.append(", flags ");
      var5.append(var2);
      var5.append(", startId ");
      var5.append(var3);
      Log.i$foreground_service_release$default(var4, var5.toString(), null, 2, null);
      ForegroundServiceManager.INSTANCE.onServiceCreatedOrUpdated$foreground_service_release(this);
      return 1;
   }

   public open fun onTimeout(startId: Int) {
      super.onTimeout(var1);
      this.stopSelf();
      captureTimeoutException$default(this, var1, null, 2, null);
   }

   public open fun onTimeout(startId: Int, fgsType: Int) {
      super.onTimeout(var1, var2);
      this.stopSelf();
      this.captureTimeoutException(var1, var2);
   }

   public companion object {
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
