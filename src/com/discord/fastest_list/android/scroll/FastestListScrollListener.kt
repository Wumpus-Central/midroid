package com.discord.fastest_list.android.scroll

import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.recyclerview.widget.RecyclerView
import com.discord.fastest_list.android.FastestListLayoutManager
import com.discord.fastest_list.android.FastestListVisibleItemsTracker
import com.discord.recycler_view.scroll.DebouncedScrollListener
import kotlin.jvm.internal.r

internal class FastestListScrollListener(keyboardDismissOnDrag: Boolean,
      onScrollEventThrottle: Long,
      onScrolled: (RecyclerView, Int, Int) -> Unit,
      onDragStateChanged: (Boolean) -> Unit,
      layoutManager: FastestListLayoutManager,
      visibleItemsTracker: FastestListVisibleItemsTracker
   )
   : DebouncedScrollListener {
   public final var keyboardDismissOnDrag: Boolean
   private final val layoutManager: FastestListLayoutManager
   private final val visibleItemsTracker: FastestListVisibleItemsTracker
   private final var keyboardDismissOnDragDispatched: Boolean

   init {
      r.h(var4, "onScrolled");
      r.h(var5, "onDragStateChanged");
      r.h(var6, "layoutManager");
      r.h(var7, "visibleItemsTracker");
      super(var2, var4, null, var5, 4, null);
      this.keyboardDismissOnDrag = var1;
      this.layoutManager = var6;
      this.visibleItemsTracker = var7;
   }

   private fun View.dismissKeyboard() {
      val var2: Any = var1.getContext().getSystemService("input_method");
      r.f(var2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
      (var2 as InputMethodManager).hideSoftInputFromWindow(var1.getWindowToken(), 0);
   }

   private fun getIsScrollingForward(dx: Int, dy: Int): Boolean {
      val var4: Boolean = this.layoutManager.getHorizontal();
      var var3: Boolean = true;
      if (if (var4) var1 <= 0 else var2 <= 0) {
         var3 = false;
      }

      return var3;
   }

   public open fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
      r.h(var1, "recyclerView");
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
      r.h(var1, "recyclerView");
      var var4: Boolean;
      if (this.layoutManager.getHorizontal() && var2 == 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (!var4) {
         var4 = false;
         if (!this.layoutManager.getHorizontal()) {
            var4 = false;
            if (var3 == 0) {
               var4 = true;
            }
         }

         if (!var4) {
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
