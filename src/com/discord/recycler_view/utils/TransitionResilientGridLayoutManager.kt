package com.discord.recycler_view.utils

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView.Recycler
import d9.a
import d9.b

public open class TransitionResilientGridLayoutManager(context: Context, rowSize: Int, onModifyCapturedException: (Exception) -> Exception = new a()) : GridLayoutManager(
      var1, var2
   ) {
   private final val recyclingDelegate: TransitionResilientRecyclingDelegate

   init {
      this.recyclingDelegate = new TransitionResilientRecyclingDelegate(var3);
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: Exception): Exception {
      return var0;
   }

   @JvmStatic
   fun `removeAndRecycleAllViews$lambda$3`(var0: TransitionResilientGridLayoutManager): Unit {
      var0.removeAllViews();
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleAllViews$lambda$4`(var0: TransitionResilientGridLayoutManager, var1: Recycler): Unit {
      var0.removeAndRecycleAllViews(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleView$lambda$1`(var0: TransitionResilientGridLayoutManager, var1: View): Unit {
      var0.removeView(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleView$lambda$2`(var0: TransitionResilientGridLayoutManager, var1: View, var2: Recycler): Unit {
      var0.removeAndRecycleView(var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleViewAt$lambda$5`(var0: TransitionResilientGridLayoutManager, var1: Int): Unit {
      var0.removeViewAt(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `removeAndRecycleViewAt$lambda$6`(var0: TransitionResilientGridLayoutManager, var1: Int, var2: Recycler): Unit {
      var0.removeAndRecycleViewAt(var1, var2);
      return Unit.a;
   }

   public fun disableRecycling(disableRecycling: Boolean) {
      this.recyclingDelegate.disableRecycling(var1);
   }

   public open fun removeAndRecycleAllViews(recycler: Recycler) {
      this.recyclingDelegate.safeRemoveAndRecycleAllViews(var1, new d9.f(this), new d9.g(this));
   }

   public open fun removeAndRecycleView(child: View, recycler: Recycler) {
      this.recyclingDelegate.safeRemoveAndRecycleView(var1, var2, new b(this), new d9.c(this));
   }

   public open fun removeAndRecycleViewAt(index: Int, recycler: Recycler) {
      this.recyclingDelegate.safeRemoveAndRecycleViewAt(var1, var2, new d9.d(this), new d9.e(this));
   }
}
