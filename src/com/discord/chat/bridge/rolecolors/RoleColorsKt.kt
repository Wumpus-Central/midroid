@file:SourceDebugExtension(["SMAP\nRoleColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleColors.kt\ncom/discord/chat/bridge/rolecolors/RoleColorsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"])

package com.discord.chat.bridge.rolecolors

import com.discord.react.utilities.ReactColorToAndroidColorKt
import kotlin.jvm.internal.SourceDebugExtension
import x2.c

public const val ROLE_COLORS_PATTERN_WIDTH: Float = 150.0F

public fun RoleColors?.toAndroidColors(): RoleColors? {
   if (var0 != null) {
      val var1: Int = c.l(ReactColorToAndroidColorKt.reactColorToAndroidColor(var0.getPrimaryColor()), 255);
      var var2: Int = var0.getSecondaryColor();
      if (var2 != null) {
         var2 = c.l(ReactColorToAndroidColorKt.reactColorToAndroidColor(var2.intValue()), 255);
      } else {
         var2 = null;
      }

      val var4: Int = var0.getTertiaryColor();
      var var5: Int = null;
      if (var4 != null) {
         var5 = c.l(ReactColorToAndroidColorKt.reactColorToAndroidColor(var4.intValue()), 255);
      }

      return new RoleColors(var1, var2, var5);
   } else {
      return null;
   }
}
