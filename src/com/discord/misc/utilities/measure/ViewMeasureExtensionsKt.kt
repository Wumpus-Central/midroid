@file:SourceDebugExtension(["SMAP\nViewMeasureExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewMeasureExtensions.kt\ncom/discord/misc/utilities/measure/ViewMeasureExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,42:1\n1797#2,2:43\n1799#2:46\n297#3:45\n*S KotlinDebug\n*F\n+ 1 ViewMeasureExtensions.kt\ncom/discord/misc/utilities/measure/ViewMeasureExtensionsKt\n*L\n30#1:43,2\n30#1:46\n32#1:45\n*E\n"])

package com.discord.misc.utilities.measure

import android.view.View
import android.view.ViewGroup
import android.view.View.MeasureSpec
import kotlin.jvm.internal.SourceDebugExtension

public fun ViewGroup.getMaximumSizeOfChildren(widthMeasureSpec: Int): Pair<Int, Int> {
   val var2: Int = 0;
   val var3: IntRange = kotlin.ranges.e.w(0, var0.getChildCount());
   val var5: Pair = new Pair(var2, var2);
   val var6: java.util.Iterator = var3.iterator();
   if (var6.hasNext()) {
      val var4: View = var0.getChildAt((var6 as q0).nextInt());
      if (var4.getVisibility() == 8) {
         return var5;
      } else {
         var4.measure(var1, 0);
         return new Pair(
            Math.max((var5.c() as java.lang.Number).intValue(), var4.getMeasuredWidth()),
            Math.max((var5.d() as java.lang.Number).intValue(), var4.getMeasuredHeight())
         );
      }
   } else {
      return var5;
   }
}

public fun View.measureAndLayout() {
   var0.measure(MeasureSpec.makeMeasureSpec(var0.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(var0.getHeight(), 1073741824));
   var0.layout(var0.getLeft(), var0.getTop(), var0.getRight(), var0.getBottom());
}
