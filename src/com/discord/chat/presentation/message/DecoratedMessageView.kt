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

public class DecoratedMessageView  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout {
   private final val binding: DecoratedMessageViewBinding
   private final var drawHighlight: Boolean
   private final val highlightDrawer: BackgroundHighlightDrawer
   private final var messageFrame: MessageFrame?

   fun DecoratedMessageView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var3: DecoratedMessageViewBinding = DecoratedMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
      this.highlightDrawer = new BackgroundHighlightDrawer(var1);
      this.setWillNotDraw(false);
   }

   protected open fun onDraw(canvas: Canvas) {
      kotlin.jvm.internal.q.h(var1, "canvas");
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
      onChainPart: () -> ChainPart = <unrepresentable>.INSTANCE,
      allowChildGestures: Boolean = true,
      isHighlight: Boolean = false,
      renderContentOnly: Boolean = false
   ) {
      kotlin.jvm.internal.q.h(var1, "message");
      kotlin.jvm.internal.q.h(var2, "messageContext");
      kotlin.jvm.internal.q.h(var4, "eventHandler");
      kotlin.jvm.internal.q.h(var6, "onChainPart");
      this.binding.messageView.setMessage(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.drawHighlight = this.highlightDrawer.getShouldRenderHighlight().invoke(new MessageItem(var1, var3, var2, var7, var8, null, null, var9, 96, null)) as java.lang.Boolean;
      this.messageFrame = var3;
   }
}
