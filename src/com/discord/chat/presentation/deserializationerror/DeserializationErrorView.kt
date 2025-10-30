package com.discord.chat.presentation.deserializationerror

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.a
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.DeserializationErrorViewBinding
import com.discord.chat.presentation.list.ChatListLinearLayout
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.ThemeManagerKt

public class DeserializationErrorView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListLinearLayout(var1, var2) {
   private final val binding: DeserializationErrorViewBinding

   fun DeserializationErrorView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var6: DeserializationErrorViewBinding = DeserializationErrorViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var6;
      var6.json.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      var var3: TextView = var6.json;
      val var5: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      var6.exception.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      var3 = var6.exception;
      DiscordFontUtilsKt.setDiscordFont(var3, var5);
      var6.causeHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveActive());
      var3 = var6.causeHeader;
      SetTextSizeSpKt.setTextSizeSp(var3, 24.0F);
      var var4: TextView = var6.causeHeader;
      val var10: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var6.jsonHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveActive());
      var4 = var6.jsonHeader;
      SetTextSizeSpKt.setTextSizeSp(var4, 24.0F);
      var4 = var6.jsonHeader;
      DiscordFontUtilsKt.setDiscordFont(var4, var10);
      var3 = var6.header;
      DiscordFontUtilsKt.setDiscordFont(var3, var5);
      var3 = var6.header;
      SetTextSizeSpKt.setTextSizeSp(var3, 24.0F);
      val var7: Button = var6.copyButton;
      DiscordFontUtilsKt.setDiscordFont(var7, var5);
      this.setOrientation(1);
   }

   @JvmStatic
   fun `configure$lambda$0`(var0: DeserializationErrorView, var1: java.lang.String, var2: View) {
      val var3: Any = a.i(var0.getContext(), ClipboardManager.class);
      (var3 as ClipboardManager).setPrimaryClip(ClipData.newPlainText("Error JSON", var1));
      Toast.makeText(var0.getContext(), "Copied error json to clipboard", 0).show();
   }

   public fun configure(json: String, causeMessage: String) {
      this.binding.json.setText(var1);
      this.binding.exception.setText(var2);
      val var3: Button = this.binding.copyButton;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var3, false, new b6.a(this, var1), 1, null);
   }
}
