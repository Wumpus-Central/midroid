package com.discord.recycler_view.utils

import androidx.recyclerview.widget.c.b

public class ItemDiffer(oldItems: List<ItemDiffableType>, newItems: List<ItemDiffableType>) : b {
   private final val oldItems: List<ItemDiffableType>
   private final val newItems: List<ItemDiffableType>

   init {
      this.oldItems = var1;
      this.newItems = var2;
   }

   public open fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
      return this.oldItems.get(var1) == this.newItems.get(var2);
   }

   public open fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
      return this.oldItems.get(var1).getItemId() == this.newItems.get(var2).getItemId();
   }

   public open fun getNewListSize(): Int {
      return this.newItems.size();
   }

   public open fun getOldListSize(): Int {
      return this.oldItems.size();
   }
}
