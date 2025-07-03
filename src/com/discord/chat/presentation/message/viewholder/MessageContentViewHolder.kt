package com.discord.chat.presentation.message.viewholder

import android.content.Context
import android.text.TextPaint
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.textutils.LinkStyle
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.primitives.MessageId
import com.discord.react.FontManager
import kotlin.jvm.functions.Function2

public class MessageContentViewHolder(messageContentView: MessageContentView) : MessagePartViewHolder {
   public final val messageContentView: MessageContentView

   init {
      kotlin.jvm.internal.r.h(var1, "messageContentView");
      super(var1, null);
      this.messageContentView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: Function2, var1: MessageContentAccessory, var2: LinkContentNode): Unit {
      kotlin.jvm.internal.r.h(var2, "node");
      var0.invoke(MessageId.box-impl(var1.getMessageId-3Eiw7ao()), var2);
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$1`(var0: MessageContentAccessory, var1: LinkContentNode): LinkStyle {
      kotlin.jvm.internal.r.h(var1, "it");
      val var2: DiscordFont;
      if (var0.getBoldLinkText()) {
         var2 = DiscordFont.PrimarySemibold;
      } else {
         var2 = DiscordFont.PrimaryNormal;
      }

      return new LinkStyle(var2, var0.getLinkColor(), null, null, 12, null);
   }

   public fun bind(
      messageContentItem: MessageContentAccessory,
      onLinkClicked: (MessageId, LinkContentNode) -> Unit,
      onLinkLongClicked: (LinkContentNode) -> Unit,
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
      kotlin.jvm.internal.r.h(var1, "messageContentItem");
      kotlin.jvm.internal.r.h(var2, "onLinkClicked");
      kotlin.jvm.internal.r.h(var3, "onLinkLongClicked");
      kotlin.jvm.internal.r.h(var4, "onTapChannel");
      kotlin.jvm.internal.r.h(var5, "onLongPressChannel");
      kotlin.jvm.internal.r.h(var6, "onTapAttachmentLink");
      kotlin.jvm.internal.r.h(var7, "onLongPressAttachmentLink");
      kotlin.jvm.internal.r.h(var8, "onTapMention");
      kotlin.jvm.internal.r.h(var9, "onTapCommand");
      kotlin.jvm.internal.r.h(var10, "onLongPressCommand");
      kotlin.jvm.internal.r.h(var11, "onTapSpoiler");
      kotlin.jvm.internal.r.h(var12, "onTapTimestamp");
      kotlin.jvm.internal.r.h(var13, "onTapInlineCode");
      kotlin.jvm.internal.r.h(var14, "onTapEmoji");
      kotlin.jvm.internal.r.h(var15, "onTapSeeMore");
      kotlin.jvm.internal.r.h(var16, "onTapSoundmoji");
      this.messageContentView.setTextColor(var1.getMessageTextColor());
      DiscordFontUtilsKt.setDiscordFont(this.messageContentView, var1.getMessageFont());
      SetTextSizeSpKt.setTextSizeSp(this.messageContentView, (float)var1.getTextSizeSp());
      val var26: TextPaint = this.messageContentView.getPaint();
      kotlin.jvm.internal.r.g(var26, "getPaint(...)");
      val var27: FontManager = FontManager.INSTANCE;
      val var25: Context = this.messageContentView.getContext();
      kotlin.jvm.internal.r.g(var25, "getContext(...)");
      this.messageContentView
         .setMessageContent-AeCz66Y(
            var1.getMessageContent(),
            var1.getMessageId-3Eiw7ao(),
            var1.getShouldAnimateEmoji(),
            var1.getShouldShowLinkDecorations(),
            var1.getShouldShowRoleDot(),
            var1.getShouldShowRoleOnName(),
            new B(var2, var1),
            var3,
            var4,
            var5,
            var6,
            var7,
            var8,
            var9,
            var10,
            var11,
            var12,
            var13,
            var14,
            var15,
            var16,
            new C(var1),
            var1.getBottomSpacingPx(),
            var1.getConstrainedWidth(),
            var1.isForwardedContent(),
            var1.getEditedLabel(),
            var1.getEditedLabelTextColor(),
            var1.getTruncation(),
            var1.getTheme(),
            TextUtilsKt.getBaselineHeightForFontSizePx(var26, var27.getScaledSpToPx(16, var25))
         );
   }
}
