package com.discord.chat.bridge.postpreviewembed

import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
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
import xk.h
import xk.m0
import xk.n1

@f
public data class PostPreviewEmbed(parentChannelId: ChannelId,
      threadId: ChannelId,
      messageId: MessageId,
      guildId: GuildId,
      title: String,
      ctaText: String,
      ctaButtonColor: Int,
      footer: StructurableText,
      subtitle: String? = ...,
      coverImage: String? = ...,
      blurredCoverImage: String? = ...,
      coverImageOverlayText: String? = ...,
      backgroundImage: String? = ...,
      spoiler: String? = ...,
      obscure: String? = ...,
      obscureAwaitingScan: Boolean? = ...,
      shouldSpoiler: Boolean = ...
   ) : PostPreviewEmbed(var1, var3, var5, var6, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20),
   SpoilerableData {
   public final val backgroundImage: String?
   public final val blurredCoverImage: String?
   public final val coverImage: String?
   public final val coverImageOverlayText: String?
   public final val ctaButtonColor: Int
   public final val ctaText: String
   public final val footer: StructurableText
   public final val guildId: GuildId
   public final val messageId: MessageId
   public final val obscure: String?
   public final val obscureAwaitingScan: Boolean?
   public open val obscureOrNull: String?
   public final val parentChannelId: ChannelId
   public final val shouldSpoiler: Boolean
   public final val spoiler: String?
   public open val spoilerOrNull: String?
   public final val subtitle: String?
   public final val threadId: ChannelId
   public final val title: String

   fun PostPreviewEmbed(
      var1: Int,
      var2: ChannelId,
      var3: ChannelId,
      var4: java.lang.String,
      var5: GuildId,
      var6: java.lang.String,
      var7: java.lang.String,
      var8: Int,
      var9: StructurableText,
      var10: java.lang.String,
      var11: java.lang.String,
      var12: java.lang.String,
      var13: java.lang.String,
      var14: java.lang.String,
      var15: java.lang.String,
      var16: java.lang.String,
      var17: java.lang.Boolean,
      var18: Boolean,
      var19: java.lang.String,
      var20: java.lang.String,
      var21: SerializationConstructorMarker
   ) {
      if (255 != (var1 and 255)) {
         n1.b(var1, 255, PostPreviewEmbed.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.parentChannelId = var2.unbox-impl();
      this.threadId = var3.unbox-impl();
      this.messageId = var4;
      this.guildId = var5.unbox-impl();
      this.title = var6;
      this.ctaText = var7;
      this.ctaButtonColor = var8;
      this.footer = var9;
      if ((var1 and 256) == 0) {
         this.subtitle = null;
      } else {
         this.subtitle = var10;
      }

      if ((var1 and 512) == 0) {
         this.coverImage = null;
      } else {
         this.coverImage = var11;
      }

      if ((var1 and 1024) == 0) {
         this.blurredCoverImage = null;
      } else {
         this.blurredCoverImage = var12;
      }

      if ((var1 and 2048) == 0) {
         this.coverImageOverlayText = null;
      } else {
         this.coverImageOverlayText = var13;
      }

      if ((var1 and 4096) == 0) {
         this.backgroundImage = null;
      } else {
         this.backgroundImage = var14;
      }

      if ((var1 and 8192) == 0) {
         this.spoiler = null;
      } else {
         this.spoiler = var15;
      }

      if ((var1 and 16384) == 0) {
         this.obscure = null;
      } else {
         this.obscure = var16;
      }

      if (('耀' and var1) == 0) {
         this.obscureAwaitingScan = null;
      } else {
         this.obscureAwaitingScan = var17;
      }

      if ((65536 and var1) == 0) {
         var18 = false;
      }

      this.shouldSpoiler = var18;
      var var22: java.lang.String;
      if ((131072 and var1) == 0) {
         var22 = this.spoiler;
         if (this.spoiler == null || !(kotlin.text.f.x(this.spoiler) xor true)) {
            var22 = null;
         }
      } else {
         var22 = var19;
      }

      this.spoilerOrNull = var22;
      if ((var1 and 262144) == 0) {
         var4 = this.obscure;
         var var23: java.lang.String = null;
         if (this.obscure != null) {
            var23 = null;
            if (kotlin.text.f.x(this.obscure) xor true) {
               var23 = var4;
            }
         }

         this.obscureOrNull = var23;
      } else {
         this.obscureOrNull = var20;
      }
   }

   fun PostPreviewEmbed(
      var1: Long,
      var3: Long,
      var5: java.lang.String,
      var6: Long,
      var8: java.lang.String,
      var9: java.lang.String,
      var10: Int,
      var11: StructurableText,
      var12: java.lang.String,
      var13: java.lang.String,
      var14: java.lang.String,
      var15: java.lang.String,
      var16: java.lang.String,
      var17: java.lang.String,
      var18: java.lang.String,
      var19: java.lang.Boolean,
      var20: Boolean
   ) {
      var var21: java.lang.String = var17;
      super();
      this.parentChannelId = var1;
      this.threadId = var3;
      this.messageId = var5;
      this.guildId = var6;
      this.title = var8;
      this.ctaText = var9;
      this.ctaButtonColor = var10;
      this.footer = var11;
      this.subtitle = var12;
      this.coverImage = var13;
      this.blurredCoverImage = var14;
      this.coverImageOverlayText = var15;
      this.backgroundImage = var16;
      this.spoiler = var17;
      this.obscure = var18;
      this.obscureAwaitingScan = var19;
      this.shouldSpoiler = var20;
      if (var17 == null || !(kotlin.text.f.x(var17) xor true)) {
         var21 = null;
      }

      this.spoilerOrNull = var21;
      var5 = null;
      if (var18 != null) {
         var5 = null;
         if (kotlin.text.f.x(var18) xor true) {
            var5 = var18;
         }
      }

      this.obscureOrNull = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: PostPreviewEmbed, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var6: com.discord.primitives.ChannelId..serializer = com.discord.primitives.ChannelId..serializer.INSTANCE;
      var1.y(var2, 0, com.discord.primitives.ChannelId..serializer.INSTANCE, ChannelId.box-impl(var0.parentChannelId));
      var1.y(var2, 1, var6, ChannelId.box-impl(var0.threadId));
      var1.y(var2, 2, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.messageId));
      var1.y(var2, 3, com.discord.primitives.GuildId..serializer.INSTANCE, GuildId.box-impl(var0.guildId));
      var1.z(var2, 4, var0.title);
      var1.z(var2, 5, var0.ctaText);
      var1.w(var2, 6, var0.ctaButtonColor);
      var1.y(var2, 7, StructurableTextSerializer.INSTANCE, var0.footer);
      var var3: Boolean;
      if (!var1.A(var2, 8) && var0.subtitle == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 8, a2.a, var0.subtitle);
      }

      if (!var1.A(var2, 9) && var0.coverImage == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 9, a2.a, var0.coverImage);
      }

      if (!var1.A(var2, 10) && var0.blurredCoverImage == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 10, a2.a, var0.blurredCoverImage);
      }

      if (!var1.A(var2, 11) && var0.coverImageOverlayText == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 11, a2.a, var0.coverImageOverlayText);
      }

      if (!var1.A(var2, 12) && var0.backgroundImage == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 12, a2.a, var0.backgroundImage);
      }

      if (!var1.A(var2, 13) && var0.spoiler == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 13, a2.a, var0.spoiler);
      }

      if (!var1.A(var2, 14) && var0.obscure == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 14, a2.a, var0.obscure);
      }

      if (!var1.A(var2, 15) && var0.obscureAwaitingScan == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 15, h.a, var0.obscureAwaitingScan);
      }

      if (!var1.A(var2, 16) && !var0.shouldSpoiler) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.x(var2, 16, var0.shouldSpoiler);
      }

      label117: {
         if (!var1.A(var2, 17)) {
            val var8: java.lang.String = var0.getSpoilerOrNull();
            var var20: java.lang.String = var0.spoiler;
            if (var0.spoiler == null || !(kotlin.text.f.x(var0.spoiler) xor true)) {
               var20 = null;
            }

            if (r.c(var8, var20)) {
               var3 = false;
               break label117;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 17, a2.a, var0.getSpoilerOrNull());
      }

      label106: {
         if (!var1.A(var2, 18)) {
            val var9: java.lang.String = var0.getObscureOrNull();
            val var23: java.lang.String = var0.obscure;
            var var21: java.lang.String = null;
            if (var0.obscure != null) {
               var21 = null;
               if (kotlin.text.f.x(var0.obscure) xor true) {
                  var21 = var23;
               }
            }

            var3 = false;
            if (r.c(var9, var21)) {
               break label106;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 18, a2.a, var0.getObscureOrNull());
      }
   }

   public operator fun component1(): ChannelId {
      return this.parentChannelId;
   }

   public operator fun component10(): String? {
      return this.coverImage;
   }

   public operator fun component11(): String? {
      return this.blurredCoverImage;
   }

   public operator fun component12(): String? {
      return this.coverImageOverlayText;
   }

   public operator fun component13(): String? {
      return this.backgroundImage;
   }

   public operator fun component14(): String? {
      return this.spoiler;
   }

   public operator fun component15(): String? {
      return this.obscure;
   }

   public operator fun component16(): Boolean? {
      return this.obscureAwaitingScan;
   }

   public operator fun component17(): Boolean {
      return this.shouldSpoiler;
   }

   public operator fun component2(): ChannelId {
      return this.threadId;
   }

   public operator fun component3(): MessageId {
      return this.messageId;
   }

   public operator fun component4(): GuildId {
      return this.guildId;
   }

   public operator fun component5(): String {
      return this.title;
   }

   public operator fun component6(): String {
      return this.ctaText;
   }

   public operator fun component7(): Int {
      return this.ctaButtonColor;
   }

   public operator fun component8(): StructurableText {
      return this.footer;
   }

   public operator fun component9(): String? {
      return this.subtitle;
   }

   public fun copy(
      parentChannelId: ChannelId = ...,
      threadId: ChannelId = ...,
      messageId: MessageId = ...,
      guildId: GuildId = ...,
      title: String = ...,
      ctaText: String = ...,
      ctaButtonColor: Int = ...,
      footer: StructurableText = ...,
      subtitle: String? = ...,
      coverImage: String? = ...,
      blurredCoverImage: String? = ...,
      coverImageOverlayText: String? = ...,
      backgroundImage: String? = ...,
      spoiler: String? = ...,
      obscure: String? = ...,
      obscureAwaitingScan: Boolean? = ...,
      shouldSpoiler: Boolean = ...
   ): PostPreviewEmbed {
      r.h(var5, "messageId");
      r.h(var8, "title");
      r.h(var9, "ctaText");
      r.h(var11, "footer");
      return new PostPreviewEmbed(var1, var3, var5, var6, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PostPreviewEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!ChannelId.equals-impl0(this.parentChannelId, var1.parentChannelId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.threadId, var1.threadId)) {
            return false;
         } else if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!GuildId.equals-impl0(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.title, var1.title)) {
            return false;
         } else if (!r.c(this.ctaText, var1.ctaText)) {
            return false;
         } else if (this.ctaButtonColor != var1.ctaButtonColor) {
            return false;
         } else if (!r.c(this.footer, var1.footer)) {
            return false;
         } else if (!r.c(this.subtitle, var1.subtitle)) {
            return false;
         } else if (!r.c(this.coverImage, var1.coverImage)) {
            return false;
         } else if (!r.c(this.blurredCoverImage, var1.blurredCoverImage)) {
            return false;
         } else if (!r.c(this.coverImageOverlayText, var1.coverImageOverlayText)) {
            return false;
         } else if (!r.c(this.backgroundImage, var1.backgroundImage)) {
            return false;
         } else if (!r.c(this.spoiler, var1.spoiler)) {
            return false;
         } else if (!r.c(this.obscure, var1.obscure)) {
            return false;
         } else if (!r.c(this.obscureAwaitingScan, var1.obscureAwaitingScan)) {
            return false;
         } else {
            return this.shouldSpoiler == var1.shouldSpoiler;
         }
      }
   }

   public override fun hashCode(): Int {
      val var14: Int = ChannelId.hashCode-impl(this.parentChannelId);
      val var16: Int = ChannelId.hashCode-impl(this.threadId);
      val var15: Int = MessageId.hashCode-impl(this.messageId);
      val var13: Int = GuildId.hashCode-impl(this.guildId);
      val var18: Int = this.title.hashCode();
      val var17: Int = this.ctaText.hashCode();
      val var11: Int = Integer.hashCode(this.ctaButtonColor);
      val var12: Int = this.footer.hashCode();
      var var8: Int = 0;
      val var1: Int;
      if (this.subtitle == null) {
         var1 = 0;
      } else {
         var1 = this.subtitle.hashCode();
      }

      val var2: Int;
      if (this.coverImage == null) {
         var2 = 0;
      } else {
         var2 = this.coverImage.hashCode();
      }

      val var3: Int;
      if (this.blurredCoverImage == null) {
         var3 = 0;
      } else {
         var3 = this.blurredCoverImage.hashCode();
      }

      val var4: Int;
      if (this.coverImageOverlayText == null) {
         var4 = 0;
      } else {
         var4 = this.coverImageOverlayText.hashCode();
      }

      val var5: Int;
      if (this.backgroundImage == null) {
         var5 = 0;
      } else {
         var5 = this.backgroundImage.hashCode();
      }

      val var6: Int;
      if (this.spoiler == null) {
         var6 = 0;
      } else {
         var6 = this.spoiler.hashCode();
      }

      val var7: Int;
      if (this.obscure == null) {
         var7 = 0;
      } else {
         var7 = this.obscure.hashCode();
      }

      if (this.obscureAwaitingScan != null) {
         var8 = this.obscureAwaitingScan.hashCode();
      }

      var var9: Byte = this.shouldSpoiler;
      if (this.shouldSpoiler != 0) {
         var9 = 1;
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
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           ((var14 * 31 + var16) * 31 + var15)
                                                                                                                                 * 31
                                                                                                                              + var13
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var18
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var17
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var11
                                                                                             )
                                                                                             * 31
                                                                                          + var12
                                                                                    )
                                                                                    * 31
                                                                                 + var1
                                                                           )
                                                                           * 31
                                                                        + var2
                                                                  )
                                                                  * 31
                                                               + var3
                                                         )
                                                         * 31
                                                      + var4
                                                )
                                                * 31
                                             + var5
                                       )
                                       * 31
                                    + var6
                              )
                              * 31
                           + var7
                     )
                     * 31
                  + var8
            )
            * 31
         + var9;
   }

   public override fun toString(): String {
      val var3: java.lang.String = ChannelId.toString-impl(this.parentChannelId);
      val var14: java.lang.String = ChannelId.toString-impl(this.threadId);
      val var6: java.lang.String = MessageId.toString-impl(this.messageId);
      val var4: java.lang.String = GuildId.toString-impl(this.guildId);
      val var9: java.lang.String = this.title;
      val var12: java.lang.String = this.ctaText;
      val var1: Int = this.ctaButtonColor;
      val var13: StructurableText = this.footer;
      val var16: java.lang.String = this.subtitle;
      val var18: java.lang.String = this.coverImage;
      val var10: java.lang.String = this.blurredCoverImage;
      val var5: java.lang.String = this.coverImageOverlayText;
      val var7: java.lang.String = this.backgroundImage;
      val var11: java.lang.String = this.spoiler;
      val var8: java.lang.String = this.obscure;
      val var15: java.lang.Boolean = this.obscureAwaitingScan;
      val var2: Boolean = this.shouldSpoiler;
      val var17: StringBuilder = new StringBuilder();
      var17.append("PostPreviewEmbed(parentChannelId=");
      var17.append(var3);
      var17.append(", threadId=");
      var17.append(var14);
      var17.append(", messageId=");
      var17.append(var6);
      var17.append(", guildId=");
      var17.append(var4);
      var17.append(", title=");
      var17.append(var9);
      var17.append(", ctaText=");
      var17.append(var12);
      var17.append(", ctaButtonColor=");
      var17.append(var1);
      var17.append(", footer=");
      var17.append(var13);
      var17.append(", subtitle=");
      var17.append(var16);
      var17.append(", coverImage=");
      var17.append(var18);
      var17.append(", blurredCoverImage=");
      var17.append(var10);
      var17.append(", coverImageOverlayText=");
      var17.append(var5);
      var17.append(", backgroundImage=");
      var17.append(var7);
      var17.append(", spoiler=");
      var17.append(var11);
      var17.append(", obscure=");
      var17.append(var8);
      var17.append(", obscureAwaitingScan=");
      var17.append(var15);
      var17.append(", shouldSpoiler=");
      var17.append(var2);
      var17.append(")");
      return var17.toString();
   }

   public object `$serializer` : f0<PostPreviewEmbed> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PostPreviewEmbed.$serializer = new PostPreviewEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed", var0, 19);
         var1.l("parentChannelId", false);
         var1.l("threadId", false);
         var1.l("messageId", false);
         var1.l("guildId", false);
         var1.l("title", false);
         var1.l("ctaText", false);
         var1.l("ctaButtonColor", false);
         var1.l("footer", false);
         var1.l("subtitle", true);
         var1.l("coverImage", true);
         var1.l("blurredCoverImage", true);
         var1.l("coverImageOverlayText", true);
         var1.l("backgroundImage", true);
         var1.l("spoiler", true);
         var1.l("obscure", true);
         var1.l("obscureAwaitingScan", true);
         var1.l("shouldSpoiler", true);
         var1.l("spoilerOrNull", true);
         var1.l("obscureOrNull", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var14: com.discord.primitives.ChannelId..serializer = com.discord.primitives.ChannelId..serializer.INSTANCE;
         val var13: com.discord.primitives.MessageId..serializer = com.discord.primitives.MessageId..serializer.INSTANCE;
         val var2: com.discord.primitives.GuildId..serializer = com.discord.primitives.GuildId..serializer.INSTANCE;
         val var8: a2 = a2.a;
         val var11: m0 = m0.a;
         val var1: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var7: KSerializer = a.u(a2.a);
         val var5: KSerializer = a.u(var8);
         val var12: KSerializer = a.u(var8);
         val var10: KSerializer = a.u(var8);
         val var3: KSerializer = a.u(var8);
         val var6: KSerializer = a.u(var8);
         val var9: KSerializer = a.u(var8);
         val var4: h = h.a;
         return new KSerializer[]{
            var14, var14, var13, var2, var8, var8, var11, var1, var7, var5, var12, var10, var3, var6, var9, a.u(h.a), var4, a.u(var8), a.u(var8)
         };
      }

      public open fun deserialize(decoder: Decoder): PostPreviewEmbed {
         r.h(var1, "decoder");
         val var30: SerialDescriptor = this.getDescriptor();
         val var31: c = var1.b(var30);
         val var8: Boolean = var31.p();
         var var14: Any = null;
         var var3: Int;
         val var4: Int;
         var var5: Byte;
         var var9: Any;
         var var10: Any;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var15: Any;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var22: Any;
         var var23: Any;
         var var24: Any;
         val var26: Any;
         var var33: Any;
         if (var8) {
            var33 = com.discord.primitives.ChannelId..serializer.INSTANCE;
            var26 = var31.y(var30, 0, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var23 = var31.y(var30, 1, (DeserializationStrategy)var33, null);
            var22 = var31.y(var30, 2, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var18 = var31.y(var30, 3, com.discord.primitives.GuildId..serializer.INSTANCE, null);
            var17 = var31.m(var30, 4);
            var15 = var31.m(var30, 5);
            var4 = var31.i(var30, 6);
            var16 = var31.y(var30, 7, StructurableTextSerializer.INSTANCE, null);
            val var21: a2 = a2.a;
            var12 = var31.n(var30, 8, a2.a, null);
            var20 = var31.n(var30, 9, var21, null);
            var11 = var31.n(var30, 10, var21, null);
            var33 = var31.n(var30, 11, var21, null);
            var13 = var31.n(var30, 12, var21, null);
            var14 = var31.n(var30, 13, var21, null);
            var9 = var31.n(var30, 14, var21, null);
            var19 = var31.n(var30, 15, h.a, null);
            val var2: Byte = var31.C(var30, 16);
            var10 = var31.n(var30, 17, var21, null);
            var24 = var31.n(var30, 18, var21, null);
            var3 = 524287;
            var5 = var2;
         } else {
            var5 = 18;
            var var36: Int = 0;
            var var38: Byte = 0;
            var3 = 0;
            var var6: Boolean = true;
            var9 = null;
            var33 = null;
            var10 = null;
            var23 = null;
            var22 = null;
            var20 = null;
            var24 = null;
            var var49: Any = null;
            var19 = null;
            var17 = null;
            var13 = null;
            var18 = null;
            var12 = null;
            var15 = null;
            var11 = null;
            var16 = null;

            while (var6) {
               label51: {
                  label50: {
                     val var7: Int = var31.o(var30);
                     switch (var7) {
                        case -1:
                           var6 = false;
                           break;
                        case 0:
                           var12 = var31.y(var30, 0, com.discord.primitives.ChannelId..serializer.INSTANCE, var12);
                           var36 |= 1;
                           break;
                        case 1:
                           var14 = var31.y(var30, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, var14);
                           var36 |= 2;
                           break;
                        case 2:
                           var13 = var31.y(var30, 2, com.discord.primitives.MessageId..serializer.INSTANCE, var13);
                           var36 |= 4;
                           break;
                        case 3:
                           var18 = var31.y(var30, 3, com.discord.primitives.GuildId..serializer.INSTANCE, var18);
                           var36 |= 8;
                           break;
                        case 4:
                           var17 = var31.m(var30, 4);
                           var36 |= 16;
                           break;
                        case 5:
                           var16 = var31.m(var30, 5);
                           var36 |= 32;
                           break;
                        case 6:
                           var3 = var31.i(var30, 6);
                           var36 |= 64;
                           break;
                        case 7:
                           var11 = var31.y(var30, 7, StructurableTextSerializer.INSTANCE, var11);
                           var36 |= 128;
                           break;
                        case 8:
                           var49 = var31.n(var30, 8, a2.a, var49);
                           var36 |= 256;
                           break;
                        case 9:
                           var15 = var31.n(var30, 9, a2.a, var15);
                           var36 |= 512;
                           var5 = 18;
                           continue;
                        case 10:
                           var10 = var31.n(var30, 10, a2.a, var10);
                           var36 |= 1024;
                           break;
                        case 11:
                           var20 = var31.n(var30, 11, a2.a, var20);
                           var36 |= 2048;
                           break label50;
                        case 12:
                           var9 = var31.n(var30, 12, a2.a, var9);
                           var36 |= 4096;
                           break label51;
                        case 13:
                           var22 = var31.n(var30, 13, a2.a, var22);
                           var36 |= 8192;
                           break label51;
                        case 14:
                           var23 = var31.n(var30, 14, a2.a, var23);
                           var36 |= 16384;
                           break label51;
                        case 15:
                           var19 = var31.n(var30, 15, h.a, var19);
                           var36 |= 32768;
                           break label51;
                        case 16:
                           var38 = var31.C(var30, 16);
                           var36 |= 65536;
                           break label50;
                        case 17:
                           var33 = var31.n(var30, 17, a2.a, var33);
                           var36 |= 131072;
                           break label50;
                        case 18:
                           var24 = var31.n(var30, var5, a2.a, var24);
                           var36 |= 262144;
                           continue;
                        default:
                           throw new n(var7);
                     }

                     var5 = 18;
                     continue;
                  }

                  var5 = 18;
                  continue;
               }

               var5 = 18;
            }

            var9 = var23;
            var22 = var13;
            var26 = var12;
            var23 = var14;
            var12 = var49;
            var5 = var38;
            var4 = var3;
            var15 = var16;
            var3 = var36;
            var13 = var9;
            var10 = var33;
            var14 = var22;
            var16 = var11;
            var20 = var15;
            var11 = var10;
            var33 = var20;
         }

         var31.c(var30);
         val var56: ChannelId = var26 as ChannelId;
         var23 = var23 as ChannelId;
         val var51: MessageId = var22 as MessageId;
         val var52: java.lang.String;
         if (var22 as MessageId != null) {
            var52 = var51.unbox-impl();
         } else {
            var52 = null;
         }

         return new PostPreviewEmbed(
            var3,
            var56,
            (ChannelId)var23,
            var52,
            var18 as GuildId,
            (java.lang.String)var17,
            (java.lang.String)var15,
            var4,
            var16 as StructurableText,
            var12 as java.lang.String,
            var20 as java.lang.String,
            var11 as java.lang.String,
            var33 as java.lang.String,
            var13 as java.lang.String,
            var14 as java.lang.String,
            var9 as java.lang.String,
            var19 as java.lang.Boolean,
            (boolean)var5,
            var10 as java.lang.String,
            var24 as java.lang.String,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: PostPreviewEmbed) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PostPreviewEmbed.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PostPreviewEmbed> {
         return PostPreviewEmbed.$serializer.INSTANCE;
      }
   }
}
