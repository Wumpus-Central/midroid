package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class StrikethroughContentNode(content: List<ContentNode>) : ContentNode {
   public final val content: List<ContentNode>

   init {
      q.h(var1, "content");
      super(null);
      this.content = var1;
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public fun copy(content: List<ContentNode> = var0.content): StrikethroughContentNode {
      q.h(var1, "content");
      return new StrikethroughContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StrikethroughContentNode) {
         return false;
      } else {
         return q.c(this.content, (var1 as StrikethroughContentNode).content);
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var2: java.util.List = this.content;
      val var1: StringBuilder = new StringBuilder();
      var1.append("StrikethroughContentNode(content=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<StrikethroughContentNode> {
         return StrikethroughContentNode.$serializer.INSTANCE;
      }
   }
}
