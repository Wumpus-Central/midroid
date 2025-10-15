package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.EmbeddedActivityInviteMessageAccessory
import com.discord.chat.presentation.message.view.EmbeddedActivityInviteView
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

public class EmbeddedActivityInviteViewHolder(embeddedActivityInviteView: EmbeddedActivityInviteView, eventHandler: ChatEventHandler) : MessagePartViewHolder(
      var1
   ) {
   private final val embeddedActivityInviteView: EmbeddedActivityInviteView
   public final val eventHandler: ChatEventHandler

   init {
      this.embeddedActivityInviteView = var1;
      this.eventHandler = var2;
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$0`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$1`(var0: EmbeddedActivityInviteViewHolder, var1: EmbeddedActivityInviteMessageAccessory, var2: View) {
      var0.eventHandler.onTapInviteEmbed-AFFcxXc(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex(), null, null);
   }

   public fun bind(embeddedActivityInviteAccessory: EmbeddedActivityInviteMessageAccessory) {
      val var4: EmbeddedActivityInviteEmbedImpl = var1.getEmbeddedActivityInviteEmbed();
      val var12: EmbeddedActivityInviteView = this.embeddedActivityInviteView;
      this.embeddedActivityInviteView.setSplash(var4.getSplashUrl(), var1.getConstrainedWidth());
      var12.setTitleText(var4.getTitleText());
      var12.setHeaderText(var4.getHeaderText());
      var12.setSubtitleText-Tu_1QLM(
         var4.getStructurableSubtitleText(),
         var1.getMessageId-3Eiw7ao(),
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
               (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
            }
         },
         new Function1<LinkContentNode, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
            }

            public final void invoke(LinkContentNode var1) {
               (super.receiver as ChatEventHandler).onLinkLongClicked(var1);
            }
         },
         new Function3(this.eventHandler) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
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
               (super.receiver as ChatEventHandler).onLongPressChannel(var1, var2, var3, var4);
            }
         },
         new Function1<java.lang.String, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapAttachmentLink", "onTapAttachmentLink(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapAttachmentLink(var1);
            }
         },
         new Function2<java.lang.String, java.lang.String, Unit>(this.eventHandler) {
            {
               super(2, var1, ChatEventHandler::class.java, "onLongPressAttachmentLink", "onLongPressAttachmentLink(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2) {
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
               (super.receiver as ChatEventHandler).onTapMention(var1, var2, var3, var4);
            }
         },
         new Function1<CommandMentionContentNode, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
            }

            public final void invoke(CommandMentionContentNode var1) {
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
               (super.receiver as ChatEventHandler).onLongPressCommand(var1);
            }
         },
         new j(),
         new Function1<java.lang.String, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapTimestamp", "onTapTimestamp(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapTimestamp(var1);
            }
         },
         new Function1<InlineCodeContentNode, Unit>(this.eventHandler) {
            {
               super(
                  1, var1, ChatEventHandler::class.java, "onTapInlineCode", "onTapInlineCode(Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;)V", 0
               );
            }

            public final void invoke(InlineCodeContentNode var1) {
               (super.receiver as ChatEventHandler).onTapInlineCode(var1);
            }
         },
         new Function1<EmojiContentNode, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
            }

            public final void invoke(EmojiContentNode var1) {
               (super.receiver as ChatEventHandler).onTapEmoji(var1);
            }
         },
         new Function1<MessageId, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapSeeMore-1xi1bu0(var1);
            }
         },
         new Function1<SoundmojiContentNode, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSoundmoji", "onTapSoundmoji(Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;)V", 0);
            }

            public final void invoke(SoundmojiContentNode var1) {
               (super.receiver as ChatEventHandler).onTapSoundmoji(var1);
            }
         }
      );
      var12.setNoParticipantsText(var4.getNoParticipantsText());
      var12.setLaunchButton(var4.getAcceptLabelText(), var4.getAcceptLabelBackgroundColor(), var4.getCtaEnabled());
      var12.setAvatarUris(var4.getParticipantAvatarUris());
      var12.setOnLaunchButtonClickListener(new k(this, var1));
   }
}
