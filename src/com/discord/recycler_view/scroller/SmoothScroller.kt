package com.discord.recycler_view.scroller

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.l
import androidx.recyclerview.widget.RecyclerView.State
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
import com.discord.recycler_view.scroller.Scroller.TargetAlignment
import ht.p

internal class SmoothScroller(context: Context, targetPosition: Int, targetAlignment: TargetAlignment, onStopScroll: (() -> Unit)?) : l(var1) {
   private final val targetAlignment: TargetAlignment
   private final val onStopScroll: (() -> Unit)?
   private final var targetView: View?

   init {
      this.targetAlignment = var3;
      this.onStopScroll = var4;
      this.setTargetPosition(var2);
   }

   public open fun calculateDtToFit(viewStart: Int, viewEnd: Int, boxStart: Int, boxEnd: Int, snapPreference: Int): Int {
      if (this.targetAlignment is Scroller.TargetAlignment.Center) {
         return var3 + (var4 - var3) / 2 - (var1 + (var2 - var1) / 2);
      } else if (this.targetAlignment is Scroller.TargetAlignment.Top) {
         return var3 - var1 + (this.targetAlignment as Scroller.TargetAlignment.Top).getOffsetPx();
      } else if (this.targetAlignment is Scroller.TargetAlignment.Anywhere) {
         return super.calculateDtToFit(var1, var2, var3, var4, var5);
      } else {
         throw new p();
      }
   }

   protected open fun onChildAttachedToWindow(child: View) {
      super.onChildAttachedToWindow(var1);
      if (this.targetView == null && this.getChildPosition(var1) == this.getTargetPosition()) {
         this.targetView = var1;
      }
   }

   protected open fun onSeekTargetStep(dx: Int, dy: Int, state: State, action: Action) {
      if (this.targetView != null) {
         this.onTargetFound(this.targetView, var3, var4);
      } else {
         super.onSeekTargetStep(var1, var2, var3, var4);
      }
   }

   protected open fun onStop() {
      super.onStop();
      if (this.onStopScroll != null) {
         this.onStopScroll.invoke();
      }

      this.targetView = null;
   }
}
