package com.discord.app_database

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import vk.f
import vk.n
import yk.b2
import yk.g0
import yk.g0.a

@f
public data class CacheVersion(version: String) {
   public final val version: String

   init {
      q.h(var1, "version");
      super();
      this.version = var1;
   }

   public operator fun component1(): String {
      return this.version;
   }

   public fun copy(version: String = var0.version): CacheVersion {
      q.h(var1, "version");
      return new CacheVersion(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CacheVersion) {
         return false;
      } else {
         return q.c(this.version, (var1 as CacheVersion).version);
      }
   }

   public override fun hashCode(): Int {
      return this.version.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.version;
      val var2: StringBuilder = new StringBuilder();
      var2.append("CacheVersion(version=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: CacheVersion.$serializer = new CacheVersion.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.app_database.CacheVersion", var0, 1);
         var1.l("version", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a};
      }

      public open fun deserialize(decoder: Decoder): CacheVersion {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: java.lang.String;
         if (var5) {
            var8 = var7.t(var6, 0);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.t(var6, 0);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new CacheVersion(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: CacheVersion) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         CacheVersion.write$Self$app_database_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CacheVersion> {
         return CacheVersion.$serializer.INSTANCE;
      }
   }
}
