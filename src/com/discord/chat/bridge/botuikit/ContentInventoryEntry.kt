package com.discord.chat.bridge.botuikit

import com.discord.chat.presentation.message.view.botuikit.ContentInventoryEventHandlers
import com.discord.primitives.UserId
import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import gn.o1
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
   avatarUrl: String,
   platformIconUrl: String? = ...,
   userActionDescription: String,
   title: String,
   subtitles: List<Subtitle>,
   gradientColors: List<GradientColor>
) : ContentInventoryEntry(var1, var3, var4, var5, var6, var7, var8, var9, var10) {
   public final val authorId: UserId
   public final val avatarUrl: String
   public final val contentId: String
   public final val gradientColors: List<GradientColor>
   public final val imageUrl: String
   public final val platformIconUrl: String?

   public final val subtitle: Subtitle?
      public final get() {
         return i.g0(this.subtitles, 0) as Subtitle;
      }


   public final val subtitles: List<Subtitle>
   public final val title: String
   public final val userActionDescription: String

   fun ContentInventoryEntry(
      var1: Int,
      var2: UserId,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: java.lang.String,
      var7: java.lang.String,
      var8: java.lang.String,
      var9: MutableList<Subtitle>,
      var10: MutableList<GradientColor>,
      var11: SerializationConstructorMarker
   ) {
      if (495 != (var1 and 495)) {
         o1.b(var1, 495, ContentInventoryEntry.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.authorId = var2.unbox-impl();
      this.contentId = var3;
      this.imageUrl = var4;
      this.avatarUrl = var5;
      if ((var1 and 16) == 0) {
         this.platformIconUrl = null;
      } else {
         this.platformIconUrl = var6;
      }

      this.userActionDescription = var7;
      this.title = var8;
      this.subtitles = var9;
      this.gradientColors = var10;
   }

   fun ContentInventoryEntry(
      var1: Long,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: java.lang.String,
      var7: java.lang.String,
      var8: java.lang.String,
      var9: MutableList<Subtitle>,
      var10: MutableList<GradientColor>
   ) {
      q.h(var3, "contentId");
      q.h(var4, "imageUrl");
      q.h(var5, "avatarUrl");
      q.h(var7, "userActionDescription");
      q.h(var8, "title");
      q.h(var9, "subtitles");
      q.h(var10, "gradientColors");
      super();
      this.authorId = var1;
      this.contentId = var3;
      this.imageUrl = var4;
      this.avatarUrl = var5;
      this.platformIconUrl = var6;
      this.userActionDescription = var7;
      this.title = var8;
      this.subtitles = var9;
      this.gradientColors = var10;
   }

   public operator fun component1(): UserId {
      return this.authorId;
   }

   public operator fun component2(): String {
      return this.contentId;
   }

   public operator fun component3(): String {
      return this.imageUrl;
   }

   public operator fun component4(): String {
      return this.avatarUrl;
   }

   public operator fun component5(): String? {
      return this.platformIconUrl;
   }

   public operator fun component6(): String {
      return this.userActionDescription;
   }

   public operator fun component7(): String {
      return this.title;
   }

   public operator fun component8(): List<Subtitle> {
      return this.subtitles;
   }

   public operator fun component9(): List<GradientColor> {
      return this.gradientColors;
   }

   public fun copy(
      authorId: UserId = ...,
      contentId: String = ...,
      imageUrl: String = ...,
      avatarUrl: String = ...,
      platformIconUrl: String? = ...,
      userActionDescription: String = ...,
      title: String = ...,
      subtitles: List<Subtitle> = ...,
      gradientColors: List<GradientColor> = ...
   ): ContentInventoryEntry {
      q.h(var3, "contentId");
      q.h(var4, "imageUrl");
      q.h(var5, "avatarUrl");
      q.h(var7, "userActionDescription");
      q.h(var8, "title");
      q.h(var9, "subtitles");
      q.h(var10, "gradientColors");
      return new ContentInventoryEntry(var1, var3, var4, var5, var6, var7, var8, var9, var10, null);
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
         } else if (!q.c(this.avatarUrl, var1.avatarUrl)) {
            return false;
         } else if (!q.c(this.platformIconUrl, var1.platformIconUrl)) {
            return false;
         } else if (!q.c(this.userActionDescription, var1.userActionDescription)) {
            return false;
         } else if (!q.c(this.title, var1.title)) {
            return false;
         } else if (!q.c(this.subtitles, var1.subtitles)) {
            return false;
         } else {
            return q.c(this.gradientColors, var1.gradientColors);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = UserId.hashCode-impl(this.authorId);
      val var3: Int = this.contentId.hashCode();
      val var4: Int = this.imageUrl.hashCode();
      val var5: Int = this.avatarUrl.hashCode();
      val var1: Int;
      if (this.platformIconUrl == null) {
         var1 = 0;
      } else {
         var1 = this.platformIconUrl.hashCode();
      }

      return (
               ((((((var2 * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var1) * 31 + this.userActionDescription.hashCode()) * 31 + this.title.hashCode()) * 31
                  + this.subtitles.hashCode()
            )
            * 31
         + this.gradientColors.hashCode();
   }

   public fun onTap(handlers: ContentInventoryEventHandlers, tappedElement: String) {
      q.h(var1, "handlers");
      q.h(var2, "tappedElement");
      var1.getOnTapContentInventoryEntry().invoke(UserId.box-impl(this.authorId), this.contentId, var2);
   }

   public override fun toString(): String {
      val var5: java.lang.String = UserId.toString-impl(this.authorId);
      val var6: java.lang.String = this.contentId;
      val var9: java.lang.String = this.imageUrl;
      val var2: java.lang.String = this.avatarUrl;
      val var10: java.lang.String = this.platformIconUrl;
      val var7: java.lang.String = this.userActionDescription;
      val var8: java.lang.String = this.title;
      val var4: java.util.List = this.subtitles;
      val var1: java.util.List = this.gradientColors;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ContentInventoryEntry(authorId=");
      var3.append(var5);
      var3.append(", contentId=");
      var3.append(var6);
      var3.append(", imageUrl=");
      var3.append(var9);
      var3.append(", avatarUrl=");
      var3.append(var2);
      var3.append(", platformIconUrl=");
      var3.append(var10);
      var3.append(", userActionDescription=");
      var3.append(var7);
      var3.append(", title=");
      var3.append(var8);
      var3.append(", subtitles=");
      var3.append(var4);
      var3.append(", gradientColors=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
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
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.ContentInventoryEntry", var0, 9);
         var1.l("authorId", false);
         var1.l("contentId", false);
         var1.l("imageUrl", false);
         var1.l("avatarUrl", false);
         var1.l("platformIconUrl", true);
         var1.l("userActionDescription", false);
         var1.l("title", false);
         var1.l("subtitles", false);
         var1.l("gradientColors", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: Array<KSerializer> = ContentInventoryEntry.access$get$childSerializers$cp();
         val var2: b2 = b2.a;
         return new KSerializer[]{UserId.$serializer.INSTANCE, b2.a, b2.a, b2.a, a.u(b2.a), var2, var2, var3[7], var3[8]};
      }

      public open fun deserialize(decoder: Decoder): ContentInventoryEntry {
         q.h(var1, "decoder");
         val var16: SerialDescriptor = this.getDescriptor();
         val var17: c = var1.b(var16);
         val var18: Array<KSerializer> = ContentInventoryEntry.access$get$childSerializers$cp();
         val var6: Boolean = var17.p();
         var var3: Byte = 6;
         var var11: UserId = null;
         var var2: Int;
         var var7: Any;
         var var8: Any;
         var var9: Any;
         var var12: Any;
         var var13: Any;
         var var14: java.util.List;
         val var15: Any;
         val var20: java.util.List;
         if (var6) {
            var11 = var17.y(var16, 0, UserId.$serializer.INSTANCE, null) as UserId;
            var15 = var17.m(var16, 1);
            var9 = var17.m(var16, 2);
            var13 = var17.m(var16, 3);
            var12 = var17.n(var16, 4, b2.a, null) as java.lang.String;
            var7 = var17.m(var16, 5);
            val var19: java.lang.String = var17.m(var16, 6);
            val var10: java.util.List = var17.y(var16, 7, var18[7], null) as java.util.List;
            var14 = var17.y(var16, 8, var18[8], null) as java.util.List;
            var2 = 511;
            var8 = var19;
            var20 = var10;
         } else {
            var var4: Boolean = true;
            var2 = 0;
            var14 = null;
            var13 = null;
            var12 = null;
            var var23: Any = null;
            var9 = null;
            var8 = null;
            var7 = null;
            var var21: Any = null;

            while (var4) {
               val var5: Int = var17.o(var16);
               switch (var5) {
                  case -1:
                     var4 = false;
                     break;
                  case 0:
                     var11 = var17.y(var16, 0, UserId.$serializer.INSTANCE, var11) as UserId;
                     var2 |= 1;
                     var3 = 6;
                     break;
                  case 1:
                     var23 = var17.m(var16, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var9 = var17.m(var16, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var8 = var17.m(var16, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var12 = var17.n(var16, 4, b2.a, var12) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var7 = var17.m(var16, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var21 = var17.m(var16, var3);
                     var2 |= 64;
                     break;
                  case 7:
                     var13 = var17.y(var16, 7, var18[7], var13) as java.util.List;
                     var2 |= 128;
                     break;
                  case 8:
                     var14 = var17.y(var16, 8, var18[8], var14) as java.util.List;
                     var2 |= 256;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var8 = var21;
            var20 = (java.util.List)var13;
            var13 = var8;
            var15 = var23;
         }

         var17.c(var16);
         return new ContentInventoryEntry(
            var2,
            var11,
            (java.lang.String)var15,
            (java.lang.String)var9,
            (java.lang.String)var13,
            (java.lang.String)var12,
            (java.lang.String)var7,
            (java.lang.String)var8,
            var20,
            var14,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ContentInventoryEntry) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ContentInventoryEntry.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContentInventoryEntry> {
         return ContentInventoryEntry.$serializer.INSTANCE;
      }
   }
}
