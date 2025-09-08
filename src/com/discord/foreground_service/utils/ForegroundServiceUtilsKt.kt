package com.discord.foreground_service.utils

import A9.n
import K1.a
import K1.c
import android.app.Notification
import android.app.Service
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build.VERSION
import androidx.core.content.b
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.discord.lifecycle.AppLifecycle

private fun hasForegroundServiceMediaProjectionPermission(context: Context): Boolean {
   var var2: Boolean = true;
   if (VERSION.SDK_INT >= 34) {
      if (b.a(var0, "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION") == 0) {
         var2 = true;
      } else {
         var2 = false;
      }
   }

   return var2;
}

private fun hasForegroundServiceMicPermission(context: Context): Boolean {
   var var2: Boolean = true;
   if (VERSION.SDK_INT >= 34) {
      if (b.a(var0, "android.permission.FOREGROUND_SERVICE_MICROPHONE") == 0) {
         var2 = true;
      } else {
         var2 = false;
      }
   }

   return var2;
}

public fun hasMicrophonePermission(context: Context): Boolean {
   val var1: Boolean;
   if (b.a(var0, "android.permission.RECORD_AUDIO") == 0) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

internal fun Service.startForegroundCompat(context: Context, notificationId: Int, notification: Notification): Boolean {
   var var4: Int = VERSION.SDK_INT;
   if (VERSION.SDK_INT < 29) {
      var0.startForeground(var2, var3);
      return true;
   } else if (VERSION.SDK_INT >= 31 && !AppLifecycle.INSTANCE.isForegrounded() && a.a(var0) == 0) {
      var0.stopSelf();
      return false;
   } else {
      var var5: Int = var3.extras.getInt("permissionType", -1);
      val var6: ServiceNotificationConfiguration.Type = CollectionsKt.j0(ServiceNotificationConfiguration.Type.getEntries(), var5) as ServiceNotificationConfiguration.Type;
      if (var6 == null) {
         val var7: StringBuilder = new StringBuilder();
         var7.append("Unknown service type: ");
         var7.append(var5);
         throw new IllegalStateException(var7.toString().toString());
      } else {
         label52:
         if (var4 < 34) {
            var5 = ForegroundServiceUtilsKt.WhenMappings.$EnumSwitchMapping$0[var6.ordinal()];
            if (var5 != 1) {
               if (var5 != 2) {
                  if (var5 != 3) {
                     throw new n();
                  }

                  var4 = 32;
                  break label52;
               }

               if (var4 >= 30) {
                  var4 = 128;
                  break label52;
               }
            }

            var4 = 1;
         } else {
            if (var6.ordinal() >= ServiceNotificationConfiguration.Type.VOICE_CALL.ordinal()
               && hasMicrophonePermission(var1)
               && hasForegroundServiceMicPermission(var1)) {
               var4 = 129;
            } else {
               var4 = 1;
            }

            if (var6.ordinal() >= ServiceNotificationConfiguration.Type.SCREEN_SHARE.ordinal()
               && MediaProjectionConsent.INSTANCE.isGranted(var1)
               && hasForegroundServiceMediaProjectionPermission(var1)) {
               var4 |= 32;
            }
         }

         K1.b.a(var0, var2, var3, var4);
         return true;
      }
   }
}

internal fun Context.startForegroundServiceCompat(serviceIntent: Intent): ComponentName? {
   val var2: ComponentName;
   if (VERSION.SDK_INT >= 26) {
      var2 = c.a(var0, var1);
   } else {
      var2 = var0.startService(var1);
   }

   return var2;
}
// $VF: Class flags could not be determined
@JvmSynthetic
internal class WhenMappings {
   @JvmStatic
   public int[] $EnumSwitchMapping$0;

   @JvmStatic
   fun {
      val var0: IntArray = new int[ServiceNotificationConfiguration.Type.values().length];

      try {
         var0[ServiceNotificationConfiguration.Type.FILE_UPLOAD.ordinal()] = 1;
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[ServiceNotificationConfiguration.Type.VOICE_CALL.ordinal()] = 2;
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[ServiceNotificationConfiguration.Type.SCREEN_SHARE.ordinal()] = 3;
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0;
   }
}
