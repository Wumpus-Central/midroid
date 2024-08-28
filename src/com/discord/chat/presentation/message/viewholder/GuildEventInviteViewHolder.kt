package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.GuildEventInviteMessageAccessory
import com.discord.chat.presentation.message.view.GuildEventInviteView
import kotlin.jvm.functions.Function0
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
   fun `bind$lambda$3$lambda$2$lambda$0`(var0: GuildEventInviteViewHolder, var1: GuildEventInviteMessageAccessory, var2: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "$inviteAccessory");
      var0.eventHandler.onTapInviteEmbed-AFFcxXc(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex(), java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
   }

   @JvmStatic
   fun `bind$lambda$3$lambda$2$lambda$1`(var0: GuildEventInviteViewHolder, var1: GuildEventInviteMessageAccessory, var2: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "$inviteAccessory");
      var0.eventHandler.onTapInviteEmbed-AFFcxXc(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex(), java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
   }

   public fun bind(inviteAccessory: GuildEventInviteMessageAccessory) {
      kotlin.jvm.internal.q.h(var1, "inviteAccessory");
      val var6: GuildEventInviteEmbedImpl = var1.getInvite();
      val var18: GuildEventInviteView = this.guildEventInviteView;
      this.guildEventInviteView.setHeader(var6.getHeaderIcon(), var6.getHeaderText(), var6.getHeaderColor());
      var18.setCreatorAvatar(var6.getCreatorAvatar());
      var18.setBadge(var6.getBadgeIcon(), var6.getBadgeCount());
      var18.setTitle(var6.getTitleText(), var6.getTitleColor());
      var18.setDescription-nMRbdFE(
         var6.getContent(),
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
         new Function0(this) {
            final GuildEventInviteViewHolder this$0;

            {
               super(0);
               this.this$0 = var1;
            }

            public final void invoke() {
               GuildEventInviteViewHolder.access$getOnTapSpoiler$p(this.this$0).invoke(this.this$0);
            }
         },
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
         }
      );
      var18.setGuild(var6.getGuildName(), var6.getGuildIcon());
      var18.setChannel(var6.getChannelIcon(), var6.getChannelName());
      var18.setAcceptButton(
         var6.getAcceptLabelIcon(),
         var6.getAcceptLabelText(),
         var6.getAcceptLabelColor(),
         var6.getAcceptLabelBorderColor(),
         var6.getAcceptLabelBackgroundColor(),
         new n(this, var1)
      );
      var18.setSecondaryButton(var6.getSecondaryActionIcon(), new o(this, var1));
   }
}
