package com.discord.chat.bridge.botuikit

import ca.f
import ca.n
import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.misc.utilities.ids.IdUtilsKt
import da.a
import fa.C0
import fa.G
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class MediaGalleryItem(media: UnfurledMediaItem,
      mediaType: MediaGalleryItemType,
      videoPreviewUrl: String? = null,
      isSpoiler: Boolean,
      spoilerDescription: String?,
      isObscure: Boolean,
      isObscureAwaitingScan: Boolean,
      obscureDescription: String?,
      obscureHideControls: Boolean,
      obscureIsOpaque: Boolean,
      verifyAge: Boolean?,
      showDescription: Boolean,
      description: String? = null,
      descriptionHint: String,
      accessibilityRole: String,
      portalIdString: String?
   ) :
   SpoilerableData {
   public final val accessibilityRole: String
   public final val description: String?
   public final val descriptionHint: String
   public final val isObscure: Boolean
   public final val isObscureAwaitingScan: Boolean
   public final val isSpoiler: Boolean
   public final val media: UnfurledMediaItem
   public final val mediaType: MediaGalleryItemType
   public final val obscureDescription: String?
   public final val obscureHideControls: Boolean
   public final val obscureIsOpaque: Boolean
   public open val obscureOrNull: String?

   public final val portalId: Double?
      public final get() {
         val var2: java.lang.Double;
         if (this.portalIdString != null) {
            var2 = (double)IdUtilsKt.convertToId(this.portalIdString);
         } else {
            var2 = null;
         }

         return var2;
      }


   public final val portalIdString: String?
   public final val showDescription: Boolean
   public final val spoilerDescription: String?
   public open val spoilerOrNull: String?
   public final val verifyAge: Boolean?
   public final val videoPreviewUrl: String?

   init {
      var var20: java.lang.String = var5;
      var var19: java.lang.String = var8;
      q.h(var1, "media");
      q.h(var2, "mediaType");
      q.h(var14, "descriptionHint");
      q.h(var15, "accessibilityRole");
      super();
      this.media = var1;
      this.mediaType = var2;
      this.videoPreviewUrl = var3;
      this.isSpoiler = var4;
      this.spoilerDescription = var5;
      this.isObscure = var6;
      this.isObscureAwaitingScan = var7;
      this.obscureDescription = var8;
      this.obscureHideControls = var9;
      this.obscureIsOpaque = var10;
      this.verifyAge = var11;
      this.showDescription = var12;
      this.description = var13;
      this.descriptionHint = var14;
      this.accessibilityRole = var15;
      this.portalIdString = var16;
      var var17: Boolean;
      if (var5 != null && !h.d0(var5)) {
         var17 = false;
      } else {
         var17 = true;
      }

      if (var17) {
         var20 = null;
      }

      this.spoilerOrNull = var20;
      var17 = true;
      if (var8 != null) {
         if (h.d0(var8)) {
            var17 = true;
         } else {
            var17 = false;
         }
      }

      if (var17) {
         var19 = null;
      }

      this.obscureOrNull = var19;
   }

   public operator fun component1(): UnfurledMediaItem {
      return this.media;
   }

   public operator fun component10(): Boolean {
      return this.obscureIsOpaque;
   }

   public operator fun component11(): Boolean? {
      return this.verifyAge;
   }

   public operator fun component12(): Boolean {
      return this.showDescription;
   }

   public operator fun component13(): String? {
      return this.description;
   }

   public operator fun component14(): String {
      return this.descriptionHint;
   }

   public operator fun component15(): String {
      return this.accessibilityRole;
   }

   public operator fun component16(): String? {
      return this.portalIdString;
   }

   public operator fun component2(): MediaGalleryItemType {
      return this.mediaType;
   }

   public operator fun component3(): String? {
      return this.videoPreviewUrl;
   }

   public operator fun component4(): Boolean {
      return this.isSpoiler;
   }

   public operator fun component5(): String? {
      return this.spoilerDescription;
   }

   public operator fun component6(): Boolean {
      return this.isObscure;
   }

   public operator fun component7(): Boolean {
      return this.isObscureAwaitingScan;
   }

   public operator fun component8(): String? {
      return this.obscureDescription;
   }

   public operator fun component9(): Boolean {
      return this.obscureHideControls;
   }

   public fun copy(
      media: UnfurledMediaItem = var0.media,
      mediaType: MediaGalleryItemType = var0.mediaType,
      videoPreviewUrl: String? = var0.videoPreviewUrl,
      isSpoiler: Boolean = var0.isSpoiler,
      spoilerDescription: String? = var0.spoilerDescription,
      isObscure: Boolean = var0.isObscure,
      isObscureAwaitingScan: Boolean = var0.isObscureAwaitingScan,
      obscureDescription: String? = var0.obscureDescription,
      obscureHideControls: Boolean = var0.obscureHideControls,
      obscureIsOpaque: Boolean = var0.obscureIsOpaque,
      verifyAge: Boolean? = var0.verifyAge,
      showDescription: Boolean = var0.showDescription,
      description: String? = var0.description,
      descriptionHint: String = var0.descriptionHint,
      accessibilityRole: String = var0.accessibilityRole,
      portalIdString: String? = var0.portalIdString
   ): MediaGalleryItem {
      q.h(var1, "media");
      q.h(var2, "mediaType");
      q.h(var14, "descriptionHint");
      q.h(var15, "accessibilityRole");
      return new MediaGalleryItem(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaGalleryItem) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.media, var1.media)) {
            return false;
         } else if (this.mediaType != var1.mediaType) {
            return false;
         } else if (!q.c(this.videoPreviewUrl, var1.videoPreviewUrl)) {
            return false;
         } else if (this.isSpoiler != var1.isSpoiler) {
            return false;
         } else if (!q.c(this.spoilerDescription, var1.spoilerDescription)) {
            return false;
         } else if (this.isObscure != var1.isObscure) {
            return false;
         } else if (this.isObscureAwaitingScan != var1.isObscureAwaitingScan) {
            return false;
         } else if (!q.c(this.obscureDescription, var1.obscureDescription)) {
            return false;
         } else if (this.obscureHideControls != var1.obscureHideControls) {
            return false;
         } else if (this.obscureIsOpaque != var1.obscureIsOpaque) {
            return false;
         } else if (!q.c(this.verifyAge, var1.verifyAge)) {
            return false;
         } else if (this.showDescription != var1.showDescription) {
            return false;
         } else if (!q.c(this.description, var1.description)) {
            return false;
         } else if (!q.c(this.descriptionHint, var1.descriptionHint)) {
            return false;
         } else if (!q.c(this.accessibilityRole, var1.accessibilityRole)) {
            return false;
         } else {
            return q.c(this.portalIdString, var1.portalIdString);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = this.media.hashCode();
      val var8: Int = this.mediaType.hashCode();
      var var6: Int = 0;
      val var1: Int;
      if (this.videoPreviewUrl == null) {
         var1 = 0;
      } else {
         var1 = this.videoPreviewUrl.hashCode();
      }

      val var9: Int = java.lang.Boolean.hashCode(this.isSpoiler);
      val var2: Int;
      if (this.spoilerDescription == null) {
         var2 = 0;
      } else {
         var2 = this.spoilerDescription.hashCode();
      }

      val var11: Int = java.lang.Boolean.hashCode(this.isObscure);
      val var10: Int = java.lang.Boolean.hashCode(this.isObscureAwaitingScan);
      val var3: Int;
      if (this.obscureDescription == null) {
         var3 = 0;
      } else {
         var3 = this.obscureDescription.hashCode();
      }

      val var13: Int = java.lang.Boolean.hashCode(this.obscureHideControls);
      val var12: Int = java.lang.Boolean.hashCode(this.obscureIsOpaque);
      val var4: Int;
      if (this.verifyAge == null) {
         var4 = 0;
      } else {
         var4 = this.verifyAge.hashCode();
      }

      val var14: Int = java.lang.Boolean.hashCode(this.showDescription);
      val var5: Int;
      if (this.description == null) {
         var5 = 0;
      } else {
         var5 = this.description.hashCode();
      }

      val var15: Int = this.descriptionHint.hashCode();
      val var16: Int = this.accessibilityRole.hashCode();
      if (this.portalIdString != null) {
         var6 = this.portalIdString.hashCode();
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
                                                                                                ((((var7 * 31 + var8) * 31 + var1) * 31 + var9) * 31 + var2)
                                                                                                      * 31
                                                                                                   + var11
                                                                                             )
                                                                                             * 31
                                                                                          + var10
                                                                                    )
                                                                                    * 31
                                                                                 + var3
                                                                           )
                                                                           * 31
                                                                        + var13
                                                                  )
                                                                  * 31
                                                               + var12
                                                         )
                                                         * 31
                                                      + var4
                                                )
                                                * 31
                                             + var14
                                       )
                                       * 31
                                    + var5
                              )
                              * 31
                           + var15
                     )
                     * 31
                  + var16
            )
            * 31
         + var6;
   }

   public override fun toString(): String {
      val var10: UnfurledMediaItem = this.media;
      val var7: MediaGalleryItemType = this.mediaType;
      val var12: java.lang.String = this.videoPreviewUrl;
      val var2: Boolean = this.isSpoiler;
      val var11: java.lang.String = this.spoilerDescription;
      val var4: Boolean = this.isObscure;
      val var1: Boolean = this.isObscureAwaitingScan;
      val var8: java.lang.String = this.obscureDescription;
      val var5: Boolean = this.obscureHideControls;
      val var6: Boolean = this.obscureIsOpaque;
      val var16: java.lang.Boolean = this.verifyAge;
      val var3: Boolean = this.showDescription;
      val var14: java.lang.String = this.description;
      val var9: java.lang.String = this.descriptionHint;
      val var13: java.lang.String = this.accessibilityRole;
      val var15: java.lang.String = this.portalIdString;
      val var17: StringBuilder = new StringBuilder();
      var17.append("MediaGalleryItem(media=");
      var17.append(var10);
      var17.append(", mediaType=");
      var17.append(var7);
      var17.append(", videoPreviewUrl=");
      var17.append(var12);
      var17.append(", isSpoiler=");
      var17.append(var2);
      var17.append(", spoilerDescription=");
      var17.append(var11);
      var17.append(", isObscure=");
      var17.append(var4);
      var17.append(", isObscureAwaitingScan=");
      var17.append(var1);
      var17.append(", obscureDescription=");
      var17.append(var8);
      var17.append(", obscureHideControls=");
      var17.append(var5);
      var17.append(", obscureIsOpaque=");
      var17.append(var6);
      var17.append(", verifyAge=");
      var17.append(var16);
      var17.append(", showDescription=");
      var17.append(var3);
      var17.append(", description=");
      var17.append(var14);
      var17.append(", descriptionHint=");
      var17.append(var9);
      var17.append(", accessibilityRole=");
      var17.append(var13);
      var17.append(", portalIdString=");
      var17.append(var15);
      var17.append(")");
      return var17.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaGalleryItem.$serializer = new MediaGalleryItem.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.MediaGalleryItem", var0, 18);
         var1.l("media", false);
         var1.l("mediaType", false);
         var1.l("videoPreviewUrl", true);
         var1.l("isSpoiler", false);
         var1.l("spoilerDescription", false);
         var1.l("isObscure", false);
         var1.l("isObscureAwaitingScan", false);
         var1.l("obscureDescription", false);
         var1.l("obscureHideControls", false);
         var1.l("obscureIsOpaque", false);
         var1.l("verifyAge", false);
         var1.l("showDescription", false);
         var1.l("description", true);
         var1.l("descriptionHint", false);
         var1.l("accessibilityRole", false);
         var1.l("portalId", false);
         var1.l("spoilerOrNull", true);
         var1.l("obscureOrNull", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var10: C0 = C0.a;
         val var5: KSerializer = a.u(C0.a);
         val var1: fa.h = fa.h.a;
         return new KSerializer[]{
            UnfurledMediaItem.$serializer.INSTANCE,
            MediaGalleryItemType.Serializer.INSTANCE,
            var5,
            fa.h.a,
            a.u(var10),
            var1,
            var1,
            a.u(var10),
            var1,
            var1,
            a.u(var1),
            var1,
            a.u(var10),
            var10,
            var10,
            a.u(var10),
            a.u(var10),
            a.u(var10)
         };
      }

      public open fun deserialize(decoder: Decoder): MediaGalleryItem {
         q.h(var1, "decoder");
         val var28: SerialDescriptor = this.getDescriptor();
         val var29: c = var1.c(var28);
         var var2: Int;
         var var9: Boolean;
         var var10: Boolean;
         var var11: Boolean;
         val var12: Boolean;
         val var13: Boolean;
         var var14: java.lang.String;
         var var18: java.lang.String;
         var var19: java.lang.String;
         var var20: Any;
         var var21: Any;
         var var22: java.lang.String;
         var var24: java.lang.String;
         val var31: java.lang.String;
         var var36: Boolean;
         var var45: java.lang.String;
         var var47: Any;
         var var49: java.lang.String;
         var var52: java.lang.String;
         if (var29.y()) {
            var20 = var29.m(var28, 0, UnfurledMediaItem.$serializer.INSTANCE, null) as UnfurledMediaItem;
            var21 = var29.m(var28, 1, MediaGalleryItemType.Serializer.INSTANCE, null) as MediaGalleryItemType;
            val var23: C0 = C0.a;
            var47 = var29.v(var28, 2, C0.a, null) as java.lang.String;
            var9 = var29.s(var28, 3);
            var22 = var29.v(var28, 4, var23, null) as java.lang.String;
            var13 = var29.s(var28, 5);
            var12 = var29.s(var28, 6);
            var49 = var29.v(var28, 7, var23, null) as java.lang.String;
            val var7: Boolean = var29.s(var28, 8);
            val var8: Boolean = var29.s(var28, 9);
            val var15: java.lang.Boolean = var29.v(var28, 10, fa.h.a, null) as java.lang.Boolean;
            var36 = var29.s(var28, 11);
            val var25: java.lang.String = var29.v(var28, 12, var23, null) as java.lang.String;
            val var30: java.lang.String = var29.t(var28, 13);
            var18 = var29.t(var28, 14);
            var19 = var29.v(var28, 15, var23, null) as java.lang.String;
            var14 = var29.v(var28, 16, var23, null) as java.lang.String;
            val var26: java.lang.String = var29.v(var28, 17, var23, null) as java.lang.String;
            var2 = 262143;
            var52 = (java.lang.String)var47;
            var24 = var49;
            var11 = var7;
            var10 = var8;
            var47 = var15;
            var45 = var25;
            var49 = var30;
            var31 = var26;
         } else {
            var var4: Boolean = true;
            var52 = null;
            var45 = null;
            var22 = null;
            var20 = null;
            var14 = null;
            var var32: java.lang.String = null;
            var19 = null;
            var18 = null;
            var24 = null;
            var49 = null;
            var47 = null;
            var2 = 0;
            var9 = false;
            var10 = false;
            var var40: Boolean = false;
            var var38: Boolean = false;
            var36 = false;
            var11 = false;
            var21 = null;

            while (var4) {
               val var5: Int = var29.x(var28);
               var var33: Int;
               switch (var5) {
                  case -1:
                     var4 = false;
                     continue;
                  case 0:
                     var20 = var29.m(var28, 0, UnfurledMediaItem.$serializer.INSTANCE, var20) as UnfurledMediaItem;
                     var2 |= 1;
                     continue;
                  case 1:
                     var21 = var29.m(var28, 1, MediaGalleryItemType.Serializer.INSTANCE, var21) as MediaGalleryItemType;
                     var2 |= 2;
                     continue;
                  case 2:
                     var52 = var29.v(var28, 2, C0.a, var52) as java.lang.String;
                     var2 |= 4;
                     continue;
                  case 3:
                     var36 = var29.s(var28, 3);
                     var2 |= 8;
                     continue;
                  case 4:
                     var22 = var29.v(var28, 4, C0.a, var22) as java.lang.String;
                     var2 |= 16;
                     continue;
                  case 5:
                     var38 = var29.s(var28, 5);
                     var2 |= 32;
                     continue;
                  case 6:
                     var40 = var29.s(var28, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var18 = var29.v(var28, 7, C0.a, var18) as java.lang.String;
                     var2 |= 128;
                     continue;
                  case 8:
                     var11 = var29.s(var28, 8);
                     var2 |= 256;
                     continue;
                  case 9:
                     var10 = var29.s(var28, 9);
                     var2 |= 512;
                     continue;
                  case 10:
                     var24 = var29.v(var28, 10, fa.h.a, var24) as java.lang.Boolean;
                     var2 |= 1024;
                     continue;
                  case 11:
                     var9 = var29.s(var28, 11);
                     var2 |= 2048;
                     continue;
                  case 12:
                     var19 = var29.v(var28, 12, C0.a, var19) as java.lang.String;
                     var2 |= 4096;
                     continue;
                  case 13:
                     var49 = var29.t(var28, 13);
                     var2 |= 8192;
                     continue;
                  case 14:
                     var47 = var29.t(var28, 14);
                     var2 |= 16384;
                     continue;
                  case 15:
                     var32 = var29.v(var28, 15, C0.a, var32) as java.lang.String;
                     var33 = 32768;
                     break;
                  case 16:
                     var14 = var29.v(var28, 16, C0.a, var14) as java.lang.String;
                     var33 = 65536;
                     break;
                  case 17:
                     var45 = var29.v(var28, 17, C0.a, var45) as java.lang.String;
                     var33 = 131072;
                     break;
                  default:
                     throw new n(var5);
               }

               var2 |= var33;
            }

            var31 = var45;
            var19 = var32;
            var18 = (java.lang.String)var47;
            var45 = var19;
            var36 = var9;
            var47 = var24;
            var24 = var18;
            var12 = var40;
            var13 = var38;
            var9 = var36;
         }

         var29.b(var28);
         return new MediaGalleryItem(
            var2,
            (UnfurledMediaItem)var20,
            (MediaGalleryItemType)var21,
            var52,
            var9,
            var22,
            var13,
            var12,
            var24,
            var11,
            var10,
            (java.lang.Boolean)var47,
            var36,
            var45,
            var49,
            var18,
            var19,
            var14,
            var31,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: MediaGalleryItem) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MediaGalleryItem.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fa.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaGalleryItem> {
         return MediaGalleryItem.$serializer.INSTANCE;
      }
   }
}
