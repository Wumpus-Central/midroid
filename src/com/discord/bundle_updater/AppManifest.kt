package com.discord.bundle_updater

import Ma.E0
import Ma.U
import R8.q
import kotlinx.serialization.KSerializer

@Ja.f
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
      kotlin.jvm.internal.q.h(var1, "metadata");
      kotlin.jvm.internal.q.h(var2, "hashes");
      kotlin.jvm.internal.q.h(var3, "patches");
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
      kotlin.jvm.internal.q.h(var1, "metadata");
      kotlin.jvm.internal.q.h(var2, "hashes");
      kotlin.jvm.internal.q.h(var3, "patches");
      return new AppManifest(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AppManifest) {
         return false;
      } else {
         var1 = var1;
         if (!kotlin.jvm.internal.q.c(this.metadata, var1.metadata)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.hashes, var1.hashes)) {
            return false;
         } else {
            return kotlin.jvm.internal.q.c(this.patches, var1.patches);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.metadata.hashCode() * 31 + this.hashes.hashCode()) * 31 + this.patches.hashCode();
   }

   public override fun toString(): String {
      val var3: AppManifestMetadata = this.metadata;
      val var2: java.util.Map = this.hashes;
      val var4: java.util.Map = this.patches;
      val var1: StringBuilder = new StringBuilder();
      var1.append("AppManifest(metadata=");
      var1.append(var3);
      var1.append(", hashes=");
      var1.append(var2);
      var1.append(", patches=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AppManifest> {
         return AppManifest.$serializer.INSTANCE;
      }
   }
}
