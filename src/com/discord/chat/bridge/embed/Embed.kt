package com.discord.chat.bridge.embed

import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
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
import xk.a2
import xk.f0
import xk.h
import xk.m0

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
      r.h(var1, "type");
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
      if (var20 == null || !(kotlin.text.f.x(var20) xor true)) {
         var30 = null;
      }

      this.spoilerOrNull = var30;
      var var31: java.lang.String = null;
      if (var21 != null) {
         var31 = null;
         if (kotlin.text.f.x(var21) xor true) {
            var31 = var21;
         }
      }

      this.obscureOrNull = var31;
   }

   @JvmStatic
   public fun `write$Self`(self: Embed, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, EmbedType.Companion.serializer(), var0.type);
      var var3: Boolean;
      if (!var1.A(var2, 1) && var0.id == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.id);
      }

      if (!var1.A(var2, 2) && var0.author == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, EmbedAuthor.$serializer.INSTANCE, var0.author);
      }

      if (!var1.A(var2, 3) && var0.provider == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, EmbedProvider.$serializer.INSTANCE, var0.provider);
      }

      if (!var1.A(var2, 4) && var0.rawTitle == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, a2.a, var0.rawTitle);
      }

      if (!var1.A(var2, 5) && var0.title == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, StructurableTextSerializer.INSTANCE, var0.title);
      }

      if (!var1.A(var2, 6) && var0.fields == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, new xk.f(EmbedField.$serializer.INSTANCE), var0.fields);
      }

      if (!var1.A(var2, 7) && var0.url == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 7, a2.a, var0.url);
      }

      if (!var1.A(var2, 8) && var0.rawDescription == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 8, a2.a, var0.rawDescription);
      }

      if (!var1.A(var2, 9) && var0.description == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 9, StructurableTextSerializer.INSTANCE, var0.description);
      }

      if (!var1.A(var2, 10) && var0.image == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 10, EmbedMedia.$serializer.INSTANCE, var0.image);
      }

      if (!var1.A(var2, 11) && var0.images == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 11, new xk.f(EmbedMedia.$serializer.INSTANCE), var0.images);
      }

      if (!var1.A(var2, 12) && var0.video == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 12, EmbedMedia.$serializer.INSTANCE, var0.video);
      }

      if (!var1.A(var2, 13) && var0.thumbnail == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 13, EmbedThumbnail.$serializer.INSTANCE, var0.thumbnail);
      }

      if (!var1.A(var2, 14) && var0.numAttachments == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 14, a2.a, var0.numAttachments);
      }

      if (!var1.A(var2, 15) && var0.attachmentsSize == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 15, a2.a, var0.attachmentsSize);
      }

      if (!var1.A(var2, 16) && var0.messageSendError == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 16, a2.a, var0.messageSendError);
      }

      if (!var1.A(var2, 17) && var0.disableBackgroundColor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 17, h.a, var0.disableBackgroundColor);
      }

      if (!var1.A(var2, 18) && var0.footer == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 18, EmbedFooter.$serializer.INSTANCE, var0.footer);
      }

      if (!var1.A(var2, 19) && var0.spoiler == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 19, a2.a, var0.spoiler);
      }

      if (!var1.A(var2, 20) && var0.obscure == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 20, a2.a, var0.obscure);
      }

      if (!var1.A(var2, 21) && var0.obscureAwaitingScan == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 21, a2.a, var0.obscureAwaitingScan);
      }

      if (!var1.A(var2, 22) && var0.iconURL == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 22, a2.a, var0.iconURL);
      }

      if (!var1.A(var2, 23) && var0.failureState == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 23, EmbedFailureState.Serializer.INSTANCE, var0.failureState);
      }

      if (!var1.A(var2, 24) && var0.providerColor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 24, m0.a, var0.providerColor);
      }

      if (!var1.A(var2, 25) && var0.borderLeftColor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 25, m0.a, var0.borderLeftColor);
      }

      if (!var1.A(var2, 26) && var0.headerTextColor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 26, m0.a, var0.headerTextColor);
      }

      var1.w(var2, 27, var0.bodyTextColor);
      if (!var1.A(var2, 28) && var0.backgroundColor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 28, m0.a, var0.backgroundColor);
      }

      label261: {
         if (!var1.A(var2, 29)) {
            val var8: java.lang.String = var0.getSpoilerOrNull();
            var var38: java.lang.String = var0.spoiler;
            if (var0.spoiler == null || !(kotlin.text.f.x(var0.spoiler) xor true)) {
               var38 = null;
            }

            if (r.c(var8, var38)) {
               var3 = false;
               break label261;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 29, a2.a, var0.getSpoilerOrNull());
      }

      label250: {
         if (!var1.A(var2, 30)) {
            val var9: java.lang.String = var0.getObscureOrNull();
            val var41: java.lang.String = var0.obscure;
            var var39: java.lang.String = null;
            if (var0.obscure != null) {
               var39 = null;
               if (kotlin.text.f.x(var0.obscure) xor true) {
                  var39 = var41;
               }
            }

            var3 = false;
            if (r.c(var9, var39)) {
               break label250;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 30, a2.a, var0.getObscureOrNull());
      }
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
      r.h(var1, "type");
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
         } else if (!r.c(this.id, var1.id)) {
            return false;
         } else if (!r.c(this.author, var1.author)) {
            return false;
         } else if (!r.c(this.provider, var1.provider)) {
            return false;
         } else if (!r.c(this.rawTitle, var1.rawTitle)) {
            return false;
         } else if (!r.c(this.title, var1.title)) {
            return false;
         } else if (!r.c(this.fields, var1.fields)) {
            return false;
         } else if (!r.c(this.url, var1.url)) {
            return false;
         } else if (!r.c(this.rawDescription, var1.rawDescription)) {
            return false;
         } else if (!r.c(this.description, var1.description)) {
            return false;
         } else if (!r.c(this.image, var1.image)) {
            return false;
         } else if (!r.c(this.images, var1.images)) {
            return false;
         } else if (!r.c(this.video, var1.video)) {
            return false;
         } else if (!r.c(this.thumbnail, var1.thumbnail)) {
            return false;
         } else if (!r.c(this.numAttachments, var1.numAttachments)) {
            return false;
         } else if (!r.c(this.attachmentsSize, var1.attachmentsSize)) {
            return false;
         } else if (!r.c(this.messageSendError, var1.messageSendError)) {
            return false;
         } else if (!r.c(this.disableBackgroundColor, var1.disableBackgroundColor)) {
            return false;
         } else if (!r.c(this.footer, var1.footer)) {
            return false;
         } else if (!r.c(this.spoiler, var1.spoiler)) {
            return false;
         } else if (!r.c(this.obscure, var1.obscure)) {
            return false;
         } else if (!r.c(this.obscureAwaitingScan, var1.obscureAwaitingScan)) {
            return false;
         } else if (!r.c(this.iconURL, var1.iconURL)) {
            return false;
         } else if (this.failureState != var1.failureState) {
            return false;
         } else if (!r.c(this.providerColor, var1.providerColor)) {
            return false;
         } else if (!r.c(this.borderLeftColor, var1.borderLeftColor)) {
            return false;
         } else if (!r.c(this.headerTextColor, var1.headerTextColor)) {
            return false;
         } else if (this.bodyTextColor != var1.bodyTextColor) {
            return false;
         } else {
            return r.c(this.backgroundColor, var1.backgroundColor);
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
      val var6: EmbedType = this.type;
      val var19: java.lang.String = this.id;
      val var15: EmbedAuthor = this.author;
      val var12: EmbedProvider = this.provider;
      val var4: java.lang.String = this.rawTitle;
      val var13: StructurableText = this.title;
      val var29: java.util.List = this.fields;
      val var28: java.lang.String = this.url;
      val var26: java.lang.String = this.rawDescription;
      val var7: StructurableText = this.description;
      val var10: EmbedMedia = this.image;
      val var20: java.util.List = this.images;
      val var11: EmbedMedia = this.video;
      val var16: EmbedThumbnail = this.thumbnail;
      val var23: java.lang.String = this.numAttachments;
      val var24: java.lang.String = this.attachmentsSize;
      val var2: java.lang.String = this.messageSendError;
      val var8: java.lang.Boolean = this.disableBackgroundColor;
      val var21: EmbedFooter = this.footer;
      val var3: java.lang.String = this.spoiler;
      val var14: java.lang.String = this.obscure;
      val var18: java.lang.String = this.obscureAwaitingScan;
      val var25: java.lang.String = this.iconURL;
      val var22: EmbedFailureState = this.failureState;
      val var5: Int = this.providerColor;
      val var9: Int = this.borderLeftColor;
      val var17: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var30: Int = this.backgroundColor;
      val var27: StringBuilder = new StringBuilder();
      var27.append("Embed(type=");
      var27.append(var6);
      var27.append(", id=");
      var27.append(var19);
      var27.append(", author=");
      var27.append(var15);
      var27.append(", provider=");
      var27.append(var12);
      var27.append(", rawTitle=");
      var27.append(var4);
      var27.append(", title=");
      var27.append(var13);
      var27.append(", fields=");
      var27.append(var29);
      var27.append(", url=");
      var27.append(var28);
      var27.append(", rawDescription=");
      var27.append(var26);
      var27.append(", description=");
      var27.append(var7);
      var27.append(", image=");
      var27.append(var10);
      var27.append(", images=");
      var27.append(var20);
      var27.append(", video=");
      var27.append(var11);
      var27.append(", thumbnail=");
      var27.append(var16);
      var27.append(", numAttachments=");
      var27.append(var23);
      var27.append(", attachmentsSize=");
      var27.append(var24);
      var27.append(", messageSendError=");
      var27.append(var2);
      var27.append(", disableBackgroundColor=");
      var27.append(var8);
      var27.append(", footer=");
      var27.append(var21);
      var27.append(", spoiler=");
      var27.append(var3);
      var27.append(", obscure=");
      var27.append(var14);
      var27.append(", obscureAwaitingScan=");
      var27.append(var18);
      var27.append(", iconURL=");
      var27.append(var25);
      var27.append(", failureState=");
      var27.append(var22);
      var27.append(", providerColor=");
      var27.append(var5);
      var27.append(", borderLeftColor=");
      var27.append(var9);
      var27.append(", headerTextColor=");
      var27.append(var17);
      var27.append(", bodyTextColor=");
      var27.append(var1);
      var27.append(", backgroundColor=");
      var27.append(var30);
      var27.append(")");
      return var27.toString();
   }

   public object `$serializer` : f0<Embed> {
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
         val var4: KSerializer = EmbedType.Companion.serializer();
         val var8: a2 = a2.a;
         val var7: KSerializer = a.u(a2.a);
         val var9: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var2: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var5: KSerializer = a.u(var8);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var1: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var10: KSerializer = a.u(new xk.f(EmbedField.$serializer.INSTANCE));
         val var6: KSerializer = a.u(var8);
         val var3: KSerializer = a.u(var8);
         val var27: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var13: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var12: KSerializer = a.u(new xk.f(var14));
         val var17: KSerializer = a.u(var14);
         val var22: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var21: KSerializer = a.u(var8);
         val var24: KSerializer = a.u(var8);
         val var25: KSerializer = a.u(var8);
         val var18: KSerializer = a.u(h.a);
         val var23: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var19: KSerializer = a.u(var8);
         val var16: KSerializer = a.u(var8);
         val var15: KSerializer = a.u(var8);
         val var20: KSerializer = a.u(var8);
         val var28: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var26: m0 = m0.a;
         return new KSerializer[]{
            var4,
            var7,
            var9,
            var2,
            var5,
            var1,
            var10,
            var6,
            var3,
            var27,
            var13,
            var12,
            var17,
            var22,
            var21,
            var24,
            var25,
            var18,
            var23,
            var19,
            var16,
            var15,
            var20,
            var28,
            a.u(m0.a),
            a.u(var26),
            a.u(var26),
            var26,
            a.u(var26),
            a.u(var8),
            a.u(var8)
         };
      }

      public open fun deserialize(decoder: Decoder): Embed {
         r.h(var1, "decoder");
         val var46: SerialDescriptor = this.getDescriptor();
         val var47: c = var1.b(var46);
         var var3: Int;
         val var4: Int;
         var var12: Any;
         var var14: Any;
         var var15: Any;
         var var17: Any;
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
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         val var36: Any;
         val var37: Any;
         val var38: Any;
         val var40: Any;
         var var50: Any;
         var var103: Any;
         var var120: Any;
         var var272: Any;
         if (var47.p()) {
            var34 = var47.y(var46, 0, EmbedType.Companion.serializer(), null);
            var120 = a2.a;
            var15 = var47.n(var46, 1, a2.a, null);
            var38 = var47.n(var46, 2, EmbedAuthor.$serializer.INSTANCE, null);
            var22 = var47.n(var46, 3, EmbedProvider.$serializer.INSTANCE, null);
            var18 = var47.n(var46, 4, (DeserializationStrategy)var120, null);
            var50 = StructurableTextSerializer.INSTANCE;
            var24 = var47.n(var46, 5, StructurableTextSerializer.INSTANCE, null);
            var32 = var47.n(var46, 6, new xk.f(EmbedField.$serializer.INSTANCE), null);
            var12 = var47.n(var46, 7, (DeserializationStrategy)var120, null);
            val var7: Any = var47.n(var46, 8, (DeserializationStrategy)var120, null);
            var36 = var47.n(var46, 9, (DeserializationStrategy)var50, null);
            var var6: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
            var33 = var47.n(var46, 10, EmbedMedia.$serializer.INSTANCE, null);
            var50 = var47.n(var46, 11, new xk.f(var6), null);
            val var8: Any = var47.n(var46, 12, var6, null);
            var103 = var47.n(var46, 13, EmbedThumbnail.$serializer.INSTANCE, null);
            var21 = var47.n(var46, 14, (DeserializationStrategy)var120, null);
            var23 = var47.n(var46, 15, (DeserializationStrategy)var120, null);
            var19 = var47.n(var46, 16, (DeserializationStrategy)var120, null);
            val var11: Any = var47.n(var46, 17, h.a, null);
            val var13: Any = var47.n(var46, 18, EmbedFooter.$serializer.INSTANCE, null);
            var25 = var47.n(var46, 19, (DeserializationStrategy)var120, null);
            var14 = var47.n(var46, 20, (DeserializationStrategy)var120, null);
            var30 = var47.n(var46, 21, (DeserializationStrategy)var120, null);
            var37 = var47.n(var46, 22, (DeserializationStrategy)var120, null);
            var27 = var47.n(var46, 23, EmbedFailureState.Serializer.INSTANCE, null);
            var var10: m0 = m0.a;
            var26 = var47.n(var46, 24, m0.a, null);
            var272 = var47.n(var46, 25, var10, null);
            var6 = (EmbedMedia.$serializer)var47.n(var46, 26, var10, null);
            val var2: Int = var47.i(var46, 27);
            var10 = (m0)var47.n(var46, 28, var10, null);
            var28 = var47.n(var46, 29, (DeserializationStrategy)var120, null);
            var29 = var47.n(var46, 30, (DeserializationStrategy)var120, null);
            var4 = Integer.MAX_VALUE;
            var31 = var13;
            var35 = var11;
            var20 = var103;
            var120 = var8;
            var17 = var50;
            var103 = var272;
            var272 = var10;
            var50 = var6;
            var40 = var7;
            var3 = var2;
         } else {
            var var55: Boolean = true;
            var var97: Any = null;
            var50 = null;
            var var60: Any = null;
            var30 = null;
            var31 = null;
            var25 = null;
            var33 = null;
            var32 = null;
            var28 = null;
            var29 = null;
            var26 = null;
            var27 = null;
            var34 = null;
            var var100: Any = null;
            var12 = null;
            var var107: Any = null;
            var103 = null;
            var var109: Any = null;
            var var113: Any = null;
            var15 = null;
            var17 = null;
            var14 = null;
            var19 = null;
            var18 = null;
            var120 = null;
            var21 = null;
            var20 = null;
            var22 = null;
            var23 = null;
            var3 = 0;
            var var54: Int = 0;
            var24 = null;

            while (var55) {
               label55: {
                  label54: {
                     val var5: Int = var47.o(var46);
                     switch (var5) {
                        case -1:
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var55 = false;
                           var24 = var14;
                           var23 = var17;
                           var22 = var15;
                           var21 = var113;
                           var20 = var109;
                           var19 = var103;
                           var18 = var107;
                           var17 = var12;
                           var120 = var100;
                           var12 = var21;
                           var109 = var20;
                           var107 = var22;
                           var103 = var23;
                           var100 = var24;
                           var97 = var60;
                           var60 = var50;
                           var50 = var97;
                           break label55;
                        case 0:
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var12 = var21;
                           var109 = var20;
                           var107 = var22;
                           var103 = var23;
                           val var95: KSerializer = EmbedType.Companion.serializer();
                           var120 = var100;
                           var34 = var47.y(var46, 0, var95, var34);
                           var54 |= 1;
                           var60 = var50;
                           var50 = var97;
                           var97 = var60;
                           var100 = var24;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 1:
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var120 = var47.n(var46, 1, a2.a, var100);
                           var54 |= 2;
                           var24 = var14;
                           var23 = var17;
                           var22 = var15;
                           var21 = var113;
                           var20 = var109;
                           var19 = var103;
                           var18 = var107;
                           var17 = var12;
                           var12 = var21;
                           var109 = var20;
                           var107 = var22;
                           var103 = var23;
                           var100 = var24;
                           var97 = var60;
                           var60 = var50;
                           var50 = var97;
                           break label55;
                        case 2:
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var109 = var20;
                           var103 = var23;
                           var18 = var107;
                           var17 = var47.n(var46, 2, EmbedAuthor.$serializer.INSTANCE, var12);
                           var54 |= 4;
                           var60 = var50;
                           var50 = var97;
                           var120 = var100;
                           var97 = var60;
                           var100 = var24;
                           var107 = var22;
                           var12 = var21;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 3:
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var109 = var20;
                           var19 = var103;
                           var18 = var47.n(var46, 3, EmbedProvider.$serializer.INSTANCE, var107);
                           var54 |= 8;
                           var60 = var50;
                           var50 = var97;
                           var120 = var100;
                           var17 = var12;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var12 = var21;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 4:
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var20 = var109;
                           var19 = var47.n(var46, 4, a2.a, var103);
                           var54 |= 16;
                           var60 = var50;
                           var50 = var97;
                           var17 = var12;
                           var18 = var107;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var109 = var20;
                           var12 = var21;
                           var120 = var100;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 5:
                           var15 = var19;
                           var14 = var18;
                           var21 = var113;
                           val var147: Any = var47.n(var46, 5, StructurableTextSerializer.INSTANCE, var109);
                           var54 |= 32;
                           var60 = var50;
                           var50 = var97;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var109 = var20;
                           var12 = var21;
                           var113 = var120;
                           var120 = var100;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var147;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 6:
                           var14 = var18;
                           val var85: xk.f = new xk.f(EmbedField.$serializer.INSTANCE);
                           var22 = var15;
                           val var152: Any = var47.n(var46, 6, var85, var113);
                           var54 |= 64;
                           var60 = var50;
                           var50 = var97;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var109 = var20;
                           var12 = var21;
                           var113 = var120;
                           var15 = var19;
                           var120 = var100;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var152;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 7:
                           var14 = var18;
                           var23 = var17;
                           var22 = var47.n(var46, 7, a2.a, var15);
                           var54 |= 128;
                           var60 = var50;
                           var50 = var97;
                           var17 = var12;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var109 = var20;
                           var12 = var21;
                           var113 = var120;
                           var15 = var19;
                           var120 = var100;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var24 = var14;
                           break label55;
                        case 8:
                           var24 = var14;
                           var23 = var47.n(var46, 8, a2.a, var17);
                           var54 |= 256;
                           var60 = var50;
                           var50 = var97;
                           var17 = var12;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var109 = var20;
                           var12 = var21;
                           var113 = var120;
                           var14 = var18;
                           var15 = var19;
                           var120 = var100;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           break label55;
                        case 9:
                           var24 = var47.n(var46, 9, StructurableTextSerializer.INSTANCE, var14);
                           var54 |= 512;
                           var60 = var50;
                           var50 = var97;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var109 = var20;
                           var12 = var21;
                           var113 = var120;
                           var14 = var18;
                           var15 = var19;
                           var120 = var100;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           break label55;
                        case 10:
                           var19 = var47.n(var46, 10, EmbedMedia.$serializer.INSTANCE, var19);
                           var54 |= 1024;
                           var60 = var50;
                           var50 = var97;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var109 = var20;
                           var12 = var21;
                           var113 = var120;
                           var14 = var18;
                           var15 = var19;
                           var120 = var100;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 11:
                           val var381: Any = var47.n(var46, 11, new xk.f(EmbedMedia.$serializer.INSTANCE), var18);
                           var54 |= 2048;
                           var60 = var50;
                           var50 = var97;
                           var18 = var107;
                           var15 = var19;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var109 = var20;
                           var12 = var21;
                           var113 = var120;
                           var14 = var381;
                           var120 = var100;
                           var17 = var12;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 12:
                           val var380: Any = var47.n(var46, 12, EmbedMedia.$serializer.INSTANCE, var120);
                           var54 |= 4096;
                           var60 = var50;
                           var50 = var97;
                           var120 = var100;
                           var15 = var19;
                           var14 = var18;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var109 = var20;
                           var12 = var21;
                           var113 = var380;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 13:
                           val var379: Any = var47.n(var46, 13, EmbedThumbnail.$serializer.INSTANCE, var21);
                           var54 |= 8192;
                           var60 = var50;
                           var50 = var97;
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var109 = var20;
                           var12 = var379;
                           var120 = var100;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 14:
                           val var378: Any = var47.n(var46, 14, a2.a, var20);
                           var54 |= 16384;
                           var60 = var50;
                           var50 = var97;
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var12 = var21;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var22;
                           var109 = var378;
                           var120 = var100;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 15:
                           val var377: Any = var47.n(var46, 15, a2.a, var22);
                           var54 |= 32768;
                           var60 = var50;
                           var50 = var97;
                           var24 = var14;
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var12 = var21;
                           var109 = var20;
                           var97 = var60;
                           var100 = var24;
                           var103 = var23;
                           var107 = var377;
                           var120 = var100;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           break label55;
                        case 16:
                           val var376: Any = var47.n(var46, 16, a2.a, var23);
                           var54 |= 65536;
                           var60 = var50;
                           var50 = var97;
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var12 = var21;
                           var109 = var20;
                           var107 = var22;
                           var97 = var60;
                           var100 = var24;
                           var103 = var376;
                           var120 = var100;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 17:
                           val var375: Any = var47.n(var46, 17, h.a, var24);
                           var54 |= 131072;
                           var60 = var50;
                           var50 = var97;
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var12 = var21;
                           var109 = var20;
                           var107 = var22;
                           var103 = var23;
                           var97 = var60;
                           var100 = var375;
                           var120 = var100;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 18:
                           var97 = var47.n(var46, 18, EmbedFooter.$serializer.INSTANCE, var97);
                           var54 |= 262144;
                           var60 = var50;
                           var15 = var19;
                           var14 = var18;
                           var113 = var120;
                           var12 = var21;
                           var109 = var20;
                           var107 = var22;
                           var103 = var23;
                           var100 = var24;
                           var50 = var97;
                           var97 = var60;
                           var120 = var100;
                           var17 = var12;
                           var18 = var107;
                           var19 = var103;
                           var20 = var109;
                           var21 = var113;
                           var22 = var15;
                           var23 = var17;
                           var24 = var14;
                           break label55;
                        case 19:
                           var25 = var47.n(var46, 19, a2.a, var25);
                           var54 |= 524288;
                           var35 = var60;
                           var60 = var50;
                           break;
                        case 20:
                           var35 = var47.n(var46, 20, a2.a, var60);
                           var54 |= 1048576;
                           var60 = var50;
                           break;
                        case 21:
                           var30 = var47.n(var46, 21, a2.a, var30);
                           var54 |= 2097152;
                           var35 = var50;
                           break label54;
                        case 22:
                           var35 = var47.n(var46, 22, a2.a, var50);
                           var54 |= 4194304;
                           break label54;
                        case 23:
                           var27 = var47.n(var46, 23, EmbedFailureState.Serializer.INSTANCE, var27);
                           var54 |= 8388608;
                           var35 = var50;
                           break label54;
                        case 24:
                           var26 = var47.n(var46, 24, m0.a, var26);
                           var54 |= 16777216;
                           var35 = var50;
                           break label54;
                        case 25:
                           var31 = var47.n(var46, 25, m0.a, var31);
                           var54 |= 33554432;
                           var35 = var50;
                           break label54;
                        case 26:
                           var33 = var47.n(var46, 26, m0.a, var33);
                           var54 |= 67108864;
                           var35 = var50;
                           break label54;
                        case 27:
                           var3 = var47.i(var46, 27);
                           var54 |= 134217728;
                           var35 = var50;
                           break label54;
                        case 28:
                           var32 = var47.n(var46, 28, m0.a, var32);
                           var54 |= 268435456;
                           var35 = var50;
                           break label54;
                        case 29:
                           var28 = var47.n(var46, 29, a2.a, var28);
                           var54 |= 536870912;
                           var35 = var50;
                           break label54;
                        case 30:
                           var29 = var47.n(var46, 30, a2.a, var29);
                           var54 |= 1073741824;
                           var35 = var50;
                           break label54;
                        default:
                           throw new n(var5);
                     }

                     var15 = var19;
                     var14 = var18;
                     var113 = var120;
                     var12 = var21;
                     var109 = var20;
                     var107 = var22;
                     var103 = var23;
                     var100 = var24;
                     var50 = var97;
                     var97 = var35;
                     var120 = var100;
                     var17 = var12;
                     var18 = var107;
                     var19 = var103;
                     var20 = var109;
                     var21 = var113;
                     var22 = var15;
                     var23 = var17;
                     var24 = var14;
                     break label55;
                  }

                  var15 = var19;
                  var14 = var18;
                  var113 = var120;
                  var12 = var21;
                  var109 = var20;
                  var107 = var22;
                  var103 = var23;
                  var100 = var24;
                  var50 = var97;
                  var60 = var35;
                  var97 = var60;
                  var120 = var100;
                  var17 = var12;
                  var18 = var107;
                  var19 = var103;
                  var20 = var109;
                  var21 = var113;
                  var22 = var15;
                  var23 = var17;
                  var24 = var14;
               }

               var100 = var120;
               var12 = var17;
               var107 = var18;
               var103 = var19;
               var109 = var20;
               var113 = var21;
               var15 = var22;
               var17 = var23;
               var14 = var24;
               var97 = var50;
               var50 = var60;
               var60 = var97;
               var24 = var100;
               var19 = var15;
               var18 = var14;
               var120 = var113;
               var21 = var12;
               var20 = var109;
               var22 = var107;
               var23 = var103;
            }

            var38 = var12;
            var12 = var15;
            var40 = var17;
            var19 = var23;
            var17 = var18;
            var21 = var20;
            var36 = var14;
            var37 = var50;
            var18 = var103;
            var4 = var54;
            var50 = var33;
            var272 = var32;
            var103 = var31;
            var33 = var19;
            var20 = var21;
            var23 = var22;
            var35 = var24;
            var14 = var60;
            var31 = var97;
            var32 = var113;
            var15 = var100;
            var22 = var107;
            var24 = var109;
         }

         var47.c(var46);
         return new Embed(
            var4,
            var34 as EmbedType,
            var15 as java.lang.String,
            var38 as EmbedAuthor,
            var22 as EmbedProvider,
            var18 as java.lang.String,
            var24 as StructurableText,
            var32 as java.util.List,
            var12 as java.lang.String,
            var40 as java.lang.String,
            var36 as StructurableText,
            var33 as EmbedMedia,
            var17 as java.util.List,
            var120 as EmbedMedia,
            var20 as EmbedThumbnail,
            var21 as java.lang.String,
            var23 as java.lang.String,
            var19 as java.lang.String,
            var35 as java.lang.Boolean,
            var31 as EmbedFooter,
            var25 as java.lang.String,
            var14 as java.lang.String,
            var30 as java.lang.String,
            var37 as java.lang.String,
            var27 as EmbedFailureState,
            var26 as Int,
            var103 as Int,
            var50 as Int,
            var3,
            var272 as Int,
            var28 as java.lang.String,
            var29 as java.lang.String,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: Embed) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         Embed.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
