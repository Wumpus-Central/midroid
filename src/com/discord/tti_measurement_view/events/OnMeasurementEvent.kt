package com.discord.tti_measurement_view.events

import ca.f
import ca.n
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fa.G
import fa.y
import fa.G.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnMeasurementEvent.$serializer = new OnMeasurementEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.tti_measurement_view.events.OnMeasurementEvent", var0, 1);
         var1.l("timestamp", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{y.a};
      }

      public open fun deserialize(decoder: Decoder): OnMeasurementEvent {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         val var7: Boolean = var9.y();
         var var4: Byte = 1;
         var var2: Double;
         if (var7) {
            var2 = var9.A(var8, 0);
         } else {
            var2 = 0.0;
            var var5: Boolean = true;
            var4 = 0;

            while (var5) {
               val var6: Int = var9.x(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     throw new n(var6);
                  }

                  var2 = var9.A(var8, 0);
                  var4 = 1;
               } else {
                  var5 = false;
               }
            }
         }

         var9.b(var8);
         return new OnMeasurementEvent(var4, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: OnMeasurementEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnMeasurementEvent.write$Self$tti_measurement_view_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnMeasurementEvent> {
         return OnMeasurementEvent.$serializer.INSTANCE;
      }
   }
}
