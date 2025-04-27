package com.discord.chat.bridge.rolecolors

import androidx.core.graphics.c
import com.discord.react.utilities.ReactColorToAndroidColorKt

public fun RoleColors?.toAndroidColors(): RoleColors? {
   var var2: RoleColors = null;
   if (var0 != null) {
      val var1: Int = c.k(ReactColorToAndroidColorKt.reactColorToAndroidColor(var0.getPrimaryColor()), 255);
      val var6: Int = var0.getSecondaryColor();
      val var7: Int;
      if (var6 != null) {
         var7 = c.k(ReactColorToAndroidColorKt.reactColorToAndroidColor(var6.intValue()), 255);
      } else {
         var7 = null;
      }

      val var4: Int = var0.getTertiaryColor();
      var var5: Int = null;
      if (var4 != null) {
         var5 = c.k(ReactColorToAndroidColorKt.reactColorToAndroidColor(var4.intValue()), 255);
      }

      var2 = new RoleColors(var1, var7, var5);
   }

   return var2;
}
