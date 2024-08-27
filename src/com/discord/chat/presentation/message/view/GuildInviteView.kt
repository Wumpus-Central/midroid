package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.GuildInviteViewBinding
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView

public class GuildInviteView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: GuildInviteViewBinding

   fun GuildInviteView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun GuildInviteView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      val var7: GuildInviteViewBinding = GuildInviteViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var7, "inflate(LayoutInflater.from(context), this)");
      this.binding = var7;
      var var4: TextView = var7.itemInviteHeader;
      var7.itemInviteHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      kotlin.jvm.internal.r.g(var4, "lambda$6$lambda$0");
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryBold);
      val var5: TextView = var7.itemInviteTitle;
      var7.itemInviteTitle.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      kotlin.jvm.internal.r.g(var5, "lambda$6$lambda$1");
      SetTextSizeSpKt.setTextSizeSp(var5, 16.0F);
      val var8: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      var var6: TextView = var7.itemInviteSubtitle;
      var7.itemInviteSubtitle.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      kotlin.jvm.internal.r.g(var6, "lambda$6$lambda$2");
      val var10: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryMedium);
      var6 = var7.itemInviteOnlineText;
      var7.itemInviteOnlineText.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      kotlin.jvm.internal.r.g(var6, "lambda$6$lambda$3");
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var6, var8);
      var6 = var7.itemInviteTotalMemberText;
      var7.itemInviteTotalMemberText.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      kotlin.jvm.internal.r.g(var6, "lambda$6$lambda$4");
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var6, var8);
      var4 = var7.itemInviteHubLink;
      var7.itemInviteHubLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      kotlin.jvm.internal.r.g(var4, "lambda$6$lambda$5");
      DiscordFontUtilsKt.setDiscordFont(var4, var10);
      var7.itemInviteJoinedButton.setBackgroundColor(ColorUtilsKt.getColorCompat(var1, color.brand));
   }

   public fun setBackgroundRectangleColor(color: Int?) {
      val var2: Int;
      if (var1 != null) {
         var2 = var1;
      } else {
         val var3: Context = this.getContext();
         kotlin.jvm.internal.r.g(var3, "context");
         var2 = ColorUtilsKt.getColorCompat(var3, ThemeManagerKt.getTheme().getColorRes(color.primary_100, color.primary_630));
      }

      ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, var2, SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
   }

   public fun setButtonBackgroundColor(color: Int?) {
      this.binding.itemInviteJoinedButton.setBackgroundColor(var1);
   }

   public fun setButtonText(text: CharSequence?) {
      val var4: DCDButton = this.binding.itemInviteJoinedButton;
      kotlin.jvm.internal.r.g(this.binding.itemInviteJoinedButton, "binding.itemInviteJoinedButton");
      var var2: Boolean;
      if (var1 != null && !kotlin.text.f.x(var1)) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (true xor var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      this.binding.itemInviteJoinedButton.setText(var1);
   }

   public fun setButtonTextColor(color: Int?) {
      this.binding.itemInviteJoinedButton.setTextColor(var1);
   }

   public fun setGuildImage(url: String?, thumbnailText: String?, thumbnailBackgroundColor: Int?) {
      this.binding.itemInviteImage.configure(var1, var2, var3);
   }

   public fun setHeaderColor(color: Int?): Unit? {
      val var3: Unit;
      if (var1 != null) {
         this.binding.itemInviteHeader.setTextColor(var1.intValue());
         var3 = Unit.a;
      } else {
         var3 = null;
      }

      return var3;
   }

   public fun setHeaderText(headerText: CharSequence?) {
      val var4: TextView = this.binding.itemInviteHeader;
      kotlin.jvm.internal.r.g(this.binding.itemInviteHeader, "binding.itemInviteHeader");
      var var2: Boolean;
      if (var1 != null && var1.length() != 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (true xor var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      this.binding.itemInviteHeader.setText(var1);
   }

   public fun setInviteSplash(url: String?) {
      val var4: SimpleDraweeView = this.binding.itemInviteSplash;
      kotlin.jvm.internal.r.g(this.binding.itemInviteSplash, "binding.itemInviteSplash");
      var var2: Boolean;
      if (var1 != null && var1.length() != 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (true xor var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      this.binding.itemInviteSplash.setImageURI(var1);
   }

   public fun setLoading(loading: Boolean) {
      val var2: DCDButton = this.binding.itemInviteJoinedButton;
      kotlin.jvm.internal.r.g(this.binding.itemInviteJoinedButton, "binding.itemInviteJoinedButton");
      DCDButton.setLoading$default(var2, var1, false, 2, null);
   }

   public fun setOnButtonClickListener(listener: OnClickListener?) {
      this.binding.itemInviteJoinedButton.setOnClickButtonListener(var1);
   }

   public fun setPresence(onlineText: CharSequence?, memberText: CharSequence?) {
      var var7: ImageView = this.binding.itemInviteOnlineDot;
      kotlin.jvm.internal.r.g(this.binding.itemInviteOnlineDot, "binding.itemInviteOnlineDot");
      var var3: Boolean;
      if (var1 != null && !kotlin.text.f.x(var1)) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      if (var3 xor true) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var7.setVisibility(var3);
      var7 = this.binding.itemInviteOnlineDot;
      kotlin.jvm.internal.r.g(this.binding.itemInviteOnlineDot, "binding.itemInviteOnlineDot");
      ViewBackgroundUtilsKt.setBackgroundOval$default(var7, ColorUtilsKt.getColorCompat(this, color.green_360), 0, 2, null);
      this.binding.itemInviteOnlineText.setText(var1);
      var7 = this.binding.itemInviteTotalMemberDot;
      kotlin.jvm.internal.r.g(this.binding.itemInviteTotalMemberDot, "binding.itemInviteTotalMemberDot");
      var var9: Boolean;
      if (var2 != null && !kotlin.text.f.x(var2)) {
         var9 = 0;
      } else {
         var9 = 1;
      }

      if (var9 xor true) {
         var9 = 0;
      } else {
         var9 = 8;
      }

      var7.setVisibility(var9);
      var7 = this.binding.itemInviteTotalMemberDot;
      kotlin.jvm.internal.r.g(this.binding.itemInviteTotalMemberDot, "binding.itemInviteTotalMemberDot");
      ViewBackgroundUtilsKt.setBackgroundOval$default(var7, ColorUtilsKt.getColorCompat(this, color.primary_500), 0, 2, null);
      this.binding.itemInviteTotalMemberText.setText(var2);
      val var17: LinearLayout = this.binding.itemInviteMemberContainer;
      kotlin.jvm.internal.r.g(this.binding.itemInviteMemberContainer, "binding.itemInviteMemberContainer");
      var var11: Boolean;
      if (var1 != null && !kotlin.text.f.x(var1)) {
         var11 = 0;
      } else {
         var11 = 1;
      }

      var var4: Boolean = true;
      if (var11) {
         if (var2 != null && !kotlin.text.f.x(var2)) {
            var11 = (boolean)0;
         } else {
            var11 = (boolean)1;
         }

         if (!var11) {
            var4 = true;
         } else {
            var4 = false;
         }
      }

      if (var4) {
         var11 = 0;
      } else {
         var11 = 8;
      }

      var17.setVisibility(var11);
   }

   public fun setSubtitle(subtitle: CharSequence?) {
      val var2: TextView = this.binding.itemInviteSubtitle;
      kotlin.jvm.internal.r.g(this.binding.itemInviteSubtitle, "binding.itemInviteSubtitle");
      ViewUtilsKt.setOptionalText(var2, var1);
   }

   public fun setSubtitleColor(color: Int?) {
      if (var1 != null) {
         this.binding.itemInviteSubtitle.setTextColor(var1.intValue());
      }

      val var3: SimpleDraweeView = this.binding.itemInviteSubtitleIcon;
      kotlin.jvm.internal.r.g(this.binding.itemInviteSubtitleIcon, "binding.itemInviteSubtitleIcon");
      ColorUtilsKt.setTintColor(var3, var1);
   }

   public fun setSubtitleIcon(subtitleIconUrl: String?) {
      val var2: SimpleDraweeView = this.binding.itemInviteSubtitleIcon;
      kotlin.jvm.internal.r.g(this.binding.itemInviteSubtitleIcon, "setSubtitleIcon$lambda$9");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var2, var1);
   }

   public fun setTitleColor(color: Int?): Unit? {
      val var3: Unit;
      if (var1 != null) {
         this.binding.itemInviteTitle.setTextColor(var1.intValue());
         var3 = Unit.a;
      } else {
         var3 = null;
      }

      return var3;
   }

   public fun setTitleText(name: CharSequence?) {
      this.binding.itemInviteTitle.setText(var1);
   }
}
