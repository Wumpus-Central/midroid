package com.discord.chat.presentation.message

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.databinding.DecoratedMessageViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.message.MessageView.ChainPart
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer
import com.discord.chat.presentation.message.decorations.HighlightedMessageDrawer
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.root.MessageContext

public class DecoratedMessageView  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout(var1, var2) {
   private final val binding: DecoratedMessageViewBinding
   private final val highlightDrawer: BackgroundHighlightDrawer
   private final var drawHighlight: Boolean
   private final var messageFrame: MessageFrame?

   fun DecoratedMessageView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var3: DecoratedMessageViewBinding = DecoratedMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
      this.highlightDrawer = new BackgroundHighlightDrawer(var1);
      this.setWillNotDraw(false);
   }

   @JvmStatic
   fun `setMessage$lambda$0`(): MessageView.ChainPart {
      return MessageView.ChainPart.ONLY;
   }

   protected open fun onDraw(canvas: Canvas) {
      super.onDraw(var1);
      if (this.drawHighlight) {
         HighlightedMessageDrawer.drawHighlight$default(this.highlightDrawer, var1, this, 0, 0, 12, null);
      }
   }

   public fun setMessage(
      message: Message,
      messageContext: MessageContext,
      messageFrame: MessageFrame? = null,
      eventHandler: ChatEventHandler = ChatEventHandler.Empty.INSTANCE,
      componentProvider: ComponentProvider? = null,
      onChainPart: () -> ChainPart = new c(),
      allowChildGestures: Boolean = true,
      renderContentOnly: Boolean = false
   ) {
      this.binding.messageView.setMessage(var1, var2, var3, var4, var5, var6, var7, var8);
      this.drawHighlight = this.highlightDrawer.getShouldRenderHighlight().invoke(new MessageItem(var1, var3, var2, var7, null, null, var8, 48, null)) as java.lang.Boolean;
      this.messageFrame = var3;
   }
}
