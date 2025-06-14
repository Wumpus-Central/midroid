package com.discord.mobile_voice_overlay

import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import kotlinx.serialization.KSerializer

@mb.f
public data class MobileVoiceOverlaySelectorResult(guildId: GuildId, channelId: ChannelId, channelName: String, guildName: String, categoryName: String) : MobileVoiceOverlaySelectorResult(
      var1, var3, var5, var6, var7
   ) {
   public final val guildId: GuildId
   public final val channelId: ChannelId
   public final val channelName: String
   public final val guildName: String
   public final val categoryName: String

   fun MobileVoiceOverlaySelectorResult(var1: Long, var3: Long, var5: java.lang.String, var6: java.lang.String, var7: java.lang.String) {
      kotlin.jvm.internal.q.h(var5, "channelName");
      kotlin.jvm.internal.q.h(var6, "guildName");
      kotlin.jvm.internal.q.h(var7, "categoryName");
      super();
      this.guildId = var1;
      this.channelId = var3;
      this.channelName = var5;
      this.guildName = var6;
      this.categoryName = var7;
   }

   public operator fun component1(): GuildId {
      return this.guildId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.channelName;
   }

   public operator fun component4(): String {
      return this.guildName;
   }

   public operator fun component5(): String {
      return this.categoryName;
   }

   public fun copy(guildId: GuildId = ..., channelId: ChannelId = ..., channelName: String = ..., guildName: String = ..., categoryName: String = ...): MobileVoiceOverlaySelectorResult {
      kotlin.jvm.internal.q.h(var5, "channelName");
      kotlin.jvm.internal.q.h(var6, "guildName");
      kotlin.jvm.internal.q.h(var7, "categoryName");
      return new MobileVoiceOverlaySelectorResult(var1, var3, var5, var6, var7, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MobileVoiceOverlaySelectorResult) {
         return false;
      } else {
         var1 = var1;
         if (!GuildId.equals-impl0(this.guildId, var1.guildId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.channelName, var1.channelName)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.guildName, var1.guildName)) {
            return false;
         } else {
            return kotlin.jvm.internal.q.c(this.categoryName, var1.categoryName);
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               ((GuildId.hashCode-impl(this.guildId) * 31 + ChannelId.hashCode-impl(this.channelId)) * 31 + this.channelName.hashCode()) * 31
                  + this.guildName.hashCode()
            )
            * 31
         + this.categoryName.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = GuildId.toString-impl(this.guildId);
      val var1: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var4: java.lang.String = this.channelName;
      val var3: java.lang.String = this.guildName;
      val var5: java.lang.String = this.categoryName;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MobileVoiceOverlaySelectorResult(guildId=");
      var6.append(var2);
      var6.append(", channelId=");
      var6.append(var1);
      var6.append(", channelName=");
      var6.append(var4);
      var6.append(", guildName=");
      var6.append(var3);
      var6.append(", categoryName=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlaySelectorResult> {
         return MobileVoiceOverlaySelectorResult.$serializer.INSTANCE;
      }
   }
}
