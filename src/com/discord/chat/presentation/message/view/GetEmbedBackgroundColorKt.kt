package com.discord.chat.presentation.message.view

import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color

public fun getEmbedBackgroundColor(): Int {
   return ThemeManagerKt.getTheme().getColorRes(color.primary_130, color.primary_630);
}
