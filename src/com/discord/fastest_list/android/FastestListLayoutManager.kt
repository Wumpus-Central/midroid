package com.discord.fastest_list.android

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.fastest_list.android.FastestListVisibleItemsTracker.RenderAhead
import kotlin.jvm.internal.q

internal class FastestListLayoutManager(renderAhead: RenderAhead, context: Context, horizontal: Boolean, reverseLayout: Boolean = false) : LinearLayoutManager {
   public final val extraLayoutSpace: Int
      public final get() {
         val var1: Float;
         val var2: Float;
         if (this.horizontal) {
            var1 = this.getWidth();
            var2 = this.renderAhead.getExtraLayoutPercent();
         } else {
            var1 = this.getHeight();
            var2 = this.renderAhead.getExtraLayoutPercent();
         }

         return (int)(var1 * var2);
      }


   public final var horizontal: Boolean
      internal final set(value) {
         this.horizontal = var1;
         this.setOrientation(FastestListLayoutManager.Companion.access$getOrientation(Companion, var1));
      }


   public final var renderAhead: RenderAhead
      internal set

   public final var scrollingForward: Boolean
      internal set

   init {
      q.h(var1, "renderAhead");
      q.h(var2, "context");
      super(var2, FastestListLayoutManager.Companion.access$getOrientation(Companion, var3), var4);
      this.renderAhead = var1;
      this.scrollingForward = true;
      this.horizontal = var3;
   }

   protected override fun calculateExtraLayoutSpace(state: State, extraLayoutSpace: IntArray) {
      q.h(var1, "state");
      q.h(var2, "extraLayoutSpace");
      if (this.scrollingForward) {
         var2[1] = this.getExtraLayoutSpace();
      } else {
         var2[0] = this.getExtraLayoutSpace();
      }
   }

   public companion object {
      private const val EXTRA_LAYOUT_SPACE_END: Int
      private const val EXTRA_LAYOUT_SPACE_START: Int

      private fun getOrientation(horizontal: Boolean): Int {
         return var1 xor 1;
      }
   }
}
