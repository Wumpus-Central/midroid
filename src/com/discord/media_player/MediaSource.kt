package com.discord.media_player

import com.discord.primitives.MessageId
import eh.p
import kotlin.jvm.internal.r

public data class MediaSource(sourceUrl: String? = ...,
   previewUrl: String? = ...,
   placeholder: String? = ...,
   placeholderVersion: Int? = ...,
   featureTag: String,
   type: MediaType,
   shouldAutoPlay: Boolean = ...,
   messageId: MessageId? = ...,
   index: Int? = ...,
   portal: Double? = ...
) : MediaSource(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10) {
   public final val featureTag: String
   public final val index: Int?
   public final val isGifv: Boolean
   public final val isValid: Boolean
   public final val isVideo: Boolean
   public final val messageId: MessageId?
   public final val placeholder: String?
   public final val placeholderVersion: Int?
   public final val portal: Double?
   public final val previewUrl: String?
   public final val shouldAutoPlay: Boolean
   public final val sourceUrl: String?
   public final val type: MediaType

   fun MediaSource(
      var1: java.lang.String,
      var2: java.lang.String,
      var3: java.lang.String,
      var4: Int,
      var5: java.lang.String,
      var6: MediaType,
      var7: Boolean,
      var8: java.lang.String,
      var9: Int,
      var10: java.lang.Double
   ) {
      this.sourceUrl = var1;
      this.previewUrl = var2;
      this.placeholder = var3;
      this.placeholderVersion = var4;
      this.featureTag = var5;
      this.type = var6;
      this.shouldAutoPlay = var7;
      this.messageId = var8;
      this.index = var9;
      this.portal = var10;
      if (var6 === MediaType.GIFV) {
         var7 = true;
      } else {
         var7 = false;
      }

      this.isGifv = var7;
      if (var6 === MediaType.VIDEO) {
         var7 = true;
      } else {
         var7 = false;
      }

      label52: {
         this.isVideo = var7;
         val var11: Int = MediaSource.WhenMappings.$EnumSwitchMapping$0[var6.ordinal()];
         if (var11 != 1) {
            if (var11 != 2 && var11 != 3 && var11 != 4) {
               throw new p();
            }

            val var17: Boolean;
            if (var1 != null && !f.x(var1)) {
               var17 = false;
            } else {
               var17 = true;
            }

            var7 = false;
            if (var17) {
               break label52;
            }
         } else {
            val var18: Boolean;
            if (var2 != null && !f.x(var2)) {
               var18 = false;
            } else {
               var18 = true;
            }

            var7 = false;
            if (var18) {
               break label52;
            }
         }

         var7 = true;
      }

      this.isValid = var7;
   }

   public operator fun component1(): String? {
      return this.sourceUrl;
   }

   public operator fun component10(): Double? {
      return this.portal;
   }

   public operator fun component2(): String? {
      return this.previewUrl;
   }

   public operator fun component3(): String? {
      return this.placeholder;
   }

   public operator fun component4(): Int? {
      return this.placeholderVersion;
   }

   public operator fun component5(): String {
      return this.featureTag;
   }

   public operator fun component6(): MediaType {
      return this.type;
   }

   public operator fun component7(): Boolean {
      return this.shouldAutoPlay;
   }

   public operator fun component8(): MessageId? {
      return this.messageId;
   }

   public operator fun component9(): Int? {
      return this.index;
   }

   public fun copy(
      sourceUrl: String? = ...,
      previewUrl: String? = ...,
      placeholder: String? = ...,
      placeholderVersion: Int? = ...,
      featureTag: String = ...,
      type: MediaType = ...,
      shouldAutoPlay: Boolean = ...,
      messageId: MessageId? = ...,
      index: Int? = ...,
      portal: Double? = ...
   ): MediaSource {
      r.h(var5, "featureTag");
      r.h(var6, "type");
      return new MediaSource(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaSource) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.sourceUrl, var1.sourceUrl)) {
            return false;
         } else if (!r.c(this.previewUrl, var1.previewUrl)) {
            return false;
         } else if (!r.c(this.placeholder, var1.placeholder)) {
            return false;
         } else if (!r.c(this.placeholderVersion, var1.placeholderVersion)) {
            return false;
         } else if (!r.c(this.featureTag, var1.featureTag)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (this.shouldAutoPlay != var1.shouldAutoPlay) {
            return false;
         } else {
            var var2: Boolean;
            label50: {
               if (this.messageId == null) {
                  if (var1.messageId == null) {
                     var2 = true;
                     break label50;
                  }
               } else if (var1.messageId != null) {
                  var2 = MessageId.equals-impl0(this.messageId, var1.messageId);
                  break label50;
               }

               var2 = false;
            }

            if (!var2) {
               return false;
            } else if (!r.c(this.index, var1.index)) {
               return false;
            } else {
               return r.c(this.portal, var1.portal);
            }
         }
      }
   }

   public override fun hashCode(): Int {
      var var8: Int = 0;
      val var1: Int;
      if (this.sourceUrl == null) {
         var1 = 0;
      } else {
         var1 = this.sourceUrl.hashCode();
      }

      val var2: Int;
      if (this.previewUrl == null) {
         var2 = 0;
      } else {
         var2 = this.previewUrl.hashCode();
      }

      val var3: Int;
      if (this.placeholder == null) {
         var3 = 0;
      } else {
         var3 = this.placeholder.hashCode();
      }

      val var4: Int;
      if (this.placeholderVersion == null) {
         var4 = 0;
      } else {
         var4 = this.placeholderVersion.hashCode();
      }

      val var10: Int = this.featureTag.hashCode();
      val var9: Int = this.type.hashCode();
      var var5: Byte = this.shouldAutoPlay;
      if (this.shouldAutoPlay != 0) {
         var5 = 1;
      }

      val var12: Int;
      if (this.messageId == null) {
         var12 = 0;
      } else {
         var12 = MessageId.hashCode-impl(this.messageId);
      }

      val var7: Int;
      if (this.index == null) {
         var7 = 0;
      } else {
         var7 = this.index.hashCode();
      }

      if (this.portal != null) {
         var8 = this.portal.hashCode();
      }

      return ((((((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var10) * 31 + var9) * 31 + var5) * 31 + var12) * 31 + var7) * 31 + var8;
   }

   public override fun toString(): String {
      val var7: java.lang.String = this.sourceUrl;
      val var4: java.lang.String = this.previewUrl;
      val var5: java.lang.String = this.placeholder;
      val var8: Int = this.placeholderVersion;
      val var6: java.lang.String = this.featureTag;
      val var3: MediaType = this.type;
      val var1: Boolean = this.shouldAutoPlay;
      val var12: java.lang.String;
      if (this.messageId == null) {
         var12 = "null";
      } else {
         var12 = MessageId.toString-impl(this.messageId);
      }

      val var10: Int = this.index;
      val var11: java.lang.Double = this.portal;
      val var9: StringBuilder = new StringBuilder();
      var9.append("MediaSource(sourceUrl=");
      var9.append(var7);
      var9.append(", previewUrl=");
      var9.append(var4);
      var9.append(", placeholder=");
      var9.append(var5);
      var9.append(", placeholderVersion=");
      var9.append(var8);
      var9.append(", featureTag=");
      var9.append(var6);
      var9.append(", type=");
      var9.append(var3);
      var9.append(", shouldAutoPlay=");
      var9.append(var1);
      var9.append(", messageId=");
      var9.append(var12);
      var9.append(", index=");
      var9.append(var10);
      var9.append(", portal=");
      var9.append(var11);
      var9.append(")");
      return var9.toString();
   }
}
