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
      val var5: java.lang.String = this.id;
      val var20: EmbedAuthor = this.author;
      val var13: EmbedProvider = this.provider;
      val var10: java.lang.String = this.rawTitle;
      val var17: StructurableText = this.title;
      val var29: java.util.List = this.fields;
      val var7: java.lang.String = this.url;
      val var21: java.lang.String = this.rawDescription;
      val var18: StructurableText = this.description;
      val var23: EmbedMedia = this.image;
      val var24: java.util.List = this.images;
      val var26: EmbedMedia = this.video;
      val var27: EmbedThumbnail = this.thumbnail;
      val var25: java.lang.String = this.numAttachments;
      val var11: java.lang.String = this.attachmentsSize;
      val var30: java.lang.String = this.messageSendError;
      val var19: java.lang.Boolean = this.disableBackgroundColor;
      val var3: EmbedFooter = this.footer;
      val var4: java.lang.String = this.spoiler;
      val var28: java.lang.String = this.obscure;
      val var2: java.lang.String = this.obscureAwaitingScan;
      val var8: java.lang.String = this.iconURL;
      val var9: EmbedFailureState = this.failureState;
      val var22: Int = this.providerColor;
      val var16: Int = this.borderLeftColor;
      val var14: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var6: Int = this.backgroundColor;
      val var12: StringBuilder = new StringBuilder();
      var12.append("Embed(type=");
      var12.append(var15);
      var12.append(", id=");
      var12.append(var5);
      var12.append(", author=");
      var12.append(var20);
      var12.append(", provider=");
      var12.append(var13);
      var12.append(", rawTitle=");
      var12.append(var10);
      var12.append(", title=");
      var12.append(var17);
      var12.append(", fields=");
      var12.append(var29);
      var12.append(", url=");
      var12.append(var7);
      var12.append(", rawDescription=");
      var12.append(var21);
      var12.append(", description=");
      var12.append(var18);
      var12.append(", image=");
      var12.append(var23);
      var12.append(", images=");
      var12.append(var24);
      var12.append(", video=");
      var12.append(var26);
      var12.append(", thumbnail=");
      var12.append(var27);
      var12.append(", numAttachments=");
      var12.append(var25);
      var12.append(", attachmentsSize=");
      var12.append(var11);
      var12.append(", messageSendError=");
      var12.append(var30);
      var12.append(", disableBackgroundColor=");
      var12.append(var19);
      var12.append(", footer=");
      var12.append(var3);
      var12.append(", spoiler=");
      var12.append(var4);
      var12.append(", obscure=");
      var12.append(var28);
      var12.append(", obscureAwaitingScan=");
      var12.append(var2);
      var12.append(", iconURL=");
      var12.append(var8);
      var12.append(", failureState=");
      var12.append(var9);
      var12.append(", providerColor=");
      var12.append(var22);
      var12.append(", borderLeftColor=");
      var12.append(var16);
      var12.append(", headerTextColor=");
      var12.append(var14);
      var12.append(", bodyTextColor=");
      var12.append(var1);
      var12.append(", backgroundColor=");
      var12.append(var6);
      var12.append(")");
      return var12.toString();
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
         val var6: KSerializer = EmbedType.Companion.serializer();
         val var3: a2 = a2.a;
         val var2: KSerializer = a.u(a2.a);
         val var1: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var4: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var8: KSerializer = a.u(var3);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var7: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var10: KSerializer = a.u(new xk.f(EmbedField.$serializer.INSTANCE));
         val var9: KSerializer = a.u(var3);
         val var5: KSerializer = a.u(var3);
         val var27: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var12: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var13: KSerializer = a.u(new xk.f(var14));
         val var17: KSerializer = a.u(var14);
         val var28: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var21: KSerializer = a.u(var3);
         val var16: KSerializer = a.u(var3);
         val var25: KSerializer = a.u(var3);
         val var22: KSerializer = a.u(h.a);
         val var24: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var20: KSerializer = a.u(var3);
         val var23: KSerializer = a.u(var3);
         val var15: KSerializer = a.u(var3);
         val var18: KSerializer = a.u(var3);
         val var19: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var26: m0 = m0.a;
         return new KSerializer[]{
            var6,
            var2,
            var1,
            var4,
            var8,
            var7,
            var10,
            var9,
            var5,
            var27,
            var12,
            var13,
            var17,
            var28,
            var21,
            var16,
            var25,
            var22,
            var24,
            var20,
            var23,
            var15,
            var18,
            var19,
            a.u(m0.a),
            a.u(var26),
            a.u(var26),
            var26,
            a.u(var26),
            a.u(var3),
            a.u(var3)
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
         var var14: Any;
         var var15: Any;
         var var16: Any;
         var var17: Any;
         var var19: Any;
         var var20: Any;
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
         val var39: Any;
         val var40: Any;
         var var50: Any;
         var var130: Any;
         var var144: Any;
         if (var47.p()) {
            var34 = var47.y(var46, 0, EmbedType.Companion.serializer(), null);
            var130 = a2.a;
            var27 = var47.n(var46, 1, a2.a, null);
            var31 = var47.n(var46, 2, EmbedAuthor.$serializer.INSTANCE, null);
            var17 = var47.n(var46, 3, EmbedProvider.$serializer.INSTANCE, null);
            var24 = var47.n(var46, 4, (DeserializationStrategy)var130, null);
            var50 = StructurableTextSerializer.INSTANCE;
            var16 = var47.n(var46, 5, StructurableTextSerializer.INSTANCE, null);
            var26 = var47.n(var46, 6, new xk.f(EmbedField.$serializer.INSTANCE), null);
            var12 = var47.n(var46, 7, (DeserializationStrategy)var130, null);
            var9 = var47.n(var46, 8, (DeserializationStrategy)var130, null);
            var15 = var47.n(var46, 9, (DeserializationStrategy)var50, null);
            var var6: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
            var37 = var47.n(var46, 10, EmbedMedia.$serializer.INSTANCE, null);
            var50 = var47.n(var46, 11, new xk.f(var6), null);
            val var8: Any = var47.n(var46, 12, var6, null);
            val var7: Any = var47.n(var46, 13, EmbedThumbnail.$serializer.INSTANCE, null);
            var38 = var47.n(var46, 14, (DeserializationStrategy)var130, null);
            var14 = var47.n(var46, 15, (DeserializationStrategy)var130, null);
            var32 = var47.n(var46, 16, (DeserializationStrategy)var130, null);
            val var11: Any = var47.n(var46, 17, h.a, null);
            val var13: Any = var47.n(var46, 18, EmbedFooter.$serializer.INSTANCE, null);
            var25 = var47.n(var46, 19, (DeserializationStrategy)var130, null);
            var39 = var47.n(var46, 20, (DeserializationStrategy)var130, null);
            var30 = var47.n(var46, 21, (DeserializationStrategy)var130, null);
            var144 = var47.n(var46, 22, (DeserializationStrategy)var130, null);
            var28 = var47.n(var46, 23, EmbedFailureState.Serializer.INSTANCE, null);
            var var10: m0 = m0.a;
            var33 = var47.n(var46, 24, m0.a, null);
            var36 = var47.n(var46, 25, var10, null);
            var6 = (EmbedMedia.$serializer)var47.n(var46, 26, var10, null);
            var3 = var47.i(var46, 27);
            var10 = (m0)var47.n(var46, 28, var10, null);
            var35 = var47.n(var46, 29, (DeserializationStrategy)var130, null);
            var29 = var47.n(var46, 30, (DeserializationStrategy)var130, null);
            var2 = Integer.MAX_VALUE;
            var23 = var13;
            var40 = var11;
            var19 = var7;
            var130 = var8;
            var20 = var50;
            var50 = var144;
            var144 = var10;
            var22 = var6;
         } else {
            var var4: Boolean = true;
            var var94: Any = null;
            var50 = null;
            var var57: Any = null;
            var30 = null;
            var31 = null;
            var25 = null;
            var33 = null;
            var32 = null;
            var27 = null;
            var29 = null;
            var26 = null;
            var28 = null;
            var34 = null;
            var var97: Any = null;
            var12 = null;
            var var103: Any = null;
            var9 = null;
            var var105: Any = null;
            var var109: Any = null;
            var15 = null;
            var16 = null;
            var14 = null;
            var19 = null;
            var130 = null;
            var17 = null;
            var144 = null;
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
                           var14 = var130;
                           var109 = var17;
                           var4 = false;
                           var24 = var14;
                           var23 = var16;
                           var22 = var15;
                           var144 = var109;
                           var20 = var105;
                           var19 = var9;
                           var130 = var103;
                           var17 = var12;
                           var16 = var97;
                           var12 = var144;
                           var105 = var20;
                           var103 = var22;
                           var9 = var23;
                           var97 = var24;
                           var94 = var57;
                           var57 = var50;
                           var50 = var94;
                           break label55;
                        case 0:
                           var15 = var19;
                           var14 = var130;
                           var109 = var17;
                           var12 = var144;
                           var105 = var20;
                           var103 = var22;
                           var9 = var23;
                           val var92: KSerializer = EmbedType.Companion.serializer();
                           var16 = var97;
                           var34 = var47.y(var46, 0, var92, var34);
                           var2 |= 1;
                           var57 = var50;
                           var50 = var94;
                           var94 = var57;
                           var97 = var24;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 1:
                           var15 = var19;
                           var14 = var130;
                           var109 = var17;
                           var97 = var47.n(var46, 1, a2.a, var97);
                           var2 |= 2;
                           var24 = var14;
                           var23 = var16;
                           var22 = var15;
                           var144 = var109;
                           var20 = var105;
                           var19 = var9;
                           var130 = var103;
                           var17 = var12;
                           var16 = var97;
                           var12 = var144;
                           var105 = var20;
                           var103 = var22;
                           var9 = var23;
                           var97 = var24;
                           var94 = var57;
                           var57 = var50;
                           var50 = var94;
                           break label55;
                        case 2:
                           var15 = var19;
                           var14 = var130;
                           var109 = var17;
                           var105 = var20;
                           var9 = var23;
                           var130 = var103;
                           var17 = var47.n(var46, 2, EmbedAuthor.$serializer.INSTANCE, var12);
                           var2 |= 4;
                           var57 = var50;
                           var50 = var94;
                           var16 = var97;
                           var94 = var57;
                           var97 = var24;
                           var103 = var22;
                           var12 = var144;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 3:
                           var15 = var19;
                           var14 = var130;
                           var109 = var17;
                           var105 = var20;
                           var19 = var9;
                           var130 = var47.n(var46, 3, EmbedProvider.$serializer.INSTANCE, var103);
                           var2 |= 8;
                           var57 = var50;
                           var50 = var94;
                           var16 = var97;
                           var17 = var12;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var12 = var144;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 4:
                           var15 = var19;
                           var14 = var130;
                           var109 = var17;
                           var20 = var105;
                           var19 = var47.n(var46, 4, a2.a, var9);
                           var2 |= 16;
                           var57 = var50;
                           var50 = var94;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var105 = var20;
                           var12 = var144;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 5:
                           var15 = var19;
                           var14 = var130;
                           var144 = var109;
                           var20 = var47.n(var46, 5, StructurableTextSerializer.INSTANCE, var105);
                           var2 |= 32;
                           var57 = var50;
                           var50 = var94;
                           var19 = var9;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var105 = var20;
                           var12 = var144;
                           var109 = var17;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 6:
                           var14 = var130;
                           val var82: xk.f = new xk.f(EmbedField.$serializer.INSTANCE);
                           var22 = var15;
                           val var153: Any = var47.n(var46, 6, var82, var109);
                           var2 |= 64;
                           var57 = var50;
                           var50 = var94;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var105 = var20;
                           var12 = var144;
                           var109 = var17;
                           var15 = var19;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var153;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 7:
                           var14 = var130;
                           var23 = var16;
                           var22 = var47.n(var46, 7, a2.a, var15);
                           var2 |= 128;
                           var57 = var50;
                           var50 = var94;
                           var16 = var97;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var105 = var20;
                           var12 = var144;
                           var109 = var17;
                           var15 = var19;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var24 = var14;
                           break label55;
                        case 8:
                           var24 = var14;
                           var23 = var47.n(var46, 8, a2.a, var16);
                           var2 |= 256;
                           var57 = var50;
                           var50 = var94;
                           var16 = var97;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var105 = var20;
                           var12 = var144;
                           var109 = var17;
                           var14 = var130;
                           var15 = var19;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           break label55;
                        case 9:
                           var24 = var47.n(var46, 9, StructurableTextSerializer.INSTANCE, var14);
                           var2 |= 512;
                           var57 = var50;
                           var50 = var94;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var105 = var20;
                           var12 = var144;
                           var109 = var17;
                           var14 = var130;
                           var15 = var19;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           break label55;
                        case 10:
                           var19 = var47.n(var46, 10, EmbedMedia.$serializer.INSTANCE, var19);
                           var2 |= 1024;
                           var57 = var50;
                           var50 = var94;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var105 = var20;
                           var12 = var144;
                           var109 = var17;
                           var14 = var130;
                           var15 = var19;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 11:
                           var130 = var47.n(var46, 11, new xk.f(EmbedMedia.$serializer.INSTANCE), var130);
                           var2 |= 2048;
                           var57 = var50;
                           var50 = var94;
                           var15 = var19;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var105 = var20;
                           var12 = var144;
                           var109 = var17;
                           var14 = var130;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 12:
                           val var384: Any = var47.n(var46, 12, EmbedMedia.$serializer.INSTANCE, var17);
                           var2 |= 4096;
                           var57 = var50;
                           var50 = var94;
                           var15 = var19;
                           var14 = var130;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var105 = var20;
                           var12 = var144;
                           var109 = var384;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 13:
                           val var383: Any = var47.n(var46, 13, EmbedThumbnail.$serializer.INSTANCE, var144);
                           var2 |= 8192;
                           var57 = var50;
                           var50 = var94;
                           var144 = var109;
                           var15 = var19;
                           var14 = var130;
                           var109 = var17;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var105 = var20;
                           var12 = var383;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 14:
                           val var382: Any = var47.n(var46, 14, a2.a, var20);
                           var2 |= 16384;
                           var57 = var50;
                           var50 = var94;
                           var15 = var19;
                           var14 = var130;
                           var109 = var17;
                           var12 = var144;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var22;
                           var105 = var382;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 15:
                           val var381: Any = var47.n(var46, 15, a2.a, var22);
                           var2 |= 32768;
                           var57 = var50;
                           var50 = var94;
                           var15 = var19;
                           var14 = var130;
                           var109 = var17;
                           var12 = var144;
                           var105 = var20;
                           var94 = var57;
                           var97 = var24;
                           var9 = var23;
                           var103 = var381;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 16:
                           val var380: Any = var47.n(var46, 16, a2.a, var23);
                           var2 |= 65536;
                           var57 = var50;
                           var50 = var94;
                           var15 = var19;
                           var14 = var130;
                           var109 = var17;
                           var12 = var144;
                           var105 = var20;
                           var103 = var22;
                           var94 = var57;
                           var97 = var24;
                           var9 = var380;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 17:
                           val var379: Any = var47.n(var46, 17, h.a, var24);
                           var2 |= 131072;
                           var57 = var50;
                           var50 = var94;
                           var15 = var19;
                           var14 = var130;
                           var109 = var17;
                           var12 = var144;
                           var105 = var20;
                           var103 = var22;
                           var9 = var23;
                           var94 = var57;
                           var97 = var379;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 18:
                           var94 = var47.n(var46, 18, EmbedFooter.$serializer.INSTANCE, var94);
                           var2 |= 262144;
                           var57 = var50;
                           var15 = var19;
                           var14 = var130;
                           var109 = var17;
                           var12 = var144;
                           var105 = var20;
                           var103 = var22;
                           var9 = var23;
                           var97 = var24;
                           var50 = var94;
                           var94 = var57;
                           var16 = var97;
                           var17 = var12;
                           var130 = var103;
                           var19 = var9;
                           var20 = var105;
                           var144 = var109;
                           var22 = var15;
                           var23 = var16;
                           var24 = var14;
                           break label55;
                        case 19:
                           var25 = var47.n(var46, 19, a2.a, var25);
                           var2 |= 524288;
                           var35 = var57;
                           var57 = var50;
                           break;
                        case 20:
                           var35 = var47.n(var46, 20, a2.a, var57);
                           var2 |= 1048576;
                           var57 = var50;
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
                           var28 = var47.n(var46, 23, EmbedFailureState.Serializer.INSTANCE, var28);
                           var2 |= 8388608;
                           var35 = var50;
                           break label54;
                        case 24:
                           var26 = var47.n(var46, 24, m0.a, var26);
                           var2 |= 16777216;
                           var35 = var50;
                           break label54;
                        case 25:
                           var31 = var47.n(var46, 25, m0.a, var31);
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
                           var27 = var47.n(var46, 29, a2.a, var27);
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
                     var14 = var130;
                     var109 = var17;
                     var12 = var144;
                     var105 = var20;
                     var103 = var22;
                     var9 = var23;
                     var97 = var24;
                     var50 = var94;
                     var94 = var35;
                     var16 = var97;
                     var17 = var12;
                     var130 = var103;
                     var19 = var9;
                     var20 = var105;
                     var144 = var109;
                     var22 = var15;
                     var23 = var16;
                     var24 = var14;
                     break label55;
                  }

                  var15 = var19;
                  var14 = var130;
                  var109 = var17;
                  var12 = var144;
                  var105 = var20;
                  var103 = var22;
                  var9 = var23;
                  var97 = var24;
                  var50 = var94;
                  var57 = var35;
                  var94 = var57;
                  var16 = var97;
                  var17 = var12;
                  var130 = var103;
                  var19 = var9;
                  var20 = var105;
                  var144 = var109;
                  var22 = var15;
                  var23 = var16;
                  var24 = var14;
               }

               var12 = var17;
               var103 = var130;
               var9 = var19;
               var105 = var20;
               var109 = var144;
               var15 = var22;
               var14 = var24;
               var94 = var50;
               var50 = var57;
               var57 = var94;
               var24 = var97;
               var97 = var16;
               var16 = var23;
               var19 = var15;
               var130 = var14;
               var17 = var109;
               var144 = var12;
               var20 = var105;
               var22 = var103;
               var23 = var9;
            }

            var12 = var15;
            var22 = var33;
            var144 = var32;
            var38 = var20;
            var9 = var16;
            var36 = var31;
            var31 = var12;
            var37 = var19;
            var20 = var130;
            var130 = var17;
            var19 = var144;
            var14 = var22;
            var32 = var23;
            var40 = var24;
            var39 = var57;
            var23 = var94;
            var33 = var26;
            var35 = var27;
            var15 = var14;
            var26 = var109;
            var27 = var97;
            var24 = var9;
            var17 = var103;
            var16 = var105;
         }

         var47.c(var46);
         return new Embed(
            var2,
            var34 as EmbedType,
            var27 as java.lang.String,
            var31 as EmbedAuthor,
            var17 as EmbedProvider,
            var24 as java.lang.String,
            var16 as StructurableText,
            var26 as java.util.List,
            var12 as java.lang.String,
            var9 as java.lang.String,
            var15 as StructurableText,
            var37 as EmbedMedia,
            var20 as java.util.List,
            var130 as EmbedMedia,
            var19 as EmbedThumbnail,
            var38 as java.lang.String,
            var14 as java.lang.String,
            var32 as java.lang.String,
            var40 as java.lang.Boolean,
            var23 as EmbedFooter,
            var25 as java.lang.String,
            var39 as java.lang.String,
            var30 as java.lang.String,
            var50 as java.lang.String,
            var28 as EmbedFailureState,
            var33 as Integer,
            var36 as Integer,
            var22 as Integer,
            var3,
            var144 as Integer,
            var35 as java.lang.String,
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
