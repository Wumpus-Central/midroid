package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class PostPreviewEmbedMessageAccessory(messageId: MessageId,
   postPreviewEmbed: PostPreviewEmbed,
   index: Int,
   spoilerAttributes: SpoilerAttributes? = ...
) : PostPreviewEmbedMessageAccessory(var1, var2, var3, var4) {
   public final val index: Int
   public open val messageId: MessageId
   public final val postPreviewEmbed: PostPreviewEmbed
   public final val spoilerAttributes: SpoilerAttributes?

   fun PostPreviewEmbedMessageAccessory(var1: java.lang.String, var2: PostPreviewEmbed, var3: Int, var4: SpoilerAttributes) {
      q.h(var1, "messageId");
      q.h(var2, "postPreviewEmbed");
      val var5: StringBuilder = new StringBuilder();
      var5.append("post preview embed ");
      var5.append(var3);
      super(var1, var5.toString(), false, 4, null);
      this.messageId = var1;
      this.postPreviewEmbed = var2;
      this.index = var3;
      this.spoilerAttributes = var4;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): PostPreviewEmbed {
      return this.postPreviewEmbed;
   }

   public operator fun component3(): Int {
      return this.index;
   }

   public operator fun component4(): SpoilerAttributes? {
      return this.spoilerAttributes;
   }

   public fun copy(messageId: MessageId = ..., postPreviewEmbed: PostPreviewEmbed = ..., index: Int = ..., spoilerAttributes: SpoilerAttributes? = ...): PostPreviewEmbedMessageAccessory {
      q.h(var1, "messageId");
      q.h(var2, "postPreviewEmbed");
      return new PostPreviewEmbedMessageAccessory(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PostPreviewEmbedMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.postPreviewEmbed, var1.postPreviewEmbed)) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else {
            return q.c(this.spoilerAttributes, var1.spoilerAttributes);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = MessageId.hashCode-impl(this.messageId);
      val var3: Int = this.postPreviewEmbed.hashCode();
      val var4: Int = Integer.hashCode(this.index);
      val var1: Int;
      if (this.spoilerAttributes == null) {
         var1 = 0;
      } else {
         var1 = this.spoilerAttributes.hashCode();
      }

      return ((var2 * 31 + var3) * 31 + var4) * 31 + var1;
   }

   public override fun toString(): String {
      val var5: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: PostPreviewEmbed = this.postPreviewEmbed;
      val var1: Int = this.index;
      val var4: SpoilerAttributes = this.spoilerAttributes;
      val var2: StringBuilder = new StringBuilder();
      var2.append("PostPreviewEmbedMessageAccessory(messageId=");
      var2.append(var5);
      var2.append(", postPreviewEmbed=");
      var2.append(var3);
      var2.append(", index=");
      var2.append(var1);
      var2.append(", spoilerAttributes=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }
}
