package com.discord.app_database

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
public data class GuildVersion(id: String, version: Long) {
   public final val id: String
   public final val version: Long

   init {
      r.h(var1, "id");
      super();
      this.id = var1;
      this.version = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: GuildVersion, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.id);
      var1.E(var2, 1, var0.version);
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): Long {
      return this.version;
   }

   public fun copy(id: String = var0.id, version: Long = var0.version): GuildVersion {
      r.h(var1, "id");
      return new GuildVersion(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildVersion) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.id, var1.id)) {
            return false;
         } else {
            return this.version == var1.version;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.id.hashCode() * 31 + java.lang.Long.hashCode(this.version);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.id;
      val var1: Long = this.version;
      val var4: StringBuilder = new StringBuilder();
      var4.append("GuildVersion(id=");
      var4.append(var3);
      var4.append(", version=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<GuildVersion> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: GuildVersion.$serializer = new GuildVersion.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.app_database.GuildVersion", var0, 2);
         var1.l("id", false);
         var1.l("version", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, w0.a};
      }

      public open fun deserialize(decoder: Decoder): GuildVersion {
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
         return new GuildVersion(var2, var9, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: GuildVersion) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         GuildVersion.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildVersion> {
         return GuildVersion.$serializer.INSTANCE;
      }
   }
}
