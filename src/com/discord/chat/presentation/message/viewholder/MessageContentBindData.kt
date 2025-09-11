package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

public data class MessageContentBindData(messageContentItem: MessageContentAccessory,
   onLinkClicked: (MessageId, LinkContentNode) -> Unit,
   onLinkLongClicked: (LinkContentNode) -> Unit,
   onTapChannel: (String, String?, String?) -> Unit,
   onLongPressChannel: (String, String?, String?, String?) -> Unit,
   onTapAttachmentLink: (String) -> Unit,
   onLongPressAttachmentLink: (String, String) -> Unit,
   onTapMention: (String?, String, String?, String?) -> Unit,
   onTapCommand: (CommandMentionContentNode) -> Unit,
   onLongPressCommand: (CommandMentionContentNode) -> Unit,
   onTapSpoiler: (MessagePartViewHolder) -> Unit,
   onTapTimestamp: (String) -> Unit,
   onTapInlineCode: (InlineCodeContentNode) -> Unit,
   onTapEmoji: (EmojiContentNode) -> Unit,
   onTapSeeMore: (MessageId) -> Unit,
   onTapSoundmoji: (SoundmojiContentNode) -> Unit
) {
   public final val messageContentItem: MessageContentAccessory
   public final val onLinkClicked: (MessageId, LinkContentNode) -> Unit
   public final val onLinkLongClicked: (LinkContentNode) -> Unit
   public final val onTapChannel: (String, String?, String?) -> Unit
   public final val onLongPressChannel: (String, String?, String?, String?) -> Unit
   public final val onTapAttachmentLink: (String) -> Unit
   public final val onLongPressAttachmentLink: (String, String) -> Unit
   public final val onTapMention: (String?, String, String?, String?) -> Unit
   public final val onTapCommand: (CommandMentionContentNode) -> Unit
   public final val onLongPressCommand: (CommandMentionContentNode) -> Unit
   public final val onTapSpoiler: (MessagePartViewHolder) -> Unit
   public final val onTapTimestamp: (String) -> Unit
   public final val onTapInlineCode: (InlineCodeContentNode) -> Unit
   public final val onTapEmoji: (EmojiContentNode) -> Unit
   public final val onTapSeeMore: (MessageId) -> Unit
   public final val onTapSoundmoji: (SoundmojiContentNode) -> Unit

   init {
      this.messageContentItem = var1;
      this.onLinkClicked = var2;
      this.onLinkLongClicked = var3;
      this.onTapChannel = var4;
      this.onLongPressChannel = var5;
      this.onTapAttachmentLink = var6;
      this.onLongPressAttachmentLink = var7;
      this.onTapMention = var8;
      this.onTapCommand = var9;
      this.onLongPressCommand = var10;
      this.onTapSpoiler = var11;
      this.onTapTimestamp = var12;
      this.onTapInlineCode = var13;
      this.onTapEmoji = var14;
      this.onTapSeeMore = var15;
      this.onTapSoundmoji = var16;
   }

   public operator fun component1(): MessageContentAccessory {
      return this.messageContentItem;
   }

   public operator fun component10(): (CommandMentionContentNode) -> Unit {
      return this.onLongPressCommand;
   }

   public operator fun component11(): (MessagePartViewHolder) -> Unit {
      return this.onTapSpoiler;
   }

   public operator fun component12(): (String) -> Unit {
      return this.onTapTimestamp;
   }

   public operator fun component13(): (InlineCodeContentNode) -> Unit {
      return this.onTapInlineCode;
   }

   public operator fun component14(): (EmojiContentNode) -> Unit {
      return this.onTapEmoji;
   }

   public operator fun component15(): (MessageId) -> Unit {
      return this.onTapSeeMore;
   }

   public operator fun component16(): (SoundmojiContentNode) -> Unit {
      return this.onTapSoundmoji;
   }

   public operator fun component2(): (MessageId, LinkContentNode) -> Unit {
      return this.onLinkClicked;
   }

   public operator fun component3(): (LinkContentNode) -> Unit {
      return this.onLinkLongClicked;
   }

   public operator fun component4(): (String, String?, String?) -> Unit {
      return this.onTapChannel;
   }

   public operator fun component5(): (String, String?, String?, String?) -> Unit {
      return this.onLongPressChannel;
   }

   public operator fun component6(): (String) -> Unit {
      return this.onTapAttachmentLink;
   }

   public operator fun component7(): (String, String) -> Unit {
      return this.onLongPressAttachmentLink;
   }

   public operator fun component8(): (String?, String, String?, String?) -> Unit {
      return this.onTapMention;
   }

   public operator fun component9(): (CommandMentionContentNode) -> Unit {
      return this.onTapCommand;
   }

   public fun copy(
      messageContentItem: MessageContentAccessory = var0.messageContentItem,
      onLinkClicked: (MessageId, LinkContentNode) -> Unit = var0.onLinkClicked,
      onLinkLongClicked: (LinkContentNode) -> Unit = var0.onLinkLongClicked,
      onTapChannel: (String, String?, String?) -> Unit = var0.onTapChannel,
      onLongPressChannel: (String, String?, String?, String?) -> Unit = var0.onLongPressChannel,
      onTapAttachmentLink: (String) -> Unit = var0.onTapAttachmentLink,
      onLongPressAttachmentLink: (String, String) -> Unit = var0.onLongPressAttachmentLink,
      onTapMention: (String?, String, String?, String?) -> Unit = var0.onTapMention,
      onTapCommand: (CommandMentionContentNode) -> Unit = var0.onTapCommand,
      onLongPressCommand: (CommandMentionContentNode) -> Unit = var0.onLongPressCommand,
      onTapSpoiler: (MessagePartViewHolder) -> Unit = var0.onTapSpoiler,
      onTapTimestamp: (String) -> Unit = var0.onTapTimestamp,
      onTapInlineCode: (InlineCodeContentNode) -> Unit = var0.onTapInlineCode,
      onTapEmoji: (EmojiContentNode) -> Unit = var0.onTapEmoji,
      onTapSeeMore: (MessageId) -> Unit = var0.onTapSeeMore,
      onTapSoundmoji: (SoundmojiContentNode) -> Unit = var0.onTapSoundmoji
   ): MessageContentBindData {
      return new MessageContentBindData(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageContentBindData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.messageContentItem == var1.messageContentItem)) {
            return false;
         } else if (!(this.onLinkClicked == var1.onLinkClicked)) {
            return false;
         } else if (!(this.onLinkLongClicked == var1.onLinkLongClicked)) {
            return false;
         } else if (!(this.onTapChannel == var1.onTapChannel)) {
            return false;
         } else if (!(this.onLongPressChannel == var1.onLongPressChannel)) {
            return false;
         } else if (!(this.onTapAttachmentLink == var1.onTapAttachmentLink)) {
            return false;
         } else if (!(this.onLongPressAttachmentLink == var1.onLongPressAttachmentLink)) {
            return false;
         } else if (!(this.onTapMention == var1.onTapMention)) {
            return false;
         } else if (!(this.onTapCommand == var1.onTapCommand)) {
            return false;
         } else if (!(this.onLongPressCommand == var1.onLongPressCommand)) {
            return false;
         } else if (!(this.onTapSpoiler == var1.onTapSpoiler)) {
            return false;
         } else if (!(this.onTapTimestamp == var1.onTapTimestamp)) {
            return false;
         } else if (!(this.onTapInlineCode == var1.onTapInlineCode)) {
            return false;
         } else if (!(this.onTapEmoji == var1.onTapEmoji)) {
            return false;
         } else if (!(this.onTapSeeMore == var1.onTapSeeMore)) {
            return false;
         } else {
            return this.onTapSoundmoji == var1.onTapSoundmoji;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           (
                                                                                                                                    this.messageContentItem
                                                                                                                                             .hashCode()
                                                                                                                                          * 31
                                                                                                                                       + this.onLinkClicked
                                                                                                                                          .hashCode()
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + this.onLinkLongClicked
                                                                                                                                 .hashCode()
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + this.onTapChannel.hashCode()
                                                                                                               )
                                                                                                               * 31
                                                                                                            + this.onLongPressChannel.hashCode()
                                                                                                      )
                                                                                                      * 31
                                                                                                   + this.onTapAttachmentLink.hashCode()
                                                                                             )
                                                                                             * 31
                                                                                          + this.onLongPressAttachmentLink.hashCode()
                                                                                    )
                                                                                    * 31
                                                                                 + this.onTapMention.hashCode()
                                                                           )
                                                                           * 31
                                                                        + this.onTapCommand.hashCode()
                                                                  )
                                                                  * 31
                                                               + this.onLongPressCommand.hashCode()
                                                         )
                                                         * 31
                                                      + this.onTapSpoiler.hashCode()
                                                )
                                                * 31
                                             + this.onTapTimestamp.hashCode()
                                       )
                                       * 31
                                    + this.onTapInlineCode.hashCode()
                              )
                              * 31
                           + this.onTapEmoji.hashCode()
                     )
                     * 31
                  + this.onTapSeeMore.hashCode()
            )
            * 31
         + this.onTapSoundmoji.hashCode();
   }

   public override fun toString(): String {
      val var4: MessageContentAccessory = this.messageContentItem;
      val var14: Function2 = this.onLinkClicked;
      val var9: Function1 = this.onLinkLongClicked;
      val var2: Function3 = this.onTapChannel;
      val var1: Function4 = this.onLongPressChannel;
      val var12: Function1 = this.onTapAttachmentLink;
      val var10: Function2 = this.onLongPressAttachmentLink;
      val var6: Function4 = this.onTapMention;
      val var7: Function1 = this.onTapCommand;
      val var8: Function1 = this.onLongPressCommand;
      val var5: Function1 = this.onTapSpoiler;
      val var17: Function1 = this.onTapTimestamp;
      val var16: Function1 = this.onTapInlineCode;
      val var15: Function1 = this.onTapEmoji;
      val var11: Function1 = this.onTapSeeMore;
      val var3: Function1 = this.onTapSoundmoji;
      val var13: StringBuilder = new StringBuilder();
      var13.append("MessageContentBindData(messageContentItem=");
      var13.append(var4);
      var13.append(", onLinkClicked=");
      var13.append(var14);
      var13.append(", onLinkLongClicked=");
      var13.append(var9);
      var13.append(", onTapChannel=");
      var13.append(var2);
      var13.append(", onLongPressChannel=");
      var13.append(var1);
      var13.append(", onTapAttachmentLink=");
      var13.append(var12);
      var13.append(", onLongPressAttachmentLink=");
      var13.append(var10);
      var13.append(", onTapMention=");
      var13.append(var6);
      var13.append(", onTapCommand=");
      var13.append(var7);
      var13.append(", onLongPressCommand=");
      var13.append(var8);
      var13.append(", onTapSpoiler=");
      var13.append(var5);
      var13.append(", onTapTimestamp=");
      var13.append(var17);
      var13.append(", onTapInlineCode=");
      var13.append(var16);
      var13.append(", onTapEmoji=");
      var13.append(var15);
      var13.append(", onTapSeeMore=");
      var13.append(var11);
      var13.append(", onTapSoundmoji=");
      var13.append(var3);
      var13.append(")");
      return var13.toString();
   }
}
