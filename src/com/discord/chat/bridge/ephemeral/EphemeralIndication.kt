package com.discord.chat.bridge.ephemeral

import com.discord.chat.bridge.structurabletext.StructurableText
import kotlinx.serialization.KSerializer
import xu.m

@m
public data class EphemeralIndication(content: StructurableText, helpArticleLink: String, helpButtonAccessibilityLabel: String) {
   public final val content: StructurableText
   public final val helpArticleLink: String
   public final val helpButtonAccessibilityLabel: String

   init {
      super();
      this.content = var1;
      this.helpArticleLink = var2;
      this.helpButtonAccessibilityLabel = var3;
   }

   public operator fun component1(): StructurableText {
      return this.content;
   }

   public operator fun component2(): String {
      return this.helpArticleLink;
   }

   public operator fun component3(): String {
      return this.helpButtonAccessibilityLabel;
   }

   public fun copy(
      content: StructurableText = var0.content,
      helpArticleLink: String = var0.helpArticleLink,
      helpButtonAccessibilityLabel: String = var0.helpButtonAccessibilityLabel
   ): EphemeralIndication {
      return new EphemeralIndication(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EphemeralIndication) {
         return false;
      } else {
         var1 = var1;
         if (!(this.content == var1.content)) {
            return false;
         } else if (!(this.helpArticleLink == var1.helpArticleLink)) {
            return false;
         } else {
            return this.helpButtonAccessibilityLabel == var1.helpButtonAccessibilityLabel;
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.content.hashCode() * 31 + this.helpArticleLink.hashCode()) * 31 + this.helpButtonAccessibilityLabel.hashCode();
   }

   public override fun toString(): String {
      val var3: StructurableText = this.content;
      val var1: java.lang.String = this.helpArticleLink;
      val var2: java.lang.String = this.helpButtonAccessibilityLabel;
      val var4: StringBuilder = new StringBuilder();
      var4.append("EphemeralIndication(content=");
      var4.append(var3);
      var4.append(", helpArticleLink=");
      var4.append(var1);
      var4.append(", helpButtonAccessibilityLabel=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EphemeralIndication> {
         return EphemeralIndication.$serializer.INSTANCE;
      }
   }
}
