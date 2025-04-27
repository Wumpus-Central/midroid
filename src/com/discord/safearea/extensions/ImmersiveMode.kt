package com.discord.safearea.extensions

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.a0
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import kotlin.jvm.internal.q

public object ImmersiveMode {
   private fun Activity.fitSystemWindowsAndAdjustResize() {
      val var4: View = ActivityExtensionsKt.getRootView(var1);
      val var2: Boolean = var4 is ViewGroup;
      var var3: View = null;
      val var5: ViewGroup;
      if (var2) {
         var5 = var4 as ViewGroup;
      } else {
         var5 = null;
      }

      if (var5 != null) {
         var3 = var5.getChildAt(0);
      }

      q.e(var3);
      a0.E0(var5, new a(var5, var3));
   }

   @JvmStatic
   fun `fitSystemWindowsAndAdjustResize$lambda$1`(var0: ViewGroup, var1: View, var2: View, var3: WindowInsetsCompat): WindowInsetsCompat {
      q.h(var1, "$rootViewChild");
      q.h(var2, "<anonymous parameter 0>");
      q.h(var3, "insets");
      var0.setFitsSystemWindows(true);
      val var4: WindowInsetsCompat = new WindowInsetsCompat.b(var3)
         .b(WindowInsetsCompat.m.h(), Insets.b(0, 0, 0, Math.max(WindowInsetsCompatExtensionsKt.getImeInsets$default(var3, false, 1, null).d, 0)))
         .a();
      a0.b0(var1, var4);
      return var4;
   }

   public fun enableImmersiveMode(activity: Activity) {
      q.h(var1, "activity");
      val var2: Window = var1.getWindow();
      q.g(var2, "getWindow(...)");
      WindowExtensionsKt.setSystemUITransparent(var2);
      this.fitSystemWindowsAndAdjustResize(var1);
   }
}
