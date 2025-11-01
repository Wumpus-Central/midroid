package com.discord.bundle_updater

import av.n2
import av.u0
import kotlinx.serialization.KSerializer

@xu.m
public data class AppManifest(metadata: AppManifestMetadata, hashes: Map<String, String> = s0.i(), patches: Map<String, String> = s0.i()) {
   public final val metadata: AppManifestMetadata
   public final val hashes: Map<String, String>
   public final val patches: Map<String, String>

   @JvmStatic
   fun {
      val var0: n2 = n2.a;
      $childSerializers = new KSerializer[]{null, new u0(n2.a, n2.a), new u0(var0, var0)};
   }

   init {
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
      return new AppManifest(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AppManifest) {
         return false;
      } else {
         var1 = var1;
         if (!(this.metadata == var1.metadata)) {
            return false;
         } else if (!(this.hashes == var1.hashes)) {
            return false;
         } else {
            return this.patches == var1.patches;
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.metadata.hashCode() * 31 + this.hashes.hashCode()) * 31 + this.patches.hashCode();
   }

   public override fun toString(): String {
      val var2: AppManifestMetadata = this.metadata;
      val var1: java.util.Map = this.hashes;
      val var3: java.util.Map = this.patches;
      val var4: StringBuilder = new StringBuilder();
      var4.append("AppManifest(metadata=");
      var4.append(var2);
      var4.append(", hashes=");
      var4.append(var1);
      var4.append(", patches=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AppManifest> {
         return AppManifest.$serializer.INSTANCE;
      }
   }
}
