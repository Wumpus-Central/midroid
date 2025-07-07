package com.discord.recycler_view.utils

import androidx.recyclerview.widget.LinearLayoutManager
import kotlin.jvm.internal.q

internal fun LinearLayoutManager.isPositionVisible(position: Int): Boolean? {
   q.h(var0, "<this>");
   var var3: Int = var0.findFirstCompletelyVisibleItemPosition();
   if (var3.intValue() == -1) {
      var3 = null;
   }

   var var2: Int = var3;
   if (var3 == null) {
      var2 = var0.findFirstVisibleItemPosition();
      if (var2.intValue() == -1) {
         var2 = null;
      }
   }

   var var4: Int = var0.findLastCompletelyVisibleItemPosition();
   if (var4.intValue() == -1) {
      var4 = null;
   }

   var3 = var4;
   if (var4 == null) {
      var3 = var0.findLastVisibleItemPosition();
      if (var3.intValue() == -1) {
         var3 = null;
      }
   }

   return if (var2 != null && var3 != null) new IntRange(var2, var3).contains(var1) else null;
}
