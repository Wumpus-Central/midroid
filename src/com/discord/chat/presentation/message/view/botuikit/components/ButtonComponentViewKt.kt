package com.discord.chat.presentation.message.view.botuikit.components

import android.widget.Button
import com.discord.chat.bridge.botuikit.ButtonComponent
import com.discord.chat.bridge.botuikit.ButtonStyle
import com.discord.misc.utilities.view.ButtonBackgroundUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt

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
   return var0.getEmoji() != null;
}

private fun ButtonComponent.hasIcon(): Boolean {
   return var0.getStyle() === ButtonStyle.LINK;
}

private fun Button.setBrandColor() {
   setThemedBackgroundColor(var0, ThemeManagerKt.getTheme().getRedesignButtonPrimaryBackground());
}

private fun Button.setDangerColor() {
   setThemedBackgroundColor(var0, ThemeManagerKt.getTheme().getRedesignButtonDangerBackground());
}

private fun Button.setSecondaryColor() {
   setThemedBackgroundColor(var0, ThemeManagerKt.getTheme().getBackgroundAccent());
}

private fun Button.setSuccessColor() {
   setThemedBackgroundColor(var0, ThemeManagerKt.getTheme().getRedesignButtonActiveBackground());
}

private fun Button.setThemedBackgroundColor(color: Int) {
   ButtonBackgroundUtilsKt.setBackgroundColors(var0, var1, ColorUtilsKt.argbWithAdjustedAlpha(var1, 0.5F));
}
