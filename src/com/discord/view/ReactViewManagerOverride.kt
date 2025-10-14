package com.discord.view

import android.view.View
import com.discord.R
import com.facebook.react.R.id
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.views.view.ReactViewGroup
import com.facebook.react.views.view.ReactViewManager
import io.sentry.e
import io.sentry.p1

@ReactModule(canOverrideExistingModule = true, name = "RCTView")
public class ReactViewManagerOverride : ReactViewManager {
   public open fun addView(parent: ReactViewGroup, child: View, index: Int) {
      if (var2.getParent() != null) {
         var var8: java.lang.Boolean = (java.lang.Boolean)var2.getTag(R.id.view_is_transitioning);
         if (var8 is java.lang.Boolean) {
            var8 = var8;
         } else {
            var8 = null;
         }

         var var5: Boolean = false;
         val var11: Boolean;
         if (var8 != null) {
            var11 = var8;
         } else {
            var11 = false;
         }

         val var6: Boolean = var2.getParent() == var1;
         val var7: Boolean = var1.getRemoveClippedSubviews();
         val var10: Any = var2.getTag(id.view_clipped);
         var8 = null;
         if (var10 is java.lang.Boolean) {
            var8 = var10 as java.lang.Boolean;
         }

         if (var8 != null) {
            var5 = var8;
         }

         val var15: java.lang.String = var2.getClass().getName();
         val var14: e = e.n("ReactViewManagerOverride: Child view already has a parent!");
         var14.o("react.viewmanager");
         var14.p("isTransitioning", var11);
         var14.p("wantsToAddToSameParent", var6);
         var14.p("isParentClipping", var7);
         var14.p("isChildClipped", var5);
         var14.p("childClassType", var15);
         p1.e(var14);
      }

      super.addView(var1, var2, var3);
   }

   public open fun createViewInstance(context: ThemedReactContext): ReactViewGroupOverride {
      return new ReactViewGroupOverride(var1);
   }
}
