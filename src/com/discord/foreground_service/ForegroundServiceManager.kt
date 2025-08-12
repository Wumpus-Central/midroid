package com.discord.foreground_service

import K1.d
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import androidx.core.content.c
import com.discord.crash_reporting.CrashReporting
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Type
import com.discord.foreground_service.utils.Log
import com.discord.foreground_service.utils.Wakelocks
import com.discord.misc.utilities.intent.IntentUtilsKt
import com.discord.notifications.actions.intents.GenericAction
import com.discord.notifications.actions.intents.NotificationAction
import java.util.NoSuchElementException
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r

public class ForegroundServiceManager {
   private final var service: Service?
   private final var serviceConfigurations: List<ServiceNotificationConfiguration> = i.k()
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
            var var2: Int = (var5 as ServiceNotificationConfiguration).getType().ordinal();

            do {
               val var6: Any = var7.next();
               val var4: Int = (var6 as ServiceNotificationConfiguration).getType().ordinal();
               var8 = var5;
               var var3: Int = var2;
               if (var2 < var4) {
                  var8 = var6;
                  var3 = var4;
               }

               var5 = var8;
               var2 = var3;
            } while (var7.hasNext());
         }

         return (var8 as ServiceNotificationConfiguration).getType();
      }
   }

   @JvmStatic
   fun `startService$lambda$0`(var0: ForegroundServiceManager, var1: Context, var2: java.util.List): Unit {
      var0.startServiceInternal(var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `startService$lambda$1`(): Unit {
      CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Couldn't start ForegroundService", null, null, 6, null);
      return Unit.a;
   }

   private fun startServiceInternal(context: Context, serviceConfigurations: List<ServiceNotificationConfiguration>) {
      val var6: Log = Log.INSTANCE;
      val var4: java.lang.String = tag;
      r.g(tag, "tag");
      val var3: Int = var2.size();
      val var5: StringBuilder = new StringBuilder();
      var5.append("Start service with ");
      var5.append(var3);
      var5.append(" configurations.");
      Log.i$foreground_service_release$default(var6, var4, var5.toString(), null, 4, null);
      this.serviceConfigurations = var2;
      ForegroundService.Companion.start(var1, new d());
   }

   @JvmStatic
   fun `startServiceInternal$lambda$3`(var0: Exception): Unit {
      r.h(var0, "e");
      val var1: Log = Log.INSTANCE;
      val var2: java.lang.String = tag;
      r.g(tag, "tag");
      var1.w$foreground_service_release(var2, "Unable to start service", var0);
      return Unit.a;
   }

   public fun handleIntent(context: Context, intent: Intent): Unit? {
      r.h(var1, "context");
      r.h(var2, "intent");
      val var4: NotificationAction.Companion = NotificationAction.Companion;
      val var6: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, H.b(GenericAction.class))) {
         var6 = (c.b(var2, "action_intent_arg_key", GenericAction.class) as Parcelable) as NotificationAction;
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
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 0
      // 03: getfield com/discord/foreground_service/ForegroundServiceManager.service Landroid/app/Service;
      // 06: astore 2
      // 07: aload 2
      // 08: ifnull 10
      // 0b: bipush 1
      // 0c: istore 1
      // 0d: goto 12
      // 10: bipush 0
      // 11: istore 1
      // 12: aload 0
      // 13: monitorexit
      // 14: iload 1
      // 15: ireturn
      // 16: astore 2
      // 17: aload 0
      // 18: monitorexit
      // 19: aload 2
      // 1a: athrow
   }

   internal fun onServiceConnected(foregroundService: Service) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc_w "foregroundService"
      // 06: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 09: getstatic com/discord/foreground_service/utils/Log.INSTANCE Lcom/discord/foreground_service/utils/Log;
      // 0c: astore 2
      // 0d: getstatic com/discord/foreground_service/ForegroundServiceManager.tag Ljava/lang/String;
      // 10: astore 3
      // 11: aload 3
      // 12: ldc "tag"
      // 14: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 17: aload 2
      // 18: aload 3
      // 19: ldc_w "On service connected."
      // 1c: aconst_null
      // 1d: bipush 4
      // 1e: aconst_null
      // 1f: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 22: aload 0
      // 23: aload 1
      // 24: putfield com/discord/foreground_service/ForegroundServiceManager.service Landroid/app/Service;
      // 27: aload 1
      // 28: ifnull 60
      // 2b: aload 0
      // 2c: getfield com/discord/foreground_service/ForegroundServiceManager.serviceConfigurations Ljava/util/List;
      // 2f: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 34: ifne 4a
      // 37: getstatic com/discord/foreground_service/service/ServiceNotification.INSTANCE Lcom/discord/foreground_service/service/ServiceNotification;
      // 3a: aload 1
      // 3b: aload 1
      // 3c: aload 0
      // 3d: getfield com/discord/foreground_service/ForegroundServiceManager.serviceConfigurations Ljava/util/List;
      // 40: invokevirtual com/discord/foreground_service/service/ServiceNotification.startForegroundCompat (Landroid/app/Service;Landroid/content/Context;Ljava/util/List;)V
      // 43: goto 60
      // 46: astore 1
      // 47: goto 63
      // 4a: aload 0
      // 4b: aload 1
      // 4c: invokevirtual com/discord/foreground_service/ForegroundServiceManager.stopService$foreground_service_release (Landroid/content/Context;)V
      // 4f: aload 3
      // 50: ldc "tag"
      // 52: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 55: aload 2
      // 56: aload 3
      // 57: ldc_w "No configuration present (process liked died), stopping service."
      // 5a: aconst_null
      // 5b: bipush 4
      // 5c: aconst_null
      // 5d: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 60: aload 0
      // 61: monitorexit
      // 62: return
      // 63: aload 0
      // 64: monitorexit
      // 65: aload 1
      // 66: athrow
   }

   internal fun onServiceCreated(context: Context) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc "context"
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
      // 18: ldc_w "On service created."
      // 1b: aconst_null
      // 1c: bipush 4
      // 1d: aconst_null
      // 1e: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 21: aload 0
      // 22: getfield com/discord/foreground_service/ForegroundServiceManager.serviceWakelocks Lcom/discord/foreground_service/utils/Wakelocks;
      // 25: aload 1
      // 26: invokevirtual com/discord/foreground_service/utils/Wakelocks.acquire (Landroid/content/Context;)V
      // 29: aload 0
      // 2a: monitorexit
      // 2b: return
      // 2c: astore 1
      // 2d: aload 0
      // 2e: monitorexit
      // 2f: aload 1
      // 30: athrow
   }

   internal fun onServiceDisconnected() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: getstatic com/discord/foreground_service/utils/Log.INSTANCE Lcom/discord/foreground_service/utils/Log;
      // 05: astore 1
      // 06: getstatic com/discord/foreground_service/ForegroundServiceManager.tag Ljava/lang/String;
      // 09: astore 2
      // 0a: aload 2
      // 0b: ldc "tag"
      // 0d: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 10: aload 1
      // 11: aload 2
      // 12: ldc_w "On service destroyed."
      // 15: aconst_null
      // 16: bipush 4
      // 17: aconst_null
      // 18: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 1b: aload 0
      // 1c: getfield com/discord/foreground_service/ForegroundServiceManager.serviceWakelocks Lcom/discord/foreground_service/utils/Wakelocks;
      // 1f: invokevirtual com/discord/foreground_service/utils/Wakelocks.release ()V
      // 22: aload 0
      // 23: aconst_null
      // 24: putfield com/discord/foreground_service/ForegroundServiceManager.service Landroid/app/Service;
      // 27: aload 0
      // 28: monitorexit
      // 29: return
      // 2a: astore 1
      // 2b: aload 0
      // 2c: monitorexit
      // 2d: aload 1
      // 2e: athrow
   }

   internal fun startService(context: Context, serviceConfigurations: List<ServiceNotificationConfiguration>) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc "context"
      // 05: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: aload 2
      // 09: ldc_w "serviceConfigurations"
      // 0c: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f: getstatic com/discord/permissions/NativePermissionPromise.INSTANCE Lcom/discord/permissions/NativePermissionPromise;
      // 12: astore 4
      // 14: new K1/b
      // 17: astore 5
      // 19: aload 5
      // 1b: aload 0
      // 1c: aload 1
      // 1d: aload 2
      // 1e: invokespecial K1/b.<init> (Lcom/discord/foreground_service/ForegroundServiceManager;Landroid/content/Context;Ljava/util/List;)V
      // 21: new K1/c
      // 24: astore 6
      // 26: aload 6
      // 28: invokespecial K1/c.<init> ()V
      // 2b: aload 4
      // 2d: aload 5
      // 2f: aload 6
      // 31: invokevirtual com/discord/permissions/NativePermissionPromise.generate (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/facebook/react/bridge/PromiseImpl;
      // 34: astore 4
      // 36: aload 0
      // 37: aload 2
      // 38: invokespecial com/discord/foreground_service/ForegroundServiceManager.getTypeFromServiceConfigurationList (Ljava/util/List;)Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;
      // 3b: astore 2
      // 3c: aload 1
      // 3d: checkcast com/facebook/react/bridge/ReactApplicationContext
      // 40: ldc_w com/discord/permissions/NativePermissionManagerModule
      // 43: invokevirtual com/facebook/react/bridge/ReactContext.getNativeModule (Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
      // 46: astore 1
      // 47: aload 1
      // 48: invokestatic kotlin/jvm/internal/r.e (Ljava/lang/Object;)V
      // 4b: aload 1
      // 4c: checkcast com/discord/permissions/NativePermissionManagerModule
      // 4f: astore 1
      // 50: getstatic com/discord/foreground_service/ForegroundServiceManager$WhenMappings.$EnumSwitchMapping$0 [I
      // 53: aload 2
      // 54: invokevirtual java/lang/Enum.ordinal ()I
      // 57: iaload
      // 58: istore 3
      // 59: iload 3
      // 5a: bipush 1
      // 5b: if_icmpeq 88
      // 5e: iload 3
      // 5f: bipush 2
      // 60: if_icmpeq 7f
      // 63: iload 3
      // 64: bipush 3
      // 65: if_icmpne 75
      // 68: aload 1
      // 69: aload 4
      // 6b: invokevirtual com/discord/permissions/NativePermissionManagerModule.requestForegroundServicePermissionVoiceCall (Lcom/facebook/react/bridge/Promise;)V
      // 6e: goto 8e
      // 71: astore 1
      // 72: goto 91
      // 75: new A9/n
      // 78: astore 1
      // 79: aload 1
      // 7a: invokespecial A9/n.<init> ()V
      // 7d: aload 1
      // 7e: athrow
      // 7f: aload 1
      // 80: aload 4
      // 82: invokevirtual com/discord/permissions/NativePermissionManagerModule.requestForegroundServicePermissionVoiceCall (Lcom/facebook/react/bridge/Promise;)V
      // 85: goto 8e
      // 88: aload 1
      // 89: aload 4
      // 8b: invokevirtual com/discord/permissions/NativePermissionManagerModule.requestForegroundServicePermissionFileUpload (Lcom/facebook/react/bridge/Promise;)V
      // 8e: aload 0
      // 8f: monitorexit
      // 90: return
      // 91: aload 0
      // 92: monitorexit
      // 93: aload 1
      // 94: athrow
   }

   internal fun stopService(context: Context) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc "context"
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
      // 18: ldc_w "Stop service."
      // 1b: aconst_null
      // 1c: bipush 4
      // 1d: aconst_null
      // 1e: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 21: getstatic com/discord/foreground_service/ForegroundService.Companion Lcom/discord/foreground_service/ForegroundService$Companion;
      // 24: aload 1
      // 25: aload 0
      // 26: getfield com/discord/foreground_service/ForegroundServiceManager.service Landroid/app/Service;
      // 29: invokevirtual com/discord/foreground_service/ForegroundService$Companion.stop (Landroid/content/Context;Landroid/app/Service;)V
      // 2c: aload 0
      // 2d: monitorexit
      // 2e: return
      // 2f: astore 1
      // 30: aload 0
      // 31: monitorexit
      // 32: aload 1
      // 33: athrow
   }

   public companion object {
      private final val tag: String
      public final val instance: ForegroundServiceManager
   }
}
