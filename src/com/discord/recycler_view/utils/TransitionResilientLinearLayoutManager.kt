package com.discord.recycler_view.utils

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import b2.h
import b2.i
import b2.j
import b2.k
import b2.l
import b2.m
import b2.n

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
   fun `removeAndRecycleAllViews$lambda$4`(var0: TransitionResilientLinearLayoutManager, var1: RecyclerView.Recycler): Unit {
      var0.removeAndRecycleAllViews(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleView$lambda$1`(var0: TransitionResilientLinearLayoutManager, var1: View): Unit {
      var0.removeView(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleView$lambda$2`(var0: TransitionResilientLinearLayoutManager, var1: View, var2: RecyclerView.Recycler): Unit {
      var0.removeAndRecycleView(var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleViewAt$lambda$5`(var0: TransitionResilientLinearLayoutManager, var1: Int): Unit {
      var0.removeViewAt(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleViewAt$lambda$6`(var0: TransitionResilientLinearLayoutManager, var1: Int, var2: RecyclerView.Recycler): Unit {
      var0.removeAndRecycleViewAt(var1, var2);
      return Unit.a;
   }

   public fun disableRecycling(disableRecycling: Boolean) {
      this.recyclingDelegate.disableRecycling(var1);
   }

   public override fun removeAndRecycleAllViews(recycler: Recycler) {
      this.recyclingDelegate.safeRemoveAndRecycleAllViews(var1, new j(this), new k(this));
   }

   public override fun removeAndRecycleView(child: View, recycler: Recycler) {
      this.recyclingDelegate.safeRemoveAndRecycleView(var1, var2, new h(this), new i(this));
   }

   public override fun removeAndRecycleViewAt(index: Int, recycler: Recycler) {
      this.recyclingDelegate.safeRemoveAndRecycleViewAt(var1, var2, new m(this), new n(this));
   }
}
