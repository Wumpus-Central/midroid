package com.discord.chat.bridge.embed

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
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.n0

@f
public data class Embed(type: EmbedType,
      id: String? = null,
      author: EmbedAuthor? = null,
      provider: EmbedProvider? = null,
      rawTitle: String? = null,
      title: StructurableText? = null,
      fields: List<EmbedField>? = null,
      url: String? = null,
      rawDescription: String? = null,
      description: StructurableText? = null,
      image: EmbedMedia? = null,
      images: List<EmbedMedia>? = null,
      video: EmbedMedia? = null,
      thumbnail: EmbedThumbnail? = null,
      numAttachments: String? = null,
      attachmentsSize: String? = ...,
      messageSendError: String? = ...,
      disableBackgroundColor: Boolean? = ...,
      footer: EmbedFooter? = ...,
      spoiler: String? = ...,
      obscure: String? = ...,
      obscureAwaitingScan: String? = ...,
      iconURL: String? = ...,
      failureState: EmbedFailureState? = ...,
      providerColor: Int? = ...,
      borderLeftColor: Int? = ...,
      headerTextColor: Int? = ...,
      bodyTextColor: Int,
      backgroundColor: Int? = null
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
   public final val video: EmbedMedia?

   init {
      var var30: java.lang.String = var20;
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
      this.iconURL = var23;
      this.failureState = var24;
      this.providerColor = var25;
      this.borderLeftColor = var26;
      this.headerTextColor = var27;
      this.bodyTextColor = var28;
      this.backgroundColor = var29;
      if (var20 == null || !(h.x(var20) xor true)) {
         var30 = null;
      }

      this.spoilerOrNull = var30;
      var var31: java.lang.String = null;
      if (var21 != null) {
         var31 = null;
         if (h.x(var21) xor true) {
            var31 = var21;
         }
      }

      this.obscureOrNull = var31;
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

   public operator fun component23(): String? {
      return this.iconURL;
   }

   public operator fun component24(): EmbedFailureState? {
      return this.failureState;
   }

   public operator fun component25(): Int? {
      return this.providerColor;
   }

   public operator fun component26(): Int? {
      return this.borderLeftColor;
   }

   public operator fun component27(): Int? {
      return this.headerTextColor;
   }

   public operator fun component28(): Int {
      return this.bodyTextColor;
   }

   public operator fun component29(): Int? {
      return this.backgroundColor;
   }

   public operator fun component3(): EmbedAuthor? {
      return this.author;
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
      type: EmbedType = var0.type,
      id: String? = var0.id,
      author: EmbedAuthor? = var0.author,
      provider: EmbedProvider? = var0.provider,
      rawTitle: String? = var0.rawTitle,
      title: StructurableText? = var0.title,
      fields: List<EmbedField>? = var0.fields,
      url: String? = var0.url,
      rawDescription: String? = var0.rawDescription,
      description: StructurableText? = var0.description,
      image: EmbedMedia? = var0.image,
      images: List<EmbedMedia>? = var0.images,
      video: EmbedMedia? = var0.video,
      thumbnail: EmbedThumbnail? = var0.thumbnail,
      numAttachments: String? = var0.numAttachments,
      attachmentsSize: String? = var0.attachmentsSize,
      messageSendError: String? = var0.messageSendError,
      disableBackgroundColor: Boolean? = var0.disableBackgroundColor,
      footer: EmbedFooter? = var0.footer,
      spoiler: String? = var0.spoiler,
      obscure: String? = var0.obscure,
      obscureAwaitingScan: String? = var0.obscureAwaitingScan,
      iconURL: String? = var0.iconURL,
      failureState: EmbedFailureState? = var0.failureState,
      providerColor: Int? = var0.providerColor,
      borderLeftColor: Int? = var0.borderLeftColor,
      headerTextColor: Int? = var0.headerTextColor,
      bodyTextColor: Int = var0.bodyTextColor,
      backgroundColor: Int? = var0.backgroundColor
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
         var29
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
      val var28: Int = this.type.hashCode();
      var var27: Int = 0;
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
      if (this.iconURL == null) {
         var22 = 0;
      } else {
         var22 = this.iconURL.hashCode();
      }

      val var23: Int;
      if (this.failureState == null) {
         var23 = 0;
      } else {
         var23 = this.failureState.hashCode();
      }

      val var24: Int;
      if (this.providerColor == null) {
         var24 = 0;
      } else {
         var24 = this.providerColor.hashCode();
      }

      val var25: Int;
      if (this.borderLeftColor == null) {
         var25 = 0;
      } else {
         var25 = this.borderLeftColor.hashCode();
      }

      val var26: Int;
      if (this.headerTextColor == null) {
         var26 = 0;
      } else {
         var26 = this.headerTextColor.hashCode();
      }

      val var29: Int = Integer.hashCode(this.bodyTextColor);
      if (this.backgroundColor != null) {
         var27 = this.backgroundColor.hashCode();
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
                                                                                                                                                                                                                                                         var28
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
                  + var29
            )
            * 31
         + var27;
   }

   public override fun toString(): String {
      val var28: EmbedType = this.type;
      val var27: java.lang.String = this.id;
      val var21: EmbedAuthor = this.author;
      val var12: EmbedProvider = this.provider;
      val var23: java.lang.String = this.rawTitle;
      val var15: StructurableText = this.title;
      val var24: java.util.List = this.fields;
      val var25: java.lang.String = this.url;
      val var16: java.lang.String = this.rawDescription;
      val var4: StructurableText = this.description;
      val var10: EmbedMedia = this.image;
      val var13: java.util.List = this.images;
      val var30: EmbedMedia = this.video;
      val var26: EmbedThumbnail = this.thumbnail;
      val var22: java.lang.String = this.numAttachments;
      val var6: java.lang.String = this.attachmentsSize;
      val var29: java.lang.String = this.messageSendError;
      val var17: java.lang.Boolean = this.disableBackgroundColor;
      val var5: EmbedFooter = this.footer;
      val var9: java.lang.String = this.spoiler;
      val var7: java.lang.String = this.obscure;
      val var11: java.lang.String = this.obscureAwaitingScan;
      val var18: java.lang.String = this.iconURL;
      val var19: EmbedFailureState = this.failureState;
      val var2: Int = this.providerColor;
      val var3: Int = this.borderLeftColor;
      val var14: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var20: Int = this.backgroundColor;
      val var8: StringBuilder = new StringBuilder();
      var8.append("Embed(type=");
      var8.append(var28);
      var8.append(", id=");
      var8.append(var27);
      var8.append(", author=");
      var8.append(var21);
      var8.append(", provider=");
      var8.append(var12);
      var8.append(", rawTitle=");
      var8.append(var23);
      var8.append(", title=");
      var8.append(var15);
      var8.append(", fields=");
      var8.append(var24);
      var8.append(", url=");
      var8.append(var25);
      var8.append(", rawDescription=");
      var8.append(var16);
      var8.append(", description=");
      var8.append(var4);
      var8.append(", image=");
      var8.append(var10);
      var8.append(", images=");
      var8.append(var13);
      var8.append(", video=");
      var8.append(var30);
      var8.append(", thumbnail=");
      var8.append(var26);
      var8.append(", numAttachments=");
      var8.append(var22);
      var8.append(", attachmentsSize=");
      var8.append(var6);
      var8.append(", messageSendError=");
      var8.append(var29);
      var8.append(", disableBackgroundColor=");
      var8.append(var17);
      var8.append(", footer=");
      var8.append(var5);
      var8.append(", spoiler=");
      var8.append(var9);
      var8.append(", obscure=");
      var8.append(var7);
      var8.append(", obscureAwaitingScan=");
      var8.append(var11);
      var8.append(", iconURL=");
      var8.append(var18);
      var8.append(", failureState=");
      var8.append(var19);
      var8.append(", providerColor=");
      var8.append(var2);
      var8.append(", borderLeftColor=");
      var8.append(var3);
      var8.append(", headerTextColor=");
      var8.append(var14);
      var8.append(", bodyTextColor=");
      var8.append(var1);
      var8.append(", backgroundColor=");
      var8.append(var20);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: Embed.$serializer = new Embed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.Embed", var0, 31);
         var1.c("type", false);
         var1.c("id", true);
         var1.c("author", true);
         var1.c("provider", true);
         var1.c("rawTitle", true);
         var1.c("title", true);
         var1.c("fields", true);
         var1.c("url", true);
         var1.c("rawDescription", true);
         var1.c("description", true);
         var1.c("image", true);
         var1.c("images", true);
         var1.c("video", true);
         var1.c("thumbnail", true);
         var1.c("numAttachments", true);
         var1.c("attachmentsSize", true);
         var1.c("messageSendError", true);
         var1.c("disableBackgroundColor", true);
         var1.c("footer", true);
         var1.c("spoiler", true);
         var1.c("obscure", true);
         var1.c("obscureAwaitingScan", true);
         var1.c("iconURL", true);
         var1.c("failureState", true);
         var1.c("providerColor", true);
         var1.c("borderLeftColor", true);
         var1.c("headerTextColor", true);
         var1.c("bodyTextColor", false);
         var1.c("backgroundColor", true);
         var1.c("spoilerOrNull", true);
         var1.c("obscureOrNull", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var13: Array<KSerializer> = Embed.access$get$childSerializers$cp();
         val var8: KSerializer = var13[0];
         val var10: b2 = b2.a;
         val var4: KSerializer = a.u(b2.a);
         val var2: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var6: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var3: KSerializer = a.u(var10);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var7: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var5: KSerializer = a.u(var13[6]);
         val var9: KSerializer = a.u(var10);
         val var1: KSerializer = a.u(var10);
         val var27: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var12: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var28: KSerializer = a.u(var13[11]);
         val var19: KSerializer = a.u(var14);
         val var22: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var23: KSerializer = a.u(var10);
         val var26: KSerializer = a.u(var10);
         val var29: KSerializer = a.u(var10);
         val var25: KSerializer = a.u(qn.h.a);
         val var20: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var18: KSerializer = a.u(var10);
         val var17: KSerializer = a.u(var10);
         val var15: KSerializer = a.u(var10);
         val var24: KSerializer = a.u(var10);
         val var16: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var21: n0 = n0.a;
         return new KSerializer[]{
            var8,
            var4,
            var2,
            var6,
            var3,
            var7,
            var5,
            var9,
            var1,
            var27,
            var12,
            var28,
            var19,
            var22,
            var23,
            var26,
            var29,
            var25,
            var20,
            var18,
            var17,
            var15,
            var24,
            var16,
            a.u(n0.a),
            a.u(var21),
            a.u(var21),
            var21,
            a.u(var21),
            a.u(var10),
            a.u(var10)
         };
      }

      public open fun deserialize(decoder: Decoder): Embed {
         q.h(var1, "decoder");
         val var43: SerialDescriptor = this.getDescriptor();
         val var44: c = var1.b(var43);
         val var42: Array<KSerializer> = Embed.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var8: Any;
         var var9: Any;
         var var15: Any;
         var var16: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: Any;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         var var27: Any;
         var var30: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         val var37: Any;
         val var38: Any;
         val var39: Any;
         var var46: Any;
         var var55: Int;
         var var79: Int;
         var var82: Any;
         var var98: Any;
         var var103: Any;
         var var147: Any;
         var var149: Int;
         var var152: Int;
         val var194: java.lang.String;
         if (var44.p()) {
            var34 = var44.y(var43, 0, var42[0], null) as EmbedType;
            var46 = b2.a;
            var39 = var44.n(var43, 1, b2.a, null) as java.lang.String;
            var16 = var44.n(var43, 2, EmbedAuthor.$serializer.INSTANCE, null) as EmbedAuthor;
            var98 = var44.n(var43, 3, EmbedProvider.$serializer.INSTANCE, null) as EmbedProvider;
            var19 = var44.n(var43, 4, (DeserializationStrategy)var46, null) as java.lang.String;
            val var6: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
            var103 = var44.n(var43, 5, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var24 = var44.n(var43, 6, var42[6], null) as java.util.List;
            var27 = var44.n(var43, 7, (DeserializationStrategy)var46, null) as java.lang.String;
            val var12: java.lang.String = var44.n(var43, 8, (DeserializationStrategy)var46, null) as java.lang.String;
            var82 = var44.n(var43, 9, var6, null) as StructurableText;
            val var49: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
            var38 = var44.n(var43, 10, EmbedMedia.$serializer.INSTANCE, null) as EmbedMedia;
            var26 = var44.n(var43, 11, var42[11], null) as java.util.List;
            var30 = var44.n(var43, 12, var49, null) as EmbedMedia;
            var25 = var44.n(var43, 13, EmbedThumbnail.$serializer.INSTANCE, null) as EmbedThumbnail;
            val var10: java.lang.String = var44.n(var43, 14, (DeserializationStrategy)var46, null) as java.lang.String;
            var147 = var44.n(var43, 15, (DeserializationStrategy)var46, null) as java.lang.String;
            var15 = var44.n(var43, 16, (DeserializationStrategy)var46, null) as java.lang.String;
            val var11: java.lang.Boolean = var44.n(var43, 17, qn.h.a, null) as java.lang.Boolean;
            var9 = var44.n(var43, 18, EmbedFooter.$serializer.INSTANCE, null) as EmbedFooter;
            var32 = var44.n(var43, 19, (DeserializationStrategy)var46, null) as java.lang.String;
            val var7: java.lang.String = var44.n(var43, 20, (DeserializationStrategy)var46, null) as java.lang.String;
            var8 = var44.n(var43, 21, (DeserializationStrategy)var46, null) as java.lang.String;
            val var13: java.lang.String = var44.n(var43, 22, (DeserializationStrategy)var46, null) as java.lang.String;
            var35 = var44.n(var43, 23, EmbedFailureState.Serializer.INSTANCE, null) as EmbedFailureState;
            val var50: n0 = n0.a;
            var149 = var44.n(var43, 24, n0.a, null) as Int;
            var152 = var44.n(var43, 25, var50, null) as Int;
            val var36: Int = var44.n(var43, 26, var50, null) as Int;
            var3 = var44.i(var43, 27);
            val var23: Int = var44.n(var43, 28, var50, null) as Int;
            val var51: java.lang.String = var44.n(var43, 29, (DeserializationStrategy)var46, null) as java.lang.String;
            var46 = var44.n(var43, 30, (DeserializationStrategy)var46, null) as java.lang.String;
            var2 = Integer.MAX_VALUE;
            var20 = var98;
            var98 = var103;
            var21 = var12;
            var103 = var82;
            var22 = var10;
            var82 = var147;
            var147 = var11;
            var33 = var7;
            var37 = var13;
            var79 = var149;
            var149 = var152;
            var152 = var36;
            var55 = var23;
            var194 = var51;
         } else {
            var27 = null;
            var var4: Boolean = true;
            var46 = null;
            var20 = null;
            var33 = null;
            var32 = null;
            var152 = null;
            var30 = null;
            var149 = null;
            var147 = null;
            var26 = null;
            var25 = null;
            var24 = null;
            var34 = null;
            var var141: Any = null;
            var var52: Any = null;
            var var75: Any = null;
            var var73: Any = null;
            var var77: Any = null;
            var79 = null;
            var22 = null;
            var55 = null;
            var16 = null;
            var82 = null;
            var15 = null;
            var21 = null;
            var8 = null;
            var98 = null;
            var103 = null;
            var19 = null;
            var2 = 0;
            var3 = 0;
            var9 = null;

            while (var4) {
               label130: {
                  label131: {
                     label132: {
                        label88: {
                           label87: {
                              label86: {
                                 var var5: Int = var44.o(var43);
                                 switch (var5) {
                                    case -1:
                                       var4 = false;
                                       break label86;
                                    case 0:
                                       var34 = var44.y(var43, 0, var42[0], var34) as EmbedType;
                                       var2 |= 1;
                                       break label86;
                                    case 1:
                                       var141 = var44.n(var43, 1, b2.a, var141) as java.lang.String;
                                       var2 |= 2;
                                       var35 = var52;
                                       break label87;
                                    case 2:
                                       var35 = var44.n(var43, 2, EmbedAuthor.$serializer.INSTANCE, var52) as EmbedAuthor;
                                       var2 |= 4;
                                       break label87;
                                    case 3:
                                       var79 = (Integer)var82;
                                       var77 = var15;
                                       var8 = var19;
                                       var16 = var73;
                                       var15 = var44.n(var43, 3, EmbedProvider.$serializer.INSTANCE, var75) as EmbedProvider;
                                       var2 |= 8;
                                       var52 = var9;
                                       var55 = (Integer)var20;
                                       var9 = var103;
                                       var73 = var98;
                                       var75 = var8;
                                       var82 = var52;
                                       var98 = var77;
                                       var103 = var79;
                                       var19 = var55;
                                       var20 = var16;
                                       break label130;
                                    case 4:
                                       var79 = (Integer)var82;
                                       var8 = var19;
                                       var98 = var77;
                                       val var108: java.lang.String = var44.n(var43, 4, b2.a, var73) as java.lang.String;
                                       var2 |= 16;
                                       var52 = var9;
                                       var55 = (Integer)var20;
                                       var9 = var103;
                                       var73 = var98;
                                       var75 = var8;
                                       var77 = var15;
                                       var82 = var52;
                                       var15 = var75;
                                       var16 = var108;
                                       var103 = var79;
                                       var19 = var55;
                                       var20 = var16;
                                       break label130;
                                    case 5:
                                       var20 = var16;
                                       var8 = var19;
                                       var103 = var79;
                                       var19 = var44.n(var43, 5, StructurableTextSerializer.INSTANCE, var77) as StructurableText;
                                       var2 |= 32;
                                       var52 = var9;
                                       var55 = (Integer)var20;
                                       var9 = var103;
                                       var73 = var98;
                                       var75 = var8;
                                       var77 = var15;
                                       var79 = (Integer)var82;
                                       var82 = var52;
                                       var15 = var75;
                                       var16 = var73;
                                       var98 = var19;
                                       var19 = var55;
                                       break label130;
                                    case 6:
                                       var8 = var19;
                                       var103 = var44.n(var43, 6, var42[6], var79) as java.util.List;
                                       var2 |= 64;
                                       var52 = var9;
                                       var55 = (Integer)var20;
                                       var9 = var103;
                                       var73 = var98;
                                       var75 = var8;
                                       var77 = var15;
                                       var79 = (Integer)var82;
                                       var82 = var52;
                                       var15 = var75;
                                       var16 = var73;
                                       var98 = var77;
                                       var19 = var55;
                                       var20 = var16;
                                       break label130;
                                    case 7:
                                       var22 = var44.n(var43, 7, b2.a, var22) as java.lang.String;
                                       var2 |= 128;
                                       var35 = var55;
                                       break label88;
                                    case 8:
                                       var35 = var44.n(var43, 8, b2.a, var55) as java.lang.String;
                                       var2 |= 256;
                                       break label88;
                                    case 9:
                                       var8 = var19;
                                       var20 = var44.n(var43, 9, StructurableTextSerializer.INSTANCE, var16) as StructurableText;
                                       var2 |= 512;
                                       var16 = var73;
                                       var52 = var9;
                                       var55 = (Integer)var20;
                                       var9 = var103;
                                       var73 = var98;
                                       var75 = var8;
                                       var77 = var15;
                                       var79 = (Integer)var82;
                                       var82 = var52;
                                       var15 = var75;
                                       var98 = var77;
                                       var103 = var79;
                                       var19 = var55;
                                       break label130;
                                    case 10:
                                       var8 = var19;
                                       var82 = var44.n(var43, 10, EmbedMedia.$serializer.INSTANCE, var82) as EmbedMedia;
                                       var2 |= 1024;
                                       var52 = var9;
                                       var55 = (Integer)var20;
                                       var9 = var103;
                                       var73 = var98;
                                       var75 = var8;
                                       var77 = var15;
                                       var79 = (Integer)var82;
                                       var82 = var52;
                                       var15 = var75;
                                       var16 = var73;
                                       var98 = var77;
                                       var103 = var79;
                                       var19 = var55;
                                       var20 = var16;
                                       break label130;
                                    case 11:
                                       var8 = var19;
                                       var15 = var44.n(var43, 11, var42[11], var15) as java.util.List;
                                       var2 |= 2048;
                                       var79 = (Integer)var82;
                                       var52 = var9;
                                       var55 = (Integer)var20;
                                       var9 = var103;
                                       var73 = var98;
                                       var75 = var8;
                                       var77 = var15;
                                       var82 = var52;
                                       var15 = var75;
                                       var16 = var73;
                                       var98 = var77;
                                       var103 = var79;
                                       var19 = var55;
                                       var20 = var16;
                                       break label130;
                                    case 12:
                                       var21 = var44.n(var43, 12, EmbedMedia.$serializer.INSTANCE, var21) as EmbedMedia;
                                       var2 |= 4096;
                                       var35 = var8;
                                       break label132;
                                    case 13:
                                       var35 = var44.n(var43, 13, EmbedThumbnail.$serializer.INSTANCE, var8) as EmbedThumbnail;
                                       var2 |= 8192;
                                       break label132;
                                    case 14:
                                       val var287: java.lang.String = var44.n(var43, 14, b2.a, var98) as java.lang.String;
                                       var2 |= 16384;
                                       var98 = var77;
                                       var79 = (Integer)var82;
                                       var77 = var15;
                                       var75 = var8;
                                       var52 = var9;
                                       var55 = (Integer)var20;
                                       var8 = var19;
                                       var9 = var103;
                                       var73 = var287;
                                       var82 = var52;
                                       var15 = var75;
                                       var16 = var73;
                                       var103 = var79;
                                       var19 = var55;
                                       var20 = var16;
                                       break label130;
                                    case 15:
                                       val var286: java.lang.String = var44.n(var43, 15, b2.a, var103) as java.lang.String;
                                       var2 |= 32768;
                                       var79 = (Integer)var82;
                                       var77 = var15;
                                       var75 = var8;
                                       var73 = var98;
                                       var52 = var9;
                                       var55 = (Integer)var20;
                                       var8 = var19;
                                       var9 = var286;
                                       var82 = var52;
                                       var15 = var75;
                                       var16 = var73;
                                       var98 = var77;
                                       var103 = var79;
                                       var19 = var55;
                                       var20 = var16;
                                       break label130;
                                    case 16:
                                       val var285: java.lang.String = var44.n(var43, 16, b2.a, var19) as java.lang.String;
                                       var2 |= 65536;
                                       var79 = (Integer)var82;
                                       var77 = var15;
                                       var75 = var8;
                                       var73 = var98;
                                       var52 = var9;
                                       var55 = (Integer)var20;
                                       var8 = var285;
                                       var9 = var103;
                                       var82 = var52;
                                       var15 = var75;
                                       var16 = var73;
                                       var98 = var77;
                                       var103 = var79;
                                       var19 = var55;
                                       var20 = var16;
                                       break label130;
                                    case 17:
                                       var9 = var44.n(var43, 17, qn.h.a, var9) as java.lang.Boolean;
                                       var2 |= 131072;
                                       var79 = (Integer)var82;
                                       var77 = var15;
                                       var75 = var8;
                                       var73 = var98;
                                       var8 = var19;
                                       var52 = var9;
                                       var55 = (Integer)var20;
                                       var9 = var103;
                                       var82 = var52;
                                       var15 = var75;
                                       var16 = var73;
                                       var98 = var77;
                                       var103 = var79;
                                       var19 = var55;
                                       var20 = var16;
                                       break label130;
                                    case 18:
                                       val var283: EmbedFooter = var44.n(var43, 18, EmbedFooter.$serializer.INSTANCE, var20) as EmbedFooter;
                                       var2 |= 262144;
                                       var79 = (Integer)var82;
                                       var77 = var15;
                                       var75 = var8;
                                       var73 = var98;
                                       var8 = var19;
                                       var52 = var9;
                                       var55 = var283;
                                       var9 = var103;
                                       var82 = var52;
                                       var15 = var75;
                                       var16 = var73;
                                       var98 = var77;
                                       var103 = var79;
                                       var19 = var55;
                                       var20 = var16;
                                       break label130;
                                    case 19:
                                       var32 = var44.n(var43, 19, b2.a, var32) as java.lang.String;
                                       var2 |= 524288;
                                       break label131;
                                    case 20:
                                       var33 = var44.n(var43, 20, b2.a, var33) as java.lang.String;
                                       var2 |= 1048576;
                                       break label131;
                                    case 21:
                                       var30 = var44.n(var43, 21, b2.a, var30) as java.lang.String;
                                       var2 |= 2097152;
                                       break label131;
                                    case 22:
                                       var24 = var44.n(var43, 22, b2.a, var24) as java.lang.String;
                                       var2 |= 4194304;
                                       break label131;
                                    case 23:
                                       var147 = var44.n(var43, 23, EmbedFailureState.Serializer.INSTANCE, var147) as EmbedFailureState;
                                       var2 |= 8388608;
                                       break label131;
                                    case 24:
                                       var25 = var44.n(var43, 24, n0.a, var25) as Int;
                                       var2 |= 16777216;
                                       break label131;
                                    case 25:
                                       var46 = var44.n(var43, 25, n0.a, var46) as Int;
                                       var5 = 33554432;
                                       break;
                                    case 26:
                                       var152 = var44.n(var43, 26, n0.a, var152) as Int;
                                       var2 |= 67108864;
                                       break label131;
                                    case 27:
                                       var3 = var44.i(var43, 27);
                                       var5 = 134217728;
                                       break;
                                    case 28:
                                       var149 = var44.n(var43, 28, n0.a, var149) as Int;
                                       var2 |= 268435456;
                                       break label131;
                                    case 29:
                                       var27 = var44.n(var43, 29, b2.a, var27) as java.lang.String;
                                       var2 |= 536870912;
                                       break label131;
                                    case 30:
                                       var26 = var44.n(var43, 30, b2.a, var26) as java.lang.String;
                                       var2 |= 1073741824;
                                       break label131;
                                    default:
                                       throw new n(var5);
                                 }

                                 var2 |= var5;
                                 break label131;
                              }

                              var16 = var73;
                              var79 = (Integer)var82;
                              var77 = var15;
                              var75 = var8;
                              var73 = var98;
                              var8 = var19;
                              var55 = (Integer)var20;
                              var52 = var9;
                              var9 = var103;
                              var82 = var52;
                              var15 = var75;
                              var98 = var77;
                              var103 = var79;
                              var19 = var55;
                              var20 = var16;
                              break label130;
                           }

                           var16 = var73;
                           var79 = (Integer)var82;
                           var77 = var15;
                           var75 = var8;
                           var73 = var98;
                           var8 = var19;
                           var55 = (Integer)var20;
                           var52 = var9;
                           var9 = var103;
                           var82 = var35;
                           var15 = var75;
                           var98 = var77;
                           var103 = var79;
                           var19 = var55;
                           var20 = var16;
                           break label130;
                        }

                        var8 = var19;
                        var55 = (Integer)var20;
                        var52 = var9;
                        var9 = var103;
                        var73 = var98;
                        var75 = var8;
                        var77 = var15;
                        var79 = (Integer)var82;
                        var82 = var52;
                        var15 = var75;
                        var16 = var73;
                        var98 = var77;
                        var103 = var79;
                        var19 = var35;
                        var20 = var16;
                        break label130;
                     }

                     var8 = var19;
                     var19 = var55;
                     var20 = var16;
                     var79 = (Integer)var82;
                     var77 = var15;
                     var52 = var9;
                     var55 = (Integer)var20;
                     var9 = var103;
                     var73 = var98;
                     var75 = var35;
                     var82 = var52;
                     var15 = var75;
                     var16 = var73;
                     var98 = var77;
                     var103 = var79;
                     break label130;
                  }

                  var79 = (Integer)var82;
                  var77 = var15;
                  var20 = var16;
                  var19 = var55;
                  var103 = var79;
                  var98 = var77;
                  var16 = var73;
                  var15 = var75;
                  var82 = var52;
                  var75 = var8;
                  var73 = var98;
                  var9 = var103;
                  var8 = var19;
                  var55 = (Integer)var20;
                  var52 = var9;
               }

               var8 = var75;
               var75 = var15;
               var73 = var16;
               var77 = var98;
               var79 = (Integer)var103;
               var55 = (Integer)var19;
               var16 = var20;
               var20 = var55;
               var9 = var52;
               var52 = var82;
               var82 = var79;
               var15 = var77;
               var98 = var73;
               var103 = var9;
               var19 = var8;
            }

            var194 = (java.lang.String)var27;
            var37 = var24;
            var25 = var8;
            var26 = var15;
            var24 = var79;
            var46 = var26;
            var55 = var149;
            var149 = (Integer)var46;
            var79 = (Integer)var25;
            var35 = var147;
            var8 = var30;
            var9 = var20;
            var147 = var9;
            var15 = var19;
            var82 = var103;
            var22 = var98;
            var30 = var21;
            var38 = var82;
            var103 = var16;
            var21 = var55;
            var27 = var22;
            var98 = var77;
            var19 = var73;
            var20 = var75;
            var16 = var52;
            var39 = var141;
         }

         var44.c(var43);
         return new Embed(
            var2,
            (EmbedType)var34,
            (java.lang.String)var39,
            (EmbedAuthor)var16,
            (EmbedProvider)var20,
            (java.lang.String)var19,
            (StructurableText)var98,
            (java.util.List)var24,
            (java.lang.String)var27,
            (java.lang.String)var21,
            (StructurableText)var103,
            (EmbedMedia)var38,
            (java.util.List)var26,
            (EmbedMedia)var30,
            (EmbedThumbnail)var25,
            (java.lang.String)var22,
            (java.lang.String)var82,
            (java.lang.String)var15,
            (java.lang.Boolean)var147,
            (EmbedFooter)var9,
            (java.lang.String)var32,
            (java.lang.String)var33,
            (java.lang.String)var8,
            (java.lang.String)var37,
            (EmbedFailureState)var35,
            var79,
            var149,
            var152,
            var3,
            var55,
            var194,
            (java.lang.String)var46,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: Embed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         Embed.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
