package com.discord.billing.react.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.g0
import qn.n0
import qn.g0.a

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

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
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
         var1.c("connectionState", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a};
      }

      public open fun deserialize(decoder: Decoder): BillingManagerConnectionStateUpdated {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         val var6: Boolean = var8.p();
         var var3: Int = 1;
         var var4: Boolean = true;
         var var2: Int;
         if (var6) {
            var2 = var8.i(var7, 0);
         } else {
            var2 = 0;
            var3 = 0;

            while (var4) {
               val var5: Int = var8.o(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     throw new n(var5);
                  }

                  var2 = var8.i(var7, 0);
                  var3 |= 1;
               } else {
                  var4 = false;
               }
            }
         }

         var8.c(var7);
         return new BillingManagerConnectionStateUpdated(var3, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: BillingManagerConnectionStateUpdated) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BillingManagerConnectionStateUpdated.write$Self$billing_release(var2, var4, var3);
         var4.c(var3);
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
