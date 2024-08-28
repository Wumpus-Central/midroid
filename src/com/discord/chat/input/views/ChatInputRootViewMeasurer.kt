package com.discord.chat.input.views

import android.content.Context
import com.discord.misc.utilities.measure.HeadlessViewMeasurer
import com.discord.misc.utilities.measure.HeadlessViewMeasurerExtensionsKt
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

internal class ChatInputRootViewMeasurer(chatInputRootView: ChatInputRootView, onHeightChanged: (Int) -> Unit) {
   private final val chatInputRootView: ChatInputRootView
   private final val onHeightChanged: (Int) -> Unit
   private final var initialized: Boolean
   private final var lineCount: Int
   private final var minimumHeightPx: Int

   init {
      q.h(var1, "chatInputRootView");
      q.h(var2, "onHeightChanged");
      super();
      this.chatInputRootView = var1;
      this.onHeightChanged = var2;
      this.lineCount = 1;
      this.minimumHeightPx = -1;
   }

   private fun emitMeasuredHeight() {
      this.onHeightChanged.invoke(Math.max(this.measureHeight(this.chatInputRootView), this.minimumHeightPx));
   }

   private fun ChatInputRootView.measureHeight(): Int {
      val var2: Context = var1.getContext();
      q.g(var2, "getContext(...)");
      return HeadlessViewMeasurerExtensionsKt.measureHeadlessView(var2, ChatInputRootView.class, new Function1(this) {
         final ChatInputRootViewMeasurer this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(ChatInputRootView var1) {
            q.h(var1, "it");
            var1.setText(ChatInputRootViewMeasurer.access$getChatInputRootView$p(this.this$0).getText());
         }
      }, new HeadlessViewMeasurer.MeasureBounds(this.chatInputRootView.getWidth(), null, 2, null)).getHeight();
   }

   public fun measure(measureWhenInitialized: Boolean) {
      if (this.minimumHeightPx == -1 && this.chatInputRootView.getHeight() > 0) {
         this.minimumHeightPx = this.chatInputRootView.getHeight();
      }

      val var2: Int = this.chatInputRootView.getLineCount();
      if (var2 == null && this.minimumHeightPx > 0) {
         this.lineCount = 1;
         this.emitMeasuredHeight();
      } else if (var2 != null && this.lineCount != var2) {
         this.lineCount = var2;
         this.emitMeasuredHeight();
      } else if (!this.initialized && var1) {
         this.initialized = true;
         this.emitMeasuredHeight();
      }
   }
}
