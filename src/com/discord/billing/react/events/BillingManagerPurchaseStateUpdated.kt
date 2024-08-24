package com.discord.billing.react.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.f0
import xk.m0
import xk.f0.a

@f
internal class BillingManagerPurchaseStateUpdated(billingResult: Int) : ReactEvent {
   public final val billingResult: Int

   init {
      this.billingResult = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: BillingManagerPurchaseStateUpdated, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.billingResult);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public object `$serializer` : f0<BillingManagerPurchaseStateUpdated> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BillingManagerPurchaseStateUpdated.$serializer = new BillingManagerPurchaseStateUpdated.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.billing.react.events.BillingManagerPurchaseStateUpdated", var0, 1
         );
         var1.l("billingResult", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a};
      }

      public open fun deserialize(decoder: Decoder): BillingManagerPurchaseStateUpdated {
         r.h(var1, "decoder");
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
         return new BillingManagerPurchaseStateUpdated(var3, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: BillingManagerPurchaseStateUpdated) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BillingManagerPurchaseStateUpdated.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BillingManagerPurchaseStateUpdated> {
         return BillingManagerPurchaseStateUpdated.$serializer.INSTANCE;
      }
   }
}
