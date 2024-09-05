package com.discord.chat.reactevents

import com.discord.chat.bridge.sticker.Sticker
import com.discord.primitives.MessageId
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import vj.w

public data class LongPressStickerData(messageId: MessageId, sticker: Sticker) : LongPressStickerData(var1, var2), ReactEvent {
   public final val messageId: MessageId
   public final val sticker: Sticker

   fun LongPressStickerData(var1: java.lang.String, var2: Sticker) {
      q.h(var1, "messageId");
      q.h(var2, "sticker");
      super();
      this.messageId = var1;
      this.sticker = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Sticker {
      return this.sticker;
   }

   public fun copy(messageId: MessageId = ..., sticker: Sticker = ...): LongPressStickerData {
      q.h(var1, "messageId");
      q.h(var2, "sticker");
      return new LongPressStickerData(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressStickerData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.sticker, var1.sticker);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.sticker.hashCode();
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
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: Sticker = this.sticker;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LongPressStickerData(messageId=");
      var2.append(var1);
      var2.append(", sticker=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }
}
