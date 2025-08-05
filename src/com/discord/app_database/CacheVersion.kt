package com.discord.app_database

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class CacheVersion(version: String) {
   public final val version: String

   init {
      r.h(var1, "version");
      super();
      this.version = var1;
   }

   public operator fun component1(): String {
      return this.version;
   }

   public fun copy(version: String = var0.version): CacheVersion {
      r.h(var1, "version");
      return new CacheVersion(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CacheVersion) {
         return false;
      } else {
         return r.c(this.version, (var1 as CacheVersion).version);
      }
   }

   public override fun hashCode(): Int {
      return this.version.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.version;
      val var1: StringBuilder = new StringBuilder();
      var1.append("CacheVersion(version=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CacheVersion> {
         return CacheVersion.$serializer.INSTANCE;
      }
   }
}
