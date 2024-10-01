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
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

public class EmbedViewHolder(embedView: EmbedView) : MessagePartViewHolder {
   private final val embedView: EmbedView

   init {
      kotlin.jvm.internal.q.h(var1, "embedView");
      super(var1, null);
      this.embedView = var1;
   }

   public fun bind(
      eventHandler: ChatEventHandler,
      accessory: EmbedMessageAccessory,
      maxHeightPx: Int,
      radiusPx: Int,
      onTapSpoiler: () -> Unit,
      spoilerConfig: SpoilerConfig?,
      onMediaClicked: (Double?, Int?) -> Unit,
      onMediaLongClicked: OnLongClickListener?,
      portal: Double
   ) {
      kotlin.jvm.internal.q.h(var1, "eventHandler");
      kotlin.jvm.internal.q.h(var2, "accessory");
      kotlin.jvm.internal.q.h(var5, "onTapSpoiler");
      kotlin.jvm.internal.q.h(var7, "onMediaClicked");
      val var17: java.lang.String = var2.getEmbed().getObscure();
      var var11: Boolean;
      if (var17 != null && !kotlin.text.h.x(var17)) {
         var11 = 0;
      } else {
         var11 = 1;
      }

      val var14: Boolean = (boolean)(var11 xor true);
      val var18: EmbedView = this.embedView;
      val var21: Embed = var2.getEmbed();
      var11 = var2.getIndex();
      val var15: Long = var2.getChannelId-o4g7jtM();
      val var19: java.lang.String = var2.getMessageId-3Eiw7ao();
      val var12: Int = var2.getConstrainedWidth();
      val var13: Boolean;
      if (var2.getShouldAutoPlayGifs() && !var14) {
         var13 = true;
      } else {
         var13 = false;
      }

      var18.setEmbed-UEgMTIk(
         var21,
         var11,
         var15,
         var19,
         var12,
         var3,
         var4,
         var13,
         var2.getShouldAnimateEmoji(),
         var2.getShouldShowLinkDecorations(),
         var2.getShouldShowRoleDot(),
         var2.getShouldShowRoleOnName(),
         new Function3(var1) {
            {
               super(
                  3, var1, ChatEventHandler::class.java, "onLinkClicked", "onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0
               );
            }

            public final void invoke_u7_MRrM/* $VF was: invoke-u7_MRrM*/(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.q.h(var1, "p0");
               kotlin.jvm.internal.q.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLinkClicked-u7_MRrM(var1, var2, var3);
            }
         },
         new Function3(var1) {
            {
               super(
                  3, var1, ChatEventHandler::class.java, "onLinkClicked", "onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0
               );
            }

            public final void invoke_u7_MRrM/* $VF was: invoke-u7_MRrM*/(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.q.h(var1, "p0");
               kotlin.jvm.internal.q.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLinkClicked-u7_MRrM(var1, var2, var3);
            }
         },
         var7,
         var8,
         new Function2(var1) {
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
         new Function1(var1) {
            {
               super(1, var1, ChatEventHandler::class.java, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
            }

            public final void invoke(LinkContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLinkLongClicked(var1);
            }
         },
         new Function1(var1) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCopyText", "onTapCopyText(Ljava/lang/CharSequence;)V", 0);
            }

            public final void invoke(java.lang.CharSequence var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapCopyText(var1);
            }
         },
         var5,
         new Function1(var1) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
            }

            public final void invoke(EmojiContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapEmoji(var1);
            }
         },
         new Function3(var1) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapChannel(var1, var2, var3);
            }
         },
         new Function4(var1) {
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
         new Function1(var1) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
            }

            public final void invoke(CommandMentionContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapCommand(var1);
            }
         },
         new Function4(var1) {
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

            public final void invoke_JjTCmh4/* $VF was: invoke-JjTCmh4*/(long var1, java.lang.String var3, java.lang.String var4, Integer var5) {
               kotlin.jvm.internal.q.h(var3, "p1");
               kotlin.jvm.internal.q.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapInlineForward-JjTCmh4(var1, var3, var4, var5);
            }
         },
         var6,
         var9,
         var14,
         var2.isForwardedContent(),
         var2.isShowingInlineForward(),
         var2.getUseOldForwardIcon()
      );
   }
}
