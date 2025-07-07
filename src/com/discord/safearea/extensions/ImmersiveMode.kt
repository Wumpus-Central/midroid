package com.discord.safearea.extensions

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.Z
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import kotlin.jvm.internal.r

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

      r.e(var3);
      Z.D0(var5, new a(var5, var3));
   }

   @JvmStatic
   fun `fitSystemWindowsAndAdjustResize$lambda$1`(var0: ViewGroup, var1: View, var2: View, var3: WindowInsetsCompat): WindowInsetsCompat {
      var0.setFitsSystemWindows(true);
      val var5: WindowInsetsCompat.a = new WindowInsetsCompat.a(var3);
      val var4: Int = WindowInsetsCompat.n.h();
      r.e(var3);
      val var6: WindowInsetsCompat = var5.b(var4, Insets.c(0, 0, 0, Math.max(WindowInsetsCompatExtensionsKt.getImeInsets$default(var3, false, 1, null).d, 0)))
         .a();
      Z.a0(var1, var6);
      return var6;
   }

   public fun enableImmersiveMode(activity: Activity) {
      r.h(var1, "activity");
      val var2: Window = var1.getWindow();
      r.g(var2, "getWindow(...)");
      WindowExtensionsKt.setSystemUITransparent(var2);
      this.fitSystemWindowsAndAdjustResize(var1);
   }
}
