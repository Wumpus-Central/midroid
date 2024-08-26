package com.discord.scale

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import com.discord.react.FontManager
import kotlin.jvm.internal.r

public fun Context.getFontScaledContext(): Context {
   r.h(var0, "<this>");
   val var1: Configuration = var0.getResources().getConfiguration();
   r.g(var1, "resources.configuration");
   var0 = var0.createConfigurationContext(modifyFontScale(var1, var0));
   r.g(var0, "createConfigurationConte…ifyFontScale(this),\n    )");
   return var0;
}

private fun Configuration.modifyFontScale(context: Context): Configuration {
   var0.fontScale = FontManager.INSTANCE.getScaledFontSize(var1);
   return var0;
}

public fun Context.setFontScaleDeprecated() {
   r.h(var0, "<this>");
   val var2: Resources = var0.getResources();
   val var1: Configuration = var0.getResources().getConfiguration();
   r.g(var1, "resources.configuration");
   var2.updateConfiguration(modifyFontScale(var1, var0), var0.getResources().getDisplayMetrics());
}
