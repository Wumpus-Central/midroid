package com.discord.chat.bridge.embed

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
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
      val var31: EmbedType = this.type;
      val var32: java.lang.String = this.id;
      val var23: EmbedAuthor = this.author;
      val var26: EmbedProvider = this.provider;
      val var14: java.lang.String = this.rawTitle;
      val var8: StructurableText = this.title;
      val var17: java.util.List = this.fields;
      val var10: java.lang.String = this.url;
      val var21: java.lang.String = this.rawDescription;
      val var15: StructurableText = this.description;
      val var27: EmbedMedia = this.image;
      val var5: java.util.List = this.images;
      val var30: EmbedMedia = this.video;
      val var22: EmbedThumbnail = this.thumbnail;
      val var6: java.lang.String = this.numAttachments;
      val var11: java.lang.String = this.attachmentsSize;
      val var16: java.lang.String = this.messageSendError;
      val var12: java.lang.Boolean = this.disableBackgroundColor;
      val var13: EmbedFooter = this.footer;
      val var24: java.lang.String = this.spoiler;
      val var19: java.lang.String = this.obscure;
      val var29: java.lang.String = this.obscureAwaitingScan;
      val var28: java.lang.Boolean = this.obscureHideControls;
      val var9: java.lang.Boolean = this.obscureIsOpaque;
      val var20: java.lang.Boolean = this.verifyAge;
      val var18: java.lang.String = this.iconURL;
      val var4: EmbedFailureState = this.failureState;
      val var2: Int = this.providerColor;
      val var7: Int = this.borderLeftColor;
      val var33: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var3: Int = this.backgroundColor;
      val var25: StringBuilder = new StringBuilder();
      var25.append("Embed(type=");
      var25.append(var31);
      var25.append(", id=");
      var25.append(var32);
      var25.append(", author=");
      var25.append(var23);
      var25.append(", provider=");
      var25.append(var26);
      var25.append(", rawTitle=");
      var25.append(var14);
      var25.append(", title=");
      var25.append(var8);
      var25.append(", fields=");
      var25.append(var17);
      var25.append(", url=");
      var25.append(var10);
      var25.append(", rawDescription=");
      var25.append(var21);
      var25.append(", description=");
      var25.append(var15);
      var25.append(", image=");
      var25.append(var27);
      var25.append(", images=");
      var25.append(var5);
      var25.append(", video=");
      var25.append(var30);
      var25.append(", thumbnail=");
      var25.append(var22);
      var25.append(", numAttachments=");
      var25.append(var6);
      var25.append(", attachmentsSize=");
      var25.append(var11);
      var25.append(", messageSendError=");
      var25.append(var16);
      var25.append(", disableBackgroundColor=");
      var25.append(var12);
      var25.append(", footer=");
      var25.append(var13);
      var25.append(", spoiler=");
      var25.append(var24);
      var25.append(", obscure=");
      var25.append(var19);
      var25.append(", obscureAwaitingScan=");
      var25.append(var29);
      var25.append(", obscureHideControls=");
      var25.append(var28);
      var25.append(", obscureIsOpaque=");
      var25.append(var9);
      var25.append(", verifyAge=");
      var25.append(var20);
      var25.append(", iconURL=");
      var25.append(var18);
      var25.append(", failureState=");
      var25.append(var4);
      var25.append(", providerColor=");
      var25.append(var2);
      var25.append(", borderLeftColor=");
      var25.append(var7);
      var25.append(", headerTextColor=");
      var25.append(var33);
      var25.append(", bodyTextColor=");
      var25.append(var1);
      var25.append(", backgroundColor=");
      var25.append(var3);
      var25.append(")");
      return var25.toString();
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
         val var6: KSerializer = var13[0];
         val var1: C0 = C0.a;
         val var9: KSerializer = a.u(C0.a);
         val var2: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var7: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var5: KSerializer = a.u(var1);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var4: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var10: KSerializer = a.u(var13[6]);
         val var3: KSerializer = a.u(var1);
         val var8: KSerializer = a.u(var1);
         val var12: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var30: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var31: KSerializer = a.u(var13[11]);
         val var18: KSerializer = a.u(var14);
         val var23: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var19: KSerializer = a.u(var1);
         val var21: KSerializer = a.u(var1);
         val var17: KSerializer = a.u(var1);
         val var26: ba.h = ba.h.a;
         val var32: KSerializer = a.u(ba.h.a);
         val var22: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var24: KSerializer = a.u(var1);
         val var25: KSerializer = a.u(var1);
         val var16: KSerializer = a.u(var1);
         val var20: KSerializer = a.u(var26);
         val var15: KSerializer = a.u(var26);
         val var27: KSerializer = a.u(var26);
         val var29: KSerializer = a.u(var1);
         val var33: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var28: N = N.a;
         return new KSerializer[]{
            var6,
            var9,
            var2,
            var7,
            var5,
            var4,
            var10,
            var3,
            var8,
            var12,
            var30,
            var31,
            var18,
            var23,
            var19,
            var21,
            var17,
            var32,
            var22,
            var24,
            var25,
            var16,
            var20,
            var15,
            var27,
            var29,
            var33,
            a.u(N.a),
            a.u(var28),
            a.u(var28),
            var28,
            a.u(var28),
            a.u(var1),
            a.u(var1)
         };
      }

      public open fun deserialize(decoder: Decoder): Embed {
         q.h(var1, "decoder");
         val var52: SerialDescriptor = this.getDescriptor();
         val var53: c = var1.c(var52);
         val var48: Array<KSerializer> = Embed.access$get$childSerializers$cp();
         val var7: Boolean = var53.y();
         var var23: EmbedType = null;
         var var3: Int;
         var var4: Int;
         val var5: Int;
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
         var var22: Any;
         var var24: java.lang.String;
         var var25: Any;
         var var26: java.lang.String;
         var var28: Any;
         var var29: Any;
         val var30: StructurableText;
         var var31: java.lang.String;
         var var32: Any;
         var var33: Any;
         var var34: java.lang.String;
         var var35: Any;
         var var36: java.lang.String;
         var var37: Any;
         var var38: java.lang.String;
         var var39: Any;
         val var55: java.lang.String;
         var var66: Any;
         var var71: java.lang.String;
         var var102: Any;
         var var107: java.lang.String;
         var var154: java.lang.String;
         if (var7) {
            var23 = var53.m(var52, 0, var48[0], null) as EmbedType;
            val var54: C0 = C0.a;
            var38 = var53.v(var52, 1, C0.a, null) as java.lang.String;
            var37 = var53.v(var52, 2, EmbedAuthor.$serializer.INSTANCE, null) as EmbedAuthor;
            var39 = var53.v(var52, 3, EmbedProvider.$serializer.INSTANCE, null) as EmbedProvider;
            var26 = var53.v(var52, 4, var54, null) as java.lang.String;
            var66 = StructurableTextSerializer.INSTANCE;
            var30 = var53.v(var52, 5, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var35 = var53.v(var52, 6, var48[6], null) as java.util.List;
            var34 = var53.v(var52, 7, var54, null) as java.lang.String;
            var36 = var53.v(var52, 8, var54, null) as java.lang.String;
            var33 = var53.v(var52, 9, (DeserializationStrategy)var66, null) as StructurableText;
            var66 = EmbedMedia.$serializer.INSTANCE;
            var28 = var53.v(var52, 10, EmbedMedia.$serializer.INSTANCE, null) as EmbedMedia;
            var25 = var53.v(var52, 11, var48[11], null) as java.util.List;
            val var19: EmbedMedia = var53.v(var52, 12, (DeserializationStrategy)var66, null) as EmbedMedia;
            var32 = var53.v(var52, 13, EmbedThumbnail.$serializer.INSTANCE, null) as EmbedThumbnail;
            var102 = var53.v(var52, 14, var54, null) as java.lang.String;
            var21 = var53.v(var52, 15, var54, null) as java.lang.String;
            var31 = var53.v(var52, 16, var54, null) as java.lang.String;
            var66 = ba.h.a;
            var22 = var53.v(var52, 17, ba.h.a, null) as java.lang.Boolean;
            val var27: EmbedFooter = var53.v(var52, 18, EmbedFooter.$serializer.INSTANCE, null) as EmbedFooter;
            var71 = var53.v(var52, 19, var54, null) as java.lang.String;
            val var40: java.lang.String = var53.v(var52, 20, var54, null) as java.lang.String;
            var24 = var53.v(var52, 21, var54, null) as java.lang.String;
            var20 = var53.v(var52, 22, (DeserializationStrategy)var66, null) as java.lang.Boolean;
            var17 = var53.v(var52, 23, (DeserializationStrategy)var66, null) as java.lang.Boolean;
            var15 = var53.v(var52, 24, (DeserializationStrategy)var66, null) as java.lang.Boolean;
            var16 = var53.v(var52, 25, var54, null) as java.lang.String;
            var14 = var53.v(var52, 26, EmbedFailureState.Serializer.INSTANCE, null) as EmbedFailureState;
            var66 = N.a;
            var13 = var53.v(var52, 27, N.a, null) as Int;
            var12 = var53.v(var52, 28, (DeserializationStrategy)var66, null) as Int;
            var11 = var53.v(var52, 29, (DeserializationStrategy)var66, null) as Int;
            val var2: Int = var53.k(var52, 30);
            var66 = var53.v(var52, 31, (DeserializationStrategy)var66, null) as Int;
            var9 = var53.v(var52, 32, var54, null) as java.lang.String;
            var55 = var53.v(var52, 33, var54, null) as java.lang.String;
            var3 = -1;
            var4 = 3;
            var29 = var19;
            var107 = (java.lang.String)var102;
            var102 = var27;
            var154 = var71;
            var71 = var40;
            var5 = var2;
         } else {
            var var62: Boolean = true;
            var3 = 0;
            var var60: Int = 0;
            var4 = 0;
            var32 = null;
            var9 = null;
            var66 = null;
            var39 = null;
            var38 = null;
            var37 = null;
            var36 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var var159: java.lang.String = null;
            var28 = null;
            var24 = null;
            var31 = null;
            var22 = null;
            var25 = null;
            var26 = null;
            var29 = null;
            var154 = null;
            var14 = null;
            var11 = null;
            var12 = null;
            var13 = null;
            var15 = null;
            var16 = null;
            var17 = null;
            var102 = null;
            var107 = null;
            var20 = null;
            var21 = null;
            var71 = null;
            var var56: Any = null;

            while (var62) {
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
                                          val var6: Int = var53.x(var52);
                                          switch (var6) {
                                             case -1:
                                                var62 = false;
                                                break label138;
                                             case 0:
                                                var23 = var53.m(var52, 0, var48[0], var23) as EmbedType;
                                                var60 |= 1;
                                                break label138;
                                             case 1:
                                                var38 = var53.v(var52, 1, C0.a, var38) as java.lang.String;
                                                var60 |= 2;
                                                break label137;
                                             case 2:
                                                var37 = var53.v(var52, 2, EmbedAuthor.$serializer.INSTANCE, var37) as EmbedAuthor;
                                                var60 |= 4;
                                                break label137;
                                             case 3:
                                                var39 = var53.v(var52, 3, EmbedProvider.$serializer.INSTANCE, var39) as EmbedProvider;
                                                var60 |= 8;
                                                break label137;
                                             case 4:
                                                var159 = var53.v(var52, 4, C0.a, var159) as java.lang.String;
                                                var60 |= 16;
                                                break label137;
                                             case 5:
                                                var32 = var53.v(var52, 5, StructurableTextSerializer.INSTANCE, var32) as StructurableText;
                                                var60 |= 32;
                                                break label138;
                                             case 6:
                                                var35 = var53.v(var52, 6, var48[6], var35) as java.util.List;
                                                var60 |= 64;
                                                break label138;
                                             case 7:
                                                var34 = var53.v(var52, 7, C0.a, var34) as java.lang.String;
                                                var60 |= 128;
                                                break label138;
                                             case 8:
                                                var36 = var53.v(var52, 8, C0.a, var36) as java.lang.String;
                                                var60 |= 256;
                                                break label138;
                                             case 9:
                                                var33 = var53.v(var52, 9, StructurableTextSerializer.INSTANCE, var33) as StructurableText;
                                                var60 |= 512;
                                                break label138;
                                             case 10:
                                                var191 = var22;
                                                var25 = var26;
                                                var22 = var53.v(var52, 10, EmbedMedia.$serializer.INSTANCE, var28) as EmbedMedia;
                                                var60 |= 1024;
                                                var26 = (java.lang.String)var25;
                                                var28 = var24;
                                                break label139;
                                             case 11:
                                                var22 = var26;
                                                var26 = var53.v(var52, 11, var48[11], var24) as java.util.List;
                                                var60 |= 2048;
                                                var24 = (java.lang.String)var25;
                                                var25 = var22;
                                                break label156;
                                             case 12:
                                                var31 = var53.v(var52, 12, EmbedMedia.$serializer.INSTANCE, var31) as EmbedMedia;
                                                var60 |= 4096;
                                                var191 = var22;
                                                break;
                                             case 13:
                                                var191 = var53.v(var52, 13, EmbedThumbnail.$serializer.INSTANCE, var22) as EmbedThumbnail;
                                                var60 |= 8192;
                                                break;
                                             case 14:
                                                var25 = var53.v(var52, 14, C0.a, var25) as java.lang.String;
                                                var60 |= 16384;
                                                var22 = var26;
                                                var24 = (java.lang.String)var25;
                                                var25 = var22;
                                                var26 = var24;
                                                break label156;
                                             case 15:
                                                var191 = var53.v(var52, 15, C0.a, var26) as java.lang.String;
                                                var60 |= 32768;
                                                var26 = var24;
                                                var24 = (java.lang.String)var25;
                                                var25 = var22;
                                                var22 = var191;
                                                break label156;
                                             case 16:
                                                var29 = var53.v(var52, 16, C0.a, var29) as java.lang.String;
                                                var60 |= 65536;
                                                break label140;
                                             case 17:
                                                var154 = var53.v(var52, 17, ba.h.a, var154) as java.lang.Boolean;
                                                var60 |= 131072;
                                                break label140;
                                             case 18:
                                                var13 = var17;
                                                var12 = var102;
                                                var102 = var11;
                                                var107 = var53.v(var52, 18, EmbedFooter.$serializer.INSTANCE, var14) as EmbedFooter;
                                                var60 |= 262144;
                                                var21 = (java.lang.String)var56;
                                                var20 = var71;
                                                var56 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var107;
                                                var14 = var16;
                                                var16 = (java.lang.String)var13;
                                                var17 = var12;
                                                break label141;
                                             case 19:
                                                var13 = var17;
                                                var17 = var12;
                                                val var127: java.lang.String = var53.v(var52, 19, C0.a, var11) as java.lang.String;
                                                var60 |= 524288;
                                                var21 = (java.lang.String)var56;
                                                var56 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var107;
                                                var12 = var102;
                                                var14 = var16;
                                                var16 = (java.lang.String)var13;
                                                var102 = var127;
                                                var107 = (java.lang.String)var14;
                                                var20 = var71;
                                                break label141;
                                             case 20:
                                                val var125: java.lang.String = var53.v(var52, 20, C0.a, var12) as java.lang.String;
                                                var60 |= 1048576;
                                                var21 = (java.lang.String)var56;
                                                var56 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var107;
                                                var12 = var102;
                                                var13 = var17;
                                                var14 = var16;
                                                var16 = (java.lang.String)var13;
                                                var17 = var125;
                                                var102 = var11;
                                                var107 = (java.lang.String)var14;
                                                var20 = var71;
                                                break label141;
                                             case 21:
                                                val var216: java.lang.String = var53.v(var52, 21, C0.a, var13) as java.lang.String;
                                                var60 |= 2097152;
                                                var21 = (java.lang.String)var56;
                                                var20 = var71;
                                                var56 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var107;
                                                var12 = var102;
                                                var13 = var17;
                                                var14 = var16;
                                                var16 = var216;
                                                var17 = var12;
                                                var102 = var11;
                                                var107 = (java.lang.String)var14;
                                                break label141;
                                             case 22:
                                                var15 = var53.v(var52, 22, ba.h.a, var15) as java.lang.Boolean;
                                                var60 |= 4194304;
                                                var21 = (java.lang.String)var56;
                                                var20 = var71;
                                                var56 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var107;
                                                var12 = var102;
                                                var13 = var17;
                                                var14 = var16;
                                                var16 = (java.lang.String)var13;
                                                var17 = var12;
                                                var102 = var11;
                                                var107 = (java.lang.String)var14;
                                                break label141;
                                             case 23:
                                                val var93: java.lang.Boolean = var53.v(var52, 23, ba.h.a, var16) as java.lang.Boolean;
                                                var60 |= 8388608;
                                                var21 = (java.lang.String)var56;
                                                var20 = var71;
                                                var56 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var107;
                                                var12 = var102;
                                                var13 = var17;
                                                var14 = var93;
                                                var16 = (java.lang.String)var13;
                                                var17 = var12;
                                                var102 = var11;
                                                var107 = (java.lang.String)var14;
                                                break label141;
                                             case 24:
                                                var17 = var53.v(var52, 24, ba.h.a, var17) as java.lang.Boolean;
                                                var60 |= 16777216;
                                                var21 = (java.lang.String)var56;
                                                var20 = var71;
                                                var14 = var16;
                                                var56 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var107;
                                                var12 = var102;
                                                var13 = var17;
                                                var16 = (java.lang.String)var13;
                                                var17 = var12;
                                                var102 = var11;
                                                var107 = (java.lang.String)var14;
                                                break label141;
                                             case 25:
                                                val var255: java.lang.String = var53.v(var52, 25, C0.a, var102) as java.lang.String;
                                                var60 |= 33554432;
                                                var21 = (java.lang.String)var56;
                                                var20 = var71;
                                                var107 = (java.lang.String)var14;
                                                var102 = var11;
                                                var14 = var16;
                                                var13 = var17;
                                                var56 = var9;
                                                var9 = var21;
                                                var71 = (java.lang.String)var20;
                                                var11 = var107;
                                                var12 = var255;
                                                var16 = (java.lang.String)var13;
                                                var17 = var12;
                                                break label141;
                                             case 26:
                                                var9 = var21;
                                                val var254: EmbedFailureState = var53.v(var52, 26, EmbedFailureState.Serializer.INSTANCE, var107) as EmbedFailureState;
                                                var60 |= 67108864;
                                                var21 = (java.lang.String)var56;
                                                var20 = var71;
                                                var107 = (java.lang.String)var14;
                                                var14 = var16;
                                                var13 = var17;
                                                var12 = var102;
                                                var56 = var9;
                                                var71 = (java.lang.String)var20;
                                                var11 = var254;
                                                var16 = (java.lang.String)var13;
                                                var17 = var12;
                                                var102 = var11;
                                                break label141;
                                             case 27:
                                                val var272: Int = var53.v(var52, 27, N.a, var20) as Int;
                                                var60 |= 134217728;
                                                var21 = (java.lang.String)var56;
                                                var20 = var71;
                                                var14 = var16;
                                                var13 = var17;
                                                var12 = var102;
                                                var11 = var107;
                                                var56 = var9;
                                                var9 = var21;
                                                var71 = var272;
                                                var16 = (java.lang.String)var13;
                                                var17 = var12;
                                                var102 = var11;
                                                var107 = (java.lang.String)var14;
                                                break label141;
                                             case 28:
                                                val var288: Int = var53.v(var52, 28, N.a, var21) as Int;
                                                var60 |= 268435456;
                                                var21 = (java.lang.String)var56;
                                                var14 = var16;
                                                var13 = var17;
                                                var12 = var102;
                                                var11 = var107;
                                                var71 = (java.lang.String)var20;
                                                var56 = var9;
                                                var9 = var288;
                                                var16 = (java.lang.String)var13;
                                                var17 = var12;
                                                var102 = var11;
                                                var107 = (java.lang.String)var14;
                                                var20 = var71;
                                                break label141;
                                             case 29:
                                                val var208: Int = var53.v(var52, 29, N.a, var71) as Int;
                                                var60 |= 536870912;
                                                var14 = var16;
                                                var13 = var17;
                                                var12 = var102;
                                                var11 = var107;
                                                var71 = (java.lang.String)var20;
                                                var56 = var9;
                                                var9 = var21;
                                                var16 = (java.lang.String)var13;
                                                var17 = var12;
                                                var102 = var11;
                                                var107 = (java.lang.String)var14;
                                                var20 = var208;
                                                var21 = (java.lang.String)var56;
                                                break label141;
                                             case 30:
                                                var3 = var53.k(var52, 30);
                                                var60 |= 1073741824;
                                                var191 = var56;
                                                break label179;
                                             case 31:
                                                var191 = var53.v(var52, 31, N.a, var56) as Int;
                                                var60 |= Integer.MIN_VALUE;
                                                break label179;
                                             case 32:
                                                var66 = var53.v(var52, 32, C0.a, var66) as java.lang.String;
                                                var4 |= 1;
                                                var191 = var9;
                                                break label178;
                                             case 33:
                                                var191 = var53.v(var52, 33, C0.a, var9) as java.lang.String;
                                                var4 |= 2;
                                                break label178;
                                             default:
                                                throw new n(var6);
                                          }

                                          var22 = var26;
                                          var26 = var24;
                                          var24 = (java.lang.String)var25;
                                          var25 = var191;
                                       }

                                       var28 = var26;
                                       var191 = var25;
                                       var26 = var24;
                                       var25 = var22;
                                       var22 = var28;
                                       break label139;
                                    }

                                    var56 = var9;
                                    var14 = var16;
                                    var13 = var17;
                                    var12 = var102;
                                    var11 = var107;
                                    var9 = var21;
                                    var20 = var71;
                                    var71 = (java.lang.String)var20;
                                    var16 = (java.lang.String)var13;
                                    var17 = var12;
                                    var102 = var11;
                                    var107 = (java.lang.String)var14;
                                    var21 = (java.lang.String)var191;
                                    break label141;
                                 }

                                 var9 = var21;
                                 var21 = (java.lang.String)var56;
                                 var20 = var71;
                                 var107 = (java.lang.String)var14;
                                 var102 = var11;
                                 var17 = var12;
                                 var16 = (java.lang.String)var13;
                                 var14 = var16;
                                 var13 = var17;
                                 var12 = var102;
                                 var11 = var107;
                                 var71 = (java.lang.String)var20;
                                 var56 = var191;
                                 break label141;
                              }

                              var25 = var26;
                              var14 = var16;
                              var13 = var17;
                              var12 = var102;
                              var11 = var107;
                              var56 = var9;
                              var22 = var28;
                              var20 = var71;
                              var24 = var154;
                              var9 = var21;
                              var71 = (java.lang.String)var20;
                              var16 = (java.lang.String)var13;
                              var17 = var12;
                              var102 = var11;
                              var107 = (java.lang.String)var14;
                              var26 = (java.lang.String)var25;
                              var154 = (java.lang.String)var22;
                              var28 = var24;
                              var21 = (java.lang.String)var56;
                              break label142;
                           }

                           var25 = var26;
                           var14 = var16;
                           var13 = var17;
                           var12 = var102;
                           var11 = var107;
                           var56 = var9;
                           var22 = var28;
                           var20 = var71;
                           var24 = var154;
                           var9 = var21;
                           var71 = (java.lang.String)var20;
                           var16 = (java.lang.String)var13;
                           var17 = var12;
                           var102 = var11;
                           var107 = (java.lang.String)var14;
                           var26 = (java.lang.String)var25;
                           var154 = (java.lang.String)var22;
                           var28 = var24;
                           var21 = (java.lang.String)var56;
                           break label142;
                        }

                        var14 = var16;
                        var13 = var17;
                        var12 = var102;
                        var11 = var107;
                        var56 = var9;
                        var20 = var71;
                        var24 = var154;
                        var9 = var21;
                        var71 = (java.lang.String)var20;
                        var16 = (java.lang.String)var13;
                        var17 = var12;
                        var102 = var11;
                        var107 = (java.lang.String)var14;
                        var154 = (java.lang.String)var191;
                        var21 = (java.lang.String)var56;
                        break label142;
                     }

                     var25 = var26;
                     var14 = var16;
                     var13 = var17;
                     var12 = var102;
                     var11 = var107;
                     var71 = (java.lang.String)var20;
                     var22 = var28;
                     var56 = var9;
                     var24 = var154;
                     var9 = var21;
                     var16 = (java.lang.String)var13;
                     var17 = var12;
                     var102 = var11;
                     var107 = (java.lang.String)var14;
                     var20 = var71;
                     var26 = (java.lang.String)var25;
                     var154 = (java.lang.String)var22;
                     var28 = var24;
                     var21 = (java.lang.String)var56;
                     break label142;
                  }

                  var25 = var26;
                  var24 = var154;
                  var22 = var28;
                  var26 = (java.lang.String)var25;
                  var154 = (java.lang.String)var22;
                  var28 = var24;
               }

               var13 = var16;
               var12 = var17;
               var11 = var102;
               var14 = var107;
               var25 = var26;
               var24 = (java.lang.String)var28;
               var9 = (java.lang.String)var56;
               var28 = var22;
               var22 = var154;
               var26 = (java.lang.String)var25;
               var154 = var24;
               var16 = (java.lang.String)var14;
               var17 = var13;
               var102 = var12;
               var107 = (java.lang.String)var11;
               var20 = var71;
               var21 = var9;
               var71 = (java.lang.String)var20;
               var56 = var21;
            }

            var55 = var9;
            var17 = var16;
            var71 = (java.lang.String)var12;
            var21 = var26;
            var107 = (java.lang.String)var25;
            var25 = var24;
            var22 = var154;
            var9 = (java.lang.String)var66;
            var66 = var56;
            var5 = var3;
            var11 = var71;
            var12 = var21;
            var13 = var20;
            var14 = var107;
            var16 = (java.lang.String)var102;
            var15 = var17;
            var20 = var15;
            var24 = (java.lang.String)var13;
            var154 = (java.lang.String)var11;
            var102 = var14;
            var31 = (java.lang.String)var29;
            var32 = var22;
            var29 = var31;
            var30 = (StructurableText)var32;
            var26 = var159;
            var3 = var60;
         }

         var53.b(var52);
         return new Embed(
            var3,
            var4,
            var23,
            var38,
            (EmbedAuthor)var37,
            (EmbedProvider)var39,
            var26,
            var30,
            (java.util.List)var35,
            var34,
            var36,
            (StructurableText)var33,
            (EmbedMedia)var28,
            (java.util.List)var25,
            (EmbedMedia)var29,
            (EmbedThumbnail)var32,
            var107,
            var21,
            var31,
            (java.lang.Boolean)var22,
            (EmbedFooter)var102,
            var154,
            var71,
            var24,
            (java.lang.Boolean)var20,
            (java.lang.Boolean)var17,
            (java.lang.Boolean)var15,
            var16,
            (EmbedFailureState)var14,
            (Integer)var13,
            (Integer)var12,
            (Integer)var11,
            var5,
            (Integer)var66,
            var9,
            var55,
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
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
