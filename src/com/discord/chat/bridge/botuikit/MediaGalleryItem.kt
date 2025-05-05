package com.discord.chat.bridge.botuikit

import aa.f
import aa.n
import ba.a
import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.misc.utilities.ids.IdUtilsKt
import da.C0
import da.G
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

      val var10: Int = java.lang.Boolean.hashCode(this.isObscure);
      val var11: Int = java.lang.Boolean.hashCode(this.isObscureAwaitingScan);
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

      val var16: Int = this.descriptionHint.hashCode();
      val var15: Int = this.accessibilityRole.hashCode();
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
                                                                                                   + var10
                                                                                             )
                                                                                             * 31
                                                                                          + var11
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
                           + var16
                     )
                     * 31
                  + var15
            )
            * 31
         + var6;
   }

   public override fun toString(): String {
      val var15: UnfurledMediaItem = this.media;
      val var16: MediaGalleryItemType = this.mediaType;
      val var17: java.lang.String = this.videoPreviewUrl;
      val var6: Boolean = this.isSpoiler;
      val var9: java.lang.String = this.spoilerDescription;
      val var1: Boolean = this.isObscure;
      val var5: Boolean = this.isObscureAwaitingScan;
      val var7: java.lang.String = this.obscureDescription;
      val var4: Boolean = this.obscureHideControls;
      val var3: Boolean = this.obscureIsOpaque;
      val var12: java.lang.Boolean = this.verifyAge;
      val var2: Boolean = this.showDescription;
      val var13: java.lang.String = this.description;
      val var8: java.lang.String = this.descriptionHint;
      val var14: java.lang.String = this.accessibilityRole;
      val var11: java.lang.String = this.portalIdString;
      val var10: StringBuilder = new StringBuilder();
      var10.append("MediaGalleryItem(media=");
      var10.append(var15);
      var10.append(", mediaType=");
      var10.append(var16);
      var10.append(", videoPreviewUrl=");
      var10.append(var17);
      var10.append(", isSpoiler=");
      var10.append(var6);
      var10.append(", spoilerDescription=");
      var10.append(var9);
      var10.append(", isObscure=");
      var10.append(var1);
      var10.append(", isObscureAwaitingScan=");
      var10.append(var5);
      var10.append(", obscureDescription=");
      var10.append(var7);
      var10.append(", obscureHideControls=");
      var10.append(var4);
      var10.append(", obscureIsOpaque=");
      var10.append(var3);
      var10.append(", verifyAge=");
      var10.append(var12);
      var10.append(", showDescription=");
      var10.append(var2);
      var10.append(", description=");
      var10.append(var13);
      var10.append(", descriptionHint=");
      var10.append(var8);
      var10.append(", accessibilityRole=");
      var10.append(var14);
      var10.append(", portalIdString=");
      var10.append(var11);
      var10.append(")");
      return var10.toString();
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
         val var2: KSerializer = a.u(C0.a);
         val var1: da.h = da.h.a;
         return new KSerializer[]{
            UnfurledMediaItem.$serializer.INSTANCE,
            MediaGalleryItemType.Serializer.INSTANCE,
            var2,
            da.h.a,
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
         val var29: SerialDescriptor = this.getDescriptor();
         val var30: c = var1.c(var29);
         var var2: Int;
         var var7: Boolean;
         var var9: Boolean;
         var var10: Boolean;
         var var11: Boolean;
         val var12: Boolean;
         val var13: Boolean;
         var var20: Any;
         var var21: Any;
         var var22: java.lang.String;
         var var24: java.lang.String;
         val var31: java.lang.String;
         var var42: java.lang.String;
         var var44: java.lang.String;
         var var46: java.lang.String;
         var var48: java.lang.String;
         var var50: Any;
         var var52: java.lang.String;
         var var54: java.lang.String;
         if (var30.y()) {
            var20 = var30.m(var29, 0, UnfurledMediaItem.$serializer.INSTANCE, null) as UnfurledMediaItem;
            var21 = var30.m(var29, 1, MediaGalleryItemType.Serializer.INSTANCE, null) as MediaGalleryItemType;
            val var23: C0 = C0.a;
            var46 = var30.v(var29, 2, C0.a, null) as java.lang.String;
            var9 = var30.s(var29, 3);
            var22 = var30.v(var29, 4, var23, null) as java.lang.String;
            var12 = var30.s(var29, 5);
            var11 = var30.s(var29, 6);
            var50 = var30.v(var29, 7, var23, null) as java.lang.String;
            var7 = var30.s(var29, 8);
            val var8: Boolean = var30.s(var29, 9);
            val var15: java.lang.Boolean = var30.v(var29, 10, da.h.a, null) as java.lang.Boolean;
            val var36: Boolean = var30.s(var29, 11);
            var52 = var30.v(var29, 12, var23, null) as java.lang.String;
            var31 = var30.t(var29, 13);
            var48 = var30.t(var29, 14);
            var24 = var30.v(var29, 15, var23, null) as java.lang.String;
            var42 = var30.v(var29, 16, var23, null) as java.lang.String;
            val var25: java.lang.String = var30.v(var29, 17, var23, null) as java.lang.String;
            var2 = 262143;
            var54 = var46;
            var46 = (java.lang.String)var50;
            var10 = var8;
            var50 = var15;
            var13 = var36;
            var44 = var52;
            var52 = var48;
            var48 = var42;
            var42 = var25;
         } else {
            var var4: Boolean = true;
            var54 = null;
            var44 = null;
            var22 = null;
            var20 = null;
            var42 = null;
            var var32: java.lang.String = null;
            var52 = null;
            var50 = null;
            var24 = null;
            var48 = null;
            var46 = null;
            var2 = 0;
            var9 = false;
            var10 = false;
            var var39: Boolean = false;
            var7 = false;
            var var37: Boolean = false;
            var11 = false;
            var21 = null;

            while (var4) {
               val var5: Int = var30.x(var29);
               var var33: Int;
               switch (var5) {
                  case -1:
                     var4 = false;
                     continue;
                  case 0:
                     var20 = var30.m(var29, 0, UnfurledMediaItem.$serializer.INSTANCE, var20) as UnfurledMediaItem;
                     var2 |= 1;
                     continue;
                  case 1:
                     var21 = var30.m(var29, 1, MediaGalleryItemType.Serializer.INSTANCE, var21) as MediaGalleryItemType;
                     var2 |= 2;
                     continue;
                  case 2:
                     var54 = var30.v(var29, 2, C0.a, var54) as java.lang.String;
                     var2 |= 4;
                     continue;
                  case 3:
                     var37 = var30.s(var29, 3);
                     var2 |= 8;
                     continue;
                  case 4:
                     var22 = var30.v(var29, 4, C0.a, var22) as java.lang.String;
                     var2 |= 16;
                     continue;
                  case 5:
                     var7 = var30.s(var29, 5);
                     var2 |= 32;
                     continue;
                  case 6:
                     var39 = var30.s(var29, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var50 = var30.v(var29, 7, C0.a, var50) as java.lang.String;
                     var2 |= 128;
                     continue;
                  case 8:
                     var11 = var30.s(var29, 8);
                     var2 |= 256;
                     continue;
                  case 9:
                     var10 = var30.s(var29, 9);
                     var2 |= 512;
                     continue;
                  case 10:
                     var24 = var30.v(var29, 10, da.h.a, var24) as java.lang.Boolean;
                     var2 |= 1024;
                     continue;
                  case 11:
                     var9 = var30.s(var29, 11);
                     var2 |= 2048;
                     continue;
                  case 12:
                     var52 = var30.v(var29, 12, C0.a, var52) as java.lang.String;
                     var2 |= 4096;
                     continue;
                  case 13:
                     var48 = var30.t(var29, 13);
                     var2 |= 8192;
                     continue;
                  case 14:
                     var46 = var30.t(var29, 14);
                     var2 |= 16384;
                     continue;
                  case 15:
                     var32 = var30.v(var29, 15, C0.a, var32) as java.lang.String;
                     var33 = 32768;
                     break;
                  case 16:
                     var42 = var30.v(var29, 16, C0.a, var42) as java.lang.String;
                     var33 = 65536;
                     break;
                  case 17:
                     var44 = var30.v(var29, 17, C0.a, var44) as java.lang.String;
                     var33 = 131072;
                     break;
                  default:
                     throw new n(var5);
               }

               var2 |= var33;
            }

            var50 = var24;
            var12 = var7;
            var42 = var44;
            var48 = var42;
            var24 = var32;
            var52 = var46;
            var31 = var48;
            var44 = var52;
            var13 = var9;
            var7 = var11;
            var46 = (java.lang.String)var50;
            var11 = var39;
            var9 = var37;
         }

         var30.b(var29);
         return new MediaGalleryItem(
            var2,
            (UnfurledMediaItem)var20,
            (MediaGalleryItemType)var21,
            var54,
            var9,
            var22,
            var12,
            var11,
            var46,
            var7,
            var10,
            (java.lang.Boolean)var50,
            var13,
            var44,
            var31,
            var52,
            var24,
            var48,
            var42,
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
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaGalleryItem> {
         return MediaGalleryItem.$serializer.INSTANCE;
      }
   }
}
