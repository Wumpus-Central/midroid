package com.discord.notifications.api

import bl.b2
import bl.g0
import bl.n0
import bl.o1
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
import yk.f
import yk.n
import zk.a

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
      val var6: Int = MessageId.hashCode-impl(this.id);
      val var7: Int = ChannelId.hashCode-impl(this.channelId);
      val var8: Int = this.author.hashCode();
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

      return ((((((var6 * 31 + var7) * 31 + var8) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var4: java.lang.String = MessageId.toString-impl(this.id);
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var6: DirectReplyUser = this.author;
      val var3: java.lang.String = this.content;
      val var8: Int = this.type;
      val var9: Int = this.channelType;
      val var7: java.lang.String = this.channelName;
      val var5: java.lang.String = this.guildName;
      val var1: StringBuilder = new StringBuilder();
      var1.append("DirectReplyMessage(id=");
      var1.append(var4);
      var1.append(", channelId=");
      var1.append(var2);
      var1.append(", author=");
      var1.append(var6);
      var1.append(", content=");
      var1.append(var3);
      var1.append(", type=");
      var1.append(var8);
      var1.append(", channelType=");
      var1.append(var9);
      var1.append(", channelName=");
      var1.append(var7);
      var1.append(", guildName=");
      var1.append(var5);
      var1.append(")");
      return var1.toString();
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
         val var1: MessageId.$serializer = MessageId.$serializer.INSTANCE;
         val var5: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var6: DirectReplyUser.$serializer = DirectReplyUser.$serializer.INSTANCE;
         val var4: b2 = b2.a;
         val var3: KSerializer = a.u(b2.a);
         val var2: n0 = n0.a;
         return new KSerializer[]{var1, var5, var6, var3, a.u(n0.a), a.u(var2), a.u(var4), a.u(var4)};
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
         var var9: Any;
         var var11: Any;
         var var12: Any;
         val var15: DirectReplyUser;
         val var16: Any;
         var var29: Any;
         var var33: java.lang.String;
         if (var7) {
            val var19: MessageId = var18.m(var17, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var20: java.lang.String;
            if (var19 != null) {
               var20 = var19.unbox-impl();
            } else {
               var20 = null;
            }

            var11 = var18.m(var17, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var15 = var18.m(var17, 2, DirectReplyUser.$serializer.INSTANCE, null) as DirectReplyUser;
            var29 = b2.a;
            var12 = var18.v(var17, 3, b2.a, null) as java.lang.String;
            val var8: n0 = n0.a;
            var13 = var18.v(var17, 4, n0.a, null) as Int;
            var9 = var18.v(var17, 5, var8, null) as Int;
            val var23: java.lang.String = var18.v(var17, 6, (DeserializationStrategy)var29, null) as java.lang.String;
            var33 = var18.v(var17, 7, (DeserializationStrategy)var29, null) as java.lang.String;
            var2 = 255;
            var33 = var20;
            var29 = var23;
            var16 = var33;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var24: java.lang.String = null;
            var var34: DirectReplyUser = null;
            var12 = null;
            var11 = null;
            var29 = null;
            var9 = null;
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
                     var34 = var18.m(var17, 2, DirectReplyUser.$serializer.INSTANCE, var34) as DirectReplyUser;
                     var2 |= 4;
                     var4 = 7;
                     continue;
                  case 3:
                     var9 = var18.v(var17, 3, b2.a, var9) as java.lang.String;
                     var2 |= 8;
                     continue;
                  case 4:
                     var13 = var18.v(var17, 4, n0.a, var13) as Int;
                     var2 |= 16;
                     continue;
                  case 5:
                     var29 = var18.v(var17, 5, n0.a, var29) as Int;
                     var2 |= 32;
                     continue;
                  case 6:
                     var11 = var18.v(var17, var5, b2.a, var11) as java.lang.String;
                     var2 |= 64;
                     continue;
                  case 7:
                     var12 = var18.v(var17, var4, b2.a, var12) as java.lang.String;
                     var2 |= 128;
                     continue;
                  default:
                     throw new n(var6);
               }

               var4 = 7;
               var5 = 6;
            }

            var16 = var12;
            var12 = var9;
            var29 = var11;
            var9 = var29;
            var15 = var34;
            var11 = var22;
            var33 = var24;
         }

         var18.b(var17);
         return new DirectReplyMessage(
            var2, var33, (ChannelId)var11, var15, (java.lang.String)var12, var13, (Integer)var9, (java.lang.String)var29, (java.lang.String)var16, null, null
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
         return bl.g0.a.a(this);
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
         val var7: java.lang.String = var12.getId-3Eiw7ao();
         val var8: Int = var12.getType();
         val var9: java.lang.String = var12.getContent();
         val var4: Long = var12.getChannelId-o4g7jtM();
         val var10: Int = var12.getChannelType();
         val var11: java.util.List = i.j();
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
            var7,
            null,
            null,
            var8,
            var9,
            null,
            var10,
            var12.getChannelName(),
            ChannelId.box-impl(var4),
            null,
            null,
            null,
            null,
            null,
            var11,
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
