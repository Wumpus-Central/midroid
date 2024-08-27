package com.discord.bundle_updater

import fh.s
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.r0

@f
public data class AppManifest(metadata: AppManifestMetadata, hashes: Map<String, String> = s.h(), patches: Map<String, String> = s.h()) {
   public final val hashes: Map<String, String>
   public final val metadata: AppManifestMetadata
   public final val patches: Map<String, String>

   init {
      r.h(var1, "metadata");
      r.h(var2, "hashes");
      r.h(var3, "patches");
      super();
      this.metadata = var1;
      this.hashes = var2;
      this.patches = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: AppManifest, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, AppManifestMetadata.$serializer.INSTANCE, var0.metadata);
      var var3: Boolean;
      if (!var1.A(var2, 1) && r.c(var0.hashes, s.h())) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 1, new r0(a2.a, a2.a), var0.hashes);
      }

      label24: {
         if (!var1.A(var2, 2)) {
            var3 = false;
            if (r.c(var0.patches, s.h())) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.y(var2, 2, new r0(a2.a, a2.a), var0.patches);
      }
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
      r.h(var1, "metadata");
      r.h(var2, "hashes");
      r.h(var3, "patches");
      return new AppManifest(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AppManifest) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.metadata, var1.metadata)) {
            return false;
         } else if (!r.c(this.hashes, var1.hashes)) {
            return false;
         } else {
            return r.c(this.patches, var1.patches);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.metadata.hashCode() * 31 + this.hashes.hashCode()) * 31 + this.patches.hashCode();
   }

   public override fun toString(): String {
      val var3: AppManifestMetadata = this.metadata;
      val var4: java.util.Map = this.hashes;
      val var2: java.util.Map = this.patches;
      val var1: StringBuilder = new StringBuilder();
      var1.append("AppManifest(metadata=");
      var1.append(var3);
      var1.append(", hashes=");
      var1.append(var4);
      var1.append(", patches=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<AppManifest> {
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
         val var2: a2 = a2.a;
         return new KSerializer[]{AppManifestMetadata.$serializer.INSTANCE, new r0(a2.a, a2.a), new r0(var2, var2)};
      }

      public open fun deserialize(decoder: Decoder): AppManifest {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: kotlinx.serialization.encoding.c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var6: Any = null;
         var var2: Int;
         var var11: Any;
         var var13: Any;
         if (var5) {
            var6 = var10.y(var9, 0, AppManifestMetadata.$serializer.INSTANCE, null);
            var13 = a2.a;
            var11 = var10.y(var9, 1, new r0(a2.a, a2.a), null);
            var13 = var10.y(var9, 2, new r0((KSerializer)var13, (KSerializer)var13), null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var13 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var11 = var10.y(var9, 2, new r0(a2.a, a2.a), var11);
                        var2 |= 4;
                     } else {
                        var13 = var10.y(var9, 1, new r0(a2.a, a2.a), var13);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var10.y(var9, 0, AppManifestMetadata.$serializer.INSTANCE, var6);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var13 = var11;
            var11 = var13;
         }

         var10.c(var9);
         return new AppManifest(var2, var6 as AppManifestMetadata, var11 as java.util.Map, var13 as java.util.Map, null);
      }

      public open fun serialize(encoder: Encoder, value: AppManifest) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         AppManifest.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AppManifest> {
         return AppManifest.$serializer.INSTANCE;
      }
   }
}
