package com.discord.chat.bridge.botuikit

import com.discord.primitives.GuildId
import kotlinx.serialization.KSerializer
import xu.m

@m
public data class CheckpointGuild(guildName: String, guildId: GuildId, guildIcon: String? = ...) : CheckpointGuild(var1, var2, var4) {
   public final val guildName: String
   public final val guildId: GuildId
   public final val guildIcon: String?

   fun CheckpointGuild(var1: java.lang.String, var2: Long, var4: java.lang.String) {
      super();
      this.guildName = var1;
      this.guildId = var2;
      this.guildIcon = var4;
   }

   public operator fun component1(): String {
      return this.guildName;
   }

   public operator fun component2(): GuildId {
      return this.guildId;
   }

   public operator fun component3(): String? {
      return this.guildIcon;
   }

   public fun copy(guildName: String = ..., guildId: GuildId = ..., guildIcon: String? = ...): CheckpointGuild {
      return new CheckpointGuild(var1, var2, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CheckpointGuild) {
         return false;
      } else {
         var1 = var1;
         if (!(this.guildName == var1.guildName)) {
            return false;
         } else if (!GuildId.equals-impl0(this.guildId, var1.guildId)) {
            return false;
         } else {
            return this.guildIcon == var1.guildIcon;
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.guildName.hashCode();
      val var3: Int = GuildId.hashCode-impl(this.guildId);
      val var1: Int;
      if (this.guildIcon == null) {
         var1 = 0;
      } else {
         var1 = this.guildIcon.hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.guildName;
      val var1: java.lang.String = GuildId.toString-impl(this.guildId);
      val var4: java.lang.String = this.guildIcon;
      val var3: StringBuilder = new StringBuilder();
      var3.append("CheckpointGuild(guildName=");
      var3.append(var2);
      var3.append(", guildId=");
      var3.append(var1);
      var3.append(", guildIcon=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CheckpointGuild> {
         return CheckpointGuild.$serializer.INSTANCE;
      }
   }
}
