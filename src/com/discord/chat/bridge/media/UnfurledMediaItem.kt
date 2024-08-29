package com.discord.chat.bridge.media

import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import gn.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      q.h(var1, "url");
      q.h(var2, "proxyUrl");
      q.h(var5, "contentType");
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
      q.h(var1, "url");
      q.h(var2, "proxyUrl");
      q.h(var5, "contentType");
      return new UnfurledMediaItem(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnfurledMediaItem) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.url, var1.url)) {
            return false;
         } else if (!q.c(this.proxyUrl, var1.proxyUrl)) {
            return false;
         } else if (this.height != var1.height) {
            return false;
         } else if (this.width != var1.width) {
            return false;
         } else if (!q.c(this.contentType, var1.contentType)) {
            return false;
         } else if (!q.c(this.placeholder, var1.placeholder)) {
            return false;
         } else if (!q.c(this.placeholderVersion, var1.placeholderVersion)) {
            return false;
         } else {
            return q.c(this.contentScanMetadata, var1.contentScanMetadata);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = this.url.hashCode();
      val var6: Int = this.proxyUrl.hashCode();
      val var5: Int = Integer.hashCode(this.height);
      val var8: Int = Integer.hashCode(this.width);
      val var4: Int = this.contentType.hashCode();
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

      return ((((((var7 * 31 + var6) * 31 + var5) * 31 + var8) * 31 + var4) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var9: java.lang.String = this.url;
      val var7: java.lang.String = this.proxyUrl;
      val var1: Int = this.height;
      val var2: Int = this.width;
      val var6: java.lang.String = this.contentType;
      val var3: java.lang.String = this.placeholder;
      val var4: Int = this.placeholderVersion;
      val var5: ContentScanMetadata = this.contentScanMetadata;
      val var8: StringBuilder = new StringBuilder();
      var8.append("UnfurledMediaItem(url=");
      var8.append(var9);
      var8.append(", proxyUrl=");
      var8.append(var7);
      var8.append(", height=");
      var8.append(var1);
      var8.append(", width=");
      var8.append(var2);
      var8.append(", contentType=");
      var8.append(var6);
      var8.append(", placeholder=");
      var8.append(var3);
      var8.append(", placeholderVersion=");
      var8.append(var4);
      var8.append(", contentScanMetadata=");
      var8.append(var5);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : g0 {
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
         val var2: n0 = n0.a;
         return new KSerializer[]{b2.a, b2.a, n0.a, n0.a, b2.a, a.u(b2.a), a.u(var2), a.u(ContentScanMetadata.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): UnfurledMediaItem {
         q.h(var1, "decoder");
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.b(var15);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var10: Any;
         var var11: Any;
         val var13: Int;
         val var17: ContentScanMetadata;
         var var24: Any;
         var var28: Any;
         if (var16.p()) {
            var24 = var16.m(var15, 0);
            var28 = var16.m(var15, 1);
            var3 = var16.i(var15, 2);
            var2 = var16.i(var15, 3);
            var10 = var16.m(var15, 4);
            val var8: java.lang.String = var16.n(var15, 5, b2.a, null) as java.lang.String;
            val var7: Int = var16.n(var15, 6, n0.a, null) as Int;
            var17 = var16.n(var15, 7, ContentScanMetadata.$serializer.INSTANCE, null) as ContentScanMetadata;
            var4 = 255;
            var11 = var24;
            var24 = var28;
            var28 = var8;
            var13 = var7;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var11 = null;
            var10 = null;
            var var23: Any = null;
            var var22: Any = null;
            var var18: Any = null;
            var24 = null;
            var3 = 0;

            while (var5) {
               val var6: Int = var16.o(var15);
               switch (var6) {
                  case -1:
                     var5 = false;
                     break;
                  case 0:
                     var23 = var16.m(var15, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var22 = var16.m(var15, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var3 = var16.i(var15, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var4 = var16.i(var15, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var18 = var16.m(var15, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var24 = var16.n(var15, 5, b2.a, var24) as java.lang.String;
                     var2 |= 32;
                     break;
                  case 6:
                     var10 = var16.n(var15, 6, n0.a, var10) as Int;
                     var2 |= 64;
                     break;
                  case 7:
                     var11 = var16.n(var15, 7, ContentScanMetadata.$serializer.INSTANCE, var11) as ContentScanMetadata;
                     var2 |= 128;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var17 = (ContentScanMetadata)var11;
            var13 = (Integer)var10;
            var28 = var24;
            var10 = var18;
            var2 = var4;
            var24 = var22;
            var11 = var23;
            var4 = var2;
         }

         var16.c(var15);
         return new UnfurledMediaItem(
            var4, (java.lang.String)var11, (java.lang.String)var24, var3, var2, (java.lang.String)var10, (java.lang.String)var28, var13, var17, null
         );
      }

      public open fun serialize(encoder: Encoder, value: UnfurledMediaItem) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UnfurledMediaItem.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UnfurledMediaItem> {
         return UnfurledMediaItem.$serializer.INSTANCE;
      }
   }
}
