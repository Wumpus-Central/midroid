package com.discord.chat.bridge.embed

import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.n0
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
      val var22: EmbedType = this.type;
      val var15: java.lang.String = this.id;
      val var16: EmbedAuthor = this.author;
      val var24: EmbedProvider = this.provider;
      val var30: java.lang.String = this.rawTitle;
      val var12: StructurableText = this.title;
      val var2: java.util.List = this.fields;
      val var11: java.lang.String = this.url;
      val var13: java.lang.String = this.rawDescription;
      val var9: StructurableText = this.description;
      val var19: EmbedMedia = this.image;
      val var17: java.util.List = this.images;
      val var7: EmbedMedia = this.video;
      val var3: EmbedThumbnail = this.thumbnail;
      val var18: java.lang.String = this.numAttachments;
      val var10: java.lang.String = this.attachmentsSize;
      val var21: java.lang.String = this.messageSendError;
      val var20: java.lang.Boolean = this.disableBackgroundColor;
      val var8: EmbedFooter = this.footer;
      val var23: java.lang.String = this.spoiler;
      val var14: java.lang.String = this.obscure;
      val var25: java.lang.String = this.obscureAwaitingScan;
      val var29: java.lang.String = this.iconURL;
      val var26: EmbedFailureState = this.failureState;
      val var6: Int = this.providerColor;
      val var5: Int = this.borderLeftColor;
      val var4: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var27: Int = this.backgroundColor;
      val var28: StringBuilder = new StringBuilder();
      var28.append("Embed(type=");
      var28.append(var22);
      var28.append(", id=");
      var28.append(var15);
      var28.append(", author=");
      var28.append(var16);
      var28.append(", provider=");
      var28.append(var24);
      var28.append(", rawTitle=");
      var28.append(var30);
      var28.append(", title=");
      var28.append(var12);
      var28.append(", fields=");
      var28.append(var2);
      var28.append(", url=");
      var28.append(var11);
      var28.append(", rawDescription=");
      var28.append(var13);
      var28.append(", description=");
      var28.append(var9);
      var28.append(", image=");
      var28.append(var19);
      var28.append(", images=");
      var28.append(var17);
      var28.append(", video=");
      var28.append(var7);
      var28.append(", thumbnail=");
      var28.append(var3);
      var28.append(", numAttachments=");
      var28.append(var18);
      var28.append(", attachmentsSize=");
      var28.append(var10);
      var28.append(", messageSendError=");
      var28.append(var21);
      var28.append(", disableBackgroundColor=");
      var28.append(var20);
      var28.append(", footer=");
      var28.append(var8);
      var28.append(", spoiler=");
      var28.append(var23);
      var28.append(", obscure=");
      var28.append(var14);
      var28.append(", obscureAwaitingScan=");
      var28.append(var25);
      var28.append(", iconURL=");
      var28.append(var29);
      var28.append(", failureState=");
      var28.append(var26);
      var28.append(", providerColor=");
      var28.append(var6);
      var28.append(", borderLeftColor=");
      var28.append(var5);
      var28.append(", headerTextColor=");
      var28.append(var4);
      var28.append(", bodyTextColor=");
      var28.append(var1);
      var28.append(", backgroundColor=");
      var28.append(var27);
      var28.append(")");
      return var28.toString();
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
         val var4: KSerializer = var13[0];
         val var1: b2 = b2.a;
         val var7: KSerializer = a.u(b2.a);
         val var3: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var5: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var6: KSerializer = a.u(var1);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var2: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var10: KSerializer = a.u(var13[6]);
         val var8: KSerializer = a.u(var1);
         val var9: KSerializer = a.u(var1);
         val var27: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var12: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var28: KSerializer = a.u(var13[11]);
         val var15: KSerializer = a.u(var14);
         val var25: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var26: KSerializer = a.u(var1);
         val var16: KSerializer = a.u(var1);
         val var21: KSerializer = a.u(var1);
         val var20: KSerializer = a.u(il.h.a);
         val var24: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var17: KSerializer = a.u(var1);
         val var19: KSerializer = a.u(var1);
         val var18: KSerializer = a.u(var1);
         val var29: KSerializer = a.u(var1);
         val var23: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var22: n0 = n0.a;
         return new KSerializer[]{
            var4,
            var7,
            var3,
            var5,
            var6,
            var2,
            var10,
            var8,
            var9,
            var27,
            var12,
            var28,
            var15,
            var25,
            var26,
            var16,
            var21,
            var20,
            var24,
            var17,
            var19,
            var18,
            var29,
            var23,
            a.u(n0.a),
            a.u(var22),
            a.u(var22),
            var22,
            a.u(var22),
            a.u(var1),
            a.u(var1)
         };
      }

      public open fun deserialize(decoder: Decoder): Embed {
         q.h(var1, "decoder");
         val var42: SerialDescriptor = this.getDescriptor();
         val var43: c = var1.c(var42);
         val var44: Array<KSerializer> = Embed.access$get$childSerializers$cp();
         var var3: Int;
         val var4: Int;
         var var9: Any;
         var var16: Any;
         var var17: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: Any;
         var var23: Any;
         var var24: Any;
         var var25: Int;
         var var26: Any;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var30: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         val var36: Any;
         val var37: Any;
         val var38: Any;
         val var40: Any;
         var var46: Any;
         var var57: Int;
         var var69: java.lang.String;
         var var82: Int;
         var var85: Any;
         var var105: Any;
         var var152: Int;
         if (var43.y()) {
            var34 = var43.m(var42, 0, var44[0], null) as EmbedType;
            var46 = b2.a;
            var23 = var43.v(var42, 1, b2.a, null) as java.lang.String;
            var22 = var43.v(var42, 2, EmbedAuthor.$serializer.INSTANCE, null) as EmbedAuthor;
            var21 = var43.v(var42, 3, EmbedProvider.$serializer.INSTANCE, null) as EmbedProvider;
            var38 = var43.v(var42, 4, (DeserializationStrategy)var46, null) as java.lang.String;
            val var6: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
            var24 = var43.v(var42, 5, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var16 = var43.v(var42, 6, var44[6], null) as java.util.List;
            var26 = var43.v(var42, 7, (DeserializationStrategy)var46, null) as java.lang.String;
            val var12: java.lang.String = var43.v(var42, 8, (DeserializationStrategy)var46, null) as java.lang.String;
            var85 = var43.v(var42, 9, var6, null) as StructurableText;
            val var51: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
            var17 = var43.v(var42, 10, EmbedMedia.$serializer.INSTANCE, null) as EmbedMedia;
            var105 = var43.v(var42, 11, var44[11], null) as java.util.List;
            var19 = var43.v(var42, 12, var51, null) as EmbedMedia;
            var40 = var43.v(var42, 13, EmbedThumbnail.$serializer.INSTANCE, null) as EmbedThumbnail;
            val var10: java.lang.String = var43.v(var42, 14, (DeserializationStrategy)var46, null) as java.lang.String;
            var28 = var43.v(var42, 15, (DeserializationStrategy)var46, null) as java.lang.String;
            val var15: java.lang.String = var43.v(var42, 16, (DeserializationStrategy)var46, null) as java.lang.String;
            val var11: java.lang.Boolean = var43.v(var42, 17, il.h.a, null) as java.lang.Boolean;
            var9 = var43.v(var42, 18, EmbedFooter.$serializer.INSTANCE, null) as EmbedFooter;
            var32 = var43.v(var42, 19, (DeserializationStrategy)var46, null) as java.lang.String;
            val var7: java.lang.String = var43.v(var42, 20, (DeserializationStrategy)var46, null) as java.lang.String;
            var69 = var43.v(var42, 21, (DeserializationStrategy)var46, null) as java.lang.String;
            val var13: java.lang.String = var43.v(var42, 22, (DeserializationStrategy)var46, null) as java.lang.String;
            var36 = var43.v(var42, 23, EmbedFailureState.Serializer.INSTANCE, null) as EmbedFailureState;
            val var52: n0 = n0.a;
            var25 = var43.v(var42, 24, n0.a, null) as Int;
            var152 = var43.v(var42, 25, var52, null) as Int;
            val var41: Int = var43.v(var42, 26, var52, null) as Int;
            val var2: Int = var43.k(var42, 27);
            val var39: Int = var43.v(var42, 28, var52, null) as Int;
            val var53: java.lang.String = var43.v(var42, 29, (DeserializationStrategy)var46, null) as java.lang.String;
            var46 = var43.v(var42, 30, (DeserializationStrategy)var46, null) as java.lang.String;
            var4 = Integer.MAX_VALUE;
            var27 = var12;
            var20 = var85;
            var85 = var105;
            var105 = var10;
            var37 = var15;
            var29 = var11;
            var33 = var7;
            var30 = var69;
            var35 = var13;
            var57 = var152;
            var152 = var41;
            var3 = var2;
            var82 = var39;
            var69 = var53;
         } else {
            var27 = null;
            var var49: Boolean = true;
            var46 = null;
            var20 = null;
            var33 = null;
            var32 = null;
            var152 = null;
            var30 = null;
            var29 = null;
            var28 = null;
            var26 = null;
            var25 = null;
            var24 = null;
            var34 = null;
            var23 = null;
            var var54: Any = null;
            var var78: Any = null;
            var var76: Any = null;
            var var80: Any = null;
            var82 = null;
            var22 = null;
            var57 = null;
            var16 = null;
            var85 = null;
            var var91: Any = null;
            var21 = null;
            var69 = null;
            var17 = null;
            var105 = null;
            var19 = null;
            var var48: Int = 0;
            var3 = 0;
            var9 = null;

            while (var49) {
               label130: {
                  label131: {
                     label132: {
                        label88: {
                           label87: {
                              label86: {
                                 var var5: Int = var43.x(var42);
                                 switch (var5) {
                                    case -1:
                                       var49 = false;
                                       break label86;
                                    case 0:
                                       var34 = var43.m(var42, 0, var44[0], var34) as EmbedType;
                                       var48 |= 1;
                                       break label86;
                                    case 1:
                                       var23 = var43.v(var42, 1, b2.a, var23) as java.lang.String;
                                       var48 |= 2;
                                       var35 = var54;
                                       break label87;
                                    case 2:
                                       var35 = var43.v(var42, 2, EmbedAuthor.$serializer.INSTANCE, var54) as EmbedAuthor;
                                       var48 |= 4;
                                       break label87;
                                    case 3:
                                       var20 = var16;
                                       var82 = (Integer)var85;
                                       var80 = var91;
                                       var69 = (java.lang.String)var19;
                                       var16 = var76;
                                       var91 = var43.v(var42, 3, EmbedProvider.$serializer.INSTANCE, var78) as EmbedProvider;
                                       var48 |= 8;
                                       var54 = var9;
                                       var57 = (Integer)var20;
                                       var9 = var105;
                                       var76 = var17;
                                       var78 = var69;
                                       var85 = var54;
                                       var17 = var80;
                                       var105 = var82;
                                       var19 = var57;
                                       break label130;
                                    case 4:
                                       var82 = (Integer)var85;
                                       var69 = (java.lang.String)var19;
                                       var17 = var80;
                                       val var111: java.lang.String = var43.v(var42, 4, b2.a, var76) as java.lang.String;
                                       var48 |= 16;
                                       var54 = var9;
                                       var57 = (Integer)var20;
                                       var9 = var105;
                                       var76 = var17;
                                       var78 = var69;
                                       var80 = var91;
                                       var85 = var54;
                                       var91 = var78;
                                       var16 = var111;
                                       var105 = var82;
                                       var19 = var57;
                                       var20 = var16;
                                       break label130;
                                    case 5:
                                       var69 = (java.lang.String)var19;
                                       var105 = var82;
                                       var17 = var43.v(var42, 5, StructurableTextSerializer.INSTANCE, var80) as StructurableText;
                                       var48 |= 32;
                                       var54 = var9;
                                       var57 = (Integer)var20;
                                       var9 = var105;
                                       var76 = var17;
                                       var78 = var69;
                                       var80 = var91;
                                       var82 = (Integer)var85;
                                       var85 = var54;
                                       var91 = var78;
                                       var16 = var76;
                                       var19 = var57;
                                       var20 = var16;
                                       break label130;
                                    case 6:
                                       var20 = var16;
                                       var69 = (java.lang.String)var19;
                                       var105 = var43.v(var42, 6, var44[6], var82) as java.util.List;
                                       var48 |= 64;
                                       var54 = var9;
                                       var57 = (Integer)var20;
                                       var9 = var105;
                                       var76 = var17;
                                       var78 = var69;
                                       var80 = var91;
                                       var82 = (Integer)var85;
                                       var85 = var54;
                                       var91 = var78;
                                       var16 = var76;
                                       var17 = var80;
                                       var19 = var57;
                                       break label130;
                                    case 7:
                                       var22 = var43.v(var42, 7, b2.a, var22) as java.lang.String;
                                       var48 |= 128;
                                       var35 = var57;
                                       break label88;
                                    case 8:
                                       var35 = var43.v(var42, 8, b2.a, var57) as java.lang.String;
                                       var48 |= 256;
                                       break label88;
                                    case 9:
                                       var69 = (java.lang.String)var19;
                                       var20 = var43.v(var42, 9, StructurableTextSerializer.INSTANCE, var16) as StructurableText;
                                       var48 |= 512;
                                       var16 = var76;
                                       var54 = var9;
                                       var57 = (Integer)var20;
                                       var9 = var105;
                                       var76 = var17;
                                       var78 = var69;
                                       var80 = var91;
                                       var82 = (Integer)var85;
                                       var85 = var54;
                                       var91 = var78;
                                       var17 = var80;
                                       var105 = var82;
                                       var19 = var57;
                                       break label130;
                                    case 10:
                                       var69 = (java.lang.String)var19;
                                       var85 = var43.v(var42, 10, EmbedMedia.$serializer.INSTANCE, var85) as EmbedMedia;
                                       var48 |= 1024;
                                       var54 = var9;
                                       var57 = (Integer)var20;
                                       var9 = var105;
                                       var76 = var17;
                                       var78 = var69;
                                       var80 = var91;
                                       var82 = (Integer)var85;
                                       var85 = var54;
                                       var91 = var78;
                                       var16 = var76;
                                       var17 = var80;
                                       var105 = var82;
                                       var19 = var57;
                                       var20 = var16;
                                       break label130;
                                    case 11:
                                       var69 = (java.lang.String)var19;
                                       var91 = var43.v(var42, 11, var44[11], var91) as java.util.List;
                                       var48 |= 2048;
                                       var82 = (Integer)var85;
                                       var54 = var9;
                                       var57 = (Integer)var20;
                                       var9 = var105;
                                       var76 = var17;
                                       var78 = var69;
                                       var80 = var91;
                                       var85 = var54;
                                       var91 = var78;
                                       var16 = var76;
                                       var17 = var80;
                                       var105 = var82;
                                       var19 = var57;
                                       var20 = var16;
                                       break label130;
                                    case 12:
                                       var21 = var43.v(var42, 12, EmbedMedia.$serializer.INSTANCE, var21) as EmbedMedia;
                                       var48 |= 4096;
                                       var35 = var69;
                                       break label132;
                                    case 13:
                                       var35 = var43.v(var42, 13, EmbedThumbnail.$serializer.INSTANCE, var69) as EmbedThumbnail;
                                       var48 |= 8192;
                                       break label132;
                                    case 14:
                                       val var287: java.lang.String = var43.v(var42, 14, b2.a, var17) as java.lang.String;
                                       var48 |= 16384;
                                       var82 = (Integer)var85;
                                       var80 = var91;
                                       var78 = var69;
                                       var54 = var9;
                                       var57 = (Integer)var20;
                                       var69 = (java.lang.String)var19;
                                       var9 = var105;
                                       var76 = var287;
                                       var85 = var54;
                                       var91 = var78;
                                       var16 = var76;
                                       var17 = var80;
                                       var105 = var82;
                                       var19 = var57;
                                       var20 = var16;
                                       break label130;
                                    case 15:
                                       val var286: java.lang.String = var43.v(var42, 15, b2.a, var105) as java.lang.String;
                                       var48 |= 32768;
                                       var82 = (Integer)var85;
                                       var80 = var91;
                                       var78 = var69;
                                       var76 = var17;
                                       var54 = var9;
                                       var57 = (Integer)var20;
                                       var69 = (java.lang.String)var19;
                                       var9 = var286;
                                       var85 = var54;
                                       var91 = var78;
                                       var16 = var76;
                                       var17 = var80;
                                       var105 = var82;
                                       var19 = var57;
                                       var20 = var16;
                                       break label130;
                                    case 16:
                                       val var285: java.lang.String = var43.v(var42, 16, b2.a, var19) as java.lang.String;
                                       var48 |= 65536;
                                       var82 = (Integer)var85;
                                       var80 = var91;
                                       var78 = var69;
                                       var76 = var17;
                                       var54 = var9;
                                       var57 = (Integer)var20;
                                       var69 = var285;
                                       var9 = var105;
                                       var85 = var54;
                                       var91 = var78;
                                       var16 = var76;
                                       var17 = var80;
                                       var105 = var82;
                                       var19 = var57;
                                       var20 = var16;
                                       break label130;
                                    case 17:
                                       var9 = var43.v(var42, 17, il.h.a, var9) as java.lang.Boolean;
                                       var48 |= 131072;
                                       var82 = (Integer)var85;
                                       var80 = var91;
                                       var78 = var69;
                                       var76 = var17;
                                       var69 = (java.lang.String)var19;
                                       var54 = var9;
                                       var57 = (Integer)var20;
                                       var9 = var105;
                                       var85 = var54;
                                       var91 = var78;
                                       var16 = var76;
                                       var17 = var80;
                                       var105 = var82;
                                       var19 = var57;
                                       var20 = var16;
                                       break label130;
                                    case 18:
                                       val var283: EmbedFooter = var43.v(var42, 18, EmbedFooter.$serializer.INSTANCE, var20) as EmbedFooter;
                                       var48 |= 262144;
                                       var82 = (Integer)var85;
                                       var80 = var91;
                                       var78 = var69;
                                       var76 = var17;
                                       var69 = (java.lang.String)var19;
                                       var54 = var9;
                                       var57 = var283;
                                       var9 = var105;
                                       var85 = var54;
                                       var91 = var78;
                                       var16 = var76;
                                       var17 = var80;
                                       var105 = var82;
                                       var19 = var57;
                                       var20 = var16;
                                       break label130;
                                    case 19:
                                       var32 = var43.v(var42, 19, b2.a, var32) as java.lang.String;
                                       var48 |= 524288;
                                       break label131;
                                    case 20:
                                       var33 = var43.v(var42, 20, b2.a, var33) as java.lang.String;
                                       var48 |= 1048576;
                                       break label131;
                                    case 21:
                                       var30 = var43.v(var42, 21, b2.a, var30) as java.lang.String;
                                       var48 |= 2097152;
                                       break label131;
                                    case 22:
                                       var24 = var43.v(var42, 22, b2.a, var24) as java.lang.String;
                                       var48 |= 4194304;
                                       break label131;
                                    case 23:
                                       var28 = var43.v(var42, 23, EmbedFailureState.Serializer.INSTANCE, var28) as EmbedFailureState;
                                       var48 |= 8388608;
                                       break label131;
                                    case 24:
                                       var25 = var43.v(var42, 24, n0.a, var25) as Int;
                                       var48 |= 16777216;
                                       break label131;
                                    case 25:
                                       var46 = var43.v(var42, 25, n0.a, var46) as Int;
                                       var5 = 33554432;
                                       break;
                                    case 26:
                                       var152 = var43.v(var42, 26, n0.a, var152) as Int;
                                       var48 |= 67108864;
                                       break label131;
                                    case 27:
                                       var3 = var43.k(var42, 27);
                                       var5 = 134217728;
                                       break;
                                    case 28:
                                       var29 = var43.v(var42, 28, n0.a, var29) as Int;
                                       var48 |= 268435456;
                                       break label131;
                                    case 29:
                                       var27 = var43.v(var42, 29, b2.a, var27) as java.lang.String;
                                       var48 |= 536870912;
                                       break label131;
                                    case 30:
                                       var26 = var43.v(var42, 30, b2.a, var26) as java.lang.String;
                                       var48 |= 1073741824;
                                       break label131;
                                    default:
                                       throw new n(var5);
                                 }

                                 var48 |= var5;
                                 break label131;
                              }

                              var16 = var76;
                              var82 = (Integer)var85;
                              var80 = var91;
                              var78 = var69;
                              var76 = var17;
                              var69 = (java.lang.String)var19;
                              var57 = (Integer)var20;
                              var54 = var9;
                              var9 = var105;
                              var85 = var54;
                              var91 = var78;
                              var17 = var80;
                              var105 = var82;
                              var19 = var57;
                              var20 = var16;
                              break label130;
                           }

                           var16 = var76;
                           var82 = (Integer)var85;
                           var80 = var91;
                           var78 = var69;
                           var76 = var17;
                           var69 = (java.lang.String)var19;
                           var57 = (Integer)var20;
                           var54 = var9;
                           var9 = var105;
                           var85 = var35;
                           var91 = var78;
                           var17 = var80;
                           var105 = var82;
                           var19 = var57;
                           var20 = var16;
                           break label130;
                        }

                        var69 = (java.lang.String)var19;
                        var57 = (Integer)var20;
                        var54 = var9;
                        var9 = var105;
                        var76 = var17;
                        var78 = var69;
                        var80 = var91;
                        var82 = (Integer)var85;
                        var85 = var54;
                        var91 = var78;
                        var16 = var76;
                        var17 = var80;
                        var105 = var82;
                        var19 = var35;
                        var20 = var16;
                        break label130;
                     }

                     var69 = (java.lang.String)var19;
                     var105 = var82;
                     var82 = (Integer)var85;
                     var80 = var91;
                     var54 = var9;
                     var57 = (Integer)var20;
                     var9 = var105;
                     var76 = var17;
                     var78 = var35;
                     var85 = var54;
                     var91 = var78;
                     var16 = var76;
                     var17 = var80;
                     var19 = var57;
                     var20 = var16;
                     break label130;
                  }

                  var82 = (Integer)var85;
                  var20 = var16;
                  var19 = var57;
                  var105 = var82;
                  var17 = var80;
                  var16 = var76;
                  var91 = var78;
                  var85 = var54;
                  var80 = var91;
                  var78 = var69;
                  var76 = var17;
                  var9 = var105;
                  var69 = (java.lang.String)var19;
                  var57 = (Integer)var20;
                  var54 = var9;
               }

               var69 = (java.lang.String)var78;
               var78 = var91;
               var76 = var16;
               var80 = var17;
               var82 = (Integer)var105;
               var57 = (Integer)var19;
               var16 = var20;
               var20 = var57;
               var9 = var54;
               var54 = var85;
               var85 = var82;
               var91 = var80;
               var17 = var76;
               var105 = var9;
               var19 = var69;
            }

            var35 = var24;
            var29 = var9;
            var37 = var19;
            var40 = var69;
            var17 = var85;
            var27 = var57;
            var46 = var26;
            var69 = (java.lang.String)var27;
            var82 = (Integer)var29;
            var57 = (Integer)var46;
            var36 = var28;
            var9 = var20;
            var28 = var105;
            var105 = var17;
            var19 = var21;
            var85 = var91;
            var20 = var16;
            var26 = var22;
            var16 = var82;
            var24 = var80;
            var38 = var76;
            var21 = var78;
            var22 = var54;
            var4 = var48;
         }

         var43.b(var42);
         return new Embed(
            var4,
            (EmbedType)var34,
            (java.lang.String)var23,
            (EmbedAuthor)var22,
            (EmbedProvider)var21,
            (java.lang.String)var38,
            (StructurableText)var24,
            (java.util.List)var16,
            (java.lang.String)var26,
            (java.lang.String)var27,
            (StructurableText)var20,
            (EmbedMedia)var17,
            (java.util.List)var85,
            (EmbedMedia)var19,
            (EmbedThumbnail)var40,
            (java.lang.String)var105,
            (java.lang.String)var28,
            (java.lang.String)var37,
            (java.lang.Boolean)var29,
            (EmbedFooter)var9,
            (java.lang.String)var32,
            (java.lang.String)var33,
            (java.lang.String)var30,
            (java.lang.String)var35,
            (EmbedFailureState)var36,
            var25,
            var57,
            var152,
            var3,
            var82,
            var69,
            (java.lang.String)var46,
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
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
