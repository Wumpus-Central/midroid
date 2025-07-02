package com.discord.app_database

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import lb.f

@f
public data class GuildVersion(id: String, version: Long) {
   public final val id: String
   public final val version: Long

   init {
      q.h(var1, "id");
      super();
      this.id = var1;
      this.version = var2;
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): Long {
      return this.version;
   }

   public fun copy(id: String = var0.id, version: Long = var0.version): GuildVersion {
      q.h(var1, "id");
      return new GuildVersion(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildVersion) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else {
            return this.version == var1.version;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.id.hashCode() * 31 + java.lang.Long.hashCode(this.version);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.id;
      val var1: Long = this.version;
      val var3: StringBuilder = new StringBuilder();
      var3.append("GuildVersion(id=");
      var3.append(var4);
      var3.append(", version=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<GuildVersion> {
         return GuildVersion.$serializer.INSTANCE;
      }
   }
}
