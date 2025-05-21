package com.discord.user_search_worker

import Q8.s
import com.discord.reactevents.ReactEvents
import com.discord.user_search_worker.react_events.ReturnResultsEvent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q

public class UserSearchWorkerManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactEvents: ReactEvents
   private final var worker: UserSearchWorker

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(s.a("ReturnResults", G.b(ReturnResultsEvent.class)));
      this.worker = new UserSearchWorker(new d(this, var1));
   }

   @JvmStatic
   fun `worker$lambda$0`(
      var0: UserSearchWorkerManagerModule, var1: ReactApplicationContext, var2: java.util.List, var3: java.lang.String, var4: java.lang.String
   ): Unit {
      q.h(var2, "results");
      q.h(var3, "query");
      q.h(var4, "uuid");
      var0.reactEvents.emitModuleEvent(var1, new ReturnResultsEvent(var2, var3, var4, "USER_RESULTS"));
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
   }

   public open fun getName(): String {
      return "UserSearchWorkerManager";
   }

   @ReactMethod
   public fun onmessage(dataJSON: String) {
      q.h(var1, "dataJSON");
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
