package com.discord.fastest_list.android

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig
import com.discord.fastest_list.android.view_holder.FastestListViewHolder
import com.discord.fastest_list.android.view_holder.FastestListViewHolderItem
import com.discord.fastest_list.android.view_holder.FastestListViewHolderListFooter
import com.discord.fastest_list.android.view_holder.FastestListViewHolderListHeader
import com.discord.fastest_list.android.view_holder.FastestListViewHolderSectionFooter
import com.discord.fastest_list.android.view_holder.FastestListViewHolderSectionHeader
import kotlin.jvm.internal.q

internal class FastestListViewAdapter(layoutManager: FastestListLayoutManager,
      placeholderConfig: FastestListPlaceholderConfig,
      sections: FastestListSections,
      onUnexpectedItemSize: (Entry, Int) -> Unit
   )
   : RecyclerView.Adapter {
   private final val layoutManager: FastestListLayoutManager
   private final var placeholderConfig: FastestListPlaceholderConfig
   private final val sections: FastestListSections
   private final val onUnexpectedItemSize: (Entry, Int) -> Unit

   init {
      q.h(var1, "layoutManager");
      q.h(var2, "placeholderConfig");
      q.h(var3, "sections");
      q.h(var4, "onUnexpectedItemSize");
      super();
      this.layoutManager = var1;
      this.placeholderConfig = var2;
      this.sections = var3;
      this.onUnexpectedItemSize = var4;
      this.setHasStableIds(true);
   }

   public override fun getItemCount(): Int {
      return this.sections.getItemCount();
   }

   public override fun getItemId(position: Int): Long {
      return var1;
   }

   public override fun getItemViewType(position: Int): Int {
      return this.sections.getItemViewType(var1);
   }

   public open fun onBindViewHolder(holder: FastestListViewHolder, position: Int) {
      q.h(var1, "holder");
      var1.onBindViewHolder(this.sections.getItem(var2), this.layoutManager.getHorizontal(), this.placeholderConfig);
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FastestListViewHolder {
      q.h(var1, "parent");
      val var3: Any;
      if (var2 != 0) {
         if (var2 != 1) {
            if (var2 != 2) {
               if (var2 != 3) {
                  if (var2 != 4) {
                     val var4: StringBuilder = new StringBuilder();
                     var4.append("Unknown view type ");
                     var4.append(var2);
                     throw new IllegalArgumentException(var4.toString());
                  }

                  var3 = new FastestListViewHolderListFooter(var1, this.onUnexpectedItemSize);
               } else {
                  var3 = new FastestListViewHolderListHeader(var1, this.onUnexpectedItemSize);
               }
            } else {
               var3 = new FastestListViewHolderSectionFooter(var1, this.onUnexpectedItemSize);
            }
         } else {
            var3 = new FastestListViewHolderSectionHeader(var1, this.onUnexpectedItemSize);
         }
      } else {
         var3 = new FastestListViewHolderItem(var1, this.onUnexpectedItemSize);
      }

      return (FastestListViewHolder)var3;
   }

   public open fun onViewRecycled(holder: FastestListViewHolder) {
      q.h(var1, "holder");
      super.onViewRecycled(var1);
      var1.onViewRecycled();
   }

   public fun setPlaceholderConfig(placeholderConfig: FastestListPlaceholderConfig): Boolean {
      q.h(var1, "placeholderConfig");
      if (!q.c(this.placeholderConfig, var1)) {
         this.placeholderConfig = var1;
         return true;
      } else {
         return false;
      }
   }

   public data class DataChanged(position: Int, count: Int = 1) {
      public final val count: Int
      public final val position: Int

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
         val var2: Int = this.position;
         val var1: Int = this.count;
         val var3: StringBuilder = new StringBuilder();
         var3.append("DataChanged(position=");
         var3.append(var2);
         var3.append(", count=");
         var3.append(var1);
         var3.append(")");
         return var3.toString();
      }
   }
}
