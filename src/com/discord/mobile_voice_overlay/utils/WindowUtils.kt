package com.discord.mobile_voice_overlay.utils

import android.content.Context
import android.graphics.Rect
import android.os.Build.VERSION
import android.provider.Settings
import android.view.View
import android.view.WindowManager.LayoutParams
import kotlin.jvm.internal.r

internal object WindowUtils {
   public fun LayoutParams.addFlag(flag: Int) {
      r.h(var1, "<this>");
      var1.flags |= var2;
   }

   public fun canDrawOverlay(context: Context): Boolean {
      r.h(var1, "context");
      return Settings.canDrawOverlays(var1);
   }

   public fun createWindowLayoutParams(): LayoutParams {
      val var1: Short;
      if (VERSION.SDK_INT <= 25) {
         var1 = 2007;
      } else {
         var1 = 2038;
      }

      return new LayoutParams(-2, -2, var1, 16777768, -3);
   }

   public fun getCenterPointOnScreen(view: View, outLocation: IntArray): IntArray {
      r.h(var1, "view");
      r.h(var2, "outLocation");
      var1.getLocationOnScreen(var2);
      var2[0] += var1.getWidth() / 2;
      var2[1] += var1.getHeight() / 2;
      return var2;
   }

   public fun getScreenSize(context: Context): Rect {
      r.h(var1, "context");
      return new Rect(0, 0, var1.getResources().getDisplayMetrics().widthPixels, var1.getResources().getDisplayMetrics().heightPixels);
   }

   public fun LayoutParams.removeFlag(flag: Int) {
      r.h(var1, "<this>");
      var1.flags &= var2.inv();
   }

   public fun LayoutParams.setFlagTouchable(isTouchable: Boolean) {
      r.h(var1, "<this>");
      if (var2) {
         this.removeFlag(var1, 16);
      } else {
         this.addFlag(var1, 16);
      }
   }
}
