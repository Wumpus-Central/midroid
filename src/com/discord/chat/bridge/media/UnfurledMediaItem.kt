package com.discord.chat.bridge.media

import kotlin.jvm.internal.r
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

@f
public data class UnfurledMediaItem(url: String,
   proxyUrl: String,
   height: Int,
   width: Int,
   contentType: String,
   placeholder: String? = null,
   placeholderVersion: Int? = null,
   contentScanMetadata: ContentScanMetadata? = null
) {
   public final val contentScanMetadata: ContentScanMetadata?
   public final val contentType: String
   public final val height: Int
   public final val placeholder: String?
   public final val placeholderVersion: Int?
   public final val proxyUrl: String
   public final val url: String
   public final val width: Int

   init {
      r.h(var1, "url");
      r.h(var2, "proxyUrl");
      r.h(var5, "contentType");
      super();
      this.url = var1;
      this.proxyUrl = var2;
      this.height = var3;
      this.width = var4;
      this.contentType = var5;
      this.placeholder = var6;
      this.placeholderVersion = var7;
      this.contentScanMetadata = var8;
   }

   @JvmStatic
   public fun `write$Self`(self: UnfurledMediaItem, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.url);
      var1.z(var2, 1, var0.proxyUrl);
      var1.w(var2, 2, var0.height);
      var1.w(var2, 3, var0.width);
      var1.z(var2, 4, var0.contentType);
      var var3: Boolean;
      if (!var1.A(var2, 5) && var0.placeholder == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, a2.a, var0.placeholder);
      }

      if (!var1.A(var2, 6) && var0.placeholderVersion == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, m0.a, var0.placeholderVersion);
      }

      label32: {
         if (!var1.A(var2, 7)) {
            var3 = false;
            if (var0.contentScanMetadata == null) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 7, ContentScanMetadata.$serializer.INSTANCE, var0.contentScanMetadata);
      }
   }

   public operator fun component1(): String {
      return this.url;
   }

   public operator fun component2(): String {
      return this.proxyUrl;
   }

   public operator fun component3(): Int {
      return this.height;
   }

   public operator fun component4(): Int {
      return this.width;
   }

   public operator fun component5(): String {
      return this.contentType;
   }

   public operator fun component6(): String? {
      return this.placeholder;
   }

   public operator fun component7(): Int? {
      return this.placeholderVersion;
   }

   public operator fun component8(): ContentScanMetadata? {
      return this.contentScanMetadata;
   }

   public fun copy(
      url: String = var0.url,
      proxyUrl: String = var0.proxyUrl,
      height: Int = var0.height,
      width: Int = var0.width,
      contentType: String = var0.contentType,
      placeholder: String? = var0.placeholder,
      placeholderVersion: Int? = var0.placeholderVersion,
      contentScanMetadata: ContentScanMetadata? = var0.contentScanMetadata
   ): UnfurledMediaItem {
      r.h(var1, "url");
      r.h(var2, "proxyUrl");
      r.h(var5, "contentType");
      return new UnfurledMediaItem(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnfurledMediaItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.url, var1.url)) {
            return false;
         } else if (!r.c(this.proxyUrl, var1.proxyUrl)) {
            return false;
         } else if (this.height != var1.height) {
            return false;
         } else if (this.width != var1.width) {
            return false;
         } else if (!r.c(this.contentType, var1.contentType)) {
            return false;
         } else if (!r.c(this.placeholder, var1.placeholder)) {
            return false;
         } else if (!r.c(this.placeholderVersion, var1.placeholderVersion)) {
            return false;
         } else {
            return r.c(this.contentScanMetadata, var1.contentScanMetadata);
         }
      }
   }

   public override fun hashCode(): Int {
      val var8: Int = this.url.hashCode();
      val var6: Int = this.proxyUrl.hashCode();
      val var5: Int = Integer.hashCode(this.height);
      val var4: Int = Integer.hashCode(this.width);
      val var7: Int = this.contentType.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.placeholder == null) {
         var1 = 0;
      } else {
         var1 = this.placeholder.hashCode();
      }

      val var2: Int;
      if (this.placeholderVersion == null) {
         var2 = 0;
      } else {
         var2 = this.placeholderVersion.hashCode();
      }

      if (this.contentScanMetadata != null) {
         var3 = this.contentScanMetadata.hashCode();
      }

      return ((((((var8 * 31 + var6) * 31 + var5) * 31 + var4) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.url;
      val var6: java.lang.String = this.proxyUrl;
      val var2: Int = this.height;
      val var1: Int = this.width;
      val var8: java.lang.String = this.contentType;
      val var9: java.lang.String = this.placeholder;
      val var3: Int = this.placeholderVersion;
      val var5: ContentScanMetadata = this.contentScanMetadata;
      val var7: StringBuilder = new StringBuilder();
      var7.append("UnfurledMediaItem(url=");
      var7.append(var4);
      var7.append(", proxyUrl=");
      var7.append(var6);
      var7.append(", height=");
      var7.append(var2);
      var7.append(", width=");
      var7.append(var1);
      var7.append(", contentType=");
      var7.append(var8);
      var7.append(", placeholder=");
      var7.append(var9);
      var7.append(", placeholderVersion=");
      var7.append(var3);
      var7.append(", contentScanMetadata=");
      var7.append(var5);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : f0<UnfurledMediaItem> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UnfurledMediaItem.$serializer = new UnfurledMediaItem.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.media.UnfurledMediaItem", var0, 8);
         var1.l("url", false);
         var1.l("proxyUrl", false);
         var1.l("height", false);
         var1.l("width", false);
         var1.l("contentType", false);
         var1.l("placeholder", true);
         var1.l("placeholderVersion", true);
         var1.l("contentScanMetadata", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: m0 = m0.a;
         return new KSerializer[]{a2.a, a2.a, m0.a, m0.a, a2.a, a.u(a2.a), a.u(var2), a.u(ContentScanMetadata.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): UnfurledMediaItem {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var7: Any;
         var var8: Any;
         var var9: Any;
         var var10: Any;
         var var11: Any;
         var var14: Any;
         if (var13.p()) {
            var8 = var13.m(var12, 0);
            var7 = var13.m(var12, 1);
            var3 = var13.i(var12, 2);
            val var2: Int = var13.i(var12, 3);
            var14 = var13.m(var12, 4);
            var9 = var13.n(var12, 5, a2.a, null);
            var10 = var13.n(var12, 6, m0.a, null);
            var11 = var13.n(var12, 7, ContentScanMetadata.$serializer.INSTANCE, null);
            var5 = 255;
            var4 = var2;
         } else {
            var var16: Boolean = true;
            var4 = 0;
            var var15: Int = 0;
            var11 = null;
            var10 = null;
            var8 = null;
            var7 = null;
            var14 = null;
            var9 = null;
            var3 = 0;

            while (var16) {
               val var6: Int = var13.o(var12);
               switch (var6) {
                  case -1:
                     var16 = false;
                     break;
                  case 0:
                     var8 = var13.m(var12, 0);
                     var15 |= 1;
                     break;
                  case 1:
                     var7 = var13.m(var12, 1);
                     var15 |= 2;
                     break;
                  case 2:
                     var3 = var13.i(var12, 2);
                     var15 |= 4;
                     break;
                  case 3:
                     var4 = var13.i(var12, 3);
                     var15 |= 8;
                     break;
                  case 4:
                     var14 = var13.m(var12, 4);
                     var15 |= 16;
                     break;
                  case 5:
                     var9 = var13.n(var12, 5, a2.a, var9);
                     var15 |= 32;
                     break;
                  case 6:
                     var10 = var13.n(var12, 6, m0.a, var10);
                     var15 |= 64;
                     break;
                  case 7:
                     var11 = var13.n(var12, 7, ContentScanMetadata.$serializer.INSTANCE, var11);
                     var15 |= 128;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var5 = var15;
         }

         var13.c(var12);
         return new UnfurledMediaItem(
            var5,
            (java.lang.String)var8,
            (java.lang.String)var7,
            var3,
            var4,
            (java.lang.String)var14,
            var9 as java.lang.String,
            var10 as Int,
            var11 as ContentScanMetadata,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: UnfurledMediaItem) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UnfurledMediaItem.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UnfurledMediaItem> {
         return UnfurledMediaItem.$serializer.INSTANCE;
      }
   }
}
