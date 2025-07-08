package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

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
      r.h(var3, "commandId");
      r.h(var4, "commandName");
      r.h(var5, "commandKey");
      r.h(var6, "content");
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
      r.h(var3, "commandId");
      r.h(var4, "commandName");
      r.h(var5, "commandKey");
      r.h(var6, "content");
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
         } else if (!r.c(this.commandId, var1.commandId)) {
            return false;
         } else if (!r.c(this.commandName, var1.commandName)) {
            return false;
         } else if (!r.c(this.commandKey, var1.commandKey)) {
            return false;
         } else {
            return r.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return (((ChannelId.hashCode-impl(this.channelId) * 31 + this.commandId.hashCode()) * 31 + this.commandName.hashCode()) * 31 + this.commandKey.hashCode())
            * 31
         + this.content.hashCode();
   }

   public override fun toString(): String {
      val var5: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: java.lang.String = this.commandId;
      val var4: java.lang.String = this.commandName;
      val var2: java.lang.String = this.commandKey;
      val var6: java.util.List = this.content;
      val var1: StringBuilder = new StringBuilder();
      var1.append("CommandMentionContentNode(channelId=");
      var1.append(var5);
      var1.append(", commandId=");
      var1.append(var3);
      var1.append(", commandName=");
      var1.append(var4);
      var1.append(", commandKey=");
      var1.append(var2);
      var1.append(", content=");
      var1.append(var6);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CommandMentionContentNode> {
         return CommandMentionContentNode.$serializer.INSTANCE;
      }
   }
}
