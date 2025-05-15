package com.discord.chat.bridge.spoiler

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.embed.Embed
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public data class SpoilerAttributes(identifier: SpoilerIdentifier, label: String, type: SpoilerType, verifyAge: Boolean?) : SpoilerAttributes(
      var1, var2, var3, var4
   ) {
   public final val identifier: SpoilerIdentifier
   public final val label: String
   public final val type: SpoilerType
   public final val verifyAge: Boolean?

   fun SpoilerAttributes(var1: java.lang.String, var2: java.lang.String, var3: SpoilerType, var4: java.lang.Boolean) {
      q.h(var1, "identifier");
      q.h(var2, "label");
      q.h(var3, "type");
      super();
      this.identifier = var1;
      this.label = var2;
      this.type = var3;
      this.verifyAge = var4;
   }

   private fun hasSpoilerConfig(): Boolean {
      val var1: Boolean;
      if (!SpoilerManager.INSTANCE.isNotRevealed-V2PEE7g(this.identifier) && this.type != SpoilerType.OBSCURE) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public operator fun component1(): SpoilerIdentifier {
      return this.identifier;
   }

   public operator fun component2(): String {
      return this.label;
   }

   public operator fun component3(): SpoilerType {
      return this.type;
   }

   public operator fun component4(): Boolean? {
      return this.verifyAge;
   }

   public fun configure(onTapSpoiler: () -> Unit = <unrepresentable>.INSTANCE, onTapObscureToggle: (Boolean) -> Unit = <unrepresentable>.INSTANCE): SpoilerConfig? {
      q.h(var1, "onTapSpoiler");
      q.h(var2, "onTapObscureToggle");
      val var3: Boolean = this.hasSpoilerConfig();
      var var5: SpoilerConfig = null;
      val var4: SpoilerAttributes;
      if (var3) {
         var4 = this;
      } else {
         var4 = null;
      }

      if (var4 != null) {
         var5 = new SpoilerConfig(var4, var2, new Function1(var1) {
            final Function0 $onTapSpoiler;

            {
               super(1);
               this.$onTapSpoiler = var1;
            }

            public final void invoke_V2PEE7g/* $VF was: invoke-V2PEE7g*/(java.lang.String var1) {
               q.h(var1, "spoilerId");
               SpoilerManager.INSTANCE.markRevealed-V2PEE7g(var1);
               this.$onTapSpoiler.invoke();
            }
         }, new Function1(var1) {
            final Function0 $onTapSpoiler;

            {
               super(1);
               this.$onTapSpoiler = var1;
            }

            public final void invoke_V2PEE7g/* $VF was: invoke-V2PEE7g*/(java.lang.String var1) {
               q.h(var1, "spoilerId");
               SpoilerManager.INSTANCE.markHidden-V2PEE7g(var1);
               this.$onTapSpoiler.invoke();
            }
         });
      }

      return var5;
   }

   public fun copy(identifier: SpoilerIdentifier = ..., label: String = ..., type: SpoilerType = ..., verifyAge: Boolean? = ...): SpoilerAttributes {
      q.h(var1, "identifier");
      q.h(var2, "label");
      q.h(var3, "type");
      return new SpoilerAttributes(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SpoilerAttributes) {
         return false;
      } else {
         var1 = var1;
         if (!SpoilerIdentifier.equals-impl0(this.identifier, var1.identifier)) {
            return false;
         } else if (!q.c(this.label, var1.label)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else {
            return q.c(this.verifyAge, var1.verifyAge);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = SpoilerIdentifier.hashCode-impl(this.identifier);
      val var4: Int = this.label.hashCode();
      val var2: Int = this.type.hashCode();
      val var1: Int;
      if (this.verifyAge == null) {
         var1 = 0;
      } else {
         var1 = this.verifyAge.hashCode();
      }

      return ((var3 * 31 + var4) * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: java.lang.String = SpoilerIdentifier.toString-impl(this.identifier);
      val var2: java.lang.String = this.label;
      val var4: SpoilerType = this.type;
      val var3: java.lang.Boolean = this.verifyAge;
      val var5: StringBuilder = new StringBuilder();
      var5.append("SpoilerAttributes(identifier=");
      var5.append(var1);
      var5.append(", label=");
      var5.append(var2);
      var5.append(", type=");
      var5.append(var4);
      var5.append(", verifyAge=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      private fun forItem(spoilerableData: SpoilerableData, containerId: String, key: String, verifyAge: Boolean?): SpoilerAttributes? {
         val var5: java.lang.String = var1.getObscureOrNull();
         val var7: SpoilerAttributes;
         if (var5 != null) {
            val var6: StringBuilder = new StringBuilder();
            var6.append("obscure:containerId(");
            var6.append(var2);
            var6.append("):");
            var6.append(var3);
            var7 = new SpoilerAttributes(SpoilerIdentifier.constructor-impl(var6.toString()), var5, SpoilerType.OBSCURE, var4, null);
         } else {
            val var8: java.lang.String = var1.getSpoilerOrNull();
            if (var8 != null) {
               val var9: StringBuilder = new StringBuilder();
               var9.append("spoiler:containerId(");
               var9.append(var2);
               var9.append("):");
               var9.append(var3);
               var7 = new SpoilerAttributes(SpoilerIdentifier.constructor-impl(var9.toString()), var8, SpoilerType.SPOILER, var4, null);
            } else {
               var7 = null;
            }
         }

         return var7;
      }

      public fun forAttachment(attachment: Attachment, message: Message, index: Int, verifyAge: Boolean?): SpoilerAttributes? {
         q.h(var1, "attachment");
         q.h(var2, "message");
         val var7: java.lang.String = MessageId.toString-impl(var2.getId-3Eiw7ao());
         val var5: StringBuilder = new StringBuilder();
         var5.append("messageId(");
         var5.append(var7);
         var5.append(")");
         val var6: java.lang.String = var5.toString();
         val var9: java.lang.String = var1.type().getIndexLabel();
         val var8: StringBuilder = new StringBuilder();
         var8.append(var9);
         var8.append("(");
         var8.append(var3);
         var8.append(")");
         return this.forItem(var1, var6, var8.toString(), var4);
      }

      public fun forEmbed(embed: Embed, message: Message, index: Int, verifyAge: Boolean?): SpoilerAttributes? {
         q.h(var1, "embed");
         q.h(var2, "message");
         val var6: java.lang.String = MessageId.toString-impl(var2.getId-3Eiw7ao());
         val var5: StringBuilder = new StringBuilder();
         var5.append("messageId(");
         var5.append(var6);
         var5.append(")");
         val var8: java.lang.String = var5.toString();
         val var7: StringBuilder = new StringBuilder();
         var7.append("embedIndex(");
         var7.append(var3);
         var7.append(")");
         return this.forItem(var1, var8, var7.toString(), var4);
      }

      public fun forGenericMedia(spoilerableData: SpoilerableData, containerId: String, itemType: String, itemKey: String, verifyAge: Boolean?): SpoilerAttributes? {
         q.h(var1, "spoilerableData");
         q.h(var2, "containerId");
         q.h(var3, "itemType");
         q.h(var4, "itemKey");
         val var6: StringBuilder = new StringBuilder();
         var6.append(var3);
         var6.append("(");
         var6.append(var4);
         var6.append(")");
         return this.forItem(var1, var2, var6.toString(), var5);
      }

      public fun forMediaPostPreviewEmbed(embed: PostPreviewEmbed, message: Message, index: Int, verifyAge: Boolean?): SpoilerAttributes? {
         q.h(var1, "embed");
         q.h(var2, "message");
         val var5: java.lang.String = MessageId.toString-impl(var2.getId-3Eiw7ao());
         val var6: StringBuilder = new StringBuilder();
         var6.append("messageId(");
         var6.append(var5);
         var6.append(")");
         val var7: java.lang.String = var6.toString();
         val var8: StringBuilder = new StringBuilder();
         var8.append("mediaPostPreviewEmbed(");
         var8.append(var3);
         var8.append(")");
         return this.forItem(var1, var7, var8.toString(), var4);
      }
   }
}
