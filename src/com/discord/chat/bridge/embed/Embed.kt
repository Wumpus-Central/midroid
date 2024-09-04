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
      val var11: EmbedType = this.type;
      val var25: java.lang.String = this.id;
      val var4: EmbedAuthor = this.author;
      val var14: EmbedProvider = this.provider;
      val var5: java.lang.String = this.rawTitle;
      val var28: StructurableText = this.title;
      val var19: java.util.List = this.fields;
      val var15: java.lang.String = this.url;
      val var12: java.lang.String = this.rawDescription;
      val var6: StructurableText = this.description;
      val var8: EmbedMedia = this.image;
      val var16: java.util.List = this.images;
      val var26: EmbedMedia = this.video;
      val var18: EmbedThumbnail = this.thumbnail;
      val var17: java.lang.String = this.numAttachments;
      val var27: java.lang.String = this.attachmentsSize;
      val var23: java.lang.String = this.messageSendError;
      val var2: java.lang.Boolean = this.disableBackgroundColor;
      val var22: EmbedFooter = this.footer;
      val var29: java.lang.String = this.spoiler;
      val var20: java.lang.String = this.obscure;
      val var10: java.lang.String = this.obscureAwaitingScan;
      val var7: java.lang.String = this.iconURL;
      val var9: EmbedFailureState = this.failureState;
      val var30: Int = this.providerColor;
      val var3: Int = this.borderLeftColor;
      val var13: Int = this.headerTextColor;
      val var1: Int = this.bodyTextColor;
      val var21: Int = this.backgroundColor;
      val var24: StringBuilder = new StringBuilder();
      var24.append("Embed(type=");
      var24.append(var11);
      var24.append(", id=");
      var24.append(var25);
      var24.append(", author=");
      var24.append(var4);
      var24.append(", provider=");
      var24.append(var14);
      var24.append(", rawTitle=");
      var24.append(var5);
      var24.append(", title=");
      var24.append(var28);
      var24.append(", fields=");
      var24.append(var19);
      var24.append(", url=");
      var24.append(var15);
      var24.append(", rawDescription=");
      var24.append(var12);
      var24.append(", description=");
      var24.append(var6);
      var24.append(", image=");
      var24.append(var8);
      var24.append(", images=");
      var24.append(var16);
      var24.append(", video=");
      var24.append(var26);
      var24.append(", thumbnail=");
      var24.append(var18);
      var24.append(", numAttachments=");
      var24.append(var17);
      var24.append(", attachmentsSize=");
      var24.append(var27);
      var24.append(", messageSendError=");
      var24.append(var23);
      var24.append(", disableBackgroundColor=");
      var24.append(var2);
      var24.append(", footer=");
      var24.append(var22);
      var24.append(", spoiler=");
      var24.append(var29);
      var24.append(", obscure=");
      var24.append(var20);
      var24.append(", obscureAwaitingScan=");
      var24.append(var10);
      var24.append(", iconURL=");
      var24.append(var7);
      var24.append(", failureState=");
      var24.append(var9);
      var24.append(", providerColor=");
      var24.append(var30);
      var24.append(", borderLeftColor=");
      var24.append(var3);
      var24.append(", headerTextColor=");
      var24.append(var13);
      var24.append(", bodyTextColor=");
      var24.append(var1);
      var24.append(", backgroundColor=");
      var24.append(var21);
      var24.append(")");
      return var24.toString();
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
         val var7: a2 = a2.a;
         val var6: KSerializer = a.u(a2.a);
         val var10: KSerializer = a.u(EmbedAuthor.$serializer.INSTANCE);
         val var3: KSerializer = a.u(EmbedProvider.$serializer.INSTANCE);
         val var8: KSerializer = a.u(var7);
         val var11: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var5: KSerializer = a.u(StructurableTextSerializer.INSTANCE);
         val var9: KSerializer = a.u(new xk.f(EmbedField.$serializer.INSTANCE));
         val var1: KSerializer = a.u(var7);
         val var2: KSerializer = a.u(var7);
         val var12: KSerializer = a.u(var11);
         val var14: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
         val var13: KSerializer = a.u(EmbedMedia.$serializer.INSTANCE);
         val var27: KSerializer = a.u(new xk.f(var14));
         val var28: KSerializer = a.u(var14);
         val var19: KSerializer = a.u(EmbedThumbnail.$serializer.INSTANCE);
         val var25: KSerializer = a.u(var7);
         val var15: KSerializer = a.u(var7);
         val var20: KSerializer = a.u(var7);
         val var24: KSerializer = a.u(h.a);
         val var26: KSerializer = a.u(EmbedFooter.$serializer.INSTANCE);
         val var23: KSerializer = a.u(var7);
         val var18: KSerializer = a.u(var7);
         val var17: KSerializer = a.u(var7);
         val var21: KSerializer = a.u(var7);
         val var22: KSerializer = a.u(EmbedFailureState.Serializer.INSTANCE);
         val var16: m0 = m0.a;
         return new KSerializer[]{
            var4,
            var6,
            var10,
            var3,
            var8,
            var5,
            var9,
            var1,
            var2,
            var12,
            var13,
            var27,
            var28,
            var19,
            var25,
            var15,
            var20,
            var24,
            var26,
            var23,
            var18,
            var17,
            var21,
            var22,
            a.u(m0.a),
            a.u(var16),
            a.u(var16),
            var16,
            a.u(var16),
            a.u(var7),
            a.u(var7)
         };
      }

      public open fun deserialize(decoder: Decoder): Embed {
         r.h(var1, "decoder");
         val var46: SerialDescriptor = this.getDescriptor();
         val var47: c = var1.b(var46);
         var var2: Int;
         var var3: Int;
         var var9: Any;
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
         val var39: Any;
         var var40: Any;
         var var50: Any;
         var var109: Any;
         var var119: Any;
         if (var47.p()) {
            var34 = var47.y(var46, 0, EmbedType.Companion.serializer(), null);
            var119 = a2.a;
            var33 = var47.n(var46, 1, a2.a, null);
            var37 = var47.n(var46, 2, EmbedAuthor.$serializer.INSTANCE, null);
            var19 = var47.n(var46, 3, EmbedProvider.$serializer.INSTANCE, null);
            var31 = var47.n(var46, 4, (DeserializationStrategy)var119, null);
            var50 = StructurableTextSerializer.INSTANCE;
            var15 = var47.n(var46, 5, StructurableTextSerializer.INSTANCE, null);
            var17 = var47.n(var46, 6, new xk.f(EmbedField.$serializer.INSTANCE), null);
            var109 = var47.n(var46, 7, (DeserializationStrategy)var119, null);
            val var7: Any = var47.n(var46, 8, (DeserializationStrategy)var119, null);
            var20 = var47.n(var46, 9, (DeserializationStrategy)var50, null);
            var var6: EmbedMedia.$serializer = EmbedMedia.$serializer.INSTANCE;
            var38 = var47.n(var46, 10, EmbedMedia.$serializer.INSTANCE, null);
            var50 = var47.n(var46, 11, new xk.f(var6), null);
            var9 = var47.n(var46, 12, var6, null);
            val var8: Any = var47.n(var46, 13, EmbedThumbnail.$serializer.INSTANCE, null);
            var14 = var47.n(var46, 14, (DeserializationStrategy)var119, null);
            var35 = var47.n(var46, 15, (DeserializationStrategy)var119, null);
            var40 = var47.n(var46, 16, (DeserializationStrategy)var119, null);
            val var11: Any = var47.n(var46, 17, h.a, null);
            val var13: Any = var47.n(var46, 18, EmbedFooter.$serializer.INSTANCE, null);
            var25 = var47.n(var46, 19, (DeserializationStrategy)var119, null);
            var23 = var47.n(var46, 20, (DeserializationStrategy)var119, null);
            var30 = var47.n(var46, 21, (DeserializationStrategy)var119, null);
            var32 = var47.n(var46, 22, (DeserializationStrategy)var119, null);
            var29 = var47.n(var46, 23, EmbedFailureState.Serializer.INSTANCE, null);
            var var10: m0 = m0.a;
            var27 = var47.n(var46, 24, m0.a, null);
            var39 = var47.n(var46, 25, var10, null);
            var6 = (EmbedMedia.$serializer)var47.n(var46, 26, var10, null);
            var3 = var47.i(var46, 27);
            var10 = (m0)var47.n(var46, 28, var10, null);
            var28 = var47.n(var46, 29, (DeserializationStrategy)var119, null);
            var26 = var47.n(var46, 30, (DeserializationStrategy)var119, null);
            var2 = Integer.MAX_VALUE;
            var21 = var13;
            var24 = var11;
            var119 = var8;
            var22 = var50;
            var18 = var10;
            var50 = var6;
            var36 = var109;
            var109 = var7;
         } else {
            var var4: Boolean = true;
            var var95: Any = null;
            var50 = null;
            var var58: Any = null;
            var30 = null;
            var31 = null;
            var25 = null;
            var33 = null;
            var32 = null;
            var28 = null;
            var26 = null;
            var27 = null;
            var29 = null;
            var34 = null;
            var var98: Any = null;
            var109 = null;
            var var104: Any = null;
            var9 = null;
            var var106: Any = null;
            var var112: Any = null;
            var15 = null;
            var119 = null;
            var14 = null;
            var19 = null;
            var18 = null;
            var17 = null;
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
                           var14 = var18;
                           var112 = var17;
                           var4 = false;
                           var24 = var14;
                           var23 = var119;
                           var22 = var15;
                           var21 = var112;
                           var20 = var106;
                           var19 = var9;
                           var18 = var104;
                           var17 = var109;
                           var119 = var98;
                           var109 = var21;
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
                           var14 = var18;
                           var112 = var17;
                           var109 = var21;
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
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 1:
                           var15 = var19;
                           var14 = var18;
                           var112 = var17;
                           var98 = var47.n(var46, 1, a2.a, var98);
                           var2 |= 2;
                           var24 = var14;
                           var23 = var119;
                           var22 = var15;
                           var21 = var112;
                           var20 = var106;
                           var19 = var9;
                           var18 = var104;
                           var17 = var109;
                           var119 = var98;
                           var109 = var21;
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
                           var14 = var18;
                           var112 = var17;
                           var106 = var20;
                           var9 = var23;
                           var18 = var104;
                           var17 = var47.n(var46, 2, EmbedAuthor.$serializer.INSTANCE, var109);
                           var2 |= 4;
                           var58 = var50;
                           var50 = var95;
                           var119 = var98;
                           var95 = var58;
                           var98 = var24;
                           var104 = var22;
                           var109 = var21;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 3:
                           var15 = var19;
                           var14 = var18;
                           var112 = var17;
                           var106 = var20;
                           var19 = var9;
                           var18 = var47.n(var46, 3, EmbedProvider.$serializer.INSTANCE, var104);
                           var2 |= 8;
                           var58 = var50;
                           var50 = var95;
                           var119 = var98;
                           var17 = var109;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var109 = var21;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 4:
                           var15 = var19;
                           var14 = var18;
                           var112 = var17;
                           var20 = var106;
                           var19 = var47.n(var46, 4, a2.a, var9);
                           var2 |= 16;
                           var58 = var50;
                           var50 = var95;
                           var18 = var104;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var109 = var21;
                           var119 = var98;
                           var17 = var109;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 5:
                           var15 = var19;
                           var14 = var18;
                           var21 = var112;
                           val var149: Any = var47.n(var46, 5, StructurableTextSerializer.INSTANCE, var106);
                           var2 |= 32;
                           var58 = var50;
                           var50 = var95;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var109 = var21;
                           var112 = var17;
                           var119 = var98;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var149;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 6:
                           var14 = var18;
                           val var83: xk.f = new xk.f(EmbedField.$serializer.INSTANCE);
                           var22 = var15;
                           val var153: Any = var47.n(var46, 6, var83, var112);
                           var2 |= 64;
                           var58 = var50;
                           var50 = var95;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var109 = var21;
                           var112 = var17;
                           var15 = var19;
                           var119 = var98;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var153;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 7:
                           var14 = var18;
                           var23 = var119;
                           var22 = var47.n(var46, 7, a2.a, var15);
                           var2 |= 128;
                           var58 = var50;
                           var50 = var95;
                           var119 = var98;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var109 = var21;
                           var112 = var17;
                           var15 = var19;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var24 = var14;
                           break label55;
                        case 8:
                           var24 = var14;
                           var23 = var47.n(var46, 8, a2.a, var119);
                           var2 |= 256;
                           var58 = var50;
                           var50 = var95;
                           var119 = var98;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var109 = var21;
                           var112 = var17;
                           var14 = var18;
                           var15 = var19;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           break label55;
                        case 9:
                           var24 = var47.n(var46, 9, StructurableTextSerializer.INSTANCE, var14);
                           var2 |= 512;
                           var58 = var50;
                           var50 = var95;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var109 = var21;
                           var112 = var17;
                           var14 = var18;
                           var15 = var19;
                           var119 = var98;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           break label55;
                        case 10:
                           var19 = var47.n(var46, 10, EmbedMedia.$serializer.INSTANCE, var19);
                           var2 |= 1024;
                           var58 = var50;
                           var50 = var95;
                           var24 = var14;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var109 = var21;
                           var112 = var17;
                           var14 = var18;
                           var15 = var19;
                           var119 = var98;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           break label55;
                        case 11:
                           var40 = var47.n(var46, 11, new xk.f(EmbedMedia.$serializer.INSTANCE), var18);
                           var2 |= 2048;
                           var58 = var50;
                           var50 = var95;
                           var15 = var19;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var109 = var21;
                           var112 = var17;
                           var14 = var40;
                           var119 = var98;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 12:
                           val var377: Any = var47.n(var46, 12, EmbedMedia.$serializer.INSTANCE, var17);
                           var2 |= 4096;
                           var58 = var50;
                           var50 = var95;
                           var17 = var109;
                           var15 = var19;
                           var14 = var18;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var109 = var21;
                           var112 = var377;
                           var119 = var98;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 13:
                           val var376: Any = var47.n(var46, 13, EmbedThumbnail.$serializer.INSTANCE, var21);
                           var2 |= 8192;
                           var58 = var50;
                           var50 = var95;
                           var15 = var19;
                           var14 = var18;
                           var112 = var17;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var20;
                           var109 = var376;
                           var119 = var98;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 14:
                           val var375: Any = var47.n(var46, 14, a2.a, var20);
                           var2 |= 16384;
                           var58 = var50;
                           var50 = var95;
                           var20 = var106;
                           var15 = var19;
                           var14 = var18;
                           var112 = var17;
                           var109 = var21;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var22;
                           var106 = var375;
                           var119 = var98;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 15:
                           val var374: Any = var47.n(var46, 15, a2.a, var22);
                           var2 |= 32768;
                           var58 = var50;
                           var50 = var95;
                           var23 = var119;
                           var15 = var19;
                           var14 = var18;
                           var112 = var17;
                           var109 = var21;
                           var106 = var20;
                           var95 = var58;
                           var98 = var24;
                           var9 = var23;
                           var104 = var374;
                           var119 = var98;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var24 = var14;
                           break label55;
                        case 16:
                           val var373: Any = var47.n(var46, 16, a2.a, var23);
                           var2 |= 65536;
                           var58 = var50;
                           var50 = var95;
                           var15 = var19;
                           var14 = var18;
                           var112 = var17;
                           var109 = var21;
                           var106 = var20;
                           var104 = var22;
                           var95 = var58;
                           var98 = var24;
                           var9 = var373;
                           var119 = var98;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 17:
                           val var372: Any = var47.n(var46, 17, h.a, var24);
                           var2 |= 131072;
                           var58 = var50;
                           var50 = var95;
                           var15 = var19;
                           var14 = var18;
                           var112 = var17;
                           var109 = var21;
                           var106 = var20;
                           var104 = var22;
                           var9 = var23;
                           var95 = var58;
                           var98 = var372;
                           var119 = var98;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
                           break label55;
                        case 18:
                           var95 = var47.n(var46, 18, EmbedFooter.$serializer.INSTANCE, var95);
                           var2 |= 262144;
                           var58 = var50;
                           var15 = var19;
                           var14 = var18;
                           var112 = var17;
                           var109 = var21;
                           var106 = var20;
                           var104 = var22;
                           var9 = var23;
                           var98 = var24;
                           var50 = var95;
                           var95 = var58;
                           var119 = var98;
                           var17 = var109;
                           var18 = var104;
                           var19 = var9;
                           var20 = var106;
                           var21 = var112;
                           var22 = var15;
                           var23 = var119;
                           var24 = var14;
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
                           var29 = var47.n(var46, 23, EmbedFailureState.Serializer.INSTANCE, var29);
                           var2 |= 8388608;
                           var35 = var50;
                           break label54;
                        case 24:
                           var27 = var47.n(var46, 24, m0.a, var27);
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
                           var28 = var47.n(var46, 29, a2.a, var28);
                           var2 |= 536870912;
                           var35 = var50;
                           break label54;
                        case 30:
                           var26 = var47.n(var46, 30, a2.a, var26);
                           var2 |= 1073741824;
                           var35 = var50;
                           break label54;
                        default:
                           throw new n(var5);
                     }

                     var15 = var19;
                     var14 = var18;
                     var112 = var17;
                     var109 = var21;
                     var106 = var20;
                     var104 = var22;
                     var9 = var23;
                     var98 = var24;
                     var50 = var95;
                     var95 = var35;
                     var119 = var98;
                     var17 = var109;
                     var18 = var104;
                     var19 = var9;
                     var20 = var106;
                     var21 = var112;
                     var22 = var15;
                     var23 = var119;
                     var24 = var14;
                     break label55;
                  }

                  var15 = var19;
                  var14 = var18;
                  var112 = var17;
                  var109 = var21;
                  var106 = var20;
                  var104 = var22;
                  var9 = var23;
                  var98 = var24;
                  var50 = var95;
                  var58 = var35;
                  var95 = var58;
                  var119 = var98;
                  var17 = var109;
                  var18 = var104;
                  var19 = var9;
                  var20 = var106;
                  var21 = var112;
                  var22 = var15;
                  var23 = var119;
                  var24 = var14;
               }

               var109 = var17;
               var104 = var18;
               var9 = var19;
               var106 = var20;
               var112 = var21;
               var15 = var22;
               var119 = var23;
               var14 = var24;
               var95 = var50;
               var50 = var58;
               var58 = var95;
               var24 = var98;
               var98 = var119;
               var19 = var15;
               var18 = var14;
               var17 = var112;
               var21 = var109;
               var20 = var106;
               var22 = var104;
               var23 = var9;
            }

            var37 = var109;
            var36 = var15;
            var109 = var119;
            var35 = var22;
            var119 = var21;
            var22 = var18;
            var18 = var32;
            var32 = var50;
            var39 = var31;
            var31 = var9;
            var50 = var33;
            var38 = var19;
            var9 = var17;
            var40 = var23;
            var23 = var58;
            var21 = var95;
            var20 = var14;
            var14 = var20;
            var17 = var112;
            var33 = var98;
            var19 = var104;
            var15 = var106;
         }

         var47.c(var46);
         return new Embed(
            var2,
            var34 as EmbedType,
            var33 as java.lang.String,
            var37 as EmbedAuthor,
            var19 as EmbedProvider,
            var31 as java.lang.String,
            var15 as StructurableText,
            var17 as java.util.List,
            var36 as java.lang.String,
            var109 as java.lang.String,
            var20 as StructurableText,
            var38 as EmbedMedia,
            var22 as java.util.List,
            var9 as EmbedMedia,
            var119 as EmbedThumbnail,
            var14 as java.lang.String,
            var35 as java.lang.String,
            var40 as java.lang.String,
            var24 as java.lang.Boolean,
            var21 as EmbedFooter,
            var25 as java.lang.String,
            var23 as java.lang.String,
            var30 as java.lang.String,
            var32 as java.lang.String,
            var29 as EmbedFailureState,
            var27 as Int,
            var39 as Int,
            var50 as Int,
            var3,
            var18 as Int,
            var28 as java.lang.String,
            var26 as java.lang.String,
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
