package com.discord.chat.bridge.automod

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
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
import vk.a
import xk.a2
import xk.f0
import xk.h
import xk.m0
import xk.n1

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
         n1.b(var1, 643, FlaggedMessageEmbed.$serializer.INSTANCE.getDescriptor());
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

   @JvmStatic
   public fun `write$Self`(self: FlaggedMessageEmbed, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.id));
      var1.y(var2, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, ChannelId.box-impl(var0.channelId));
      var var3: Boolean;
      if (!var1.A(var2, 2) && var0.guildId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, com.discord.primitives.GuildId..serializer.INSTANCE, var0.guildId);
      }

      if (!var1.A(var2, 3) && var0.userId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, com.discord.primitives.UserId..serializer.INSTANCE, var0.userId);
      }

      if (!var1.A(var2, 4) && var0.content == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, StructurableTextSerializer.INSTANCE, var0.content);
      }

      if (!var1.A(var2, 5) && var0.channelName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, a2.a, var0.channelName);
      }

      if (!var1.A(var2, 6) && var0.username == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, a2.a, var0.username);
      }

      var1.w(var2, 7, var0.usernameColor);
      if (!var1.A(var2, 8) && var0.roleColor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 8, m0.a, var0.roleColor);
      }

      var1.x(var2, 9, var0.shouldShowRoleDot);
      if (!var1.A(var2, 10) && var0.avatarURL == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 10, a2.a, var0.avatarURL);
      }

      label72: {
         if (!var1.A(var2, 11)) {
            var3 = false;
            if (r.c(var0.communicationDisabled, java.lang.Boolean.FALSE)) {
               break label72;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 11, h.a, var0.communicationDisabled);
      }
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
      r.h(var1, "id");
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
         } else if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.userId, var1.userId)) {
            return false;
         } else if (!r.c(this.content, var1.content)) {
            return false;
         } else if (!r.c(this.channelName, var1.channelName)) {
            return false;
         } else if (!r.c(this.username, var1.username)) {
            return false;
         } else if (this.usernameColor != var1.usernameColor) {
            return false;
         } else if (!r.c(this.roleColor, var1.roleColor)) {
            return false;
         } else if (this.shouldShowRoleDot != var1.shouldShowRoleDot) {
            return false;
         } else if (!r.c(this.avatarURL, var1.avatarURL)) {
            return false;
         } else {
            return r.c(this.communicationDisabled, var1.communicationDisabled);
         }
      }
   }

   public override fun hashCode(): Int {
      val var11: Int = MessageId.hashCode-impl(this.id);
      val var10: Int = ChannelId.hashCode-impl(this.channelId);
      var var9: Int = 0;
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

      val var12: Int = Integer.hashCode(this.usernameColor);
      val var6: Int;
      if (this.roleColor == null) {
         var6 = 0;
      } else {
         var6 = this.roleColor.hashCode();
      }

      var var7: Byte = this.shouldShowRoleDot;
      if (this.shouldShowRoleDot != 0) {
         var7 = 1;
      }

      val var14: Int;
      if (this.avatarURL == null) {
         var14 = 0;
      } else {
         var14 = this.avatarURL.hashCode();
      }

      if (this.communicationDisabled != null) {
         var9 = this.communicationDisabled.hashCode();
      }

      return (
               (((((((((var11 * 31 + var10) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var12) * 31 + var6) * 31 + var7) * 31
                  + var14
            )
            * 31
         + var9;
   }

   public override fun toString(): String {
      val var13: java.lang.String = MessageId.toString-impl(this.id);
      val var9: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var7: GuildId = this.guildId;
      val var11: UserId = this.userId;
      val var12: StructurableText = this.content;
      val var3: java.lang.String = this.channelName;
      val var8: java.lang.String = this.username;
      val var1: Int = this.usernameColor;
      val var4: Int = this.roleColor;
      val var2: Boolean = this.shouldShowRoleDot;
      val var10: java.lang.String = this.avatarURL;
      val var5: java.lang.Boolean = this.communicationDisabled;
      val var6: StringBuilder = new StringBuilder();
      var6.append("FlaggedMessageEmbed(id=");
      var6.append(var13);
      var6.append(", channelId=");
      var6.append(var9);
      var6.append(", guildId=");
      var6.append(var7);
      var6.append(", userId=");
      var6.append(var11);
      var6.append(", content=");
      var6.append(var12);
      var6.append(", channelName=");
      var6.append(var3);
      var6.append(", username=");
      var6.append(var8);
      var6.append(", usernameColor=");
      var6.append(var1);
      var6.append(", roleColor=");
      var6.append(var4);
      var6.append(", shouldShowRoleDot=");
      var6.append(var2);
      var6.append(", avatarURL=");
      var6.append(var10);
      var6.append(", communicationDisabled=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<FlaggedMessageEmbed> {
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
         val var9: com.discord.primitives.MessageId..serializer = com.discord.primitives.MessageId..serializer.INSTANCE;
         val var4: com.discord.primitives.ChannelId..serializer = com.discord.primitives.ChannelId..serializer.INSTANCE;
         val var10: KSerializer = a.u(com.discord.primitives.GuildId..serializer.INSTANCE);
         val var3: KSerializer = a.u(com.discord.primitives.UserId..serializer.INSTANCE);
         val var11: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var2: a2 = a2.a;
         val var7: KSerializer = a.u(a2.a);
         val var5: KSerializer = a.u(var2);
         val var8: m0 = m0.a;
         val var1: KSerializer = a.u(m0.a);
         val var6: h = h.a;
         return new KSerializer[]{var9, var4, var10, var3, var11, var7, var5, var8, var1, h.a, a.u(var2), a.u(var6)};
      }

      public open fun deserialize(decoder: Decoder): FlaggedMessageEmbed {
         r.h(var1, "decoder");
         val var26: SerialDescriptor = this.getDescriptor();
         val var27: c = var1.b(var26);
         val var12: Boolean = var27.p();
         var var4: Int = 10;
         var var5: Byte = 9;
         var var9: Byte = 7;
         var var10: Byte = 6;
         var var14: Any = null;
         val var3: Int;
         var var13: Any;
         var var15: Any;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var20: Any;
         var var21: Any;
         val var23: Any;
         var var28: Any;
         if (var12) {
            var23 = var27.y(var26, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var15 = var27.y(var26, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var17 = var27.n(var26, 2, com.discord.primitives.GuildId..serializer.INSTANCE, null);
            var28 = var27.n(var26, 3, com.discord.primitives.UserId..serializer.INSTANCE, null);
            var21 = var27.n(var26, 4, StructurableTextSerializer.INSTANCE, null);
            var14 = a2.a;
            var20 = var27.n(var26, 5, a2.a, null);
            var13 = var27.n(var26, 6, (DeserializationStrategy)var14, null);
            var3 = var27.i(var26, 7);
            var16 = var27.n(var26, 8, m0.a, null);
            val var2: Byte = var27.C(var26, 9);
            var14 = var27.n(var26, 10, (DeserializationStrategy)var14, null);
            var18 = var27.n(var26, 11, h.a, null);
            var4 = 4095;
            var5 = var2;
         } else {
            var var31: Byte = 11;
            var var8: Boolean = true;
            var var30: Int = 0;
            var var7: Byte = 0;
            var var6: Int = 0;
            var13 = null;
            var21 = null;
            var20 = null;
            var var19: Any = null;
            var17 = null;
            var18 = null;
            var15 = null;
            var16 = null;
            var28 = null;

            while (var8) {
               val var11: Int = var27.o(var26);
               switch (var11) {
                  case -1:
                     var8 = false;
                     break;
                  case 0:
                     var13 = var27.y(var26, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var13);
                     var30 |= 1;
                     break;
                  case 1:
                     var28 = var27.y(var26, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, var28);
                     var30 |= 2;
                     break;
                  case 2:
                     var16 = var27.n(var26, 2, com.discord.primitives.GuildId..serializer.INSTANCE, var16);
                     var30 |= 4;
                     var31 = 11;
                     var4 = 10;
                     var5 = 9;
                     var9 = 7;
                     continue;
                  case 3:
                     var18 = var27.n(var26, 3, com.discord.primitives.UserId..serializer.INSTANCE, var18);
                     var30 |= 8;
                     var31 = 11;
                     var4 = 10;
                     var5 = 9;
                     continue;
                  case 4:
                     var15 = var27.n(var26, 4, StructurableTextSerializer.INSTANCE, var15);
                     var30 |= 16;
                     var31 = 11;
                     var4 = 10;
                     continue;
                  case 5:
                     var20 = var27.n(var26, 5, a2.a, var20);
                     var30 |= 32;
                     var31 = 11;
                     continue;
                  case 6:
                     var19 = var27.n(var26, var10, a2.a, var19);
                     var30 |= 64;
                     continue;
                  case 7:
                     var6 = var27.i(var26, var9);
                     var30 |= 128;
                     continue;
                  case 8:
                     var14 = var27.n(var26, 8, m0.a, var14);
                     var30 |= 256;
                     continue;
                  case 9:
                     var7 = var27.C(var26, var5);
                     var30 |= 512;
                     continue;
                  case 10:
                     var17 = var27.n(var26, var4, a2.a, var17);
                     var30 |= 1024;
                     continue;
                  case 11:
                     var21 = var27.n(var26, var31, h.a, var21);
                     var30 |= 2048;
                     continue;
                  default:
                     throw new n(var11);
               }

               var31 = 11;
               var4 = 10;
               var5 = 9;
               var9 = 7;
               var10 = 6;
            }

            var5 = var7;
            var3 = var6;
            var21 = var15;
            var23 = var13;
            var15 = var28;
            var17 = var16;
            var18 = var21;
            var28 = var18;
            var13 = var19;
            var4 = var30;
            var14 = var17;
            var16 = var14;
         }

         var27.c(var26);
         val var43: MessageId = var23 as MessageId;
         val var44: java.lang.String;
         if (var23 as MessageId != null) {
            var44 = var43.unbox-impl();
         } else {
            var44 = null;
         }

         return new FlaggedMessageEmbed(
            var4,
            var44,
            var15 as ChannelId,
            var17 as GuildId,
            var28 as UserId,
            var21 as StructurableText,
            var20 as java.lang.String,
            var13 as java.lang.String,
            var3,
            var16 as Integer,
            (boolean)var5,
            var14 as java.lang.String,
            var18 as java.lang.Boolean,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: FlaggedMessageEmbed) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         FlaggedMessageEmbed.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<FlaggedMessageEmbed> {
         return FlaggedMessageEmbed.$serializer.INSTANCE;
      }
   }
}
