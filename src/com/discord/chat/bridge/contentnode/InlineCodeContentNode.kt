package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class InlineCodeContentNode(content: String) : ContentNode() {
   public final val content: String

   init {
      this.content = var1;
   }

   public operator fun component1(): String {
      return this.content;
   }

   public fun copy(content: String = var0.content): InlineCodeContentNode {
      return new InlineCodeContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InlineCodeContentNode) {
         return false;
      } else {
         return this.content == (var1 as InlineCodeContentNode).content;
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("InlineCodeContentNode(content=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<InlineCodeContentNode> {
         return InlineCodeContentNode.$serializer.INSTANCE;
      }
   }
}
