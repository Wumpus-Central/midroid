package com.discord.lifecycle

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner

public object AppLifecycle {
   public final var isForegrounded: Boolean
      private set

   private final val appLifecycleObserver: <unrepresentable> = new DefaultLifecycleObserver() {
      @Override
      public void onStart(LifecycleOwner var1) {
         DefaultLifecycleObserver.super.onStart(var1);
         AppLifecycle.access$setForegrounded$p(true);
      }

      @Override
      public void onStop(LifecycleOwner var1) {
         DefaultLifecycleObserver.super.onStop(var1);
         AppLifecycle.access$setForegrounded$p(false);
      }
   }

   public fun init() {
      ProcessLifecycleOwner.r.a().getLifecycle().a(appLifecycleObserver);
   }
}
