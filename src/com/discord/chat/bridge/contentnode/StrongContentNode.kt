package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import tp.m

@m
public data class StrongContentNode(content: List<ContentNode>) : ContentNode() {
   public final val content: List<ContentNode>

   init {
      this.content = var1;
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public fun copy(content: List<ContentNode> = var0.content): StrongContentNode {
      return new StrongContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StrongContentNode) {
         return false;
      } else {
         return this.content == (var1 as StrongContentNode).content;
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("StrongContentNode(content=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<StrongContentNode> {
         return StrongContentNode.$serializer.INSTANCE;
      }
   }
}
