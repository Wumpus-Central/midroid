package com.discord.chat.presentation.message.view

import com.discord.theme.R
import com.discord.theme.ThemeManagerKt

public fun getEmbedBackgroundColor(): Int {
   return ThemeManagerKt.getTheme().getColorRes(R.color.primary_130, R.color.primary_630);
}
