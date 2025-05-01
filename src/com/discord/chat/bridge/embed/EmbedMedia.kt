package com.discord.chat.bridge.embed

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
import ba.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class EmbedMedia(url: String,
      proxyURL: String? = null,
      width: Int,
      height: Int,
      placeholder: String? = null,
      placeholderVersion: Int? = null,
      srcIsAnimated: Boolean
   ) :
   EmbedUrlProvider {
   public open val embedUrl: String
   public final val height: Int
   public final val placeholder: String?
   public final val placeholderVersion: Int?
   public final val proxyURL: String?
   public final val srcIsAnimated: Boolean
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
      this.srcIsAnimated = var7;
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

   public operator fun component7(): Boolean {
      return this.srcIsAnimated;
   }

   public fun copy(
      url: String = var0.url,
      proxyURL: String? = var0.proxyURL,
      width: Int = var0.width,
      height: Int = var0.height,
      placeholder: String? = var0.placeholder,
      placeholderVersion: Int? = var0.placeholderVersion,
      srcIsAnimated: Boolean = var0.srcIsAnimated
   ): EmbedMedia {
      q.h(var1, "url");
      return new EmbedMedia(var1, var2, var3, var4, var5, var6, var7);
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
         } else if (!q.c(this.placeholderVersion, var1.placeholderVersion)) {
            return false;
         } else {
            return this.srcIsAnimated == var1.srcIsAnimated;
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

      val var6: Int = Integer.hashCode(this.width);
      val var5: Int = Integer.hashCode(this.height);
      val var2: Int;
      if (this.placeholder == null) {
         var2 = 0;
      } else {
         var2 = this.placeholder.hashCode();
      }

      if (this.placeholderVersion != null) {
         var3 = this.placeholderVersion.hashCode();
      }

      return (((((var4 * 31 + var1) * 31 + var6) * 31 + var5) * 31 + var2) * 31 + var3) * 31 + java.lang.Boolean.hashCode(this.srcIsAnimated);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.url;
      val var7: java.lang.String = this.proxyURL;
      val var1: Int = this.width;
      val var2: Int = this.height;
      val var6: java.lang.String = this.placeholder;
      val var5: Int = this.placeholderVersion;
      val var3: Boolean = this.srcIsAnimated;
      val var8: StringBuilder = new StringBuilder();
      var8.append("EmbedMedia(url=");
      var8.append(var4);
      var8.append(", proxyURL=");
      var8.append(var7);
      var8.append(", width=");
      var8.append(var1);
      var8.append(", height=");
      var8.append(var2);
      var8.append(", placeholder=");
      var8.append(var6);
      var8.append(", placeholderVersion=");
      var8.append(var5);
      var8.append(", srcIsAnimated=");
      var8.append(var3);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: EmbedMedia.$serializer = new EmbedMedia.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedMedia", var0, 8);
         var1.l("url", false);
         var1.l("proxyURL", true);
         var1.l("width", false);
         var1.l("height", false);
         var1.l("placeholder", true);
         var1.l("placeholderVersion", true);
         var1.l("srcIsAnimated", false);
         var1.l("embedUrl", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: C0 = C0.a;
         val var3: KSerializer = a.u(C0.a);
         val var2: N = N.a;
         return new KSerializer[]{var1, var3, N.a, N.a, a.u(var1), a.u(var2), h.a, var1};
      }

      public open fun deserialize(decoder: Decoder): EmbedMedia {
         q.h(var1, "decoder");
         val var13: SerialDescriptor = this.getDescriptor();
         val var14: c = var1.c(var13);
         var var2: Int;
         var var3: Int;
         val var5: Int;
         var var7: Boolean;
         var var9: java.lang.String;
         var var10: java.lang.String;
         var var11: Int;
         val var12: java.lang.String;
         var var16: java.lang.String;
         if (var14.y()) {
            var9 = var14.t(var13, 0);
            val var15: C0 = C0.a;
            var10 = var14.v(var13, 1, C0.a, null) as java.lang.String;
            var5 = var14.k(var13, 2);
            var2 = var14.k(var13, 3);
            var12 = var14.v(var13, 4, var15, null) as java.lang.String;
            val var8: Int = var14.v(var13, 5, N.a, null) as Int;
            var7 = var14.s(var13, 6);
            var16 = var14.t(var13, 7);
            var3 = 255;
            var11 = var8;
         } else {
            var var19: Boolean = true;
            var7 = false;
            var3 = 0;
            var2 = 0;
            var11 = null;
            var9 = null;
            var var20: java.lang.String = null;
            var16 = null;
            var10 = null;
            var var4: Int = 0;

            while (var19) {
               val var6: Int = var14.x(var13);
               switch (var6) {
                  case -1:
                     var19 = false;
                     break;
                  case 0:
                     var9 = var14.t(var13, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var20 = var14.v(var13, 1, C0.a, var20) as java.lang.String;
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
                     var10 = var14.v(var13, 4, C0.a, var10) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var11 = var14.v(var13, 5, N.a, var11) as Int;
                     var2 |= 32;
                     break;
                  case 6:
                     var7 = var14.s(var13, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var16 = var14.t(var13, 7);
                     var2 |= 128;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var5 = var3;
            var3 = var2;
            var12 = var10;
            var2 = var4;
            var10 = var20;
         }

         var14.b(var13);
         return new EmbedMedia(var3, var9, var10, var5, var2, var12, var11, var7, var16, null);
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
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedMedia> {
         return EmbedMedia.$serializer.INSTANCE;
      }
   }
}
