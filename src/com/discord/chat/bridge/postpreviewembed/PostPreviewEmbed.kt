package com.discord.chat.bridge.postpreviewembed

import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import ea.f
import ea.n
import fa.a
import ha.C0
import ha.G
import ha.N
import ha.p0
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
      val var17: Int = ChannelId.hashCode-impl(this.parentChannelId);
      val var18: Int = ChannelId.hashCode-impl(this.threadId);
      val var14: Int = MessageId.hashCode-impl(this.messageId);
      val var13: Int = GuildId.hashCode-impl(this.guildId);
      val var16: Int = this.title.hashCode();
      val var12: Int = this.ctaText.hashCode();
      val var15: Int = Integer.hashCode(this.ctaButtonColor);
      val var19: Int = this.footer.hashCode();
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
                                                                                                                                                                        var17
                                                                                                                                                                              * 31
                                                                                                                                                                           + var18
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var14
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var13
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var16
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var12
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var15
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var19
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
      val var6: java.lang.String = ChannelId.toString-impl(this.parentChannelId);
      val var15: java.lang.String = ChannelId.toString-impl(this.threadId);
      val var8: java.lang.String = MessageId.toString-impl(this.messageId);
      val var13: java.lang.String = GuildId.toString-impl(this.guildId);
      val var7: java.lang.String = this.title;
      val var5: java.lang.String = this.ctaText;
      val var1: Int = this.ctaButtonColor;
      val var14: StructurableText = this.footer;
      val var21: java.lang.String = this.subtitle;
      val var10: java.lang.String = this.coverImage;
      val var16: java.lang.String = this.blurredCoverImage;
      val var11: java.lang.String = this.coverImageOverlayText;
      val var12: java.lang.String = this.backgroundImage;
      val var9: java.lang.String = this.spoiler;
      val var17: java.lang.String = this.obscure;
      val var18: java.lang.Boolean = this.obscureAwaitingScan;
      val var2: Boolean = this.shouldSpoiler;
      val var19: java.lang.Boolean = this.obscureHideControls;
      val var3: java.lang.Boolean = this.obscureIsOpaque;
      val var20: java.lang.Boolean = this.verifyAge;
      val var4: StringBuilder = new StringBuilder();
      var4.append("PostPreviewEmbed(parentChannelId=");
      var4.append(var6);
      var4.append(", threadId=");
      var4.append(var15);
      var4.append(", messageId=");
      var4.append(var8);
      var4.append(", guildId=");
      var4.append(var13);
      var4.append(", title=");
      var4.append(var7);
      var4.append(", ctaText=");
      var4.append(var5);
      var4.append(", ctaButtonColor=");
      var4.append(var1);
      var4.append(", footer=");
      var4.append(var14);
      var4.append(", subtitle=");
      var4.append(var21);
      var4.append(", coverImage=");
      var4.append(var10);
      var4.append(", blurredCoverImage=");
      var4.append(var16);
      var4.append(", coverImageOverlayText=");
      var4.append(var11);
      var4.append(", backgroundImage=");
      var4.append(var12);
      var4.append(", spoiler=");
      var4.append(var9);
      var4.append(", obscure=");
      var4.append(var17);
      var4.append(", obscureAwaitingScan=");
      var4.append(var18);
      var4.append(", shouldSpoiler=");
      var4.append(var2);
      var4.append(", obscureHideControls=");
      var4.append(var19);
      var4.append(", obscureIsOpaque=");
      var4.append(var3);
      var4.append(", verifyAge=");
      var4.append(var20);
      var4.append(")");
      return var4.toString();
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
         val var9: C0 = C0.a;
         val var7: KSerializer = a.u(C0.a);
         val var2: KSerializer = a.u(var9);
         val var16: KSerializer = a.u(var9);
         val var10: KSerializer = a.u(var9);
         val var12: KSerializer = a.u(var9);
         val var3: KSerializer = a.u(var9);
         val var6: KSerializer = a.u(var9);
         val var13: ha.h = ha.h.a;
         return new KSerializer[]{
            ChannelId.$serializer.INSTANCE,
            ChannelId.$serializer.INSTANCE,
            MessageId.$serializer.INSTANCE,
            GuildId.$serializer.INSTANCE,
            var9,
            var9,
            N.a,
            StructurableTextSerializer.INSTANCE,
            var7,
            var2,
            var16,
            var10,
            var12,
            var3,
            var6,
            a.u(ha.h.a),
            var13,
            a.u(var13),
            a.u(var13),
            a.u(var13),
            a.u(var9),
            a.u(var9)
         };
      }

      public open fun deserialize(decoder: Decoder): PostPreviewEmbed {
         q.h(var1, "decoder");
         val var32: SerialDescriptor = this.getDescriptor();
         val var33: c = var1.c(var32);
         val var7: Boolean = var33.y();
         var var23: java.lang.String = null;
         var var3: Int;
         var var4: Int;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var20: Any;
         var var21: java.lang.Boolean;
         var var22: Any;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         val var27: java.lang.Boolean;
         val var28: Any;
         val var29: Any;
         val var30: ChannelId;
         val var31: Any;
         var var38: Any;
         var var40: Byte;
         var var45: Any;
         var var47: java.lang.Boolean;
         var var51: java.lang.Boolean;
         var var61: Any;
         if (var7) {
            var38 = ChannelId.$serializer.INSTANCE;
            var17 = var33.m(var32, 0, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var30 = var33.m(var32, 1, (DeserializationStrategy)var38, null) as ChannelId;
            var38 = var33.m(var32, 2, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var36: java.lang.String;
            if (var38 != null) {
               var36 = var38.unbox-impl();
            } else {
               var36 = null;
            }

            val var15: GuildId = var33.m(var32, 3, GuildId.$serializer.INSTANCE, null) as GuildId;
            var18 = var33.t(var32, 4);
            var31 = var33.t(var32, 5);
            var40 = var33.k(var32, 6);
            var29 = var33.m(var32, 7, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var45 = C0.a;
            val var13: java.lang.String = var33.v(var32, 8, C0.a, null) as java.lang.String;
            var20 = var33.v(var32, 9, (DeserializationStrategy)var45, null) as java.lang.String;
            var16 = var33.v(var32, 10, (DeserializationStrategy)var45, null) as java.lang.String;
            val var12: java.lang.String = var33.v(var32, 11, (DeserializationStrategy)var45, null) as java.lang.String;
            var23 = var33.v(var32, 12, (DeserializationStrategy)var45, null) as java.lang.String;
            var24 = var33.v(var32, 13, (DeserializationStrategy)var45, null) as java.lang.String;
            var25 = var33.v(var32, 14, (DeserializationStrategy)var45, null) as java.lang.String;
            val var9: ha.h = ha.h.a;
            val var14: java.lang.Boolean = var33.v(var32, 15, ha.h.a, null) as java.lang.Boolean;
            val var5: Byte = var33.s(var32, 16);
            val var11: java.lang.Boolean = var33.v(var32, 17, var9, null) as java.lang.Boolean;
            var61 = var33.v(var32, 18, var9, null) as java.lang.Boolean;
            var47 = var33.v(var32, 19, var9, null) as java.lang.Boolean;
            val var10: java.lang.String = var33.v(var32, 20, (DeserializationStrategy)var45, null) as java.lang.String;
            var45 = var33.v(var32, 21, (DeserializationStrategy)var45, null) as java.lang.String;
            var28 = var36;
            var4 = 4194303;
            var22 = var15;
            var3 = var40;
            var61 = var13;
            var26 = var12;
            var21 = var14;
            var40 = var5;
            var27 = var11;
            var51 = (java.lang.Boolean)var61;
            var38 = var10;
         } else {
            var var6: Boolean = true;
            var4 = 0;
            var var44: Byte = 0;
            var3 = 0;
            var var55: ChannelId = null;
            var45 = null;
            var38 = null;
            var47 = null;
            var21 = null;
            var25 = null;
            var24 = null;
            var26 = null;
            var18 = null;
            var16 = null;
            var61 = null;
            var var54: Any = null;
            var17 = null;
            var22 = null;
            var20 = null;
            var var53: Any = null;
            var var50: Any = null;
            var51 = null;
            var var49: Any = null;

            while (var6) {
               label80: {
                  var40 = var33.x(var32);
                  switch (var40) {
                     case -1:
                        var6 = false;
                        var40 = var4;
                        break label80;
                     case 0:
                        var53 = var33.m(var32, 0, ChannelId.$serializer.INSTANCE, var53) as ChannelId;
                        var40 = var4 or 1;
                        break label80;
                     case 1:
                        var55 = var33.m(var32, 1, ChannelId.$serializer.INSTANCE, var55) as ChannelId;
                        var40 = var4 or 2;
                        break label80;
                     case 2:
                        if (var20 != null) {
                           var20 = MessageId.box-impl((java.lang.String)var20);
                        } else {
                           var20 = null;
                        }

                        var20 = var33.m(var32, 2, MessageId.$serializer.INSTANCE, var20) as MessageId;
                        if (var20 != null) {
                           var20 = var20.unbox-impl();
                        } else {
                           var20 = null;
                        }

                        var40 = var4 or 4;
                        break label80;
                     case 3:
                        var54 = var33.m(var32, 3, GuildId.$serializer.INSTANCE, var54) as GuildId;
                        var40 = var4 or 8;
                        break label80;
                     case 4:
                        var17 = var33.t(var32, 4);
                        var40 = var4 or 16;
                        break label80;
                     case 5:
                        var61 = var33.t(var32, 5);
                        var40 = var4 or 32;
                        break label80;
                     case 6:
                        var3 = var33.k(var32, 6);
                        var40 = var4 or 64;
                        break label80;
                     case 7:
                        var49 = var33.m(var32, 7, StructurableTextSerializer.INSTANCE, var49) as StructurableText;
                        var40 = var4 or 128;
                        break label80;
                     case 8:
                        var22 = var33.v(var32, 8, C0.a, var22) as java.lang.String;
                        var40 = var4 or 256;
                        break label80;
                     case 9:
                        var51 = var33.v(var32, 9, C0.a, var51) as java.lang.String;
                        var40 = var4 or 512;
                        break label80;
                     case 10:
                        var50 = var33.v(var32, 10, C0.a, var50) as java.lang.String;
                        var4 |= 1024;
                        continue;
                     case 11:
                        var26 = var33.v(var32, 11, C0.a, var26) as java.lang.String;
                        var40 = var4 or 2048;
                        break label80;
                     case 12:
                        var23 = var33.v(var32, 12, C0.a, var23) as java.lang.String;
                        var40 = var4 or 4096;
                        break label80;
                     case 13:
                        var24 = var33.v(var32, 13, C0.a, var24) as java.lang.String;
                        var40 = var4 or 8192;
                        break label80;
                     case 14:
                        var25 = var33.v(var32, 14, C0.a, var25) as java.lang.String;
                        var40 = var4 or 16384;
                        break label80;
                     case 15:
                        var47 = var33.v(var32, 15, ha.h.a, var47) as java.lang.Boolean;
                        var40 = 32768;
                        break;
                     case 16:
                        var44 = var33.s(var32, 16);
                        var40 = var4 or 65536;
                        break label80;
                     case 17:
                        var45 = var33.v(var32, 17, ha.h.a, var45) as java.lang.Boolean;
                        var40 = 131072;
                        break;
                     case 18:
                        var16 = var33.v(var32, 18, ha.h.a, var16) as java.lang.Boolean;
                        var40 = 262144;
                        break;
                     case 19:
                        var21 = var33.v(var32, 19, ha.h.a, var21) as java.lang.Boolean;
                        var40 = 524288;
                        break;
                     case 20:
                        var18 = var33.v(var32, 20, C0.a, var18) as java.lang.String;
                        var40 = 1048576;
                        break;
                     case 21:
                        var38 = var33.v(var32, 21, C0.a, var38) as java.lang.String;
                        var40 = 2097152;
                        break;
                     default:
                        throw new n(var40);
                  }

                  var40 = var4 or var40;
               }

               var4 = var40;
            }

            var40 = var44;
            var18 = var17;
            var45 = var38;
            var38 = (MessageId)var18;
            var47 = var21;
            var51 = (java.lang.Boolean)var16;
            var27 = (java.lang.Boolean)var45;
            var21 = var47;
            var16 = var50;
            var20 = var51;
            var61 = var22;
            var29 = var49;
            var31 = var61;
            var22 = var54;
            var28 = var20;
            var30 = var55;
            var17 = var53;
         }

         var33.b(var32);
         return new PostPreviewEmbed(
            var4,
            (ChannelId)var17,
            var30,
            (java.lang.String)var28,
            (GuildId)var22,
            (java.lang.String)var18,
            (java.lang.String)var31,
            var3,
            (StructurableText)var29,
            (java.lang.String)var61,
            var20,
            (java.lang.String)var16,
            (java.lang.String)var26,
            var23,
            (java.lang.String)var24,
            (java.lang.String)var25,
            var21,
            (boolean)var40,
            var27,
            var51,
            var47,
            var38,
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
         return ha.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PostPreviewEmbed> {
         return PostPreviewEmbed.$serializer.INSTANCE;
      }
   }
}
