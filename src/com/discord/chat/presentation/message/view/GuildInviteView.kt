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
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nGuildInviteView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuildInviteView.kt\ncom/discord/chat/presentation/message/view/GuildInviteView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n257#2,2:180\n257#2,2:182\n257#2,2:185\n257#2,2:187\n257#2,2:189\n257#2,2:191\n1#3:184\n*S KotlinDebug\n*F\n+ 1 GuildInviteView.kt\ncom/discord/chat/presentation/message/view/GuildInviteView\n*L\n80#1:180,2\n85#1:182,2\n133#1:185,2\n136#1:187,2\n140#1:189,2\n146#1:191,2\n*E\n"])
public class GuildInviteView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(var1, var2, var3) {
   private final val binding: GuildInviteViewBinding

   fun GuildInviteView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun GuildInviteView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var7: GuildInviteViewBinding = GuildInviteViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var7;
      var var4: TextView = var7.itemInviteHeader;
      var7.itemInviteHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryBold);
      var4 = var7.itemInviteTitle;
      var7.itemInviteTitle.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      SetTextSizeSpKt.setTextSizeSp(var4, 16.0F);
      val var5: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var var6: TextView = var7.itemInviteSubtitle;
      var7.itemInviteSubtitle.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      val var9: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryMedium);
      var6 = var7.itemInviteOnlineText;
      var7.itemInviteOnlineText.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var6, var5);
      var6 = var7.itemInviteTotalMemberText;
      var7.itemInviteTotalMemberText.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var6, var5);
      val var10: TextView = var7.itemInviteHubLink;
      var7.itemInviteHubLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      DiscordFontUtilsKt.setDiscordFont(var10, var9);
      var7.itemInviteJoinedButton.setBackgroundColor(ColorUtilsKt.getColorCompat(var1, R.color.brand));
   }

   public fun setBackgroundRectangleColor(color: Int?) {
      val var2: Int;
      if (var1 != null) {
         var2 = var1;
      } else {
         val var3: Context = this.getContext();
         var2 = ColorUtilsKt.getColorCompat(var3, ThemeManagerKt.getTheme().getColorRes(R.color.primary_100, R.color.primary_630));
      }

      ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, var2, SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
   }

   public fun setButtonBackgroundColor(color: Int?) {
      this.binding.itemInviteJoinedButton.setBackgroundColor(var1);
   }

   public fun setButtonText(text: CharSequence?) {
      val var4: DCDButton = this.binding.itemInviteJoinedButton;
      var var2: Boolean;
      if (var1 != null && !StringsKt.c0(var1)) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (!var2) {
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

   public fun setClickListeners(canBeAccepted: Boolean?, tapEmbedListener: OnClickListener?, tapAcceptListener: OnClickListener?) {
      val var4: ConstraintLayout = this.binding.itemBottomContainer;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested(var4, true, var2);
      val var5: DCDButton = this.binding.itemInviteJoinedButton;
      if (var1 == java.lang.Boolean.TRUE) {
         var5.setOnClickButtonListener(var3);
      } else {
         var5.setOnClickButtonListener(var2);
      }
   }

   public fun setGuildBadge(url: String?) {
      val var2: SimpleDraweeView = this.binding.itemGuildBadge;
      ReactAssetUtilsKt.setOptionalReactImageUrl(var2, var1);
   }

   public fun setGuildImage(url: String?, thumbnailText: String?, thumbnailBackgroundColor: Int?, thumbnailCornerRadius: Int?) {
      GuildView.configure$default(this.binding.itemInviteImage, var1, var2, var3, var4, null, 16, null);
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
      var var2: Boolean;
      if (var1 != null && var1.length() != 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (!var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      this.binding.itemInviteHeader.setText(var1);
   }

   public fun setInviteSplash(url: String?) {
      val var4: SimpleDraweeView = this.binding.itemInviteSplash;
      var var2: Boolean;
      if (var1 != null && var1.length() != 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (!var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      this.binding.itemInviteSplash.setImageURI(var1);
   }

   public fun setLoading(loading: Boolean) {
      DCDButton.setLoading$default(this.binding.itemInviteJoinedButton, var1, false, 2, null);
   }

   public fun setPresence(onlineText: CharSequence?, memberText: CharSequence?) {
      var var6: View = this.binding.itemInviteOnlineDot;
      var var3: Boolean;
      if (var1 != null && !StringsKt.c0(var1)) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      if (!var3) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var6.setVisibility(var3);
      var6 = this.binding.itemInviteOnlineDot;
      ViewBackgroundUtilsKt.setBackgroundOval$default(var6, ColorUtilsKt.getColorCompat(this, R.color.green_360), 0, 2, null);
      this.binding.itemInviteOnlineText.setText(var1);
      var6 = this.binding.itemInviteTotalMemberDot;
      var var8: Boolean;
      if (var2 != null && !StringsKt.c0(var2)) {
         var8 = 0;
      } else {
         var8 = 1;
      }

      if (!var8) {
         var8 = 0;
      } else {
         var8 = 8;
      }

      label55: {
         var6.setVisibility(var8);
         val var14: ImageView = this.binding.itemInviteTotalMemberDot;
         ViewBackgroundUtilsKt.setBackgroundOval$default(var14, ColorUtilsKt.getColorCompat(this, R.color.primary_500), 0, 2, null);
         this.binding.itemInviteTotalMemberText.setText(var2);
         var6 = this.binding.itemInviteMemberContainer;
         if (var1 != null) {
            var10 = true;
            if (!StringsKt.c0(var1)) {
               break label55;
            }
         }

         if (var2 != null) {
            var10 = true;
            if (!StringsKt.c0(var2)) {
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
      ViewUtilsKt.setOptionalText(var2, var1);
   }

   public fun setSubtitleColor(color: Int?) {
      if (var1 != null) {
         this.binding.itemInviteSubtitle.setTextColor(var1.intValue());
      }

      val var3: SimpleDraweeView = this.binding.itemInviteSubtitleIcon;
      ColorUtilsKt.setTintColor(var3, var1);
   }

   public fun setSubtitleIcon(subtitleIconUrl: String?) {
      val var2: SimpleDraweeView = this.binding.itemInviteSubtitleIcon;
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
