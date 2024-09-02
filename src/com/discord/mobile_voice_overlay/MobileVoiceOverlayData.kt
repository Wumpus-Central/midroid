package com.discord.mobile_voice_overlay

import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.h
import gn.n0
import gn.o1
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

@f
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
   public final val canGenerateInvite: Boolean
   public final val channelId: ChannelId
   public final val channelName: String
   public final val channelSelectorResults: List<MobileVoiceOverlaySelectorResult>
   public final val connectionQuality: ConnectionQuality
   public final val deafened: Boolean
   public final val extraUsers: Int
   public final val guildId: GuildId?
   public final val guildName: String
   public final val muted: Boolean
   public final val users: List<MobileVoiceOverlayDataUser>

   fun MobileVoiceOverlayData(
      var1: Int,
      var2: MutableList<MobileVoiceOverlayDataUser>,
      var3: Int,
      var4: GuildId,
      var5: ChannelId,
      var6: java.lang.String,
      var7: java.lang.String,
      var8: Boolean,
      var9: Boolean,
      var10: ConnectionQuality,
      var11: Boolean,
      var12: MutableList<MobileVoiceOverlaySelectorResult>,
      var13: SerializationConstructorMarker
   ) {
      if (2047 != (var1 and 2047)) {
         o1.b(var1, 2047, MobileVoiceOverlayData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.users = var2;
      this.extraUsers = var3;
      this.guildId = var4;
      this.channelId = var5.unbox-impl();
      this.channelName = var6;
      this.guildName = var7;
      this.deafened = var8;
      this.muted = var9;
      this.connectionQuality = var10;
      this.canGenerateInvite = var11;
      this.channelSelectorResults = var12;
   }

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
      q.h(var1, "users");
      q.h(var6, "channelName");
      q.h(var7, "guildName");
      q.h(var10, "connectionQuality");
      q.h(var12, "channelSelectorResults");
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
      q.h(var1, "users");
      q.h(var6, "channelName");
      q.h(var7, "guildName");
      q.h(var10, "connectionQuality");
      q.h(var12, "channelSelectorResults");
      return new MobileVoiceOverlayData(var1, var2, var3, var4, var6, var7, var8, var9, var10, var11, var12, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MobileVoiceOverlayData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.users, var1.users)) {
            return false;
         } else if (this.extraUsers != var1.extraUsers) {
            return false;
         } else if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.channelName, var1.channelName)) {
            return false;
         } else if (!q.c(this.guildName, var1.guildName)) {
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
            return q.c(this.channelSelectorResults, var1.channelSelectorResults);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.users.hashCode();
      val var2: Int = Integer.hashCode(this.extraUsers);
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
                                                            (((var3 * 31 + var2) * 31 + var1) * 31 + ChannelId.hashCode-impl(this.channelId)) * 31
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
      val var12: GuildId = this.guildId;
      val var10: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var5: java.lang.String = this.channelName;
      val var8: java.lang.String = this.guildName;
      val var4: Boolean = this.deafened;
      val var3: Boolean = this.muted;
      val var9: ConnectionQuality = this.connectionQuality;
      val var2: Boolean = this.canGenerateInvite;
      val var11: java.util.List = this.channelSelectorResults;
      val var7: StringBuilder = new StringBuilder();
      var7.append("MobileVoiceOverlayData(users=");
      var7.append(var6);
      var7.append(", extraUsers=");
      var7.append(var1);
      var7.append(", guildId=");
      var7.append(var12);
      var7.append(", channelId=");
      var7.append(var10);
      var7.append(", channelName=");
      var7.append(var5);
      var7.append(", guildName=");
      var7.append(var8);
      var7.append(", deafened=");
      var7.append(var4);
      var7.append(", muted=");
      var7.append(var3);
      var7.append(", connectionQuality=");
      var7.append(var9);
      var7.append(", canGenerateInvite=");
      var7.append(var2);
      var7.append(", channelSelectorResults=");
      var7.append(var11);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MobileVoiceOverlayData.$serializer = new MobileVoiceOverlayData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlayData", var0, 11);
         var1.l("users", false);
         var1.l("extraUsers", false);
         var1.l("guildId", false);
         var1.l("channelId", false);
         var1.l("channelName", false);
         var1.l("guildName", false);
         var1.l("deafened", false);
         var1.l("muted", false);
         var1.l("connectionQuality", false);
         var1.l("canGenerateInvite", false);
         var1.l("channelSelectorResults", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var7: Array<KSerializer> = MobileVoiceOverlayData.access$get$childSerializers$cp();
         return new KSerializer[]{
            var7[0], n0.a, en.a.u(GuildId.$serializer.INSTANCE), ChannelId.$serializer.INSTANCE, b2.a, b2.a, h.a, h.a, var7[8], h.a, var7[10]
         };
      }

      public open fun deserialize(decoder: Decoder): MobileVoiceOverlayData {
         q.h(var1, "decoder");
         val var17: SerialDescriptor = this.getDescriptor();
         val var18: c = var1.b(var17);
         val var16: Array<KSerializer> = MobileVoiceOverlayData.access$get$childSerializers$cp();
         var var9: Boolean = var18.p();
         var var6: Byte = 7;
         var var2: Int = 0;
         var var3: Int;
         val var4: Int;
         var var10: Any;
         var var11: Any;
         var var12: Any;
         var var13: java.util.List;
         val var14: ConnectionQuality;
         var var15: Any;
         val var20: java.util.List;
         var var24: Byte;
         if (var9) {
            var13 = var18.y(var17, 0, var16[0], null) as java.util.List;
            var3 = var18.i(var17, 1);
            var11 = var18.n(var17, 2, GuildId.$serializer.INSTANCE, null) as GuildId;
            var12 = var18.y(var17, 3, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var10 = var18.m(var17, 4);
            val var19: java.lang.String = var18.m(var17, 5);
            var24 = var18.C(var17, 6);
            val var22: Byte = var18.C(var17, 7);
            var14 = var18.y(var17, 8, var16[8], null) as ConnectionQuality;
            var9 = var18.C(var17, 9);
            val var29: java.util.List = var18.y(var17, 10, var16[10], null) as java.util.List;
            var4 = 2047;
            var15 = var19;
            var6 = var24;
            var24 = var22;
            var20 = var29;
         } else {
            var var7: Boolean = true;
            var9 = false;
            var var23: Byte = 0;
            var3 = 0;
            var15 = null;
            var var27: java.util.List = null;
            var12 = null;
            var11 = null;
            var13 = null;
            var10 = null;
            var var21: Any = null;
            var24 = 0;

            while (var7) {
               val var8: Int = var18.o(var17);
               switch (var8) {
                  case -1:
                     var7 = false;
                     continue;
                  case 0:
                     var13 = var18.y(var17, 0, var16[0], var13) as java.util.List;
                     var2 |= 1;
                     var6 = 7;
                     continue;
                  case 1:
                     var3 = var18.i(var17, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var11 = var18.n(var17, 2, GuildId.$serializer.INSTANCE, var11) as GuildId;
                     var2 |= 4;
                     break;
                  case 3:
                     var12 = var18.y(var17, 3, ChannelId.$serializer.INSTANCE, var12) as ChannelId;
                     var2 |= 8;
                     break;
                  case 4:
                     var10 = var18.m(var17, 4);
                     var2 |= 16;
                     continue;
                  case 5:
                     var21 = var18.m(var17, 5);
                     var2 |= 32;
                     continue;
                  case 6:
                     var23 = var18.C(var17, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var24 = var18.C(var17, var6);
                     var2 |= 128;
                     continue;
                  case 8:
                     var15 = var18.y(var17, 8, var16[8], var15) as ConnectionQuality;
                     var2 |= 256;
                     continue;
                  case 9:
                     var9 = var18.C(var17, 9);
                     var2 |= 512;
                     continue;
                  case 10:
                     var27 = var18.y(var17, 10, var16[10], var27) as java.util.List;
                     var2 |= 1024;
                     continue;
                  default:
                     throw new n(var8);
               }

               var6 = 7;
            }

            var20 = var27;
            var14 = (ConnectionQuality)var15;
            var6 = var23;
            var15 = var21;
            var4 = var2;
         }

         var18.c(var17);
         return new MobileVoiceOverlayData(
            var4,
            var13,
            var3,
            (GuildId)var11,
            (ChannelId)var12,
            (java.lang.String)var10,
            (java.lang.String)var15,
            (boolean)var6,
            (boolean)var24,
            var14,
            var9,
            var20,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: MobileVoiceOverlayData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MobileVoiceOverlayData.write$Self$mobile_voice_overlay_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlayData> {
         return MobileVoiceOverlayData.$serializer.INSTANCE;
      }
   }
}
