package com.discord.recycler_view.utils

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Recycler
import d9.h
import d9.i
import d9.j
import d9.k
import d9.l
import d9.m
import d9.n

public open class TransitionResilientLinearLayoutManager(context: Context,
   orientation: Int = 1,
   reverseLayout: Boolean = false,
   onModifyCapturedException: (Exception) -> Exception = new l()
) : LinearLayoutManager(var1, var2, var3) {
   private final val recyclingDelegate: TransitionResilientRecyclingDelegate

   init {
      this.recyclingDelegate = new TransitionResilientRecyclingDelegate(var4);
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: Exception): Exception {
      return var0;
   }

   @JvmStatic
   fun `removeAndRecycleAllViews$lambda$3`(var0: TransitionResilientLinearLayoutManager): Unit {
      var0.removeAllViews();
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleAllViews$lambda$4`(var0: TransitionResilientLinearLayoutManager, var1: Recycler): Unit {
      var0.removeAndRecycleAllViews(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleView$lambda$1`(var0: TransitionResilientLinearLayoutManager, var1: View): Unit {
      var0.removeView(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleView$lambda$2`(var0: TransitionResilientLinearLayoutManager, var1: View, var2: Recycler): Unit {
      var0.removeAndRecycleView(var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleViewAt$lambda$5`(var0: TransitionResilientLinearLayoutManager, var1: Int): Unit {
      var0.removeViewAt(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleViewAt$lambda$6`(var0: TransitionResilientLinearLayoutManager, var1: Int, var2: Recycler): Unit {
      var0.removeAndRecycleViewAt(var1, var2);
      return Unit.a;
   }

   public fun disableRecycling(disableRecycling: Boolean) {
      this.recyclingDelegate.disableRecycling(var1);
   }

   public open fun removeAndRecycleAllViews(recycler: Recycler) {
      this.recyclingDelegate.safeRemoveAndRecycleAllViews(var1, new j(this), new k(this));
   }

   public open fun removeAndRecycleView(child: View, recycler: Recycler) {
      this.recyclingDelegate.safeRemoveAndRecycleView(var1, var2, new h(this), new i(this));
   }

   public open fun removeAndRecycleViewAt(index: Int, recycler: Recycler) {
      this.recyclingDelegate.safeRemoveAndRecycleViewAt(var1, var2, new m(this), new n(this));
   }
}
