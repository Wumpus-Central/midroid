package com.discord.chat.bridge.sticker

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class Sticker(id: Long,
   formatType: StickerFormatType,
   name: String,
   asset: String,
   url: String,
   width: Int? = null,
   height: Int? = null,
   renderMode: Int,
   accessibilityLabel: String
) {
   public final val id: Long
   public final val formatType: StickerFormatType
   public final val name: String
   public final val asset: String
   public final val url: String
   public final val width: Int?
   public final val height: Int?
   public final val renderMode: Int
   public final val accessibilityLabel: String

   init {
      super();
      this.id = var1;
      this.formatType = var3;
      this.name = var4;
      this.asset = var5;
      this.url = var6;
      this.width = var7;
      this.height = var8;
      this.renderMode = var9;
      this.accessibilityLabel = var10;
   }

   public operator fun component1(): Long {
      return this.id;
   }

   public operator fun component2(): StickerFormatType {
      return this.formatType;
   }

   public operator fun component3(): String {
      return this.name;
   }

   public operator fun component4(): String {
      return this.asset;
   }

   public operator fun component5(): String {
      return this.url;
   }

   public operator fun component6(): Int? {
      return this.width;
   }

   public operator fun component7(): Int? {
      return this.height;
   }

   public operator fun component8(): Int {
      return this.renderMode;
   }

   public operator fun component9(): String {
      return this.accessibilityLabel;
   }

   public fun copy(
      id: Long = var0.id,
      formatType: StickerFormatType = var0.formatType,
      name: String = var0.name,
      asset: String = var0.asset,
      url: String = var0.url,
      width: Int? = var0.width,
      height: Int? = var0.height,
      renderMode: Int = var0.renderMode,
      accessibilityLabel: String = var0.accessibilityLabel
   ): Sticker {
      return new Sticker(var1, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Sticker) {
         return false;
      } else {
         var1 = var1;
         if (this.id != var1.id) {
            return false;
         } else if (this.formatType != var1.formatType) {
            return false;
         } else if (!(this.name == var1.name)) {
            return false;
         } else if (!(this.asset == var1.asset)) {
            return false;
         } else if (!(this.url == var1.url)) {
            return false;
         } else if (!(this.width == var1.width)) {
            return false;
         } else if (!(this.height == var1.height)) {
            return false;
         } else if (this.renderMode != var1.renderMode) {
            return false;
         } else {
            return this.accessibilityLabel == var1.accessibilityLabel;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = java.lang.Long.hashCode(this.id);
      val var5: Int = this.formatType.hashCode();
      val var3: Int = this.name.hashCode();
      val var7: Int = this.asset.hashCode();
      val var4: Int = this.url.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.width == null) {
         var1 = 0;
      } else {
         var1 = this.width.hashCode();
      }

      if (this.height != null) {
         var2 = this.height.hashCode();
      }

      return (((((((var6 * 31 + var5) * 31 + var3) * 31 + var7) * 31 + var4) * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.renderMode)) * 31
         + this.accessibilityLabel.hashCode();
   }

   public override fun toString(): String {
      val var2: Long = this.id;
      val var5: StickerFormatType = this.formatType;
      val var10: java.lang.String = this.name;
      val var4: java.lang.String = this.asset;
      val var6: java.lang.String = this.url;
      val var9: Int = this.width;
      val var7: Int = this.height;
      val var1: Int = this.renderMode;
      val var11: java.lang.String = this.accessibilityLabel;
      val var8: StringBuilder = new StringBuilder();
      var8.append("Sticker(id=");
      var8.append(var2);
      var8.append(", formatType=");
      var8.append(var5);
      var8.append(", name=");
      var8.append(var10);
      var8.append(", asset=");
      var8.append(var4);
      var8.append(", url=");
      var8.append(var6);
      var8.append(", width=");
      var8.append(var9);
      var8.append(", height=");
      var8.append(var7);
      var8.append(", renderMode=");
      var8.append(var1);
      var8.append(", accessibilityLabel=");
      var8.append(var11);
      var8.append(")");
      return var8.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<Sticker> {
         return Sticker.$serializer.INSTANCE;
      }
   }
}
