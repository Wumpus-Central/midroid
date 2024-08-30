package com.discord.chat.bridge.automod

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import dn.f
import dn.n
import en.a
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
      val var13: java.lang.String = MessageId.toString-impl(this.id);
      val var4: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var9: GuildId = this.guildId;
      val var10: UserId = this.userId;
      val var12: StructurableText = this.content;
      val var3: java.lang.String = this.channelName;
      val var5: java.lang.String = this.username;
      val var1: Int = this.usernameColor;
      val var7: Int = this.roleColor;
      val var2: Boolean = this.shouldShowRoleDot;
      val var6: java.lang.String = this.avatarURL;
      val var11: java.lang.Boolean = this.communicationDisabled;
      val var8: StringBuilder = new StringBuilder();
      var8.append("FlaggedMessageEmbed(id=");
      var8.append(var13);
      var8.append(", channelId=");
      var8.append(var4);
      var8.append(", guildId=");
      var8.append(var9);
      var8.append(", userId=");
      var8.append(var10);
      var8.append(", content=");
      var8.append(var12);
      var8.append(", channelName=");
      var8.append(var3);
      var8.append(", username=");
      var8.append(var5);
      var8.append(", usernameColor=");
      var8.append(var1);
      var8.append(", roleColor=");
      var8.append(var7);
      var8.append(", shouldShowRoleDot=");
      var8.append(var2);
      var8.append(", avatarURL=");
      var8.append(var6);
      var8.append(", communicationDisabled=");
      var8.append(var11);
      var8.append(")");
      return var8.toString();
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
         val var10: MessageId.$serializer = MessageId.$serializer.INSTANCE;
         val var2: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var3: KSerializer = a.u(GuildId.$serializer.INSTANCE);
         val var8: KSerializer = a.u(UserId.$serializer.INSTANCE);
         val var5: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var9: b2 = b2.a;
         val var4: KSerializer = a.u(b2.a);
         val var6: KSerializer = a.u(var9);
         val var1: n0 = n0.a;
         val var7: KSerializer = a.u(n0.a);
         val var11: h = h.a;
         return new KSerializer[]{var10, var2, var3, var8, var5, var4, var6, var1, var7, h.a, a.u(var9), a.u(var11)};
      }

      public open fun deserialize(decoder: Decoder): FlaggedMessageEmbed {
         q.h(var1, "decoder");
         val var24: SerialDescriptor = this.getDescriptor();
         val var25: c = var1.b(var24);
         val var10: Boolean = var25.p();
         var var6: Byte = 10;
         var var7: Byte = 9;
         var var8: Byte = 7;
         var var15: java.lang.String = null;
         var var3: Byte;
         val var4: Int;
         val var5: Int;
         var var17: Int;
         var var18: Any;
         var var19: Any;
         val var20: Any;
         val var21: Any;
         val var22: Any;
         val var23: java.lang.String;
         var var38: java.lang.String;
         var var44: Any;
         if (var10) {
            val var26: MessageId = var25.y(var24, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var27: java.lang.String;
            if (var26 != null) {
               var27 = var26.unbox-impl();
            } else {
               var27 = null;
            }

            var20 = var25.y(var24, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var15 = var25.n(var24, 2, GuildId.$serializer.INSTANCE, null) as GuildId;
            var19 = var25.n(var24, 3, UserId.$serializer.INSTANCE, null) as UserId;
            var18 = var25.n(var24, 4, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            val var12: b2 = b2.a;
            val var14: java.lang.String = var25.n(var24, 5, b2.a, null) as java.lang.String;
            var38 = var25.n(var24, 6, var12, null) as java.lang.String;
            var5 = var25.i(var24, 7);
            val var11: Int = var25.n(var24, 8, n0.a, null) as Int;
            val var2: Byte = var25.C(var24, 9);
            var44 = var25.n(var24, 10, var12, null) as java.lang.String;
            val var36: java.lang.Boolean = var25.n(var24, 11, h.a, null) as java.lang.Boolean;
            var23 = var27;
            var4 = 4095;
            var22 = var14;
            var44 = var38;
            var17 = var11;
            var3 = var2;
            var38 = (java.lang.String)var44;
            var21 = var36;
         } else {
            var var33: Boolean = true;
            var var30: Int = 0;
            var var32: Byte = 0;
            var3 = 0;
            var var40: java.lang.String = null;
            var17 = null;
            var44 = null;
            var38 = null;
            var18 = null;
            var19 = null;
            var var29: Any = null;
            var var37: Any = null;
            var var35: Any = null;

            while (var33) {
               label63: {
                  val var9: Int = var25.o(var24);
                  switch (var9) {
                     case -1:
                        var33 = false;
                        break;
                     case 0:
                        val var41: MessageId;
                        if (var40 != null) {
                           var41 = MessageId.box-impl(var40);
                        } else {
                           var41 = null;
                        }

                        val var42: MessageId = var25.y(var24, 0, MessageId.$serializer.INSTANCE, var41) as MessageId;
                        if (var42 != null) {
                           var40 = var42.unbox-impl();
                        } else {
                           var40 = null;
                        }

                        var30 |= 1;
                        break;
                     case 1:
                        var35 = var25.y(var24, 1, ChannelId.$serializer.INSTANCE, var35) as ChannelId;
                        var30 |= 2;
                        break;
                     case 2:
                        var37 = var25.n(var24, 2, GuildId.$serializer.INSTANCE, var37) as GuildId;
                        var30 |= 4;
                        break;
                     case 3:
                        var38 = var25.n(var24, 3, UserId.$serializer.INSTANCE, var38) as UserId;
                        var30 |= 8;
                        break label63;
                     case 4:
                        var29 = var25.n(var24, 4, StructurableTextSerializer.INSTANCE, var29) as StructurableText;
                        var30 |= 16;
                        break label63;
                     case 5:
                        var18 = var25.n(var24, 5, b2.a, var18) as java.lang.String;
                        var30 |= 32;
                        var6 = 10;
                        continue;
                     case 6:
                        var19 = var25.n(var24, 6, b2.a, var19) as java.lang.String;
                        var30 |= 64;
                        var6 = 10;
                        continue;
                     case 7:
                        var3 = var25.i(var24, var8);
                        var30 |= 128;
                        continue;
                     case 8:
                        var17 = var25.n(var24, 8, n0.a, var17) as Int;
                        var30 |= 256;
                        continue;
                     case 9:
                        var32 = var25.C(var24, var7);
                        var30 |= 512;
                        continue;
                     case 10:
                        var15 = var25.n(var24, var6, b2.a, var15) as java.lang.String;
                        var30 |= 1024;
                        continue;
                     case 11:
                        var44 = var25.n(var24, 11, h.a, var44) as java.lang.Boolean;
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

            var38 = var15;
            var5 = var3;
            var21 = var44;
            var3 = var32;
            var44 = var19;
            var22 = var18;
            var18 = var29;
            var19 = var38;
            var15 = (java.lang.String)var37;
            var20 = var35;
            var23 = var40;
            var4 = var30;
         }

         var25.c(var24);
         return new FlaggedMessageEmbed(
            var4,
            var23,
            (ChannelId)var20,
            var15,
            (UserId)var19,
            (StructurableText)var18,
            (java.lang.String)var22,
            (java.lang.String)var44,
            var5,
            var17,
            (boolean)var3,
            var38,
            (java.lang.Boolean)var21,
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
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<FlaggedMessageEmbed> {
         return FlaggedMessageEmbed.$serializer.INSTANCE;
      }
   }
}
