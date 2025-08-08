package com.discord.foreground_service

import A9.n
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Type
import com.discord.foreground_service.utils.Log
import com.discord.foreground_service.utils.Wakelocks
import com.discord.misc.utilities.intent.IntentUtilsKt
import com.discord.notifications.actions.intents.GenericAction
import com.discord.notifications.actions.intents.NotificationAction
import com.discord.permissions.NativePermissionManagerModule
import com.discord.permissions.NativePermissionPromise
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.PromiseImpl
import com.facebook.react.bridge.ReactApplicationContext
import java.lang.ref.WeakReference
import java.util.NoSuchElementException
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r

public object ForegroundServiceManager {
   private final val tag: String
   private final var serviceRef: WeakReference<Service>?
   private final val serviceWakelocks: Wakelocks
   private final var currentOperation: com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation?
   private final var nextOperation: com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation?

   @JvmStatic
   fun {
      val var0: java.lang.String = ForegroundServiceManager.class.getSimpleName();
      tag = var0;
      r.g(var0, "tag");
      serviceWakelocks = new Wakelocks(var0, 0L, 2, null);
   }

   private fun cleanupStateAfterServiceStop() {
      serviceWakelocks.release();
      serviceRef = null;
   }

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

   private fun handleCreateOrUpdateService(op: com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation.CreateOrUpdate) {
      val var4: ReactApplicationContext = var1.getContextRef().get();
      if (var4 != null) {
         val var5: ServiceNotificationConfiguration.Type = this.getTypeFromServiceConfigurationList(var1.getServiceConfigurations());
         val var3: PromiseImpl = NativePermissionPromise.INSTANCE.generate(new b(var5, var4), new c());
         val var6: NativeModule = var4.getNativeModule(NativePermissionManagerModule.class);
         r.e(var6);
         val var7: NativePermissionManagerModule = var6 as NativePermissionManagerModule;
         val var2: Int = ForegroundServiceManager.WhenMappings.$EnumSwitchMapping$0[var5.ordinal()];
         if (var2 != 1) {
            if (var2 != 2) {
               if (var2 != 3) {
                  throw new n();
               }

               var7.requestForegroundServicePermissionVoiceCall(var3);
            } else {
               var7.requestForegroundServicePermissionVoiceCall(var3);
            }
         } else {
            var7.requestForegroundServicePermissionFileUpload(var3);
         }
      }
   }

   @JvmStatic
   fun `handleCreateOrUpdateService$lambda$2`(var0: ServiceNotificationConfiguration.Type, var1: ReactApplicationContext): Unit {
      val var3: Log = Log.INSTANCE;
      val var2: java.lang.String = tag;
      r.g(tag, "tag");
      val var5: java.lang.String = var0.name();
      val var4: StringBuilder = new StringBuilder();
      var4.append("Create or update service with configuration type ");
      var4.append(var5);
      Log.i$foreground_service_release$default(var3, var2, var4.toString(), null, 4, null);
      ForegroundService.Companion.start(var1, new d());
      return Unit.a;
   }

   @JvmStatic
   fun `handleCreateOrUpdateService$lambda$2$lambda$1`(var0: Exception): Unit {
      r.h(var0, "e");
      val var2: Log = Log.INSTANCE;
      val var1: java.lang.String = tag;
      r.g(tag, "tag");
      var2.w$foreground_service_release(var1, "Unable to start service", var0);
      INSTANCE.onCreateOrUpdateServiceFailed();
      return Unit.a;
   }

   @JvmStatic
   fun `handleCreateOrUpdateService$lambda$3`(): Unit {
      val var1: Log = Log.INSTANCE;
      val var0: java.lang.String = tag;
      r.g(tag, "tag");
      Log.w$foreground_service_release$default(var1, var0, "Couldn't start ForegroundService", null, 4, null);
      INSTANCE.onCreateOrUpdateServiceFailed();
      return Unit.a;
   }

   private fun handleDestroyService(op: com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation.Destroy) {
      val var2: ReactApplicationContext = var1.getContextRef().get();
      if (var2 == null) {
         val var6: Log = Log.INSTANCE;
         val var8: java.lang.String = tag;
         r.g(tag, "tag");
         Log.i$foreground_service_release$default(var6, var8, "handleDestroyService context is null.", null, 4, null);
      } else {
         val var4: Service;
         if (serviceRef != null) {
            var4 = serviceRef.get();
         } else {
            var4 = null;
         }

         if (var4 == null) {
            val var7: Log = Log.INSTANCE;
            val var5: java.lang.String = tag;
            r.g(tag, "tag");
            Log.i$foreground_service_release$default(var7, var5, "handleDestroyService service is null.", null, 4, null);
            this.handleNextOperation();
         } else {
            ForegroundService.Companion.stop(var2, var4);
         }
      }
   }

