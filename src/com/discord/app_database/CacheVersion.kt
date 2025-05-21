package com.discord.app_database

import Ja.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

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

   public companion object {
      public fun serializer(): KSerializer<CacheVersion> {
         return CacheVersion.$serializer.INSTANCE;
      }
   }
}
