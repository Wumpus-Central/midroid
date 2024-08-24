package com.discord.notifications.api

import com.discord.primitives.ChannelId
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
import kotlinx.serialization.json.Json
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.m0
import xk.n1

@f
public data class DirectReplyMessage(id: MessageId,
   channelId: ChannelId,
   author: DirectReplyUser,
   content: String? = ...,
   type: Int? = ...,
   channelType: Int? = ...,
   channelName: String? = ...,
   guildName: String? = ...
) : DirectReplyMessage(var1, var2, var4, var5, var6, var7, var8, var9) {
   public final val author: DirectReplyUser
   public final val channelId: ChannelId
   public final val channelName: String?
   public final val channelType: Int?
   public final val content: String?
   public final val guildName: String?
   public final val id: MessageId
   public final val type: Int?

   fun DirectReplyMessage(
      var1: Int,
      var2: java.lang.String,
      var3: ChannelId,
      var4: DirectReplyUser,
      var5: java.lang.String,
      var6: Int,
      var7: Int,
      var8: java.lang.String,
      var9: java.lang.String,
      var10: SerializationConstructorMarker
   ) {
      if (7 != (var1 and 7)) {
         n1.b(var1, 7, DirectReplyMessage.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.id = var2;
      this.channelId = var3.unbox-impl();
      this.author = var4;
      if ((var1 and 8) == 0) {
         this.content = null;
      } else {
         this.content = var5;
      }

      if ((var1 and 16) == 0) {
         this.type = null;
      } else {
         this.type = var6;
      }

      if ((var1 and 32) == 0) {
         this.channelType = null;
      } else {
         this.channelType = var7;
      }

      if ((var1 and 64) == 0) {
         this.channelName = null;
      } else {
         this.channelName = var8;
      }

      if ((var1 and 128) == 0) {
         this.guildName = null;
      } else {
         this.guildName = var9;
      }
   }

   fun DirectReplyMessage(
      var1: java.lang.String, var2: Long, var4: DirectReplyUser, var5: java.lang.String, var6: Int, var7: Int, var8: java.lang.String, var9: java.lang.String
   ) {
      super();
      this.id = var1;
      this.channelId = var2;
      this.author = var4;
      this.content = var5;
      this.type = var6;
      this.channelType = var7;
      this.channelName = var8;
      this.guildName = var9;
   }

   @JvmStatic
   public fun `write$Self`(self: DirectReplyMessage, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, MessageId.$serializer.INSTANCE, MessageId.box-impl(var0.id));
      var1.y(var2, 1, ChannelId.$serializer.INSTANCE, ChannelId.box-impl(var0.channelId));
      var1.y(var2, 2, DirectReplyUser.$serializer.INSTANCE, var0.author);
      var var3: Boolean;
      if (!var1.A(var2, 3) && var0.content == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.content);
      }

      if (!var1.A(var2, 4) && var0.type == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, m0.a, var0.type);
      }

      if (!var1.A(var2, 5) && var0.channelType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, m0.a, var0.channelType);
      }

      if (!var1.A(var2, 6) && var0.channelName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, a2.a, var0.channelName);
      }

      label48: {
         if (!var1.A(var2, 7)) {
            var3 = false;
            if (var0.guildName == null) {
               break label48;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 7, a2.a, var0.guildName);
      }
   }

   public operator fun component1(): MessageId {
      return this.id;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): DirectReplyUser {
      return this.author;
   }

   public operator fun component4(): String? {
      return this.content;
   }

   public operator fun component5(): Int? {
      return this.type;
   }

   public operator fun component6(): Int? {
      return this.channelType;
   }

   public operator fun component7(): String? {
      return this.channelName;
   }

   public operator fun component8(): String? {
      return this.guildName;
   }

   public fun copy(
      id: MessageId = ...,
      channelId: ChannelId = ...,
      author: DirectReplyUser = ...,
      content: String? = ...,
      type: Int? = ...,
      channelType: Int? = ...,
      channelName: String? = ...,
      guildName: String? = ...
   ): DirectReplyMessage {
      r.h(var1, "id");
      r.h(var4, "author");
      return new DirectReplyMessage(var1, var2, var4, var5, var6, var7, var8, var9, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DirectReplyMessage) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.id, var1.id)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.author, var1.author)) {
            return false;
         } else if (!r.c(this.content, var1.content)) {
            return false;
         } else if (!r.c(this.type, var1.type)) {
            return false;
         } else if (!r.c(this.channelType, var1.channelType)) {
            return false;
         } else if (!r.c(this.channelName, var1.channelName)) {
            return false;
         } else {
            return r.c(this.guildName, var1.guildName);
         }
      }
   }

   public override fun hashCode(): Int {
      val var8: Int = MessageId.hashCode-impl(this.id);
      val var7: Int = ChannelId.hashCode-impl(this.channelId);
      val var6: Int = this.author.hashCode();
      var var5: Int = 0;
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      val var2: Int;
      if (this.type == null) {
         var2 = 0;
      } else {
         var2 = this.type.hashCode();
      }

      val var3: Int;
      if (this.channelType == null) {
         var3 = 0;
      } else {
         var3 = this.channelType.hashCode();
      }

      val var4: Int;
      if (this.channelName == null) {
         var4 = 0;
      } else {
         var4 = this.channelName.hashCode();
      }

      if (this.guildName != null) {
         var5 = this.guildName.hashCode();
      }

      return ((((((var8 * 31 + var7) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.id);
      val var8: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var6: DirectReplyUser = this.author;
      val var9: java.lang.String = this.content;
      val var3: Int = this.type;
      val var7: Int = this.channelType;
      val var5: java.lang.String = this.channelName;
      val var4: java.lang.String = this.guildName;
      val var2: StringBuilder = new StringBuilder();
      var2.append("DirectReplyMessage(id=");
      var2.append(var1);
      var2.append(", channelId=");
      var2.append(var8);
      var2.append(", author=");
      var2.append(var6);
      var2.append(", content=");
      var2.append(var9);
      var2.append(", type=");
      var2.append(var3);
      var2.append(", channelType=");
      var2.append(var7);
      var2.append(", channelName=");
      var2.append(var5);
      var2.append(", guildName=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<DirectReplyMessage> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: DirectReplyMessage.$serializer = new DirectReplyMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.DirectReplyMessage", var0, 8);
         var1.l("id", false);
         var1.l("channel_id", false);
         var1.l("author", false);
         var1.l("content", true);
         var1.l("type", true);
         var1.l("channelType", true);
         var1.l("channelName", true);
         var1.l("guildName", true);
         descriptor = var1;
      }

      public override fun childSerializers(): Array<KSerializer<*>> {
         val var1: MessageId.$serializer = MessageId.$serializer.INSTANCE;
         val var5: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var3: DirectReplyUser.$serializer = DirectReplyUser.$serializer.INSTANCE;
         val var6: a2 = a2.a;
         val var4: KSerializer = vk.a.u(a2.a);
         val var2: m0 = m0.a;
         return new KSerializer[]{var1, var5, var3, var4, vk.a.u(m0.a), vk.a.u(var2), vk.a.u(var6), vk.a.u(var6)};
      }

      public open fun deserialize(decoder: Decoder): DirectReplyMessage {
         r.h(var1, "decoder");
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.b(var18);
         val var7: Boolean = var19.p();
         var var4: Byte = 7;
         var var5: Byte = 6;
         var var13: Any = null;
         var var2: Int;
         var var8: Any;
         var var10: Any;
         var var11: Any;
         var var14: Any;
         var var20: Any;
         var var24: Any;
         var var28: Any;
         if (var7) {
            var20 = var19.y(var18, 0, MessageId.$serializer.INSTANCE, null);
            var14 = var19.y(var18, 1, ChannelId.$serializer.INSTANCE, null);
            var11 = var19.y(var18, 2, DirectReplyUser.$serializer.INSTANCE, null);
            var28 = a2.a;
            var8 = var19.n(var18, 3, a2.a, null);
            var24 = m0.a;
            var13 = var19.n(var18, 4, m0.a, null);
            var10 = var19.n(var18, 5, (DeserializationStrategy)var24, null);
            var24 = var19.n(var18, 6, (DeserializationStrategy)var28, null);
            var28 = var19.n(var18, 7, (DeserializationStrategy)var28, null);
            var2 = 255;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var20 = null;
            var14 = null;
            var10 = null;
            var28 = null;
            var11 = null;
            var24 = null;
            var8 = null;

            while (var3) {
               val var6: Int = var19.o(var18);
               switch (var6) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var20 = var19.y(var18, 0, MessageId.$serializer.INSTANCE, var20);
                     var2 |= 1;
                     break;
                  case 1:
                     var8 = var19.y(var18, 1, ChannelId.$serializer.INSTANCE, (ChannelId)var8);
                     var2 |= 2;
                     break;
                  case 2:
                     var14 = var19.y(var18, 2, DirectReplyUser.$serializer.INSTANCE, (DirectReplyUser)var14);
                     var2 |= 4;
                     var4 = 7;
                     continue;
                  case 3:
                     var24 = var19.n(var18, 3, a2.a, (java.lang.String)var24);
                     var2 |= 8;
                     continue;
                  case 4:
                     var13 = var19.n(var18, 4, m0.a, (Integer)var13);
                     var2 |= 16;
                     continue;
                  case 5:
                     var11 = var19.n(var18, 5, m0.a, (Integer)var11);
                     var2 |= 32;
                     continue;
                  case 6:
                     var28 = var19.n(var18, var5, a2.a, (java.lang.String)var28);
                     var2 |= 64;
                     continue;
                  case 7:
                     var10 = var19.n(var18, var4, a2.a, (java.lang.String)var10);
                     var2 |= 128;
                     continue;
                  default:
                     throw new n(var6);
               }

               var4 = 7;
               var5 = 6;
            }

            var14 = var8;
            var11 = var14;
            var8 = var24;
            var10 = var11;
            var24 = var28;
            var28 = var10;
         }

         var19.c(var18);
         var20 = var20;
         val var22: java.lang.String;
         if (var20 != null) {
            var22 = var20.unbox-impl();
         } else {
            var22 = null;
         }

         return new DirectReplyMessage(
            var2,
            var22,
            var14 as ChannelId,
            var11 as DirectReplyUser,
            var8 as java.lang.String,
            var13 as Integer,
            var10 as Integer,
            var24 as java.lang.String,
            var28 as java.lang.String,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: DirectReplyMessage) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         DirectReplyMessage.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      override fun typeParametersSerializers(): Array<KSerializer<?>> {
         return f0.a.a(this);
      }
   }

   public companion object {
      private final val json: Json

      public fun serializer(): KSerializer<DirectReplyMessage> {
         return DirectReplyMessage.$serializer.INSTANCE;
      }

      public fun toNotificationData(data: String): NotificationData {
         r.h(var1, "data");
         val var6: Json = DirectReplyMessage.access$getJson$cp();
         var6.a();
         val var12: DirectReplyMessage = var6.b(DirectReplyMessage.Companion.serializer(), var1);
         val var7: java.lang.String = var12.getId-3Eiw7ao();
         val var10: Int = var12.getType();
         val var11: java.lang.String = var12.getContent();
         val var2: Long = var12.getChannelId-o4g7jtM();
         val var8: Int = var12.getChannelType();
         val var9: java.util.List = h.i();
         val var4: Long = var12.getAuthor().getId-re6GcUE();
         val var16: java.lang.String = var12.getAuthor().getUsername();
         var1 = var16;
         if (var16 == null) {
            var1 = "";
         }

         val var17: java.lang.String = var12.getAuthor().getDiscriminator();
         val var18: Int;
         if (var17 != null) {
            var18 = kotlin.text.f.m(var17);
         } else {
            var18 = null;
         }

         return new NotificationData(
            "MESSAGE_CREATE",
            var7,
            null,
            null,
            var10,
            var11,
            null,
            var8,
            var12.getChannelName(),
            ChannelId.box-impl(var2),
            null,
            null,
            null,
            null,
            null,
            var9,
            UserId.box-impl(var4),
            var1,
            null,
            var18,
            var12.getAuthor().getAvatar(),
            null,
            null,
            null,
            null,
            var12.getGuildName(),
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            true,
            true,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            false,
            null,
            -35357620,
            262095,
            null
         );
      }
   }
}
