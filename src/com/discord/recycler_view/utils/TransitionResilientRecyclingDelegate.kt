package com.discord.recycler_view.utils

import a2.o
import android.view.View
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.discord.crash_reporting.CrashReporting

public class TransitionResilientRecyclingDelegate(onModifyCapturedException: (Exception) -> Exception = new o()) {
   private final val onModifyCapturedException: (Exception) -> Exception
   private final var disableRecycling: Boolean

   fun TransitionResilientRecyclingDelegate() {
      this(null, 1, null);
   }

   init {
      this.onModifyCapturedException = var1;
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: Exception): Exception {
      return var0;
   }

   private fun captureException(e: Exception) {
      CrashReporting.captureException$default(CrashReporting.INSTANCE, this.onModifyCapturedException.invoke(var1) as java.lang.Throwable, false, 2, null);
   }

   public fun disableRecycling(disableRecycling: Boolean) {
      this.disableRecycling = var1;
   }

   public fun safeRemoveAndRecycleAllViews(recycler: Recycler, fallbackRemoveAllViews: () -> Unit, superRemoveAndRecycleAllViews: (Recycler) -> Unit) {
      try {
         if (this.disableRecycling) {
            var2.invoke();
         } else {
            var3.invoke(var1);
         }
      } catch (var4: Exception) {
         this.captureException(var4);
      }
   }

   public fun safeRemoveAndRecycleView(child: View, recycler: Recycler, fallbackRemoveView: (View) -> Unit, superRemoveAndRecycleView: (View, Recycler) -> Unit) {
      try {
         if (this.disableRecycling) {
            var3.invoke(var1);
         } else {
            var4.invoke(var1, var2);
         }
      } catch (var5: Exception) {
         this.captureException(var5);
      }
   }

   public fun safeRemoveAndRecycleViewAt(
      index: Int,
      recycler: Recycler,
      fallbackRemoveViewAt: (Int) -> Unit,
      superRemoveAndRecycleViewAt: (Int, Recycler) -> Unit
   ) {
      try {
         if (this.disableRecycling) {
            var3.invoke(var1);
         } else {
            var4.invoke(var1, var2);
         }
      } catch (var5: Exception) {
         this.captureException(var5);
      }
   }
}
