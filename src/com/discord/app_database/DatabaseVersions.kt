package com.discord.app_database

import java.util.Arrays
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
public data class DatabaseVersions(vararg guildVersions: Any, vararg nonGuildVersions: Any) {
   public final val guildVersions: Array<GuildVersion>
   public final val nonGuildVersions: Array<NonGuildVersion>

   init {
      r.h(var1, "guildVersions");
      r.h(var2, "nonGuildVersions");
      super();
      this.guildVersions = var1;
      this.nonGuildVersions = var2;
   }

   public operator fun component1(): Array<GuildVersion> {
      return this.guildVersions;
   }

   public operator fun component2(): Array<NonGuildVersion> {
      return this.nonGuildVersions;
   }

   public fun copy(guildVersions: Array<GuildVersion> = var0.guildVersions, nonGuildVersions: Array<NonGuildVersion> = var0.nonGuildVersions): DatabaseVersions {
      r.h(var1, "guildVersions");
      r.h(var2, "nonGuildVersions");
      return new DatabaseVersions(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DatabaseVersions) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.guildVersions, var1.guildVersions)) {
            return false;
         } else {
            return r.c(this.nonGuildVersions, var1.nonGuildVersions);
         }
      }
   }

   public override fun hashCode(): Int {
      return Arrays.hashCode((Object[])this.guildVersions) * 31 + Arrays.hashCode((Object[])this.nonGuildVersions);
   }

   public override fun toString(): String {
      val var1: java.lang.String = Arrays.toString((Object[])this.guildVersions);
      val var3: java.lang.String = Arrays.toString((Object[])this.nonGuildVersions);
      val var2: StringBuilder = new StringBuilder();
      var2.append("DatabaseVersions(guildVersions=");
      var2.append(var1);
      var2.append(", nonGuildVersions=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public final val EMPTY: DatabaseVersions

      public fun serializer(): KSerializer<DatabaseVersions> {
         return DatabaseVersions.$serializer.INSTANCE;
      }
   }
}
