package com.discord.chat.bridge.embed

import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.b2
import xk.g0
import xk.n0

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
      val var20: EmbedType = this.type;
      val var2: java.lang.String = this.id;
      val var12: EmbedAuthor = this.author;
      val var10: EmbedProvider = this.provider;
      val var16: java.lang.String = this.rawTitle;
      val var15: StructurableText = this.title;
      val var9: java.util.List = this.fields;
      val var23: java.lang.String = this.url;
      val var11: java.lang.String = this.rawDescription;
      val var8: StructurableText = this.description;
      val var5: EmbedMedia = this.image;
      val var17: java.util.List = this.images;
      val var7: EmbedMedia = this.video;
      val var18: EmbedThumbnail = this.thumbnail;
      val var30: java.lang.String = this.numAttachments;
      val var24: java.lang.String = this.attachmentsSize;
      val var29: java.lang.String = this.messageSendError;
      val var21: java.lang.Boolean = this.disableBackgroundColor;
      val var14: EmbedFooter = this.footer;
      val var6: java.lang.String = this.spoiler;
      val var19: java.lang.String = this.obscure;
      val var26: java.lang.String = this.obscureAwaitingScan;
      val var27: java.lang.String = this.iconURL;
      val var3: EmbedFailureState = this.failureState;
      val var25: Int = this.providerColor;
      val var4: Int = this.borderLeftColor;
      val var13: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var28: Int = this.backgroundColor;
      val var22: StringBuilder = new StringBuilder();
      var22.append("Embed(type=");
      var22.append(var20);
      var22.append(", id=");
      var22.append(var2);
      var22.append(", author=");
      var22.append(var12);
      var22.append(", provider=");
      var22.append(var10);
      var22.append(", rawTitle=");
      var22.append(var16);
      var22.append(", title=");
      var22.append(var15);
      var22.append(", fields=");
      var22.append(var9);
      var22.append(", url=");
      var22.append(var23);
      var22.append(", rawDescription=");
      var22.append(var11);
      var22.append(", description=");
      var22.append(var8);
      var22.append(", image=");
      var22.append(var5);
      var22.append(", images=");
      var22.append(var17);
      var22.append(", video=");
      var22.append(var7);
      var22.append(", thumbnail=");
      var22.append(var18);
      var22.append(", numAttachments=");
      var22.append(var30);
      var22.append(", attachmentsSize=");
      var22.append(var24);
      var22.append(", messageSendError=");
      var22.append(var29);
      var22.append(", disableBackgroundColor=");
      var22.append(var21);
      var22.append(", footer=");
      var22.append(var14);
      var22.append(", spoiler=");
      var22.append(var6);
      var22.append(", obscure=");
      var22.append(var19);
      var22.append(", obscureAwaitingScan=");
      var22.append(var26);
      var22.append(", iconURL=");
      var22.append(var27);
      var22.append(", failureState=");
      var22.append(var3);
      var22.append(", providerColor=");
      var22.append(var25);
      var22.append(", borderLeftColor=");
      var22.append(var4);
      var22.append(", headerTextColor=");
      var22.append(var13);
      var22.append(", bodyTextColor=");
      var22.append(var1);
      var22.append(", backgroundColor=");
      var22.append(var28);
      var22.append(")");
      return var22.toString();
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
         val var1: KSerializer = var13[0];
         val var6: b2 = b2.a;
         val var2: KSerializer = a.u(b2.a);
         val var10: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var9: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var3: KSerializer = a.u(var6);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var4: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var8: KSerializer = a.u(var13[6]);
         val var5: KSerializer = a.u(var6);
         val var7: KSerializer = a.u(var6);
         val var27: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var12: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var28: KSerializer = a.u(var13[11]);
         val var22: KSerializer = a.u(var14);
         val var20: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var17: KSerializer = a.u(var6);
         val var21: KSerializer = a.u(var6);
         val var23: KSerializer = a.u(var6);
         val var25: KSerializer = a.u(xk.h.a);
         val var29: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var24: KSerializer = a.u(var6);
         val var18: KSerializer = a.u(var6);
         val var19: KSerializer = a.u(var6);
         val var16: KSerializer = a.u(var6);
         val var15: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var26: n0 = n0.a;
         return new KSerializer[]{
            var1,
            var2,
            var10,
            var9,
            var3,
            var4,
            var8,
            var5,
            var7,
            var27,
            var12,
            var28,
            var22,
            var20,
            var17,
            var21,
            var23,
            var25,
            var29,
            var24,
            var18,
            var19,
            var16,
            var15,
            a.u(n0.a),
            a.u(var26),
            a.u(var26),
            var26,
            a.u(var26),
            a.u(var6),
            a.u(var6)
         };
      }

      public open fun deserialize(decoder: Decoder): Embed {
         q.h(var1, "decoder");
         val var43: SerialDescriptor = this.getDescriptor();
         val var44: c = var1.c(var43);
         val var42: Array<KSerializer> = Embed.access$get$childSerializers$cp();
         var var3: Int;
         val var4: Int;
         var var8: Any;
         var var9: Any;
         var var13: Any;
         var var16: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var23: Any;
         var var25: Any;
         var var26: Int;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var31: Int;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         val var36: Int;
         val var37: Any;
         val var38: Any;
         val var39: Any;
         val var40: Any;
         var var59: Int;
         var var90: Any;
         var var102: Any;
         var var143: Any;
         var var145: java.lang.String;
         var var153: Any;
         if (var44.y()) {
            var34 = var44.m(var43, 0, var42[0], null) as EmbedType;
            val var45: b2 = b2.a;
            var23 = var44.v(var43, 1, b2.a, null) as java.lang.String;
            var16 = var44.v(var43, 2, EmbedAuthor.$serializer.INSTANCE, null) as EmbedAuthor;
            var102 = var44.v(var43, 3, EmbedProvider.$serializer.INSTANCE, null) as EmbedProvider;
            var18 = var44.v(var43, 4, var45, null) as java.lang.String;
            val var6: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
            var143 = var44.v(var43, 5, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var20 = var44.v(var43, 6, var42[6], null) as java.util.List;
            var21 = var44.v(var43, 7, var45, null) as java.lang.String;
            val var11: java.lang.String = var44.v(var43, 8, var45, null) as java.lang.String;
            var90 = var44.v(var43, 9, var6, null) as StructurableText;
            val var53: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
            var153 = var44.v(var43, 10, EmbedMedia.$serializer.INSTANCE, null) as EmbedMedia;
            var39 = var44.v(var43, 11, var42[11], null) as java.util.List;
            var28 = var44.v(var43, 12, var53, null) as EmbedMedia;
            var27 = var44.v(var43, 13, EmbedThumbnail.$serializer.INSTANCE, null) as EmbedThumbnail;
            val var10: java.lang.String = var44.v(var43, 14, var45, null) as java.lang.String;
            var19 = var44.v(var43, 15, var45, null) as java.lang.String;
            val var14: java.lang.String = var44.v(var43, 16, var45, null) as java.lang.String;
            val var12: java.lang.Boolean = var44.v(var43, 17, xk.h.a, null) as java.lang.Boolean;
            var9 = var44.v(var43, 18, EmbedFooter.$serializer.INSTANCE, null) as EmbedFooter;
            var32 = var44.v(var43, 19, var45, null) as java.lang.String;
            val var7: java.lang.String = var44.v(var43, 20, var45, null) as java.lang.String;
            var8 = var44.v(var43, 21, var45, null) as java.lang.String;
            var13 = var44.v(var43, 22, var45, null) as java.lang.String;
            var37 = var44.v(var43, 23, EmbedFailureState.Serializer.INSTANCE, null) as EmbedFailureState;
            val var54: n0 = n0.a;
            val var24: Int = var44.v(var43, 24, n0.a, null) as Int;
            var31 = var44.v(var43, 25, var54, null) as Int;
            var36 = var44.v(var43, 26, var54, null) as Int;
            val var2: Int = var44.k(var43, 27);
            var26 = var44.v(var43, 28, var54, null) as Int;
            val var55: java.lang.String = var44.v(var43, 29, var45, null) as java.lang.String;
            val var46: java.lang.String = var44.v(var43, 30, var45, null) as java.lang.String;
            var3 = Integer.MAX_VALUE;
            var40 = var102;
            var102 = var143;
            var25 = var11;
            var29 = var90;
            var143 = var153;
            var153 = var10;
            var90 = var14;
            var38 = var12;
            var33 = var7;
            var59 = var24;
            var4 = var2;
            var145 = var55;
            var35 = var46;
         } else {
            var27 = null;
            var var51: Boolean = true;
            var var47: Int = null;
            var20 = null;
            var33 = null;
            var32 = null;
            var31 = null;
            var153 = null;
            var29 = null;
            var28 = null;
            var26 = null;
            var25 = null;
            var145 = null;
            var34 = null;
            var23 = null;
            var var56: Any = null;
            var var79: Any = null;
            var var77: Any = null;
            var var81: Any = null;
            var13 = null;
            var143 = null;
            var59 = null;
            var16 = null;
            var var85: Any = null;
            var90 = null;
            var21 = null;
            var8 = null;
            var102 = null;
            var18 = null;
            var19 = null;
            var var49: Int = 0;
            var3 = 0;
            var9 = null;

            while (var51) {
               label130: {
                  label131: {
                     label132: {
                        label88: {
                           label87: {
                              label86: {
                                 var var5: Int = var44.x(var43);
                                 switch (var5) {
                                    case -1:
                                       var51 = false;
                                       break label86;
                                    case 0:
                                       var34 = var44.m(var43, 0, var42[0], var34) as EmbedType;
                                       var49 |= 1;
                                       break label86;
                                    case 1:
                                       var23 = var44.v(var43, 1, b2.a, var23) as java.lang.String;
                                       var49 |= 2;
                                       var35 = var56;
                                       break label87;
                                    case 2:
                                       var35 = var44.v(var43, 2, EmbedAuthor.$serializer.INSTANCE, var56) as EmbedAuthor;
                                       var49 |= 4;
                                       break label87;
                                    case 3:
                                       var13 = var85;
                                       var81 = var90;
                                       var8 = var19;
                                       var16 = var77;
                                       var90 = var44.v(var43, 3, EmbedProvider.$serializer.INSTANCE, var79) as EmbedProvider;
                                       var49 |= 8;
                                       var56 = var9;
                                       var59 = (Integer)var20;
                                       var9 = var18;
                                       var77 = var102;
                                       var79 = var8;
                                       var85 = var56;
                                       var102 = var81;
                                       var18 = var13;
                                       var19 = var59;
                                       var20 = var16;
                                       break label130;
                                    case 4:
                                       var20 = var16;
                                       var13 = var85;
                                       var8 = var19;
                                       var102 = var81;
                                       val var112: java.lang.String = var44.v(var43, 4, b2.a, var77) as java.lang.String;
                                       var49 |= 16;
                                       var56 = var9;
                                       var59 = (Integer)var20;
                                       var9 = var18;
                                       var77 = var102;
                                       var79 = var8;
                                       var81 = var90;
                                       var85 = var56;
                                       var90 = var79;
                                       var16 = var112;
                                       var18 = var13;
                                       var19 = var59;
                                       break label130;
                                    case 5:
                                       var8 = var19;
                                       var18 = var13;
                                       var19 = var44.v(var43, 5, StructurableTextSerializer.INSTANCE, var81) as StructurableText;
                                       var49 |= 32;
                                       var56 = var9;
                                       var59 = (Integer)var20;
                                       var9 = var18;
                                       var77 = var102;
                                       var79 = var8;
                                       var81 = var90;
                                       var13 = var85;
                                       var85 = var56;
                                       var90 = var79;
                                       var16 = var77;
                                       var102 = var19;
                                       var19 = var59;
                                       var20 = var16;
                                       break label130;
                                    case 6:
                                       var20 = var16;
                                       var8 = var19;
                                       var18 = var44.v(var43, 6, var42[6], var13) as java.util.List;
                                       var49 |= 64;
                                       var56 = var9;
                                       var59 = (Integer)var20;
                                       var9 = var18;
                                       var77 = var102;
                                       var79 = var8;
                                       var81 = var90;
                                       var13 = var85;
                                       var85 = var56;
                                       var90 = var79;
                                       var16 = var77;
                                       var102 = var81;
                                       var19 = var59;
                                       break label130;
                                    case 7:
                                       var143 = var44.v(var43, 7, b2.a, var143) as java.lang.String;
                                       var49 |= 128;
                                       var35 = var59;
                                       break label88;
                                    case 8:
                                       var35 = var44.v(var43, 8, b2.a, var59) as java.lang.String;
                                       var49 |= 256;
                                       break label88;
                                    case 9:
                                       var8 = var19;
                                       var20 = var44.v(var43, 9, StructurableTextSerializer.INSTANCE, var16) as StructurableText;
                                       var49 |= 512;
                                       var16 = var77;
                                       var56 = var9;
                                       var59 = (Integer)var20;
                                       var9 = var18;
                                       var77 = var102;
                                       var79 = var8;
                                       var81 = var90;
                                       var13 = var85;
                                       var85 = var56;
                                       var90 = var79;
                                       var102 = var81;
                                       var18 = var13;
                                       var19 = var59;
                                       break label130;
                                    case 10:
                                       var8 = var19;
                                       var85 = var44.v(var43, 10, EmbedMedia.$serializer.INSTANCE, var85) as EmbedMedia;
                                       var49 |= 1024;
                                       var19 = var59;
                                       var56 = var9;
                                       var59 = (Integer)var20;
                                       var9 = var18;
                                       var77 = var102;
                                       var79 = var8;
                                       var81 = var90;
                                       var13 = var85;
                                       var85 = var56;
                                       var90 = var79;
                                       var16 = var77;
                                       var102 = var81;
                                       var18 = var13;
                                       var20 = var16;
                                       break label130;
                                    case 11:
                                       var8 = var19;
                                       var90 = var44.v(var43, 11, var42[11], var90) as java.util.List;
                                       var49 |= 2048;
                                       var13 = var85;
                                       var56 = var9;
                                       var59 = (Integer)var20;
                                       var9 = var18;
                                       var77 = var102;
                                       var79 = var8;
                                       var81 = var90;
                                       var85 = var56;
                                       var90 = var79;
                                       var16 = var77;
                                       var102 = var81;
                                       var18 = var13;
                                       var19 = var59;
                                       var20 = var16;
                                       break label130;
                                    case 12:
                                       var21 = var44.v(var43, 12, EmbedMedia.$serializer.INSTANCE, var21) as EmbedMedia;
                                       var49 |= 4096;
                                       var35 = var8;
                                       break label132;
                                    case 13:
                                       var35 = var44.v(var43, 13, EmbedThumbnail.$serializer.INSTANCE, var8) as EmbedThumbnail;
                                       var49 |= 8192;
                                       break label132;
                                    case 14:
                                       val var290: java.lang.String = var44.v(var43, 14, b2.a, var102) as java.lang.String;
                                       var49 |= 16384;
                                       var102 = var81;
                                       var13 = var85;
                                       var81 = var90;
                                       var79 = var8;
                                       var56 = var9;
                                       var59 = (Integer)var20;
                                       var8 = var19;
                                       var9 = var18;
                                       var77 = var290;
                                       var85 = var56;
                                       var90 = var79;
                                       var16 = var77;
                                       var18 = var13;
                                       var19 = var59;
                                       var20 = var16;
                                       break label130;
                                    case 15:
                                       val var289: java.lang.String = var44.v(var43, 15, b2.a, var18) as java.lang.String;
                                       var49 |= 32768;
                                       var13 = var85;
                                       var81 = var90;
                                       var79 = var8;
                                       var77 = var102;
                                       var56 = var9;
                                       var59 = (Integer)var20;
                                       var8 = var19;
                                       var9 = var289;
                                       var85 = var56;
                                       var90 = var79;
                                       var16 = var77;
                                       var102 = var81;
                                       var18 = var13;
                                       var19 = var59;
                                       var20 = var16;
                                       break label130;
                                    case 16:
                                       val var288: java.lang.String = var44.v(var43, 16, b2.a, var19) as java.lang.String;
                                       var49 |= 65536;
                                       var13 = var85;
                                       var81 = var90;
                                       var79 = var8;
                                       var77 = var102;
                                       var56 = var9;
                                       var59 = (Integer)var20;
                                       var8 = var288;
                                       var9 = var18;
                                       var85 = var56;
                                       var90 = var79;
                                       var16 = var77;
                                       var102 = var81;
                                       var18 = var13;
                                       var19 = var59;
                                       var20 = var16;
                                       break label130;
                                    case 17:
                                       var9 = var44.v(var43, 17, xk.h.a, var9) as java.lang.Boolean;
                                       var49 |= 131072;
                                       var13 = var85;
                                       var81 = var90;
                                       var79 = var8;
                                       var77 = var102;
                                       var8 = var19;
                                       var56 = var9;
                                       var59 = (Integer)var20;
                                       var9 = var18;
                                       var85 = var56;
                                       var90 = var79;
                                       var16 = var77;
                                       var102 = var81;
                                       var18 = var13;
                                       var19 = var59;
                                       var20 = var16;
                                       break label130;
                                    case 18:
                                       val var286: EmbedFooter = var44.v(var43, 18, EmbedFooter.$serializer.INSTANCE, var20) as EmbedFooter;
                                       var49 |= 262144;
                                       var13 = var85;
                                       var81 = var90;
                                       var79 = var8;
                                       var77 = var102;
                                       var8 = var19;
                                       var56 = var9;
                                       var59 = var286;
                                       var9 = var18;
                                       var85 = var56;
                                       var90 = var79;
                                       var16 = var77;
                                       var102 = var81;
                                       var18 = var13;
                                       var19 = var59;
                                       var20 = var16;
                                       break label130;
                                    case 19:
                                       var32 = var44.v(var43, 19, b2.a, var32) as java.lang.String;
                                       var49 |= 524288;
                                       break label131;
                                    case 20:
                                       var33 = var44.v(var43, 20, b2.a, var33) as java.lang.String;
                                       var49 |= 1048576;
                                       break label131;
                                    case 21:
                                       var153 = var44.v(var43, 21, b2.a, var153) as java.lang.String;
                                       var49 |= 2097152;
                                       break label131;
                                    case 22:
                                       var145 = var44.v(var43, 22, b2.a, var145) as java.lang.String;
                                       var49 |= 4194304;
                                       break label131;
                                    case 23:
                                       var28 = var44.v(var43, 23, EmbedFailureState.Serializer.INSTANCE, var28) as EmbedFailureState;
                                       var49 |= 8388608;
                                       break label131;
                                    case 24:
                                       var25 = var44.v(var43, 24, n0.a, var25) as Int;
                                       var49 |= 16777216;
                                       break label131;
                                    case 25:
                                       var47 = var44.v(var43, 25, n0.a, var47) as Int;
                                       var5 = 33554432;
                                       break;
                                    case 26:
                                       var31 = var44.v(var43, 26, n0.a, var31) as Int;
                                       var49 |= 67108864;
                                       break label131;
                                    case 27:
                                       var3 = var44.k(var43, 27);
                                       var5 = 134217728;
                                       break;
                                    case 28:
                                       var29 = var44.v(var43, 28, n0.a, var29) as Int;
                                       var49 |= 268435456;
                                       break label131;
                                    case 29:
                                       var27 = var44.v(var43, 29, b2.a, var27) as java.lang.String;
                                       var49 |= 536870912;
                                       break label131;
                                    case 30:
                                       var26 = var44.v(var43, 30, b2.a, var26) as java.lang.String;
                                       var49 |= 1073741824;
                                       break label131;
                                    default:
                                       throw new n(var5);
                                 }

                                 var49 |= var5;
                                 break label131;
                              }

                              var16 = var77;
                              var13 = var85;
                              var81 = var90;
                              var79 = var8;
                              var77 = var102;
                              var8 = var19;
                              var59 = (Integer)var20;
                              var56 = var9;
                              var9 = var18;
                              var85 = var56;
                              var90 = var79;
                              var102 = var81;
                              var18 = var13;
                              var19 = var59;
                              var20 = var16;
                              break label130;
                           }

                           var16 = var77;
                           var13 = var85;
                           var81 = var90;
                           var79 = var8;
                           var77 = var102;
                           var8 = var19;
                           var59 = (Integer)var20;
                           var56 = var9;
                           var9 = var18;
                           var85 = var35;
                           var90 = var79;
                           var102 = var81;
                           var18 = var13;
                           var19 = var59;
                           var20 = var16;
                           break label130;
                        }

                        var8 = var19;
                        var59 = (Integer)var20;
                        var56 = var9;
                        var9 = var18;
                        var77 = var102;
                        var79 = var8;
                        var81 = var90;
                        var13 = var85;
                        var85 = var56;
                        var90 = var79;
                        var16 = var77;
                        var102 = var81;
                        var18 = var13;
                        var19 = var35;
                        var20 = var16;
                        break label130;
                     }

                     var8 = var19;
                     var13 = var85;
                     var81 = var90;
                     var56 = var9;
                     var59 = (Integer)var20;
                     var9 = var18;
                     var77 = var102;
                     var79 = var35;
                     var85 = var56;
                     var90 = var79;
                     var16 = var77;
                     var102 = var81;
                     var18 = var13;
                     var19 = var59;
                     var20 = var16;
                     break label130;
                  }

                  var13 = var85;
                  var81 = var90;
                  var8 = var19;
                  var20 = var16;
                  var19 = var59;
                  var18 = var13;
                  var102 = var81;
                  var16 = var77;
                  var90 = var79;
                  var85 = var56;
                  var79 = var8;
                  var77 = var102;
                  var9 = var18;
                  var59 = (Integer)var20;
                  var56 = var9;
               }

               var8 = var79;
               var79 = var90;
               var77 = var16;
               var81 = var102;
               var13 = var18;
               var59 = (Integer)var19;
               var16 = var20;
               var20 = var59;
               var9 = var56;
               var56 = var85;
               var85 = var13;
               var90 = var81;
               var102 = var77;
               var18 = var9;
               var19 = var8;
            }

            var38 = var9;
            var27 = var8;
            var20 = var13;
            var35 = var26;
            var145 = (java.lang.String)var27;
            var26 = (Integer)var29;
            var4 = var3;
            var36 = var31;
            var31 = var47;
            var59 = (Integer)var25;
            var37 = var28;
            var13 = var145;
            var8 = var153;
            var9 = var20;
            var90 = var19;
            var19 = var18;
            var153 = var102;
            var28 = var21;
            var39 = var90;
            var143 = var85;
            var29 = var16;
            var25 = var59;
            var21 = var143;
            var102 = var81;
            var18 = var77;
            var40 = var79;
            var16 = var56;
            var3 = var49;
         }

         var44.b(var43);
         return new Embed(
            var3,
            (EmbedType)var34,
            (java.lang.String)var23,
            (EmbedAuthor)var16,
            (EmbedProvider)var40,
            (java.lang.String)var18,
            (StructurableText)var102,
            (java.util.List)var20,
            (java.lang.String)var21,
            (java.lang.String)var25,
            (StructurableText)var29,
            (EmbedMedia)var143,
            (java.util.List)var39,
            (EmbedMedia)var28,
            (EmbedThumbnail)var27,
            (java.lang.String)var153,
            (java.lang.String)var19,
            (java.lang.String)var90,
            (java.lang.Boolean)var38,
            (EmbedFooter)var9,
            (java.lang.String)var32,
            (java.lang.String)var33,
            (java.lang.String)var8,
            (java.lang.String)var13,
            (EmbedFailureState)var37,
            var59,
            var31,
            var36,
            var4,
            var26,
            var145,
            (java.lang.String)var35,
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
         return xk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
