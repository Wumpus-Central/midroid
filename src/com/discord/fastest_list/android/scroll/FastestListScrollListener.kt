package com.discord.fastest_list.android.scroll

import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.recyclerview.widget.RecyclerView
import com.discord.fastest_list.android.FastestListLayoutManager
import com.discord.fastest_list.android.FastestListVisibleItemsTracker
import com.discord.recycler_view.scroll.DebouncedScrollListener

internal class FastestListScrollListener(keyboardDismissOnDrag: Boolean,
   onScrollEventThrottle: Long,
   onScrolled: (RecyclerView, Int, Int) -> Unit,
   onDragStateChanged: (Boolean) -> Unit,
   layoutManager: FastestListLayoutManager,
   visibleItemsTracker: FastestListVisibleItemsTracker
) : DebouncedScrollListener(var2, var4, null, var5, 4) {
   public final var keyboardDismissOnDrag: Boolean
   private final val layoutManager: FastestListLayoutManager
   private final val visibleItemsTracker: FastestListVisibleItemsTracker
   private final var keyboardDismissOnDragDispatched: Boolean

   init {
      this.keyboardDismissOnDrag = var1;
      this.layoutManager = var6;
      this.visibleItemsTracker = var7;
   }

   private fun View.dismissKeyboard() {
      val var2: Any = var1.getContext().getSystemService("input_method");
      (var2 as InputMethodManager).hideSoftInputFromWindow(var1.getWindowToken(), 0);
   }

   private fun getIsScrollingForward(dx: Int, dy: Int): Boolean {
      if (this.layoutManager.getHorizontal()) {
         return var1 > 0;
      } else {
         return var2 > 0;
      }
   }

   public open fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
      super.onScrollStateChanged(var1, var2);
      val var3: Boolean;
      if (var2 == 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (this.keyboardDismissOnDragDispatched && var3) {
         this.keyboardDismissOnDragDispatched = false;
      }
   }

   public open fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
      if (!this.layoutManager.getHorizontal() || var2 != 0) {
         if (this.layoutManager.getHorizontal() || var3 != 0) {
            super.onScrolled(var1, var2, var3);
            this.layoutManager.setScrollingForward(this.getIsScrollingForward(var2, var3));
            this.visibleItemsTracker.updateVisibleItemPositions();
            if (this.keyboardDismissOnDrag && !this.keyboardDismissOnDragDispatched) {
               this.keyboardDismissOnDragDispatched = true;
               this.dismissKeyboard(var1);
            }
         }
      }
   }
}
