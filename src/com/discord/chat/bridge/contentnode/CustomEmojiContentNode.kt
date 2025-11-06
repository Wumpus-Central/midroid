package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class CustomEmojiContentNode(id: Long, alt: String, src: String, frozenSrc: String, jumboable: Boolean = false) : EmojiContentNode() {
   public final val id: Long
   public final val alt: String
   public final val src: String
   public final val frozenSrc: String
   public open val jumboable: Boolean

   init {
      this.id = var1;
      this.alt = var3;
      this.src = var4;
      this.frozenSrc = var5;
      this.jumboable = var6;
   }

   public operator fun component1(): Long {
      return this.id;
   }

   public operator fun component2(): String {
      return this.alt;
   }

   public operator fun component3(): String {
      return this.src;
   }

   public operator fun component4(): String {
      return this.frozenSrc;
   }

   public operator fun component5(): Boolean {
      return this.jumboable;
   }

   public fun copy(id: Long = var0.id, alt: String = var0.alt, src: String = var0.src, frozenSrc: String = var0.frozenSrc, jumboable: Boolean = var0.jumboable): CustomEmojiContentNode {
      return new CustomEmojiContentNode(var1, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CustomEmojiContentNode) {
         return false;
      } else {
         var1 = var1;
         if (this.id != var1.id) {
            return false;
         } else if (!(this.alt == var1.alt)) {
            return false;
         } else if (!(this.src == var1.src)) {
            return false;
         } else if (!(this.frozenSrc == var1.frozenSrc)) {
            return false;
         } else {
            return this.jumboable == var1.jumboable;
         }
      }
   }

   public override fun hashCode(): Int {
      return (((java.lang.Long.hashCode(this.id) * 31 + this.alt.hashCode()) * 31 + this.src.hashCode()) * 31 + this.frozenSrc.hashCode()) * 31
         + java.lang.Boolean.hashCode(this.jumboable);
   }

   public override fun toString(): String {
      val var1: Long = this.id;
      val var6: java.lang.String = this.alt;
      val var4: java.lang.String = this.src;
      val var7: java.lang.String = this.frozenSrc;
      val var3: Boolean = this.jumboable;
      val var5: StringBuilder = new StringBuilder();
      var5.append("CustomEmojiContentNode(id=");
      var5.append(var1);
      var5.append(", alt=");
      var5.append(var6);
      var5.append(", src=");
      var5.append(var4);
      var5.append(", frozenSrc=");
      var5.append(var7);
      var5.append(", jumboable=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CustomEmojiContentNode> {
         return CustomEmojiContentNode.$serializer.INSTANCE;
      }
   }
}
