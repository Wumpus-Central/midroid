package com.discord.chat.presentation.list

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.discord.crash_reporting.CrashReporting
import kotlin.jvm.internal.r

public class TransitionResilientLinearLayoutManager(context: Context, orientation: Int = 1, reverseLayout: Boolean = false) : LinearLayoutManager {
   private final var disableRecycling: Boolean

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      this.setRecycleChildrenOnDetach(true);
   }

   public fun disableRecycling(disableRecycling: Boolean) {
      this.disableRecycling = var1;
   }

   public open fun removeAndRecycleAllViews(recycler: Recycler) {
      r.h(var1, "recycler");

      try {
         if (this.disableRecycling) {
            super.removeAllViews();
         } else {
            super.removeAndRecycleAllViews(var1);
         }
      } catch (var2: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var2, false, 2, null);
      }
   }

   public open fun removeAndRecycleView(child: View, recycler: Recycler) {
      r.h(var1, "child");
      r.h(var2, "recycler");

      try {
         if (this.disableRecycling) {
            super.removeView(var1);
         } else {
            super.removeAndRecycleView(var1, var2);
         }
      } catch (var3: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var3, false, 2, null);
      }
   }

   public open fun removeAndRecycleViewAt(index: Int, recycler: Recycler) {
      r.h(var2, "recycler");

      try {
         if (this.disableRecycling) {
            super.removeViewAt(var1);
         } else {
            super.removeAndRecycleViewAt(var1, var2);
         }
      } catch (var3: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var3, false, 2, null);
      }
   }
}
