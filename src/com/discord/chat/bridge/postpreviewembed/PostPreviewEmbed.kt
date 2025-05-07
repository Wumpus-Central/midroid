package com.discord.chat.bridge.postpreviewembed

import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import fa.f
import fa.n
import ga.a
import ia.C0
import ia.G
import ia.N
import ia.p0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

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
      shouldSpoiler: Boolean = ...,
      obscureHideControls: Boolean? = ...,
      obscureIsOpaque: Boolean? = ...,
      verifyAge: Boolean? = ...
   ) : PostPreviewEmbed(var1, var3, var5, var6, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22, var23),
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
   public final val obscureHideControls: Boolean?
   public final val obscureIsOpaque: Boolean?
   public open val obscureOrNull: String?
   public final val parentChannelId: ChannelId
   public final val shouldSpoiler: Boolean
   public final val spoiler: String?
   public open val spoilerOrNull: String?
   public final val subtitle: String?
   public final val threadId: ChannelId
   public final val title: String
   public final val verifyAge: Boolean?

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
      var19: java.lang.Boolean,
      var20: java.lang.Boolean,
      var21: java.lang.Boolean,
      var22: java.lang.String,
      var23: java.lang.String,
      var24: SerializationConstructorMarker
   ) {
      if (255 != (var1 and 255)) {
         p0.b(var1, 255, PostPreviewEmbed.$serializer.INSTANCE.getDescriptor());
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
      if ((131072 and var1) == 0) {
         this.obscureHideControls = null;
      } else {
         this.obscureHideControls = var19;
      }

      if ((262144 and var1) == 0) {
         this.obscureIsOpaque = null;
      } else {
         this.obscureIsOpaque = var20;
      }

      if ((524288 and var1) == 0) {
         this.verifyAge = null;
      } else {
         this.verifyAge = var21;
      }

      var var25: java.lang.String;
      if ((1048576 and var1) == 0) {
         var25 = this.spoiler;
         if (this.spoiler == null || h.d0(this.spoiler)) {
            var25 = null;
         }
      } else {
         var25 = var22;
      }

      this.spoilerOrNull = var25;
      if ((var1 and 2097152) == 0) {
         var4 = this.obscure;
         var var26: java.lang.String = null;
         if (this.obscure != null) {
            var26 = null;
            if (!h.d0(this.obscure)) {
               var26 = var4;
            }
         }

         this.obscureOrNull = var26;
      } else {
         this.obscureOrNull = var23;
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
      var20: Boolean,
      var21: java.lang.Boolean,
      var22: java.lang.Boolean,
      var23: java.lang.Boolean
   ) {
      var var24: java.lang.String = var17;
      q.h(var5, "messageId");
      q.h(var8, "title");
      q.h(var9, "ctaText");
      q.h(var11, "footer");
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
      this.obscureHideControls = var21;
      this.obscureIsOpaque = var22;
      this.verifyAge = var23;
      if (var17 == null || h.d0(var17)) {
         var24 = null;
      }

      this.spoilerOrNull = var24;
      var5 = null;
      if (var18 != null) {
         var5 = null;
         if (!h.d0(var18)) {
            var5 = var18;
         }
      }

      this.obscureOrNull = var5;
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

   public operator fun component18(): Boolean? {
      return this.obscureHideControls;
   }

   public operator fun component19(): Boolean? {
      return this.obscureIsOpaque;
   }

   public operator fun component2(): ChannelId {
      return this.threadId;
   }

   public operator fun component20(): Boolean? {
      return this.verifyAge;
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
      shouldSpoiler: Boolean = ...,
      obscureHideControls: Boolean? = ...,
      obscureIsOpaque: Boolean? = ...,
      verifyAge: Boolean? = ...
   ): PostPreviewEmbed {
      q.h(var5, "messageId");
      q.h(var8, "title");
      q.h(var9, "ctaText");
      q.h(var11, "footer");
      return new PostPreviewEmbed(
         var1, var3, var5, var6, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22, var23, null
      );
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
         } else if (!q.c(this.title, var1.title)) {
            return false;
         } else if (!q.c(this.ctaText, var1.ctaText)) {
            return false;
         } else if (this.ctaButtonColor != var1.ctaButtonColor) {
            return false;
         } else if (!q.c(this.footer, var1.footer)) {
            return false;
         } else if (!q.c(this.subtitle, var1.subtitle)) {
            return false;
         } else if (!q.c(this.coverImage, var1.coverImage)) {
            return false;
         } else if (!q.c(this.blurredCoverImage, var1.blurredCoverImage)) {
            return false;
         } else if (!q.c(this.coverImageOverlayText, var1.coverImageOverlayText)) {
            return false;
         } else if (!q.c(this.backgroundImage, var1.backgroundImage)) {
            return false;
         } else if (!q.c(this.spoiler, var1.spoiler)) {
            return false;
         } else if (!q.c(this.obscure, var1.obscure)) {
            return false;
         } else if (!q.c(this.obscureAwaitingScan, var1.obscureAwaitingScan)) {
            return false;
         } else if (this.shouldSpoiler != var1.shouldSpoiler) {
            return false;
         } else if (!q.c(this.obscureHideControls, var1.obscureHideControls)) {
            return false;
         } else if (!q.c(this.obscureIsOpaque, var1.obscureIsOpaque)) {
            return false;
         } else {
            return q.c(this.verifyAge, var1.verifyAge);
         }
      }
   }

   public override fun hashCode(): Int {
      val var13: Int = ChannelId.hashCode-impl(this.parentChannelId);
      val var19: Int = ChannelId.hashCode-impl(this.threadId);
      val var15: Int = MessageId.hashCode-impl(this.messageId);
      val var16: Int = GuildId.hashCode-impl(this.guildId);
      val var12: Int = this.title.hashCode();
      val var14: Int = this.ctaText.hashCode();
      val var18: Int = Integer.hashCode(this.ctaButtonColor);
      val var17: Int = this.footer.hashCode();
      var var11: Int = 0;
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

      val var8: Int;
      if (this.obscureAwaitingScan == null) {
         var8 = 0;
      } else {
         var8 = this.obscureAwaitingScan.hashCode();
      }

      val var20: Int = java.lang.Boolean.hashCode(this.shouldSpoiler);
      val var9: Int;
      if (this.obscureHideControls == null) {
         var9 = 0;
      } else {
         var9 = this.obscureHideControls.hashCode();
      }

      val var10: Int;
      if (this.obscureIsOpaque == null) {
         var10 = 0;
      } else {
         var10 = this.obscureIsOpaque.hashCode();
      }

      if (this.verifyAge != null) {
         var11 = this.verifyAge.hashCode();
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
                                                                                                                           (
                                                                                                                                    (
                                                                                                                                             (
                                                                                                                                                      (
                                                                                                                                                               (
                                                                                                                                                                        var13
                                                                                                                                                                              * 31
                                                                                                                                                                           + var19
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var15
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var16
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var12
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var14
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var18
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var17
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
                                    + var20
                              )
                              * 31
                           + var9
                     )
                     * 31
                  + var10
            )
            * 31
         + var11;
   }

   public override fun toString(): String {
      val var17: java.lang.String = ChannelId.toString-impl(this.parentChannelId);
      val var21: java.lang.String = ChannelId.toString-impl(this.threadId);
      val var9: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: java.lang.String = GuildId.toString-impl(this.guildId);
      val var15: java.lang.String = this.title;
      val var6: java.lang.String = this.ctaText;
      val var1: Int = this.ctaButtonColor;
      val var11: StructurableText = this.footer;
      val var19: java.lang.String = this.subtitle;
      val var5: java.lang.String = this.coverImage;
      val var14: java.lang.String = this.blurredCoverImage;
      val var8: java.lang.String = this.coverImageOverlayText;
      val var18: java.lang.String = this.backgroundImage;
      val var4: java.lang.String = this.spoiler;
      val var16: java.lang.String = this.obscure;
      val var10: java.lang.Boolean = this.obscureAwaitingScan;
      val var2: Boolean = this.shouldSpoiler;
      val var20: java.lang.Boolean = this.obscureHideControls;
      val var13: java.lang.Boolean = this.obscureIsOpaque;
      val var12: java.lang.Boolean = this.verifyAge;
      val var7: StringBuilder = new StringBuilder();
      var7.append("PostPreviewEmbed(parentChannelId=");
      var7.append(var17);
      var7.append(", threadId=");
      var7.append(var21);
      var7.append(", messageId=");
      var7.append(var9);
      var7.append(", guildId=");
      var7.append(var3);
      var7.append(", title=");
      var7.append(var15);
      var7.append(", ctaText=");
      var7.append(var6);
      var7.append(", ctaButtonColor=");
      var7.append(var1);
      var7.append(", footer=");
      var7.append(var11);
      var7.append(", subtitle=");
      var7.append(var19);
      var7.append(", coverImage=");
      var7.append(var5);
      var7.append(", blurredCoverImage=");
      var7.append(var14);
      var7.append(", coverImageOverlayText=");
      var7.append(var8);
      var7.append(", backgroundImage=");
      var7.append(var18);
      var7.append(", spoiler=");
      var7.append(var4);
      var7.append(", obscure=");
      var7.append(var16);
      var7.append(", obscureAwaitingScan=");
      var7.append(var10);
      var7.append(", shouldSpoiler=");
      var7.append(var2);
      var7.append(", obscureHideControls=");
      var7.append(var20);
      var7.append(", obscureIsOpaque=");
      var7.append(var13);
      var7.append(", verifyAge=");
      var7.append(var12);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PostPreviewEmbed.$serializer = new PostPreviewEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed", var0, 22);
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
         var1.l("obscureHideControls", true);
         var1.l("obscureIsOpaque", true);
         var1.l("verifyAge", true);
         var1.l("spoilerOrNull", true);
         var1.l("obscureOrNull", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var6: C0 = C0.a;
         val var1: KSerializer = a.u(C0.a);
         val var3: KSerializer = a.u(var6);
         val var9: KSerializer = a.u(var6);
         val var7: KSerializer = a.u(var6);
         val var14: KSerializer = a.u(var6);
         val var10: KSerializer = a.u(var6);
         val var4: KSerializer = a.u(var6);
         val var8: ia.h = ia.h.a;
         return new KSerializer[]{
            ChannelId.$serializer.INSTANCE,
            ChannelId.$serializer.INSTANCE,
            MessageId.$serializer.INSTANCE,
            GuildId.$serializer.INSTANCE,
            var6,
            var6,
            N.a,
            StructurableTextSerializer.INSTANCE,
            var1,
            var3,
            var9,
            var7,
            var14,
            var10,
            var4,
            a.u(ia.h.a),
            var8,
            a.u(var8),
            a.u(var8),
            a.u(var8),
            a.u(var6),
            a.u(var6)
         };
      }

      public open fun deserialize(decoder: Decoder): PostPreviewEmbed {
         q.h(var1, "decoder");
         val var31: SerialDescriptor = this.getDescriptor();
         val var32: c = var1.c(var31);
         val var7: Boolean = var32.y();
         var var23: java.lang.String = null;
         var var4: Int;
         val var5: Int;
         var var14: Any;
         var var17: Any;
         var var18: Any;
         var var20: ChannelId;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         val var27: Any;
         val var29: Any;
         val var30: Any;
         var var37: Any;
         var var39: Byte;
         var var45: Any;
         var var47: java.lang.Boolean;
         var var50: Any;
         var var56: Any;
         var var61: java.lang.Boolean;
         var var66: Any;
         var var68: java.lang.Boolean;
         val var75: java.lang.Boolean;
         if (var7) {
            var37 = ChannelId.$serializer.INSTANCE;
            var14 = var32.m(var31, 0, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var20 = var32.m(var31, 1, (DeserializationStrategy)var37, null) as ChannelId;
            var37 = var32.m(var31, 2, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var35: java.lang.String;
            if (var37 != null) {
               var35 = var37.unbox-impl();
            } else {
               var35 = null;
            }

            val var15: GuildId = var32.m(var31, 3, GuildId.$serializer.INSTANCE, null) as GuildId;
            var56 = var32.t(var31, 4);
            var18 = var32.t(var31, 5);
            var39 = var32.k(var31, 6);
            val var70: StructurableText = var32.m(var31, 7, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var45 = C0.a;
            var50 = var32.v(var31, 8, C0.a, null) as java.lang.String;
            var25 = var32.v(var31, 9, (DeserializationStrategy)var45, null) as java.lang.String;
            val var22: java.lang.String = var32.v(var31, 10, (DeserializationStrategy)var45, null) as java.lang.String;
            val var12: java.lang.String = var32.v(var31, 11, (DeserializationStrategy)var45, null) as java.lang.String;
            val var28: java.lang.String = var32.v(var31, 12, (DeserializationStrategy)var45, null) as java.lang.String;
            var24 = var32.v(var31, 13, (DeserializationStrategy)var45, null) as java.lang.String;
            var27 = var32.v(var31, 14, (DeserializationStrategy)var45, null) as java.lang.String;
            val var9: ia.h = ia.h.a;
            var61 = var32.v(var31, 15, ia.h.a, null) as java.lang.Boolean;
            val var3: Byte = var32.s(var31, 16);
            val var13: java.lang.Boolean = var32.v(var31, 17, var9, null) as java.lang.Boolean;
            var66 = var32.v(var31, 18, var9, null) as java.lang.Boolean;
            var47 = var32.v(var31, 19, var9, null) as java.lang.Boolean;
            val var10: java.lang.String = var32.v(var31, 20, (DeserializationStrategy)var45, null) as java.lang.String;
            var45 = var32.v(var31, 21, (DeserializationStrategy)var45, null) as java.lang.String;
            var17 = var35;
            var4 = 4194303;
            var66 = var15;
            var26 = var56;
            var5 = var39;
            var56 = var70;
            var29 = var50;
            var50 = var22;
            var30 = var12;
            var23 = var28;
            var68 = var61;
            var39 = var3;
            var61 = var13;
            var75 = (java.lang.Boolean)var66;
            var37 = var10;
         } else {
            var var6: Boolean = true;
            var4 = 0;
            var var44: Byte = 0;
            var var43: Int = 0;
            var var55: ChannelId = null;
            var45 = null;
            var37 = null;
            var47 = null;
            var66 = null;
            var25 = null;
            var24 = null;
            var26 = null;
            var18 = null;
            var56 = null;
            var61 = null;
            var14 = null;
            var17 = null;
            var68 = null;
            var20 = null;
            var var53: Any = null;
            var var52: Any = null;
            var50 = null;
            var var49: Any = null;

            while (var6) {
               label80: {
                  var39 = var32.x(var31);
                  switch (var39) {
                     case -1:
                        var6 = false;
                        var39 = var4;
                        break label80;
                     case 0:
                        var53 = var32.m(var31, 0, ChannelId.$serializer.INSTANCE, var53) as ChannelId;
                        var39 = var4 or 1;
                        break label80;
                     case 1:
                        var55 = var32.m(var31, 1, ChannelId.$serializer.INSTANCE, var55) as ChannelId;
                        var39 = var4 or 2;
                        break label80;
                     case 2:
                        val var64: MessageId;
                        if (var20 != null) {
                           var64 = MessageId.box-impl(var20);
                        } else {
                           var64 = null;
                        }

                        val var65: MessageId = var32.m(var31, 2, MessageId.$serializer.INSTANCE, var64) as MessageId;
                        if (var65 != null) {
                           var20 = var65.unbox-impl();
                        } else {
                           var20 = null;
                        }

                        var39 = var4 or 4;
                        break label80;
                     case 3:
                        var14 = var32.m(var31, 3, GuildId.$serializer.INSTANCE, var14) as GuildId;
                        var39 = var4 or 8;
                        break label80;
                     case 4:
                        var17 = var32.t(var31, 4);
                        var39 = var4 or 16;
                        break label80;
                     case 5:
                        var61 = var32.t(var31, 5);
                        var39 = var4 or 32;
                        break label80;
                     case 6:
                        var43 = var32.k(var31, 6);
                        var39 = var4 or 64;
                        break label80;
                     case 7:
                        var49 = var32.m(var31, 7, StructurableTextSerializer.INSTANCE, var49) as StructurableText;
                        var39 = var4 or 128;
                        break label80;
                     case 8:
                        var68 = var32.v(var31, 8, C0.a, var68) as java.lang.String;
                        var39 = var4 or 256;
                        break label80;
                     case 9:
                        var50 = var32.v(var31, 9, C0.a, var50) as java.lang.String;
                        var39 = var4 or 512;
                        break label80;
                     case 10:
                        var52 = var32.v(var31, 10, C0.a, var52) as java.lang.String;
                        var4 |= 1024;
                        continue;
                     case 11:
                        var26 = var32.v(var31, 11, C0.a, var26) as java.lang.String;
                        var39 = var4 or 2048;
                        break label80;
                     case 12:
                        var23 = var32.v(var31, 12, C0.a, var23) as java.lang.String;
                        var39 = var4 or 4096;
                        break label80;
                     case 13:
                        var24 = var32.v(var31, 13, C0.a, var24) as java.lang.String;
                        var39 = var4 or 8192;
                        break label80;
                     case 14:
                        var25 = var32.v(var31, 14, C0.a, var25) as java.lang.String;
                        var39 = var4 or 16384;
                        break label80;
                     case 15:
                        var47 = var32.v(var31, 15, ia.h.a, var47) as java.lang.Boolean;
                        var39 = 32768;
                        break;
                     case 16:
                        var44 = var32.s(var31, 16);
                        var39 = var4 or 65536;
                        break label80;
                     case 17:
                        var45 = var32.v(var31, 17, ia.h.a, var45) as java.lang.Boolean;
                        var39 = 131072;
                        break;
                     case 18:
                        var56 = var32.v(var31, 18, ia.h.a, var56) as java.lang.Boolean;
                        var39 = 262144;
                        break;
                     case 19:
                        var66 = var32.v(var31, 19, ia.h.a, var66) as java.lang.Boolean;
                        var39 = 524288;
                        break;
                     case 20:
                        var18 = var32.v(var31, 20, C0.a, var18) as java.lang.String;
                        var39 = 1048576;
                        break;
                     case 21:
                        var37 = var32.v(var31, 21, C0.a, var37) as java.lang.String;
                        var39 = 2097152;
                        break;
                     default:
                        throw new n(var39);
                  }

                  var39 = var4 or var39;
               }

               var4 = var39;
            }

            var75 = (java.lang.Boolean)var56;
            var29 = var68;
            var18 = var61;
            var39 = var44;
            var61 = (java.lang.Boolean)var45;
            var45 = var37;
            var37 = (MessageId)var18;
            var47 = (java.lang.Boolean)var66;
            var68 = var47;
            var27 = var25;
            var30 = var26;
            var50 = var52;
            var25 = var50;
            var56 = var49;
            var5 = var43;
            var26 = var17;
            var66 = var14;
            var17 = var20;
            var20 = var55;
            var14 = var53;
         }

         var32.b(var31);
         return new PostPreviewEmbed(
            var4,
            (ChannelId)var14,
            var20,
            (java.lang.String)var17,
            (GuildId)var66,
            (java.lang.String)var26,
            (java.lang.String)var18,
            var5,
            (StructurableText)var56,
            (java.lang.String)var29,
            (java.lang.String)var25,
            (java.lang.String)var50,
            (java.lang.String)var30,
            var23,
            (java.lang.String)var24,
            (java.lang.String)var27,
            var68,
            (boolean)var39,
            var61,
            var75,
            var47,
            var37,
            (java.lang.String)var45,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: PostPreviewEmbed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         PostPreviewEmbed.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ia.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PostPreviewEmbed> {
         return PostPreviewEmbed.$serializer.INSTANCE;
      }
   }
}
