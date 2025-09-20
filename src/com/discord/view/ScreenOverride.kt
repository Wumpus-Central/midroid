package com.discord.view

import android.annotation.SuppressLint
import com.facebook.react.uimanager.ThemedReactContext
import com.swmansion.rnscreens.Screen
import io.sentry.e
import io.sentry.p1

@SuppressLint(["ViewConstructor"])
public class ScreenOverride(reactContext: ThemedReactContext) : Screen(var1) {
   public open fun endRemovalTransition() {
      if (this.isBeingRemoved()) {
         super.endRemovalTransition();
         val var1: e = e.n("ScreenOverride: endRemovalTransition called");
         var1.o("react.viewmanager");
         p1.e(var1);
      }
   }

   public open fun startRemovalTransition() {
      if (!this.isBeingRemoved()) {
         val var1: e = e.n("ScreenOverride: calling startRemovalTransition");
         var1.o("react.viewmanager");
         p1.e(var1);
         super.startRemovalTransition();
      }
   }
}
