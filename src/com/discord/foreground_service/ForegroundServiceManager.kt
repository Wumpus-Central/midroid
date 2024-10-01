package com.discord.foreground_service

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import androidx.core.content.b
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Type
import com.discord.foreground_service.utils.Log
import com.discord.foreground_service.utils.Wakelocks
import com.discord.misc.utilities.intent.IntentUtilsKt
import com.discord.notifications.actions.intents.GenericAction
import com.discord.notifications.actions.intents.NotificationAction
import java.util.NoSuchElementException
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

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

   private fun startServiceInternal(context: Context, serviceConfigurations: List<ServiceNotificationConfiguration>) {
      val var5: Log = Log.INSTANCE;
      val var6: java.lang.String = tag;
      q.g(tag, "tag");
      val var3: Int = var2.size();
      val var4: StringBuilder = new StringBuilder();
      var4.append("Start service with ");
      var4.append(var3);
      var4.append(" configurations.");
      Log.i$foreground_service_release$default(var5, var6, var4.toString(), null, 4, null);
      this.serviceConfigurations = var2;
      ForegroundService.Companion.start(var1, <unrepresentable>.INSTANCE);
   }

   public fun handleIntent(context: Context, intent: Intent): Unit? {
      q.h(var1, "context");
      q.h(var2, "intent");
      val var4: NotificationAction.Companion = NotificationAction.Companion;
      val var6: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, g0.b(GenericAction.class))) {
         var6 = (b.b(var2, "action_intent_arg_key", GenericAction.class) as Parcelable) as NotificationAction;
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc "foregroundService"
      // 05: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: getstatic com/discord/foreground_service/utils/Log.INSTANCE Lcom/discord/foreground_service/utils/Log;
      // 0b: astore 3
      // 0c: getstatic com/discord/foreground_service/ForegroundServiceManager.tag Ljava/lang/String;
      // 0f: astore 2
      // 10: aload 2
      // 11: ldc "tag"
      // 13: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 16: aload 3
      // 17: aload 2
      // 18: ldc "On service connected."
      // 1a: aconst_null
      // 1b: bipush 4
      // 1c: aconst_null
      // 1d: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 20: aload 0
      // 21: aload 1
      // 22: putfield com/discord/foreground_service/ForegroundServiceManager.service Landroid/app/Service;
      // 25: aload 1
      // 26: ifnull 60
      // 29: aload 0
      // 2a: getfield com/discord/foreground_service/ForegroundServiceManager.serviceConfigurations Ljava/util/List;
      // 2d: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 32: bipush 1
      // 33: ixor
      // 34: ifeq 4a
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
      // 4f: aload 2
      // 50: ldc "tag"
      // 52: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 55: aload 3
      // 56: aload 2
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
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
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
      // 0f: getstatic com/discord/permissions/NativePermissionPromise.INSTANCE Lcom/discord/permissions/NativePermissionPromise;
      // 12: astore 4
      // 14: new com/discord/foreground_service/ForegroundServiceManager$startService$promise$1
      // 17: astore 5
      // 19: aload 5
      // 1b: aload 0
      // 1c: aload 1
      // 1d: aload 2
      // 1e: invokespecial com/discord/foreground_service/ForegroundServiceManager$startService$promise$1.<init> (Lcom/discord/foreground_service/ForegroundServiceManager;Landroid/content/Context;Ljava/util/List;)V
      // 21: aload 4
      // 23: aload 5
      // 25: getstatic com/discord/foreground_service/ForegroundServiceManager$startService$promise$2.INSTANCE Lcom/discord/foreground_service/ForegroundServiceManager$startService$promise$2;
      // 28: invokevirtual com/discord/permissions/NativePermissionPromise.generate (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/facebook/react/bridge/PromiseImpl;
      // 2b: astore 4
      // 2d: aload 0
      // 2e: aload 2
      // 2f: invokespecial com/discord/foreground_service/ForegroundServiceManager.getTypeFromServiceConfigurationList (Ljava/util/List;)Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;
      // 32: astore 2
      // 33: aload 1
      // 34: checkcast com/facebook/react/bridge/ReactApplicationContext
      // 37: ldc_w com/discord/permissions/NativePermissionManagerModule
      // 3a: invokevirtual com/facebook/react/bridge/ReactContext.getNativeModule (Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
      // 3d: astore 1
      // 3e: aload 1
      // 3f: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 42: aload 1
      // 43: checkcast com/discord/permissions/NativePermissionManagerModule
      // 46: astore 1
      // 47: getstatic com/discord/foreground_service/ForegroundServiceManager$WhenMappings.$EnumSwitchMapping$0 [I
      // 4a: aload 2
      // 4b: invokevirtual java/lang/Enum.ordinal ()I
      // 4e: iaload
      // 4f: istore 3
      // 50: iload 3
      // 51: bipush 1
      // 52: if_icmpeq 78
      // 55: iload 3
      // 56: bipush 2
      // 57: if_icmpeq 6f
      // 5a: iload 3
      // 5b: bipush 3
      // 5c: if_icmpeq 62
      // 5f: goto 7e
      // 62: aload 1
      // 63: aload 4
      // 65: invokevirtual com/discord/permissions/NativePermissionManagerModule.requestForegroundServicePermissionVoiceCall (Lcom/facebook/react/bridge/Promise;)V
      // 68: goto 7e
      // 6b: astore 1
      // 6c: goto 81
      // 6f: aload 1
      // 70: aload 4
      // 72: invokevirtual com/discord/permissions/NativePermissionManagerModule.requestForegroundServicePermissionVoiceCall (Lcom/facebook/react/bridge/Promise;)V
      // 75: goto 7e
      // 78: aload 1
      // 79: aload 4
      // 7b: invokevirtual com/discord/permissions/NativePermissionManagerModule.requestForegroundServicePermissionFileUpload (Lcom/facebook/react/bridge/Promise;)V
      // 7e: aload 0
      // 7f: monitorexit
      // 80: return
      // 81: aload 0
      // 82: monitorexit
      // 83: aload 1
      // 84: athrow
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
