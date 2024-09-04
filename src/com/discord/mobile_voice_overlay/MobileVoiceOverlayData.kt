package com.discord.mobile_voice_overlay

import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.h
import xk.m0
import xk.n1

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
         n1.b(var1, 2047, MobileVoiceOverlayData.$serializer.INSTANCE.getDescriptor());
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

   @JvmStatic
   public fun `write$Self`(self: MobileVoiceOverlayData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, new xk.f(MobileVoiceOverlayDataUser.$serializer.INSTANCE), var0.users);
      var1.w(var2, 1, var0.extraUsers);
      var1.m(var2, 2, GuildId.$serializer.INSTANCE, var0.guildId);
      var1.y(var2, 3, ChannelId.$serializer.INSTANCE, ChannelId.box-impl(var0.channelId));
      var1.z(var2, 4, var0.channelName);
      var1.z(var2, 5, var0.guildName);
      var1.x(var2, 6, var0.deafened);
      var1.x(var2, 7, var0.muted);
      var1.y(var2, 8, ConnectionQuality.Companion.serializer(), var0.connectionQuality);
      var1.x(var2, 9, var0.canGenerateInvite);
      var1.y(var2, 10, new xk.f(MobileVoiceOverlaySelectorResult.$serializer.INSTANCE), var0.channelSelectorResults);
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
      r.h(var1, "users");
      r.h(var6, "channelName");
      r.h(var7, "guildName");
      r.h(var10, "connectionQuality");
      r.h(var12, "channelSelectorResults");
      return new MobileVoiceOverlayData(var1, var2, var3, var4, var6, var7, var8, var9, var10, var11, var12, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MobileVoiceOverlayData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.users, var1.users)) {
            return false;
         } else if (this.extraUsers != var1.extraUsers) {
            return false;
         } else if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.channelName, var1.channelName)) {
            return false;
         } else if (!r.c(this.guildName, var1.guildName)) {
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
            return r.c(this.channelSelectorResults, var1.channelSelectorResults);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = this.users.hashCode();
      val var6: Int = Integer.hashCode(this.extraUsers);
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = GuildId.hashCode-impl(this.guildId.unbox-impl());
      }

      val var9: Int = ChannelId.hashCode-impl(this.channelId);
      val var10: Int = this.channelName.hashCode();
      val var8: Int = this.guildName.hashCode();
      var var4: Byte = 1;
      var var2: Byte = this.deafened;
      if (this.deafened != 0) {
         var2 = 1;
      }

      var var13: Byte = this.muted;
      if (this.muted != 0) {
         var13 = 1;
      }

      val var11: Int = this.connectionQuality.hashCode();
      if (this.canGenerateInvite == 0) {
         var4 = this.canGenerateInvite;
      }

      return (((((((((var7 * 31 + var6) * 31 + var1) * 31 + var9) * 31 + var10) * 31 + var8) * 31 + var2) * 31 + var13) * 31 + var11) * 31 + var4) * 31
         + this.channelSelectorResults.hashCode();
   }

   public override fun toString(): String {
      val var10: java.util.List = this.users;
      val var1: Int = this.extraUsers;
      val var5: GuildId = this.guildId;
      val var11: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var12: java.lang.String = this.channelName;
      val var8: java.lang.String = this.guildName;
      val var4: Boolean = this.deafened;
      val var3: Boolean = this.muted;
      val var9: ConnectionQuality = this.connectionQuality;
      val var2: Boolean = this.canGenerateInvite;
      val var6: java.util.List = this.channelSelectorResults;
      val var7: StringBuilder = new StringBuilder();
      var7.append("MobileVoiceOverlayData(users=");
      var7.append(var10);
      var7.append(", extraUsers=");
      var7.append(var1);
      var7.append(", guildId=");
      var7.append(var5);
      var7.append(", channelId=");
      var7.append(var11);
      var7.append(", channelName=");
      var7.append(var12);
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
      var7.append(var6);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : f0<MobileVoiceOverlayData> {
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
         val var2: xk.f = new xk.f(MobileVoiceOverlayDataUser.$serializer.INSTANCE);
         val var4: m0 = m0.a;
         val var5: KSerializer = vk.a.u(GuildId.$serializer.INSTANCE);
         val var1: h = h.a;
         return new KSerializer[]{
            var2,
            var4,
            var5,
            ChannelId.$serializer.INSTANCE,
            a2.a,
            a2.a,
            h.a,
            h.a,
            ConnectionQuality.Companion.serializer(),
            var1,
            new xk.f(MobileVoiceOverlaySelectorResult.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): MobileVoiceOverlayData {
         r.h(var1, "decoder");
         val var17: SerialDescriptor = this.getDescriptor();
         val var18: c = var1.b(var17);
         var var10: Boolean = var18.p();
         var var4: Int = 10;
         var var8: Byte = 6;
         var var2: Int = 0;
         var var3: Byte;
         var var5: Byte;
         val var6: Int;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var15: Any;
         var var16: Any;
         var var19: Any;
         if (var10) {
            var14 = var18.y(var17, 0, new xk.f(MobileVoiceOverlayDataUser.$serializer.INSTANCE), null);
            var2 = var18.i(var17, 1);
            var15 = var18.n(var17, 2, GuildId.$serializer.INSTANCE, null);
            var16 = var18.y(var17, 3, ChannelId.$serializer.INSTANCE, null);
            var13 = var18.m(var17, 4);
            var12 = var18.m(var17, 5);
            var3 = var18.C(var17, 6);
            var5 = var18.C(var17, 7);
            var11 = var18.y(var17, 8, ConnectionQuality.Companion.serializer(), null);
            var10 = var18.C(var17, 9);
            var19 = var18.y(var17, 10, new xk.f(MobileVoiceOverlaySelectorResult.$serializer.INSTANCE), null);
            var4 = 2047;
            var6 = var2;
         } else {
            var var7: Boolean = true;
            var10 = false;
            var var25: Byte = 0;
            var5 = 0;
            var11 = null;
            var19 = null;
            var16 = null;
            var15 = null;
            var14 = null;
            var13 = null;
            var12 = null;
            var3 = 0;

            while (var7) {
               label33: {
                  val var9: Int = var18.o(var17);
                  switch (var9) {
                     case -1:
                        var7 = false;
                        continue;
                     case 0:
                        var14 = var18.y(var17, 0, new xk.f(MobileVoiceOverlayDataUser.$serializer.INSTANCE), var14);
                        var2 |= 1;
                        var4 = 10;
                        continue;
                     case 1:
                        var5 = var18.i(var17, 1);
                        var2 |= 2;
                        break;
                     case 2:
                        var15 = var18.n(var17, 2, GuildId.$serializer.INSTANCE, var15);
                        var2 |= 4;
                        break;
                     case 3:
                        var16 = var18.y(var17, 3, ChannelId.$serializer.INSTANCE, var16);
                        var2 |= 8;
                        break;
                     case 4:
                        var13 = var18.m(var17, 4);
                        var2 |= 16;
                        var4 = 10;
                        continue;
                     case 5:
                        var12 = var18.m(var17, 5);
                        var2 |= 32;
                        continue;
                     case 6:
                        var25 = var18.C(var17, var8);
                        var2 |= 64;
                        continue;
                     case 7:
                        var3 = var18.C(var17, 7);
                        var2 |= 128;
                        break label33;
                     case 8:
                        var11 = var18.y(var17, 8, ConnectionQuality.Companion.serializer(), var11);
                        var2 |= 256;
                        break label33;
                     case 9:
                        var10 = var18.C(var17, 9);
                        var2 |= 512;
                        break label33;
                     case 10:
                        var19 = var18.y(var17, var4, new xk.f(MobileVoiceOverlaySelectorResult.$serializer.INSTANCE), var19);
                        var2 |= 1024;
                        break label33;
                     default:
                        throw new n(var9);
                  }

                  var4 = 10;
                  continue;
               }

               var8 = 6;
            }

            var3 = var25;
            var6 = var5;
            var5 = var3;
            var4 = var2;
         }

         var18.c(var17);
         return new MobileVoiceOverlayData(
            var4,
            var14 as java.util.List,
            var6,
            var15 as GuildId,
            var16 as ChannelId,
            (java.lang.String)var13,
            (java.lang.String)var12,
            (boolean)var3,
            (boolean)var5,
            var11 as ConnectionQuality,
            var10,
            var19 as java.util.List,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: MobileVoiceOverlayData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MobileVoiceOverlayData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlayData> {
         return MobileVoiceOverlayData.$serializer.INSTANCE;
      }
   }
}
