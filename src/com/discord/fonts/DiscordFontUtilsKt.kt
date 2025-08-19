package com.discord.fonts

import android.content.Context
import android.widget.TextView

public fun TextView.setDiscordFont(font: DiscordFont) {
   val var2: Context = var0.getContext();
   var0.setTypeface(var1.typeface(var2));
}
