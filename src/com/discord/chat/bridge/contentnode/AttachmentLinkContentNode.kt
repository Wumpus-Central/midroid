package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import mb.g

@g
public data class AttachmentLinkContentNode(attachmentUrl: String, attachmentName: String, content: List<ContentNode>?) : MentionContentNode() {
   public final val attachmentUrl: String
   public final val attachmentName: String
   public open val content: List<ContentNode>?

   init {
      this.attachmentUrl = var1;
      this.attachmentName = var2;
      this.content = var3;
   }

   public operator fun component1(): String {
      return this.attachmentUrl;
   }

   public operator fun component2(): String {
      return this.attachmentName;
   }

   public operator fun component3(): List<ContentNode>? {
      return this.content;
   }

   public fun copy(attachmentUrl: String = var0.attachmentUrl, attachmentName: String = var0.attachmentName, content: List<ContentNode>? = var0.content): AttachmentLinkContentNode {
      return new AttachmentLinkContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AttachmentLinkContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!(this.attachmentUrl == var1.attachmentUrl)) {
            return false;
         } else if (!(this.attachmentName == var1.attachmentName)) {
            return false;
         } else {
            return this.content == var1.content;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.attachmentUrl.hashCode();
      val var2: Int = this.attachmentName.hashCode();
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.attachmentUrl;
      val var1: java.lang.String = this.attachmentName;
      val var3: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("AttachmentLinkContentNode(attachmentUrl=");
      var2.append(var4);
      var2.append(", attachmentName=");
      var2.append(var1);
      var2.append(", content=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AttachmentLinkContentNode> {
         return AttachmentLinkContentNode.$serializer.INSTANCE;
      }
   }
}
