package com.discord.chat.bridge.automod

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.h
import qn.n0
import qn.o1

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
         o1.b(var1, 643, FlaggedMessageEmbed.$serializer.INSTANCE.getDescriptor());
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
      val var10: Int = MessageId.hashCode-impl(this.id);
      val var9: Int = ChannelId.hashCode-impl(this.channelId);
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

      return ((((((((((var10 * 31 + var9) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var11) * 31 + var6) * 31 + var12) * 31 + var7)
            * 31
         + var8;
   }

   public override fun toString(): String {
      val var9: java.lang.String = MessageId.toString-impl(this.id);
      val var10: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var12: GuildId = this.guildId;
      val var3: UserId = this.userId;
      val var8: StructurableText = this.content;
      val var4: java.lang.String = this.channelName;
      val var6: java.lang.String = this.username;
      val var1: Int = this.usernameColor;
      val var7: Int = this.roleColor;
      val var2: Boolean = this.shouldShowRoleDot;
      val var13: java.lang.String = this.avatarURL;
      val var11: java.lang.Boolean = this.communicationDisabled;
      val var5: StringBuilder = new StringBuilder();
      var5.append("FlaggedMessageEmbed(id=");
      var5.append(var9);
      var5.append(", channelId=");
      var5.append(var10);
      var5.append(", guildId=");
      var5.append(var12);
      var5.append(", userId=");
      var5.append(var3);
      var5.append(", content=");
      var5.append(var8);
      var5.append(", channelName=");
      var5.append(var4);
      var5.append(", username=");
      var5.append(var6);
      var5.append(", usernameColor=");
      var5.append(var1);
      var5.append(", roleColor=");
      var5.append(var7);
      var5.append(", shouldShowRoleDot=");
      var5.append(var2);
      var5.append(", avatarURL=");
      var5.append(var13);
      var5.append(", communicationDisabled=");
      var5.append(var11);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: FlaggedMessageEmbed.$serializer = new FlaggedMessageEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.automod.FlaggedMessageEmbed", var0, 12);
         var1.c("id", false);
         var1.c("channelId", false);
         var1.c("guildId", true);
         var1.c("userId", true);
         var1.c("content", true);
         var1.c("channelName", true);
         var1.c("username", true);
         var1.c("usernameColor", false);
         var1.c("roleColor", true);
         var1.c("shouldShowRoleDot", false);
         var1.c("avatarURL", true);
         var1.c("communicationDisabled", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: com.discord.primitives.MessageId..serializer = com.discord.primitives.MessageId..serializer.INSTANCE;
         val var10: com.discord.primitives.ChannelId..serializer = com.discord.primitives.ChannelId..serializer.INSTANCE;
         val var7: KSerializer = a.u(com.discord.primitives.GuildId..serializer.INSTANCE);
         val var9: KSerializer = a.u(com.discord.primitives.UserId..serializer.INSTANCE);
         val var6: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var1: b2 = b2.a;
         val var5: KSerializer = a.u(b2.a);
         val var3: KSerializer = a.u(var1);
         val var8: n0 = n0.a;
         val var11: KSerializer = a.u(n0.a);
         val var4: h = h.a;
         return new KSerializer[]{var2, var10, var7, var9, var6, var5, var3, var8, var11, h.a, a.u(var1), a.u(var4)};
      }

      public open fun deserialize(decoder: Decoder): FlaggedMessageEmbed {
         q.h(var1, "decoder");
         val var25: SerialDescriptor = this.getDescriptor();
         val var26: c = var1.b(var25);
         val var10: Boolean = var26.p();
         var var6: Byte = 10;
         var var7: Byte = 9;
         var var8: Byte = 7;
         var var15: java.lang.String = null;
         var var3: Int;
         var var4: Byte;
         val var5: Int;
         var var17: Any;
         val var20: Any;
         val var21: java.lang.String;
         val var22: Any;
         val var23: Int;
         val var24: Any;
         var var41: Any;
         var var44: Any;
         var var45: java.lang.String;
         if (var10) {
            val var27: MessageId = var26.y(var25, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null) as MessageId;
            val var28: java.lang.String;
            if (var27 != null) {
               var28 = var27.unbox-impl();
            } else {
               var28 = null;
            }

            var17 = var26.y(var25, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, null) as ChannelId;
            var20 = var26.n(var25, 2, com.discord.primitives.GuildId..serializer.INSTANCE, null) as GuildId;
            var41 = var26.n(var25, 3, com.discord.primitives.UserId..serializer.INSTANCE, null) as UserId;
            var44 = var26.n(var25, 4, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            val var13: b2 = b2.a;
            val var14: java.lang.String = var26.n(var25, 5, b2.a, null) as java.lang.String;
            val var12: java.lang.String = var26.n(var25, 6, var13, null) as java.lang.String;
            var5 = var26.i(var25, 7);
            val var11: Int = var26.n(var25, 8, n0.a, null) as Int;
            val var2: Byte = var26.C(var25, 9);
            var45 = var26.n(var25, 10, var13, null) as java.lang.String;
            val var35: java.lang.Boolean = var26.n(var25, 11, h.a, null) as java.lang.Boolean;
            var3 = 4095;
            var21 = var28;
            var15 = (java.lang.String)var41;
            var41 = var44;
            var44 = var14;
            var24 = var12;
            var23 = var11;
            var4 = var2;
            var45 = var45;
            var22 = var35;
         } else {
            var var32: Boolean = true;
            var var30: Int = 0;
            var4 = 0;
            var3 = 0;
            var var37: java.lang.String = null;
            var41 = null;
            var17 = null;
            var var36: Any = null;
            var44 = null;
            var45 = null;
            var var29: Any = null;
            var var34: Any = null;
            var var33: Any = null;

            while (var32) {
               label63: {
                  val var9: Int = var26.o(var25);
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

                        val var39: MessageId = var26.y(var25, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var38) as MessageId;
                        if (var39 != null) {
                           var37 = var39.unbox-impl();
                        } else {
                           var37 = null;
                        }

                        var30 |= 1;
                        break;
                     case 1:
                        var33 = var26.y(var25, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, var33) as ChannelId;
                        var30 |= 2;
                        break;
                     case 2:
                        var34 = var26.n(var25, 2, com.discord.primitives.GuildId..serializer.INSTANCE, var34) as GuildId;
                        var30 |= 4;
                        break;
                     case 3:
                        var36 = var26.n(var25, 3, com.discord.primitives.UserId..serializer.INSTANCE, var36) as UserId;
                        var30 |= 8;
                        break label63;
                     case 4:
                        var29 = var26.n(var25, 4, StructurableTextSerializer.INSTANCE, var29) as StructurableText;
                        var30 |= 16;
                        break label63;
                     case 5:
                        var44 = var26.n(var25, 5, b2.a, var44) as java.lang.String;
                        var30 |= 32;
                        var6 = 10;
                        continue;
                     case 6:
                        var45 = var26.n(var25, 6, b2.a, var45) as java.lang.String;
                        var30 |= 64;
                        var6 = 10;
                        continue;
                     case 7:
                        var3 = var26.i(var25, var8);
                        var30 |= 128;
                        continue;
                     case 8:
                        var41 = var26.n(var25, 8, n0.a, var41) as Int;
                        var30 |= 256;
                        continue;
                     case 9:
                        var4 = var26.C(var25, var7);
                        var30 |= 512;
                        continue;
                     case 10:
                        var15 = var26.n(var25, var6, b2.a, var15) as java.lang.String;
                        var30 |= 1024;
                        continue;
                     case 11:
                        var17 = var26.n(var25, 11, h.a, var17) as java.lang.Boolean;
                        var30 |= 2048;
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

            var24 = var45;
            var22 = var17;
            var45 = var15;
            var23 = (Integer)var41;
            var5 = var3;
            var41 = var29;
            var15 = (java.lang.String)var36;
            var20 = var34;
            var17 = var33;
            var21 = var37;
            var3 = var30;
         }

         var26.c(var25);
         return new FlaggedMessageEmbed(
            var3,
            var21,
            (ChannelId)var17,
            (GuildId)var20,
            var15,
            (StructurableText)var41,
            (java.lang.String)var44,
            (java.lang.String)var24,
            var5,
            var23,
            (boolean)var4,
            var45,
            (java.lang.Boolean)var22,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: FlaggedMessageEmbed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         FlaggedMessageEmbed.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<FlaggedMessageEmbed> {
         return FlaggedMessageEmbed.$serializer.INSTANCE;
      }
   }
}
