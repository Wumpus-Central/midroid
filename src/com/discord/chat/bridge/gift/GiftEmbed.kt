package com.discord.chat.bridge.gift

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.e0
import xk.f0
import xk.h
import xk.m0
import xk.f0.a

@f(with = GiftEmbedSerializer::class)
public sealed interface GiftEmbed {
   public val backgroundColor: Int
   public val headerColor: Int
   public val headerText: String
   public val thumbnailCornerRadius: Int

   public companion object {
      public fun serializer(): KSerializer<GiftEmbed> {
         return GiftEmbedSerializer.INSTANCE;
      }
   }

   public sealed interface Resolved : GiftEmbed {
      public val subtitle: String?
      public val subtitleColor: Int
      public val thumbnailUrl: String?
      public val titleColor: Int
      public val titleText: String?

      @f
      public data class Invalid(headerText: String,
            headerColor: Int,
            backgroundColor: Int,
            thumbnailCornerRadius: Int,
            thumbnailUrl: String,
            titleText: String,
            titleColor: Int,
            subtitle: String,
            subtitleColor: Int,
            thumbnailBackgroundColor: Int
         ) :
         GiftEmbed.Resolved {
         public open val backgroundColor: Int
         public open val headerColor: Int
         public open val headerText: String
         public open val subtitle: String
         public open val subtitleColor: Int
         public final val thumbnailBackgroundColor: Int
         public open val thumbnailCornerRadius: Int
         public open val thumbnailUrl: String
         public open val titleColor: Int
         public open val titleText: String

         init {
            r.h(var1, "headerText");
            r.h(var5, "thumbnailUrl");
            r.h(var6, "titleText");
            r.h(var8, "subtitle");
            super();
            this.headerText = var1;
            this.headerColor = var2;
            this.backgroundColor = var3;
            this.thumbnailCornerRadius = var4;
            this.thumbnailUrl = var5;
            this.titleText = var6;
            this.titleColor = var7;
            this.subtitle = var8;
            this.subtitleColor = var9;
            this.thumbnailBackgroundColor = var10;
         }

         @JvmStatic
         public fun `write$Self`(self: com.discord.chat.bridge.gift.GiftEmbed.Resolved.Invalid, output: CompositeEncoder, serialDesc: SerialDescriptor) {
            r.h(var0, "self");
            r.h(var1, "output");
            r.h(var2, "serialDesc");
            var1.z(var2, 0, var0.getHeaderText());
            var1.w(var2, 1, var0.getHeaderColor());
            var1.w(var2, 2, var0.getBackgroundColor());
            var1.w(var2, 3, var0.getThumbnailCornerRadius());
            var1.z(var2, 4, var0.getThumbnailUrl());
            var1.z(var2, 5, var0.getTitleText());
            var1.w(var2, 6, var0.getTitleColor());
            var1.z(var2, 7, var0.getSubtitle());
            var1.w(var2, 8, var0.getSubtitleColor());
            var1.w(var2, 9, var0.thumbnailBackgroundColor);
         }

         public operator fun component1(): String {
            return this.getHeaderText();
         }

         public operator fun component10(): Int {
            return this.thumbnailBackgroundColor;
         }

         public operator fun component2(): Int {
            return this.getHeaderColor();
         }

         public operator fun component3(): Int {
            return this.getBackgroundColor();
         }

         public operator fun component4(): Int {
            return this.getThumbnailCornerRadius();
         }

         public operator fun component5(): String {
            return this.getThumbnailUrl();
         }

         public operator fun component6(): String {
            return this.getTitleText();
         }

         public operator fun component7(): Int {
            return this.getTitleColor();
         }

         public operator fun component8(): String {
            return this.getSubtitle();
         }

         public operator fun component9(): Int {
            return this.getSubtitleColor();
         }

         public fun copy(
            headerText: String = var0.getHeaderText(),
            headerColor: Int = var0.getHeaderColor(),
            backgroundColor: Int = var0.getBackgroundColor(),
            thumbnailCornerRadius: Int = var0.getThumbnailCornerRadius(),
            thumbnailUrl: String = var0.getThumbnailUrl(),
            titleText: String = var0.getTitleText(),
            titleColor: Int = var0.getTitleColor(),
            subtitle: String = var0.getSubtitle(),
            subtitleColor: Int = var0.getSubtitleColor(),
            thumbnailBackgroundColor: Int = var0.thumbnailBackgroundColor
         ): com.discord.chat.bridge.gift.GiftEmbed.Resolved.Invalid {
            r.h(var1, "headerText");
            r.h(var5, "thumbnailUrl");
            r.h(var6, "titleText");
            r.h(var8, "subtitle");
            return new GiftEmbed.Resolved.Invalid(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is GiftEmbed.Resolved.Invalid) {
               return false;
            } else {
               var1 = var1;
               if (!r.c(this.getHeaderText(), var1.getHeaderText())) {
                  return false;
               } else if (this.getHeaderColor() != var1.getHeaderColor()) {
                  return false;
               } else if (this.getBackgroundColor() != var1.getBackgroundColor()) {
                  return false;
               } else if (this.getThumbnailCornerRadius() != var1.getThumbnailCornerRadius()) {
                  return false;
               } else if (!r.c(this.getThumbnailUrl(), var1.getThumbnailUrl())) {
                  return false;
               } else if (!r.c(this.getTitleText(), var1.getTitleText())) {
                  return false;
               } else if (this.getTitleColor() != var1.getTitleColor()) {
                  return false;
               } else if (!r.c(this.getSubtitle(), var1.getSubtitle())) {
                  return false;
               } else if (this.getSubtitleColor() != var1.getSubtitleColor()) {
                  return false;
               } else {
                  return this.thumbnailBackgroundColor == var1.thumbnailBackgroundColor;
               }
            }
         }

         public override fun hashCode(): Int {
            return (
                     (
                              (
                                       (
                                                (
                                                         (
                                                                  (
                                                                           (this.getHeaderText().hashCode() * 31 + Integer.hashCode(this.getHeaderColor()))
                                                                                 * 31
                                                                              + Integer.hashCode(this.getBackgroundColor())
                                                                        )
                                                                        * 31
                                                                     + Integer.hashCode(this.getThumbnailCornerRadius())
                                                               )
                                                               * 31
                                                            + this.getThumbnailUrl().hashCode()
                                                      )
                                                      * 31
                                                   + this.getTitleText().hashCode()
                                             )
                                             * 31
                                          + Integer.hashCode(this.getTitleColor())
                                    )
                                    * 31
                                 + this.getSubtitle().hashCode()
                           )
                           * 31
                        + Integer.hashCode(this.getSubtitleColor())
                  )
                  * 31
               + Integer.hashCode(this.thumbnailBackgroundColor);
         }

         public override fun toString(): String {
            val var11: java.lang.String = this.getHeaderText();
            val var2: Int = this.getHeaderColor();
            val var4: Int = this.getBackgroundColor();
            val var6: Int = this.getThumbnailCornerRadius();
            val var10: java.lang.String = this.getThumbnailUrl();
            val var9: java.lang.String = this.getTitleText();
            val var3: Int = this.getTitleColor();
            val var7: java.lang.String = this.getSubtitle();
            val var5: Int = this.getSubtitleColor();
            val var1: Int = this.thumbnailBackgroundColor;
            val var8: StringBuilder = new StringBuilder();
            var8.append("Invalid(headerText=");
            var8.append(var11);
            var8.append(", headerColor=");
            var8.append(var2);
            var8.append(", backgroundColor=");
            var8.append(var4);
            var8.append(", thumbnailCornerRadius=");
            var8.append(var6);
            var8.append(", thumbnailUrl=");
            var8.append(var10);
            var8.append(", titleText=");
            var8.append(var9);
            var8.append(", titleColor=");
            var8.append(var3);
            var8.append(", subtitle=");
            var8.append(var7);
            var8.append(", subtitleColor=");
            var8.append(var5);
            var8.append(", thumbnailBackgroundColor=");
            var8.append(var1);
            var8.append(")");
            return var8.toString();
         }

         public object `$serializer` : f0<GiftEmbed.Resolved.Invalid> {
            public open val descriptor: SerialDescriptor
               public open get() {
                  return descriptor;
               }


            @JvmStatic
            fun {
               val var0: GiftEmbed.Resolved.Invalid.$serializer = new GiftEmbed.Resolved.Invalid.$serializer();
               INSTANCE = var0;
               val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
                  "com.discord.chat.bridge.gift.GiftEmbed.Resolved.Invalid", var0, 10
               );
               var1.l("headerText", false);
               var1.l("headerColor", false);
               var1.l("backgroundColor", false);
               var1.l("thumbnailCornerRadius", false);
               var1.l("thumbnailUrl", false);
               var1.l("titleText", false);
               var1.l("titleColor", false);
               var1.l("subtitle", false);
               var1.l("subtitleColor", false);
               var1.l("thumbnailBackgroundColor", false);
               descriptor = var1;
            }

            public open fun childSerializers(): Array<KSerializer<*>> {
               return new KSerializer[]{a2.a, m0.a, m0.a, m0.a, a2.a, a2.a, m0.a, a2.a, m0.a, m0.a};
            }

            public open fun deserialize(decoder: Decoder): com.discord.chat.bridge.gift.GiftEmbed.Resolved.Invalid {
               r.h(var1, "decoder");
               val var16: SerialDescriptor = this.getDescriptor();
               val var17: c = var1.b(var16);
               val var11: Boolean = var17.p();
               var var2: Int = 0;
               var var5: Int;
               var var6: Int;
               var var7: Int;
               var var8: Int;
               val var9: Int;
               var var10: Int;
               var var12: java.lang.String;
               var var13: java.lang.String;
               val var15: java.lang.String;
               val var18: java.lang.String;
               var var21: Int;
               if (var11) {
                  var12 = var17.m(var16, 0);
                  var6 = var17.i(var16, 1);
                  var7 = var17.i(var16, 2);
                  var8 = var17.i(var16, 3);
                  var15 = var17.m(var16, 4);
                  var13 = var17.m(var16, 5);
                  var21 = var17.i(var16, 6);
                  var18 = var17.m(var16, 7);
                  val var4: Int = var17.i(var16, 8);
                  var2 = var17.i(var16, 9);
                  var5 = 1023;
                  var9 = var21;
                  var21 = var4;
                  var10 = var2;
               } else {
                  var var14: java.lang.String = null;
                  var13 = null;
                  var var19: java.lang.String = null;
                  var12 = null;
                  var var28: Boolean = true;
                  var8 = 0;
                  var6 = 0;
                  var var23: Int = 0;
                  var7 = 0;
                  var5 = 0;
                  var21 = 0;

                  while (var28) {
                     var10 = var17.o(var16);
                     switch (var10) {
                        case -1:
                           var28 = false;
                           break;
                        case 0:
                           var14 = var17.m(var16, 0);
                           var2 |= 1;
                           break;
                        case 1:
                           var21 = var17.i(var16, 1);
                           var2 |= 2;
                           break;
                        case 2:
                           var5 = var17.i(var16, 2);
                           var2 |= 4;
                           break;
                        case 3:
                           var23 = var17.i(var16, 3);
                           var2 |= 8;
                           break;
                        case 4:
                           var12 = var17.m(var16, 4);
                           var2 |= 16;
                           break;
                        case 5:
                           var19 = var17.m(var16, 5);
                           var2 |= 32;
                           break;
                        case 6:
                           var6 = var17.i(var16, 6);
                           var2 |= 64;
                           break;
                        case 7:
                           var13 = var17.m(var16, 7);
                           var2 |= 128;
                           break;
                        case 8:
                           var7 = var17.i(var16, 8);
                           var2 |= 256;
                           break;
                        case 9:
                           var8 = var17.i(var16, 9);
                           var2 |= 512;
                           break;
                        default:
                           throw new n(var10);
                     }
                  }

                  var9 = var6;
                  var6 = var21;
                  var18 = var13;
                  var10 = var8;
                  var21 = var7;
                  var13 = var19;
                  var15 = var12;
                  var8 = var23;
                  var7 = var5;
                  var12 = var14;
                  var5 = var2;
               }

               var17.c(var16);
               return new GiftEmbed.Resolved.Invalid(var5, var12, var6, var7, var8, var15, var13, var9, var18, var21, var10, null);
            }

            public open fun serialize(encoder: Encoder, value: com.discord.chat.bridge.gift.GiftEmbed.Resolved.Invalid) {
               r.h(var1, "encoder");
               r.h(var2, "value");
               val var3: SerialDescriptor = this.getDescriptor();
               val var4: CompositeEncoder = var1.b(var3);
               GiftEmbed.Resolved.Invalid.write$Self(var2, var4, var3);
               var4.c(var3);
            }

            fun typeParametersSerializers(): Array<KSerializer<?>> {
               return a.a(this);
            }
         }

