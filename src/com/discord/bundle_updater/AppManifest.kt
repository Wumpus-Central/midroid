package com.discord.bundle_updater

import B9.q
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import wb.E0
import wb.U

@tb.g
public data class AppManifest(metadata: AppManifestMetadata, hashes: Map<String, String> = q.h(), patches: Map<String, String> = q.h()) {
   public final val metadata: AppManifestMetadata
   public final val hashes: Map<String, String>
   public final val patches: Map<String, String>

   @JvmStatic
   fun {
      val var0: E0 = E0.a;
      $childSerializers = new KSerializer[]{null, new U(E0.a, E0.a), new U(var0, var0)};
   }

   init {
      r.h(var1, "metadata");
      r.h(var2, "hashes");
      r.h(var3, "patches");
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
      val var1: AppManifestMetadata = this.metadata;
      val var4: java.util.Map = this.hashes;
      val var2: java.util.Map = this.patches;
      val var3: StringBuilder = new StringBuilder();
      var3.append("AppManifest(metadata=");
      var3.append(var1);
      var3.append(", hashes=");
      var3.append(var4);
      var3.append(", patches=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AppManifest> {
         return AppManifest.$serializer.INSTANCE;
      }
   }
}
