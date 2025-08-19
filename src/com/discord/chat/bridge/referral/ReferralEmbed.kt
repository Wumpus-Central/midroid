package com.discord.chat.bridge.referral

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import kotlinx.serialization.KSerializer
import nb.g

@g(with = ReferralEmbedSerializer::class)
public sealed interface ReferralEmbed {
   public val headerText: String
   public val headerColor: Int
   public val backgroundColor: Int
   public val thumbnailCornerRadius: Int
   public val headerLogoUrl: String?

   public companion object {
      public fun serializer(): KSerializer<ReferralEmbed> {
         return ReferralEmbedSerializer.INSTANCE;
      }
   }

   @g
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
      public open val headerText: String
      public open val headerColor: Int
      public open val backgroundColor: Int
      public open val thumbnailCornerRadius: Int
      public open val headerLogoUrl: String?
      public final val headerUrl: String?
      public final val thumbnailUrl: String?
      public final val titleText: String?
      public final val titleColor: Int?
      public final val bodyText: String?
      public final val structuredBodyText: AnnotatedStructurableText?
      public final val bodyTextColor: Int?
      public final val linkButtonLabel: AnnotatedStructurableText?
      public final val linkButtonColor: Int?
      public final val subText: String?
      public final val subTextColor: Int?
      public final val footerText: String?
      public final val footerTextColor: Int?
      public final val acceptLabelText: String?
      public final val acceptLabelColor: Int?
      public final val acceptLabelIconUrl: String?
      public final val canBeAccepted: Boolean?

