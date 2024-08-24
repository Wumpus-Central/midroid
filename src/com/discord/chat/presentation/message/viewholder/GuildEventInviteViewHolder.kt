package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.GuildEventInviteMessageAccessory
import com.discord.chat.presentation.message.view.GuildEventInviteView
import com.discord.primitives.MessageId
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
      kotlin.jvm.internal.r.h(var1, "guildEventInviteView");
      kotlin.jvm.internal.r.h(var2, "eventHandler");
      kotlin.jvm.internal.r.h(var3, "onTapSpoiler");
      super(var1, null);
      this.guildEventInviteView = var1;
      this.eventHandler = var2;
      this.onTapSpoiler = var3;
   }

   @JvmStatic
   fun `bind$lambda$3$lambda$2$lambda$0`(var0: GuildEventInviteViewHolder, var1: GuildEventInviteMessageAccessory, var2: View) {
      kotlin.jvm.internal.r.h(var0, "this$0");
      kotlin.jvm.internal.r.h(var1, "$inviteAccessory");
      var0.eventHandler.onTapInviteEmbed-AFFcxXc(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex(), java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
   }

   @JvmStatic
   fun `bind$lambda$3$lambda$2$lambda$1`(var0: GuildEventInviteViewHolder, var1: GuildEventInviteMessageAccessory, var2: View) {
      kotlin.jvm.internal.r.h(var0, "this$0");
      kotlin.jvm.internal.r.h(var1, "$inviteAccessory");
      var0.eventHandler.onTapInviteEmbed-AFFcxXc(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex(), java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
   }

   public fun bind(inviteAccessory: GuildEventInviteMessageAccessory) {
      kotlin.jvm.internal.r.h(var1, "inviteAccessory");
      val var19: GuildEventInviteEmbedImpl = var1.getInvite();
      val var17: GuildEventInviteView = this.guildEventInviteView;
      this.guildEventInviteView.setHeader(var19.getHeaderIcon(), var19.getHeaderText(), var19.getHeaderColor());
      var17.setCreatorAvatar(var19.getCreatorAvatar());
      var17.setBadge(var19.getBadgeIcon(), var19.getBadgeCount());
      var17.setTitle(var19.getTitleText(), var19.getTitleColor());
      var17.setDescription-nMRbdFE(
         var19.getContent(),
         var1.getMessageId-3Eiw7ao(),
         var1.getShouldAnimateEmoji(),
         var1.getShouldShowLinkDecorations(),
         var1.getShouldShowRoleDot(),
         var1.getShouldShowRoleOnName(),
         new Function2<MessageId, LinkContentNode, Unit>(this.eventHandler) {
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
               kotlin.jvm.internal.r.h(var1, "p0");
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
            }
         },
         new Function1<LinkContentNode, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
            }

            public final void invoke(LinkContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLinkLongClicked(var1);
            }
         },
         new Function3<java.lang.String, java.lang.String, java.lang.String, Unit>(this.eventHandler) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapChannel(var1, var2, var3);
            }
         },
         new Function4<java.lang.String, java.lang.String, java.lang.String, java.lang.String, Unit>(this.eventHandler) {
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
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLongPressChannel(var1, var2, var3, var4);
            }
         },
         new Function1<java.lang.String, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapAttachmentLink", "onTapAttachmentLink(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAttachmentLink(var1);
            }
         },
         new Function2<java.lang.String, java.lang.String, Unit>(this.eventHandler) {
            {
               super(2, var1, ChatEventHandler::class.java, "onLongPressAttachmentLink", "onLongPressAttachmentLink(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLongPressAttachmentLink(var1, var2);
            }
         },
         new Function4<java.lang.String, java.lang.String, java.lang.String, java.lang.String, Unit>(this.eventHandler) {
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
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onTapMention(var1, var2, var3, var4);
            }
         },
         new Function1<CommandMentionContentNode, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
            }

            public final void invoke(CommandMentionContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapCommand(var1);
            }
         },
         new Function1<CommandMentionContentNode, Unit>(this.eventHandler) {
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
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLongPressCommand(var1);
            }
         },
         new Function0<Unit>(this) {
            final GuildEventInviteViewHolder this$0;

            {
               super(0);
               this.this$0 = var1;
            }

            public final void invoke() {
               GuildEventInviteViewHolder.access$getOnTapSpoiler$p(this.this$0).invoke(this.this$0);
            }
         },
         new Function1<java.lang.String, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapTimestamp", "onTapTimestamp(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapTimestamp(var1);
            }
         },
         new Function1<EmojiContentNode, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
            }

            public final void invoke(EmojiContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapEmoji(var1);
            }
         },
         new Function1<MessageId, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapSeeMore-1xi1bu0(var1);
            }
         }
      );
      var17.setGuild(var19.getGuildName(), var19.getGuildIcon());
      var17.setChannel(var19.getChannelIcon(), var19.getChannelName());
      var17.setAcceptButton(
         var19.getAcceptLabelIcon(),
         var19.getAcceptLabelText(),
         var19.getAcceptLabelColor(),
         var19.getAcceptLabelBorderColor(),
         var19.getAcceptLabelBackgroundColor(),
         new m(this, var1)
      );
      var17.setSecondaryButton(var19.getSecondaryActionIcon(), new n(this, var1));
   }
}
