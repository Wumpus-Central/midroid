package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.threads.ThreadEmbed
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class ThreadEmbedMessageAccessory(messageId: MessageId, threadEmbed: ThreadEmbed) : ThreadEmbedMessageAccessory(var1, var2) {
   public open val messageId: MessageId
   public final val threadEmbed: ThreadEmbed

   fun ThreadEmbedMessageAccessory(var1: java.lang.String, var2: ThreadEmbed) {
      q.h(var1, "messageId");
      q.h(var2, "threadEmbed");
      super(var1, "thread-embed", false, null);
      this.messageId = var1;
      this.threadEmbed = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ThreadEmbed {
      return this.threadEmbed;
   }

   public fun copy(messageId: MessageId = ..., threadEmbed: ThreadEmbed = ...): ThreadEmbedMessageAccessory {
      q.h(var1, "messageId");
      q.h(var2, "threadEmbed");
      return new ThreadEmbedMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ThreadEmbedMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.threadEmbed, var1.threadEmbed);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.threadEmbed.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: ThreadEmbed = this.threadEmbed;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ThreadEmbedMessageAccessory(messageId=");
      var1.append(var3);
      var1.append(", threadEmbed=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
