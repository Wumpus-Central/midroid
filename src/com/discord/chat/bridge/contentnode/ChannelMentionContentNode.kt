package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import pc.m
import sc.f

@m
public data class ChannelMentionContentNode(channelId: String,
   guildId: String? = null,
   messageId: String? = null,
   originalLink: String? = null,
   inContent: List<ContentNode>? = null,
   content: List<ContentNode>?
) : MentionContentNode() {
   public final val channelId: String
   public final val guildId: String?
   public final val messageId: String?
   public final val originalLink: String?
   public final val inContent: List<ContentNode>?
   public open val content: List<ContentNode>?

   @JvmStatic
   fun {
      val var0: ContentNodeSerializer = ContentNodeSerializer.INSTANCE;
      $childSerializers = new KSerializer[]{null, null, null, null, new f(ContentNodeSerializer.INSTANCE), new f(var0)};
   }

   init {
      this.channelId = var1;
      this.guildId = var2;
      this.messageId = var3;
      this.originalLink = var4;
      this.inContent = var5;
      this.content = var6;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String? {
      return this.guildId;
   }

   public operator fun component3(): String? {
      return this.messageId;
   }

   public operator fun component4(): String? {
      return this.originalLink;
   }

   public operator fun component5(): List<ContentNode>? {
      return this.inContent;
   }

   public operator fun component6(): List<ContentNode>? {
      return this.content;
   }

   public fun copy(
      channelId: String = var0.channelId,
      guildId: String? = var0.guildId,
      messageId: String? = var0.messageId,
      originalLink: String? = var0.originalLink,
      inContent: List<ContentNode>? = var0.inContent,
      content: List<ContentNode>? = var0.content
   ): ChannelMentionContentNode {
      return new ChannelMentionContentNode(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChannelMentionContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!(this.channelId == var1.channelId)) {
            return false;
         } else if (!(this.guildId == var1.guildId)) {
            return false;
         } else if (!(this.messageId == var1.messageId)) {
            return false;
         } else if (!(this.originalLink == var1.originalLink)) {
            return false;
         } else if (!(this.inContent == var1.inContent)) {
            return false;
         } else {
            return this.content == var1.content;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.channelId.hashCode();
      var var5: Int = 0;
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = this.guildId.hashCode();
      }

      val var2: Int;
      if (this.messageId == null) {
         var2 = 0;
      } else {
         var2 = this.messageId.hashCode();
      }

      val var3: Int;
      if (this.originalLink == null) {
         var3 = 0;
      } else {
         var3 = this.originalLink.hashCode();
      }

      val var4: Int;
      if (this.inContent == null) {
         var4 = 0;
      } else {
         var4 = this.inContent.hashCode();
      }

      if (this.content != null) {
         var5 = this.content.hashCode();
      }

      return ((((var6 * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.channelId;
      val var2: java.lang.String = this.guildId;
      val var5: java.lang.String = this.messageId;
      val var4: java.lang.String = this.originalLink;
      val var1: java.util.List = this.inContent;
      val var6: java.util.List = this.content;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ChannelMentionContentNode(channelId=");
      var7.append(var3);
      var7.append(", guildId=");
      var7.append(var2);
      var7.append(", messageId=");
      var7.append(var5);
      var7.append(", originalLink=");
      var7.append(var4);
      var7.append(", inContent=");
      var7.append(var1);
      var7.append(", content=");
      var7.append(var6);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelMentionContentNode> {
         return ChannelMentionContentNode.$serializer.INSTANCE;
      }
   }
}
