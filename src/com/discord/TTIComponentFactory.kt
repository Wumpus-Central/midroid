package com.discord

import android.annotation.SuppressLint
import android.app.Activity
import android.app.AppComponentFactory
import android.app.Application
import android.app.Service
import android.content.BroadcastReceiver
import android.content.Intent
import com.discord.logging.Log
import com.discord.tti_manager.TTIModule

@SuppressLint(["NewApi"])
public class TTIComponentFactory : AppComponentFactory {
   public open fun instantiateActivity(cl: ClassLoader, className: String, intent: Intent?): Activity {
      if (StringsKt.y(var2, ".MainActivity", false, 2, null)) {
         TTIModule.Companion.markMainActivityCreation(var3);
      } else {
         TTIModule.Companion.markActivityBeforeMain(var2);
      }

      val var4: Activity = super.instantiateActivity(var1, var2, var3);
      return var4;
   }

   public open fun instantiateApplication(cl: ClassLoader, className: String): Application {
      val var4: Log = Log.INSTANCE;
      val var3: StringBuilder = new StringBuilder();
      var3.append("Application: ");
      var3.append(var2);
      Log.i$default(var4, "TTIFactory", var3.toString(), null, 4, null);
      val var5: Application = super.instantiateApplication(var1, var2);
      return var5;
   }

   public open fun instantiateReceiver(cl: ClassLoader, className: String, intent: Intent?): BroadcastReceiver {
      val var5: Log = Log.INSTANCE;
      val var4: StringBuilder = new StringBuilder();
      var4.append("Receiver: ");
      var4.append(var2);
      var4.append(", intent=");
      var4.append(var3);
      Log.i$default(var5, "TTIFactory", var4.toString(), null, 4, null);
      TTIModule.Companion.markBroadcastReceiverInstantiation();
      val var6: BroadcastReceiver = super.instantiateReceiver(var1, var2, var3);
      return var6;
   }

   public open fun instantiateService(cl: ClassLoader, className: String, intent: Intent?): Service {
      val var4: Log = Log.INSTANCE;
      val var5: StringBuilder = new StringBuilder();
      var5.append("Service: ");
      var5.append(var2);
      var5.append(", intent=");
      var5.append(var3);
      Log.i$default(var4, "TTIFactory", var5.toString(), null, 4, null);
      TTIModule.Companion.markServiceInstantiation();
      val var6: Service = super.instantiateService(var1, var2, var3);
      return var6;
   }

   public companion object {
      public const val LOG_TAG: String
   }
}
