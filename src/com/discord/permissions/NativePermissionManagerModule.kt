package com.discord.permissions

import android.os.Build.VERSION
import androidx.core.app.NotificationManagerCompat
import com.discord.crash_reporting.CrashReporting
import com.discord.lifecycle.AppLifecycle
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.PromiseWrapper
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.WritableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.modules.permissions.PermissionsModule
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Locale
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@ReactModule(name = "NativePermissionManager")
@SourceDebugExtension(["SMAP\nNativePermissionManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativePermissionManagerModule.kt\ncom/discord/permissions/NativePermissionManagerModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,393:1\n1863#2,2:394\n*S KotlinDebug\n*F\n+ 1 NativePermissionManagerModule.kt\ncom/discord/permissions/NativePermissionManagerModule\n*L\n294#1:394,2\n*E\n"])
public class NativePermissionManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val pendingPermissionRequests: MutableMap<String, MutableList<Promise>> = new LinkedHashMap()

   private final val permissionsModule: PermissionsModule
      private final get() {
         val var1: NativeModule = this.getReactApplicationContext().getNativeModule(PermissionsModule.class);
         return var1 as PermissionsModule;
      }


   private fun createMultiPromiseResolver(permissionKey: String): Promise {
      return new Promise(this, var1) {
         final java.lang.String $permissionKey;
         final NativePermissionManagerModule this$0;

         {
            this.this$0 = var1;
            this.$permissionKey = var2;
         }

         private final void executeOnAllPending(Function1<? super Promise, Unit> param1) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.createStatement(DomHelper.java:27)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:157)
            //
            // Bytecode:
            // 00: aload 0
            // 01: getfield com/discord/permissions/NativePermissionManagerModule$createMultiPromiseResolver$1.this$0 Lcom/discord/permissions/NativePermissionManagerModule;
            // 04: invokestatic com/discord/permissions/NativePermissionManagerModule.access$getPendingPermissionRequests$p (Lcom/discord/permissions/NativePermissionManagerModule;)Ljava/util/Map;
            // 07: astore 2
            // 08: aload 0
            // 09: getfield com/discord/permissions/NativePermissionManagerModule$createMultiPromiseResolver$1.this$0 Lcom/discord/permissions/NativePermissionManagerModule;
            // 0c: astore 4
            // 0e: aload 0
            // 0f: getfield com/discord/permissions/NativePermissionManagerModule$createMultiPromiseResolver$1.$permissionKey Ljava/lang/String;
            // 12: astore 3
            // 13: aload 2
            // 14: monitorenter
            // 15: aload 4
            // 17: invokestatic com/discord/permissions/NativePermissionManagerModule.access$getPendingPermissionRequests$p (Lcom/discord/permissions/NativePermissionManagerModule;)Ljava/util/Map;
            // 1a: aload 3
            // 1b: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
            // 20: checkcast java/util/List
            // 23: astore 3
            // 24: aload 3
            // 25: ifnonnull 2b
            // 28: aload 2
            // 29: monitorexit
            // 2a: return
            // 2b: aload 3
            // 2c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
            // 31: astore 4
            // 33: aload 4
            // 35: invokeinterface java/util/Iterator.hasNext ()Z 1
            // 3a: ifeq 8d
            // 3d: aload 4
            // 3f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
            // 44: checkcast com/facebook/react/bridge/Promise
            // 47: astore 5
            // 49: aload 1
            // 4a: aload 5
            // 4c: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
            // 51: pop
            // 52: goto 33
            // 55: astore 1
            // 56: goto 94
            // 59: astore 7
            // 5b: aload 7
            // 5d: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
            // 60: astore 3
            // 61: new java/lang/StringBuilder
            // 64: astore 6
            // 66: aload 6
            // 68: invokespecial java/lang/StringBuilder.<init> ()V
            // 6b: aload 6
            // 6d: ldc "Failed to resolve promise: "
            // 6f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
            // 72: pop
            // 73: aload 6
            // 75: aload 3
            // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
            // 79: pop
            // 7a: aload 5
            // 7c: ldc "PROMISE_RESOLUTION_ERROR"
            // 7e: aload 6
            // 80: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
            // 83: aload 7
            // 85: invokeinterface com/facebook/react/bridge/Promise.reject (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V 4
            // 8a: goto 33
            // 8d: getstatic kotlin/Unit.a Lkotlin/Unit;
            // 90: astore 1
            // 91: aload 2
            // 92: monitorexit
            // 93: return
            // 94: aload 2
            // 95: monitorexit
            // 96: aload 1
            // 97: athrow
         }

         private static final Unit reject$lambda$10(java.lang.String var0, java.lang.String var1, WritableMap var2, Promise var3) {
            var3.reject(var0, var1, var2);
            return Unit.a;
         }

         private static final Unit reject$lambda$11(java.lang.String var0, Promise var1) {
            var1.reject(var0);
            return Unit.a;
         }

         private static final Unit reject$lambda$12(java.lang.String var0, java.lang.String var1, java.lang.Throwable var2, WritableMap var3, Promise var4) {
            var4.reject(var0, var1, var2, var3);
            return Unit.a;
         }

         private static final Unit reject$lambda$3(java.lang.String var0, java.lang.String var1, Promise var2) {
            var2.reject(var0, var1);
            return Unit.a;
         }

         private static final Unit reject$lambda$4(java.lang.String var0, java.lang.Throwable var1, Promise var2) {
            var2.reject(var0, var1);
            return Unit.a;
         }

         private static final Unit reject$lambda$5(java.lang.String var0, java.lang.String var1, java.lang.Throwable var2, Promise var3) {
            var3.reject(var0, var1, var2);
            return Unit.a;
         }

         private static final Unit reject$lambda$6(java.lang.Throwable var0, Promise var1) {
            var1.reject(var0);
            return Unit.a;
         }

         private static final Unit reject$lambda$7(java.lang.Throwable var0, WritableMap var1, Promise var2) {
            var2.reject(var0, var1);
            return Unit.a;
         }

         private static final Unit reject$lambda$8(java.lang.String var0, WritableMap var1, Promise var2) {
            var2.reject(var0, var1);
            return Unit.a;
         }

         private static final Unit reject$lambda$9(java.lang.String var0, java.lang.Throwable var1, WritableMap var2, Promise var3) {
            var3.reject(var0, var1, var2);
            return Unit.a;
         }

         private static final Unit resolve$lambda$2(Object var0, Promise var1) {
            var1.resolve(var0);
            return Unit.a;
         }

         public void reject(java.lang.String var1) {
            this.executeOnAllPending(new k(var1));
         }

         public void reject(java.lang.String var1, WritableMap var2) {
            this.executeOnAllPending(new q(var1, var2));
         }

         public void reject(java.lang.String var1, java.lang.String var2) {
            this.executeOnAllPending(new n(var1, var2));
         }

         public void reject(java.lang.String var1, java.lang.String var2, WritableMap var3) {
            this.executeOnAllPending(new h(var1, var2, var3));
         }

         public void reject(java.lang.String var1, java.lang.String var2, java.lang.Throwable var3) {
            this.executeOnAllPending(new m(var1, var2, var3));
         }

         public void reject(java.lang.String var1, java.lang.String var2, java.lang.Throwable var3, WritableMap var4) {
            this.executeOnAllPending(new j(var1, var2, var3, var4));
         }

         public void reject(java.lang.String var1, java.lang.Throwable var2) {
            this.executeOnAllPending(new o(var1, var2));
         }

         public void reject(java.lang.String var1, java.lang.Throwable var2, WritableMap var3) {
            this.executeOnAllPending(new r(var1, var2, var3));
         }

         public void reject(java.lang.Throwable var1) {
            this.executeOnAllPending(new l(var1));
         }

         public void reject(java.lang.Throwable var1, WritableMap var2) {
            this.executeOnAllPending(new i(var1, var2));
         }

         public void resolve(Object var1) {
            this.executeOnAllPending(new p(var1));
         }
      };
   }

   private fun requestForegroundServicePermissionPreU(promise: Promise) {
      val var2: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
      var1.resolve(var2);
   }

   @JvmStatic
   fun `requestForegroundServicePermissionScreenShareWithMic$lambda$4`(var0: NativePermissionManagerModule, var1: Promise, var2: Promise): Unit {
      val var4: ArrayList = new ArrayList();
      if (androidx.core.content.b.a(var0.getReactApplicationContext(), "android.permission.RECORD_AUDIO") != 0) {
         var4.add("android.permission.RECORD_AUDIO");
      }

      if (androidx.core.content.b.a(var0.getReactApplicationContext(), "android.permission.FOREGROUND_SERVICE_MICROPHONE") != 0) {
         var4.add("android.permission.FOREGROUND_SERVICE_MICROPHONE");
      }

      if (androidx.core.content.b.a(var0.getReactApplicationContext(), "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION") != 0) {
         var4.add("android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION");
      }

      if (var4.isEmpty()) {
         val var3: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
         var1.resolve(var3);
      } else {
         var0.requestMultiplePermissionsWithDeduplication(var4, var1);
      }

      return Unit.a;
   }

   @JvmStatic
   fun `requestForegroundServicePermissionVoiceCall$lambda$3`(var0: NativePermissionManagerModule, var1: Promise, var2: Promise): Unit {
      var0.requestMicrophoneAuthorization(NativePermissionPromise.INSTANCE.generate(new b(var0, var1), new c(var1)));
      return Unit.a;
   }

   @JvmStatic
   fun `requestForegroundServicePermissionVoiceCall$lambda$3$lambda$1`(var0: NativePermissionManagerModule, var1: Promise): Unit {
      var0.requireAppInForeground(var1, new g(var0, var1));
      return Unit.a;
   }

   @JvmStatic
   fun `requestForegroundServicePermissionVoiceCall$lambda$3$lambda$1$lambda$0`(var0: NativePermissionManagerModule, var1: Promise, var2: Promise): Unit {
      var0.requestPermissionWithDeduplication("android.permission.FOREGROUND_SERVICE_MICROPHONE", var1);
      return Unit.a;
   }

   @JvmStatic
   fun `requestForegroundServicePermissionVoiceCall$lambda$3$lambda$2`(var0: Promise): Unit {
      CrashReporting.addBreadcrumb$default(
         CrashReporting.INSTANCE, "requestForegroundServicePermissionVoiceCall: Permission Rejected", null, null, null, 14, null
      );
      val var1: java.lang.String = "DENIED".toLowerCase(Locale.ROOT);
      var0.resolve(var1);
      return Unit.a;
   }

   private fun requestMultiplePermissionsWithDeduplication(permissions: List<String>, promise: Promise) {
      this.requestWithDeduplication(CollectionsKt.p0(CollectionsKt.J0(var1), ",", null, null, 0, null, null, 62, null), var2, new a(this, var1));
   }

   @JvmStatic
   fun `requestMultiplePermissionsWithDeduplication$lambda$6`(var0: NativePermissionManagerModule, var1: java.util.List, var2: java.lang.String, var3: Promise): Unit {
      var0.getPermissionsModule().requestMultiplePermissions(NativeArrayExtensionsKt.toNativeArray$default(var1, null, 1, null), var3);
      return Unit.a;
   }

   private fun requestPermissionWithDeduplication(permission: String, promise: Promise) {
      this.requestWithDeduplication(var1, var2, new d(this));
   }

   @JvmStatic
   fun `requestPermissionWithDeduplication$lambda$5`(var0: NativePermissionManagerModule, var1: java.lang.String, var2: Promise): Unit {
      var0.getPermissionsModule().requestPermission(var1, var2);
      return Unit.a;
   }

   private fun requestWithDeduplication(key: String, promise: Promise, makeRequest: (String, Promise) -> Unit) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.createStatement(DomHelper.java:27)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:157)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/discord/permissions/NativePermissionManagerModule.pendingPermissionRequests Ljava/util/Map;
      // 04: astore 4
      // 06: aload 4
      // 08: monitorenter
      // 09: aload 0
      // 0a: getfield com/discord/permissions/NativePermissionManagerModule.pendingPermissionRequests Ljava/util/Map;
      // 0d: aload 1
      // 0e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 13: checkcast java/util/List
      // 16: astore 5
      // 18: aload 5
      // 1a: ifnull 2e
      // 1d: aload 5
      // 1f: aload 2
      // 20: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 25: pop
      // 26: aload 4
      // 28: monitorexit
      // 29: return
      // 2a: astore 1
      // 2b: goto db
      // 2e: aload 0
      // 2f: getfield com/discord/permissions/NativePermissionManagerModule.pendingPermissionRequests Ljava/util/Map;
      // 32: aload 1
      // 33: bipush 1
      // 34: anewarray 191
      // 37: dup
      // 38: bipush 0
      // 39: aload 2
      // 3a: aastore
      // 3b: invokestatic kotlin/collections/CollectionsKt.q ([Ljava/lang/Object;)Ljava/util/List;
      // 3e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 43: pop
      // 44: new com/discord/react/utilities/PromiseWrapper
      // 47: astore 2
      // 48: aload 0
      // 49: aload 1
      // 4a: invokespecial com/discord/permissions/NativePermissionManagerModule.createMultiPromiseResolver (Ljava/lang/String;)Lcom/facebook/react/bridge/Promise;
      // 4d: astore 6
      // 4f: new com/discord/permissions/NativePermissionManagerModule$requestWithDeduplication$1$wrapperPromise$1
      // 52: astore 5
      // 54: aload 5
      // 56: getstatic com/discord/permissions/NativePermissionStatus.Companion Lcom/discord/permissions/NativePermissionStatus$Companion;
      // 59: invokespecial com/discord/permissions/NativePermissionManagerModule$requestWithDeduplication$1$wrapperPromise$1.<init> (Ljava/lang/Object;)V
      // 5c: aload 2
      // 5d: aload 6
      // 5f: aload 5
      // 61: aconst_null
      // 62: bipush 4
      // 63: aconst_null
      // 64: invokespecial com/discord/react/utilities/PromiseWrapper.<init> (Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 67: aload 3
      // 68: aload 1
      // 69: aload 2
      // 6a: invokeinterface kotlin/jvm/functions/Function2.invoke (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 6f: pop
      // 70: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 73: astore 1
      // 74: aload 4
      // 76: monitorexit
      // 77: return
      // 78: astore 2
      // 79: aload 0
      // 7a: getfield com/discord/permissions/NativePermissionManagerModule.pendingPermissionRequests Ljava/util/Map;
      // 7d: aload 1
      // 7e: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 83: checkcast java/util/List
      // 86: astore 1
      // 87: aload 1
      // 88: ifnull d9
      // 8b: aload 1
      // 8c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 91: astore 5
      // 93: aload 5
      // 95: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 9a: ifeq d9
      // 9d: aload 5
      // 9f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a4: checkcast com/facebook/react/bridge/Promise
      // a7: astore 3
      // a8: aload 2
      // a9: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // ac: astore 1
      // ad: new java/lang/StringBuilder
      // b0: astore 6
      // b2: aload 6
      // b4: invokespecial java/lang/StringBuilder.<init> ()V
      // b7: aload 6
      // b9: ldc_w "Failed to request permission: "
      // bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bf: pop
      // c0: aload 6
      // c2: aload 1
      // c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c6: pop
      // c7: aload 3
      // c8: ldc_w "PERMISSION_REQUEST_ERROR"
      // cb: aload 6
      // cd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d0: aload 2
      // d1: invokeinterface com/facebook/react/bridge/Promise.reject (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V 4
      // d6: goto 93
      // d9: aload 2
      // da: athrow
      // db: aload 4
      // dd: monitorexit
      // de: aload 1
      // df: athrow
   }

   private fun requireAppInForeground(promise: Promise, withForegroundApp: (Promise) -> Unit) {
      if (!AppLifecycle.INSTANCE.isForegrounded()) {
         val var3: java.lang.String = "DENIED".toLowerCase(Locale.ROOT);
         var1.resolve(var3);
      } else {
         var2.invoke(var1);
      }
   }

   public open fun getName(): String {
      return "NativePermissionManager";
   }

   @ReactMethod
   public fun getNotificationAuthorizationStatus(promise: Promise) {
      if (NotificationManagerCompat.g(this.getReactApplicationContext()).a()) {
         var1.resolve(2);
      } else {
         var1.resolve(1);
      }
   }

   @ReactMethod
   public fun hasBluetoothAuthorization(promise: Promise) {
      this.getPermissionsModule()
         .checkPermission("android.permission.BLUETOOTH", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasCameraAuthorization(promise: Promise) {
      this.getPermissionsModule()
         .checkPermission("android.permission.CAMERA", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasContactAuthorization(promise: Promise) {
      this.getPermissionsModule()
         .checkPermission("android.permission.READ_CONTACTS", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasExternalStorageAuthorization(promise: Promise) {
      this.getPermissionsModule()
         .checkPermission(
            "android.permission.WRITE_EXTERNAL_STORAGE", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1)
         );
   }

   @ReactMethod
   public fun hasMicrophoneAuthorization(promise: Promise) {
      this.getPermissionsModule()
         .checkPermission("android.permission.RECORD_AUDIO", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasModifyAudioAuthorization(promise: Promise) {
      this.getPermissionsModule()
         .checkPermission(
            "android.permission.MODIFY_AUDIO_SETTINGS", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1)
         );
   }

   @ReactMethod
   public fun hasPhotoAuthorization(promise: Promise) {
      if (VERSION.SDK_INT >= 33) {
         this.getPermissionsModule()
            .checkPermission(
               "android.permission.READ_MEDIA_IMAGES", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1)
            );
      } else {
         this.getPermissionsModule()
            .checkPermission(
               "android.permission.READ_EXTERNAL_STORAGE", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1)
            );
      }
   }

   @ReactMethod
   public fun requestBluetoothAuthorization(promise: Promise) {
      this.requestPermissionWithDeduplication("android.permission.BLUETOOTH", var1);
   }

   @ReactMethod
   public fun requestCameraAuthorization(promise: Promise) {
      this.requestPermissionWithDeduplication("android.permission.CAMERA", var1);
   }

   @ReactMethod
   public fun requestContactsAuthorization(promise: Promise) {
      this.requestPermissionWithDeduplication("android.permission.READ_CONTACTS", var1);
   }

   @ReactMethod
   public fun requestExternalStorageAuthorization(promise: Promise) {
      this.requestPermissionWithDeduplication("android.permission.WRITE_EXTERNAL_STORAGE", var1);
   }

   public fun requestForegroundServicePermissionFileUpload(promise: Promise) {
      if (VERSION.SDK_INT >= 34) {
         this.requestPermissionWithDeduplication("android.permission.FOREGROUND_SERVICE_DATA_SYNC", var1);
      } else {
         this.requestForegroundServicePermissionPreU(var1);
      }
   }

   public fun requestForegroundServicePermissionScreenShareWithMic(promise: Promise) {
      if (VERSION.SDK_INT >= 34) {
         this.requireAppInForeground(var1, new e(this, var1));
      } else {
         this.requestForegroundServicePermissionVoiceCall(var1);
      }
   }

   public fun requestForegroundServicePermissionVoiceCall(promise: Promise) {
      if (VERSION.SDK_INT >= 34) {
         this.requireAppInForeground(var1, new f(this, var1));
      } else {
         this.requestForegroundServicePermissionPreU(var1);
      }
   }

   @ReactMethod
   public fun requestMicrophoneAuthorization(promise: Promise) {
      this.requestPermissionWithDeduplication("android.permission.RECORD_AUDIO", var1);
   }

   @ReactMethod
   public fun requestModifyAudioAuthorization(promise: Promise) {
      this.requestPermissionWithDeduplication("android.permission.MODIFY_AUDIO_SETTINGS", var1);
   }

   @ReactMethod
   public fun requestNotificationAuthorization(promise: Promise) {
      if (VERSION.SDK_INT >= 33) {
         this.requestPermissionWithDeduplication("android.permission.POST_NOTIFICATIONS", var1);
      } else {
         val var2: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
         var1.resolve(var2);
      }
   }

   @ReactMethod
   public fun requestPhotoAuthorization(promise: Promise) {
      if (VERSION.SDK_INT >= 34) {
         this.requestMultiplePermissionsWithDeduplication(
            CollectionsKt.n(
               new java.lang.String[]{
                  "android.permission.READ_MEDIA_IMAGES",
                  "android.permission.READ_MEDIA_VIDEO",
                  "android.permission.READ_MEDIA_AUDIO",
                  "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
               }
            ),
            var1
         );
      } else if (VERSION.SDK_INT >= 33) {
         this.requestMultiplePermissionsWithDeduplication(
            CollectionsKt.n(
               new java.lang.String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"}
            ),
            var1
         );
      } else {
         this.requestPermissionWithDeduplication("android.permission.READ_EXTERNAL_STORAGE", var1);
      }
   }

   public companion object {
      private fun Promise.transformHasAuthorizationResult(): PromiseWrapper {
         return new PromiseWrapper(
            var1,
            new Function1<Object, java.lang.String>(NativePermissionStatus.Companion) {
               {
                  super(
                     1,
                     var1,
                     NativePermissionStatus.Companion::class.java,
                     "fromAndroidAuthorizationStatus",
                     "fromAndroidAuthorizationStatus(Ljava/lang/Object;)Ljava/lang/String;",
                     0
                  );
               }

               public final java.lang.String invoke(Object var1) {
                  return (super.receiver as NativePermissionStatus.Companion).fromAndroidAuthorizationStatus(var1);
               }
            },
            null,
            4,
            null
         );
      }
   }
}
