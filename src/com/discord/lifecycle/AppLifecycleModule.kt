package com.discord.lifecycle

import com.discord.codegen.NativeAppLifecycleModuleSpec
import com.discord.lifecycle.react.events.OnHostDestroyEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.LifecycleEventListener
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import z9.s

public class AppLifecycleModule(reactContext: ReactApplicationContext) : NativeAppLifecycleModuleSpec {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final var reactListenerCount: Int
   private final val reactLifecycleEventListener: <unrepresentable>

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(s.a("onHostDestroy", H.b(OnHostDestroyEvent.class)));
      this.reactLifecycleEventListener = new LifecycleEventListener(this) {
         final AppLifecycleModule this$0;

         {
            this.this$0 = var1;
         }

         public void onHostDestroy() {
            if (AppLifecycleModule.access$getReactListenerCount$p(this.this$0) != 0) {
               val var2: ReactEvents = AppLifecycleModule.access$getReactEvents$p(this.this$0);
               val var1: ReactApplicationContext = AppLifecycleModule.access$getReactApplicationContext(this.this$0);
               r.g(var1, "access$getReactApplicationContext(...)");
               var2.emitModuleEvent(var1, new OnHostDestroyEvent());
            }
         }

         public void onHostPause() {
         }

         public void onHostResume() {
         }
      };
   }

   public override fun addListener(type: String) {
      r.h(var1, "type");
      this.reactListenerCount++;
   }

   public open fun initialize() {
      super.initialize();
      this.reactContext.addLifecycleEventListener(this.reactLifecycleEventListener);
   }

   public open fun invalidate() {
      super.invalidate();
      this.reactContext.removeLifecycleEventListener(this.reactLifecycleEventListener);
   }

   public override fun removeListeners(count: Double) {
      this.reactListenerCount -= (int)var1;
   }
}
