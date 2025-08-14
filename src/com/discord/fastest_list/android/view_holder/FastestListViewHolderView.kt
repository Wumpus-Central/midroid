package com.discord.fastest_list.android.view_holder

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.widget.FrameLayout

@SuppressLint(["ViewConstructor"])
internal class FastestListViewHolderView(context: Context) : FrameLayout(var1) {
   public final var onViewTransitioning: (Boolean) -> Unit = new b()

   @JvmStatic
   fun `onViewTransitioning$lambda$0`(var0: Boolean): Unit {
      return Unit.a;
   }

   public open fun endViewTransition(view: View?) {
      super.endViewTransition(var1);
      this.onViewTransitioning.invoke(java.lang.Boolean.FALSE);
   }

   public open fun startViewTransition(view: View?) {
      super.startViewTransition(var1);
      this.onViewTransitioning.invoke(java.lang.Boolean.TRUE);
   }
}
