package com.discord.chat.presentation.list

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.discord.crash_reporting.CrashReporting
import kotlin.jvm.internal.r

public class CatchingLinearLayoutManager(context: Context, orientation: Int = 1, reverseLayout: Boolean = false) : LinearLayoutManager {
   init {
      r.h(var1, "context");
      super(var1, var2, var3);
   }

   public open fun removeAndRecycleView(child: View, recycler: Recycler) {
      r.h(var1, "child");
      r.h(var2, "recycler");

      try {
         super.removeAndRecycleView(var1, var2);
      } catch (var3: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var3, false, 2, null);
      }
   }

   public open fun removeAndRecycleViewAt(index: Int, recycler: Recycler) {
      r.h(var2, "recycler");

      try {
         super.removeAndRecycleViewAt(var1, var2);
      } catch (var3: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var3, false, 2, null);
      }
   }
}
