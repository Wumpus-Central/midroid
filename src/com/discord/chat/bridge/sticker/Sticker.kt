package com.discord.chat.bridge.sticker

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
import ba.Y
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
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
   public final val accessibilityLabel: String
   public final val asset: String
   public final val formatType: StickerFormatType
   public final val height: Int?
   public final val id: Long
   public final val name: String
   public final val renderMode: Int
   public final val url: String
   public final val width: Int?

   init {
      q.h(var3, "formatType");
      q.h(var4, "name");
      q.h(var5, "asset");
      q.h(var6, "url");
      q.h(var10, "accessibilityLabel");
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
      q.h(var3, "formatType");
      q.h(var4, "name");
      q.h(var5, "asset");
      q.h(var6, "url");
      q.h(var10, "accessibilityLabel");
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
         } else if (!q.c(this.name, var1.name)) {
            return false;
         } else if (!q.c(this.asset, var1.asset)) {
            return false;
         } else if (!q.c(this.url, var1.url)) {
            return false;
         } else if (!q.c(this.width, var1.width)) {
            return false;
         } else if (!q.c(this.height, var1.height)) {
            return false;
         } else if (this.renderMode != var1.renderMode) {
            return false;
         } else {
            return q.c(this.accessibilityLabel, var1.accessibilityLabel);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = java.lang.Long.hashCode(this.id);
      val var4: Int = this.formatType.hashCode();
      val var7: Int = this.name.hashCode();
      val var5: Int = this.asset.hashCode();
      val var3: Int = this.url.hashCode();
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

      return (((((((var6 * 31 + var4) * 31 + var7) * 31 + var5) * 31 + var3) * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.renderMode)) * 31
         + this.accessibilityLabel.hashCode();
   }

   public override fun toString(): String {
      val var2: Long = this.id;
      val var8: StickerFormatType = this.formatType;
      val var10: java.lang.String = this.name;
      val var11: java.lang.String = this.asset;
      val var5: java.lang.String = this.url;
      val var4: Int = this.width;
      val var9: Int = this.height;
      val var1: Int = this.renderMode;
      val var7: java.lang.String = this.accessibilityLabel;
      val var6: StringBuilder = new StringBuilder();
      var6.append("Sticker(id=");
      var6.append(var2);
      var6.append(", formatType=");
      var6.append(var8);
      var6.append(", name=");
      var6.append(var10);
      var6.append(", asset=");
      var6.append(var11);
      var6.append(", url=");
      var6.append(var5);
      var6.append(", width=");
      var6.append(var4);
      var6.append(", height=");
      var6.append(var9);
      var6.append(", renderMode=");
      var6.append(var1);
      var6.append(", accessibilityLabel=");
      var6.append(var7);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: Sticker.$serializer = new Sticker.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.sticker.Sticker", var0, 9);
         var1.l("id", false);
         var1.l("format_type", false);
         var1.l("name", false);
         var1.l("asset", false);
         var1.l("url", false);
         var1.l("width", true);
         var1.l("height", true);
         var1.l("renderMode", false);
         var1.l("accessibilityLabel", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: N = N.a;
         return new KSerializer[]{Y.a, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, C0.a, C0.a, C0.a, a.u(N.a), a.u(var3), var3, C0.a};
      }

      public open fun deserialize(decoder: Decoder): Sticker {
         q.h(var1, "decoder");
         val var16: SerialDescriptor = this.getDescriptor();
         val var17: c = var1.c(var16);
         var var2: Int;
         var var3: Int;
         var var6: Long;
         var var8: Any;
         var var9: java.lang.String;
         var var11: Any;
         var var12: java.lang.String;
         val var13: java.lang.String;
         val var19: Int;
         var var23: java.lang.String;
         if (var17.y()) {
            var6 = var17.h(var16, 0);
            val var10: StickerFormatType = var17.m(var16, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, null) as StickerFormatType;
            val var14: java.lang.String = var17.t(var16, 2);
            var12 = var17.t(var16, 3);
            var13 = var17.t(var16, 4);
            val var18: N = N.a;
            var8 = var17.v(var16, 5, N.a, null) as Int;
            var19 = var17.v(var16, 6, var18, null) as Int;
            var3 = var17.k(var16, 7);
            var9 = var17.t(var16, 8);
            var2 = 511;
            var11 = var10;
            var23 = var14;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var var25: Int = null;
            var9 = null;
            var8 = null;
            var var20: java.lang.String = null;
            var6 = 0L;
            var11 = null;
            var23 = null;
            var12 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var17.x(var16);
               switch (var5) {
                  case -1:
                     var4 = false;
                     break;
                  case 0:
                     var6 = var17.h(var16, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var11 = var17.m(var16, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, var11) as StickerFormatType;
                     var2 |= 2;
                     break;
                  case 2:
                     var23 = var17.t(var16, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var9 = var17.t(var16, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var8 = var17.t(var16, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var12 = var17.v(var16, 5, N.a, var12) as Int;
                     var2 |= 32;
                     break;
                  case 6:
                     var25 = var17.v(var16, 6, N.a, var25) as Int;
                     var2 |= 64;
                     break;
                  case 7:
                     var3 = var17.k(var16, 7);
                     var2 |= 128;
                     break;
                  case 8:
                     var20 = var17.t(var16, 8);
                     var2 |= 256;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var9 = var20;
            var19 = var25;
            var8 = var12;
            var13 = (java.lang.String)var8;
            var12 = var9;
         }

         var17.b(var16);
         return new Sticker(var2, var6, (StickerFormatType)var11, var23, var12, var13, (Integer)var8, var19, var3, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: Sticker) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         Sticker.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Sticker> {
         return Sticker.$serializer.INSTANCE;
      }
   }
}
