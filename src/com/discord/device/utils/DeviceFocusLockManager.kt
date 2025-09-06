package com.discord.device.utils

import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Map.Entry
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nDeviceFocusLockManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFocusLockManager.kt\ncom/discord/device/utils/DeviceFocusLockManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,76:1\n1863#2,2:77\n216#3,2:79\n*S KotlinDebug\n*F\n+ 1 DeviceFocusLockManager.kt\ncom/discord/device/utils/DeviceFocusLockManager\n*L\n13#1:77,2\n27#1:79,2\n*E\n"])
public object DeviceFocusLockManager {
   private final val focusExcludedViews: MutableMap<Int, View> = new LinkedHashMap()
   private final val focusExcludedViewPreviousImportantForAccessibilityValue: MutableMap<Int, Int> = new LinkedHashMap()

   private fun getParallelAncestorViewTrees(targetViews: List<View>): List<View> {
      val var6: LinkedHashSet = new LinkedHashSet();
      val var9: LinkedHashSet = new LinkedHashSet();

      for (View var4 : var1) {
         val var8: ArrayList = new ArrayList();

         while (var4.getParent() instanceof ViewGroup) {
            val var5: ViewParent = var4.getParent();
            val var11: ViewGroup = var5 as ViewGroup;
            if (var9.contains(var5 as ViewGroup)) {
               var8.clear();
               break;
            }

            val var3: Int = var11.indexOfChild(var4);

            for (int var2 = 0; var2 < var3; var2++) {
               var4 = var11.getChildAt(var2);
               if (!var1.contains(var4)) {
                  var8.add(var4);
               }
            }

            var9.add(var11);
            var4 = var11;
         }

         var6.addAll(var8);
      }

      return CollectionsKt.T0(var6);
   }

   public fun disableFocusLock() {
      val var2: java.util.Iterator = focusExcludedViews.entrySet().iterator();

      while (var2.hasNext()) {
         val var3: View = (var2.next() as Entry).getValue() as View;
         val var4: Int = focusExcludedViewPreviousImportantForAccessibilityValue.get(var3.getId());
         val var1: Int;
         if (var4 != null) {
            var1 = var4;
         } else {
            var1 = 0;
         }

         var3.setImportantForAccessibility(var1);
      }

      focusExcludedViews.clear();
      focusExcludedViewPreviousImportantForAccessibilityValue.clear();
   }

   public fun enableFocusLock(targetViews: List<View>) {
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
