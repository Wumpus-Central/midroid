package com.discord.recycler_view.utils

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.recycler_view.scroller.SmoothScroller
import com.discord.recycler_view.scroller.Scroller.TargetAlignment

internal fun RecyclerView.scrollToCenter(position: Int) {
   val var3: LayoutManager = var0.getLayoutManager();
   if ((var3 as LinearLayoutManager).getReverseLayout()) {
      var var2: Int;
      val var4: ViewHolder = var0.findViewHolderForAdapterPosition(var1);
      label17:
      if (var4 != null && var4.itemView != null) {
         var2 = var4.itemView.getHeight();
         break label17;
      } else {
         var2 = 0;
      }

      if (var2 == 0) {
         var0.scrollToPosition(var1);
      } else {
         scrollToPositionWithOffset(var0, var1, var0.getHeight() / 2 - var2 / 2);
      }
   } else {
      scrollToPositionWithOffset(var0, var1, var0.getHeight() / 2);
   }
}

internal fun RecyclerView.scrollToPositionAnimated(position: Int, targetAlignment: TargetAlignment, onComplete: () -> Unit) {
   val var4: LayoutManager = var0.getLayoutManager();
   val var5: Context = var0.getContext();
   var4.startSmoothScroll(new SmoothScroller(var5, var1, var2, var3));
}

internal fun RecyclerView.scrollToPositionWithOffset(position: Int, offset: Int) {
   val var3: LayoutManager = var0.getLayoutManager();
   (var3 as LinearLayoutManager).scrollToPositionWithOffset(var1, var2);
}

internal fun RecyclerView.scrollToTop(position: Int, offset: Int) {
   val var4: LayoutManager = var0.getLayoutManager();
   if ((var4 as LinearLayoutManager).getReverseLayout()) {
      var var3: Int;
      val var5: ViewHolder = var0.findViewHolderForAdapterPosition(var1);
      label17:
      if (var5 != null && var5.itemView != null) {
         var3 = var5.itemView.getHeight();
         break label17;
      } else {
         var3 = 0;
      }

      if (var3 == 0) {
         var0.scrollToPosition(var1);
      } else {
         scrollToPositionWithOffset(var0, var1, var0.getHeight() - var3 * 2 - var2);
      }
   } else {
      scrollToPositionWithOffset(var0, var1, var2);
   }
}

public fun RecyclerView.setReactNativeClipToPadding() {
   var0.setPadding(0, -1, 0, 0);
   var0.setClipToPadding(true);
}

public fun RecyclerView.toggleSuppressLayout() {
   var0.suppressLayout(true);
   var0.suppressLayout(false);
}
