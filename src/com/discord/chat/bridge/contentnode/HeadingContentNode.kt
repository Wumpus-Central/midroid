package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class HeadingContentNode(level: Int, content: List<ContentNode>) : ContentNode {
   public final val level: Int
   public final val content: List<ContentNode>

   init {
      r.h(var2, "content");
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
      r.h(var2, "content");
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
            return r.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.level) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.level;
      val var2: java.util.List = this.content;
      val var3: StringBuilder = new StringBuilder();
      var3.append("HeadingContentNode(level=");
      var3.append(var1);
      var3.append(", content=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<HeadingContentNode> {
         return HeadingContentNode.$serializer.INSTANCE;
      }
   }
}
