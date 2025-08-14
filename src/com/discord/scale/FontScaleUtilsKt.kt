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
   val var1: Resources = var0.getResources();
   val var2: Configuration = var0.getResources().getConfiguration();
   var1.updateConfiguration(modifyFontScale(var2, var0), var0.getResources().getDisplayMetrics());
}
