package com.discord.lifecycle

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner
import kotlin.jvm.internal.r

public object AppLifecycle {
   public final var isForegrounded: Boolean
      private set

   private final val appLifecycleObserver: <unrepresentable> = new DefaultLifecycleObserver() {
      @Override
      public void onStart(LifecycleOwner var1) {
         r.h(var1, "owner");
         DefaultLifecycleObserver.super.onStart(var1);
         AppLifecycle.access$setForegrounded$p(true);
      }

      @Override
      public void onStop(LifecycleOwner var1) {
         r.h(var1, "owner");
         DefaultLifecycleObserver.super.onStop(var1);
         AppLifecycle.access$setForegrounded$p(false);
      }
   }

   public fun init() {
      ProcessLifecycleOwner.r.a().getLifecycle().a(appLifecycleObserver);
   }
}
