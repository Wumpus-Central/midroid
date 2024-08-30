package com.discord.chat.bridge.embed

import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import gn.n0
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
      val var26: EmbedType = this.type;
      val var4: java.lang.String = this.id;
      val var10: EmbedAuthor = this.author;
      val var20: EmbedProvider = this.provider;
      val var2: java.lang.String = this.rawTitle;
      val var11: StructurableText = this.title;
      val var5: java.util.List = this.fields;
      val var28: java.lang.String = this.url;
      val var22: java.lang.String = this.rawDescription;
      val var7: StructurableText = this.description;
      val var16: EmbedMedia = this.image;
      val var29: java.util.List = this.images;
      val var21: EmbedMedia = this.video;
      val var15: EmbedThumbnail = this.thumbnail;
      val var27: java.lang.String = this.numAttachments;
      val var14: java.lang.String = this.attachmentsSize;
      val var18: java.lang.String = this.messageSendError;
      val var6: java.lang.Boolean = this.disableBackgroundColor;
      val var8: EmbedFooter = this.footer;
      val var3: java.lang.String = this.spoiler;
      val var9: java.lang.String = this.obscure;
      val var30: java.lang.String = this.obscureAwaitingScan;
      val var17: java.lang.String = this.iconURL;
      val var12: EmbedFailureState = this.failureState;
      val var24: Int = this.providerColor;
      val var19: Int = this.borderLeftColor;
      val var13: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var23: Int = this.backgroundColor;
      val var25: StringBuilder = new StringBuilder();
      var25.append("Embed(type=");
      var25.append(var26);
      var25.append(", id=");
      var25.append(var4);
      var25.append(", author=");
      var25.append(var10);
      var25.append(", provider=");
      var25.append(var20);
      var25.append(", rawTitle=");
      var25.append(var2);
      var25.append(", title=");
      var25.append(var11);
      var25.append(", fields=");
      var25.append(var5);
      var25.append(", url=");
      var25.append(var28);
      var25.append(", rawDescription=");
      var25.append(var22);
      var25.append(", description=");
      var25.append(var7);
      var25.append(", image=");
      var25.append(var16);
      var25.append(", images=");
      var25.append(var29);
      var25.append(", video=");
      var25.append(var21);
      var25.append(", thumbnail=");
      var25.append(var15);
      var25.append(", numAttachments=");
      var25.append(var27);
      var25.append(", attachmentsSize=");
      var25.append(var14);
      var25.append(", messageSendError=");
      var25.append(var18);
      var25.append(", disableBackgroundColor=");
      var25.append(var6);
      var25.append(", footer=");
      var25.append(var8);
      var25.append(", spoiler=");
      var25.append(var3);
      var25.append(", obscure=");
      var25.append(var9);
      var25.append(", obscureAwaitingScan=");
      var25.append(var30);
      var25.append(", iconURL=");
      var25.append(var17);
      var25.append(", failureState=");
      var25.append(var12);
      var25.append(", providerColor=");
      var25.append(var24);
      var25.append(", borderLeftColor=");
      var25.append(var19);
      var25.append(", headerTextColor=");
      var25.append(var13);
      var25.append(", bodyTextColor=");
      var25.append(var1);
      var25.append(", backgroundColor=");
      var25.append(var23);
      var25.append(")");
      return var25.toString();
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
         val var8: KSerializer = var13[0];
         val var9: b2 = b2.a;
         val var1: KSerializer = a.u(b2.a);
         val var4: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var6: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var7: KSerializer = a.u(var9);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var2: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var10: KSerializer = a.u(var13[6]);
         val var3: KSerializer = a.u(var9);
         val var5: KSerializer = a.u(var9);
         val var12: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var27: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var28: KSerializer = a.u(var13[11]);
         val var17: KSerializer = a.u(var14);
         val var18: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var16: KSerializer = a.u(var9);
         val var25: KSerializer = a.u(var9);
         val var22: KSerializer = a.u(var9);
         val var20: KSerializer = a.u(gn.h.a);
         val var26: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var24: KSerializer = a.u(var9);
         val var23: KSerializer = a.u(var9);
         val var21: KSerializer = a.u(var9);
         val var19: KSerializer = a.u(var9);
         val var15: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var29: n0 = n0.a;
         return new KSerializer[]{
            var8,
            var1,
            var4,
            var6,
            var7,
            var2,
            var10,
            var3,
            var5,
            var12,
            var27,
            var28,
            var17,
            var18,
            var16,
            var25,
            var22,
            var20,
            var26,
            var24,
            var23,
            var21,
            var19,
            var15,
            a.u(n0.a),
            a.u(var29),
            a.u(var29),
            var29,
            a.u(var29),
            a.u(var9),
            a.u(var9)
         };
      }

      public open fun deserialize(decoder: Decoder): Embed {
         q.h(var1, "decoder");
         val var44: SerialDescriptor = this.getDescriptor();
         val var45: c = var1.b(var44);
         val var42: Array<KSerializer> = Embed.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var8: Any;
         var var13: Any;
         var var14: Any;
         var var15: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var21: Any;
         var var22: Any;
         var var23: Any;
         var var25: Int;
         var var26: Any;
         val var27: Int;
         var var28: Any;
         var var29: Int;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         val var36: Any;
         val var37: Any;
         val var38: Any;
         var var47: Any;
         var var56: Any;
         var var71: Int;
         var var91: Any;
         var var124: Any;
         var var141: java.lang.String;
         if (var45.p()) {
            var34 = var45.y(var44, 0, var42[0], null) as EmbedType;
            var47 = b2.a;
            var23 = var45.n(var44, 1, b2.a, null) as java.lang.String;
            var17 = var45.n(var44, 2, EmbedAuthor.$serializer.INSTANCE, null) as EmbedAuthor;
            var91 = var45.n(var44, 3, EmbedProvider.$serializer.INSTANCE, null) as EmbedProvider;
            var31 = var45.n(var44, 4, (DeserializationStrategy)var47, null) as java.lang.String;
            val var6: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
            var124 = var45.n(var44, 5, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var35 = var45.n(var44, 6, var42[6], null) as java.util.List;
            var19 = var45.n(var44, 7, (DeserializationStrategy)var47, null) as java.lang.String;
            val var11: java.lang.String = var45.n(var44, 8, (DeserializationStrategy)var47, null) as java.lang.String;
            var15 = var45.n(var44, 9, var6, null) as StructurableText;
            val var50: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
            var26 = var45.n(var44, 10, EmbedMedia.$serializer.INSTANCE, null) as EmbedMedia;
            var30 = var45.n(var44, 11, var42[11], null) as java.util.List;
            var22 = var45.n(var44, 12, var50, null) as EmbedMedia;
            var36 = var45.n(var44, 13, EmbedThumbnail.$serializer.INSTANCE, null) as EmbedThumbnail;
            val var10: java.lang.String = var45.n(var44, 14, (DeserializationStrategy)var47, null) as java.lang.String;
            var18 = var45.n(var44, 15, (DeserializationStrategy)var47, null) as java.lang.String;
            var14 = var45.n(var44, 16, (DeserializationStrategy)var47, null) as java.lang.String;
            val var12: java.lang.Boolean = var45.n(var44, 17, gn.h.a, null) as java.lang.Boolean;
            val var9: EmbedFooter = var45.n(var44, 18, EmbedFooter.$serializer.INSTANCE, null) as EmbedFooter;
            var32 = var45.n(var44, 19, (DeserializationStrategy)var47, null) as java.lang.String;
            var56 = var45.n(var44, 20, (DeserializationStrategy)var47, null) as java.lang.String;
            var8 = var45.n(var44, 21, (DeserializationStrategy)var47, null) as java.lang.String;
            var13 = var45.n(var44, 22, (DeserializationStrategy)var47, null) as java.lang.String;
            val var24: EmbedFailureState = var45.n(var44, 23, EmbedFailureState.Serializer.INSTANCE, null) as EmbedFailureState;
            val var51: n0 = n0.a;
            var27 = var45.n(var44, 24, n0.a, null) as Int;
            var29 = var45.n(var44, 25, var51, null) as Int;
            val var39: Int = var45.n(var44, 26, var51, null) as Int;
            var3 = var45.i(var44, 27);
            var25 = var45.n(var44, 28, var51, null) as Int;
            val var52: java.lang.String = var45.n(var44, 29, (DeserializationStrategy)var47, null) as java.lang.String;
            var47 = var45.n(var44, 30, (DeserializationStrategy)var47, null) as java.lang.String;
            var2 = Integer.MAX_VALUE;
            var37 = var91;
            var91 = var124;
            var21 = var11;
            var28 = var10;
            var124 = var12;
            var38 = var9;
            var33 = var56;
            var56 = var24;
            var71 = var39;
            var141 = var52;
         } else {
            var var145: java.lang.String = null;
            var var4: Boolean = true;
            var47 = null;
            var124 = null;
            var33 = null;
            var32 = null;
            var31 = null;
            var30 = null;
            var29 = null;
            var28 = null;
            var26 = null;
            var25 = null;
            var141 = null;
            var34 = null;
            var23 = null;
            var var53: Any = null;
            var var77: Any = null;
            var var75: Any = null;
            var var79: Any = null;
            var13 = null;
            var22 = null;
            var56 = null;
            var91 = null;
            var14 = null;
            var15 = null;
            var21 = null;
            var8 = null;
            var17 = null;
            var18 = null;
            var19 = null;
            var2 = 0;
            var3 = 0;
            var71 = null;

            while (var4) {
               label130: {
                  label131: {
                     label132: {
                        label88: {
                           label87: {
                              label86: {
                                 var var5: Int = var45.o(var44);
                                 switch (var5) {
                                    case -1:
                                       var4 = false;
                                       break label86;
                                    case 0:
                                       var34 = var45.y(var44, 0, var42[0], var34) as EmbedType;
                                       var2 |= 1;
                                       break label86;
                                    case 1:
                                       var23 = var45.n(var44, 1, b2.a, var23) as java.lang.String;
                                       var2 |= 2;
                                       var35 = var53;
                                       break label87;
                                    case 2:
                                       var35 = var45.n(var44, 2, EmbedAuthor.$serializer.INSTANCE, var53) as EmbedAuthor;
                                       var2 |= 4;
                                       break label87;
                                    case 3:
                                       var13 = var14;
                                       var79 = var15;
                                       var8 = var19;
                                       var91 = var75;
                                       var15 = var45.n(var44, 3, EmbedProvider.$serializer.INSTANCE, var77) as EmbedProvider;
                                       var2 |= 8;
                                       var53 = var71;
                                       var56 = var124;
                                       var71 = (Integer)var18;
                                       var75 = var17;
                                       var77 = var8;
                                       var14 = var53;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var56;
                                       var124 = var91;
                                       break label130;
                                    case 4:
                                       var124 = var91;
                                       var13 = var14;
                                       var8 = var19;
                                       var17 = var79;
                                       val var107: java.lang.String = var45.n(var44, 4, b2.a, var75) as java.lang.String;
                                       var2 |= 16;
                                       var53 = var71;
                                       var56 = var124;
                                       var71 = (Integer)var18;
                                       var75 = var17;
                                       var77 = var8;
                                       var79 = var15;
                                       var14 = var53;
                                       var15 = var77;
                                       var91 = var107;
                                       var18 = var13;
                                       var19 = var56;
                                       break label130;
                                    case 5:
                                       var8 = var19;
                                       var18 = var13;
                                       var19 = var45.n(var44, 5, StructurableTextSerializer.INSTANCE, var79) as StructurableText;
                                       var2 |= 32;
                                       var53 = var71;
                                       var56 = var124;
                                       var71 = (Integer)var18;
                                       var75 = var17;
                                       var77 = var8;
                                       var79 = var15;
                                       var13 = var14;
                                       var14 = var53;
                                       var15 = var77;
                                       var91 = var75;
                                       var17 = var19;
                                       var19 = var56;
                                       var124 = var91;
                                       break label130;
                                    case 6:
                                       var8 = var19;
                                       var18 = var45.n(var44, 6, var42[6], var13) as java.util.List;
                                       var2 |= 64;
                                       var53 = var71;
                                       var56 = var124;
                                       var71 = (Integer)var18;
                                       var75 = var17;
                                       var77 = var8;
                                       var79 = var15;
                                       var13 = var14;
                                       var14 = var53;
                                       var15 = var77;
                                       var91 = var75;
                                       var17 = var79;
                                       var19 = var56;
                                       var124 = var91;
                                       break label130;
                                    case 7:
                                       var22 = var45.n(var44, 7, b2.a, var22) as java.lang.String;
                                       var2 |= 128;
                                       var35 = var56;
                                       break label88;
                                    case 8:
                                       var35 = var45.n(var44, 8, b2.a, var56) as java.lang.String;
                                       var2 |= 256;
                                       break label88;
                                    case 9:
                                       var8 = var19;
                                       var124 = var45.n(var44, 9, StructurableTextSerializer.INSTANCE, var91) as StructurableText;
                                       var2 |= 512;
                                       var53 = var71;
                                       var56 = var124;
                                       var71 = (Integer)var18;
                                       var75 = var17;
                                       var77 = var8;
                                       var79 = var15;
                                       var13 = var14;
                                       var14 = var53;
                                       var15 = var77;
                                       var91 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var56;
                                       break label130;
                                    case 10:
                                       var8 = var19;
                                       var14 = var45.n(var44, 10, EmbedMedia.$serializer.INSTANCE, var14) as EmbedMedia;
                                       var2 |= 1024;
                                       var53 = var71;
                                       var56 = var124;
                                       var71 = (Integer)var18;
                                       var75 = var17;
                                       var77 = var8;
                                       var79 = var15;
                                       var13 = var14;
                                       var14 = var53;
                                       var15 = var77;
                                       var91 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var56;
                                       var124 = var91;
                                       break label130;
                                    case 11:
                                       var8 = var19;
                                       var15 = var45.n(var44, 11, var42[11], var15) as java.util.List;
                                       var2 |= 2048;
                                       var13 = var14;
                                       var53 = var71;
                                       var56 = var124;
                                       var71 = (Integer)var18;
                                       var75 = var17;
                                       var77 = var8;
                                       var79 = var15;
                                       var14 = var53;
                                       var15 = var77;
                                       var91 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var56;
                                       var124 = var91;
                                       break label130;
                                    case 12:
                                       var21 = var45.n(var44, 12, EmbedMedia.$serializer.INSTANCE, var21) as EmbedMedia;
                                       var2 |= 4096;
                                       var35 = var8;
                                       break label132;
                                    case 13:
                                       var35 = var45.n(var44, 13, EmbedThumbnail.$serializer.INSTANCE, var8) as EmbedThumbnail;
                                       var2 |= 8192;
                                       break label132;
                                    case 14:
                                       val var282: java.lang.String = var45.n(var44, 14, b2.a, var17) as java.lang.String;
                                       var2 |= 16384;
                                       var13 = var14;
                                       var79 = var15;
                                       var77 = var8;
                                       var53 = var71;
                                       var56 = var124;
                                       var8 = var19;
                                       var71 = (Integer)var18;
                                       var75 = var282;
                                       var14 = var53;
                                       var15 = var77;
                                       var91 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var56;
                                       var124 = var91;
                                       break label130;
                                    case 15:
                                       val var281: java.lang.String = var45.n(var44, 15, b2.a, var18) as java.lang.String;
                                       var2 |= 32768;
                                       var18 = var13;
                                       var13 = var14;
                                       var79 = var15;
                                       var77 = var8;
                                       var75 = var17;
                                       var53 = var71;
                                       var56 = var124;
                                       var8 = var19;
                                       var71 = var281;
                                       var14 = var53;
                                       var15 = var77;
                                       var91 = var75;
                                       var17 = var79;
                                       var19 = var56;
                                       var124 = var91;
                                       break label130;
                                    case 16:
                                       val var280: java.lang.String = var45.n(var44, 16, b2.a, var19) as java.lang.String;
                                       var2 |= 65536;
                                       var13 = var14;
                                       var79 = var15;
                                       var77 = var8;
                                       var75 = var17;
                                       var53 = var71;
                                       var56 = var124;
                                       var8 = var280;
                                       var71 = (Integer)var18;
                                       var14 = var53;
                                       var15 = var77;
                                       var91 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var56;
                                       var124 = var91;
                                       break label130;
                                    case 17:
                                       val var74: java.lang.Boolean = var45.n(var44, 17, gn.h.a, var71) as java.lang.Boolean;
                                       var2 |= 131072;
                                       var13 = var14;
                                       var79 = var15;
                                       var77 = var8;
                                       var75 = var17;
                                       var8 = var19;
                                       var53 = var74;
                                       var56 = var124;
                                       var71 = (Integer)var18;
                                       var14 = var53;
                                       var15 = var77;
                                       var91 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var56;
                                       var124 = var91;
                                       break label130;
                                    case 18:
                                       val var278: EmbedFooter = var45.n(var44, 18, EmbedFooter.$serializer.INSTANCE, var124) as EmbedFooter;
                                       var2 |= 262144;
                                       var13 = var14;
                                       var79 = var15;
                                       var77 = var8;
                                       var75 = var17;
                                       var8 = var19;
                                       var53 = var71;
                                       var56 = var278;
                                       var71 = (Integer)var18;
                                       var14 = var53;
                                       var15 = var77;
                                       var91 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var56;
                                       var124 = var91;
                                       break label130;
                                    case 19:
                                       var32 = var45.n(var44, 19, b2.a, var32) as java.lang.String;
                                       var2 |= 524288;
                                       break label131;
                                    case 20:
                                       var33 = var45.n(var44, 20, b2.a, var33) as java.lang.String;
                                       var2 |= 1048576;
                                       break label131;
                                    case 21:
                                       var30 = var45.n(var44, 21, b2.a, var30) as java.lang.String;
                                       var2 |= 2097152;
                                       break label131;
                                    case 22:
                                       var141 = var45.n(var44, 22, b2.a, var141) as java.lang.String;
                                       var2 |= 4194304;
                                       break label131;
                                    case 23:
                                       var28 = var45.n(var44, 23, EmbedFailureState.Serializer.INSTANCE, var28) as EmbedFailureState;
                                       var2 |= 8388608;
                                       break label131;
                                    case 24:
                                       var25 = var45.n(var44, 24, n0.a, var25) as Int;
                                       var2 |= 16777216;
                                       break label131;
                                    case 25:
                                       var47 = var45.n(var44, 25, n0.a, var47) as Int;
                                       var5 = 33554432;
                                       break;
                                    case 26:
                                       var31 = var45.n(var44, 26, n0.a, var31) as Int;
                                       var2 |= 67108864;
                                       break label131;
                                    case 27:
                                       var3 = var45.i(var44, 27);
                                       var5 = 134217728;
                                       break;
                                    case 28:
                                       var29 = var45.n(var44, 28, n0.a, var29) as Int;
                                       var2 |= 268435456;
                                       break label131;
                                    case 29:
                                       var145 = var45.n(var44, 29, b2.a, var145) as java.lang.String;
                                       var2 |= 536870912;
                                       break label131;
                                    case 30:
                                       var26 = var45.n(var44, 30, b2.a, var26) as java.lang.String;
                                       var2 |= 1073741824;
                                       break label131;
                                    default:
                                       throw new n(var5);
                                 }

                                 var2 |= var5;
                                 break label131;
                              }

                              var91 = var75;
                              var13 = var14;
                              var79 = var15;
                              var77 = var8;
                              var75 = var17;
                              var8 = var19;
                              var56 = var124;
                              var53 = var71;
                              var71 = (Integer)var18;
                              var14 = var53;
                              var15 = var77;
                              var17 = var79;
                              var18 = var13;
                              var19 = var56;
                              var124 = var91;
                              break label130;
                           }

                           var91 = var75;
                           var13 = var14;
                           var79 = var15;
                           var77 = var8;
                           var75 = var17;
                           var8 = var19;
                           var56 = var124;
                           var53 = var71;
                           var71 = (Integer)var18;
                           var14 = var35;
                           var15 = var77;
                           var17 = var79;
                           var18 = var13;
                           var19 = var56;
                           var124 = var91;
                           break label130;
                        }

                        var8 = var19;
                        var56 = var124;
                        var53 = var71;
                        var71 = (Integer)var18;
                        var75 = var17;
                        var77 = var8;
                        var79 = var15;
                        var13 = var14;
                        var14 = var53;
                        var15 = var77;
                        var91 = var75;
                        var17 = var79;
                        var18 = var13;
                        var19 = var35;
                        var124 = var91;
                        break label130;
                     }

                     var8 = var19;
                     var19 = var56;
                     var13 = var14;
                     var79 = var15;
                     var53 = var71;
                     var56 = var124;
                     var71 = (Integer)var18;
                     var75 = var17;
                     var77 = var35;
                     var14 = var53;
                     var15 = var77;
                     var91 = var75;
                     var17 = var79;
                     var18 = var13;
                     var124 = var91;
                     break label130;
                  }

                  var13 = var14;
                  var8 = var19;
                  var124 = var91;
                  var19 = var56;
                  var18 = var13;
                  var17 = var79;
                  var91 = var75;
                  var15 = var77;
                  var14 = var53;
                  var79 = var15;
                  var77 = var8;
                  var75 = var17;
                  var71 = (Integer)var18;
                  var56 = var124;
                  var53 = var71;
               }

               var8 = var77;
               var77 = var15;
               var75 = var91;
               var79 = var17;
               var13 = var18;
               var56 = var19;
               var91 = var124;
               var124 = var56;
               var71 = (Integer)var53;
               var53 = var14;
               var14 = var13;
               var15 = var79;
               var17 = var75;
               var18 = var71;
               var19 = var8;
            }

            var27 = var25;
            var38 = var124;
            var124 = var71;
            var36 = var8;
            var26 = var14;
            var35 = var13;
            var47 = var26;
            var141 = var145;
            var25 = var29;
            var71 = (Integer)var31;
            var29 = (Integer)var47;
            var56 = var28;
            var13 = var141;
            var8 = var30;
            var14 = var19;
            var28 = var17;
            var22 = var21;
            var30 = var15;
            var15 = var91;
            var21 = var56;
            var19 = var22;
            var91 = var79;
            var31 = var75;
            var37 = var77;
            var17 = var53;
         }

         var45.c(var44);
         return new Embed(
            var2,
            (EmbedType)var34,
            (java.lang.String)var23,
            (EmbedAuthor)var17,
            (EmbedProvider)var37,
            (java.lang.String)var31,
            (StructurableText)var91,
            (java.util.List)var35,
            (java.lang.String)var19,
            (java.lang.String)var21,
            (StructurableText)var15,
            (EmbedMedia)var26,
            (java.util.List)var30,
            (EmbedMedia)var22,
            (EmbedThumbnail)var36,
            (java.lang.String)var28,
            (java.lang.String)var18,
            (java.lang.String)var14,
            (java.lang.Boolean)var124,
            (EmbedFooter)var38,
            (java.lang.String)var32,
            (java.lang.String)var33,
            (java.lang.String)var8,
            (java.lang.String)var13,
            (EmbedFailureState)var56,
            var27,
            var29,
            var71,
            var3,
            var25,
            var141,
            (java.lang.String)var47,
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
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
