package com.discord.lifecycle

import A9.s
import com.discord.codegen.NativeAppLifecycleModuleSpec
import com.discord.lifecycle.react.events.OnHostDestroyEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.LifecycleEventListener
import com.facebook.react.bridge.ReactApplicationContext

public class AppLifecycleModule(reactContext: ReactApplicationContext) : NativeAppLifecycleModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final var reactListenerCount: Int
   private final val reactLifecycleEventListener: <unrepresentable>

   init {
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(s.a("onHostDestroy", OnHostDestroyEvent::class));
      this.reactLifecycleEventListener = new LifecycleEventListener(this) {
         final AppLifecycleModule this$0;

         {
            this.this$0 = var1;
         }

         public void onHostDestroy() {
            if (AppLifecycleModule.access$getReactListenerCount$p(this.this$0) != 0) {
               val var2: ReactEvents = AppLifecycleModule.access$getReactEvents$p(this.this$0);
               val var1: ReactApplicationContext = AppLifecycleModule.access$getReactApplicationContext(this.this$0);
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
