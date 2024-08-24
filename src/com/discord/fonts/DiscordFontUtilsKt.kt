package com.discord.fonts

import android.content.Context
import android.widget.TextView
import kotlin.jvm.internal.r

public fun TextView.setDiscordFont(font: DiscordFont) {
   r.h(var0, "<this>");
   r.h(var1, "font");
   val var2: Context = var0.getContext();
   r.g(var2, "this.context");
   var0.setTypeface(var1.typeface(var2));
}
