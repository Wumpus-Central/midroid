package com.discord.reactions

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.discord.crash_reporting.CrashReporting
import com.google.android.flexbox.FlexboxLayoutManager
import kotlin.jvm.internal.r

public class ReactionsFlexboxLayoutManager(context: Context) : FlexboxLayoutManager {
   init {
      r.h(var1, "context");
      super(var1);
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
