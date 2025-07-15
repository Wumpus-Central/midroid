package com.discord.chat.bridge.spoiler

import com.discord.chat.bridge.contentnode.SpoilerContentNode
import kotlin.jvm.internal.r

public inline class SpoilerIdentifier {
   public final val id: String

   @JvmStatic
   fun `constructor-impl`(var0: java.lang.String): java.lang.String {
      r.h(var0, "id");
      return var0;
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      if (var1 !is SpoilerIdentifier) {
         return false;
      } else {
         return r.c(var0, (var1 as SpoilerIdentifier).unbox-impl());
      }
   }

   @JvmStatic
   fun `equals-impl0`(var0: java.lang.String, var1: java.lang.String): Boolean {
      return r.c(var0, var1);
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return var0.hashCode();
   }

   @JvmStatic
   public open fun toString(): String {
      val var1: StringBuilder = new StringBuilder();
      var1.append("SpoilerIdentifier(id=");
      var1.append(var0);
      var1.append(")");
      return var1.toString();
   }

   override fun equals(var1: Any): Boolean {
      return equals-impl(this.id, var1);
   }

   override fun hashCode(): Int {
      return hashCode-impl(this.id);
   }

   override fun toString(): java.lang.String {
      return toString-impl(this.id);
   }

   public companion object {
      public fun forNode(node: SpoilerContentNode, containerId: String, index: Int): SpoilerIdentifier {
         r.h(var1, "node");
         r.h(var2, "containerId");
         val var4: Int = var1.hashCode();
         val var5: StringBuilder = new StringBuilder();
         var5.append("spoiler:");
         var5.append(var4);
         var5.append(":");
         var5.append(var2);
         var5.append(":");
         var5.append(var3);
         return SpoilerIdentifier.constructor-impl(var5.toString());
      }
   }
}
