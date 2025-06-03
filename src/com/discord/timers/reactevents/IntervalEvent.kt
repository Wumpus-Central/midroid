package com.discord.timers.reactevents

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
internal data class IntervalEvent(id: Int) : ReactEvent {
   public final val id: Int

   init {
      this.id = var1;
   }

   public operator fun component1(): Int {
      return this.id;
   }

   public fun copy(id: Int = var0.id): IntervalEvent {
      return new IntervalEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is IntervalEvent) {
         return false;
      } else {
         return this.id == (var1 as IntervalEvent).id;
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.id);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.id;
      val var2: StringBuilder = new StringBuilder();
      var2.append("IntervalEvent(id=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<IntervalEvent> {
         return IntervalEvent.$serializer.INSTANCE;
      }
   }
}
