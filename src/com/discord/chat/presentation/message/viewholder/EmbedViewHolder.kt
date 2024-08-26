package com.discord.chat.presentation.message.viewholder

import android.view.View.OnLongClickListener
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.embed.Embed
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory
import com.discord.chat.presentation.message.view.EmbedView
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

public class EmbedViewHolder(embedView: EmbedView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   private final val embedView: EmbedView
   private final val eventHandler: ChatEventHandler

   init {
      kotlin.jvm.internal.r.h(var1, "embedView");
      kotlin.jvm.internal.r.h(var2, "eventHandler");
      super(var1, null);
      this.embedView = var1;
      this.eventHandler = var2;
   }

   public fun bind(
      accessory: EmbedMessageAccessory,
      maxHeightPx: Int,
      radiusPx: Int,
      onTapSpoiler: () -> Unit,
      spoilerConfig: SpoilerConfig?,
      onMediaClicked: (Double?, Int?) -> Unit,
      onMediaLongClicked: OnLongClickListener?,
      portal: Double
   ) {
      kotlin.jvm.internal.r.h(var1, "accessory");
      kotlin.jvm.internal.r.h(var4, "onTapSpoiler");
      kotlin.jvm.internal.r.h(var6, "onMediaClicked");
      val var16: java.lang.String = var1.getEmbed().getObscure();
      var var10: Boolean;
      if (var16 != null && !kotlin.text.f.x(var16)) {
         var10 = 0;
      } else {
         var10 = 1;
      }

      val var15: Boolean = (boolean)(var10 xor true);
      val var20: EmbedView = this.embedView;
      val var17: Embed = var1.getEmbed();
      var10 = var1.getIndex();
      val var12: Long = var1.getChannelId_o4g7jtM();
      val var18: java.lang.String = var1.getMessageId_3Eiw7ao();
      val var11: Int = var1.getConstrainedWidth();
      val var14: Boolean;
      if (var1.getShouldAutoPlayGifs() && !var15) {
         var14 = true;
      } else {
         var14 = false;
      }

      var20.setEmbed_UEgMTIk(
         var17,
         var10,
         var12,
         var18,
         var11,
         var2,
         var3,
         var14,
         var1.getShouldAnimateEmoji(),
         var1.getShouldShowLinkDecorations(),
         var1.getShouldShowRoleDot(),
         var1.getShouldShowRoleOnName(),
         new Function3<MessageId, java.lang.String, java.lang.String, Unit>(this.eventHandler) {
            {
               super(
                  3, var1, ChatEventHandler::class.java, "onLinkClicked", "onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0
               );
            }

            public final void invoke_u7_MRrM(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.r.h(var1, "p0");
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLinkClicked_u7_MRrM(var1, var2, var3);
            }
         },
         new Function3<MessageId, java.lang.String, java.lang.String, Unit>(this.eventHandler) {
            {
               super(
                  3, var1, ChatEventHandler::class.java, "onLinkClicked", "onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0
               );
            }

            public final void invoke_u7_MRrM(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.r.h(var1, "p0");
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLinkClicked_u7_MRrM(var1, var2, var3);
            }
         },
         var6,
         var7,
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

            public final void invoke_ntcYbpo(java.lang.String var1, LinkContentNode var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLinkClicked_ntcYbpo(var1, var2);
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
         new Function1<java.lang.CharSequence, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCopyText", "onTapCopyText(Ljava/lang/CharSequence;)V", 0);
            }

            public final void invoke(java.lang.CharSequence var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapCopyText(var1);
            }
         },
         var4,
         new Function1<EmojiContentNode, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
            }

            public final void invoke(EmojiContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapEmoji(var1);
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
         new Function4<ChannelId, MessageId, java.lang.String, Integer, Unit>(this.eventHandler) {
            {
               super(
                  4,
                  var1,
                  ChatEventHandler::class.java,
                  "onTapInlineForward",
                  "onTapInlineForward-JjTCmh4(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V",
                  0
               );
            }

            public final void invoke_JjTCmh4(long var1, java.lang.String var3, java.lang.String var4, Integer var5) {
               kotlin.jvm.internal.r.h(var3, "p1");
               kotlin.jvm.internal.r.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapInlineForward_JjTCmh4(var1, var3, var4, var5);
            }
         },
         var5,
         var8,
         var15,
         var1.isForwardedContent(),
         var1.isShowingInlineForward(),
         var1.getUseOldForwardIcon()
      );
   }
}
