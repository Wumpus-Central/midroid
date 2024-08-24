package com.discord.chat.bridge.botuikit

import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.misc.utilities.ids.IdUtilsKt
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

@f
public data class MediaGalleryItem(media: UnfurledMediaItem,
      mediaType: MediaGalleryItemType,
      videoPreviewUrl: String? = null,
      isSpoiler: Boolean,
      spoilerDescription: String?,
      isObscure: Boolean,
      isObscureAwaitingScan: Boolean,
      obscureDescription: String?,
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
   public final val videoPreviewUrl: String?

   init {
      r.h(var1, "media");
      r.h(var2, "mediaType");
      r.h(var11, "descriptionHint");
      r.h(var12, "accessibilityRole");
      super();
      this.media = var1;
      this.mediaType = var2;
      this.videoPreviewUrl = var3;
      this.isSpoiler = var4;
      this.spoilerDescription = var5;
      this.isObscure = var6;
      this.isObscureAwaitingScan = var7;
      this.obscureDescription = var8;
      this.showDescription = var9;
      this.description = var10;
      this.descriptionHint = var11;
      this.accessibilityRole = var12;
      this.portalIdString = var13;
      var var14: Boolean;
      if (var5 != null && !kotlin.text.f.x(var5)) {
         var14 = false;
      } else {
         var14 = true;
      }

      if (!(var14 xor true)) {
         var5 = null;
      }

      label25: {
         this.spoilerOrNull = var5;
         if (var8 != null) {
            var14 = false;
            if (!kotlin.text.f.x(var8)) {
               break label25;
            }
         }

         var14 = true;
      }

      if (!(var14 xor true)) {
         var8 = null;
      }

      this.obscureOrNull = var8;
   }

   @JvmStatic
   public fun `write$Self`(self: MediaGalleryItem, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, UnfurledMediaItem.$serializer.INSTANCE, var0.media);
      var1.y(var2, 1, MediaGalleryItemType.Serializer.INSTANCE, var0.mediaType);
      var var3: Boolean;
      if (!var1.A(var2, 2) && var0.videoPreviewUrl == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.videoPreviewUrl);
      }

      var1.x(var2, 3, var0.isSpoiler);
      val var9: a2 = a2.a;
      var1.m(var2, 4, a2.a, var0.spoilerDescription);
      var1.x(var2, 5, var0.isObscure);
      var1.x(var2, 6, var0.isObscureAwaitingScan);
      var1.m(var2, 7, var9, var0.obscureDescription);
      var1.x(var2, 8, var0.showDescription);
      if (!var1.A(var2, 9) && var0.description == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 9, var9, var0.description);
      }

      label75: {
         var1.z(var2, 10, var0.descriptionHint);
         var1.z(var2, 11, var0.accessibilityRole);
         var1.m(var2, 12, var9, var0.portalIdString);
         if (!var1.A(var2, 13)) {
            val var8: java.lang.String = var0.getSpoilerOrNull();
            var var16: java.lang.String = var0.spoilerDescription;
            if (var0.spoilerDescription != null && !kotlin.text.f.x(var0.spoilerDescription)) {
               var3 = false;
            } else {
               var3 = true;
            }

            if (!(var3 xor true)) {
               var16 = null;
            }

            if (r.c(var8, var16)) {
               var3 = false;
               break label75;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 13, var9, var0.getSpoilerOrNull());
      }

      label63: {
         if (!var1.A(var2, 14)) {
            val var10: java.lang.String = var0.getObscureOrNull();
            val var19: java.lang.String = var0.obscureDescription;
            if (var0.obscureDescription != null && !kotlin.text.f.x(var0.obscureDescription)) {
               var3 = false;
            } else {
               var3 = true;
            }

            var var17: java.lang.String = null;
            if (var3 xor true) {
               var17 = var0.obscureDescription;
            }

            var3 = false;
            if (r.c(var10, var17)) {
               break label63;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 14, var9, var0.getObscureOrNull());
      }
   }

   public operator fun component1(): UnfurledMediaItem {
      return this.media;
   }

   public operator fun component10(): String? {
      return this.description;
   }

   public operator fun component11(): String {
      return this.descriptionHint;
   }

   public operator fun component12(): String {
      return this.accessibilityRole;
   }

   public operator fun component13(): String? {
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
      return this.showDescription;
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
      showDescription: Boolean = var0.showDescription,
      description: String? = var0.description,
      descriptionHint: String = var0.descriptionHint,
      accessibilityRole: String = var0.accessibilityRole,
      portalIdString: String? = var0.portalIdString
   ): MediaGalleryItem {
      r.h(var1, "media");
      r.h(var2, "mediaType");
      r.h(var11, "descriptionHint");
      r.h(var12, "accessibilityRole");
      return new MediaGalleryItem(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaGalleryItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.media, var1.media)) {
            return false;
         } else if (this.mediaType != var1.mediaType) {
            return false;
         } else if (!r.c(this.videoPreviewUrl, var1.videoPreviewUrl)) {
            return false;
         } else if (this.isSpoiler != var1.isSpoiler) {
            return false;
         } else if (!r.c(this.spoilerDescription, var1.spoilerDescription)) {
            return false;
         } else if (this.isObscure != var1.isObscure) {
            return false;
         } else if (this.isObscureAwaitingScan != var1.isObscureAwaitingScan) {
            return false;
         } else if (!r.c(this.obscureDescription, var1.obscureDescription)) {
            return false;
         } else if (this.showDescription != var1.showDescription) {
            return false;
         } else if (!r.c(this.description, var1.description)) {
            return false;
         } else if (!r.c(this.descriptionHint, var1.descriptionHint)) {
            return false;
         } else if (!r.c(this.accessibilityRole, var1.accessibilityRole)) {
            return false;
         } else {
            return r.c(this.portalIdString, var1.portalIdString);
         }
      }
   }

   public override fun hashCode(): Int {
      val var10: Int = this.media.hashCode();
      val var11: Int = this.mediaType.hashCode();
      var var9: Int = 0;
      val var1: Int;
      if (this.videoPreviewUrl == null) {
         var1 = 0;
      } else {
         var1 = this.videoPreviewUrl.hashCode();
      }

      var var7: Byte = 1;
      var var2: Byte = this.isSpoiler;
      if (this.isSpoiler != 0) {
         var2 = 1;
      }

      val var15: Int;
      if (this.spoilerDescription == null) {
         var15 = 0;
      } else {
         var15 = this.spoilerDescription.hashCode();
      }

      var var4: Byte = this.isObscure;
      if (this.isObscure != 0) {
         var4 = 1;
      }

      var var16: Byte = this.isObscureAwaitingScan;
      if (this.isObscureAwaitingScan != 0) {
         var16 = 1;
      }

      val var17: Int;
      if (this.obscureDescription == null) {
         var17 = 0;
      } else {
         var17 = this.obscureDescription.hashCode();
      }

      if (this.showDescription == 0) {
         var7 = this.showDescription;
      }

      val var18: Int;
      if (this.description == null) {
         var18 = 0;
      } else {
         var18 = this.description.hashCode();
      }

      val var12: Int = this.descriptionHint.hashCode();
      val var13: Int = this.accessibilityRole.hashCode();
      if (this.portalIdString != null) {
         var9 = this.portalIdString.hashCode();
      }

      return (
               (
                        (((((((((var10 * 31 + var11) * 31 + var1) * 31 + var2) * 31 + var15) * 31 + var4) * 31 + var16) * 31 + var17) * 31 + var7) * 31 + var18)
                              * 31
                           + var12
                     )
                     * 31
                  + var13
            )
            * 31
         + var9;
   }

   public override fun toString(): String {
      val var7: UnfurledMediaItem = this.media;
      val var8: MediaGalleryItemType = this.mediaType;
      val var10: java.lang.String = this.videoPreviewUrl;
      val var3: Boolean = this.isSpoiler;
      val var13: java.lang.String = this.spoilerDescription;
      val var1: Boolean = this.isObscure;
      val var4: Boolean = this.isObscureAwaitingScan;
      val var11: java.lang.String = this.obscureDescription;
      val var2: Boolean = this.showDescription;
      val var12: java.lang.String = this.description;
      val var9: java.lang.String = this.descriptionHint;
      val var5: java.lang.String = this.accessibilityRole;
      val var6: java.lang.String = this.portalIdString;
      val var14: StringBuilder = new StringBuilder();
      var14.append("MediaGalleryItem(media=");
      var14.append(var7);
      var14.append(", mediaType=");
      var14.append(var8);
      var14.append(", videoPreviewUrl=");
      var14.append(var10);
      var14.append(", isSpoiler=");
      var14.append(var3);
      var14.append(", spoilerDescription=");
      var14.append(var13);
      var14.append(", isObscure=");
      var14.append(var1);
      var14.append(", isObscureAwaitingScan=");
      var14.append(var4);
      var14.append(", obscureDescription=");
      var14.append(var11);
      var14.append(", showDescription=");
      var14.append(var2);
      var14.append(", description=");
      var14.append(var12);
      var14.append(", descriptionHint=");
      var14.append(var9);
      var14.append(", accessibilityRole=");
      var14.append(var5);
      var14.append(", portalIdString=");
      var14.append(var6);
      var14.append(")");
      return var14.toString();
   }

   public object `$serializer` : f0<MediaGalleryItem> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaGalleryItem.$serializer = new MediaGalleryItem.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.MediaGalleryItem", var0, 15);
         var1.l("media", false);
         var1.l("mediaType", false);
         var1.l("videoPreviewUrl", true);
         var1.l("isSpoiler", false);
         var1.l("spoilerDescription", false);
         var1.l("isObscure", false);
         var1.l("isObscureAwaitingScan", false);
         var1.l("obscureDescription", false);
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
         val var4: UnfurledMediaItem.$serializer = UnfurledMediaItem.$serializer.INSTANCE;
         val var2: MediaGalleryItemType.Serializer = MediaGalleryItemType.Serializer.INSTANCE;
         val var3: a2 = a2.a;
         val var1: KSerializer = a.u(a2.a);
         val var5: h = h.a;
         return new KSerializer[]{var4, var2, var1, h.a, a.u(var3), var5, var5, a.u(var3), var5, a.u(var3), var3, var3, a.u(var3), a.u(var3), a.u(var3)};
      }

      public open fun deserialize(decoder: Decoder): MediaGalleryItem {
         r.h(var1, "decoder");
         val var22: SerialDescriptor = this.getDescriptor();
         val var23: c = var1.b(var22);
         val var3: Int;
         var var4: Byte;
         var var5: Byte;
         var var6: Byte;
         var var9: Boolean;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         val var20: Any;
         var var28: Any;
         var var31: Any;
         if (var23.p()) {
            var16 = var23.y(var22, 0, UnfurledMediaItem.$serializer.INSTANCE, null);
            var19 = var23.y(var22, 1, MediaGalleryItemType.Serializer.INSTANCE, null);
            var31 = a2.a;
            var11 = var23.n(var22, 2, a2.a, null);
            var5 = var23.C(var22, 3);
            var20 = var23.n(var22, 4, (DeserializationStrategy)var31, null);
            val var2: Byte = var23.C(var22, 5);
            var9 = var23.C(var22, 6);
            var14 = var23.n(var22, 7, (DeserializationStrategy)var31, null);
            var4 = var23.C(var22, 8);
            var12 = var23.n(var22, 9, (DeserializationStrategy)var31, null);
            var28 = var23.m(var22, 10);
            val var24: java.lang.String = var23.m(var22, 11);
            var17 = var23.n(var22, 12, (DeserializationStrategy)var31, null);
            var13 = var23.n(var22, 13, (DeserializationStrategy)var31, null);
            var31 = var23.n(var22, 14, (DeserializationStrategy)var31, null);
            var3 = 32767;
            var6 = var2;
            var18 = var28;
            var28 = var24;
         } else {
            var var27: Byte = 14;
            var var7: Boolean = true;
            var9 = false;
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var18 = null;
            var31 = null;
            var var25: Any = null;
            var13 = null;
            var14 = null;
            var12 = null;
            var17 = null;
            var16 = null;
            var11 = null;
            var28 = null;
            var19 = null;
            var var26: Int = 0;

            while (var7) {
               label39: {
                  val var8: Int = var23.o(var22);
                  switch (var8) {
                     case -1:
                        var7 = false;
                        continue;
                     case 0:
                        var16 = var23.y(var22, 0, UnfurledMediaItem.$serializer.INSTANCE, var16);
                        var26 |= 1;
                        var27 = 14;
                        continue;
                     case 1:
                        var19 = var23.y(var22, 1, MediaGalleryItemType.Serializer.INSTANCE, var19);
                        var26 |= 2;
                        break;
                     case 2:
                        var18 = var23.n(var22, 2, a2.a, var18);
                        var26 |= 4;
                        break;
                     case 3:
                        var5 = var23.C(var22, 3);
                        var26 |= 8;
                        break;
                     case 4:
                        var17 = var23.n(var22, 4, a2.a, var17);
                        var26 |= 16;
                        break;
                     case 5:
                        var6 = var23.C(var22, 5);
                        var26 |= 32;
                        break;
                     case 6:
                        var9 = var23.C(var22, 6);
                        var26 |= 64;
                        break;
                     case 7:
                        var14 = var23.n(var22, 7, a2.a, var14);
                        var26 |= 128;
                        break;
                     case 8:
                        var4 = var23.C(var22, 8);
                        var26 |= 256;
                        var27 = 14;
                        continue;
                     case 9:
                        var12 = var23.n(var22, 9, a2.a, var12);
                        var26 |= 512;
                        break label39;
                     case 10:
                        var11 = var23.m(var22, 10);
                        var26 |= 1024;
                        break label39;
                     case 11:
                        var28 = var23.m(var22, 11);
                        var26 |= 2048;
                        break label39;
                     case 12:
                        var13 = var23.n(var22, 12, a2.a, var13);
                        var26 |= 4096;
                        break label39;
                     case 13:
                        var25 = var23.n(var22, 13, a2.a, var25);
                        var26 |= 8192;
                        break label39;
                     case 14:
                        var31 = var23.n(var22, var27, a2.a, var31);
                        var26 |= 16384;
                        continue;
                     default:
                        throw new n(var8);
                  }

                  var27 = 14;
                  continue;
               }

               var27 = 14;
            }

            var20 = var17;
            var18 = var11;
            var3 = var26;
            var17 = var13;
            var11 = var18;
            var13 = var25;
         }

         var23.c(var22);
         return new MediaGalleryItem(
            var3,
            var16 as UnfurledMediaItem,
            var19 as MediaGalleryItemType,
            var11 as java.lang.String,
            (boolean)var5,
            var20 as java.lang.String,
            (boolean)var6,
            var9,
            var14 as java.lang.String,
            (boolean)var4,
            var12 as java.lang.String,
            (java.lang.String)var18,
            (java.lang.String)var28,
            var17 as java.lang.String,
            var13 as java.lang.String,
            var31 as java.lang.String,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: MediaGalleryItem) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaGalleryItem.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaGalleryItem> {
         return MediaGalleryItem.$serializer.INSTANCE;
      }
   }
}
