package com.discord.user_search_worker

import com.discord.reactevents.ReactEvents
import com.discord.user_search_worker.react_events.ReturnResultsEvent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import eh.w
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r

public class UserSearchWorkerManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactEvents: ReactEvents
   private final var worker: UserSearchWorker

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(new Pair[]{w.a("ReturnResults", h0.b(ReturnResultsEvent.class))});
      this.worker = new UserSearchWorker(
         new Function3<java.util.List<? extends UserSearchWorkerResult>, java.lang.String, java.lang.String, Unit>(this, var1) {
            final ReactApplicationContext $reactContext;
            final UserSearchWorkerManagerModule this$0;

            {
               super(3);
               this.this$0 = var1;
               this.$reactContext = var2;
            }

            public final void invoke(java.util.List<UserSearchWorkerResult> var1, java.lang.String var2, java.lang.String var3) {
               r.h(var1, "results");
               r.h(var2, "query");
               r.h(var3, "uuid");
               UserSearchWorkerManagerModule.access$getReactEvents$p(this.this$0)
                  .emitModuleEvent(this.$reactContext, new ReturnResultsEvent(var1, var2, var3, "USER_RESULTS"));
            }
         }
      );
   }

   @ReactMethod
   public fun addListener(type: String) {
      r.h(var1, "type");
   }

   public override fun getName(): String {
      return "UserSearchWorkerManager";
   }

   @ReactMethod
   public fun onmessage(dataJSON: String) {
      r.h(var1, "dataJSON");
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
