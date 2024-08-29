package com.discord.bundle_updater

import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.s0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import mj.r

@f
public data class AppManifest(metadata: AppManifestMetadata, hashes: Map<String, String> = r.h(), patches: Map<String, String> = r.h()) {
   public final val hashes: Map<String, String>
   public final val metadata: AppManifestMetadata
   public final val patches: Map<String, String>

   @JvmStatic
   fun {
      val var0: b2 = b2.a;
      $childSerializers = new KSerializer[]{null, new s0(b2.a, b2.a), new s0(var0, var0)};
   }

   init {
      q.h(var1, "metadata");
      q.h(var2, "hashes");
      q.h(var3, "patches");
      super();
      this.metadata = var1;
      this.hashes = var2;
      this.patches = var3;
   }

   public operator fun component1(): AppManifestMetadata {
      return this.metadata;
   }

   public operator fun component2(): Map<String, String> {
      return this.hashes;
   }

   public operator fun component3(): Map<String, String> {
      return this.patches;
   }

   public fun copy(metadata: AppManifestMetadata = var0.metadata, hashes: Map<String, String> = var0.hashes, patches: Map<String, String> = var0.patches): AppManifest {
      q.h(var1, "metadata");
      q.h(var2, "hashes");
      q.h(var3, "patches");
      return new AppManifest(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AppManifest) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.metadata, var1.metadata)) {
            return false;
         } else if (!q.c(this.hashes, var1.hashes)) {
            return false;
         } else {
            return q.c(this.patches, var1.patches);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.metadata.hashCode() * 31 + this.hashes.hashCode()) * 31 + this.patches.hashCode();
   }

   public override fun toString(): String {
      val var3: AppManifestMetadata = this.metadata;
      val var1: java.util.Map = this.hashes;
      val var2: java.util.Map = this.patches;
      val var4: StringBuilder = new StringBuilder();
      var4.append("AppManifest(metadata=");
      var4.append(var3);
      var4.append(", hashes=");
      var4.append(var1);
      var4.append(", patches=");
      var4.append(var2);
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
         val var0: AppManifest.$serializer = new AppManifest.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.bundle_updater.AppManifest", var0, 3);
         var1.l("metadata", false);
         var1.l("hashes", true);
         var1.l("patches", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: Array<KSerializer> = AppManifest.access$get$childSerializers$cp();
         return new KSerializer[]{AppManifestMetadata.$serializer.INSTANCE, var1[1], var1[2]};
      }

      public open fun deserialize(decoder: Decoder): AppManifest {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: kotlinx.serialization.encoding.c = var1.b(var9);
         val var8: Array<KSerializer> = AppManifest.access$get$childSerializers$cp();
         val var5: Boolean = var10.p();
         var var7: AppManifestMetadata = null;
         var var2: Int;
         var var6: java.util.Map;
         val var11: java.util.Map;
         if (var5) {
            var7 = var10.y(var9, 0, AppManifestMetadata.$serializer.INSTANCE, null) as AppManifestMetadata;
            var11 = var10.y(var9, 1, var8[1], null) as java.util.Map;
            var6 = var10.y(var9, 2, var8[2], null) as java.util.Map;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var var12: java.util.Map = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var10.y(var9, 2, var8[2], var12) as java.util.Map;
                        var2 |= 4;
                     } else {
                        var6 = var10.y(var9, 1, var8[1], var6) as java.util.Map;
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.y(var9, 0, AppManifestMetadata.$serializer.INSTANCE, var7) as AppManifestMetadata;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var6 = var12;
            var11 = var6;
         }

         var10.c(var9);
         return new AppManifest(var2, var7, var11, var6, null);
      }

      public open fun serialize(encoder: Encoder, value: AppManifest) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         AppManifest.write$Self$bundle_updater_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AppManifest> {
         return AppManifest.$serializer.INSTANCE;
      }
   }
}
