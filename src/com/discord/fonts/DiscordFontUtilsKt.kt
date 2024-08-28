package com.discord.fonts

import android.content.Context
import android.widget.TextView
import kotlin.jvm.internal.q

public fun TextView.setDiscordFont(font: DiscordFont) {
   q.h(var0, "<this>");
   q.h(var1, "font");
   val var2: Context = var0.getContext();
   q.g(var2, "getContext(...)");
   var0.setTypeface(var1.typeface(var2));
}
