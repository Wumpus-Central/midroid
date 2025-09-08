package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class GameMentionContentNode(channelId: ChannelId, icon: String? = ..., applicationId: String, content: List<ContentNode>) : GameMentionContentNode(
      var1, var3, var4, var5
   ) {
   public final val channelId: ChannelId
   public final val icon: String?
   public final val applicationId: String
   public open val content: List<ContentNode>

   fun GameMentionContentNode(var1: Long, var3: java.lang.String, var4: java.lang.String, var5: MutableList<ContentNode>) {
      super(null);
      this.channelId = var1;
      this.icon = var3;
      this.applicationId = var4;
      this.content = var5;
   }

   public operator fun component1(): ChannelId {
      return this.channelId;
   }

   public operator fun component2(): String? {
      return this.icon;
   }

   public operator fun component3(): String {
      return this.applicationId;
   }

   public operator fun component4(): List<ContentNode> {
      return this.content;
   }

   public fun copy(channelId: ChannelId = ..., icon: String? = ..., applicationId: String = ..., content: List<ContentNode> = ...): GameMentionContentNode {
      return new GameMentionContentNode(var1, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GameMentionContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!(this.icon == var1.icon)) {
            return false;
         } else if (!(this.applicationId == var1.applicationId)) {
            return false;
         } else {
            return this.content == var1.content;
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = ChannelId.hashCode-impl(this.channelId);
      val var1: Int;
      if (this.icon == null) {
         var1 = 0;
      } else {
         var1 = this.icon.hashCode();
      }

      return ((var2 * 31 + var1) * 31 + this.applicationId.hashCode()) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var5: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var1: java.lang.String = this.icon;
      val var2: java.lang.String = this.applicationId;
      val var3: java.util.List = this.content;
      val var4: StringBuilder = new StringBuilder();
      var4.append("GameMentionContentNode(channelId=");
      var4.append(var5);
      var4.append(", icon=");
      var4.append(var1);
      var4.append(", applicationId=");
      var4.append(var2);
      var4.append(", content=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<GameMentionContentNode> {
         return GameMentionContentNode.$serializer.INSTANCE;
      }
   }
}
