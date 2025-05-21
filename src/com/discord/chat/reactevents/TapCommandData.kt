package com.discord.chat.reactevents

import Ja.f
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.primitives.ChannelId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapCommandData(channelId: String, commandId: String, commandName: String, commandKey: String) : ReactEvent {
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
   ): TapCommandData {
      q.h(var1, "channelId");
      q.h(var2, "commandId");
      q.h(var3, "commandName");
      q.h(var4, "commandKey");
      return new TapCommandData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCommandData) {
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
      val var4: java.lang.String = this.commandId;
      val var5: java.lang.String = this.commandName;
      val var1: java.lang.String = this.commandKey;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapCommandData(channelId=");
      var2.append(var3);
      var2.append(", commandId=");
      var2.append(var4);
      var2.append(", commandName=");
      var2.append(var5);
      var2.append(", commandKey=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapCommandData> {
         return TapCommandData.$serializer.INSTANCE;
      }
   }
}
