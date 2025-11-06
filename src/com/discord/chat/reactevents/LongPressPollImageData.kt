package com.discord.chat.reactevents

import com.discord.chat.reactevents.TapImageData.Layout
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import ht.v

internal data class LongPressPollImageData(channelId: String, messageId: String, attachmentId: String, layout: Layout) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val attachmentId: String
   public final val layout: Layout

   init {
      this.channelId = var1;
      this.messageId = var2;
      this.attachmentId = var3;
      this.layout = var4;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.messageId;
   }

   public operator fun component3(): String {
      return this.attachmentId;
   }

   public operator fun component4(): Layout {
      return this.layout;
   }

   public fun copy(
      channelId: String = var0.channelId,
      messageId: String = var0.messageId,
      attachmentId: String = var0.attachmentId,
      layout: Layout = var0.layout
   ): LongPressPollImageData {
      return new LongPressPollImageData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressPollImageData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.channelId == var1.channelId)) {
            return false;
         } else if (!(this.messageId == var1.messageId)) {
            return false;
         } else if (!(this.attachmentId == var1.attachmentId)) {
            return false;
         } else {
            return this.layout == var1.layout;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.channelId.hashCode() * 31 + this.messageId.hashCode()) * 31 + this.attachmentId.hashCode()) * 31 + this.layout.hashCode();
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         v.a("channelId", this.channelId), v.a("messageId", this.messageId), v.a("attachmentId", this.attachmentId), v.a("layout", this.layout.serialize())
      );
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.channelId;
      val var5: java.lang.String = this.messageId;
      val var4: java.lang.String = this.attachmentId;
      val var1: TapImageData.Layout = this.layout;
      val var3: StringBuilder = new StringBuilder();
      var3.append("LongPressPollImageData(channelId=");
      var3.append(var2);
      var3.append(", messageId=");
      var3.append(var5);
      var3.append(", attachmentId=");
      var3.append(var4);
      var3.append(", layout=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
