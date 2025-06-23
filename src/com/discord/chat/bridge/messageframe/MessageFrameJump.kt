package com.discord.chat.bridge.messageframe

import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class MessageFrameJump(type: MessageFrameType, guildName: String? = null, channelName: String? = null) : MessageFrame {
   public open val type: MessageFrameType
   public final val guildName: String?
   public final val channelName: String?

   init {
      q.h(var1, "type");
      super(null);
      this.type = var1;
      this.guildName = var2;
      this.channelName = var3;
   }

   public operator fun component1(): MessageFrameType {
      return this.type;
   }

   public operator fun component2(): String? {
      return this.guildName;
   }

   public operator fun component3(): String? {
      return this.channelName;
   }

   public fun copy(type: MessageFrameType = var0.type, guildName: String? = var0.guildName, channelName: String? = var0.channelName): MessageFrameJump {
      q.h(var1, "type");
      return new MessageFrameJump(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageFrameJump) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.guildName, var1.guildName)) {
            return false;
         } else {
            return q.c(this.channelName, var1.channelName);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.type.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.guildName == null) {
         var1 = 0;
      } else {
         var1 = this.guildName.hashCode();
      }

      if (this.channelName != null) {
         var2 = this.channelName.hashCode();
      }

      return (var3 * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var1: MessageFrameType = this.type;
      val var3: java.lang.String = this.guildName;
      val var4: java.lang.String = this.channelName;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MessageFrameJump(type=");
      var2.append(var1);
      var2.append(", guildName=");
      var2.append(var3);
      var2.append(", channelName=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MessageFrameJump> {
         return MessageFrameJump.$serializer.INSTANCE;
      }
   }
}
