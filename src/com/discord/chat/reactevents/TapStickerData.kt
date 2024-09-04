package com.discord.chat.reactevents

import com.discord.chat.bridge.sticker.Sticker
import com.discord.primitives.MessageId
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import eh.w
import kotlin.jvm.internal.r

public data class TapStickerData(sticker: Sticker, messageId: MessageId) : TapStickerData(var1, var2), ReactEvent {
   public final val messageId: MessageId
   public final val sticker: Sticker

   fun TapStickerData(var1: Sticker, var2: java.lang.String) {
      this.sticker = var1;
      this.messageId = var2;
   }

   public operator fun component1(): Sticker {
      return this.sticker;
   }

   public operator fun component2(): MessageId {
      return this.messageId;
   }

   public fun copy(sticker: Sticker = ..., messageId: MessageId = ...): TapStickerData {
      r.h(var1, "sticker");
      r.h(var2, "messageId");
      return new TapStickerData(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapStickerData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.sticker, var1.sticker)) {
            return false;
         } else {
            return MessageId.equals-impl0(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.sticker.hashCode() * 31 + MessageId.hashCode-impl(this.messageId);
   }

   public open fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            w.a("messageId", this.messageId),
            w.a(
               "sticker",
               NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("id", java.lang.String.valueOf(this.sticker.getId())), w.a("name", this.sticker.getName())})
            )
         }
      );
   }

   public override fun toString(): String {
      val var1: Sticker = this.sticker;
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapStickerData(sticker=");
      var3.append(var1);
      var3.append(", messageId=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
