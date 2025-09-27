package com.discord.foreground_service

import B9.n
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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nForegroundServiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundServiceManager.kt\ncom/discord/foreground_service/ForegroundServiceManager\n+ 2 NotificationAction.kt\ncom/discord/notifications/actions/intents/NotificationAction$Companion\n+ 3 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n86#2,2:187\n89#2,2:190\n14#3:189\n1948#4,14:192\n*S KotlinDebug\n*F\n+ 1 ForegroundServiceManager.kt\ncom/discord/foreground_service/ForegroundServiceManager\n*L\n37#1:187,2\n37#1:190,2\n37#1:189\n169#1:192,14\n*E\n"])
public object ForegroundServiceManager {
   private final var serviceRef: WeakReference<Service>?
   private final val serviceWakelocks: Wakelocks
   private final var currentOperation: com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation?
   private final var nextOperation: com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation?

   @JvmStatic
   fun {
      val var0: java.lang.String = ForegroundServiceManager.class.getSimpleName();
      serviceWakelocks = new Wakelocks(var0, 0L, 2, null);
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

   private fun handleCreateOrUpdateService(op: com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation.CreateOrUpdate) {
      val var4: ReactApplicationContext = var1.getContextRef().get();
      if (var4 != null) {
         val var3: ServiceNotificationConfiguration.Type = this.getTypeFromServiceConfigurationList(var1.getServiceConfigurations());
         val var5: PromiseImpl = NativePermissionPromise.INSTANCE.generate(new b(var3, var4), new c());
         val var6: NativeModule = var4.getNativeModule(NativePermissionManagerModule.class);
         val var7: NativePermissionManagerModule = var6 as NativePermissionManagerModule;
         val var2: Int = ForegroundServiceManager.WhenMappings.$EnumSwitchMapping$0[var3.ordinal()];
         if (var2 != 1) {
            if (var2 != 2) {
               if (var2 != 3) {
                  throw new n();
               }

               var7.requestForegroundServicePermissionScreenShareWithMic(var5);
            } else {
               var7.requestForegroundServicePermissionVoiceCall(var5);
            }
         } else {
            var7.requestForegroundServicePermissionFileUpload(var5);
         }
      }
   }

   @JvmStatic
   fun `handleCreateOrUpdateService$lambda$2`(var0: ServiceNotificationConfiguration.Type, var1: ReactApplicationContext): Unit {
      val var2: Log = Log.INSTANCE;
      val var4: java.lang.String = var0.name();
      val var3: StringBuilder = new StringBuilder();
      var3.append("Create or update service with configuration type ");
      var3.append(var4);
      Log.i$foreground_service_release$default(var2, var3.toString(), null, 2, null);
      ForegroundService.Companion.start(var1, new d());
      return Unit.a;
   }

   @JvmStatic
   fun `handleCreateOrUpdateService$lambda$2$lambda$1`(var0: Exception): Unit {
      Log.INSTANCE.w$foreground_service_release("Unable to start service", var0);
      INSTANCE.onCreateOrUpdateServiceFailed();
      return Unit.a;
   }

   @JvmStatic
   fun `handleCreateOrUpdateService$lambda$3`(): Unit {
      Log.w$foreground_service_release$default(Log.INSTANCE, "Couldn't start ForegroundService", null, 2, null);
      INSTANCE.onCreateOrUpdateServiceFailed();
      return Unit.a;
   }

   private fun handleDestroyService(op: com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation.Destroy) {
      val var2: ReactApplicationContext = var1.getContextRef().get();
      if (var2 == null) {
         Log.i$foreground_service_release$default(Log.INSTANCE, "handleDestroyService context is null.", null, 2, null);
      } else {
         val var4: Service;
         if (serviceRef != null) {
            var4 = serviceRef.get();
         } else {
            var4 = null;
         }

         if (var4 == null) {
            Log.i$foreground_service_release$default(Log.INSTANCE, "handleDestroyService service is null.", null, 2, null);
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
      val var4: NotificationAction.Companion = NotificationAction.Companion;
      val var6: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, GenericAction::class)) {
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
      // 06: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 09: aload 2
      // 0a: ldc_w "serviceConfigurations"
      // 0d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 10: new com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate
      // 13: astore 3
      // 14: new java/lang/ref/WeakReference
      // 17: astore 4
      // 19: aload 4
      // 1b: aload 1
      // 1c: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // 1f: aload 3
      // 20: aload 4
      // 22: aload 2
      // 23: invokespecial com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate.<init> (Ljava/lang/ref/WeakReference;Ljava/util/List;)V
      // 26: aload 0
      // 27: aload 3
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
      // 06: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 06: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 1d: goto 5c
      // 20: aconst_null
      // 21: astore 2
      // 22: aload 2
      // 23: ifnonnull 29
      // 26: aload 0
      // 27: monitorexit
      // 28: return
      // 29: getstatic com/discord/foreground_service/utils/Log.INSTANCE Lcom/discord/foreground_service/utils/Log;
      // 2c: ldc_w "On service created or updated."
      // 2f: aconst_null
      // 30: bipush 2
      // 31: aconst_null
      // 32: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 35: new java/lang/ref/WeakReference
      // 38: astore 3
      // 39: aload 3
      // 3a: aload 1
      // 3b: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // 3e: aload 3
      // 3f: putstatic com/discord/foreground_service/ForegroundServiceManager.serviceRef Ljava/lang/ref/WeakReference;
      // 42: getstatic com/discord/foreground_service/ForegroundServiceManager.serviceWakelocks Lcom/discord/foreground_service/utils/Wakelocks;
      // 45: aload 1
      // 46: invokevirtual com/discord/foreground_service/utils/Wakelocks.acquire (Landroid/content/Context;)V
      // 49: getstatic com/discord/foreground_service/service/ServiceNotification.INSTANCE Lcom/discord/foreground_service/service/ServiceNotification;
      // 4c: aload 1
      // 4d: aload 1
      // 4e: aload 2
      // 4f: invokevirtual com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate.getServiceConfigurations ()Ljava/util/List;
      // 52: invokevirtual com/discord/foreground_service/service/ServiceNotification.startForegroundCompat (Landroid/app/Service;Landroid/content/Context;Ljava/util/List;)V
      // 55: aload 0
      // 56: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleNextOperation ()V
      // 59: aload 0
      // 5a: monitorexit
      // 5b: return
      // 5c: aload 0
      // 5d: monitorexit
      // 5e: aload 1
      // 5f: athrow
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
      // 05: ldc_w "On service destroyed."
      // 08: aconst_null
      // 09: bipush 2
      // 0a: aconst_null
      // 0b: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 0e: getstatic com/discord/foreground_service/ForegroundServiceManager.serviceWakelocks Lcom/discord/foreground_service/utils/Wakelocks;
      // 11: invokevirtual com/discord/foreground_service/utils/Wakelocks.release ()V
      // 14: aconst_null
      // 15: putstatic com/discord/foreground_service/ForegroundServiceManager.serviceRef Ljava/lang/ref/WeakReference;
      // 18: aload 0
      // 19: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleNextOperation ()V
      // 1c: aload 0
      // 1d: monitorexit
      // 1e: return
      // 1f: astore 1
      // 20: aload 0
      // 21: monitorexit
      // 22: aload 1
      // 23: athrow
   }

   private sealed class ForegroundServiceOperation protected constructor() {
      public data class CreateOrUpdate(contextRef: WeakReference<ReactApplicationContext>, serviceConfigurations: List<ServiceNotificationConfiguration>) : ForegroundServiceManager.ForegroundServiceOperation() {
         public final val contextRef: WeakReference<ReactApplicationContext>
         public final val serviceConfigurations: List<ServiceNotificationConfiguration>

         init {
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
            return new ForegroundServiceManager.ForegroundServiceOperation.CreateOrUpdate(var1, var2);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is ForegroundServiceManager.ForegroundServiceOperation.CreateOrUpdate) {
               return false;
            } else {
               var1 = var1;
               if (!(this.contextRef == var1.contextRef)) {
                  return false;
               } else {
                  return this.serviceConfigurations == var1.serviceConfigurations;
               }
            }
         }

         public override fun hashCode(): Int {
            return this.contextRef.hashCode() * 31 + this.serviceConfigurations.hashCode();
         }

         public override fun toString(): String {
            val var3: WeakReference = this.contextRef;
            val var1: java.util.List = this.serviceConfigurations;
            val var2: StringBuilder = new StringBuilder();
            var2.append("CreateOrUpdate(contextRef=");
            var2.append(var3);
            var2.append(", serviceConfigurations=");
            var2.append(var1);
            var2.append(")");
            return var2.toString();
         }
      }

      public data class Destroy(contextRef: WeakReference<ReactApplicationContext>) : ForegroundServiceManager.ForegroundServiceOperation() {
         public final val contextRef: WeakReference<ReactApplicationContext>

         init {
            this.contextRef = var1;
         }

         public operator fun component1(): WeakReference<ReactApplicationContext> {
            return this.contextRef;
         }

         public fun copy(contextRef: WeakReference<ReactApplicationContext> = var0.contextRef): com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation.Destroy {
            return new ForegroundServiceManager.ForegroundServiceOperation.Destroy(var1);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is ForegroundServiceManager.ForegroundServiceOperation.Destroy) {
               return false;
            } else {
               return this.contextRef == (var1 as ForegroundServiceManager.ForegroundServiceOperation.Destroy).contextRef;
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
