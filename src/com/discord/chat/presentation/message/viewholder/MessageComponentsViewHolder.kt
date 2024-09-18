package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ContentInventoryEventHandlers
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderEventHandlers
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions
import com.discord.chat.presentation.message.view.botuikit.MediaItemEventHandlers
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsView
import com.discord.chat.presentation.message.view.botuikit.UserEventHandlers
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

public class MessageComponentsViewHolder(messageComponentsView: MessageComponentsView, eventHandler: ChatEventHandler)
   : MessagePartViewHolder,
   ComponentActionListener {
   private final val messageComponentsView: MessageComponentsView
   private final val eventHandler: ChatEventHandler
   public final var messageId: MessageId

   init {
      kotlin.jvm.internal.q.h(var1, "messageComponentsView");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      super(var1, null);
      this.messageComponentsView = var1;
      this.eventHandler = var2;
      this.messageId = MessageId.constructor-impl("0");
   }

   public fun bind(
      componentsComponentsAccessory: MessageComponentsAccessory,
      componentProvider: ComponentProvider?,
      onMediaItemClicked: (View, String, Int?, Double?) -> Unit,
      onMediaItemLongClicked: ((String, Int?) -> Unit)?,
      onTapSpoiler: () -> Unit,
      eventHandler: ChatEventHandler
   ) {
      kotlin.jvm.internal.q.h(var1, "componentsComponentsAccessory");
      kotlin.jvm.internal.q.h(var3, "onMediaItemClicked");
      kotlin.jvm.internal.q.h(var5, "onTapSpoiler");
      kotlin.jvm.internal.q.h(var6, "eventHandler");
      val var10: Message = var1.getMessage();
      val var9: java.lang.String = var1.getMessageId-3Eiw7ao();
      this.messageId = var9;
      val var11: java.lang.String = MessageId.toString-impl(var9);
      val var27: MarkdownTextRenderOptions = new MarkdownTextRenderOptions(
         MessageId.toString-impl(var10.getId-3Eiw7ao()),
         MessageKt.shouldAnimateEmoji(var10),
         MessageKt.shouldShowLinkDecorations(var10),
         var10.getShouldShowRoleDot(),
         var10.getShouldShowRoleOnName()
      );
      val var28: MarkdownTextRenderEventHandlers = new MarkdownTextRenderEventHandlers(
         new Function1(var6, this) {
            final ChatEventHandler $eventHandler;
            final MessageComponentsViewHolder this$0;

            {
               super(1);
               this.$eventHandler = var1;
               this.this$0 = var2;
            }

            public final void invoke(LinkContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "node");
               this.$eventHandler.onLinkClicked-ntcYbpo(this.this$0.getMessageId-3Eiw7ao(), var1);
            }
         },
         new Function1(var6) {
            {
               super(1, var1, ChatEventHandler::class.java, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
            }

            public final void invoke(LinkContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLinkLongClicked(var1);
            }
         },
         new Function3(var6) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapChannel(var1, var2, var3);
            }
         },
         new Function4(var6) {
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
         new Function1(var6) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapAttachmentLink", "onTapAttachmentLink(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAttachmentLink(var1);
            }
         },
         new Function2(var6) {
            {
               super(2, var1, ChatEventHandler::class.java, "onLongPressAttachmentLink", "onLongPressAttachmentLink(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2) {
               kotlin.jvm.internal.q.h(var1, "p0");
               kotlin.jvm.internal.q.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLongPressAttachmentLink(var1, var2);
            }
         },
         new Function4(var6) {
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
         new Function1(var6) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
            }

            public final void invoke(CommandMentionContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapCommand(var1);
            }
         },
         new Function1(var6) {
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
         new Function1(var6) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapTimestamp", "onTapTimestamp(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapTimestamp(var1);
            }
         },
         new Function1(var6) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
            }

            public final void invoke(EmojiContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapEmoji(var1);
            }
         }
      );
      val var24: MediaItemEventHandlers = new MediaItemEventHandlers(var3, var4, var5, new Function1(var6) {
         {
            super(1, var1, ChatEventHandler::class.java, "onTapShowAltText", "onTapShowAltText(Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1) {
            kotlin.jvm.internal.q.h(var1, "p0");
            (super.receiver as ChatEventHandler).onTapShowAltText(var1);
         }
      });
      val var22: UserEventHandlers = new UserEventHandlers(new Function1(var6, this) {
         final ChatEventHandler $eventHandler;
         final MessageComponentsViewHolder this$0;

         {
            super(1);
            this.$eventHandler = var1;
            this.this$0 = var2;
         }

         public final void invoke_XF5_Sv8/* $VF was: invoke-XF5-Sv8*/(long var1) {
            this.$eventHandler.onTapUsername-x5gers8(this.this$0.getMessageId-3Eiw7ao(), var1);
         }
      }, new Function1(var6, this) {
         final ChatEventHandler $eventHandler;
         final MessageComponentsViewHolder this$0;

         {
            super(1);
            this.$eventHandler = var1;
            this.this$0 = var2;
         }

         public final void invoke_XF5_Sv8/* $VF was: invoke-XF5-Sv8*/(long var1) {
            this.$eventHandler.onTapAvatar-x5gers8(this.this$0.getMessageId-3Eiw7ao(), var1);
         }
      });
      val var25: ContentInventoryEventHandlers = new ContentInventoryEventHandlers(new Function3(var6, this) {
         final ChatEventHandler $eventHandler;
         final MessageComponentsViewHolder this$0;

         {
            super(3);
            this.$eventHandler = var1;
            this.this$0 = var2;
         }

         public final void invoke_lle484o/* $VF was: invoke-lle484o*/(long var1, java.lang.String var3, java.lang.String var4) {
            kotlin.jvm.internal.q.h(var3, "contentId");
            kotlin.jvm.internal.q.h(var4, "tappedElement");
            this.$eventHandler.onTapContentInventoryEntryEmbed-tsfjtEQ(this.this$0.getMessageId-3Eiw7ao(), var1, var3, var4);
         }
      });
      val var7: Int = var1.getConstrainedWidth();
      val var26: java.lang.Boolean = var10.getGifAutoPlay();
      val var8: Boolean;
      if (var26 != null) {
         var8 = var26;
      } else {
         var8 = false;
      }

      this.messageComponentsView
         .setComponents(var2, var1.getMessageComponents(), new ComponentContext(var11, var27, var28, var24, var22, var25, var7, var8), this);
   }

   public override fun onTapButtonActionComponent(componentId: String) {
      kotlin.jvm.internal.q.h(var1, "componentId");
      this.eventHandler.onTapButtonActionComponent-ntcYbpo(this.messageId, var1);
   }

   public override fun onTapSelectActionComponent(componentId: String) {
      kotlin.jvm.internal.q.h(var1, "componentId");
      this.eventHandler.onTapSelectActionComponent-ntcYbpo(this.messageId, var1);
   }

   public override fun openLink(url: String) {
      kotlin.jvm.internal.q.h(var1, "url");
      this.eventHandler.onLinkClicked-u7_MRrM(this.messageId, var1, "");
   }
}
