package com.discord.chat.bridge.postpreviewembed

import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
public data class PostPreviewEmbed(parentChannelId: ChannelId,
      threadId: ChannelId,
      messageId: MessageId,
      guildId: GuildId,
      title: String,
      ctaText: String,
      ctaButtonColor: Int,
      footer: StructurableText,
      subtitle: String? = ...,
      coverImage: String? = ...,
      blurredCoverImage: String? = ...,
      coverImageOverlayText: String? = ...,
      backgroundImage: String? = ...,
      spoiler: String? = ...,
      obscure: String? = ...,
      obscureAwaitingScan: Boolean? = ...,
      shouldSpoiler: Boolean = ...,
      obscureHideControls: Boolean? = ...,
      obscureIsOpaque: Boolean? = ...,
      verifyAge: Boolean? = ...
   ) : PostPreviewEmbed(var1, var3, var5, var6, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22, var23),
   SpoilerableData {
   public final val parentChannelId: ChannelId
   public final val threadId: ChannelId
   public final val messageId: MessageId
   public final val guildId: GuildId
   public final val title: String
   public final val ctaText: String
   public final val ctaButtonColor: Int
   public final val footer: StructurableText
   public final val subtitle: String?
   public final val coverImage: String?
   public final val blurredCoverImage: String?
   public final val coverImageOverlayText: String?
   public final val backgroundImage: String?
   public final val spoiler: String?
   public final val obscure: String?
   public final val obscureAwaitingScan: Boolean?
   public final val shouldSpoiler: Boolean
   public final val obscureHideControls: Boolean?
   public final val obscureIsOpaque: Boolean?
   public final val verifyAge: Boolean?
   public open val spoilerOrNull: String?
   public open val obscureOrNull: String?

   fun PostPreviewEmbed(
      var1: Long,
      var3: Long,
      var5: java.lang.String,
      var6: Long,
      var8: java.lang.String,
      var9: java.lang.String,
      var10: Int,
      var11: StructurableText,
      var12: java.lang.String,
      var13: java.lang.String,
      var14: java.lang.String,
      var15: java.lang.String,
      var16: java.lang.String,
      var17: java.lang.String,
      var18: java.lang.String,
      var19: java.lang.Boolean,
      var20: Boolean,
      var21: java.lang.Boolean,
      var22: java.lang.Boolean,
      var23: java.lang.Boolean
   ) {
      var var24: java.lang.String = var17;
      r.h(var5, "messageId");
      r.h(var8, "title");
      r.h(var9, "ctaText");
      r.h(var11, "footer");
      super();
      this.parentChannelId = var1;
      this.threadId = var3;
      this.messageId = var5;
      this.guildId = var6;
      this.title = var8;
      this.ctaText = var9;
      this.ctaButtonColor = var10;
      this.footer = var11;
      this.subtitle = var12;
      this.coverImage = var13;
      this.blurredCoverImage = var14;
      this.coverImageOverlayText = var15;
      this.backgroundImage = var16;
      this.spoiler = var17;
      this.obscure = var18;
      this.obscureAwaitingScan = var19;
      this.shouldSpoiler = var20;
      this.obscureHideControls = var21;
      this.obscureIsOpaque = var22;
      this.verifyAge = var23;
      if (var17 == null || h.c0(var17)) {
         var24 = null;
      }

      this.spoilerOrNull = var24;
      var5 = null;
      if (var18 != null) {
         var5 = null;
         if (!h.c0(var18)) {
            var5 = var18;
         }
      }

      this.obscureOrNull = var5;
   }

   public operator fun component1(): ChannelId {
      return this.parentChannelId;
   }

   public operator fun component10(): String? {
      return this.coverImage;
   }

   public operator fun component11(): String? {
      return this.blurredCoverImage;
   }

   public operator fun component12(): String? {
      return this.coverImageOverlayText;
   }

   public operator fun component13(): String? {
      return this.backgroundImage;
   }

   public operator fun component14(): String? {
      return this.spoiler;
   }

   public operator fun component15(): String? {
      return this.obscure;
   }

   public operator fun component16(): Boolean? {
      return this.obscureAwaitingScan;
   }

   public operator fun component17(): Boolean {
      return this.shouldSpoiler;
   }

   public operator fun component18(): Boolean? {
      return this.obscureHideControls;
   }

   public operator fun component19(): Boolean? {
      return this.obscureIsOpaque;
   }

   public operator fun component2(): ChannelId {
      return this.threadId;
   }

   public operator fun component20(): Boolean? {
      return this.verifyAge;
   }

   public operator fun component3(): MessageId {
      return this.messageId;
   }

   public operator fun component4(): GuildId {
      return this.guildId;
   }

   public operator fun component5(): String {
      return this.title;
   }

   public operator fun component6(): String {
      return this.ctaText;
   }

   public operator fun component7(): Int {
      return this.ctaButtonColor;
   }

   public operator fun component8(): StructurableText {
      return this.footer;
   }

   public operator fun component9(): String? {
      return this.subtitle;
   }

   public fun copy(
      parentChannelId: ChannelId = ...,
      threadId: ChannelId = ...,
      messageId: MessageId = ...,
      guildId: GuildId = ...,
      title: String = ...,
      ctaText: String = ...,
      ctaButtonColor: Int = ...,
      footer: StructurableText = ...,
      subtitle: String? = ...,
      coverImage: String? = ...,
      blurredCoverImage: String? = ...,
      coverImageOverlayText: String? = ...,
      backgroundImage: String? = ...,
      spoiler: String? = ...,
      obscure: String? = ...,
      obscureAwaitingScan: Boolean? = ...,
      shouldSpoiler: Boolean = ...,
      obscureHideControls: Boolean? = ...,
      obscureIsOpaque: Boolean? = ...,
      verifyAge: Boolean? = ...
   ): PostPreviewEmbed {
      r.h(var5, "messageId");
      r.h(var8, "title");
      r.h(var9, "ctaText");
      r.h(var11, "footer");
      return new PostPreviewEmbed(
         var1, var3, var5, var6, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22, var23, null
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PostPreviewEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!ChannelId.equals-impl0(this.parentChannelId, var1.parentChannelId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.threadId, var1.threadId)) {
            return false;
         } else if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!GuildId.equals-impl0(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.title, var1.title)) {
            return false;
         } else if (!r.c(this.ctaText, var1.ctaText)) {
            return false;
         } else if (this.ctaButtonColor != var1.ctaButtonColor) {
            return false;
         } else if (!r.c(this.footer, var1.footer)) {
            return false;
         } else if (!r.c(this.subtitle, var1.subtitle)) {
            return false;
         } else if (!r.c(this.coverImage, var1.coverImage)) {
            return false;
         } else if (!r.c(this.blurredCoverImage, var1.blurredCoverImage)) {
            return false;
         } else if (!r.c(this.coverImageOverlayText, var1.coverImageOverlayText)) {
            return false;
         } else if (!r.c(this.backgroundImage, var1.backgroundImage)) {
            return false;
         } else if (!r.c(this.spoiler, var1.spoiler)) {
            return false;
         } else if (!r.c(this.obscure, var1.obscure)) {
            return false;
         } else if (!r.c(this.obscureAwaitingScan, var1.obscureAwaitingScan)) {
            return false;
         } else if (this.shouldSpoiler != var1.shouldSpoiler) {
            return false;
         } else if (!r.c(this.obscureHideControls, var1.obscureHideControls)) {
            return false;
         } else if (!r.c(this.obscureIsOpaque, var1.obscureIsOpaque)) {
            return false;
         } else {
            return r.c(this.verifyAge, var1.verifyAge);
         }
      }
   }

   public override fun hashCode(): Int {
      val var14: Int = ChannelId.hashCode-impl(this.parentChannelId);
      val var16: Int = ChannelId.hashCode-impl(this.threadId);
      val var18: Int = MessageId.hashCode-impl(this.messageId);
      val var15: Int = GuildId.hashCode-impl(this.guildId);
      val var19: Int = this.title.hashCode();
      val var17: Int = this.ctaText.hashCode();
      val var12: Int = Integer.hashCode(this.ctaButtonColor);
      val var13: Int = this.footer.hashCode();
      var var11: Int = 0;
      val var1: Int;
      if (this.subtitle == null) {
         var1 = 0;
      } else {
         var1 = this.subtitle.hashCode();
      }

      val var2: Int;
      if (this.coverImage == null) {
         var2 = 0;
      } else {
         var2 = this.coverImage.hashCode();
      }

      val var3: Int;
      if (this.blurredCoverImage == null) {
         var3 = 0;
      } else {
         var3 = this.blurredCoverImage.hashCode();
      }

      val var4: Int;
      if (this.coverImageOverlayText == null) {
         var4 = 0;
      } else {
         var4 = this.coverImageOverlayText.hashCode();
      }

      val var5: Int;
      if (this.backgroundImage == null) {
         var5 = 0;
      } else {
         var5 = this.backgroundImage.hashCode();
      }

      val var6: Int;
      if (this.spoiler == null) {
         var6 = 0;
      } else {
         var6 = this.spoiler.hashCode();
      }

      val var7: Int;
      if (this.obscure == null) {
         var7 = 0;
      } else {
         var7 = this.obscure.hashCode();
      }

      val var8: Int;
      if (this.obscureAwaitingScan == null) {
         var8 = 0;
      } else {
         var8 = this.obscureAwaitingScan.hashCode();
      }

      val var20: Int = java.lang.Boolean.hashCode(this.shouldSpoiler);
      val var9: Int;
      if (this.obscureHideControls == null) {
         var9 = 0;
      } else {
         var9 = this.obscureHideControls.hashCode();
      }

      val var10: Int;
      if (this.obscureIsOpaque == null) {
         var10 = 0;
      } else {
         var10 = this.obscureIsOpaque.hashCode();
      }

      if (this.verifyAge != null) {
         var11 = this.verifyAge.hashCode();
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           (
                                                                                                                                    (
                                                                                                                                             (
                                                                                                                                                      (
                                                                                                                                                               (
                                                                                                                                                                        var14
                                                                                                                                                                              * 31
                                                                                                                                                                           + var16
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var18
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var15
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var19
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var17
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var12
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var13
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var1
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var2
                                                                                             )
                                                                                             * 31
                                                                                          + var3
                                                                                    )
                                                                                    * 31
                                                                                 + var4
                                                                           )
                                                                           * 31
                                                                        + var5
                                                                  )
                                                                  * 31
                                                               + var6
                                                         )
                                                         * 31
                                                      + var7
                                                )
                                                * 31
                                             + var8
                                       )
                                       * 31
                                    + var20
                              )
                              * 31
                           + var9
                     )
                     * 31
                  + var10
            )
            * 31
         + var11;
   }

   public override fun toString(): String {
      val var19: java.lang.String = ChannelId.toString-impl(this.parentChannelId);
      val var17: java.lang.String = ChannelId.toString-impl(this.threadId);
      val var5: java.lang.String = MessageId.toString-impl(this.messageId);
      val var15: java.lang.String = GuildId.toString-impl(this.guildId);
      val var11: java.lang.String = this.title;
      val var8: java.lang.String = this.ctaText;
      val var1: Int = this.ctaButtonColor;
      val var9: StructurableText = this.footer;
      val var6: java.lang.String = this.subtitle;
      val var14: java.lang.String = this.coverImage;
      val var4: java.lang.String = this.blurredCoverImage;
      val var16: java.lang.String = this.coverImageOverlayText;
      val var12: java.lang.String = this.backgroundImage;
      val var13: java.lang.String = this.spoiler;
      val var18: java.lang.String = this.obscure;
      val var20: java.lang.Boolean = this.obscureAwaitingScan;
      val var2: Boolean = this.shouldSpoiler;
      val var7: java.lang.Boolean = this.obscureHideControls;
      val var10: java.lang.Boolean = this.obscureIsOpaque;
      val var3: java.lang.Boolean = this.verifyAge;
      val var21: StringBuilder = new StringBuilder();
      var21.append("PostPreviewEmbed(parentChannelId=");
      var21.append(var19);
      var21.append(", threadId=");
      var21.append(var17);
      var21.append(", messageId=");
      var21.append(var5);
      var21.append(", guildId=");
      var21.append(var15);
      var21.append(", title=");
      var21.append(var11);
      var21.append(", ctaText=");
      var21.append(var8);
      var21.append(", ctaButtonColor=");
      var21.append(var1);
      var21.append(", footer=");
      var21.append(var9);
      var21.append(", subtitle=");
      var21.append(var6);
      var21.append(", coverImage=");
      var21.append(var14);
      var21.append(", blurredCoverImage=");
      var21.append(var4);
      var21.append(", coverImageOverlayText=");
      var21.append(var16);
      var21.append(", backgroundImage=");
      var21.append(var12);
      var21.append(", spoiler=");
      var21.append(var13);
      var21.append(", obscure=");
      var21.append(var18);
      var21.append(", obscureAwaitingScan=");
      var21.append(var20);
      var21.append(", shouldSpoiler=");
      var21.append(var2);
      var21.append(", obscureHideControls=");
      var21.append(var7);
      var21.append(", obscureIsOpaque=");
      var21.append(var10);
      var21.append(", verifyAge=");
      var21.append(var3);
      var21.append(")");
      return var21.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PostPreviewEmbed> {
         return PostPreviewEmbed.$serializer.INSTANCE;
      }
   }
}
