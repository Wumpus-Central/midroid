package com.discord.user_search_worker

import A9.s
import com.discord.reactevents.ReactEvents
import com.discord.user_search_worker.react_events.ReturnResultsEvent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

public class UserSearchWorkerManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactEvents: ReactEvents = new ReactEvents(s.a("ReturnResults", ReturnResultsEvent::class))
   private final var worker: UserSearchWorker

   init {
      this.worker = new UserSearchWorker(new d(this, var1));
   }

   @JvmStatic
   fun `worker$lambda$0`(
      var0: UserSearchWorkerManagerModule, var1: ReactApplicationContext, var2: java.util.List, var3: java.lang.String, var4: java.lang.String
   ): Unit {
      var0.reactEvents.emitModuleEvent(var1, new ReturnResultsEvent(var2, var3, var4, "USER_RESULTS"));
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
   }

   public open fun getName(): String {
      return "UserSearchWorkerManager";
   }

   @ReactMethod
   public fun onmessage(dataJSON: String) {
      this.worker.onMessage(var1);
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun terminate() {
      this.worker.terminate();
   }
}
