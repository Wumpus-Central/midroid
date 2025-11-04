package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class LHeadingContentNode(level: Int, className: String, content: List<ContentNode>) : ContentNode() {
   public final val level: Int
   public final val className: String
   public final val content: List<ContentNode>

   init {
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
         } else if (!(this.className == var1.className)) {
            return false;
         } else {
            return this.content == var1.content;
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.level) * 31 + this.className.hashCode()) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.level;
      val var2: java.lang.String = this.className;
      val var3: java.util.List = this.content;
      val var4: StringBuilder = new StringBuilder();
      var4.append("LHeadingContentNode(level=");
      var4.append(var1);
      var4.append(", className=");
      var4.append(var2);
      var4.append(", content=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LHeadingContentNode> {
         return LHeadingContentNode.$serializer.INSTANCE;
      }
   }
}
