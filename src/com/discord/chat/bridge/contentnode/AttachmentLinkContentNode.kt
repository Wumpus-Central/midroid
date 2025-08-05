package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class AttachmentLinkContentNode(attachmentUrl: String, attachmentName: String, content: List<ContentNode>?) : MentionContentNode {
   public final val attachmentUrl: String
   public final val attachmentName: String
   public open val content: List<ContentNode>?

   init {
      r.h(var1, "attachmentUrl");
      r.h(var2, "attachmentName");
      super(null);
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
      r.h(var1, "attachmentUrl");
      r.h(var2, "attachmentName");
      return new AttachmentLinkContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AttachmentLinkContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.attachmentUrl, var1.attachmentUrl)) {
            return false;
         } else if (!r.c(this.attachmentName, var1.attachmentName)) {
            return false;
         } else {
            return r.c(this.content, var1.content);
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
      val var2: java.util.List = this.content;
      val var3: StringBuilder = new StringBuilder();
      var3.append("AttachmentLinkContentNode(attachmentUrl=");
      var3.append(var4);
      var3.append(", attachmentName=");
      var3.append(var1);
      var3.append(", content=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AttachmentLinkContentNode> {
         return AttachmentLinkContentNode.$serializer.INSTANCE;
      }
   }
}
