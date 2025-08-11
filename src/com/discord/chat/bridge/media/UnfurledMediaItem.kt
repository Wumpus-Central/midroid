package com.discord.chat.bridge.media

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class UnfurledMediaItem(url: String,
   proxyUrl: String,
   loadingState: UnfurledMediaLoadingState,
   height: Int? = null,
   width: Int? = null,
   contentType: String? = null,
   placeholder: String? = null,
   placeholderVersion: Int? = null,
   contentScanMetadata: ContentScanMetadata? = null,
   srcIsAnimated: Boolean
) {
   public final val url: String
   public final val proxyUrl: String
   public final val loadingState: UnfurledMediaLoadingState
   public final val height: Int?
   public final val width: Int?
   public final val contentType: String?
   public final val placeholder: String?
   public final val placeholderVersion: Int?
   public final val contentScanMetadata: ContentScanMetadata?
   public final val srcIsAnimated: Boolean

   init {
      r.h(var1, "url");
      r.h(var2, "proxyUrl");
      r.h(var3, "loadingState");
      super();
      this.url = var1;
      this.proxyUrl = var2;
      this.loadingState = var3;
      this.height = var4;
      this.width = var5;
      this.contentType = var6;
      this.placeholder = var7;
      this.placeholderVersion = var8;
      this.contentScanMetadata = var9;
      this.srcIsAnimated = var10;
   }

   public operator fun component1(): String {
      return this.url;
   }

   public operator fun component10(): Boolean {
      return this.srcIsAnimated;
   }

   public operator fun component2(): String {
      return this.proxyUrl;
   }

   public operator fun component3(): UnfurledMediaLoadingState {
      return this.loadingState;
   }

   public operator fun component4(): Int? {
      return this.height;
   }

   public operator fun component5(): Int? {
      return this.width;
   }

   public operator fun component6(): String? {
      return this.contentType;
   }

   public operator fun component7(): String? {
      return this.placeholder;
   }

   public operator fun component8(): Int? {
      return this.placeholderVersion;
   }

   public operator fun component9(): ContentScanMetadata? {
      return this.contentScanMetadata;
   }

   public fun copy(
      url: String = var0.url,
      proxyUrl: String = var0.proxyUrl,
      loadingState: UnfurledMediaLoadingState = var0.loadingState,
      height: Int? = var0.height,
      width: Int? = var0.width,
      contentType: String? = var0.contentType,
      placeholder: String? = var0.placeholder,
      placeholderVersion: Int? = var0.placeholderVersion,
      contentScanMetadata: ContentScanMetadata? = var0.contentScanMetadata,
      srcIsAnimated: Boolean = var0.srcIsAnimated
   ): UnfurledMediaItem {
      r.h(var1, "url");
      r.h(var2, "proxyUrl");
      r.h(var3, "loadingState");
      return new UnfurledMediaItem(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnfurledMediaItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.url, var1.url)) {
            return false;
         } else if (!r.c(this.proxyUrl, var1.proxyUrl)) {
            return false;
         } else if (this.loadingState != var1.loadingState) {
            return false;
         } else if (!r.c(this.height, var1.height)) {
            return false;
         } else if (!r.c(this.width, var1.width)) {
            return false;
         } else if (!r.c(this.contentType, var1.contentType)) {
            return false;
         } else if (!r.c(this.placeholder, var1.placeholder)) {
            return false;
         } else if (!r.c(this.placeholderVersion, var1.placeholderVersion)) {
            return false;
         } else if (!r.c(this.contentScanMetadata, var1.contentScanMetadata)) {
            return false;
         } else {
            return this.srcIsAnimated == var1.srcIsAnimated;
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = this.url.hashCode();
      val var8: Int = this.proxyUrl.hashCode();
      val var9: Int = this.loadingState.hashCode();
      var var6: Int = 0;
      val var1: Int;
      if (this.height == null) {
         var1 = 0;
      } else {
         var1 = this.height.hashCode();
      }

      val var2: Int;
      if (this.width == null) {
         var2 = 0;
      } else {
         var2 = this.width.hashCode();
      }

      val var3: Int;
      if (this.contentType == null) {
         var3 = 0;
      } else {
         var3 = this.contentType.hashCode();
      }

      val var4: Int;
      if (this.placeholder == null) {
         var4 = 0;
      } else {
         var4 = this.placeholder.hashCode();
      }

      val var5: Int;
      if (this.placeholderVersion == null) {
         var5 = 0;
      } else {
         var5 = this.placeholderVersion.hashCode();
      }

      if (this.contentScanMetadata != null) {
         var6 = this.contentScanMetadata.hashCode();
      }

      return ((((((((var7 * 31 + var8) * 31 + var9) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31
         + java.lang.Boolean.hashCode(this.srcIsAnimated);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.url;
      val var8: java.lang.String = this.proxyUrl;
      val var10: UnfurledMediaLoadingState = this.loadingState;
      val var6: Int = this.height;
      val var2: Int = this.width;
      val var9: java.lang.String = this.contentType;
      val var7: java.lang.String = this.placeholder;
      val var5: Int = this.placeholderVersion;
      val var4: ContentScanMetadata = this.contentScanMetadata;
      val var1: Boolean = this.srcIsAnimated;
      val var11: StringBuilder = new StringBuilder();
      var11.append("UnfurledMediaItem(url=");
      var11.append(var3);
      var11.append(", proxyUrl=");
      var11.append(var8);
      var11.append(", loadingState=");
      var11.append(var10);
      var11.append(", height=");
      var11.append(var6);
      var11.append(", width=");
      var11.append(var2);
      var11.append(", contentType=");
      var11.append(var9);
      var11.append(", placeholder=");
      var11.append(var7);
      var11.append(", placeholderVersion=");
      var11.append(var5);
      var11.append(", contentScanMetadata=");
      var11.append(var4);
      var11.append(", srcIsAnimated=");
      var11.append(var1);
      var11.append(")");
      return var11.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UnfurledMediaItem> {
         return UnfurledMediaItem.$serializer.INSTANCE;
      }
   }
}
