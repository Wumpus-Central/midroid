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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nForegroundServiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundServiceManager.kt\ncom/discord/foreground_service/ForegroundServiceManager\n+ 2 NotificationAction.kt\ncom/discord/notifications/actions/intents/NotificationAction$Companion\n+ 3 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n86#2,2:191\n89#2,2:194\n14#3:193\n1948#4,14:196\n*S KotlinDebug\n*F\n+ 1 ForegroundServiceManager.kt\ncom/discord/foreground_service/ForegroundServiceManager\n*L\n39#1:191,2\n39#1:194,2\n39#1:193\n173#1:196,14\n*E\n"])
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
      val var3: Log = Log.INSTANCE;
      val var2: java.lang.String = tag;
      val var4: java.lang.String = var0.name();
      val var5: StringBuilder = new StringBuilder();
      var5.append("Create or update service with configuration type ");
      var5.append(var4);
      Log.i$foreground_service_release$default(var3, var2, var5.toString(), null, 4, null);
      ForegroundService.Companion.start(var1, new d());
      return Unit.a;
   }

   @JvmStatic
   fun `handleCreateOrUpdateService$lambda$2$lambda$1`(var0: Exception): Unit {
      val var1: Log = Log.INSTANCE;
      val var2: java.lang.String = tag;
      var1.w$foreground_service_release(var2, "Unable to start service", var0);
      INSTANCE.onCreateOrUpdateServiceFailed();
      return Unit.a;
   }

   @JvmStatic
   fun `handleCreateOrUpdateService$lambda$3`(): Unit {
      val var1: Log = Log.INSTANCE;
      val var0: java.lang.String = tag;
      Log.w$foreground_service_release$default(var1, var0, "Couldn't start ForegroundService", null, 4, null);
      INSTANCE.onCreateOrUpdateServiceFailed();
      return Unit.a;
   }

   private fun handleDestroyService(op: com.discord.foreground_service.ForegroundServiceManager.ForegroundServiceOperation.Destroy) {
      val var2: ReactApplicationContext = var1.getContextRef().get();
      if (var2 == null) {
         val var6: Log = Log.INSTANCE;
         val var8: java.lang.String = tag;
         Log.i$foreground_service_release$default(var6, var8, "handleDestroyService context is null.", null, 4, null);
      } else {
         val var4: Service;
         if (serviceRef != null) {
            var4 = serviceRef.get();
         } else {
            var4 = null;
         }

         if (var4 == null) {
            val var5: Log = Log.INSTANCE;
            val var7: java.lang.String = tag;
            Log.i$foreground_service_release$default(var5, var7, "handleDestroyService service is null.", null, 4, null);
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

   internal fun onServiceCreatedOrUpdated(foregroundService: Service): Boolean {
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
      // 0c: astore 3
      // 0d: aload 3
      // 0e: instanceof com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate
      // 11: ifeq 20
      // 14: aload 3
      // 15: checkcast com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate
      // 18: astore 3
      // 19: goto 22
      // 1c: astore 1
      // 1d: goto 74
      // 20: aconst_null
      // 21: astore 3
      // 22: aload 3
      // 23: ifnonnull 2a
      // 26: aload 0
      // 27: monitorexit
      // 28: bipush 1
      // 29: ireturn
      // 2a: getstatic com/discord/foreground_service/utils/Log.INSTANCE Lcom/discord/foreground_service/utils/Log;
      // 2d: astore 4
      // 2f: getstatic com/discord/foreground_service/ForegroundServiceManager.tag Ljava/lang/String;
      // 32: astore 5
      // 34: aload 5
      // 36: ldc "tag"
      // 38: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3b: aload 4
      // 3d: aload 5
      // 3f: ldc_w "On service created or updated."
      // 42: aconst_null
      // 43: bipush 4
      // 44: aconst_null
      // 45: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 48: new java/lang/ref/WeakReference
      // 4b: astore 4
      // 4d: aload 4
      // 4f: aload 1
      // 50: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // 53: aload 4
      // 55: putstatic com/discord/foreground_service/ForegroundServiceManager.serviceRef Ljava/lang/ref/WeakReference;
      // 58: getstatic com/discord/foreground_service/ForegroundServiceManager.serviceWakelocks Lcom/discord/foreground_service/utils/Wakelocks;
      // 5b: aload 1
      // 5c: invokevirtual com/discord/foreground_service/utils/Wakelocks.acquire (Landroid/content/Context;)V
      // 5f: getstatic com/discord/foreground_service/service/ServiceNotification.INSTANCE Lcom/discord/foreground_service/service/ServiceNotification;
      // 62: aload 1
      // 63: aload 1
      // 64: aload 3
      // 65: invokevirtual com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate.getServiceConfigurations ()Ljava/util/List;
      // 68: invokevirtual com/discord/foreground_service/service/ServiceNotification.startForegroundCompat (Landroid/app/Service;Landroid/content/Context;Ljava/util/List;)Z
      // 6b: istore 2
      // 6c: aload 0
      // 6d: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleNextOperation ()V
      // 70: aload 0
      // 71: monitorexit
      // 72: iload 2
      // 73: ireturn
      // 74: aload 0
      // 75: monitorexit
      // 76: aload 1
      // 77: athrow
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
      // 0d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 10: aload 1
      // 11: aload 2
      // 12: ldc_w "On service destroyed."
      // 15: aconst_null
      // 16: bipush 4
      // 17: aconst_null
      // 18: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 1b: getstatic com/discord/foreground_service/ForegroundServiceManager.serviceWakelocks Lcom/discord/foreground_service/utils/Wakelocks;
      // 1e: invokevirtual com/discord/foreground_service/utils/Wakelocks.release ()V
      // 21: aconst_null
      // 22: putstatic com/discord/foreground_service/ForegroundServiceManager.serviceRef Ljava/lang/ref/WeakReference;
      // 25: aload 0
      // 26: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleNextOperation ()V
      // 29: aload 0
      // 2a: monitorexit
      // 2b: return
      // 2c: astore 1
      // 2d: aload 0
      // 2e: monitorexit
      // 2f: aload 1
      // 30: athrow
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
            val var1: WeakReference = this.contextRef;
            val var2: java.util.List = this.serviceConfigurations;
            val var3: StringBuilder = new StringBuilder();
            var3.append("CreateOrUpdate(contextRef=");
            var3.append(var1);
            var3.append(", serviceConfigurations=");
            var3.append(var2);
            var3.append(")");
            return var3.toString();
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
            val var1: WeakReference = this.contextRef;
            val var2: StringBuilder = new StringBuilder();
            var2.append("Destroy(contextRef=");
            var2.append(var1);
            var2.append(")");
            return var2.toString();
         }
      }
   }
}
