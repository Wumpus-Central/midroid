package com.discord.emoji

import com.discord.icons.IconUrlUtils
import kotlin.jvm.internal.r

public sealed class RenderableEmoji protected constructor() {
   public abstract fun getContentDescription(): String {
   }

   public abstract fun getUrl(allowAnimation: Boolean, sizePx: Int): String {
   }

   public companion object {
      private final val exceptions: Set<String>

      public fun customWithEmojiId(id: Long, isAnimated: Boolean, alt: String): com.discord.emoji.RenderableEmoji.CustomWithEmojiId {
         r.h(var4, "alt");
         return new RenderableEmoji.CustomWithEmojiId(var1, var3, var4);
      }

      public fun customWithUrl(url: String, alt: String): com.discord.emoji.RenderableEmoji.CustomWithUrl {
         r.h(var1, "url");
         r.h(var2, "alt");
         return new RenderableEmoji.CustomWithUrl(var1, var2);
      }

      public fun unicode(surrogates: String): com.discord.emoji.RenderableEmoji.Unicode {
         r.h(var1, "surrogates");
         return new RenderableEmoji.Unicode(Surrogates.constructor-impl(var1), null);
      }
   }

   public data class CustomWithEmojiId(emojiId: Long, isAnimated: Boolean, alt: String) : RenderableEmoji {
      public final val alt: String
      public final val emojiId: Long
      public final val isAnimated: Boolean

      init {
         r.h(var4, "alt");
         super(null);
         this.emojiId = var1;
         this.isAnimated = var3;
         this.alt = var4;
      }

      public operator fun component1(): Long {
         return this.emojiId;
      }

      public operator fun component2(): Boolean {
         return this.isAnimated;
      }

      public operator fun component3(): String {
         return this.alt;
      }

      public fun copy(emojiId: Long = var0.emojiId, isAnimated: Boolean = var0.isAnimated, alt: String = var0.alt): com.discord.emoji.RenderableEmoji.CustomWithEmojiId {
         r.h(var4, "alt");
         return new RenderableEmoji.CustomWithEmojiId(var1, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is RenderableEmoji.CustomWithEmojiId) {
            return false;
         } else {
            var1 = var1;
            if (this.emojiId != var1.emojiId) {
               return false;
            } else if (this.isAnimated != var1.isAnimated) {
               return false;
            } else {
               return r.c(this.alt, var1.alt);
            }
         }
      }

      public override fun getContentDescription(): String {
         return this.alt;
      }

      public override fun getUrl(allowAnimation: Boolean, sizePx: Int): String {
         if (var1 && this.isAnimated) {
            var1 = true;
         } else {
            var1 = false;
         }

         return IconUrlUtils.INSTANCE.getCustomEmojiUrl(this.emojiId, var1, var2);
      }

      public override fun hashCode(): Int {
         val var3: Int = java.lang.Long.hashCode(this.emojiId);
         var var1: Byte = this.isAnimated;
         if (this.isAnimated != 0) {
            var1 = 1;
         }

         return (var3 * 31 + var1) * 31 + this.alt.hashCode();
      }

      public override fun toString(): String {
         val var1: Long = this.emojiId;
         val var3: Boolean = this.isAnimated;
         val var5: java.lang.String = this.alt;
         val var4: StringBuilder = new StringBuilder();
         var4.append("CustomWithEmojiId(emojiId=");
         var4.append(var1);
         var4.append(", isAnimated=");
         var4.append(var3);
         var4.append(", alt=");
         var4.append(var5);
         var4.append(")");
         return var4.toString();
      }
   }

   public data class CustomWithUrl(url: String, alt: String) : RenderableEmoji {
      public final val alt: String
      public final val url: String

      init {
         r.h(var1, "url");
         r.h(var2, "alt");
         super(null);
         this.url = var1;
         this.alt = var2;
      }

      public operator fun component1(): String {
         return this.url;
      }

      public operator fun component2(): String {
         return this.alt;
      }

      public fun copy(url: String = var0.url, alt: String = var0.alt): com.discord.emoji.RenderableEmoji.CustomWithUrl {
         r.h(var1, "url");
         r.h(var2, "alt");
         return new RenderableEmoji.CustomWithUrl(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is RenderableEmoji.CustomWithUrl) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.url, var1.url)) {
               return false;
            } else {
               return r.c(this.alt, var1.alt);
            }
         }
      }

      public override fun getContentDescription(): String {
         return this.alt;
      }

      public override fun getUrl(allowAnimation: Boolean, sizePx: Int): String {
         return this.url;
      }

      public override fun hashCode(): Int {
         return this.url.hashCode() * 31 + this.alt.hashCode();
      }

      public override fun toString(): String {
         val var3: java.lang.String = this.url;
         val var2: java.lang.String = this.alt;
         val var1: StringBuilder = new StringBuilder();
         var1.append("CustomWithUrl(url=");
         var1.append(var3);
         var1.append(", alt=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }
   }

   public data class Unicode(surrogates: Surrogates) : RenderableEmoji.Unicode(var1) {
      public final val exception: String?
      public final val surrogates: Surrogates

      fun Unicode(var1: java.lang.String) {
         super(null);
         this.surrogates = var1;
         val var2: java.lang.String = Surrogates.withoutDiversity-impl(var1);
         var1 = null;
         if (RenderableEmoji.access$getExceptions$cp().contains(var2)) {
            var1 = var2;
         }

         this.exception = var1;
      }

      public operator fun component1(): Surrogates {
         return this.surrogates;
      }

      public fun copy(surrogates: Surrogates = ...): com.discord.emoji.RenderableEmoji.Unicode {
         r.h(var1, "surrogates");
         return new RenderableEmoji.Unicode(var1, null);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is RenderableEmoji.Unicode) {
            return false;
         } else {
            return Surrogates.equals-impl0(this.surrogates, (var1 as RenderableEmoji.Unicode).surrogates);
         }
      }

      public override fun getContentDescription(): String {
         return this.surrogates;
      }

      public override fun getUrl(allowAnimation: Boolean, sizePx: Int): String {
         return Surrogates.toAssetUrl-impl(this.surrogates);
      }

      public override fun hashCode(): Int {
         return Surrogates.hashCode-impl(this.surrogates);
      }

      public override fun toString(): String {
         val var2: java.lang.String = Surrogates.toString-impl(this.surrogates);
         val var1: StringBuilder = new StringBuilder();
         var1.append("Unicode(surrogates=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }
   }
}
