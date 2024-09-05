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
import on.a
import qn.g0
import qn.h
import qn.x0

@f
public data class BulletListContentNode(start: Long? = null, ordered: Boolean = false, items: List<List<ContentNode>>) : ContentNode {
   public final val items: List<List<ContentNode>>
   public final val ordered: Boolean
   public final val start: Long?

   init {
      q.h(var3, "items");
      super(null);
      this.start = var1;
      this.ordered = var2;
      this.items = var3;
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
      q.h(var3, "items");
      return new BulletListContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BulletListContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.start, var1.start)) {
            return false;
         } else if (this.ordered != var1.ordered) {
            return false;
         } else {
            return q.c(this.items, var1.items);
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

      return (var1 * 31 + java.lang.Boolean.hashCode(this.ordered)) * 31 + this.items.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.Long = this.start;
      val var1: Boolean = this.ordered;
      val var2: java.util.List = this.items;
      val var3: StringBuilder = new StringBuilder();
      var3.append("BulletListContentNode(start=");
      var3.append(var4);
      var3.append(", ordered=");
      var3.append(var1);
      var3.append(", items=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BulletListContentNode.$serializer = new BulletListContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("list", var0, 3);
         var1.c("start", true);
         var1.c("ordered", true);
         var1.c("items", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a.u(x0.a), h.a, BulletListContentNode.access$get$childSerializers$cp()[2]};
      }

      public open fun deserialize(decoder: Decoder): BulletListContentNode {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         val var9: Array<KSerializer> = BulletListContentNode.access$get$childSerializers$cp();
         var var2: Int;
         var var5: Boolean;
         var var6: java.lang.Long;
         var var10: java.util.List;
         if (var8.p()) {
            var6 = var8.n(var7, 0, x0.a, null) as java.lang.Long;
            var5 = var8.C(var7, 1);
            var10 = var8.y(var7, 2, var9[2], null) as java.util.List;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var10 = null;
            var5 = false;

            while (var3) {
               val var4: Int = var8.o(var7);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var10 = var8.y(var7, 2, var9[2], var10) as java.util.List;
                        var2 |= 4;
                     } else {
                        var5 = var8.C(var7, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var8.n(var7, 0, x0.a, var6) as java.lang.Long;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var8.c(var7);
         return new BulletListContentNode(var2, var6, var5, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: BulletListContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BulletListContentNode.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BulletListContentNode> {
         return BulletListContentNode.$serializer.INSTANCE;
      }
   }
}
