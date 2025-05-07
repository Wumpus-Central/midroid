package com.discord.chat.bridge.referral

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer
import fa.f
import fa.n
import ga.a
import ia.C0
import ia.G
import ia.N
import ia.h
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f(with = ReferralEmbedSerializer::class)
public sealed interface ReferralEmbed {
   public val backgroundColor: Int
   public val headerColor: Int
   public val headerLogoUrl: String?
   public val headerText: String
   public val thumbnailCornerRadius: Int

   public companion object {
      public fun serializer(): KSerializer<ReferralEmbed> {
         return ReferralEmbedSerializer.INSTANCE;
      }
   }

   @f
   public data class Resolved(headerText: String,
         headerColor: Int,
         backgroundColor: Int,
         thumbnailCornerRadius: Int,
         headerLogoUrl: String?,
         headerUrl: String? = null,
         thumbnailUrl: String? = null,
         titleText: String? = null,
         titleColor: Int? = null,
         bodyText: String? = null,
         structuredBodyText: AnnotatedStructurableText? = null,
         bodyTextColor: Int? = null,
         linkButtonLabel: AnnotatedStructurableText? = null,
         linkButtonColor: Int? = null,
         subText: String? = null,
         subTextColor: Int? = ...,
         footerText: String? = ...,
         footerTextColor: Int? = ...,
         acceptLabelText: String? = ...,
         acceptLabelColor: Int? = ...,
         acceptLabelIconUrl: String? = ...,
         canBeAccepted: Boolean? = null
      ) :
      ReferralEmbed {
      public final val acceptLabelColor: Int?
      public final val acceptLabelIconUrl: String?
      public final val acceptLabelText: String?
      public open val backgroundColor: Int
      public final val bodyText: String?
      public final val bodyTextColor: Int?
      public final val canBeAccepted: Boolean?
      public final val footerText: String?
      public final val footerTextColor: Int?
      public open val headerColor: Int
      public open val headerLogoUrl: String?
      public open val headerText: String
      public final val headerUrl: String?
      public final val linkButtonColor: Int?
      public final val linkButtonLabel: AnnotatedStructurableText?
      public final val structuredBodyText: AnnotatedStructurableText?
      public final val subText: String?
      public final val subTextColor: Int?
      public open val thumbnailCornerRadius: Int
      public final val thumbnailUrl: String?
      public final val titleColor: Int?
      public final val titleText: String?

      init {
         q.h(var1, "headerText");
         super();
         this.headerText = var1;
         this.headerColor = var2;
         this.backgroundColor = var3;
         this.thumbnailCornerRadius = var4;
         this.headerLogoUrl = var5;
         this.headerUrl = var6;
         this.thumbnailUrl = var7;
         this.titleText = var8;
         this.titleColor = var9;
         this.bodyText = var10;
         this.structuredBodyText = var11;
         this.bodyTextColor = var12;
         this.linkButtonLabel = var13;
         this.linkButtonColor = var14;
         this.subText = var15;
         this.subTextColor = var16;
         this.footerText = var17;
         this.footerTextColor = var18;
         this.acceptLabelText = var19;
         this.acceptLabelColor = var20;
         this.acceptLabelIconUrl = var21;
         this.canBeAccepted = var22;
      }

      public operator fun component1(): String {
         return this.headerText;
      }

      public operator fun component10(): String? {
         return this.bodyText;
      }

      public operator fun component11(): AnnotatedStructurableText? {
         return this.structuredBodyText;
      }

      public operator fun component12(): Int? {
         return this.bodyTextColor;
      }

      public operator fun component13(): AnnotatedStructurableText? {
         return this.linkButtonLabel;
      }

      public operator fun component14(): Int? {
         return this.linkButtonColor;
      }

      public operator fun component15(): String? {
         return this.subText;
      }

      public operator fun component16(): Int? {
         return this.subTextColor;
      }

      public operator fun component17(): String? {
         return this.footerText;
      }

      public operator fun component18(): Int? {
         return this.footerTextColor;
      }

      public operator fun component19(): String? {
         return this.acceptLabelText;
      }

      public operator fun component2(): Int {
         return this.headerColor;
      }

      public operator fun component20(): Int? {
         return this.acceptLabelColor;
      }

      public operator fun component21(): String? {
         return this.acceptLabelIconUrl;
      }

      public operator fun component22(): Boolean? {
         return this.canBeAccepted;
      }

      public operator fun component3(): Int {
         return this.backgroundColor;
      }

      public operator fun component4(): Int {
         return this.thumbnailCornerRadius;
      }

      public operator fun component5(): String? {
         return this.headerLogoUrl;
      }

      public operator fun component6(): String? {
         return this.headerUrl;
      }

      public operator fun component7(): String? {
         return this.thumbnailUrl;
      }

      public operator fun component8(): String? {
         return this.titleText;
      }

      public operator fun component9(): Int? {
         return this.titleColor;
      }

      public fun copy(
         headerText: String = var0.headerText,
         headerColor: Int = var0.headerColor,
         backgroundColor: Int = var0.backgroundColor,
         thumbnailCornerRadius: Int = var0.thumbnailCornerRadius,
         headerLogoUrl: String? = var0.headerLogoUrl,
         headerUrl: String? = var0.headerUrl,
         thumbnailUrl: String? = var0.thumbnailUrl,
         titleText: String? = var0.titleText,
         titleColor: Int? = var0.titleColor,
         bodyText: String? = var0.bodyText,
         structuredBodyText: AnnotatedStructurableText? = var0.structuredBodyText,
         bodyTextColor: Int? = var0.bodyTextColor,
         linkButtonLabel: AnnotatedStructurableText? = var0.linkButtonLabel,
         linkButtonColor: Int? = var0.linkButtonColor,
         subText: String? = var0.subText,
         subTextColor: Int? = var0.subTextColor,
         footerText: String? = var0.footerText,
         footerTextColor: Int? = var0.footerTextColor,
         acceptLabelText: String? = var0.acceptLabelText,
         acceptLabelColor: Int? = var0.acceptLabelColor,
         acceptLabelIconUrl: String? = var0.acceptLabelIconUrl,
         canBeAccepted: Boolean? = var0.canBeAccepted
      ): com.discord.chat.bridge.referral.ReferralEmbed.Resolved {
         q.h(var1, "headerText");
         return new ReferralEmbed.Resolved(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22
         );
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ReferralEmbed.Resolved) {
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
            } else if (!q.c(this.headerLogoUrl, var1.headerLogoUrl)) {
               return false;
            } else if (!q.c(this.headerUrl, var1.headerUrl)) {
               return false;
            } else if (!q.c(this.thumbnailUrl, var1.thumbnailUrl)) {
               return false;
            } else if (!q.c(this.titleText, var1.titleText)) {
               return false;
            } else if (!q.c(this.titleColor, var1.titleColor)) {
               return false;
            } else if (!q.c(this.bodyText, var1.bodyText)) {
               return false;
            } else if (!q.c(this.structuredBodyText, var1.structuredBodyText)) {
               return false;
            } else if (!q.c(this.bodyTextColor, var1.bodyTextColor)) {
               return false;
            } else if (!q.c(this.linkButtonLabel, var1.linkButtonLabel)) {
               return false;
            } else if (!q.c(this.linkButtonColor, var1.linkButtonColor)) {
               return false;
            } else if (!q.c(this.subText, var1.subText)) {
               return false;
            } else if (!q.c(this.subTextColor, var1.subTextColor)) {
               return false;
            } else if (!q.c(this.footerText, var1.footerText)) {
               return false;
            } else if (!q.c(this.footerTextColor, var1.footerTextColor)) {
               return false;
            } else if (!q.c(this.acceptLabelText, var1.acceptLabelText)) {
               return false;
            } else if (!q.c(this.acceptLabelColor, var1.acceptLabelColor)) {
               return false;
            } else if (!q.c(this.acceptLabelIconUrl, var1.acceptLabelIconUrl)) {
               return false;
            } else {
               return q.c(this.canBeAccepted, var1.canBeAccepted);
            }
         }
      }

      public override fun hashCode(): Int {
         val var19: Int = this.headerText.hashCode();
         val var21: Int = Integer.hashCode(this.headerColor);
         val var20: Int = Integer.hashCode(this.backgroundColor);
         val var22: Int = Integer.hashCode(this.thumbnailCornerRadius);
         var var18: Int = 0;
         val var1: Int;
         if (this.headerLogoUrl == null) {
            var1 = 0;
         } else {
            var1 = this.headerLogoUrl.hashCode();
         }

         val var2: Int;
         if (this.headerUrl == null) {
            var2 = 0;
         } else {
            var2 = this.headerUrl.hashCode();
         }

         val var3: Int;
         if (this.thumbnailUrl == null) {
            var3 = 0;
         } else {
            var3 = this.thumbnailUrl.hashCode();
         }

         val var4: Int;
         if (this.titleText == null) {
            var4 = 0;
         } else {
            var4 = this.titleText.hashCode();
         }

         val var5: Int;
         if (this.titleColor == null) {
            var5 = 0;
         } else {
            var5 = this.titleColor.hashCode();
         }

         val var6: Int;
         if (this.bodyText == null) {
            var6 = 0;
         } else {
            var6 = this.bodyText.hashCode();
         }

         val var7: Int;
         if (this.structuredBodyText == null) {
            var7 = 0;
         } else {
            var7 = this.structuredBodyText.hashCode();
         }

         val var8: Int;
         if (this.bodyTextColor == null) {
            var8 = 0;
         } else {
            var8 = this.bodyTextColor.hashCode();
         }

         val var9: Int;
         if (this.linkButtonLabel == null) {
            var9 = 0;
         } else {
            var9 = this.linkButtonLabel.hashCode();
         }

         val var10: Int;
         if (this.linkButtonColor == null) {
            var10 = 0;
         } else {
            var10 = this.linkButtonColor.hashCode();
         }

         val var11: Int;
         if (this.subText == null) {
            var11 = 0;
         } else {
            var11 = this.subText.hashCode();
         }

         val var12: Int;
         if (this.subTextColor == null) {
            var12 = 0;
         } else {
            var12 = this.subTextColor.hashCode();
         }

         val var13: Int;
         if (this.footerText == null) {
            var13 = 0;
         } else {
            var13 = this.footerText.hashCode();
         }

         val var14: Int;
         if (this.footerTextColor == null) {
            var14 = 0;
         } else {
            var14 = this.footerTextColor.hashCode();
         }

         val var15: Int;
         if (this.acceptLabelText == null) {
            var15 = 0;
         } else {
            var15 = this.acceptLabelText.hashCode();
         }

         val var16: Int;
         if (this.acceptLabelColor == null) {
            var16 = 0;
         } else {
            var16 = this.acceptLabelColor.hashCode();
         }

         val var17: Int;
         if (this.acceptLabelIconUrl == null) {
            var17 = 0;
         } else {
            var17 = this.acceptLabelIconUrl.hashCode();
         }

         if (this.canBeAccepted != null) {
            var18 = this.canBeAccepted.hashCode();
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
                                                                                                                                                                           (
                                                                                                                                                                                    (
                                                                                                                                                                                             var19
                                                                                                                                                                                                   * 31
                                                                                                                                                                                                + var21
                                                                                                                                                                                          )
                                                                                                                                                                                          * 31
                                                                                                                                                                                       + var20
                                                                                                                                                                                 )
                                                                                                                                                                                 * 31
                                                                                                                                                                              + var22
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
                                                                                             + var9
                                                                                       )
                                                                                       * 31
                                                                                    + var10
                                                                              )
                                                                              * 31
                                                                           + var11
                                                                     )
                                                                     * 31
                                                                  + var12
                                                            )
                                                            * 31
                                                         + var13
                                                   )
                                                   * 31
                                                + var14
                                          )
                                          * 31
                                       + var15
                                 )
                                 * 31
                              + var16
                        )
                        * 31
                     + var17
               )
               * 31
            + var18;
      }

      public override fun toString(): String {
         val var10: java.lang.String = this.headerText;
         val var3: Int = this.headerColor;
         val var2: Int = this.backgroundColor;
         val var1: Int = this.thumbnailCornerRadius;
         val var23: java.lang.String = this.headerLogoUrl;
         val var6: java.lang.String = this.headerUrl;
         val var4: java.lang.String = this.thumbnailUrl;
         val var19: java.lang.String = this.titleText;
         val var16: Int = this.titleColor;
         val var17: java.lang.String = this.bodyText;
         val var12: AnnotatedStructurableText = this.structuredBodyText;
         val var7: Int = this.bodyTextColor;
         val var5: AnnotatedStructurableText = this.linkButtonLabel;
         val var18: Int = this.linkButtonColor;
         val var11: java.lang.String = this.subText;
         val var14: Int = this.subTextColor;
         val var8: java.lang.String = this.footerText;
         val var15: Int = this.footerTextColor;
         val var21: java.lang.String = this.acceptLabelText;
         val var22: Int = this.acceptLabelColor;
         val var20: java.lang.String = this.acceptLabelIconUrl;
         val var13: java.lang.Boolean = this.canBeAccepted;
         val var9: StringBuilder = new StringBuilder();
         var9.append("Resolved(headerText=");
         var9.append(var10);
         var9.append(", headerColor=");
         var9.append(var3);
         var9.append(", backgroundColor=");
         var9.append(var2);
         var9.append(", thumbnailCornerRadius=");
         var9.append(var1);
         var9.append(", headerLogoUrl=");
         var9.append(var23);
         var9.append(", headerUrl=");
         var9.append(var6);
         var9.append(", thumbnailUrl=");
         var9.append(var4);
         var9.append(", titleText=");
         var9.append(var19);
         var9.append(", titleColor=");
         var9.append(var16);
         var9.append(", bodyText=");
         var9.append(var17);
         var9.append(", structuredBodyText=");
         var9.append(var12);
         var9.append(", bodyTextColor=");
         var9.append(var7);
         var9.append(", linkButtonLabel=");
         var9.append(var5);
         var9.append(", linkButtonColor=");
         var9.append(var18);
         var9.append(", subText=");
         var9.append(var11);
         var9.append(", subTextColor=");
         var9.append(var14);
         var9.append(", footerText=");
         var9.append(var8);
         var9.append(", footerTextColor=");
         var9.append(var15);
         var9.append(", acceptLabelText=");
         var9.append(var21);
         var9.append(", acceptLabelColor=");
         var9.append(var22);
         var9.append(", acceptLabelIconUrl=");
         var9.append(var20);
         var9.append(", canBeAccepted=");
         var9.append(var13);
         var9.append(")");
         return var9.toString();
      }

      public object `$serializer` : G {
         public open val descriptor: SerialDescriptor
            public open get() {
               return descriptor;
            }


         @JvmStatic
         fun {
            val var0: ReferralEmbed.Resolved.$serializer = new ReferralEmbed.Resolved.$serializer();
            INSTANCE = var0;
            val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.referral.ReferralEmbed.Resolved", var0, 22);
            var1.l("headerText", false);
            var1.l("headerColor", false);
            var1.l("backgroundColor", false);
            var1.l("thumbnailCornerRadius", false);
            var1.l("headerLogoUrl", false);
            var1.l("headerUrl", true);
            var1.l("thumbnailUrl", true);
            var1.l("titleText", true);
            var1.l("titleColor", true);
            var1.l("bodyText", true);
            var1.l("structuredBodyText", true);
            var1.l("bodyTextColor", true);
            var1.l("linkButtonLabel", true);
            var1.l("linkButtonColor", true);
            var1.l("subText", true);
            var1.l("subTextColor", true);
            var1.l("footerText", true);
            var1.l("footerTextColor", true);
            var1.l("acceptLabelText", true);
            var1.l("acceptLabelColor", true);
            var1.l("acceptLabelIconUrl", true);
            var1.l("canBeAccepted", true);
            descriptor = var1;
         }

         public open fun childSerializers(): Array<KSerializer<*>> {
            val var3: C0 = C0.a;
            val var6: N = N.a;
            val var1: KSerializer = a.u(C0.a);
            val var7: KSerializer = a.u(var3);
            val var2: KSerializer = a.u(var3);
            val var5: KSerializer = a.u(var3);
            val var4: KSerializer = a.u(var6);
            val var9: KSerializer = a.u(var3);
            val var8: AnnotatedStructurableTextSerializer = AnnotatedStructurableTextSerializer.INSTANCE;
            return new KSerializer[]{
               var3,
               var6,
               var6,
               var6,
               var1,
               var7,
               var2,
               var5,
               var4,
               var9,
               a.u(AnnotatedStructurableTextSerializer.INSTANCE),
               a.u(var6),
               a.u(var8),
               a.u(var6),
               a.u(var3),
               a.u(var6),
               a.u(var3),
               a.u(var6),
               a.u(var3),
               a.u(var6),
               a.u(var3),
               a.u(h.a)
            };
         }

         public open fun deserialize(decoder: Decoder): com.discord.chat.bridge.referral.ReferralEmbed.Resolved {
            q.h(var1, "decoder");
            val var32: SerialDescriptor = this.getDescriptor();
            val var33: c = var1.c(var32);
            val var8: Boolean = var33.y();
            var var3: Int = 0;
            var var17: Int = null;
            var var2: Int;
            var var4: Int;
            var var5: Int;
            var var16: Any;
            var var18: Any;
            var var19: Any;
            var var20: Any;
            var var21: Any;
            var var22: Int;
            var var24: Any;
            var var25: Any;
            var var26: Any;
            val var27: Any;
            val var28: Any;
            val var29: Any;
            val var35: java.lang.Boolean;
            var var40: Any;
            var var42: Any;
            var var44: java.lang.String;
            var var48: Any;
            var var60: Any;
            if (var8) {
               var19 = var33.t(var32, 0);
               var4 = var33.k(var32, 1);
               var5 = var33.k(var32, 2);
               var2 = var33.k(var32, 3);
               val var34: C0 = C0.a;
               var20 = var33.v(var32, 4, C0.a, null) as java.lang.String;
               var21 = var33.v(var32, 5, var34, null) as java.lang.String;
               var17 = var33.v(var32, 6, var34, null) as java.lang.String;
               var27 = var33.v(var32, 7, var34, null) as java.lang.String;
               var40 = N.a;
               var48 = var33.v(var32, 8, N.a, null) as Int;
               var28 = var33.v(var32, 9, var34, null) as java.lang.String;
               var42 = AnnotatedStructurableTextSerializer.INSTANCE;
               val var15: AnnotatedStructurableText = var33.v(var32, 10, AnnotatedStructurableTextSerializer.INSTANCE, null) as AnnotatedStructurableText;
               var26 = var33.v(var32, 11, (DeserializationStrategy)var40, null) as Int;
               var25 = var33.v(var32, 12, (DeserializationStrategy)var42, null) as AnnotatedStructurableText;
               val var11: Int = var33.v(var32, 13, (DeserializationStrategy)var40, null) as Int;
               var60 = var33.v(var32, 14, var34, null) as java.lang.String;
               var22 = var33.v(var32, 15, (DeserializationStrategy)var40, null) as Int;
               var16 = var33.v(var32, 16, var34, null) as java.lang.String;
               val var13: Int = var33.v(var32, 17, (DeserializationStrategy)var40, null) as Int;
               val var12: java.lang.String = var33.v(var32, 18, var34, null) as java.lang.String;
               var40 = var33.v(var32, 19, (DeserializationStrategy)var40, null) as Int;
               var42 = var33.v(var32, 20, var34, null) as java.lang.String;
               var35 = var33.v(var32, 21, h.a, null) as java.lang.Boolean;
               var3 = 4194303;
               var18 = var48;
               var48 = var15;
               var24 = var11;
               var44 = (java.lang.String)var60;
               var29 = var13;
               var60 = var12;
            } else {
               var var7: Boolean = true;
               var var6: Int = 0;
               var5 = 0;
               var4 = 0;
               var48 = null;
               var60 = null;
               var22 = null;
               var21 = null;
               var26 = null;
               var19 = null;
               var18 = null;
               var16 = null;
               var25 = null;
               var24 = null;
               var40 = null;
               var var36: Any = null;
               var var50: Any = null;
               var20 = null;
               var var47: Any = null;
               var var46: Any = null;
               var44 = null;
               var42 = null;

               while (var7) {
                  label44: {
                     var2 = var33.x(var32);
                     switch (var2) {
                        case -1:
                           var7 = false;
                           var2 = var3;
                           break;
                        case 0:
                           var50 = var33.t(var32, 0);
                           var2 = var3 or 1;
                           break;
                        case 1:
                           var4 = var33.k(var32, 1);
                           var2 = var3 or 2;
                           break;
                        case 2:
                           var5 = var33.k(var32, 2);
                           var2 = var3 or 4;
                           break;
                        case 3:
                           var6 = var33.k(var32, 3);
                           var2 = var3 or 8;
                           break;
                        case 4:
                           var20 = var33.v(var32, 4, C0.a, var20) as java.lang.String;
                           var2 = var3 or 16;
                           break;
                        case 5:
                           var47 = var33.v(var32, 5, C0.a, var47) as java.lang.String;
                           var2 = var3 or 32;
                           break;
                        case 6:
                           var46 = var33.v(var32, 6, C0.a, var46) as java.lang.String;
                           var2 = var3 or 64;
                           break;
                        case 7:
                           var44 = var33.v(var32, 7, C0.a, var44) as java.lang.String;
                           var2 = var3 or 128;
                           break;
                        case 8:
                           var42 = var33.v(var32, 8, N.a, var42) as Int;
                           var2 = var3 or 256;
                           break;
                        case 9:
                           var36 = var33.v(var32, 9, C0.a, var36) as java.lang.String;
                           var2 = var3 or 512;
                           break;
                        case 10:
                           var40 = var33.v(var32, 10, AnnotatedStructurableTextSerializer.INSTANCE, var40) as AnnotatedStructurableText;
                           var3 |= 1024;
                           continue;
                        case 11:
                           var26 = var33.v(var32, 11, N.a, var26) as Int;
                           var3 |= 2048;
                           continue;
                        case 12:
                           var24 = var33.v(var32, 12, AnnotatedStructurableTextSerializer.INSTANCE, var24) as AnnotatedStructurableText;
                           var3 |= 4096;
                           continue;
                        case 13:
                           var25 = var33.v(var32, 13, N.a, var25) as Int;
                           var3 |= 8192;
                           continue;
                        case 14:
                           var48 = var33.v(var32, 14, C0.a, var48) as java.lang.String;
                           var3 |= 16384;
                           continue;
                        case 15:
                           var17 = var33.v(var32, 15, N.a, var17) as Int;
                           var2 = 32768;
                           break label44;
                        case 16:
                           var16 = var33.v(var32, 16, C0.a, var16) as java.lang.String;
                           var2 = 65536;
                           break label44;
                        case 17:
                           var18 = var33.v(var32, 17, N.a, var18) as Int;
                           var2 = 131072;
                           break label44;
                        case 18:
                           var19 = var33.v(var32, 18, C0.a, var19) as java.lang.String;
                           var2 = 262144;
                           break label44;
                        case 19:
                           var22 = var33.v(var32, 19, N.a, var22) as Int;
                           var2 = 524288;
                           break label44;
                        case 20:
                           var21 = var33.v(var32, 20, C0.a, var21) as java.lang.String;
                           var2 = 1048576;
                           break label44;
                        case 21:
                           var60 = var33.v(var32, 21, h.a, var60) as java.lang.Boolean;
                           var2 = 2097152;
                           break label44;
                        default:
                           throw new n(var2);
                     }

                     var3 = var2;
                     continue;
                  }

                  var3 |= var2;
               }

               var29 = var18;
               var44 = (java.lang.String)var48;
               var2 = var6;
               var35 = (java.lang.Boolean)var60;
               var42 = var21;
               var40 = var22;
               var60 = var19;
               var22 = var17;
               var24 = var25;
               var25 = var24;
               var48 = var40;
               var28 = var36;
               var18 = var42;
               var27 = var44;
               var17 = (Integer)var46;
               var21 = var47;
               var19 = var50;
            }

            var33.b(var32);
            return new ReferralEmbed.Resolved(
               var3,
               (java.lang.String)var19,
               var4,
               var5,
               var2,
               (java.lang.String)var20,
               (java.lang.String)var21,
               var17,
               (java.lang.String)var27,
               (Integer)var18,
               (java.lang.String)var28,
               (AnnotatedStructurableText)var48,
               (Integer)var26,
               (AnnotatedStructurableText)var25,
               (Integer)var24,
               var44,
               var22,
               (java.lang.String)var16,
               (Integer)var29,
               (java.lang.String)var60,
               (Integer)var40,
               (java.lang.String)var42,
               var35,
               null
            );
         }

         public open fun serialize(encoder: Encoder, value: com.discord.chat.bridge.referral.ReferralEmbed.Resolved) {
            q.h(var1, "encoder");
            q.h(var2, "value");
            val var3: SerialDescriptor = this.getDescriptor();
            val var4: CompositeEncoder = var1.c(var3);
            ReferralEmbed.Resolved.write$Self$chat_release(var2, var4, var3);
            var4.b(var3);
         }

         fun typeParametersSerializers(): Array<KSerializer> {
            return ia.G.a.a(this);
         }
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.chat.bridge.referral.ReferralEmbed.Resolved> {
            return ReferralEmbed.Resolved.$serializer.INSTANCE;
         }
      }
   }

   @f
   public data class Resolving(headerText: String,
         headerColor: Int,
         backgroundColor: Int,
         thumbnailCornerRadius: Int,
         headerLogoUrl: String?,
         resolvingGradientStart: Int,
         resolvingGradientEnd: Int
      ) :
      ReferralEmbed {
      public open val backgroundColor: Int
      public open val headerColor: Int
      public open val headerLogoUrl: String?
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
         this.headerLogoUrl = var5;
         this.resolvingGradientStart = var6;
         this.resolvingGradientEnd = var7;
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

      public operator fun component5(): String? {
         return this.headerLogoUrl;
      }

      public operator fun component6(): Int {
         return this.resolvingGradientStart;
      }

      public operator fun component7(): Int {
         return this.resolvingGradientEnd;
      }

      public fun copy(
         headerText: String = var0.headerText,
         headerColor: Int = var0.headerColor,
         backgroundColor: Int = var0.backgroundColor,
         thumbnailCornerRadius: Int = var0.thumbnailCornerRadius,
         headerLogoUrl: String? = var0.headerLogoUrl,
         resolvingGradientStart: Int = var0.resolvingGradientStart,
         resolvingGradientEnd: Int = var0.resolvingGradientEnd
      ): com.discord.chat.bridge.referral.ReferralEmbed.Resolving {
         q.h(var1, "headerText");
         return new ReferralEmbed.Resolving(var1, var2, var3, var4, var5, var6, var7);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ReferralEmbed.Resolving) {
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
            } else if (!q.c(this.headerLogoUrl, var1.headerLogoUrl)) {
               return false;
            } else if (this.resolvingGradientStart != var1.resolvingGradientStart) {
               return false;
            } else {
               return this.resolvingGradientEnd == var1.resolvingGradientEnd;
            }
         }
      }

      public override fun hashCode(): Int {
         val var5: Int = this.headerText.hashCode();
         val var2: Int = Integer.hashCode(this.headerColor);
         val var4: Int = Integer.hashCode(this.backgroundColor);
         val var3: Int = Integer.hashCode(this.thumbnailCornerRadius);
         val var1: Int;
         if (this.headerLogoUrl == null) {
            var1 = 0;
         } else {
            var1 = this.headerLogoUrl.hashCode();
         }

         return (((((var5 * 31 + var2) * 31 + var4) * 31 + var3) * 31 + var1) * 31 + Integer.hashCode(this.resolvingGradientStart)) * 31
            + Integer.hashCode(this.resolvingGradientEnd);
      }

      public override fun toString(): String {
         val var8: java.lang.String = this.headerText;
         val var2: Int = this.headerColor;
         val var4: Int = this.backgroundColor;
         val var3: Int = this.thumbnailCornerRadius;
         val var7: java.lang.String = this.headerLogoUrl;
         val var1: Int = this.resolvingGradientStart;
         val var5: Int = this.resolvingGradientEnd;
         val var6: StringBuilder = new StringBuilder();
         var6.append("Resolving(headerText=");
         var6.append(var8);
         var6.append(", headerColor=");
         var6.append(var2);
         var6.append(", backgroundColor=");
         var6.append(var4);
         var6.append(", thumbnailCornerRadius=");
         var6.append(var3);
         var6.append(", headerLogoUrl=");
         var6.append(var7);
         var6.append(", resolvingGradientStart=");
         var6.append(var1);
         var6.append(", resolvingGradientEnd=");
         var6.append(var5);
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
            val var0: ReferralEmbed.Resolving.$serializer = new ReferralEmbed.Resolving.$serializer();
            INSTANCE = var0;
            val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.referral.ReferralEmbed.Resolving", var0, 7);
            var1.l("headerText", false);
            var1.l("headerColor", false);
            var1.l("backgroundColor", false);
            var1.l("thumbnailCornerRadius", false);
            var1.l("headerLogoUrl", false);
            var1.l("resolvingGradientStart", false);
            var1.l("resolvingGradientEnd", false);
            descriptor = var1;
         }

         public open fun childSerializers(): Array<KSerializer<*>> {
            return new KSerializer[]{C0.a, N.a, N.a, N.a, a.u(C0.a), N.a, N.a};
         }

         public open fun deserialize(decoder: Decoder): com.discord.chat.bridge.referral.ReferralEmbed.Resolving {
            q.h(var1, "decoder");
            val var11: SerialDescriptor = this.getDescriptor();
            val var12: c = var1.c(var11);
            var var2: Int;
            var var3: Int;
            var var4: Int;
            var var5: Int;
            var var6: Int;
            var var7: Int;
            var var10: java.lang.String;
            var var13: java.lang.String;
            if (var12.y()) {
               var13 = var12.t(var11, 0);
               var7 = var12.k(var11, 1);
               var4 = var12.k(var11, 2);
               var6 = var12.k(var11, 3);
               var10 = var12.v(var11, 4, C0.a, null) as java.lang.String;
               var3 = var12.k(var11, 5);
               var2 = var12.k(var11, 6);
               var5 = 127;
            } else {
               var var8: Boolean = true;
               var7 = 0;
               var5 = 0;
               var4 = 0;
               var3 = 0;
               var2 = 0;
               var13 = null;
               var10 = null;
               var6 = 0;

               while (var8) {
                  val var9: Int = var12.x(var11);
                  switch (var9) {
                     case -1:
                        var8 = false;
                        break;
                     case 0:
                        var13 = var12.t(var11, 0);
                        var2 |= 1;
                        break;
                     case 1:
                        var3 = var12.k(var11, 1);
                        var2 |= 2;
                        break;
                     case 2:
                        var4 = var12.k(var11, 2);
                        var2 |= 4;
                        break;
                     case 3:
                        var5 = var12.k(var11, 3);
                        var2 |= 8;
                        break;
                     case 4:
                        var10 = var12.v(var11, 4, C0.a, var10) as java.lang.String;
                        var2 |= 16;
                        break;
                     case 5:
                        var6 = var12.k(var11, 5);
                        var2 |= 32;
                        break;
                     case 6:
                        var7 = var12.k(var11, 6);
                        var2 |= 64;
                        break;
                     default:
                        throw new n(var9);
                  }
               }

               var6 = var5;
               var2 = var7;
               var3 = var6;
               var7 = var3;
               var5 = var2;
            }

            var12.b(var11);
            return new ReferralEmbed.Resolving(var5, var13, var7, var4, var6, var10, var3, var2, null);
         }

         public open fun serialize(encoder: Encoder, value: com.discord.chat.bridge.referral.ReferralEmbed.Resolving) {
            q.h(var1, "encoder");
            q.h(var2, "value");
            val var3: SerialDescriptor = this.getDescriptor();
            val var4: CompositeEncoder = var1.c(var3);
            ReferralEmbed.Resolving.write$Self$chat_release(var2, var4, var3);
            var4.b(var3);
         }

         fun typeParametersSerializers(): Array<KSerializer> {
            return ia.G.a.a(this);
         }
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.chat.bridge.referral.ReferralEmbed.Resolving> {
            return ReferralEmbed.Resolving.$serializer.INSTANCE;
         }
      }
   }
}
