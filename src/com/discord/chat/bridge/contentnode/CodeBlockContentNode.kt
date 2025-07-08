package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class CodeBlockContentNode(lang: String, content: String, inQuote: Boolean) : ContentNode {
   public final val lang: String
   public final val content: String
   public final val inQuote: Boolean

   init {
      r.h(var1, "lang");
      r.h(var2, "content");
      super(null);
      this.lang = var1;
      this.content = var2;
      this.inQuote = var3;
   }

   public operator fun component1(): String {
      return this.lang;
   }

   public operator fun component2(): String {
      return this.content;
   }

   public operator fun component3(): Boolean {
      return this.inQuote;
   }

   public fun copy(lang: String = var0.lang, content: String = var0.content, inQuote: Boolean = var0.inQuote): CodeBlockContentNode {
      r.h(var1, "lang");
      r.h(var2, "content");
      return new CodeBlockContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CodeBlockContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.lang, var1.lang)) {
            return false;
         } else if (!r.c(this.content, var1.content)) {
            return false;
         } else {
            return this.inQuote == var1.inQuote;
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.lang.hashCode() * 31 + this.content.hashCode()) * 31 + java.lang.Boolean.hashCode(this.inQuote);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.lang;
      val var2: java.lang.String = this.content;
      val var1: Boolean = this.inQuote;
      val var4: StringBuilder = new StringBuilder();
      var4.append("CodeBlockContentNode(lang=");
      var4.append(var3);
      var4.append(", content=");
      var4.append(var2);
      var4.append(", inQuote=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CodeBlockContentNode> {
         return CodeBlockContentNode.$serializer.INSTANCE;
      }
   }
}
