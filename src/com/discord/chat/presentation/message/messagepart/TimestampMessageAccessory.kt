package com.discord.chat.presentation.message.messagepart

import com.discord.fonts.DiscordFont
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class TimestampMessageAccessory(messageId: MessageId, timestamp: String, textColor: Int, discordFont: DiscordFont) : TimestampMessageAccessory(
      var1, var2, var3, var4
   ) {
   public final val discordFont: DiscordFont
   public open val messageId: MessageId
   public final val textColor: Int
   public final val timestamp: String

   fun TimestampMessageAccessory(var1: java.lang.String, var2: java.lang.String, var3: Int, var4: DiscordFont) {
      val var5: StringBuilder = new StringBuilder();
      var5.append("timestamp ");
      var5.append(var2);
      super(var1, var5.toString(), false, 4, null);
      this.messageId = var1;
      this.timestamp = var2;
      this.textColor = var3;
      this.discordFont = var4;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): String {
      return this.timestamp;
   }

   public operator fun component3(): Int {
      return this.textColor;
   }

   public operator fun component4(): DiscordFont {
      return this.discordFont;
   }

   public fun copy(messageId: MessageId = ..., timestamp: String = ..., textColor: Int = ..., discordFont: DiscordFont = ...): TimestampMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "timestamp");
      r.h(var4, "discordFont");
      return new TimestampMessageAccessory(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TimestampMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (!r.c(this.timestamp, var1.timestamp)) {
            return false;
         } else if (this.textColor != var1.textColor) {
            return false;
         } else {
            return this.discordFont === var1.discordFont;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((MessageId.hashCode-impl(this.getMessageId-3Eiw7ao()) * 31 + this.timestamp.hashCode()) * 31 + Integer.hashCode(this.textColor)) * 31
         + this.discordFont.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var5: java.lang.String = this.timestamp;
      val var1: Int = this.textColor;
      val var2: DiscordFont = this.discordFont;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TimestampMessageAccessory(messageId=");
      var3.append(var4);
      var3.append(", timestamp=");
      var3.append(var5);
      var3.append(", textColor=");
      var3.append(var1);
      var3.append(", discordFont=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
