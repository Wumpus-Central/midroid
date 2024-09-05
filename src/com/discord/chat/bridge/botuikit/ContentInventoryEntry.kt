package com.discord.chat.bridge.botuikit

import com.discord.chat.presentation.message.view.botuikit.ContentInventoryEventHandlers
import com.discord.primitives.UserId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.o1

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
      val var8: java.lang.String = UserId.toString-impl(this.authorId);
      val var6: java.lang.String = this.contentId;
      val var7: java.lang.String = this.imageUrl;
      val var1: java.lang.String = this.avatarUrl;
      val var10: java.lang.String = this.platformIconUrl;
      val var2: java.lang.String = this.userActionDescription;
      val var3: java.lang.String = this.title;
      val var4: java.util.List = this.subtitles;
      val var5: java.util.List = this.gradientColors;
      val var9: StringBuilder = new StringBuilder();
      var9.append("ContentInventoryEntry(authorId=");
      var9.append(var8);
      var9.append(", contentId=");
      var9.append(var6);
      var9.append(", imageUrl=");
      var9.append(var7);
      var9.append(", avatarUrl=");
      var9.append(var1);
      var9.append(", platformIconUrl=");
      var9.append(var10);
      var9.append(", userActionDescription=");
      var9.append(var2);
      var9.append(", title=");
      var9.append(var3);
      var9.append(", subtitles=");
      var9.append(var4);
      var9.append(", gradientColors=");
      var9.append(var5);
      var9.append(")");
      return var9.toString();
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
         var1.c("authorId", false);
         var1.c("contentId", false);
         var1.c("imageUrl", false);
         var1.c("avatarUrl", false);
         var1.c("platformIconUrl", true);
         var1.c("userActionDescription", false);
         var1.c("title", false);
         var1.c("subtitles", false);
         var1.c("gradientColors", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: Array<KSerializer> = ContentInventoryEntry.access$get$childSerializers$cp();
         val var2: b2 = b2.a;
         return new KSerializer[]{UserId.$serializer.INSTANCE, b2.a, b2.a, b2.a, a.u(b2.a), var2, var2, var3[7], var3[8]};
      }

      public open fun deserialize(decoder: Decoder): ContentInventoryEntry {
         q.h(var1, "decoder");
         val var17: SerialDescriptor = this.getDescriptor();
         val var18: c = var1.b(var17);
         val var15: Array<KSerializer> = ContentInventoryEntry.access$get$childSerializers$cp();
         val var6: Boolean = var18.p();
         var var3: Byte = 6;
         var var11: UserId = null;
         var var2: Int;
         var var8: java.util.List;
         var var9: Any;
         var var10: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var19: Any;
         var var20: java.util.List;
         if (var6) {
            var11 = var18.y(var17, 0, UserId.$serializer.INSTANCE, null) as UserId;
            var10 = var18.m(var17, 1);
            var9 = var18.m(var17, 2);
            var12 = var18.m(var17, 3);
            var13 = var18.n(var17, 4, b2.a, null) as java.lang.String;
            val var7: java.lang.String = var18.m(var17, 5);
            var19 = var18.m(var17, 6);
            var8 = var18.y(var17, 7, var15[7], null) as java.util.List;
            val var26: java.util.List = var18.y(var17, 8, var15[8], null) as java.util.List;
            var2 = 511;
            var14 = var7;
            var20 = var26;
         } else {
            var var4: Boolean = true;
            var2 = 0;
            var14 = null;
            var13 = null;
            var12 = null;
            var10 = null;
            var9 = null;
            var8 = null;
            var20 = null;
            var19 = null;

            while (var4) {
               val var5: Int = var18.o(var17);
               switch (var5) {
                  case -1:
                     var4 = false;
                     break;
                  case 0:
                     var11 = var18.y(var17, 0, UserId.$serializer.INSTANCE, var11) as UserId;
                     var2 |= 1;
                     var3 = 6;
                     break;
                  case 1:
                     var10 = var18.m(var17, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var9 = var18.m(var17, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var8 = var18.m(var17, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var12 = var18.n(var17, 4, b2.a, var12) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var20 = var18.m(var17, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var19 = var18.m(var17, var3);
                     var2 |= 64;
                     break;
                  case 7:
                     var13 = var18.y(var17, 7, var15[7], var13) as java.util.List;
                     var2 |= 128;
                     break;
                  case 8:
                     var14 = var18.y(var17, 8, var15[8], var14) as java.util.List;
                     var2 |= 256;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var20 = (java.util.List)var14;
            var8 = (java.util.List)var13;
            var14 = var20;
            var13 = var12;
            var12 = var8;
         }

         var18.c(var17);
         return new ContentInventoryEntry(
            var2,
            var11,
            (java.lang.String)var10,
            (java.lang.String)var9,
            (java.lang.String)var12,
            (java.lang.String)var13,
            (java.lang.String)var14,
            (java.lang.String)var19,
            var8,
            var20,
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
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContentInventoryEntry> {
         return ContentInventoryEntry.$serializer.INSTANCE;
      }
   }
}
