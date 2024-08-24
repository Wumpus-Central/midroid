package com.discord.recycler_view.utils

import androidx.recyclerview.widget.c.b
import kotlin.jvm.internal.r

public class ItemDiffer(oldItems: List<ItemDiffableType>, newItems: List<ItemDiffableType>) : b {
   private final val oldItems: List<ItemDiffableType>
   private final val newItems: List<ItemDiffableType>

   init {
      r.h(var1, "oldItems");
      r.h(var2, "newItems");
      super();
      this.oldItems = var1;
      this.newItems = var2;
   }

   public open fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
      return r.c(this.oldItems.get(var1), this.newItems.get(var2));
   }

   public open fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
      return r.c(this.oldItems.get(var1).getItemId(), this.newItems.get(var2).getItemId());
   }

   public open fun getNewListSize(): Int {
      return this.newItems.size();
   }

   public open fun getOldListSize(): Int {
      return this.oldItems.size();
   }
}
