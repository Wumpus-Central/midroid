package com.discord.chat.presentation.message.decorations

import android.content.Context
import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.presentation.list.item.ChatListItem
import kotlin.jvm.internal.q
import z1.a
import z1.b
import z1.c

public class BackgroundHighlightDrawer(context: Context) : HighlightedMessageDrawer {
   init {
      q.h(var1, "context");
      super(var1, new a(), new b(), new c());
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: ChatListItem): Int {
      q.h(var0, "it");
      val var1: BackgroundHighlight = BackgroundHighlightDecorationKt.access$getBackgroundHighlight(var0);
      val var2: Int;
      if (var1 != null) {
         var2 = var1.getBackgroundColor();
      } else {
         var2 = null;
      }

      return var2;
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: ChatListItem): Int {
      q.h(var0, "it");
      val var1: BackgroundHighlight = BackgroundHighlightDecorationKt.access$getBackgroundHighlight(var0);
      val var2: Int;
      if (var1 != null) {
         var2 = var1.getGutterColor();
      } else {
         var2 = null;
      }

      return var2;
   }

   @JvmStatic
   fun `_init_$lambda$2`(var0: ChatListItem): Boolean {
      q.h(var0, "it");
      val var1: Boolean;
      if (BackgroundHighlightDecorationKt.access$getBackgroundHighlight(var0) != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
