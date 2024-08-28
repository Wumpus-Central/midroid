package com.discord.recycler_view.decorations

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlin.jvm.internal.q

public class VerticalSpacingItemDecoration(spacingPx: Int, firstItemSpacingPx: Int = 0, endItemSpacingPx: Int = 0, isRecyclerLayoutReversed: Boolean = false)
   : ItemDecoration {
   private final val endItemSpacingPx: Int
   private final val firstItemSpacingPx: Int

   public final var isRecyclerLayoutReversed: Boolean
      internal set

   private final val spacingPx: Int

   init {
      this.spacingPx = var1;
      this.firstItemSpacingPx = var2;
      this.endItemSpacingPx = var3;
      this.isRecyclerLayoutReversed = var4;
   }

   private fun ViewHolder.isOrWasAtFirstItemPosition(): Boolean {
      val var2: Int;
      if (this.isRecyclerLayoutReversed) {
         val var3: Adapter = var1.getBindingAdapter();
         q.e(var3);
         var2 = var3.getItemCount() - 1;
      } else {
         var2 = 0;
      }

      return this.validateItemPosition(var1, var2);
   }

   private fun ViewHolder.isOrWasAtLastItemPosition(): Boolean {
      val var2: Int;
      if (this.isRecyclerLayoutReversed) {
         var2 = 0;
      } else {
         val var3: Adapter = var1.getBindingAdapter();
         q.e(var3);
         var2 = var3.getItemCount() - 1;
      }

      return this.validateItemPosition(var1, var2);
   }

   private fun ViewHolder.validateItemPosition(position: Int): Boolean {
      val var3: Boolean;
      if (var1.getBindingAdapterPosition() == var2 || var1.getBindingAdapterPosition() == -1 && var1.getOldPosition() == var2) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public open fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      q.h(var1, "outRect");
      q.h(var2, "view");
      q.h(var3, "parent");
      q.h(var4, "state");
      val var10: ViewHolder = var3.getChildViewHolder(var2);
      q.e(var10);
      val var7: Boolean = this.isOrWasAtLastItemPosition(var10);
      val var6: Boolean = this.isOrWasAtFirstItemPosition(var10);
      val var8: VerticalSpacingItemDecoration.SpacingProviderView;
      if (var2 is VerticalSpacingItemDecoration.SpacingProviderView) {
         var8 = var2 as VerticalSpacingItemDecoration.SpacingProviderView;
      } else {
         var8 = null;
      }

      var var5: Int;
      label24: {
         if (var8 != null) {
            val var9: Int = var8.spacingPxOverride();
            if (var9 != null) {
               var5 = var9;
               break label24;
            }
         }

         var5 = this.spacingPx;
      }

      if (var7) {
         var5 = this.endItemSpacingPx;
      }

      var1.bottom = var5;
      if (var6) {
         var1.top = this.firstItemSpacingPx;
      }
   }

   public interface SpacingProviderView {
      public abstract fun spacingPxOverride(): Int? {
      }
   }
}
