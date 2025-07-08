package com.discord.chat.bridge.codedlinks

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class GuildProfileInviteEmbedImpl(acceptLabelBackgroundColor: Int? = null,
      acceptLabelBorderColor: Int? = null,
      acceptLabelColor: Int? = null,
      acceptLabelText: String? = null,
      bodyTextColor: Int? = null,
      bodyText: String? = null,
      backgroundColor: Int,
      borderColor: Int,
      canBeAccepted: Boolean? = null,
      embedCanBeTapped: Boolean? = null,
      headerColor: Int,
      headerText: String?,
      resolvingGradientEnd: Int? = null,
      resolvingGradientStart: Int? = null,
      splashHasRadialGradient: Boolean? = null,
      splashOpacity: Int? = ...,
      splashUrl: String? = ...,
      inviteSplash: String? = ...,
      subtitle: String? = ...,
      subtitleColor: Int? = ...,
      thumbnailBackgroundColor: Int? = ...,
      thumbnailCornerRadius: Int? = ...,
      thumbnailText: String? = ...,
      thumbnailUrl: String? = ...,
      titleColor: Int? = ...,
      titleText: String? = ...,
      type: InviteType? = ...,
      extendedType: CodedLinkExtendedType = ...,
      memberText: String? = ...,
      onlineText: String? = null,
      bannerColor: Int,
      bannerColorSecondary: Int,
      hasProfileOverflow: Boolean,
      badgeIconUrl: String? = null,
      establishedText: String? = null
   )
   : CodedLinkEmbed,
   GuildProfileInviteEmbed {
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelText: String?
   public open val bodyTextColor: Int?
   public open val bodyText: String?
   public open val backgroundColor: Int
   public open val borderColor: Int
   public open val canBeAccepted: Boolean?
   public open val embedCanBeTapped: Boolean?
   public open val headerColor: Int
   public open val headerText: String?
   public open val resolvingGradientEnd: Int?
   public open val resolvingGradientStart: Int?
   public open val splashHasRadialGradient: Boolean?
   public open val splashOpacity: Int?
   public open val splashUrl: String?
   public open val inviteSplash: String?
   public open val subtitle: String?
   public open val subtitleColor: Int?
   public open val thumbnailBackgroundColor: Int?
   public open val thumbnailCornerRadius: Int?
   public open val thumbnailText: String?
   public open val thumbnailUrl: String?
   public open val titleColor: Int?
   public open val titleText: String?
   public open val type: InviteType?
   public open val extendedType: CodedLinkExtendedType
   public open val memberText: String?
   public open val onlineText: String?
   public open val bannerColor: Int
   public open val bannerColorSecondary: Int
   public open val hasProfileOverflow: Boolean
   public open val badgeIconUrl: String?
   public open val establishedText: String?

   init {
      r.h(var28, "extendedType");
      super(null);
      this.acceptLabelBackgroundColor = var1;
      this.acceptLabelBorderColor = var2;
      this.acceptLabelColor = var3;
      this.acceptLabelText = var4;
      this.bodyTextColor = var5;
      this.bodyText = var6;
      this.backgroundColor = var7;
      this.borderColor = var8;
      this.canBeAccepted = var9;
      this.embedCanBeTapped = var10;
      this.headerColor = var11;
      this.headerText = var12;
      this.resolvingGradientEnd = var13;
      this.resolvingGradientStart = var14;
      this.splashHasRadialGradient = var15;
      this.splashOpacity = var16;
      this.splashUrl = var17;
      this.inviteSplash = var18;
      this.subtitle = var19;
      this.subtitleColor = var20;
      this.thumbnailBackgroundColor = var21;
      this.thumbnailCornerRadius = var22;
      this.thumbnailText = var23;
      this.thumbnailUrl = var24;
      this.titleColor = var25;
      this.titleText = var26;
      this.type = var27;
      this.extendedType = var28;
      this.memberText = var29;
      this.onlineText = var30;
      this.bannerColor = var31;
      this.bannerColorSecondary = var32;
      this.hasProfileOverflow = var33;
      this.badgeIconUrl = var34;
      this.establishedText = var35;
   }

   public operator fun component1(): Int? {
      return this.acceptLabelBackgroundColor;
   }

   public operator fun component10(): Boolean? {
      return this.embedCanBeTapped;
   }

   public operator fun component11(): Int {
      return this.headerColor;
   }

   public operator fun component12(): String? {
      return this.headerText;
   }

   public operator fun component13(): Int? {
      return this.resolvingGradientEnd;
   }

   public operator fun component14(): Int? {
      return this.resolvingGradientStart;
   }

   public operator fun component15(): Boolean? {
      return this.splashHasRadialGradient;
   }

   public operator fun component16(): Int? {
      return this.splashOpacity;
   }

   public operator fun component17(): String? {
      return this.splashUrl;
   }

   public operator fun component18(): String? {
      return this.inviteSplash;
   }

   public operator fun component19(): String? {
      return this.subtitle;
   }

   public operator fun component2(): Int? {
      return this.acceptLabelBorderColor;
   }

   public operator fun component20(): Int? {
      return this.subtitleColor;
   }

   public operator fun component21(): Int? {
      return this.thumbnailBackgroundColor;
   }

   public operator fun component22(): Int? {
      return this.thumbnailCornerRadius;
   }

   public operator fun component23(): String? {
      return this.thumbnailText;
   }

   public operator fun component24(): String? {
      return this.thumbnailUrl;
   }

   public operator fun component25(): Int? {
      return this.titleColor;
   }

   public operator fun component26(): String? {
      return this.titleText;
   }

   public operator fun component27(): InviteType? {
      return this.type;
   }

   public operator fun component28(): CodedLinkExtendedType {
      return this.extendedType;
   }

   public operator fun component29(): String? {
      return this.memberText;
   }

   public operator fun component3(): Int? {
      return this.acceptLabelColor;
   }

   public operator fun component30(): String? {
      return this.onlineText;
   }

   public operator fun component31(): Int {
      return this.bannerColor;
   }

   public operator fun component32(): Int {
      return this.bannerColorSecondary;
   }

   public operator fun component33(): Boolean {
      return this.hasProfileOverflow;
   }

   public operator fun component34(): String? {
      return this.badgeIconUrl;
   }

   public operator fun component35(): String? {
      return this.establishedText;
   }

   public operator fun component4(): String? {
      return this.acceptLabelText;
   }

   public operator fun component5(): Int? {
      return this.bodyTextColor;
   }

   public operator fun component6(): String? {
      return this.bodyText;
   }

   public operator fun component7(): Int {
      return this.backgroundColor;
   }

   public operator fun component8(): Int {
      return this.borderColor;
   }

   public operator fun component9(): Boolean? {
      return this.canBeAccepted;
   }

   public fun copy(
      acceptLabelBackgroundColor: Int? = var0.acceptLabelBackgroundColor,
      acceptLabelBorderColor: Int? = var0.acceptLabelBorderColor,
      acceptLabelColor: Int? = var0.acceptLabelColor,
      acceptLabelText: String? = var0.acceptLabelText,
      bodyTextColor: Int? = var0.bodyTextColor,
      bodyText: String? = var0.bodyText,
      backgroundColor: Int = var0.backgroundColor,
      borderColor: Int = var0.borderColor,
      canBeAccepted: Boolean? = var0.canBeAccepted,
      embedCanBeTapped: Boolean? = var0.embedCanBeTapped,
      headerColor: Int = var0.headerColor,
      headerText: String? = var0.headerText,
      resolvingGradientEnd: Int? = var0.resolvingGradientEnd,
      resolvingGradientStart: Int? = var0.resolvingGradientStart,
      splashHasRadialGradient: Boolean? = var0.splashHasRadialGradient,
      splashOpacity: Int? = var0.splashOpacity,
      splashUrl: String? = var0.splashUrl,
      inviteSplash: String? = var0.inviteSplash,
      subtitle: String? = var0.subtitle,
      subtitleColor: Int? = var0.subtitleColor,
      thumbnailBackgroundColor: Int? = var0.thumbnailBackgroundColor,
      thumbnailCornerRadius: Int? = var0.thumbnailCornerRadius,
      thumbnailText: String? = var0.thumbnailText,
      thumbnailUrl: String? = var0.thumbnailUrl,
      titleColor: Int? = var0.titleColor,
      titleText: String? = var0.titleText,
      type: InviteType? = var0.type,
      extendedType: CodedLinkExtendedType = var0.extendedType,
      memberText: String? = var0.memberText,
      onlineText: String? = var0.onlineText,
      bannerColor: Int = var0.bannerColor,
      bannerColorSecondary: Int = var0.bannerColorSecondary,
      hasProfileOverflow: Boolean = var0.hasProfileOverflow,
      badgeIconUrl: String? = var0.badgeIconUrl,
      establishedText: String? = var0.establishedText
   ): GuildProfileInviteEmbedImpl {
      r.h(var28, "extendedType");
      return new GuildProfileInviteEmbedImpl(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20,
         var21,
         var22,
         var23,
         var24,
         var25,
         var26,
         var27,
         var28,
         var29,
         var30,
         var31,
         var32,
         var33,
         var34,
         var35
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildProfileInviteEmbedImpl) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.acceptLabelBackgroundColor, var1.acceptLabelBackgroundColor)) {
            return false;
         } else if (!r.c(this.acceptLabelBorderColor, var1.acceptLabelBorderColor)) {
            return false;
         } else if (!r.c(this.acceptLabelColor, var1.acceptLabelColor)) {
            return false;
         } else if (!r.c(this.acceptLabelText, var1.acceptLabelText)) {
            return false;
         } else if (!r.c(this.bodyTextColor, var1.bodyTextColor)) {
            return false;
         } else if (!r.c(this.bodyText, var1.bodyText)) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (this.borderColor != var1.borderColor) {
            return false;
         } else if (!r.c(this.canBeAccepted, var1.canBeAccepted)) {
            return false;
         } else if (!r.c(this.embedCanBeTapped, var1.embedCanBeTapped)) {
            return false;
         } else if (this.headerColor != var1.headerColor) {
            return false;
         } else if (!r.c(this.headerText, var1.headerText)) {
            return false;
         } else if (!r.c(this.resolvingGradientEnd, var1.resolvingGradientEnd)) {
            return false;
         } else if (!r.c(this.resolvingGradientStart, var1.resolvingGradientStart)) {
            return false;
         } else if (!r.c(this.splashHasRadialGradient, var1.splashHasRadialGradient)) {
            return false;
         } else if (!r.c(this.splashOpacity, var1.splashOpacity)) {
            return false;
         } else if (!r.c(this.splashUrl, var1.splashUrl)) {
            return false;
         } else if (!r.c(this.inviteSplash, var1.inviteSplash)) {
            return false;
         } else if (!r.c(this.subtitle, var1.subtitle)) {
            return false;
         } else if (!r.c(this.subtitleColor, var1.subtitleColor)) {
            return false;
         } else if (!r.c(this.thumbnailBackgroundColor, var1.thumbnailBackgroundColor)) {
            return false;
         } else if (!r.c(this.thumbnailCornerRadius, var1.thumbnailCornerRadius)) {
            return false;
         } else if (!r.c(this.thumbnailText, var1.thumbnailText)) {
            return false;
         } else if (!r.c(this.thumbnailUrl, var1.thumbnailUrl)) {
            return false;
         } else if (!r.c(this.titleColor, var1.titleColor)) {
            return false;
         } else if (!r.c(this.titleText, var1.titleText)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (this.extendedType != var1.extendedType) {
            return false;
         } else if (!r.c(this.memberText, var1.memberText)) {
            return false;
         } else if (!r.c(this.onlineText, var1.onlineText)) {
            return false;
         } else if (this.bannerColor != var1.bannerColor) {
            return false;
         } else if (this.bannerColorSecondary != var1.bannerColorSecondary) {
            return false;
         } else if (this.hasProfileOverflow != var1.hasProfileOverflow) {
            return false;
         } else if (!r.c(this.badgeIconUrl, var1.badgeIconUrl)) {
            return false;
         } else {
            return r.c(this.establishedText, var1.establishedText);
         }
      }
   }

   public override fun hashCode(): Int {
      var var28: Int = 0;
      val var1: Int;
      if (this.acceptLabelBackgroundColor == null) {
         var1 = 0;
      } else {
         var1 = this.acceptLabelBackgroundColor.hashCode();
      }

      val var2: Int;
      if (this.acceptLabelBorderColor == null) {
         var2 = 0;
      } else {
         var2 = this.acceptLabelBorderColor.hashCode();
      }

      val var3: Int;
      if (this.acceptLabelColor == null) {
         var3 = 0;
      } else {
         var3 = this.acceptLabelColor.hashCode();
      }

      val var4: Int;
      if (this.acceptLabelText == null) {
         var4 = 0;
      } else {
         var4 = this.acceptLabelText.hashCode();
      }

      val var5: Int;
      if (this.bodyTextColor == null) {
         var5 = 0;
      } else {
         var5 = this.bodyTextColor.hashCode();
      }

      val var6: Int;
      if (this.bodyText == null) {
         var6 = 0;
      } else {
         var6 = this.bodyText.hashCode();
      }

      val var30: Int = Integer.hashCode(this.backgroundColor);
      val var29: Int = Integer.hashCode(this.borderColor);
      val var7: Int;
      if (this.canBeAccepted == null) {
         var7 = 0;
      } else {
         var7 = this.canBeAccepted.hashCode();
      }

      val var8: Int;
      if (this.embedCanBeTapped == null) {
         var8 = 0;
      } else {
         var8 = this.embedCanBeTapped.hashCode();
      }

      val var31: Int = Integer.hashCode(this.headerColor);
      val var9: Int;
      if (this.headerText == null) {
         var9 = 0;
      } else {
         var9 = this.headerText.hashCode();
      }

      val var10: Int;
      if (this.resolvingGradientEnd == null) {
         var10 = 0;
      } else {
         var10 = this.resolvingGradientEnd.hashCode();
      }

      val var11: Int;
      if (this.resolvingGradientStart == null) {
         var11 = 0;
      } else {
         var11 = this.resolvingGradientStart.hashCode();
      }

      val var12: Int;
      if (this.splashHasRadialGradient == null) {
         var12 = 0;
      } else {
         var12 = this.splashHasRadialGradient.hashCode();
      }

      val var13: Int;
      if (this.splashOpacity == null) {
         var13 = 0;
      } else {
         var13 = this.splashOpacity.hashCode();
      }

      val var14: Int;
      if (this.splashUrl == null) {
         var14 = 0;
      } else {
         var14 = this.splashUrl.hashCode();
      }

      val var15: Int;
      if (this.inviteSplash == null) {
         var15 = 0;
      } else {
         var15 = this.inviteSplash.hashCode();
      }

      val var16: Int;
      if (this.subtitle == null) {
         var16 = 0;
      } else {
         var16 = this.subtitle.hashCode();
      }

      val var17: Int;
      if (this.subtitleColor == null) {
         var17 = 0;
      } else {
         var17 = this.subtitleColor.hashCode();
      }

      val var18: Int;
      if (this.thumbnailBackgroundColor == null) {
         var18 = 0;
      } else {
         var18 = this.thumbnailBackgroundColor.hashCode();
      }

      val var19: Int;
      if (this.thumbnailCornerRadius == null) {
         var19 = 0;
      } else {
         var19 = this.thumbnailCornerRadius.hashCode();
      }

      val var20: Int;
      if (this.thumbnailText == null) {
         var20 = 0;
      } else {
         var20 = this.thumbnailText.hashCode();
      }

      val var21: Int;
      if (this.thumbnailUrl == null) {
         var21 = 0;
      } else {
         var21 = this.thumbnailUrl.hashCode();
      }

      val var22: Int;
      if (this.titleColor == null) {
         var22 = 0;
      } else {
         var22 = this.titleColor.hashCode();
      }

      val var23: Int;
      if (this.titleText == null) {
         var23 = 0;
      } else {
         var23 = this.titleText.hashCode();
      }

      val var24: Int;
      if (this.type == null) {
         var24 = 0;
      } else {
         var24 = this.type.hashCode();
      }

      val var32: Int = this.extendedType.hashCode();
      val var25: Int;
      if (this.memberText == null) {
         var25 = 0;
      } else {
         var25 = this.memberText.hashCode();
      }

      val var26: Int;
      if (this.onlineText == null) {
         var26 = 0;
      } else {
         var26 = this.onlineText.hashCode();
      }

      val var33: Int = Integer.hashCode(this.bannerColor);
      val var35: Int = Integer.hashCode(this.bannerColorSecondary);
      val var34: Int = java.lang.Boolean.hashCode(this.hasProfileOverflow);
      val var27: Int;
      if (this.badgeIconUrl == null) {
         var27 = 0;
      } else {
         var27 = this.badgeIconUrl.hashCode();
      }

      if (this.establishedText != null) {
         var28 = this.establishedText.hashCode();
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
                                                                                                                                                                                                                                                                                                               var1
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
                                                                                                                                                                                                                                                                     + var30
                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                            + var29
                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                   + var7
                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                          + var8
                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                 + var31
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
                                                                                                                                       + var18
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var19
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var20
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var21
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var22
                                                                                             )
                                                                                             * 31
                                                                                          + var23
                                                                                    )
                                                                                    * 31
                                                                                 + var24
                                                                           )
                                                                           * 31
                                                                        + var32
                                                                  )
                                                                  * 31
                                                               + var25
                                                         )
                                                         * 31
                                                      + var26
                                                )
                                                * 31
                                             + var33
                                       )
                                       * 31
                                    + var35
                              )
                              * 31
                           + var34
                     )
                     * 31
                  + var27
            )
            * 31
         + var28;
   }

   public override fun toString(): String {
      val var9: Int = this.acceptLabelBackgroundColor;
      val var28: Int = this.acceptLabelBorderColor;
      val var33: Int = this.acceptLabelColor;
      val var30: java.lang.String = this.acceptLabelText;
      val var18: Int = this.bodyTextColor;
      val var24: java.lang.String = this.bodyText;
      val var5: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var34: java.lang.Boolean = this.canBeAccepted;
      val var13: java.lang.Boolean = this.embedCanBeTapped;
      val var4: Int = this.headerColor;
      val var25: java.lang.String = this.headerText;
      val var35: Int = this.resolvingGradientEnd;
      val var17: Int = this.resolvingGradientStart;
      val var7: java.lang.Boolean = this.splashHasRadialGradient;
      val var16: Int = this.splashOpacity;
      val var20: java.lang.String = this.splashUrl;
      val var14: java.lang.String = this.inviteSplash;
      val var12: java.lang.String = this.subtitle;
      val var11: Int = this.subtitleColor;
      val var19: Int = this.thumbnailBackgroundColor;
      val var31: Int = this.thumbnailCornerRadius;
      val var26: java.lang.String = this.thumbnailText;
      val var22: java.lang.String = this.thumbnailUrl;
      val var15: Int = this.titleColor;
      val var36: java.lang.String = this.titleText;
      val var23: InviteType = this.type;
      val var8: CodedLinkExtendedType = this.extendedType;
      val var10: java.lang.String = this.memberText;
      val var32: java.lang.String = this.onlineText;
      val var3: Int = this.bannerColor;
      val var1: Int = this.bannerColorSecondary;
      val var6: Boolean = this.hasProfileOverflow;
      val var29: java.lang.String = this.badgeIconUrl;
      val var27: java.lang.String = this.establishedText;
      val var21: StringBuilder = new StringBuilder();
      var21.append("GuildProfileInviteEmbedImpl(acceptLabelBackgroundColor=");
      var21.append(var9);
      var21.append(", acceptLabelBorderColor=");
      var21.append(var28);
      var21.append(", acceptLabelColor=");
      var21.append(var33);
      var21.append(", acceptLabelText=");
      var21.append(var30);
      var21.append(", bodyTextColor=");
      var21.append(var18);
      var21.append(", bodyText=");
      var21.append(var24);
      var21.append(", backgroundColor=");
      var21.append(var5);
      var21.append(", borderColor=");
      var21.append(var2);
      var21.append(", canBeAccepted=");
      var21.append(var34);
      var21.append(", embedCanBeTapped=");
      var21.append(var13);
      var21.append(", headerColor=");
      var21.append(var4);
      var21.append(", headerText=");
      var21.append(var25);
      var21.append(", resolvingGradientEnd=");
      var21.append(var35);
      var21.append(", resolvingGradientStart=");
      var21.append(var17);
      var21.append(", splashHasRadialGradient=");
      var21.append(var7);
      var21.append(", splashOpacity=");
      var21.append(var16);
      var21.append(", splashUrl=");
      var21.append(var20);
      var21.append(", inviteSplash=");
      var21.append(var14);
      var21.append(", subtitle=");
      var21.append(var12);
      var21.append(", subtitleColor=");
      var21.append(var11);
      var21.append(", thumbnailBackgroundColor=");
      var21.append(var19);
      var21.append(", thumbnailCornerRadius=");
      var21.append(var31);
      var21.append(", thumbnailText=");
      var21.append(var26);
      var21.append(", thumbnailUrl=");
      var21.append(var22);
      var21.append(", titleColor=");
      var21.append(var15);
      var21.append(", titleText=");
      var21.append(var36);
      var21.append(", type=");
      var21.append(var23);
      var21.append(", extendedType=");
      var21.append(var8);
      var21.append(", memberText=");
      var21.append(var10);
      var21.append(", onlineText=");
      var21.append(var32);
      var21.append(", bannerColor=");
      var21.append(var3);
      var21.append(", bannerColorSecondary=");
      var21.append(var1);
      var21.append(", hasProfileOverflow=");
      var21.append(var6);
      var21.append(", badgeIconUrl=");
      var21.append(var29);
      var21.append(", establishedText=");
      var21.append(var27);
      var21.append(")");
      return var21.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<GuildProfileInviteEmbedImpl> {
         return GuildProfileInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
