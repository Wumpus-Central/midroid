@file:SourceDebugExtension(["SMAP\nViewGroupUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewGroupUtils.kt\ncom/discord/misc/utilities/view/ViewGroupUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"])

package com.discord.misc.utilities.view

import android.view.View
import android.view.ViewGroup
import kotlin.jvm.internal.SourceDebugExtension

public fun ViewGroup.setUpLayoutForList(listSize: Int, inflater: () -> View) {
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
