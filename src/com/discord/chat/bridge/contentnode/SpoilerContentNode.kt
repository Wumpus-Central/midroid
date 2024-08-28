package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.spoiler.SpoilerableData
import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var2: java.util.List = this.content;
      val var1: StringBuilder = new StringBuilder();
      var1.append("SpoilerContentNode(content=");
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
         val var0: SpoilerContentNode.$serializer = new SpoilerContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("spoiler", var0, 3);
         var1.l("content", false);
         var1.l("spoilerOrNull", true);
         var1.l("obscureOrNull", true);
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
         val var12: java.lang.String;
         val var16: java.util.List;
         if (var5) {
            val var11: java.util.List = var10.y(var9, 0, var8[0], null) as java.util.List;
            val var15: java.lang.String = var10.m(var9, 1);
            var6 = var10.m(var9, 2);
            var2 = 7;
            var16 = var11;
            var12 = var15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var var13: java.lang.String = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var13 = var10.m(var9, 2);
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

            var6 = var13;
            var12 = var6;
            var16 = var7;
         }

         var10.c(var9);
         return new SpoilerContentNode(var2, var16, var12, var6, null);
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
