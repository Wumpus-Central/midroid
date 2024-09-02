package com.discord.chat.reactevents

import com.discord.chat.reactevents.TapImageData.Layout
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import lj.w

internal data class LongPressPollImageData(channelId: String, messageId: String, attachmentId: String, layout: Layout) : ReactEvent {
   public final val attachmentId: String
   public final val channelId: String
   public final val layout: Layout
   public final val messageId: String

   init {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "attachmentId");
      q.h(var4, "layout");
      super();
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
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "attachmentId");
      q.h(var4, "layout");
      return new LongPressPollImageData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressPollImageData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.attachmentId, var1.attachmentId)) {
            return false;
         } else {
            return q.c(this.layout, var1.layout);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.channelId.hashCode() * 31 + this.messageId.hashCode()) * 31 + this.attachmentId.hashCode()) * 31 + this.layout.hashCode();
   }

   public open fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            w.a("channelId", this.channelId), w.a("messageId", this.messageId), w.a("attachmentId", this.attachmentId), w.a("layout", this.layout.serialize())
         }
      );
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.channelId;
      val var2: java.lang.String = this.messageId;
      val var5: java.lang.String = this.attachmentId;
      val var1: TapImageData.Layout = this.layout;
      val var4: StringBuilder = new StringBuilder();
      var4.append("LongPressPollImageData(channelId=");
      var4.append(var3);
      var4.append(", messageId=");
      var4.append(var2);
      var4.append(", attachmentId=");
      var4.append(var5);
      var4.append(", layout=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }
}
