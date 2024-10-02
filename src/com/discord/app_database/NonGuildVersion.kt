package com.discord.app_database

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.x0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class NonGuildVersion(id: String, version: Long = 0L, versionString: String? = null) {
   public final val id: String
   public final val version: Long
   public final val versionString: String?

   init {
      q.h(var1, "id");
      super();
      this.id = var1;
      this.version = var2;
      this.versionString = var4;
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
      q.h(var1, "id");
      return new NonGuildVersion(var1, var2, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is NonGuildVersion) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (this.version != var1.version) {
            return false;
         } else {
            return q.c(this.versionString, var1.versionString);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.id.hashCode();
      val var3: Int = java.lang.Long.hashCode(this.version);
      val var1: Int;
      if (this.versionString == null) {
         var1 = 0;
      } else {
         var1 = this.versionString.hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.id;
      val var1: Long = this.version;
      val var3: java.lang.String = this.versionString;
      val var4: StringBuilder = new StringBuilder();
      var4.append("NonGuildVersion(id=");
      var4.append(var5);
      var4.append(", version=");
      var4.append(var1);
      var4.append(", versionString=");
      var4.append(var3);
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
         val var0: NonGuildVersion.$serializer = new NonGuildVersion.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.app_database.NonGuildVersion", var0, 3);
         var1.l("id", false);
         var1.l("version", true);
         var1.l("versionString", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, x0.a, a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): NonGuildVersion {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         var var2: Int;
         var var5: Long;
         var var7: java.lang.String;
         var var12: java.lang.String;
         if (var10.y()) {
            val var11: java.lang.String = var10.t(var9, 0);
            var5 = var10.h(var9, 1);
            val var8: java.lang.String = var10.v(var9, 2, b2.a, null) as java.lang.String;
            var2 = 7;
            var7 = var11;
            var12 = var8;
         } else {
            var5 = 0L;
            var var3: Boolean = true;
            var7 = null;
            var12 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var10.v(var9, 2, b2.a, var12) as java.lang.String;
                        var2 |= 4;
                     } else {
                        var5 = var10.h(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.t(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.b(var9);
         return new NonGuildVersion(var2, var7, var5, var12, null);
      }

      public open fun serialize(encoder: Encoder, value: NonGuildVersion) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         NonGuildVersion.write$Self$app_database_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<NonGuildVersion> {
         return NonGuildVersion.$serializer.INSTANCE;
      }
   }
}
