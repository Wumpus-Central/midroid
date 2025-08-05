package com.discord.foreground_service

import B9.n
import L1.b
import L1.c
import L1.d
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

public class ForegroundServiceManager private constructor(contextRef: WeakReference<ReactApplicationContext>) {
   public final val contextRef: WeakReference<ReactApplicationContext>
   private final var serviceRef: WeakReference<Service>?
   private final val serviceWakelocks: Wakelocks
   private final var currentOperation: ForegroundServiceOperation?
   private final var nextOperation: ForegroundServiceOperation?

   init {
      this.contextRef = var1;
      val var2: java.lang.String = tag;
      r.g(tag, "tag");
      this.serviceWakelocks = new Wakelocks(var2, 0L, 2, null);
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

   private fun handleCreateOrUpdateService(serviceConfigurations: List<ServiceNotificationConfiguration>) {
      val var4: ReactApplicationContext = this.contextRef.get();
      if (var4 != null) {
         val var3: PromiseImpl = NativePermissionPromise.INSTANCE.generate(new c(var1, var4, this), new d(this));
         val var5: ServiceNotificationConfiguration.Type = this.getTypeFromServiceConfigurationList(var1);
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
   fun `handleCreateOrUpdateService$lambda$2`(var0: java.util.List, var1: ReactApplicationContext, var2: ForegroundServiceManager): Unit {
      val var5: Log = Log.INSTANCE;
      val var4: java.lang.String = tag;
      r.g(tag, "tag");
      val var3: Int = var0.size();
      val var6: StringBuilder = new StringBuilder();
      var6.append("Create or update service with ");
      var6.append(var3);
      var6.append(" configurations.");
      Log.i$foreground_service_release$default(var5, var4, var6.toString(), null, 4, null);
      ForegroundService.Companion.start(var1, new b(var2));
      return Unit.a;
   }

   @JvmStatic
   fun `handleCreateOrUpdateService$lambda$2$lambda$1`(var0: ForegroundServiceManager, var1: Exception): Unit {
      r.h(var1, "e");
      val var3: Log = Log.INSTANCE;
      val var2: java.lang.String = tag;
      r.g(tag, "tag");
      var3.w$foreground_service_release(var2, "Unable to start service", var1);
      var0.onCreateOrUpdateServiceFailed();
      return Unit.a;
   }

   @JvmStatic
   fun `handleCreateOrUpdateService$lambda$3`(var0: ForegroundServiceManager): Unit {
      val var2: Log = Log.INSTANCE;
      val var1: java.lang.String = tag;
      r.g(tag, "tag");
      Log.w$foreground_service_release$default(var2, var1, "Couldn't start ForegroundService", null, 4, null);
      var0.onCreateOrUpdateServiceFailed();
      return Unit.a;
   }

   private fun handleDestroyService() {
      val var2: ReactApplicationContext = this.contextRef.get();
      if (var2 == null) {
         val var5: Log = Log.INSTANCE;
         val var7: java.lang.String = tag;
         r.g(tag, "tag");
         Log.i$foreground_service_release$default(var5, var7, "handleDestroyService context is null.", null, 4, null);
      } else {
         val var3: Service;
         if (this.serviceRef != null) {
            var3 = this.serviceRef.get();
         } else {
            var3 = null;
         }

         if (var3 == null) {
            val var4: Log = Log.INSTANCE;
            val var6: java.lang.String = tag;
            r.g(tag, "tag");
            Log.i$foreground_service_release$default(var4, var6, "handleDestroyService service is null.", null, 4, null);
            this.handleNextOperation();
         } else {
            ForegroundService.Companion.stop(var2, var3);
         }
      }
   }

   private fun handleNextOperation() {
      val var1: ForegroundServiceOperation = this.nextOperation;
      this.currentOperation = this.nextOperation;
      this.nextOperation = null;
      if (var1 != null) {
         if (var1 is ForegroundServiceOperation.CreateOrUpdate) {
            this.handleCreateOrUpdateService((var1 as ForegroundServiceOperation.CreateOrUpdate).getServiceConfigurations());
         } else {
            if (var1 !is ForegroundServiceOperation.Destroy) {
               throw new n();
            }

            this.handleDestroyService();
         }
      }
   }

   private fun handleQueueOperation(op: ForegroundServiceOperation) {
      this.nextOperation = var1;
      if (this.currentOperation == null) {
         this.handleNextOperation();
      }
   }

   private fun onCreateOrUpdateServiceFailed() {
      this.handleNextOperation();
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
      // 03: getfield com/discord/foreground_service/ForegroundServiceManager.serviceRef Ljava/lang/ref/WeakReference;
      // 06: astore 2
      // 07: aload 2
      // 08: ifnull 1a
      // 0b: aload 2
      // 0c: invokevirtual java/lang/ref/Reference.get ()Ljava/lang/Object;
      // 0f: checkcast android/app/Service
      // 12: astore 2
      // 13: goto 1c
      // 16: astore 2
      // 17: goto 2b
      // 1a: aconst_null
      // 1b: astore 2
      // 1c: aload 2
      // 1d: ifnull 25
      // 20: bipush 1
      // 21: istore 1
      // 22: goto 27
      // 25: bipush 0
      // 26: istore 1
      // 27: aload 0
      // 28: monitorexit
      // 29: iload 1
      // 2a: ireturn
      // 2b: aload 0
      // 2c: monitorexit
      // 2d: aload 2
      // 2e: athrow
   }

   internal fun onRequestServiceCreateOrUpdate(serviceConfigurations: List<ServiceNotificationConfiguration>) {
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
      // 03: ldc_w "serviceConfigurations"
      // 06: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 09: new com/discord/foreground_service/ForegroundServiceOperation$CreateOrUpdate
      // 0c: astore 2
      // 0d: aload 2
      // 0e: aload 1
      // 0f: invokespecial com/discord/foreground_service/ForegroundServiceOperation$CreateOrUpdate.<init> (Ljava/util/List;)V
      // 12: aload 0
      // 13: aload 2
      // 14: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleQueueOperation (Lcom/discord/foreground_service/ForegroundServiceOperation;)V
      // 17: aload 0
      // 18: monitorexit
      // 19: return
      // 1a: astore 1
      // 1b: aload 0
      // 1c: monitorexit
      // 1d: aload 1
      // 1e: athrow
   }

   internal fun onRequestServiceDestroy() {
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
      // 03: getstatic com/discord/foreground_service/ForegroundServiceOperation$Destroy.INSTANCE Lcom/discord/foreground_service/ForegroundServiceOperation$Destroy;
      // 06: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleQueueOperation (Lcom/discord/foreground_service/ForegroundServiceOperation;)V
      // 09: aload 0
      // 0a: monitorexit
      // 0b: return
      // 0c: astore 1
      // 0d: aload 0
      // 0e: monitorexit
      // 0f: aload 1
      // 10: athrow
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
      // 2b: aload 0
      // 2c: aload 2
      // 2d: putfield com/discord/foreground_service/ForegroundServiceManager.serviceRef Ljava/lang/ref/WeakReference;
      // 30: aload 0
      // 31: getfield com/discord/foreground_service/ForegroundServiceManager.serviceWakelocks Lcom/discord/foreground_service/utils/Wakelocks;
      // 34: aload 1
      // 35: invokevirtual com/discord/foreground_service/utils/Wakelocks.acquire (Landroid/content/Context;)V
      // 38: getstatic com/discord/foreground_service/service/ServiceNotification.INSTANCE Lcom/discord/foreground_service/service/ServiceNotification;
      // 3b: astore 2
      // 3c: aload 0
      // 3d: getfield com/discord/foreground_service/ForegroundServiceManager.currentOperation Lcom/discord/foreground_service/ForegroundServiceOperation;
      // 40: astore 3
      // 41: aload 3
      // 42: ldc_w "null cannot be cast to non-null type com.discord.foreground_service.ForegroundServiceOperation.CreateOrUpdate"
      // 45: invokestatic kotlin/jvm/internal/r.f (Ljava/lang/Object;Ljava/lang/String;)V
      // 48: aload 2
      // 49: aload 1
      // 4a: aload 1
      // 4b: aload 3
      // 4c: checkcast com/discord/foreground_service/ForegroundServiceOperation$CreateOrUpdate
      // 4f: invokevirtual com/discord/foreground_service/ForegroundServiceOperation$CreateOrUpdate.getServiceConfigurations ()Ljava/util/List;
      // 52: invokevirtual com/discord/foreground_service/service/ServiceNotification.startForegroundCompat (Landroid/app/Service;Landroid/content/Context;Ljava/util/List;)V
      // 55: aload 0
      // 56: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleNextOperation ()V
      // 59: aload 0
      // 5a: monitorexit
      // 5b: return
      // 5c: astore 1
      // 5d: aload 0
      // 5e: monitorexit
      // 5f: aload 1
      // 60: athrow
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
      // 1c: getfield com/discord/foreground_service/ForegroundServiceManager.serviceWakelocks Lcom/discord/foreground_service/utils/Wakelocks;
      // 1f: invokevirtual com/discord/foreground_service/utils/Wakelocks.release ()V
      // 22: aload 0
      // 23: aconst_null
      // 24: putfield com/discord/foreground_service/ForegroundServiceManager.serviceRef Ljava/lang/ref/WeakReference;
      // 27: aload 0
      // 28: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleNextOperation ()V
      // 2b: aload 0
      // 2c: monitorexit
      // 2d: return
      // 2e: astore 1
      // 2f: aload 0
      // 30: monitorexit
      // 31: aload 1
      // 32: athrow
   }

   public companion object {
      private final val tag: String

      public final lateinit var instance: ForegroundServiceManager
         internal set

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

      public fun initialize(reactApplicationContext: ReactApplicationContext) {
         r.h(var1, "reactApplicationContext");
         this.setInstance(new ForegroundServiceManager(new WeakReference<>(var1), null));
      }
   }
}
