package com.discord.lifecycle

import Ca.v
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
      this.reactEvents = new ReactEvents(v.a("onHostDestroy", OnHostDestroyEvent::class));
      this.reactLifecycleEventListener = new LifecycleEventListener(this) {
         final AppLifecycleModule this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public void onHostDestroy() {
            if (AppLifecycleModule.access$getReactListenerCount$p(this.this$0) != 0) {
               val var1: ReactEvents = AppLifecycleModule.access$getReactEvents$p(this.this$0);
               val var2: ReactApplicationContext = AppLifecycleModule.access$getReactApplicationContext(this.this$0);
               var1.emitModuleEvent(var2, new OnHostDestroyEvent());
            }
         }

         @Override
         public void onHostPause() {
         }

         @Override
         public void onHostResume() {
         }
      };
   }

   public open fun addListener(type: String) {
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

   public open fun removeListeners(count: Double) {
      this.reactListenerCount -= (int)var1;
   }
}
