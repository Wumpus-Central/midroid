package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.sticker.Sticker
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class StickerMessageAccessory(messageId: MessageId, sticker: Sticker) : StickerMessageAccessory(var1, var2) {
   public open val messageId: MessageId
   public final val sticker: Sticker

   fun StickerMessageAccessory(var1: java.lang.String, var2: Sticker) {
      val var3: Long = var2.getId();
      val var5: StringBuilder = new StringBuilder();
      var5.append("sticker-");
      var5.append(var3);
      super(var1, var5.toString(), false, 4, null);
      this.messageId = var1;
      this.sticker = var2;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): Sticker {
      return this.sticker;
   }

   public fun copy(messageId: MessageId = ..., sticker: Sticker = ...): StickerMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "sticker");
      return new StickerMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StickerMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else {
            return r.c(this.sticker, var1.sticker);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.getMessageId-3Eiw7ao()) * 31 + this.sticker.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var2: Sticker = this.sticker;
      val var3: StringBuilder = new StringBuilder();
      var3.append("StickerMessageAccessory(messageId=");
      var3.append(var1);
      var3.append(", sticker=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
