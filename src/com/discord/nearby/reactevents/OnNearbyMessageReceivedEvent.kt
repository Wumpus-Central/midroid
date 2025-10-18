package com.discord.nearby.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import qc.m

@m
public data class OnNearbyMessageReceivedEvent(body: String) : ReactEvent {
   public final val body: String

   init {
      super();
      this.body = var1;
   }

   public operator fun component1(): String {
      return this.body;
   }

   public fun copy(body: String = var0.body): OnNearbyMessageReceivedEvent {
      return new OnNearbyMessageReceivedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnNearbyMessageReceivedEvent) {
         return false;
      } else {
         return this.body == (var1 as OnNearbyMessageReceivedEvent).body;
      }
   }

   public override fun hashCode(): Int {
      return this.body.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.body;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnNearbyMessageReceivedEvent(body=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnNearbyMessageReceivedEvent> {
         return OnNearbyMessageReceivedEvent.$serializer.INSTANCE;
      }
   }
}
