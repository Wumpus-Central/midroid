package com.discord.chat.bridge.sticker

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.n0
import qn.x0

@f
public data class Sticker(id: Long,
   formatType: StickerFormatType,
   name: String,
   asset: String,
   url: String,
   width: Int? = null,
   height: Int? = null,
   renderMode: Int
) {
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
      super();
      this.id = var1;
      this.formatType = var3;
      this.name = var4;
      this.asset = var5;
      this.url = var6;
      this.width = var7;
      this.height = var8;
      this.renderMode = var9;
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

   public fun copy(
      id: Long = var0.id,
      formatType: StickerFormatType = var0.formatType,
      name: String = var0.name,
      asset: String = var0.asset,
      url: String = var0.url,
      width: Int? = var0.width,
      height: Int? = var0.height,
      renderMode: Int = var0.renderMode
   ): Sticker {
      q.h(var3, "formatType");
      q.h(var4, "name");
      q.h(var5, "asset");
      q.h(var6, "url");
      return new Sticker(var1, var3, var4, var5, var6, var7, var8, var9);
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
         } else {
            return this.renderMode == var1.renderMode;
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = java.lang.Long.hashCode(this.id);
      val var4: Int = this.formatType.hashCode();
      val var3: Int = this.name.hashCode();
      val var5: Int = this.asset.hashCode();
      val var6: Int = this.url.hashCode();
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

      return ((((((var7 * 31 + var4) * 31 + var3) * 31 + var5) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.renderMode);
   }

   public override fun toString(): String {
      val var2: Long = this.id;
      val var8: StickerFormatType = this.formatType;
      val var9: java.lang.String = this.name;
      val var6: java.lang.String = this.asset;
      val var4: java.lang.String = this.url;
      val var10: Int = this.width;
      val var7: Int = this.height;
      val var1: Int = this.renderMode;
      val var5: StringBuilder = new StringBuilder();
      var5.append("Sticker(id=");
      var5.append(var2);
      var5.append(", formatType=");
      var5.append(var8);
      var5.append(", name=");
      var5.append(var9);
      var5.append(", asset=");
      var5.append(var6);
      var5.append(", url=");
      var5.append(var4);
      var5.append(", width=");
      var5.append(var10);
      var5.append(", height=");
      var5.append(var7);
      var5.append(", renderMode=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: Sticker.$serializer = new Sticker.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.sticker.Sticker", var0, 8);
         var1.c("id", false);
         var1.c("format_type", false);
         var1.c("name", false);
         var1.c("asset", false);
         var1.c("url", false);
         var1.c("width", true);
         var1.c("height", true);
         var1.c("renderMode", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var4: n0 = n0.a;
         return new KSerializer[]{x0.a, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, b2.a, b2.a, b2.a, a.u(n0.a), a.u(var4), var4};
      }

      public open fun deserialize(decoder: Decoder): Sticker {
         q.h(var1, "decoder");
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.b(var15);
         var var3: Int;
         val var4: Int;
         var var6: Long;
         var var8: Any;
         var var9: java.lang.String;
         var var10: Any;
         var var11: java.lang.String;
         val var12: java.lang.String;
         val var18: Int;
         if (var16.p()) {
            var6 = var16.f(var15, 0);
            var10 = var16.y(var15, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, null) as StickerFormatType;
            var9 = var16.m(var15, 2);
            var11 = var16.m(var15, 3);
            var12 = var16.m(var15, 4);
            val var17: n0 = n0.a;
            var8 = var16.n(var15, 5, n0.a, null) as Int;
            var18 = var16.n(var15, 6, var17, null) as Int;
            val var2: Int = var16.i(var15, 7);
            var4 = 255;
            var3 = var2;
         } else {
            var var21: Boolean = true;
            var3 = 0;
            var var24: Int = null;
            var8 = null;
            var var19: java.lang.String = null;
            var6 = 0L;
            var10 = null;
            var9 = null;
            var11 = null;
            var var20: Int = 0;

            while (var21) {
               val var5: Int = var16.o(var15);
               switch (var5) {
                  case -1:
                     var21 = false;
                     break;
                  case 0:
                     var6 = var16.f(var15, 0);
                     var20 |= 1;
                     break;
                  case 1:
                     var10 = var16.y(var15, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, var10) as StickerFormatType;
                     var20 |= 2;
                     break;
                  case 2:
                     var9 = var16.m(var15, 2);
                     var20 |= 4;
                     break;
                  case 3:
                     var8 = var16.m(var15, 3);
                     var20 |= 8;
                     break;
                  case 4:
                     var19 = var16.m(var15, 4);
                     var20 |= 16;
                     break;
                  case 5:
                     var11 = var16.n(var15, 5, n0.a, var11) as Int;
                     var20 |= 32;
                     break;
                  case 6:
                     var24 = var16.n(var15, 6, n0.a, var24) as Int;
                     var20 |= 64;
                     break;
                  case 7:
                     var3 = var16.i(var15, 7);
                     var20 |= 128;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var18 = var24;
            var8 = var11;
            var12 = var19;
            var11 = (java.lang.String)var8;
            var4 = var20;
         }

         var16.c(var15);
         return new Sticker(var4, var6, (StickerFormatType)var10, var9, var11, var12, (Integer)var8, var18, var3, null);
      }

      public open fun serialize(encoder: Encoder, value: Sticker) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         Sticker.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Sticker> {
         return Sticker.$serializer.INSTANCE;
      }
   }
}
