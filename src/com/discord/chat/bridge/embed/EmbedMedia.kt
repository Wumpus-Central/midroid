package com.discord.chat.bridge.embed

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
public data class EmbedMedia(url: String,
      proxyURL: String? = null,
      width: Int,
      height: Int,
      placeholder: String? = null,
      placeholderVersion: Int? = null,
      srcIsAnimated: Boolean,
      contentType: String? = null
   ) :
   EmbedUrlProvider {
   public final val url: String
   public final val proxyURL: String?
   public final val width: Int
   public final val height: Int
   public final val placeholder: String?
   public final val placeholderVersion: Int?
   public final val srcIsAnimated: Boolean
   public final val contentType: String?
   public open val embedUrl: String

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
      this.contentType = var8;
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

   public operator fun component8(): String? {
      return this.contentType;
   }

   public fun copy(
      url: String = var0.url,
      proxyURL: String? = var0.proxyURL,
      width: Int = var0.width,
      height: Int = var0.height,
      placeholder: String? = var0.placeholder,
      placeholderVersion: Int? = var0.placeholderVersion,
      srcIsAnimated: Boolean = var0.srcIsAnimated,
      contentType: String? = var0.contentType
   ): EmbedMedia {
      q.h(var1, "url");
      return new EmbedMedia(var1, var2, var3, var4, var5, var6, var7, var8);
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
         } else if (this.srcIsAnimated != var1.srcIsAnimated) {
            return false;
         } else {
            return q.c(this.contentType, var1.contentType);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = this.url.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.proxyURL == null) {
         var1 = 0;
      } else {
         var1 = this.proxyURL.hashCode();
      }

      val var7: Int = Integer.hashCode(this.width);
      val var6: Int = Integer.hashCode(this.height);
      val var2: Int;
      if (this.placeholder == null) {
         var2 = 0;
      } else {
         var2 = this.placeholder.hashCode();
      }

      val var3: Int;
      if (this.placeholderVersion == null) {
         var3 = 0;
      } else {
         var3 = this.placeholderVersion.hashCode();
      }

      val var8: Int = java.lang.Boolean.hashCode(this.srcIsAnimated);
      if (this.contentType != null) {
         var4 = this.contentType.hashCode();
      }

      return ((((((var5 * 31 + var1) * 31 + var7) * 31 + var6) * 31 + var2) * 31 + var3) * 31 + var8) * 31 + var4;
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.url;
      val var8: java.lang.String = this.proxyURL;
      val var2: Int = this.width;
      val var1: Int = this.height;
      val var4: java.lang.String = this.placeholder;
      val var5: Int = this.placeholderVersion;
      val var3: Boolean = this.srcIsAnimated;
      val var7: java.lang.String = this.contentType;
      val var9: StringBuilder = new StringBuilder();
      var9.append("EmbedMedia(url=");
      var9.append(var6);
      var9.append(", proxyURL=");
      var9.append(var8);
      var9.append(", width=");
      var9.append(var2);
      var9.append(", height=");
      var9.append(var1);
      var9.append(", placeholder=");
      var9.append(var4);
      var9.append(", placeholderVersion=");
      var9.append(var5);
      var9.append(", srcIsAnimated=");
      var9.append(var3);
      var9.append(", contentType=");
      var9.append(var7);
      var9.append(")");
      return var9.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedMedia> {
         return EmbedMedia.$serializer.INSTANCE;
      }
   }
}
