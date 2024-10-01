package com.discord.chat.bridge.contentnode

import fl.f
import fl.n
import il.b2
import il.g0
import il.x0
import il.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class TimestampContentNode(timestamp: Long, full: String, formatted: String) : ContentNode {
   public final val formatted: String
   public final val full: String
   public final val timestamp: Long

   init {
      q.h(var3, "full");
      q.h(var4, "formatted");
      super(null);
      this.timestamp = var1;
      this.full = var3;
      this.formatted = var4;
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
      q.h(var3, "full");
      q.h(var4, "formatted");
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
         } else if (!q.c(this.full, var1.full)) {
            return false;
         } else {
            return q.c(this.formatted, var1.formatted);
         }
      }
   }

   public override fun hashCode(): Int {
      return (java.lang.Long.hashCode(this.timestamp) * 31 + this.full.hashCode()) * 31 + this.formatted.hashCode();
   }

   public override fun toString(): String {
      val var1: Long = this.timestamp;
      val var3: java.lang.String = this.full;
      val var5: java.lang.String = this.formatted;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TimestampContentNode(timestamp=");
      var4.append(var1);
      var4.append(", full=");
      var4.append(var3);
      var4.append(", formatted=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{x0.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TimestampContentNode {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         var var2: Int;
         var var5: Long;
         val var8: java.lang.String;
         val var11: java.lang.String;
         if (var10.y()) {
            var5 = var10.h(var9, 0);
            var11 = var10.t(var9, 1);
            val var7: java.lang.String = var10.t(var9, 2);
            var2 = 7;
            var8 = var7;
         } else {
            var var13: java.lang.String = null;
            var var3: Boolean = true;
            var5 = 0L;
            var var12: java.lang.String = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var10.t(var9, 2);
                        var2 |= 4;
                     } else {
                        var13 = var10.t(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var5 = var10.h(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var8 = var12;
            var11 = var13;
         }

         var10.b(var9);
         return new TimestampContentNode(var2, var5, var11, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: TimestampContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TimestampContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TimestampContentNode> {
         return TimestampContentNode.$serializer.INSTANCE;
      }
   }
}
