package com.discord.fastest_list.android

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig
import com.discord.fastest_list.android.view_holder.FastestListViewHolder
import com.discord.fastest_list.android.view_holder.FastestListViewHolderItem
import com.discord.fastest_list.android.view_holder.FastestListViewHolderListFooter
import com.discord.fastest_list.android.view_holder.FastestListViewHolderListHeader
import com.discord.fastest_list.android.view_holder.FastestListViewHolderSectionFooter
import com.discord.fastest_list.android.view_holder.FastestListViewHolderSectionHeader
import com.discord.misc.utilities.ids.IdUtilsKt

internal class FastestListViewAdapter(layoutManager: FastestListLayoutManager,
      placeholderConfig: FastestListPlaceholderConfig,
      sections: FastestListSections,
      onUnexpectedItemSize: (Entry, Int) -> Unit
   )
   : Adapter {
   private final val layoutManager: FastestListLayoutManager
   private final var placeholderConfig: FastestListPlaceholderConfig
   private final val sections: FastestListSections
   private final val onUnexpectedItemSize: (Entry, Int) -> Unit

   init {
      this.layoutManager = var1;
      this.placeholderConfig = var2;
      this.sections = var3;
      this.onUnexpectedItemSize = var4;
      this.setHasStableIds(true);
   }

   public open fun getItemCount(): Int {
      return this.sections.getItemCount();
   }

   public open fun getItemId(position: Int): Long {
      return IdUtilsKt.convertToId(this.sections.getItem(var1).getKey());
   }

   public open fun getItemViewType(position: Int): Int {
      return this.sections.getItemViewType(var1);
   }

   public open fun onBindViewHolder(holder: FastestListViewHolder, position: Int) {
      var1.onBindViewHolder(this.sections.getItem(var2), this.layoutManager.getHorizontal(), this.placeholderConfig);
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FastestListViewHolder {
      if (var2 != 0) {
         if (var2 != 1) {
            if (var2 != 2) {
               if (var2 != 3) {
                  if (var2 == 4) {
                     return new FastestListViewHolderListFooter(var1, this.onUnexpectedItemSize);
                  } else {
                     val var3: StringBuilder = new StringBuilder();
                     var3.append("Unknown view type ");
                     var3.append(var2);
                     throw new IllegalArgumentException(var3.toString());
                  }
               } else {
                  return new FastestListViewHolderListHeader(var1, this.onUnexpectedItemSize);
               }
            } else {
               return new FastestListViewHolderSectionFooter(var1, this.onUnexpectedItemSize);
            }
         } else {
            return new FastestListViewHolderSectionHeader(var1, this.onUnexpectedItemSize);
         }
      } else {
         return new FastestListViewHolderItem(var1, this.onUnexpectedItemSize);
      }
   }

   public open fun onViewRecycled(holder: FastestListViewHolder) {
      super.onViewRecycled(var1);
      var1.onViewRecycled();
   }

   public fun setPlaceholderConfig(placeholderConfig: FastestListPlaceholderConfig): Boolean {
      if (!(this.placeholderConfig == var1)) {
         this.placeholderConfig = var1;
         return true;
      } else {
         return false;
      }
   }

   public data class DataChanged(position: Int, count: Int = 1) {
      public final val position: Int
      public final val count: Int

      init {
         this.position = var1;
         this.count = var2;
      }

      public operator fun component1(): Int {
         return this.position;
      }

      public operator fun component2(): Int {
         return this.count;
      }

      public fun copy(position: Int = var0.position, count: Int = var0.count): com.discord.fastest_list.android.FastestListViewAdapter.DataChanged {
         return new FastestListViewAdapter.DataChanged(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is FastestListViewAdapter.DataChanged) {
            return false;
         } else {
            var1 = var1;
            if (this.position != var1.position) {
               return false;
            } else {
               return this.count == var1.count;
            }
         }
      }

      public override fun hashCode(): Int {
         return Integer.hashCode(this.position) * 31 + Integer.hashCode(this.count);
      }

      public override fun toString(): String {
         val var1: Int = this.position;
         val var2: Int = this.count;
         val var3: StringBuilder = new StringBuilder();
         var3.append("DataChanged(position=");
         var3.append(var1);
         var3.append(", count=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }
}
