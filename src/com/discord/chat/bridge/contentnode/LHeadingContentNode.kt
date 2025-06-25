package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class LHeadingContentNode(level: Int, className: String, content: List<ContentNode>) : ContentNode {
   public final val level: Int
   public final val className: String
   public final val content: List<ContentNode>

   init {
      q.h(var2, "className");
      q.h(var3, "content");
      super(null);
      this.level = var1;
      this.className = var2;
      this.content = var3;
   }

   public operator fun component1(): Int {
      return this.level;
   }

   public operator fun component2(): String {
      return this.className;
   }

   public operator fun component3(): List<ContentNode> {
      return this.content;
   }

   public fun copy(level: Int = var0.level, className: String = var0.className, content: List<ContentNode> = var0.content): LHeadingContentNode {
      q.h(var2, "className");
      q.h(var3, "content");
      return new LHeadingContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LHeadingContentNode) {
         return false;
      } else {
         var1 = var1;
         if (this.level != var1.level) {
            return false;
         } else if (!q.c(this.className, var1.className)) {
            return false;
         } else {
            return q.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.level) * 31 + this.className.hashCode()) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.level;
      val var3: java.lang.String = this.className;
      val var4: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LHeadingContentNode(level=");
      var2.append(var1);
      var2.append(", className=");
      var2.append(var3);
      var2.append(", content=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LHeadingContentNode> {
         return LHeadingContentNode.$serializer.INSTANCE;
      }
   }
}
