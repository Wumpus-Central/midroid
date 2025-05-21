package com.discord.chat.bridge.contentnode

import Za.f
import com.discord.primitives.ChannelId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class CommandMentionContentNode(channelId: ChannelId, commandId: String, commandName: String, commandKey: String, content: List<ContentNode>) : CommandMentionContentNode(
      var1, var3, var4, var5, var6
   ) {
   public final val channelId: ChannelId
   public final val commandId: String
   public final val commandName: String
   public final val commandKey: String
   public open val content: List<ContentNode>

   fun CommandMentionContentNode(var1: Long, var3: java.lang.String, var4: java.lang.String, var5: java.lang.String, var6: MutableList<ContentNode>) {
      q.h(var3, "commandId");
      q.h(var4, "commandName");
      q.h(var5, "commandKey");
      q.h(var6, "content");
      super(null);
      this.channelId = var1;
      this.commandId = var3;
      this.commandName = var4;
      this.commandKey = var5;
      this.content = var6;
   }

   public operator fun component1(): ChannelId {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.commandId;
   }

   public operator fun component3(): String {
      return this.commandName;
   }

   public operator fun component4(): String {
      return this.commandKey;
   }

   public operator fun component5(): List<ContentNode> {
      return this.content;
   }

   public fun copy(channelId: ChannelId = ..., commandId: String = ..., commandName: String = ..., commandKey: String = ..., content: List<ContentNode> = ...): CommandMentionContentNode {
      q.h(var3, "commandId");
      q.h(var4, "commandName");
      q.h(var5, "commandKey");
      q.h(var6, "content");
      return new CommandMentionContentNode(var1, var3, var4, var5, var6, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CommandMentionContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.commandId, var1.commandId)) {
            return false;
         } else if (!q.c(this.commandName, var1.commandName)) {
            return false;
         } else if (!q.c(this.commandKey, var1.commandKey)) {
            return false;
         } else {
            return q.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return (((ChannelId.hashCode-impl(this.channelId) * 31 + this.commandId.hashCode()) * 31 + this.commandName.hashCode()) * 31 + this.commandKey.hashCode())
            * 31
         + this.content.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var5: java.lang.String = this.commandId;
      val var1: java.lang.String = this.commandName;
      val var6: java.lang.String = this.commandKey;
      val var4: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("CommandMentionContentNode(channelId=");
      var2.append(var3);
      var2.append(", commandId=");
      var2.append(var5);
      var2.append(", commandName=");
      var2.append(var1);
      var2.append(", commandKey=");
      var2.append(var6);
      var2.append(", content=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CommandMentionContentNode> {
         return CommandMentionContentNode.$serializer.INSTANCE;
      }
   }
}
