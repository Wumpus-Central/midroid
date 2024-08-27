package com.discord.chat.bridge.messageframe

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0

@f
public data class MessageFrameJump(type: MessageFrameType, guildName: String? = null, channelName: String? = null) : MessageFrame {
   public final val channelName: String?
   public final val guildName: String?
   public open val type: MessageFrameType

   init {
      r.h(var1, "type");
      super(null);
      this.type = var1;
      this.guildName = var2;
      this.channelName = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: MessageFrameJump, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, MessageFrameType.Serializer.INSTANCE, var0.getType());
      var var3: Boolean;
      if (!var1.A(var2, 1) && var0.guildName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.guildName);
      }

      label24: {
         if (!var1.A(var2, 2)) {
            var3 = false;
            if (var0.channelName == null) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.channelName);
      }
   }

   public operator fun component1(): MessageFrameType {
      return this.getType();
   }

   public operator fun component2(): String? {
      return this.guildName;
   }

   public operator fun component3(): String? {
      return this.channelName;
   }

   public fun copy(type: MessageFrameType = var0.getType(), guildName: String? = var0.guildName, channelName: String? = var0.channelName): MessageFrameJump {
      r.h(var1, "type");
      return new MessageFrameJump(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageFrameJump) {
         return false;
      } else {
         var1 = var1;
         if (this.getType() != var1.getType()) {
            return false;
         } else if (!r.c(this.guildName, var1.guildName)) {
            return false;
         } else {
            return r.c(this.channelName, var1.channelName);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.getType().hashCode();
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
      val var2: MessageFrameType = this.getType();
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

   public object `$serializer` : f0<MessageFrameJump> {
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
         val var2: a2 = a2.a;
         return new KSerializer[]{MessageFrameType.Serializer.INSTANCE, a.u(a2.a), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): MessageFrameJump {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var6: Any = null;
         var var2: Int;
         var var7: Any;
         var var11: Any;
         if (var5) {
            var11 = var10.y(var9, 0, MessageFrameType.Serializer.INSTANCE, null);
            var6 = a2.a;
            var7 = var10.n(var9, 1, a2.a, null);
            var6 = var10.n(var9, 2, (DeserializationStrategy)var6, null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var11 = var10.n(var9, 2, a2.a, var11);
                        var2 |= 4;
                     } else {
                        var7 = var10.n(var9, 1, a2.a, var7);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var10.y(var9, 0, MessageFrameType.Serializer.INSTANCE, var6);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var11 = var6;
            var6 = var11;
         }

         var10.c(var9);
         return new MessageFrameJump(var2, var11 as MessageFrameType, var7 as java.lang.String, var6 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: MessageFrameJump) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MessageFrameJump.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageFrameJump> {
         return MessageFrameJump.$serializer.INSTANCE;
      }
   }
}
