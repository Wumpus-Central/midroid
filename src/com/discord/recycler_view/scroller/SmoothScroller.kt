package com.discord.recycler_view.scroller

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.i
import androidx.recyclerview.widget.RecyclerView.State
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
import ch.p
import com.discord.recycler_view.scroller.Scroller.TargetAlignment
import kotlin.jvm.internal.q

internal class SmoothScroller(context: Context, targetPosition: Int, targetAlignment: TargetAlignment, onStopScroll: (() -> Unit)?) : i {
   private final val targetAlignment: TargetAlignment
   private final val onStopScroll: (() -> Unit)?
   private final var targetView: View?

   init {
      q.h(var1, "context");
      q.h(var3, "targetAlignment");
      super(var1);
      this.targetAlignment = var3;
      this.onStopScroll = var4;
      this.setTargetPosition(var2);
   }

   public override fun calculateDtToFit(viewStart: Int, viewEnd: Int, boxStart: Int, boxEnd: Int, snapPreference: Int): Int {
      if (this.targetAlignment is Scroller.TargetAlignment.Center) {
         var1 = var3 + (var4 - var3) / 2 - (var1 + (var2 - var1) / 2);
      } else if (this.targetAlignment is Scroller.TargetAlignment.Top) {
         var1 = var3 - var1 + (this.targetAlignment as Scroller.TargetAlignment.Top).getOffsetPx();
      } else {
         if (this.targetAlignment !is Scroller.TargetAlignment.Anywhere) {
            throw new p();
         }

         var1 = super.calculateDtToFit(var1, var2, var3, var4, var5);
      }

      return var1;
   }

   protected override fun onChildAttachedToWindow(child: View) {
      q.h(var1, "child");
      super.onChildAttachedToWindow(var1);
      if (this.targetView == null && this.getChildPosition(var1) == this.getTargetPosition()) {
         this.targetView = var1;
      }
   }

   protected override fun onSeekTargetStep(dx: Int, dy: Int, state: State, action: Action) {
      q.h(var3, "state");
      q.h(var4, "action");
      if (this.targetView != null) {
         this.onTargetFound(this.targetView, var3, var4);
      } else {
         super.onSeekTargetStep(var1, var2, var3, var4);
      }
   }

   protected override fun onStop() {
      super.onStop();
      if (this.onStopScroll != null) {
         this.onStopScroll.invoke();
      }

      this.targetView = null;
   }
}
