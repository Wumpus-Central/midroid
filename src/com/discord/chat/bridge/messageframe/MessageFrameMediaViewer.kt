package com.discord.chat.bridge.messageframe

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.f0
import xk.f0.a

@f
public data class MessageFrameMediaViewer(type: MessageFrameType) : MessageFrame {
   public open val type: MessageFrameType

   init {
      r.h(var1, "type");
      super(null);
      this.type = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: MessageFrameMediaViewer, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, MessageFrameType.Serializer.INSTANCE, var0.getType());
   }

   public operator fun component1(): MessageFrameType {
      return this.getType();
   }

   public fun copy(type: MessageFrameType = var0.getType()): MessageFrameMediaViewer {
      r.h(var1, "type");
      return new MessageFrameMediaViewer(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageFrameMediaViewer) {
         return false;
      } else {
         return this.getType() === (var1 as MessageFrameMediaViewer).getType();
      }
   }

   public override fun hashCode(): Int {
      return this.getType().hashCode();
   }

   public override fun toString(): String {
      val var2: MessageFrameType = this.getType();
      val var1: StringBuilder = new StringBuilder();
      var1.append("MessageFrameMediaViewer(type=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<MessageFrameMediaViewer> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MessageFrameMediaViewer.$serializer = new MessageFrameMediaViewer.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("1", var0, 1);
         var1.l("type", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageFrameType.Serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): MessageFrameMediaViewer {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Any;
         if (var5) {
            var8 = var7.y(var6, 0, MessageFrameType.Serializer.INSTANCE, null);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.y(var6, 0, MessageFrameType.Serializer.INSTANCE, var8);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new MessageFrameMediaViewer(var2, var8 as MessageFrameType, null);
      }

      public open fun serialize(encoder: Encoder, value: MessageFrameMediaViewer) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MessageFrameMediaViewer.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageFrameMediaViewer> {
         return MessageFrameMediaViewer.$serializer.INSTANCE;
      }
   }
}