         public companion object {
            public fun serializer(): KSerializer<com.discord.chat.bridge.gift.GiftEmbed.Resolved.Invalid> {
               return GiftEmbed.Resolved.Invalid.$serializer.INSTANCE;
            }
         }
      }

      @f
      public data class Valid(headerText: String,
            headerColor: Int,
            backgroundColor: Int,
            thumbnailCornerRadius: Int,
            thumbnailUrl: String? = null,
            titleText: String? = null,
            titleColor: Int,
            subtitle: String? = null,
            subtitleColor: Int,
            bodyText: String? = null,
            bodyTextColor: Int,
            acceptLabelText: String? = null,
            acceptLabelColor: Int,
            acceptLabelBackgroundColor: Int,
            splashUrl: String? = null,
            splashOpacity: Float,
            canBeAccepted: Boolean,
            giftCode: String
         ) :
         GiftEmbed.Resolved {
         public final val acceptLabelBackgroundColor: Int
         public final val acceptLabelColor: Int
         public final val acceptLabelText: String?
         public open val backgroundColor: Int
         public final val bodyText: String?
         public final val bodyTextColor: Int
         public final val canBeAccepted: Boolean
         public final val giftCode: String
         public open val headerColor: Int
         public open val headerText: String
         public final val splashOpacity: Float
         public final val splashUrl: String?
         public open val subtitle: String?
         public open val subtitleColor: Int
         public open val thumbnailCornerRadius: Int
         public open val thumbnailUrl: String?
         public open val titleColor: Int
         public open val titleText: String?

         init {
            r.h(var1, "headerText");
            r.h(var18, "giftCode");
            super();
            this.headerText = var1;
            this.headerColor = var2;
            this.backgroundColor = var3;
            this.thumbnailCornerRadius = var4;
            this.thumbnailUrl = var5;
            this.titleText = var6;
            this.titleColor = var7;
            this.subtitle = var8;
            this.subtitleColor = var9;
            this.bodyText = var10;
            this.bodyTextColor = var11;
            this.acceptLabelText = var12;
            this.acceptLabelColor = var13;
            this.acceptLabelBackgroundColor = var14;
            this.splashUrl = var15;
            this.splashOpacity = var16;
            this.canBeAccepted = var17;
            this.giftCode = var18;
         }

         @JvmStatic
         public fun `write$Self`(self: com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid, output: CompositeEncoder, serialDesc: SerialDescriptor) {
            r.h(var0, "self");
            r.h(var1, "output");
            r.h(var2, "serialDesc");
            var1.z(var2, 0, var0.getHeaderText());
            var1.w(var2, 1, var0.getHeaderColor());
            var1.w(var2, 2, var0.getBackgroundColor());
            var1.w(var2, 3, var0.getThumbnailCornerRadius());
            var var3: Boolean;
            if (!var1.A(var2, 4) && var0.getThumbnailUrl() == null) {
               var3 = false;
            } else {
               var3 = true;
            }

            if (var3) {
               var1.m(var2, 4, a2.a, var0.getThumbnailUrl());
            }

            if (!var1.A(var2, 5) && var0.getTitleText() == null) {
               var3 = false;
            } else {
               var3 = true;
            }

            if (var3) {
               var1.m(var2, 5, a2.a, var0.getTitleText());
            }

            var1.w(var2, 6, var0.getTitleColor());
            if (!var1.A(var2, 7) && var0.getSubtitle() == null) {
               var3 = false;
            } else {
               var3 = true;
            }

            if (var3) {
               var1.m(var2, 7, a2.a, var0.getSubtitle());
            }

            var1.w(var2, 8, var0.getSubtitleColor());
            if (!var1.A(var2, 9) && var0.bodyText == null) {
               var3 = false;
            } else {
               var3 = true;
            }

            if (var3) {
               var1.m(var2, 9, a2.a, var0.bodyText);
            }

            var1.w(var2, 10, var0.bodyTextColor);
            if (!var1.A(var2, 11) && var0.acceptLabelText == null) {
               var3 = false;
            } else {
               var3 = true;
            }

            if (var3) {
               var1.m(var2, 11, a2.a, var0.acceptLabelText);
            }

            label56: {
               var1.w(var2, 12, var0.acceptLabelColor);
               var1.w(var2, 13, var0.acceptLabelBackgroundColor);
               if (!var1.A(var2, 14)) {
                  var3 = false;
                  if (var0.splashUrl == null) {
                     break label56;
                  }
               }

               var3 = true;
            }

            if (var3) {
               var1.m(var2, 14, a2.a, var0.splashUrl);
            }

            var1.r(var2, 15, var0.splashOpacity);
            var1.x(var2, 16, var0.canBeAccepted);
            var1.z(var2, 17, var0.giftCode);
         }

         public operator fun component1(): String {
            return this.getHeaderText();
         }

         public operator fun component10(): String? {
            return this.bodyText;
         }

         public operator fun component11(): Int {
            return this.bodyTextColor;
         }

         public operator fun component12(): String? {
            return this.acceptLabelText;
         }

         public operator fun component13(): Int {
            return this.acceptLabelColor;
         }

         public operator fun component14(): Int {
            return this.acceptLabelBackgroundColor;
         }

         public operator fun component15(): String? {
            return this.splashUrl;
         }

         public operator fun component16(): Float {
            return this.splashOpacity;
         }

         public operator fun component17(): Boolean {
            return this.canBeAccepted;
         }

         public operator fun component18(): String {
            return this.giftCode;
         }

         public operator fun component2(): Int {
            return this.getHeaderColor();
         }

         public operator fun component3(): Int {
            return this.getBackgroundColor();
         }

         public operator fun component4(): Int {
            return this.getThumbnailCornerRadius();
         }

         public operator fun component5(): String? {
            return this.getThumbnailUrl();
         }

         public operator fun component6(): String? {
            return this.getTitleText();
         }

         public operator fun component7(): Int {
            return this.getTitleColor();
         }

         public operator fun component8(): String? {
            return this.getSubtitle();
         }

         public operator fun component9(): Int {
            return this.getSubtitleColor();
         }

         public fun copy(
            headerText: String = var0.getHeaderText(),
            headerColor: Int = var0.getHeaderColor(),
            backgroundColor: Int = var0.getBackgroundColor(),
            thumbnailCornerRadius: Int = var0.getThumbnailCornerRadius(),
            thumbnailUrl: String? = var0.getThumbnailUrl(),
            titleText: String? = var0.getTitleText(),
            titleColor: Int = var0.getTitleColor(),
            subtitle: String? = var0.getSubtitle(),
            subtitleColor: Int = var0.getSubtitleColor(),
            bodyText: String? = var0.bodyText,
            bodyTextColor: Int = var0.bodyTextColor,
            acceptLabelText: String? = var0.acceptLabelText,
            acceptLabelColor: Int = var0.acceptLabelColor,
            acceptLabelBackgroundColor: Int = var0.acceptLabelBackgroundColor,
            splashUrl: String? = var0.splashUrl,
            splashOpacity: Float = var0.splashOpacity,
            canBeAccepted: Boolean = var0.canBeAccepted,
            giftCode: String = var0.giftCode
         ): com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid {
            r.h(var1, "headerText");
            r.h(var18, "giftCode");
            return new GiftEmbed.Resolved.Valid(
               var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18
            );
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is GiftEmbed.Resolved.Valid) {
               return false;
            } else {
               var1 = var1;
               if (!r.c(this.getHeaderText(), var1.getHeaderText())) {
                  return false;
               } else if (this.getHeaderColor() != var1.getHeaderColor()) {
                  return false;
               } else if (this.getBackgroundColor() != var1.getBackgroundColor()) {
                  return false;
               } else if (this.getThumbnailCornerRadius() != var1.getThumbnailCornerRadius()) {
                  return false;
               } else if (!r.c(this.getThumbnailUrl(), var1.getThumbnailUrl())) {
                  return false;
               } else if (!r.c(this.getTitleText(), var1.getTitleText())) {
                  return false;
               } else if (this.getTitleColor() != var1.getTitleColor()) {
                  return false;
               } else if (!r.c(this.getSubtitle(), var1.getSubtitle())) {
                  return false;
               } else if (this.getSubtitleColor() != var1.getSubtitleColor()) {
                  return false;
               } else if (!r.c(this.bodyText, var1.bodyText)) {
                  return false;
               } else if (this.bodyTextColor != var1.bodyTextColor) {
                  return false;
               } else if (!r.c(this.acceptLabelText, var1.acceptLabelText)) {
                  return false;
               } else if (this.acceptLabelColor != var1.acceptLabelColor) {
                  return false;
               } else if (this.acceptLabelBackgroundColor != var1.acceptLabelBackgroundColor) {
                  return false;
               } else if (!r.c(this.splashUrl, var1.splashUrl)) {
                  return false;
               } else if (java.lang.Float.compare(this.splashOpacity, var1.splashOpacity) != 0) {
                  return false;
               } else if (this.canBeAccepted != var1.canBeAccepted) {
                  return false;
               } else {
                  return r.c(this.giftCode, var1.giftCode);
               }
            }
         }

