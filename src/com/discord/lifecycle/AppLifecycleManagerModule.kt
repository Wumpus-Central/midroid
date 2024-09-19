package com.discord.lifecycle

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner
import com.discord.lifecycle.react.events.OnHostDestroyEvent
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.LifecycleEventListener
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import nh.w

public class AppLifecycleManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule, LifecycleEventListener, DefaultLifecycleObserver {
   private final val reactEvents: ReactEvents

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(w.a("onHostDestroy", g0.b(OnHostDestroyEvent.class)));
      var1.addLifecycleEventListener(this);
      if (ThreadUtilsKt.isOnMainThread()) {
         ProcessLifecycleOwner.h().getLifecycle().a(this);
      } else {
         ThreadUtilsKt.getUiHandler().post(new Runnable(this) {
            final AppLifecycleManagerModule this$0;

            {
               this.this$0 = var1;
            }

            @Override
            public final void run() {
               ProcessLifecycleOwner.h().getLifecycle().a(this.this$0);
            }
         });
      }
   }

   public open fun getName(): String {
      return "DCDAppLifecycleManager";
   }

   public open fun onHostDestroy() {
      val var1: ReactEvents = this.reactEvents;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      var1.emitModuleEvent(var2, new OnHostDestroyEvent());
   }

   public open fun onHostPause() {
   }

   public open fun onHostResume() {
   }

   public override fun onStart(owner: LifecycleOwner) {
      q.h(var1, "owner");
      DefaultLifecycleObserver.super.onStart(var1);
      isForegrounded = true;
   }

   public override fun onStop(owner: LifecycleOwner) {
      q.h(var1, "owner");
      DefaultLifecycleObserver.super.onStop(var1);
      isForegrounded = false;
   }

   public companion object {
      public final var isForegrounded: Boolean
         private set
   }
}
