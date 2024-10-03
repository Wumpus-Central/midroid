package com.discord.chat.bridge.postpreviewembed

import cl.f
import cl.n
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import dl.a
import fl.b2
import fl.g0
import fl.n0
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
      val var13: Int = ChannelId.hashCode-impl(this.threadId);
      val var16: Int = MessageId.hashCode-impl(this.messageId);
      val var15: Int = GuildId.hashCode-impl(this.guildId);
      val var11: Int = this.title.hashCode();
      val var12: Int = this.ctaText.hashCode();
      val var14: Int = Integer.hashCode(this.ctaButtonColor);
      val var10: Int = this.footer.hashCode();
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
                                                                                                                           ((var9 * 31 + var13) * 31 + var16)
                                                                                                                                 * 31
                                                                                                                              + var15
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var11
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var12
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var14
                                                                                             )
                                                                                             * 31
                                                                                          + var10
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
      val var5: java.lang.String = ChannelId.toString-impl(this.parentChannelId);
      val var7: java.lang.String = ChannelId.toString-impl(this.threadId);
      val var6: java.lang.String = MessageId.toString-impl(this.messageId);
      val var8: java.lang.String = GuildId.toString-impl(this.guildId);
      val var14: java.lang.String = this.title;
      val var11: java.lang.String = this.ctaText;
      val var1: Int = this.ctaButtonColor;
      val var3: StructurableText = this.footer;
      val var9: java.lang.String = this.subtitle;
      val var12: java.lang.String = this.coverImage;
      val var10: java.lang.String = this.blurredCoverImage;
      val var13: java.lang.String = this.coverImageOverlayText;
      val var15: java.lang.String = this.backgroundImage;
      val var17: java.lang.String = this.spoiler;
      val var4: java.lang.String = this.obscure;
      val var16: java.lang.Boolean = this.obscureAwaitingScan;
      val var2: Boolean = this.shouldSpoiler;
      val var18: StringBuilder = new StringBuilder();
      var18.append("PostPreviewEmbed(parentChannelId=");
      var18.append(var5);
      var18.append(", threadId=");
      var18.append(var7);
      var18.append(", messageId=");
      var18.append(var6);
      var18.append(", guildId=");
      var18.append(var8);
      var18.append(", title=");
      var18.append(var14);
      var18.append(", ctaText=");
      var18.append(var11);
      var18.append(", ctaButtonColor=");
      var18.append(var1);
      var18.append(", footer=");
      var18.append(var3);
      var18.append(", subtitle=");
      var18.append(var9);
      var18.append(", coverImage=");
      var18.append(var12);
      var18.append(", blurredCoverImage=");
      var18.append(var10);
      var18.append(", coverImageOverlayText=");
      var18.append(var13);
      var18.append(", backgroundImage=");
      var18.append(var15);
      var18.append(", spoiler=");
      var18.append(var17);
      var18.append(", obscure=");
      var18.append(var4);
      var18.append(", obscureAwaitingScan=");
      var18.append(var16);
      var18.append(", shouldSpoiler=");
      var18.append(var2);
      var18.append(")");
      return var18.toString();
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
         val var3: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var2: MessageId.$serializer = MessageId.$serializer.INSTANCE;
         val var9: GuildId.$serializer = GuildId.$serializer.INSTANCE;
         val var1: b2 = b2.a;
         val var5: n0 = n0.a;
         val var12: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         val var10: KSerializer = a.u(b2.a);
         val var13: KSerializer = a.u(var1);
         val var8: KSerializer = a.u(var1);
         val var7: KSerializer = a.u(var1);
         val var4: KSerializer = a.u(var1);
         val var11: KSerializer = a.u(var1);
         val var6: KSerializer = a.u(var1);
         val var14: fl.h = fl.h.a;
         return new KSerializer[]{
            var3, var3, var2, var9, var1, var1, var5, var12, var10, var13, var8, var7, var4, var11, var6, a.u(fl.h.a), var14, a.u(var1), a.u(var1)
         };
      }

      public open fun deserialize(decoder: Decoder): PostPreviewEmbed {
         q.h(var1, "decoder");
         val var30: SerialDescriptor = this.getDescriptor();
         val var31: c = var1.c(var30);
         val var8: Boolean = var31.y();
         var var6: Byte = 11;
         var var22: java.lang.String = null;
         var var3: Byte;
         val var4: Int;
         val var5: Int;
         var var11: Any;
         var var12: java.lang.String;
         var var15: ChannelId;
         var var16: java.lang.String;
         var var18: Any;
         var var19: java.lang.String;
         var var21: Any;
         var var23: java.lang.String;
         var var24: java.lang.String;
         val var25: java.lang.String;
         val var26: java.lang.String;
         val var27: Any;
         val var28: java.lang.String;
         val var29: java.lang.String;
         var var53: java.lang.String;
         var var57: java.lang.String;
         if (var8) {
            val var32: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
            var27 = var31.m(var30, 0, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var15 = var31.m(var30, 1, var32, null) as ChannelId;
            val var33: MessageId = var31.m(var30, 2, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var34: java.lang.String;
            if (var33 != null) {
               var34 = var33.unbox-impl();
            } else {
               var34 = null;
            }

            var18 = var31.m(var30, 3, GuildId.$serializer.INSTANCE, null) as GuildId;
            var16 = var31.t(var30, 4);
            var19 = var31.t(var30, 5);
            var4 = var31.k(var30, 6);
            var21 = var31.m(var30, 7, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            val var20: b2 = b2.a;
            val var9: java.lang.String = var31.v(var30, 8, b2.a, null) as java.lang.String;
            val var13: java.lang.String = var31.v(var30, 9, var20, null) as java.lang.String;
            var12 = var31.v(var30, 10, var20, null) as java.lang.String;
            val var10: java.lang.String = var31.v(var30, 11, var20, null) as java.lang.String;
            var22 = var31.v(var30, 12, var20, null) as java.lang.String;
            var23 = var31.v(var30, 13, var20, null) as java.lang.String;
            val var14: java.lang.String = var31.v(var30, 14, var20, null) as java.lang.String;
            var11 = var31.v(var30, 15, fl.h.a, null) as java.lang.Boolean;
            val var2: Byte = var31.s(var30, 16);
            var53 = var31.v(var30, 17, var20, null) as java.lang.String;
            var29 = var31.v(var30, 18, var20, null) as java.lang.String;
            var57 = var34;
            var5 = 524287;
            var53 = var9;
            var25 = var13;
            var28 = var10;
            var24 = var14;
            var3 = var2;
            var26 = var53;
         } else {
            var var40: Boolean = true;
            var var37: Int = 0;
            var var39: Byte = 0;
            var3 = 0;
            var15 = null;
            var16 = null;
            var11 = null;
            var var44: Any = null;
            var24 = null;
            var23 = null;
            var21 = null;
            var57 = null;
            var19 = null;
            var18 = null;
            var12 = null;
            var var51: Any = null;
            var var50: Any = null;
            var var36: java.lang.String = null;
            var var43: Any = null;
            var53 = null;

            while (var40) {
               var var42: Int;
               label59: {
                  var42 = var31.x(var30);
                  switch (var42) {
                     case -1:
                        var40 = false;
                        break;
                     case 0:
                        var50 = var31.m(var30, 0, ChannelId.$serializer.INSTANCE, var50) as ChannelId;
                        var37 |= 1;
                        break;
                     case 1:
                        var15 = var31.m(var30, 1, ChannelId.$serializer.INSTANCE, var15) as ChannelId;
                        var37 |= 2;
                        break;
                     case 2:
                        val var48: MessageId;
                        if (var12 != null) {
                           var48 = MessageId.box-impl(var12);
                        } else {
                           var48 = null;
                        }

                        val var49: MessageId = var31.m(var30, 2, MessageId.$serializer.INSTANCE, var48) as MessageId;
                        if (var49 != null) {
                           var12 = var49.unbox-impl();
                        } else {
                           var12 = null;
                        }

                        var37 |= 4;
                        break;
                     case 3:
                        var51 = var31.m(var30, 3, GuildId.$serializer.INSTANCE, var51) as GuildId;
                        var37 |= 8;
                        break;
                     case 4:
                        var18 = var31.t(var30, 4);
                        var37 |= 16;
                        break;
                     case 5:
                        var53 = var31.t(var30, 5);
                        var37 |= 32;
                        break;
                     case 6:
                        var3 = var31.k(var30, 6);
                        var37 |= 64;
                        break;
                     case 7:
                        var43 = var31.m(var30, 7, StructurableTextSerializer.INSTANCE, var43) as StructurableText;
                        var37 |= 128;
                        break;
                     case 8:
                        var57 = var31.v(var30, 8, b2.a, var57) as java.lang.String;
                        var37 |= 256;
                        break;
                     case 9:
                        var36 = var31.v(var30, 9, b2.a, var36) as java.lang.String;
                        var37 |= 512;
                        var6 = 11;
                        continue;
                     case 10:
                        var11 = var31.v(var30, 10, b2.a, var11) as java.lang.String;
                        var37 |= 1024;
                        var6 = 11;
                        continue;
                     case 11:
                        var21 = var31.v(var30, var6, b2.a, var21) as java.lang.String;
                        var37 |= 2048;
                        continue;
                     case 12:
                        var22 = var31.v(var30, 12, b2.a, var22) as java.lang.String;
                        var37 |= 4096;
                        continue;
                     case 13:
                        var23 = var31.v(var30, 13, b2.a, var23) as java.lang.String;
                        var37 |= 8192;
                        continue;
                     case 14:
                        var24 = var31.v(var30, 14, b2.a, var24) as java.lang.String;
                        var37 |= 16384;
                        continue;
                     case 15:
                        var44 = var31.v(var30, 15, fl.h.a, var44) as java.lang.Boolean;
                        var37 |= 32768;
                        continue;
                     case 16:
                        var39 = var31.s(var30, 16);
                        var37 |= 65536;
                        continue;
                     case 17:
                        var19 = var31.v(var30, 17, b2.a, var19) as java.lang.String;
                        var42 = 131072;
                        break label59;
                     case 18:
                        var16 = var31.v(var30, 18, b2.a, var16) as java.lang.String;
                        var42 = 262144;
                        break label59;
                     default:
                        throw new n(var42);
                  }

                  var6 = 11;
                  continue;
               }

               var37 |= var42;
            }

            var26 = var19;
            var4 = var3;
            var19 = var53;
            var29 = var16;
            var3 = var39;
            var11 = var44;
            var28 = (java.lang.String)var21;
            var12 = (java.lang.String)var11;
            var25 = var36;
            var53 = var57;
            var21 = var43;
            var16 = (java.lang.String)var18;
            var18 = var51;
            var57 = var12;
            var27 = var50;
            var5 = var37;
         }

         var31.b(var30);
         return new PostPreviewEmbed(
            var5,
            (ChannelId)var27,
            var15,
            var57,
            (GuildId)var18,
            var16,
            var19,
            var4,
            (StructurableText)var21,
            var53,
            var25,
            var12,
            var28,
            var22,
            var23,
            var24,
            (java.lang.Boolean)var11,
            (boolean)var3,
            var26,
            var29,
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
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PostPreviewEmbed> {
         return PostPreviewEmbed.$serializer.INSTANCE;
      }
   }
}
