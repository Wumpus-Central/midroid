package com.discord.chat.reactevents

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapConnectionsRoleTagData(userId: String, guildId: String, channelId: String, roleId: String) : ReactEvent {
   public final val userId: String
   public final val guildId: String
   public final val channelId: String
   public final val roleId: String

   init {
      q.h(var1, "userId");
      q.h(var2, "guildId");
      q.h(var3, "channelId");
      q.h(var4, "roleId");
      super();
      this.userId = var1;
      this.guildId = var2;
      this.channelId = var3;
      this.roleId = var4;
   }

   public operator fun component1(): String {
      return this.userId;
   }

   public operator fun component2(): String {
      return this.guildId;
   }

   public operator fun component3(): String {
      return this.channelId;
   }

   public operator fun component4(): String {
      return this.roleId;
   }

   public fun copy(userId: String = var0.userId, guildId: String = var0.guildId, channelId: String = var0.channelId, roleId: String = var0.roleId): TapConnectionsRoleTagData {
      q.h(var1, "userId");
      q.h(var2, "guildId");
      q.h(var3, "channelId");
      q.h(var4, "roleId");
      return new TapConnectionsRoleTagData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapConnectionsRoleTagData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.userId, var1.userId)) {
            return false;
         } else if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.roleId, var1.roleId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.userId.hashCode() * 31 + this.guildId.hashCode()) * 31 + this.channelId.hashCode()) * 31 + this.roleId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.userId;
      val var1: java.lang.String = this.guildId;
      val var2: java.lang.String = this.channelId;
      val var5: java.lang.String = this.roleId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapConnectionsRoleTagData(userId=");
      var3.append(var4);
      var3.append(", guildId=");
      var3.append(var1);
      var3.append(", channelId=");
      var3.append(var2);
      var3.append(", roleId=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapConnectionsRoleTagData> {
         return TapConnectionsRoleTagData.$serializer.INSTANCE;
      }
   }
}
