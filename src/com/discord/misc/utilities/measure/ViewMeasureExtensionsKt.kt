@file:SourceDebugExtension(["SMAP\nViewMeasureExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewMeasureExtensions.kt\ncom/discord/misc/utilities/measure/ViewMeasureExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1797#2,3:43\n*S KotlinDebug\n*F\n+ 1 ViewMeasureExtensions.kt\ncom/discord/misc/utilities/measure/ViewMeasureExtensionsKt\n*L\n30#1:43,3\n*E\n"])

package com.discord.misc.utilities.measure

import android.view.View
import android.view.ViewGroup
import android.view.View.MeasureSpec
import kotlin.jvm.internal.SourceDebugExtension

public fun ViewGroup.getMaximumSizeOfChildren(widthMeasureSpec: Int): Pair<Int, Int> {
   val var2: Int = var0.getChildCount();
   val var3: Int = 0;
   val var4: IntRange = d.s(0, var2);
   val var6: Pair = new Pair(var3, var3);
   val var7: java.util.Iterator = var4.iterator();
   if (var7.hasNext()) {
      val var5: View = var0.getChildAt((var7 as I).nextInt());
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
   var0.measure(MeasureSpec.makeMeasureSpec(var0.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(var0.getHeight(), 1073741824));
   var0.layout(var0.getLeft(), var0.getTop(), var0.getRight(), var0.getBottom());
}
