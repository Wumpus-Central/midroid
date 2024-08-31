package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.MessageType
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
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
         val var2: CommandOnClick = var1 as CommandOnClick;
         if (!q.c(this.action, (var1 as CommandOnClick).action)) {
            return false;
         } else if (!q.c(this.userId, var2.userId)) {
            return false;
         } else if (if (this.messageId == null) var2.messageId == null else var2.messageId != null && MessageId.equals-impl0(this.messageId, var2.messageId)) {
            if (!q.c(this.applicationUserId, var2.applicationUserId)) {
               return false;
            } else if (this.messageType != var2.messageType) {
               return false;
            } else {
               return q.c(this.messageChannelId, var2.messageChannelId);
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
      val var3: java.lang.String = this.action;
      val var2: UserId = this.userId;
      val var8: java.lang.String;
      if (this.messageId == null) {
         var8 = "null";
      } else {
         var8 = MessageId.toString-impl(this.messageId);
      }

      val var7: UserId = this.applicationUserId;
      val var6: MessageType = this.messageType;
      val var5: ChannelId = this.messageChannelId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("CommandOnClick(action=");
      var4.append(var3);
      var4.append(", userId=");
      var4.append(var2);
      var4.append(", messageId=");
      var4.append(var8);
      var4.append(", applicationUserId=");
      var4.append(var7);
      var4.append(", messageType=");
      var4.append(var6);
      var4.append(", messageChannelId=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
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
         var1.l("action", true);
         var1.l("userId", true);
         var1.l("messageId", true);
         var1.l("applicationUserId", true);
         var1.l("messageType", true);
         var1.l("messageChannelId", true);
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
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Int;
         var var6: Any;
         var var7: Any;
         var var15: Any;
         var var16: ChannelId;
         var var19: Any;
         var var22: java.lang.String;
         if (var12.p()) {
            var19 = var12.n(var11, 0, b2.a, null) as java.lang.String;
            val var5: UserId.$serializer = UserId.$serializer.INSTANCE;
            val var9: UserId = var12.n(var11, 1, UserId.$serializer.INSTANCE, null) as UserId;
            var15 = var12.n(var11, 2, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var14: java.lang.String;
            if (var15 != null) {
               var14 = var15.unbox-impl();
            } else {
               var14 = null;
            }

            var6 = var12.n(var11, 3, var5, null) as UserId;
            var7 = var12.n(var11, 4, MessageType.Serializer.INSTANCE, null) as MessageType;
            var16 = var12.n(var11, 5, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var15 = var9;
            var2 = 63;
            var22 = (java.lang.String)var19;
            var19 = var14;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var22 = null;
            var7 = null;
            var6 = null;
            var16 = null;
            var19 = null;
            var15 = null;

            while (var3) {
               val var4: Int = var12.o(var11);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var22 = var12.n(var11, 0, b2.a, var22) as java.lang.String;
                     var2 |= 1;
                     break;
                  case 1:
                     var15 = var12.n(var11, 1, UserId.$serializer.INSTANCE, var15) as UserId;
                     var2 |= 2;
                     break;
                  case 2:
                     if (var19 != null) {
                        var19 = MessageId.box-impl(var19);
                     } else {
                        var19 = null;
                     }

                     var19 = var12.n(var11, 2, MessageId.$serializer.INSTANCE, var19) as MessageId;
                     if (var19 != null) {
                        var19 = var19.unbox-impl();
                     } else {
                        var19 = null;
                     }

                     var2 |= 4;
                     break;
                  case 3:
                     var6 = var12.n(var11, 3, UserId.$serializer.INSTANCE, var6) as UserId;
                     var2 |= 8;
                     break;
                  case 4:
                     var16 = var12.n(var11, 4, MessageType.Serializer.INSTANCE, var16) as MessageType;
                     var2 |= 16;
                     break;
                  case 5:
                     var7 = var12.n(var11, 5, ChannelId.$serializer.INSTANCE, var7) as ChannelId;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var16 = (ChannelId)var7;
            var7 = var16;
         }

         var12.c(var11);
         return new CommandOnClick(var2, var22, var15, var19, (UserId)var6, (MessageType)var7, var16, null, null);
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
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CommandOnClick> {
         return CommandOnClick.$serializer.INSTANCE;
      }
   }
}
