package com.discord.chat.bridge.threads

import com.discord.chat.bridge.Message
import kotlinx.serialization.KSerializer
import xu.m

@m
public data class ThreadEmbedMessage(message: Message) {
   public final val message: Message

   init {
      super();
      this.message = var1;
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public fun copy(message: Message = var0.message): ThreadEmbedMessage {
      return new ThreadEmbedMessage(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ThreadEmbedMessage) {
         return false;
      } else {
         return this.message == (var1 as ThreadEmbedMessage).message;
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var1: Message = this.message;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ThreadEmbedMessage(message=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ThreadEmbedMessage> {
         return ThreadEmbedMessage.$serializer.INSTANCE;
      }
   }
}
