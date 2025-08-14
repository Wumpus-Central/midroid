package com.discord.scale

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import com.discord.react.FontManager

public fun Context.getFontScaledContext(): Context {
   val var1: Configuration = var0.getResources().getConfiguration();
   var0 = var0.createConfigurationContext(modifyFontScale(var1, var0));
   return var0;
}

private fun Configuration.modifyFontScale(context: Context): Configuration {
   var0.fontScale = FontManager.INSTANCE.getScaledFontSize(var1);
   return var0;
}

public fun Context.setFontScaleDeprecated() {
   val var2: Resources = var0.getResources();
   val var1: Configuration = var0.getResources().getConfiguration();
   var2.updateConfiguration(modifyFontScale(var1, var0), var0.getResources().getDisplayMetrics());
}
