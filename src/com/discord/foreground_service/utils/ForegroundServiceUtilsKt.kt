package com.discord.foreground_service.utils

import B9.n
import K1.a
import android.annotation.SuppressLint
import android.app.Notification
import android.app.Service
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build.VERSION
import androidx.core.content.b
import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Type
import com.discord.lifecycle.AppLifecycle
import java.util.ArrayList

@SuppressLint(["InlinedApi"])
private fun buildServiceTypeChain(requestedType: Type, context: Context): List<Int> {
   val var7: ArrayList = new ArrayList();
   val var2: Int = VERSION.SDK_INT;
   val var8: Int = 128;
   val var6: Int = 32;
   if (var2 < 34) {
      val var3: Int = ForegroundServiceUtilsKt.WhenMappings.$EnumSwitchMapping$0[var0.ordinal()];
      if (var3 != 1) {
         if (var3 != 2) {
            if (var3 != 3) {
               throw new n();
            }

            var7.add(var6);
         } else if (var2 >= 30) {
            var7.add(var8);
         }
      }
   } else {
      val var10: Boolean;
      if (var0.ordinal() >= ServiceNotificationConfiguration.Type.VOICE_CALL.ordinal()
         && hasMicrophonePermission(var1)
         && hasForegroundServiceMicPermission(var1)
         && AppLifecycle.INSTANCE.isForegrounded()) {
         var10 = true;
      } else {
         var10 = false;
      }

      var var12: Boolean = false;
      if (var0.ordinal() >= ServiceNotificationConfiguration.Type.SCREEN_SHARE.ordinal()) {
         var12 = false;
         if (hasForegroundServiceMediaProjectionPermission(var1)) {
            var12 = true;
         }
      }

      if (var12 && var10) {
         var7.add(160);
         var7.add(var6);
         var7.add(var8);
      } else if (var12) {
         var7.add(var6);
      } else if (var10) {
         var7.add(var8);
      }
   }

   var7.add(1);
   return var7;
}

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
   if (VERSION.SDK_INT < 29) {
      var0.startForeground(var2, var3);
   } else {
      var var4: Int = var3.extras.getInt("permissionType", -1);
      val var5: ServiceNotificationConfiguration.Type = CollectionsKt.j0(ServiceNotificationConfiguration.Type.getEntries(), var4) as ServiceNotificationConfiguration.Type;
      if (var5 == null) {
         val var10: StringBuilder = new StringBuilder();
         var10.append("Unknown service type: ");
         var10.append(var4);
         throw new IllegalStateException(var10.toString().toString());
      } else {
         val var14: java.util.Iterator = buildServiceTypeChain(var5, var1).iterator();
         var var11: SecurityException = null;

         while (var14.hasNext()) {
            var4 = (var14.next() as java.lang.Number).intValue();

            try {
               val var16: Log = Log.INSTANCE;
               val var12: java.lang.String = toForegroundServiceTypeString(var4);
               val var15: StringBuilder = new StringBuilder();
               var15.append("Attempting to promote service with type: ");
               var15.append(var12);
               Log.i$foreground_service_release$default(var16, var15.toString(), null, 2, null);
               a.a(var0, var2, var3, var4);
               return;
            } catch (var9: SecurityException) {
               var11 = var9;
               val var6: Log = Log.INSTANCE;
               val var7: java.lang.String = toForegroundServiceTypeString(var4);
               val var8: StringBuilder = new StringBuilder();
               var8.append("Service promotion of type ");
               var8.append(var7);
               var8.append(" failed, trying next in chain");
               var6.w$foreground_service_release(var8.toString(), var9);
            }
         }

         Log.INSTANCE.e$foreground_service_release("All service type promotion attempts failed", var11);
         if (var11 == null) {
            var11 = new SecurityException("Unable to start foreground service with any available type");
         }

         throw var11;
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
