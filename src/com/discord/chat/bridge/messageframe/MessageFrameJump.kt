package com.discord.chat.bridge.messageframe

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var3: java.lang.String = this.guildName;
      val var4: java.lang.String = this.channelName;
      val var1: StringBuilder = new StringBuilder();
      var1.append("MessageFrameJump(type=");
      var1.append(var2);
      var1.append(", guildName=");
      var1.append(var3);
      var1.append(", channelName=");
      var1.append(var4);
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
         val var0: MessageFrameJump.$serializer = new MessageFrameJump.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("0", var0, 3);
         var1.l("type", false);
         var1.l("guildName", true);
         var1.l("channelName", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: b2 = b2.a;
         return new KSerializer[]{MessageFrameType.Serializer.INSTANCE, a.u(b2.a), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): MessageFrameJump {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         val var5: Boolean = var9.y();
         var var7: MessageFrameType = null;
         var var2: Int;
         var var6: java.lang.String;
         var var11: java.lang.String;
         if (var5) {
            var7 = var9.m(var8, 0, MessageFrameType.Serializer.INSTANCE, null) as MessageFrameType;
            val var10: b2 = b2.a;
            var6 = var9.v(var8, 1, b2.a, null) as java.lang.String;
            var11 = var9.v(var8, 2, var10, null) as java.lang.String;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var9.x(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var11 = var9.v(var8, 2, b2.a, var11) as java.lang.String;
                        var2 |= 4;
                     } else {
                        var6 = var9.v(var8, 1, b2.a, var6) as java.lang.String;
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.m(var8, 0, MessageFrameType.Serializer.INSTANCE, var7) as MessageFrameType;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.b(var8);
         return new MessageFrameJump(var2, var7, var6, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: MessageFrameJump) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MessageFrameJump.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageFrameJump> {
         return MessageFrameJump.$serializer.INSTANCE;
      }
   }
}
