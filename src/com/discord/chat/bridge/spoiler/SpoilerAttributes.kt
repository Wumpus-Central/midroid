package com.discord.chat.bridge.spoiler

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.embed.Embed
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

public data class SpoilerAttributes(identifier: SpoilerIdentifier, label: String, type: SpoilerType) : SpoilerAttributes(var1, var2, var3) {
   public final val identifier: SpoilerIdentifier
   public final val label: String
   public final val type: SpoilerType

   fun SpoilerAttributes(var1: java.lang.String, var2: java.lang.String, var3: SpoilerType) {
      this.identifier = var1;
      this.label = var2;
      this.type = var3;
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

   public fun configure(onTapSpoiler: () -> Unit = <unrepresentable>.INSTANCE): SpoilerConfig? {
      r.h(var1, "onTapSpoiler");
      val var2: Boolean = this.hasSpoilerConfig();
      var var4: SpoilerConfig = null;
      val var3: SpoilerAttributes;
      if (var2) {
         var3 = this;
      } else {
         var3 = null;
      }

      if (var3 != null) {
         var4 = new SpoilerConfig(var3, new Function1<SpoilerIdentifier, Unit>(var1) {
            final Function0<Unit> $onTapSpoiler;

            {
               super(1);
               this.$onTapSpoiler = var1;
            }

            public final void invoke_V2PEE7g/* $VF was: invoke-V2PEE7g*/(java.lang.String var1) {
               r.h(var1, "spoilerId");
               SpoilerManager.INSTANCE.markRevealed-V2PEE7g(var1);
               this.$onTapSpoiler.invoke();
            }
         }, new Function1<SpoilerIdentifier, Unit>(var1) {
            final Function0<Unit> $onTapSpoiler;

            {
               super(1);
               this.$onTapSpoiler = var1;
            }

            public final void invoke_V2PEE7g/* $VF was: invoke-V2PEE7g*/(java.lang.String var1) {
               r.h(var1, "spoilerId");
               SpoilerManager.INSTANCE.markHidden-V2PEE7g(var1);
               this.$onTapSpoiler.invoke();
            }
         });
      }

      return var4;
   }

   public fun copy(identifier: SpoilerIdentifier = ..., label: String = ..., type: SpoilerType = ...): SpoilerAttributes {
      r.h(var1, "identifier");
      r.h(var2, "label");
      r.h(var3, "type");
      return new SpoilerAttributes(var1, var2, var3, null);
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
         } else if (!r.c(this.label, var1.label)) {
            return false;
         } else {
            return this.type === var1.type;
         }
      }
   }

   public override fun hashCode(): Int {
      return (SpoilerIdentifier.hashCode-impl(this.identifier) * 31 + this.label.hashCode()) * 31 + this.type.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = SpoilerIdentifier.toString-impl(this.identifier);
      val var2: java.lang.String = this.label;
      val var1: SpoilerType = this.type;
      val var3: StringBuilder = new StringBuilder();
      var3.append("SpoilerAttributes(identifier=");
      var3.append(var4);
      var3.append(", label=");
      var3.append(var2);
      var3.append(", type=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      private fun forItem(spoilerableData: SpoilerableData, containerId: String, key: String): SpoilerAttributes? {
         var var5: java.lang.String = var1.getObscureOrNull();
         var var7: SpoilerAttributes;
         if (var5 != null) {
            val var6: StringBuilder = new StringBuilder();
            var6.append("obscure:containerId(");
            var6.append(var2);
            var6.append("):");
            var6.append(var3);
            var7 = new SpoilerAttributes(SpoilerIdentifier.constructor-impl(var6.toString()), var5, SpoilerType.OBSCURE, null);
         } else {
            var5 = var1.getSpoilerOrNull();
            var7 = null;
            if (var5 != null) {
               val var8: StringBuilder = new StringBuilder();
               var8.append("spoiler:containerId(");
               var8.append(var2);
               var8.append("):");
               var8.append(var3);
               var7 = new SpoilerAttributes(SpoilerIdentifier.constructor-impl(var8.toString()), var5, SpoilerType.SPOILER, null);
            }
         }

         return var7;
      }

      public fun forAttachment(attachment: Attachment, message: Message, index: Int): SpoilerAttributes? {
         r.h(var1, "attachment");
         r.h(var2, "message");
         val var6: java.lang.String = MessageId.toString-impl(var2.getId-3Eiw7ao());
         val var4: StringBuilder = new StringBuilder();
         var4.append("messageId(");
         var4.append(var6);
         var4.append(")");
         val var7: java.lang.String = var4.toString();
         val var8: java.lang.String = var1.type().getIndexLabel();
         val var5: StringBuilder = new StringBuilder();
         var5.append(var8);
         var5.append("(");
         var5.append(var3);
         var5.append(")");
         return this.forItem(var1, var7, var5.toString());
      }

      public fun forEmbed(embed: Embed, message: Message, index: Int): SpoilerAttributes? {
         r.h(var1, "embed");
         r.h(var2, "message");
         val var4: java.lang.String = MessageId.toString-impl(var2.getId-3Eiw7ao());
         val var5: StringBuilder = new StringBuilder();
         var5.append("messageId(");
         var5.append(var4);
         var5.append(")");
         val var6: java.lang.String = var5.toString();
         val var7: StringBuilder = new StringBuilder();
         var7.append("embedIndex(");
         var7.append(var3);
         var7.append(")");
         return this.forItem(var1, var6, var7.toString());
      }

      public fun forGenericMedia(spoilerableData: SpoilerableData, containerId: String, itemType: String, itemKey: String): SpoilerAttributes? {
         r.h(var1, "spoilerableData");
         r.h(var2, "containerId");
         r.h(var3, "itemType");
         r.h(var4, "itemKey");
         val var5: StringBuilder = new StringBuilder();
         var5.append(var3);
         var5.append("(");
         var5.append(var4);
         var5.append(")");
         return this.forItem(var1, var2, var5.toString());
      }

      public fun forMediaPostPreviewEmbed(embed: PostPreviewEmbed, message: Message, index: Int): SpoilerAttributes? {
         r.h(var1, "embed");
         r.h(var2, "message");
         val var4: java.lang.String = MessageId.toString-impl(var2.getId-3Eiw7ao());
         val var5: StringBuilder = new StringBuilder();
         var5.append("messageId(");
         var5.append(var4);
         var5.append(")");
         val var6: java.lang.String = var5.toString();
         val var7: StringBuilder = new StringBuilder();
         var7.append("mediaPostPreviewEmbed(");
         var7.append(var3);
         var7.append(")");
         return this.forItem(var1, var6, var7.toString());
      }
   }
}
