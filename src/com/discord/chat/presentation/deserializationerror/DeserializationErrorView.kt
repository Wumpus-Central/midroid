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
import kotlin.jvm.internal.q

public class DeserializationErrorView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListLinearLayout {
   private final val binding: DeserializationErrorViewBinding

   fun DeserializationErrorView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      val var6: DeserializationErrorViewBinding = DeserializationErrorViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var6, "inflate(...)");
      this.binding = var6;
      var6.json.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      var var3: TextView = var6.json;
      q.g(var6.json, "json");
      val var5: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      var6.exception.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      var3 = var6.exception;
      q.g(var6.exception, "exception");
      DiscordFontUtilsKt.setDiscordFont(var3, var5);
      var6.causeHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveActive());
      var3 = var6.causeHeader;
      q.g(var6.causeHeader, "causeHeader");
      SetTextSizeSpKt.setTextSizeSp(var3, 24.0F);
      var var4: TextView = var6.causeHeader;
      q.g(var6.causeHeader, "causeHeader");
      val var10: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var6.jsonHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveActive());
      var4 = var6.jsonHeader;
      q.g(var6.jsonHeader, "jsonHeader");
      SetTextSizeSpKt.setTextSizeSp(var4, 24.0F);
      var4 = var6.jsonHeader;
      q.g(var6.jsonHeader, "jsonHeader");
      DiscordFontUtilsKt.setDiscordFont(var4, var10);
      var3 = var6.header;
      q.g(var6.header, "header");
      DiscordFontUtilsKt.setDiscordFont(var3, var5);
      var3 = var6.header;
      q.g(var6.header, "header");
      SetTextSizeSpKt.setTextSizeSp(var3, 24.0F);
      val var7: Button = var6.copyButton;
      q.g(var6.copyButton, "copyButton");
      DiscordFontUtilsKt.setDiscordFont(var7, var5);
      this.setOrientation(1);
   }

   @JvmStatic
   fun `configure$lambda$0`(var0: DeserializationErrorView, var1: java.lang.String, var2: View) {
      q.h(var0, "this$0");
      q.h(var1, "$json");
      val var3: Any = a.i(var0.getContext(), ClipboardManager.class);
      q.e(var3);
      (var3 as ClipboardManager).setPrimaryClip(ClipData.newPlainText("Error JSON", var1));
      Toast.makeText(var0.getContext(), "Copied error json to clipboard", 0).show();
   }

   public fun configure(json: String, causeMessage: String) {
      q.h(var1, "json");
      q.h(var2, "causeMessage");
      this.binding.json.setText(var1);
      this.binding.exception.setText(var2);
      val var3: Button = this.binding.copyButton;
      q.g(this.binding.copyButton, "copyButton");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var3, false, new e3.a(this, var1), 1, null);
   }
}
