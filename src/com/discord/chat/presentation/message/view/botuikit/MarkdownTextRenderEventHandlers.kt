package com.discord.chat.presentation.message.view.botuikit

import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4
import kotlin.jvm.internal.r

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
   onTapEmoji: (EmojiContentNode) -> Unit
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
   public final val onTapEmoji: (EmojiContentNode) -> Unit

   init {
      r.h(var1, "onLinkClicked");
      r.h(var2, "onLinkLongClicked");
      r.h(var3, "onTapChannel");
      r.h(var4, "onLongPressChannel");
      r.h(var5, "onTapAttachmentLink");
      r.h(var6, "onLongPressAttachmentLink");
      r.h(var7, "onTapMention");
      r.h(var8, "onTapCommand");
      r.h(var9, "onLongPressCommand");
      r.h(var10, "onTapSpoiler");
      r.h(var11, "onTapTimestamp");
      r.h(var12, "onTapEmoji");
      super();
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
      this.onTapEmoji = var12;
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

   public operator fun component12(): (EmojiContentNode) -> Unit {
      return this.onTapEmoji;
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
      onTapEmoji: (EmojiContentNode) -> Unit = var0.onTapEmoji
   ): MarkdownTextRenderEventHandlers {
      r.h(var1, "onLinkClicked");
      r.h(var2, "onLinkLongClicked");
      r.h(var3, "onTapChannel");
      r.h(var4, "onLongPressChannel");
      r.h(var5, "onTapAttachmentLink");
      r.h(var6, "onLongPressAttachmentLink");
      r.h(var7, "onTapMention");
      r.h(var8, "onTapCommand");
      r.h(var9, "onLongPressCommand");
      r.h(var10, "onTapSpoiler");
      r.h(var11, "onTapTimestamp");
      r.h(var12, "onTapEmoji");
      return new MarkdownTextRenderEventHandlers(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MarkdownTextRenderEventHandlers) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.onLinkClicked, var1.onLinkClicked)) {
            return false;
         } else if (!r.c(this.onLinkLongClicked, var1.onLinkLongClicked)) {
            return false;
         } else if (!r.c(this.onTapChannel, var1.onTapChannel)) {
            return false;
         } else if (!r.c(this.onLongPressChannel, var1.onLongPressChannel)) {
            return false;
         } else if (!r.c(this.onTapAttachmentLink, var1.onTapAttachmentLink)) {
            return false;
         } else if (!r.c(this.onLongPressAttachmentLink, var1.onLongPressAttachmentLink)) {
            return false;
         } else if (!r.c(this.onTapMention, var1.onTapMention)) {
            return false;
         } else if (!r.c(this.onTapCommand, var1.onTapCommand)) {
            return false;
         } else if (!r.c(this.onLongPressCommand, var1.onLongPressCommand)) {
            return false;
         } else if (!r.c(this.onTapSpoiler, var1.onTapSpoiler)) {
            return false;
         } else if (!r.c(this.onTapTimestamp, var1.onTapTimestamp)) {
            return false;
         } else {
            return r.c(this.onTapEmoji, var1.onTapEmoji);
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
                                                                                       (this.onLinkClicked.hashCode() * 31 + this.onLinkLongClicked.hashCode())
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
         + this.onTapEmoji.hashCode();
   }

   public override fun toString(): String {
      val var6: Function1 = this.onLinkClicked;
      val var5: Function1 = this.onLinkLongClicked;
      val var10: Function3 = this.onTapChannel;
      val var2: Function4 = this.onLongPressChannel;
      val var3: Function1 = this.onTapAttachmentLink;
      val var4: Function2 = this.onLongPressAttachmentLink;
      val var13: Function4 = this.onTapMention;
      val var1: Function1 = this.onTapCommand;
      val var7: Function1 = this.onLongPressCommand;
      val var9: Function0 = this.onTapSpoiler;
      val var8: Function1 = this.onTapTimestamp;
      val var12: Function1 = this.onTapEmoji;
      val var11: StringBuilder = new StringBuilder();
      var11.append("MarkdownTextRenderEventHandlers(onLinkClicked=");
      var11.append(var6);
      var11.append(", onLinkLongClicked=");
      var11.append(var5);
      var11.append(", onTapChannel=");
      var11.append(var10);
      var11.append(", onLongPressChannel=");
      var11.append(var2);
      var11.append(", onTapAttachmentLink=");
      var11.append(var3);
      var11.append(", onLongPressAttachmentLink=");
      var11.append(var4);
      var11.append(", onTapMention=");
      var11.append(var13);
      var11.append(", onTapCommand=");
      var11.append(var1);
      var11.append(", onLongPressCommand=");
      var11.append(var7);
      var11.append(", onTapSpoiler=");
      var11.append(var9);
      var11.append(", onTapTimestamp=");
      var11.append(var8);
      var11.append(", onTapEmoji=");
      var11.append(var12);
      var11.append(")");
      return var11.toString();
   }
}
