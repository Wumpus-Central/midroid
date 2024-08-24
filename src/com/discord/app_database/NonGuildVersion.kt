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
import vk.a
import xk.a2
import xk.f0
import xk.w0

@f
public data class NonGuildVersion(id: String, version: Long = 0L, versionString: String? = null) {
   public final val id: String
   public final val version: Long
   public final val versionString: String?

   init {
      r.h(var1, "id");
      super();
      this.id = var1;
      this.version = var2;
      this.versionString = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: NonGuildVersion, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.id);
      var var3: Boolean;
      if (!var1.A(var2, 1) && var0.version == 0L) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.E(var2, 1, var0.version);
      }

      label24: {
         if (!var1.A(var2, 2)) {
            var3 = false;
            if (var0.versionString == null) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.versionString);
      }
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): Long {
      return this.version;
   }

   public operator fun component3(): String? {
      return this.versionString;
   }

   public fun copy(id: String = var0.id, version: Long = var0.version, versionString: String? = var0.versionString): NonGuildVersion {
      r.h(var1, "id");
      return new NonGuildVersion(var1, var2, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is NonGuildVersion) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.id, var1.id)) {
            return false;
         } else if (this.version != var1.version) {
            return false;
         } else {
            return r.c(this.versionString, var1.versionString);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.id.hashCode();
      val var2: Int = java.lang.Long.hashCode(this.version);
      val var1: Int;
      if (this.versionString == null) {
         var1 = 0;
      } else {
         var1 = this.versionString.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.id;
      val var1: Long = this.version;
      val var5: java.lang.String = this.versionString;
      val var3: StringBuilder = new StringBuilder();
      var3.append("NonGuildVersion(id=");
      var3.append(var4);
      var3.append(", version=");
      var3.append(var1);
      var3.append(", versionString=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<NonGuildVersion> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: NonGuildVersion.$serializer = new NonGuildVersion.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.app_database.NonGuildVersion", var0, 3);
         var1.l("id", false);
         var1.l("version", true);
         var1.l("versionString", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, w0.a, a.u(a2.a)};
      }

      public open fun deserialize(decoder: Decoder): NonGuildVersion {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var5: Long;
         var var7: java.lang.String;
         val var8: Any;
         if (var10.p()) {
            val var11: java.lang.String = var10.m(var9, 0);
            var5 = var10.f(var9, 1);
            var8 = var10.n(var9, 2, a2.a, null);
            var2 = 7;
            var7 = var11;
         } else {
            var5 = 0L;
            var var3: Boolean = true;
            var7 = null;
            var var12: Any = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var10.n(var9, 2, a2.a, var12);
                        var2 |= 4;
                     } else {
                        var5 = var10.f(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.m(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var8 = var12;
         }

         var10.c(var9);
         return new NonGuildVersion(var2, var7, var5, var8 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: NonGuildVersion) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         NonGuildVersion.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<NonGuildVersion> {
         return NonGuildVersion.$serializer.INSTANCE;
      }
   }
}