   private fun handleNextOperation() {
      val var1: ForegroundServiceManager.ForegroundServiceOperation = nextOperation;
      currentOperation = nextOperation;
      nextOperation = null;
      if (var1 != null) {
         if (var1 is ForegroundServiceManager.ForegroundServiceOperation.CreateOrUpdate) {
            INSTANCE.handleCreateOrUpdateService(var1 as ForegroundServiceManager.ForegroundServiceOperation.CreateOrUpdate);
         } else {
            if (var1 !is ForegroundServiceManager.ForegroundServiceOperation.Destroy) {
               throw new n();
            }

            INSTANCE.handleDestroyService(var1 as ForegroundServiceManager.ForegroundServiceOperation.Destroy);
         }
      }
   }

   private fun handleQueueOperation(op: com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation) {
      nextOperation = var1;
      if (currentOperation == null) {
         this.handleNextOperation();
      }
   }

   private fun onCreateOrUpdateServiceFailed() {
      this.handleNextOperation();
   }

   public fun handleIntent(context: Context, intent: Intent): Unit? {
      r.h(var1, "context");
      r.h(var2, "intent");
      val var4: NotificationAction.Companion = NotificationAction.Companion;
      val var6: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, H.b(GenericAction.class))) {
         var6 = (androidx.core.content.c.b(var2, "action_intent_arg_key", GenericAction.class) as Parcelable) as NotificationAction;
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
      // 02: getstatic com/discord/foreground_service/ForegroundServiceManager.serviceRef Ljava/lang/ref/WeakReference;
      // 05: astore 2
      // 06: aload 2
      // 07: ifnull 19
      // 0a: aload 2
      // 0b: invokevirtual java/lang/ref/Reference.get ()Ljava/lang/Object;
      // 0e: checkcast android/app/Service
      // 11: astore 2
      // 12: goto 1b
      // 15: astore 2
      // 16: goto 2a
      // 19: aconst_null
      // 1a: astore 2
      // 1b: aload 2
      // 1c: ifnull 24
      // 1f: bipush 1
      // 20: istore 1
      // 21: goto 26
      // 24: bipush 0
      // 25: istore 1
      // 26: aload 0
      // 27: monitorexit
      // 28: iload 1
      // 29: ireturn
      // 2a: aload 0
      // 2b: monitorexit
      // 2c: aload 2
      // 2d: athrow
   }

   internal fun onRequestServiceCreateOrUpdate(context: ReactApplicationContext, serviceConfigurations: List<ServiceNotificationConfiguration>) {
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
      // 03: ldc_w "context"
      // 06: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 09: aload 2
      // 0a: ldc_w "serviceConfigurations"
      // 0d: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 10: new com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate
      // 13: astore 4
      // 15: new java/lang/ref/WeakReference
      // 18: astore 3
      // 19: aload 3
      // 1a: aload 1
      // 1b: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // 1e: aload 4
      // 20: aload 3
      // 21: aload 2
      // 22: invokespecial com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate.<init> (Ljava/lang/ref/WeakReference;Ljava/util/List;)V
      // 25: aload 0
      // 26: aload 4
      // 28: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleQueueOperation (Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation;)V
      // 2b: aload 0
      // 2c: monitorexit
      // 2d: return
      // 2e: astore 1
      // 2f: aload 0
      // 30: monitorexit
      // 31: aload 1
      // 32: athrow
   }

   internal fun onRequestServiceDestroy(context: ReactApplicationContext) {
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
      // 03: ldc_w "context"
      // 06: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 09: new com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$Destroy
      // 0c: astore 3
      // 0d: new java/lang/ref/WeakReference
      // 10: astore 2
      // 11: aload 2
      // 12: aload 1
      // 13: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // 16: aload 3
      // 17: aload 2
      // 18: invokespecial com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$Destroy.<init> (Ljava/lang/ref/WeakReference;)V
      // 1b: aload 0
      // 1c: aload 3
      // 1d: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleQueueOperation (Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation;)V
      // 20: aload 0
      // 21: monitorexit
      // 22: return
      // 23: astore 1
      // 24: aload 0
      // 25: monitorexit
      // 26: aload 1
      // 27: athrow
   }

   internal fun onServiceCreatedOrUpdated(foregroundService: Service) {
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
      // 19: ldc_w "On service created or updated."
      // 1c: aconst_null
      // 1d: bipush 4
      // 1e: aconst_null
      // 1f: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 22: new java/lang/ref/WeakReference
      // 25: astore 2
      // 26: aload 2
      // 27: aload 1
      // 28: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // 2b: aload 2
      // 2c: putstatic com/discord/foreground_service/ForegroundServiceManager.serviceRef Ljava/lang/ref/WeakReference;
      // 2f: getstatic com/discord/foreground_service/ForegroundServiceManager.serviceWakelocks Lcom/discord/foreground_service/utils/Wakelocks;
      // 32: aload 1
      // 33: invokevirtual com/discord/foreground_service/utils/Wakelocks.acquire (Landroid/content/Context;)V
      // 36: getstatic com/discord/foreground_service/service/ServiceNotification.INSTANCE Lcom/discord/foreground_service/service/ServiceNotification;
      // 39: astore 2
      // 3a: getstatic com/discord/foreground_service/ForegroundServiceManager.currentOperation Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation;
      // 3d: astore 3
      // 3e: aload 3
      // 3f: ldc_w "null cannot be cast to non-null type com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation.CreateOrUpdate"
      // 42: invokestatic kotlin/jvm/internal/r.f (Ljava/lang/Object;Ljava/lang/String;)V
      // 45: aload 2
      // 46: aload 1
      // 47: aload 1
      // 48: aload 3
      // 49: checkcast com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate
      // 4c: invokevirtual com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate.getServiceConfigurations ()Ljava/util/List;
      // 4f: invokevirtual com/discord/foreground_service/service/ServiceNotification.startForegroundCompat (Landroid/app/Service;Landroid/content/Context;Ljava/util/List;)V
      // 52: aload 0
      // 53: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleNextOperation ()V
      // 56: aload 0
      // 57: monitorexit
      // 58: return
      // 59: astore 1
      // 5a: aload 0
      // 5b: monitorexit
      // 5c: aload 1
      // 5d: athrow
   }

   internal fun onServiceDestroyed() {
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
      // 1c: invokespecial com/discord/foreground_service/ForegroundServiceManager.cleanupStateAfterServiceStop ()V
      // 1f: aload 0
      // 20: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleNextOperation ()V
      // 23: aload 0
      // 24: monitorexit
      // 25: return
      // 26: astore 1
      // 27: aload 0
      // 28: monitorexit
      // 29: aload 1
      // 2a: athrow
   }

   internal fun onServiceRecoveryAttempt(foregroundService: Service): Boolean {
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
      // 09: getstatic com/discord/foreground_service/ForegroundServiceManager.currentOperation Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation;
      // 0c: astore 2
      // 0d: aload 2
      // 0e: instanceof com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate
      // 11: ifeq 20
      // 14: aload 2
      // 15: checkcast com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate
      // 18: astore 2
      // 19: goto 22
      // 1c: astore 1
      // 1d: goto 75
      // 20: aconst_null
      // 21: astore 2
      // 22: aload 2
      // 23: ifnonnull 4f
      // 26: getstatic com/discord/foreground_service/utils/Log.INSTANCE Lcom/discord/foreground_service/utils/Log;
      // 29: astore 2
      // 2a: getstatic com/discord/foreground_service/ForegroundServiceManager.tag Ljava/lang/String;
      // 2d: astore 3
      // 2e: aload 3
      // 2f: ldc "tag"
      // 31: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 34: aload 2
      // 35: aload 3
      // 36: ldc_w "Service not recoverable. Stopping the service."
      // 39: aconst_null
      // 3a: bipush 4
      // 3b: aconst_null
      // 3c: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 3f: getstatic com/discord/foreground_service/ForegroundService.Companion Lcom/discord/foreground_service/ForegroundService$Companion;
      // 42: aconst_null
      // 43: aload 1
      // 44: invokevirtual com/discord/foreground_service/ForegroundService$Companion.stop (Landroid/content/Context;Landroid/app/Service;)V
      // 47: aload 0
      // 48: invokespecial com/discord/foreground_service/ForegroundServiceManager.cleanupStateAfterServiceStop ()V
      // 4b: aload 0
      // 4c: monitorexit
      // 4d: bipush 0
      // 4e: ireturn
      // 4f: getstatic com/discord/foreground_service/utils/Log.INSTANCE Lcom/discord/foreground_service/utils/Log;
      // 52: astore 1
      // 53: getstatic com/discord/foreground_service/ForegroundServiceManager.tag Ljava/lang/String;
      // 56: astore 3
      // 57: aload 3
      // 58: ldc "tag"
      // 5a: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 5d: aload 1
      // 5e: aload 3
      // 5f: ldc_w "Attempting to recover service."
      // 62: aconst_null
      // 63: bipush 4
      // 64: aconst_null
      // 65: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 68: aload 0
      // 69: aload 2
      // 6a: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleQueueOperation (Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation;)V
      // 6d: aload 0
      // 6e: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleNextOperation ()V
      // 71: aload 0
      // 72: monitorexit
      // 73: bipush 1
      // 74: ireturn
      // 75: aload 0
      // 76: monitorexit
      // 77: aload 1
      // 78: athrow
   }

   private sealed class ForegroundServiceOperation protected constructor() {
      public data class CreateOrUpdate(contextRef: WeakReference<ReactApplicationContext>, serviceConfigurations: List<ServiceNotificationConfiguration>)
         : ForegroundServiceManager.ForegroundServiceOperation {
         public final val contextRef: WeakReference<ReactApplicationContext>
         public final val serviceConfigurations: List<ServiceNotificationConfiguration>

         init {
            r.h(var1, "contextRef");
            r.h(var2, "serviceConfigurations");
            super(null);
            this.contextRef = var1;
            this.serviceConfigurations = var2;
         }

         public operator fun component1(): WeakReference<ReactApplicationContext> {
            return this.contextRef;
         }

         public operator fun component2(): List<ServiceNotificationConfiguration> {
            return this.serviceConfigurations;
         }

         public fun copy(
            contextRef: WeakReference<ReactApplicationContext> = var0.contextRef,
            serviceConfigurations: List<ServiceNotificationConfiguration> = var0.serviceConfigurations
         ): com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation.CreateOrUpdate {
            r.h(var1, "contextRef");
            r.h(var2, "serviceConfigurations");
            return new ForegroundServiceManager.ForegroundServiceOperation.CreateOrUpdate(var1, var2);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is ForegroundServiceManager.ForegroundServiceOperation.CreateOrUpdate) {
               return false;
            } else {
               var1 = var1;
               if (!r.c(this.contextRef, var1.contextRef)) {
                  return false;
               } else {
                  return r.c(this.serviceConfigurations, var1.serviceConfigurations);
               }
            }
         }

         public override fun hashCode(): Int {
            return this.contextRef.hashCode() * 31 + this.serviceConfigurations.hashCode();
         }

         public override fun toString(): String {
            val var2: WeakReference = this.contextRef;
            val var1: java.util.List = this.serviceConfigurations;
            val var3: StringBuilder = new StringBuilder();
            var3.append("CreateOrUpdate(contextRef=");
            var3.append(var2);
            var3.append(", serviceConfigurations=");
            var3.append(var1);
            var3.append(")");
            return var3.toString();
         }
      }

      public data class Destroy(contextRef: WeakReference<ReactApplicationContext>) : ForegroundServiceManager.ForegroundServiceOperation {
         public final val contextRef: WeakReference<ReactApplicationContext>

         init {
            r.h(var1, "contextRef");
            super(null);
            this.contextRef = var1;
         }

         public operator fun component1(): WeakReference<ReactApplicationContext> {
            return this.contextRef;
         }

         public fun copy(contextRef: WeakReference<ReactApplicationContext> = var0.contextRef): com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation.Destroy {
            r.h(var1, "contextRef");
            return new ForegroundServiceManager.ForegroundServiceOperation.Destroy(var1);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is ForegroundServiceManager.ForegroundServiceOperation.Destroy) {
               return false;
            } else {
               return r.c(this.contextRef, (var1 as ForegroundServiceManager.ForegroundServiceOperation.Destroy).contextRef);
            }
         }

         public override fun hashCode(): Int {
            return this.contextRef.hashCode();
         }

         public override fun toString(): String {
            val var2: WeakReference = this.contextRef;
            val var1: StringBuilder = new StringBuilder();
            var1.append("Destroy(contextRef=");
            var1.append(var2);
            var1.append(")");
            return var1.toString();
         }
      }
   }
}
