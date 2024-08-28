package com.discord.misc.utilities.view

import android.view.View
import android.view.ViewGroup
import kotlin.jvm.internal.q

public fun ViewGroup.setUpLayoutForList(listSize: Int, inflater: () -> View) {
   q.h(var0, "<this>");
   q.h(var2, "inflater");
   if (var1 != var0.getChildCount()) {
      val var4: Int = var0.getChildCount();
      var var3: Int = 0;
      if (var4 > var1) {
         var0.removeViews(0, var0.getChildCount() - var1);
      } else if (var0.getChildCount() < var1) {
         for (int var5 = var0.getChildCount(); var3 < var1 - var5; var3++) {
            var0.addView(var2.invoke() as View);
         }
      }
   }
}
