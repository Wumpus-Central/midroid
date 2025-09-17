package com.discord.chat.bridge.embed

import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import mb.g

@g
@SourceDebugExtension(["SMAP\nEmbed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Embed.kt\ncom/discord/chat/bridge/embed/Embed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"])
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
   public final val type: EmbedType
   public final val id: String?
   public final val author: EmbedAuthor?
   public final val provider: EmbedProvider?
   public final val rawTitle: String?
   public final val title: StructurableText?
   public final val fields: List<EmbedField>?
   public final val url: String?
   public final val rawDescription: String?
   public final val description: StructurableText?
   public final val image: EmbedMedia?
   public final val images: List<EmbedMedia>?
   public final val video: EmbedMedia?
   public final val thumbnail: EmbedThumbnail?
   public final val numAttachments: String?
   public final val attachmentsSize: String?
   public final val messageSendError: String?
   public final val disableBackgroundColor: Boolean?
   public final val footer: EmbedFooter?
   public final val spoiler: String?
   public final val obscure: String?
   public final val obscureAwaitingScan: String?
   public final val obscureHideControls: Boolean?
   public final val obscureIsOpaque: Boolean?
   public final val verifyAge: Boolean?
   public final val iconURL: String?
   public final val failureState: EmbedFailureState?
   public final val providerColor: Int?
   public final val borderLeftColor: Int?
   public final val headerTextColor: Int?
   public final val bodyTextColor: Int
   public final val backgroundColor: Int?
   public open val spoilerOrNull: String?
   public open val obscureOrNull: String?

   init {
      var var33: java.lang.String = var20;
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
      if (var20 == null || StringsKt.c0(var20)) {
         var33 = null;
      }

      this.spoilerOrNull = var33;
      var var34: java.lang.String = null;
      if (var21 != null) {
         var34 = null;
         if (!StringsKt.c0(var21)) {
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
         } else if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.author == var1.author)) {
            return false;
         } else if (!(this.provider == var1.provider)) {
            return false;
         } else if (!(this.rawTitle == var1.rawTitle)) {
            return false;
         } else if (!(this.title == var1.title)) {
            return false;
         } else if (!(this.fields == var1.fields)) {
            return false;
         } else if (!(this.url == var1.url)) {
            return false;
         } else if (!(this.rawDescription == var1.rawDescription)) {
            return false;
         } else if (!(this.description == var1.description)) {
            return false;
         } else if (!(this.image == var1.image)) {
            return false;
         } else if (!(this.images == var1.images)) {
            return false;
         } else if (!(this.video == var1.video)) {
            return false;
         } else if (!(this.thumbnail == var1.thumbnail)) {
            return false;
         } else if (!(this.numAttachments == var1.numAttachments)) {
            return false;
         } else if (!(this.attachmentsSize == var1.attachmentsSize)) {
            return false;
         } else if (!(this.messageSendError == var1.messageSendError)) {
            return false;
         } else if (!(this.disableBackgroundColor == var1.disableBackgroundColor)) {
            return false;
         } else if (!(this.footer == var1.footer)) {
            return false;
         } else if (!(this.spoiler == var1.spoiler)) {
            return false;
         } else if (!(this.obscure == var1.obscure)) {
            return false;
         } else if (!(this.obscureAwaitingScan == var1.obscureAwaitingScan)) {
            return false;
         } else if (!(this.obscureHideControls == var1.obscureHideControls)) {
            return false;
         } else if (!(this.obscureIsOpaque == var1.obscureIsOpaque)) {
            return false;
         } else if (!(this.verifyAge == var1.verifyAge)) {
            return false;
         } else if (!(this.iconURL == var1.iconURL)) {
            return false;
         } else if (this.failureState != var1.failureState) {
            return false;
         } else if (!(this.providerColor == var1.providerColor)) {
            return false;
         } else if (!(this.borderLeftColor == var1.borderLeftColor)) {
            return false;
         } else if (!(this.headerTextColor == var1.headerTextColor)) {
            return false;
         } else if (this.bodyTextColor != var1.bodyTextColor) {
            return false;
         } else {
            return this.backgroundColor == var1.backgroundColor;
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
      val var24: java.lang.String = this.id;
      val var18: EmbedAuthor = this.author;
      val var7: EmbedProvider = this.provider;
      val var9: java.lang.String = this.rawTitle;
      val var5: StructurableText = this.title;
      val var29: java.util.List = this.fields;
      val var25: java.lang.String = this.url;
      val var12: java.lang.String = this.rawDescription;
      val var4: StructurableText = this.description;
      val var33: EmbedMedia = this.image;
      val var6: java.util.List = this.images;
      val var2: EmbedMedia = this.video;
      val var22: EmbedThumbnail = this.thumbnail;
      val var19: java.lang.String = this.numAttachments;
      val var23: java.lang.String = this.attachmentsSize;
      val var10: java.lang.String = this.messageSendError;
      val var30: java.lang.Boolean = this.disableBackgroundColor;
      val var32: EmbedFooter = this.footer;
      val var3: java.lang.String = this.spoiler;
      val var26: java.lang.String = this.obscure;
      val var14: java.lang.String = this.obscureAwaitingScan;
      val var15: java.lang.Boolean = this.obscureHideControls;
      val var17: java.lang.Boolean = this.obscureIsOpaque;
      val var31: java.lang.Boolean = this.verifyAge;
      val var8: java.lang.String = this.iconURL;
      val var27: EmbedFailureState = this.failureState;
      val var28: Int = this.providerColor;
      val var21: Int = this.borderLeftColor;
      val var20: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var11: Int = this.backgroundColor;
      val var16: StringBuilder = new StringBuilder();
      var16.append("Embed(type=");
      var16.append(var13);
      var16.append(", id=");
      var16.append(var24);
      var16.append(", author=");
      var16.append(var18);
      var16.append(", provider=");
      var16.append(var7);
      var16.append(", rawTitle=");
      var16.append(var9);
      var16.append(", title=");
      var16.append(var5);
      var16.append(", fields=");
      var16.append(var29);
      var16.append(", url=");
      var16.append(var25);
      var16.append(", rawDescription=");
      var16.append(var12);
      var16.append(", description=");
      var16.append(var4);
      var16.append(", image=");
      var16.append(var33);
      var16.append(", images=");
      var16.append(var6);
      var16.append(", video=");
      var16.append(var2);
      var16.append(", thumbnail=");
      var16.append(var22);
      var16.append(", numAttachments=");
      var16.append(var19);
      var16.append(", attachmentsSize=");
      var16.append(var23);
      var16.append(", messageSendError=");
      var16.append(var10);
      var16.append(", disableBackgroundColor=");
      var16.append(var30);
      var16.append(", footer=");
      var16.append(var32);
      var16.append(", spoiler=");
      var16.append(var3);
      var16.append(", obscure=");
      var16.append(var26);
      var16.append(", obscureAwaitingScan=");
      var16.append(var14);
      var16.append(", obscureHideControls=");
      var16.append(var15);
      var16.append(", obscureIsOpaque=");
      var16.append(var17);
      var16.append(", verifyAge=");
      var16.append(var31);
      var16.append(", iconURL=");
      var16.append(var8);
      var16.append(", failureState=");
      var16.append(var27);
      var16.append(", providerColor=");
      var16.append(var28);
      var16.append(", borderLeftColor=");
      var16.append(var21);
      var16.append(", headerTextColor=");
      var16.append(var20);
      var16.append(", bodyTextColor=");
      var16.append(var1);
      var16.append(", backgroundColor=");
      var16.append(var11);
      var16.append(")");
      return var16.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
