package com.discord.fastest_list.android

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.State
import kotlin.jvm.internal.q

internal class FastestListInsetDecorator(horizontal: Boolean, insetEnd: Int, insetStart: Int) : RecyclerView.ItemDecoration {
   public final var horizontal: Boolean
      internal set

   public final var insetEnd: Int
      internal set

   public final var insetStart: Int
      internal set

   init {
      this.horizontal = var1;
      this.insetEnd = var2;
      this.insetStart = var3;
   }

   public override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      q.h(var1, "outRect");
      q.h(var2, "view");
      q.h(var3, "parent");
      q.h(var4, "state");
      super.getItemOffsets(var1, var2, var3, var4);
      val var5: Int = var3.getChildAdapterPosition(var2);
      if (var5 == 0) {
         if (this.horizontal) {
            var1.left = this.insetStart;
         } else {
            var1.top = this.insetStart;
         }
      }

      if (var5 == var4.b() - 1) {
         if (this.horizontal) {
            var1.right = this.insetEnd;
         } else {
            var1.bottom = this.insetEnd;
         }
      }
   }
}
