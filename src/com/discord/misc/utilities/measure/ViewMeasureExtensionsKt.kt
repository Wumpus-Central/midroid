package com.discord.misc.utilities.measure

import android.view.View
import android.view.ViewGroup
import android.view.View.MeasureSpec
import fh.p
import kotlin.jvm.internal.r
import vh.h

public fun ViewGroup.getMaximumSizeOfChildren(widthMeasureSpec: Int): Pair<Int, Int> {
   r.h(var0, "<this>");
   val var2: Int = var0.getChildCount();
   val var3: Int = 0;
   val var4: IntRange = h.r(0, var2);
   val var6: Pair = new Pair(var3, var3);
   val var7: java.util.Iterator = var4.iterator();
   if (var7.hasNext()) {
      val var5: View = var0.getChildAt((var7 as p).nextInt());
      if (var5.getVisibility() == 8) {
         return var6;
      } else {
         var5.measure(var1, 0);
         return new Pair(
            Math.max((var6.c() as java.lang.Number).intValue(), var5.getMeasuredWidth()),
            Math.max((var6.d() as java.lang.Number).intValue(), var5.getMeasuredHeight())
         );
      }
   } else {
      return var6;
   }
}

public fun View.measureAndLayout() {
   r.h(var0, "<this>");
   var0.measure(MeasureSpec.makeMeasureSpec(var0.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(var0.getHeight(), 1073741824));
   var0.layout(var0.getLeft(), var0.getTop(), var0.getRight(), var0.getBottom());
}
