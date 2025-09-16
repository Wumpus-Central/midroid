package com.discord.fastest_list.android

import android.content.Context
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.fastest_list.android.FastestListVisibleItemsTracker.RenderAhead
import com.discord.recycler_view.utils.TransitionResilientLinearLayoutManager

internal class FastestListLayoutManager(renderAhead: RenderAhead, context: Context, horizontal: Boolean, reverseLayout: Boolean = false) : TransitionResilientLinearLayoutManager(
      var2, FastestListLayoutManager.Companion.access$getOrientation(Companion, var3), var4, new a()
   ) {
   public final var renderAhead: RenderAhead
      internal set

   public final var scrollingForward: Boolean
      internal set

   public final var horizontal: Boolean
      internal final set(value) {
         this.horizontal = var1;
         this.setOrientation(FastestListLayoutManager.Companion.access$getOrientation(Companion, var1));
      }


   public final val extraLayoutSpace: Int
      public final get() {
         val var1: Float;
         val var2: Float;
         if (this.horizontal) {
            var2 = this.getWidth();
            var1 = this.renderAhead.getExtraLayoutPercent();
         } else {
            var2 = this.getHeight();
            var1 = this.renderAhead.getExtraLayoutPercent();
         }

         return (int)(var2 * var1);
      }


   init {
      this.renderAhead = var1;
      this.scrollingForward = true;
      this.horizontal = var3;
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: Exception): Exception {
      return new FastestListLayoutManager.FastestListLayoutManagerException(var0);
   }

   protected override fun calculateExtraLayoutSpace(state: State, extraLayoutSpace: IntArray) {
      if (this.scrollingForward) {
         var2[1] = this.getExtraLayoutSpace();
      } else {
         var2[0] = this.getExtraLayoutSpace();
      }
   }

   public companion object {
      private const val EXTRA_LAYOUT_SPACE_START: Int
      private const val EXTRA_LAYOUT_SPACE_END: Int

      private fun getOrientation(horizontal: Boolean): Int {
         return var1 xor 1;
      }
   }

   private class FastestListLayoutManagerException(e: Exception) : IllegalStateException(var1)
}
