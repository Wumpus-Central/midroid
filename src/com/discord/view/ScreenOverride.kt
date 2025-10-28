package com.discord.view

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.facebook.react.uimanager.ThemedReactContext
import com.swmansion.rnscreens.Screen
import com.swmansion.rnscreens.ScreenStackHeaderConfig
import io.sentry.e
import io.sentry.p1
import java.util.ArrayList

@SuppressLint(["ViewConstructor"])
public class ScreenOverride(reactContext: ThemedReactContext) : Screen(var1) {
   private final val inTransitionViews: MutableList<Pair<ViewGroup, View>> = new ArrayList()

   private fun startTransitionRecursive(parent: ViewGroup?) {
      if (var1 != null) {
         val var3: Int = var1.getChildCount();

         for (int var2 = 0; var2 < var3; var2++) {
            val var4: View = var1.getChildAt(var2);
            if (var1 is SwipeRefreshLayout && var4 is ImageView) {
               var1.addView(new View(this.getContext()), var2);
            } else if (var4 != null) {
               var1.startViewTransition(var4);
               this.inTransitionViews.add(new Pair(var1, var4));
            }

            if (var4 is ScreenStackHeaderConfig) {
               this.startTransitionRecursive((var4 as ScreenStackHeaderConfig).getToolbar());
            }

            if (var4 is ViewGroup) {
               this.startTransitionRecursive(var4 as ViewGroup);
            }
         }
      }
   }

   public open fun endRemovalTransition() {
      if (this.isBeingRemoved()) {
         this.setBeingRemoved(false);

         for (Pair var2 : CollectionsKt.P(this.inTransitionViews)) {
            (var2.a() as ViewGroup).endViewTransition(var2.b() as View);
         }

         this.inTransitionViews.clear();
         val var3: e = e.n("ScreenOverride: endRemovalTransition called (w/ patch)");
         var3.o("react.viewmanager");
         p1.e(var3);
      }
   }

   public open fun startRemovalTransition() {
      if (!this.isBeingRemoved()) {
         this.setBeingRemoved(true);
         val var1: e = e.n("ScreenOverride: calling startRemovalTransition (w/ patch)");
         var1.o("react.viewmanager");
         p1.e(var1);
         this.startTransitionRecursive(this);
      }
   }
}
