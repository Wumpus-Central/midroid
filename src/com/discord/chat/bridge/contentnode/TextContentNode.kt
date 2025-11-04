package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class TextContentNode(content: String? = null) : ContentNode() {
   public final val content: String?

   fun TextContentNode() {
      this(null, 1, null);
   }

   init {
      this.content = var1;
   }

   public operator fun component1(): String? {
      return this.content;
   }

   public fun copy(content: String? = var0.content): TextContentNode {
      return new TextContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TextContentNode) {
         return false;
      } else {
         return this.content == (var1 as TextContentNode).content;
      }
   }

   public override fun hashCode(): Int {
      return if (this.content == null) 0 else this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TextContentNode(content=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TextContentNode> {
         return TextContentNode.$serializer.INSTANCE;
      }
   }
}
