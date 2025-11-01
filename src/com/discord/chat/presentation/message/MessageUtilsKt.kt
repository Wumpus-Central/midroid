package com.discord.chat.presentation.message

import android.content.Context
import android.graphics.LinearGradient
import android.graphics.Shader.TileMode
import android.widget.TextView
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.rolecolors.RoleColors
import com.discord.chat.bridge.rolecolors.RoleColorsKt
import com.discord.react.FontManager

public fun TextView.clearOrSetRoleColors(message: Message) {
   val var2: RoleColors = RoleColorsKt.toAndroidColors(var1.getRoleColors());
   if (!var1.getShouldShowRoleDot() && var1.getShouldShowRoleOnName()) {
      val var3: Int;
      if (var2 != null) {
         var3 = var2.getSecondaryColor();
      } else {
         var3 = null;
      }

      if (var3 != null) {
         var0.getPaint()
            .setShader(
               new LinearGradient(
                  0.0F,
                  0.0F,
                  150.0F,
                  0.0F,
                  CollectionsKt.g1(CollectionsKt.q(new Integer[]{var2.getPrimaryColor(), var2.getSecondaryColor(), var2.getTertiaryColor()})),
                  null,
                  TileMode.MIRROR
               )
            );
         return;
      }
   }

   var0.getPaint().setShader(null);
}

public fun Context.getChatTextSizeSp(): Int {
   return if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var0)) 14 else 16;
}
