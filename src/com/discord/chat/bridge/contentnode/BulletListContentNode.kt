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
import vk.a
import xk.f0
import xk.h
import xk.w0

@f
public data class BulletListContentNode(start: Long? = null, ordered: Boolean = false, items: List<List<ContentNode>>) : ContentNode {
   public final val items: List<List<ContentNode>>
   public final val ordered: Boolean
   public final val start: Long?

   init {
      r.h(var3, "items");
      super(null);
      this.start = var1;
      this.ordered = var2;
      this.items = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: BulletListContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.start == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, w0.a, var0.start);
      }

      label24: {
         if (!var1.A(var2, 1)) {
            var3 = false;
            if (!var0.ordered) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.x(var2, 1, var0.ordered);
      }

      var1.y(var2, 2, new xk.f(new xk.f(ContentNodeSerializer.INSTANCE)), var0.items);
   }

   public operator fun component1(): Long? {
      return this.start;
   }

   public operator fun component2(): Boolean {
      return this.ordered;
   }

   public operator fun component3(): List<List<ContentNode>> {
      return this.items;
   }

   public fun copy(start: Long? = var0.start, ordered: Boolean = var0.ordered, items: List<List<ContentNode>> = var0.items): BulletListContentNode {
      r.h(var3, "items");
      return new BulletListContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BulletListContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.start, var1.start)) {
            return false;
         } else if (this.ordered != var1.ordered) {
            return false;
         } else {
            return r.c(this.items, var1.items);
         }
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.start == null) {
         var1 = 0;
      } else {
         var1 = this.start.hashCode();
      }

      var var2: Byte = this.ordered;
      if (this.ordered != 0) {
         var2 = 1;
      }

      return (var1 * 31 + var2) * 31 + this.items.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.Long = this.start;
      val var1: Boolean = this.ordered;
      val var3: java.util.List = this.items;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BulletListContentNode(start=");
      var2.append(var4);
      var2.append(", ordered=");
      var2.append(var1);
      var2.append(", items=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<BulletListContentNode> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BulletListContentNode.$serializer = new BulletListContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("list", var0, 3);
         var1.l("start", true);
         var1.l("ordered", true);
         var1.l("items", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a.u(w0.a), h.a, new xk.f(new xk.f(ContentNodeSerializer.INSTANCE))};
      }

      public open fun deserialize(decoder: Decoder): BulletListContentNode {
         r.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var2: Int;
         var var5: Boolean;
         var var6: Any;
         var var9: Any;
         if (var8.p()) {
            var6 = var8.n(var7, 0, w0.a, null);
            var5 = var8.C(var7, 1);
            var9 = var8.y(var7, 2, new xk.f(new xk.f(ContentNodeSerializer.INSTANCE)), null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var6 = null;
            var9 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var8.o(var7);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var9 = var8.y(var7, 2, new xk.f(new xk.f(ContentNodeSerializer.INSTANCE)), var9);
                        var2 |= 4;
                     } else {
                        var5 = var8.C(var7, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var8.n(var7, 0, w0.a, var6);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var8.c(var7);
         return new BulletListContentNode(var2, var6 as java.lang.Long, var5, var9 as java.util.List, null);
      }

      public open fun serialize(encoder: Encoder, value: BulletListContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BulletListContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BulletListContentNode> {
         return BulletListContentNode.$serializer.INSTANCE;
      }
   }
}
