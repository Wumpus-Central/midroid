package com.discord.mobile_voice_overlay

import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import kotlinx.serialization.KSerializer

@tb.g
public data class MobileVoiceOverlayData(users: List<MobileVoiceOverlayDataUser>,
   extraUsers: Int,
   guildId: GuildId?,
   channelId: ChannelId,
   channelName: String,
   guildName: String,
   deafened: Boolean,
   muted: Boolean,
   connectionQuality: ConnectionQuality,
   canGenerateInvite: Boolean,
   channelSelectorResults: List<MobileVoiceOverlaySelectorResult>
) : MobileVoiceOverlayData(var1, var2, var3, var4, var6, var7, var8, var9, var10, var11, var12) {
   public final val users: List<MobileVoiceOverlayDataUser>
   public final val extraUsers: Int
   public final val guildId: GuildId?
   public final val channelId: ChannelId
   public final val channelName: String
   public final val guildName: String
   public final val deafened: Boolean
   public final val muted: Boolean
   public final val connectionQuality: ConnectionQuality
   public final val canGenerateInvite: Boolean
   public final val channelSelectorResults: List<MobileVoiceOverlaySelectorResult>

   fun MobileVoiceOverlayData(
      var1: MutableList<MobileVoiceOverlayDataUser>,
      var2: Int,
      var3: GuildId,
      var4: Long,
      var6: java.lang.String,
      var7: java.lang.String,
      var8: Boolean,
      var9: Boolean,
      var10: ConnectionQuality,
      var11: Boolean,
      var12: MutableList<MobileVoiceOverlaySelectorResult>
   ) {
      kotlin.jvm.internal.r.h(var1, "users");
      kotlin.jvm.internal.r.h(var6, "channelName");
      kotlin.jvm.internal.r.h(var7, "guildName");
      kotlin.jvm.internal.r.h(var10, "connectionQuality");
      kotlin.jvm.internal.r.h(var12, "channelSelectorResults");
      super();
      this.users = var1;
      this.extraUsers = var2;
      this.guildId = var3;
      this.channelId = var4;
      this.channelName = var6;
      this.guildName = var7;
      this.deafened = var8;
      this.muted = var9;
      this.connectionQuality = var10;
      this.canGenerateInvite = var11;
      this.channelSelectorResults = var12;
   }

   public operator fun component1(): List<MobileVoiceOverlayDataUser> {
      return this.users;
   }

   public operator fun component10(): Boolean {
      return this.canGenerateInvite;
   }

   public operator fun component11(): List<MobileVoiceOverlaySelectorResult> {
      return this.channelSelectorResults;
   }

   public operator fun component2(): Int {
      return this.extraUsers;
   }

   public operator fun component3(): GuildId? {
      return this.guildId;
   }

   public operator fun component4(): ChannelId {
      return this.channelId;
   }

   public operator fun component5(): String {
      return this.channelName;
   }

   public operator fun component6(): String {
      return this.guildName;
   }

   public operator fun component7(): Boolean {
      return this.deafened;
   }

   public operator fun component8(): Boolean {
      return this.muted;
   }

   public operator fun component9(): ConnectionQuality {
      return this.connectionQuality;
   }

   public fun copy(
      users: List<MobileVoiceOverlayDataUser> = ...,
      extraUsers: Int = ...,
      guildId: GuildId? = ...,
      channelId: ChannelId = ...,
      channelName: String = ...,
      guildName: String = ...,
      deafened: Boolean = ...,
      muted: Boolean = ...,
      connectionQuality: ConnectionQuality = ...,
      canGenerateInvite: Boolean = ...,
      channelSelectorResults: List<MobileVoiceOverlaySelectorResult> = ...
   ): MobileVoiceOverlayData {
      kotlin.jvm.internal.r.h(var1, "users");
      kotlin.jvm.internal.r.h(var6, "channelName");
      kotlin.jvm.internal.r.h(var7, "guildName");
      kotlin.jvm.internal.r.h(var10, "connectionQuality");
      kotlin.jvm.internal.r.h(var12, "channelSelectorResults");
      return new MobileVoiceOverlayData(var1, var2, var3, var4, var6, var7, var8, var9, var10, var11, var12, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MobileVoiceOverlayData) {
         return false;
      } else {
         var1 = var1;
         if (!kotlin.jvm.internal.r.c(this.users, var1.users)) {
            return false;
         } else if (this.extraUsers != var1.extraUsers) {
            return false;
         } else if (!kotlin.jvm.internal.r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!kotlin.jvm.internal.r.c(this.channelName, var1.channelName)) {
            return false;
         } else if (!kotlin.jvm.internal.r.c(this.guildName, var1.guildName)) {
            return false;
         } else if (this.deafened != var1.deafened) {
            return false;
         } else if (this.muted != var1.muted) {
            return false;
         } else if (this.connectionQuality != var1.connectionQuality) {
            return false;
         } else if (this.canGenerateInvite != var1.canGenerateInvite) {
            return false;
         } else {
            return kotlin.jvm.internal.r.c(this.channelSelectorResults, var1.channelSelectorResults);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.users.hashCode();
      val var3: Int = Integer.hashCode(this.extraUsers);
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = GuildId.hashCode-impl(this.guildId.unbox-impl());
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (((var2 * 31 + var3) * 31 + var1) * 31 + ChannelId.hashCode-impl(this.channelId)) * 31
                                                               + this.channelName.hashCode()
                                                         )
                                                         * 31
                                                      + this.guildName.hashCode()
                                                )
                                                * 31
                                             + java.lang.Boolean.hashCode(this.deafened)
                                       )
                                       * 31
                                    + java.lang.Boolean.hashCode(this.muted)
                              )
                              * 31
                           + this.connectionQuality.hashCode()
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.canGenerateInvite)
            )
            * 31
         + this.channelSelectorResults.hashCode();
   }

   public override fun toString(): String {
      val var6: java.util.List = this.users;
      val var1: Int = this.extraUsers;
      val var10: GuildId = this.guildId;
      val var9: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var5: java.lang.String = this.channelName;
      val var12: java.lang.String = this.guildName;
      val var3: Boolean = this.deafened;
      val var2: Boolean = this.muted;
      val var8: ConnectionQuality = this.connectionQuality;
      val var4: Boolean = this.canGenerateInvite;
      val var7: java.util.List = this.channelSelectorResults;
      val var11: StringBuilder = new StringBuilder();
      var11.append("MobileVoiceOverlayData(users=");
      var11.append(var6);
      var11.append(", extraUsers=");
      var11.append(var1);
      var11.append(", guildId=");
      var11.append(var10);
      var11.append(", channelId=");
      var11.append(var9);
      var11.append(", channelName=");
      var11.append(var5);
      var11.append(", guildName=");
      var11.append(var12);
      var11.append(", deafened=");
      var11.append(var3);
      var11.append(", muted=");
      var11.append(var2);
      var11.append(", connectionQuality=");
      var11.append(var8);
      var11.append(", canGenerateInvite=");
      var11.append(var4);
      var11.append(", channelSelectorResults=");
      var11.append(var7);
      var11.append(")");
      return var11.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlayData> {
         return MobileVoiceOverlayData.$serializer.INSTANCE;
      }
   }
}
