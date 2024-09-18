package com.discord.user_search_worker

import com.discord.reactevents.ReactEvents
import com.discord.user_search_worker.react_events.ReturnResultsEvent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kh.w
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

public class UserSearchWorkerManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactEvents: ReactEvents
   private final var worker: UserSearchWorker

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(new Pair[]{w.a("ReturnResults", g0.b(ReturnResultsEvent.class))});
      this.worker = new UserSearchWorker(
         new Function3(this, var1) {
            final ReactApplicationContext $reactContext;
            final UserSearchWorkerManagerModule this$0;

            {
               super(3);
               this.this$0 = var1;
               this.$reactContext = var2;
            }

            public final void invoke(java.util.List<UserSearchWorkerResult> var1, java.lang.String var2, java.lang.String var3) {
               q.h(var1, "results");
               q.h(var2, "query");
               q.h(var3, "uuid");
               UserSearchWorkerManagerModule.access$getReactEvents$p(this.this$0)
                  .emitModuleEvent(this.$reactContext, new ReturnResultsEvent(var1, var2, var3, "USER_RESULTS"));
            }
         }
      );
   }

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
   }

   public override fun getName(): String {
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
