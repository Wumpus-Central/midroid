package com.discord.chat.presentation.message.view.botuikit

import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

public data class MarkdownTextRenderEventHandlers(onLinkClicked: (LinkContentNode) -> Unit,
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
   onTapSoundmoji: (SoundmojiContentNode) -> Unit
) {
   public final val onLinkClicked: (LinkContentNode) -> Unit
   public final val onLinkLongClicked: (LinkContentNode) -> Unit
   public final val onTapChannel: (String, String?, String?) -> Unit
   public final val onLongPressChannel: (String, String?, String?, String?) -> Unit
   public final val onTapAttachmentLink: (String) -> Unit
   public final val onLongPressAttachmentLink: (String, String) -> Unit
   public final val onTapMention: (String?, String, String?, String?) -> Unit
   public final val onTapCommand: (CommandMentionContentNode) -> Unit
   public final val onLongPressCommand: (CommandMentionContentNode) -> Unit
   public final val onTapSpoiler: () -> Unit
   public final val onTapTimestamp: (String) -> Unit
   public final val onTapInlineCode: (InlineCodeContentNode) -> Unit
   public final val onTapEmoji: (EmojiContentNode) -> Unit
   public final val onTapSoundmoji: (SoundmojiContentNode) -> Unit

   init {
      this.onLinkClicked = var1;
      this.onLinkLongClicked = var2;
      this.onTapChannel = var3;
      this.onLongPressChannel = var4;
      this.onTapAttachmentLink = var5;
      this.onLongPressAttachmentLink = var6;
      this.onTapMention = var7;
      this.onTapCommand = var8;
      this.onLongPressCommand = var9;
      this.onTapSpoiler = var10;
      this.onTapTimestamp = var11;
      this.onTapInlineCode = var12;
      this.onTapEmoji = var13;
      this.onTapSoundmoji = var14;
   }

   public operator fun component1(): (LinkContentNode) -> Unit {
      return this.onLinkClicked;
   }

   public operator fun component10(): () -> Unit {
      return this.onTapSpoiler;
   }

   public operator fun component11(): (String) -> Unit {
      return this.onTapTimestamp;
   }

   public operator fun component12(): (InlineCodeContentNode) -> Unit {
      return this.onTapInlineCode;
   }

   public operator fun component13(): (EmojiContentNode) -> Unit {
      return this.onTapEmoji;
   }

   public operator fun component14(): (SoundmojiContentNode) -> Unit {
      return this.onTapSoundmoji;
   }

   public operator fun component2(): (LinkContentNode) -> Unit {
      return this.onLinkLongClicked;
   }

   public operator fun component3(): (String, String?, String?) -> Unit {
      return this.onTapChannel;
   }

   public operator fun component4(): (String, String?, String?, String?) -> Unit {
      return this.onLongPressChannel;
   }

   public operator fun component5(): (String) -> Unit {
      return this.onTapAttachmentLink;
   }

   public operator fun component6(): (String, String) -> Unit {
      return this.onLongPressAttachmentLink;
   }

   public operator fun component7(): (String?, String, String?, String?) -> Unit {
      return this.onTapMention;
   }

   public operator fun component8(): (CommandMentionContentNode) -> Unit {
      return this.onTapCommand;
   }

   public operator fun component9(): (CommandMentionContentNode) -> Unit {
      return this.onLongPressCommand;
   }

   public fun copy(
      onLinkClicked: (LinkContentNode) -> Unit = var0.onLinkClicked,
      onLinkLongClicked: (LinkContentNode) -> Unit = var0.onLinkLongClicked,
      onTapChannel: (String, String?, String?) -> Unit = var0.onTapChannel,
      onLongPressChannel: (String, String?, String?, String?) -> Unit = var0.onLongPressChannel,
      onTapAttachmentLink: (String) -> Unit = var0.onTapAttachmentLink,
      onLongPressAttachmentLink: (String, String) -> Unit = var0.onLongPressAttachmentLink,
      onTapMention: (String?, String, String?, String?) -> Unit = var0.onTapMention,
      onTapCommand: (CommandMentionContentNode) -> Unit = var0.onTapCommand,
      onLongPressCommand: (CommandMentionContentNode) -> Unit = var0.onLongPressCommand,
      onTapSpoiler: () -> Unit = var0.onTapSpoiler,
      onTapTimestamp: (String) -> Unit = var0.onTapTimestamp,
      onTapInlineCode: (InlineCodeContentNode) -> Unit = var0.onTapInlineCode,
      onTapEmoji: (EmojiContentNode) -> Unit = var0.onTapEmoji,
      onTapSoundmoji: (SoundmojiContentNode) -> Unit = var0.onTapSoundmoji
   ): MarkdownTextRenderEventHandlers {
      return new MarkdownTextRenderEventHandlers(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MarkdownTextRenderEventHandlers) {
         return false;
      } else {
         var1 = var1;
         if (!(this.onLinkClicked == var1.onLinkClicked)) {
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
                                                                                                                  this.onLinkClicked.hashCode() * 31
                                                                                                                     + this.onLinkLongClicked.hashCode()
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
         + this.onTapSoundmoji.hashCode();
   }

   public override fun toString(): String {
      val var10: Function1 = this.onLinkClicked;
      val var12: Function1 = this.onLinkLongClicked;
      val var13: Function3 = this.onTapChannel;
      val var14: Function4 = this.onLongPressChannel;
      val var8: Function1 = this.onTapAttachmentLink;
      val var7: Function2 = this.onLongPressAttachmentLink;
      val var5: Function4 = this.onTapMention;
      val var15: Function1 = this.onTapCommand;
      val var3: Function1 = this.onLongPressCommand;
      val var4: Function0 = this.onTapSpoiler;
      val var11: Function1 = this.onTapTimestamp;
      val var9: Function1 = this.onTapInlineCode;
      val var1: Function1 = this.onTapEmoji;
      val var2: Function1 = this.onTapSoundmoji;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MarkdownTextRenderEventHandlers(onLinkClicked=");
      var6.append(var10);
      var6.append(", onLinkLongClicked=");
      var6.append(var12);
      var6.append(", onTapChannel=");
      var6.append(var13);
      var6.append(", onLongPressChannel=");
      var6.append(var14);
      var6.append(", onTapAttachmentLink=");
      var6.append(var8);
      var6.append(", onLongPressAttachmentLink=");
      var6.append(var7);
      var6.append(", onTapMention=");
      var6.append(var5);
      var6.append(", onTapCommand=");
      var6.append(var15);
      var6.append(", onLongPressCommand=");
      var6.append(var3);
      var6.append(", onTapSpoiler=");
      var6.append(var4);
      var6.append(", onTapTimestamp=");
      var6.append(var11);
      var6.append(", onTapInlineCode=");
      var6.append(var9);
      var6.append(", onTapEmoji=");
      var6.append(var1);
      var6.append(", onTapSoundmoji=");
      var6.append(var2);
      var6.append(")");
      return var6.toString();
   }
}
