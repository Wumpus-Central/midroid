package com.discord.app_database

import kotlinx.serialization.KSerializer
import mb.g

@g
public data class NonGuildVersion(id: String, version: Long = 0L, versionString: String? = null) {
   public final val id: String
   public final val version: Long
   public final val versionString: String?

   init {
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
      return new NonGuildVersion(var1, var2, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is NonGuildVersion) {
         return false;
      } else {
         var1 = var1;
         if (!(this.id == var1.id)) {
            return false;
         } else if (this.version != var1.version) {
            return false;
         } else {
            return this.versionString == var1.versionString;
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
      val var3: java.lang.String = this.id;
      val var1: Long = this.version;
      val var4: java.lang.String = this.versionString;
      val var5: StringBuilder = new StringBuilder();
      var5.append("NonGuildVersion(id=");
      var5.append(var3);
      var5.append(", version=");
      var5.append(var1);
      var5.append(", versionString=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<NonGuildVersion> {
         return NonGuildVersion.$serializer.INSTANCE;
      }
   }
}
