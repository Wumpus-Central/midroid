package com.discord.chat.reactevents

import com.discord.chat.reactevents.TapImageData.Layout
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import eh.w
import kotlin.jvm.internal.r

internal data class LongPressPollImageData(channelId: String, messageId: String, attachmentId: String, layout: Layout) : ReactEvent {
   public final val attachmentId: String
   public final val channelId: String
   public final val layout: Layout
   public final val messageId: String

   init {
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      r.h(var3, "attachmentId");
      r.h(var4, "layout");
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
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      r.h(var3, "attachmentId");
      r.h(var4, "layout");
      return new LongPressPollImageData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressPollImageData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!r.c(this.attachmentId, var1.attachmentId)) {
            return false;
         } else {
            return r.c(this.layout, var1.layout);
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
      val var4: java.lang.String = this.channelId;
      val var3: java.lang.String = this.messageId;
      val var5: java.lang.String = this.attachmentId;
      val var1: TapImageData.Layout = this.layout;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LongPressPollImageData(channelId=");
      var2.append(var4);
      var2.append(", messageId=");
      var2.append(var3);
      var2.append(", attachmentId=");
      var2.append(var5);
      var2.append(", layout=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
