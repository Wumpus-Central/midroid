package com.discord.chat.bridge.botuikit

import cl.f
import cl.n
import com.discord.chat.presentation.message.view.botuikit.ContentInventoryEventHandlers
import com.discord.primitives.UserId
import dl.a
import fl.b2
import fl.g0
import fl.o1
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
         return i.h0(this.subtitles, 0) as Subtitle;
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
         o1.b(var1, 6807, ContentInventoryEntry.$serializer.INSTANCE.getDescriptor());
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
      val var8: Int = UserId.hashCode-impl(this.authorId);
      val var7: Int = this.contentId.hashCode();
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

      val var14: Int = this.subtitles.hashCode();
      val var13: Int = this.gradientColors.hashCode();
      if (this.clickable != null) {
         var6 = this.clickable.hashCode();
      }

      return (
               (
                        (
                                 (
                                          ((((((((var8 * 31 + var7) * 31 + var9) * 31 + var1) * 31 + var10) * 31 + var2) * 31 + var3) * 31 + var11) * 31 + var4)
                                                * 31
                                             + var12
                                       )
                                       * 31
                                    + var5
                              )
                              * 31
                           + var14
                     )
                     * 31
                  + var13
            )
            * 31
         + var6;
   }

   public fun onTap(handlers: ContentInventoryEventHandlers, tappedElement: String) {
      q.h(var1, "handlers");
      q.h(var2, "tappedElement");
      var1.getOnTapContentInventoryEntry().invoke(UserId.box-impl(this.authorId), this.contentId, var2);
   }

   public override fun toString(): String {
      val var12: java.lang.String = UserId.toString-impl(this.authorId);
      val var10: java.lang.String = this.contentId;
      val var14: java.lang.String = this.imageUrl;
      val var6: ContentInventoryEntryClickable = this.imageClickable;
      val var15: java.lang.String = this.avatarUrl;
      val var1: java.lang.String = this.platformIconUrl;
      val var4: ContentInventoryEntryClickable = this.platformClickable;
      val var11: java.lang.String = this.userActionDescription;
      val var5: ContentInventoryEntryClickable = this.userClickable;
      val var2: java.lang.String = this.title;
      val var3: ContentInventoryEntryClickable = this.titleClickable;
      val var13: java.util.List = this.subtitles;
      val var9: java.util.List = this.gradientColors;
      val var7: ContentInventoryEntryClickable = this.clickable;
      val var8: StringBuilder = new StringBuilder();
      var8.append("ContentInventoryEntry(authorId=");
      var8.append(var12);
      var8.append(", contentId=");
      var8.append(var10);
      var8.append(", imageUrl=");
      var8.append(var14);
      var8.append(", imageClickable=");
      var8.append(var6);
      var8.append(", avatarUrl=");
      var8.append(var15);
      var8.append(", platformIconUrl=");
      var8.append(var1);
      var8.append(", platformClickable=");
      var8.append(var4);
      var8.append(", userActionDescription=");
      var8.append(var11);
      var8.append(", userClickable=");
      var8.append(var5);
      var8.append(", title=");
      var8.append(var2);
      var8.append(", titleClickable=");
      var8.append(var3);
      var8.append(", subtitles=");
      var8.append(var13);
      var8.append(", gradientColors=");
      var8.append(var9);
      var8.append(", clickable=");
      var8.append(var7);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : g0 {
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
         val var1: Array<KSerializer> = ContentInventoryEntry.access$get$childSerializers$cp();
         val var3: b2 = b2.a;
         val var4: ContentInventoryEntryClickable.$serializer = ContentInventoryEntryClickable.$serializer.INSTANCE;
         return new KSerializer[]{
            UserId.$serializer.INSTANCE,
            b2.a,
            b2.a,
            a.u(ContentInventoryEntryClickable.$serializer.INSTANCE),
            var3,
            a.u(var3),
            a.u(var4),
            var3,
            a.u(var4),
            var3,
            a.u(var4),
            var1[11],
            var1[12],
            a.u(var4)
         };
      }

      public open fun deserialize(decoder: Decoder): ContentInventoryEntry {
         q.h(var1, "decoder");
         val var24: SerialDescriptor = this.getDescriptor();
         val var25: c = var1.c(var24);
         var var20: Array<KSerializer> = ContentInventoryEntry.access$get$childSerializers$cp();
         val var6: Boolean = var25.y();
         var var2: Int = 9;
         var var8: UserId = null;
         var var3: Int;
         var var13: Any;
         var var15: Any;
         var var16: java.lang.String;
         val var17: UserId;
         var var18: java.lang.String;
         var var19: java.lang.String;
         val var21: java.lang.String;
         val var22: java.lang.String;
         val var23: Any;
         var var26: Any;
         var var34: Any;
         var var35: java.lang.String;
         var var37: Any;
         if (var6) {
            var17 = var25.m(var24, 0, UserId.$serializer.INSTANCE, null) as UserId;
            var16 = var25.t(var24, 1);
            var19 = var25.t(var24, 2);
            val var7: ContentInventoryEntryClickable.$serializer = ContentInventoryEntryClickable.$serializer.INSTANCE;
            var15 = var25.v(var24, 3, ContentInventoryEntryClickable.$serializer.INSTANCE, null) as ContentInventoryEntryClickable;
            var22 = var25.t(var24, 4);
            var34 = var25.v(var24, 5, b2.a, null) as java.lang.String;
            val var14: ContentInventoryEntryClickable = var25.v(var24, 6, var7, null) as ContentInventoryEntryClickable;
            var35 = var25.t(var24, 7);
            var13 = var25.v(var24, 8, var7, null) as ContentInventoryEntryClickable;
            val var9: java.lang.String = var25.t(var24, 9);
            var37 = var25.v(var24, 10, var7, null) as ContentInventoryEntryClickable;
            val var32: java.util.List = var25.m(var24, 11, var20[11], null) as java.util.List;
            var26 = var25.m(var24, 12, var20[12], null) as java.util.List;
            val var30: ContentInventoryEntryClickable = var25.v(var24, 13, var7, null) as ContentInventoryEntryClickable;
            var3 = 16383;
            var18 = (java.lang.String)var34;
            var34 = var14;
            var21 = var35;
            var35 = var9;
            var23 = var37;
            var37 = var32;
            var20 = var30;
         } else {
            var var5: Boolean = true;
            var3 = 0;
            var15 = null;
            var var39: java.lang.String = null;
            var16 = null;
            var13 = null;
            var37 = null;
            var19 = null;
            var35 = null;
            var34 = null;
            var var33: Any = null;
            var var31: java.lang.String = null;
            var26 = null;
            var18 = null;
            var var42: java.lang.String = null;

            while (var5) {
               var var29: Int;
               label37: {
                  label36: {
                     var29 = var25.x(var24);
                     switch (var29) {
                        case -1:
                           var5 = false;
                           var29 = var2;
                           break label37;
                        case 0:
                           var8 = var25.m(var24, 0, UserId.$serializer.INSTANCE, var8) as UserId;
                           var2 = var3 or 1;
                           break;
                        case 1:
                           var39 = var25.t(var24, 1);
                           var2 = var3 or 2;
                           break;
                        case 2:
                           var31 = var25.t(var24, 2);
                           var2 = var3 or 4;
                           break;
                        case 3:
                           var33 = var25.v(var24, 3, ContentInventoryEntryClickable.$serializer.INSTANCE, var33) as ContentInventoryEntryClickable;
                           var2 = var3 or 8;
                           break;
                        case 4:
                           var26 = var25.t(var24, 4);
                           var2 = var3 or 16;
                           break;
                        case 5:
                           var15 = var25.v(var24, 5, b2.a, var15) as java.lang.String;
                           var2 = var3 or 32;
                           break;
                        case 6:
                           var34 = var25.v(var24, 6, ContentInventoryEntryClickable.$serializer.INSTANCE, var34) as ContentInventoryEntryClickable;
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
                           var42 = var25.t(var24, var2);
                           var3 |= 512;
                           var29 = var2;
                           break label37;
                        case 10:
                           var35 = var25.v(var24, 10, ContentInventoryEntryClickable.$serializer.INSTANCE, var35) as ContentInventoryEntryClickable;
                           var2 = var3 or 1024;
                           break;
                        case 11:
                           var37 = var25.m(var24, 11, var20[11], var37) as java.util.List;
                           var2 = var3 or 2048;
                           break;
                        case 12:
                           var13 = var25.m(var24, 12, var20[12], var13) as java.util.List;
                           var2 = var3 or 4096;
                           break;
                        case 13:
                           var16 = var25.v(var24, 13, ContentInventoryEntryClickable.$serializer.INSTANCE, var16) as ContentInventoryEntryClickable;
                           var2 = var3 or 8192;
                           break;
                        default:
                           throw new n(var29);
                     }

                     var29 = 9;
                     var3 = var2;
                     break label37;
                  }

                  var2 = 9;
                  continue;
               }

               var2 = var29;
            }

            var13 = var19;
            var22 = (java.lang.String)var26;
            var20 = var16;
            var26 = var13;
            var23 = var35;
            var35 = var42;
            var21 = var18;
            var18 = (java.lang.String)var15;
            var15 = var33;
            var19 = var31;
            var16 = var39;
            var17 = var8;
         }

         var25.b(var24);
         return new ContentInventoryEntry(
            var3,
            var17,
            var16,
            var19,
            (ContentInventoryEntryClickable)var15,
            var22,
            var18,
            (ContentInventoryEntryClickable)var34,
            var21,
            (ContentInventoryEntryClickable)var13,
            var35,
            (ContentInventoryEntryClickable)var23,
            (java.util.List)var37,
            (java.util.List)var26,
            var20,
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
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContentInventoryEntry> {
         return ContentInventoryEntry.$serializer.INSTANCE;
      }
   }
}
