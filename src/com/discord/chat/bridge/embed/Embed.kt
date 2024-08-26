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
      val var15: EmbedType = this.type;
      val var25: java.lang.String = this.id;
      val var17: EmbedAuthor = this.author;
      val var27: EmbedProvider = this.provider;
      val var2: java.lang.String = this.rawTitle;
      val var11: StructurableText = this.title;
      val var26: java.util.List = this.fields;
      val var3: java.lang.String = this.url;
      val var16: java.lang.String = this.rawDescription;
      val var5: StructurableText = this.description;
      val var29: EmbedMedia = this.image;
      val var22: java.util.List = this.images;
      val var18: EmbedMedia = this.video;
      val var12: EmbedThumbnail = this.thumbnail;
      val var6: java.lang.String = this.numAttachments;
      val var19: java.lang.String = this.attachmentsSize;
      val var20: java.lang.String = this.messageSendError;
      val var23: java.lang.Boolean = this.disableBackgroundColor;
      val var8: EmbedFooter = this.footer;
      val var24: java.lang.String = this.spoiler;
      val var10: java.lang.String = this.obscure;
      val var30: java.lang.String = this.obscureAwaitingScan;
      val var21: java.lang.String = this.iconURL;
      val var7: EmbedFailureState = this.failureState;
      val var28: Int = this.providerColor;
      val var4: Int = this.borderLeftColor;
      val var9: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var14: Int = this.backgroundColor;
      val var13: StringBuilder = new StringBuilder();
      var13.append("Embed(type=");
      var13.append(var15);
      var13.append(", id=");
      var13.append(var25);
      var13.append(", author=");
      var13.append(var17);
      var13.append(", provider=");
      var13.append(var27);
      var13.append(", rawTitle=");
      var13.append(var2);
      var13.append(", title=");
      var13.append(var11);
      var13.append(", fields=");
      var13.append(var26);
      var13.append(", url=");
      var13.append(var3);
      var13.append(", rawDescription=");
      var13.append(var16);
      var13.append(", description=");
      var13.append(var5);
      var13.append(", image=");
      var13.append(var29);
      var13.append(", images=");
      var13.append(var22);
      var13.append(", video=");
      var13.append(var18);
      var13.append(", thumbnail=");
      var13.append(var12);
      var13.append(", numAttachments=");
      var13.append(var6);
      var13.append(", attachmentsSize=");
      var13.append(var19);
      var13.append(", messageSendError=");
      var13.append(var20);
      var13.append(", disableBackgroundColor=");
      var13.append(var23);
      var13.append(", footer=");
      var13.append(var8);
      var13.append(", spoiler=");
      var13.append(var24);
      var13.append(", obscure=");
      var13.append(var10);
      var13.append(", obscureAwaitingScan=");
      var13.append(var30);
      var13.append(", iconURL=");
      var13.append(var21);
      var13.append(", failureState=");
      var13.append(var7);
      var13.append(", providerColor=");
      var13.append(var28);
      var13.append(", borderLeftColor=");
      var13.append(var4);
      var13.append(", headerTextColor=");
      var13.append(var9);
      var13.append(", bodyTextColor=");
      var13.append(var1);
      var13.append(", backgroundColor=");
      var13.append(var14);
      var13.append(")");
      return var13.toString();
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
         val var1: KSerializer = EmbedType.Companion.serializer();
         val var2: a2 = a2.a;
         val var10: KSerializer = a.u(a2.a);
         val var8: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var6: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var4: KSerializer = a.u(var2);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var3: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var7: KSerializer = a.u(new xk.f(EmbedField.$serializer.INSTANCE));
         val var9: KSerializer = a.u(var2);
         val var5: KSerializer = a.u(var2);
         val var27: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var13: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var12: KSerializer = a.u(new xk.f(var14));
         val var20: KSerializer = a.u(var14);
         val var19: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var15: KSerializer = a.u(var2);
         val var21: KSerializer = a.u(var2);
         val var16: KSerializer = a.u(var2);
         val var28: KSerializer = a.u(h.a);
         val var17: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var25: KSerializer = a.u(var2);
         val var24: KSerializer = a.u(var2);
         val var23: KSerializer = a.u(var2);
         val var26: KSerializer = a.u(var2);
         val var18: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var22: m0 = m0.a;
         return new KSerializer[]{
            var1,
            var10,
            var8,
            var6,
            var4,
            var3,
            var7,
            var9,
            var5,
            var27,
            var13,
            var12,
            var20,
            var19,
            var15,
            var21,
            var16,
            var28,
            var17,
            var25,
            var24,
            var23,
            var26,
            var18,
            a.u(m0.a),
            a.u(var22),
            a.u(var22),
            var22,
            a.u(var22),
            a.u(var2),
            a.u(var2)
         };
      }

      public open fun deserialize(decoder: Decoder): Embed {
         r.h(var1, "decoder");
         val var46: SerialDescriptor = this.getDescriptor();
         val var47: c = var1.b(var46);
         var var2: Int;
         var var3: Int;
         var var9: Any;
         var var12: Any;
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
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         val var36: Any;
         val var37: Any;
         val var38: Any;
         val var39: Any;
         val var40: Any;
         var var50: Any;
         var var113: Any;
         var var119: Any;
         var var166: Any;
         if (var47.p()) {
            var34 = var47.y(var46, 0, EmbedType.Companion.serializer(), null);
            var113 = a2.a;
            var15 = var47.n(var46, 1, a2.a, null);
            var119 = var47.n(var46, 2, EmbedAuthor.$serializer.INSTANCE, null);
            var20 = var47.n(var46, 3, EmbedProvider.$serializer.INSTANCE, null);
            var18 = var47.n(var46, 4, (DeserializationStrategy)var113, null);
            var50 = StructurableTextSerializer.INSTANCE;
            var29 = var47.n(var46, 5, StructurableTextSerializer.INSTANCE, null);
            var17 = var47.n(var46, 6, new xk.f(EmbedField.$serializer.INSTANCE), null);
            var12 = var47.n(var46, 7, (DeserializationStrategy)var113, null);
            var9 = var47.n(var46, 8, (DeserializationStrategy)var113, null);
            var36 = var47.n(var46, 9, (DeserializationStrategy)var50, null);
            var var6: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
            var39 = var47.n(var46, 10, EmbedMedia.$serializer.INSTANCE, null);
            var50 = var47.n(var46, 11, new xk.f(var6), null);
            val var8: Any = var47.n(var46, 12, var6, null);
            val var7: Any = var47.n(var46, 13, EmbedThumbnail.$serializer.INSTANCE, null);
            var21 = var47.n(var46, 14, (DeserializationStrategy)var113, null);
            var35 = var47.n(var46, 15, (DeserializationStrategy)var113, null);
            var32 = var47.n(var46, 16, (DeserializationStrategy)var113, null);
            val var11: Any = var47.n(var46, 17, h.a, null);
            val var13: Any = var47.n(var46, 18, EmbedFooter.$serializer.INSTANCE, null);
            var25 = var47.n(var46, 19, (DeserializationStrategy)var113, null);
            var24 = var47.n(var46, 20, (DeserializationStrategy)var113, null);
            var30 = var47.n(var46, 21, (DeserializationStrategy)var113, null);
            var40 = var47.n(var46, 22, (DeserializationStrategy)var113, null);
            var26 = var47.n(var46, 23, EmbedFailureState.Serializer.INSTANCE, null);
            var var10: m0 = m0.a;
            var27 = var47.n(var46, 24, m0.a, null);
            var166 = var47.n(var46, 25, var10, null);
            var6 = (EmbedMedia.$serializer)var47.n(var46, 26, var10, null);
            var3 = var47.i(var46, 27);
            var10 = (m0)var47.n(var46, 28, var10, null);
            var28 = var47.n(var46, 29, (DeserializationStrategy)var113, null);
            var38 = var47.n(var46, 30, (DeserializationStrategy)var113, null);
            var2 = Integer.MAX_VALUE;
            var19 = var13;
            var113 = var11;
            var23 = var7;
            var33 = var8;
            var22 = var50;
            var50 = var119;
            var119 = var166;
            var166 = var10;
            var37 = var6;
         } else {
            var var4: Boolean = true;
            var var95: Any = null;
            var50 = null;
            var var58: Any = null;
            var30 = null;
            var166 = null;
            var25 = null;
            var33 = null;
            var32 = null;
            var28 = null;
            var29 = null;
            var27 = null;
            var26 = null;
            var34 = null;
            var var98: Any = null;
            var12 = null;
            var var104: Any = null;
            var9 = null;
            var var106: Any = null;
            var var111: Any = null;
            var15 = null;
            var17 = null;
            var113 = null;
            var19 = null;
            var18 = null;
            var119 = null;
            var21 = null;
            var20 = null;
            var22 = null;
            var23 = null;
            var3 = 0;
            var2 = 0;
            var24 = null;

            while (var4) {
               label55: {
                  label54: {
                     val var5: Int = var47.o(var46);
                     switch (var5) {
                        case -1:
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var4 = false;
                           var24 = var113;
                           var23 = var17;
                           var22 = var15;
                           var21 = var111;
                           var20 = var106;
                           var19 = var9;
                           var18 = var104;
                           var17 = var12;
                           var119 = var98;
                           var12 = var21;
                           var106 = var20;
                           var104 = var22;
                           var9 = var23;
                           var98 = var24;
                           var95 = var58;
                           var58 = var50;
                           var50 = var95;
                           break label55;
                        case 0:
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var12 = var21;
                           var106 = var20;
                           var104 = var22;
                           var9 = var23;
                           val var93: KSerializer = EmbedType.Companion.serializer();
                           var119 = var98;
                           var34 = var47.y(var46, 0, var93, var34);
                           var2 |= 1;
                           var58 = var50;
                           var50 = var95;
                           var95 = var58;
                           var98 = var24;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           var24 = var113;
                           break label55;
                        case 1:
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var119 = var47.n(var46, 1, a2.a, var98);
                           var2 |= 2;
                           var24 = var113;
                           var23 = var17;
                           var22 = var15;
                           var21 = var111;
                           var20 = var106;
                           var19 = var9;
                           var18 = var104;
                           var17 = var12;
                           var12 = var21;
                           var106 = var20;
                           var104 = var22;
                           var9 = var23;
                           var98 = var24;
                           var95 = var58;
                           var58 = var50;
                           var50 = var95;
                           break label55;
                        case 2:
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var106 = var20;
                           var9 = var23;
                           var18 = var104;
                           var17 = var47.n(var46, 2, EmbedAuthor.$serializer.INSTANCE, var12);
                           var2 |= 4;
                           var58 = var50;
                           var50 = var95;
                           var119 = var98;
                           var95 = var58;
                           var98 = var24;
                           var104 = var22;
                           var12 = var21;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           var24 = var113;
                           break label55;
                        case 3:
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var106 = var20;
                           var19 = var9;
                           var18 = var47.n(var46, 3, EmbedProvider.$serializer.INSTANCE, var104);
                           var2 |= 8;
                           var58 = var50;
                           var50 = var95;
                           var119 = var98;
                           var17 = var12;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var12 = var21;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           var24 = var113;
                           break label55;
                        case 4:
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var20 = var106;
                           var19 = var47.n(var46, 4, a2.a, var9);
                           var2 |= 16;
                           var58 = var50;
                           var50 = var95;
                           var17 = var12;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var12 = var21;
                           var119 = var98;
                           var18 = var104;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           var24 = var113;
                           break label55;
                        case 5:
                           var15 = var19;
                           var113 = var18;
                           var21 = var111;
                           val var151: Any = var47.n(var46, 5, StructurableTextSerializer.INSTANCE, var106);
                           var2 |= 32;
                           var58 = var50;
                           var50 = var95;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var12 = var21;
                           var111 = var119;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var151;
                           var22 = var15;
                           var23 = var17;
                           var24 = var113;
                           break label55;
                        case 6:
                           var113 = var18;
                           val var83: xk.f = new xk.f(EmbedField.$serializer.INSTANCE);
                           var22 = var15;
                           val var155: Any = var47.n(var46, 6, var83, var111);
                           var2 |= 64;
                           var58 = var50;
                           var50 = var95;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var12 = var21;
                           var111 = var119;
                           var15 = var19;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var155;
                           var23 = var17;
                           var24 = var113;
                           break label55;
                        case 7:
                           var113 = var18;
                           var23 = var17;
                           var22 = var47.n(var46, 7, a2.a, var15);
                           var2 |= 128;
                           var58 = var50;
                           var50 = var95;
                           var17 = var12;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var12 = var21;
                           var111 = var119;
                           var15 = var19;
                           var119 = var98;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var24 = var113;
                           break label55;
                        case 8:
                           var24 = var113;
                           var23 = var47.n(var46, 8, a2.a, var17);
                           var2 |= 256;
                           var58 = var50;
                           var50 = var95;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var12 = var21;
                           var111 = var119;
                           var113 = var18;
                           var15 = var19;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           break label55;
                        case 9:
                           var24 = var47.n(var46, 9, StructurableTextSerializer.INSTANCE, var113);
                           var2 |= 512;
                           var58 = var50;
                           var50 = var95;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var12 = var21;
                           var111 = var119;
                           var113 = var18;
                           var15 = var19;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           break label55;
                        case 10:
                           var19 = var47.n(var46, 10, EmbedMedia.$serializer.INSTANCE, var19);
                           var2 |= 1024;
                           var58 = var50;
                           var50 = var95;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var12 = var21;
                           var111 = var119;
                           var113 = var18;
                           var15 = var19;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           var24 = var113;
                           break label55;
                        case 11:
                           val var349: Any = var47.n(var46, 11, new xk.f(EmbedMedia.$serializer.INSTANCE), var18);
                           var2 |= 2048;
                           var58 = var50;
                           var50 = var95;
                           var15 = var19;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var12 = var21;
                           var111 = var119;
                           var113 = var349;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           var24 = var113;
                           break label55;
                        case 12:
                           val var381: Any = var47.n(var46, 12, EmbedMedia.$serializer.INSTANCE, var119);
                           var2 |= 4096;
                           var58 = var50;
                           var50 = var95;
                           var119 = var98;
                           var24 = var113;
                           var15 = var19;
                           var113 = var18;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var12 = var21;
                           var111 = var381;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           break label55;
                        case 13:
                           val var380: Any = var47.n(var46, 13, EmbedThumbnail.$serializer.INSTANCE, var21);
                           var2 |= 8192;
                           var58 = var50;
                           var50 = var95;
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var12 = var380;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           var24 = var113;
                           break label55;
                        case 14:
                           val var379: Any = var47.n(var46, 14, a2.a, var20);
                           var2 |= 16384;
                           var58 = var50;
                           var50 = var95;
                           var24 = var113;
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var12 = var21;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var379;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           break label55;
                        case 15:
                           val var378: Any = var47.n(var46, 15, a2.a, var22);
                           var2 |= 32768;
                           var58 = var50;
                           var50 = var95;
                           var24 = var113;
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var12 = var21;
                           var106 = var20;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var378;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           break label55;
                        case 16:
                           val var377: Any = var47.n(var46, 16, a2.a, var23);
                           var2 |= 65536;
                           var58 = var50;
                           var50 = var95;
                           var23 = var17;
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var12 = var21;
                           var106 = var20;
                           var104 = var22;
                           var95 = var58;
                           var98 = var24;
                           var9 = var377;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var24 = var113;
                           break label55;
                        case 17:
                           val var376: Any = var47.n(var46, 17, h.a, var24);
                           var2 |= 131072;
                           var58 = var50;
                           var50 = var95;
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var12 = var21;
                           var106 = var20;
                           var104 = var22;
                           var9 = var23;
                           var95 = var58;
                           var98 = var376;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           var24 = var113;
                           break label55;
                        case 18:
                           var95 = var47.n(var46, 18, EmbedFooter.$serializer.INSTANCE, var95);
                           var2 |= 262144;
                           var58 = var50;
                           var15 = var19;
                           var113 = var18;
                           var111 = var119;
                           var12 = var21;
                           var106 = var20;
                           var104 = var22;
                           var9 = var23;
                           var98 = var24;
                           var50 = var95;
                           var95 = var58;
                           var119 = var98;
                           var17 = var12;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var111;
                           var22 = var15;
                           var23 = var17;
                           var24 = var113;
                           break label55;
                        case 19:
                           var25 = var47.n(var46, 19, a2.a, var25);
                           var2 |= 524288;
                           var35 = var58;
                           var58 = var50;
                           break;
                        case 20:
                           var35 = var47.n(var46, 20, a2.a, var58);
                           var2 |= 1048576;
                           var58 = var50;
                           break;
                        case 21:
                           var30 = var47.n(var46, 21, a2.a, var30);
                           var2 |= 2097152;
                           var35 = var50;
                           break label54;
                        case 22:
                           var35 = var47.n(var46, 22, a2.a, var50);
                           var2 |= 4194304;
                           break label54;
                        case 23:
                           var26 = var47.n(var46, 23, EmbedFailureState.Serializer.INSTANCE, var26);
                           var2 |= 8388608;
                           var35 = var50;
                           break label54;
                        case 24:
                           var27 = var47.n(var46, 24, m0.a, var27);
                           var2 |= 16777216;
                           var35 = var50;
                           break label54;
                        case 25:
                           var166 = var47.n(var46, 25, m0.a, var166);
                           var2 |= 33554432;
                           var35 = var50;
                           break label54;
                        case 26:
                           var33 = var47.n(var46, 26, m0.a, var33);
                           var2 |= 67108864;
                           var35 = var50;
                           break label54;
                        case 27:
                           var3 = var47.i(var46, 27);
                           var2 |= 134217728;
                           var35 = var50;
                           break label54;
                        case 28:
                           var32 = var47.n(var46, 28, m0.a, var32);
                           var2 |= 268435456;
                           var35 = var50;
                           break label54;
                        case 29:
                           var28 = var47.n(var46, 29, a2.a, var28);
                           var2 |= 536870912;
                           var35 = var50;
                           break label54;
                        case 30:
                           var29 = var47.n(var46, 30, a2.a, var29);
                           var2 |= 1073741824;
                           var35 = var50;
                           break label54;
                        default:
                           throw new n(var5);
                     }

                     var15 = var19;
                     var113 = var18;
                     var111 = var119;
                     var12 = var21;
                     var106 = var20;
                     var104 = var22;
                     var9 = var23;
                     var98 = var24;
                     var50 = var95;
                     var95 = var35;
                     var119 = var98;
                     var17 = var12;
                     var18 = var104;
                     var19 = var9;
                     var20 = var106;
                     var21 = var111;
                     var22 = var15;
                     var23 = var17;
                     var24 = var113;
                     break label55;
                  }

                  var15 = var19;
                  var113 = var18;
                  var111 = var119;
                  var12 = var21;
                  var106 = var20;
                  var104 = var22;
                  var9 = var23;
                  var98 = var24;
                  var50 = var95;
                  var58 = var35;
                  var95 = var58;
                  var119 = var98;
                  var17 = var12;
                  var18 = var104;
                  var19 = var9;
                  var20 = var106;
                  var21 = var111;
                  var22 = var15;
                  var23 = var17;
                  var24 = var113;
               }

               var12 = var17;
               var104 = var18;
               var9 = var19;
               var106 = var20;
               var111 = var21;
               var15 = var22;
               var17 = var23;
               var113 = var24;
               var95 = var50;
               var50 = var58;
               var58 = var95;
               var24 = var98;
               var98 = var119;
               var19 = var15;
               var18 = var113;
               var119 = var111;
               var21 = var12;
               var20 = var106;
               var22 = var104;
               var23 = var9;
            }

            var12 = var15;
            var22 = var18;
            var33 = var119;
            var36 = var113;
            var40 = var50;
            var119 = var166;
            var18 = var9;
            var9 = var17;
            var37 = var33;
            var166 = var32;
            var50 = var12;
            var39 = var19;
            var23 = var21;
            var35 = var22;
            var32 = var23;
            var113 = var24;
            var24 = var58;
            var19 = var95;
            var38 = var29;
            var21 = var20;
            var17 = var111;
            var15 = var98;
            var20 = var104;
            var29 = var106;
         }

         var47.c(var46);
         return new Embed(
            var2,
            var34 as EmbedType,
            var15 as java.lang.String,
            var50 as EmbedAuthor,
            var20 as EmbedProvider,
            var18 as java.lang.String,
            var29 as StructurableText,
            var17 as java.util.List,
            var12 as java.lang.String,
            var9 as java.lang.String,
            var36 as StructurableText,
            var39 as EmbedMedia,
            var22 as java.util.List,
            var33 as EmbedMedia,
            var23 as EmbedThumbnail,
            var21 as java.lang.String,
            var35 as java.lang.String,
            var32 as java.lang.String,
            var113 as java.lang.Boolean,
            var19 as EmbedFooter,
            var25 as java.lang.String,
            var24 as java.lang.String,
            var30 as java.lang.String,
            var40 as java.lang.String,
            var26 as EmbedFailureState,
            var27 as Integer,
            var119 as Integer,
            var37 as Integer,
            var3,
            var166 as Integer,
            var28 as java.lang.String,
            var38 as java.lang.String,
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
