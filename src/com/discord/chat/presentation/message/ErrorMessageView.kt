package com.discord.chat.presentation.message

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.discord.chat.bridge.ErrorMessage
import com.discord.chat.databinding.ErrorMessageViewBinding
import com.discord.chat.presentation.list.ChatListLinearLayout
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.functions.Function1

@SuppressLint(["SetTextI18n"])
public class ErrorMessageView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListLinearLayout {
   private final val binding: ErrorMessageViewBinding

   fun ErrorMessageView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var8: ErrorMessageViewBinding = ErrorMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var8, "inflate(...)");
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
      var var6: TextView = var8.header;
      kotlin.jvm.internal.r.g(var8.header, "header");
      val var7: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimarySemibold);
      var8.errorLabel.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      var6 = var8.errorLabel;
      kotlin.jvm.internal.r.g(var8.errorLabel, "errorLabel");
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryMedium);
      var8.seeMoreButton.setTextColor(ThemeManagerKt.getTheme().getTextLink());
      val var9: TextView = var8.seeMoreButton;
      kotlin.jvm.internal.r.g(var8.seeMoreButton, "seeMoreButton");
      DiscordFontUtilsKt.setDiscordFont(var9, var7);
   }

   @JvmStatic
   fun `setExpandInfo$lambda$0`(var0: Function1, var1: Boolean, var2: View) {
      var0.invoke(var1 xor true);
   }

   public fun setErrorMessage(message: ErrorMessage) {
      kotlin.jvm.internal.r.h(var1, "message");
      this.binding.errorLabel.setText(var1.getStackTrace());
   }

   public fun setExpandInfo(isExpanded: Boolean, onExpandChange: (Boolean) -> Unit) {
      kotlin.jvm.internal.r.h(var2, "onExpandChange");
      if (var1) {
         this.binding.seeMoreButton.setText("Show less");
         this.binding.errorLabel.setSingleLine(false);
         this.binding.errorLabel.setMaxLines(Integer.MAX_VALUE);
         this.binding.errorLabel.setGravity(0);
      } else {
         this.binding.seeMoreButton.setText("Show more");
         this.binding.errorLabel.setSingleLine(true);
         this.binding.errorLabel.setMaxLines(1);
         this.binding.errorLabel.setGravity(1);
      }

      val var3: TextView = this.binding.seeMoreButton;
      kotlin.jvm.internal.r.g(this.binding.seeMoreButton, "seeMoreButton");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var3, false, new d(var2, var1), 1, null);
   }
}
