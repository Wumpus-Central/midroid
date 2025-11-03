package com.discord.chat.presentation.message.system

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.databinding.DecoratedMessageViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.CallSystemMessageDelegate
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.message.MessageView
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer
import com.discord.chat.presentation.message.decorations.HighlightedMessageDrawer
import com.discord.chat.presentation.root.MessageContext

public class SystemMessageWrapperView  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout(var1, var2) {
   private final val binding: DecoratedMessageViewBinding
   private final val highlightDrawer: BackgroundHighlightDrawer
   private final var drawHighlight: Boolean

   fun SystemMessageWrapperView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var3: DecoratedMessageViewBinding = DecoratedMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
      this.highlightDrawer = new BackgroundHighlightDrawer(var1);
      this.setWillNotDraw(false);
   }

   @JvmStatic
   fun `setMessage$lambda$0`(var0: ChatEventHandler): ChatEventHandler {
      return var0;
   }

   protected open fun onDraw(canvas: Canvas) {
      super.onDraw(var1);
      if (this.drawHighlight) {
         HighlightedMessageDrawer.drawHighlight$default(this.highlightDrawer, var1, this, 0, 0, 12, null);
      }
   }

   public fun setMessage(message: Message, messageContext: MessageContext, eventHandler: ChatEventHandler) {
      MessageView.setMessage$default(this.binding.messageView, var1, var2, null, var3, null, null, false, false, 244, null);
      val var5: h = new h(var3);
      this.removeAllViews();
      val var6: Any;
      if (MessageKt.isCallMessage(var1)) {
         var6 = new CallSystemMessageDelegate(var5).createAndBindStandaloneView(this, var1);
      } else {
         var6 = new SystemMessageDelegate(var5, new RecycledViewPool()).createAndBindStandaloneView(this, var1, var2);
      }

      this.addView((View)var6, -1, -2);
      this.drawHighlight = this.highlightDrawer.getShouldRenderHighlight().invoke(new MessageItem(var1, null, var2, false, null, null, false, 122, null)) as java.lang.Boolean;
   }
}
