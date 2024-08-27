package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.MessageType
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
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.n1

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
      if ((var1 and 0) != 0) {
         n1.b(var1, 0, CommandOnClick.$serializer.INSTANCE.getDescriptor());
      }

      super();
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
      super();
      this.action = var1;
      this.userId = var2;
      this.messageId = var3;
      this.applicationUserId = var4;
      this.messageType = var5;
      this.messageChannelId = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: CommandOnClick, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.action == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.action);
      }

      if (!var1.A(var2, 1) && var0.userId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, com.discord.primitives.UserId..serializer.INSTANCE, var0.userId);
      }

      if (!var1.A(var2, 2) && var0.messageId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         val var12: MessageId;
         if (var0.messageId != null) {
            var12 = MessageId.box-impl(var0.messageId);
         } else {
            var12 = null;
         }

         var1.m(var2, 2, com.discord.primitives.MessageId..serializer.INSTANCE, var12);
      }

      if (!var1.A(var2, 3) && var0.applicationUserId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, com.discord.primitives.UserId..serializer.INSTANCE, var0.applicationUserId);
      }

      if (!var1.A(var2, 4) && var0.messageType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, MessageType.Serializer.INSTANCE, var0.messageType);
      }

      label61: {
         if (!var1.A(var2, 5)) {
            var3 = false;
            if (var0.messageChannelId == null) {
               break label61;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, com.discord.primitives.ChannelId..serializer.INSTANCE, var0.messageChannelId);
      }
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
         val var3: CommandOnClick = var1 as CommandOnClick;
         if (!r.c(this.action, (var1 as CommandOnClick).action)) {
            return false;
         } else if (!r.c(this.userId, var3.userId)) {
            return false;
         } else {
            var var2: Boolean;
            label41: {
               if (this.messageId == null) {
                  if (var3.messageId == null) {
                     var2 = true;
                     break label41;
                  }
               } else if (var3.messageId != null) {
                  var2 = MessageId.equals-impl0(this.messageId, var3.messageId);
                  break label41;
               }

               var2 = false;
            }

            if (!var2) {
               return false;
            } else if (!r.c(this.applicationUserId, var3.applicationUserId)) {
               return false;
            } else if (this.messageType != var3.messageType) {
               return false;
            } else {
               return r.c(this.messageChannelId, var3.messageChannelId);
            }
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

      val var4: UserId = this.applicationUserId;
      val var7: MessageType = this.messageType;
      val var5: ChannelId = this.messageChannelId;
      val var6: StringBuilder = new StringBuilder();
      var6.append("CommandOnClick(action=");
      var6.append(var2);
      var6.append(", userId=");
      var6.append(var3);
      var6.append(", messageId=");
      var6.append(var8);
      var6.append(", applicationUserId=");
      var6.append(var4);
      var6.append(", messageType=");
      var6.append(var7);
      var6.append(", messageChannelId=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<CommandOnClick> {
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
         val var2: KSerializer = a.u(a2.a);
         val var1: com.discord.primitives.UserId..serializer = com.discord.primitives.UserId..serializer.INSTANCE;
         return new KSerializer[]{
            var2,
            a.u(com.discord.primitives.UserId..serializer.INSTANCE),
            a.u(com.discord.primitives.MessageId..serializer.INSTANCE),
            a.u(var1),
            a.u(MessageType.Serializer.INSTANCE),
            a.u(com.discord.primitives.ChannelId..serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): CommandOnClick {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         var var2: Int;
         var var6: Any;
         var var7: Any;
         var var8: Any;
         var var10: Any;
         var var14: Any;
         var var17: Any;
         if (var13.p()) {
            var14 = (MessageId)var13.n(var12, 0, a2.a, null);
            var17 = com.discord.primitives.UserId..serializer.INSTANCE;
            var10 = var13.n(var12, 1, com.discord.primitives.UserId..serializer.INSTANCE, null);
            var8 = var13.n(var12, 2, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var7 = var13.n(var12, 3, (DeserializationStrategy)var17, null);
            var17 = var13.n(var12, 4, MessageType.Serializer.INSTANCE, null);
            var6 = var13.n(var12, 5, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var2 = 63;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var14 = null;
            var var9: Any = null;
            var8 = null;
            var7 = null;
            var6 = null;
            var17 = null;

            while (var3) {
               val var4: Int = var13.o(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var14 = (MessageId)var13.n(var12, 0, a2.a, var14);
                     var2 |= 1;
                     break;
                  case 1:
                     var17 = var13.n(var12, 1, com.discord.primitives.UserId..serializer.INSTANCE, var17);
                     var2 |= 2;
                     break;
                  case 2:
                     var6 = var13.n(var12, 2, com.discord.primitives.MessageId..serializer.INSTANCE, var6);
                     var2 |= 4;
                     break;
                  case 3:
                     var8 = var13.n(var12, 3, com.discord.primitives.UserId..serializer.INSTANCE, var8);
                     var2 |= 8;
                     break;
                  case 4:
                     var7 = var13.n(var12, 4, MessageType.Serializer.INSTANCE, var7);
                     var2 |= 16;
                     break;
                  case 5:
                     var9 = var13.n(var12, 5, com.discord.primitives.ChannelId..serializer.INSTANCE, var9);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var10 = var17;
            var8 = var6;
            var17 = var7;
            var7 = var8;
            var6 = var9;
         }

         var13.c(var12);
         val var22: java.lang.String = var14 as java.lang.String;
         var10 = var10 as UserId;
         var14 = var8 as MessageId;
         val var16: java.lang.String;
         if (var8 as MessageId != null) {
            var16 = var14.unbox-impl();
         } else {
            var16 = null;
         }

         return new CommandOnClick(var2, var22, (UserId)var10, var16, var7 as UserId, var17 as MessageType, var6 as ChannelId, null, null);
      }

      public open fun serialize(encoder: Encoder, value: CommandOnClick) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         CommandOnClick.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CommandOnClick> {
         return CommandOnClick.$serializer.INSTANCE;
      }
   }
}
