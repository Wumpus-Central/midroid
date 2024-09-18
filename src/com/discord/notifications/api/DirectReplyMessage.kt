package com.discord.notifications.api

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import kotlin.jvm.internal.q
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
import vk.f
import vk.n
import wk.a
import yk.b2
import yk.g0
import yk.n0
import yk.o1

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
         o1.b(var1, 7, DirectReplyMessage.$serializer.INSTANCE.getDescriptor());
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
      q.h(var1, "id");
      q.h(var4, "author");
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
      q.h(var1, "id");
      q.h(var4, "author");
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
         } else if (!q.c(this.author, var1.author)) {
            return false;
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else if (!q.c(this.type, var1.type)) {
            return false;
         } else if (!q.c(this.channelType, var1.channelType)) {
            return false;
         } else if (!q.c(this.channelName, var1.channelName)) {
            return false;
         } else {
            return q.c(this.guildName, var1.guildName);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = MessageId.hashCode-impl(this.id);
      val var8: Int = ChannelId.hashCode-impl(this.channelId);
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

      return ((((((var7 * 31 + var8) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var6: java.lang.String = MessageId.toString-impl(this.id);
      val var1: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var9: DirectReplyUser = this.author;
      val var4: java.lang.String = this.content;
      val var2: Int = this.type;
      val var3: Int = this.channelType;
      val var5: java.lang.String = this.channelName;
      val var7: java.lang.String = this.guildName;
      val var8: StringBuilder = new StringBuilder();
      var8.append("DirectReplyMessage(id=");
      var8.append(var6);
      var8.append(", channelId=");
      var8.append(var1);
      var8.append(", author=");
      var8.append(var9);
      var8.append(", content=");
      var8.append(var4);
      var8.append(", type=");
      var8.append(var2);
      var8.append(", channelType=");
      var8.append(var3);
      var8.append(", channelName=");
      var8.append(var5);
      var8.append(", guildName=");
      var8.append(var7);
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

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var5: MessageId.$serializer = MessageId.$serializer.INSTANCE;
         val var6: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var3: DirectReplyUser.$serializer = DirectReplyUser.$serializer.INSTANCE;
         val var1: b2 = b2.a;
         val var4: KSerializer = a.u(b2.a);
         val var2: n0 = n0.a;
         return new KSerializer[]{var5, var6, var3, var4, a.u(n0.a), a.u(var2), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): DirectReplyMessage {
         q.h(var1, "decoder");
         val var17: SerialDescriptor = this.getDescriptor();
         val var18: c = var1.c(var17);
         val var7: Boolean = var18.y();
         var var4: Byte = 7;
         var var5: Byte = 6;
         var var13: Int = null;
         var var2: Int;
         var var11: Int;
         var var14: DirectReplyUser;
         val var15: Any;
         val var16: Any;
         var var27: Any;
         var var30: Any;
         var var33: Any;
         val var35: java.lang.String;
         if (var7) {
            val var19: MessageId = var18.m(var17, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var20: java.lang.String;
            if (var19 != null) {
               var20 = var19.unbox-impl();
            } else {
               var20 = null;
            }

            var33 = var18.m(var17, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var14 = var18.m(var17, 2, DirectReplyUser.$serializer.INSTANCE, null) as DirectReplyUser;
            var30 = b2.a;
            var15 = var18.v(var17, 3, b2.a, null) as java.lang.String;
            val var8: n0 = n0.a;
            var11 = var18.v(var17, 4, n0.a, null) as Int;
            var27 = var18.v(var17, 5, var8, null) as Int;
            val var23: java.lang.String = var18.v(var17, 6, (DeserializationStrategy)var30, null) as java.lang.String;
            val var34: java.lang.String = var18.v(var17, 7, (DeserializationStrategy)var30, null) as java.lang.String;
            var2 = 255;
            var35 = var20;
            var30 = var33;
            var16 = var27;
            var27 = var23;
            var33 = var34;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var24: java.lang.String = null;
            var14 = null;
            var33 = null;
            var11 = null;
            var30 = null;
            var27 = null;
            var var22: Any = null;

            while (var3) {
               val var6: Int = var18.x(var17);
               switch (var6) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     val var25: MessageId;
                     if (var24 != null) {
                        var25 = MessageId.box-impl(var24);
                     } else {
                        var25 = null;
                     }

                     val var26: MessageId = var18.m(var17, 0, MessageId.$serializer.INSTANCE, var25) as MessageId;
                     if (var26 != null) {
                        var24 = var26.unbox-impl();
                     } else {
                        var24 = null;
                     }

                     var2 |= 1;
                     break;
                  case 1:
                     var22 = var18.m(var17, 1, ChannelId.$serializer.INSTANCE, var22) as ChannelId;
                     var2 |= 2;
                     break;
                  case 2:
                     var14 = var18.m(var17, 2, DirectReplyUser.$serializer.INSTANCE, var14) as DirectReplyUser;
                     var2 |= 4;
                     var4 = 7;
                     continue;
                  case 3:
                     var27 = var18.v(var17, 3, b2.a, var27) as java.lang.String;
                     var2 |= 8;
                     continue;
                  case 4:
                     var13 = var18.v(var17, 4, n0.a, var13) as Int;
                     var2 |= 16;
                     continue;
                  case 5:
                     var30 = var18.v(var17, 5, n0.a, var30) as Int;
                     var2 |= 32;
                     continue;
                  case 6:
                     var11 = var18.v(var17, var5, b2.a, var11) as java.lang.String;
                     var2 |= 64;
                     continue;
                  case 7:
                     var33 = var18.v(var17, var4, b2.a, var33) as java.lang.String;
                     var2 |= 128;
                     continue;
                  default:
                     throw new n(var6);
               }

               var4 = 7;
               var5 = 6;
            }

            var15 = var27;
            var27 = var11;
            var16 = var30;
            var11 = var13;
            var30 = var22;
            var35 = var24;
         }

         var18.b(var17);
         return new DirectReplyMessage(
            var2, var35, (ChannelId)var30, var14, (java.lang.String)var15, var11, (Integer)var16, (java.lang.String)var27, (java.lang.String)var33, null, null
         );
      }

      public open fun serialize(encoder: Encoder, value: DirectReplyMessage) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         DirectReplyMessage.write$Self$notification_api_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return yk.g0.a.a(this);
      }
   }

   public companion object {
      private final val json: Json

      public fun serializer(): KSerializer<DirectReplyMessage> {
         return DirectReplyMessage.$serializer.INSTANCE;
      }

      public fun toNotificationData(data: String): NotificationData {
         q.h(var1, "data");
         val var6: Json = DirectReplyMessage.access$getJson$cp();
         var6.a();
         val var12: DirectReplyMessage = var6.b(DirectReplyMessage.Companion.serializer(), var1) as DirectReplyMessage;
         val var8: java.lang.String = var12.getId-3Eiw7ao();
         val var10: Int = var12.getType();
         val var11: java.lang.String = var12.getContent();
         val var4: Long = var12.getChannelId-o4g7jtM();
         val var9: Int = var12.getChannelType();
         val var7: java.util.List = i.j();
         val var2: Long = var12.getAuthor().getId-re6GcUE();
         val var16: java.lang.String = var12.getAuthor().getUsername();
         var1 = var16;
         if (var16 == null) {
            var1 = "";
         }

         val var17: java.lang.String = var12.getAuthor().getDiscriminator();
         val var18: Int;
         if (var17 != null) {
            var18 = h.m(var17);
         } else {
            var18 = null;
         }

         return new NotificationData(
            "MESSAGE_CREATE",
            var8,
            null,
            null,
            var10,
            var11,
            null,
            var9,
            var12.getChannelName(),
            ChannelId.box-impl(var4),
            null,
            null,
            null,
            null,
            null,
            var7,
            UserId.box-impl(var2),
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
