package com.discord.chatreplay

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

@f
public data class Replay(filename: String, lastModified: Long) {
   public final val filename: String
   public final val lastModified: Long

   init {
      r.h(var1, "filename");
      super();
      this.filename = var1;
      this.lastModified = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: Replay, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.filename);
      var1.E(var2, 1, var0.lastModified);
   }

   public operator fun component1(): String {
      return this.filename;
   }

   public operator fun component2(): Long {
      return this.lastModified;
   }

   public fun copy(filename: String = var0.filename, lastModified: Long = var0.lastModified): Replay {
      r.h(var1, "filename");
      return new Replay(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Replay) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.filename, var1.filename)) {
            return false;
         } else {
            return this.lastModified == var1.lastModified;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.filename.hashCode() * 31 + java.lang.Long.hashCode(this.lastModified);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.filename;
      val var1: Long = this.lastModified;
      val var3: StringBuilder = new StringBuilder();
      var3.append("Replay(filename=");
      var3.append(var4);
      var3.append(", lastModified=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<Replay> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: Replay.$serializer = new Replay.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chatreplay.Replay", var0, 2);
         var1.l("filename", false);
         var1.l("lastModified", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, w0.a};
      }

      public open fun deserialize(decoder: Decoder): Replay {
         r.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var2: Int;
         var var5: Long;
         var var9: java.lang.String;
         if (var8.p()) {
            var9 = var8.m(var7, 0);
            var5 = var8.f(var7, 1);
            var2 = 3;
         } else {
            var9 = null;
            var5 = 0L;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var8.o(var7);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var8.f(var7, 1);
                     var2 |= 2;
                  } else {
                     var9 = var8.m(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var8.c(var7);
         return new Replay(var2, var9, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: Replay) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         Replay.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Replay> {
         return Replay.$serializer.INSTANCE;
      }
   }
}
