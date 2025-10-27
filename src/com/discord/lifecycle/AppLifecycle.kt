package com.discord.lifecycle

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner

public object AppLifecycle {
   public final var isForegrounded: Boolean
      private set

   private final val appLifecycleObserver: <unrepresentable> = new DefaultLifecycleObserver() {
      public void onStart(LifecycleOwner var1) {
         super.onStart(var1);
         AppLifecycle.access$setForegrounded$p(true);
      }

      public void onStop(LifecycleOwner var1) {
         super.onStop(var1);
         AppLifecycle.access$setForegrounded$p(false);
      }
   }

   public fun init() {
      ProcessLifecycleOwner.x.a().getLifecycle().a(appLifecycleObserver);
   }
}
