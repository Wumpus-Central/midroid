package com.discord.sticker_picker

import kotlin.jvm.internal.r

internal data class StickerPickerRow(rowContentWidth: Int,
   rowContentPaddingVertical: Int,
   itemSize: Int,
   items: List<com.discord.sticker_picker.StickerPickerRow.Sticker?>
) {
   public final val itemSize: Int
   public final val items: List<com.discord.sticker_picker.StickerPickerRow.Sticker?>
   public final val rowContentPaddingVertical: Int
   public final val rowContentWidth: Int

   init {
      r.h(var4, "items");
      super();
      this.rowContentWidth = var1;
      this.rowContentPaddingVertical = var2;
      this.itemSize = var3;
      this.items = var4;
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

   public operator fun component4(): List<com.discord.sticker_picker.StickerPickerRow.Sticker?> {
      return this.items;
   }

   public fun copy(
      rowContentWidth: Int = var0.rowContentWidth,
      rowContentPaddingVertical: Int = var0.rowContentPaddingVertical,
      itemSize: Int = var0.itemSize,
      items: List<com.discord.sticker_picker.StickerPickerRow.Sticker?> = var0.items
   ): StickerPickerRow {
      r.h(var4, "items");
      return new StickerPickerRow(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StickerPickerRow) {
         return false;
      } else {
         var1 = var1;
         if (this.rowContentWidth != var1.rowContentWidth) {
            return false;
         } else if (this.rowContentPaddingVertical != var1.rowContentPaddingVertical) {
            return false;
         } else if (this.itemSize != var1.itemSize) {
            return false;
         } else {
            return r.c(this.items, var1.items);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.rowContentWidth) * 31 + Integer.hashCode(this.rowContentPaddingVertical)) * 31 + Integer.hashCode(this.itemSize)) * 31
         + this.items.hashCode();
   }

   public override fun toString(): String {
      val var2: Int = this.rowContentWidth;
      val var1: Int = this.rowContentPaddingVertical;
      val var3: Int = this.itemSize;
      val var5: java.util.List = this.items;
      val var4: StringBuilder = new StringBuilder();
      var4.append("StickerPickerRow(rowContentWidth=");
      var4.append(var2);
      var4.append(", rowContentPaddingVertical=");
      var4.append(var1);
      var4.append(", itemSize=");
      var4.append(var3);
      var4.append(", items=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public data class Sticker(id: String,
      name: String,
      type: com.discord.sticker_picker.StickerPickerRow.Sticker.Type,
      animated: Boolean,
      url: String,
      disabled: Boolean,
      opaque: Boolean
   ) {
      public final val animated: Boolean
      public final val disabled: Boolean
      public final val id: String
      public final val name: String
      public final val opaque: Boolean
      public final val type: com.discord.sticker_picker.StickerPickerRow.Sticker.Type
      public final val url: String

      init {
         r.h(var1, "id");
         r.h(var2, "name");
         r.h(var3, "type");
         r.h(var5, "url");
         super();
         this.id = var1;
         this.name = var2;
         this.type = var3;
         this.animated = var4;
         this.url = var5;
         this.disabled = var6;
         this.opaque = var7;
      }

      public operator fun component1(): String {
         return this.id;
      }

      public operator fun component2(): String {
         return this.name;
      }

      public operator fun component3(): com.discord.sticker_picker.StickerPickerRow.Sticker.Type {
         return this.type;
      }

      public operator fun component4(): Boolean {
         return this.animated;
      }

      public operator fun component5(): String {
         return this.url;
      }

      public operator fun component6(): Boolean {
         return this.disabled;
      }

      public operator fun component7(): Boolean {
         return this.opaque;
      }

      public fun copy(
         id: String = var0.id,
         name: String = var0.name,
         type: com.discord.sticker_picker.StickerPickerRow.Sticker.Type = var0.type,
         animated: Boolean = var0.animated,
         url: String = var0.url,
         disabled: Boolean = var0.disabled,
         opaque: Boolean = var0.opaque
      ): com.discord.sticker_picker.StickerPickerRow.Sticker {
         r.h(var1, "id");
         r.h(var2, "name");
         r.h(var3, "type");
         r.h(var5, "url");
         return new StickerPickerRow.Sticker(var1, var2, var3, var4, var5, var6, var7);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is StickerPickerRow.Sticker) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.id, var1.id)) {
               return false;
            } else if (!r.c(this.name, var1.name)) {
               return false;
            } else if (this.type != var1.type) {
               return false;
            } else if (this.animated != var1.animated) {
               return false;
            } else if (!r.c(this.url, var1.url)) {
               return false;
            } else if (this.disabled != var1.disabled) {
               return false;
            } else {
               return this.opaque == var1.opaque;
            }
         }
      }

      public override fun hashCode(): Int {
         val var6: Int = this.id.hashCode();
         val var5: Int = this.name.hashCode();
         val var7: Int = this.type.hashCode();
         var var3: Byte = 1;
         var var1: Byte = this.animated;
         if (this.animated != 0) {
            var1 = 1;
         }

         val var8: Int = this.url.hashCode();
         var var9: Byte = this.disabled;
         if (this.disabled != 0) {
            var9 = 1;
         }

         if (this.opaque == 0) {
            var3 = this.opaque;
         }

         return (((((var6 * 31 + var5) * 31 + var7) * 31 + var1) * 31 + var8) * 31 + var9) * 31 + var3;
      }

      public override fun toString(): String {
         val var4: java.lang.String = this.id;
         val var7: java.lang.String = this.name;
         val var5: StickerPickerRow.Sticker.Type = this.type;
         val var2: Boolean = this.animated;
         val var8: java.lang.String = this.url;
         val var3: Boolean = this.disabled;
         val var1: Boolean = this.opaque;
         val var6: StringBuilder = new StringBuilder();
         var6.append("Sticker(id=");
         var6.append(var4);
         var6.append(", name=");
         var6.append(var7);
         var6.append(", type=");
         var6.append(var5);
         var6.append(", animated=");
         var6.append(var2);
         var6.append(", url=");
         var6.append(var8);
         var6.append(", disabled=");
         var6.append(var3);
         var6.append(", opaque=");
         var6.append(var1);
         var6.append(")");
         return var6.toString();
      }

      public enum class Type {
         APNG,
         GIF,
         LOTTIE,
         PNG         @JvmStatic
         private StickerPickerRow.Sticker.Type[] $VALUES = $values();
      }
   }
}
