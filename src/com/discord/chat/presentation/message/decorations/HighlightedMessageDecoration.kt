package com.discord.chat.presentation.message.decorations

import android.graphics.Canvas
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.presentation.list.ChatListAdapter
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.logging.Log
import kotlin.jvm.internal.q

public abstract class HighlightedMessageDecoration : RecyclerView.ItemDecoration {
   private final val drawer: HighlightedMessageDrawer

   open fun HighlightedMessageDecoration(var1: HighlightedMessageDrawer) {
      q.h(var1, "drawer");
      super();
      this.drawer = var1;
   }

   public override fun onDraw(canvas: Canvas, parent: RecyclerView, state: State) {
      q.h(var1, "canvas");
      q.h(var2, "parent");
      q.h(var3, "state");
      super.onDraw(var1, var2, var3);
      var1.save();
      val var11: RecyclerView.Adapter = var2.getAdapter();
      q.f(var11, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChatListAdapter");
      val var12: ChatListAdapter = var11 as ChatListAdapter;
      val var5: Int = var2.getChildCount();

      for (int var4 = 0; var4 < var5; var4++) {
         val var7: View = var2.getChildAt(var4);
         val var6: Int = var2.getChildAdapterPosition(var7);
         if (var6 >= 0 && var6 < var12.getChatListItems().size()) {
            val var8: ChatListItem = var12.getChatListItem(var6);
            if (var8 == null) {
               val var13: Log = Log.INSTANCE;
               val var10: java.lang.String = this.getClass().getSimpleName();
               q.g(var10, "getSimpleName(...)");
               val var9: StringBuilder = new StringBuilder();
               var9.append("Missing item in position ");
               var9.append(var6);
               Log.e$default(var13, var10, var9.toString(), null, 4, null);
               return;
            }

            if (this.drawer.getShouldRenderHighlight().invoke(var8) as java.lang.Boolean) {
               this.drawer.setPaintStyles(var8);
               val var14: HighlightedMessageDrawer = this.drawer;
               q.e(var7);
               var14.drawHighlight(var1, var7, 0, 0);
            }
         }
      }

      var1.restore();
   }
}
