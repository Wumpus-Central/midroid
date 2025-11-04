package com.discord.chat.presentation.message.decorations

import android.content.Context
import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.presentation.list.item.ChatListItem
import d8.a
import d8.b

public class BackgroundHighlightDrawer(context: Context) : HighlightedMessageDrawer(var1, new a(), new b(), new d8.c()) {
   @JvmStatic
   fun `_init_$lambda$0`(var0: ChatListItem): Int {
      val var1: BackgroundHighlight = BackgroundHighlightDecorationKt.access$getBackgroundHighlight(var0);
      return if (var1 != null) var1.getBackgroundColor() else null;
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: ChatListItem): Int {
      val var1: BackgroundHighlight = BackgroundHighlightDecorationKt.access$getBackgroundHighlight(var0);
      return if (var1 != null) var1.getGutterColor() else null;
   }

   @JvmStatic
   fun `_init_$lambda$2`(var0: ChatListItem): Boolean {
      return BackgroundHighlightDecorationKt.access$getBackgroundHighlight(var0) != null;
   }
}
