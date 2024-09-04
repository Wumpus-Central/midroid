package com.discord.billing.react.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import lj.w

@f
internal class BillingManagerPurchaseUpdated(purchaseToken: String, packageName: String, sku: String) : ReactEvent {
   private final val packageName: String
   private final val purchaseToken: String
   private final val sku: String

   init {
      q.h(var1, "purchaseToken");
      q.h(var2, "packageName");
      q.h(var3, "sku");
      super();
      this.purchaseToken = var1;
      this.packageName = var2;
      this.sku = var3;
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            w.a(
               "purchase",
               NativeMapExtensionsKt.nativeMapOf(
                  new Pair[]{w.a("purchaseToken", this.purchaseToken), w.a("packageName", this.packageName), w.a("productId", this.sku)}
               )
            )
         }
      );
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BillingManagerPurchaseUpdated.$serializer = new BillingManagerPurchaseUpdated.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.billing.react.events.BillingManagerPurchaseUpdated", var0, 3
         );
         var1.l("purchaseToken", false);
         var1.l("packageName", false);
         var1.l("sku", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): BillingManagerPurchaseUpdated {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var6: java.lang.String;
         val var10: java.lang.String;
         var var12: java.lang.String;
         if (var9.p()) {
            var12 = var9.m(var8, 0);
            val var7: java.lang.String = var9.m(var8, 1);
            var10 = var9.m(var8, 2);
            var2 = 7;
            var6 = var12;
            var12 = var7;
         } else {
            var6 = null;
            var12 = null;
            var var11: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var9.m(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var10 = var12;
            var12 = var11;
         }

         var9.c(var8);
         return new BillingManagerPurchaseUpdated(var2, var6, var12, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: BillingManagerPurchaseUpdated) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BillingManagerPurchaseUpdated.write$Self$billing_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BillingManagerPurchaseUpdated> {
         return BillingManagerPurchaseUpdated.$serializer.INSTANCE;
      }
   }
}
