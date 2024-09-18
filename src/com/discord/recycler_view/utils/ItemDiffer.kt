package com.discord.recycler_view.utils

import androidx.recyclerview.widget.c
import kotlin.jvm.internal.q

public class ItemDiffer(oldItems: List<ItemDiffableType>, newItems: List<ItemDiffableType>) : c.b {
   private final val oldItems: List<ItemDiffableType>
   private final val newItems: List<ItemDiffableType>

   init {
      q.h(var1, "oldItems");
      q.h(var2, "newItems");
      super();
      this.oldItems = var1;
      this.newItems = var2;
   }

   public override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
      return q.c(this.oldItems.get(var1), this.newItems.get(var2));
   }

   public override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
      return q.c(this.oldItems.get(var1).getItemId(), this.newItems.get(var2).getItemId());
   }

   public override fun getNewListSize(): Int {
      return this.newItems.size();
   }

   public override fun getOldListSize(): Int {
      return this.oldItems.size();
   }
}
