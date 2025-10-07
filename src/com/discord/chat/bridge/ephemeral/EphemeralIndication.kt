package com.discord.chat.bridge.ephemeral

import com.discord.chat.bridge.structurabletext.StructurableText
import kotlinx.serialization.KSerializer
import nb.g

@g
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
      val var1: StructurableText = this.content;
      val var2: java.lang.String = this.helpArticleLink;
      val var4: java.lang.String = this.helpButtonAccessibilityLabel;
      val var3: StringBuilder = new StringBuilder();
      var3.append("EphemeralIndication(content=");
      var3.append(var1);
      var3.append(", helpArticleLink=");
      var3.append(var2);
      var3.append(", helpButtonAccessibilityLabel=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EphemeralIndication> {
         return EphemeralIndication.$serializer.INSTANCE;
      }
   }
}
