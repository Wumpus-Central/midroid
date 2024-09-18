package com.discord.permissions

import android.os.Build.VERSION
import androidx.core.app.NotificationManagerCompat
import com.discord.lifecycle.AppLifecycleManagerModule
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
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

@ReactModule(name = "NativePermissionManager")
public class NativePermissionManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val permissionsModule: PermissionsModule
      private final get() {
         val var1: NativeModule = this.getReactApplicationContext().getNativeModule(PermissionsModule.class);
         q.e(var1);
         return var1 as PermissionsModule;
      }


   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   private fun requestForegroundServicePermissionPreU(promise: Promise) {
      val var2: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
      q.g(var2, "toLowerCase(...)");
      var1.resolve(var2);
   }

   private fun requireAppInForeground(promise: Promise, withForegroundApp: (Promise) -> Unit) {
      if (!AppLifecycleManagerModule.Companion.isForegrounded()) {
         val var3: java.lang.String = "DENIED".toLowerCase(Locale.ROOT);
         q.g(var3, "toLowerCase(...)");
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
      q.h(var1, "promise");
      if (NotificationManagerCompat.g(this.getReactApplicationContext()).a()) {
         var1.resolve(2);
      } else {
         var1.resolve(1);
      }
   }

   @ReactMethod
   public fun hasBluetoothAuthorization(promise: Promise) {
      q.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission("android.permission.BLUETOOTH", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasCameraAuthorization(promise: Promise) {
      q.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission("android.permission.CAMERA", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasContactAuthorization(promise: Promise) {
      q.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission("android.permission.READ_CONTACTS", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasExternalStorageAuthorization(promise: Promise) {
      q.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission(
            "android.permission.WRITE_EXTERNAL_STORAGE", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1)
         );
   }

   @ReactMethod
   public fun hasMicrophoneAuthorization(promise: Promise) {
      q.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission("android.permission.RECORD_AUDIO", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1));
   }

   @ReactMethod
   public fun hasModifyAudioAuthorization(promise: Promise) {
      q.h(var1, "promise");
      this.getPermissionsModule()
         .checkPermission(
            "android.permission.MODIFY_AUDIO_SETTINGS", NativePermissionManagerModule.Companion.access$transformHasAuthorizationResult(Companion, var1)
         );
   }

   @ReactMethod
   public fun hasPhotoAuthorization(promise: Promise) {
      q.h(var1, "promise");
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
      q.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.BLUETOOTH", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestCameraAuthorization(promise: Promise) {
      q.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.CAMERA", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestContactsAuthorization(promise: Promise) {
      q.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.READ_CONTACTS", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestExternalStorageAuthorization(promise: Promise) {
      q.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.WRITE_EXTERNAL_STORAGE", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   public fun requestForegroundServicePermissionFileUpload(promise: Promise) {
      q.h(var1, "promise");
      if (VERSION.SDK_INT >= 34) {
         this.getPermissionsModule()
            .requestPermission(
               "android.permission.FOREGROUND_SERVICE_DATA_SYNC", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1)
            );
      } else {
         this.requestForegroundServicePermissionPreU(var1);
      }
   }

   public fun requestForegroundServicePermissionScreenShare(promise: Promise) {
      q.h(var1, "promise");
      if (VERSION.SDK_INT >= 34) {
         this.requireAppInForeground(
            var1,
            new Function1(this, var1) {
               final Promise $promise;
               final NativePermissionManagerModule this$0;

               {
                  super(1);
                  this.this$0 = var1;
                  this.$promise = var2;
               }

               public final void invoke(Promise var1) {
                  q.h(var1, "it");
                  NativePermissionManagerModule.access$getPermissionsModule(this.this$0)
                     .requestPermission(
                        "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION",
                        NativePermissionManagerModule.Companion.access$transformRequestResult(NativePermissionManagerModule.Companion, this.$promise)
                     );
               }
            }
         );
      } else {
         this.requestForegroundServicePermissionPreU(var1);
      }
   }

   public fun requestForegroundServicePermissionVoiceCall(promise: Promise) {
      q.h(var1, "promise");
      if (VERSION.SDK_INT >= 34) {
         this.requireAppInForeground(
            var1,
            new Function1(this, var1) {
               final Promise $promise;
               final NativePermissionManagerModule this$0;

               {
                  super(1);
                  this.this$0 = var1;
                  this.$promise = var2;
               }

               public final void invoke(Promise var1) {
                  q.h(var1, "it");
                  this.this$0
                     .requestMicrophoneAuthorization(
                        NativePermissionPromise.INSTANCE
                           .generate(
                              new Function0(this.this$0, this.$promise) {
                                 final Promise $promise;
                                 final NativePermissionManagerModule this$0;

                                 {
                                    super(0);
                                    this.this$0 = var1;
                                    this.$promise = var2;
                                 }

                                 public final void invoke() {
                                    NativePermissionManagerModule.access$getPermissionsModule(this.this$0)
                                       .requestPermission(
                                          "android.permission.FOREGROUND_SERVICE_MICROPHONE",
                                          NativePermissionManagerModule.Companion.access$transformRequestResult(
                                             NativePermissionManagerModule.Companion, this.$promise
                                          )
                                       );
                                 }
                              },
                              <unrepresentable>.INSTANCE
                           )
                     );
               }
            }
         );
      } else {
         this.requestForegroundServicePermissionPreU(var1);
      }
   }

   @ReactMethod
   public fun requestMicrophoneAuthorization(promise: Promise) {
      q.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.RECORD_AUDIO", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestModifyAudioAuthorization(promise: Promise) {
      q.h(var1, "promise");
      this.getPermissionsModule()
         .requestPermission("android.permission.MODIFY_AUDIO_SETTINGS", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
   }

   @ReactMethod
   public fun requestNotificationAuthorization(promise: Promise) {
      q.h(var1, "promise");
      if (VERSION.SDK_INT >= 33) {
         this.getPermissionsModule()
            .requestPermission("android.permission.POST_NOTIFICATIONS", NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1));
      } else {
         val var2: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
         q.g(var2, "toLowerCase(...)");
         var1.resolve(var2);
      }
   }

   @ReactMethod
   public fun requestPhotoAuthorization(promise: Promise) {
      q.h(var1, "promise");
      if (VERSION.SDK_INT >= 34) {
         this.getPermissionsModule()
            .requestMultiplePermissions(
               NativeArrayExtensionsKt.toNativeArray(
                  i.m(
                     new java.lang.String[]{
                        "android.permission.READ_MEDIA_IMAGES",
                        "android.permission.READ_MEDIA_VIDEO",
                        "android.permission.READ_MEDIA_AUDIO",
                        "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
                     }
                  )
               ),
               NativePermissionManagerModule.Companion.access$transformRequestResult(Companion, var1)
            );
      } else if (VERSION.SDK_INT >= 33) {
         this.getPermissionsModule()
            .requestMultiplePermissions(
               NativeArrayExtensionsKt.toNativeArray(
                  i.m(
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
            new Function1(NativePermissionStatus.Companion) {
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
            new Function1(NativePermissionStatus.Companion) {
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
