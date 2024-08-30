package com.discord.chat.bridge.postpreviewembed

import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import gn.n0
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
         o1.b(var1, 255, PostPreviewEmbed.$serializer.INSTANCE.getDescriptor());
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
         if (this.spoiler == null || !(h.x(this.spoiler) xor true)) {
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
            if (h.x(this.obscure) xor true) {
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
      if (var17 == null || !(h.x(var17) xor true)) {
         var21 = null;
      }

      this.spoilerOrNull = var21;
      var5 = null;
      if (var18 != null) {
         var5 = null;
         if (h.x(var18) xor true) {
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
      q.h(var5, "messageId");
      q.h(var8, "title");
      q.h(var9, "ctaText");
      q.h(var11, "footer");
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
         } else {
            return this.shouldSpoiler == var1.shouldSpoiler;
         }
      }
   }

   public override fun hashCode(): Int {
      val var9: Int = ChannelId.hashCode-impl(this.parentChannelId);
      val var15: Int = ChannelId.hashCode-impl(this.threadId);
      val var10: Int = MessageId.hashCode-impl(this.messageId);
      val var11: Int = GuildId.hashCode-impl(this.guildId);
      val var13: Int = this.title.hashCode();
      val var16: Int = this.ctaText.hashCode();
      val var12: Int = Integer.hashCode(this.ctaButtonColor);
      val var14: Int = this.footer.hashCode();
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
                                                                                                                           ((var9 * 31 + var15) * 31 + var10)
                                                                                                                                 * 31
                                                                                                                              + var11
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
                                                                                          + var14
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
         + java.lang.Boolean.hashCode(this.shouldSpoiler);
   }

   public override fun toString(): String {
      val var11: java.lang.String = ChannelId.toString-impl(this.parentChannelId);
      val var5: java.lang.String = ChannelId.toString-impl(this.threadId);
      val var17: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: java.lang.String = GuildId.toString-impl(this.guildId);
      val var6: java.lang.String = this.title;
      val var9: java.lang.String = this.ctaText;
      val var1: Int = this.ctaButtonColor;
      val var8: StructurableText = this.footer;
      val var4: java.lang.String = this.subtitle;
      val var12: java.lang.String = this.coverImage;
      val var18: java.lang.String = this.blurredCoverImage;
      val var10: java.lang.String = this.coverImageOverlayText;
      val var13: java.lang.String = this.backgroundImage;
      val var16: java.lang.String = this.spoiler;
      val var15: java.lang.String = this.obscure;
      val var7: java.lang.Boolean = this.obscureAwaitingScan;
      val var2: Boolean = this.shouldSpoiler;
      val var14: StringBuilder = new StringBuilder();
      var14.append("PostPreviewEmbed(parentChannelId=");
      var14.append(var11);
      var14.append(", threadId=");
      var14.append(var5);
      var14.append(", messageId=");
      var14.append(var17);
      var14.append(", guildId=");
      var14.append(var3);
      var14.append(", title=");
      var14.append(var6);
      var14.append(", ctaText=");
      var14.append(var9);
      var14.append(", ctaButtonColor=");
      var14.append(var1);
      var14.append(", footer=");
      var14.append(var8);
      var14.append(", subtitle=");
      var14.append(var4);
      var14.append(", coverImage=");
      var14.append(var12);
      var14.append(", blurredCoverImage=");
      var14.append(var18);
      var14.append(", coverImageOverlayText=");
      var14.append(var10);
      var14.append(", backgroundImage=");
      var14.append(var13);
      var14.append(", spoiler=");
      var14.append(var16);
      var14.append(", obscure=");
      var14.append(var15);
      var14.append(", obscureAwaitingScan=");
      var14.append(var7);
      var14.append(", shouldSpoiler=");
      var14.append(var2);
      var14.append(")");
      return var14.toString();
   }

   public object `$serializer` : g0 {
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
         val var7: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var1: MessageId.$serializer = MessageId.$serializer.INSTANCE;
         val var5: GuildId.$serializer = GuildId.$serializer.INSTANCE;
         val var11: b2 = b2.a;
         val var6: n0 = n0.a;
         val var12: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var2: KSerializer = a.u(b2.a);
         val var14: KSerializer = a.u(var11);
         val var3: KSerializer = a.u(var11);
         val var10: KSerializer = a.u(var11);
         val var8: KSerializer = a.u(var11);
         val var4: KSerializer = a.u(var11);
         val var13: KSerializer = a.u(var11);
         val var9: gn.h = gn.h.a;
         return new KSerializer[]{
            var7, var7, var1, var5, var11, var11, var6, var12, var2, var14, var3, var10, var8, var4, var13, a.u(gn.h.a), var9, a.u(var11), a.u(var11)
         };
      }

      public open fun deserialize(decoder: Decoder): PostPreviewEmbed {
         q.h(var1, "decoder");
         val var31: SerialDescriptor = this.getDescriptor();
         val var32: c = var1.b(var31);
         val var8: Boolean = var32.p();
         var var6: Byte = 11;
         var var22: java.lang.String = null;
         var var3: Int;
         val var4: Int;
         val var5: Byte;
         var var15: ChannelId;
         var var16: Any;
         var var19: Any;
         var var20: java.lang.String;
         var var21: java.lang.String;
         var var23: java.lang.String;
         var var24: java.lang.String;
         val var25: Any;
         val var26: java.lang.String;
         val var27: Any;
         val var28: java.lang.String;
         val var29: java.lang.String;
         var var43: java.lang.String;
         var var45: java.lang.String;
         var var53: java.lang.String;
         var var55: java.lang.String;
         if (var8) {
            val var33: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
            var19 = var32.y(var31, 0, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var15 = var32.y(var31, 1, var33, null) as ChannelId;
            val var34: MessageId = var32.y(var31, 2, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var35: java.lang.String;
            if (var34 != null) {
               var35 = var34.unbox-impl();
            } else {
               var35 = null;
            }

            var16 = var32.y(var31, 3, GuildId.$serializer.INSTANCE, null) as GuildId;
            var28 = var32.m(var31, 4);
            var20 = var32.m(var31, 5);
            var3 = var32.i(var31, 6);
            var25 = var32.y(var31, 7, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            val var17: b2 = b2.a;
            val var9: java.lang.String = var32.n(var31, 8, b2.a, null) as java.lang.String;
            val var14: java.lang.String = var32.n(var31, 9, var17, null) as java.lang.String;
            val var12: java.lang.String = var32.n(var31, 10, var17, null) as java.lang.String;
            var43 = var32.n(var31, 11, var17, null) as java.lang.String;
            var22 = var32.n(var31, 12, var17, null) as java.lang.String;
            var23 = var32.n(var31, 13, var17, null) as java.lang.String;
            val var13: java.lang.String = var32.n(var31, 14, var17, null) as java.lang.String;
            val var11: java.lang.Boolean = var32.n(var31, 15, gn.h.a, null) as java.lang.Boolean;
            val var2: Byte = var32.C(var31, 16);
            var55 = var32.n(var31, 17, var17, null) as java.lang.String;
            val var30: java.lang.String = var32.n(var31, 18, var17, null) as java.lang.String;
            var53 = var35;
            var4 = 524287;
            var55 = var9;
            var29 = var14;
            var24 = var12;
            var21 = var43;
            var26 = var13;
            var27 = var11;
            var5 = var2;
            var43 = var55;
            var45 = var30;
         } else {
            var var40: Boolean = true;
            var var38: Int = 0;
            var var39: Byte = 0;
            var3 = 0;
            var15 = null;
            var16 = null;
            var45 = null;
            var43 = null;
            var24 = null;
            var23 = null;
            var21 = null;
            var20 = null;
            var19 = null;
            var55 = null;
            var var48: java.lang.String = null;
            var var51: Any = null;
            var var47: Any = null;
            var var37: java.lang.String = null;
            var var42: Any = null;
            var53 = null;

            while (var40) {
               var var41: Int;
               label59: {
                  var41 = var32.o(var31);
                  switch (var41) {
                     case -1:
                        var40 = false;
                        break;
                     case 0:
                        var47 = var32.y(var31, 0, ChannelId.$serializer.INSTANCE, var47) as ChannelId;
                        var38 |= 1;
                        break;
                     case 1:
                        var15 = var32.y(var31, 1, ChannelId.$serializer.INSTANCE, var15) as ChannelId;
                        var38 |= 2;
                        break;
                     case 2:
                        val var49: MessageId;
                        if (var48 != null) {
                           var49 = MessageId.box-impl(var48);
                        } else {
                           var49 = null;
                        }

                        val var50: MessageId = var32.y(var31, 2, MessageId.$serializer.INSTANCE, var49) as MessageId;
                        if (var50 != null) {
                           var48 = var50.unbox-impl();
                        } else {
                           var48 = null;
                        }

                        var38 |= 4;
                        break;
                     case 3:
                        var51 = var32.y(var31, 3, GuildId.$serializer.INSTANCE, var51) as GuildId;
                        var38 |= 8;
                        break;
                     case 4:
                        var55 = var32.m(var31, 4);
                        var38 |= 16;
                        break;
                     case 5:
                        var53 = var32.m(var31, 5);
                        var38 |= 32;
                        break;
                     case 6:
                        var3 = var32.i(var31, 6);
                        var38 |= 64;
                        break;
                     case 7:
                        var42 = var32.y(var31, 7, StructurableTextSerializer.INSTANCE, var42) as StructurableText;
                        var38 |= 128;
                        break;
                     case 8:
                        var20 = var32.n(var31, 8, b2.a, var20) as java.lang.String;
                        var38 |= 256;
                        break;
                     case 9:
                        var37 = var32.n(var31, 9, b2.a, var37) as java.lang.String;
                        var38 |= 512;
                        var6 = 11;
                        continue;
                     case 10:
                        var45 = var32.n(var31, 10, b2.a, var45) as java.lang.String;
                        var38 |= 1024;
                        var6 = 11;
                        continue;
                     case 11:
                        var21 = var32.n(var31, var6, b2.a, var21) as java.lang.String;
                        var38 |= 2048;
                        continue;
                     case 12:
                        var22 = var32.n(var31, 12, b2.a, var22) as java.lang.String;
                        var38 |= 4096;
                        continue;
                     case 13:
                        var23 = var32.n(var31, 13, b2.a, var23) as java.lang.String;
                        var38 |= 8192;
                        continue;
                     case 14:
                        var24 = var32.n(var31, 14, b2.a, var24) as java.lang.String;
                        var38 |= 16384;
                        continue;
                     case 15:
                        var43 = var32.n(var31, 15, gn.h.a, var43) as java.lang.Boolean;
                        var38 |= 32768;
                        continue;
                     case 16:
                        var39 = var32.C(var31, 16);
                        var38 |= 65536;
                        continue;
                     case 17:
                        var19 = var32.n(var31, 17, b2.a, var19) as java.lang.String;
                        var41 = 131072;
                        break label59;
                     case 18:
                        var16 = var32.n(var31, 18, b2.a, var16) as java.lang.String;
                        var41 = 262144;
                        break label59;
                     default:
                        throw new n(var41);
                  }

                  var6 = 11;
                  continue;
               }

               var38 |= var41;
            }

            var27 = var43;
            var28 = var55;
            var45 = (java.lang.String)var16;
            var43 = (java.lang.String)var19;
            var5 = var39;
            var26 = var24;
            var24 = var45;
            var29 = var37;
            var55 = var20;
            var25 = var42;
            var20 = var53;
            var16 = var51;
            var53 = var48;
            var19 = var47;
            var4 = var38;
         }

         var32.c(var31);
         return new PostPreviewEmbed(
            var4,
            (ChannelId)var19,
            var15,
            var53,
            (GuildId)var16,
            var28,
            var20,
            var3,
            (StructurableText)var25,
            var55,
            var29,
            var24,
            var21,
            var22,
            var23,
            var26,
            (java.lang.Boolean)var27,
            (boolean)var5,
            var43,
            var45,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: PostPreviewEmbed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PostPreviewEmbed.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PostPreviewEmbed> {
         return PostPreviewEmbed.$serializer.INSTANCE;
      }
   }
}
