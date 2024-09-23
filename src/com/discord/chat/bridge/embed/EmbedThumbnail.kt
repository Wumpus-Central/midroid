package com.discord.chat.bridge.embed

import al.b2
import al.g0
import al.h
import al.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import xk.f
import xk.n
import yk.a

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
      val var5: java.lang.String = this.url;
      val var9: java.lang.String = this.proxyURL;
      val var3: java.lang.String = this.videoUrl;
      val var1: Int = this.height;
      val var2: Int = this.width;
      val var7: java.lang.Boolean = this.gifv;
      val var10: java.lang.Boolean = this.showPlayButton;
      val var8: java.lang.String = this.placeholder;
      val var6: Int = this.placeholderVersion;
      val var4: StringBuilder = new StringBuilder();
      var4.append("EmbedThumbnail(url=");
      var4.append(var5);
      var4.append(", proxyURL=");
      var4.append(var9);
      var4.append(", videoUrl=");
      var4.append(var3);
      var4.append(", height=");
      var4.append(var1);
      var4.append(", width=");
      var4.append(var2);
      var4.append(", gifv=");
      var4.append(var7);
      var4.append(", showPlayButton=");
      var4.append(var10);
      var4.append(", placeholder=");
      var4.append(var8);
      var4.append(", placeholderVersion=");
      var4.append(var6);
      var4.append(")");
      return var4.toString();
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
         val var1: b2 = b2.a;
         val var5: KSerializer = a.u(b2.a);
         val var2: KSerializer = a.u(var1);
         val var4: n0 = n0.a;
         val var3: h = h.a;
         return new KSerializer[]{var1, var5, var2, n0.a, n0.a, a.u(h.a), a.u(var3), a.u(var1), a.u(var4), var1};
      }

      public open fun deserialize(decoder: Decoder): EmbedThumbnail {
         q.h(var1, "decoder");
         val var21: SerialDescriptor = this.getDescriptor();
         val var22: c = var1.c(var21);
         val var9: Boolean = var22.y();
         var var6: Byte = 9;
         var var7: Byte = 7;
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var13: Any;
         var var14: Any;
         var var15: java.lang.Boolean;
         val var16: java.lang.Boolean;
         val var17: Any;
         val var18: Any;
         val var19: Int;
         val var20: Any;
         if (var9) {
            var14 = var22.t(var21, 0);
            val var23: b2 = b2.a;
            var13 = var22.v(var21, 1, b2.a, null) as java.lang.String;
            var18 = var22.v(var21, 2, var23, null) as java.lang.String;
            var3 = var22.k(var21, 3);
            val var2: Int = var22.k(var21, 4);
            val var10: h = h.a;
            var16 = var22.v(var21, 5, h.a, null) as java.lang.Boolean;
            val var12: java.lang.Boolean = var22.v(var21, 6, var10, null) as java.lang.Boolean;
            val var30: java.lang.String = var22.v(var21, 7, var23, null) as java.lang.String;
            val var11: Int = var22.v(var21, 8, n0.a, null) as Int;
            val var24: java.lang.String = var22.t(var21, 9);
            var4 = 1023;
            var5 = var2;
            var15 = var12;
            var17 = var30;
            var19 = var11;
            var20 = var24;
         } else {
            var var29: Boolean = true;
            var4 = 0;
            var var26: Int = 0;
            var var36: Int = null;
            var15 = null;
            var14 = null;
            var var33: java.lang.Boolean = null;
            var var32: Any = null;
            var var25: Any = null;
            var13 = null;
            var var31: Any = null;
            var3 = 0;

            while (var29) {
               label39: {
                  val var8: Int = var22.x(var21);
                  switch (var8) {
                     case -1:
                        var29 = false;
                        break label39;
                     case 0:
                        var25 = var22.t(var21, 0);
                        var26 |= 1;
                        break;
                     case 1:
                        var31 = var22.v(var21, 1, b2.a, var31) as java.lang.String;
                        var26 |= 2;
                        break;
                     case 2:
                        var32 = var22.v(var21, 2, b2.a, var32) as java.lang.String;
                        var26 |= 4;
                        break;
                     case 3:
                        var4 = var22.k(var21, 3);
                        var26 |= 8;
                        break label39;
                     case 4:
                        var3 = var22.k(var21, 4);
                        var26 |= 16;
                        break label39;
                     case 5:
                        var33 = var22.v(var21, 5, h.a, var33) as java.lang.Boolean;
                        var26 |= 32;
                        break label39;
                     case 6:
                        var15 = var22.v(var21, 6, h.a, var15) as java.lang.Boolean;
                        var26 |= 64;
                        var6 = 9;
                        continue;
                     case 7:
                        var14 = var22.v(var21, var7, b2.a, var14) as java.lang.String;
                        var26 |= 128;
                        continue;
                     case 8:
                        var36 = var22.v(var21, 8, n0.a, var36) as Int;
                        var26 |= 256;
                        continue;
                     case 9:
                        var13 = var22.t(var21, var6);
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

            var20 = var13;
            var19 = var36;
            var17 = var14;
            var16 = var33;
            var5 = var3;
            var3 = var4;
            var18 = var32;
            var13 = var31;
            var14 = var25;
            var4 = var26;
         }

         var22.b(var21);
         return new EmbedThumbnail(
            var4,
            (java.lang.String)var14,
            (java.lang.String)var13,
            (java.lang.String)var18,
            var3,
            var5,
            var16,
            var15,
            (java.lang.String)var17,
            var19,
            (java.lang.String)var20,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: EmbedThumbnail) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         EmbedThumbnail.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return al.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedThumbnail> {
         return EmbedThumbnail.$serializer.INSTANCE;
      }
   }
}
