package com.discord.foreground_service.utils

import Ca.p
import K2.a
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

internal fun Service.startForegroundCompat(context: Context, notificationId: Int, notification: Notification) {
   val var7: Int = VERSION.SDK_INT;
   if (VERSION.SDK_INT < 29) {
      var0.startForeground(var2, var3);
   } else {
      var var4: Int = var3.extras.getInt("permissionType", -1);
      val var9: ServiceNotificationConfiguration.Type = CollectionsKt.l0(ServiceNotificationConfiguration.Type.getEntries(), var4) as ServiceNotificationConfiguration.Type;
      if (var9 == null) {
         val var11: StringBuilder = new StringBuilder();
         var11.append("Unknown service type: ");
         var11.append(var4);
         throw new IllegalStateException(var11.toString().toString());
      } else {
         var var5: Int = 1;
         if (var7 < 34) {
            var5 = ForegroundServiceUtilsKt.WhenMappings.$EnumSwitchMapping$0[var9.ordinal()];
            var4 = 1;
            if (var5 != 1) {
               if (var5 != 2) {
                  if (var5 != 3) {
                     throw new p();
                  }

                  var4 = 32;
               } else {
                  var4 = 1;
                  if (var7 >= 30) {
                     var4 = 128;
                  }
               }
            }
         } else {
            val var8: Boolean = AppLifecycle.INSTANCE.isForegrounded();
            val var14: Boolean;
            if (hasMicrophonePermission(var1) && hasForegroundServiceMicPermission(var1)) {
               var14 = true;
            } else {
               var14 = false;
            }

            if (var9.ordinal() >= ServiceNotificationConfiguration.Type.VOICE_CALL.ordinal() && var14 && var8) {
               var4 = 129;
            } else {
               var4 = 1;
            }

            if (!MediaProjectionConsent.INSTANCE.isGranted(var1) || !hasForegroundServiceMediaProjectionPermission(var1)) {
               var5 = 0;
            }

            if (var9.ordinal() >= ServiceNotificationConfiguration.Type.SCREEN_SHARE.ordinal() && var5) {
               var4 |= 32;
            }
         }

         val var12: Log = Log.INSTANCE;
         val var16: java.lang.String = toForegroundServiceTypeString(var4);
         val var10: StringBuilder = new StringBuilder();
         var10.append("Foregrounding ForegroundService with type ");
         var10.append(var16);
         Log.i$foreground_service_release$default(var12, var10.toString(), null, 2, null);
         a.a(var0, var2, var3, var4);
      }
   }
}

internal fun Context.startForegroundServiceCompat(serviceIntent: Intent): ComponentName? {
   val var2: ComponentName;
   if (VERSION.SDK_INT >= 26) {
      var2 = K2.b.a(var0, var1);
   } else {
      var2 = var0.startService(var1);
   }

   return var2;
}

internal fun Int.toForegroundServiceTypeString(): String {
   val var1: StringBuilder = new StringBuilder();
   if ((var0 and 1) != 0) {
      var1.append("DataSync ");
   }

   if ((var0 and 128) != 0) {
      var1.append("Microphone ");
   }

   if ((var0 and 32) != 0) {
      var1.append("MediaProjection ");
   }

   if (StringsKt.c0(var1)) {
      var1.append("Unknown ");
   }

   val var2: java.lang.String = var1.toString();
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
