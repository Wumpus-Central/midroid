package com.discord.view

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Looper
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

   @JvmStatic
   fun `startRemovalTransition$lambda$0`(var0: ScreenOverride) {
      var0.startRemovalTransition();
   }

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

         for (Pair var1 : CollectionsKt.P(this.inTransitionViews)) {
            (var1.a() as ViewGroup).endViewTransition(var1.b() as View);
         }

         this.inTransitionViews.clear();
         val var3: e = e.n("ScreenOverride: endRemovalTransition called (w/ patch)");
         var3.o("react.viewmanager");
         p1.e(var3);
      }
   }

   public open fun startRemovalTransition() {
      val var1: Looper = Looper.getMainLooper();
      if (!(Looper.myLooper() == var1)) {
         new Handler(var1).post(new a(this));
      } else if (!this.isBeingRemoved()) {
         this.setBeingRemoved(true);
         val var2: e = e.n("ScreenOverride: calling startRemovalTransition (w/ patch)");
         var2.o("react.viewmanager");
         p1.e(var2);
         this.startTransitionRecursive(this);
      }
   }
}
