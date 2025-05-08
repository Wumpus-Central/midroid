package com.discord.chat.bridge.automod

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import ha.f
import ha.n
import ia.a
import ka.C0
import ka.G
import ka.N
import ka.h
import ka.p0
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
public data class FlaggedMessageEmbed(id: MessageId,
   channelId: ChannelId,
   guildId: GuildId? = ...,
   userId: UserId? = ...,
   content: StructurableText? = ...,
   channelName: String? = ...,
   username: String? = ...,
   usernameColor: Int,
   roleColor: Int? = ...,
   shouldShowRoleDot: Boolean,
   avatarURL: String? = ...,
   communicationDisabled: Boolean? = ...
) : FlaggedMessageEmbed(var1, var2, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13) {
   public final val avatarURL: String?
   public final val channelId: ChannelId
   public final val channelName: String?
   public final val communicationDisabled: Boolean?
   public final val content: StructurableText?
   public final val guildId: GuildId?
   public final val id: MessageId
   public final val roleColor: Int?
   public final val shouldShowRoleDot: Boolean
   public final val userId: UserId?
   public final val username: String?
   public final val usernameColor: Int

   fun FlaggedMessageEmbed(
      var1: Int,
      var2: java.lang.String,
      var3: ChannelId,
      var4: GuildId,
      var5: UserId,
      var6: StructurableText,
      var7: java.lang.String,
      var8: java.lang.String,
      var9: Int,
      var10: Int,
      var11: Boolean,
      var12: java.lang.String,
      var13: java.lang.Boolean,
      var14: SerializationConstructorMarker
   ) {
      if (643 != (var1 and 643)) {
         p0.b(var1, 643, FlaggedMessageEmbed.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.id = var2;
      this.channelId = var3.unbox-impl();
      if ((var1 and 4) == 0) {
         this.guildId = null;
      } else {
         this.guildId = var4;
      }

      if ((var1 and 8) == 0) {
         this.userId = null;
      } else {
         this.userId = var5;
      }

      if ((var1 and 16) == 0) {
         this.content = null;
      } else {
         this.content = var6;
      }

      if ((var1 and 32) == 0) {
         this.channelName = null;
      } else {
         this.channelName = var7;
      }

      if ((var1 and 64) == 0) {
         this.username = null;
      } else {
         this.username = var8;
      }

      this.usernameColor = var9;
      if ((var1 and 256) == 0) {
         this.roleColor = null;
      } else {
         this.roleColor = var10;
      }

      this.shouldShowRoleDot = var11;
      if ((var1 and 1024) == 0) {
         this.avatarURL = null;
      } else {
         this.avatarURL = var12;
      }

      if ((var1 and 2048) == 0) {
         this.communicationDisabled = java.lang.Boolean.FALSE;
      } else {
         this.communicationDisabled = var13;
      }
   }

   fun FlaggedMessageEmbed(
      var1: java.lang.String,
      var2: Long,
      var4: GuildId,
      var5: UserId,
      var6: StructurableText,
      var7: java.lang.String,
      var8: java.lang.String,
      var9: Int,
      var10: Int,
      var11: Boolean,
      var12: java.lang.String,
      var13: java.lang.Boolean
   ) {
      q.h(var1, "id");
      super();
      this.id = var1;
      this.channelId = var2;
      this.guildId = var4;
      this.userId = var5;
      this.content = var6;
      this.channelName = var7;
      this.username = var8;
      this.usernameColor = var9;
      this.roleColor = var10;
      this.shouldShowRoleDot = var11;
      this.avatarURL = var12;
      this.communicationDisabled = var13;
   }

   public operator fun component1(): MessageId {
      return this.id;
   }

   public operator fun component10(): Boolean {
      return this.shouldShowRoleDot;
   }

   public operator fun component11(): String? {
      return this.avatarURL;
   }

   public operator fun component12(): Boolean? {
      return this.communicationDisabled;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): GuildId? {
      return this.guildId;
   }

   public operator fun component4(): UserId? {
      return this.userId;
   }

   public operator fun component5(): StructurableText? {
      return this.content;
   }

   public operator fun component6(): String? {
      return this.channelName;
   }

   public operator fun component7(): String? {
      return this.username;
   }

   public operator fun component8(): Int {
      return this.usernameColor;
   }

   public operator fun component9(): Int? {
      return this.roleColor;
   }

   public fun copy(
      id: MessageId = ...,
      channelId: ChannelId = ...,
      guildId: GuildId? = ...,
      userId: UserId? = ...,
      content: StructurableText? = ...,
      channelName: String? = ...,
      username: String? = ...,
      usernameColor: Int = ...,
      roleColor: Int? = ...,
      shouldShowRoleDot: Boolean = ...,
      avatarURL: String? = ...,
      communicationDisabled: Boolean? = ...
   ): FlaggedMessageEmbed {
      q.h(var1, "id");
      return new FlaggedMessageEmbed(var1, var2, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FlaggedMessageEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.id, var1.id)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.userId, var1.userId)) {
            return false;
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else if (!q.c(this.channelName, var1.channelName)) {
            return false;
         } else if (!q.c(this.username, var1.username)) {
            return false;
         } else if (this.usernameColor != var1.usernameColor) {
            return false;
         } else if (!q.c(this.roleColor, var1.roleColor)) {
            return false;
         } else if (this.shouldShowRoleDot != var1.shouldShowRoleDot) {
            return false;
         } else if (!q.c(this.avatarURL, var1.avatarURL)) {
            return false;
         } else {
            return q.c(this.communicationDisabled, var1.communicationDisabled);
         }
      }
   }

   public override fun hashCode(): Int {
      val var9: Int = MessageId.hashCode-impl(this.id);
      val var10: Int = ChannelId.hashCode-impl(this.channelId);
      var var8: Int = 0;
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = GuildId.hashCode-impl(this.guildId.unbox-impl());
      }

      val var2: Int;
      if (this.userId == null) {
         var2 = 0;
      } else {
         var2 = UserId.hashCode-impl(this.userId.unbox-impl());
      }

      val var3: Int;
      if (this.content == null) {
         var3 = 0;
      } else {
         var3 = this.content.hashCode();
      }

      val var4: Int;
      if (this.channelName == null) {
         var4 = 0;
      } else {
         var4 = this.channelName.hashCode();
      }

      val var5: Int;
      if (this.username == null) {
         var5 = 0;
      } else {
         var5 = this.username.hashCode();
      }

      val var11: Int = Integer.hashCode(this.usernameColor);
      val var6: Int;
      if (this.roleColor == null) {
         var6 = 0;
      } else {
         var6 = this.roleColor.hashCode();
      }

      val var12: Int = java.lang.Boolean.hashCode(this.shouldShowRoleDot);
      val var7: Int;
      if (this.avatarURL == null) {
         var7 = 0;
      } else {
         var7 = this.avatarURL.hashCode();
      }

      if (this.communicationDisabled != null) {
         var8 = this.communicationDisabled.hashCode();
      }

      return ((((((((((var9 * 31 + var10) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var11) * 31 + var6) * 31 + var12) * 31 + var7)
            * 31
         + var8;
   }

   public override fun toString(): String {
      val var9: java.lang.String = MessageId.toString-impl(this.id);
      val var11: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: GuildId = this.guildId;
      val var7: UserId = this.userId;
      val var12: StructurableText = this.content;
      val var4: java.lang.String = this.channelName;
      val var8: java.lang.String = this.username;
      val var1: Int = this.usernameColor;
      val var13: Int = this.roleColor;
      val var2: Boolean = this.shouldShowRoleDot;
      val var6: java.lang.String = this.avatarURL;
      val var5: java.lang.Boolean = this.communicationDisabled;
      val var10: StringBuilder = new StringBuilder();
      var10.append("FlaggedMessageEmbed(id=");
      var10.append(var9);
      var10.append(", channelId=");
      var10.append(var11);
      var10.append(", guildId=");
      var10.append(var3);
      var10.append(", userId=");
      var10.append(var7);
      var10.append(", content=");
      var10.append(var12);
      var10.append(", channelName=");
      var10.append(var4);
      var10.append(", username=");
      var10.append(var8);
      var10.append(", usernameColor=");
      var10.append(var1);
      var10.append(", roleColor=");
      var10.append(var13);
      var10.append(", shouldShowRoleDot=");
      var10.append(var2);
      var10.append(", avatarURL=");
      var10.append(var6);
      var10.append(", communicationDisabled=");
      var10.append(var5);
      var10.append(")");
      return var10.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: FlaggedMessageEmbed.$serializer = new FlaggedMessageEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.automod.FlaggedMessageEmbed", var0, 12);
         var1.l("id", false);
         var1.l("channelId", false);
         var1.l("guildId", true);
         var1.l("userId", true);
         var1.l("content", true);
         var1.l("channelName", true);
         var1.l("username", true);
         var1.l("usernameColor", false);
         var1.l("roleColor", true);
         var1.l("shouldShowRoleDot", false);
         var1.l("avatarURL", true);
         var1.l("communicationDisabled", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var5: KSerializer = a.u(GuildId.$serializer.INSTANCE);
         val var8: KSerializer = a.u(UserId.$serializer.INSTANCE);
         val var4: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var9: C0 = C0.a;
         val var3: KSerializer = a.u(C0.a);
         val var6: KSerializer = a.u(var9);
         val var7: N = N.a;
         val var1: KSerializer = a.u(N.a);
         val var2: h = h.a;
         return new KSerializer[]{
            MessageId.$serializer.INSTANCE, ChannelId.$serializer.INSTANCE, var5, var8, var4, var3, var6, var7, var1, h.a, a.u(var9), a.u(var2)
         };
      }

      public open fun deserialize(decoder: Decoder): FlaggedMessageEmbed {
         q.h(var1, "decoder");
         val var25: SerialDescriptor = this.getDescriptor();
         val var26: c = var1.c(var25);
         val var10: Boolean = var26.y();
         var var6: Byte = 10;
         var var7: Byte = 9;
         var var8: Byte = 7;
         var var15: java.lang.String = null;
         var var3: Int;
         var var4: Byte;
         val var5: Int;
         var var16: Any;
         var var18: Any;
         val var20: java.lang.String;
         val var21: Any;
         val var22: Int;
         val var23: Any;
         val var24: Any;
         var var43: java.lang.String;
         var var46: Any;
         if (var10) {
            val var27: MessageId = var26.m(var25, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var28: java.lang.String;
            if (var27 != null) {
               var28 = var27.unbox-impl();
            } else {
               var28 = null;
            }

            var21 = var26.m(var25, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var16 = var26.v(var25, 2, GuildId.$serializer.INSTANCE, null) as GuildId;
            var18 = var26.v(var25, 3, UserId.$serializer.INSTANCE, null) as UserId;
            var46 = var26.v(var25, 4, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            val var13: C0 = C0.a;
            val var14: java.lang.String = var26.v(var25, 5, C0.a, null) as java.lang.String;
            val var12: java.lang.String = var26.v(var25, 6, var13, null) as java.lang.String;
            var3 = var26.k(var25, 7);
            val var11: Int = var26.v(var25, 8, N.a, null) as Int;
            val var2: Byte = var26.s(var25, 9);
            var43 = var26.v(var25, 10, var13, null) as java.lang.String;
            val var35: java.lang.Boolean = var26.v(var25, 11, h.a, null) as java.lang.Boolean;
            var5 = 4095;
            var43 = var28;
            var15 = (java.lang.String)var46;
            var46 = var14;
            var23 = var12;
            var22 = var11;
            var4 = var2;
            var20 = var43;
            var24 = var35;
         } else {
            var var32: Boolean = true;
            var var31: Int = 0;
            var4 = 0;
            var3 = 0;
            var var37: java.lang.String = null;
            var16 = null;
            var43 = null;
            var var36: Any = null;
            var18 = null;
            var46 = null;
            var var30: Any = null;
            var var34: Any = null;
            var var33: Any = null;

            while (var32) {
               label63: {
                  val var9: Int = var26.x(var25);
                  switch (var9) {
                     case -1:
                        var32 = false;
                        break;
                     case 0:
                        val var38: MessageId;
                        if (var37 != null) {
                           var38 = MessageId.box-impl(var37);
                        } else {
                           var38 = null;
                        }

                        val var39: MessageId = var26.m(var25, 0, MessageId.$serializer.INSTANCE, var38) as MessageId;
                        if (var39 != null) {
                           var37 = var39.unbox-impl();
                        } else {
                           var37 = null;
                        }

                        var31 |= 1;
                        break;
                     case 1:
                        var33 = var26.m(var25, 1, ChannelId.$serializer.INSTANCE, var33) as ChannelId;
                        var31 |= 2;
                        break;
                     case 2:
                        var34 = var26.v(var25, 2, GuildId.$serializer.INSTANCE, var34) as GuildId;
                        var31 |= 4;
                        break;
                     case 3:
                        var36 = var26.v(var25, 3, UserId.$serializer.INSTANCE, var36) as UserId;
                        var31 |= 8;
                        break label63;
                     case 4:
                        var30 = var26.v(var25, 4, StructurableTextSerializer.INSTANCE, var30) as StructurableText;
                        var31 |= 16;
                        break label63;
                     case 5:
                        var18 = var26.v(var25, 5, C0.a, var18) as java.lang.String;
                        var31 |= 32;
                        var6 = 10;
                        continue;
                     case 6:
                        var46 = var26.v(var25, 6, C0.a, var46) as java.lang.String;
                        var31 |= 64;
                        var6 = 10;
                        continue;
                     case 7:
                        var3 = var26.k(var25, var8);
                        var31 |= 128;
                        continue;
                     case 8:
                        var16 = var26.v(var25, 8, N.a, var16) as Int;
                        var31 |= 256;
                        continue;
                     case 9:
                        var4 = var26.s(var25, var7);
                        var31 |= 512;
                        continue;
                     case 10:
                        var15 = var26.v(var25, var6, C0.a, var15) as java.lang.String;
                        var31 |= 1024;
                        continue;
                     case 11:
                        var43 = var26.v(var25, 11, h.a, var43) as java.lang.Boolean;
                        var31 |= 2048;
                        continue;
                     default:
                        throw new n(var9);
                  }

                  var6 = 10;
                  var7 = 9;
                  var8 = 7;
                  continue;
               }

               var6 = 10;
               var7 = 9;
            }

            var24 = var43;
            var20 = var15;
            var22 = (Integer)var16;
            var23 = var46;
            var46 = var18;
            var15 = (java.lang.String)var30;
            var18 = var36;
            var16 = var34;
            var21 = var33;
            var43 = var37;
            var5 = var31;
         }

         var26.b(var25);
         return new FlaggedMessageEmbed(
            var5,
            var43,
            (ChannelId)var21,
            (GuildId)var16,
            (UserId)var18,
            var15,
            (java.lang.String)var46,
            (java.lang.String)var23,
            var3,
            var22,
            (boolean)var4,
            var20,
            (java.lang.Boolean)var24,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: FlaggedMessageEmbed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         FlaggedMessageEmbed.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ka.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<FlaggedMessageEmbed> {
         return FlaggedMessageEmbed.$serializer.INSTANCE;
      }
   }
}
