package com.discord.device.utils

import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Map.Entry
import kotlin.jvm.internal.q

public object DeviceFocusLockManager {
   private final val focusExcludedViewPreviousImportantForAccessibilityValue: MutableMap<Int, Int> = new LinkedHashMap()
   private final val focusExcludedViews: MutableMap<Int, View> = new LinkedHashMap()

   private fun getParallelAncestorViewTrees(targetViews: List<View>): List<View> {
      val var8: LinkedHashSet = new LinkedHashSet();
      val var9: LinkedHashSet = new LinkedHashSet();

      for (View var4 : var1) {
         val var6: ArrayList = new ArrayList();

         while (var4.getParent() instanceof ViewGroup) {
            val var5: ViewParent = var4.getParent();
            q.f(var5, "null cannot be cast to non-null type android.view.ViewGroup");
            val var11: ViewGroup = var5 as ViewGroup;
            if (var9.contains(var5 as ViewGroup)) {
               var6.clear();
               break;
            }

            val var3: Int = var11.indexOfChild(var4);

            for (int var2 = 0; var2 < var3; var2++) {
               var4 = var11.getChildAt(var2);
               if (!var1.contains(var4)) {
                  q.e(var4);
                  var6.add(var4);
               }
            }

            var9.add(var11);
            var4 = var11;
         }

         var8.addAll(var6);
      }

      return i.R0(var8);
   }

   public fun disableFocusLock() {
      val var3: java.util.Iterator = focusExcludedViews.entrySet().iterator();

      while (var3.hasNext()) {
         val var2: View = (var3.next() as Entry).getValue() as View;
         val var4: Int = focusExcludedViewPreviousImportantForAccessibilityValue.get(var2.getId());
         val var1: Int;
         if (var4 != null) {
            var1 = var4;
         } else {
            var1 = 0;
         }

         var2.setImportantForAccessibility(var1);
      }

      focusExcludedViews.clear();
      focusExcludedViewPreviousImportantForAccessibilityValue.clear();
   }

   public fun enableFocusLock(targetViews: List<View>) {
      q.h(var1, "targetViews");
      this.disableFocusLock();

      for (View var3 : this.getParallelAncestorViewTrees(var1)) {
         if (var3.getId() > 0 && var3.getImportantForAccessibility() != 4) {
            focusExcludedViews.put(var3.getId(), var3);
            focusExcludedViewPreviousImportantForAccessibilityValue.put(var3.getId(), var3.getImportantForAccessibility());
            var3.setImportantForAccessibility(4);
         }
      }
   }
}
