package com.discord.chat.bridge.embed

import ca.f
import ca.n
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import da.a
import fa.C0
import fa.G
import fa.N
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
public data class Embed(type: EmbedType,
      id: String? = ...,
      author: EmbedAuthor? = ...,
      provider: EmbedProvider? = ...,
      rawTitle: String? = ...,
      title: StructurableText? = ...,
      fields: List<EmbedField>? = ...,
      url: String? = ...,
      rawDescription: String? = ...,
      description: StructurableText? = ...,
      image: EmbedMedia? = ...,
      images: List<EmbedMedia>? = ...,
      video: EmbedMedia? = ...,
      thumbnail: EmbedThumbnail? = ...,
      numAttachments: String? = ...,
      attachmentsSize: String? = ...,
      messageSendError: String? = ...,
      disableBackgroundColor: Boolean? = ...,
      footer: EmbedFooter? = ...,
      spoiler: String? = ...,
      obscure: String? = ...,
      obscureAwaitingScan: String? = ...,
      obscureHideControls: Boolean? = ...,
      obscureIsOpaque: Boolean? = ...,
      verifyAge: Boolean? = ...,
      iconURL: String? = ...,
      failureState: EmbedFailureState? = ...,
      providerColor: Int? = ...,
      borderLeftColor: Int? = ...,
      headerTextColor: Int? = ...,
      bodyTextColor: Int,
      backgroundColor: Int? = ...
   ) :
   SpoilerableData {
   public final val attachmentsSize: String?
   public final val author: EmbedAuthor?
   public final val backgroundColor: Int?
   public final val bodyTextColor: Int
   public final val borderLeftColor: Int?
   public final val description: StructurableText?
   public final val disableBackgroundColor: Boolean?
   public final val failureState: EmbedFailureState?
   public final val fields: List<EmbedField>?
   public final val footer: EmbedFooter?
   public final val headerTextColor: Int?
   public final val iconURL: String?
   public final val id: String?
   public final val image: EmbedMedia?
   public final val images: List<EmbedMedia>?
   public final val messageSendError: String?
   public final val numAttachments: String?
   public final val obscure: String?
   public final val obscureAwaitingScan: String?
   public final val obscureHideControls: Boolean?
   public final val obscureIsOpaque: Boolean?
   public open val obscureOrNull: String?
   public final val provider: EmbedProvider?
   public final val providerColor: Int?
   public final val rawDescription: String?
   public final val rawTitle: String?
   public final val spoiler: String?
   public open val spoilerOrNull: String?
   public final val thumbnail: EmbedThumbnail?
   public final val title: StructurableText?
   public final val type: EmbedType
   public final val url: String?
   public final val verifyAge: Boolean?
   public final val video: EmbedMedia?

   init {
      var var33: java.lang.String = var20;
      q.h(var1, "type");
      super();
      this.type = var1;
      this.id = var2;
      this.author = var3;
      this.provider = var4;
      this.rawTitle = var5;
      this.title = var6;
      this.fields = var7;
      this.url = var8;
      this.rawDescription = var9;
      this.description = var10;
      this.image = var11;
      this.images = var12;
      this.video = var13;
      this.thumbnail = var14;
      this.numAttachments = var15;
      this.attachmentsSize = var16;
      this.messageSendError = var17;
      this.disableBackgroundColor = var18;
      this.footer = var19;
      this.spoiler = var20;
      this.obscure = var21;
      this.obscureAwaitingScan = var22;
      this.obscureHideControls = var23;
      this.obscureIsOpaque = var24;
      this.verifyAge = var25;
      this.iconURL = var26;
      this.failureState = var27;
      this.providerColor = var28;
      this.borderLeftColor = var29;
      this.headerTextColor = var30;
      this.bodyTextColor = var31;
      this.backgroundColor = var32;
      if (var20 == null || h.d0(var20)) {
         var33 = null;
      }

      this.spoilerOrNull = var33;
      var var34: java.lang.String = null;
      if (var21 != null) {
         var34 = null;
         if (!h.d0(var21)) {
            var34 = var21;
         }
      }

      this.obscureOrNull = var34;
   }

   public operator fun component1(): EmbedType {
      return this.type;
   }

   public operator fun component10(): StructurableText? {
      return this.description;
   }

   public operator fun component11(): EmbedMedia? {
      return this.image;
   }

   public operator fun component12(): List<EmbedMedia>? {
      return this.images;
   }

   public operator fun component13(): EmbedMedia? {
      return this.video;
   }

   public operator fun component14(): EmbedThumbnail? {
      return this.thumbnail;
   }

   public operator fun component15(): String? {
      return this.numAttachments;
   }

   public operator fun component16(): String? {
      return this.attachmentsSize;
   }

   public operator fun component17(): String? {
      return this.messageSendError;
   }

   public operator fun component18(): Boolean? {
      return this.disableBackgroundColor;
   }

   public operator fun component19(): EmbedFooter? {
      return this.footer;
   }

   public operator fun component2(): String? {
      return this.id;
   }

   public operator fun component20(): String? {
      return this.spoiler;
   }

   public operator fun component21(): String? {
      return this.obscure;
   }

   public operator fun component22(): String? {
      return this.obscureAwaitingScan;
   }

   public operator fun component23(): Boolean? {
      return this.obscureHideControls;
   }

   public operator fun component24(): Boolean? {
      return this.obscureIsOpaque;
   }

   public operator fun component25(): Boolean? {
      return this.verifyAge;
   }

   public operator fun component26(): String? {
      return this.iconURL;
   }

   public operator fun component27(): EmbedFailureState? {
      return this.failureState;
   }

   public operator fun component28(): Int? {
      return this.providerColor;
   }

   public operator fun component29(): Int? {
      return this.borderLeftColor;
   }

   public operator fun component3(): EmbedAuthor? {
      return this.author;
   }

   public operator fun component30(): Int? {
      return this.headerTextColor;
   }

   public operator fun component31(): Int {
      return this.bodyTextColor;
   }

   public operator fun component32(): Int? {
      return this.backgroundColor;
   }

   public operator fun component4(): EmbedProvider? {
      return this.provider;
   }

   public operator fun component5(): String? {
      return this.rawTitle;
   }

   public operator fun component6(): StructurableText? {
      return this.title;
   }

   public operator fun component7(): List<EmbedField>? {
      return this.fields;
   }

   public operator fun component8(): String? {
      return this.url;
   }

   public operator fun component9(): String? {
      return this.rawDescription;
   }

   public fun copy(
      type: EmbedType = ...,
      id: String? = ...,
      author: EmbedAuthor? = ...,
      provider: EmbedProvider? = ...,
      rawTitle: String? = ...,
      title: StructurableText? = ...,
      fields: List<EmbedField>? = ...,
      url: String? = ...,
      rawDescription: String? = ...,
      description: StructurableText? = ...,
      image: EmbedMedia? = ...,
      images: List<EmbedMedia>? = ...,
      video: EmbedMedia? = ...,
      thumbnail: EmbedThumbnail? = ...,
      numAttachments: String? = ...,
      attachmentsSize: String? = ...,
      messageSendError: String? = ...,
      disableBackgroundColor: Boolean? = ...,
      footer: EmbedFooter? = ...,
      spoiler: String? = ...,
      obscure: String? = ...,
      obscureAwaitingScan: String? = ...,
      obscureHideControls: Boolean? = ...,
      obscureIsOpaque: Boolean? = ...,
      verifyAge: Boolean? = ...,
      iconURL: String? = ...,
      failureState: EmbedFailureState? = ...,
      providerColor: Int? = ...,
      borderLeftColor: Int? = ...,
      headerTextColor: Int? = ...,
      bodyTextColor: Int = ...,
      backgroundColor: Int? = ...
   ): Embed {
      q.h(var1, "type");
      return new Embed(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20,
         var21,
         var22,
         var23,
         var24,
         var25,
         var26,
         var27,
         var28,
         var29,
         var30,
         var31,
         var32
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Embed) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.author, var1.author)) {
            return false;
         } else if (!q.c(this.provider, var1.provider)) {
            return false;
         } else if (!q.c(this.rawTitle, var1.rawTitle)) {
            return false;
         } else if (!q.c(this.title, var1.title)) {
            return false;
         } else if (!q.c(this.fields, var1.fields)) {
            return false;
         } else if (!q.c(this.url, var1.url)) {
            return false;
         } else if (!q.c(this.rawDescription, var1.rawDescription)) {
            return false;
         } else if (!q.c(this.description, var1.description)) {
            return false;
         } else if (!q.c(this.image, var1.image)) {
            return false;
         } else if (!q.c(this.images, var1.images)) {
            return false;
         } else if (!q.c(this.video, var1.video)) {
            return false;
         } else if (!q.c(this.thumbnail, var1.thumbnail)) {
            return false;
         } else if (!q.c(this.numAttachments, var1.numAttachments)) {
            return false;
         } else if (!q.c(this.attachmentsSize, var1.attachmentsSize)) {
            return false;
         } else if (!q.c(this.messageSendError, var1.messageSendError)) {
            return false;
         } else if (!q.c(this.disableBackgroundColor, var1.disableBackgroundColor)) {
            return false;
         } else if (!q.c(this.footer, var1.footer)) {
            return false;
         } else if (!q.c(this.spoiler, var1.spoiler)) {
            return false;
         } else if (!q.c(this.obscure, var1.obscure)) {
            return false;
         } else if (!q.c(this.obscureAwaitingScan, var1.obscureAwaitingScan)) {
            return false;
         } else if (!q.c(this.obscureHideControls, var1.obscureHideControls)) {
            return false;
         } else if (!q.c(this.obscureIsOpaque, var1.obscureIsOpaque)) {
            return false;
         } else if (!q.c(this.verifyAge, var1.verifyAge)) {
            return false;
         } else if (!q.c(this.iconURL, var1.iconURL)) {
            return false;
         } else if (this.failureState != var1.failureState) {
            return false;
         } else if (!q.c(this.providerColor, var1.providerColor)) {
            return false;
         } else if (!q.c(this.borderLeftColor, var1.borderLeftColor)) {
            return false;
         } else if (!q.c(this.headerTextColor, var1.headerTextColor)) {
            return false;
         } else if (this.bodyTextColor != var1.bodyTextColor) {
            return false;
         } else {
            return q.c(this.backgroundColor, var1.backgroundColor);
         }
      }
   }

   public override fun hashCode(): Int {
      val var31: Int = this.type.hashCode();
      var var30: Int = 0;
      val var1: Int;
      if (this.id == null) {
         var1 = 0;
      } else {
         var1 = this.id.hashCode();
      }

      val var2: Int;
      if (this.author == null) {
         var2 = 0;
      } else {
         var2 = this.author.hashCode();
      }

      val var3: Int;
      if (this.provider == null) {
         var3 = 0;
      } else {
         var3 = this.provider.hashCode();
      }

      val var4: Int;
      if (this.rawTitle == null) {
         var4 = 0;
      } else {
         var4 = this.rawTitle.hashCode();
      }

      val var5: Int;
      if (this.title == null) {
         var5 = 0;
      } else {
         var5 = this.title.hashCode();
      }

      val var6: Int;
      if (this.fields == null) {
         var6 = 0;
      } else {
         var6 = this.fields.hashCode();
      }

      val var7: Int;
      if (this.url == null) {
         var7 = 0;
      } else {
         var7 = this.url.hashCode();
      }

      val var8: Int;
      if (this.rawDescription == null) {
         var8 = 0;
      } else {
         var8 = this.rawDescription.hashCode();
      }

      val var9: Int;
      if (this.description == null) {
         var9 = 0;
      } else {
         var9 = this.description.hashCode();
      }

      val var10: Int;
      if (this.image == null) {
         var10 = 0;
      } else {
         var10 = this.image.hashCode();
      }

      val var11: Int;
      if (this.images == null) {
         var11 = 0;
      } else {
         var11 = this.images.hashCode();
      }

      val var12: Int;
      if (this.video == null) {
         var12 = 0;
      } else {
         var12 = this.video.hashCode();
      }

      val var13: Int;
      if (this.thumbnail == null) {
         var13 = 0;
      } else {
         var13 = this.thumbnail.hashCode();
      }

      val var14: Int;
      if (this.numAttachments == null) {
         var14 = 0;
      } else {
         var14 = this.numAttachments.hashCode();
      }

      val var15: Int;
      if (this.attachmentsSize == null) {
         var15 = 0;
      } else {
         var15 = this.attachmentsSize.hashCode();
      }

      val var16: Int;
      if (this.messageSendError == null) {
         var16 = 0;
      } else {
         var16 = this.messageSendError.hashCode();
      }

      val var17: Int;
      if (this.disableBackgroundColor == null) {
         var17 = 0;
      } else {
         var17 = this.disableBackgroundColor.hashCode();
      }

      val var18: Int;
      if (this.footer == null) {
         var18 = 0;
      } else {
         var18 = this.footer.hashCode();
      }

      val var19: Int;
      if (this.spoiler == null) {
         var19 = 0;
      } else {
         var19 = this.spoiler.hashCode();
      }

      val var20: Int;
      if (this.obscure == null) {
         var20 = 0;
      } else {
         var20 = this.obscure.hashCode();
      }

      val var21: Int;
      if (this.obscureAwaitingScan == null) {
         var21 = 0;
      } else {
         var21 = this.obscureAwaitingScan.hashCode();
      }

      val var22: Int;
      if (this.obscureHideControls == null) {
         var22 = 0;
      } else {
         var22 = this.obscureHideControls.hashCode();
      }

      val var23: Int;
      if (this.obscureIsOpaque == null) {
         var23 = 0;
      } else {
         var23 = this.obscureIsOpaque.hashCode();
      }

      val var24: Int;
      if (this.verifyAge == null) {
         var24 = 0;
      } else {
         var24 = this.verifyAge.hashCode();
      }

      val var25: Int;
      if (this.iconURL == null) {
         var25 = 0;
      } else {
         var25 = this.iconURL.hashCode();
      }

      val var26: Int;
      if (this.failureState == null) {
         var26 = 0;
      } else {
         var26 = this.failureState.hashCode();
      }

      val var27: Int;
      if (this.providerColor == null) {
         var27 = 0;
      } else {
         var27 = this.providerColor.hashCode();
      }

      val var28: Int;
      if (this.borderLeftColor == null) {
         var28 = 0;
      } else {
         var28 = this.borderLeftColor.hashCode();
      }

      val var29: Int;
      if (this.headerTextColor == null) {
         var29 = 0;
      } else {
         var29 = this.headerTextColor.hashCode();
      }

      val var32: Int = Integer.hashCode(this.bodyTextColor);
      if (this.backgroundColor != null) {
         var30 = this.backgroundColor.hashCode();
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
                                                                                                                                                                                                                                                                                    var31
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
                                                                                                                                                                                                               + var9
                                                                                                                                                                                                         )
                                                                                                                                                                                                         * 31
                                                                                                                                                                                                      + var10
                                                                                                                                                                                                )
                                                                                                                                                                                                * 31
                                                                                                                                                                                             + var11
                                                                                                                                                                                       )
                                                                                                                                                                                       * 31
                                                                                                                                                                                    + var12
                                                                                                                                                                              )
                                                                                                                                                                              * 31
                                                                                                                                                                           + var13
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var14
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var15
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var16
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var17
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var18
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var19
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var20
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var21
                                                                                             )
                                                                                             * 31
                                                                                          + var22
                                                                                    )
                                                                                    * 31
                                                                                 + var23
                                                                           )
                                                                           * 31
                                                                        + var24
                                                                  )
                                                                  * 31
                                                               + var25
                                                         )
                                                         * 31
                                                      + var26
                                                )
                                                * 31
                                             + var27
                                       )
                                       * 31
                                    + var28
                              )
                              * 31
                           + var29
                     )
                     * 31
                  + var32
            )
            * 31
         + var30;
   }

   public override fun toString(): String {
      val var13: EmbedType = this.type;
      val var12: java.lang.String = this.id;
      val var3: EmbedAuthor = this.author;
      val var24: EmbedProvider = this.provider;
      val var20: java.lang.String = this.rawTitle;
      val var14: StructurableText = this.title;
      val var2: java.util.List = this.fields;
      val var17: java.lang.String = this.url;
      val var8: java.lang.String = this.rawDescription;
      val var4: StructurableText = this.description;
      val var19: EmbedMedia = this.image;
      val var23: java.util.List = this.images;
      val var30: EmbedMedia = this.video;
      val var21: EmbedThumbnail = this.thumbnail;
      val var25: java.lang.String = this.numAttachments;
      val var31: java.lang.String = this.attachmentsSize;
      val var6: java.lang.String = this.messageSendError;
      val var29: java.lang.Boolean = this.disableBackgroundColor;
      val var28: EmbedFooter = this.footer;
      val var7: java.lang.String = this.spoiler;
      val var15: java.lang.String = this.obscure;
      val var5: java.lang.String = this.obscureAwaitingScan;
      val var32: java.lang.Boolean = this.obscureHideControls;
      val var10: java.lang.Boolean = this.obscureIsOpaque;
      val var26: java.lang.Boolean = this.verifyAge;
      val var16: java.lang.String = this.iconURL;
      val var18: EmbedFailureState = this.failureState;
      val var9: Int = this.providerColor;
      val var22: Int = this.borderLeftColor;
      val var33: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var27: Int = this.backgroundColor;
      val var11: StringBuilder = new StringBuilder();
      var11.append("Embed(type=");
      var11.append(var13);
      var11.append(", id=");
      var11.append(var12);
      var11.append(", author=");
      var11.append(var3);
      var11.append(", provider=");
      var11.append(var24);
      var11.append(", rawTitle=");
      var11.append(var20);
      var11.append(", title=");
      var11.append(var14);
      var11.append(", fields=");
      var11.append(var2);
      var11.append(", url=");
      var11.append(var17);
      var11.append(", rawDescription=");
      var11.append(var8);
      var11.append(", description=");
      var11.append(var4);
      var11.append(", image=");
      var11.append(var19);
      var11.append(", images=");
      var11.append(var23);
      var11.append(", video=");
      var11.append(var30);
      var11.append(", thumbnail=");
      var11.append(var21);
      var11.append(", numAttachments=");
      var11.append(var25);
      var11.append(", attachmentsSize=");
      var11.append(var31);
      var11.append(", messageSendError=");
      var11.append(var6);
      var11.append(", disableBackgroundColor=");
      var11.append(var29);
      var11.append(", footer=");
      var11.append(var28);
      var11.append(", spoiler=");
      var11.append(var7);
      var11.append(", obscure=");
      var11.append(var15);
      var11.append(", obscureAwaitingScan=");
      var11.append(var5);
      var11.append(", obscureHideControls=");
      var11.append(var32);
      var11.append(", obscureIsOpaque=");
      var11.append(var10);
      var11.append(", verifyAge=");
      var11.append(var26);
      var11.append(", iconURL=");
      var11.append(var16);
      var11.append(", failureState=");
      var11.append(var18);
      var11.append(", providerColor=");
      var11.append(var9);
      var11.append(", borderLeftColor=");
      var11.append(var22);
      var11.append(", headerTextColor=");
      var11.append(var33);
      var11.append(", bodyTextColor=");
      var11.append(var1);
      var11.append(", backgroundColor=");
      var11.append(var27);
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
         val var0: Embed.$serializer = new Embed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.Embed", var0, 34);
         var1.l("type", false);
         var1.l("id", true);
         var1.l("author", true);
         var1.l("provider", true);
         var1.l("rawTitle", true);
         var1.l("title", true);
         var1.l("fields", true);
         var1.l("url", true);
         var1.l("rawDescription", true);
         var1.l("description", true);
         var1.l("image", true);
         var1.l("images", true);
         var1.l("video", true);
         var1.l("thumbnail", true);
         var1.l("numAttachments", true);
         var1.l("attachmentsSize", true);
         var1.l("messageSendError", true);
         var1.l("disableBackgroundColor", true);
         var1.l("footer", true);
         var1.l("spoiler", true);
         var1.l("obscure", true);
         var1.l("obscureAwaitingScan", true);
         var1.l("obscureHideControls", true);
         var1.l("obscureIsOpaque", true);
         var1.l("verifyAge", true);
         var1.l("iconURL", true);
         var1.l("failureState", true);
         var1.l("providerColor", true);
         var1.l("borderLeftColor", true);
         var1.l("headerTextColor", true);
         var1.l("bodyTextColor", false);
         var1.l("backgroundColor", true);
         var1.l("spoilerOrNull", true);
         var1.l("obscureOrNull", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var13: Array<KSerializer> = Embed.access$get$childSerializers$cp();
         val var4: KSerializer = var13[0];
         val var6: C0 = C0.a;
         val var9: KSerializer = a.u(C0.a);
         val var3: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var8: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var5: KSerializer = a.u(var6);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var10: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var1: KSerializer = a.u(var13[6]);
         val var2: KSerializer = a.u(var6);
         val var7: KSerializer = a.u(var6);
         val var30: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var12: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var31: KSerializer = a.u(var13[11]);
         val var16: KSerializer = a.u(var14);
         val var21: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var25: KSerializer = a.u(var6);
         val var23: KSerializer = a.u(var6);
         val var17: KSerializer = a.u(var6);
         val var26: fa.h = fa.h.a;
         val var18: KSerializer = a.u(fa.h.a);
         val var22: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var24: KSerializer = a.u(var6);
         val var32: KSerializer = a.u(var6);
         val var15: KSerializer = a.u(var6);
         val var20: KSerializer = a.u(var26);
         val var19: KSerializer = a.u(var26);
         val var33: KSerializer = a.u(var26);
         val var29: KSerializer = a.u(var6);
         val var27: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var28: N = N.a;
         return new KSerializer[]{
            var4,
            var9,
            var3,
            var8,
            var5,
            var10,
            var1,
            var2,
            var7,
            var30,
            var12,
            var31,
            var16,
            var21,
            var25,
            var23,
            var17,
            var18,
            var22,
            var24,
            var32,
            var15,
            var20,
            var19,
            var33,
            var29,
            var27,
            a.u(N.a),
            a.u(var28),
            a.u(var28),
            var28,
            a.u(var28),
            a.u(var6),
            a.u(var6)
         };
      }

      public open fun deserialize(decoder: Decoder): Embed {
         q.h(var1, "decoder");
         val var51: SerialDescriptor = this.getDescriptor();
         val var52: c = var1.c(var51);
         val var48: Array<KSerializer> = Embed.access$get$childSerializers$cp();
         val var7: Boolean = var52.y();
         var var23: EmbedType = null;
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var9: java.lang.String;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var15: Any;
         var var16: java.lang.String;
         var var17: Any;
         var var20: Any;
         var var21: java.lang.String;
         var var22: StructurableText;
         var var24: java.lang.String;
         var var25: Any;
         var var26: Any;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var31: Any;
         val var32: java.lang.String;
         var var33: Any;
         var var34: java.lang.String;
         var var35: Any;
         var var36: java.lang.String;
         var var37: Any;
         var var38: java.lang.String;
         var var39: Any;
         val var54: java.lang.String;
         var var65: Any;
         var var71: java.lang.String;
         var var102: java.lang.String;
         var var108: java.lang.String;
         var var158: java.lang.String;
         if (var7) {
            var23 = var52.m(var51, 0, var48[0], null) as EmbedType;
            val var53: C0 = C0.a;
            var38 = var52.v(var51, 1, C0.a, null) as java.lang.String;
            var37 = var52.v(var51, 2, EmbedAuthor.$serializer.INSTANCE, null) as EmbedAuthor;
            var39 = var52.v(var51, 3, EmbedProvider.$serializer.INSTANCE, null) as EmbedProvider;
            var24 = var52.v(var51, 4, var53, null) as java.lang.String;
            var65 = StructurableTextSerializer.INSTANCE;
            var22 = var52.v(var51, 5, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var35 = var52.v(var51, 6, var48[6], null) as java.util.List;
            var34 = var52.v(var51, 7, var53, null) as java.lang.String;
            var36 = var52.v(var51, 8, var53, null) as java.lang.String;
            var33 = var52.v(var51, 9, (DeserializationStrategy)var65, null) as StructurableText;
            var65 = EmbedMedia.$serializer.INSTANCE;
            var28 = var52.v(var51, 10, EmbedMedia.$serializer.INSTANCE, null) as EmbedMedia;
            var31 = var52.v(var51, 11, var48[11], null) as java.util.List;
            val var19: EmbedMedia = var52.v(var51, 12, (DeserializationStrategy)var65, null) as EmbedMedia;
            var25 = var52.v(var51, 13, EmbedThumbnail.$serializer.INSTANCE, null) as EmbedThumbnail;
            var102 = var52.v(var51, 14, var53, null) as java.lang.String;
            var158 = var52.v(var51, 15, var53, null) as java.lang.String;
            var32 = var52.v(var51, 16, var53, null) as java.lang.String;
            var65 = fa.h.a;
            var26 = var52.v(var51, 17, fa.h.a, null) as java.lang.Boolean;
            var29 = var52.v(var51, 18, EmbedFooter.$serializer.INSTANCE, null) as EmbedFooter;
            var71 = var52.v(var51, 19, var53, null) as java.lang.String;
            val var41: java.lang.String = var52.v(var51, 20, var53, null) as java.lang.String;
            val var40: java.lang.String = var52.v(var51, 21, var53, null) as java.lang.String;
            var20 = var52.v(var51, 22, (DeserializationStrategy)var65, null) as java.lang.Boolean;
            var17 = var52.v(var51, 23, (DeserializationStrategy)var65, null) as java.lang.Boolean;
            var15 = var52.v(var51, 24, (DeserializationStrategy)var65, null) as java.lang.Boolean;
            var16 = var52.v(var51, 25, var53, null) as java.lang.String;
            var14 = var52.v(var51, 26, EmbedFailureState.Serializer.INSTANCE, null) as EmbedFailureState;
            var65 = N.a;
            var13 = var52.v(var51, 27, N.a, null) as Int;
            var12 = var52.v(var51, 28, (DeserializationStrategy)var65, null) as Int;
            var11 = var52.v(var51, 29, (DeserializationStrategy)var65, null) as Int;
            var4 = var52.k(var51, 30);
            var65 = var52.v(var51, 31, (DeserializationStrategy)var65, null) as Int;
            var9 = var52.v(var51, 32, var53, null) as java.lang.String;
            var54 = var52.v(var51, 33, var53, null) as java.lang.String;
            var2 = -1;
            var3 = 3;
            var27 = var19;
            var21 = var102;
            var102 = var158;
            var158 = var71;
            var108 = var41;
            var71 = var40;
         } else {
            var var5: Boolean = true;
            var3 = 0;
            var2 = 0;
            var4 = 0;
            var var161: StructurableText = null;
            var9 = null;
            var65 = null;
            var39 = null;
            var38 = null;
            var37 = null;
            var36 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var158 = null;
            var28 = null;
            var24 = null;
            var31 = null;
            var22 = null;
            var25 = null;
            var26 = null;
            var29 = null;
            var27 = null;
            var13 = null;
            var11 = null;
            var12 = null;
            var14 = null;
            var15 = null;
            var16 = null;
            var17 = null;
            var102 = null;
            var108 = null;
            var20 = null;
            var21 = null;
            var71 = null;
            var var55: Any = null;

            while (var5) {
               label142: {
                  label141: {
                     label140: {
                        var var191: Any;
                        label139: {
                           label138: {
                              label137: {
                                 label178: {
                                    label179: {
                                       label156: {
                                          val var6: Int = var52.x(var51);
                                          switch (var6) {
                                             case -1:
                                                var5 = false;
                                                break label138;
                                             case 0:
                                                var23 = var52.m(var51, 0, var48[0], var23) as EmbedType;
                                                var2 |= 1;
                                                break label138;
                                             case 1:
                                                var38 = var52.v(var51, 1, C0.a, var38) as java.lang.String;
                                                var2 |= 2;
                                                break label137;
                                             case 2:
                                                var37 = var52.v(var51, 2, EmbedAuthor.$serializer.INSTANCE, var37) as EmbedAuthor;
                                                var2 |= 4;
                                                break label137;
                                             case 3:
                                                var39 = var52.v(var51, 3, EmbedProvider.$serializer.INSTANCE, var39) as EmbedProvider;
                                                var2 |= 8;
                                                break label137;
                                             case 4:
                                                var158 = var52.v(var51, 4, C0.a, var158) as java.lang.String;
                                                var2 |= 16;
                                                break label137;
                                             case 5:
                                                var161 = var52.v(var51, 5, StructurableTextSerializer.INSTANCE, var161) as StructurableText;
                                                var2 |= 32;
                                                break label138;
                                             case 6:
                                                var35 = var52.v(var51, 6, var48[6], var35) as java.util.List;
                                                var2 |= 64;
                                                break label138;
                                             case 7:
                                                var34 = var52.v(var51, 7, C0.a, var34) as java.lang.String;
                                                var2 |= 128;
                                                break label138;
                                             case 8:
                                                var36 = var52.v(var51, 8, C0.a, var36) as java.lang.String;
                                                var2 |= 256;
                                                break label138;
                                             case 9:
                                                var33 = var52.v(var51, 9, StructurableTextSerializer.INSTANCE, var33) as StructurableText;
                                                var2 |= 512;
                                                break label138;
                                             case 10:
                                                var191 = var22;
                                                var25 = var26;
                                                var22 = var52.v(var51, 10, EmbedMedia.$serializer.INSTANCE, var28) as EmbedMedia;
                                                var2 |= 1024;
                                                var26 = var25;
                                                var28 = var24;
                                                break label139;
                                             case 11:
                                                var135 = (java.lang.String)var26;
                                                var26 = var52.v(var51, 11, var48[11], var24) as java.util.List;
                                                var2 |= 2048;
                                                var24 = (java.lang.String)var25;
                                                var25 = var22;
                                                break label156;
                                             case 12:
                                                var31 = var52.v(var51, 12, EmbedMedia.$serializer.INSTANCE, var31) as EmbedMedia;
                                                var2 |= 4096;
                                                var191 = var22;
                                                break;
                                             case 13:
                                                var191 = var52.v(var51, 13, EmbedThumbnail.$serializer.INSTANCE, var22) as EmbedThumbnail;
                                                var2 |= 8192;
                                                break;
                                             case 14:
                                                var25 = var52.v(var51, 14, C0.a, var25) as java.lang.String;
                                                var2 |= 16384;
                                                var135 = (java.lang.String)var26;
                                                var24 = (java.lang.String)var25;
                                                var25 = var22;
                                                var26 = var24;
                                                break label156;
                                             case 15:
                                                var191 = var52.v(var51, 15, C0.a, var26) as java.lang.String;
                                                var2 |= 32768;
                                                var26 = var24;
                                                var25 = var22;
                                                var24 = (java.lang.String)var25;
                                                var135 = (java.lang.String)var191;
                                                break label156;
                                             case 16:
                                                var29 = var52.v(var51, 16, C0.a, var29) as java.lang.String;
                                                var2 |= 65536;
                                                break label140;
                                             case 17:
                                                var27 = var52.v(var51, 17, fa.h.a, var27) as java.lang.Boolean;
                                                var2 |= 131072;
                                                break label140;
                                             case 18:
                                                var14 = var16;
                                                var12 = var102;
                                                var102 = (java.lang.String)var11;
                                                var108 = var52.v(var51, 18, EmbedFooter.$serializer.INSTANCE, var13) as EmbedFooter;
                                                var2 |= 262144;
                                                var21 = (java.lang.String)var55;
                                                var20 = var71;
                                                var55 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var108;
                                                var13 = var17;
                                                var16 = (java.lang.String)var14;
                                                var17 = var12;
                                                break label141;
                                             case 19:
                                                var14 = var16;
                                                val var128: java.lang.String = var52.v(var51, 19, C0.a, var11) as java.lang.String;
                                                var2 |= 524288;
                                                var21 = (java.lang.String)var55;
                                                var55 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var108;
                                                var12 = var102;
                                                var13 = var17;
                                                var16 = (java.lang.String)var14;
                                                var17 = var12;
                                                var102 = var128;
                                                var108 = (java.lang.String)var13;
                                                var20 = var71;
                                                break label141;
                                             case 20:
                                                val var126: java.lang.String = var52.v(var51, 20, C0.a, var12) as java.lang.String;
                                                var2 |= 1048576;
                                                var21 = (java.lang.String)var55;
                                                var55 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var108;
                                                var12 = var102;
                                                var13 = var17;
                                                var14 = var16;
                                                var16 = (java.lang.String)var14;
                                                var17 = var126;
                                                var102 = (java.lang.String)var11;
                                                var108 = (java.lang.String)var13;
                                                var20 = var71;
                                                break label141;
                                             case 21:
                                                var191 = var52.v(var51, 21, C0.a, var14) as java.lang.String;
                                                var2 |= 2097152;
                                                var21 = (java.lang.String)var55;
                                                var20 = var71;
                                                var55 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var108;
                                                var12 = var102;
                                                var13 = var17;
                                                var14 = var16;
                                                var16 = (java.lang.String)var191;
                                                var17 = var12;
                                                var102 = (java.lang.String)var11;
                                                var108 = (java.lang.String)var13;
                                                break label141;
                                             case 22:
                                                var15 = var52.v(var51, 22, fa.h.a, var15) as java.lang.Boolean;
                                                var2 |= 4194304;
                                                var21 = (java.lang.String)var55;
                                                var20 = var71;
                                                var55 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var108;
                                                var12 = var102;
                                                var13 = var17;
                                                var14 = var16;
                                                var16 = (java.lang.String)var14;
                                                var17 = var12;
                                                var102 = (java.lang.String)var11;
                                                var108 = (java.lang.String)var13;
                                                break label141;
                                             case 23:
                                                val var92: java.lang.Boolean = var52.v(var51, 23, fa.h.a, var16) as java.lang.Boolean;
                                                var2 |= 8388608;
                                                var21 = (java.lang.String)var55;
                                                var20 = var71;
                                                var55 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var108;
                                                var12 = var102;
                                                var13 = var17;
                                                var14 = var92;
                                                var16 = (java.lang.String)var14;
                                                var17 = var12;
                                                var102 = (java.lang.String)var11;
                                                var108 = (java.lang.String)var13;
                                                break label141;
                                             case 24:
                                                var17 = var52.v(var51, 24, fa.h.a, var17) as java.lang.Boolean;
                                                var2 |= 16777216;
                                                var21 = (java.lang.String)var55;
                                                var20 = var71;
                                                var14 = var16;
                                                var55 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var108;
                                                var12 = var102;
                                                var13 = var17;
                                                var16 = (java.lang.String)var14;
                                                var17 = var12;
                                                var102 = (java.lang.String)var11;
                                                var108 = (java.lang.String)var13;
                                                break label141;
                                             case 25:
                                                val var257: java.lang.String = var52.v(var51, 25, C0.a, var102) as java.lang.String;
                                                var2 |= 33554432;
                                                var21 = (java.lang.String)var55;
                                                var20 = var71;
                                                var108 = (java.lang.String)var13;
                                                var102 = (java.lang.String)var11;
                                                var14 = var16;
                                                var13 = var17;
                                                var55 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var108;
                                                var12 = var257;
                                                var16 = (java.lang.String)var14;
                                                var17 = var12;
                                                break label141;
                                             case 26:
                                                var9 = var21;
                                                val var256: EmbedFailureState = var52.v(var51, 26, EmbedFailureState.Serializer.INSTANCE, var108) as EmbedFailureState;
                                                var2 |= 67108864;
                                                var21 = (java.lang.String)var55;
                                                var20 = var71;
                                                var108 = (java.lang.String)var13;
                                                var14 = var16;
                                                var13 = var17;
                                                var12 = var102;
                                                var55 = var9;
                                                var71 = (java.lang.String)var20;
                                                var11 = var256;
                                                var16 = (java.lang.String)var14;
                                                var17 = var12;
                                                var102 = (java.lang.String)var11;
                                                break label141;
                                             case 27:
                                                var9 = var21;
                                                val var274: Int = var52.v(var51, 27, N.a, var20) as Int;
                                                var2 |= 134217728;
                                                var21 = (java.lang.String)var55;
                                                var20 = var71;
                                                var14 = var16;
                                                var13 = var17;
                                                var12 = var102;
                                                var11 = var108;
                                                var55 = var9;
                                                var71 = var274;
                                                var16 = (java.lang.String)var14;
                                                var17 = var12;
                                                var102 = (java.lang.String)var11;
                                                var108 = (java.lang.String)var13;
                                                break label141;
                                             case 28:
                                                val var290: Int = var52.v(var51, 28, N.a, var21) as Int;
                                                var2 |= 268435456;
                                                var21 = (java.lang.String)var55;
                                                var14 = var16;
                                                var13 = var17;
                                                var12 = var102;
                                                var11 = var108;
                                                var71 = (java.lang.String)var20;
                                                var55 = var9;
                                                var9 = var290;
                                                var16 = (java.lang.String)var14;
                                                var17 = var12;
                                                var102 = (java.lang.String)var11;
                                                var108 = (java.lang.String)var13;
                                                var20 = var71;
                                                break label141;
                                             case 29:
                                                val var209: Int = var52.v(var51, 29, N.a, var71) as Int;
                                                var2 |= 536870912;
                                                var14 = var16;
                                                var13 = var17;
                                                var12 = var102;
                                                var11 = var108;
                                                var71 = (java.lang.String)var20;
                                                var55 = var9;
                                                var9 = var21;
                                                var16 = (java.lang.String)var14;
                                                var17 = var12;
                                                var102 = (java.lang.String)var11;
                                                var108 = (java.lang.String)var13;
                                                var20 = var209;
                                                var21 = (java.lang.String)var55;
                                                break label141;
                                             case 30:
                                                var3 = var52.k(var51, 30);
                                                var2 |= 1073741824;
                                                var191 = var55;
                                                break label179;
                                             case 31:
                                                var191 = var52.v(var51, 31, N.a, var55) as Int;
                                                var2 |= Integer.MIN_VALUE;
                                                break label179;
                                             case 32:
                                                var65 = var52.v(var51, 32, C0.a, var65) as java.lang.String;
                                                var4 |= 1;
                                                var191 = var9;
                                                break label178;
                                             case 33:
                                                var191 = var52.v(var51, 33, C0.a, var9) as java.lang.String;
                                                var4 |= 2;
                                                break label178;
                                             default:
                                                throw new n(var6);
                                          }

                                          var135 = (java.lang.String)var26;
                                          var26 = var24;
                                          var24 = (java.lang.String)var25;
                                          var25 = var191;
                                       }

                                       var28 = var26;
                                       var191 = var25;
                                       var26 = var24;
                                       var25 = var135;
                                       var22 = (StructurableText)var28;
                                       break label139;
                                    }

                                    var55 = var9;
                                    var14 = var16;
                                    var13 = var17;
                                    var12 = var102;
                                    var11 = var108;
                                    var9 = var21;
                                    var20 = var71;
                                    var71 = (java.lang.String)var20;
                                    var16 = (java.lang.String)var14;
                                    var17 = var12;
                                    var102 = (java.lang.String)var11;
                                    var108 = (java.lang.String)var13;
                                    var21 = (java.lang.String)var191;
                                    break label141;
                                 }

                                 var13 = var17;
                                 var12 = var102;
                                 var21 = (java.lang.String)var55;
                                 var20 = var71;
                                 var108 = (java.lang.String)var13;
                                 var102 = (java.lang.String)var11;
                                 var17 = var12;
                                 var16 = (java.lang.String)var14;
                                 var14 = var16;
                                 var11 = var108;
                                 var71 = (java.lang.String)var20;
                                 var9 = var21;
                                 var55 = var191;
                                 break label141;
                              }

                              var25 = var26;
                              var14 = var16;
                              var13 = var17;
                              var12 = var102;
                              var11 = var108;
                              var55 = var9;
                              var22 = (StructurableText)var28;
                              var20 = var71;
                              var24 = (java.lang.String)var27;
                              var9 = var21;
                              var71 = (java.lang.String)var20;
                              var16 = (java.lang.String)var14;
                              var17 = var12;
                              var102 = (java.lang.String)var11;
                              var108 = (java.lang.String)var13;
                              var26 = var25;
                              var27 = var22;
                              var28 = var24;
                              var21 = (java.lang.String)var55;
                              break label142;
                           }

                           var25 = var26;
                           var14 = var16;
                           var13 = var17;
                           var12 = var102;
                           var11 = var108;
                           var55 = var9;
                           var22 = (StructurableText)var28;
                           var20 = var71;
                           var24 = (java.lang.String)var27;
                           var9 = var21;
                           var71 = (java.lang.String)var20;
                           var16 = (java.lang.String)var14;
                           var17 = var12;
                           var102 = (java.lang.String)var11;
                           var108 = (java.lang.String)var13;
                           var26 = var25;
                           var27 = var22;
                           var28 = var24;
                           var21 = (java.lang.String)var55;
                           break label142;
                        }

                        var14 = var16;
                        var13 = var17;
                        var12 = var102;
                        var11 = var108;
                        var55 = var9;
                        var20 = var71;
                        var24 = (java.lang.String)var27;
                        var9 = var21;
                        var71 = (java.lang.String)var20;
                        var16 = (java.lang.String)var14;
                        var17 = var12;
                        var102 = (java.lang.String)var11;
                        var108 = (java.lang.String)var13;
                        var27 = var191;
                        var21 = (java.lang.String)var55;
                        break label142;
                     }

                     var25 = var26;
                     var14 = var16;
                     var13 = var17;
                     var12 = var102;
                     var11 = var108;
                     var71 = (java.lang.String)var20;
                     var22 = (StructurableText)var28;
                     var55 = var9;
                     var24 = (java.lang.String)var27;
                     var9 = var21;
                     var16 = (java.lang.String)var14;
                     var17 = var12;
                     var102 = (java.lang.String)var11;
                     var108 = (java.lang.String)var13;
                     var20 = var71;
                     var26 = var25;
                     var27 = var22;
                     var28 = var24;
                     var21 = (java.lang.String)var55;
                     break label142;
                  }

                  var25 = var26;
                  var24 = (java.lang.String)var27;
                  var22 = (StructurableText)var28;
                  var26 = var25;
                  var27 = var22;
                  var28 = var24;
               }

               var14 = var16;
               var12 = var17;
               var11 = var102;
               var13 = var108;
               var25 = var26;
               var24 = (java.lang.String)var28;
               var9 = (java.lang.String)var55;
               var28 = var22;
               var22 = (StructurableText)var27;
               var26 = var25;
               var27 = var24;
               var16 = (java.lang.String)var14;
               var17 = var13;
               var102 = (java.lang.String)var12;
               var108 = (java.lang.String)var11;
               var20 = var71;
               var21 = var9;
               var71 = (java.lang.String)var20;
               var55 = var21;
            }

            var54 = var9;
            var20 = var15;
            var21 = (java.lang.String)var25;
            var25 = var22;
            var22 = var161;
            var26 = var27;
            var24 = var158;
            var9 = (java.lang.String)var65;
            var65 = var55;
            var4 = var3;
            var11 = var71;
            var12 = var21;
            var13 = var20;
            var14 = var108;
            var16 = var102;
            var15 = var17;
            var17 = var16;
            var71 = (java.lang.String)var14;
            var108 = (java.lang.String)var12;
            var158 = (java.lang.String)var11;
            var29 = var13;
            var32 = (java.lang.String)var29;
            var102 = (java.lang.String)var26;
            var27 = var31;
            var31 = var24;
            var3 = var4;
         }

         var52.b(var51);
         return new Embed(
            var2,
            var3,
            var23,
            var38,
            (EmbedAuthor)var37,
            (EmbedProvider)var39,
            var24,
            var22,
            (java.util.List)var35,
            var34,
            var36,
            (StructurableText)var33,
            (EmbedMedia)var28,
            (java.util.List)var31,
            (EmbedMedia)var27,
            (EmbedThumbnail)var25,
            var21,
            var102,
            var32,
            (java.lang.Boolean)var26,
            (EmbedFooter)var29,
            var158,
            var108,
            var71,
            (java.lang.Boolean)var20,
            (java.lang.Boolean)var17,
            (java.lang.Boolean)var15,
            var16,
            (EmbedFailureState)var14,
            (Integer)var13,
            (Integer)var12,
            (Integer)var11,
            var4,
            (Integer)var65,
            var9,
            var54,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: Embed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         Embed.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fa.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
