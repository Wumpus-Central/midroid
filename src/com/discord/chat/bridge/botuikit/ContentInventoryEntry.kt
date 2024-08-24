package com.discord.chat.bridge.botuikit

import com.discord.chat.presentation.message.view.botuikit.ContentInventoryEventHandlers
import com.discord.primitives.UserId
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.n1

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
         return h.c0(this.subtitles, 0) as Subtitle;
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
         n1.b(var1, 495, ContentInventoryEntry.$serializer.INSTANCE.getDescriptor());
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

   @JvmStatic
   public fun `write$Self`(self: ContentInventoryEntry, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var4: com.discord.primitives.UserId..serializer = com.discord.primitives.UserId..serializer.INSTANCE;
      val var5: UserId = UserId.box-impl(var0.authorId);
      var var3: Boolean = false;
      var1.y(var2, 0, var4, var5);
      var1.z(var2, 1, var0.contentId);
      var1.z(var2, 2, var0.imageUrl);
      var1.z(var2, 3, var0.avatarUrl);
      if (var1.A(var2, 4) || var0.platformIconUrl != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, a2.a, var0.platformIconUrl);
      }

      var1.z(var2, 5, var0.userActionDescription);
      var1.z(var2, 6, var0.title);
      var1.y(var2, 7, new xk.f(Subtitle.$serializer.INSTANCE), var0.subtitles);
      var1.y(var2, 8, new xk.f(GradientColor.$serializer.INSTANCE), var0.gradientColors);
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
      r.h(var3, "contentId");
      r.h(var4, "imageUrl");
      r.h(var5, "avatarUrl");
      r.h(var7, "userActionDescription");
      r.h(var8, "title");
      r.h(var9, "subtitles");
      r.h(var10, "gradientColors");
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
         } else if (!r.c(this.contentId, var1.contentId)) {
            return false;
         } else if (!r.c(this.imageUrl, var1.imageUrl)) {
            return false;
         } else if (!r.c(this.avatarUrl, var1.avatarUrl)) {
            return false;
         } else if (!r.c(this.platformIconUrl, var1.platformIconUrl)) {
            return false;
         } else if (!r.c(this.userActionDescription, var1.userActionDescription)) {
            return false;
         } else if (!r.c(this.title, var1.title)) {
            return false;
         } else if (!r.c(this.subtitles, var1.subtitles)) {
            return false;
         } else {
            return r.c(this.gradientColors, var1.gradientColors);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = UserId.hashCode-impl(this.authorId);
      val var4: Int = this.contentId.hashCode();
      val var3: Int = this.imageUrl.hashCode();
      val var5: Int = this.avatarUrl.hashCode();
      val var1: Int;
      if (this.platformIconUrl == null) {
         var1 = 0;
      } else {
         var1 = this.platformIconUrl.hashCode();
      }

      return (
               ((((((var2 * 31 + var4) * 31 + var3) * 31 + var5) * 31 + var1) * 31 + this.userActionDescription.hashCode()) * 31 + this.title.hashCode()) * 31
                  + this.subtitles.hashCode()
            )
            * 31
         + this.gradientColors.hashCode();
   }

   public fun onTap(handlers: ContentInventoryEventHandlers, tappedElement: String) {
      r.h(var1, "handlers");
      r.h(var2, "tappedElement");
      var1.getOnTapContentInventoryEntry().invoke(UserId.box-impl(this.authorId), this.contentId, var2);
   }

   public override fun toString(): String {
      val var4: java.lang.String = UserId.toString-impl(this.authorId);
      val var6: java.lang.String = this.contentId;
      val var8: java.lang.String = this.imageUrl;
      val var3: java.lang.String = this.avatarUrl;
      val var1: java.lang.String = this.platformIconUrl;
      val var2: java.lang.String = this.userActionDescription;
      val var9: java.lang.String = this.title;
      val var5: java.util.List = this.subtitles;
      val var10: java.util.List = this.gradientColors;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ContentInventoryEntry(authorId=");
      var7.append(var4);
      var7.append(", contentId=");
      var7.append(var6);
      var7.append(", imageUrl=");
      var7.append(var8);
      var7.append(", avatarUrl=");
      var7.append(var3);
      var7.append(", platformIconUrl=");
      var7.append(var1);
      var7.append(", userActionDescription=");
      var7.append(var2);
      var7.append(", title=");
      var7.append(var9);
      var7.append(", subtitles=");
      var7.append(var5);
      var7.append(", gradientColors=");
      var7.append(var10);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : f0<ContentInventoryEntry> {
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
         val var2: a2 = a2.a;
         return new KSerializer[]{
            com.discord.primitives.UserId..serializer.INSTANCE,
            a2.a,
            a2.a,
            a2.a,
            a.u(a2.a),
            var2,
            var2,
            new xk.f(Subtitle.$serializer.INSTANCE),
            new xk.f(GradientColor.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): ContentInventoryEntry {
         r.h(var1, "decoder");
         val var16: SerialDescriptor = this.getDescriptor();
         val var17: c = var1.b(var16);
         val var6: Boolean = var17.p();
         var var4: Byte = 7;
         var var13: Any = null;
         var var2: Int;
         var var7: Any;
         var var9: Any;
         var var10: Any;
         var var11: Any;
         var var12: Any;
         var var14: Any;
         val var15: Any;
         var var20: Any;
         if (var6) {
            var13 = var17.y(var16, 0, com.discord.primitives.UserId..serializer.INSTANCE, null);
            var12 = var17.m(var16, 1);
            var11 = var17.m(var16, 2);
            var20 = var17.m(var16, 3);
            var9 = var17.n(var16, 4, a2.a, null);
            val var18: java.lang.String = var17.m(var16, 5);
            var7 = var17.m(var16, 6);
            var14 = var17.y(var16, 7, new xk.f(Subtitle.$serializer.INSTANCE), null);
            var10 = var17.y(var16, 8, new xk.f(GradientColor.$serializer.INSTANCE), null);
            var2 = 511;
            var15 = var20;
            var20 = var18;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var10 = null;
            var14 = null;
            var9 = null;
            var12 = null;
            var11 = null;
            var var19: Any = null;
            var20 = null;
            var7 = null;

            while (var3) {
               val var5: Int = var17.o(var16);
               switch (var5) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var13 = var17.y(var16, 0, com.discord.primitives.UserId..serializer.INSTANCE, var13);
                     var2 |= 1;
                     var4 = 7;
                     break;
                  case 1:
                     var12 = var17.m(var16, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var11 = var17.m(var16, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var19 = var17.m(var16, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var9 = var17.n(var16, 4, a2.a, var9);
                     var2 |= 16;
                     break;
                  case 5:
                     var20 = var17.m(var16, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var7 = var17.m(var16, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var14 = var17.y(var16, var4, new xk.f(Subtitle.$serializer.INSTANCE), var14);
                     var2 |= 128;
                     break;
                  case 8:
                     var10 = var17.y(var16, 8, new xk.f(GradientColor.$serializer.INSTANCE), var10);
                     var2 |= 256;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var15 = var19;
         }

         var17.c(var16);
         return new ContentInventoryEntry(
            var2,
            var13 as UserId,
            (java.lang.String)var12,
            (java.lang.String)var11,
            (java.lang.String)var15,
            var9 as java.lang.String,
            (java.lang.String)var20,
            (java.lang.String)var7,
            var14 as java.util.List,
            var10 as java.util.List,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ContentInventoryEntry) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ContentInventoryEntry.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContentInventoryEntry> {
         return ContentInventoryEntry.$serializer.INSTANCE;
      }
   }
}
