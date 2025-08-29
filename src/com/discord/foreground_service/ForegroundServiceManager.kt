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

@SourceDebugExtension(["SMAP\nForegroundServiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundServiceManager.kt\ncom/discord/foreground_service/ForegroundServiceManager\n+ 2 NotificationAction.kt\ncom/discord/notifications/actions/intents/NotificationAction$Companion\n+ 3 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n86#2,2:220\n89#2,2:223\n14#3:222\n1948#4,14:225\n*S KotlinDebug\n*F\n+ 1 ForegroundServiceManager.kt\ncom/discord/foreground_service/ForegroundServiceManager\n*L\n39#1:220,2\n39#1:223,2\n39#1:222\n202#1:225,14\n*E\n"])
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
         val var5: ServiceNotificationConfiguration.Type = this.getTypeFromServiceConfigurationList(var1.getServiceConfigurations());
         val var3: PromiseImpl = NativePermissionPromise.INSTANCE.generate(new b(var5, var4), new c());
         val var6: NativeModule = var4.getNativeModule(NativePermissionManagerModule.class);
         val var7: NativePermissionManagerModule = var6 as NativePermissionManagerModule;
         val var2: Int = ForegroundServiceManager.WhenMappings.$EnumSwitchMapping$0[var5.ordinal()];
         if (var2 != 1) {
            if (var2 != 2) {
               if (var2 != 3) {
                  throw new n();
               }

               var7.requestForegroundServicePermissionScreenShareWithMic(var3);
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
      val var2: Log = Log.INSTANCE;
      val var1: java.lang.String = tag;
      var2.w$foreground_service_release(var1, "Unable to start service", var0);
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
      // 05: astore 2
      // 06: getstatic com/discord/foreground_service/ForegroundServiceManager.tag Ljava/lang/String;
      // 09: astore 1
      // 0a: aload 1
      // 0b: ldc "tag"
      // 0d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 10: aload 2
      // 11: aload 1
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

   internal fun onServiceStartCommandReceived(foregroundService: Service, intent: Intent?): Boolean {
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
      // 000: aload 0
      // 001: monitorenter
      // 002: aload 1
      // 003: ldc_w "foregroundService"
      // 006: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 009: getstatic com/discord/foreground_service/utils/Log.INSTANCE Lcom/discord/foreground_service/utils/Log;
      // 00c: astore 7
      // 00e: getstatic com/discord/foreground_service/ForegroundServiceManager.tag Ljava/lang/String;
      // 011: astore 6
      // 013: aload 6
      // 015: ldc "tag"
      // 017: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 01a: bipush 0
      // 01b: istore 4
      // 01d: aload 2
      // 01e: ifnonnull 026
      // 021: bipush 1
      // 022: istore 3
      // 023: goto 028
      // 026: bipush 0
      // 027: istore 3
      // 028: new java/lang/StringBuilder
      // 02b: astore 5
      // 02d: aload 5
      // 02f: invokespecial java/lang/StringBuilder.<init> ()V
      // 032: aload 5
      // 034: ldc_w "On service start command received. Intent is null? "
      // 037: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03a: pop
      // 03b: aload 5
      // 03d: iload 3
      // 03e: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 041: pop
      // 042: aload 7
      // 044: aload 6
      // 046: aload 5
      // 048: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 04b: aconst_null
      // 04c: bipush 4
      // 04d: aconst_null
      // 04e: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 051: getstatic com/discord/foreground_service/ForegroundServiceManager.currentOperation Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation;
      // 054: astore 5
      // 056: aload 5
      // 058: instanceof com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate
      // 05b: ifeq 06c
      // 05e: aload 5
      // 060: checkcast com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate
      // 063: astore 5
      // 065: goto 06f
      // 068: astore 1
      // 069: goto 0fd
      // 06c: aconst_null
      // 06d: astore 5
      // 06f: aload 5
      // 071: ifnonnull 09a
      // 074: aload 6
      // 076: ldc "tag"
      // 078: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 07b: aload 7
      // 07d: aload 6
      // 07f: ldc_w "No CreateOrUpdate op in memory. Stopping the service."
      // 082: aconst_null
      // 083: bipush 4
      // 084: aconst_null
      // 085: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 088: getstatic com/discord/foreground_service/ForegroundService.Companion Lcom/discord/foreground_service/ForegroundService$Companion;
      // 08b: aconst_null
      // 08c: aload 1
      // 08d: invokevirtual com/discord/foreground_service/ForegroundService$Companion.stop (Landroid/content/Context;Landroid/app/Service;)V
      // 090: aload 0
      // 091: invokespecial com/discord/foreground_service/ForegroundServiceManager.cleanupStateAfterServiceStop ()V
      // 094: iload 4
      // 096: istore 3
      // 097: goto 0f5
      // 09a: aload 2
      // 09b: ifnonnull 0bd
      // 09e: aload 6
      // 0a0: ldc "tag"
      // 0a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0a5: aload 7
      // 0a7: aload 6
      // 0a9: ldc_w "Attempting to recover service."
      // 0ac: aconst_null
      // 0ad: bipush 4
      // 0ae: aconst_null
      // 0af: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 0b2: aload 0
      // 0b3: aload 5
      // 0b5: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleQueueOperation (Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation;)V
      // 0b8: bipush 1
      // 0b9: istore 3
      // 0ba: goto 0f5
      // 0bd: aload 6
      // 0bf: ldc "tag"
      // 0c1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c4: aload 7
      // 0c6: aload 6
      // 0c8: ldc_w "Promoting service to foreground."
      // 0cb: aconst_null
      // 0cc: bipush 4
      // 0cd: aconst_null
      // 0ce: invokestatic com/discord/foreground_service/utils/Log.i$foreground_service_release$default (Lcom/discord/foreground_service/utils/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
      // 0d1: new java/lang/ref/WeakReference
      // 0d4: astore 2
      // 0d5: aload 2
      // 0d6: aload 1
      // 0d7: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // 0da: aload 2
      // 0db: putstatic com/discord/foreground_service/ForegroundServiceManager.serviceRef Ljava/lang/ref/WeakReference;
      // 0de: getstatic com/discord/foreground_service/ForegroundServiceManager.serviceWakelocks Lcom/discord/foreground_service/utils/Wakelocks;
      // 0e1: aload 1
      // 0e2: invokevirtual com/discord/foreground_service/utils/Wakelocks.acquire (Landroid/content/Context;)V
      // 0e5: getstatic com/discord/foreground_service/service/ServiceNotification.INSTANCE Lcom/discord/foreground_service/service/ServiceNotification;
      // 0e8: aload 1
      // 0e9: aload 1
      // 0ea: aload 5
      // 0ec: invokevirtual com/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate.getServiceConfigurations ()Ljava/util/List;
      // 0ef: invokevirtual com/discord/foreground_service/service/ServiceNotification.startForegroundCompat (Landroid/app/Service;Landroid/content/Context;Ljava/util/List;)V
      // 0f2: goto 0b8
      // 0f5: aload 0
      // 0f6: invokespecial com/discord/foreground_service/ForegroundServiceManager.handleNextOperation ()V
      // 0f9: aload 0
      // 0fa: monitorexit
      // 0fb: iload 3
      // 0fc: ireturn
      // 0fd: aload 0
      // 0fe: monitorexit
      // 0ff: aload 1
      // 100: athrow
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
