package com.discord.app_database

import kb.f
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer

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
      val var5: java.lang.String = this.id;
      val var1: Long = this.version;
      val var4: java.lang.String = this.versionString;
      val var3: StringBuilder = new StringBuilder();
      var3.append("NonGuildVersion(id=");
      var3.append(var5);
      var3.append(", version=");
      var3.append(var1);
      var3.append(", versionString=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<NonGuildVersion> {
         return NonGuildVersion.$serializer.INSTANCE;
      }
   }
}
