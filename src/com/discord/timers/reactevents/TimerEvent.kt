package com.discord.timers.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.g0
import xk.n0
import xk.g0.a

@f
internal data class TimerEvent(id: Int) : ReactEvent {
   public final val id: Int

   init {
      this.id = var1;
   }

   public operator fun component1(): Int {
      return this.id;
   }

   public fun copy(id: Int = var0.id): TimerEvent {
      return new TimerEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TimerEvent) {
         return false;
      } else {
         return this.id == (var1 as TimerEvent).id;
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
      var2.append("TimerEvent(id=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TimerEvent.$serializer = new TimerEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.timers.reactevents.TimerEvent", var0, 1);
         var1.l("id", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a};
      }

      public open fun deserialize(decoder: Decoder): TimerEvent {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         val var6: Boolean = var8.y();
         var var3: Int = 1;
         var var4: Boolean = true;
         var var2: Int;
         if (var6) {
            var2 = var8.k(var7, 0);
         } else {
            var2 = 0;
            var3 = 0;

            while (var4) {
               val var5: Int = var8.x(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     throw new n(var5);
                  }

                  var2 = var8.k(var7, 0);
                  var3 |= 1;
               } else {
                  var4 = false;
               }
            }
         }

         var8.b(var7);
         return new TimerEvent(var3, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: TimerEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TimerEvent.write$Self$react_timers_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TimerEvent> {
         return TimerEvent.$serializer.INSTANCE;
      }
   }
}
