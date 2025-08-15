package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class SoundmojiContentNode(soundId: String,
   channelId: ChannelId,
   messageId: MessageId,
   content: String? = ...,
   guildId: String? = ...,
   jumboable: Boolean = ...,
   emojiId: String? = ...,
   emojiName: String? = ...
) : SoundmojiContentNode(var1, var2, var4, var5, var6, var7, var8, var9) {
   public final val soundId: String
   public final val channelId: ChannelId
   public final val messageId: MessageId
   public final val content: String?
   public final val guildId: String?
   public final val jumboable: Boolean
   public final val emojiId: String?
   public final val emojiName: String?

   fun SoundmojiContentNode(
      var1: java.lang.String,
      var2: Long,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: java.lang.String,
      var7: Boolean,
      var8: java.lang.String,
      var9: java.lang.String
   ) {
      super(null);
      this.soundId = var1;
      this.channelId = var2;
      this.messageId = var4;
      this.content = var5;
      this.guildId = var6;
      this.jumboable = var7;
      this.emojiId = var8;
      this.emojiName = var9;
   }

   public operator fun component1(): String {
      return this.soundId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): MessageId {
      return this.messageId;
   }

   public operator fun component4(): String? {
      return this.content;
   }

   public operator fun component5(): String? {
      return this.guildId;
   }

   public operator fun component6(): Boolean {
      return this.jumboable;
   }

   public operator fun component7(): String? {
      return this.emojiId;
   }

   public operator fun component8(): String? {
      return this.emojiName;
   }

   public fun copy(
      soundId: String = ...,
      channelId: ChannelId = ...,
      messageId: MessageId = ...,
      content: String? = ...,
      guildId: String? = ...,
      jumboable: Boolean = ...,
      emojiId: String? = ...,
      emojiName: String? = ...
   ): SoundmojiContentNode {
      return new SoundmojiContentNode(var1, var2, var4, var5, var6, var7, var8, var9, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SoundmojiContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!(this.soundId == var1.soundId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!(this.content == var1.content)) {
            return false;
         } else if (!(this.guildId == var1.guildId)) {
            return false;
         } else if (this.jumboable != var1.jumboable) {
            return false;
         } else if (!(this.emojiId == var1.emojiId)) {
            return false;
         } else {
            return this.emojiName == var1.emojiName;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.soundId.hashCode();
      val var5: Int = ChannelId.hashCode-impl(this.channelId);
      val var7: Int = MessageId.hashCode-impl(this.messageId);
      var var4: Int = 0;
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      val var2: Int;
      if (this.guildId == null) {
         var2 = 0;
      } else {
         var2 = this.guildId.hashCode();
      }

      val var8: Int = java.lang.Boolean.hashCode(this.jumboable);
      val var3: Int;
      if (this.emojiId == null) {
         var3 = 0;
      } else {
         var3 = this.emojiId.hashCode();
      }

      if (this.emojiName != null) {
         var4 = this.emojiName.hashCode();
      }

      return ((((((var6 * 31 + var5) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var8) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.soundId;
      val var5: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var6: java.lang.String = this.content;
      val var3: java.lang.String = this.guildId;
      val var1: Boolean = this.jumboable;
      val var8: java.lang.String = this.emojiId;
      val var9: java.lang.String = this.emojiName;
      val var7: StringBuilder = new StringBuilder();
      var7.append("SoundmojiContentNode(soundId=");
      var7.append(var4);
      var7.append(", channelId=");
      var7.append(var5);
      var7.append(", messageId=");
      var7.append(var2);
      var7.append(", content=");
      var7.append(var6);
      var7.append(", guildId=");
      var7.append(var3);
      var7.append(", jumboable=");
      var7.append(var1);
      var7.append(", emojiId=");
      var7.append(var8);
      var7.append(", emojiName=");
      var7.append(var9);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SoundmojiContentNode> {
         return SoundmojiContentNode.$serializer.INSTANCE;
      }
   }
}
