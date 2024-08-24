package com.discord.recycler_view.utils

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.recycler_view.scroller.SmoothScroller
import com.discord.recycler_view.scroller.Scroller.TargetAlignment
import kotlin.jvm.internal.r

internal fun RecyclerView.scrollToCenter(position: Int) {
   r.h(var0, "<this>");
   scrollToPositionWithOffset(var0, var1, var0.getHeight() / 2);
}

internal fun RecyclerView.scrollToPositionAnimated(position: Int, targetAlignment: TargetAlignment, onComplete: () -> Unit) {
   r.h(var0, "<this>");
   r.h(var2, "targetAlignment");
   r.h(var3, "onComplete");
   val var4: LayoutManager = var0.getLayoutManager();
   r.e(var4);
   val var5: Context = var0.getContext();
   r.g(var5, "context");
   var4.startSmoothScroll(new SmoothScroller(var5, var1, var2, var3));
}

internal fun RecyclerView.scrollToPositionWithOffset(position: Int, offset: Int) {
   r.h(var0, "<this>");
   val var3: LayoutManager = var0.getLayoutManager();
   r.f(var3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
   (var3 as LinearLayoutManager).scrollToPositionWithOffset(var1, var2);
}

internal fun RecyclerView.scrollToTop(position: Int, offset: Int) {
   r.h(var0, "<this>");
   val var4: LayoutManager = var0.getLayoutManager();
   r.f(var4, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
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
   r.h(var0, "<this>");
   var0.setPadding(0, -1, 0, 0);
   var0.setClipToPadding(true);
}

public fun RecyclerView.toggleSuppressLayout() {
   r.h(var0, "<this>");
   var0.suppressLayout(true);
   var0.suppressLayout(false);
}
