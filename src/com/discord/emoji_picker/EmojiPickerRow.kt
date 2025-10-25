package com.discord.emoji_picker

internal data class EmojiPickerRow(rowContentWidth: Double,
   rowContentPaddingVertical: Int,
   itemSize: Int,
   items: List<com.discord.emoji_picker.EmojiPickerRow.Emoji?>,
   isSectionNitroLocked: Boolean
) {
   public final val rowContentWidth: Double
   public final val rowContentPaddingVertical: Int
   public final val itemSize: Int
   public final val items: List<com.discord.emoji_picker.EmojiPickerRow.Emoji?>
   public final val isSectionNitroLocked: Boolean

   init {
      this.rowContentWidth = var1;
      this.rowContentPaddingVertical = var3;
      this.itemSize = var4;
      this.items = var5;
      this.isSectionNitroLocked = var6;
   }

   public operator fun component1(): Double {
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
      rowContentWidth: Double = var0.rowContentWidth,
      rowContentPaddingVertical: Int = var0.rowContentPaddingVertical,
      itemSize: Int = var0.itemSize,
      items: List<com.discord.emoji_picker.EmojiPickerRow.Emoji?> = var0.items,
      isSectionNitroLocked: Boolean = var0.isSectionNitroLocked
   ): EmojiPickerRow {
      return new EmojiPickerRow(var1, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmojiPickerRow) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Double.compare(this.rowContentWidth, var1.rowContentWidth) != 0) {
            return false;
         } else if (this.rowContentPaddingVertical != var1.rowContentPaddingVertical) {
            return false;
         } else if (this.itemSize != var1.itemSize) {
            return false;
         } else if (!(this.items == var1.items)) {
            return false;
         } else {
            return this.isSectionNitroLocked == var1.isSectionNitroLocked;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (java.lang.Double.hashCode(this.rowContentWidth) * 31 + Integer.hashCode(this.rowContentPaddingVertical)) * 31
                           + Integer.hashCode(this.itemSize)
                     )
                     * 31
                  + this.items.hashCode()
            )
            * 31
         + java.lang.Boolean.hashCode(this.isSectionNitroLocked);
   }

   public override fun toString(): String {
      val var1: Double = this.rowContentWidth;
      val var3: Int = this.rowContentPaddingVertical;
      val var4: Int = this.itemSize;
      val var6: java.util.List = this.items;
      val var5: Boolean = this.isSectionNitroLocked;
      val var7: StringBuilder = new StringBuilder();
      var7.append("EmojiPickerRow(rowContentWidth=");
      var7.append(var1);
      var7.append(", rowContentPaddingVertical=");
      var7.append(var3);
      var7.append(", itemSize=");
      var7.append(var4);
      var7.append(", items=");
      var7.append(var6);
      var7.append(", isSectionNitroLocked=");
      var7.append(var5);
      var7.append(")");
      return var7.toString();
   }

   public data class Emoji(id: String?, name: String, url: String, animated: Boolean, disabled: Boolean) {
      public final val id: String?
      public final val name: String
      public final val url: String
      public final val animated: Boolean
      public final val disabled: Boolean

      init {
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
         return new EmojiPickerRow.Emoji(var1, var2, var3, var4, var5);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerRow.Emoji) {
            return false;
         } else {
            var1 = var1;
            if (!(this.id == var1.id)) {
               return false;
            } else if (!(this.name == var1.name)) {
               return false;
            } else if (!(this.url == var1.url)) {
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

         return (((var1 * 31 + this.name.hashCode()) * 31 + this.url.hashCode()) * 31 + java.lang.Boolean.hashCode(this.animated)) * 31
            + java.lang.Boolean.hashCode(this.disabled);
      }

      public override fun toString(): String {
         val var5: java.lang.String = this.id;
         val var3: java.lang.String = this.name;
         val var4: java.lang.String = this.url;
         val var2: Boolean = this.animated;
         val var1: Boolean = this.disabled;
         val var6: StringBuilder = new StringBuilder();
         var6.append("Emoji(id=");
         var6.append(var5);
         var6.append(", name=");
         var6.append(var3);
         var6.append(", url=");
         var6.append(var4);
         var6.append(", animated=");
         var6.append(var2);
         var6.append(", disabled=");
         var6.append(var1);
         var6.append(")");
         return var6.toString();
      }
   }
}
