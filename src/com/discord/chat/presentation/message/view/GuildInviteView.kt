package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
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
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView

public class GuildInviteView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: GuildInviteViewBinding

   fun GuildInviteView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun GuildInviteView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var7: GuildInviteViewBinding = GuildInviteViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var7, "inflate(...)");
      this.binding = var7;
      var var4: TextView = var7.itemInviteHeader;
      var7.itemInviteHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      kotlin.jvm.internal.q.e(var4);
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryBold);
      val var5: TextView = var7.itemInviteTitle;
      var7.itemInviteTitle.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      kotlin.jvm.internal.q.e(var5);
      SetTextSizeSpKt.setTextSizeSp(var5, 16.0F);
      val var8: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      var var6: TextView = var7.itemInviteSubtitle;
      var7.itemInviteSubtitle.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      kotlin.jvm.internal.q.e(var6);
      val var10: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryMedium);
      var6 = var7.itemInviteOnlineText;
      var7.itemInviteOnlineText.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      kotlin.jvm.internal.q.e(var6);
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var6, var8);
      var6 = var7.itemInviteTotalMemberText;
      var7.itemInviteTotalMemberText.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      kotlin.jvm.internal.q.e(var6);
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var6, var8);
      var4 = var7.itemInviteHubLink;
      var7.itemInviteHubLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      kotlin.jvm.internal.q.e(var4);
      DiscordFontUtilsKt.setDiscordFont(var4, var10);
      var7.itemInviteJoinedButton.setBackgroundColor(ColorUtilsKt.getColorCompat(var1, R.color.brand));
   }

   public fun setBackgroundRectangleColor(color: Int?) {
      val var2: Int;
      if (var1 != null) {
         var2 = var1;
      } else {
         val var3: Context = this.getContext();
         kotlin.jvm.internal.q.g(var3, "getContext(...)");
         var2 = ColorUtilsKt.getColorCompat(var3, ThemeManagerKt.getTheme().getColorRes(R.color.primary_100, R.color.primary_630));
      }

      ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, var2, SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
   }

   public fun setButtonBackgroundColor(color: Int?) {
      this.binding.itemInviteJoinedButton.setBackgroundColor(var1);
   }

   public fun setButtonText(text: CharSequence?) {
      val var4: DCDButton = this.binding.itemInviteJoinedButton;
      kotlin.jvm.internal.q.g(this.binding.itemInviteJoinedButton, "itemInviteJoinedButton");
      var var2: Boolean;
      if (var1 != null && !kotlin.text.h.x(var1)) {
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
      kotlin.jvm.internal.q.g(this.binding.itemInviteHeader, "itemInviteHeader");
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
      kotlin.jvm.internal.q.g(this.binding.itemInviteSplash, "itemInviteSplash");
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
      kotlin.jvm.internal.q.g(this.binding.itemInviteJoinedButton, "itemInviteJoinedButton");
      DCDButton.setLoading$default(var2, var1, false, 2, null);
   }

   public fun setOnButtonClickListener(listener: OnClickListener?) {
      this.binding.itemInviteJoinedButton.setOnClickButtonListener(var1);
   }

   public fun setPresence(onlineText: CharSequence?, memberText: CharSequence?) {
      var var6: View = this.binding.itemInviteOnlineDot;
      kotlin.jvm.internal.q.g(this.binding.itemInviteOnlineDot, "itemInviteOnlineDot");
      var var3: Boolean;
      if (var1 != null && !kotlin.text.h.x(var1)) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      if (var3 xor true) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var6.setVisibility(var3);
      var6 = this.binding.itemInviteOnlineDot;
      kotlin.jvm.internal.q.g(this.binding.itemInviteOnlineDot, "itemInviteOnlineDot");
      ViewBackgroundUtilsKt.setBackgroundOval$default(var6, ColorUtilsKt.getColorCompat(this, R.color.green_360), 0, 2, null);
      this.binding.itemInviteOnlineText.setText(var1);
      var6 = this.binding.itemInviteTotalMemberDot;
      kotlin.jvm.internal.q.g(this.binding.itemInviteTotalMemberDot, "itemInviteTotalMemberDot");
      var var8: Boolean;
      if (var2 != null && !kotlin.text.h.x(var2)) {
         var8 = 0;
      } else {
         var8 = 1;
      }

      if (var8 xor true) {
         var8 = 0;
      } else {
         var8 = 8;
      }

      label55: {
         var6.setVisibility(var8);
         val var14: ImageView = this.binding.itemInviteTotalMemberDot;
         kotlin.jvm.internal.q.g(this.binding.itemInviteTotalMemberDot, "itemInviteTotalMemberDot");
         ViewBackgroundUtilsKt.setBackgroundOval$default(var14, ColorUtilsKt.getColorCompat(this, R.color.primary_500), 0, 2, null);
         this.binding.itemInviteTotalMemberText.setText(var2);
         var6 = this.binding.itemInviteMemberContainer;
         kotlin.jvm.internal.q.g(this.binding.itemInviteMemberContainer, "itemInviteMemberContainer");
         if (var1 != null) {
            var10 = true;
            if (!kotlin.text.h.x(var1)) {
               break label55;
            }
         }

         if (var2 != null) {
            var10 = true;
            if (!kotlin.text.h.x(var2)) {
               break label55;
            }
         }

         var10 = false;
      }

      if (var10) {
         var8 = 0;
      } else {
         var8 = 8;
      }

      var6.setVisibility(var8);
   }

   public fun setSubtitle(subtitle: CharSequence?) {
      val var2: TextView = this.binding.itemInviteSubtitle;
      kotlin.jvm.internal.q.g(this.binding.itemInviteSubtitle, "itemInviteSubtitle");
      ViewUtilsKt.setOptionalText(var2, var1);
   }

   public fun setSubtitleColor(color: Int?) {
      if (var1 != null) {
         this.binding.itemInviteSubtitle.setTextColor(var1.intValue());
      }

      val var3: SimpleDraweeView = this.binding.itemInviteSubtitleIcon;
      kotlin.jvm.internal.q.g(this.binding.itemInviteSubtitleIcon, "itemInviteSubtitleIcon");
      ColorUtilsKt.setTintColor(var3, var1);
   }

   public fun setSubtitleIcon(subtitleIconUrl: String?) {
      val var2: SimpleDraweeView = this.binding.itemInviteSubtitleIcon;
      kotlin.jvm.internal.q.e(this.binding.itemInviteSubtitleIcon);
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
