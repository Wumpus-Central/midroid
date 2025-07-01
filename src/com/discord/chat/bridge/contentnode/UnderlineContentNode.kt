package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import tb.f

@f
public data class UnderlineContentNode(content: List<ContentNode>) : ContentNode {
   public final val content: List<ContentNode>

   init {
      q.h(var1, "content");
      super(null);
      this.content = var1;
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public fun copy(content: List<ContentNode> = var0.content): UnderlineContentNode {
      q.h(var1, "content");
      return new UnderlineContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnderlineContentNode) {
         return false;
      } else {
         return q.c(this.content, (var1 as UnderlineContentNode).content);
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("UnderlineContentNode(content=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UnderlineContentNode> {
         return UnderlineContentNode.$serializer.INSTANCE;
      }
   }
}
