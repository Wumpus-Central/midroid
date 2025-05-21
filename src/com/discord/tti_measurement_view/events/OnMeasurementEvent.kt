package com.discord.tti_measurement_view.events

import Za.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
internal data class OnMeasurementEvent(timestamp: Double) : ReactEvent {
   public final val timestamp: Double

   init {
      this.timestamp = var1;
   }

   public operator fun component1(): Double {
      return this.timestamp;
   }

   public fun copy(timestamp: Double = var0.timestamp): OnMeasurementEvent {
      return new OnMeasurementEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnMeasurementEvent) {
         return false;
      } else {
         return java.lang.Double.compare(this.timestamp, (var1 as OnMeasurementEvent).timestamp) == 0;
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Double.hashCode(this.timestamp);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Double = this.timestamp;
      val var3: StringBuilder = new StringBuilder();
      var3.append("OnMeasurementEvent(timestamp=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnMeasurementEvent> {
         return OnMeasurementEvent.$serializer.INSTANCE;
      }
   }
}
