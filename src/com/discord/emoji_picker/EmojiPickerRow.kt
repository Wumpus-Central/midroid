package com.discord.emoji_picker

import kotlin.jvm.internal.r

internal data class EmojiPickerRow(rowContentWidth: Int,
   rowContentPaddingVertical: Int,
   itemSize: Int,
   items: List<com.discord.emoji_picker.EmojiPickerRow.Emoji?>,
   isSectionNitroLocked: Boolean
) {
   public final val isSectionNitroLocked: Boolean
   public final val itemSize: Int
   public final val items: List<com.discord.emoji_picker.EmojiPickerRow.Emoji?>
   public final val rowContentPaddingVertical: Int
   public final val rowContentWidth: Int

   init {
      r.h(var4, "items");
      super();
      this.rowContentWidth = var1;
      this.rowContentPaddingVertical = var2;
      this.itemSize = var3;
      this.items = var4;
      this.isSectionNitroLocked = var5;
   }

   public operator fun component1(): Int {
      return this.rowContentWidth;
   }

   public operator fun component2(): Int {
      return this.rowContentPaddingVertical;
   }

   public operator fun component3(): Int {
      return this.itemSize;
   }

   public operator fun component4(): List<com.discord.emoji_picker.EmojiPickerRow.Emoji?> {
      return this.items;
   }

   public operator fun component5(): Boolean {
      return this.isSectionNitroLocked;
   }

   public fun copy(
      rowContentWidth: Int = var0.rowContentWidth,
      rowContentPaddingVertical: Int = var0.rowContentPaddingVertical,
      itemSize: Int = var0.itemSize,
      items: List<com.discord.emoji_picker.EmojiPickerRow.Emoji?> = var0.items,
      isSectionNitroLocked: Boolean = var0.isSectionNitroLocked
   ): EmojiPickerRow {
      r.h(var4, "items");
      return new EmojiPickerRow(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmojiPickerRow) {
         return false;
      } else {
         var1 = var1;
         if (this.rowContentWidth != var1.rowContentWidth) {
            return false;
         } else if (this.rowContentPaddingVertical != var1.rowContentPaddingVertical) {
            return false;
         } else if (this.itemSize != var1.itemSize) {
            return false;
         } else if (!r.c(this.items, var1.items)) {
            return false;
         } else {
            return this.isSectionNitroLocked == var1.isSectionNitroLocked;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.rowContentWidth);
      val var6: Int = Integer.hashCode(this.rowContentPaddingVertical);
      val var4: Int = Integer.hashCode(this.itemSize);
      val var5: Int = this.items.hashCode();
      var var1: Byte = this.isSectionNitroLocked;
      if (this.isSectionNitroLocked != 0) {
         var1 = 1;
      }

      return (((var3 * 31 + var6) * 31 + var4) * 31 + var5) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Int = this.rowContentWidth;
      val var3: Int = this.rowContentPaddingVertical;
      val var2: Int = this.itemSize;
      val var6: java.util.List = this.items;
      val var4: Boolean = this.isSectionNitroLocked;
      val var5: StringBuilder = new StringBuilder();
      var5.append("EmojiPickerRow(rowContentWidth=");
      var5.append(var1);
      var5.append(", rowContentPaddingVertical=");
      var5.append(var3);
      var5.append(", itemSize=");
      var5.append(var2);
      var5.append(", items=");
      var5.append(var6);
      var5.append(", isSectionNitroLocked=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public data class Emoji(id: String?, name: String, url: String, animated: Boolean, disabled: Boolean) {
      public final val animated: Boolean
      public final val disabled: Boolean
      public final val id: String?
      public final val name: String
      public final val url: String

      init {
         r.h(var2, "name");
         r.h(var3, "url");
         super();
         this.id = var1;
         this.name = var2;
         this.url = var3;
         this.animated = var4;
         this.disabled = var5;
      }

      public operator fun component1(): String? {
         return this.id;
      }

      public operator fun component2(): String {
         return this.name;
      }

      public operator fun component3(): String {
         return this.url;
      }

      public operator fun component4(): Boolean {
         return this.animated;
      }

      public operator fun component5(): Boolean {
         return this.disabled;
      }

      public fun copy(
         id: String? = var0.id,
         name: String = var0.name,
         url: String = var0.url,
         animated: Boolean = var0.animated,
         disabled: Boolean = var0.disabled
      ): com.discord.emoji_picker.EmojiPickerRow.Emoji {
         r.h(var2, "name");
         r.h(var3, "url");
         return new EmojiPickerRow.Emoji(var1, var2, var3, var4, var5);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerRow.Emoji) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.id, var1.id)) {
               return false;
            } else if (!r.c(this.name, var1.name)) {
               return false;
            } else if (!r.c(this.url, var1.url)) {
               return false;
            } else if (this.animated != var1.animated) {
               return false;
            } else {
               return this.disabled == var1.disabled;
            }
         }
      }

      public override fun hashCode(): Int {
         val var1: Int;
         if (this.id == null) {
            var1 = 0;
         } else {
            var1 = this.id.hashCode();
         }

         val var5: Int = this.name.hashCode();
         val var6: Int = this.url.hashCode();
         var var3: Byte = 1;
         var var2: Byte = this.animated;
         if (this.animated != 0) {
            var2 = 1;
         }

         if (this.disabled == 0) {
            var3 = this.disabled;
         }

         return (((var1 * 31 + var5) * 31 + var6) * 31 + var2) * 31 + var3;
      }

      public override fun toString(): String {
         val var6: java.lang.String = this.id;
         val var5: java.lang.String = this.name;
         val var4: java.lang.String = this.url;
         val var1: Boolean = this.animated;
         val var2: Boolean = this.disabled;
         val var3: StringBuilder = new StringBuilder();
         var3.append("Emoji(id=");
         var3.append(var6);
         var3.append(", name=");
         var3.append(var5);
         var3.append(", url=");
         var3.append(var4);
         var3.append(", animated=");
         var3.append(var1);
         var3.append(", disabled=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }
}
