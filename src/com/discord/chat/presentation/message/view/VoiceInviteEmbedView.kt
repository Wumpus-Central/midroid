package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.widget.LinearLayout
import android.widget.TextView
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.VoiceInviteEmbedBinding
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.theme.ThemeManagerKt

public class VoiceInviteEmbedView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   public final val binding: VoiceInviteEmbedBinding

   fun VoiceInviteEmbedView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var3: VoiceInviteEmbedBinding = VoiceInviteEmbedBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
   }

   public fun setContent(title: String, body: String, joinCTA: String, joinIcon: String?, joinDisabled: Boolean, onJoin: OnClickListener) {
      kotlin.jvm.internal.r.h(var1, "title");
      kotlin.jvm.internal.r.h(var2, "body");
      kotlin.jvm.internal.r.h(var3, "joinCTA");
      kotlin.jvm.internal.r.h(var6, "onJoin");
      this.binding.card.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundAccent());
      var var7: TextView = this.binding.title;
      this.binding.title.setText(var1);
      var7.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      kotlin.jvm.internal.r.g(var7, "setContent$lambda$1");
      SetTextSizeSpKt.setTextSizeSp(var7, 16.0F);
      val var8: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimarySemibold);
      var7 = this.binding.body;
      this.binding.body.setText(var2);
      var7.setTextColor(ThemeManagerKt.getTheme().getTextPrimary());
      kotlin.jvm.internal.r.g(var7, "setContent$lambda$2");
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimaryNormal);
      val var9: DCDButton = this.binding.joinCta;
      if (var4 != null) {
         this.binding.joinCta.setIcon(var4, SizeUtilsKt.getDpToPx(24));
      }

      if (var5) {
         this.binding.joinCta.setAlpha(0.7F);
         var9.setOnClickButtonListener(null);
      } else {
         this.binding.joinCta.setAlpha(1.0F);
         var9.setOnClickButtonListener(var6);
      }

      var9.setDiscordFont(var8);
      var9.setTextSizeSp(14.0F);
      var9.setText(var3);
      var9.setCornerRadius(SizeUtilsKt.getDpToPx(20));
   }
}
