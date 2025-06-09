package com.discord.chat.bridge.contentnode

import Ka.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class BulletListContentNode(start: Long? = null, ordered: Boolean = false, items: List<List<ContentNode>>) : ContentNode {
   public final val start: Long?
   public final val ordered: Boolean
   public final val items: List<List<ContentNode>>

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

   public companion object {
      public fun serializer(): KSerializer<BulletListContentNode> {
         return BulletListContentNode.$serializer.INSTANCE;
      }
   }
}
