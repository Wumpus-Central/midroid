package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.MessageType
import com.discord.primitives.ChannelId
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

@f
public data class CommandOnClick(action: String? = ...,
   userId: UserId? = ...,
   messageId: MessageId? = ...,
   applicationUserId: UserId? = ...,
   messageType: MessageType? = ...,
   messageChannelId: ChannelId? = ...
) : CommandOnClick(var1, var2, var3, var4, var5, var6) {
   public final val action: String?
   public final val applicationUserId: UserId?
   public final val messageChannelId: ChannelId?
   public final val messageId: MessageId?
   public final val messageType: MessageType?
   public final val userId: UserId?

   fun CommandOnClick(
      var1: Int,
      var2: java.lang.String,
      var3: UserId,
      var4: java.lang.String,
      var5: UserId,
      var6: MessageType,
      var7: ChannelId,
      var8: SerializationConstructorMarker
   ) {
      if ((var1 and 1) == 0) {
         this.action = null;
      } else {
         this.action = var2;
      }

      if ((var1 and 2) == 0) {
         this.userId = null;
      } else {
         this.userId = var3;
      }

      if ((var1 and 4) == 0) {
         this.messageId = null;
      } else {
         this.messageId = var4;
      }

      if ((var1 and 8) == 0) {
         this.applicationUserId = null;
      } else {
         this.applicationUserId = var5;
      }

      if ((var1 and 16) == 0) {
         this.messageType = null;
      } else {
         this.messageType = var6;
      }

      if ((var1 and 32) == 0) {
         this.messageChannelId = null;
      } else {
         this.messageChannelId = var7;
      }
   }

   fun CommandOnClick(var1: java.lang.String, var2: UserId, var3: java.lang.String, var4: UserId, var5: MessageType, var6: ChannelId) {
      this.action = var1;
      this.userId = var2;
      this.messageId = var3;
      this.applicationUserId = var4;
      this.messageType = var5;
      this.messageChannelId = var6;
   }

   public operator fun component1(): String? {
      return this.action;
   }

   public operator fun component2(): UserId? {
      return this.userId;
   }

   public operator fun component3(): MessageId? {
      return this.messageId;
   }

   public operator fun component4(): UserId? {
      return this.applicationUserId;
   }

   public operator fun component5(): MessageType? {
      return this.messageType;
   }

   public operator fun component6(): ChannelId? {
      return this.messageChannelId;
   }

   public fun copy(
      action: String? = ...,
      userId: UserId? = ...,
      messageId: MessageId? = ...,
      applicationUserId: UserId? = ...,
      messageType: MessageType? = ...,
      messageChannelId: ChannelId? = ...
   ): CommandOnClick {
      return new CommandOnClick(var1, var2, var3, var4, var5, var6, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CommandOnClick) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.action, var1.action)) {
            return false;
         } else if (!q.c(this.userId, var1.userId)) {
            return false;
         } else if (if (this.messageId == null) var1.messageId == null else var1.messageId != null && MessageId.equals-impl0(this.messageId, var1.messageId)) {
            if (!q.c(this.applicationUserId, var1.applicationUserId)) {
               return false;
            } else if (this.messageType != var1.messageType) {
               return false;
            } else {
               return q.c(this.messageChannelId, var1.messageChannelId);
            }
         } else {
            return false;
         }
      }
   }

   public override fun hashCode(): Int {
      var var6: Int = 0;
      val var1: Int;
      if (this.action == null) {
         var1 = 0;
      } else {
         var1 = this.action.hashCode();
      }

      val var2: Int;
      if (this.userId == null) {
         var2 = 0;
      } else {
         var2 = UserId.hashCode-impl(this.userId.unbox-impl());
      }

      val var3: Int;
      if (this.messageId == null) {
         var3 = 0;
      } else {
         var3 = MessageId.hashCode-impl(this.messageId);
      }

      val var4: Int;
      if (this.applicationUserId == null) {
         var4 = 0;
      } else {
         var4 = UserId.hashCode-impl(this.applicationUserId.unbox-impl());
      }

      val var5: Int;
      if (this.messageType == null) {
         var5 = 0;
      } else {
         var5 = this.messageType.hashCode();
      }

      if (this.messageChannelId != null) {
         var6 = ChannelId.hashCode-impl(this.messageChannelId.unbox-impl());
      }

      return ((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.action;
      val var3: UserId = this.userId;
      val var8: java.lang.String;
      if (this.messageId == null) {
         var8 = "null";
      } else {
         var8 = MessageId.toString-impl(this.messageId);
      }

      val var5: UserId = this.applicationUserId;
      val var4: MessageType = this.messageType;
      val var7: ChannelId = this.messageChannelId;
      val var6: StringBuilder = new StringBuilder();
      var6.append("CommandOnClick(action=");
      var6.append(var2);
      var6.append(", userId=");
      var6.append(var3);
      var6.append(", messageId=");
      var6.append(var8);
      var6.append(", applicationUserId=");
      var6.append(var5);
      var6.append(", messageType=");
      var6.append(var4);
      var6.append(", messageChannelId=");
      var6.append(var7);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: CommandOnClick.$serializer = new CommandOnClick.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.CommandOnClick", var0, 6);
         var1.c("action", true);
         var1.c("userId", true);
         var1.c("messageId", true);
         var1.c("applicationUserId", true);
         var1.c("messageType", true);
         var1.c("messageChannelId", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: KSerializer = a.u(b2.a);
         val var2: UserId.$serializer = UserId.$serializer.INSTANCE;
         return new KSerializer[]{
            var1,
            a.u(UserId.$serializer.INSTANCE),
            a.u(MessageId.$serializer.INSTANCE),
            a.u(var2),
            a.u(MessageType.Serializer.INSTANCE),
            a.u(ChannelId.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): CommandOnClick {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         var var2: Int;
         var var7: Any;
         var var8: Any;
         var var9: java.lang.String;
         val var10: Any;
         var var16: Any;
         var var18: ChannelId;
         if (var13.p()) {
            var9 = var13.n(var12, 0, b2.a, null) as java.lang.String;
            val var5: UserId.$serializer = UserId.$serializer.INSTANCE;
            var10 = var13.n(var12, 1, UserId.$serializer.INSTANCE, null) as UserId;
            var16 = var13.n(var12, 2, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var15: java.lang.String;
            if (var16 != null) {
               var15 = var16.unbox-impl();
            } else {
               var15 = null;
            }

            var7 = var13.n(var12, 3, var5, null) as UserId;
            val var6: MessageType = var13.n(var12, 4, MessageType.Serializer.INSTANCE, null) as MessageType;
            var18 = var13.n(var12, 5, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var2 = 63;
            var8 = var15;
            var16 = var6;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var7 = null;
            var var20: Any = null;
            var18 = null;
            var8 = null;
            var16 = null;

            while (var3) {
               val var4: Int = var13.o(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var9 = var13.n(var12, 0, b2.a, var9) as java.lang.String;
                     var2 |= 1;
                     break;
                  case 1:
                     var16 = var13.n(var12, 1, UserId.$serializer.INSTANCE, var16) as UserId;
                     var2 |= 2;
                     break;
                  case 2:
                     if (var8 != null) {
                        var8 = MessageId.box-impl(var8);
                     } else {
                        var8 = null;
                     }

                     var8 = var13.n(var12, 2, MessageId.$serializer.INSTANCE, var8) as MessageId;
                     if (var8 != null) {
                        var8 = var8.unbox-impl();
                     } else {
                        var8 = null;
                     }

                     var2 |= 4;
                     break;
                  case 3:
                     var20 = var13.n(var12, 3, UserId.$serializer.INSTANCE, var20) as UserId;
                     var2 |= 8;
                     break;
                  case 4:
                     var18 = var13.n(var12, 4, MessageType.Serializer.INSTANCE, var18) as MessageType;
                     var2 |= 16;
                     break;
                  case 5:
                     var7 = var13.n(var12, 5, ChannelId.$serializer.INSTANCE, var7) as ChannelId;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var10 = var16;
            var18 = (ChannelId)var7;
            var16 = var18;
            var7 = var20;
         }

         var13.c(var12);
         return new CommandOnClick(var2, var9, (UserId)var10, var8, (UserId)var7, var16, var18, null, null);
      }

      public open fun serialize(encoder: Encoder, value: CommandOnClick) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         CommandOnClick.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CommandOnClick> {
         return CommandOnClick.$serializer.INSTANCE;
      }
   }
}
