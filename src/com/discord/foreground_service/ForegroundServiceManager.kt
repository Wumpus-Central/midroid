package com.discord.foreground_service

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import androidx.core.content.d
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.discord.foreground_service.utils.Log
import com.discord.foreground_service.utils.Wakelocks
import com.discord.misc.utilities.intent.IntentUtilsKt
import com.discord.notifications.actions.intents.GenericAction
import com.discord.notifications.actions.intents.NotificationAction
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r

public class ForegroundServiceManager {
   private final var service: Service?
   private final var serviceConfigurations: List<ServiceNotificationConfiguration> = h.i()
   private final val serviceWakelocks: Wakelocks

   public fun handleIntent(context: Context, intent: Intent): Unit? {
      r.h(var1, "context");
      r.h(var2, "intent");
      val var4: com.discord.notifications.actions.intents.NotificationAction.Companion = NotificationAction.Companion;
      val var6: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, h0.b(GenericAction.class))) {
         var6 = (d.b(var2, "action_intent_arg_key", GenericAction.class) as Parcelable) as NotificationAction;
      } else {
         var6 = null;
      }

      val var5: GenericAction = var6 as GenericAction;
      var var7: Unit = null;
      if (var5 != null) {
         var5.onNotificationAction(var1, false);
         var7 = Unit.a;
      }

      return var7;
   }

   internal fun isRunning(): Boolean {
      label18: {
         synchronized (this){} // $VF: monitorenter 

         try {
            ;
         } catch (var3: java.lang.Throwable) {
            // $VF: monitorexit
         }

         val var1: Boolean;
         val var2: <unknown>;
         if (var2 != null) {
            var1 = true;
         } else {
            var1 = false;
         }

         // $VF: monitorexit
         return var1;
      }
   }

   internal fun onServiceConnected(foregroundService: Service) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:555)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc "foregroundService"
      // 05: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: getstatic com/discord/foreground_service/utils/Log.INSTANCE Lcom/discord/foreground_service/utils/Log;
      // 0b: astore 2
      // 0c: getstatic com/discord/foreground_service/ForegroundServiceManager.tag Ljava/lang/String;
      // 0f: astore 3
      // 10: aload 3
      // 11: ldc "tag"
      // 13: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 16: aload 2
      // 17: aload 3
      // 18: ldc "On service connected."
      // 1a: aconst_null
      // 1b: bipush 4
      // 1c: aconst_null
      // 1d: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 20: aload 0
      // 21: aload 1
      // 22: putfield com/discord/foreground_service/ForegroundServiceManager.service Landroid/app/Service;
      // 25: aload 1
      // 26: ifnull 5b
      // 29: aload 0
      // 2a: getfield com/discord/foreground_service/ForegroundServiceManager.serviceConfigurations Ljava/util/List;
      // 2d: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 32: bipush 1
      // 33: ixor
      // 34: ifeq 46
      // 37: getstatic com/discord/foreground_service/service/ServiceNotification.INSTANCE Lcom/discord/foreground_service/service/ServiceNotification;
      // 3a: aload 1
      // 3b: aload 1
      // 3c: aload 0
      // 3d: getfield com/discord/foreground_service/ForegroundServiceManager.serviceConfigurations Ljava/util/List;
      // 40: invokevirtual com/discord/foreground_service/service/ServiceNotification.startForegroundCompat (Landroid/app/Service;Landroid/content/Context;Ljava/util/List;)V
      // 43: goto 5b
      // 46: aload 0
      // 47: aload 1
      // 48: invokevirtual com/discord/foreground_service/ForegroundServiceManager.stopService$foreground_service_release (Landroid/content/Context;)V
      // 4b: aload 3
      // 4c: ldc "tag"
      // 4e: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 51: aload 2
      // 52: aload 3
      // 53: ldc "No configuration present (process liked died), stopping service."
      // 55: aconst_null
      // 56: bipush 4
      // 57: aconst_null
      // 58: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 5b: aload 0
      // 5c: monitorexit
      // 5d: return
      // 5e: astore 1
      // 5f: aload 0
      // 60: monitorexit
      // 61: aload 1
      // 62: athrow
   }

   internal fun onServiceCreated(context: Context) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            r.h(var1, "context");
            val var3: Log = Log.INSTANCE;
            val var2: java.lang.String = tag;
            r.g(tag, "tag");
            Log.i$foreground_service_release$default(var3, var2, "On service created.", null, 4, null);
            this.serviceWakelocks.acquire(var1);
         } catch (var4: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   internal fun onServiceDisconnected() {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            val var2: Log = Log.INSTANCE;
            val var1: java.lang.String = tag;
            r.g(tag, "tag");
            Log.i$foreground_service_release$default(var2, var1, "On service destroyed.", null, 4, null);
            this.serviceWakelocks.release();
            this.service = null;
         } catch (var3: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   internal fun startService(context: Context, serviceConfigurations: List<ServiceNotificationConfiguration>) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            r.h(var1, "context");
            r.h(var2, "serviceConfigurations");
            val var4: Log = Log.INSTANCE;
            val var5: java.lang.String = tag;
            r.g(tag, "tag");
            val var3: Int = var2.size();
            val var6: StringBuilder = new StringBuilder();
            var6.append("Start service with ");
            var6.append(var3);
            var6.append(" configurations.");
            Log.i$foreground_service_release$default(var4, var5, var6.toString(), null, 4, null);
            this.serviceConfigurations = var2;
            ForegroundService.Companion.start(var1, <unrepresentable>.INSTANCE);
         } catch (var7: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   internal fun stopService(context: Context) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            r.h(var1, "context");
            val var3: Log = Log.INSTANCE;
            val var2: java.lang.String = tag;
            r.g(tag, "tag");
            Log.i$foreground_service_release$default(var3, var2, "Stop service.", null, 4, null);
            ForegroundService.Companion.stop(var1, this.service);
         } catch (var4: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public companion object {
      public final val instance: ForegroundServiceManager
      private final val tag: String
   }
}
