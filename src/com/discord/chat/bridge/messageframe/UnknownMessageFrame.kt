package com.discord.chat.bridge.messageframe

import bl.g0
import bl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n

@f
public data class UnknownMessageFrame(type: MessageFrameType) : MessageFrame {
   public open val type: MessageFrameType

   init {
      q.h(var1, "type");
      super(null);
      this.type = var1;
   }

   public operator fun component1(): MessageFrameType {
      return this.type;
   }

   public fun copy(type: MessageFrameType = var0.type): UnknownMessageFrame {
      q.h(var1, "type");
      return new UnknownMessageFrame(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnknownMessageFrame) {
         return false;
      } else {
         return this.type === (var1 as UnknownMessageFrame).type;
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode();
   }

   public override fun toString(): String {
      val var2: MessageFrameType = this.type;
      val var1: StringBuilder = new StringBuilder();
      var1.append("UnknownMessageFrame(type=");
      var1.append(var2);
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
         val var0: UnknownMessageFrame.$serializer = new UnknownMessageFrame.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("-1", var0, 1);
         var1.l("type", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageFrameType.Serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): UnknownMessageFrame {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: MessageFrameType;
         if (var5) {
            var8 = var7.m(var6, 0, MessageFrameType.Serializer.INSTANCE, null) as MessageFrameType;
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.m(var6, 0, MessageFrameType.Serializer.INSTANCE, var8) as MessageFrameType;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new UnknownMessageFrame(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: UnknownMessageFrame) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         UnknownMessageFrame.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UnknownMessageFrame> {
         return UnknownMessageFrame.$serializer.INSTANCE;
      }
   }
}
