package com.discord.device.utils

import android.app.Activity
import android.os.Build.VERSION
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import androidx.window.layout.WindowMetrics
import com.discord.device.react_events.MetricsSize

internal object DeviceMetrics {
   public fun getScreenSize(currentActivity: Activity?): MetricsSize? {
      if (VERSION.SDK_INT < 34) {
         return null;
      } else if (var1 == null) {
         return null;
      } else {
         try {
            return new MetricsSize(D0.a.a.a().a(var1));
         } catch (var2: Exception) {
            return null;
         }
      }
   }

   public fun getWindowSize(currentActivity: Activity?): MetricsSize? {
      if (var1 == null) {
         return null;
      } else {
         try {
            val var2: WindowMetrics = D0.a.a.a().a(var1);
            if (VERSION.SDK_INT >= 34) {
               val var4: Insets = var2.b().g(WindowInsetsCompat.n.h() or WindowInsetsCompat.n.b());
               return new MetricsSize(var2.a().width() - var4.a - var4.c, var2.a().height() - var4.b - var4.d);
            }
         } catch (var3: Exception) {
         }

         return null;
      }
   }
}
