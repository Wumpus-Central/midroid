package com.discord.chat.bridge.contentnode

import kc.m
import kotlinx.serialization.KSerializer

@m
public data class ParagraphContentNode(content: List<ContentNode>) : ContentNode() {
   public final val content: List<ContentNode>

   init {
      this.content = var1;
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public fun copy(content: List<ContentNode> = var0.content): ParagraphContentNode {
      return new ParagraphContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ParagraphContentNode) {
         return false;
      } else {
         return this.content == (var1 as ParagraphContentNode).content;
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ParagraphContentNode(content=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ParagraphContentNode> {
         return ParagraphContentNode.$serializer.INSTANCE;
      }
   }
}
