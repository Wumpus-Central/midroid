package com.discord.chat.bridge.botuikit

import com.discord.primitives.UserId
import fa.f
import fa.n
import ga.a
import ia.C0
import ia.G
import ia.p0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

@f
public data class ContentInventoryEntry(authorId: UserId,
   contentId: String,
   imageUrl: String,
   imageClickable: ContentInventoryEntryClickable? = ...,
   avatarUrl: String,
   platformIconUrl: String? = ...,
   platformClickable: ContentInventoryEntryClickable? = ...,
   userActionDescription: String,
   userClickable: ContentInventoryEntryClickable? = ...,
   title: String,
   titleClickable: ContentInventoryEntryClickable? = ...,
   subtitles: List<Subtitle>,
   gradientColors: List<GradientColor>,
   clickable: ContentInventoryEntryClickable? = ...
) : ContentInventoryEntry(var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15) {
   public final val authorId: UserId
   public final val avatarUrl: String
   public final val clickable: ContentInventoryEntryClickable?
   public final val contentId: String
   public final val gradientColors: List<GradientColor>
   public final val imageClickable: ContentInventoryEntryClickable?
   public final val imageUrl: String
   public final val platformClickable: ContentInventoryEntryClickable?
   public final val platformIconUrl: String?

   public final val subtitle: Subtitle?
      public final get() {
         return i.i0(this.subtitles, 0) as Subtitle;
      }


   public final val subtitles: List<Subtitle>
   public final val title: String
   public final val titleClickable: ContentInventoryEntryClickable?
   public final val userActionDescription: String
   public final val userClickable: ContentInventoryEntryClickable?

   fun ContentInventoryEntry(
      var1: Int,
      var2: UserId,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: ContentInventoryEntryClickable,
      var6: java.lang.String,
      var7: java.lang.String,
      var8: ContentInventoryEntryClickable,
      var9: java.lang.String,
      var10: ContentInventoryEntryClickable,
      var11: java.lang.String,
      var12: ContentInventoryEntryClickable,
      var13: MutableList<Subtitle>,
      var14: MutableList<GradientColor>,
      var15: ContentInventoryEntryClickable,
      var16: SerializationConstructorMarker
   ) {
      if (6807 != (var1 and 6807)) {
         p0.b(var1, 6807, ContentInventoryEntry.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.authorId = var2.unbox-impl();
      this.contentId = var3;
      this.imageUrl = var4;
      if ((var1 and 8) == 0) {
         this.imageClickable = null;
      } else {
         this.imageClickable = var5;
      }

      this.avatarUrl = var6;
      if ((var1 and 32) == 0) {
         this.platformIconUrl = null;
      } else {
         this.platformIconUrl = var7;
      }

      if ((var1 and 64) == 0) {
         this.platformClickable = null;
      } else {
         this.platformClickable = var8;
      }

      this.userActionDescription = var9;
      if ((var1 and 256) == 0) {
         this.userClickable = null;
      } else {
         this.userClickable = var10;
      }

      this.title = var11;
      if ((var1 and 1024) == 0) {
         this.titleClickable = null;
      } else {
         this.titleClickable = var12;
      }

      this.subtitles = var13;
      this.gradientColors = var14;
      if ((var1 and 8192) == 0) {
         this.clickable = null;
      } else {
         this.clickable = var15;
      }
   }

   fun ContentInventoryEntry(
      var1: Long,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: ContentInventoryEntryClickable,
      var6: java.lang.String,
      var7: java.lang.String,
      var8: ContentInventoryEntryClickable,
      var9: java.lang.String,
      var10: ContentInventoryEntryClickable,
      var11: java.lang.String,
      var12: ContentInventoryEntryClickable,
      var13: MutableList<Subtitle>,
      var14: MutableList<GradientColor>,
      var15: ContentInventoryEntryClickable
   ) {
      q.h(var3, "contentId");
      q.h(var4, "imageUrl");
      q.h(var6, "avatarUrl");
      q.h(var9, "userActionDescription");
      q.h(var11, "title");
      q.h(var13, "subtitles");
      q.h(var14, "gradientColors");
      super();
      this.authorId = var1;
      this.contentId = var3;
      this.imageUrl = var4;
      this.imageClickable = var5;
      this.avatarUrl = var6;
      this.platformIconUrl = var7;
      this.platformClickable = var8;
      this.userActionDescription = var9;
      this.userClickable = var10;
      this.title = var11;
      this.titleClickable = var12;
      this.subtitles = var13;
      this.gradientColors = var14;
      this.clickable = var15;
   }

   public operator fun component1(): UserId {
      return this.authorId;
   }

   public operator fun component10(): String {
      return this.title;
   }

   public operator fun component11(): ContentInventoryEntryClickable? {
      return this.titleClickable;
   }

   public operator fun component12(): List<Subtitle> {
      return this.subtitles;
   }

   public operator fun component13(): List<GradientColor> {
      return this.gradientColors;
   }

   public operator fun component14(): ContentInventoryEntryClickable? {
      return this.clickable;
   }

   public operator fun component2(): String {
      return this.contentId;
   }

   public operator fun component3(): String {
      return this.imageUrl;
   }

   public operator fun component4(): ContentInventoryEntryClickable? {
      return this.imageClickable;
   }

   public operator fun component5(): String {
      return this.avatarUrl;
   }

   public operator fun component6(): String? {
      return this.platformIconUrl;
   }

   public operator fun component7(): ContentInventoryEntryClickable? {
      return this.platformClickable;
   }

   public operator fun component8(): String {
      return this.userActionDescription;
   }

   public operator fun component9(): ContentInventoryEntryClickable? {
      return this.userClickable;
   }

   public fun copy(
      authorId: UserId = ...,
      contentId: String = ...,
      imageUrl: String = ...,
      imageClickable: ContentInventoryEntryClickable? = ...,
      avatarUrl: String = ...,
      platformIconUrl: String? = ...,
      platformClickable: ContentInventoryEntryClickable? = ...,
      userActionDescription: String = ...,
      userClickable: ContentInventoryEntryClickable? = ...,
      title: String = ...,
      titleClickable: ContentInventoryEntryClickable? = ...,
      subtitles: List<Subtitle> = ...,
      gradientColors: List<GradientColor> = ...,
      clickable: ContentInventoryEntryClickable? = ...
   ): ContentInventoryEntry {
      q.h(var3, "contentId");
      q.h(var4, "imageUrl");
      q.h(var6, "avatarUrl");
      q.h(var9, "userActionDescription");
      q.h(var11, "title");
      q.h(var13, "subtitles");
      q.h(var14, "gradientColors");
      return new ContentInventoryEntry(var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContentInventoryEntry) {
         return false;
      } else {
         var1 = var1;
         if (!UserId.equals-impl0(this.authorId, var1.authorId)) {
            return false;
         } else if (!q.c(this.contentId, var1.contentId)) {
            return false;
         } else if (!q.c(this.imageUrl, var1.imageUrl)) {
            return false;
         } else if (!q.c(this.imageClickable, var1.imageClickable)) {
            return false;
         } else if (!q.c(this.avatarUrl, var1.avatarUrl)) {
            return false;
         } else if (!q.c(this.platformIconUrl, var1.platformIconUrl)) {
            return false;
         } else if (!q.c(this.platformClickable, var1.platformClickable)) {
            return false;
         } else if (!q.c(this.userActionDescription, var1.userActionDescription)) {
            return false;
         } else if (!q.c(this.userClickable, var1.userClickable)) {
            return false;
         } else if (!q.c(this.title, var1.title)) {
            return false;
         } else if (!q.c(this.titleClickable, var1.titleClickable)) {
            return false;
         } else if (!q.c(this.subtitles, var1.subtitles)) {
            return false;
         } else if (!q.c(this.gradientColors, var1.gradientColors)) {
            return false;
         } else {
            return q.c(this.clickable, var1.clickable);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = UserId.hashCode-impl(this.authorId);
      val var8: Int = this.contentId.hashCode();
      val var9: Int = this.imageUrl.hashCode();
      var var6: Int = 0;
      val var1: Int;
      if (this.imageClickable == null) {
         var1 = 0;
      } else {
         var1 = this.imageClickable.hashCode();
      }

      val var10: Int = this.avatarUrl.hashCode();
      val var2: Int;
      if (this.platformIconUrl == null) {
         var2 = 0;
      } else {
         var2 = this.platformIconUrl.hashCode();
      }

      val var3: Int;
      if (this.platformClickable == null) {
         var3 = 0;
      } else {
         var3 = this.platformClickable.hashCode();
      }

      val var11: Int = this.userActionDescription.hashCode();
      val var4: Int;
      if (this.userClickable == null) {
         var4 = 0;
      } else {
         var4 = this.userClickable.hashCode();
      }

      val var12: Int = this.title.hashCode();
      val var5: Int;
      if (this.titleClickable == null) {
         var5 = 0;
      } else {
         var5 = this.titleClickable.hashCode();
      }

      val var13: Int = this.subtitles.hashCode();
      val var14: Int = this.gradientColors.hashCode();
      if (this.clickable != null) {
         var6 = this.clickable.hashCode();
      }

      return (
               (
                        (
                                 (
                                          ((((((((var7 * 31 + var8) * 31 + var9) * 31 + var1) * 31 + var10) * 31 + var2) * 31 + var3) * 31 + var11) * 31 + var4)
                                                * 31
                                             + var12
                                       )
                                       * 31
                                    + var5
                              )
                              * 31
                           + var13
                     )
                     * 31
                  + var14
            )
            * 31
         + var6;
   }

   public override fun toString(): String {
      val var4: java.lang.String = UserId.toString-impl(this.authorId);
      val var3: java.lang.String = this.contentId;
      val var10: java.lang.String = this.imageUrl;
      val var14: ContentInventoryEntryClickable = this.imageClickable;
      val var13: java.lang.String = this.avatarUrl;
      val var6: java.lang.String = this.platformIconUrl;
      val var1: ContentInventoryEntryClickable = this.platformClickable;
      val var8: java.lang.String = this.userActionDescription;
      val var7: ContentInventoryEntryClickable = this.userClickable;
      val var9: java.lang.String = this.title;
      val var11: ContentInventoryEntryClickable = this.titleClickable;
      val var12: java.util.List = this.subtitles;
      val var15: java.util.List = this.gradientColors;
      val var5: ContentInventoryEntryClickable = this.clickable;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ContentInventoryEntry(authorId=");
      var2.append(var4);
      var2.append(", contentId=");
      var2.append(var3);
      var2.append(", imageUrl=");
      var2.append(var10);
      var2.append(", imageClickable=");
      var2.append(var14);
      var2.append(", avatarUrl=");
      var2.append(var13);
      var2.append(", platformIconUrl=");
      var2.append(var6);
      var2.append(", platformClickable=");
      var2.append(var1);
      var2.append(", userActionDescription=");
      var2.append(var8);
      var2.append(", userClickable=");
      var2.append(var7);
      var2.append(", title=");
      var2.append(var9);
      var2.append(", titleClickable=");
      var2.append(var11);
      var2.append(", subtitles=");
      var2.append(var12);
      var2.append(", gradientColors=");
      var2.append(var15);
      var2.append(", clickable=");
      var2.append(var5);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ContentInventoryEntry.$serializer = new ContentInventoryEntry.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.ContentInventoryEntry", var0, 14);
         var1.l("authorId", false);
         var1.l("contentId", false);
         var1.l("imageUrl", false);
         var1.l("imageClickable", true);
         var1.l("avatarUrl", false);
         var1.l("platformIconUrl", true);
         var1.l("platformClickable", true);
         var1.l("userActionDescription", false);
         var1.l("userClickable", true);
         var1.l("title", false);
         var1.l("titleClickable", true);
         var1.l("subtitles", false);
         var1.l("gradientColors", false);
         var1.l("clickable", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var8: Array<KSerializer> = ContentInventoryEntry.access$get$childSerializers$cp();
         val var2: C0 = C0.a;
         val var9: ContentInventoryEntryClickable.$serializer = ContentInventoryEntryClickable.$serializer.INSTANCE;
         return new KSerializer[]{
            UserId.$serializer.INSTANCE,
            C0.a,
            C0.a,
            a.u(ContentInventoryEntryClickable.$serializer.INSTANCE),
            var2,
            a.u(var2),
            a.u(var9),
            var2,
            a.u(var9),
            var2,
            a.u(var9),
            var8[11],
            var8[12],
            a.u(var9)
         };
      }

      public open fun deserialize(decoder: Decoder): ContentInventoryEntry {
         q.h(var1, "decoder");
         val var24: SerialDescriptor = this.getDescriptor();
         val var25: c = var1.c(var24);
         var var22: Array<KSerializer> = ContentInventoryEntry.access$get$childSerializers$cp();
         val var6: Boolean = var25.y();
         var var2: Int = 9;
         var var8: UserId = null;
         var var13: Any;
         var var14: java.lang.String;
         var var16: Any;
         var var17: java.lang.String;
         var var18: java.lang.String;
         var var19: Any;
         val var20: java.lang.String;
         val var21: UserId;
         val var23: Any;
         var var26: Any;
         var var35: java.lang.String;
         var var37: java.lang.String;
         var var39: Any;
         if (var6) {
            var21 = var25.m(var24, 0, UserId.$serializer.INSTANCE, null) as UserId;
            var14 = var25.t(var24, 1);
            var20 = var25.t(var24, 2);
            val var7: ContentInventoryEntryClickable.$serializer = ContentInventoryEntryClickable.$serializer.INSTANCE;
            var16 = var25.v(var24, 3, ContentInventoryEntryClickable.$serializer.INSTANCE, null) as ContentInventoryEntryClickable;
            var18 = var25.t(var24, 4);
            var37 = var25.v(var24, 5, C0.a, null) as java.lang.String;
            val var15: ContentInventoryEntryClickable = var25.v(var24, 6, var7, null) as ContentInventoryEntryClickable;
            var35 = var25.t(var24, 7);
            var13 = var25.v(var24, 8, var7, null) as ContentInventoryEntryClickable;
            val var9: java.lang.String = var25.t(var24, 9);
            var39 = var25.v(var24, 10, var7, null) as ContentInventoryEntryClickable;
            val var33: java.util.List = var25.m(var24, 11, var22[11], null) as java.util.List;
            var26 = var25.m(var24, 12, var22[12], null) as java.util.List;
            val var31: ContentInventoryEntryClickable = var25.v(var24, 13, var7, null) as ContentInventoryEntryClickable;
            var2 = 16383;
            var17 = var37;
            var19 = var15;
            var37 = var35;
            var35 = var9;
            var23 = var39;
            var39 = var33;
            var22 = var31;
         } else {
            var var5: Boolean = true;
            var var3: Int = 0;
            var var41: java.lang.String = null;
            var14 = null;
            var16 = null;
            var13 = null;
            var39 = null;
            var19 = null;
            var37 = null;
            var35 = null;
            var var34: Any = null;
            var var32: java.lang.String = null;
            var26 = null;
            var18 = null;
            var17 = null;

            while (var5) {
               var var30: Int;
               label37: {
                  label36: {
                     var30 = var25.x(var24);
                     switch (var30) {
                        case -1:
                           var5 = false;
                           var30 = var2;
                           break label37;
                        case 0:
                           var8 = var25.m(var24, 0, UserId.$serializer.INSTANCE, var8) as UserId;
                           var2 = var3 or 1;
                           break;
                        case 1:
                           var14 = var25.t(var24, 1);
                           var2 = var3 or 2;
                           break;
                        case 2:
                           var32 = var25.t(var24, 2);
                           var2 = var3 or 4;
                           break;
                        case 3:
                           var34 = var25.v(var24, 3, ContentInventoryEntryClickable.$serializer.INSTANCE, var34) as ContentInventoryEntryClickable;
                           var2 = var3 or 8;
                           break;
                        case 4:
                           var26 = var25.t(var24, 4);
                           var2 = var3 or 16;
                           break;
                        case 5:
                           var41 = var25.v(var24, 5, C0.a, var41) as java.lang.String;
                           var2 = var3 or 32;
                           break;
                        case 6:
                           var35 = var25.v(var24, 6, ContentInventoryEntryClickable.$serializer.INSTANCE, var35) as ContentInventoryEntryClickable;
                           var2 = var3 or 64;
                           break;
                        case 7:
                           var18 = var25.t(var24, 7);
                           var3 |= 128;
                           break label36;
                        case 8:
                           var19 = var25.v(var24, 8, ContentInventoryEntryClickable.$serializer.INSTANCE, var19) as ContentInventoryEntryClickable;
                           var3 |= 256;
                           break label36;
                        case 9:
                           var17 = var25.t(var24, var2);
                           var3 |= 512;
                           var30 = var2;
                           break label37;
                        case 10:
                           var37 = var25.v(var24, 10, ContentInventoryEntryClickable.$serializer.INSTANCE, var37) as ContentInventoryEntryClickable;
                           var2 = var3 or 1024;
                           break;
                        case 11:
                           var39 = var25.m(var24, 11, var22[11], var39) as java.util.List;
                           var2 = var3 or 2048;
                           break;
                        case 12:
                           var13 = var25.m(var24, 12, var22[12], var13) as java.util.List;
                           var2 = var3 or 4096;
                           break;
                        case 13:
                           var16 = var25.v(var24, 13, ContentInventoryEntryClickable.$serializer.INSTANCE, var16) as ContentInventoryEntryClickable;
                           var2 = var3 or 8192;
                           break;
                        default:
                           throw new n(var30);
                     }

                     var30 = 9;
                     var3 = var2;
                     break label37;
                  }

                  var2 = 9;
                  continue;
               }

               var2 = var30;
            }

            var2 = var3;
            var22 = (KSerializer[])var16;
            var35 = var17;
            var26 = var13;
            var23 = var37;
            var13 = var19;
            var37 = var18;
            var19 = var35;
            var17 = var41;
            var18 = (java.lang.String)var26;
            var16 = var34;
            var20 = var32;
            var21 = var8;
         }

         var25.b(var24);
         return new ContentInventoryEntry(
            var2,
            var21,
            var14,
            var20,
            (ContentInventoryEntryClickable)var16,
            var18,
            var17,
            (ContentInventoryEntryClickable)var19,
            var37,
            (ContentInventoryEntryClickable)var13,
            var35,
            (ContentInventoryEntryClickable)var23,
            (java.util.List)var39,
            (java.util.List)var26,
            var22,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ContentInventoryEntry) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ContentInventoryEntry.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ia.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContentInventoryEntry> {
         return ContentInventoryEntry.$serializer.INSTANCE;
      }
   }
}
