package com.discord.chat.bridge.media

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.n0
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
      val var4: Int = this.url.hashCode();
      val var7: Int = this.proxyUrl.hashCode();
      val var5: Int = Integer.hashCode(this.height);
      val var8: Int = Integer.hashCode(this.width);
      val var6: Int = this.contentType.hashCode();
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

      return ((((((var4 * 31 + var7) * 31 + var5) * 31 + var8) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var7: java.lang.String = this.url;
      val var5: java.lang.String = this.proxyUrl;
      val var1: Int = this.height;
      val var2: Int = this.width;
      val var9: java.lang.String = this.contentType;
      val var6: java.lang.String = this.placeholder;
      val var4: Int = this.placeholderVersion;
      val var3: ContentScanMetadata = this.contentScanMetadata;
      val var8: StringBuilder = new StringBuilder();
      var8.append("UnfurledMediaItem(url=");
      var8.append(var7);
      var8.append(", proxyUrl=");
      var8.append(var5);
      var8.append(", height=");
      var8.append(var1);
      var8.append(", width=");
      var8.append(var2);
      var8.append(", contentType=");
      var8.append(var9);
      var8.append(", placeholder=");
      var8.append(var6);
      var8.append(", placeholderVersion=");
      var8.append(var4);
      var8.append(", contentScanMetadata=");
      var8.append(var3);
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
         val var13: SerialDescriptor = this.getDescriptor();
         val var14: c = var1.c(var13);
         var var2: Int;
         var var3: Int;
         val var5: Int;
         var var8: Any;
         var var9: Any;
         var var10: Int;
         var var11: Any;
         val var12: Any;
         val var15: ContentScanMetadata;
         if (var14.y()) {
            var8 = var14.t(var13, 0);
            var11 = var14.t(var13, 1);
            var5 = var14.k(var13, 2);
            var2 = var14.k(var13, 3);
            var12 = var14.t(var13, 4);
            var9 = var14.v(var13, 5, b2.a, null) as java.lang.String;
            val var7: Int = var14.v(var13, 6, n0.a, null) as Int;
            var15 = var14.v(var13, 7, ContentScanMetadata.$serializer.INSTANCE, null) as ContentScanMetadata;
            var3 = 255;
            var10 = var7;
         } else {
            var var20: Boolean = true;
            var var4: Int = 0;
            var2 = 0;
            var11 = null;
            var10 = null;
            var8 = null;
            var var22: Any = null;
            var var16: Any = null;
            var9 = null;
            var3 = 0;

            while (var20) {
               val var6: Int = var14.x(var13);
               switch (var6) {
                  case -1:
                     var20 = false;
                     break;
                  case 0:
                     var8 = var14.t(var13, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var22 = var14.t(var13, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var3 = var14.k(var13, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var4 = var14.k(var13, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var16 = var14.t(var13, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var9 = var14.v(var13, 5, b2.a, var9) as java.lang.String;
                     var2 |= 32;
                     break;
                  case 6:
                     var10 = var14.v(var13, 6, n0.a, var10) as Int;
                     var2 |= 64;
                     break;
                  case 7:
                     var11 = var14.v(var13, 7, ContentScanMetadata.$serializer.INSTANCE, var11) as ContentScanMetadata;
                     var2 |= 128;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var12 = var16;
            var15 = (ContentScanMetadata)var11;
            var2 = var4;
            var5 = var3;
            var11 = var22;
            var3 = var2;
         }

         var14.b(var13);
         return new UnfurledMediaItem(
            var3, (java.lang.String)var8, (java.lang.String)var11, var5, var2, (java.lang.String)var12, (java.lang.String)var9, var10, var15, null
         );
      }

      public open fun serialize(encoder: Encoder, value: UnfurledMediaItem) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         UnfurledMediaItem.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UnfurledMediaItem> {
         return UnfurledMediaItem.$serializer.INSTANCE;
      }
   }
}
