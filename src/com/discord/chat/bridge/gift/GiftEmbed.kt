package com.discord.chat.bridge.gift

import cl.f
import cl.n
import fl.b2
import fl.f0
import fl.g0
import fl.h
import fl.n0
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
            q.h(var1, "headerText");
            q.h(var5, "thumbnailUrl");
            q.h(var6, "titleText");
            q.h(var8, "subtitle");
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

         public operator fun component1(): String {
            return this.headerText;
         }

         public operator fun component10(): Int {
            return this.thumbnailBackgroundColor;
         }

         public operator fun component2(): Int {
            return this.headerColor;
         }

         public operator fun component3(): Int {
            return this.backgroundColor;
         }

         public operator fun component4(): Int {
            return this.thumbnailCornerRadius;
         }

         public operator fun component5(): String {
            return this.thumbnailUrl;
         }

         public operator fun component6(): String {
            return this.titleText;
         }

         public operator fun component7(): Int {
            return this.titleColor;
         }

         public operator fun component8(): String {
            return this.subtitle;
         }

         public operator fun component9(): Int {
            return this.subtitleColor;
         }

         public fun copy(
            headerText: String = var0.headerText,
            headerColor: Int = var0.headerColor,
            backgroundColor: Int = var0.backgroundColor,
            thumbnailCornerRadius: Int = var0.thumbnailCornerRadius,
            thumbnailUrl: String = var0.thumbnailUrl,
            titleText: String = var0.titleText,
            titleColor: Int = var0.titleColor,
            subtitle: String = var0.subtitle,
            subtitleColor: Int = var0.subtitleColor,
            thumbnailBackgroundColor: Int = var0.thumbnailBackgroundColor
         ): com.discord.chat.bridge.gift.GiftEmbed.Resolved.Invalid {
            q.h(var1, "headerText");
            q.h(var5, "thumbnailUrl");
            q.h(var6, "titleText");
            q.h(var8, "subtitle");
            return new GiftEmbed.Resolved.Invalid(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is GiftEmbed.Resolved.Invalid) {
               return false;
            } else {
               var1 = var1;
               if (!q.c(this.headerText, var1.headerText)) {
                  return false;
               } else if (this.headerColor != var1.headerColor) {
                  return false;
               } else if (this.backgroundColor != var1.backgroundColor) {
                  return false;
               } else if (this.thumbnailCornerRadius != var1.thumbnailCornerRadius) {
                  return false;
               } else if (!q.c(this.thumbnailUrl, var1.thumbnailUrl)) {
                  return false;
               } else if (!q.c(this.titleText, var1.titleText)) {
                  return false;
               } else if (this.titleColor != var1.titleColor) {
                  return false;
               } else if (!q.c(this.subtitle, var1.subtitle)) {
                  return false;
               } else if (this.subtitleColor != var1.subtitleColor) {
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
                                                                           (this.headerText.hashCode() * 31 + Integer.hashCode(this.headerColor)) * 31
                                                                              + Integer.hashCode(this.backgroundColor)
                                                                        )
                                                                        * 31
                                                                     + Integer.hashCode(this.thumbnailCornerRadius)
                                                               )
                                                               * 31
                                                            + this.thumbnailUrl.hashCode()
                                                      )
                                                      * 31
                                                   + this.titleText.hashCode()
                                             )
                                             * 31
                                          + Integer.hashCode(this.titleColor)
                                    )
                                    * 31
                                 + this.subtitle.hashCode()
                           )
                           * 31
                        + Integer.hashCode(this.subtitleColor)
                  )
                  * 31
               + Integer.hashCode(this.thumbnailBackgroundColor);
         }

         public override fun toString(): String {
            val var11: java.lang.String = this.headerText;
            val var3: Int = this.headerColor;
            val var5: Int = this.backgroundColor;
            val var4: Int = this.thumbnailCornerRadius;
            val var10: java.lang.String = this.thumbnailUrl;
            val var9: java.lang.String = this.titleText;
            val var1: Int = this.titleColor;
            val var8: java.lang.String = this.subtitle;
            val var2: Int = this.subtitleColor;
            val var6: Int = this.thumbnailBackgroundColor;
            val var7: StringBuilder = new StringBuilder();
            var7.append("Invalid(headerText=");
            var7.append(var11);
            var7.append(", headerColor=");
            var7.append(var3);
            var7.append(", backgroundColor=");
            var7.append(var5);
            var7.append(", thumbnailCornerRadius=");
            var7.append(var4);
            var7.append(", thumbnailUrl=");
            var7.append(var10);
            var7.append(", titleText=");
            var7.append(var9);
            var7.append(", titleColor=");
            var7.append(var1);
            var7.append(", subtitle=");
            var7.append(var8);
            var7.append(", subtitleColor=");
            var7.append(var2);
            var7.append(", thumbnailBackgroundColor=");
            var7.append(var6);
            var7.append(")");
            return var7.toString();
         }

         public object `$serializer` : g0 {
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
               return new KSerializer[]{b2.a, n0.a, n0.a, n0.a, b2.a, b2.a, n0.a, b2.a, n0.a, n0.a};
            }

            public open fun deserialize(decoder: Decoder): com.discord.chat.bridge.gift.GiftEmbed.Resolved.Invalid {
               q.h(var1, "decoder");
               val var16: SerialDescriptor = this.getDescriptor();
               val var17: c = var1.c(var16);
               val var11: Boolean = var17.y();
               var var2: Int = 0;
               var var3: Int;
               var var6: Int;
               var var7: Int;
               var var8: Int;
               val var9: Int;
               var var12: java.lang.String;
               var var13: java.lang.String;
               val var15: java.lang.String;
               val var18: java.lang.String;
               var var22: Int;
               var var24: Int;
               if (var11) {
                  var12 = var17.t(var16, 0);
                  var6 = var17.k(var16, 1);
                  var8 = var17.k(var16, 2);
                  var24 = var17.k(var16, 3);
                  var15 = var17.t(var16, 4);
                  var13 = var17.t(var16, 5);
                  var3 = var17.k(var16, 6);
                  var18 = var17.t(var16, 7);
                  var22 = var17.k(var16, 8);
                  var2 = var17.k(var16, 9);
                  var7 = 1023;
                  var9 = var24;
                  var24 = var22;
                  var22 = var2;
               } else {
                  var var14: java.lang.String = null;
                  var13 = null;
                  var12 = null;
                  var var19: java.lang.String = null;
                  var var28: Boolean = true;
                  var8 = 0;
                  var7 = 0;
                  var6 = 0;
                  var24 = 0;
                  var22 = 0;
                  var3 = 0;

                  while (var28) {
                     val var10: Int = var17.x(var16);
                     switch (var10) {
                        case -1:
                           var28 = false;
                           break;
                        case 0:
                           var14 = var17.t(var16, 0);
                           var2 |= 1;
                           break;
                        case 1:
                           var3 = var17.k(var16, 1);
                           var2 |= 2;
                           break;
                        case 2:
                           var22 = var17.k(var16, 2);
                           var2 |= 4;
                           break;
                        case 3:
                           var6 = var17.k(var16, 3);
                           var2 |= 8;
                           break;
                        case 4:
                           var19 = var17.t(var16, 4);
                           var2 |= 16;
                           break;
                        case 5:
                           var12 = var17.t(var16, 5);
                           var2 |= 32;
                           break;
                        case 6:
                           var7 = var17.k(var16, 6);
                           var2 |= 64;
                           break;
                        case 7:
                           var13 = var17.t(var16, 7);
                           var2 |= 128;
                           break;
                        case 8:
                           var24 = var17.k(var16, 8);
                           var2 |= 256;
                           break;
                        case 9:
                           var8 = var17.k(var16, 9);
                           var2 |= 512;
                           break;
                        default:
                           throw new n(var10);
                     }
                  }

                  var15 = var19;
                  var8 = var22;
                  var22 = var8;
                  var18 = var13;
                  var3 = var7;
                  var13 = var12;
                  var9 = var6;
                  var6 = var3;
                  var12 = var14;
                  var7 = var2;
               }

               var17.b(var16);
               return new GiftEmbed.Resolved.Invalid(var7, var12, var6, var8, var9, var15, var13, var3, var18, var24, var22, null);
            }

            public open fun serialize(encoder: Encoder, value: com.discord.chat.bridge.gift.GiftEmbed.Resolved.Invalid) {
               q.h(var1, "encoder");
               q.h(var2, "value");
               val var3: SerialDescriptor = this.getDescriptor();
               val var4: CompositeEncoder = var1.c(var3);
               GiftEmbed.Resolved.Invalid.write$Self$chat_release(var2, var4, var3);
               var4.b(var3);
            }

            fun typeParametersSerializers(): Array<KSerializer> {
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
            q.h(var1, "headerText");
            q.h(var18, "giftCode");
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

         public operator fun component1(): String {
            return this.headerText;
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
            return this.headerColor;
         }

         public operator fun component3(): Int {
            return this.backgroundColor;
         }

         public operator fun component4(): Int {
            return this.thumbnailCornerRadius;
         }

         public operator fun component5(): String? {
            return this.thumbnailUrl;
         }

         public operator fun component6(): String? {
            return this.titleText;
         }

         public operator fun component7(): Int {
            return this.titleColor;
         }

         public operator fun component8(): String? {
            return this.subtitle;
         }

         public operator fun component9(): Int {
            return this.subtitleColor;
         }

         public fun copy(
            headerText: String = var0.headerText,
            headerColor: Int = var0.headerColor,
            backgroundColor: Int = var0.backgroundColor,
            thumbnailCornerRadius: Int = var0.thumbnailCornerRadius,
            thumbnailUrl: String? = var0.thumbnailUrl,
            titleText: String? = var0.titleText,
            titleColor: Int = var0.titleColor,
            subtitle: String? = var0.subtitle,
            subtitleColor: Int = var0.subtitleColor,
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
            q.h(var1, "headerText");
            q.h(var18, "giftCode");
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
               if (!q.c(this.headerText, var1.headerText)) {
                  return false;
               } else if (this.headerColor != var1.headerColor) {
                  return false;
               } else if (this.backgroundColor != var1.backgroundColor) {
                  return false;
               } else if (this.thumbnailCornerRadius != var1.thumbnailCornerRadius) {
                  return false;
               } else if (!q.c(this.thumbnailUrl, var1.thumbnailUrl)) {
                  return false;
               } else if (!q.c(this.titleText, var1.titleText)) {
                  return false;
               } else if (this.titleColor != var1.titleColor) {
                  return false;
               } else if (!q.c(this.subtitle, var1.subtitle)) {
                  return false;
               } else if (this.subtitleColor != var1.subtitleColor) {
                  return false;
               } else if (!q.c(this.bodyText, var1.bodyText)) {
                  return false;
               } else if (this.bodyTextColor != var1.bodyTextColor) {
                  return false;
               } else if (!q.c(this.acceptLabelText, var1.acceptLabelText)) {
                  return false;
               } else if (this.acceptLabelColor != var1.acceptLabelColor) {
                  return false;
               } else if (this.acceptLabelBackgroundColor != var1.acceptLabelBackgroundColor) {
                  return false;
               } else if (!q.c(this.splashUrl, var1.splashUrl)) {
                  return false;
               } else if (java.lang.Float.compare(this.splashOpacity, var1.splashOpacity) != 0) {
                  return false;
               } else if (this.canBeAccepted != var1.canBeAccepted) {
                  return false;
               } else {
                  return q.c(this.giftCode, var1.giftCode);
               }
            }
         }

         public override fun hashCode(): Int {
            val var10: Int = this.headerText.hashCode();
            val var7: Int = Integer.hashCode(this.headerColor);
            val var9: Int = Integer.hashCode(this.backgroundColor);
            val var8: Int = Integer.hashCode(this.thumbnailCornerRadius);
            var var6: Int = 0;
            val var1: Int;
            if (this.thumbnailUrl == null) {
               var1 = 0;
            } else {
               var1 = this.thumbnailUrl.hashCode();
            }

            val var2: Int;
            if (this.titleText == null) {
               var2 = 0;
            } else {
               var2 = this.titleText.hashCode();
            }

            val var11: Int = Integer.hashCode(this.titleColor);
            val var3: Int;
            if (this.subtitle == null) {
               var3 = 0;
            } else {
               var3 = this.subtitle.hashCode();
            }

            val var12: Int = Integer.hashCode(this.subtitleColor);
            val var4: Int;
            if (this.bodyText == null) {
               var4 = 0;
            } else {
               var4 = this.bodyText.hashCode();
            }

            val var13: Int = Integer.hashCode(this.bodyTextColor);
            val var5: Int;
            if (this.acceptLabelText == null) {
               var5 = 0;
            } else {
               var5 = this.acceptLabelText.hashCode();
            }

            val var15: Int = Integer.hashCode(this.acceptLabelColor);
            val var14: Int = Integer.hashCode(this.acceptLabelBackgroundColor);
            if (this.splashUrl != null) {
               var6 = this.splashUrl.hashCode();
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
                                                                                                                                                            var10
                                                                                                                                                                  * 31
                                                                                                                                                               + var7
                                                                                                                                                         )
                                                                                                                                                         * 31
                                                                                                                                                      + var9
                                                                                                                                                )
                                                                                                                                                * 31
                                                                                                                                             + var8
                                                                                                                                       )
                                                                                                                                       * 31
                                                                                                                                    + var1
                                                                                                                              )
                                                                                                                              * 31
                                                                                                                           + var2
                                                                                                                     )
                                                                                                                     * 31
                                                                                                                  + var11
                                                                                                            )
                                                                                                            * 31
                                                                                                         + var3
                                                                                                   )
                                                                                                   * 31
                                                                                                + var12
                                                                                          )
                                                                                          * 31
                                                                                       + var4
                                                                                 )
                                                                                 * 31
                                                                              + var13
                                                                        )
                                                                        * 31
                                                                     + var5
                                                               )
                                                               * 31
                                                            + var15
                                                      )
                                                      * 31
                                                   + var14
                                             )
                                             * 31
                                          + var6
                                    )
                                    * 31
                                 + java.lang.Float.hashCode(this.splashOpacity)
                           )
                           * 31
                        + java.lang.Boolean.hashCode(this.canBeAccepted)
                  )
                  * 31
               + this.giftCode.hashCode();
         }

         public override fun toString(): String {
            val var12: java.lang.String = this.headerText;
            val var9: Int = this.headerColor;
            val var3: Int = this.backgroundColor;
            val var4: Int = this.thumbnailCornerRadius;
            val var13: java.lang.String = this.thumbnailUrl;
            val var15: java.lang.String = this.titleText;
            val var7: Int = this.titleColor;
            val var11: java.lang.String = this.subtitle;
            val var6: Int = this.subtitleColor;
            val var16: java.lang.String = this.bodyText;
            val var5: Int = this.bodyTextColor;
            val var18: java.lang.String = this.acceptLabelText;
            val var2: Int = this.acceptLabelColor;
            val var8: Int = this.acceptLabelBackgroundColor;
            val var14: java.lang.String = this.splashUrl;
            val var1: Float = this.splashOpacity;
            val var10: Boolean = this.canBeAccepted;
            val var19: java.lang.String = this.giftCode;
            val var17: StringBuilder = new StringBuilder();
            var17.append("Valid(headerText=");
            var17.append(var12);
            var17.append(", headerColor=");
            var17.append(var9);
            var17.append(", backgroundColor=");
            var17.append(var3);
            var17.append(", thumbnailCornerRadius=");
            var17.append(var4);
            var17.append(", thumbnailUrl=");
            var17.append(var13);
            var17.append(", titleText=");
            var17.append(var15);
            var17.append(", titleColor=");
            var17.append(var7);
            var17.append(", subtitle=");
            var17.append(var11);
            var17.append(", subtitleColor=");
            var17.append(var6);
            var17.append(", bodyText=");
            var17.append(var16);
            var17.append(", bodyTextColor=");
            var17.append(var5);
            var17.append(", acceptLabelText=");
            var17.append(var18);
            var17.append(", acceptLabelColor=");
            var17.append(var2);
            var17.append(", acceptLabelBackgroundColor=");
            var17.append(var8);
            var17.append(", splashUrl=");
            var17.append(var14);
            var17.append(", splashOpacity=");
            var17.append(var1);
            var17.append(", canBeAccepted=");
            var17.append(var10);
            var17.append(", giftCode=");
            var17.append(var19);
            var17.append(")");
            return var17.toString();
         }

         public object `$serializer` : g0 {
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
               val var2: b2 = b2.a;
               val var1: n0 = n0.a;
               return new KSerializer[]{
                  b2.a,
                  n0.a,
                  n0.a,
                  n0.a,
                  dl.a.u(b2.a),
                  dl.a.u(var2),
                  var1,
                  dl.a.u(var2),
                  var1,
                  dl.a.u(var2),
                  var1,
                  dl.a.u(var2),
                  var1,
                  var1,
                  dl.a.u(var2),
                  f0.a,
                  h.a,
                  var2
               };
            }

            public open fun deserialize(decoder: Decoder): com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid {
               q.h(var1, "decoder");
               val var28: SerialDescriptor = this.getDescriptor();
               val var29: c = var1.c(var28);
               val var17: Boolean = var29.y();
               var var11: Int = 8;
               var var2: Float;
               var var7: Int;
               var var8: Int;
               var var9: Int;
               var var10: Int;
               var var12: Int;
               var var13: Int;
               val var14: Int;
               val var15: Int;
               var var16: Int;
               var var20: java.lang.String;
               var var21: java.lang.String;
               var var22: java.lang.String;
               var var23: java.lang.String;
               var var24: java.lang.String;
               val var25: java.lang.String;
               val var26: java.lang.String;
               val var27: java.lang.String;
               if (var17) {
                  var21 = var29.t(var28, 0);
                  var7 = var29.k(var28, 1);
                  var9 = var29.k(var28, 2);
                  var11 = var29.k(var28, 3);
                  val var30: b2 = b2.a;
                  var25 = var29.v(var28, 4, b2.a, null) as java.lang.String;
                  var22 = var29.v(var28, 5, var30, null) as java.lang.String;
                  var12 = var29.k(var28, 6);
                  var24 = var29.v(var28, 7, var30, null) as java.lang.String;
                  val var4: Int = var29.k(var28, 8);
                  var20 = var29.v(var28, 9, var30, null) as java.lang.String;
                  val var6: Int = var29.k(var28, 10);
                  val var19: java.lang.String = var29.v(var28, 11, var30, null) as java.lang.String;
                  val var3: Int = var29.k(var28, 12);
                  var16 = var29.k(var28, 13);
                  val var18: java.lang.String = var29.v(var28, 14, var30, null) as java.lang.String;
                  var2 = var29.G(var28, 15);
                  val var5: Byte = var29.s(var28, 16);
                  val var31: java.lang.String = var29.t(var28, 17);
                  var13 = 262143;
                  var15 = var4;
                  var10 = var6;
                  var23 = var19;
                  var8 = var3;
                  var27 = var18;
                  var14 = var5;
                  var26 = var31;
               } else {
                  var var43: Byte = 17;
                  var var44: Boolean = true;
                  var var47: java.lang.String = null;
                  var24 = null;
                  var22 = null;
                  var21 = null;
                  var20 = null;
                  var var32: java.lang.String = null;
                  var23 = null;
                  var var33: Int = 0;
                  var var36: Int = 0;
                  var var35: Int = 0;
                  var var34: Int = 0;
                  var8 = 0;
                  var7 = 0;
                  var13 = 0;
                  var12 = 0;
                  var2 = 0.0F;
                  var9 = 0;
                  var10 = 0;
                  var var46: java.lang.String = null;

                  while (var44) {
                     label46: {
                        label45: {
                           var16 = var29.x(var28);
                           switch (var16) {
                              case -1:
                                 var44 = false;
                                 var11 = 8;
                                 continue;
                              case 0:
                                 var32 = var29.t(var28, 0);
                                 var33 |= 1;
                                 break;
                              case 1:
                                 var35 = var29.k(var28, 1);
                                 var33 |= 2;
                                 break;
                              case 2:
                                 var36 = var29.k(var28, 2);
                                 var33 |= 4;
                                 break;
                              case 3:
                                 var34 = var29.k(var28, 3);
                                 var33 |= 8;
                                 break;
                              case 4:
                                 var46 = var29.v(var28, 4, b2.a, var46) as java.lang.String;
                                 var33 |= 16;
                                 break;
                              case 5:
                                 var47 = var29.v(var28, 5, b2.a, var47) as java.lang.String;
                                 var33 |= 32;
                                 break;
                              case 6:
                                 var13 = var29.k(var28, 6);
                                 var33 |= 64;
                                 break label45;
                              case 7:
                                 var24 = var29.v(var28, 7, b2.a, var24) as java.lang.String;
                                 var33 |= 128;
                                 break label45;
                              case 8:
                                 var9 = var29.k(var28, var11);
                                 var33 |= 256;
                                 break label46;
                              case 9:
                                 var21 = var29.v(var28, 9, b2.a, var21) as java.lang.String;
                                 var33 |= 512;
                                 break label46;
                              case 10:
                                 var7 = var29.k(var28, 10);
                                 var33 |= 1024;
                                 break label46;
                              case 11:
                                 var20 = var29.v(var28, 11, b2.a, var20) as java.lang.String;
                                 var33 |= 2048;
                                 break label46;
                              case 12:
                                 var8 = var29.k(var28, 12);
                                 var33 |= 4096;
                                 break label46;
                              case 13:
                                 var10 = var29.k(var28, 13);
                                 var33 |= 8192;
                                 break label46;
                              case 14:
                                 var22 = var29.v(var28, 14, b2.a, var22) as java.lang.String;
                                 var33 |= 16384;
                                 break label46;
                              case 15:
                                 var2 = var29.G(var28, 15);
                                 var33 |= 32768;
                                 break label46;
                              case 16:
                                 var12 = var29.s(var28, 16);
                                 var33 |= 65536;
                                 continue;
                              case 17:
                                 var23 = var29.t(var28, var43);
                                 var33 |= 131072;
                                 continue;
                              default:
                                 throw new n(var16);
                           }

                           var11 = 8;
                           break label46;
                        }

                        var11 = 8;
                        var43 = 17;
                        continue;
                     }

                     var43 = 17;
                  }

                  var26 = var23;
                  var14 = var12;
                  var27 = var22;
                  var16 = var10;
                  var23 = var20;
                  var10 = var7;
                  var20 = var21;
                  var15 = var9;
                  var12 = var13;
                  var22 = var47;
                  var25 = var46;
                  var11 = var34;
                  var9 = var36;
                  var7 = var35;
                  var21 = var32;
                  var13 = var33;
               }

               var29.b(var28);
               return new GiftEmbed.Resolved.Valid(
                  var13,
                  var21,
                  var7,
                  var9,
                  var11,
                  var25,
                  var22,
                  var12,
                  var24,
                  var15,
                  var20,
                  var10,
                  var23,
                  var8,
                  var16,
                  var27,
                  var2,
                  (boolean)var14,
                  var26,
                  null
               );
            }

            public open fun serialize(encoder: Encoder, value: com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid) {
               q.h(var1, "encoder");
               q.h(var2, "value");
               val var3: SerialDescriptor = this.getDescriptor();
               val var4: CompositeEncoder = var1.c(var3);
               GiftEmbed.Resolved.Valid.write$Self$chat_release(var2, var4, var3);
               var4.b(var3);
            }

            fun typeParametersSerializers(): Array<KSerializer> {
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
         q.h(var1, "headerText");
         super();
         this.headerText = var1;
         this.headerColor = var2;
         this.backgroundColor = var3;
         this.thumbnailCornerRadius = var4;
         this.resolvingGradientStart = var5;
         this.resolvingGradientEnd = var6;
      }

      public operator fun component1(): String {
         return this.headerText;
      }

      public operator fun component2(): Int {
         return this.headerColor;
      }

      public operator fun component3(): Int {
         return this.backgroundColor;
      }

      public operator fun component4(): Int {
         return this.thumbnailCornerRadius;
      }

      public operator fun component5(): Int {
         return this.resolvingGradientStart;
      }

      public operator fun component6(): Int {
         return this.resolvingGradientEnd;
      }

      public fun copy(
         headerText: String = var0.headerText,
         headerColor: Int = var0.headerColor,
         backgroundColor: Int = var0.backgroundColor,
         thumbnailCornerRadius: Int = var0.thumbnailCornerRadius,
         resolvingGradientStart: Int = var0.resolvingGradientStart,
         resolvingGradientEnd: Int = var0.resolvingGradientEnd
      ): com.discord.chat.bridge.gift.GiftEmbed.Resolving {
         q.h(var1, "headerText");
         return new GiftEmbed.Resolving(var1, var2, var3, var4, var5, var6);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is GiftEmbed.Resolving) {
            return false;
         } else {
            var1 = var1;
            if (!q.c(this.headerText, var1.headerText)) {
               return false;
            } else if (this.headerColor != var1.headerColor) {
               return false;
            } else if (this.backgroundColor != var1.backgroundColor) {
               return false;
            } else if (this.thumbnailCornerRadius != var1.thumbnailCornerRadius) {
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
                           ((this.headerText.hashCode() * 31 + Integer.hashCode(this.headerColor)) * 31 + Integer.hashCode(this.backgroundColor)) * 31
                              + Integer.hashCode(this.thumbnailCornerRadius)
                        )
                        * 31
                     + Integer.hashCode(this.resolvingGradientStart)
               )
               * 31
            + Integer.hashCode(this.resolvingGradientEnd);
      }

      public override fun toString(): String {
         val var6: java.lang.String = this.headerText;
         val var2: Int = this.headerColor;
         val var1: Int = this.backgroundColor;
         val var4: Int = this.thumbnailCornerRadius;
         val var3: Int = this.resolvingGradientStart;
         val var5: Int = this.resolvingGradientEnd;
         val var7: StringBuilder = new StringBuilder();
         var7.append("Resolving(headerText=");
         var7.append(var6);
         var7.append(", headerColor=");
         var7.append(var2);
         var7.append(", backgroundColor=");
         var7.append(var1);
         var7.append(", thumbnailCornerRadius=");
         var7.append(var4);
         var7.append(", resolvingGradientStart=");
         var7.append(var3);
         var7.append(", resolvingGradientEnd=");
         var7.append(var5);
         var7.append(")");
         return var7.toString();
      }

      public object `$serializer` : g0 {
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
            return new KSerializer[]{b2.a, n0.a, n0.a, n0.a, n0.a, n0.a};
         }

         public open fun deserialize(decoder: Decoder): com.discord.chat.bridge.gift.GiftEmbed.Resolving {
            q.h(var1, "decoder");
            val var10: SerialDescriptor = this.getDescriptor();
            val var11: c = var1.c(var10);
            var var2: Int;
            var var3: Int;
            var var5: Int;
            var var6: Int;
            var var7: Int;
            var var9: Int;
            var var12: java.lang.String;
            if (var11.y()) {
               var12 = var11.t(var10, 0);
               var5 = var11.k(var10, 1);
               var6 = var11.k(var10, 2);
               val var4: Int = var11.k(var10, 3);
               var3 = var11.k(var10, 4);
               var2 = var11.k(var10, 5);
               var7 = 63;
               var9 = var4;
            } else {
               var12 = null;
               var var8: Boolean = true;
               var7 = 0;
               var6 = 0;
               var5 = 0;
               var var15: Int = 0;
               var3 = 0;
               var2 = 0;

               while (var8) {
                  var9 = var11.x(var10);
                  switch (var9) {
                     case -1:
                        var8 = false;
                        break;
                     case 0:
                        var12 = var11.t(var10, 0);
                        var2 |= 1;
                        break;
                     case 1:
                        var3 = var11.k(var10, 1);
                        var2 |= 2;
                        break;
                     case 2:
                        var15 = var11.k(var10, 2);
                        var2 |= 4;
                        break;
                     case 3:
                        var6 = var11.k(var10, 3);
                        var2 |= 8;
                        break;
                     case 4:
                        var5 = var11.k(var10, 4);
                        var2 |= 16;
                        break;
                     case 5:
                        var7 = var11.k(var10, 5);
                        var2 |= 32;
                        break;
                     default:
                        throw new n(var9);
                  }
               }

               var5 = var3;
               var2 = var7;
               var3 = var5;
               var9 = var6;
               var6 = var15;
               var7 = var2;
            }

            var11.b(var10);
            return new GiftEmbed.Resolving(var7, var12, var5, var6, var9, var3, var2, null);
         }

         public open fun serialize(encoder: Encoder, value: com.discord.chat.bridge.gift.GiftEmbed.Resolving) {
            q.h(var1, "encoder");
            q.h(var2, "value");
            val var3: SerialDescriptor = this.getDescriptor();
            val var4: CompositeEncoder = var1.c(var3);
            GiftEmbed.Resolving.write$Self$chat_release(var2, var4, var3);
            var4.b(var3);
         }

         fun typeParametersSerializers(): Array<KSerializer> {
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
