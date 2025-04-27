package com.discord.chat.bridge.postpreviewembed

import ca.f
import ca.n
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import da.a
import fa.C0
import fa.G
import fa.N
import fa.p0
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
      val var14: Int = ChannelId.hashCode-impl(this.parentChannelId);
      val var17: Int = ChannelId.hashCode-impl(this.threadId);
      val var16: Int = MessageId.hashCode-impl(this.messageId);
      val var19: Int = GuildId.hashCode-impl(this.guildId);
      val var12: Int = this.title.hashCode();
      val var13: Int = this.ctaText.hashCode();
      val var15: Int = Integer.hashCode(this.ctaButtonColor);
      val var18: Int = this.footer.hashCode();
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
                                                                                                                                                                        var14
                                                                                                                                                                              * 31
                                                                                                                                                                           + var17
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var16
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var19
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var12
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var13
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var15
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var18
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
      val var12: java.lang.String = ChannelId.toString-impl(this.parentChannelId);
      val var15: java.lang.String = ChannelId.toString-impl(this.threadId);
      val var19: java.lang.String = MessageId.toString-impl(this.messageId);
      val var20: java.lang.String = GuildId.toString-impl(this.guildId);
      val var11: java.lang.String = this.title;
      val var3: java.lang.String = this.ctaText;
      val var1: Int = this.ctaButtonColor;
      val var7: StructurableText = this.footer;
      val var16: java.lang.String = this.subtitle;
      val var17: java.lang.String = this.coverImage;
      val var4: java.lang.String = this.blurredCoverImage;
      val var13: java.lang.String = this.coverImageOverlayText;
      val var5: java.lang.String = this.backgroundImage;
      val var21: java.lang.String = this.spoiler;
      val var8: java.lang.String = this.obscure;
      val var9: java.lang.Boolean = this.obscureAwaitingScan;
      val var2: Boolean = this.shouldSpoiler;
      val var14: java.lang.Boolean = this.obscureHideControls;
      val var10: java.lang.Boolean = this.obscureIsOpaque;
      val var18: java.lang.Boolean = this.verifyAge;
      val var6: StringBuilder = new StringBuilder();
      var6.append("PostPreviewEmbed(parentChannelId=");
      var6.append(var12);
      var6.append(", threadId=");
      var6.append(var15);
      var6.append(", messageId=");
      var6.append(var19);
      var6.append(", guildId=");
      var6.append(var20);
      var6.append(", title=");
      var6.append(var11);
      var6.append(", ctaText=");
      var6.append(var3);
      var6.append(", ctaButtonColor=");
      var6.append(var1);
      var6.append(", footer=");
      var6.append(var7);
      var6.append(", subtitle=");
      var6.append(var16);
      var6.append(", coverImage=");
      var6.append(var17);
      var6.append(", blurredCoverImage=");
      var6.append(var4);
      var6.append(", coverImageOverlayText=");
      var6.append(var13);
      var6.append(", backgroundImage=");
      var6.append(var5);
      var6.append(", spoiler=");
      var6.append(var21);
      var6.append(", obscure=");
      var6.append(var8);
      var6.append(", obscureAwaitingScan=");
      var6.append(var9);
      var6.append(", shouldSpoiler=");
      var6.append(var2);
      var6.append(", obscureHideControls=");
      var6.append(var14);
      var6.append(", obscureIsOpaque=");
      var6.append(var10);
      var6.append(", verifyAge=");
      var6.append(var18);
      var6.append(")");
      return var6.toString();
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
         val var10: C0 = C0.a;
         val var4: KSerializer = a.u(C0.a);
         val var3: KSerializer = a.u(var10);
         val var9: KSerializer = a.u(var10);
         val var1: KSerializer = a.u(var10);
         val var8: KSerializer = a.u(var10);
         val var6: KSerializer = a.u(var10);
         val var13: KSerializer = a.u(var10);
         val var5: fa.h = fa.h.a;
         return new KSerializer[]{
            ChannelId.$serializer.INSTANCE,
            ChannelId.$serializer.INSTANCE,
            MessageId.$serializer.INSTANCE,
            GuildId.$serializer.INSTANCE,
            var10,
            var10,
            N.a,
            StructurableTextSerializer.INSTANCE,
            var4,
            var3,
            var9,
            var1,
            var8,
            var6,
            var13,
            a.u(fa.h.a),
            var5,
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var10),
            a.u(var10)
         };
      }

      public open fun deserialize(decoder: Decoder): PostPreviewEmbed {
         q.h(var1, "decoder");
         val var31: SerialDescriptor = this.getDescriptor();
         val var32: c = var1.c(var31);
         val var7: Boolean = var32.y();
         var var23: java.lang.String = null;
         var var2: Int;
         var var3: Byte;
         var var4: Int;
         var var11: Any;
         var var15: ChannelId;
         var var17: Any;
         var var18: java.lang.Boolean;
         var var19: Any;
         var var21: Any;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         val var27: Any;
         val var28: Any;
         val var29: java.lang.Boolean;
         val var30: Any;
         var var36: Any;
         var var42: Any;
         var var44: java.lang.Boolean;
         var var52: Any;
         var var57: Any;
         var var61: java.lang.Boolean;
         if (var7) {
            var36 = ChannelId.$serializer.INSTANCE;
            var28 = var32.m(var31, 0, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var15 = var32.m(var31, 1, (DeserializationStrategy)var36, null) as ChannelId;
            var36 = var32.m(var31, 2, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var35: java.lang.String;
            if (var36 != null) {
               var35 = var36.unbox-impl();
            } else {
               var35 = null;
            }

            var52 = var32.m(var31, 3, GuildId.$serializer.INSTANCE, null) as GuildId;
            var17 = var32.t(var31, 4);
            var57 = var32.t(var31, 5);
            var2 = var32.k(var31, 6);
            var30 = var32.m(var31, 7, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var42 = C0.a;
            val var13: java.lang.String = var32.v(var31, 8, C0.a, null) as java.lang.String;
            var21 = var32.v(var31, 9, (DeserializationStrategy)var42, null) as java.lang.String;
            val var14: java.lang.String = var32.v(var31, 10, (DeserializationStrategy)var42, null) as java.lang.String;
            var11 = var32.v(var31, 11, (DeserializationStrategy)var42, null) as java.lang.String;
            var23 = var32.v(var31, 12, (DeserializationStrategy)var42, null) as java.lang.String;
            var24 = var32.v(var31, 13, (DeserializationStrategy)var42, null) as java.lang.String;
            var25 = var32.v(var31, 14, (DeserializationStrategy)var42, null) as java.lang.String;
            val var9: fa.h = fa.h.a;
            var18 = var32.v(var31, 15, fa.h.a, null) as java.lang.Boolean;
            var3 = var32.s(var31, 16);
            val var12: java.lang.Boolean = var32.v(var31, 17, var9, null) as java.lang.Boolean;
            var61 = var32.v(var31, 18, var9, null) as java.lang.Boolean;
            var44 = var32.v(var31, 19, var9, null) as java.lang.Boolean;
            val var10: java.lang.String = var32.v(var31, 20, (DeserializationStrategy)var42, null) as java.lang.String;
            var42 = var32.v(var31, 21, (DeserializationStrategy)var42, null) as java.lang.String;
            var19 = var35;
            var4 = 4194303;
            var27 = var52;
            var52 = var57;
            var57 = var13;
            var26 = var14;
            var29 = var12;
            var61 = var61;
            var36 = var10;
         } else {
            var var6: Boolean = true;
            var4 = 0;
            var var5: Byte = 0;
            var3 = 0;
            var15 = null;
            var42 = null;
            var36 = null;
            var44 = null;
            var21 = null;
            var25 = null;
            var24 = null;
            var26 = null;
            var18 = null;
            var52 = null;
            var57 = null;
            var var51: Any = null;
            var17 = null;
            var61 = null;
            var19 = null;
            var var50: Any = null;
            var var49: Any = null;
            var11 = null;
            var var46: Any = null;

            while (var6) {
               label80: {
                  var2 = var32.x(var31);
                  switch (var2) {
                     case -1:
                        var6 = false;
                        var2 = var4;
                        break label80;
                     case 0:
                        var50 = var32.m(var31, 0, ChannelId.$serializer.INSTANCE, var50) as ChannelId;
                        var2 = var4 or 1;
                        break label80;
                     case 1:
                        var15 = var32.m(var31, 1, ChannelId.$serializer.INSTANCE, var15) as ChannelId;
                        var2 = var4 or 2;
                        break label80;
                     case 2:
                        if (var19 != null) {
                           var19 = MessageId.box-impl(var19);
                        } else {
                           var19 = null;
                        }

                        var19 = var32.m(var31, 2, MessageId.$serializer.INSTANCE, var19) as MessageId;
                        if (var19 != null) {
                           var19 = var19.unbox-impl();
                        } else {
                           var19 = null;
                        }

                        var2 = var4 or 4;
                        break label80;
                     case 3:
                        var51 = var32.m(var31, 3, GuildId.$serializer.INSTANCE, var51) as GuildId;
                        var2 = var4 or 8;
                        break label80;
                     case 4:
                        var17 = var32.t(var31, 4);
                        var2 = var4 or 16;
                        break label80;
                     case 5:
                        var57 = var32.t(var31, 5);
                        var2 = var4 or 32;
                        break label80;
                     case 6:
                        var3 = var32.k(var31, 6);
                        var2 = var4 or 64;
                        break label80;
                     case 7:
                        var46 = var32.m(var31, 7, StructurableTextSerializer.INSTANCE, var46) as StructurableText;
                        var2 = var4 or 128;
                        break label80;
                     case 8:
                        var61 = var32.v(var31, 8, C0.a, var61) as java.lang.String;
                        var2 = var4 or 256;
                        break label80;
                     case 9:
                        var11 = var32.v(var31, 9, C0.a, var11) as java.lang.String;
                        var2 = var4 or 512;
                        break label80;
                     case 10:
                        var49 = var32.v(var31, 10, C0.a, var49) as java.lang.String;
                        var4 |= 1024;
                        continue;
                     case 11:
                        var26 = var32.v(var31, 11, C0.a, var26) as java.lang.String;
                        var2 = var4 or 2048;
                        break label80;
                     case 12:
                        var23 = var32.v(var31, 12, C0.a, var23) as java.lang.String;
                        var2 = var4 or 4096;
                        break label80;
                     case 13:
                        var24 = var32.v(var31, 13, C0.a, var24) as java.lang.String;
                        var2 = var4 or 8192;
                        break label80;
                     case 14:
                        var25 = var32.v(var31, 14, C0.a, var25) as java.lang.String;
                        var2 = var4 or 16384;
                        break label80;
                     case 15:
                        var44 = var32.v(var31, 15, fa.h.a, var44) as java.lang.Boolean;
                        var2 = 32768;
                        break;
                     case 16:
                        var5 = var32.s(var31, 16);
                        var2 = var4 or 65536;
                        break label80;
                     case 17:
                        var42 = var32.v(var31, 17, fa.h.a, var42) as java.lang.Boolean;
                        var2 = 131072;
                        break;
                     case 18:
                        var52 = var32.v(var31, 18, fa.h.a, var52) as java.lang.Boolean;
                        var2 = 262144;
                        break;
                     case 19:
                        var21 = var32.v(var31, 19, fa.h.a, var21) as java.lang.Boolean;
                        var2 = 524288;
                        break;
                     case 20:
                        var18 = var32.v(var31, 20, C0.a, var18) as java.lang.String;
                        var2 = 1048576;
                        break;
                     case 21:
                        var36 = var32.v(var31, 21, C0.a, var36) as java.lang.String;
                        var2 = 2097152;
                        break;
                     default:
                        throw new n(var2);
                  }

                  var2 = var4 or var2;
               }

               var4 = var2;
            }

            var18 = var44;
            var52 = var57;
            var2 = var3;
            var42 = var36;
            var36 = var18;
            var44 = (java.lang.Boolean)var21;
            var61 = (java.lang.Boolean)var52;
            var29 = (java.lang.Boolean)var42;
            var3 = var5;
            var11 = var26;
            var26 = var49;
            var21 = var11;
            var57 = var61;
            var30 = var46;
            var27 = var51;
            var28 = var50;
         }

         var32.b(var31);
         return new PostPreviewEmbed(
            var4,
            (ChannelId)var28,
            var15,
            var19,
            (GuildId)var27,
            (java.lang.String)var17,
            (java.lang.String)var52,
            var2,
            (StructurableText)var30,
            (java.lang.String)var57,
            (java.lang.String)var21,
            (java.lang.String)var26,
            (java.lang.String)var11,
            var23,
            (java.lang.String)var24,
            (java.lang.String)var25,
            var18,
            (boolean)var3,
            var29,
            var61,
            var44,
            var36,
            (java.lang.String)var42,
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
         return fa.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PostPreviewEmbed> {
         return PostPreviewEmbed.$serializer.INSTANCE;
      }
   }
}
