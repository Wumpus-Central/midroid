package com.discord.chat.presentation.message.system

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.bridge.Message
import com.discord.chat.databinding.DecoratedMessageViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.AutomodSystemMessageDelegate
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.message.MessageView
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer
import com.discord.chat.presentation.message.decorations.HighlightedMessageDrawer
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.root.MessageContext
import kotlin.jvm.internal.r

public class AutomodSystemMessageWrapperView  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout {
   private final val binding: DecoratedMessageViewBinding
   private final val highlightDrawer: BackgroundHighlightDrawer
   private final var drawHighlight: Boolean

   fun AutomodSystemMessageWrapperView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      val var3: DecoratedMessageViewBinding = DecoratedMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var3, "inflate(...)");
      this.binding = var3;
      this.highlightDrawer = new BackgroundHighlightDrawer(var1);
      this.setWillNotDraw(false);
   }

   @JvmStatic
   fun `setMessage$lambda$0`(var0: ChatEventHandler): ChatEventHandler {
      return var0;
   }

   @JvmStatic
   fun `setMessage$lambda$1`(var0: ComponentProvider): ComponentProvider {
      return var0;
   }

   protected open fun onDraw(canvas: Canvas) {
      r.h(var1, "canvas");
      super.onDraw(var1);
      if (this.drawHighlight) {
         HighlightedMessageDrawer.drawHighlight$default(this.highlightDrawer, var1, this, 0, 0, 12, null);
      }
   }

   public fun setMessage(message: Message, messageContext: MessageContext, eventHandler: ChatEventHandler) {
      r.h(var1, "message");
      r.h(var2, "messageContext");
      r.h(var3, "eventHandler");
      MessageView.setMessage$default(this.binding.messageView, var1, var2, null, var3, null, null, false, false, 244, null);
      val var6: b = new b(var3);
      val var4: Context = this.getContext();
      r.g(var4, "getContext(...)");
      val var7: ComponentProvider = new ComponentProvider(var4, true);
      this.removeAllViews();
      this.addView(
         new AutomodSystemMessageDelegate(var6, new c(var7), new RecyclerView.RecycledViewPool()).createAndBindStandaloneView(this, var1, var2), -1, -2
      );
      this.drawHighlight = this.highlightDrawer.getShouldRenderHighlight().invoke(new MessageItem(var1, null, var2, false, null, null, false, 122, null)) as java.lang.Boolean;
   }
}
