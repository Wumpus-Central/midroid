package com.discord.recycler_view.utils

import androidx.recyclerview.widget.LinearLayoutManager
import kotlin.jvm.internal.r

internal fun LinearLayoutManager.isPositionVisible(position: Int): Boolean? {
   r.h(var0, "<this>");
   var var5: Int = var0.findFirstCompletelyVisibleItemPosition();
   var var7: Boolean;
   if (var5.intValue() != -1) {
      var7 = true;
   } else {
      var7 = false;
   }

   if (!var7) {
      var5 = null;
   }

   var var4: Int = var5;
   if (var5 == null) {
      var4 = var0.findFirstVisibleItemPosition();
      if (var4.intValue() != -1) {
         var7 = true;
      } else {
         var7 = false;
      }

      if (!var7) {
         var4 = null;
      }
   }

   var5 = var0.findLastCompletelyVisibleItemPosition();
   if (var5.intValue() != -1) {
      var7 = true;
   } else {
      var7 = false;
   }

   if (!var7) {
      var5 = null;
   }

   var var6: Int = var5;
   if (var5 == null) {
      var6 = var0.findLastVisibleItemPosition();
      if (var6.intValue() != -1) {
         var7 = true;
      } else {
         var7 = false;
      }

      if (!var7) {
         var6 = null;
      }
   }

   return if (var4 != null && var6 != null) new IntRange(var4, var6).contains(var1) else null;
}
