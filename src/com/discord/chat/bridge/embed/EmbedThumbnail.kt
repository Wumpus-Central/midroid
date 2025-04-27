package com.discord.chat.bridge.embed

import ca.f
import ca.n
import da.a
import fa.C0
import fa.G
import fa.N
import fa.h
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class EmbedThumbnail(url: String,
      proxyURL: String? = null,
      videoUrl: String? = null,
      height: Int,
      width: Int,
      gifv: Boolean? = null,
      showPlayButton: Boolean? = null,
      placeholder: String? = null,
      placeholderVersion: Int? = null,
      srcIsAnimated: Boolean = false
   ) :
   EmbedUrlProvider {
   public open val embedUrl: String
   public final val gifv: Boolean?
   public final val height: Int
   public final val placeholder: String?
   public final val placeholderVersion: Int?
   public final val proxyURL: String?
   public final val showPlayButton: Boolean?
   public final val srcIsAnimated: Boolean
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
      this.srcIsAnimated = var10;
      if (var2 != null) {
         var1 = var2;
      }

      this.embedUrl = var1;
   }

   public operator fun component1(): String {
      return this.url;
   }

   public operator fun component10(): Boolean {
      return this.srcIsAnimated;
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
      placeholderVersion: Int? = var0.placeholderVersion,
      srcIsAnimated: Boolean = var0.srcIsAnimated
   ): EmbedThumbnail {
      q.h(var1, "url");
      return new EmbedThumbnail(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
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
         } else if (!q.c(this.placeholderVersion, var1.placeholderVersion)) {
            return false;
         } else {
            return this.srcIsAnimated == var1.srcIsAnimated;
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

      return ((((((((var7 * 31 + var1) * 31 + var2) * 31 + var9) * 31 + var8) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31
         + java.lang.Boolean.hashCode(this.srcIsAnimated);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.url;
      val var6: java.lang.String = this.proxyURL;
      val var5: java.lang.String = this.videoUrl;
      val var1: Int = this.height;
      val var2: Int = this.width;
      val var9: java.lang.Boolean = this.gifv;
      val var10: java.lang.Boolean = this.showPlayButton;
      val var7: java.lang.String = this.placeholder;
      val var8: Int = this.placeholderVersion;
      val var3: Boolean = this.srcIsAnimated;
      val var11: StringBuilder = new StringBuilder();
      var11.append("EmbedThumbnail(url=");
      var11.append(var4);
      var11.append(", proxyURL=");
      var11.append(var6);
      var11.append(", videoUrl=");
      var11.append(var5);
      var11.append(", height=");
      var11.append(var1);
      var11.append(", width=");
      var11.append(var2);
      var11.append(", gifv=");
      var11.append(var9);
      var11.append(", showPlayButton=");
      var11.append(var10);
      var11.append(", placeholder=");
      var11.append(var7);
      var11.append(", placeholderVersion=");
      var11.append(var8);
      var11.append(", srcIsAnimated=");
      var11.append(var3);
      var11.append(")");
      return var11.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: EmbedThumbnail.$serializer = new EmbedThumbnail.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedThumbnail", var0, 11);
         var1.l("url", false);
         var1.l("proxyURL", true);
         var1.l("videoUrl", true);
         var1.l("height", false);
         var1.l("width", false);
         var1.l("gifv", true);
         var1.l("showPlayButton", true);
         var1.l("placeholder", true);
         var1.l("placeholderVersion", true);
         var1.l("srcIsAnimated", true);
         var1.l("embedUrl", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var4: C0 = C0.a;
         val var2: KSerializer = a.u(C0.a);
         val var3: KSerializer = a.u(var4);
         val var1: N = N.a;
         val var5: h = h.a;
         return new KSerializer[]{var4, var2, var3, N.a, N.a, a.u(h.a), a.u(var5), a.u(var4), a.u(var1), var5, var4};
      }

      public open fun deserialize(decoder: Decoder): EmbedThumbnail {
         q.h(var1, "decoder");
         val var21: SerialDescriptor = this.getDescriptor();
         val var22: c = var1.c(var21);
         var var10: Boolean = var22.y();
         var var5: Byte = 10;
         var var7: Byte = 9;
         var var8: Byte = 7;
         var var2: Int = 0;
         var var3: Int;
         var var4: Int;
         var var16: java.lang.Boolean;
         var var17: Any;
         val var18: Any;
         val var19: java.lang.Boolean;
         val var20: Int;
         var var27: Any;
         var var31: Any;
         var var33: Any;
         if (var10) {
            var31 = var22.t(var21, 0);
            val var23: C0 = C0.a;
            var17 = var22.v(var21, 1, C0.a, null) as java.lang.String;
            var33 = var22.v(var21, 2, var23, null) as java.lang.String;
            var4 = var22.k(var21, 3);
            var3 = var22.k(var21, 4);
            var27 = h.a;
            var19 = var22.v(var21, 5, h.a, null) as java.lang.Boolean;
            val var13: java.lang.Boolean = var22.v(var21, 6, (DeserializationStrategy)var27, null) as java.lang.Boolean;
            var27 = var22.v(var21, 7, var23, null) as java.lang.String;
            val var12: Int = var22.v(var21, 8, N.a, null) as Int;
            var10 = var22.s(var21, 9);
            val var24: java.lang.String = var22.t(var21, 10);
            var2 = 2047;
            var18 = var31;
            var31 = var33;
            var16 = var13;
            var20 = var12;
            var33 = var24;
         } else {
            var var6: Boolean = true;
            var10 = false;
            var3 = 0;
            var17 = null;
            var16 = null;
            var33 = null;
            var var29: java.lang.Boolean = null;
            var27 = null;
            var var25: Any = null;
            var var30: Any = null;
            var31 = null;
            var4 = 0;

            while (var6) {
               label45: {
                  label44: {
                     val var9: Int = var22.x(var21);
                     switch (var9) {
                        case -1:
                           var6 = false;
                           break label44;
                        case 0:
                           var25 = var22.t(var21, 0);
                           var2 |= 1;
                           break;
                        case 1:
                           var30 = var22.v(var21, 1, C0.a, var30) as java.lang.String;
                           var2 |= 2;
                           break;
                        case 2:
                           var27 = var22.v(var21, 2, C0.a, var27) as java.lang.String;
                           var2 |= 4;
                           break label44;
                        case 3:
                           var4 = var22.k(var21, 3);
                           var2 |= 8;
                           break label45;
                        case 4:
                           var3 = var22.k(var21, 4);
                           var2 |= 16;
                           break label45;
                        case 5:
                           var29 = var22.v(var21, 5, h.a, var29) as java.lang.Boolean;
                           var2 |= 32;
                           break label45;
                        case 6:
                           var16 = var22.v(var21, 6, h.a, var16) as java.lang.Boolean;
                           var2 |= 64;
                           var5 = 10;
                           continue;
                        case 7:
                           var33 = var22.v(var21, var8, C0.a, var33) as java.lang.String;
                           var2 |= 128;
                           continue;
                        case 8:
                           var17 = var22.v(var21, 8, N.a, var17) as Int;
                           var2 |= 256;
                           continue;
                        case 9:
                           var10 = var22.s(var21, var7);
                           var2 |= 512;
                           continue;
                        case 10:
                           var31 = var22.t(var21, var5);
                           var2 |= 1024;
                           continue;
                        default:
                           throw new n(var9);
                     }

                     var5 = 10;
                     var7 = 9;
                     var8 = 7;
                     continue;
                  }

                  var5 = 10;
                  var7 = 9;
                  continue;
               }

               var5 = 10;
            }

            var33 = var31;
            var20 = (Integer)var17;
            var27 = var33;
            var19 = var29;
            var31 = var27;
            var17 = var30;
            var18 = var25;
         }

         var22.b(var21);
         return new EmbedThumbnail(
            var2,
            (java.lang.String)var18,
            (java.lang.String)var17,
            (java.lang.String)var31,
            var4,
            var3,
            var19,
            var16,
            (java.lang.String)var27,
            var20,
            var10,
            (java.lang.String)var33,
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
         return fa.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedThumbnail> {
         return EmbedThumbnail.$serializer.INSTANCE;
      }
   }
}
