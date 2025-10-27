package com.discord.chat.bridge.contentnode

import kc.m
import kotlinx.serialization.KSerializer

@m
public data class EmphasisContentNode(content: List<ContentNode>) : ContentNode() {
   public final val content: List<ContentNode>

   init {
      this.content = var1;
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public fun copy(content: List<ContentNode> = var0.content): EmphasisContentNode {
      return new EmphasisContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmphasisContentNode) {
         return false;
      } else {
         return this.content == (var1 as EmphasisContentNode).content;
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var2: java.util.List = this.content;
      val var1: StringBuilder = new StringBuilder();
      var1.append("EmphasisContentNode(content=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmphasisContentNode> {
         return EmphasisContentNode.$serializer.INSTANCE;
      }
   }
}
