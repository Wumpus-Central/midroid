package com.discord.chat.input.views

import android.content.Context
import com.discord.misc.utilities.measure.HeadlessViewMeasurerExtensionsKt
import com.discord.misc.utilities.measure.HeadlessViewMeasurer.MeasureBounds
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nChatInputRootViewMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatInputRootViewMeasurer.kt\ncom/discord/chat/input/views/ChatInputRootViewMeasurer\n+ 2 HeadlessViewMeasurerExtensions.kt\ncom/discord/misc/utilities/measure/HeadlessViewMeasurerExtensionsKt\n*L\n1#1,48:1\n18#2,5:49\n*S KotlinDebug\n*F\n+ 1 ChatInputRootViewMeasurer.kt\ncom/discord/chat/input/views/ChatInputRootViewMeasurer\n*L\n41#1:49,5\n*E\n"])
internal class ChatInputRootViewMeasurer(chatInputRootView: ChatInputRootView, onHeightChanged: (Int) -> Unit) {
   private final val chatInputRootView: ChatInputRootView
   private final val onHeightChanged: (Int) -> Unit
   private final var initialized: Boolean
   private final var lineCount: Int

   init {
      this.chatInputRootView = var1;
      this.onHeightChanged = var2;
      this.lineCount = 1;
   }

   private fun emitMeasuredHeight() {
      this.onHeightChanged.invoke(this.measureHeight(this.chatInputRootView));
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
      if (!this.initialized) {
         if (var1) {
            this.initialized = true;
            this.emitMeasuredHeight();
            return;
         }
      } else {
         val var2: Int = this.chatInputRootView.getLineCount();
         if (var2 == null) {
            this.lineCount = 1;
            this.emitMeasuredHeight();
            return;
         }

         if (this.lineCount != var2) {
            this.lineCount = var2;
            this.emitMeasuredHeight();
         }
      }
   }
}
