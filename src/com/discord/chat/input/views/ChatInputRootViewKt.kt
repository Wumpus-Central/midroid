package com.discord.chat.input.views

import android.content.Context
import android.view.accessibility.AccessibilityManager
import kotlin.jvm.internal.r

public const val KEYBOARD_CLOSE_BLUR_DELAY: Long = 100L

public fun Context.isScreenReaderOn(): Boolean {
   r.h(var0, "<this>");
   var var1: AccessibilityManager = (AccessibilityManager)var0.getSystemService("accessibility");
   r.f(var1, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
   var1 = var1;
   if (var1.isEnabled()) {
      val var3: java.util.List = var1.getEnabledAccessibilityServiceList(1);
      r.g(var3, "serviceInfoList");
      return var3.isEmpty() xor true;
   } else {
      return false;
   }
}
