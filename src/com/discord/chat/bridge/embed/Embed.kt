package com.discord.chat.bridge.embed

import cl.f
import cl.n
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import dl.a
import fl.b2
import fl.g0
import fl.n0
import kotlin.jvm.internal.q
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
      val var12: EmbedType = this.type;
      val var26: java.lang.String = this.id;
      val var5: EmbedAuthor = this.author;
      val var22: EmbedProvider = this.provider;
      val var11: java.lang.String = this.rawTitle;
      val var6: StructurableText = this.title;
      val var29: java.util.List = this.fields;
      val var9: java.lang.String = this.url;
      val var16: java.lang.String = this.rawDescription;
      val var14: StructurableText = this.description;
      val var15: EmbedMedia = this.image;
      val var23: java.util.List = this.images;
      val var4: EmbedMedia = this.video;
      val var3: EmbedThumbnail = this.thumbnail;
      val var13: java.lang.String = this.numAttachments;
      val var18: java.lang.String = this.attachmentsSize;
      val var24: java.lang.String = this.messageSendError;
      val var2: java.lang.Boolean = this.disableBackgroundColor;
      val var30: EmbedFooter = this.footer;
      val var17: java.lang.String = this.spoiler;
      val var10: java.lang.String = this.obscure;
      val var19: java.lang.String = this.obscureAwaitingScan;
      val var27: java.lang.String = this.iconURL;
      val var7: EmbedFailureState = this.failureState;
      val var21: Int = this.providerColor;
      val var8: Int = this.borderLeftColor;
      val var28: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var20: Int = this.backgroundColor;
      val var25: StringBuilder = new StringBuilder();
      var25.append("Embed(type=");
      var25.append(var12);
      var25.append(", id=");
      var25.append(var26);
      var25.append(", author=");
      var25.append(var5);
      var25.append(", provider=");
      var25.append(var22);
      var25.append(", rawTitle=");
      var25.append(var11);
      var25.append(", title=");
      var25.append(var6);
      var25.append(", fields=");
      var25.append(var29);
      var25.append(", url=");
      var25.append(var9);
      var25.append(", rawDescription=");
      var25.append(var16);
      var25.append(", description=");
      var25.append(var14);
      var25.append(", image=");
      var25.append(var15);
      var25.append(", images=");
      var25.append(var23);
      var25.append(", video=");
      var25.append(var4);
      var25.append(", thumbnail=");
      var25.append(var3);
      var25.append(", numAttachments=");
      var25.append(var13);
      var25.append(", attachmentsSize=");
      var25.append(var18);
      var25.append(", messageSendError=");
      var25.append(var24);
      var25.append(", disableBackgroundColor=");
      var25.append(var2);
      var25.append(", footer=");
      var25.append(var30);
      var25.append(", spoiler=");
      var25.append(var17);
      var25.append(", obscure=");
      var25.append(var10);
      var25.append(", obscureAwaitingScan=");
      var25.append(var19);
      var25.append(", iconURL=");
      var25.append(var27);
      var25.append(", failureState=");
      var25.append(var7);
      var25.append(", providerColor=");
      var25.append(var21);
      var25.append(", borderLeftColor=");
      var25.append(var8);
      var25.append(", headerTextColor=");
      var25.append(var28);
      var25.append(", bodyTextColor=");
      var25.append(var1);
      var25.append(", backgroundColor=");
      var25.append(var20);
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
         val var4: KSerializer = var13[0];
         val var2: b2 = b2.a;
         val var5: KSerializer = a.u(b2.a);
         val var8: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var9: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var7: KSerializer = a.u(var2);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var1: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var6: KSerializer = a.u(var13[6]);
         val var3: KSerializer = a.u(var2);
         val var10: KSerializer = a.u(var2);
         val var12: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var27: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var28: KSerializer = a.u(var13[11]);
         val var22: KSerializer = a.u(var14);
         val var20: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var23: KSerializer = a.u(var2);
         val var16: KSerializer = a.u(var2);
         val var15: KSerializer = a.u(var2);
         val var21: KSerializer = a.u(fl.h.a);
         val var26: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var24: KSerializer = a.u(var2);
         val var19: KSerializer = a.u(var2);
         val var17: KSerializer = a.u(var2);
         val var29: KSerializer = a.u(var2);
         val var18: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var25: n0 = n0.a;
         return new KSerializer[]{
            var4,
            var5,
            var8,
            var9,
            var7,
            var1,
            var6,
            var3,
            var10,
            var12,
            var27,
            var28,
            var22,
            var20,
            var23,
            var16,
            var15,
            var21,
            var26,
            var24,
            var19,
            var17,
            var29,
            var18,
            a.u(n0.a),
            a.u(var25),
            a.u(var25),
            var25,
            a.u(var25),
            a.u(var2),
            a.u(var2)
         };
      }

      public open fun deserialize(decoder: Decoder): Embed {
         q.h(var1, "decoder");
         val var42: SerialDescriptor = this.getDescriptor();
         val var43: c = var1.c(var42);
         val var44: Array<KSerializer> = Embed.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var7: Any;
         var var9: Any;
         var var13: Any;
         var var14: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: Any;
         var var23: Any;
         var var24: Int;
         var var26: Any;
         var var27: Any;
         var var28: Any;
         var var29: Int;
         var var30: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         val var37: java.lang.String;
         val var38: Any;
         val var39: Any;
         var var67: Int;
         var var88: Any;
         var var92: Any;
         var var144: Any;
         var var150: Int;
         var var193: Any;
         if (var43.y()) {
            var34 = var43.m(var42, 0, var44[0], null) as EmbedType;
            val var45: b2 = b2.a;
            var23 = var43.v(var42, 1, b2.a, null) as java.lang.String;
            var28 = var43.v(var42, 2, EmbedAuthor.$serializer.INSTANCE, null) as EmbedAuthor;
            var92 = var43.v(var42, 3, EmbedProvider.$serializer.INSTANCE, null) as EmbedProvider;
            var21 = var43.v(var42, 4, var45, null) as java.lang.String;
            val var6: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
            var26 = var43.v(var42, 5, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var27 = var43.v(var42, 6, var44[6], null) as java.util.List;
            var22 = var43.v(var42, 7, var45, null) as java.lang.String;
            val var12: java.lang.String = var43.v(var42, 8, var45, null) as java.lang.String;
            var88 = var43.v(var42, 9, var6, null) as StructurableText;
            val var50: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
            var144 = var43.v(var42, 10, EmbedMedia.$serializer.INSTANCE, null) as EmbedMedia;
            var19 = var43.v(var42, 11, var44[11], null) as java.util.List;
            var35 = var43.v(var42, 12, var50, null) as EmbedMedia;
            var20 = var43.v(var42, 13, EmbedThumbnail.$serializer.INSTANCE, null) as EmbedThumbnail;
            val var10: java.lang.String = var43.v(var42, 14, var45, null) as java.lang.String;
            var38 = var43.v(var42, 15, var45, null) as java.lang.String;
            var14 = var43.v(var42, 16, var45, null) as java.lang.String;
            val var11: java.lang.Boolean = var43.v(var42, 17, fl.h.a, null) as java.lang.Boolean;
            var9 = var43.v(var42, 18, EmbedFooter.$serializer.INSTANCE, null) as EmbedFooter;
            var32 = var43.v(var42, 19, var45, null) as java.lang.String;
            var7 = var43.v(var42, 20, var45, null) as java.lang.String;
            val var8: java.lang.String = var43.v(var42, 21, var45, null) as java.lang.String;
            var13 = var43.v(var42, 22, var45, null) as java.lang.String;
            var39 = var43.v(var42, 23, EmbedFailureState.Serializer.INSTANCE, null) as EmbedFailureState;
            val var51: n0 = n0.a;
            var24 = var43.v(var42, 24, n0.a, null) as Int;
            var150 = var43.v(var42, 25, var51, null) as Int;
            var193 = var43.v(var42, 26, var51, null) as Int;
            var3 = var43.k(var42, 27);
            var29 = var43.v(var42, 28, var51, null) as Int;
            val var52: java.lang.String = var43.v(var42, 29, var45, null) as java.lang.String;
            val var46: java.lang.String = var43.v(var42, 30, var45, null) as java.lang.String;
            var2 = Integer.MAX_VALUE;
            var33 = var92;
            var17 = var12;
            var18 = var88;
            var88 = var144;
            var92 = var10;
            var144 = var11;
            var30 = var8;
            var67 = var150;
            var150 = (Integer)var193;
            var37 = var52;
            var193 = var46;
         } else {
            var27 = null;
            var var4: Boolean = true;
            var var47: Int = null;
            var20 = null;
            var33 = null;
            var32 = null;
            var150 = null;
            var30 = null;
            var29 = null;
            var28 = null;
            var26 = null;
            var144 = null;
            var24 = null;
            var34 = null;
            var23 = null;
            var var53: Any = null;
            var var77: Any = null;
            var var75: Any = null;
            var var79: Any = null;
            var13 = null;
            var22 = null;
            var7 = null;
            var92 = null;
            var14 = null;
            var88 = null;
            var21 = null;
            var67 = null;
            var17 = null;
            var18 = null;
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
                                 var var5: Int = var43.x(var42);
                                 switch (var5) {
                                    case -1:
                                       var4 = false;
                                       break label86;
                                    case 0:
                                       var34 = var43.m(var42, 0, var44[0], var34) as EmbedType;
                                       var2 |= 1;
                                       break label86;
                                    case 1:
                                       var23 = var43.v(var42, 1, b2.a, var23) as java.lang.String;
                                       var2 |= 2;
                                       var35 = var53;
                                       break label87;
                                    case 2:
                                       var35 = var43.v(var42, 2, EmbedAuthor.$serializer.INSTANCE, var53) as EmbedAuthor;
                                       var2 |= 4;
                                       break label87;
                                    case 3:
                                       var20 = var92;
                                       var13 = var14;
                                       var79 = var88;
                                       var67 = (Integer)var19;
                                       var92 = var75;
                                       var88 = var43.v(var42, 3, EmbedProvider.$serializer.INSTANCE, var77) as EmbedProvider;
                                       var2 |= 8;
                                       var53 = var9;
                                       var7 = var20;
                                       var9 = var18;
                                       var75 = var17;
                                       var77 = var67;
                                       var14 = var53;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var7;
                                       break label130;
                                    case 4:
                                       var20 = var92;
                                       var13 = var14;
                                       var67 = (Integer)var19;
                                       var17 = var79;
                                       val var111: java.lang.String = var43.v(var42, 4, b2.a, var75) as java.lang.String;
                                       var2 |= 16;
                                       var53 = var9;
                                       var7 = var20;
                                       var9 = var18;
                                       var75 = var17;
                                       var77 = var67;
                                       var79 = var88;
                                       var14 = var53;
                                       var88 = var77;
                                       var92 = var111;
                                       var18 = var13;
                                       var19 = var7;
                                       break label130;
                                    case 5:
                                       var67 = (Integer)var19;
                                       var18 = var13;
                                       var17 = var43.v(var42, 5, StructurableTextSerializer.INSTANCE, var79) as StructurableText;
                                       var2 |= 32;
                                       var53 = var9;
                                       var7 = var20;
                                       var9 = var18;
                                       var75 = var17;
                                       var77 = var67;
                                       var79 = var88;
                                       var13 = var14;
                                       var14 = var53;
                                       var88 = var77;
                                       var92 = var75;
                                       var19 = var7;
                                       var20 = var92;
                                       break label130;
                                    case 6:
                                       var20 = var92;
                                       var67 = (Integer)var19;
                                       var18 = var43.v(var42, 6, var44[6], var13) as java.util.List;
                                       var2 |= 64;
                                       var53 = var9;
                                       var7 = var20;
                                       var9 = var18;
                                       var75 = var17;
                                       var77 = var67;
                                       var79 = var88;
                                       var13 = var14;
                                       var14 = var53;
                                       var88 = var77;
                                       var92 = var75;
                                       var17 = var79;
                                       var19 = var7;
                                       break label130;
                                    case 7:
                                       var22 = var43.v(var42, 7, b2.a, var22) as java.lang.String;
                                       var2 |= 128;
                                       var35 = var7;
                                       break label88;
                                    case 8:
                                       var35 = var43.v(var42, 8, b2.a, var7) as java.lang.String;
                                       var2 |= 256;
                                       break label88;
                                    case 9:
                                       var67 = (Integer)var19;
                                       var20 = var43.v(var42, 9, StructurableTextSerializer.INSTANCE, var92) as StructurableText;
                                       var2 |= 512;
                                       var53 = var9;
                                       var7 = var20;
                                       var9 = var18;
                                       var75 = var17;
                                       var77 = var67;
                                       var79 = var88;
                                       var13 = var14;
                                       var14 = var53;
                                       var88 = var77;
                                       var92 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var7;
                                       break label130;
                                    case 10:
                                       var67 = (Integer)var19;
                                       var14 = var43.v(var42, 10, EmbedMedia.$serializer.INSTANCE, var14) as EmbedMedia;
                                       var2 |= 1024;
                                       var53 = var9;
                                       var7 = var20;
                                       var9 = var18;
                                       var75 = var17;
                                       var77 = var67;
                                       var79 = var88;
                                       var13 = var14;
                                       var14 = var53;
                                       var88 = var77;
                                       var92 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var7;
                                       var20 = var92;
                                       break label130;
                                    case 11:
                                       var67 = (Integer)var19;
                                       var88 = var43.v(var42, 11, var44[11], var88) as java.util.List;
                                       var2 |= 2048;
                                       var13 = var14;
                                       var53 = var9;
                                       var7 = var20;
                                       var9 = var18;
                                       var75 = var17;
                                       var77 = var67;
                                       var79 = var88;
                                       var14 = var53;
                                       var88 = var77;
                                       var92 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var7;
                                       var20 = var92;
                                       break label130;
                                    case 12:
                                       var21 = var43.v(var42, 12, EmbedMedia.$serializer.INSTANCE, var21) as EmbedMedia;
                                       var2 |= 4096;
                                       var35 = var67;
                                       break label132;
                                    case 13:
                                       var35 = var43.v(var42, 13, EmbedThumbnail.$serializer.INSTANCE, var67) as EmbedThumbnail;
                                       var2 |= 8192;
                                       break label132;
                                    case 14:
                                       val var285: java.lang.String = var43.v(var42, 14, b2.a, var17) as java.lang.String;
                                       var2 |= 16384;
                                       var13 = var14;
                                       var79 = var88;
                                       var77 = var67;
                                       var53 = var9;
                                       var7 = var20;
                                       var67 = (Integer)var19;
                                       var9 = var18;
                                       var75 = var285;
                                       var14 = var53;
                                       var88 = var77;
                                       var92 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var7;
                                       var20 = var92;
                                       break label130;
                                    case 15:
                                       val var284: java.lang.String = var43.v(var42, 15, b2.a, var18) as java.lang.String;
                                       var2 |= 32768;
                                       var13 = var14;
                                       var79 = var88;
                                       var77 = var67;
                                       var75 = var17;
                                       var53 = var9;
                                       var7 = var20;
                                       var67 = (Integer)var19;
                                       var9 = var284;
                                       var14 = var53;
                                       var88 = var77;
                                       var92 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var7;
                                       var20 = var92;
                                       break label130;
                                    case 16:
                                       val var283: java.lang.String = var43.v(var42, 16, b2.a, var19) as java.lang.String;
                                       var2 |= 65536;
                                       var13 = var14;
                                       var79 = var88;
                                       var77 = var67;
                                       var75 = var17;
                                       var53 = var9;
                                       var7 = var20;
                                       var67 = var283;
                                       var9 = var18;
                                       var14 = var53;
                                       var88 = var77;
                                       var92 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var7;
                                       var20 = var92;
                                       break label130;
                                    case 17:
                                       var9 = var43.v(var42, 17, fl.h.a, var9) as java.lang.Boolean;
                                       var2 |= 131072;
                                       var13 = var14;
                                       var79 = var88;
                                       var77 = var67;
                                       var75 = var17;
                                       var67 = (Integer)var19;
                                       var53 = var9;
                                       var7 = var20;
                                       var9 = var18;
                                       var14 = var53;
                                       var88 = var77;
                                       var92 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var7;
                                       var20 = var92;
                                       break label130;
                                    case 18:
                                       val var281: EmbedFooter = var43.v(var42, 18, EmbedFooter.$serializer.INSTANCE, var20) as EmbedFooter;
                                       var2 |= 262144;
                                       var13 = var14;
                                       var79 = var88;
                                       var77 = var67;
                                       var75 = var17;
                                       var67 = (Integer)var19;
                                       var53 = var9;
                                       var7 = var281;
                                       var9 = var18;
                                       var14 = var53;
                                       var88 = var77;
                                       var92 = var75;
                                       var17 = var79;
                                       var18 = var13;
                                       var19 = var7;
                                       var20 = var92;
                                       break label130;
                                    case 19:
                                       var32 = var43.v(var42, 19, b2.a, var32) as java.lang.String;
                                       var2 |= 524288;
                                       break label131;
                                    case 20:
                                       var33 = var43.v(var42, 20, b2.a, var33) as java.lang.String;
                                       var2 |= 1048576;
                                       break label131;
                                    case 21:
                                       var30 = var43.v(var42, 21, b2.a, var30) as java.lang.String;
                                       var2 |= 2097152;
                                       break label131;
                                    case 22:
                                       var24 = var43.v(var42, 22, b2.a, var24) as java.lang.String;
                                       var2 |= 4194304;
                                       break label131;
                                    case 23:
                                       var28 = var43.v(var42, 23, EmbedFailureState.Serializer.INSTANCE, var28) as EmbedFailureState;
                                       var2 |= 8388608;
                                       break label131;
                                    case 24:
                                       var144 = var43.v(var42, 24, n0.a, var144) as Int;
                                       var2 |= 16777216;
                                       break label131;
                                    case 25:
                                       var47 = var43.v(var42, 25, n0.a, var47) as Int;
                                       var5 = 33554432;
                                       break;
                                    case 26:
                                       var150 = var43.v(var42, 26, n0.a, var150) as Int;
                                       var2 |= 67108864;
                                       break label131;
                                    case 27:
                                       var3 = var43.k(var42, 27);
                                       var5 = 134217728;
                                       break;
                                    case 28:
                                       var29 = var43.v(var42, 28, n0.a, var29) as Int;
                                       var2 |= 268435456;
                                       break label131;
                                    case 29:
                                       var27 = var43.v(var42, 29, b2.a, var27) as java.lang.String;
                                       var2 |= 536870912;
                                       break label131;
                                    case 30:
                                       var26 = var43.v(var42, 30, b2.a, var26) as java.lang.String;
                                       var2 |= 1073741824;
                                       break label131;
                                    default:
                                       throw new n(var5);
                                 }

                                 var2 |= var5;
                                 break label131;
                              }

                              var92 = var75;
                              var13 = var14;
                              var79 = var88;
                              var77 = var67;
                              var75 = var17;
                              var67 = (Integer)var19;
                              var7 = var20;
                              var53 = var9;
                              var9 = var18;
                              var14 = var53;
                              var88 = var77;
                              var17 = var79;
                              var18 = var13;
                              var19 = var7;
                              var20 = var92;
                              break label130;
                           }

                           var92 = var75;
                           var13 = var14;
                           var79 = var88;
                           var77 = var67;
                           var75 = var17;
                           var67 = (Integer)var19;
                           var7 = var20;
                           var53 = var9;
                           var9 = var18;
                           var14 = var35;
                           var88 = var77;
                           var17 = var79;
                           var18 = var13;
                           var19 = var7;
                           var20 = var92;
                           break label130;
                        }

                        var67 = (Integer)var19;
                        var7 = var20;
                        var53 = var9;
                        var9 = var18;
                        var75 = var17;
                        var77 = var67;
                        var79 = var88;
                        var13 = var14;
                        var14 = var53;
                        var88 = var77;
                        var92 = var75;
                        var17 = var79;
                        var18 = var13;
                        var19 = var35;
                        var20 = var92;
                        break label130;
                     }

                     var67 = (Integer)var19;
                     var13 = var14;
                     var79 = var88;
                     var53 = var9;
                     var7 = var20;
                     var9 = var18;
                     var75 = var17;
                     var77 = var35;
                     var14 = var53;
                     var88 = var77;
                     var92 = var75;
                     var17 = var79;
                     var18 = var13;
                     var19 = var7;
                     var20 = var92;
                     break label130;
                  }

                  var13 = var14;
                  var20 = var92;
                  var19 = var7;
                  var18 = var13;
                  var17 = var79;
                  var92 = var75;
                  var88 = var77;
                  var14 = var53;
                  var79 = var88;
                  var77 = var67;
                  var75 = var17;
                  var9 = var18;
                  var67 = (Integer)var19;
                  var7 = var20;
                  var53 = var9;
               }

               var67 = (Integer)var77;
               var77 = var88;
               var75 = var92;
               var79 = var17;
               var13 = var18;
               var7 = var19;
               var92 = var20;
               var20 = var7;
               var9 = var53;
               var53 = var14;
               var14 = var13;
               var88 = var79;
               var17 = var75;
               var18 = var9;
               var19 = var67;
            }

            var37 = (java.lang.String)var27;
            var193 = var26;
            var144 = var9;
            var20 = var67;
            var27 = var13;
            var67 = var47;
            var24 = (Integer)var144;
            var39 = var28;
            var13 = var24;
            var7 = var33;
            var9 = var20;
            var14 = var19;
            var38 = var18;
            var92 = var17;
            var35 = var21;
            var19 = var88;
            var88 = var14;
            var18 = var92;
            var17 = var7;
            var26 = var79;
            var21 = var75;
            var33 = var77;
            var28 = var53;
         }

         var43.b(var42);
         return new Embed(
            var2,
            (EmbedType)var34,
            (java.lang.String)var23,
            (EmbedAuthor)var28,
            (EmbedProvider)var33,
            (java.lang.String)var21,
            (StructurableText)var26,
            (java.util.List)var27,
            (java.lang.String)var22,
            (java.lang.String)var17,
            (StructurableText)var18,
            (EmbedMedia)var88,
            (java.util.List)var19,
            (EmbedMedia)var35,
            (EmbedThumbnail)var20,
            (java.lang.String)var92,
            (java.lang.String)var38,
            (java.lang.String)var14,
            (java.lang.Boolean)var144,
            (EmbedFooter)var9,
            (java.lang.String)var32,
            (java.lang.String)var7,
            (java.lang.String)var30,
            (java.lang.String)var13,
            (EmbedFailureState)var39,
            var24,
            var67,
            var150,
            var3,
            var29,
            var37,
            (java.lang.String)var193,
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
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
