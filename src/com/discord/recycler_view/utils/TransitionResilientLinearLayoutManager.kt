package com.discord.recycler_view.utils

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import c2.h
import c2.i
import c2.j
import c2.k
import c2.l
import c2.m
import c2.n
import kotlin.jvm.internal.r

public open class TransitionResilientLinearLayoutManager(context: Context,
      orientation: Int = 1,
      reverseLayout: Boolean = false,
      onModifyCapturedException: (Exception) -> Exception = new l()
   )
   : LinearLayoutManager {
   private final val recyclingDelegate: TransitionResilientRecyclingDelegate

   init {
      r.h(var1, "context");
      r.h(var4, "onModifyCapturedException");
      super(var1, var2, var3);
      this.recyclingDelegate = new TransitionResilientRecyclingDelegate(var4);
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: Exception): Exception {
      r.h(var0, "e");
      return var0;
   }

   @JvmStatic
   fun `removeAndRecycleAllViews$lambda$3`(var0: TransitionResilientLinearLayoutManager): Unit {
      var0.removeAllViews();
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleAllViews$lambda$4`(var0: TransitionResilientLinearLayoutManager, var1: RecyclerView.Recycler): Unit {
      r.h(var1, "rec");
      var0.removeAndRecycleAllViews(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleView$lambda$1`(var0: TransitionResilientLinearLayoutManager, var1: View): Unit {
      r.h(var1, "it");
      var0.removeView(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleView$lambda$2`(var0: TransitionResilientLinearLayoutManager, var1: View, var2: RecyclerView.Recycler): Unit {
      r.h(var1, "view");
      r.h(var2, "rec");
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
      r.h(var2, "rec");
      var0.removeAndRecycleViewAt(var1, var2);
      return Unit.a;
   }

   public fun disableRecycling(disableRecycling: Boolean) {
      this.recyclingDelegate.disableRecycling(var1);
   }

   public override fun removeAndRecycleAllViews(recycler: Recycler) {
      r.h(var1, "recycler");
      this.recyclingDelegate.safeRemoveAndRecycleAllViews(var1, new j(this), new k(this));
   }

   public override fun removeAndRecycleView(child: View, recycler: Recycler) {
      r.h(var1, "child");
      r.h(var2, "recycler");
      this.recyclingDelegate.safeRemoveAndRecycleView(var1, var2, new h(this), new i(this));
   }

   public override fun removeAndRecycleViewAt(index: Int, recycler: Recycler) {
      r.h(var2, "recycler");
      this.recyclingDelegate.safeRemoveAndRecycleViewAt(var1, var2, new m(this), new n(this));
   }
}
