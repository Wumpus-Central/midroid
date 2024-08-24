package com.discord.chat.bridge.sticker

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.m0
import xk.w0

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
      r.h(var3, "formatType");
      r.h(var4, "name");
      r.h(var5, "asset");
      r.h(var6, "url");
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

   @JvmStatic
   public fun `write$Self`(self: Sticker, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.E(var2, 0, var0.id);
      var1.y(var2, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, var0.formatType);
      var1.z(var2, 2, var0.name);
      var1.z(var2, 3, var0.asset);
      var1.z(var2, 4, var0.url);
      var var3: Boolean;
      if (!var1.A(var2, 5) && var0.width == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, m0.a, var0.width);
      }

      label24: {
         if (!var1.A(var2, 6)) {
            var3 = false;
            if (var0.height == null) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, m0.a, var0.height);
      }

      var1.w(var2, 7, var0.renderMode);
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
      r.h(var3, "formatType");
      r.h(var4, "name");
      r.h(var5, "asset");
      r.h(var6, "url");
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
         } else if (!r.c(this.name, var1.name)) {
            return false;
         } else if (!r.c(this.asset, var1.asset)) {
            return false;
         } else if (!r.c(this.url, var1.url)) {
            return false;
         } else if (!r.c(this.width, var1.width)) {
            return false;
         } else if (!r.c(this.height, var1.height)) {
            return false;
         } else {
            return this.renderMode == var1.renderMode;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = java.lang.Long.hashCode(this.id);
      val var3: Int = this.formatType.hashCode();
      val var7: Int = this.name.hashCode();
      val var4: Int = this.asset.hashCode();
      val var5: Int = this.url.hashCode();
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

      return ((((((var6 * 31 + var3) * 31 + var7) * 31 + var4) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.renderMode);
   }

   public override fun toString(): String {
      val var2: Long = this.id;
      val var10: StickerFormatType = this.formatType;
      val var5: java.lang.String = this.name;
      val var6: java.lang.String = this.asset;
      val var9: java.lang.String = this.url;
      val var7: Int = this.width;
      val var8: Int = this.height;
      val var1: Int = this.renderMode;
      val var4: StringBuilder = new StringBuilder();
      var4.append("Sticker(id=");
      var4.append(var2);
      var4.append(", formatType=");
      var4.append(var10);
      var4.append(", name=");
      var4.append(var5);
      var4.append(", asset=");
      var4.append(var6);
      var4.append(", url=");
      var4.append(var9);
      var4.append(", width=");
      var4.append(var7);
      var4.append(", height=");
      var4.append(var8);
      var4.append(", renderMode=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<Sticker> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: Sticker.$serializer = new Sticker.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.sticker.Sticker", var0, 8);
         var1.l("id", false);
         var1.l("format_type", false);
         var1.l("name", false);
         var1.l("asset", false);
         var1.l("url", false);
         var1.l("width", true);
         var1.l("height", true);
         var1.l("renderMode", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: m0 = m0.a;
         return new KSerializer[]{w0.a, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, a2.a, a2.a, a2.a, a.u(m0.a), a.u(var3), var3};
      }

      public open fun deserialize(decoder: Decoder): Sticker {
         r.h(var1, "decoder");
         val var13: SerialDescriptor = this.getDescriptor();
         val var14: c = var1.b(var13);
         var var2: Int;
         var var3: Int;
         var var6: Long;
         var var8: java.lang.String;
         var var9: Any;
         var var11: java.lang.String;
         var var12: Any;
         var var15: java.lang.String;
         var var16: Any;
         if (var14.p()) {
            var6 = var14.f(var13, 0);
            var12 = var14.y(var13, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, null);
            var11 = var14.m(var13, 2);
            var8 = var14.m(var13, 3);
            var15 = var14.m(var13, 4);
            var16 = m0.a;
            var9 = var14.n(var13, 5, m0.a, null);
            var16 = var14.n(var13, 6, (DeserializationStrategy)var16, null);
            var3 = var14.i(var13, 7);
            var2 = 255;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var16 = null;
            var8 = null;
            var15 = null;
            var6 = 0L;
            var12 = null;
            var11 = null;
            var9 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var14.o(var13);
               switch (var5) {
                  case -1:
                     var4 = false;
                     break;
                  case 0:
                     var6 = var14.f(var13, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var12 = var14.y(var13, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, var12);
                     var2 |= 2;
                     break;
                  case 2:
                     var11 = var14.m(var13, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var8 = var14.m(var13, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var15 = var14.m(var13, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var9 = var14.n(var13, 5, m0.a, var9);
                     var2 |= 32;
                     break;
                  case 6:
                     var16 = var14.n(var13, 6, m0.a, var16);
                     var2 |= 64;
                     break;
                  case 7:
                     var3 = var14.i(var13, 7);
                     var2 |= 128;
                     break;
                  default:
                     throw new n(var5);
               }
            }
         }

         var14.c(var13);
         return new Sticker(var2, var6, var12 as StickerFormatType, var11, var8, var15, var9 as Integer, var16 as Integer, var3, null);
      }

      public open fun serialize(encoder: Encoder, value: Sticker) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         Sticker.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Sticker> {
         return Sticker.$serializer.INSTANCE;
      }
   }
}
