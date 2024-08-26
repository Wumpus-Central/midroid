package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.databinding.SafetyPolicyNoticeBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function1

public class SafetyPolicyNoticeView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout {
   public final val binding: SafetyPolicyNoticeBinding

   fun SafetyPolicyNoticeView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var3: SafetyPolicyNoticeBinding = SafetyPolicyNoticeBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
      val var5: View = var3.getRoot();
      var5.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      kotlin.jvm.internal.r.g(var5, "_init_$lambda$0");
      ViewClippingUtilsKt.clipToRoundedRectangle(var5, SizeUtilsKt.getDpToPx(8));
      val var4: SimpleDraweeView = var3.icon;
      kotlin.jvm.internal.r.g(var3.icon, "_init_$lambda$1");
      ReactAssetUtilsKt.setReactAsset(var4, ReactAsset.WarningTriangle);
      ColorUtilsKt.setTintColor(var4, ThemeManagerKt.getTheme().getStatusDanger());
   }

   private fun setCta(ctaText: String) {
      this.binding.footer.setBackgroundColor(ThemeManagerKt.getTheme().getStatusDanger());
      val var2: TextView = this.binding.learnMore;
      this.binding.learnMore.setText(var1);
      var2.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.r.g(var2, "setCta$lambda$6");
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimaryMedium);
   }

   private fun setDescription(description: String) {
      val var2: TextView = this.binding.description;
      this.binding.description.setText(var1);
      var2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      kotlin.jvm.internal.r.g(var2, "setDescription$lambda$4");
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimaryMedium);
   }

   private fun setOnClickListener(classificationId: String, callback: (String) -> Unit) {
      this.binding.getRoot().setOnClickListener(new o0(var2, var1));
   }

   @JvmStatic
   fun `setOnClickListener$lambda$8$lambda$7`(var0: Function1, var1: java.lang.String, var2: View) {
      kotlin.jvm.internal.r.h(var0, "$callback");
      kotlin.jvm.internal.r.h(var1, "$classificationId");
      var0.invoke(var1);
   }

   private fun setSubtitle(subtitle: String) {
      val var2: TextView = this.binding.subtitleText;
      this.binding.subtitleText.setText(var1);
      var2.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.r.g(var2, "setSubtitle$lambda$3");
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimaryMedium);
   }

   private fun setTitle(titleText: String) {
      val var2: TextView = this.binding.title;
      this.binding.title.setText(var1);
      var2.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.r.g(var2, "setTitle$lambda$2");
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimaryMedium);
   }

   public fun setContent(title: String, subtitle: String, description: String, ctaText: String, classificationId: String, onTapEmbed: (String) -> Unit) {
      kotlin.jvm.internal.r.h(var1, "title");
      kotlin.jvm.internal.r.h(var2, "subtitle");
      kotlin.jvm.internal.r.h(var3, "description");
      kotlin.jvm.internal.r.h(var4, "ctaText");
      kotlin.jvm.internal.r.h(var5, "classificationId");
      kotlin.jvm.internal.r.h(var6, "onTapEmbed");
      this.setTitle(var1);
      this.setSubtitle(var2);
      this.setDescription(var3);
      this.setCta(var4);
      this.setOnClickListener(var5, var6);
   }
}
