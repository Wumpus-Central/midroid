package com.discord.chat.input.views

import android.content.Context
import com.discord.misc.utilities.measure.HeadlessViewMeasurerExtensionsKt
import com.discord.misc.utilities.measure.HeadlessViewMeasurer.MeasureBounds
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nChatInputRootViewMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatInputRootViewMeasurer.kt\ncom/discord/chat/input/views/ChatInputRootViewMeasurer\n+ 2 HeadlessViewMeasurerExtensions.kt\ncom/discord/misc/utilities/measure/HeadlessViewMeasurerExtensionsKt\n*L\n1#1,50:1\n18#2,5:51\n*S KotlinDebug\n*F\n+ 1 ChatInputRootViewMeasurer.kt\ncom/discord/chat/input/views/ChatInputRootViewMeasurer\n*L\n43#1:51,5\n*E\n"])
internal class ChatInputRootViewMeasurer(chatInputRootView: ChatInputRootView, onHeightChanged: (Int) -> Unit) {
   private final val chatInputRootView: ChatInputRootView
   private final val onHeightChanged: (Int) -> Unit
   private final var initialized: Boolean
   private final var lineCount: Int
   private final var minimumHeightPx: Int

   init {
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
      return HeadlessViewMeasurerExtensionsKt.measureHeadlessView(
            var2, ChatInputRootView.class, new i(this), new MeasureBounds(this.chatInputRootView.getWidth(), null, 2, null)
         )
         .getHeight();
   }

   @JvmStatic
   fun `measureHeight$lambda$0`(var0: ChatInputRootViewMeasurer, var1: ChatInputRootView): Unit {
      var1.setText(var0.chatInputRootView.getText());
      return Unit.a;
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
