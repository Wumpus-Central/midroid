package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.sticker.Sticker
import kotlin.jvm.internal.r

public data class WelcomeStickerAccessory(message: Message, sticker: Sticker) : MessageAccessory {
   public final val message: Message
   public final val sticker: Sticker

   init {
      r.h(var1, "message");
      r.h(var2, "sticker");
      val var5: java.lang.String = var1.getId-3Eiw7ao();
      val var3: Long = var2.getId();
      val var6: StringBuilder = new StringBuilder();
      var6.append("welcome sticker ");
      var6.append(var3);
      super(var5, var6.toString(), false, 4, null);
      this.message = var1;
      this.sticker = var2;
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public operator fun component2(): Sticker {
      return this.sticker;
   }

   public fun copy(message: Message = var0.message, sticker: Sticker = var0.sticker): WelcomeStickerAccessory {
      r.h(var1, "message");
      r.h(var2, "sticker");
      return new WelcomeStickerAccessory(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is WelcomeStickerAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.message, var1.message)) {
            return false;
         } else {
            return r.c(this.sticker, var1.sticker);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode() * 31 + this.sticker.hashCode();
   }

   public override fun toString(): String {
      val var1: Message = this.message;
      val var3: Sticker = this.sticker;
      val var2: StringBuilder = new StringBuilder();
      var2.append("WelcomeStickerAccessory(message=");
      var2.append(var1);
      var2.append(", sticker=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }
}
