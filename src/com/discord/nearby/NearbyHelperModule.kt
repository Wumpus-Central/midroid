package com.discord.nearby

import android.app.Activity
import com.discord.nearby.reactevents.OnNearbyErrorEvent
import com.discord.nearby.reactevents.OnNearbyMessageLostEvent
import com.discord.nearby.reactevents.OnNearbyMessageReceivedEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import z9.s

public class NearbyHelperModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final val manager: NearbyManager

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(
         s.a("nearbyMessageReceived", H.b(OnNearbyMessageReceivedEvent.class)),
         s.a("nearbyMessageLost", H.b(OnNearbyMessageLostEvent.class)),
         s.a("nearbyError", H.b(OnNearbyErrorEvent.class))
      );
      this.manager = new NearbyManager(new a(this), new b(this), new c(this));
   }

   @JvmStatic
   fun `manager$lambda$0`(var0: NearbyHelperModule, var1: java.lang.String): Unit {
      r.h(var1, "it");
      var0.reactEvents.emitModuleEvent(var0.reactContext, new OnNearbyMessageReceivedEvent(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `manager$lambda$1`(var0: NearbyHelperModule, var1: java.lang.String): Unit {
      r.h(var1, "it");
      var0.reactEvents.emitModuleEvent(var0.reactContext, new OnNearbyMessageLostEvent(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `manager$lambda$2`(var0: NearbyHelperModule, var1: java.lang.String): Unit {
      r.h(var1, "it");
      var0.reactEvents.emitModuleEvent(var0.reactContext, new OnNearbyErrorEvent(var1));
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
      r.h(var1, "type");
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
      r.h(var1, "message");
      this.manager.setOutboundMessage(var1);
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun setupNearbyPermission(apiKey: String) {
      r.h(var1, "apiKey");
   }

   @ReactMethod
   public fun stopNearby() {
      val var1: Activity = this.reactContext.getCurrentActivity();
      if (var1 != null) {
         this.manager.disableNearby(var1);
      }
   }
}
