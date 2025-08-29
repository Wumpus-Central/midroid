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
      val var2: java.lang.String = this.content;
      val var1: StringBuilder = new StringBuilder();
      var1.append("InlineCodeContentNode(content=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<InlineCodeContentNode> {
         return InlineCodeContentNode.$serializer.INSTANCE;
      }
   }
}
