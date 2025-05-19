package com.discord.chat.bridge.codedlinks

import ha.f
import ha.n
import ia.a
import ka.C0
import ka.G
import ka.N
import ka.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
   public open val backgroundColor: Int
   public open val badgeIconUrl: String?
   public open val bannerColor: Int
   public open val bannerColorSecondary: Int
   public open val bodyText: String?
   public open val bodyTextColor: Int?
   public open val borderColor: Int
   public open val canBeAccepted: Boolean?
   public open val embedCanBeTapped: Boolean?
   public open val establishedText: String?
   public open val extendedType: CodedLinkExtendedType
   public open val hasProfileOverflow: Boolean
   public open val headerColor: Int
   public open val headerText: String?
   public open val inviteSplash: String?
   public open val memberText: String?
   public open val onlineText: String?
   public open val resolvingGradientEnd: Int?
   public open val resolvingGradientStart: Int?
   public open val splashHasRadialGradient: Boolean?
   public open val splashOpacity: Int?
   public open val splashUrl: String?
   public open val subtitle: String?
   public open val subtitleColor: Int?
   public open val thumbnailBackgroundColor: Int?
   public open val thumbnailCornerRadius: Int?
   public open val thumbnailText: String?
   public open val thumbnailUrl: String?
   public open val titleColor: Int?
   public open val titleText: String?
   public open val type: InviteType?

   init {
      q.h(var28, "extendedType");
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
      q.h(var28, "extendedType");
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
         if (!q.c(this.acceptLabelBackgroundColor, var1.acceptLabelBackgroundColor)) {
            return false;
         } else if (!q.c(this.acceptLabelBorderColor, var1.acceptLabelBorderColor)) {
            return false;
         } else if (!q.c(this.acceptLabelColor, var1.acceptLabelColor)) {
            return false;
         } else if (!q.c(this.acceptLabelText, var1.acceptLabelText)) {
            return false;
         } else if (!q.c(this.bodyTextColor, var1.bodyTextColor)) {
            return false;
         } else if (!q.c(this.bodyText, var1.bodyText)) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (this.borderColor != var1.borderColor) {
            return false;
         } else if (!q.c(this.canBeAccepted, var1.canBeAccepted)) {
            return false;
         } else if (!q.c(this.embedCanBeTapped, var1.embedCanBeTapped)) {
            return false;
         } else if (this.headerColor != var1.headerColor) {
            return false;
         } else if (!q.c(this.headerText, var1.headerText)) {
            return false;
         } else if (!q.c(this.resolvingGradientEnd, var1.resolvingGradientEnd)) {
            return false;
         } else if (!q.c(this.resolvingGradientStart, var1.resolvingGradientStart)) {
            return false;
         } else if (!q.c(this.splashHasRadialGradient, var1.splashHasRadialGradient)) {
            return false;
         } else if (!q.c(this.splashOpacity, var1.splashOpacity)) {
            return false;
         } else if (!q.c(this.splashUrl, var1.splashUrl)) {
            return false;
         } else if (!q.c(this.inviteSplash, var1.inviteSplash)) {
            return false;
         } else if (!q.c(this.subtitle, var1.subtitle)) {
            return false;
         } else if (!q.c(this.subtitleColor, var1.subtitleColor)) {
            return false;
         } else if (!q.c(this.thumbnailBackgroundColor, var1.thumbnailBackgroundColor)) {
            return false;
         } else if (!q.c(this.thumbnailCornerRadius, var1.thumbnailCornerRadius)) {
            return false;
         } else if (!q.c(this.thumbnailText, var1.thumbnailText)) {
            return false;
         } else if (!q.c(this.thumbnailUrl, var1.thumbnailUrl)) {
            return false;
         } else if (!q.c(this.titleColor, var1.titleColor)) {
            return false;
         } else if (!q.c(this.titleText, var1.titleText)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (this.extendedType != var1.extendedType) {
            return false;
         } else if (!q.c(this.memberText, var1.memberText)) {
            return false;
         } else if (!q.c(this.onlineText, var1.onlineText)) {
            return false;
         } else if (this.bannerColor != var1.bannerColor) {
            return false;
         } else if (this.bannerColorSecondary != var1.bannerColorSecondary) {
            return false;
         } else if (this.hasProfileOverflow != var1.hasProfileOverflow) {
            return false;
         } else if (!q.c(this.badgeIconUrl, var1.badgeIconUrl)) {
            return false;
         } else {
            return q.c(this.establishedText, var1.establishedText);
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

      val var29: Int = Integer.hashCode(this.backgroundColor);
      val var30: Int = Integer.hashCode(this.borderColor);
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

      val var35: Int = Integer.hashCode(this.bannerColor);
      val var33: Int = Integer.hashCode(this.bannerColorSecondary);
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
                                                                                                                                                                                                                                                                     + var29
                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                            + var30
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
                                             + var35
                                       )
                                       * 31
                                    + var33
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
      val var18: Int = this.acceptLabelBackgroundColor;
      val var33: Int = this.acceptLabelBorderColor;
      val var14: Int = this.acceptLabelColor;
      val var28: java.lang.String = this.acceptLabelText;
      val var29: Int = this.bodyTextColor;
      val var19: java.lang.String = this.bodyText;
      val var5: Int = this.backgroundColor;
      val var4: Int = this.borderColor;
      val var31: java.lang.Boolean = this.canBeAccepted;
      val var7: java.lang.Boolean = this.embedCanBeTapped;
      val var1: Int = this.headerColor;
      val var17: java.lang.String = this.headerText;
      val var22: Int = this.resolvingGradientEnd;
      val var8: Int = this.resolvingGradientStart;
      val var12: java.lang.Boolean = this.splashHasRadialGradient;
      val var35: Int = this.splashOpacity;
      val var26: java.lang.String = this.splashUrl;
      val var32: java.lang.String = this.inviteSplash;
      val var11: java.lang.String = this.subtitle;
      val var20: Int = this.subtitleColor;
      val var30: Int = this.thumbnailBackgroundColor;
      val var24: Int = this.thumbnailCornerRadius;
      val var13: java.lang.String = this.thumbnailText;
      val var34: java.lang.String = this.thumbnailUrl;
      val var21: Int = this.titleColor;
      val var15: java.lang.String = this.titleText;
      val var36: InviteType = this.type;
      val var9: CodedLinkExtendedType = this.extendedType;
      val var10: java.lang.String = this.memberText;
      val var16: java.lang.String = this.onlineText;
      val var2: Int = this.bannerColor;
      val var3: Int = this.bannerColorSecondary;
      val var6: Boolean = this.hasProfileOverflow;
      val var27: java.lang.String = this.badgeIconUrl;
      val var23: java.lang.String = this.establishedText;
      val var25: StringBuilder = new StringBuilder();
      var25.append("GuildProfileInviteEmbedImpl(acceptLabelBackgroundColor=");
      var25.append(var18);
      var25.append(", acceptLabelBorderColor=");
      var25.append(var33);
      var25.append(", acceptLabelColor=");
      var25.append(var14);
      var25.append(", acceptLabelText=");
      var25.append(var28);
      var25.append(", bodyTextColor=");
      var25.append(var29);
      var25.append(", bodyText=");
      var25.append(var19);
      var25.append(", backgroundColor=");
      var25.append(var5);
      var25.append(", borderColor=");
      var25.append(var4);
      var25.append(", canBeAccepted=");
      var25.append(var31);
      var25.append(", embedCanBeTapped=");
      var25.append(var7);
      var25.append(", headerColor=");
      var25.append(var1);
      var25.append(", headerText=");
      var25.append(var17);
      var25.append(", resolvingGradientEnd=");
      var25.append(var22);
      var25.append(", resolvingGradientStart=");
      var25.append(var8);
      var25.append(", splashHasRadialGradient=");
      var25.append(var12);
      var25.append(", splashOpacity=");
      var25.append(var35);
      var25.append(", splashUrl=");
      var25.append(var26);
      var25.append(", inviteSplash=");
      var25.append(var32);
      var25.append(", subtitle=");
      var25.append(var11);
      var25.append(", subtitleColor=");
      var25.append(var20);
      var25.append(", thumbnailBackgroundColor=");
      var25.append(var30);
      var25.append(", thumbnailCornerRadius=");
      var25.append(var24);
      var25.append(", thumbnailText=");
      var25.append(var13);
      var25.append(", thumbnailUrl=");
      var25.append(var34);
      var25.append(", titleColor=");
      var25.append(var21);
      var25.append(", titleText=");
      var25.append(var15);
      var25.append(", type=");
      var25.append(var36);
      var25.append(", extendedType=");
      var25.append(var9);
      var25.append(", memberText=");
      var25.append(var10);
      var25.append(", onlineText=");
      var25.append(var16);
      var25.append(", bannerColor=");
      var25.append(var2);
      var25.append(", bannerColorSecondary=");
      var25.append(var3);
      var25.append(", hasProfileOverflow=");
      var25.append(var6);
      var25.append(", badgeIconUrl=");
      var25.append(var27);
      var25.append(", establishedText=");
      var25.append(var23);
      var25.append(")");
      return var25.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: GuildProfileInviteEmbedImpl.$serializer = new GuildProfileInviteEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbedImpl", var0, 35
         );
         var1.l("acceptLabelBackgroundColor", true);
         var1.l("acceptLabelBorderColor", true);
         var1.l("acceptLabelColor", true);
         var1.l("acceptLabelText", true);
         var1.l("bodyTextColor", true);
         var1.l("bodyText", true);
         var1.l("backgroundColor", false);
         var1.l("borderColor", false);
         var1.l("canBeAccepted", true);
         var1.l("embedCanBeTapped", true);
         var1.l("headerColor", false);
         var1.l("headerText", false);
         var1.l("resolvingGradientEnd", true);
         var1.l("resolvingGradientStart", true);
         var1.l("splashHasRadialGradient", true);
         var1.l("splashOpacity", true);
         var1.l("splashUrl", true);
         var1.l("inviteSplash", true);
         var1.l("subtitle", true);
         var1.l("subtitleColor", true);
         var1.l("thumbnailBackgroundColor", true);
         var1.l("thumbnailCornerRadius", true);
         var1.l("thumbnailText", true);
         var1.l("thumbnailUrl", true);
         var1.l("titleColor", true);
         var1.l("titleText", true);
         var1.l("type", true);
         var1.l("extendedType", true);
         var1.l("memberText", true);
         var1.l("onlineText", true);
         var1.l("bannerColor", false);
         var1.l("bannerColorSecondary", false);
         var1.l("hasProfileOverflow", false);
         var1.l("badgeIconUrl", true);
         var1.l("establishedText", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var27: N = N.a;
         val var17: KSerializer = a.u(N.a);
         val var6: KSerializer = a.u(var27);
         val var20: KSerializer = a.u(var27);
         val var30: C0 = C0.a;
         val var14: KSerializer = a.u(C0.a);
         val var3: KSerializer = a.u(var27);
         val var1: KSerializer = a.u(var30);
         val var10: h = h.a;
         return new KSerializer[]{
            var17,
            var6,
            var20,
            var14,
            var3,
            var1,
            var27,
            var27,
            a.u(h.a),
            a.u(var10),
            var27,
            a.u(var30),
            a.u(var27),
            a.u(var27),
            a.u(var10),
            a.u(var27),
            a.u(var30),
            a.u(var30),
            a.u(var30),
            a.u(var27),
            a.u(var27),
            a.u(var27),
            a.u(var30),
            a.u(var30),
            a.u(var27),
            a.u(var30),
            a.u(InviteType.Serializer.INSTANCE),
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(var30),
            a.u(var30),
            var27,
            var27,
            var10,
            a.u(var30),
            a.u(var30)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildProfileInviteEmbedImpl {
         q.h(var1, "decoder");
         val var50: SerialDescriptor = this.getDescriptor();
         val var51: c = var1.c(var50);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         var var7: Int;
         var var10: Int;
         var var11: Boolean;
         var var14: java.lang.String;
         var var15: java.lang.String;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: java.lang.String;
         var var22: java.lang.String;
         var var23: java.lang.String;
         var var24: Any;
         var var25: java.lang.String;
         var var26: java.lang.String;
         var var27: Any;
         var var28: Any;
         var var29: java.lang.String;
         var var30: java.lang.String;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         var var36: Any;
         var var37: Any;
         var var38: java.lang.String;
         var var39: Any;
         val var53: java.lang.String;
         var var62: java.lang.String;
         var var66: java.lang.String;
         var var97: Any;
         var var102: Any;
         if (var51.y()) {
            val var12: N = N.a;
            var36 = var51.v(var50, 0, N.a, null) as Int;
            var39 = var51.v(var50, 1, var12, null) as Int;
            var33 = var51.v(var50, 2, var12, null) as Int;
            val var52: C0 = C0.a;
            var30 = var51.v(var50, 3, C0.a, null) as java.lang.String;
            var97 = var51.v(var50, 4, var12, null) as Int;
            var29 = var51.v(var50, 5, var52, null) as java.lang.String;
            var5 = var51.k(var50, 6);
            var6 = var51.k(var50, 7);
            val var13: h = h.a;
            var32 = var51.v(var50, 8, h.a, null) as java.lang.Boolean;
            var102 = var51.v(var50, 9, var13, null) as java.lang.Boolean;
            var3 = var51.k(var50, 10);
            var38 = var51.v(var50, 11, var52, null) as java.lang.String;
            var35 = var51.v(var50, 12, var12, null) as Int;
            var37 = var51.v(var50, 13, var12, null) as Int;
            var28 = var51.v(var50, 14, var13, null) as java.lang.Boolean;
            var24 = var51.v(var50, 15, var12, null) as Int;
            var25 = var51.v(var50, 16, var52, null) as java.lang.String;
            var23 = var51.v(var50, 17, var52, null) as java.lang.String;
            var26 = var51.v(var50, 18, var52, null) as java.lang.String;
            var27 = var51.v(var50, 19, var12, null) as Int;
            val var41: Int = var51.v(var50, 20, var12, null) as Int;
            val var40: Int = var51.v(var50, 21, var12, null) as Int;
            var22 = var51.v(var50, 22, var52, null) as java.lang.String;
            var19 = var51.v(var50, 23, var52, null) as java.lang.String;
            var18 = var51.v(var50, 24, var12, null) as Int;
            var66 = var51.v(var50, 25, var52, null) as java.lang.String;
            var17 = var51.v(var50, 26, InviteType.Serializer.INSTANCE, null) as InviteType;
            var16 = var51.m(var50, 27, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            var62 = var51.v(var50, 28, var52, null) as java.lang.String;
            var15 = var51.v(var50, 29, var52, null) as java.lang.String;
            var2 = var51.k(var50, 30);
            var4 = var51.k(var50, 31);
            var11 = var51.s(var50, 32);
            var14 = var51.v(var50, 33, var52, null) as java.lang.String;
            var53 = var51.v(var50, 34, var52, null) as java.lang.String;
            var10 = -1;
            var7 = 7;
            var31 = var97;
            var34 = var102;
            var102 = var41;
            var97 = var40;
         } else {
            var11 = false;
            var10 = 0;
            var var9: Int = 0;
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var7 = 0;
            var var8: Boolean = true;
            var27 = null;
            var var54: java.lang.String = null;
            var36 = null;
            var37 = null;
            var35 = null;
            var34 = null;
            var32 = null;
            var31 = null;
            var38 = null;
            var33 = null;
            var24 = null;
            var25 = null;
            var28 = null;
            var29 = null;
            var30 = null;
            var26 = null;
            var15 = null;
            var66 = null;
            var14 = null;
            var16 = null;
            var17 = null;
            var18 = null;
            var19 = null;
            var97 = null;
            var102 = null;
            var22 = null;
            var23 = null;
            var62 = null;
            var39 = null;
            var2 = 0;

            while (var8) {
               var var172: java.lang.String;
               var var207: Any;
               label145: {
                  label144: {
                     label143: {
                        label142: {
                           label182: {
                              label124: {
                                 label183: {
                                    label117: {
                                       label158: {
                                          var3 = var51.x(var50);
                                          switch (var3) {
                                             case -1:
                                                var8 = false;
                                                var3 = var10;
                                                break label117;
                                             case 0:
                                                var36 = var51.v(var50, 0, N.a, var36) as Int;
                                                var3 = var10 or 1;
                                                break label117;
                                             case 1:
                                                var39 = var51.v(var50, 1, N.a, var39) as Int;
                                                var3 = var10 or 2;
                                                break label117;
                                             case 2:
                                                var33 = var51.v(var50, 2, N.a, var33) as Int;
                                                var3 = var10 or 4;
                                                break label117;
                                             case 3:
                                                var25 = var51.v(var50, 3, C0.a, var24) as java.lang.String;
                                                var3 = var10 or 8;
                                                var24 = var27;
                                                var207 = var31;
                                                var27 = var25;
                                                break label183;
                                             case 4:
                                                var31 = var51.v(var50, 4, N.a, var31) as Int;
                                                var3 = var10 or 16;
                                                var172 = var25;
                                                break;
                                             case 5:
                                                var172 = var51.v(var50, 5, C0.a, var25) as java.lang.String;
                                                var3 = var10 or 32;
                                                break;
                                             case 6:
                                                var5 = var51.k(var50, 6);
                                                var3 = var10 or 64;
                                                var172 = (java.lang.String)var27;
                                                break label158;
                                             case 7:
                                                var4 = var51.k(var50, 7);
                                                var3 = var10 or 128;
                                                var172 = (java.lang.String)var27;
                                                break label158;
                                             case 8:
                                                var32 = var51.v(var50, 8, h.a, var32) as java.lang.Boolean;
                                                var3 = var10 or 256;
                                                var172 = (java.lang.String)var27;
                                                break label158;
                                             case 9:
                                                var34 = var51.v(var50, 9, h.a, var34) as java.lang.Boolean;
                                                var3 = var10 or 512;
                                                var172 = (java.lang.String)var27;
                                                break label158;
                                             case 10:
                                                var6 = var51.k(var50, 10);
                                                var3 = var10 or 1024;
                                                var172 = (java.lang.String)var27;
                                                break label158;
                                             case 11:
                                                var172 = var51.v(var50, 11, C0.a, var27) as java.lang.String;
                                                var3 = var10 or 2048;
                                                break label158;
                                             case 12:
                                                var35 = var51.v(var50, 12, N.a, var35) as Int;
                                                var3 = var10 or 4096;
                                                var172 = (java.lang.String)var27;
                                                break label158;
                                             case 13:
                                                var37 = var51.v(var50, 13, N.a, var37) as Int;
                                                var3 = var10 or 8192;
                                                var172 = (java.lang.String)var27;
                                                break label158;
                                             case 14:
                                                var29 = var51.v(var50, 14, h.a, var28) as java.lang.Boolean;
                                                var10 |= 16384;
                                                var28 = var29;
                                                break label142;
                                             case 15:
                                                val var175: Int = var51.v(var50, 15, N.a, var29) as Int;
                                                var10 |= 32768;
                                                var29 = (java.lang.String)var28;
                                                var28 = var175;
                                                break label142;
                                             case 16:
                                                var30 = var51.v(var50, 16, C0.a, var30) as java.lang.String;
                                                var10 |= 65536;
                                                break label143;
                                             case 17:
                                                var26 = var51.v(var50, 17, C0.a, var26) as java.lang.String;
                                                var10 |= 131072;
                                                break label143;
                                             case 18:
                                                var3 = var2;
                                                var17 = var18;
                                                var16 = var19;
                                                var14 = (java.lang.String)var102;
                                                var102 = var66;
                                                var22 = var51.v(var50, 18, C0.a, var15) as java.lang.String;
                                                var2 = var10 or 262144;
                                                var23 = var62;
                                                var62 = var23;
                                                var66 = var22;
                                                var15 = (java.lang.String)var97;
                                                var18 = var17;
                                                var19 = (java.lang.String)var16;
                                                var97 = var14;
                                                break label144;
                                             case 19:
                                                var3 = var2;
                                                var17 = var18;
                                                var16 = var19;
                                                var97 = var14;
                                                var102 = var51.v(var50, 19, N.a, var66) as Int;
                                                var2 = var10 or 524288;
                                                var23 = var62;
                                                var22 = var15;
                                                var62 = var23;
                                                var66 = var22;
                                                var14 = (java.lang.String)var102;
                                                var15 = (java.lang.String)var97;
                                                var18 = var17;
                                                var19 = (java.lang.String)var16;
                                                break label144;
                                             case 20:
                                                var3 = var2;
                                                var17 = var18;
                                                val var116: Int = var51.v(var50, 20, N.a, var14) as Int;
                                                var2 = var10 or 1048576;
                                                var23 = var62;
                                                var62 = var23;
                                                var66 = var22;
                                                var14 = (java.lang.String)var102;
                                                var15 = (java.lang.String)var97;
                                                var16 = var19;
                                                var18 = var17;
                                                var19 = (java.lang.String)var16;
                                                var97 = var116;
                                                var102 = var66;
                                                var22 = var15;
                                                break label144;
                                             case 21:
                                                var3 = var2;
                                                var207 = var51.v(var50, 21, N.a, var16) as Int;
                                                var2 = var10 or 2097152;
                                                var23 = var62;
                                                var22 = var15;
                                                var62 = var23;
                                                var66 = var22;
                                                var14 = (java.lang.String)var102;
                                                var15 = (java.lang.String)var97;
                                                var16 = var19;
                                                var17 = var18;
                                                var18 = var17;
                                                var19 = (java.lang.String)var207;
                                                var97 = var14;
                                                var102 = var66;
                                                break label144;
                                             case 22:
                                                var3 = var2;
                                                var207 = var51.v(var50, 22, C0.a, var17) as java.lang.String;
                                                var2 = var10 or 4194304;
                                                var23 = var62;
                                                var22 = var15;
                                                var62 = var23;
                                                var66 = var22;
                                                var14 = (java.lang.String)var102;
                                                var15 = (java.lang.String)var97;
                                                var16 = var19;
                                                var17 = var18;
                                                var18 = var207;
                                                var19 = (java.lang.String)var16;
                                                var97 = var14;
                                                var102 = var66;
                                                break label144;
                                             case 23:
                                                var3 = var2;
                                                var18 = var51.v(var50, 23, C0.a, var18) as java.lang.String;
                                                var2 = var10 or 8388608;
                                                var23 = var62;
                                                var62 = var23;
                                                var66 = var22;
                                                var14 = (java.lang.String)var102;
                                                var15 = (java.lang.String)var97;
                                                var16 = var19;
                                                var17 = var18;
                                                var18 = var17;
                                                var19 = (java.lang.String)var16;
                                                var97 = var14;
                                                var102 = var66;
                                                var22 = var15;
                                                break label144;
                                             case 24:
                                                var3 = var2;
                                                val var94: Int = var51.v(var50, 24, N.a, var19) as Int;
                                                var2 = var10 or 16777216;
                                                var23 = var62;
                                                var17 = var18;
                                                var62 = var23;
                                                var66 = var22;
                                                var14 = (java.lang.String)var102;
                                                var15 = (java.lang.String)var97;
                                                var16 = var94;
                                                var18 = var17;
                                                var19 = (java.lang.String)var16;
                                                var97 = var14;
                                                var102 = var66;
                                                var22 = var15;
                                                break label144;
                                             case 25:
                                                var3 = var2;
                                                val var235: java.lang.String = var51.v(var50, 25, C0.a, var97) as java.lang.String;
                                                var2 = var10 or 33554432;
                                                var23 = var62;
                                                var97 = var14;
                                                var17 = var18;
                                                var16 = var19;
                                                var62 = var23;
                                                var66 = var22;
                                                var14 = (java.lang.String)var102;
                                                var15 = var235;
                                                var18 = var17;
                                                var19 = (java.lang.String)var16;
                                                var102 = var66;
                                                var22 = var15;
                                                break label144;
                                             case 26:
                                                var3 = var2;
                                                val var234: InviteType = var51.v(var50, 26, InviteType.Serializer.INSTANCE, var102) as InviteType;
                                                var2 = var10 or 67108864;
                                                var23 = var62;
                                                var22 = var15;
                                                var102 = var66;
                                                var17 = var18;
                                                var16 = var19;
                                                var15 = (java.lang.String)var97;
                                                var62 = var23;
                                                var66 = var22;
                                                var14 = var234;
                                                var18 = var17;
                                                var19 = (java.lang.String)var16;
                                                var97 = var14;
                                                break label144;
                                             case 27:
                                                var3 = var2;
                                                val var233: CodedLinkExtendedType = var51.m(var50, 27, CodedLinkExtendedType.Serializer.INSTANCE, var22) as CodedLinkExtendedType;
                                                var2 = var10 or 134217728;
                                                var23 = var62;
                                                var22 = var15;
                                                var17 = var18;
                                                var16 = var19;
                                                var15 = (java.lang.String)var97;
                                                var14 = (java.lang.String)var102;
                                                var62 = var23;
                                                var66 = var233;
                                                var18 = var17;
                                                var19 = (java.lang.String)var16;
                                                var97 = var14;
                                                var102 = var66;
                                                break label144;
                                             case 28:
                                                var3 = var2;
                                                val var248: java.lang.String = var51.v(var50, 28, C0.a, var23) as java.lang.String;
                                                var2 = var10 or 268435456;
                                                var23 = var62;
                                                var17 = var18;
                                                var16 = var19;
                                                var15 = (java.lang.String)var97;
                                                var14 = (java.lang.String)var102;
                                                var66 = var22;
                                                var62 = var248;
                                                var18 = var17;
                                                var19 = (java.lang.String)var16;
                                                var97 = var14;
                                                var102 = var66;
                                                var22 = var15;
                                                break label144;
                                             case 29:
                                                var3 = var2;
                                                var172 = var51.v(var50, 29, C0.a, var62) as java.lang.String;
                                                var2 = var10 or 536870912;
                                                var17 = var18;
                                                var16 = var19;
                                                var15 = (java.lang.String)var97;
                                                var14 = (java.lang.String)var102;
                                                var66 = var22;
                                                var62 = var23;
                                                var18 = var17;
                                                var19 = (java.lang.String)var16;
                                                var97 = var14;
                                                var102 = var66;
                                                var22 = var15;
                                                var23 = var172;
                                                break label144;
                                             case 30:
                                                var3 = var2;
                                                var9 = var51.k(var50, 30);
                                                var2 = var10 or 1073741824;
                                                break label124;
                                             case 31:
                                                var3 = var51.k(var50, 31);
                                                var2 = var10 or Integer.MIN_VALUE;
                                                break label124;
                                             case 32:
                                                var3 = var2;
                                                var11 = var51.s(var50, 32);
                                                var7 |= 1;
                                                var2 = var10;
                                                break label124;
                                             case 33:
                                                var3 = var2;
                                                var54 = var51.v(var50, 33, C0.a, var54) as java.lang.String;
                                                var7 |= 2;
                                                var2 = var10;
                                                break label124;
                                             case 34:
                                                var38 = var51.v(var50, 34, C0.a, var38) as java.lang.String;
                                                var7 |= 4;
                                                var3 = var2;
                                                var2 = var10;
                                                break label124;
                                             default:
                                                throw new n(var3);
                                          }

                                          var25 = (java.lang.String)var24;
                                          var24 = var27;
                                          var207 = var31;
                                          var27 = var172;
                                          break label183;
                                       }

                                       var27 = var25;
                                       var207 = var31;
                                       var25 = (java.lang.String)var24;
                                       var24 = var172;
                                       break label183;
                                    }

                                    var24 = var27;
                                    var25 = (java.lang.String)var24;
                                    var27 = var31;
                                    var31 = var25;
                                    break label182;
                                 }

                                 var31 = var27;
                                 var27 = var207;
                                 break label182;
                              }

                              var16 = var19;
                              var14 = (java.lang.String)var102;
                              var23 = var62;
                              var22 = var15;
                              var102 = var66;
                              var97 = var14;
                              var19 = (java.lang.String)var16;
                              var18 = var17;
                              var17 = var18;
                              var15 = (java.lang.String)var97;
                              var66 = var22;
                              var62 = var23;
                              break label144;
                           }

                           var17 = var18;
                           var16 = var19;
                           var15 = (java.lang.String)var97;
                           var14 = (java.lang.String)var102;
                           var66 = var22;
                           var23 = var62;
                           var172 = (java.lang.String)var24;
                           var24 = var25;
                           var10 = var3;
                           var207 = var27;
                           var25 = (java.lang.String)var28;
                           var62 = var23;
                           var18 = var17;
                           var19 = (java.lang.String)var16;
                           var97 = var14;
                           var102 = var66;
                           var22 = var15;
                           var27 = var29;
                           var28 = var31;
                           var3 = var2;
                           break label145;
                        }

                        var17 = var18;
                        var16 = var19;
                        var15 = (java.lang.String)var97;
                        var14 = (java.lang.String)var102;
                        var66 = var22;
                        var23 = var62;
                        var172 = (java.lang.String)var27;
                        var207 = var31;
                        var25 = var29;
                        var62 = var23;
                        var18 = var17;
                        var19 = (java.lang.String)var16;
                        var97 = var14;
                        var102 = var66;
                        var22 = var15;
                        var27 = var28;
                        var28 = var25;
                        var3 = var2;
                        break label145;
                     }

                     var17 = var18;
                     var16 = var19;
                     var15 = (java.lang.String)var97;
                     var14 = (java.lang.String)var102;
                     var66 = var22;
                     var62 = var23;
                     var25 = (java.lang.String)var28;
                     var172 = (java.lang.String)var27;
                     var207 = var31;
                     var18 = var17;
                     var19 = (java.lang.String)var16;
                     var97 = var14;
                     var102 = var66;
                     var22 = var15;
                     var23 = var62;
                     var27 = var29;
                     var28 = var25;
                     var3 = var2;
                     break label145;
                  }

                  var25 = (java.lang.String)var28;
                  var172 = (java.lang.String)var27;
                  var10 = var2;
                  var207 = var31;
                  var27 = var29;
                  var28 = var25;
               }

               var17 = var18;
               var16 = var19;
               var14 = (java.lang.String)var97;
               var66 = (java.lang.String)var102;
               var15 = var22;
               var25 = (java.lang.String)var28;
               var2 = var3;
               var27 = var172;
               var31 = var207;
               var28 = var25;
               var29 = (java.lang.String)var27;
               var18 = var17;
               var19 = (java.lang.String)var16;
               var97 = var15;
               var102 = var14;
               var22 = var66;
               var23 = var62;
               var62 = var23;
            }

            var29 = var25;
            var38 = (java.lang.String)var27;
            var30 = (java.lang.String)var24;
            var3 = var6;
            var6 = var4;
            var53 = var38;
            var14 = var54;
            var4 = var2;
            var2 = var9;
            var15 = var62;
            var62 = var23;
            var16 = var22;
            var17 = var102;
            var66 = (java.lang.String)var97;
            var18 = var19;
            var19 = (java.lang.String)var18;
            var22 = (java.lang.String)var17;
            var97 = var16;
            var102 = var14;
            var27 = var66;
            var26 = var15;
            var23 = var26;
            var25 = var30;
            var24 = var29;
         }

         var51.b(var50);
         return new GuildProfileInviteEmbedImpl(
            var10,
            var7,
            (Integer)var36,
            (Integer)var39,
            (Integer)var33,
            var30,
            (Integer)var31,
            var29,
            var5,
            var6,
            (java.lang.Boolean)var32,
            (java.lang.Boolean)var34,
            var3,
            var38,
            (Integer)var35,
            (Integer)var37,
            (java.lang.Boolean)var28,
            (Integer)var24,
            var25,
            var23,
            var26,
            (Integer)var27,
            (Integer)var102,
            (Integer)var97,
            var22,
            var19,
            (Integer)var18,
            var66,
            (InviteType)var17,
            (CodedLinkExtendedType)var16,
            var62,
            var15,
            var2,
            var4,
            var11,
            var14,
            var53,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: GuildProfileInviteEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         GuildProfileInviteEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ka.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildProfileInviteEmbedImpl> {
         return GuildProfileInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
