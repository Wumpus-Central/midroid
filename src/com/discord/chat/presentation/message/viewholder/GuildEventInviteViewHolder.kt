package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.GuildEventInviteMessageAccessory
import com.discord.chat.presentation.message.view.GuildEventInviteView
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

public class GuildEventInviteViewHolder(guildEventInviteView: GuildEventInviteView,
      eventHandler: ChatEventHandler,
      onTapSpoiler: (MessagePartViewHolder) -> Unit
   )
   : MessagePartViewHolder {
   private final val guildEventInviteView: GuildEventInviteView
   private final val eventHandler: ChatEventHandler
   private final val onTapSpoiler: (MessagePartViewHolder) -> Unit

   init {
      kotlin.jvm.internal.q.h(var1, "guildEventInviteView");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      kotlin.jvm.internal.q.h(var3, "onTapSpoiler");
      super(var1, null);
      this.guildEventInviteView = var1;
      this.eventHandler = var2;
      this.onTapSpoiler = var3;
   }

   @JvmStatic
   fun `bind$lambda$4$lambda$3$lambda$0`(var0: GuildEventInviteViewHolder): Unit {
      var0.onTapSpoiler.invoke(var0);
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$4$lambda$3$lambda$1`(var0: GuildEventInviteViewHolder, var1: GuildEventInviteMessageAccessory, var2: View) {
      var0.eventHandler.onTapInviteEmbed-AFFcxXc(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex(), java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
   }

   @JvmStatic
   fun `bind$lambda$4$lambda$3$lambda$2`(var0: GuildEventInviteViewHolder, var1: GuildEventInviteMessageAccessory, var2: View) {
      var0.eventHandler.onTapInviteEmbed-AFFcxXc(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex(), java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
   }

   public fun bind(inviteAccessory: GuildEventInviteMessageAccessory) {
      kotlin.jvm.internal.q.h(var1, "inviteAccessory");
      val var16: GuildEventInviteEmbedImpl = var1.getInvite();
      val var11: GuildEventInviteView = this.guildEventInviteView;
      this.guildEventInviteView.setHeader(var16.getHeaderIcon(), var16.getHeaderText(), var16.getHeaderColor());
      var11.setCreatorAvatar(var16.getCreatorAvatar());
      var11.setBadge(var16.getBadgeIcon(), var16.getBadgeCount());
      var11.setTitle(var16.getTitleText(), var16.getTitleColor());
      var11.setDescription-iRUqyQU(
         var16.getContent(),
         var1.getMessageId-3Eiw7ao(),
         var1.getShouldAnimateEmoji(),
         var1.getShouldShowLinkDecorations(),
         var1.getShouldShowRoleDot(),
         var1.getShouldShowRoleOnName(),
         new Function2(this.eventHandler) {
            {
               super(
                  2,
                  var1,
                  ChatEventHandler::class.java,
                  "onLinkClicked",
                  "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V",
                  0
               );
            }

            public final void invoke_ntcYbpo/* $VF was: invoke-ntcYbpo*/(java.lang.String var1, LinkContentNode var2) {
               kotlin.jvm.internal.q.h(var1, "p0");
               kotlin.jvm.internal.q.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
            }
         },
         new Function1(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
            }

            public final void invoke(LinkContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLinkLongClicked(var1);
            }
         },
         new Function3(this.eventHandler) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapChannel(var1, var2, var3);
            }
         },
         new Function4(this.eventHandler) {
            {
               super(
                  4,
                  var1,
                  ChatEventHandler::class.java,
                  "onLongPressChannel",
                  "onLongPressChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
                  0
               );
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLongPressChannel(var1, var2, var3, var4);
            }
         },
         new Function1(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapAttachmentLink", "onTapAttachmentLink(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAttachmentLink(var1);
            }
         },
         new Function2(this.eventHandler) {
            {
               super(2, var1, ChatEventHandler::class.java, "onLongPressAttachmentLink", "onLongPressAttachmentLink(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2) {
               kotlin.jvm.internal.q.h(var1, "p0");
               kotlin.jvm.internal.q.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLongPressAttachmentLink(var1, var2);
            }
         },
         new Function4(this.eventHandler) {
            {
               super(
                  4,
                  var1,
                  ChatEventHandler::class.java,
                  "onTapMention",
                  "onTapMention(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
                  0
               );
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.q.h(var2, "p1");
               (super.receiver as ChatEventHandler).onTapMention(var1, var2, var3, var4);
            }
         },
         new Function1(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
            }

            public final void invoke(CommandMentionContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapCommand(var1);
            }
         },
         new Function1(this.eventHandler) {
            {
               super(
                  1,
                  var1,
                  ChatEventHandler::class.java,
                  "onLongPressCommand",
                  "onLongPressCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V",
                  0
               );
            }

            public final void invoke(CommandMentionContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLongPressCommand(var1);
            }
         },
         new n(this),
         new Function1(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapTimestamp", "onTapTimestamp(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapTimestamp(var1);
            }
         },
         new Function1(this.eventHandler) {
            {
               super(
                  1, var1, ChatEventHandler::class.java, "onTapInlineCode", "onTapInlineCode(Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;)V", 0
               );
            }

            public final void invoke(InlineCodeContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapInlineCode(var1);
            }
         },
         new Function1(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
            }

            public final void invoke(EmojiContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapEmoji(var1);
            }
         },
         new Function1(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapSeeMore-1xi1bu0(var1);
            }
         },
         new Function1(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSoundmoji", "onTapSoundmoji(Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;)V", 0);
            }

            public final void invoke(SoundmojiContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapSoundmoji(var1);
            }
         }
      );
      var11.setGuild(var16.getGuildName(), var16.getGuildIcon());
      var11.setChannel(var16.getChannelIcon(), var16.getChannelName());
      var11.setAcceptButton(
         var16.getAcceptLabelIcon(),
         var16.getAcceptLabelText(),
         var16.getAcceptLabelColor(),
         var16.getAcceptLabelBorderColor(),
         var16.getAcceptLabelBackgroundColor(),
         new o(this, var1)
      );
      var11.setSecondaryButton(var16.getSecondaryActionIcon(), new p(this, var1));
   }
}
