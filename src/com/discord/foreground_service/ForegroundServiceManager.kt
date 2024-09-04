package com.discord.foreground_service

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import com.discord.crash_reporting.CrashReporting
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Type
import com.discord.foreground_service.utils.Log
import com.discord.foreground_service.utils.Wakelocks
import com.discord.misc.utilities.intent.IntentUtilsKt
import com.discord.notifications.actions.intents.GenericAction
import com.discord.notifications.actions.intents.NotificationAction
import java.util.Locale
import java.util.NoSuchElementException
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

public class ForegroundServiceManager {
   private final var service: Service?
   private final var serviceConfigurations: List<ServiceNotificationConfiguration> = i.j()
   private final val serviceWakelocks: Wakelocks

   private fun getTypeFromServiceConfigurationList(serviceConfigurations: List<ServiceNotificationConfiguration>): Type {
      val var7: java.util.Iterator = var1.iterator();
      if (!var7.hasNext()) {
         throw new NoSuchElementException();
      } else {
         var var5: Any = var7.next();
         var var8: Any;
         if (!var7.hasNext()) {
            var8 = var5;
         } else {
            var var3: Int = (var5 as ServiceNotificationConfiguration).getType().ordinal();

            do {
               val var6: Any = var7.next();
               val var4: Int = (var6 as ServiceNotificationConfiguration).getType().ordinal();
               var8 = var5;
               var var2: Int = var3;
               if (var3 < var4) {
                  var8 = var6;
                  var2 = var4;
               }

               var5 = var8;
               var3 = var2;
            } while (var7.hasNext());
         }

         return (var8 as ServiceNotificationConfiguration).getType();
      }
   }

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
      val var2: CrashReporting = CrashReporting.INSTANCE;
      val var1: StringBuilder = new StringBuilder();
      var1.append("Couldn't start ForegroundService, Rejection: ");
      var1.append(var0);
      CrashReporting.addBreadcrumb$default(var2, var1.toString(), null, null, 6, null);
   }

   private fun startServiceInternal(context: Context, serviceConfigurations: List<ServiceNotificationConfiguration>) {
      val var6: Log = Log.INSTANCE;
      val var4: java.lang.String = tag;
      q.g(tag, "tag");
      val var3: Int = var2.size();
      val var5: StringBuilder = new StringBuilder();
      var5.append("Start service with ");
      var5.append(var3);
      var5.append(" configurations.");
      Log.i$foreground_service_release$default(var6, var4, var5.toString(), null, 4, null);
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
            val var2: Log = Log.INSTANCE;
            val var3: java.lang.String = tag;
            q.g(tag, "tag");
            Log.i$foreground_service_release$default(var2, var3, "On service created.", null, 4, null);
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
            q.g(tag, "tag");
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
      // 03: ldc "context"
      // 05: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: aload 2
      // 09: ldc_w "serviceConfigurations"
      // 0c: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f: new com/facebook/react/bridge/PromiseImpl
      // 12: astore 4
      // 14: new com/discord/foreground_service/b
      // 17: astore 6
      // 19: aload 6
      // 1b: aload 0
      // 1c: aload 1
      // 1d: aload 2
      // 1e: invokespecial com/discord/foreground_service/b.<init> (Lcom/discord/foreground_service/ForegroundServiceManager;Landroid/content/Context;Ljava/util/List;)V
      // 21: new com/discord/foreground_service/c
      // 24: astore 5
      // 26: aload 5
      // 28: invokespecial com/discord/foreground_service/c.<init> ()V
      // 2b: aload 4
      // 2d: aload 6
      // 2f: aload 5
      // 31: invokespecial com/facebook/react/bridge/PromiseImpl.<init> (Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V
      // 34: aload 0
      // 35: aload 2
      // 36: invokespecial com/discord/foreground_service/ForegroundServiceManager.getTypeFromServiceConfigurationList (Ljava/util/List;)Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;
      // 39: astore 2
      // 3a: aload 1
      // 3b: checkcast com/facebook/react/bridge/ReactApplicationContext
      // 3e: ldc_w com/discord/permissions/NativePermissionManagerModule
      // 41: invokevirtual com/facebook/react/bridge/ReactContext.getNativeModule (Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
      // 44: astore 1
      // 45: aload 1
      // 46: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 49: aload 1
      // 4a: checkcast com/discord/permissions/NativePermissionManagerModule
      // 4d: astore 1
      // 4e: getstatic com/discord/foreground_service/ForegroundServiceManager$WhenMappings.$EnumSwitchMapping$0 [I
      // 51: aload 2
      // 52: invokevirtual java/lang/Enum.ordinal ()I
      // 55: iaload
      // 56: istore 3
      // 57: iload 3
      // 58: bipush 1
      // 59: if_icmpeq 7f
      // 5c: iload 3
      // 5d: bipush 2
      // 5e: if_icmpeq 76
      // 61: iload 3
      // 62: bipush 3
      // 63: if_icmpeq 69
      // 66: goto 85
      // 69: aload 1
      // 6a: aload 4
      // 6c: invokevirtual com/discord/permissions/NativePermissionManagerModule.requestForegroundServicePermissionScreenShare (Lcom/facebook/react/bridge/Promise;)V
      // 6f: goto 85
      // 72: astore 1
      // 73: goto 88
      // 76: aload 1
      // 77: aload 4
      // 79: invokevirtual com/discord/permissions/NativePermissionManagerModule.requestForegroundServicePermissionFileUpload (Lcom/facebook/react/bridge/Promise;)V
      // 7c: goto 85
      // 7f: aload 1
      // 80: aload 4
      // 82: invokevirtual com/discord/permissions/NativePermissionManagerModule.requestForegroundServicePermissionVoiceCall (Lcom/facebook/react/bridge/Promise;)V
      // 85: aload 0
      // 86: monitorexit
      // 87: return
      // 88: aload 0
      // 89: monitorexit
      // 8a: aload 1
      // 8b: athrow
   }

   internal fun stopService(context: Context) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            q.h(var1, "context");
            val var3: Log = Log.INSTANCE;
            val var2: java.lang.String = tag;
            q.g(tag, "tag");
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
