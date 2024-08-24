package com.discord.chat.presentation.message

import android.content.Context
import com.discord.react.FontManager

public fun Context.getChatTextSizeSp(): Int {
   kotlin.jvm.internal.r.h(var0, "<this>");
   val var1: Byte;
   if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var0)) {
      var1 = 14;
   } else {
      var1 = 16;
   }

   return var1;
}
