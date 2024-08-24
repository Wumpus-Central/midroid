package com.discord.fastest_list.android

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import kotlin.jvm.internal.r

internal class FastestListInsetDecorator(horizontal: Boolean, insetEnd: Int, insetStart: Int) : ItemDecoration {
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

   public open fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      r.h(var1, "outRect");
      r.h(var2, "view");
      r.h(var3, "parent");
      r.h(var4, "state");
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
