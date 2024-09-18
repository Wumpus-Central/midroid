package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import vk.f
import vk.n
import yk.b2
import yk.g0
import yk.n0
import yk.g0.a

@f
public data class LHeadingContentNode(level: Int, className: String, content: List<ContentNode>) : ContentNode {
   public final val className: String
   public final val content: List<ContentNode>
   public final val level: Int

   init {
      q.h(var2, "className");
      q.h(var3, "content");
      super(null);
      this.level = var1;
      this.className = var2;
      this.content = var3;
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
      q.h(var2, "className");
      q.h(var3, "content");
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
         } else if (!q.c(this.className, var1.className)) {
            return false;
         } else {
            return q.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.level) * 31 + this.className.hashCode()) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.level;
      val var3: java.lang.String = this.className;
      val var2: java.util.List = this.content;
      val var4: StringBuilder = new StringBuilder();
      var4.append("LHeadingContentNode(level=");
      var4.append(var1);
      var4.append(", className=");
      var4.append(var3);
      var4.append(", content=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{n0.a, b2.a, LHeadingContentNode.access$get$childSerializers$cp()[2]};
      }

      public open fun deserialize(decoder: Decoder): LHeadingContentNode {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         val var9: Array<KSerializer> = LHeadingContentNode.access$get$childSerializers$cp();
         var var2: Int;
         val var4: Int;
         var var6: java.lang.String;
         var var10: java.util.List;
         if (var8.y()) {
            var2 = var8.k(var7, 0);
            var6 = var8.t(var7, 1);
            var10 = var8.m(var7, 2, var9[2], null) as java.util.List;
            var4 = 7;
         } else {
            var var12: Boolean = true;
            var var3: Int = 0;
            var6 = null;
            var10 = null;
            var2 = 0;

            while (var12) {
               val var5: Int = var8.x(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var10 = var8.m(var7, 2, var9[2], var10) as java.util.List;
                        var2 |= 4;
                     } else {
                        var6 = var8.t(var7, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var8.k(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var12 = false;
               }
            }

            var4 = var2;
            var2 = var3;
         }

         var8.b(var7);
         return new LHeadingContentNode(var4, var2, var6, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: LHeadingContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LHeadingContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LHeadingContentNode> {
         return LHeadingContentNode.$serializer.INSTANCE;
      }
   }
}
