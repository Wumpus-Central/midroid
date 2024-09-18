package com.discord.chat.presentation.message.system

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.recyclerview.widget.RecyclerView
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
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public class SystemMessageWrapperView  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout {
   private final val binding: DecoratedMessageViewBinding
   private final var drawHighlight: Boolean
   private final val highlightDrawer: BackgroundHighlightDrawer

   fun SystemMessageWrapperView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      val var3: DecoratedMessageViewBinding = DecoratedMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var3, "inflate(...)");
      this.binding = var3;
      this.highlightDrawer = new BackgroundHighlightDrawer(var1);
      this.setWillNotDraw(false);
   }

   protected open fun onDraw(canvas: Canvas) {
      q.h(var1, "canvas");
      super.onDraw(var1);
      if (this.drawHighlight) {
         HighlightedMessageDrawer.drawHighlight$default(this.highlightDrawer, var1, this, 0, 0, 12, null);
      }
   }

   public fun setMessage(message: Message, messageContext: MessageContext, eventHandler: ChatEventHandler) {
      q.h(var1, "message");
      q.h(var2, "messageContext");
      q.h(var3, "eventHandler");
      val var4: MessageView = this.binding.messageView;
      q.g(this.binding.messageView, "messageView");
      MessageView.setMessage$default(var4, var1, var2, null, var3, null, null, false, false, false, 500, null);
      val var6: Function0 = new Function0(var3) {
         final ChatEventHandler $eventHandler;

         {
            super(0);
            this.$eventHandler = var1;
         }

         public final ChatEventHandler invoke() {
            return this.$eventHandler;
         }
      };
      this.removeAllViews();
      val var7: Any;
      if (MessageKt.isCallMessage(var1)) {
         var7 = new CallSystemMessageDelegate(var6).createAndBindStandaloneView(this, var1);
      } else {
         var7 = new SystemMessageDelegate(var6, new RecyclerView.RecycledViewPool()).createAndBindStandaloneView(this, var1, var2);
      }

      this.addView((View)var7, -1, -2);
      this.drawHighlight = this.highlightDrawer
         .getShouldRenderHighlight()
         .invoke(new MessageItem(var1, null, var2, false, false, null, null, false, 250, null)) as java.lang.Boolean;
   }
}
