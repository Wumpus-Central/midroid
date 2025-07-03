package com.discord.recycler_view.utils

import androidx.recyclerview.widget.LinearLayoutManager
import kotlin.jvm.internal.r

internal fun LinearLayoutManager.isPositionVisible(position: Int, prioritizeCompletelyVisible: Boolean): Boolean? {
   var var3: Int;
   label48: {
      r.h(var0, "<this>");
      if (var2) {
         var var4: Int = var0.findFirstCompletelyVisibleItemPosition();
         if (var4.intValue() == -1) {
            var4 = null;
         }

         var3 = var4;
         if (var4 != null) {
            break label48;
         }

         var3 = var0.findFirstVisibleItemPosition();
         if (var3.intValue() != -1) {
            break label48;
         }
      } else {
         var3 = var0.findFirstVisibleItemPosition();
         if (var3.intValue() != -1) {
            break label48;
         }
      }

      var3 = null;
   }

   if (var2) {
      var var5: Int = var0.findLastCompletelyVisibleItemPosition();
      if (var5.intValue() == -1) {
         var5 = null;
      }

      if (var5 != null) {
         return if (var3 != null && var5 != null) new IntRange(var3, var5).contains(var1) else null;
      }

      val var6: Int = var0.findLastVisibleItemPosition();
      if (var6.intValue() != -1) {
         return if (var3 != null && var6 != null) new IntRange(var3, var6).contains(var1) else null;
      }
   } else {
      val var7: Int = var0.findLastVisibleItemPosition();
      if (var7.intValue() != -1) {
         return if (var3 != null && var7 != null) new IntRange(var3, var7).contains(var1) else null;
      }
   }

   return if (var3 != null && null != null) new IntRange(var3, null).contains(var1) else null;
}
