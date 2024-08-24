package com.discord.chat.presentation.message.decorations

import android.graphics.Canvas
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.presentation.list.ChatListAdapter
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.logging.Log
import kotlin.jvm.internal.r

public abstract class HighlightedMessageDecoration : ItemDecoration {
   private final val drawer: HighlightedMessageDrawer

   open fun HighlightedMessageDecoration(var1: HighlightedMessageDrawer) {
      r.h(var1, "drawer");
      super();
      this.drawer = var1;
   }

   public open fun onDraw(canvas: Canvas, parent: RecyclerView, state: State) {
      r.h(var1, "canvas");
      r.h(var2, "parent");
      r.h(var3, "state");
      super.onDraw(var1, var2, var3);
      var1.save();
      val var11: Adapter = var2.getAdapter();
      r.f(var11, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChatListAdapter");
      val var12: ChatListAdapter = var11 as ChatListAdapter;
      val var5: Int = var2.getChildCount();

      for (int var4 = 0; var4 < var5; var4++) {
         val var7: View = var2.getChildAt(var4);
         val var6: Int = var2.getChildAdapterPosition(var7);
         if (var6 >= 0 && var6 < var12.getChatListItems().size()) {
            val var8: ChatListItem = var12.getChatListItem(var6);
            if (var8 == null) {
               val var13: Log = Log.INSTANCE;
               val var9: java.lang.String = this.getClass().getSimpleName();
               r.g(var9, "javaClass.simpleName");
               val var10: StringBuilder = new StringBuilder();
               var10.append("Missing item in position ");
               var10.append(var6);
               Log.e$default(var13, var9, var10.toString(), null, 4, null);
               return;
            }

            if (this.drawer.getShouldRenderHighlight().invoke(var8) as java.lang.Boolean) {
               this.drawer.setPaintStyles(var8);
               val var14: HighlightedMessageDrawer = this.drawer;
               r.g(var7, "child");
               var14.drawHighlight(var1, var7, 0, 0);
            }
         }
      }

      var1.restore();
   }
}
