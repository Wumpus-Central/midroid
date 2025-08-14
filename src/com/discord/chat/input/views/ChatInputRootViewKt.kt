package com.discord.chat.input.views

import android.content.Context
import android.view.accessibility.AccessibilityManager

public const val KEYBOARD_CLOSE_BLUR_DELAY: Long = 100L

public fun Context.isScreenReaderOn(): Boolean {
   var var1: AccessibilityManager = (AccessibilityManager)var0.getSystemService("accessibility");
   var1 = var1;
   if (var1.isEnabled()) {
      val var3: java.util.List = var1.getEnabledAccessibilityServiceList(1);
      return var3.isEmpty() xor true;
   } else {
      return false;
   }
}
