package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.spoiler.SpoilerableData
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class SpoilerContentNode(content: List<ContentNode>) : ContentNode(), SpoilerableData {
   public final val content: List<ContentNode>
   public open val spoilerOrNull: String
   public open val obscureOrNull: String

   init {
      this.content = var1;
      this.spoilerOrNull = "";
      this.obscureOrNull = "";
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public fun copy(content: List<ContentNode> = var0.content): SpoilerContentNode {
      return new SpoilerContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SpoilerContentNode) {
         return false;
      } else {
         return this.content == (var1 as SpoilerContentNode).content;
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SpoilerContentNode(content=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SpoilerContentNode> {
         return SpoilerContentNode.$serializer.INSTANCE;
      }
   }
}
