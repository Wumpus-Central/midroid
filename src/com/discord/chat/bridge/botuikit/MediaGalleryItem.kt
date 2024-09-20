package com.discord.chat.bridge.botuikit

import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.misc.utilities.ids.IdUtilsKt
import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
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

      val var10: Int = java.lang.Boolean.hashCode(this.isObscure);
      val var9: Int = java.lang.Boolean.hashCode(this.isObscureAwaitingScan);
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
                        (((((((((var7 * 31 + var6) * 31 + var1) * 31 + var8) * 31 + var2) * 31 + var10) * 31 + var9) * 31 + var3) * 31 + var11) * 31 + var4)
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
      val var10: UnfurledMediaItem = this.media;
      val var6: MediaGalleryItemType = this.mediaType;
      val var11: java.lang.String = this.videoPreviewUrl;
      val var2: Boolean = this.isSpoiler;
      val var13: java.lang.String = this.spoilerDescription;
      val var4: Boolean = this.isObscure;
      val var1: Boolean = this.isObscureAwaitingScan;
      val var12: java.lang.String = this.obscureDescription;
      val var3: Boolean = this.showDescription;
      val var14: java.lang.String = this.description;
      val var9: java.lang.String = this.descriptionHint;
      val var7: java.lang.String = this.accessibilityRole;
      val var8: java.lang.String = this.portalIdString;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MediaGalleryItem(media=");
      var5.append(var10);
      var5.append(", mediaType=");
      var5.append(var6);
      var5.append(", videoPreviewUrl=");
      var5.append(var11);
      var5.append(", isSpoiler=");
      var5.append(var2);
      var5.append(", spoilerDescription=");
      var5.append(var13);
      var5.append(", isObscure=");
      var5.append(var4);
      var5.append(", isObscureAwaitingScan=");
      var5.append(var1);
      var5.append(", obscureDescription=");
      var5.append(var12);
      var5.append(", showDescription=");
      var5.append(var3);
      var5.append(", description=");
      var5.append(var14);
      var5.append(", descriptionHint=");
      var5.append(var9);
      var5.append(", accessibilityRole=");
      var5.append(var7);
      var5.append(", portalIdString=");
      var5.append(var8);
      var5.append(")");
      return var5.toString();
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
         val var5: UnfurledMediaItem.$serializer = UnfurledMediaItem.$serializer.INSTANCE;
         val var2: MediaGalleryItemType.Serializer = MediaGalleryItemType.Serializer.INSTANCE;
         val var1: b2 = b2.a;
         val var3: KSerializer = a.u(b2.a);
         val var4: il.h = il.h.a;
         return new KSerializer[]{var5, var2, var3, il.h.a, a.u(var1), var4, var4, a.u(var1), var4, a.u(var1), var1, var1, a.u(var1), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): MediaGalleryItem {
         q.h(var1, "decoder");
         val var26: SerialDescriptor = this.getDescriptor();
         val var27: c = var1.c(var26);
         var var7: Boolean = var27.y();
         var var3: Byte = 11;
         var var18: UnfurledMediaItem = null;
         var var2: Int;
         var var10: Boolean;
         val var11: Boolean;
         val var12: Boolean;
         var var15: Any;
         var var16: Any;
         var var19: MediaGalleryItemType;
         var var20: Any;
         var var21: java.lang.String;
         var var22: Any;
         var var28: Any;
         var var34: Boolean;
         var var35: Any;
         var var37: Any;
         var var41: Any;
         if (var7) {
            var18 = var27.m(var26, 0, UnfurledMediaItem.$serializer.INSTANCE, null) as UnfurledMediaItem;
            var19 = var27.m(var26, 1, MediaGalleryItemType.Serializer.INSTANCE, null) as MediaGalleryItemType;
            var41 = b2.a;
            var21 = var27.v(var26, 2, b2.a, null) as java.lang.String;
            var12 = var27.s(var26, 3);
            var20 = var27.v(var26, 4, (DeserializationStrategy)var41, null) as java.lang.String;
            var34 = var27.s(var26, 5);
            var7 = var27.s(var26, 6);
            var16 = var27.v(var26, 7, (DeserializationStrategy)var41, null) as java.lang.String;
            val var8: Boolean = var27.s(var26, 8);
            var37 = var27.v(var26, 9, (DeserializationStrategy)var41, null) as java.lang.String;
            var35 = var27.t(var26, 10);
            var28 = var27.t(var26, 11);
            var22 = var27.v(var26, 12, (DeserializationStrategy)var41, null) as java.lang.String;
            var15 = var27.v(var26, 13, (DeserializationStrategy)var41, null) as java.lang.String;
            val var23: java.lang.String = var27.v(var26, 14, (DeserializationStrategy)var41, null) as java.lang.String;
            var2 = 32767;
            var11 = var34;
            var34 = var7;
            var10 = var8;
            var41 = var37;
            var37 = var35;
            var35 = var23;
         } else {
            var var5: Boolean = true;
            var2 = 0;
            var34 = false;
            var var33: Boolean = false;
            var7 = false;
            var10 = false;
            var21 = null;
            var19 = null;
            var20 = null;
            var41 = null;
            var16 = null;
            var15 = null;
            var22 = null;
            var37 = null;
            var35 = null;
            var28 = null;

            while (var5) {
               val var6: Int = var27.x(var26);
               switch (var6) {
                  case -1:
                     var5 = false;
                     continue;
                  case 0:
                     var18 = var27.m(var26, 0, UnfurledMediaItem.$serializer.INSTANCE, var18) as UnfurledMediaItem;
                     var2 |= 1;
                     break;
                  case 1:
                     var19 = var27.m(var26, 1, MediaGalleryItemType.Serializer.INSTANCE, var19) as MediaGalleryItemType;
                     var2 |= 2;
                     break;
                  case 2:
                     var21 = var27.v(var26, 2, b2.a, var21) as java.lang.String;
                     var2 |= 4;
                     break;
                  case 3:
                     var7 = var27.s(var26, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var37 = var27.v(var26, 4, b2.a, var37) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var33 = var27.s(var26, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var34 = var27.s(var26, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var15 = var27.v(var26, 7, b2.a, var15) as java.lang.String;
                     var2 |= 128;
                     break;
                  case 8:
                     var10 = var27.s(var26, 8);
                     var2 |= 256;
                     var3 = 11;
                     continue;
                  case 9:
                     var22 = var27.v(var26, 9, b2.a, var22) as java.lang.String;
                     var2 |= 512;
                     var3 = 11;
                     continue;
                  case 10:
                     var35 = var27.t(var26, 10);
                     var2 |= 1024;
                     continue;
                  case 11:
                     var28 = var27.t(var26, var3);
                     var2 |= 2048;
                     continue;
                  case 12:
                     var16 = var27.v(var26, 12, b2.a, var16) as java.lang.String;
                     var2 |= 4096;
                     continue;
                  case 13:
                     var41 = var27.v(var26, 13, b2.a, var41) as java.lang.String;
                     var2 |= 8192;
                     continue;
                  case 14:
                     var20 = var27.v(var26, 14, b2.a, var20) as java.lang.String;
                     var2 |= 16384;
                     continue;
                  default:
                     throw new n(var6);
               }

               var3 = 11;
            }

            var16 = var15;
            var41 = var22;
            var20 = var37;
            var37 = var35;
            var35 = var20;
            var15 = var41;
            var22 = var16;
            var11 = var33;
            var12 = var7;
         }

         var27.b(var26);
         return new MediaGalleryItem(
            var2,
            var18,
            var19,
            var21,
            var12,
            (java.lang.String)var20,
            var11,
            var34,
            (java.lang.String)var16,
            var10,
            (java.lang.String)var41,
            (java.lang.String)var37,
            (java.lang.String)var28,
            (java.lang.String)var22,
            (java.lang.String)var15,
            (java.lang.String)var35,
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
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaGalleryItem> {
         return MediaGalleryItem.$serializer.INSTANCE;
      }
   }
}
