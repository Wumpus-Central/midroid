package com.discord.chat.bridge.contentnode

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
import xk.w0
import xk.f0.a

@f
public data class TimestampContentNode(timestamp: Long, full: String, formatted: String) : ContentNode {
   public final val formatted: String
   public final val full: String
   public final val timestamp: Long

   init {
      r.h(var3, "full");
      r.h(var4, "formatted");
      super(null);
      this.timestamp = var1;
      this.full = var3;
      this.formatted = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: TimestampContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.E(var2, 0, var0.timestamp);
      var1.z(var2, 1, var0.full);
      var1.z(var2, 2, var0.formatted);
   }

   public operator fun component1(): Long {
      return this.timestamp;
   }

   public operator fun component2(): String {
      return this.full;
   }

   public operator fun component3(): String {
      return this.formatted;
   }

   public fun copy(timestamp: Long = var0.timestamp, full: String = var0.full, formatted: String = var0.formatted): TimestampContentNode {
      r.h(var3, "full");
      r.h(var4, "formatted");
      return new TimestampContentNode(var1, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TimestampContentNode) {
         return false;
      } else {
         var1 = var1;
         if (this.timestamp != var1.timestamp) {
            return false;
         } else if (!r.c(this.full, var1.full)) {
            return false;
         } else {
            return r.c(this.formatted, var1.formatted);
         }
      }
   }

   public override fun hashCode(): Int {
      return (java.lang.Long.hashCode(this.timestamp) * 31 + this.full.hashCode()) * 31 + this.formatted.hashCode();
   }

   public override fun toString(): String {
      val var1: Long = this.timestamp;
      val var5: java.lang.String = this.full;
      val var3: java.lang.String = this.formatted;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TimestampContentNode(timestamp=");
      var4.append(var1);
      var4.append(", full=");
      var4.append(var5);
      var4.append(", formatted=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<TimestampContentNode> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TimestampContentNode.$serializer = new TimestampContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("timestamp", var0, 3);
         var1.l("timestamp", false);
         var1.l("full", false);
         var1.l("formatted", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{w0.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TimestampContentNode {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var5: Long;
         var var7: java.lang.String;
         var var12: java.lang.String;
         if (var10.p()) {
            var5 = var10.f(var9, 0);
            val var11: java.lang.String = var10.m(var9, 1);
            val var8: java.lang.String = var10.m(var9, 2);
            var2 = 7;
            var7 = var11;
            var12 = var8;
         } else {
            var7 = null;
            var var3: Boolean = true;
            var5 = 0L;
            var12 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var10.m(var9, 2);
                        var2 |= 4;
                     } else {
                        var7 = var10.m(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var5 = var10.f(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.c(var9);
         return new TimestampContentNode(var2, var5, var7, var12, null);
      }

      public open fun serialize(encoder: Encoder, value: TimestampContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TimestampContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TimestampContentNode> {
         return TimestampContentNode.$serializer.INSTANCE;
      }
   }
}
