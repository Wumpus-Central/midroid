package com.discord.chat.bridge.botuikit

import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.misc.utilities.ids.IdUtilsKt
import kotlin.jvm.internal.q
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
import xk.b2
import xk.g0

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
      q.h(var1, "media");
      q.h(var2, "mediaType");
      q.h(var11, "descriptionHint");
      q.h(var12, "accessibilityRole");
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
      if (var5 != null && !h.x(var5)) {
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
            if (!h.x(var8)) {
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
      q.h(var1, "media");
      q.h(var2, "mediaType");
      q.h(var11, "descriptionHint");
      q.h(var12, "accessibilityRole");
      return new MediaGalleryItem(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
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
      val var6: Int = this.mediaType.hashCode();
      var var5: Int = 0;
      val var1: Int;
      if (this.videoPreviewUrl == null) {
         var1 = 0;
      } else {
         var1 = this.videoPreviewUrl.hashCode();
      }

      val var8: Int = java.lang.Boolean.hashCode(this.isSpoiler);
      val var2: Int;
      if (this.spoilerDescription == null) {
         var2 = 0;
      } else {
         var2 = this.spoilerDescription.hashCode();
      }

      val var9: Int = java.lang.Boolean.hashCode(this.isObscure);
      val var10: Int = java.lang.Boolean.hashCode(this.isObscureAwaitingScan);
      val var3: Int;
      if (this.obscureDescription == null) {
         var3 = 0;
      } else {
         var3 = this.obscureDescription.hashCode();
      }

      val var11: Int = java.lang.Boolean.hashCode(this.showDescription);
      val var4: Int;
      if (this.description == null) {
         var4 = 0;
      } else {
         var4 = this.description.hashCode();
      }

      val var13: Int = this.descriptionHint.hashCode();
      val var12: Int = this.accessibilityRole.hashCode();
      if (this.portalIdString != null) {
         var5 = this.portalIdString.hashCode();
      }

      return (
               (
                        (((((((((var7 * 31 + var6) * 31 + var1) * 31 + var8) * 31 + var2) * 31 + var9) * 31 + var10) * 31 + var3) * 31 + var11) * 31 + var4)
                              * 31
                           + var13
                     )
                     * 31
                  + var12
            )
            * 31
         + var5;
   }

   public override fun toString(): String {
      val var8: UnfurledMediaItem = this.media;
      val var12: MediaGalleryItemType = this.mediaType;
      val var11: java.lang.String = this.videoPreviewUrl;
      val var4: Boolean = this.isSpoiler;
      val var9: java.lang.String = this.spoilerDescription;
      val var1: Boolean = this.isObscure;
      val var2: Boolean = this.isObscureAwaitingScan;
      val var7: java.lang.String = this.obscureDescription;
      val var3: Boolean = this.showDescription;
      val var14: java.lang.String = this.description;
      val var6: java.lang.String = this.descriptionHint;
      val var5: java.lang.String = this.accessibilityRole;
      val var13: java.lang.String = this.portalIdString;
      val var10: StringBuilder = new StringBuilder();
      var10.append("MediaGalleryItem(media=");
      var10.append(var8);
      var10.append(", mediaType=");
      var10.append(var12);
      var10.append(", videoPreviewUrl=");
      var10.append(var11);
      var10.append(", isSpoiler=");
      var10.append(var4);
      var10.append(", spoilerDescription=");
      var10.append(var9);
      var10.append(", isObscure=");
      var10.append(var1);
      var10.append(", isObscureAwaitingScan=");
      var10.append(var2);
      var10.append(", obscureDescription=");
      var10.append(var7);
      var10.append(", showDescription=");
      var10.append(var3);
      var10.append(", description=");
      var10.append(var14);
      var10.append(", descriptionHint=");
      var10.append(var6);
      var10.append(", accessibilityRole=");
      var10.append(var5);
      var10.append(", portalIdString=");
      var10.append(var13);
      var10.append(")");
      return var10.toString();
   }

   public object `$serializer` : g0 {
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
         val var3: UnfurledMediaItem.$serializer = UnfurledMediaItem.$serializer.INSTANCE;
         val var4: MediaGalleryItemType.Serializer = MediaGalleryItemType.Serializer.INSTANCE;
         val var2: b2 = b2.a;
         val var1: KSerializer = a.u(b2.a);
         val var5: xk.h = xk.h.a;
         return new KSerializer[]{var3, var4, var1, xk.h.a, a.u(var2), var5, var5, a.u(var2), var5, a.u(var2), var2, var2, a.u(var2), a.u(var2), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): MediaGalleryItem {
         q.h(var1, "decoder");
         val var24: SerialDescriptor = this.getDescriptor();
         val var25: c = var1.c(var24);
         var var7: Boolean = var25.y();
         var var3: Byte = 11;
         var var17: UnfurledMediaItem = null;
         var var2: Int;
         var var8: Boolean;
         var var9: Boolean;
         var var10: Boolean;
         val var11: Boolean;
         var var15: Any;
         var var16: Any;
         var var18: MediaGalleryItemType;
         var var20: java.lang.String;
         var var21: Any;
         val var22: Any;
         var var26: Any;
         var var32: Any;
         var var34: Any;
         var var39: Any;
         if (var7) {
            var17 = var25.m(var24, 0, UnfurledMediaItem.$serializer.INSTANCE, null) as UnfurledMediaItem;
            var18 = var25.m(var24, 1, MediaGalleryItemType.Serializer.INSTANCE, null) as MediaGalleryItemType;
            var39 = b2.a;
            var20 = var25.v(var24, 2, b2.a, null) as java.lang.String;
            var9 = var25.s(var24, 3);
            var15 = var25.v(var24, 4, (DeserializationStrategy)var39, null) as java.lang.String;
            var8 = var25.s(var24, 5);
            var7 = var25.s(var24, 6);
            var16 = var25.v(var24, 7, (DeserializationStrategy)var39, null) as java.lang.String;
            var10 = var25.s(var24, 8);
            var34 = var25.v(var24, 9, (DeserializationStrategy)var39, null) as java.lang.String;
            var32 = var25.t(var24, 10);
            var26 = var25.t(var24, 11);
            var21 = var25.v(var24, 12, (DeserializationStrategy)var39, null) as java.lang.String;
            val var14: java.lang.String = var25.v(var24, 13, (DeserializationStrategy)var39, null) as java.lang.String;
            val var23: java.lang.String = var25.v(var24, 14, (DeserializationStrategy)var39, null) as java.lang.String;
            var2 = 32767;
            var11 = var7;
            var22 = var34;
            var34 = var32;
            var39 = var14;
            var32 = var23;
         } else {
            var var5: Boolean = true;
            var2 = 0;
            var9 = false;
            var8 = false;
            var7 = false;
            var10 = false;
            var20 = null;
            var18 = null;
            var39 = null;
            var16 = null;
            var15 = null;
            var var36: Any = null;
            var21 = null;
            var34 = null;
            var32 = null;
            var26 = null;

            while (var5) {
               val var6: Int = var25.x(var24);
               switch (var6) {
                  case -1:
                     var5 = false;
                     continue;
                  case 0:
                     var17 = var25.m(var24, 0, UnfurledMediaItem.$serializer.INSTANCE, var17) as UnfurledMediaItem;
                     var2 |= 1;
                     break;
                  case 1:
                     var18 = var25.m(var24, 1, MediaGalleryItemType.Serializer.INSTANCE, var18) as MediaGalleryItemType;
                     var2 |= 2;
                     break;
                  case 2:
                     var20 = var25.v(var24, 2, b2.a, var20) as java.lang.String;
                     var2 |= 4;
                     break;
                  case 3:
                     var7 = var25.s(var24, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var34 = var25.v(var24, 4, b2.a, var34) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var8 = var25.s(var24, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var9 = var25.s(var24, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var36 = var25.v(var24, 7, b2.a, var36) as java.lang.String;
                     var2 |= 128;
                     break;
                  case 8:
                     var10 = var25.s(var24, 8);
                     var2 |= 256;
                     var3 = 11;
                     continue;
                  case 9:
                     var21 = var25.v(var24, 9, b2.a, var21) as java.lang.String;
                     var2 |= 512;
                     var3 = 11;
                     continue;
                  case 10:
                     var32 = var25.t(var24, 10);
                     var2 |= 1024;
                     continue;
                  case 11:
                     var26 = var25.t(var24, var3);
                     var2 |= 2048;
                     continue;
                  case 12:
                     var15 = var25.v(var24, 12, b2.a, var15) as java.lang.String;
                     var2 |= 4096;
                     continue;
                  case 13:
                     var16 = var25.v(var24, 13, b2.a, var16) as java.lang.String;
                     var2 |= 8192;
                     continue;
                  case 14:
                     var39 = var25.v(var24, 14, b2.a, var39) as java.lang.String;
                     var2 |= 16384;
                     continue;
                  default:
                     throw new n(var6);
               }

               var3 = 11;
            }

            var22 = var21;
            var15 = var34;
            var34 = var32;
            var32 = var39;
            var39 = var16;
            var21 = var15;
            var16 = var36;
            var11 = var9;
            var9 = var7;
         }

         var25.b(var24);
         return new MediaGalleryItem(
            var2,
            var17,
            var18,
            var20,
            var9,
            (java.lang.String)var15,
            var8,
            var11,
            (java.lang.String)var16,
            var10,
            (java.lang.String)var22,
            (java.lang.String)var34,
            (java.lang.String)var26,
            (java.lang.String)var21,
            (java.lang.String)var39,
            (java.lang.String)var32,
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
         return xk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaGalleryItem> {
         return MediaGalleryItem.$serializer.INSTANCE;
      }
   }
}
