package com.discord.foreground_service.utils

import B9.n
import K1.a
import android.app.Notification
import android.app.Service
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build.VERSION
import androidx.core.content.b
import com.discord.foreground_service.service.ServiceNotificationConfiguration

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

internal fun Service.startForegroundCompat(context: Context, notificationId: Int, notification: Notification) {
   val var4: Int = VERSION.SDK_INT;
   if (VERSION.SDK_INT < 29) {
      var0.startForeground(var2, var3);
   } else {
      var var5: Int = var3.extras.getInt("permissionType", -1);
      val var7: ServiceNotificationConfiguration.Type = h.S(ServiceNotificationConfiguration.Type.values(), var5) as ServiceNotificationConfiguration.Type;
      if (var7 == null) {
         val var8: StringBuilder = new StringBuilder();
         var8.append("Unknown service type: ");
         var8.append(var5);
         throw new IllegalStateException(var8.toString().toString());
      } else {
         val var10: Boolean;
         if (var4 >= 30 && hasMicrophonePermission(var1) && hasForegroundServiceMicPermission(var1)) {
            var10 = true;
         } else {
            var10 = false;
         }

         var5 = ForegroundServiceUtilsKt.WhenMappings.$EnumSwitchMapping$0[var7.ordinal()];
         var var9: Int;
         if (var5 != 1) {
            if (var5 != 2) {
               if (var5 != 3) {
                  throw new n();
               }

               var var12: Boolean = false;
               if (MediaProjectionConsent.INSTANCE.isGranted(var1)) {
                  var12 = false;
                  if (hasForegroundServiceMediaProjectionPermission(var1)) {
                     var12 = true;
                  }
               }

               if (var12 && var10) {
                  var9 = 160;
               } else {
                  var9 = null;
                  if (var12) {
                     var9 = 32;
                  }
               }
            } else {
               var9 = null;
               if (var10) {
                  var9 = 128;
               }
            }
         } else {
            var9 = 1;
         }

         if (var9 != null) {
            a.a(var0, var2, var3, var9);
         } else {
            var0.startForeground(var2, var3);
         }
      }
   }
}

internal fun Context.startForegroundServiceCompat(serviceIntent: Intent): ComponentName? {
   val var2: ComponentName;
   if (VERSION.SDK_INT >= 26) {
      var2 = K1.b.a(var0, var1);
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
