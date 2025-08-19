package com.discord.chat.bridge.messageframe

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class MessageFrameJump(type: MessageFrameType, guildName: String? = null, channelName: String? = null) : MessageFrame() {
   public open val type: MessageFrameType
   public final val guildName: String?
   public final val channelName: String?

   init {
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
         } else if (!(this.guildName == var1.guildName)) {
            return false;
         } else {
            return this.channelName == var1.channelName;
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
      val var2: MessageFrameType = this.type;
      val var4: java.lang.String = this.guildName;
      val var3: java.lang.String = this.channelName;
      val var1: StringBuilder = new StringBuilder();
      var1.append("MessageFrameJump(type=");
      var1.append(var2);
      var1.append(", guildName=");
      var1.append(var4);
      var1.append(", channelName=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MessageFrameJump> {
         return MessageFrameJump.$serializer.INSTANCE;
      }
   }
}
