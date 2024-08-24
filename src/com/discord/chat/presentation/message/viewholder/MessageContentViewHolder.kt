package com.discord.chat.presentation.message.viewholder

import android.content.Context
import android.text.TextPaint
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.textutils.LinkStyle
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.primitives.MessageId
import com.discord.react.FontManager
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2

public class MessageContentViewHolder(messageContentView: MessageContentView) : MessagePartViewHolder {
   public final val messageContentView: MessageContentView

   init {
      kotlin.jvm.internal.r.h(var1, "messageContentView");
      super(var1, null);
      this.messageContentView = var1;
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
      onTapEmoji: (EmojiContentNode) -> Unit,
      onTapSeeMore: (MessageId) -> Unit
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
      kotlin.jvm.internal.r.h(var13, "onTapEmoji");
      kotlin.jvm.internal.r.h(var14, "onTapSeeMore");
      this.messageContentView.setTextColor(var1.getMessageTextColor());
      DiscordFontUtilsKt.setDiscordFont(this.messageContentView, var1.getMessageFont());
      SetTextSizeSpKt.setTextSizeSp(this.messageContentView, (float)var1.getTextSizeSp());
      val var24: TextPaint = this.messageContentView.getPaint();
      kotlin.jvm.internal.r.g(var24, "messageContentView.paint");
      val var25: FontManager = FontManager.INSTANCE;
      val var23: Context = this.messageContentView.getContext();
      kotlin.jvm.internal.r.g(var23, "messageContentView.context");
      this.messageContentView
         .setMessageContent-2ZcwkLU(
            var1.getMessageContent(),
            var1.getMessageId-3Eiw7ao(),
            var1.getShouldAnimateEmoji(),
            var1.getShouldShowLinkDecorations(),
            var1.getShouldShowRoleDot(),
            var1.getShouldShowRoleOnName(),
            new Function1<LinkContentNode, Unit>(var2, var1) {
               final MessageContentAccessory $messageContentItem;
               final Function2<MessageId, LinkContentNode, Unit> $onLinkClicked;

               {
                  super(1);
                  this.$onLinkClicked = var1;
                  this.$messageContentItem = var2;
               }

               public final void invoke(LinkContentNode var1) {
                  kotlin.jvm.internal.r.h(var1, "node");
                  this.$onLinkClicked.invoke(MessageId.box-impl(this.$messageContentItem.getMessageId-3Eiw7ao()), var1);
               }
            },
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
            new Function1<LinkContentNode, LinkStyle>(var1) {
               final MessageContentAccessory $messageContentItem;

               {
                  super(1);
                  this.$messageContentItem = var1;
               }

               public final LinkStyle invoke(LinkContentNode var1) {
                  kotlin.jvm.internal.r.h(var1, "it");
                  val var2: DiscordFont;
                  if (this.$messageContentItem.getBoldLinkText()) {
                     var2 = DiscordFont.PrimarySemibold;
                  } else {
                     var2 = DiscordFont.PrimaryNormal;
                  }

                  return new LinkStyle(var2, this.$messageContentItem.getLinkColor(), null, null, 12, null);
               }
            },
            var1.getBottomSpacingPx(),
            var1.getConstrainedWidth(),
            var1.isForwardedContent(),
            var1.getEditedLabel(),
            var1.getEditedLabelTextColor(),
            var1.getTruncation(),
            var1.getTheme(),
            TextUtilsKt.getBaselineHeightForFontSizePx(var24, var25.getScaledSpToPx(16, var23))
         );
   }
}
