package com.discord.chat.bridge.embed

import kotlinx.serialization.KSerializer
import tp.m

@m
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
      return new EmbedThumbnail(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedThumbnail) {
         return false;
      } else {
         var1 = var1;
         if (!(this.url == var1.url)) {
            return false;
         } else if (!(this.proxyURL == var1.proxyURL)) {
            return false;
         } else if (!(this.videoUrl == var1.videoUrl)) {
            return false;
         } else if (this.height != var1.height) {
            return false;
         } else if (this.width != var1.width) {
            return false;
         } else if (!(this.gifv == var1.gifv)) {
            return false;
         } else if (!(this.showPlayButton == var1.showPlayButton)) {
            return false;
         } else if (!(this.placeholder == var1.placeholder)) {
            return false;
         } else if (!(this.placeholderVersion == var1.placeholderVersion)) {
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
      val var10: java.lang.String = this.url;
      val var7: java.lang.String = this.proxyURL;
      val var4: java.lang.String = this.videoUrl;
      val var2: Int = this.height;
      val var1: Int = this.width;
      val var6: java.lang.Boolean = this.gifv;
      val var5: java.lang.Boolean = this.showPlayButton;
      val var11: java.lang.String = this.placeholder;
      val var9: Int = this.placeholderVersion;
      val var3: Boolean = this.srcIsAnimated;
      val var8: StringBuilder = new StringBuilder();
      var8.append("EmbedThumbnail(url=");
      var8.append(var10);
      var8.append(", proxyURL=");
      var8.append(var7);
      var8.append(", videoUrl=");
      var8.append(var4);
      var8.append(", height=");
      var8.append(var2);
      var8.append(", width=");
      var8.append(var1);
      var8.append(", gifv=");
      var8.append(var6);
      var8.append(", showPlayButton=");
      var8.append(var5);
      var8.append(", placeholder=");
      var8.append(var11);
      var8.append(", placeholderVersion=");
      var8.append(var9);
      var8.append(", srcIsAnimated=");
      var8.append(var3);
      var8.append(")");
      return var8.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedThumbnail> {
         return EmbedThumbnail.$serializer.INSTANCE;
      }
   }
}
