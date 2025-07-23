package com.discord.nearby.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class OnNearbyMessageReceivedEvent(body: String) : ReactEvent {
   public final val body: String

   init {
      r.h(var1, "body");
      super();
      this.body = var1;
   }

   public operator fun component1(): String {
      return this.body;
   }

   public fun copy(body: String = var0.body): OnNearbyMessageReceivedEvent {
      r.h(var1, "body");
      return new OnNearbyMessageReceivedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnNearbyMessageReceivedEvent) {
         return false;
      } else {
         return r.c(this.body, (var1 as OnNearbyMessageReceivedEvent).body);
      }
   }

   public override fun hashCode(): Int {
      return this.body.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.body;
      val var1: StringBuilder = new StringBuilder();
      var1.append("OnNearbyMessageReceivedEvent(body=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnNearbyMessageReceivedEvent> {
         return OnNearbyMessageReceivedEvent.$serializer.INSTANCE;
      }
   }
}
