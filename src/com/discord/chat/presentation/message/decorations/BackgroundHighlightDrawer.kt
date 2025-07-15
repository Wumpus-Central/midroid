package com.discord.chat.presentation.message.decorations

import A1.a
import A1.b
import A1.c
import android.content.Context
import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.presentation.list.item.ChatListItem
import kotlin.jvm.internal.r

public class BackgroundHighlightDrawer(context: Context) : HighlightedMessageDrawer {
   init {
      r.h(var1, "context");
      super(var1, new a(), new b(), new c());
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: ChatListItem): Int {
      r.h(var0, "it");
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
      r.h(var0, "it");
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
      r.h(var0, "it");
      val var1: Boolean;
      if (BackgroundHighlightDecorationKt.access$getBackgroundHighlight(var0) != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
