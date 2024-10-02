package com.discord.emoji_picker

import com.discord.emoji.Surrogates
import com.discord.emoji.UnicodeEmojis
import com.discord.misc.utilities.ids.IdUtilsKt
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q

internal sealed class EmojiPickerItem protected constructor() {
   public abstract fun itemId(): Long {
   }

   public abstract fun itemType(): Int {
   }

   public data class Category(title: String, id: Long = IdUtilsKt.convertToId(var1), isInsidePremiumRoadBlock: Boolean = false) : EmojiPickerItem {
      public final val id: Long
      public final val isInsidePremiumRoadBlock: Boolean
      public final val title: String

      init {
         q.h(var1, "title");
         super(null);
         this.title = var1;
         this.id = var2;
         this.isInsidePremiumRoadBlock = var4;
      }

      public operator fun component1(): String {
         return this.title;
      }

      public operator fun component2(): Long {
         return this.id;
      }

      public operator fun component3(): Boolean {
         return this.isInsidePremiumRoadBlock;
      }

      public fun copy(title: String = var0.title, id: Long = var0.id, isInsidePremiumRoadBlock: Boolean = var0.isInsidePremiumRoadBlock): com.discord.emoji_picker.EmojiPickerItem.Category {
         q.h(var1, "title");
         return new EmojiPickerItem.Category(var1, var2, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerItem.Category) {
            return false;
         } else {
            var1 = var1;
            if (!q.c(this.title, var1.title)) {
               return false;
            } else if (this.id != var1.id) {
               return false;
            } else {
               return this.isInsidePremiumRoadBlock == var1.isInsidePremiumRoadBlock;
            }
         }
      }

      public override fun hashCode(): Int {
         return (this.title.hashCode() * 31 + java.lang.Long.hashCode(this.id)) * 31 + java.lang.Boolean.hashCode(this.isInsidePremiumRoadBlock);
      }

      public override fun itemId(): Long {
         return this.id;
      }

      public override fun itemType(): Int {
         return EmojiPickerItem.ItemType.CATEGORY.ordinal();
      }

      public override fun toString(): String {
         val var5: java.lang.String = this.title;
         val var2: Long = this.id;
         val var1: Boolean = this.isInsidePremiumRoadBlock;
         val var4: StringBuilder = new StringBuilder();
         var4.append("Category(title=");
         var4.append(var5);
         var4.append(", id=");
         var4.append(var2);
         var4.append(", isInsidePremiumRoadBlock=");
         var4.append(var1);
         var4.append(")");
         return var4.toString();
      }
   }

