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
import vk.f
import vk.n
import wk.a
import yk.b2
import yk.g0
import yk.n0

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
      val var13: EmbedType = this.type;
      val var12: java.lang.String = this.id;
      val var27: EmbedAuthor = this.author;
      val var23: EmbedProvider = this.provider;
      val var15: java.lang.String = this.rawTitle;
      val var2: StructurableText = this.title;
      val var29: java.util.List = this.fields;
      val var10: java.lang.String = this.url;
      val var19: java.lang.String = this.rawDescription;
      val var4: StructurableText = this.description;
      val var11: EmbedMedia = this.image;
      val var6: java.util.List = this.images;
      val var17: EmbedMedia = this.video;
      val var8: EmbedThumbnail = this.thumbnail;
      val var22: java.lang.String = this.numAttachments;
      val var18: java.lang.String = this.attachmentsSize;
      val var24: java.lang.String = this.messageSendError;
      val var16: java.lang.Boolean = this.disableBackgroundColor;
      val var21: EmbedFooter = this.footer;
      val var5: java.lang.String = this.spoiler;
      val var30: java.lang.String = this.obscure;
      val var26: java.lang.String = this.obscureAwaitingScan;
      val var28: java.lang.String = this.iconURL;
      val var20: EmbedFailureState = this.failureState;
      val var14: Int = this.providerColor;
      val var25: Int = this.borderLeftColor;
      val var9: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var7: Int = this.backgroundColor;
      val var3: StringBuilder = new StringBuilder();
      var3.append("Embed(type=");
      var3.append(var13);
      var3.append(", id=");
      var3.append(var12);
      var3.append(", author=");
      var3.append(var27);
      var3.append(", provider=");
      var3.append(var23);
      var3.append(", rawTitle=");
      var3.append(var15);
      var3.append(", title=");
      var3.append(var2);
      var3.append(", fields=");
      var3.append(var29);
      var3.append(", url=");
      var3.append(var10);
      var3.append(", rawDescription=");
      var3.append(var19);
      var3.append(", description=");
      var3.append(var4);
      var3.append(", image=");
      var3.append(var11);
      var3.append(", images=");
      var3.append(var6);
      var3.append(", video=");
      var3.append(var17);
      var3.append(", thumbnail=");
      var3.append(var8);
      var3.append(", numAttachments=");
      var3.append(var22);
      var3.append(", attachmentsSize=");
      var3.append(var18);
      var3.append(", messageSendError=");
      var3.append(var24);
      var3.append(", disableBackgroundColor=");
      var3.append(var16);
      var3.append(", footer=");
      var3.append(var21);
      var3.append(", spoiler=");
      var3.append(var5);
      var3.append(", obscure=");
      var3.append(var30);
      var3.append(", obscureAwaitingScan=");
      var3.append(var26);
      var3.append(", iconURL=");
      var3.append(var28);
      var3.append(", failureState=");
      var3.append(var20);
      var3.append(", providerColor=");
      var3.append(var14);
      var3.append(", borderLeftColor=");
      var3.append(var25);
      var3.append(", headerTextColor=");
      var3.append(var9);
      var3.append(", bodyTextColor=");
      var3.append(var1);
      var3.append(", backgroundColor=");
      var3.append(var7);
      var3.append(")");
      return var3.toString();
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
         val var5: KSerializer = var13[0];
         val var1: b2 = b2.a;
         val var7: KSerializer = a.u(b2.a);
         val var10: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var9: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var6: KSerializer = a.u(var1);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var2: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var4: KSerializer = a.u(var13[6]);
         val var3: KSerializer = a.u(var1);
         val var8: KSerializer = a.u(var1);
         val var12: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var27: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var28: KSerializer = a.u(var13[11]);
         val var23: KSerializer = a.u(var14);
         val var19: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var24: KSerializer = a.u(var1);
         val var26: KSerializer = a.u(var1);
         val var29: KSerializer = a.u(var1);
         val var18: KSerializer = a.u(yk.h.a);
         val var21: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var17: KSerializer = a.u(var1);
         val var16: KSerializer = a.u(var1);
         val var22: KSerializer = a.u(var1);
         val var15: KSerializer = a.u(var1);
         val var25: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var20: n0 = n0.a;
         return new KSerializer[]{
            var5,
            var7,
            var10,
            var9,
            var6,
            var2,
            var4,
            var3,
            var8,
            var12,
            var27,
            var28,
            var23,
            var19,
            var24,
            var26,
            var29,
            var18,
            var21,
            var17,
            var16,
            var22,
            var15,
            var25,
            a.u(n0.a),
            a.u(var20),
            a.u(var20),
            var20,
            a.u(var20),
            a.u(var1),
            a.u(var1)
         };
      }

      public open fun deserialize(decoder: Decoder): Embed {
         q.h(var1, "decoder");
         val var42: SerialDescriptor = this.getDescriptor();
         val var43: c = var1.c(var42);
         val var44: Array<KSerializer> = Embed.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var13: Any;
         var var16: Int;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: Any;
         var var23: Any;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         var var27: Any;
         var var28: Any;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         val var36: Any;
         val var37: Any;
         val var38: Any;
         val var39: Any;
         var var56: Int;
         var var68: Int;
         var var72: Int;
         var var84: Any;
         var var90: Any;
         var var101: Any;
         val var145: java.lang.String;
         var var148: Any;
         if (var43.y()) {
            var34 = var43.m(var42, 0, var44[0], null) as EmbedType;
            val var45: b2 = b2.a;
            var23 = var43.v(var42, 1, b2.a, null) as java.lang.String;
            var27 = var43.v(var42, 2, EmbedAuthor.$serializer.INSTANCE, null) as EmbedAuthor;
            var21 = var43.v(var42, 3, EmbedProvider.$serializer.INSTANCE, null) as EmbedProvider;
            var36 = var43.v(var42, 4, var45, null) as java.lang.String;
            val var6: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
            var22 = var43.v(var42, 5, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var26 = var43.v(var42, 6, var44[6], null) as java.util.List;
            var18 = var43.v(var42, 7, var45, null) as java.lang.String;
            val var12: java.lang.String = var43.v(var42, 8, var45, null) as java.lang.String;
            var84 = var43.v(var42, 9, var6, null) as StructurableText;
            val var50: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
            var37 = var43.v(var42, 10, EmbedMedia.$serializer.INSTANCE, null) as EmbedMedia;
            var101 = var43.v(var42, 11, var44[11], null) as java.util.List;
            var39 = var43.v(var42, 12, var50, null) as EmbedMedia;
            var20 = var43.v(var42, 13, EmbedThumbnail.$serializer.INSTANCE, null) as EmbedThumbnail;
            val var10: java.lang.String = var43.v(var42, 14, var45, null) as java.lang.String;
            var24 = var43.v(var42, 15, var45, null) as java.lang.String;
            var90 = var43.v(var42, 16, var45, null) as java.lang.String;
            val var11: java.lang.Boolean = var43.v(var42, 17, yk.h.a, null) as java.lang.Boolean;
            val var9: EmbedFooter = var43.v(var42, 18, EmbedFooter.$serializer.INSTANCE, null) as EmbedFooter;
            var32 = var43.v(var42, 19, var45, null) as java.lang.String;
            val var7: java.lang.String = var43.v(var42, 20, var45, null) as java.lang.String;
            val var8: java.lang.String = var43.v(var42, 21, var45, null) as java.lang.String;
            var13 = var43.v(var42, 22, var45, null) as java.lang.String;
            var28 = var43.v(var42, 23, EmbedFailureState.Serializer.INSTANCE, null) as EmbedFailureState;
            val var51: n0 = n0.a;
            val var29: Int = var43.v(var42, 24, n0.a, null) as Int;
            var148 = var43.v(var42, 25, var51, null) as Int;
            val var40: Int = var43.v(var42, 26, var51, null) as Int;
            var3 = var43.k(var42, 27);
            var16 = var43.v(var42, 28, var51, null) as Int;
            val var52: java.lang.String = var43.v(var42, 29, var45, null) as java.lang.String;
            val var46: java.lang.String = var43.v(var42, 30, var45, null) as java.lang.String;
            var2 = Integer.MAX_VALUE;
            var38 = var12;
            var25 = var84;
            var84 = var101;
            var101 = var10;
            var19 = var90;
            var90 = var11;
            var31 = var9;
            var33 = var7;
            var30 = var8;
            var72 = var29;
            var68 = (Integer)var148;
            var56 = var40;
            var145 = var52;
            var148 = var46;
         } else {
            var27 = null;
            var var4: Boolean = true;
            var var47: Int = null;
            var20 = null;
            var33 = null;
            var32 = null;
            var31 = null;
            var30 = null;
            var var146: Int = null;
            var28 = null;
            var26 = null;
            var25 = null;
            var24 = null;
            var34 = null;
            var23 = null;
            var var53: Any = null;
            var var78: Any = null;
            var var76: Any = null;
            var var80: Any = null;
            var13 = null;
            var22 = null;
            var56 = null;
            var16 = null;
            var84 = null;
            var90 = null;
            var21 = null;
            var68 = null;
            var101 = null;
            var18 = null;
            var19 = null;
            var2 = 0;
            var3 = 0;
            var72 = null;

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
                                       var148 = var53;
                                       break label87;
                                    case 2:
                                       var148 = var43.v(var42, 2, EmbedAuthor.$serializer.INSTANCE, var53) as EmbedAuthor;
                                       var2 |= 4;
                                       break label87;
                                    case 3:
                                       var13 = var84;
                                       var80 = var90;
                                       var68 = (Integer)var19;
                                       var16 = (Integer)var76;
                                       var90 = var43.v(var42, 3, EmbedProvider.$serializer.INSTANCE, var78) as EmbedProvider;
                                       var2 |= 8;
                                       var53 = var72;
                                       var56 = (Integer)var20;
                                       var72 = (Integer)var18;
                                       var76 = var101;
                                       var78 = var68;
                                       var84 = var53;
                                       var101 = var80;
                                       var18 = var13;
                                       var19 = var56;
                                       var20 = var16;
                                       break label130;
                                    case 4:
                                       var13 = var84;
                                       var68 = (Integer)var19;
                                       var101 = var80;
                                       val var108: java.lang.String = var43.v(var42, 4, b2.a, var76) as java.lang.String;
                                       var2 |= 16;
                                       var53 = var72;
                                       var56 = (Integer)var20;
                                       var72 = (Integer)var18;
                                       var76 = var101;
                                       var78 = var68;
                                       var80 = var90;
                                       var84 = var53;
                                       var90 = var78;
                                       var16 = var108;
                                       var18 = var13;
                                       var19 = var56;
                                       var20 = var16;
                                       break label130;
                                    case 5:
                                       var68 = (Integer)var19;
                                       var18 = var13;
                                       var19 = var43.v(var42, 5, StructurableTextSerializer.INSTANCE, var80) as StructurableText;
                                       var2 |= 32;
                                       var53 = var72;
                                       var56 = (Integer)var20;
                                       var72 = (Integer)var18;
                                       var76 = var101;
                                       var78 = var68;
                                       var80 = var90;
                                       var13 = var84;
                                       var84 = var53;
                                       var90 = var78;
                                       var16 = (Integer)var76;
                                       var101 = var19;
                                       var19 = var56;
                                       var20 = var16;
                                       break label130;
                                    case 6:
                                       var20 = var16;
                                       var68 = (Integer)var19;
                                       var18 = var43.v(var42, 6, var44[6], var13) as java.util.List;
                                       var2 |= 64;
                                       var53 = var72;
                                       var56 = (Integer)var20;
                                       var72 = (Integer)var18;
                                       var76 = var101;
                                       var78 = var68;
                                       var80 = var90;
                                       var13 = var84;
                                       var84 = var53;
                                       var90 = var78;
                                       var16 = (Integer)var76;
                                       var101 = var80;
                                       var19 = var56;
                                       break label130;
                                    case 7:
                                       var22 = var43.v(var42, 7, b2.a, var22) as java.lang.String;
                                       var2 |= 128;
                                       var148 = var56;
                                       break label88;
                                    case 8:
                                       var148 = var43.v(var42, 8, b2.a, var56) as java.lang.String;
                                       var2 |= 256;
                                       break label88;
                                    case 9:
                                       var68 = (Integer)var19;
                                       var20 = var43.v(var42, 9, StructurableTextSerializer.INSTANCE, var16) as StructurableText;
                                       var2 |= 512;
                                       var16 = (Integer)var76;
                                       var53 = var72;
                                       var56 = (Integer)var20;
                                       var72 = (Integer)var18;
                                       var76 = var101;
                                       var78 = var68;
                                       var80 = var90;
                                       var13 = var84;
                                       var84 = var53;
                                       var90 = var78;
                                       var101 = var80;
                                       var18 = var13;
                                       var19 = var56;
                                       break label130;
                                    case 10:
                                       var68 = (Integer)var19;
                                       var84 = var43.v(var42, 10, EmbedMedia.$serializer.INSTANCE, var84) as EmbedMedia;
                                       var2 |= 1024;
                                       var53 = var72;
                                       var56 = (Integer)var20;
                                       var72 = (Integer)var18;
                                       var76 = var101;
                                       var78 = var68;
                                       var80 = var90;
                                       var13 = var84;
                                       var84 = var53;
                                       var90 = var78;
                                       var16 = (Integer)var76;
                                       var101 = var80;
                                       var18 = var13;
                                       var19 = var56;
                                       var20 = var16;
                                       break label130;
                                    case 11:
                                       var68 = (Integer)var19;
                                       var90 = var43.v(var42, 11, var44[11], var90) as java.util.List;
                                       var2 |= 2048;
                                       var13 = var84;
                                       var53 = var72;
                                       var56 = (Integer)var20;
                                       var72 = (Integer)var18;
                                       var76 = var101;
                                       var78 = var68;
                                       var80 = var90;
                                       var84 = var53;
                                       var90 = var78;
                                       var16 = (Integer)var76;
                                       var101 = var80;
                                       var18 = var13;
                                       var19 = var56;
                                       var20 = var16;
                                       break label130;
                                    case 12:
                                       var21 = var43.v(var42, 12, EmbedMedia.$serializer.INSTANCE, var21) as EmbedMedia;
                                       var2 |= 4096;
                                       var148 = var68;
                                       break label132;
                                    case 13:
                                       var148 = var43.v(var42, 13, EmbedThumbnail.$serializer.INSTANCE, var68) as EmbedThumbnail;
                                       var2 |= 8192;
                                       break label132;
                                    case 14:
                                       val var284: java.lang.String = var43.v(var42, 14, b2.a, var101) as java.lang.String;
                                       var2 |= 16384;
                                       var13 = var84;
                                       var80 = var90;
                                       var78 = var68;
                                       var53 = var72;
                                       var56 = (Integer)var20;
                                       var68 = (Integer)var19;
                                       var72 = (Integer)var18;
                                       var76 = var284;
                                       var84 = var53;
                                       var90 = var78;
                                       var16 = (Integer)var76;
                                       var101 = var80;
                                       var18 = var13;
                                       var19 = var56;
                                       var20 = var16;
                                       break label130;
                                    case 15:
                                       val var283: java.lang.String = var43.v(var42, 15, b2.a, var18) as java.lang.String;
                                       var2 |= 32768;
                                       var18 = var13;
                                       var13 = var84;
                                       var80 = var90;
                                       var78 = var68;
                                       var76 = var101;
                                       var53 = var72;
                                       var56 = (Integer)var20;
                                       var68 = (Integer)var19;
                                       var72 = var283;
                                       var84 = var53;
                                       var90 = var78;
                                       var16 = (Integer)var76;
                                       var101 = var80;
                                       var19 = var56;
                                       var20 = var16;
                                       break label130;
                                    case 16:
                                       val var282: java.lang.String = var43.v(var42, 16, b2.a, var19) as java.lang.String;
                                       var2 |= 65536;
                                       var19 = var56;
                                       var13 = var84;
                                       var80 = var90;
                                       var78 = var68;
                                       var76 = var101;
                                       var53 = var72;
                                       var56 = (Integer)var20;
                                       var68 = var282;
                                       var72 = (Integer)var18;
                                       var84 = var53;
                                       var90 = var78;
                                       var16 = (Integer)var76;
                                       var101 = var80;
                                       var18 = var13;
                                       var20 = var16;
                                       break label130;
                                    case 17:
                                       val var75: java.lang.Boolean = var43.v(var42, 17, yk.h.a, var72) as java.lang.Boolean;
                                       var2 |= 131072;
                                       var20 = var16;
                                       var13 = var84;
                                       var80 = var90;
                                       var78 = var68;
                                       var76 = var101;
                                       var68 = (Integer)var19;
                                       var53 = var75;
                                       var56 = (Integer)var20;
                                       var72 = (Integer)var18;
                                       var84 = var53;
                                       var90 = var78;
                                       var16 = (Integer)var76;
                                       var101 = var80;
                                       var18 = var13;
                                       var19 = var56;
                                       break label130;
                                    case 18:
                                       val var280: EmbedFooter = var43.v(var42, 18, EmbedFooter.$serializer.INSTANCE, var20) as EmbedFooter;
                                       var2 |= 262144;
                                       var13 = var84;
                                       var80 = var90;
                                       var78 = var68;
                                       var76 = var101;
                                       var68 = (Integer)var19;
                                       var53 = var72;
                                       var56 = var280;
                                       var72 = (Integer)var18;
                                       var84 = var53;
                                       var90 = var78;
                                       var16 = (Integer)var76;
                                       var101 = var80;
                                       var18 = var13;
                                       var19 = var56;
                                       var20 = var16;
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
                                       var25 = var43.v(var42, 24, n0.a, var25) as Int;
                                       var2 |= 16777216;
                                       break label131;
                                    case 25:
                                       var47 = var43.v(var42, 25, n0.a, var47) as Int;
                                       var5 = 33554432;
                                       break;
                                    case 26:
                                       var31 = var43.v(var42, 26, n0.a, var31) as Int;
                                       var2 |= 67108864;
                                       break label131;
                                    case 27:
                                       var3 = var43.k(var42, 27);
                                       var5 = 134217728;
                                       break;
                                    case 28:
                                       var146 = var43.v(var42, 28, n0.a, var146) as Int;
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

                              var16 = (Integer)var76;
                              var13 = var84;
                              var80 = var90;
                              var78 = var68;
                              var76 = var101;
                              var68 = (Integer)var19;
                              var56 = (Integer)var20;
                              var53 = var72;
                              var72 = (Integer)var18;
                              var84 = var53;
                              var90 = var78;
                              var101 = var80;
                              var18 = var13;
                              var19 = var56;
                              var20 = var16;
                              break label130;
                           }

                           var16 = (Integer)var76;
                           var13 = var84;
                           var80 = var90;
                           var78 = var68;
                           var76 = var101;
                           var68 = (Integer)var19;
                           var56 = (Integer)var20;
                           var53 = var72;
                           var72 = (Integer)var18;
                           var84 = var148;
                           var90 = var78;
                           var101 = var80;
                           var18 = var13;
                           var19 = var56;
                           var20 = var16;
                           break label130;
                        }

                        var68 = (Integer)var19;
                        var56 = (Integer)var20;
                        var53 = var72;
                        var72 = (Integer)var18;
                        var76 = var101;
                        var78 = var68;
                        var80 = var90;
                        var13 = var84;
                        var84 = var53;
                        var90 = var78;
                        var16 = (Integer)var76;
                        var101 = var80;
                        var18 = var13;
                        var19 = var148;
                        var20 = var16;
                        break label130;
                     }

                     var68 = (Integer)var19;
                     var18 = var13;
                     var19 = var56;
                     var20 = var16;
                     var13 = var84;
                     var80 = var90;
                     var53 = var72;
                     var56 = (Integer)var20;
                     var72 = (Integer)var18;
                     var76 = var101;
                     var78 = var148;
                     var84 = var53;
                     var90 = var78;
                     var16 = (Integer)var76;
                     var101 = var80;
                     break label130;
                  }

                  var13 = var84;
                  var80 = var90;
                  var20 = var16;
                  var19 = var56;
                  var18 = var13;
                  var101 = var80;
                  var16 = (Integer)var76;
                  var90 = var78;
                  var84 = var53;
                  var78 = var68;
                  var76 = var101;
                  var72 = (Integer)var18;
                  var68 = (Integer)var19;
                  var56 = (Integer)var20;
                  var53 = var72;
               }

               var68 = (Integer)var78;
               var78 = var90;
               var76 = var16;
               var80 = var101;
               var13 = var18;
               var56 = (Integer)var19;
               var16 = (Integer)var20;
               var20 = var56;
               var72 = (Integer)var53;
               var53 = var84;
               var84 = var13;
               var90 = var80;
               var101 = var76;
               var18 = var72;
               var19 = var68;
            }

            var145 = (java.lang.String)var27;
            var148 = var26;
            var24 = var18;
            var16 = var146;
            var56 = (Integer)var31;
            var68 = var47;
            var72 = (Integer)var25;
            var13 = var24;
            var31 = var20;
            var90 = var72;
            var20 = var68;
            var39 = var21;
            var84 = var90;
            var37 = var84;
            var25 = var16;
            var38 = var56;
            var18 = var22;
            var26 = var13;
            var22 = var80;
            var36 = var76;
            var21 = var78;
            var27 = var53;
         }

         var43.b(var42);
         return new Embed(
            var2,
            (EmbedType)var34,
            (java.lang.String)var23,
            (EmbedAuthor)var27,
            (EmbedProvider)var21,
            (java.lang.String)var36,
            (StructurableText)var22,
            (java.util.List)var26,
            (java.lang.String)var18,
            (java.lang.String)var38,
            (StructurableText)var25,
            (EmbedMedia)var37,
            (java.util.List)var84,
            (EmbedMedia)var39,
            (EmbedThumbnail)var20,
            (java.lang.String)var101,
            (java.lang.String)var24,
            (java.lang.String)var19,
            (java.lang.Boolean)var90,
            (EmbedFooter)var31,
            (java.lang.String)var32,
            (java.lang.String)var33,
            (java.lang.String)var30,
            (java.lang.String)var13,
            (EmbedFailureState)var28,
            var72,
            var68,
            var56,
            var3,
            var16,
            var145,
            (java.lang.String)var148,
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
         return yk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
