package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.spoiler.SpoilerableData
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
import qn.b2
import qn.g0
import qn.g0.a

@f
public data class SpoilerContentNode(content: List<ContentNode>) : ContentNode, SpoilerableData {
   public final val content: List<ContentNode>
   public open val obscureOrNull: String
   public open val spoilerOrNull: String

   init {
      q.h(var1, "content");
      super(null);
      this.content = var1;
      this.spoilerOrNull = "";
      this.obscureOrNull = "";
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public fun copy(content: List<ContentNode> = var0.content): SpoilerContentNode {
      q.h(var1, "content");
      return new SpoilerContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SpoilerContentNode) {
         return false;
      } else {
         return q.c(this.content, (var1 as SpoilerContentNode).content);
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SpoilerContentNode(content=");
      var2.append(var1);
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
         val var0: SpoilerContentNode.$serializer = new SpoilerContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("spoiler", var0, 3);
         var1.c("content", false);
         var1.c("spoilerOrNull", true);
         var1.c("obscureOrNull", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{SpoilerContentNode.access$get$childSerializers$cp()[0], b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): SpoilerContentNode {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var8: Array<KSerializer> = SpoilerContentNode.access$get$childSerializers$cp();
         val var5: Boolean = var10.p();
         var var7: java.util.List = null;
         var var2: Int;
         var var6: java.lang.String;
         var var12: java.lang.String;
         if (var5) {
            val var11: java.util.List = var10.y(var9, 0, var8[0], null) as java.util.List;
            var6 = var10.m(var9, 1);
            val var13: java.lang.String = var10.m(var9, 2);
            var2 = 7;
            var7 = var11;
            var12 = var13;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var10.m(var9, 2);
                        var2 |= 4;
                     } else {
                        var6 = var10.m(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.y(var9, 0, var8[0], var7) as java.util.List;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.c(var9);
         return new SpoilerContentNode(var2, var7, var6, var12, null);
      }

      public open fun serialize(encoder: Encoder, value: SpoilerContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SpoilerContentNode.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SpoilerContentNode> {
         return SpoilerContentNode.$serializer.INSTANCE;
      }
   }
}
