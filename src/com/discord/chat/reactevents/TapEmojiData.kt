package com.discord.chat.reactevents

import com.discord.chat.bridge.contentnode.CustomEmojiContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.UnicodeEmojiContentNode
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import gh.p
import gh.w
import kotlin.jvm.internal.q

internal data class TapEmojiData(emoji: EmojiContentNode) : ReactEvent {
   private final val emoji: EmojiContentNode

   init {
      q.h(var1, "emoji");
      super();
      this.emoji = var1;
   }

   private operator fun component1(): EmojiContentNode {
      return this.emoji;
   }

   public fun copy(emoji: EmojiContentNode = var0.emoji): TapEmojiData {
      q.h(var1, "emoji");
      return new TapEmojiData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapEmojiData) {
         return false;
      } else {
         return q.c(this.emoji, (var1 as TapEmojiData).emoji);
      }
   }

   public override fun hashCode(): Int {
      return this.emoji.hashCode();
   }

   public override fun serialize(): WritableMap {
      val var2: WritableNativeMap;
      if (this.emoji is UnicodeEmojiContentNode) {
         var2 = NativeMapExtensionsKt.nativeMapOf(
            w.a("surrogate", (this.emoji as UnicodeEmojiContentNode).getSurrogate()), w.a("content", (this.emoji as UnicodeEmojiContentNode).getContent())
         );
      } else {
         if (this.emoji !is CustomEmojiContentNode) {
            throw new p();
         }

         var2 = NativeMapExtensionsKt.nativeMapOf(
            w.a("id", java.lang.String.valueOf((this.emoji as CustomEmojiContentNode).getId())),
            w.a("alt", (this.emoji as CustomEmojiContentNode).getAlt()),
            w.a("src", (this.emoji as CustomEmojiContentNode).getSrc())
         );
      }

      return NativeMapExtensionsKt.nativeMapOf(w.a("node", var2));
   }

   public override fun toString(): String {
      val var2: EmojiContentNode = this.emoji;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapEmojiData(emoji=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
