package com.discord.chat.presentation.message.view.media

import android.view.View
import android.view.ViewTreeObserver.OnScrollChangedListener
import kotlin.jvm.internal.q
import vb.f

public class ViewScrollStateListener(view: View, viewScrolling: (Boolean) -> Unit) : OnScrollChangedListener {
   private final val view: View
   private final val viewScrolling: (Boolean) -> Unit
   private final val isScrollingDuration: Long
   private final var isScrollingStoppedRunnable: Runnable

   init {
      q.h(var1, "view");
      q.h(var2, "viewScrolling");
      super();
      this.view = var1;
      this.viewScrolling = var2;
      this.isScrollingDuration = var1.getResources().getInteger(f.b);
      this.isScrollingStoppedRunnable = new b(this);
      this.queueScrollStop();
   }

   @JvmStatic
   fun `isScrollingStoppedRunnable$lambda$0`(var0: ViewScrollStateListener) {
      q.h(var0, "this$0");
      var0.viewScrolling.invoke(java.lang.Boolean.FALSE);
   }

   private fun queueScrollStop() {
      this.view.removeCallbacks(this.isScrollingStoppedRunnable);
      this.view.postDelayed(this.isScrollingStoppedRunnable, this.isScrollingDuration);
   }

   public open fun onScrollChanged() {
      this.viewScrolling.invoke(java.lang.Boolean.TRUE);
      this.queueScrollStop();
   }

   public fun reset() {
      this.view.removeCallbacks(this.isScrollingStoppedRunnable);
   }
}
