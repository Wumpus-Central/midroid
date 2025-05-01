package com.discord.device.utils

import android.app.Activity
import android.os.Build.VERSION
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import androidx.window.layout.WindowMetrics
import com.discord.device.react_events.MetricsSize
import kotlin.jvm.internal.q

internal object DeviceMetrics {
   public fun getScreenSize(currentActivity: Activity?): MetricsSize? {
      if (VERSION.SDK_INT < 34) {
         return null;
      } else if (var1 == null) {
         return null;
      } else {
         try {
            return new MetricsSize(y0.a.a.a().a(var1));
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
            val var4: WindowMetrics = y0.a.a.a().a(var1);
            if (VERSION.SDK_INT >= 34) {
               val var2: Insets = var4.b().g(WindowInsetsCompat.m.h() or WindowInsetsCompat.m.b());
               q.g(var2, "getInsetsIgnoringVisibility(...)");
               return new MetricsSize(var4.a().width() - var2.a - var2.c, var4.a().height() - var2.b - var2.d);
            }
         } catch (var3: Exception) {
         }

         return null;
      }
   }
}
