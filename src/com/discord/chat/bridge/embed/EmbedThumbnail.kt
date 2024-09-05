package com.discord.chat.bridge.embed

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
import qn.h
import qn.n0

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
      q.h(var1, "url");
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
      q.h(var1, "url");
      return new EmbedThumbnail(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedThumbnail) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.url, var1.url)) {
            return false;
         } else if (!q.c(this.proxyURL, var1.proxyURL)) {
            return false;
         } else if (!q.c(this.videoUrl, var1.videoUrl)) {
            return false;
         } else if (this.height != var1.height) {
            return false;
         } else if (this.width != var1.width) {
            return false;
         } else if (!q.c(this.gifv, var1.gifv)) {
            return false;
         } else if (!q.c(this.showPlayButton, var1.showPlayButton)) {
            return false;
         } else if (!q.c(this.placeholder, var1.placeholder)) {
            return false;
         } else {
            return q.c(this.placeholderVersion, var1.placeholderVersion);
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
      val var8: java.lang.String = this.url;
      val var10: java.lang.String = this.proxyURL;
      val var4: java.lang.String = this.videoUrl;
      val var2: Int = this.height;
      val var1: Int = this.width;
      val var9: java.lang.Boolean = this.gifv;
      val var7: java.lang.Boolean = this.showPlayButton;
      val var6: java.lang.String = this.placeholder;
      val var5: Int = this.placeholderVersion;
      val var3: StringBuilder = new StringBuilder();
      var3.append("EmbedThumbnail(url=");
      var3.append(var8);
      var3.append(", proxyURL=");
      var3.append(var10);
      var3.append(", videoUrl=");
      var3.append(var4);
      var3.append(", height=");
      var3.append(var2);
      var3.append(", width=");
      var3.append(var1);
      var3.append(", gifv=");
      var3.append(var9);
      var3.append(", showPlayButton=");
      var3.append(var7);
      var3.append(", placeholder=");
      var3.append(var6);
      var3.append(", placeholderVersion=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: EmbedThumbnail.$serializer = new EmbedThumbnail.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedThumbnail", var0, 10);
         var1.c("url", false);
         var1.c("proxyURL", true);
         var1.c("videoUrl", true);
         var1.c("height", false);
         var1.c("width", false);
         var1.c("gifv", true);
         var1.c("showPlayButton", true);
         var1.c("placeholder", true);
         var1.c("placeholderVersion", true);
         var1.c("embedUrl", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         val var2: KSerializer = a.u(b2.a);
         val var5: KSerializer = a.u(var1);
         val var4: n0 = n0.a;
         val var3: h = h.a;
         return new KSerializer[]{var1, var2, var5, n0.a, n0.a, a.u(h.a), a.u(var3), a.u(var1), a.u(var4), var1};
      }

      public open fun deserialize(decoder: Decoder): EmbedThumbnail {
         q.h(var1, "decoder");
         val var21: SerialDescriptor = this.getDescriptor();
         val var22: c = var1.b(var21);
         val var9: Boolean = var22.p();
         var var6: Byte = 9;
         var var7: Byte = 7;
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var13: java.lang.Boolean;
         var var14: Any;
         var var15: Any;
         var var16: Any;
         val var17: Any;
         val var18: Any;
         val var19: Int;
         val var20: java.lang.Boolean;
         if (var9) {
            var17 = var22.m(var21, 0);
            val var23: b2 = b2.a;
            var18 = var22.n(var21, 1, b2.a, null) as java.lang.String;
            var15 = var22.n(var21, 2, var23, null) as java.lang.String;
            val var2: Int = var22.i(var21, 3);
            var3 = var22.i(var21, 4);
            val var10: h = h.a;
            var13 = var22.n(var21, 5, h.a, null) as java.lang.Boolean;
            val var11: java.lang.Boolean = var22.n(var21, 6, var10, null) as java.lang.Boolean;
            val var28: java.lang.String = var22.n(var21, 7, var23, null) as java.lang.String;
            val var12: Int = var22.n(var21, 8, n0.a, null) as Int;
            val var24: java.lang.String = var22.m(var21, 9);
            var5 = 1023;
            var4 = var2;
            var20 = var11;
            var16 = var28;
            var19 = var12;
            var14 = var24;
         } else {
            var var27: Boolean = true;
            var4 = 0;
            var var26: Int = 0;
            var16 = null;
            var15 = null;
            var14 = null;
            var var30: java.lang.Boolean = null;
            var var31: Any = null;
            var var25: Any = null;
            var13 = null;
            var var29: Any = null;
            var3 = 0;

            while (var27) {
               label39: {
                  val var8: Int = var22.o(var21);
                  switch (var8) {
                     case -1:
                        var27 = false;
                        break label39;
                     case 0:
                        var25 = var22.m(var21, 0);
                        var26 |= 1;
                        break;
                     case 1:
                        var29 = var22.n(var21, 1, b2.a, var29) as java.lang.String;
                        var26 |= 2;
                        break;
                     case 2:
                        var31 = var22.n(var21, 2, b2.a, var31) as java.lang.String;
                        var26 |= 4;
                        break;
                     case 3:
                        var4 = var22.i(var21, 3);
                        var26 |= 8;
                        break label39;
                     case 4:
                        var3 = var22.i(var21, 4);
                        var26 |= 16;
                        break label39;
                     case 5:
                        var30 = var22.n(var21, 5, h.a, var30) as java.lang.Boolean;
                        var26 |= 32;
                        break label39;
                     case 6:
                        var15 = var22.n(var21, 6, h.a, var15) as java.lang.Boolean;
                        var26 |= 64;
                        var6 = 9;
                        continue;
                     case 7:
                        var14 = var22.n(var21, var7, b2.a, var14) as java.lang.String;
                        var26 |= 128;
                        continue;
                     case 8:
                        var16 = var22.n(var21, 8, n0.a, var16) as Int;
                        var26 |= 256;
                        continue;
                     case 9:
                        var13 = var22.m(var21, var6);
                        var26 |= 512;
                        continue;
                     default:
                        throw new n(var8);
                  }

                  var6 = 9;
                  var7 = 7;
                  continue;
               }

               var6 = 9;
            }

            var14 = var13;
            var19 = (Integer)var16;
            var16 = var14;
            var20 = (java.lang.Boolean)var15;
            var13 = var30;
            var15 = var31;
            var18 = var29;
            var17 = var25;
            var5 = var26;
         }

         var22.c(var21);
         return new EmbedThumbnail(
            var5,
            (java.lang.String)var17,
            (java.lang.String)var18,
            (java.lang.String)var15,
            var4,
            var3,
            var13,
            var20,
            (java.lang.String)var16,
            var19,
            (java.lang.String)var14,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: EmbedThumbnail) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         EmbedThumbnail.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedThumbnail> {
         return EmbedThumbnail.$serializer.INSTANCE;
      }
   }
}
