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
      val var5: java.lang.String = this.versionString;
      val var4: StringBuilder = new StringBuilder();
      var4.append("NonGuildVersion(id=");
      var4.append(var3);
      var4.append(", version=");
      var4.append(var1);
      var4.append(", versionString=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<NonGuildVersion> {
         return NonGuildVersion.$serializer.INSTANCE;
      }
   }
}
