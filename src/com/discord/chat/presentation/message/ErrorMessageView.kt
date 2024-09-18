package com.discord.chat.presentation.message

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import com.discord.chat.bridge.ErrorMessage
import com.discord.chat.databinding.ErrorMessageViewBinding
import com.discord.chat.presentation.list.ChatListLinearLayout
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.theme.ThemeManagerKt

@SuppressLint(["SetTextI18n"])
public class ErrorMessageView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListLinearLayout {
   private final val binding: ErrorMessageViewBinding

   fun ErrorMessageView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var8: ErrorMessageViewBinding = ErrorMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var8, "inflate(...)");
      this.binding = var8;
      this.setOrientation(1);
      ViewBackgroundUtilsKt.setBackgroundRectangle(
         this,
         ThemeManagerKt.getTheme().getBackgroundMobileSecondary(),
         SizeUtilsKt.getDpToPx(8),
         ThemeManagerKt.getTheme().getStatusDangerBackground(),
         SizeUtilsKt.getDpToPx(1)
      );
      var8.header.setText("Something went wrong here.");
      var8.header.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      val var6: TextView = var8.header;
      kotlin.jvm.internal.q.g(var8.header, "header");
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimarySemibold);
      var8.errorLabel.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      val var7: TextView = var8.errorLabel;
      kotlin.jvm.internal.q.g(var8.errorLabel, "errorLabel");
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimaryMedium);
   }

   public fun setErrorMessage(message: ErrorMessage) {
      kotlin.jvm.internal.q.h(var1, "message");
      this.binding.errorLabel.setText(var1.getStackTrace());
   }
}