      init {
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
            if (!(this.headerText == var1.headerText)) {
               return false;
            } else if (this.headerColor != var1.headerColor) {
               return false;
            } else if (this.backgroundColor != var1.backgroundColor) {
               return false;
            } else if (this.thumbnailCornerRadius != var1.thumbnailCornerRadius) {
               return false;
            } else if (!(this.headerLogoUrl == var1.headerLogoUrl)) {
               return false;
            } else if (!(this.headerUrl == var1.headerUrl)) {
               return false;
            } else if (!(this.thumbnailUrl == var1.thumbnailUrl)) {
               return false;
            } else if (!(this.titleText == var1.titleText)) {
               return false;
            } else if (!(this.titleColor == var1.titleColor)) {
               return false;
            } else if (!(this.bodyText == var1.bodyText)) {
               return false;
            } else if (!(this.structuredBodyText == var1.structuredBodyText)) {
               return false;
            } else if (!(this.bodyTextColor == var1.bodyTextColor)) {
               return false;
            } else if (!(this.linkButtonLabel == var1.linkButtonLabel)) {
               return false;
            } else if (!(this.linkButtonColor == var1.linkButtonColor)) {
               return false;
            } else if (!(this.subText == var1.subText)) {
               return false;
            } else if (!(this.subTextColor == var1.subTextColor)) {
               return false;
            } else if (!(this.footerText == var1.footerText)) {
               return false;
            } else if (!(this.footerTextColor == var1.footerTextColor)) {
               return false;
            } else if (!(this.acceptLabelText == var1.acceptLabelText)) {
               return false;
            } else if (!(this.acceptLabelColor == var1.acceptLabelColor)) {
               return false;
            } else if (!(this.acceptLabelIconUrl == var1.acceptLabelIconUrl)) {
               return false;
            } else {
               return this.canBeAccepted == var1.canBeAccepted;
            }
         }
      }

      public override fun hashCode(): Int {
         val var21: Int = this.headerText.hashCode();
         val var20: Int = Integer.hashCode(this.headerColor);
         val var19: Int = Integer.hashCode(this.backgroundColor);
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
                                                                                                                                                                                             var21
                                                                                                                                                                                                   * 31
                                                                                                                                                                                                + var20
                                                                                                                                                                                          )
                                                                                                                                                                                          * 31
                                                                                                                                                                                       + var19
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
         val var22: java.lang.String = this.headerText;
         val var1: Int = this.headerColor;
         val var2: Int = this.backgroundColor;
         val var3: Int = this.thumbnailCornerRadius;
         val var7: java.lang.String = this.headerLogoUrl;
         val var12: java.lang.String = this.headerUrl;
         val var14: java.lang.String = this.thumbnailUrl;
         val var4: java.lang.String = this.titleText;
         val var17: Int = this.titleColor;
         val var13: java.lang.String = this.bodyText;
         val var20: AnnotatedStructurableText = this.structuredBodyText;
         val var21: Int = this.bodyTextColor;
         val var18: AnnotatedStructurableText = this.linkButtonLabel;
         val var11: Int = this.linkButtonColor;
         val var15: java.lang.String = this.subText;
         val var23: Int = this.subTextColor;
         val var8: java.lang.String = this.footerText;
         val var10: Int = this.footerTextColor;
         val var19: java.lang.String = this.acceptLabelText;
         val var16: Int = this.acceptLabelColor;
         val var9: java.lang.String = this.acceptLabelIconUrl;
         val var6: java.lang.Boolean = this.canBeAccepted;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Resolved(headerText=");
         var5.append(var22);
         var5.append(", headerColor=");
         var5.append(var1);
         var5.append(", backgroundColor=");
         var5.append(var2);
         var5.append(", thumbnailCornerRadius=");
         var5.append(var3);
         var5.append(", headerLogoUrl=");
         var5.append(var7);
         var5.append(", headerUrl=");
         var5.append(var12);
         var5.append(", thumbnailUrl=");
         var5.append(var14);
         var5.append(", titleText=");
         var5.append(var4);
         var5.append(", titleColor=");
         var5.append(var17);
         var5.append(", bodyText=");
         var5.append(var13);
         var5.append(", structuredBodyText=");
         var5.append(var20);
         var5.append(", bodyTextColor=");
         var5.append(var21);
         var5.append(", linkButtonLabel=");
         var5.append(var18);
         var5.append(", linkButtonColor=");
         var5.append(var11);
         var5.append(", subText=");
         var5.append(var15);
         var5.append(", subTextColor=");
         var5.append(var23);
         var5.append(", footerText=");
         var5.append(var8);
         var5.append(", footerTextColor=");
         var5.append(var10);
         var5.append(", acceptLabelText=");
         var5.append(var19);
         var5.append(", acceptLabelColor=");
         var5.append(var16);
         var5.append(", acceptLabelIconUrl=");
         var5.append(var9);
         var5.append(", canBeAccepted=");
         var5.append(var6);
         var5.append(")");
         return var5.toString();
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.chat.bridge.referral.ReferralEmbed.Resolved> {
            return ReferralEmbed.Resolved.$serializer.INSTANCE;
         }
      }
   }

   @g
   public data class Resolving(headerText: String,
         headerColor: Int,
         backgroundColor: Int,
         thumbnailCornerRadius: Int,
         headerLogoUrl: String?,
         resolvingGradientStart: Int,
         resolvingGradientEnd: Int
      ) :
      ReferralEmbed {
      public open val headerText: String
      public open val headerColor: Int
      public open val backgroundColor: Int
      public open val thumbnailCornerRadius: Int
      public open val headerLogoUrl: String?
      public final val resolvingGradientStart: Int
      public final val resolvingGradientEnd: Int

      init {
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
         return new ReferralEmbed.Resolving(var1, var2, var3, var4, var5, var6, var7);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ReferralEmbed.Resolving) {
            return false;
         } else {
            var1 = var1;
            if (!(this.headerText == var1.headerText)) {
               return false;
            } else if (this.headerColor != var1.headerColor) {
               return false;
            } else if (this.backgroundColor != var1.backgroundColor) {
               return false;
            } else if (this.thumbnailCornerRadius != var1.thumbnailCornerRadius) {
               return false;
            } else if (!(this.headerLogoUrl == var1.headerLogoUrl)) {
               return false;
            } else if (this.resolvingGradientStart != var1.resolvingGradientStart) {
               return false;
            } else {
               return this.resolvingGradientEnd == var1.resolvingGradientEnd;
            }
         }
      }

      public override fun hashCode(): Int {
         val var2: Int = this.headerText.hashCode();
         val var4: Int = Integer.hashCode(this.headerColor);
         val var5: Int = Integer.hashCode(this.backgroundColor);
         val var3: Int = Integer.hashCode(this.thumbnailCornerRadius);
         val var1: Int;
         if (this.headerLogoUrl == null) {
            var1 = 0;
         } else {
            var1 = this.headerLogoUrl.hashCode();
         }

         return (((((var2 * 31 + var4) * 31 + var5) * 31 + var3) * 31 + var1) * 31 + Integer.hashCode(this.resolvingGradientStart)) * 31
            + Integer.hashCode(this.resolvingGradientEnd);
      }

      public override fun toString(): String {
         val var7: java.lang.String = this.headerText;
         val var2: Int = this.headerColor;
         val var1: Int = this.backgroundColor;
         val var3: Int = this.thumbnailCornerRadius;
         val var6: java.lang.String = this.headerLogoUrl;
         val var5: Int = this.resolvingGradientStart;
         val var4: Int = this.resolvingGradientEnd;
         val var8: StringBuilder = new StringBuilder();
         var8.append("Resolving(headerText=");
         var8.append(var7);
         var8.append(", headerColor=");
         var8.append(var2);
         var8.append(", backgroundColor=");
         var8.append(var1);
         var8.append(", thumbnailCornerRadius=");
         var8.append(var3);
         var8.append(", headerLogoUrl=");
         var8.append(var6);
         var8.append(", resolvingGradientStart=");
         var8.append(var5);
         var8.append(", resolvingGradientEnd=");
         var8.append(var4);
         var8.append(")");
         return var8.toString();
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.chat.bridge.referral.ReferralEmbed.Resolving> {
            return ReferralEmbed.Resolving.$serializer.INSTANCE;
         }
      }
   }
}
