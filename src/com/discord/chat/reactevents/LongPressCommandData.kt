package com.discord.chat.reactevents

import Xa.f
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.primitives.ChannelId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class LongPressCommandData(channelId: String, commandId: String, commandName: String, commandKey: String) : ReactEvent {
   public final val channelId: String
   public final val commandId: String
   public final val commandName: String
   public final val commandKey: String

   public constructor(node: CommandMentionContentNode) : q.h(var1, "node") {
      this(ChannelId.toString-impl(var1.getChannelId-o4g7jtM()), var1.getCommandId(), var1.getCommandName(), var1.getCommandKey());
   }

   init {
      q.h(var1, "channelId");
      q.h(var2, "commandId");
      q.h(var3, "commandName");
      q.h(var4, "commandKey");
      super();
      this.channelId = var1;
      this.commandId = var2;
      this.commandName = var3;
      this.commandKey = var4;
   }

   public operator fun component1(): String {
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

   public fun copy(
      channelId: String = var0.channelId,
      commandId: String = var0.commandId,
      commandName: String = var0.commandName,
      commandKey: String = var0.commandKey
   ): LongPressCommandData {
      q.h(var1, "channelId");
      q.h(var2, "commandId");
      q.h(var3, "commandName");
      q.h(var4, "commandKey");
      return new LongPressCommandData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressCommandData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.commandId, var1.commandId)) {
            return false;
         } else if (!q.c(this.commandName, var1.commandName)) {
            return false;
         } else {
            return q.c(this.commandKey, var1.commandKey);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.channelId.hashCode() * 31 + this.commandId.hashCode()) * 31 + this.commandName.hashCode()) * 31 + this.commandKey.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.channelId;
      val var2: java.lang.String = this.commandId;
      val var4: java.lang.String = this.commandName;
      val var5: java.lang.String = this.commandKey;
      val var1: StringBuilder = new StringBuilder();
      var1.append("LongPressCommandData(channelId=");
      var1.append(var3);
      var1.append(", commandId=");
      var1.append(var2);
      var1.append(", commandName=");
      var1.append(var4);
      var1.append(", commandKey=");
      var1.append(var5);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressCommandData> {
         return LongPressCommandData.$serializer.INSTANCE;
      }
   }
}
