package com.discord.chat.bridge.row

import com.discord.chat.bridge.MessageBase
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
public data class BlockedGroupContent(message: MessageBase) {
   @f(
      with = MessageSerializer.class
   )
   public final val message: MessageBase

   init {
      r.h(var1, "message");
      super();
      this.message = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: BlockedGroupContent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, MessageSerializer.INSTANCE, var0.message);
   }

   public operator fun component1(): MessageBase {
      return this.message;
   }

   public fun copy(message: MessageBase = var0.message): BlockedGroupContent {
      r.h(var1, "message");
      return new BlockedGroupContent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupContent) {
         return false;
      } else {
         return r.c(this.message, (var1 as BlockedGroupContent).message);
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var1: MessageBase = this.message;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BlockedGroupContent(message=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<BlockedGroupContent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BlockedGroupContent.$serializer = new BlockedGroupContent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.row.BlockedGroupContent", var0, 1);
         var1.l("message", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageSerializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): BlockedGroupContent {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Any;
         if (var5) {
            var8 = var7.y(var6, 0, MessageSerializer.INSTANCE, null);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.y(var6, 0, MessageSerializer.INSTANCE, var8);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new BlockedGroupContent(var2, var8 as MessageBase, null);
      }

      public open fun serialize(encoder: Encoder, value: BlockedGroupContent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BlockedGroupContent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupContent> {
         return BlockedGroupContent.$serializer.INSTANCE;
      }
   }
}
