package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.PorterDuffColorFilter
import android.graphics.PorterDuff.Mode
import android.text.TextUtils.TruncateAt
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.R
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.databinding.GuildEventInviteViewBinding
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2

public class GuildEventInviteView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: GuildEventInviteViewBinding

   fun GuildEventInviteView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun GuildEventInviteView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      val var6: GuildEventInviteViewBinding = GuildEventInviteViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var6, "inflate(LayoutInflater.from(context), this)");
      this.binding = var6;
      var var4: TextView = var6.headerText;
      var6.headerText.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      kotlin.jvm.internal.r.g(var4, "lambda$6$lambda$0");
      val var8: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      val var13: ConstraintLayout = var6.badgeContainer;
      kotlin.jvm.internal.r.g(var6.badgeContainer, "badgeContainer");
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         var13, ThemeManagerKt.getTheme().getBackgroundTertiary(), SizeUtilsKt.getDpToPx(1000), null, 0, 12, null
      );
      var6.badgeText.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      var4 = var6.titleText;
      kotlin.jvm.internal.r.g(var6.titleText, "lambda$6$lambda$1");
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryExtraBold);
      var4.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      SetTextSizeSpKt.setTextSizeSp(var4, 18.0F);
      val var5: MessageContentView = var6.descriptionText;
      kotlin.jvm.internal.r.g(var6.descriptionText, "lambda$6$lambda$2");
      val var15: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      var5.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
      val var16: TextView = var6.guildName;
      kotlin.jvm.internal.r.g(var6.guildName, "lambda$6$lambda$3");
      DiscordFontUtilsKt.setDiscordFont(var16, var8);
      var16.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      SetTextSizeSpKt.setTextSizeSp(var16, 14.0F);
      val var9: TextView = var6.channelName;
      kotlin.jvm.internal.r.g(var6.channelName, "lambda$6$lambda$4");
      DiscordFontUtilsKt.setDiscordFont(var9, var15);
      var9.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      SetTextSizeSpKt.setTextSizeSp(var9, 12.0F);
      val var10: DCDButton = var6.acceptButton;
      var6.acceptButton.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      var10.setMaxLines(1);
      var10.ellipsize(TruncateAt.END);
      val var11: SimpleDraweeView = var6.secondaryButton;
      kotlin.jvm.internal.r.g(var6.secondaryButton, "secondaryButton");
      ViewBackgroundUtilsKt.setBackgroundRectangle(
         var11,
         ThemeManagerKt.getTheme().getBackgroundAccent(),
         SizeUtilsKt.getDpToPx(4),
         ThemeManagerKt.getTheme().getBackgroundAccent(),
         SizeUtilsKt.getDpToPx(1)
      );
      val var7: SimpleDraweeView = var6.guildIcon;
      kotlin.jvm.internal.r.g(var6.guildIcon, "guildIcon");
      ViewClippingUtilsKt.clipToRoundedRectangle(var7, SizeUtilsKt.getDpToPx(8));
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this, ThemeManagerKt.getTheme().getBackgroundSecondary(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null
      );
      var3 = SizeUtilsKt.getDpToPx(12);
      this.setPadding(var3, var3, var3, var3);
   }

   public fun setAcceptButton(iconUrl: String?, text: String?, color: Int?, borderColor: Int?, backgroundColor: Int?, listener: OnClickListener?) {
      val var7: DCDButton = this.binding.acceptButton;
      if (var1 != null) {
         this.binding.acceptButton.setIcon(var1, SizeUtilsKt.getDpToPx(24));
      }

      this.binding.acceptButton.setText(var2);
      var7.setTextColor(var3);
      var7.setBackgroundColor(var5);
      var7.setBorderColor(var4);
      var7.setOnClickButtonListener(var6);
   }

   public fun setBadge(iconUrl: String?, count: String?) {
      val var4: GuildEventInviteViewBinding = this.binding;
      val var3: SimpleDraweeView = this.binding.badgeIcon;
      kotlin.jvm.internal.r.g(this.binding.badgeIcon, "badgeIcon");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var3, var1);
      var4.badgeText.setText(var2);
   }

   public fun setChannel(iconUrl: String?, text: String?) {
      val var3: GuildEventInviteViewBinding = this.binding;
      val var4: SimpleDraweeView = this.binding.channelIcon;
      kotlin.jvm.internal.r.g(this.binding.channelIcon, "channelIcon");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var4, var1);
      val var5: TextView = var3.channelName;
      kotlin.jvm.internal.r.g(var3.channelName, "channelName");
      ViewUtilsKt.setOptionalText(var5, var2);
      var3.channelIcon.setColorFilter(new PorterDuffColorFilter(ThemeManagerKt.getTheme().getHeaderSecondary(), Mode.SRC_ATOP));
   }

   public fun setCreatorAvatar(iconUrl: String?) {
      val var2: SimpleDraweeView = this.binding.creatorAvatar;
      kotlin.jvm.internal.r.g(this.binding.creatorAvatar, "binding.creatorAvatar");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var2, var1);
   }

   public fun setDescription(
      description: StructurableText?,
      messageId: MessageId,
      shouldAnimateEmoji: Boolean,
      shouldShowLinkDecorations: Boolean,
      shouldShowRoleDot: Boolean,
      shouldShowRoleOnName: Boolean,
      onTapLink: (MessageId, LinkContentNode) -> Unit,
      onLongTapLink: (LinkContentNode) -> Unit,
      onTapChannel: (String, String?, String?) -> Unit,
      onLongPressChannel: (String, String?, String?, String?) -> Unit,
      onTapAttachmentLink: (String) -> Unit,
      onLongPressAttachmentLink: (String, String) -> Unit,
      onTapMention: (String?, String, String?, String?) -> Unit,
      onTapCommand: (CommandMentionContentNode) -> Unit,
      onLongPressCommand: (CommandMentionContentNode) -> Unit,
      onTapSpoiler: () -> Unit,
      onTapTimestamp: (String) -> Unit,
      onTapEmoji: (EmojiContentNode) -> Unit,
      onTapSeeMore: (MessageId) -> Unit
   ) {
      kotlin.jvm.internal.r.h(var2, "messageId");
      kotlin.jvm.internal.r.h(var7, "onTapLink");
      kotlin.jvm.internal.r.h(var8, "onLongTapLink");
      kotlin.jvm.internal.r.h(var9, "onTapChannel");
      kotlin.jvm.internal.r.h(var10, "onLongPressChannel");
      kotlin.jvm.internal.r.h(var11, "onTapAttachmentLink");
      kotlin.jvm.internal.r.h(var12, "onLongPressAttachmentLink");
      kotlin.jvm.internal.r.h(var13, "onTapMention");
      kotlin.jvm.internal.r.h(var14, "onTapCommand");
      kotlin.jvm.internal.r.h(var15, "onLongPressCommand");
      kotlin.jvm.internal.r.h(var16, "onTapSpoiler");
      kotlin.jvm.internal.r.h(var17, "onTapTimestamp");
      kotlin.jvm.internal.r.h(var18, "onTapEmoji");
      kotlin.jvm.internal.r.h(var19, "onTapSeeMore");
      if (var1 != null) {
         val var22: MessageContentView = this.binding.descriptionText;
         kotlin.jvm.internal.r.g(this.binding.descriptionText, "binding.descriptionText");
         MessageContentView.setMessageContent-2ZcwkLU$default(
            var22,
            var1,
            var2,
            var3,
            var4,
            var5,
            var6,
            new Function1<LinkContentNode, Unit>(var7, var2) {
               final java.lang.String $messageId;
               final Function2<MessageId, LinkContentNode, Unit> $onTapLink;

               {
                  super(1);
                  this.$onTapLink = var1;
                  this.$messageId = var2;
               }

               public final void invoke(LinkContentNode var1) {
                  kotlin.jvm.internal.r.h(var1, "node");
                  this.$onTapLink.invoke(MessageId.box-impl(this.$messageId), var1);
               }
            },
            var8,
            var9,
            var10,
            var11,
            var12,
            var13,
            var14,
            var15,
            var16,
            var17,
            var18,
            var19,
            null,
            this.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing),
            0,
            false,
            null,
            null,
            null,
            null,
            null,
            260571136,
            null
         );
      }

      val var23: MessageContentView = this.binding.descriptionText;
      kotlin.jvm.internal.r.g(this.binding.descriptionText, "binding.descriptionText");
      var var20: Boolean;
      if (var1 != null) {
         var20 = 1;
      } else {
         var20 = 0;
      }

      if (var20) {
         var20 = 0;
      } else {
         var20 = 8;
      }

      var23.setVisibility(var20);
   }

   public fun setGuild(name: String?, iconUrl: String?) {
      val var5: GuildEventInviteViewBinding = this.binding;
      val var6: TextView = this.binding.guildName;
      kotlin.jvm.internal.r.g(this.binding.guildName, "guildName");
      ViewUtilsKt.setOptionalText(var6, var1);
      val var7: SimpleDraweeView = var5.guildIcon;
      kotlin.jvm.internal.r.g(var5.guildIcon, "guildIcon");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var7, var2);
      val var8: SimpleDraweeView = var5.guildIcon;
      kotlin.jvm.internal.r.g(var5.guildIcon, "guildIcon");
      var var3: Boolean;
      if (var2 != null) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      if (var3) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var8.setVisibility(var3);
   }

   public fun setHeader(iconUrl: String?, text: String, color: Int) {
      kotlin.jvm.internal.r.h(var2, "text");
      val var5: GuildEventInviteViewBinding = this.binding;
      val var4: SimpleDraweeView = this.binding.headerIcon;
      kotlin.jvm.internal.r.g(this.binding.headerIcon, "headerIcon");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var4, var1);
      var5.headerText.setText(var2);
      var5.headerIcon.setColorFilter(new PorterDuffColorFilter(var3, Mode.SRC_ATOP));
   }

   public fun setSecondaryButton(iconUrl: String?, listener: OnClickListener?) {
      val var3: SimpleDraweeView = this.binding.secondaryButton;
      kotlin.jvm.internal.r.g(this.binding.secondaryButton, "setSecondaryButton$lambda$15");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var3, var1);
      var3.setOnClickListener(var2);
   }

   public fun setTitle(text: String?, color: Int?): Unit? {
      val var4: TextView = this.binding.titleText;
      kotlin.jvm.internal.r.g(this.binding.titleText, "titleText");
      ViewUtilsKt.setOptionalText(var4, var1);
      val var5: Unit;
      if (var2 != null) {
         this.binding.titleText.setTextColor(var2.intValue());
         var5 = Unit.a;
      } else {
         var5 = null;
      }

      return var5;
   }
}
