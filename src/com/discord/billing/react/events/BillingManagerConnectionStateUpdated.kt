package com.discord.billing.react.events

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
internal data class BillingManagerConnectionStateUpdated(connectionState: Int) : ReactEvent {
   public final val connectionState: Int

   init {
      this.connectionState = var1;
   }

   public operator fun component1(): Int {
      return this.connectionState;
   }

   public fun copy(connectionState: Int = var0.connectionState): BillingManagerConnectionStateUpdated {
      return new BillingManagerConnectionStateUpdated(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BillingManagerConnectionStateUpdated) {
         return false;
      } else {
         return this.connectionState == (var1 as BillingManagerConnectionStateUpdated).connectionState;
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.connectionState);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionState;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BillingManagerConnectionStateUpdated(connectionState=");
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
         val var0: BillingManagerConnectionStateUpdated.$serializer = new BillingManagerConnectionStateUpdated.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.billing.react.events.BillingManagerConnectionStateUpdated", var0, 1
         );
         var1.l("connectionState", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a};
      }

      public open fun deserialize(decoder: Decoder): BillingManagerConnectionStateUpdated {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         val var6: Boolean = var8.y();
         var var2: Int = 1;
         var var4: Boolean = true;
         var var3: Int;
         if (var6) {
            var3 = var8.k(var7, 0);
         } else {
            var3 = 0;
            var2 = 0;

            while (var4) {
               val var5: Int = var8.x(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     throw new n(var5);
                  }

                  var3 = var8.k(var7, 0);
                  var2 |= 1;
               } else {
                  var4 = false;
               }
            }
         }

         var8.b(var7);
         return new BillingManagerConnectionStateUpdated(var2, var3, null);
      }

      public open fun serialize(encoder: Encoder, value: BillingManagerConnectionStateUpdated) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         BillingManagerConnectionStateUpdated.write$Self$billing_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BillingManagerConnectionStateUpdated> {
         return BillingManagerConnectionStateUpdated.$serializer.INSTANCE;
      }
   }
}
