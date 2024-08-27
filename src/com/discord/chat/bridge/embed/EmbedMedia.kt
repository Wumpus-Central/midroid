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
import xk.m0

@f
public data class EmbedMedia(url: String, proxyURL: String? = null, width: Int, height: Int, placeholder: String? = null, placeholderVersion: Int? = null) :
   EmbedUrlProvider {
   public open val embedUrl: String
   public final val height: Int
   public final val placeholder: String?
   public final val placeholderVersion: Int?
   public final val proxyURL: String?
   public final val url: String
   public final val width: Int

   init {
      r.h(var1, "url");
      super();
      this.url = var1;
      this.proxyURL = var2;
      this.width = var3;
      this.height = var4;
      this.placeholder = var5;
      this.placeholderVersion = var6;
      if (var2 != null) {
         var1 = var2;
      }

      this.embedUrl = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: EmbedMedia, output: CompositeEncoder, serialDesc: SerialDescriptor) {
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

      var1.w(var2, 2, var0.width);
      var1.w(var2, 3, var0.height);
      if (!var1.A(var2, 4) && var0.placeholder == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, a2.a, var0.placeholder);
      }

      if (!var1.A(var2, 5) && var0.placeholderVersion == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, m0.a, var0.placeholderVersion);
      }

      label44: {
         if (!var1.A(var2, 6)) {
            val var7: java.lang.String = var0.getEmbedUrl();
            var var11: java.lang.String = var0.proxyURL;
            if (var0.proxyURL == null) {
               var11 = var0.url;
            }

            var3 = false;
            if (r.c(var7, var11)) {
               break label44;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.z(var2, 6, var0.getEmbedUrl());
      }
   }

   public operator fun component1(): String {
      return this.url;
   }

   public operator fun component2(): String? {
      return this.proxyURL;
   }

   public operator fun component3(): Int {
      return this.width;
   }

   public operator fun component4(): Int {
      return this.height;
   }

   public operator fun component5(): String? {
      return this.placeholder;
   }

   public operator fun component6(): Int? {
      return this.placeholderVersion;
   }

   public fun copy(
      url: String = var0.url,
      proxyURL: String? = var0.proxyURL,
      width: Int = var0.width,
      height: Int = var0.height,
      placeholder: String? = var0.placeholder,
      placeholderVersion: Int? = var0.placeholderVersion
   ): EmbedMedia {
      r.h(var1, "url");
      return new EmbedMedia(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedMedia) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.url, var1.url)) {
            return false;
         } else if (!r.c(this.proxyURL, var1.proxyURL)) {
            return false;
         } else if (this.width != var1.width) {
            return false;
         } else if (this.height != var1.height) {
            return false;
         } else if (!r.c(this.placeholder, var1.placeholder)) {
            return false;
         } else {
            return r.c(this.placeholderVersion, var1.placeholderVersion);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.url.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.proxyURL == null) {
         var1 = 0;
      } else {
         var1 = this.proxyURL.hashCode();
      }

      val var5: Int = Integer.hashCode(this.width);
      val var6: Int = Integer.hashCode(this.height);
      val var2: Int;
      if (this.placeholder == null) {
         var2 = 0;
      } else {
         var2 = this.placeholder.hashCode();
      }

      if (this.placeholderVersion != null) {
         var3 = this.placeholderVersion.hashCode();
      }

      return ((((var4 * 31 + var1) * 31 + var5) * 31 + var6) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.url;
      val var7: java.lang.String = this.proxyURL;
      val var2: Int = this.width;
      val var1: Int = this.height;
      val var6: java.lang.String = this.placeholder;
      val var5: Int = this.placeholderVersion;
      val var3: StringBuilder = new StringBuilder();
      var3.append("EmbedMedia(url=");
      var3.append(var4);
      var3.append(", proxyURL=");
      var3.append(var7);
      var3.append(", width=");
      var3.append(var2);
      var3.append(", height=");
      var3.append(var1);
      var3.append(", placeholder=");
      var3.append(var6);
      var3.append(", placeholderVersion=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<EmbedMedia> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: EmbedMedia.$serializer = new EmbedMedia.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedMedia", var0, 7);
         var1.l("url", false);
         var1.l("proxyURL", true);
         var1.l("width", false);
         var1.l("height", false);
         var1.l("placeholder", true);
         var1.l("placeholderVersion", true);
         var1.l("embedUrl", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: a2 = a2.a;
         val var3: KSerializer = a.u(a2.a);
         val var1: m0 = m0.a;
         return new KSerializer[]{var2, var3, m0.a, m0.a, a.u(var2), a.u(var1), var2};
      }

      public open fun deserialize(decoder: Decoder): EmbedMedia {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var7: java.lang.String;
         var var8: Any;
         var var9: Any;
         var var10: Any;
         var var14: Any;
         if (var12.p()) {
            var7 = var12.m(var11, 0);
            var14 = a2.a;
            var10 = var12.n(var11, 1, a2.a, null);
            var4 = var12.i(var11, 2);
            val var2: Int = var12.i(var11, 3);
            var9 = var12.n(var11, 4, (DeserializationStrategy)var14, null);
            var8 = var12.n(var11, 5, m0.a, null);
            var14 = var12.m(var11, 6);
            var3 = 127;
            var5 = var2;
         } else {
            var var18: Boolean = true;
            var4 = 0;
            var var15: Int = 0;
            var7 = null;
            var10 = null;
            var9 = null;
            var8 = null;
            var14 = null;
            var3 = 0;

            while (var18) {
               val var6: Int = var12.o(var11);
               switch (var6) {
                  case -1:
                     var18 = false;
                     break;
                  case 0:
                     var7 = var12.m(var11, 0);
                     var15 |= 1;
                     break;
                  case 1:
                     var10 = var12.n(var11, 1, a2.a, var10);
                     var15 |= 2;
                     break;
                  case 2:
                     var3 = var12.i(var11, 2);
                     var15 |= 4;
                     break;
                  case 3:
                     var4 = var12.i(var11, 3);
                     var15 |= 8;
                     break;
                  case 4:
                     var9 = var12.n(var11, 4, a2.a, var9);
                     var15 |= 16;
                     break;
                  case 5:
                     var8 = var12.n(var11, 5, m0.a, var8);
                     var15 |= 32;
                     break;
                  case 6:
                     var14 = var12.m(var11, 6);
                     var15 |= 64;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var5 = var4;
            var4 = var3;
            var3 = var15;
         }

         var12.c(var11);
         return new EmbedMedia(var3, var7, var10 as java.lang.String, var4, var5, var9 as java.lang.String, var8 as Int, (java.lang.String)var14, null);
      }

      public open fun serialize(encoder: Encoder, value: EmbedMedia) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         EmbedMedia.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedMedia> {
         return EmbedMedia.$serializer.INSTANCE;
      }
   }
}
