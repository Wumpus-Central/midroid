package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory
import com.discord.chat.presentation.message.view.botuikit.ComponentActionEventHandlers
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.GeneralEventHandlers
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderEventHandlers
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions
import com.discord.chat.presentation.message.view.botuikit.MediaItemEventHandlers
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsView
import com.discord.chat.presentation.message.view.botuikit.WidthInfo
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

public class MessageComponentsViewHolder(messageComponentsView: MessageComponentsView) : MessagePartViewHolder {
   private final val messageComponentsView: MessageComponentsView

   init {
      kotlin.jvm.internal.q.h(var1, "messageComponentsView");
      super(var1, null);
      this.messageComponentsView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: ChatEventHandler, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
      kotlin.jvm.internal.q.h(var2, "url");
      kotlin.jvm.internal.q.h(var3, "title");
      var0.onLinkClicked-u7_MRrM(var1, var2, var3);
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$1`(var0: ChatEventHandler, var1: java.lang.String, var2: LinkContentNode): Unit {
      kotlin.jvm.internal.q.h(var2, "node");
      var0.onLinkClicked-ntcYbpo(var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$2`(var0: ChatEventHandler, var1: java.lang.String, var2: java.lang.String): Unit {
      kotlin.jvm.internal.q.h(var2, "componentId");
      var0.onTapButtonActionComponent-ntcYbpo(var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$3`(var0: ChatEventHandler, var1: java.lang.String, var2: java.lang.String): Unit {
      kotlin.jvm.internal.q.h(var2, "url");
      var0.onLinkClicked-u7_MRrM(var1, var2, "");
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$4`(var0: ChatEventHandler, var1: java.lang.String, var2: java.lang.String): Unit {
      kotlin.jvm.internal.q.h(var2, "componentId");
      var0.onTapSelectActionComponent-ntcYbpo(var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$5`(var0: ChatEventHandler, var1: java.lang.String, var2: UserId, var3: java.lang.String, var4: java.lang.String): Unit {
      kotlin.jvm.internal.q.h(var3, "contentId");
      kotlin.jvm.internal.q.h(var4, "tappedElement");
      var0.onTapContentInventoryEntryEmbed-tsfjtEQ(var1, var2.unbox-impl(), var3, var4);
      return Unit.a;
   }

   public fun bind(
      componentsComponentsAccessory: MessageComponentsAccessory,
      componentProvider: ComponentProvider?,
      onMediaItemClicked: (View, String, Int?, Double?) -> Unit,
      onMediaItemLongClicked: ((String, Int?) -> Unit)?,
      onTapSpoiler: () -> Unit,
      onTapObscureToggle: (Boolean) -> Unit,
      eventHandler: ChatEventHandler
   ) {
      kotlin.jvm.internal.q.h(var1, "componentsComponentsAccessory");
      kotlin.jvm.internal.q.h(var3, "onMediaItemClicked");
      kotlin.jvm.internal.q.h(var5, "onTapSpoiler");
      kotlin.jvm.internal.q.h(var6, "onTapObscureToggle");
      kotlin.jvm.internal.q.h(var7, "eventHandler");
      val var12: Message = var1.getMessage();
      val var15: java.lang.String = var1.getMessageId-3Eiw7ao();
      var var8: Int = var1.getConstrainedWidth();
      var var9: Boolean;
      if (var12.getForwardInfo() != null) {
         var9 = true;
      } else {
         var9 = false;
      }

      var8 = MessageAccessoriesView.Companion.getWidth(var8, var9);
      val var11: java.lang.String = MessageId.toString-impl(var15);
      val var14: GeneralEventHandlers = new GeneralEventHandlers(new v(var7, var15), var5);
      val var13: MarkdownTextRenderOptions = new MarkdownTextRenderOptions(
         MessageId.toString-impl(var12.getId-3Eiw7ao()),
         MessageKt.shouldAnimateEmoji(var12),
         MessageKt.shouldShowLinkDecorations(var12),
         var12.getShouldShowRoleDot(),
         var12.getShouldShowRoleOnName()
      );
      val var35: MarkdownTextRenderEventHandlers = new MarkdownTextRenderEventHandlers(
         new w(var7, var15),
         new Function1(var7) {
            {
               super(1, var1, ChatEventHandler::class.java, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
            }

            public final void invoke(LinkContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLinkLongClicked(var1);
            }
         },
         new Function3(var7) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapChannel(var1, var2, var3);
            }
         },
         new Function4(var7) {
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
         new Function1(var7) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapAttachmentLink", "onTapAttachmentLink(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAttachmentLink(var1);
            }
         },
         new Function2(var7) {
            {
               super(2, var1, ChatEventHandler::class.java, "onLongPressAttachmentLink", "onLongPressAttachmentLink(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2) {
               kotlin.jvm.internal.q.h(var1, "p0");
               kotlin.jvm.internal.q.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLongPressAttachmentLink(var1, var2);
            }
         },
         new Function4(var7) {
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
         new Function1(var7) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
            }

            public final void invoke(CommandMentionContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapCommand(var1);
            }
         },
         new Function1(var7) {
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
         var5,
         new Function1(var7) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapTimestamp", "onTapTimestamp(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapTimestamp(var1);
            }
         },
         new Function1(var7) {
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
         new Function1(var7) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
            }

            public final void invoke(EmojiContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapEmoji(var1);
            }
         },
         new Function1(var7) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSoundmoji", "onTapSoundmoji(Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;)V", 0);
            }

            public final void invoke(SoundmojiContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapSoundmoji(var1);
            }
         }
      );
      val var28: MediaItemEventHandlers = new MediaItemEventHandlers(var3, var4, var5, new Function1(var7) {
         {
            super(1, var1, ChatEventHandler::class.java, "onTapShowAltText", "onTapShowAltText(Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1) {
            kotlin.jvm.internal.q.h(var1, "p0");
            (super.receiver as ChatEventHandler).onTapShowAltText(var1);
         }
      }, var6);
      val var31: ComponentActionEventHandlers = new ComponentActionEventHandlers(new x(var7, var15), new y(var7, var15), new z(var7, var15), new A(var7, var15));
      val var32: WidthInfo = new WidthInfo(var8, SizeUtilsKt.getDpToPx(600), 0, 4, null);
      val var30: java.lang.Boolean = var12.getGifAutoPlay();
      if (var30 != null) {
         var9 = var30;
      } else {
         var9 = false;
      }

      val var10: Boolean;
      if (var12.getForwardInfo() != null) {
         var10 = true;
      } else {
         var10 = false;
      }

      this.messageComponentsView
         .setComponents(var1.getMessageComponents(), var2, new ComponentContext(var11, var14, var13, var35, var28, var31, var32, var9, var10, false));
   }
}
