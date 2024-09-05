package com.discord.chat.bridge.contentnode

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
import qn.n0
import qn.g0.a

@f
public data class HeadingContentNode(level: Int, content: List<ContentNode>) : ContentNode {
   public final val content: List<ContentNode>
   public final val level: Int

   init {
      q.h(var2, "content");
      super(null);
      this.level = var1;
      this.content = var2;
   }

   public operator fun component1(): Int {
      return this.level;
   }

   public operator fun component2(): List<ContentNode> {
      return this.content;
   }

   public fun copy(level: Int = var0.level, content: List<ContentNode> = var0.content): HeadingContentNode {
      q.h(var2, "content");
      return new HeadingContentNode(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is HeadingContentNode) {
         return false;
      } else {
         var1 = var1;
         if (this.level != var1.level) {
            return false;
         } else {
            return q.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.level) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.level;
      val var3: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("HeadingContentNode(level=");
      var2.append(var1);
      var2.append(", content=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: HeadingContentNode.$serializer = new HeadingContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("heading", var0, 2);
         var1.c("level", false);
         var1.c("content", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, HeadingContentNode.access$get$childSerializers$cp()[1]};
      }

      public open fun deserialize(decoder: Decoder): HeadingContentNode {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var8: Array<KSerializer> = HeadingContentNode.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var9: java.util.List;
         if (var7.p()) {
            var3 = var7.i(var6, 0);
            var9 = var7.y(var6, 1, var8[1], null) as java.util.List;
            var2 = 3;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;
            var9 = null;

            while (var4) {
               val var5: Int = var7.o(var6);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        throw new n(var5);
                     }

                     var9 = var7.y(var6, 1, var8[1], var9) as java.util.List;
                     var2 |= 2;
                  } else {
                     var3 = var7.i(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var7.c(var6);
         return new HeadingContentNode(var2, var3, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: HeadingContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         HeadingContentNode.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<HeadingContentNode> {
         return HeadingContentNode.$serializer.INSTANCE;
      }
   }
}