   public data class Emoji(id: Long,
         name: String,
         animated: Boolean = false,
         disabled: com.discord.emoji_picker.EmojiPickerItem.Emoji.DisabledType = EmojiPickerItem.Emoji.DisabledType.NONE,
         unicode: UnicodeEmojis.Emoji? = null,
         isInsidePremiumRoadBlock: Boolean = false
      )
      : EmojiPickerItem {
      public final val animated: Boolean
      public final val disabled: com.discord.emoji_picker.EmojiPickerItem.Emoji.DisabledType
      public final val id: Long
      public final val isInsidePremiumRoadBlock: Boolean
      public final val name: String
      private final val unicode: UnicodeEmojis.Emoji?

      public final val unicodeUrl: String?
         public final get() {
            val var2: java.lang.String;
            if (this.unicode != null) {
               var2 = Surrogates.toAssetUrl-impl(Surrogates.constructor-impl(this.unicode.getSurrogates()));
            } else {
               var2 = null;
            }

            return var2;
         }


      init {
         q.h(var3, "name");
         q.h(var5, "disabled");
         super(null);
         this.id = var1;
         this.name = var3;
         this.animated = var4;
         this.disabled = var5;
         this.unicode = var6;
         this.isInsidePremiumRoadBlock = var7;
      }

      private operator fun component5(): UnicodeEmojis.Emoji? {
         return this.unicode;
      }

      public operator fun component1(): Long {
         return this.id;
      }

      public operator fun component2(): String {
         return this.name;
      }

      public operator fun component3(): Boolean {
         return this.animated;
      }

      public operator fun component4(): com.discord.emoji_picker.EmojiPickerItem.Emoji.DisabledType {
         return this.disabled;
      }

      public operator fun component6(): Boolean {
         return this.isInsidePremiumRoadBlock;
      }

      public fun copy(
         id: Long = var0.id,
         name: String = var0.name,
         animated: Boolean = var0.animated,
         disabled: com.discord.emoji_picker.EmojiPickerItem.Emoji.DisabledType = var0.disabled,
         unicode: UnicodeEmojis.Emoji? = var0.unicode,
         isInsidePremiumRoadBlock: Boolean = var0.isInsidePremiumRoadBlock
      ): com.discord.emoji_picker.EmojiPickerItem.Emoji {
         q.h(var3, "name");
         q.h(var5, "disabled");
         return new EmojiPickerItem.Emoji(var1, var3, var4, var5, var6, var7);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerItem.Emoji) {
            return false;
         } else {
            var1 = var1;
            if (this.id != var1.id) {
               return false;
            } else if (!q.c(this.name, var1.name)) {
               return false;
            } else if (this.animated != var1.animated) {
               return false;
            } else if (this.disabled != var1.disabled) {
               return false;
            } else if (!q.c(this.unicode, var1.unicode)) {
               return false;
            } else {
               return this.isInsidePremiumRoadBlock == var1.isInsidePremiumRoadBlock;
            }
         }
      }

      public override fun hashCode(): Int {
         val var4: Int = java.lang.Long.hashCode(this.id);
         val var2: Int = this.name.hashCode();
         val var3: Int = java.lang.Boolean.hashCode(this.animated);
         val var5: Int = this.disabled.hashCode();
         val var1: Int;
         if (this.unicode == null) {
            var1 = 0;
         } else {
            var1 = this.unicode.hashCode();
         }

         return ((((var4 * 31 + var2) * 31 + var3) * 31 + var5) * 31 + var1) * 31 + java.lang.Boolean.hashCode(this.isInsidePremiumRoadBlock);
      }

      public override fun itemId(): Long {
         return this.id;
      }

      public override fun itemType(): Int {
         return EmojiPickerItem.ItemType.EMOJI.ordinal();
      }

      public override fun toString(): String {
         val var3: Long = this.id;
         val var5: java.lang.String = this.name;
         val var1: Boolean = this.animated;
         val var7: EmojiPickerItem.Emoji.DisabledType = this.disabled;
         val var8: UnicodeEmojis.Emoji = this.unicode;
         val var2: Boolean = this.isInsidePremiumRoadBlock;
         val var6: StringBuilder = new StringBuilder();
         var6.append("Emoji(id=");
         var6.append(var3);
         var6.append(", name=");
         var6.append(var5);
         var6.append(", animated=");
         var6.append(var1);
         var6.append(", disabled=");
         var6.append(var7);
         var6.append(", unicode=");
         var6.append(var8);
         var6.append(", isInsidePremiumRoadBlock=");
         var6.append(var2);
         var6.append(")");
         return var6.toString();
      }

      public enum class DisabledType {
         ICON,
         NONE         @JvmStatic
         private EnumEntries $ENTRIES;
         @JvmStatic
         private EmojiPickerItem.Emoji.DisabledType[] $VALUES;
         @JvmStatic
         public EmojiPickerItem.Emoji.DisabledType.Companion Companion = new EmojiPickerItem.Emoji.DisabledType.Companion(null);

         @JvmStatic
         fun {
            val var0: Array<EmojiPickerItem.Emoji.DisabledType> = $values();
            $VALUES = var0;
            $ENTRIES = rh.a.a(var0);
         }

         @JvmStatic
         fun getEntries(): EnumEntries {
            return $ENTRIES;
         }

