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
      val var4: java.lang.String = this.className;
      val var2: java.util.List = this.content;
      val var3: StringBuilder = new StringBuilder();
      var3.append("LHeadingContentNode(level=");
      var3.append(var1);
      var3.append(", className=");
      var3.append(var4);
      var3.append(", content=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LHeadingContentNode> {
         return LHeadingContentNode.$serializer.INSTANCE;
      }
   }
}
