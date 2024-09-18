package com.discord.scale

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import com.discord.react.FontManager
import kotlin.jvm.internal.q

public fun Context.getFontScaledContext(): Context {
   q.h(var0, "<this>");
   val var1: Configuration = var0.getResources().getConfiguration();
   q.g(var1, "getConfiguration(...)");
   var0 = var0.createConfigurationContext(modifyFontScale(var1, var0));
   q.g(var0, "createConfigurationContext(...)");
   return var0;
}

private fun Configuration.modifyFontScale(context: Context): Configuration {
   var0.fontScale = FontManager.INSTANCE.getScaledFontSize(var1);
   return var0;
}

public fun Context.setFontScaleDeprecated() {
   q.h(var0, "<this>");
   val var1: Resources = var0.getResources();
   val var2: Configuration = var0.getResources().getConfiguration();
   q.g(var2, "getConfiguration(...)");
   var1.updateConfiguration(modifyFontScale(var2, var0), var0.getResources().getDisplayMetrics());
}
