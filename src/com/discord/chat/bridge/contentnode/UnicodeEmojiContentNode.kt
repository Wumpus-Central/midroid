package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import mb.g

@g
public data class UnicodeEmojiContentNode(content: String, surrogate: String, jumboable: Boolean = false) : EmojiContentNode() {
   public final val content: String
   public final val surrogate: String
   public open val jumboable: Boolean

   init {
      this.content = var1;
      this.surrogate = var2;
      this.jumboable = var3;
   }

   public operator fun component1(): String {
      return this.content;
   }

   public operator fun component2(): String {
      return this.surrogate;
   }

   public operator fun component3(): Boolean {
      return this.jumboable;
   }

   public fun copy(content: String = var0.content, surrogate: String = var0.surrogate, jumboable: Boolean = var0.jumboable): UnicodeEmojiContentNode {
      return new UnicodeEmojiContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnicodeEmojiContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!(this.content == var1.content)) {
            return false;
         } else if (!(this.surrogate == var1.surrogate)) {
            return false;
         } else {
            return this.jumboable == var1.jumboable;
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.content.hashCode() * 31 + this.surrogate.hashCode()) * 31 + java.lang.Boolean.hashCode(this.jumboable);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.content;
      val var3: java.lang.String = this.surrogate;
      val var1: Boolean = this.jumboable;
      val var2: StringBuilder = new StringBuilder();
      var2.append("UnicodeEmojiContentNode(content=");
      var2.append(var4);
      var2.append(", surrogate=");
      var2.append(var3);
      var2.append(", jumboable=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UnicodeEmojiContentNode> {
         return UnicodeEmojiContentNode.$serializer.INSTANCE;
      }
   }
}
