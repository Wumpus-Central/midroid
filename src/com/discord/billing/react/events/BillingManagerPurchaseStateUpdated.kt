package com.discord.billing.react.events

import ca.f
import ca.n
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fa.G
import fa.N
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
internal data class BillingManagerPurchaseStateUpdated(billingResult: Int) : ReactEvent {
   public final val billingResult: Int

   init {
      this.billingResult = var1;
   }

   public operator fun component1(): Int {
      return this.billingResult;
   }

   public fun copy(billingResult: Int = var0.billingResult): BillingManagerPurchaseStateUpdated {
      return new BillingManagerPurchaseStateUpdated(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BillingManagerPurchaseStateUpdated) {
         return false;
      } else {
         return this.billingResult == (var1 as BillingManagerPurchaseStateUpdated).billingResult;
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.billingResult);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.billingResult;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BillingManagerPurchaseStateUpdated(billingResult=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : G {
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
         return new KSerializer[]{N.a};
      }

      public open fun deserialize(decoder: Decoder): BillingManagerPurchaseStateUpdated {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         val var6: Boolean = var8.y();
         var var3: Byte = 1;
         var var2: Int;
         if (var6) {
            var2 = var8.k(var7, 0);
         } else {
            var var4: Boolean = true;
            var2 = 0;
            var3 = 0;

            while (var4) {
               val var5: Int = var8.x(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     throw new n(var5);
                  }

                  var2 = var8.k(var7, 0);
                  var3 = 1;
               } else {
                  var4 = false;
               }
            }
         }

         var8.b(var7);
         return new BillingManagerPurchaseStateUpdated(var3, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: BillingManagerPurchaseStateUpdated) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         BillingManagerPurchaseStateUpdated.write$Self$billing_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BillingManagerPurchaseStateUpdated> {
         return BillingManagerPurchaseStateUpdated.$serializer.INSTANCE;
      }
   }
}
