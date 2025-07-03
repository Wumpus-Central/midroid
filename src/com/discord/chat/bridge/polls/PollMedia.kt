package com.discord.chat.bridge.polls

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class PollMedia(text: String? = null, attachmentIds: Set<String> = w.d(), emoji: PollMediaEmoji? = null, stickerId: Long? = null) {
   public final val text: String?
   public final val attachmentIds: Set<String>
   public final val emoji: PollMediaEmoji?
   public final val stickerId: Long?

   fun PollMedia() {
      this(null, null, null, null, 15, null);
   }

   init {
      r.h(var2, "attachmentIds");
      super();
      this.text = var1;
      this.attachmentIds = var2;
      this.emoji = var3;
      this.stickerId = var4;
   }

   public operator fun component1(): String? {
      return this.text;
   }

   public operator fun component2(): Set<String> {
      return this.attachmentIds;
   }

   public operator fun component3(): PollMediaEmoji? {
      return this.emoji;
   }

   public operator fun component4(): Long? {
      return this.stickerId;
   }

   public fun copy(
      text: String? = var0.text,
      attachmentIds: Set<String> = var0.attachmentIds,
      emoji: PollMediaEmoji? = var0.emoji,
      stickerId: Long? = var0.stickerId
   ): PollMedia {
      r.h(var2, "attachmentIds");
      return new PollMedia(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollMedia) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.text, var1.text)) {
            return false;
         } else if (!r.c(this.attachmentIds, var1.attachmentIds)) {
            return false;
         } else if (!r.c(this.emoji, var1.emoji)) {
            return false;
         } else {
            return r.c(this.stickerId, var1.stickerId);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.text == null) {
         var1 = 0;
      } else {
         var1 = this.text.hashCode();
      }

      val var4: Int = this.attachmentIds.hashCode();
      val var2: Int;
      if (this.emoji == null) {
         var2 = 0;
      } else {
         var2 = this.emoji.hashCode();
      }

      if (this.stickerId != null) {
         var3 = this.stickerId.hashCode();
      }

      return ((var1 * 31 + var4) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.text;
      val var5: java.util.Set = this.attachmentIds;
      val var2: PollMediaEmoji = this.emoji;
      val var1: java.lang.Long = this.stickerId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("PollMedia(text=");
      var4.append(var3);
      var4.append(", attachmentIds=");
      var4.append(var5);
      var4.append(", emoji=");
      var4.append(var2);
      var4.append(", stickerId=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PollMedia> {
         return PollMedia.$serializer.INSTANCE;
      }
   }
}
