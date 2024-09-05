package com.discord.chat.bridge.row

import com.discord.chat.bridge.MessageBase
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
import qn.g0
import qn.g0.a

@f
public data class BlockedGroupContent(message: MessageBase) {
   @f(
      with = MessageSerializer.class
   )
   public final val message: MessageBase

   init {
      q.h(var1, "message");
      super();
      this.message = var1;
   }

   public operator fun component1(): MessageBase {
      return this.message;
   }

   public fun copy(message: MessageBase = var0.message): BlockedGroupContent {
      q.h(var1, "message");
      return new BlockedGroupContent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupContent) {
         return false;
      } else {
         return q.c(this.message, (var1 as BlockedGroupContent).message);
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var2: MessageBase = this.message;
      val var1: StringBuilder = new StringBuilder();
      var1.append("BlockedGroupContent(message=");
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
         val var0: BlockedGroupContent.$serializer = new BlockedGroupContent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.row.BlockedGroupContent", var0, 1);
         var1.c("message", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageSerializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): BlockedGroupContent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: MessageBase;
         if (var5) {
            var8 = var7.y(var6, 0, MessageSerializer.INSTANCE, null) as MessageBase;
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.y(var6, 0, MessageSerializer.INSTANCE, var8) as MessageBase;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new BlockedGroupContent(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: BlockedGroupContent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BlockedGroupContent.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupContent> {
         return BlockedGroupContent.$serializer.INSTANCE;
      }
   }
}
