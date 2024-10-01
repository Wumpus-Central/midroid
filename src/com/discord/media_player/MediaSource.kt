package com.discord.media_player

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kh.p
import kotlin.jvm.internal.q

public data class MediaSource(sourceUrl: String? = ...,
   previewUrl: String? = ...,
   placeholder: String? = ...,
   placeholderVersion: Int? = ...,
   featureTag: String,
   type: MediaType,
   shouldAutoPlay: Boolean = ...,
   channelId: ChannelId?,
   messageId: MessageId? = ...,
   index: Int? = ...,
   portal: Double? = ...
) : MediaSource(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11) {
   public final val channelId: ChannelId?
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
      var8: ChannelId,
      var9: java.lang.String,
      var10: Int,
      var11: java.lang.Double
   ) {
      q.h(var5, "featureTag");
      q.h(var6, "type");
      super();
      this.sourceUrl = var1;
      this.previewUrl = var2;
      this.placeholder = var3;
      this.placeholderVersion = var4;
      this.featureTag = var5;
      this.type = var6;
      this.shouldAutoPlay = var7;
      this.channelId = var8;
      this.messageId = var9;
      this.index = var10;
      this.portal = var11;
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

      label39: {
         this.isVideo = var7;
         val var12: Int = MediaSource.WhenMappings.$EnumSwitchMapping$0[var6.ordinal()];
         if (var12 != 1) {
            if (var12 != 2 && var12 != 3 && var12 != 4) {
               throw new p();
            }

            var7 = false;
            if (var1 == null) {
               break label39;
            }

            if (h.x(var1)) {
               var7 = false;
               break label39;
            }
         } else {
            var7 = false;
            if (var2 == null) {
               break label39;
            }

            if (h.x(var2)) {
               var7 = false;
               break label39;
            }
         }

         var7 = true;
      }

      this.isValid = var7;
   }

   public operator fun component1(): String? {
      return this.sourceUrl;
   }

   public operator fun component10(): Int? {
      return this.index;
   }

   public operator fun component11(): Double? {
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

   public operator fun component8(): ChannelId? {
      return this.channelId;
   }

   public operator fun component9(): MessageId? {
      return this.messageId;
   }

   public fun copy(
      sourceUrl: String? = ...,
      previewUrl: String? = ...,
      placeholder: String? = ...,
      placeholderVersion: Int? = ...,
      featureTag: String = ...,
      type: MediaType = ...,
      shouldAutoPlay: Boolean = ...,
      channelId: ChannelId? = ...,
      messageId: MessageId? = ...,
      index: Int? = ...,
      portal: Double? = ...
   ): MediaSource {
      q.h(var5, "featureTag");
      q.h(var6, "type");
      return new MediaSource(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaSource) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.sourceUrl, var1.sourceUrl)) {
            return false;
         } else if (!q.c(this.previewUrl, var1.previewUrl)) {
            return false;
         } else if (!q.c(this.placeholder, var1.placeholder)) {
            return false;
         } else if (!q.c(this.placeholderVersion, var1.placeholderVersion)) {
            return false;
         } else if (!q.c(this.featureTag, var1.featureTag)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (this.shouldAutoPlay != var1.shouldAutoPlay) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (if (this.messageId == null) var1.messageId == null else var1.messageId != null && MessageId.equals-impl0(this.messageId, var1.messageId)) {
            if (!q.c(this.index, var1.index)) {
               return false;
            } else {
               return q.c(this.portal, var1.portal);
            }
         } else {
            return false;
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

      val var9: Int = this.featureTag.hashCode();
      val var11: Int = this.type.hashCode();
      val var10: Int = java.lang.Boolean.hashCode(this.shouldAutoPlay);
      val var5: Int;
      if (this.channelId == null) {
         var5 = 0;
      } else {
         var5 = ChannelId.hashCode-impl(this.channelId.unbox-impl());
      }

      val var6: Int;
      if (this.messageId == null) {
         var6 = 0;
      } else {
         var6 = MessageId.hashCode-impl(this.messageId);
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

      return (((((((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var9) * 31 + var11) * 31 + var10) * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var8;
   }

   public override fun toString(): String {
      val var9: java.lang.String = this.sourceUrl;
      val var4: java.lang.String = this.previewUrl;
      val var8: java.lang.String = this.placeholder;
      val var5: Int = this.placeholderVersion;
      val var7: java.lang.String = this.featureTag;
      val var6: MediaType = this.type;
      val var1: Boolean = this.shouldAutoPlay;
      val var3: ChannelId = this.channelId;
      val var13: java.lang.String;
      if (this.messageId == null) {
         var13 = "null";
      } else {
         var13 = MessageId.toString-impl(this.messageId);
      }

      val var11: Int = this.index;
      val var10: java.lang.Double = this.portal;
      val var12: StringBuilder = new StringBuilder();
      var12.append("MediaSource(sourceUrl=");
      var12.append(var9);
      var12.append(", previewUrl=");
      var12.append(var4);
      var12.append(", placeholder=");
      var12.append(var8);
      var12.append(", placeholderVersion=");
      var12.append(var5);
      var12.append(", featureTag=");
      var12.append(var7);
      var12.append(", type=");
      var12.append(var6);
      var12.append(", shouldAutoPlay=");
      var12.append(var1);
      var12.append(", channelId=");
      var12.append(var3);
      var12.append(", messageId=");
      var12.append(var13);
      var12.append(", index=");
      var12.append(var11);
      var12.append(", portal=");
      var12.append(var10);
      var12.append(")");
      return var12.toString();
   }
}
