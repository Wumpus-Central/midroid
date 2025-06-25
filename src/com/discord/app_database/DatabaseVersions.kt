package com.discord.app_database

import java.util.Arrays
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class DatabaseVersions(vararg guildVersions: Any, vararg nonGuildVersions: Any) {
   public final val guildVersions: Array<GuildVersion>
   public final val nonGuildVersions: Array<NonGuildVersion>

   init {
      q.h(var1, "guildVersions");
      q.h(var2, "nonGuildVersions");
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
      q.h(var1, "guildVersions");
      q.h(var2, "nonGuildVersions");
      return new DatabaseVersions(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DatabaseVersions) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.guildVersions, var1.guildVersions)) {
            return false;
         } else {
            return q.c(this.nonGuildVersions, var1.nonGuildVersions);
         }
      }
   }

   public override fun hashCode(): Int {
      return Arrays.hashCode((Object[])this.guildVersions) * 31 + Arrays.hashCode((Object[])this.nonGuildVersions);
   }

   public override fun toString(): String {
      val var1: java.lang.String = Arrays.toString((Object[])this.guildVersions);
      val var2: java.lang.String = Arrays.toString((Object[])this.nonGuildVersions);
      val var3: StringBuilder = new StringBuilder();
      var3.append("DatabaseVersions(guildVersions=");
      var3.append(var1);
      var3.append(", nonGuildVersions=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public final val EMPTY: DatabaseVersions

      public fun serializer(): KSerializer<DatabaseVersions> {
         return DatabaseVersions.$serializer.INSTANCE;
      }
   }
}
