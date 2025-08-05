package com.discord.chat.bridge.embed

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
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
   public final val url: String
   public final val proxyURL: String?
   public final val videoUrl: String?
   public final val height: Int
   public final val width: Int
   public final val gifv: Boolean?
   public final val showPlayButton: Boolean?
   public final val placeholder: String?
   public final val placeholderVersion: Int?
   public final val srcIsAnimated: Boolean
   public open val embedUrl: String

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
      r.h(var1, "url");
      return new EmbedThumbnail(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
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
         } else if (!r.c(this.placeholderVersion, var1.placeholderVersion)) {
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

      val var8: Int = Integer.hashCode(this.height);
      val var9: Int = Integer.hashCode(this.width);
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

      return ((((((((var7 * 31 + var1) * 31 + var2) * 31 + var8) * 31 + var9) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31
         + java.lang.Boolean.hashCode(this.srcIsAnimated);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.url;
      val var8: java.lang.String = this.proxyURL;
      val var9: java.lang.String = this.videoUrl;
      val var2: Int = this.height;
      val var1: Int = this.width;
      val var6: java.lang.Boolean = this.gifv;
      val var7: java.lang.Boolean = this.showPlayButton;
      val var5: java.lang.String = this.placeholder;
      val var10: Int = this.placeholderVersion;
      val var3: Boolean = this.srcIsAnimated;
      val var11: StringBuilder = new StringBuilder();
      var11.append("EmbedThumbnail(url=");
      var11.append(var4);
      var11.append(", proxyURL=");
      var11.append(var8);
      var11.append(", videoUrl=");
      var11.append(var9);
      var11.append(", height=");
      var11.append(var2);
      var11.append(", width=");
      var11.append(var1);
      var11.append(", gifv=");
      var11.append(var6);
      var11.append(", showPlayButton=");
      var11.append(var7);
      var11.append(", placeholder=");
      var11.append(var5);
      var11.append(", placeholderVersion=");
      var11.append(var10);
      var11.append(", srcIsAnimated=");
      var11.append(var3);
      var11.append(")");
      return var11.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedThumbnail> {
         return EmbedThumbnail.$serializer.INSTANCE;
      }
   }
}
