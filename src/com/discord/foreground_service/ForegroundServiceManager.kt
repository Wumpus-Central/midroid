package com.discord.foreground_service

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import com.discord.crash_reporting.CrashReporting
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.discord.foreground_service.utils.Log
import com.discord.foreground_service.utils.Wakelocks
import com.discord.misc.utilities.intent.IntentUtilsKt
import com.discord.notifications.actions.intents.GenericAction
import com.discord.notifications.actions.intents.NotificationAction
import com.discord.permissions.NativePermissionManagerModule
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.PromiseImpl
import com.facebook.react.bridge.ReactApplicationContext
import java.util.Locale
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

public class ForegroundServiceManager {
   private final var service: Service?
   private final var serviceConfigurations: List<ServiceNotificationConfiguration> = i.j()
   private final val serviceWakelocks: Wakelocks

   @JvmStatic
   fun `startService$lambda$0`(var0: ForegroundServiceManager, var1: Context, var2: java.util.List, var3: Any) {
      q.h(var0, "this$0");
      q.h(var1, "$context");
      q.h(var2, "$serviceConfigurations");
      q.h(var3, "result");
      var var4: Any;
      if (var3 is Array<Any>) {
         var4 = (var3 as Array<Any>)[0];
      } else {
         var4 = var3;
      }

      if (var4 is java.lang.String) {
         var4 = var4 as java.lang.String;
      } else {
         var4 = null;
      }

      val var5: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
      q.g(var5, "toLowerCase(...)");
      if (q.c(var4, var5)) {
         var0.startServiceInternal(var1, var2);
      } else {
         val var7: CrashReporting = CrashReporting.INSTANCE;
         val var6: StringBuilder = new StringBuilder();
         var6.append("Couldn't start ForegroundService, Result: ");
         var6.append(var3);
         CrashReporting.addBreadcrumb$default(var7, var6.toString(), null, null, 6, null);
      }
   }

   @JvmStatic
   fun `startService$lambda$1`(var0: Array<Any>) {
      val var1: CrashReporting = CrashReporting.INSTANCE;
      val var2: StringBuilder = new StringBuilder();
      var2.append("Couldn't start ForegroundService, Rejection: ");
      var2.append(var0);
      CrashReporting.addBreadcrumb$default(var1, var2.toString(), null, null, 6, null);
   }

   private fun startServiceInternal(context: Context, serviceConfigurations: List<ServiceNotificationConfiguration>) {
      val var6: Log = Log.INSTANCE;
      val var5: java.lang.String = tag;
      q.g(tag, "tag");
      val var3: Int = var2.size();
      val var4: StringBuilder = new StringBuilder();
      var4.append("Start service with ");
      var4.append(var3);
      var4.append(" configurations.");
      Log.i$foreground_service_release$default(var6, var5, var4.toString(), null, 4, null);
      this.serviceConfigurations = var2;
      ForegroundService.Companion.start(var1, <unrepresentable>.INSTANCE);
   }

   public fun handleIntent(context: Context, intent: Intent): Unit? {
      q.h(var1, "context");
      q.h(var2, "intent");
      val var4: NotificationAction.Companion = NotificationAction.Companion;
      val var6: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, g0.b(GenericAction.class))) {
         var6 = (androidx.core.content.b.b(var2, "action_intent_arg_key", GenericAction.class) as Parcelable) as NotificationAction;
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
      // 03: ldc_w "foregroundService"
      // 06: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 09: getstatic com/discord/foreground_service/utils/Log.INSTANCE Lcom/discord/foreground_service/utils/Log;
      // 0c: astore 3
      // 0d: getstatic com/discord/foreground_service/ForegroundServiceManager.tag Ljava/lang/String;
      // 10: astore 2
      // 11: aload 2
      // 12: ldc "tag"
      // 14: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 17: aload 3
      // 18: aload 2
      // 19: ldc_w "On service connected."
      // 1c: aconst_null
      // 1d: bipush 4
      // 1e: aconst_null
      // 1f: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 22: aload 0
      // 23: aload 1
      // 24: putfield com/discord/foreground_service/ForegroundServiceManager.service Landroid/app/Service;
      // 27: aload 1
      // 28: ifnull 65
      // 2b: aload 0
      // 2c: getfield com/discord/foreground_service/ForegroundServiceManager.serviceConfigurations Ljava/util/List;
      // 2f: checkcast java/util/Collection
      // 32: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 37: bipush 1
      // 38: ixor
      // 39: ifeq 4f
      // 3c: getstatic com/discord/foreground_service/service/ServiceNotification.INSTANCE Lcom/discord/foreground_service/service/ServiceNotification;
      // 3f: aload 1
      // 40: aload 1
      // 41: aload 0
      // 42: getfield com/discord/foreground_service/ForegroundServiceManager.serviceConfigurations Ljava/util/List;
      // 45: invokevirtual com/discord/foreground_service/service/ServiceNotification.startForegroundCompat (Landroid/app/Service;Landroid/content/Context;Ljava/util/List;)V
      // 48: goto 65
      // 4b: astore 1
      // 4c: goto 68
      // 4f: aload 0
      // 50: aload 1
      // 51: invokevirtual com/discord/foreground_service/ForegroundServiceManager.stopService$foreground_service_release (Landroid/content/Context;)V
      // 54: aload 2
      // 55: ldc "tag"
      // 57: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 5a: aload 3
      // 5b: aload 2
      // 5c: ldc_w "No configuration present (process liked died), stopping service."
      // 5f: aconst_null
      // 60: bipush 4
      // 61: aconst_null
      // 62: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 65: aload 0
      // 66: monitorexit
      // 67: return
      // 68: aload 0
      // 69: monitorexit
      // 6a: aload 1
      // 6b: athrow
   }

   internal fun onServiceCreated(context: Context) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            q.h(var1, "context");
            val var3: Log = Log.INSTANCE;
            val var2: java.lang.String = tag;
            q.g(tag, "tag");
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
            val var1: Log = Log.INSTANCE;
            val var2: java.lang.String = tag;
            q.g(tag, "tag");
            Log.i$foreground_service_release$default(var1, var2, "On service destroyed.", null, 4, null);
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
            q.h(var1, "context");
            q.h(var2, "serviceConfigurations");
            val var3: PromiseImpl = new PromiseImpl(new b(this, var1, var2), new c());
            val var7: NativeModule = (var1 as ReactApplicationContext).getNativeModule(NativePermissionManagerModule.class);
            q.e(var7);
            (var7 as NativePermissionManagerModule).requestForegroundServicePermission(var3);
         } catch (var5: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   internal fun stopService(context: Context) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            q.h(var1, "context");
            val var2: Log = Log.INSTANCE;
            val var3: java.lang.String = tag;
            q.g(tag, "tag");
            Log.i$foreground_service_release$default(var2, var3, "Stop service.", null, 4, null);
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
