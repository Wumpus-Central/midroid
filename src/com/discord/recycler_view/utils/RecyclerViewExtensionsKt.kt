package com.discord.recycler_view.utils

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.discord.recycler_view.scroller.SmoothScroller
import com.discord.recycler_view.scroller.Scroller.TargetAlignment
import kotlin.jvm.internal.q

internal fun RecyclerView.scrollToCenter(position: Int) {
   q.h(var0, "<this>");
   scrollToPositionWithOffset(var0, var1, var0.getHeight() / 2);
}

internal fun RecyclerView.scrollToPositionAnimated(position: Int, targetAlignment: TargetAlignment, onComplete: () -> Unit) {
   q.h(var0, "<this>");
   q.h(var2, "targetAlignment");
   q.h(var3, "onComplete");
   val var4: RecyclerView.LayoutManager = var0.getLayoutManager();
   q.e(var4);
   val var5: Context = var0.getContext();
   q.g(var5, "getContext(...)");
   var4.startSmoothScroll(new SmoothScroller(var5, var1, var2, var3));
}

internal fun RecyclerView.scrollToPositionWithOffset(position: Int, offset: Int) {
   q.h(var0, "<this>");
   val var3: RecyclerView.LayoutManager = var0.getLayoutManager();
   q.f(var3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
   (var3 as LinearLayoutManager).scrollToPositionWithOffset(var1, var2);
}

internal fun RecyclerView.scrollToTop(position: Int, offset: Int) {
   q.h(var0, "<this>");
   val var4: RecyclerView.LayoutManager = var0.getLayoutManager();
   q.f(var4, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
   if ((var4 as LinearLayoutManager).getReverseLayout()) {
      var var3: Int;
      val var5: RecyclerView.ViewHolder = var0.findViewHolderForAdapterPosition(var1);
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
   q.h(var0, "<this>");
   var0.setPadding(0, -1, 0, 0);
   var0.setClipToPadding(true);
}

public fun RecyclerView.toggleSuppressLayout() {
   q.h(var0, "<this>");
   var0.suppressLayout(true);
   var0.suppressLayout(false);
}
