package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.widget.Button
import com.discord.chat.bridge.botuikit.ButtonComponent
import com.discord.chat.bridge.botuikit.ButtonStyle
import com.discord.misc.utilities.view.ButtonBackgroundUtilsKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.internal.q

@JvmSynthetic
fun `access$hasEmoji`(var0: ButtonComponent): Boolean {
   return hasEmoji(var0);
}

@JvmSynthetic
fun `access$hasIcon`(var0: ButtonComponent): Boolean {
   return hasIcon(var0);
}

@JvmSynthetic
fun `access$setBrandColor`(var0: Button) {
   setBrandColor(var0);
}

@JvmSynthetic
fun `access$setDangerColor`(var0: Button) {
   setDangerColor(var0);
}

@JvmSynthetic
fun `access$setSecondaryColor`(var0: Button) {
   setSecondaryColor(var0);
}

@JvmSynthetic
fun `access$setSuccessColor`(var0: Button) {
   setSuccessColor(var0);
}

private fun ButtonComponent.hasEmoji(): Boolean {
   val var1: Boolean;
   if (var0.getEmoji() != null) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

private fun ButtonComponent.hasIcon(): Boolean {
   val var1: Boolean;
   if (var0.getStyle() === ButtonStyle.LINK) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

private fun Button.setBrandColor() {
   ButtonBackgroundUtilsKt.setBackgroundColors(
      var0, ColorUtilsKt.getColorCompat(var0, color.brand_500), ColorUtilsKt.getColorCompat(var0, color.brand_new_500_alpha_20)
   );
}

private fun Button.setDangerColor() {
   ButtonBackgroundUtilsKt.setBackgroundColors(
      var0, ColorUtilsKt.getColorCompat(var0, color.red_400), ColorUtilsKt.getColorCompat(var0, color.status_red_500_alpha_20)
   );
}

private fun Button.setSecondaryColor() {
   var var2: Context = var0.getContext();
   q.g(var2, "getContext(...)");
   val var1: Int = ColorUtilsKt.getThemeColor(var2, color.primary_400, color.primary_500);
   var2 = var0.getContext();
   q.g(var2, "getContext(...)");
   ButtonBackgroundUtilsKt.setBackgroundColors(var0, var1, ColorUtilsKt.getThemeColor(var2, color.primary_light_500_alpha_20, color.primary_dark_500_alpha_20));
}

private fun Button.setSuccessColor() {
   ButtonBackgroundUtilsKt.setBackgroundColors(
      var0, ColorUtilsKt.getColorCompat(var0, color.green_360), ColorUtilsKt.getColorCompat(var0, color.status_green_500_alpha_20)
   );
}
