package com.discord.nearby.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
public data class OnNearbyErrorEvent(body: String) : ReactEvent {
   public final val body: String

   init {
      r.h(var1, "body");
      super();
      this.body = var1;
   }

   public operator fun component1(): String {
      return this.body;
   }

   public fun copy(body: String = var0.body): OnNearbyErrorEvent {
      r.h(var1, "body");
      return new OnNearbyErrorEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnNearbyErrorEvent) {
         return false;
      } else {
         return r.c(this.body, (var1 as OnNearbyErrorEvent).body);
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
      var2.append("OnNearbyErrorEvent(body=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnNearbyErrorEvent> {
         return OnNearbyErrorEvent.$serializer.INSTANCE;
      }
   }
}
