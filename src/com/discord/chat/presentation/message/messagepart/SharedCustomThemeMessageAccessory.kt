package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.customthemes.SharedCustomThemeData
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId

public data class SharedCustomThemeMessageAccessory(channelId: ChannelId, messageId: MessageId, data: SharedCustomThemeData, author: String?) : SharedCustomThemeMessageAccessory(
      var1, var3, var4, var5
   ) {
   public final val channelId: ChannelId
   public open val messageId: MessageId
   public final val data: SharedCustomThemeData
   public final val author: String?

   fun SharedCustomThemeMessageAccessory(var1: Long, var3: java.lang.String, var4: SharedCustomThemeData, var5: java.lang.String) {
      super(var3, "shared client theme", false, 4, null);
      this.channelId = var1;
      this.messageId = var3;
      this.data = var4;
      this.author = var5;
   }

   public operator fun component1(): ChannelId {
      return this.channelId;
   }

   public operator fun component2(): MessageId {
      return this.messageId;
   }

   public operator fun component3(): SharedCustomThemeData {
      return this.data;
   }

   public operator fun component4(): String? {
      return this.author;
   }

   public fun copy(channelId: ChannelId = ..., messageId: MessageId = ..., data: SharedCustomThemeData = ..., author: String? = ...): SharedCustomThemeMessageAccessory {
      return new SharedCustomThemeMessageAccessory(var1, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SharedCustomThemeMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!(this.data == var1.data)) {
            return false;
         } else {
            return this.author == var1.author;
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = ChannelId.hashCode-impl(this.channelId);
      val var3: Int = MessageId.hashCode-impl(this.messageId);
      val var4: Int = this.data.hashCode();
      val var1: Int;
      if (this.author == null) {
         var1 = 0;
      } else {
         var1 = this.author.hashCode();
      }

      return ((var2 * 31 + var3) * 31 + var4) * 31 + var1;
   }

   public override fun toString(): String {
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: SharedCustomThemeData = this.data;
      val var4: java.lang.String = this.author;
      val var5: StringBuilder = new StringBuilder();
      var5.append("SharedCustomThemeMessageAccessory(channelId=");
      var5.append(var2);
      var5.append(", messageId=");
      var5.append(var3);
      var5.append(", data=");
      var5.append(var1);
      var5.append(", author=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun create(message: Message, sharedCustomThemeData: SharedCustomThemeData): SharedCustomThemeMessageAccessory {
         return new SharedCustomThemeMessageAccessory(var1.getChannelId-o4g7jtM(), var1.getId-3Eiw7ao(), var2, var1.getUsername(), null);
      }
   }
}