         public companion object {
            public fun create(emojiDisabled: Boolean, emojiSectionNitroLocked: Boolean): com.discord.emoji_picker.EmojiPickerItem.Emoji.DisabledType {
               val var3: EmojiPickerItem.Emoji.DisabledType;
               if (var1 && !var2) {
                  var3 = EmojiPickerItem.Emoji.DisabledType.ICON;
               } else {
                  var3 = EmojiPickerItem.Emoji.DisabledType.NONE;
               }

               return var3;
            }
         }
      }
   }

   public data class EmojiPlaceholder(id: Long) : EmojiPickerItem() {
      private final val id: Long

      init {
         this.id = var1;
      }

      private operator fun component1(): Long {
         return this.id;
      }

      public fun copy(id: Long = var0.id): com.discord.emoji_picker.EmojiPickerItem.EmojiPlaceholder {
         return new EmojiPickerItem.EmojiPlaceholder(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerItem.EmojiPlaceholder) {
            return false;
         } else {
            return this.id == (var1 as EmojiPickerItem.EmojiPlaceholder).id;
         }
      }

      public override fun hashCode(): Int {
         return java.lang.Long.hashCode(this.id);
      }

      public override fun itemId(): Long {
         return this.id;
      }

      public override fun itemType(): Int {
         return EmojiPickerItem.ItemType.PLACEHOLDER.ordinal();
      }

      public override fun toString(): String {
         val var1: Long = this.id;
         val var3: StringBuilder = new StringBuilder();
         var3.append("EmojiPlaceholder(id=");
         var3.append(var1);
         var3.append(")");
         return var3.toString();
      }
   }

   public data class FooterUpsell(id: String) : EmojiPickerItem {
      public final val id: String

      init {
         q.h(var1, "id");
         super(null);
         this.id = var1;
      }

      public operator fun component1(): String {
         return this.id;
      }

      public fun copy(id: String = var0.id): com.discord.emoji_picker.EmojiPickerItem.FooterUpsell {
         q.h(var1, "id");
         return new EmojiPickerItem.FooterUpsell(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerItem.FooterUpsell) {
            return false;
         } else {
            return q.c(this.id, (var1 as EmojiPickerItem.FooterUpsell).id);
         }
      }

      public override fun hashCode(): Int {
         return this.id.hashCode();
      }

      public override fun itemId(): Long {
         return IdUtilsKt.convertToId(this.id);
      }

      public override fun itemType(): Int {
         return EmojiPickerItem.ItemType.FOOTER_UPSELL.ordinal();
      }

      public override fun toString(): String {
         val var2: java.lang.String = this.id;
         val var1: StringBuilder = new StringBuilder();
         var1.append("FooterUpsell(id=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }
   }

   public enum class ItemType {
      CATEGORY,
      EMOJI,
      FOOTER_UPSELL,
      PLACEHOLDER,
      PREMIUM_INLINE_ROADBLOCK_FOOTER,
      PREMIUM_INLINE_ROADBLOCK_HEADER,
      SPACER;

      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private EmojiPickerItem.ItemType[] $VALUES;
      @JvmStatic
      public EmojiPickerItem.ItemType.Companion Companion = new EmojiPickerItem.ItemType.Companion(null);

      @JvmStatic
      fun {
         val var0: Array<EmojiPickerItem.ItemType> = $values();
         $VALUES = var0;
         $ENTRIES = rh.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }

      public companion object {
         public final val values: Array<com.discord.emoji_picker.EmojiPickerItem.ItemType>

         public fun create(value: Int): com.discord.emoji_picker.EmojiPickerItem.ItemType {
            val var2: Array<EmojiPickerItem.ItemType> = this.getValues();
            if (var1 >= 0 && var1 <= kotlin.collections.c.L(var2)) {
               return var2[var1];
            } else {
               val var3: StringBuilder = new StringBuilder();
               var3.append("Unknown item type: ");
               var3.append(var1);
               throw new IllegalArgumentException(var3.toString());
            }
         }
      }
   }

   public data class PremiumInlineRoadblockFooter(id: String) : EmojiPickerItem {
      public final val id: String

      init {
         q.h(var1, "id");
         super(null);
         this.id = var1;
      }

      public operator fun component1(): String {
         return this.id;
      }

      public fun copy(id: String = var0.id): com.discord.emoji_picker.EmojiPickerItem.PremiumInlineRoadblockFooter {
         q.h(var1, "id");
         return new EmojiPickerItem.PremiumInlineRoadblockFooter(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerItem.PremiumInlineRoadblockFooter) {
            return false;
         } else {
            return q.c(this.id, (var1 as EmojiPickerItem.PremiumInlineRoadblockFooter).id);
         }
      }

      public override fun hashCode(): Int {
         return this.id.hashCode();
      }

      public override fun itemId(): Long {
         return IdUtilsKt.convertToId(this.id);
      }

      public override fun itemType(): Int {
         return EmojiPickerItem.ItemType.PREMIUM_INLINE_ROADBLOCK_FOOTER.ordinal();
      }

      public override fun toString(): String {
         val var1: java.lang.String = this.id;
         val var2: StringBuilder = new StringBuilder();
         var2.append("PremiumInlineRoadblockFooter(id=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }

   public data class PremiumInlineRoadblockHeader(id: String) : EmojiPickerItem {
      public final val id: String

      init {
         q.h(var1, "id");
         super(null);
         this.id = var1;
      }

      public operator fun component1(): String {
         return this.id;
      }

      public fun copy(id: String = var0.id): com.discord.emoji_picker.EmojiPickerItem.PremiumInlineRoadblockHeader {
         q.h(var1, "id");
         return new EmojiPickerItem.PremiumInlineRoadblockHeader(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerItem.PremiumInlineRoadblockHeader) {
            return false;
         } else {
            return q.c(this.id, (var1 as EmojiPickerItem.PremiumInlineRoadblockHeader).id);
         }
      }

      public override fun hashCode(): Int {
         return this.id.hashCode();
      }

      public override fun itemId(): Long {
         return IdUtilsKt.convertToId(this.id);
      }

      public override fun itemType(): Int {
         return EmojiPickerItem.ItemType.PREMIUM_INLINE_ROADBLOCK_HEADER.ordinal();
      }

      public override fun toString(): String {
         val var2: java.lang.String = this.id;
         val var1: StringBuilder = new StringBuilder();
         var1.append("PremiumInlineRoadblockHeader(id=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }
   }

   public data class Spacer(id: String, height: Int) : EmojiPickerItem {
      public final val height: Int
      public final val id: String

      init {
         q.h(var1, "id");
         super(null);
         this.id = var1;
         this.height = var2;
      }

      public operator fun component1(): String {
         return this.id;
      }

      public operator fun component2(): Int {
         return this.height;
      }

      public fun copy(id: String = var0.id, height: Int = var0.height): com.discord.emoji_picker.EmojiPickerItem.Spacer {
         q.h(var1, "id");
         return new EmojiPickerItem.Spacer(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerItem.Spacer) {
            return false;
         } else {
            var1 = var1;
            if (!q.c(this.id, var1.id)) {
               return false;
            } else {
               return this.height == var1.height;
            }
         }
      }

      public override fun hashCode(): Int {
         return this.id.hashCode() * 31 + Integer.hashCode(this.height);
      }

      public override fun itemId(): Long {
         return IdUtilsKt.convertToId(this.id);
      }

      public override fun itemType(): Int {
         return EmojiPickerItem.ItemType.SPACER.ordinal();
      }

      public override fun toString(): String {
         val var2: java.lang.String = this.id;
         val var1: Int = this.height;
         val var3: StringBuilder = new StringBuilder();
         var3.append("Spacer(id=");
         var3.append(var2);
         var3.append(", height=");
         var3.append(var1);
         var3.append(")");
         return var3.toString();
      }
   }
}
