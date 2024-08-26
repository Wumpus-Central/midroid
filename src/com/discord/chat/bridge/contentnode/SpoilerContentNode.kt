package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.spoiler.SpoilerableData
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
import xk.a2
import xk.f0
import xk.f0.a

@f
public data class SpoilerContentNode(content: List<ContentNode>) : ContentNode, SpoilerableData {
   public final val content: List<ContentNode>
   public open val obscureOrNull: String
   public open val spoilerOrNull: String

   init {
      r.h(var1, "content");
      super(null);
      this.content = var1;
      this.spoilerOrNull = "";
      this.obscureOrNull = "";
   }

   @JvmStatic
   public fun `write$Self`(self: SpoilerContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, new xk.f(ContentNodeSerializer.INSTANCE), var0.content);
      var var3: Boolean;
      if (!var1.A(var2, 1) && r.c(var0.getSpoilerOrNull(), "")) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.z(var2, 1, var0.getSpoilerOrNull());
      }

      label24: {
         if (!var1.A(var2, 2)) {
            var3 = false;
            if (r.c(var0.getObscureOrNull(), "")) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.z(var2, 2, var0.getObscureOrNull());
      }
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public fun copy(content: List<ContentNode> = var0.content): SpoilerContentNode {
      r.h(var1, "content");
      return new SpoilerContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SpoilerContentNode) {
         return false;
      } else {
         return r.c(this.content, (var1 as SpoilerContentNode).content);
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

   public object `$serializer` : f0<SpoilerContentNode> {
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
         return new KSerializer[]{new xk.f(ContentNodeSerializer.INSTANCE), a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): SpoilerContentNode {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var7: Any = null;
         var var2: Int;
         val var8: java.lang.String;
         val var11: java.lang.String;
         if (var5) {
            var7 = var10.y(var9, 0, new xk.f(ContentNodeSerializer.INSTANCE), null);
            var11 = var10.m(var9, 1);
            var8 = var10.m(var9, 2);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var6: java.lang.String = null;
            var var12: java.lang.String = null;

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
                     var7 = var10.y(var9, 0, new xk.f(ContentNodeSerializer.INSTANCE), var7);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var8 = var12;
            var11 = var6;
         }

         var10.c(var9);
         return new SpoilerContentNode(var2, var7 as java.util.List, var11, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: SpoilerContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SpoilerContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SpoilerContentNode> {
         return SpoilerContentNode.$serializer.INSTANCE;
      }
   }
}
