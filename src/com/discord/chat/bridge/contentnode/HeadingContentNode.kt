package com.discord.chat.bridge.contentnode

import Ja.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class HeadingContentNode(level: Int, content: List<ContentNode>) : ContentNode {
   public final val level: Int
   public final val content: List<ContentNode>

   init {
      q.h(var2, "content");
      super(null);
      this.level = var1;
      this.content = var2;
   }

   public operator fun component1(): Int {
      return this.level;
   }

   public operator fun component2(): List<ContentNode> {
      return this.content;
   }

   public fun copy(level: Int = var0.level, content: List<ContentNode> = var0.content): HeadingContentNode {
      q.h(var2, "content");
      return new HeadingContentNode(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is HeadingContentNode) {
         return false;
      } else {
         var1 = var1;
         if (this.level != var1.level) {
            return false;
         } else {
            return q.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.level) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.level;
      val var3: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("HeadingContentNode(level=");
      var2.append(var1);
      var2.append(", content=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<HeadingContentNode> {
         return HeadingContentNode.$serializer.INSTANCE;
      }
   }
}
