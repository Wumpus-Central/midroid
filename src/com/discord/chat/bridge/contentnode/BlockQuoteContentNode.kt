package com.discord.chat.bridge.contentnode

import al.g0
import al.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import xk.f
import xk.n

@f
public data class BlockQuoteContentNode(content: List<ContentNode>) : ContentNode {
   public final val content: List<ContentNode>

   init {
      q.h(var1, "content");
      super(null);
      this.content = var1;
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public fun copy(content: List<ContentNode> = var0.content): BlockQuoteContentNode {
      q.h(var1, "content");
      return new BlockQuoteContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockQuoteContentNode) {
         return false;
      } else {
         return q.c(this.content, (var1 as BlockQuoteContentNode).content);
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var2: java.util.List = this.content;
      val var1: StringBuilder = new StringBuilder();
      var1.append("BlockQuoteContentNode(content=");
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
         val var0: BlockQuoteContentNode.$serializer = new BlockQuoteContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("blockQuote", var0, 1);
         var1.l("content", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{BlockQuoteContentNode.access$get$childSerializers$cp()[0]};
      }

      public open fun deserialize(decoder: Decoder): BlockQuoteContentNode {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var8: Array<KSerializer> = BlockQuoteContentNode.access$get$childSerializers$cp();
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var9: java.util.List;
         if (var5) {
            var9 = var7.m(var6, 0, var8[0], null) as java.util.List;
         } else {
            var2 = 0;
            var9 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var9 = var7.m(var6, 0, var8[0], var9) as java.util.List;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new BlockQuoteContentNode(var2, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: BlockQuoteContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         BlockQuoteContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BlockQuoteContentNode> {
         return BlockQuoteContentNode.$serializer.INSTANCE;
      }
   }
}
