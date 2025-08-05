package com.discord.recycler_view.utils

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Recycler
import c2.a
import com.discord.crash_reporting.CrashReporting
import kotlin.jvm.internal.r

public open class TransitionResilientLinearLayoutManager(context: Context,
      orientation: Int = 1,
      reverseLayout: Boolean = false,
      onModifyCapturedException: (Exception) -> Exception = new a()
   )
   : LinearLayoutManager {
   private final val onModifyCapturedException: (Exception) -> Exception
   private final var disableRecycling: Boolean

   init {
      r.h(var1, "context");
      r.h(var4, "onModifyCapturedException");
      super(var1, var2, var3);
      this.onModifyCapturedException = var4;
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: Exception): Exception {
      r.h(var0, "e");
      return var0;
   }

   private fun captureException(e: Exception) {
      CrashReporting.captureException$default(CrashReporting.INSTANCE, this.onModifyCapturedException.invoke(var1) as java.lang.Throwable, false, 2, null);
   }

   public fun disableRecycling(disableRecycling: Boolean) {
      this.disableRecycling = var1;
   }

   public override fun removeAndRecycleAllViews(recycler: Recycler) {
      r.h(var1, "recycler");

      try {
         if (this.disableRecycling) {
            super.removeAllViews();
         } else {
            super.removeAndRecycleAllViews(var1);
         }
      } catch (var2: Exception) {
         this.captureException(var2);
      }
   }

   public override fun removeAndRecycleView(child: View, recycler: Recycler) {
      r.h(var1, "child");
      r.h(var2, "recycler");

      try {
         if (this.disableRecycling) {
            super.removeView(var1);
         } else {
            super.removeAndRecycleView(var1, var2);
         }
      } catch (var3: Exception) {
         this.captureException(var3);
      }
   }

   public override fun removeAndRecycleViewAt(index: Int, recycler: Recycler) {
      r.h(var2, "recycler");

      try {
         if (this.disableRecycling) {
            super.removeViewAt(var1);
         } else {
            super.removeAndRecycleViewAt(var1, var2);
         }
      } catch (var3: Exception) {
         this.captureException(var3);
      }
   }
}
