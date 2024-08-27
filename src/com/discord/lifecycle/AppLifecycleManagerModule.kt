package com.discord.lifecycle

import com.discord.lifecycle.react.events.OnHostDestroyEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.LifecycleEventListener
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import eh.w
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r

public class AppLifecycleManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule, LifecycleEventListener {
   private final val reactEvents: ReactEvents

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(new Pair[]{w.a("onHostDestroy", h0.b(OnHostDestroyEvent.class))});
      var1.addLifecycleEventListener(this);
   }

   public open fun getName(): String {
      return "DCDAppLifecycleManager";
   }

   public open fun onHostDestroy() {
      val var2: ReactEvents = this.reactEvents;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var1, "reactApplicationContext");
      var2.emitModuleEvent(var1, new OnHostDestroyEvent());
   }

   public open fun onHostPause() {
   }

   public open fun onHostResume() {
   }
}
