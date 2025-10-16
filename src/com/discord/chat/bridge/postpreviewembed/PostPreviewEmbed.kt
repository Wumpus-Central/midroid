package com.discord.chat.bridge.postpreviewembed

import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import nb.g

@g
@SourceDebugExtension(["SMAP\nPostPreviewEmbed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostPreviewEmbed.kt\ncom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"])
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
      if (var17 == null || StringsKt.c0(var17)) {
         var24 = null;
      }

      this.spoilerOrNull = var24;
      var5 = null;
      if (var18 != null) {
         var5 = null;
         if (!StringsKt.c0(var18)) {
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
         } else if (!(this.title == var1.title)) {
            return false;
         } else if (!(this.ctaText == var1.ctaText)) {
            return false;
         } else if (this.ctaButtonColor != var1.ctaButtonColor) {
            return false;
         } else if (!(this.footer == var1.footer)) {
            return false;
         } else if (!(this.subtitle == var1.subtitle)) {
            return false;
         } else if (!(this.coverImage == var1.coverImage)) {
            return false;
         } else if (!(this.blurredCoverImage == var1.blurredCoverImage)) {
            return false;
         } else if (!(this.coverImageOverlayText == var1.coverImageOverlayText)) {
            return false;
         } else if (!(this.backgroundImage == var1.backgroundImage)) {
            return false;
         } else if (!(this.spoiler == var1.spoiler)) {
            return false;
         } else if (!(this.obscure == var1.obscure)) {
            return false;
         } else if (!(this.obscureAwaitingScan == var1.obscureAwaitingScan)) {
            return false;
         } else if (this.shouldSpoiler != var1.shouldSpoiler) {
            return false;
         } else if (!(this.obscureHideControls == var1.obscureHideControls)) {
            return false;
         } else if (!(this.obscureIsOpaque == var1.obscureIsOpaque)) {
            return false;
         } else {
            return this.verifyAge == var1.verifyAge;
         }
      }
   }

   public override fun hashCode(): Int {
      val var15: Int = ChannelId.hashCode-impl(this.parentChannelId);
      val var12: Int = ChannelId.hashCode-impl(this.threadId);
      val var14: Int = MessageId.hashCode-impl(this.messageId);
      val var19: Int = GuildId.hashCode-impl(this.guildId);
      val var17: Int = this.title.hashCode();
      val var16: Int = this.ctaText.hashCode();
      val var18: Int = Integer.hashCode(this.ctaButtonColor);
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
                                                                                                                                                                        var15
                                                                                                                                                                              * 31
                                                                                                                                                                           + var12
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var14
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var19
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var17
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var16
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var18
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
      val var9: java.lang.String = ChannelId.toString-impl(this.parentChannelId);
      val var8: java.lang.String = ChannelId.toString-impl(this.threadId);
      val var13: java.lang.String = MessageId.toString-impl(this.messageId);
      val var5: java.lang.String = GuildId.toString-impl(this.guildId);
      val var14: java.lang.String = this.title;
      val var6: java.lang.String = this.ctaText;
      val var1: Int = this.ctaButtonColor;
      val var18: StructurableText = this.footer;
      val var12: java.lang.String = this.subtitle;
      val var19: java.lang.String = this.coverImage;
      val var20: java.lang.String = this.blurredCoverImage;
      val var11: java.lang.String = this.coverImageOverlayText;
      val var7: java.lang.String = this.backgroundImage;
      val var15: java.lang.String = this.spoiler;
      val var21: java.lang.String = this.obscure;
      val var17: java.lang.Boolean = this.obscureAwaitingScan;
      val var2: Boolean = this.shouldSpoiler;
      val var16: java.lang.Boolean = this.obscureHideControls;
      val var3: java.lang.Boolean = this.obscureIsOpaque;
      val var4: java.lang.Boolean = this.verifyAge;
      val var10: StringBuilder = new StringBuilder();
      var10.append("PostPreviewEmbed(parentChannelId=");
      var10.append(var9);
      var10.append(", threadId=");
      var10.append(var8);
      var10.append(", messageId=");
      var10.append(var13);
      var10.append(", guildId=");
      var10.append(var5);
      var10.append(", title=");
      var10.append(var14);
      var10.append(", ctaText=");
      var10.append(var6);
      var10.append(", ctaButtonColor=");
      var10.append(var1);
      var10.append(", footer=");
      var10.append(var18);
      var10.append(", subtitle=");
      var10.append(var12);
      var10.append(", coverImage=");
      var10.append(var19);
      var10.append(", blurredCoverImage=");
      var10.append(var20);
      var10.append(", coverImageOverlayText=");
      var10.append(var11);
      var10.append(", backgroundImage=");
      var10.append(var7);
      var10.append(", spoiler=");
      var10.append(var15);
      var10.append(", obscure=");
      var10.append(var21);
      var10.append(", obscureAwaitingScan=");
      var10.append(var17);
      var10.append(", shouldSpoiler=");
      var10.append(var2);
      var10.append(", obscureHideControls=");
      var10.append(var16);
      var10.append(", obscureIsOpaque=");
      var10.append(var3);
      var10.append(", verifyAge=");
      var10.append(var4);
      var10.append(")");
      return var10.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PostPreviewEmbed> {
         return PostPreviewEmbed.$serializer.INSTANCE;
      }
   }
}
