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
import com.discord.chat.R.dimen
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
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
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nGuildEventInviteView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuildEventInviteView.kt\ncom/discord/chat/presentation/message/view/GuildEventInviteView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n176#2,2:213\n257#2,2:216\n257#2,2:218\n1#3:215\n*S KotlinDebug\n*F\n+ 1 GuildEventInviteView.kt\ncom/discord/chat/presentation/message/view/GuildEventInviteView\n*L\n88#1:213,2\n167#1:216,2\n174#1:218,2\n*E\n"])
public class GuildEventInviteView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(var1, var2, var3) {
   private final val binding: GuildEventInviteViewBinding

   fun GuildEventInviteView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun GuildEventInviteView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var6: GuildEventInviteViewBinding = GuildEventInviteViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var6;
      var var4: TextView = var6.headerText;
      var6.headerText.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      val var8: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      val var13: ConstraintLayout = var6.badgeContainer;
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         var13, ThemeManagerKt.getTheme().getBackgroundTertiary(), SizeUtilsKt.getDpToPx(1000), null, 0, 12, null
      );
      var6.badgeText.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      var4 = var6.titleText;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryExtraBold);
      var4.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      SetTextSizeSpKt.setTextSizeSp(var4, 18.0F);
      val var5: MessageContentView = var6.descriptionText;
      val var15: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      var5.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
      val var16: TextView = var6.guildName;
      DiscordFontUtilsKt.setDiscordFont(var16, var8);
      var16.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      SetTextSizeSpKt.setTextSizeSp(var16, 14.0F);
      val var9: TextView = var6.channelName;
      DiscordFontUtilsKt.setDiscordFont(var9, var15);
      var9.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      SetTextSizeSpKt.setTextSizeSp(var9, 12.0F);
      val var10: DCDButton = var6.acceptButton;
      var6.acceptButton.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      var10.setMaxLines(1);
      var10.ellipsize(TruncateAt.END);
      val var11: SimpleDraweeView = var6.secondaryButton;
      ViewBackgroundUtilsKt.setBackgroundRectangle(
         var11,
         ThemeManagerKt.getTheme().getBackgroundAccent(),
         SizeUtilsKt.getDpToPx(4),
         ThemeManagerKt.getTheme().getBackgroundAccent(),
         SizeUtilsKt.getDpToPx(1)
      );
      val var7: SimpleDraweeView = var6.guildIcon;
      ViewClippingUtilsKt.clipToRoundedRectangle(var7, SizeUtilsKt.getDpToPx(8));
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this, ThemeManagerKt.getTheme().getBackgroundSecondary(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null
      );
      var3 = SizeUtilsKt.getDpToPx(12);
      this.setPadding(var3, var3, var3, var3);
   }

   @JvmStatic
   fun `setDescription_iRUqyQU$lambda$12$lambda$11`(var0: Function2, var1: java.lang.String, var2: LinkContentNode): Unit {
      var0.invoke(MessageId.box-impl(var1), var2);
      return Unit.a;
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
      val var3: GuildEventInviteViewBinding = this.binding;
      val var4: SimpleDraweeView = this.binding.badgeIcon;
      ReactAssetUtilsKt.setOptionalReactImageUrl(var4, var1);
      var3.badgeText.setText(var2);
   }

   public fun setChannel(iconUrl: String?, text: String?) {
      val var3: GuildEventInviteViewBinding = this.binding;
      val var4: SimpleDraweeView = this.binding.channelIcon;
      ReactAssetUtilsKt.setOptionalReactImageUrl(var4, var1);
      val var5: TextView = var3.channelName;
      ViewUtilsKt.setOptionalText(var5, var2);
      var3.channelIcon.setColorFilter(new PorterDuffColorFilter(ThemeManagerKt.getTheme().getHeaderSecondary(), Mode.SRC_ATOP));
   }

   public fun setCreatorAvatar(iconUrl: String?) {
      val var2: SimpleDraweeView = this.binding.creatorAvatar;
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
      onTapInlineCode: (InlineCodeContentNode) -> Unit,
      onTapEmoji: (EmojiContentNode) -> Unit,
      onTapSeeMore: (MessageId) -> Unit,
      onTapSoundmoji: (SoundmojiContentNode) -> Unit
   ) {
      if (var1 != null) {
         MessageContentView.setMessageContent-AeCz66Y$default(
            this.binding.descriptionText,
            var1,
            var2,
            var3,
            var4,
            var5,
            var6,
            new j1(var7, var2),
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
            var20,
            var21,
            null,
            this.getResources().getDimensionPixelSize(dimen.message_accessories_vertical_spacing),
            0,
            false,
            null,
            null,
            null,
            null,
            null,
            1042284544,
            null
         );
      }

      val var24: MessageContentView = this.binding.descriptionText;
      var var22: Boolean;
      if (var1 != null) {
         var22 = 1;
      } else {
         var22 = 0;
      }

      if (var22) {
         var22 = 0;
      } else {
         var22 = 8;
      }

      var24.setVisibility(var22);
   }

   public fun setGuild(name: String?, iconUrl: String?) {
      val var5: GuildEventInviteViewBinding = this.binding;
      val var6: TextView = this.binding.guildName;
      ViewUtilsKt.setOptionalText(var6, var1);
      val var7: SimpleDraweeView = var5.guildIcon;
      ReactAssetUtilsKt.setOptionalReactImageUrl(var7, var2);
      val var8: SimpleDraweeView = var5.guildIcon;
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
      val var4: GuildEventInviteViewBinding = this.binding;
      val var5: SimpleDraweeView = this.binding.headerIcon;
      ReactAssetUtilsKt.setOptionalReactImageUrl(var5, var1);
      var4.headerText.setText(var2);
      var4.headerIcon.setColorFilter(new PorterDuffColorFilter(var3, Mode.SRC_ATOP));
   }

   public fun setSecondaryButton(iconUrl: String?, listener: OnClickListener?) {
      val var3: SimpleDraweeView = this.binding.secondaryButton;
      ReactAssetUtilsKt.setOptionalReactImageUrl(var3, var1);
      var3.setOnClickListener(var2);
   }

   public fun setTitle(text: String?, color: Int?): Unit? {
      val var4: TextView = this.binding.titleText;
      ViewUtilsKt.setOptionalText(var4, var1);
      if (var2 != null) {
         this.binding.titleText.setTextColor(var2.intValue());
         return Unit.a;
      } else {
         return null;
      }
   }
}
