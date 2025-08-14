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
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.modules.permissions.PermissionsModule
import java.util.Locale
import kotlin.jvm.functions.Function1

@ReactModule(name = "NativePermissionManager")
public class NativePermissionManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val permissionsModule: PermissionsModule
      private final get() {
         val var1: NativeModule = this.getReactApplicationContext().getNativeModule(PermissionsModule.class);
         return var1 as PermissionsModule;
      }


   private fun requestForegroundServicePermissionPreU(promise: Promise) {
      val var2: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
      var1.resolve(var2);
   }

   @JvmStatic
   fun `requestForegroundServicePermissionVoiceCall$lambda$3`(var0: NativePermissionManagerModule, var1: Promise, var2: Promise): Unit {
      var0.requestMicrophoneAuthorization(NativePermissionPromise.INSTANCE.generate(new a(var0, var1), new b(var1)));
      return Unit.a;
   }

   @JvmStatic
   fun `requestForegroundServicePermissionVoiceCall$lambda$3$lambda$1`(var0: NativePermissionManagerModule, var1: Promise): Unit {
      var0.requireAppInForeground(var1, new d(var0, var1));
      return Unit.a;
   }

   @JvmStatic
   fun `requestForegroundServicePermissionVoiceCall$lambda$3$lambda$1$lambda$0`(var0: NativePermissionManagerModule, var1: Promise, var2: Promise): Unit {
      var0.getPermissionsModule()
         .requestPermission(
            "android.permission.FOREGROUND_SERVICE_MICROPHONE", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1)
         );
      return Unit.a;
   }

   @JvmStatic
   fun `requestForegroundServicePermissionVoiceCall$lambda$3$lambda$2`(var0: Promise): Unit {
      CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "requestForegroundServicePermissionVoiceCall: Permission Rejected", null, null, 6, null);
      val var1: java.lang.String = "DENIED".toLowerCase(Locale.ROOT);
      var0.resolve(var1);
      return Unit.a;
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
      this.getPermissionsModule()
         .requestPermission("android.permission.BLUETOOTH", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestCameraAuthorization(promise: Promise) {
      this.getPermissionsModule()
         .requestPermission("android.permission.CAMERA", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestContactsAuthorization(promise: Promise) {
      this.getPermissionsModule()
         .requestPermission("android.permission.READ_CONTACTS", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestExternalStorageAuthorization(promise: Promise) {
      this.getPermissionsModule()
         .requestPermission("android.permission.WRITE_EXTERNAL_STORAGE", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   public fun requestForegroundServicePermissionFileUpload(promise: Promise) {
      if (VERSION.SDK_INT >= 34) {
         this.getPermissionsModule()
            .requestPermission(
               "android.permission.FOREGROUND_SERVICE_DATA_SYNC", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1)
            );
      } else {
         this.requestForegroundServicePermissionPreU(var1);
      }
   }

   public fun requestForegroundServicePermissionVoiceCall(promise: Promise) {
      if (VERSION.SDK_INT >= 34) {
         this.requireAppInForeground(var1, new c(this, var1));
      } else {
         this.requestForegroundServicePermissionPreU(var1);
      }
   }

   @ReactMethod
   public fun requestMicrophoneAuthorization(promise: Promise) {
      this.getPermissionsModule()
         .requestPermission("android.permission.RECORD_AUDIO", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestModifyAudioAuthorization(promise: Promise) {
      this.getPermissionsModule()
         .requestPermission("android.permission.MODIFY_AUDIO_SETTINGS", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestNotificationAuthorization(promise: Promise) {
      if (VERSION.SDK_INT >= 33) {
         this.getPermissionsModule()
            .requestPermission("android.permission.POST_NOTIFICATIONS", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
      } else {
         val var2: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
         var1.resolve(var2);
      }
   }

   @ReactMethod
   public fun requestPhotoAuthorization(promise: Promise) {
      if (VERSION.SDK_INT >= 34) {
         this.getPermissionsModule()
            .requestMultiplePermissions(
               NativeArrayExtensionsKt.toNativeArray$default(
                  CollectionsKt.n(
                     new java.lang.String[]{
                        "android.permission.READ_MEDIA_IMAGES",
                        "android.permission.READ_MEDIA_VIDEO",
                        "android.permission.READ_MEDIA_AUDIO",
                        "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
                     }
                  ),
                  null,
                  1,
                  null
               ),
               NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1)
            );
      } else if (VERSION.SDK_INT >= 33) {
         this.getPermissionsModule()
            .requestMultiplePermissions(
               NativeArrayExtensionsKt.toNativeArray$default(
                  CollectionsKt.n(
                     new java.lang.String[]{
                        "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"
                     }
                  ),
                  null,
                  1,
                  null
               ),
               NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1)
            );
      } else {
         this.getPermissionsModule()
            .requestPermission(
               "android.permission.READ_EXTERNAL_STORAGE", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1)
            );
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

      private fun Promise.transformRequestResult(): PromiseWrapper {
         return new PromiseWrapper(
            var1,
            new Function1<Object, java.lang.String>(NativePermissionStatus.Companion) {
               {
                  super(
                     1,
                     var1,
                     NativePermissionStatus.Companion::class.java,
                     "fromAndroidPermissionStatus",
                     "fromAndroidPermissionStatus(Ljava/lang/Object;)Ljava/lang/String;",
                     0
                  );
               }

               public final java.lang.String invoke(Object var1) {
                  return (super.receiver as NativePermissionStatus.Companion).fromAndroidPermissionStatus(var1);
               }
            },
            null,
            4,
            null
         );
      }
   }
}
