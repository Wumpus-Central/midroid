package com.discord.permissions

import android.os.Build.VERSION
import androidx.core.app.NotificationManagerCompat
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
import kotlin.jvm.internal.r

@ReactModule(name = "NativePermissionManager")
public class NativePermissionManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val permissionsModule: PermissionsModule
      private final get() {
         val var1: NativeModule = this.getReactApplicationContext().getNativeModule(PermissionsModule.class);
         r.e(var1);
         return var1 as PermissionsModule;
      }


   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun getName(): String {
      return "NativePermissionManager";
   }

   @ReactMethod
   public fun getNotificationAuthorizationStatus(promise: Promise) {
      r.h(var1, "promise");
      if (NotificationManagerCompat.g(this.getReactApplicationContext()).a()) {
         var1.resolve(2);
      } else {
         var1.resolve(1);
      }
   }

   @ReactMethod
   public fun hasBluetoothAuthorization(promise: Promise) {
      r.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission("android.permission.BLUETOOTH", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasCameraAuthorization(promise: Promise) {
      r.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission("android.permission.CAMERA", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasContactAuthorization(promise: Promise) {
      r.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission("android.permission.READ_CONTACTS", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasExternalStorageAuthorization(promise: Promise) {
      r.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission(
            "android.permission.WRITE_EXTERNAL_STORAGE", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1)
         );
   }

   @ReactMethod
   public fun hasMicrophoneAuthorization(promise: Promise) {
      r.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission("android.permission.RECORD_AUDIO", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasModifyAudioAuthorization(promise: Promise) {
      r.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission(
            "android.permission.MODIFY_AUDIO_SETTINGS", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1)
         );
   }

   @ReactMethod
   public fun hasPhotoAuthorization(promise: Promise) {
      r.h(var1, "promise");
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
      r.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.BLUETOOTH", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestCameraAuthorization(promise: Promise) {
      r.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.CAMERA", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestContactsAuthorization(promise: Promise) {
      r.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.READ_CONTACTS", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestExternalStorageAuthorization(promise: Promise) {
      r.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.WRITE_EXTERNAL_STORAGE", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestMicrophoneAuthorization(promise: Promise) {
      r.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.RECORD_AUDIO", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestModifyAudioAuthorization(promise: Promise) {
      r.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.MODIFY_AUDIO_SETTINGS", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestNotificationAuthorization(promise: Promise) {
      r.h(var1, "promise");
      if (VERSION.SDK_INT >= 33) {
         this.getPermissionsModule()
            .requestPermission("android.permission.POST_NOTIFICATIONS", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
      } else {
         val var2: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
         r.g(var2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
         var1.resolve(var2);
      }
   }

   @ReactMethod
   public fun requestPhotoAuthorization(promise: Promise) {
      r.h(var1, "promise");
      if (VERSION.SDK_INT >= 33) {
         this.getPermissionsModule()
            .requestMultiplePermissions(
               NativeArrayExtensionsKt.toNativeArray(
                  h.l(
                     new java.lang.String[]{
                        "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"
                     }
                  )
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
