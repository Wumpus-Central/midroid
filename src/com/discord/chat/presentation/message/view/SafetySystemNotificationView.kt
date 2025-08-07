package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.discord.chat.bridge.safetysystemnotification.FooterTheme
import com.discord.chat.databinding.SafetySystemNotificationBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.SetOptionalImageUrlKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function2

public class SafetySystemNotificationView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   public final val binding: SafetySystemNotificationBinding

   fun SafetySystemNotificationView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var5: SafetySystemNotificationBinding = SafetySystemNotificationBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var5, "inflate(...)");
      this.binding = var5;
      val var3: View = var5.getRoot();
      var3.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      kotlin.jvm.internal.r.e(var3);
      ViewClippingUtilsKt.clipToRoundedRectangle(var3, SizeUtilsKt.getDpToPx(8));
      val var4: TextView = var5.separator;
      var5.separator.setText("•");
      var4.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      kotlin.jvm.internal.r.e(var4);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryBold);
      var4.setVisibility(8);
   }

   private fun setDescription(description: String) {
      if (kotlin.text.h.c0(var1)) {
         this.binding.description.setVisibility(8);
      } else {
         val var2: TextView = this.binding.description;
         this.binding.description.setText(var1);
         var2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
         kotlin.jvm.internal.r.e(var2);
         DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimaryNormal);
         var2.setVisibility(0);
         kotlin.jvm.internal.r.e(var2);
      }
   }

   private fun setPrimaryCta(primaryCtaText: String, primaryCtaType: String, primaryCtaKey: String, callback: (String, String) -> Unit) {
      val var5: TextView = this.binding.primaryCta;
      this.binding.primaryCta.setOnClickListener(new O0(var4, var2, var3));
      var5.setText(var1);
      kotlin.jvm.internal.r.e(var5);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
   }

   @JvmStatic
   fun `setPrimaryCta$lambda$6$lambda$5`(var0: Function2, var1: java.lang.String, var2: java.lang.String, var3: View) {
      var0.invoke(var1, var2);
   }

   private fun setSecondaryCta(secondaryCtaText: String, secondaryCtaType: String, secondaryCtaKey: String, callback: (String, String) -> Unit) {
      val var5: TextView = this.binding.secondaryCta;
      this.binding.secondaryCta.setOnClickListener(new P0(var4, var2, var3));
      var5.setText(var1);
      kotlin.jvm.internal.r.e(var5);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
   }

   @JvmStatic
   fun `setSecondaryCta$lambda$8$lambda$7`(var0: Function2, var1: java.lang.String, var2: java.lang.String, var3: View) {
      var0.invoke(var1, var2);
   }

   private fun setSubtitle(subtitle: String) {
      if (kotlin.text.h.c0(var1)) {
         this.binding.subtitleText.setVisibility(8);
      } else {
         val var2: TextView = this.binding.subtitleText;
         this.binding.subtitleText.setText(var1);
         var2.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
         kotlin.jvm.internal.r.e(var2);
         DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimaryMedium);
         var2.setVisibility(0);
         kotlin.jvm.internal.r.e(var2);
      }
   }

   private fun setTheme(footerTheme: FooterTheme) {
      if (var1 === FooterTheme.DANGER) {
         this.binding.footer.setBackgroundColor(ThemeManagerKt.getTheme().getStatusDanger());
         this.binding.primaryCta.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
         this.binding.secondaryCta.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
         val var2: SimpleDraweeView = this.binding.icon;
         kotlin.jvm.internal.r.g(this.binding.icon, "icon");
         ColorUtilsKt.setTintColor(var2, ThemeManagerKt.getTheme().getTextDanger());
      } else {
         this.binding.footer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
         this.binding.primaryCta.setTextColor(ThemeManagerKt.getTheme().getTextLink());
         this.binding.secondaryCta.setTextColor(ThemeManagerKt.getTheme().getTextLink());
         val var3: SimpleDraweeView = this.binding.icon;
         kotlin.jvm.internal.r.g(this.binding.icon, "icon");
         ColorUtilsKt.setTintColor(var3, ThemeManagerKt.getTheme().getTextLink());
      }
   }

   private fun setTitle(titleText: String) {
      if (kotlin.text.h.c0(var1)) {
         this.binding.titleContainer.setVisibility(8);
      } else {
         val var2: TextView = this.binding.title;
         this.binding.title.setText(var1);
         var2.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
         kotlin.jvm.internal.r.e(var2);
         DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimarySemibold);
         var2.setVisibility(0);
         kotlin.jvm.internal.r.e(var2);
      }
   }

   private fun setTitleIcon(titleIcon: String) {
      val var2: SimpleDraweeView = this.binding.icon;
      kotlin.jvm.internal.r.g(this.binding.icon, "icon");
      SetOptionalImageUrlKt.setOptionalImageUrl$default(var2, var1, null, null, null, 14, null);
   }

   public fun setContent(
      titleText: String,
      titleIcon: String,
      subtitleText: String,
      descriptionText: String,
      primaryCtaText: String,
      primaryCtaKey: String,
      primaryCtaType: String,
      secondaryCtaText: String,
      secondaryCtaType: String,
      secondaryCtaKey: String,
      footerTheme: FooterTheme,
      onTapCta: (String, String) -> Unit
   ) {
      kotlin.jvm.internal.r.h(var1, "titleText");
      kotlin.jvm.internal.r.h(var2, "titleIcon");
      kotlin.jvm.internal.r.h(var3, "subtitleText");
      kotlin.jvm.internal.r.h(var4, "descriptionText");
      kotlin.jvm.internal.r.h(var5, "primaryCtaText");
      kotlin.jvm.internal.r.h(var6, "primaryCtaKey");
      kotlin.jvm.internal.r.h(var7, "primaryCtaType");
      kotlin.jvm.internal.r.h(var8, "secondaryCtaText");
      kotlin.jvm.internal.r.h(var9, "secondaryCtaType");
      kotlin.jvm.internal.r.h(var10, "secondaryCtaKey");
      kotlin.jvm.internal.r.h(var11, "footerTheme");
      kotlin.jvm.internal.r.h(var12, "onTapCta");
      this.setTitle(var1);
      this.setTitleIcon(var2);
      this.setSubtitle(var3);
      this.setDescription(var4);
      this.setTheme(var11);
      this.setPrimaryCta(var5, var7, var6, var12);
      if (!kotlin.text.h.c0(var8) && !kotlin.text.h.c0(var10)) {
         this.setSecondaryCta(var8, var9, var10, var12);
      }

      if (!kotlin.text.h.c0(var5) && !kotlin.text.h.c0(var8)) {
         this.binding.separator.setVisibility(0);
      }
   }
}