         public override fun hashCode(): Int {
            val var12: Int = this.getHeaderText().hashCode();
            val var9: Int = Integer.hashCode(this.getHeaderColor());
            val var10: Int = Integer.hashCode(this.getBackgroundColor());
            val var11: Int = Integer.hashCode(this.getThumbnailCornerRadius());
            val var19: java.lang.String = this.getThumbnailUrl();
            var var6: Int = 0;
            val var1: Int;
            if (var19 == null) {
               var1 = 0;
            } else {
               var1 = this.getThumbnailUrl().hashCode();
            }

            val var2: Int;
            if (this.getTitleText() == null) {
               var2 = 0;
            } else {
               var2 = this.getTitleText().hashCode();
            }

            val var13: Int = Integer.hashCode(this.getTitleColor());
            val var3: Int;
            if (this.getSubtitle() == null) {
               var3 = 0;
            } else {
               var3 = this.getSubtitle().hashCode();
            }

            val var14: Int = Integer.hashCode(this.getSubtitleColor());
            val var4: Int;
            if (this.bodyText == null) {
               var4 = 0;
            } else {
               var4 = this.bodyText.hashCode();
            }

            val var15: Int = Integer.hashCode(this.bodyTextColor);
            val var5: Int;
            if (this.acceptLabelText == null) {
               var5 = 0;
            } else {
               var5 = this.acceptLabelText.hashCode();
            }

            val var17: Int = Integer.hashCode(this.acceptLabelColor);
            val var16: Int = Integer.hashCode(this.acceptLabelBackgroundColor);
            if (this.splashUrl != null) {
               var6 = this.splashUrl.hashCode();
            }

            val var18: Int = java.lang.Float.hashCode(this.splashOpacity);
            var var7: Byte = this.canBeAccepted;
            if (this.canBeAccepted != 0) {
               var7 = 1;
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
                                                                                                                                                            var12
                                                                                                                                                                  * 31
                                                                                                                                                               + var9
                                                                                                                                                         )
                                                                                                                                                         * 31
                                                                                                                                                      + var10
                                                                                                                                                )
                                                                                                                                                * 31
                                                                                                                                             + var11
                                                                                                                                       )
                                                                                                                                       * 31
                                                                                                                                    + var1
                                                                                                                              )
                                                                                                                              * 31
                                                                                                                           + var2
                                                                                                                     )
                                                                                                                     * 31
                                                                                                                  + var13
                                                                                                            )
                                                                                                            * 31
                                                                                                         + var3
                                                                                                   )
                                                                                                   * 31
                                                                                                + var14
                                                                                          )
                                                                                          * 31
                                                                                       + var4
                                                                                 )
                                                                                 * 31
                                                                              + var15
                                                                        )
                                                                        * 31
                                                                     + var5
                                                               )
                                                               * 31
                                                            + var17
                                                      )
                                                      * 31
                                                   + var16
                                             )
                                             * 31
                                          + var6
                                    )
                                    * 31
                                 + var18
                           )
                           * 31
                        + var7
                  )
                  * 31
               + this.giftCode.hashCode();
         }

         public override fun toString(): String {
            val var11: java.lang.String = this.getHeaderText();
            val var3: Int = this.getHeaderColor();
            val var7: Int = this.getBackgroundColor();
            val var8: Int = this.getThumbnailCornerRadius();
            val var14: java.lang.String = this.getThumbnailUrl();
            val var18: java.lang.String = this.getTitleText();
            val var5: Int = this.getTitleColor();
            val var15: java.lang.String = this.getSubtitle();
            val var2: Int = this.getSubtitleColor();
            val var19: java.lang.String = this.bodyText;
            val var9: Int = this.bodyTextColor;
            val var16: java.lang.String = this.acceptLabelText;
            val var6: Int = this.acceptLabelColor;
            val var4: Int = this.acceptLabelBackgroundColor;
            val var17: java.lang.String = this.splashUrl;
            val var1: Float = this.splashOpacity;
            val var10: Boolean = this.canBeAccepted;
            val var13: java.lang.String = this.giftCode;
            val var12: StringBuilder = new StringBuilder();
            var12.append("Valid(headerText=");
            var12.append(var11);
            var12.append(", headerColor=");
            var12.append(var3);
            var12.append(", backgroundColor=");
            var12.append(var7);
            var12.append(", thumbnailCornerRadius=");
            var12.append(var8);
            var12.append(", thumbnailUrl=");
            var12.append(var14);
            var12.append(", titleText=");
            var12.append(var18);
            var12.append(", titleColor=");
            var12.append(var5);
            var12.append(", subtitle=");
            var12.append(var15);
            var12.append(", subtitleColor=");
            var12.append(var2);
            var12.append(", bodyText=");
            var12.append(var19);
            var12.append(", bodyTextColor=");
            var12.append(var9);
            var12.append(", acceptLabelText=");
            var12.append(var16);
            var12.append(", acceptLabelColor=");
            var12.append(var6);
            var12.append(", acceptLabelBackgroundColor=");
            var12.append(var4);
            var12.append(", splashUrl=");
            var12.append(var17);
            var12.append(", splashOpacity=");
            var12.append(var1);
            var12.append(", canBeAccepted=");
            var12.append(var10);
            var12.append(", giftCode=");
            var12.append(var13);
            var12.append(")");
            return var12.toString();
         }

         public object `$serializer` : f0<GiftEmbed.Resolved.Valid> {
            public open val descriptor: SerialDescriptor
               public open get() {
                  return descriptor;
               }


            @JvmStatic
            fun {
               val var0: GiftEmbed.Resolved.Valid.$serializer = new GiftEmbed.Resolved.Valid.$serializer();
               INSTANCE = var0;
               val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
                  "com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid", var0, 18
               );
               var1.l("headerText", false);
               var1.l("headerColor", false);
               var1.l("backgroundColor", false);
               var1.l("thumbnailCornerRadius", false);
               var1.l("thumbnailUrl", true);
               var1.l("titleText", true);
               var1.l("titleColor", false);
               var1.l("subtitle", true);
               var1.l("subtitleColor", false);
               var1.l("bodyText", true);
               var1.l("bodyTextColor", false);
               var1.l("acceptLabelText", true);
               var1.l("acceptLabelColor", false);
               var1.l("acceptLabelBackgroundColor", false);
               var1.l("splashUrl", true);
               var1.l("splashOpacity", false);
               var1.l("canBeAccepted", false);
               var1.l("giftCode", false);
               descriptor = var1;
            }

            public open fun childSerializers(): Array<KSerializer<*>> {
               val var2: a2 = a2.a;
               val var1: m0 = m0.a;
               return new KSerializer[]{
                  a2.a,
                  m0.a,
                  m0.a,
                  m0.a,
                  vk.a.u(a2.a),
                  vk.a.u(var2),
                  var1,
                  vk.a.u(var2),
                  var1,
                  vk.a.u(var2),
                  var1,
                  vk.a.u(var2),
                  var1,
                  var1,
                  vk.a.u(var2),
                  e0.a,
                  h.a,
                  var2
               };
            }

            public open fun deserialize(decoder: Decoder): com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid {
               r.h(var1, "decoder");
               val var27: SerialDescriptor = this.getDescriptor();
               val var28: c = var1.b(var27);
               val var17: Boolean = var28.p();
               var var11: Int = 8;
               var var2: Float;
               var var4: Int;
               var var8: Int;
               var var9: Int;
               var var10: Int;
               var var12: Int;
               var var13: Int;
               val var14: Int;
               val var15: Int;
               var var18: Any;
               var var19: Any;
               var var20: Any;
               var var21: Any;
               var var22: Any;
               var var23: Any;
               var var24: Any;
               var var30: Any;
               var var34: Int;
               if (var17) {
                  var20 = var28.m(var27, 0);
                  var10 = var28.i(var27, 1);
                  var11 = var28.i(var27, 2);
                  var9 = var28.i(var27, 3);
                  var30 = a2.a;
                  var18 = var28.n(var27, 4, a2.a, null);
                  var22 = var28.n(var27, 5, (DeserializationStrategy)var30, null);
                  var14 = var28.i(var27, 6);
                  var19 = var28.n(var27, 7, (DeserializationStrategy)var30, null);
                  var34 = var28.i(var27, 8);
                  var24 = var28.n(var27, 9, (DeserializationStrategy)var30, null);
                  val var6: Int = var28.i(var27, 10);
                  var23 = var28.n(var27, 11, (DeserializationStrategy)var30, null);
                  val var3: Int = var28.i(var27, 12);
                  val var7: Int = var28.i(var27, 13);
                  var21 = var28.n(var27, 14, (DeserializationStrategy)var30, null);
                  var2 = var28.u(var27, 15);
                  var4 = var28.C(var27, 16);
                  var30 = var28.m(var27, 17);
                  var8 = 262143;
                  var12 = var34;
                  var13 = var6;
                  var34 = var3;
                  var15 = var7;
               } else {
                  var var44: Byte = 17;
                  var var45: Boolean = true;
                  var22 = null;
                  var24 = null;
                  var21 = null;
                  var20 = null;
                  var19 = null;
                  var30 = null;
                  var23 = null;
                  var var32: Int = 0;
                  var8 = 0;
                  var var36: Int = 0;
                  var var35: Int = 0;
                  var34 = 0;
                  var4 = 0;
                  var13 = 0;
                  var12 = 0;
                  var2 = 0.0F;
                  var10 = 0;
                  var9 = 0;
                  var18 = null;

                  while (var45) {
                     label46: {
                        label45: {
                           val var16: Int = var28.o(var27);
                           switch (var16) {
                              case -1:
                                 var45 = false;
                                 var11 = 8;
                                 continue;
                              case 0:
                                 var30 = var28.m(var27, 0);
                                 var32 |= 1;
                                 break;
                              case 1:
                                 var36 = var28.i(var27, 1);
                                 var32 |= 2;
                                 break;
                              case 2:
                                 var8 = var28.i(var27, 2);
                                 var32 |= 4;
                                 break;
                              case 3:
                                 var35 = var28.i(var27, 3);
                                 var32 |= 8;
                                 break;
                              case 4:
                                 var18 = var28.n(var27, 4, a2.a, var18);
                                 var32 |= 16;
                                 break;
                              case 5:
                                 var22 = var28.n(var27, 5, a2.a, var22);
                                 var32 |= 32;
                                 break;
                              case 6:
                                 var13 = var28.i(var27, 6);
                                 var32 |= 64;
                                 break label46;
                              case 7:
                                 var24 = var28.n(var27, 7, a2.a, var24);
                                 var32 |= 128;
                                 break label46;
                              case 8:
                                 var10 = var28.i(var27, var11);
                                 var32 |= 256;
                                 break label45;
                              case 9:
                                 var20 = var28.n(var27, 9, a2.a, var20);
                                 var32 |= 512;
                                 break;
                              case 10:
                                 var4 = var28.i(var27, 10);
                                 var32 |= 1024;
                                 break;
                              case 11:
                                 var19 = var28.n(var27, 11, a2.a, var19);
                                 var32 |= 2048;
                                 break;
                              case 12:
                                 var34 = var28.i(var27, 12);
                                 var32 |= 4096;
                                 break;
                              case 13:
                                 var9 = var28.i(var27, 13);
                                 var32 |= 8192;
                                 break;
                              case 14:
                                 var21 = var28.n(var27, 14, a2.a, var21);
                                 var32 |= 16384;
                                 break;
                              case 15:
                                 var2 = var28.u(var27, 15);
                                 var32 |= 32768;
                                 break label45;
                              case 16:
                                 var12 = var28.C(var27, 16);
                                 var32 |= 65536;
                                 continue;
                              case 17:
                                 var23 = var28.m(var27, var44);
                                 var32 |= 131072;
                                 continue;
                              default:
                                 throw new n(var16);
                           }

                           var11 = 8;
                        }

                        var44 = 17;
                        continue;
                     }

                     var11 = 8;
                     var44 = 17;
                  }

                  var20 = var30;
                  var30 = var23;
                  var14 = var13;
                  var4 = var12;
                  var15 = var9;
                  var13 = var4;
                  var12 = var10;
                  var9 = var35;
                  var11 = var8;
                  var10 = var36;
                  var8 = var32;
                  var19 = var24;
                  var24 = var20;
                  var23 = var19;
               }

               var28.c(var27);
               return new GiftEmbed.Resolved.Valid(
                  var8,
                  (java.lang.String)var20,
                  var10,
                  var11,
                  var9,
                  var18 as java.lang.String,
                  var22 as java.lang.String,
                  var14,
                  var19 as java.lang.String,
                  var12,
                  var24 as java.lang.String,
                  var13,
                  var23 as java.lang.String,
                  var34,
                  var15,
                  var21 as java.lang.String,
                  var2,
                  (boolean)var4,
                  (java.lang.String)var30,
                  null
               );
            }

            public open fun serialize(encoder: Encoder, value: com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid) {
               r.h(var1, "encoder");
               r.h(var2, "value");
               val var3: SerialDescriptor = this.getDescriptor();
               val var4: CompositeEncoder = var1.b(var3);
               GiftEmbed.Resolved.Valid.write$Self(var2, var4, var3);
               var4.c(var3);
            }

            fun typeParametersSerializers(): Array<KSerializer<?>> {
               return a.a(this);
            }
         }

         public companion object {
            public fun serializer(): KSerializer<com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid> {
               return GiftEmbed.Resolved.Valid.$serializer.INSTANCE;
            }
         }
      }
   }

   @f
   public data class Resolving(headerText: String,
         headerColor: Int,
         backgroundColor: Int,
         thumbnailCornerRadius: Int,
         resolvingGradientStart: Int,
         resolvingGradientEnd: Int
      ) :
      GiftEmbed {
      public open val backgroundColor: Int
      public open val headerColor: Int
      public open val headerText: String
      public final val resolvingGradientEnd: Int
      public final val resolvingGradientStart: Int
      public open val thumbnailCornerRadius: Int

      init {
         r.h(var1, "headerText");
         super();
         this.headerText = var1;
         this.headerColor = var2;
         this.backgroundColor = var3;
         this.thumbnailCornerRadius = var4;
         this.resolvingGradientStart = var5;
         this.resolvingGradientEnd = var6;
      }

      @JvmStatic
      public fun `write$Self`(self: com.discord.chat.bridge.gift.GiftEmbed.Resolving, output: CompositeEncoder, serialDesc: SerialDescriptor) {
         r.h(var0, "self");
         r.h(var1, "output");
         r.h(var2, "serialDesc");
         var1.z(var2, 0, var0.getHeaderText());
         var1.w(var2, 1, var0.getHeaderColor());
         var1.w(var2, 2, var0.getBackgroundColor());
         var1.w(var2, 3, var0.getThumbnailCornerRadius());
         var1.w(var2, 4, var0.resolvingGradientStart);
         var1.w(var2, 5, var0.resolvingGradientEnd);
      }

      public operator fun component1(): String {
         return this.getHeaderText();
      }

      public operator fun component2(): Int {
         return this.getHeaderColor();
      }

      public operator fun component3(): Int {
         return this.getBackgroundColor();
      }

      public operator fun component4(): Int {
         return this.getThumbnailCornerRadius();
      }

      public operator fun component5(): Int {
         return this.resolvingGradientStart;
      }

      public operator fun component6(): Int {
         return this.resolvingGradientEnd;
      }

      public fun copy(
         headerText: String = var0.getHeaderText(),
         headerColor: Int = var0.getHeaderColor(),
         backgroundColor: Int = var0.getBackgroundColor(),
         thumbnailCornerRadius: Int = var0.getThumbnailCornerRadius(),
         resolvingGradientStart: Int = var0.resolvingGradientStart,
         resolvingGradientEnd: Int = var0.resolvingGradientEnd
      ): com.discord.chat.bridge.gift.GiftEmbed.Resolving {
         r.h(var1, "headerText");
         return new GiftEmbed.Resolving(var1, var2, var3, var4, var5, var6);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is GiftEmbed.Resolving) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.getHeaderText(), var1.getHeaderText())) {
               return false;
            } else if (this.getHeaderColor() != var1.getHeaderColor()) {
               return false;
            } else if (this.getBackgroundColor() != var1.getBackgroundColor()) {
               return false;
            } else if (this.getThumbnailCornerRadius() != var1.getThumbnailCornerRadius()) {
               return false;
            } else if (this.resolvingGradientStart != var1.resolvingGradientStart) {
               return false;
            } else {
               return this.resolvingGradientEnd == var1.resolvingGradientEnd;
            }
         }
      }

      public override fun hashCode(): Int {
         return (
                  (
                           ((this.getHeaderText().hashCode() * 31 + Integer.hashCode(this.getHeaderColor())) * 31 + Integer.hashCode(this.getBackgroundColor()))
                                 * 31
                              + Integer.hashCode(this.getThumbnailCornerRadius())
                        )
                        * 31
                     + Integer.hashCode(this.resolvingGradientStart)
               )
               * 31
            + Integer.hashCode(this.resolvingGradientEnd);
      }

      public override fun toString(): String {
         val var7: java.lang.String = this.getHeaderText();
         val var4: Int = this.getHeaderColor();
         val var1: Int = this.getBackgroundColor();
         val var3: Int = this.getThumbnailCornerRadius();
         val var5: Int = this.resolvingGradientStart;
         val var2: Int = this.resolvingGradientEnd;
         val var6: StringBuilder = new StringBuilder();
         var6.append("Resolving(headerText=");
         var6.append(var7);
         var6.append(", headerColor=");
         var6.append(var4);
         var6.append(", backgroundColor=");
         var6.append(var1);
         var6.append(", thumbnailCornerRadius=");
         var6.append(var3);
         var6.append(", resolvingGradientStart=");
         var6.append(var5);
         var6.append(", resolvingGradientEnd=");
         var6.append(var2);
         var6.append(")");
         return var6.toString();
      }

      public object `$serializer` : f0<GiftEmbed.Resolving> {
         public open val descriptor: SerialDescriptor
            public open get() {
               return descriptor;
            }


         @JvmStatic
         fun {
            val var0: GiftEmbed.Resolving.$serializer = new GiftEmbed.Resolving.$serializer();
            INSTANCE = var0;
            val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.gift.GiftEmbed.Resolving", var0, 6);
            var1.l("headerText", false);
            var1.l("headerColor", false);
            var1.l("backgroundColor", false);
            var1.l("thumbnailCornerRadius", false);
            var1.l("resolvingGradientStart", false);
            var1.l("resolvingGradientEnd", false);
            descriptor = var1;
         }

         public open fun childSerializers(): Array<KSerializer<*>> {
            return new KSerializer[]{a2.a, m0.a, m0.a, m0.a, m0.a, m0.a};
         }

         public open fun deserialize(decoder: Decoder): com.discord.chat.bridge.gift.GiftEmbed.Resolving {
            r.h(var1, "decoder");
            val var10: SerialDescriptor = this.getDescriptor();
            val var11: c = var1.b(var10);
            var var4: Int;
            var var5: Int;
            var var6: Int;
            var var7: Int;
            val var8: Int;
            var var12: java.lang.String;
            var var14: Int;
            if (var11.p()) {
               var12 = var11.m(var10, 0);
               var8 = var11.i(var10, 1);
               var5 = var11.i(var10, 2);
               var14 = var11.i(var10, 3);
               var4 = var11.i(var10, 4);
               val var2: Int = var11.i(var10, 5);
               var7 = 63;
               var6 = var14;
               var14 = var2;
            } else {
               var12 = null;
               var var19: Boolean = true;
               var7 = 0;
               var6 = 0;
               var5 = 0;
               var4 = 0;
               var14 = 0;
               var var13: Int = 0;

               while (var19) {
                  val var9: Int = var11.o(var10);
                  switch (var9) {
                     case -1:
                        var19 = false;
                        break;
                     case 0:
                        var12 = var11.m(var10, 0);
                        var13 |= 1;
                        break;
                     case 1:
                        var14 = var11.i(var10, 1);
                        var13 |= 2;
                        break;
                     case 2:
                        var4 = var11.i(var10, 2);
                        var13 |= 4;
                        break;
                     case 3:
                        var6 = var11.i(var10, 3);
                        var13 |= 8;
                        break;
                     case 4:
                        var5 = var11.i(var10, 4);
                        var13 |= 16;
                        break;
                     case 5:
                        var7 = var11.i(var10, 5);
                        var13 |= 32;
                        break;
                     default:
                        throw new n(var9);
                  }
               }

               var8 = var14;
               var14 = var7;
               var4 = var5;
               var5 = var4;
               var7 = var13;
            }

            var11.c(var10);
            return new GiftEmbed.Resolving(var7, var12, var8, var5, var6, var4, var14, null);
         }

         public open fun serialize(encoder: Encoder, value: com.discord.chat.bridge.gift.GiftEmbed.Resolving) {
            r.h(var1, "encoder");
            r.h(var2, "value");
            val var3: SerialDescriptor = this.getDescriptor();
            val var4: CompositeEncoder = var1.b(var3);
            GiftEmbed.Resolving.write$Self(var2, var4, var3);
            var4.c(var3);
         }

         fun typeParametersSerializers(): Array<KSerializer<?>> {
            return a.a(this);
         }
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.chat.bridge.gift.GiftEmbed.Resolving> {
            return GiftEmbed.Resolving.$serializer.INSTANCE;
         }
      }
   }
}
