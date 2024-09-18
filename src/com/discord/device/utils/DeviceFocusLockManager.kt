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
      val var7: LinkedHashSet = new LinkedHashSet();
      val var8: LinkedHashSet = new LinkedHashSet();

      for (View var4 : var1) {
         val var6: ArrayList = new ArrayList();

         while (var4.getParent() instanceof ViewGroup) {
            val var5: ViewParent = var4.getParent();
            q.f(var5, "null cannot be cast to non-null type android.view.ViewGroup");
            val var11: ViewGroup = var5 as ViewGroup;
            if (var8.contains(var5 as ViewGroup)) {
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

            var8.add(var11);
            var4 = var11;
         }

         var7.addAll(var6);
      }

      return i.Q0(var7);
   }

   public fun disableFocusLock() {
      val var4: java.util.Iterator = focusExcludedViews.entrySet().iterator();

      while (var4.hasNext()) {
         val var3: View = (var4.next() as Entry).getValue() as View;
         val var2: Int = focusExcludedViewPreviousImportantForAccessibilityValue.get(var3.getId());
         val var1: Int;
         if (var2 != null) {
            var1 = var2;
         } else {
            var1 = 0;
         }

         var3.setImportantForAccessibility(var1);
      }

      focusExcludedViews.clear();
      focusExcludedViewPreviousImportantForAccessibilityValue.clear();
   }

   public fun enableFocusLock(targetViews: List<View>) {
      q.h(var1, "targetViews");
      this.disableFocusLock();

      for (View var2 : this.getParallelAncestorViewTrees(var1)) {
         if (var2.getId() > 0 && var2.getImportantForAccessibility() != 4) {
            focusExcludedViews.put(var2.getId(), var2);
            focusExcludedViewPreviousImportantForAccessibilityValue.put(var2.getId(), var2.getImportantForAccessibility());
            var2.setImportantForAccessibility(4);
         }
      }
   }
}
