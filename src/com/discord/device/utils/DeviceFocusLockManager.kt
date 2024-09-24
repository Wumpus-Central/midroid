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
      val var6: LinkedHashSet = new LinkedHashSet();
      val var7: LinkedHashSet = new LinkedHashSet();

      for (View var4 : var1) {
         val var9: ArrayList = new ArrayList();

         while (var4.getParent() instanceof ViewGroup) {
            val var5: ViewParent = var4.getParent();
            q.f(var5, "null cannot be cast to non-null type android.view.ViewGroup");
            val var11: ViewGroup = var5 as ViewGroup;
            if (var7.contains(var5 as ViewGroup)) {
               var9.clear();
               break;
            }

            val var3: Int = var11.indexOfChild(var4);

            for (int var2 = 0; var2 < var3; var2++) {
               var4 = var11.getChildAt(var2);
               if (!var1.contains(var4)) {
                  q.e(var4);
                  var9.add(var4);
               }
            }

            var7.add(var11);
            var4 = var11;
         }

         var6.addAll(var9);
      }

      return i.R0(var6);
   }

   public fun disableFocusLock() {
      val var2: java.util.Iterator = focusExcludedViews.entrySet().iterator();

      while (var2.hasNext()) {
         val var4: View = (var2.next() as Entry).getValue() as View;
         val var3: Int = focusExcludedViewPreviousImportantForAccessibilityValue.get(var4.getId());
         val var1: Int;
         if (var3 != null) {
            var1 = var3;
         } else {
            var1 = 0;
         }

         var4.setImportantForAccessibility(var1);
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
