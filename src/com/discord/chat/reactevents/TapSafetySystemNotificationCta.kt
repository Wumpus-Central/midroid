package com.discord.chat.reactevents

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
import xk.a2
import xk.f0
import xk.f0.a

@f
public data class TapSafetySystemNotificationCta(ctaType: String, ctaKey: String) : ReactEvent {
   public final val ctaKey: String
   public final val ctaType: String

   init {
      r.h(var1, "ctaType");
      r.h(var2, "ctaKey");
      super();
      this.ctaType = var1;
      this.ctaKey = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: TapSafetySystemNotificationCta, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.ctaType);
      var1.z(var2, 1, var0.ctaKey);
   }

   public operator fun component1(): String {
      return this.ctaType;
   }

   public operator fun component2(): String {
      return this.ctaKey;
   }

   public fun copy(ctaType: String = var0.ctaType, ctaKey: String = var0.ctaKey): TapSafetySystemNotificationCta {
      r.h(var1, "ctaType");
      r.h(var2, "ctaKey");
      return new TapSafetySystemNotificationCta(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSafetySystemNotificationCta) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.ctaType, var1.ctaType)) {
            return false;
         } else {
            return r.c(this.ctaKey, var1.ctaKey);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.ctaType.hashCode() * 31 + this.ctaKey.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.ctaType;
      val var2: java.lang.String = this.ctaKey;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapSafetySystemNotificationCta(ctaType=");
      var3.append(var1);
      var3.append(", ctaKey=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<TapSafetySystemNotificationCta> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapSafetySystemNotificationCta.$serializer = new TapSafetySystemNotificationCta.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapSafetySystemNotificationCta", var0, 2);
         var1.l("ctaType", false);
         var1.l("ctaKey", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TapSafetySystemNotificationCta {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.m(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.m(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new TapSafetySystemNotificationCta(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: TapSafetySystemNotificationCta) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapSafetySystemNotificationCta.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapSafetySystemNotificationCta> {
         return TapSafetySystemNotificationCta.$serializer.INSTANCE;
      }
   }
}
