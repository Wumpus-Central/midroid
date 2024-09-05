package com.discord.chat.bridge.messageframe

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0

@f
public data class MessageFrameJump(type: MessageFrameType, guildName: String? = null, channelName: String? = null) : MessageFrame {
   public final val channelName: String?
   public final val guildName: String?
   public open val type: MessageFrameType

   init {
      q.h(var1, "type");
      super(null);
      this.type = var1;
      this.guildName = var2;
      this.channelName = var3;
   }

   public operator fun component1(): MessageFrameType {
      return this.type;
   }

   public operator fun component2(): String? {
      return this.guildName;
   }

   public operator fun component3(): String? {
      return this.channelName;
   }

   public fun copy(type: MessageFrameType = var0.type, guildName: String? = var0.guildName, channelName: String? = var0.channelName): MessageFrameJump {
      q.h(var1, "type");
      return new MessageFrameJump(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageFrameJump) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.guildName, var1.guildName)) {
            return false;
         } else {
            return q.c(this.channelName, var1.channelName);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.type.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.guildName == null) {
         var1 = 0;
      } else {
         var1 = this.guildName.hashCode();
      }

      if (this.channelName != null) {
         var2 = this.channelName.hashCode();
      }

      return (var3 * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var2: MessageFrameType = this.type;
      val var1: java.lang.String = this.guildName;
      val var3: java.lang.String = this.channelName;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MessageFrameJump(type=");
      var4.append(var2);
      var4.append(", guildName=");
      var4.append(var1);
      var4.append(", channelName=");
      var4.append(var3);
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
         val var0: MessageFrameJump.$serializer = new MessageFrameJump.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("0", var0, 3);
         var1.c("type", false);
         var1.c("guildName", true);
         var1.c("channelName", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{MessageFrameType.Serializer.INSTANCE, a.u(b2.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): MessageFrameJump {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var7: MessageFrameType = null;
         var var2: Int;
         val var6: MessageFrameType;
         val var8: java.lang.String;
         var var12: java.lang.String;
         if (var5) {
            var6 = var10.y(var9, 0, MessageFrameType.Serializer.INSTANCE, null) as MessageFrameType;
            val var11: b2 = b2.a;
            var8 = var10.n(var9, 1, b2.a, null) as java.lang.String;
            var12 = var10.n(var9, 2, var11, null) as java.lang.String;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var13: java.lang.String = null;
            var12 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var10.n(var9, 2, b2.a, var12) as java.lang.String;
                        var2 |= 4;
                     } else {
                        var13 = var10.n(var9, 1, b2.a, var13) as java.lang.String;
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.y(var9, 0, MessageFrameType.Serializer.INSTANCE, var7) as MessageFrameType;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var8 = var13;
            var6 = var7;
         }

         var10.c(var9);
         return new MessageFrameJump(var2, var6, var8, var12, null);
      }

      public open fun serialize(encoder: Encoder, value: MessageFrameJump) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MessageFrameJump.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageFrameJump> {
         return MessageFrameJump.$serializer.INSTANCE;
      }
   }
}
