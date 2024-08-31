package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.EmbeddedActivityInviteMessageAccessory
import com.discord.chat.presentation.message.view.EmbeddedActivityInviteView
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

public class EmbeddedActivityInviteViewHolder(embeddedActivityInviteView: EmbeddedActivityInviteView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   private final val embeddedActivityInviteView: EmbeddedActivityInviteView
   public final val eventHandler: ChatEventHandler

   init {
      kotlin.jvm.internal.q.h(var1, "embeddedActivityInviteView");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      super(var1, null);
      this.embeddedActivityInviteView = var1;
      this.eventHandler = var2;
   }

   @JvmStatic
   fun `bind$lambda$1$lambda$0`(var0: EmbeddedActivityInviteViewHolder, var1: EmbeddedActivityInviteMessageAccessory, var2: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "$embeddedActivityInviteAccessory");
      var0.eventHandler.onTapInviteEmbed-AFFcxXc(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex(), null, null);
   }

   public fun bind(embeddedActivityInviteAccessory: EmbeddedActivityInviteMessageAccessory) {
      kotlin.jvm.internal.q.h(var1, "embeddedActivityInviteAccessory");
      val var3: EmbeddedActivityInviteEmbedImpl = var1.getEmbeddedActivityInviteEmbed();
      val var13: EmbeddedActivityInviteView = this.embeddedActivityInviteView;
      this.embeddedActivityInviteView.setSplash(var3.getSplashUrl(), var1.getConstrainedWidth());
      var13.setTitleText(var3.getTitleText());
      var13.setHeaderText(var3.getHeaderText());
      var13.setSubtitleText-oCLp7l4(
         var3.getStructurableSubtitleText(),
         var1.getMessageId-3Eiw7ao(),
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
         <unrepresentable>.INSTANCE,
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
      var13.setNoParticipantsText(var3.getNoParticipantsText());
      var13.setLaunchButton(var3.getAcceptLabelText(), var3.getAcceptLabelBackgroundColor(), var3.getCtaEnabled());
      var13.setAvatarUris(var3.getParticipantAvatarUris());
      var13.setOnLaunchButtonClickListener(new k(this, var1));
   }
}
