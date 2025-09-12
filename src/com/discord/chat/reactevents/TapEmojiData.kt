package com.discord.chat.reactevents

import Ca.p
import Ca.v
import com.discord.chat.bridge.contentnode.CustomEmojiContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.UnicodeEmojiContentNode
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap

internal data class TapEmojiData(emoji: EmojiContentNode) : ReactEvent {
   private final val emoji: EmojiContentNode

   init {
      this.emoji = var1;
   }

   private operator fun component1(): EmojiContentNode {
      return this.emoji;
   }

   public fun copy(emoji: EmojiContentNode = var0.emoji): TapEmojiData {
      return new TapEmojiData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapEmojiData) {
         return false;
      } else {
         return this.emoji == (var1 as TapEmojiData).emoji;
      }
   }

   public override fun hashCode(): Int {
      return this.emoji.hashCode();
   }

   public open fun serialize(): WritableMap {
      val var2: WritableNativeMap;
      if (this.emoji is UnicodeEmojiContentNode) {
         var2 = NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{
               v.a("surrogate", (this.emoji as UnicodeEmojiContentNode).getSurrogate()), v.a("content", (this.emoji as UnicodeEmojiContentNode).getContent())
            }
         );
      } else {
         if (this.emoji !is CustomEmojiContentNode) {
            throw new p();
         }

         var2 = NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{
               v.a("id", java.lang.String.valueOf((this.emoji as CustomEmojiContentNode).getId())),
               v.a("alt", (this.emoji as CustomEmojiContentNode).getAlt()),
               v.a("src", (this.emoji as CustomEmojiContentNode).getSrc())
            }
         );
      }

      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("node", var2)});
   }

   public override fun toString(): String {
      val var1: EmojiContentNode = this.emoji;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapEmojiData(emoji=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
