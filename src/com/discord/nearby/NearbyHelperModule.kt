package com.discord.nearby

import android.app.Activity
import com.discord.nearby.reactevents.OnNearbyErrorEvent
import com.discord.nearby.reactevents.OnNearbyMessageLostEvent
import com.discord.nearby.reactevents.OnNearbyMessageReceivedEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kh.w
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

public class NearbyHelperModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val manager: NearbyManager
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(
         w.a("nearbyMessageReceived", g0.b(OnNearbyMessageReceivedEvent.class)),
         w.a("nearbyMessageLost", g0.b(OnNearbyMessageLostEvent.class)),
         w.a("nearbyError", g0.b(OnNearbyErrorEvent.class))
      );
      this.manager = new NearbyManager(
         new Function1(this) {
            final NearbyHelperModule this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final void invoke(java.lang.String var1) {
               q.h(var1, "it");
               NearbyHelperModule.access$getReactEvents$p(this.this$0)
                  .emitModuleEvent(NearbyHelperModule.access$getReactContext$p(this.this$0), new OnNearbyMessageReceivedEvent(var1));
            }
         },
         new Function1(this) {
            final NearbyHelperModule this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final void invoke(java.lang.String var1) {
               q.h(var1, "it");
               NearbyHelperModule.access$getReactEvents$p(this.this$0)
                  .emitModuleEvent(NearbyHelperModule.access$getReactContext$p(this.this$0), new OnNearbyMessageLostEvent(var1));
            }
         },
         new Function1(this) {
            final NearbyHelperModule this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final void invoke(java.lang.String var1) {
               q.h(var1, "it");
               NearbyHelperModule.access$getReactEvents$p(this.this$0)
                  .emitModuleEvent(NearbyHelperModule.access$getReactContext$p(this.this$0), new OnNearbyErrorEvent(var1));
            }
         }
      );
   }

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
   }

   public open fun getName(): String {
      return "NearbyHelper";
   }

   @ReactMethod
   public fun listenForNearbyMessages() {
      val var1: Activity = this.reactContext.getCurrentActivity();
      if (var1 != null) {
         this.manager.enableNearby(var1);
      }
   }

   @ReactMethod
   public fun publishNearbyMessage(message: String) {
      q.h(var1, "message");
      this.manager.setOutboundMessage(var1);
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun setupNearbyPermission(apiKey: String) {
      q.h(var1, "apiKey");
   }

   @ReactMethod
   public fun stopNearby() {
      val var1: Activity = this.reactContext.getCurrentActivity();
      if (var1 != null) {
         this.manager.disableNearby(var1);
      }
   }
}
