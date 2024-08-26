package com.discord.chat.bridge.embed

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
import xk.h
import xk.m0

@f
public data class EmbedThumbnail(url: String,
      proxyURL: String? = null,
      videoUrl: String? = null,
      height: Int,
      width: Int,
      gifv: Boolean? = null,
      showPlayButton: Boolean? = null,
      placeholder: String? = null,
      placeholderVersion: Int? = null
   ) :
   EmbedUrlProvider {
   public open val embedUrl: String
   public final val gifv: Boolean?
   public final val height: Int
   public final val placeholder: String?
   public final val placeholderVersion: Int?
   public final val proxyURL: String?
   public final val showPlayButton: Boolean?
   public final val url: String
   public final val videoUrl: String?
   public final val width: Int

   init {
      r.h(var1, "url");
      super();
      this.url = var1;
      this.proxyURL = var2;
      this.videoUrl = var3;
      this.height = var4;
      this.width = var5;
      this.gifv = var6;
      this.showPlayButton = var7;
      this.placeholder = var8;
      this.placeholderVersion = var9;
      if (var2 != null) {
         var1 = var2;
      }

      this.embedUrl = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: EmbedThumbnail, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.url);
      var var3: Boolean;
      if (!var1.A(var2, 1) && var0.proxyURL == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.proxyURL);
      }

      if (!var1.A(var2, 2) && var0.videoUrl == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.videoUrl);
      }

      var1.w(var2, 3, var0.height);
      var1.w(var2, 4, var0.width);
      if (!var1.A(var2, 5) && var0.gifv == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, h.a, var0.gifv);
      }

      if (!var1.A(var2, 6) && var0.showPlayButton == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, h.a, var0.showPlayButton);
      }

      if (!var1.A(var2, 7) && var0.placeholder == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 7, a2.a, var0.placeholder);
      }

      if (!var1.A(var2, 8) && var0.placeholderVersion == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 8, m0.a, var0.placeholderVersion);
      }

      label68: {
         if (!var1.A(var2, 9)) {
            val var7: java.lang.String = var0.getEmbedUrl();
            var var14: java.lang.String = var0.proxyURL;
            if (var0.proxyURL == null) {
               var14 = var0.url;
            }

            var3 = false;
            if (r.c(var7, var14)) {
               break label68;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.z(var2, 9, var0.getEmbedUrl());
      }
   }

   public operator fun component1(): String {
      return this.url;
   }

   public operator fun component2(): String? {
      return this.proxyURL;
   }

   public operator fun component3(): String? {
      return this.videoUrl;
   }

   public operator fun component4(): Int {
      return this.height;
   }

   public operator fun component5(): Int {
      return this.width;
   }

   public operator fun component6(): Boolean? {
      return this.gifv;
   }

   public operator fun component7(): Boolean? {
      return this.showPlayButton;
   }

   public operator fun component8(): String? {
      return this.placeholder;
   }

   public operator fun component9(): Int? {
      return this.placeholderVersion;
   }

   public fun copy(
      url: String = var0.url,
      proxyURL: String? = var0.proxyURL,
      videoUrl: String? = var0.videoUrl,
      height: Int = var0.height,
      width: Int = var0.width,
      gifv: Boolean? = var0.gifv,
      showPlayButton: Boolean? = var0.showPlayButton,
      placeholder: String? = var0.placeholder,
      placeholderVersion: Int? = var0.placeholderVersion
   ): EmbedThumbnail {
      r.h(var1, "url");
      return new EmbedThumbnail(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedThumbnail) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.url, var1.url)) {
            return false;
         } else if (!r.c(this.proxyURL, var1.proxyURL)) {
            return false;
         } else if (!r.c(this.videoUrl, var1.videoUrl)) {
            return false;
         } else if (this.height != var1.height) {
            return false;
         } else if (this.width != var1.width) {
            return false;
         } else if (!r.c(this.gifv, var1.gifv)) {
            return false;
         } else if (!r.c(this.showPlayButton, var1.showPlayButton)) {
            return false;
         } else if (!r.c(this.placeholder, var1.placeholder)) {
            return false;
         } else {
            return r.c(this.placeholderVersion, var1.placeholderVersion);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = this.url.hashCode();
      var var6: Int = 0;
      val var1: Int;
      if (this.proxyURL == null) {
         var1 = 0;
      } else {
         var1 = this.proxyURL.hashCode();
      }

      val var2: Int;
      if (this.videoUrl == null) {
         var2 = 0;
      } else {
         var2 = this.videoUrl.hashCode();
      }

      val var9: Int = Integer.hashCode(this.height);
      val var8: Int = Integer.hashCode(this.width);
      val var3: Int;
      if (this.gifv == null) {
         var3 = 0;
      } else {
         var3 = this.gifv.hashCode();
      }

      val var4: Int;
      if (this.showPlayButton == null) {
         var4 = 0;
      } else {
         var4 = this.showPlayButton.hashCode();
      }

      val var5: Int;
      if (this.placeholder == null) {
         var5 = 0;
      } else {
         var5 = this.placeholder.hashCode();
      }

      if (this.placeholderVersion != null) {
         var6 = this.placeholderVersion.hashCode();
      }

      return (((((((var7 * 31 + var1) * 31 + var2) * 31 + var9) * 31 + var8) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6;
   }

   public override fun toString(): String {
      val var9: java.lang.String = this.url;
      val var5: java.lang.String = this.proxyURL;
      val var3: java.lang.String = this.videoUrl;
      val var1: Int = this.height;
      val var2: Int = this.width;
      val var10: java.lang.Boolean = this.gifv;
      val var6: java.lang.Boolean = this.showPlayButton;
      val var4: java.lang.String = this.placeholder;
      val var7: Int = this.placeholderVersion;
      val var8: StringBuilder = new StringBuilder();
      var8.append("EmbedThumbnail(url=");
      var8.append(var9);
      var8.append(", proxyURL=");
      var8.append(var5);
      var8.append(", videoUrl=");
      var8.append(var3);
      var8.append(", height=");
      var8.append(var1);
      var8.append(", width=");
      var8.append(var2);
      var8.append(", gifv=");
      var8.append(var10);
      var8.append(", showPlayButton=");
      var8.append(var6);
      var8.append(", placeholder=");
      var8.append(var4);
      var8.append(", placeholderVersion=");
      var8.append(var7);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : f0<EmbedThumbnail> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: EmbedThumbnail.$serializer = new EmbedThumbnail.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedThumbnail", var0, 10);
         var1.l("url", false);
         var1.l("proxyURL", true);
         var1.l("videoUrl", true);
         var1.l("height", false);
         var1.l("width", false);
         var1.l("gifv", true);
         var1.l("showPlayButton", true);
         var1.l("placeholder", true);
         var1.l("placeholderVersion", true);
         var1.l("embedUrl", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: a2 = a2.a;
         val var5: KSerializer = a.u(a2.a);
         val var4: KSerializer = a.u(var3);
         val var1: m0 = m0.a;
         val var2: h = h.a;
         return new KSerializer[]{var3, var5, var4, m0.a, m0.a, a.u(h.a), a.u(var2), a.u(var3), a.u(var1), var3};
      }

      public open fun deserialize(decoder: Decoder): EmbedThumbnail {
         r.h(var1, "decoder");
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.b(var18);
         val var9: Boolean = var19.p();
         var var6: Byte = 9;
         var var7: Byte = 7;
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var10: Any;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var15: Any;
         var var16: Any;
         var var21: Any;
         var var29: Any;
         if (var9) {
            var10 = var19.m(var18, 0);
            var21 = a2.a;
            var11 = var19.n(var18, 1, a2.a, null);
            var13 = var19.n(var18, 2, (DeserializationStrategy)var21, null);
            var4 = var19.i(var18, 3);
            var2 = var19.i(var18, 4);
            var29 = h.a;
            var12 = var19.n(var18, 5, h.a, null);
            var15 = var19.n(var18, 6, (DeserializationStrategy)var29, null);
            var29 = var19.n(var18, 7, (DeserializationStrategy)var21, null);
            var16 = var19.n(var18, 8, m0.a, null);
            var21 = var19.m(var18, 9);
            var3 = 1023;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var16 = null;
            var15 = null;
            var29 = null;
            var12 = null;
            var11 = null;
            var21 = null;
            var13 = null;
            var10 = null;
            var3 = 0;

            while (var5) {
               label39: {
                  val var8: Int = var19.o(var18);
                  switch (var8) {
                     case -1:
                        var5 = false;
                        break;
                     case 0:
                        var21 = var19.m(var18, 0);
                        var2 |= 1;
                        break label39;
                     case 1:
                        var10 = var19.n(var18, 1, a2.a, var10);
                        var2 |= 2;
                        break label39;
                     case 2:
                        var11 = var19.n(var18, 2, a2.a, var11);
                        var2 |= 4;
                        break label39;
                     case 3:
                        var4 = var19.i(var18, 3);
                        var2 |= 8;
                        break;
                     case 4:
                        var3 = var19.i(var18, 4);
                        var2 |= 16;
                        break;
                     case 5:
                        var12 = var19.n(var18, 5, h.a, var12);
                        var2 |= 32;
                        break;
                     case 6:
                        var15 = var19.n(var18, 6, h.a, var15);
                        var2 |= 64;
                        var6 = 9;
                        continue;
                     case 7:
                        var29 = var19.n(var18, var7, a2.a, var29);
                        var2 |= 128;
                        continue;
                     case 8:
                        var16 = var19.n(var18, 8, m0.a, var16);
                        var2 |= 256;
                        continue;
                     case 9:
                        var13 = var19.m(var18, var6);
                        var2 |= 512;
                        continue;
                     default:
                        throw new n(var8);
                  }

                  var6 = 9;
                  continue;
               }

               var6 = 9;
               var7 = 7;
            }

            var11 = var10;
            var10 = var21;
            var21 = var13;
            var2 = var3;
            var13 = var11;
            var3 = var2;
         }

         var19.c(var18);
         return new EmbedThumbnail(
            var3,
            (java.lang.String)var10,
            var11 as java.lang.String,
            var13 as java.lang.String,
            var4,
            var2,
            var12 as java.lang.Boolean,
            var15 as java.lang.Boolean,
            var29 as java.lang.String,
            var16 as Integer,
            (java.lang.String)var21,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: EmbedThumbnail) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         EmbedThumbnail.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedThumbnail> {
         return EmbedThumbnail.$serializer.INSTANCE;
      }
   }
}
