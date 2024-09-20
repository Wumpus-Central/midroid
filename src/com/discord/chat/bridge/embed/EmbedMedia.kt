package com.discord.chat.bridge.embed

import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      q.h(var1, "url");
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
      q.h(var1, "url");
      return new EmbedMedia(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedMedia) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.url, var1.url)) {
            return false;
         } else if (!q.c(this.proxyURL, var1.proxyURL)) {
            return false;
         } else if (this.width != var1.width) {
            return false;
         } else if (this.height != var1.height) {
            return false;
         } else if (!q.c(this.placeholder, var1.placeholder)) {
            return false;
         } else {
            return q.c(this.placeholderVersion, var1.placeholderVersion);
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
      val var5: java.lang.String = this.url;
      val var3: java.lang.String = this.proxyURL;
      val var1: Int = this.width;
      val var2: Int = this.height;
      val var7: java.lang.String = this.placeholder;
      val var4: Int = this.placeholderVersion;
      val var6: StringBuilder = new StringBuilder();
      var6.append("EmbedMedia(url=");
      var6.append(var5);
      var6.append(", proxyURL=");
      var6.append(var3);
      var6.append(", width=");
      var6.append(var1);
      var6.append(", height=");
      var6.append(var2);
      var6.append(", placeholder=");
      var6.append(var7);
      var6.append(", placeholderVersion=");
      var6.append(var4);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
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
         val var2: b2 = b2.a;
         val var3: KSerializer = a.u(b2.a);
         val var1: n0 = n0.a;
         return new KSerializer[]{var2, var3, n0.a, n0.a, a.u(var2), a.u(var1), var2};
      }

      public open fun deserialize(decoder: Decoder): EmbedMedia {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var7: Any;
         var var8: java.lang.String;
         var var9: java.lang.String;
         var var10: java.lang.String;
         var var14: java.lang.String;
         if (var12.y()) {
            var10 = var12.t(var11, 0);
            val var13: b2 = b2.a;
            var9 = var12.v(var11, 1, b2.a, null) as java.lang.String;
            var5 = var12.k(var11, 2);
            val var2: Int = var12.k(var11, 3);
            var8 = var12.v(var11, 4, var13, null) as java.lang.String;
            var7 = var12.v(var11, 5, n0.a, null) as Int;
            var14 = var12.t(var11, 6);
            var3 = 127;
            var4 = var2;
         } else {
            var var17: Boolean = true;
            var4 = 0;
            var var15: Int = 0;
            var10 = null;
            var9 = null;
            var8 = null;
            var7 = null;
            var14 = null;
            var3 = 0;

            while (var17) {
               val var6: Int = var12.x(var11);
               switch (var6) {
                  case -1:
                     var17 = false;
                     break;
                  case 0:
                     var10 = var12.t(var11, 0);
                     var15 |= 1;
                     break;
                  case 1:
                     var9 = var12.v(var11, 1, b2.a, var9) as java.lang.String;
                     var15 |= 2;
                     break;
                  case 2:
                     var3 = var12.k(var11, 2);
                     var15 |= 4;
                     break;
                  case 3:
                     var4 = var12.k(var11, 3);
                     var15 |= 8;
                     break;
                  case 4:
                     var8 = var12.v(var11, 4, b2.a, var8) as java.lang.String;
                     var15 |= 16;
                     break;
                  case 5:
                     var7 = var12.v(var11, 5, n0.a, var7) as Int;
                     var15 |= 32;
                     break;
                  case 6:
                     var14 = var12.t(var11, 6);
                     var15 |= 64;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var5 = var3;
            var3 = var15;
         }

         var12.b(var11);
         return new EmbedMedia(var3, var10, var9, var5, var4, var8, (Integer)var7, var14, null);
      }

      public open fun serialize(encoder: Encoder, value: EmbedMedia) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         EmbedMedia.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedMedia> {
         return EmbedMedia.$serializer.INSTANCE;
      }
   }
}
