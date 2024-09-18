package com.discord.media_player

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import gh.p
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
         val var2: MediaSource = var1 as MediaSource;
         if (!q.c(this.sourceUrl, (var1 as MediaSource).sourceUrl)) {
            return false;
         } else if (!q.c(this.previewUrl, var2.previewUrl)) {
            return false;
         } else if (!q.c(this.placeholder, var2.placeholder)) {
            return false;
         } else if (!q.c(this.placeholderVersion, var2.placeholderVersion)) {
            return false;
         } else if (!q.c(this.featureTag, var2.featureTag)) {
            return false;
         } else if (this.type != var2.type) {
            return false;
         } else if (this.shouldAutoPlay != var2.shouldAutoPlay) {
            return false;
         } else if (!q.c(this.channelId, var2.channelId)) {
            return false;
         } else if (if (this.messageId == null) var2.messageId == null else var2.messageId != null && MessageId.equals-impl0(this.messageId, var2.messageId)) {
            if (!q.c(this.index, var2.index)) {
               return false;
            } else {
               return q.c(this.portal, var2.portal);
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

      val var10: Int = this.featureTag.hashCode();
      val var11: Int = this.type.hashCode();
      val var9: Int = java.lang.Boolean.hashCode(this.shouldAutoPlay);
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

      return (((((((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var10) * 31 + var11) * 31 + var9) * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var8;
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.sourceUrl;
      val var4: java.lang.String = this.previewUrl;
      val var7: java.lang.String = this.placeholder;
      val var6: Int = this.placeholderVersion;
      val var9: java.lang.String = this.featureTag;
      val var8: MediaType = this.type;
      val var1: Boolean = this.shouldAutoPlay;
      val var3: ChannelId = this.channelId;
      val var13: java.lang.String;
      if (this.messageId == null) {
         var13 = "null";
      } else {
         var13 = MessageId.toString-impl(this.messageId);
      }

      val var12: Int = this.index;
      val var11: java.lang.Double = this.portal;
      val var10: StringBuilder = new StringBuilder();
      var10.append("MediaSource(sourceUrl=");
      var10.append(var5);
      var10.append(", previewUrl=");
      var10.append(var4);
      var10.append(", placeholder=");
      var10.append(var7);
      var10.append(", placeholderVersion=");
      var10.append(var6);
      var10.append(", featureTag=");
      var10.append(var9);
      var10.append(", type=");
      var10.append(var8);
      var10.append(", shouldAutoPlay=");
      var10.append(var1);
      var10.append(", channelId=");
      var10.append(var3);
      var10.append(", messageId=");
      var10.append(var13);
      var10.append(", index=");
      var10.append(var12);
      var10.append(", portal=");
      var10.append(var11);
      var10.append(")");
      return var10.toString();
   }
}
