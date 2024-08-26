package com.discord.chat.bridge.contentnode

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
import xk.m0
import xk.f0.a

@f
public data class LHeadingContentNode(level: Int, className: String, content: List<ContentNode>) : ContentNode {
   public final val className: String
   public final val content: List<ContentNode>
   public final val level: Int

   init {
      r.h(var2, "className");
      r.h(var3, "content");
      super(null);
      this.level = var1;
      this.className = var2;
      this.content = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: LHeadingContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.level);
      var1.z(var2, 1, var0.className);
      var1.y(var2, 2, new xk.f(ContentNodeSerializer.INSTANCE), var0.content);
   }

   public operator fun component1(): Int {
      return this.level;
   }

   public operator fun component2(): String {
      return this.className;
   }

   public operator fun component3(): List<ContentNode> {
      return this.content;
   }

   public fun copy(level: Int = var0.level, className: String = var0.className, content: List<ContentNode> = var0.content): LHeadingContentNode {
      r.h(var2, "className");
      r.h(var3, "content");
      return new LHeadingContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LHeadingContentNode) {
         return false;
      } else {
         var1 = var1;
         if (this.level != var1.level) {
            return false;
         } else if (!r.c(this.className, var1.className)) {
            return false;
         } else {
            return r.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.level) * 31 + this.className.hashCode()) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.level;
      val var3: java.lang.String = this.className;
      val var4: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LHeadingContentNode(level=");
      var2.append(var1);
      var2.append(", className=");
      var2.append(var3);
      var2.append(", content=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<LHeadingContentNode> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LHeadingContentNode.$serializer = new LHeadingContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("lheading", var0, 3);
         var1.l("level", false);
         var1.l("className", false);
         var1.l("content", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, a2.a, new xk.f(ContentNodeSerializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): LHeadingContentNode {
         r.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var2: Int;
         var var3: Int;
         var var6: java.lang.String;
         var var9: Any;
         if (var8.p()) {
            var3 = var8.i(var7, 0);
            var6 = var8.m(var7, 1);
            var9 = var8.y(var7, 2, new xk.f(ContentNodeSerializer.INSTANCE), null);
            var2 = 7;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var6 = null;
            var9 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var8.o(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var9 = var8.y(var7, 2, new xk.f(ContentNodeSerializer.INSTANCE), var9);
                        var2 |= 4;
                     } else {
                        var6 = var8.m(var7, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var8.i(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var8.c(var7);
         return new LHeadingContentNode(var2, var3, var6, var9 as java.util.List, null);
      }

      public open fun serialize(encoder: Encoder, value: LHeadingContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LHeadingContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LHeadingContentNode> {
         return LHeadingContentNode.$serializer.INSTANCE;
      }
   }
}
