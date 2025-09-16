package com.discord.sticker_picker

import G9.a
import kotlin.enums.EnumEntries

internal data class StickerPickerRow(rowContentWidth: Double,
   rowContentPaddingVertical: Int,
   itemSize: Int,
   items: List<com.discord.sticker_picker.StickerPickerRow.Sticker?>
) {
   public final val rowContentWidth: Double
   public final val rowContentPaddingVertical: Int
   public final val itemSize: Int
   public final val items: List<com.discord.sticker_picker.StickerPickerRow.Sticker?>

   init {
      this.rowContentWidth = var1;
      this.rowContentPaddingVertical = var3;
      this.itemSize = var4;
      this.items = var5;
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

   public operator fun component4(): List<com.discord.sticker_picker.StickerPickerRow.Sticker?> {
      return this.items;
   }

   public fun copy(
      rowContentWidth: Double = var0.rowContentWidth,
      rowContentPaddingVertical: Int = var0.rowContentPaddingVertical,
      itemSize: Int = var0.itemSize,
      items: List<com.discord.sticker_picker.StickerPickerRow.Sticker?> = var0.items
   ): StickerPickerRow {
      return new StickerPickerRow(var1, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StickerPickerRow) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Double.compare(this.rowContentWidth, var1.rowContentWidth) != 0) {
            return false;
         } else if (this.rowContentPaddingVertical != var1.rowContentPaddingVertical) {
            return false;
         } else if (this.itemSize != var1.itemSize) {
            return false;
         } else {
            return this.items == var1.items;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((java.lang.Double.hashCode(this.rowContentWidth) * 31 + Integer.hashCode(this.rowContentPaddingVertical)) * 31 + Integer.hashCode(this.itemSize))
            * 31
         + this.items.hashCode();
   }

   public override fun toString(): String {
      val var1: Double = this.rowContentWidth;
      val var4: Int = this.rowContentPaddingVertical;
      val var3: Int = this.itemSize;
      val var5: java.util.List = this.items;
      val var6: StringBuilder = new StringBuilder();
      var6.append("StickerPickerRow(rowContentWidth=");
      var6.append(var1);
      var6.append(", rowContentPaddingVertical=");
      var6.append(var4);
      var6.append(", itemSize=");
      var6.append(var3);
      var6.append(", items=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public data class Sticker(id: String,
      name: String,
      type: com.discord.sticker_picker.StickerPickerRow.Sticker.Type,
      animated: Boolean,
      url: String,
      disabled: Boolean,
      opaque: Boolean
   ) {
      public final val id: String
      public final val name: String
      public final val type: com.discord.sticker_picker.StickerPickerRow.Sticker.Type
      public final val animated: Boolean
      public final val url: String
      public final val disabled: Boolean
      public final val opaque: Boolean

      init {
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
         return new StickerPickerRow.Sticker(var1, var2, var3, var4, var5, var6, var7);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is StickerPickerRow.Sticker) {
            return false;
         } else {
            var1 = var1;
            if (!(this.id == var1.id)) {
               return false;
            } else if (!(this.name == var1.name)) {
               return false;
            } else if (this.type != var1.type) {
               return false;
            } else if (this.animated != var1.animated) {
               return false;
            } else if (!(this.url == var1.url)) {
               return false;
            } else if (this.disabled != var1.disabled) {
               return false;
            } else {
               return this.opaque == var1.opaque;
            }
         }
      }

      public override fun hashCode(): Int {
         return (
                  (
                           (((this.id.hashCode() * 31 + this.name.hashCode()) * 31 + this.type.hashCode()) * 31 + java.lang.Boolean.hashCode(this.animated))
                                 * 31
                              + this.url.hashCode()
                        )
                        * 31
                     + java.lang.Boolean.hashCode(this.disabled)
               )
               * 31
            + java.lang.Boolean.hashCode(this.opaque);
      }

      public override fun toString(): String {
         val var7: java.lang.String = this.id;
         val var4: java.lang.String = this.name;
         val var8: StickerPickerRow.Sticker.Type = this.type;
         val var2: Boolean = this.animated;
         val var6: java.lang.String = this.url;
         val var3: Boolean = this.disabled;
         val var1: Boolean = this.opaque;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Sticker(id=");
         var5.append(var7);
         var5.append(", name=");
         var5.append(var4);
         var5.append(", type=");
         var5.append(var8);
         var5.append(", animated=");
         var5.append(var2);
         var5.append(", url=");
         var5.append(var6);
         var5.append(", disabled=");
         var5.append(var3);
         var5.append(", opaque=");
         var5.append(var1);
         var5.append(")");
         return var5.toString();
      }

      public enum class Type {
         APNG,
         GIF,
         LOTTIE,
         PNG         @JvmStatic
         private EnumEntries $ENTRIES;
         @JvmStatic
         private StickerPickerRow.Sticker.Type[] $VALUES;

         @JvmStatic
         fun {
            val var0: Array<StickerPickerRow.Sticker.Type> = $values();
            $VALUES = var0;
            $ENTRIES = a.a(var0);
         }

         @JvmStatic
         fun getEntries(): EnumEntries {
            return $ENTRIES;
         }
      }
   }
}
