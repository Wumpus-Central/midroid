package com.discord.chat.bridge.codedlinks

import fa.f
import fa.n
import ga.a
import ia.C0
import ia.G
import ia.N
import ia.h
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
      badgeIconUrl: String? = null
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
      badgeIconUrl: String? = var0.badgeIconUrl
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
         var34
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
         } else {
            return q.c(this.badgeIconUrl, var1.badgeIconUrl);
         }
      }
   }

   public override fun hashCode(): Int {
      var var27: Int = 0;
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

      val var28: Int = Integer.hashCode(this.backgroundColor);
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

      val var30: Int = Integer.hashCode(this.headerColor);
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

      val var31: Int = this.extendedType.hashCode();
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

      val var32: Int = Integer.hashCode(this.bannerColor);
      val var33: Int = Integer.hashCode(this.bannerColorSecondary);
      val var34: Int = java.lang.Boolean.hashCode(this.hasProfileOverflow);
      if (this.badgeIconUrl != null) {
         var27 = this.badgeIconUrl.hashCode();
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
                                                                                                                                                                                                                                                            + var28
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
                                                                                                                                                                                                                        + var30
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
                                                               + var31
                                                         )
                                                         * 31
                                                      + var25
                                                )
                                                * 31
                                             + var26
                                       )
                                       * 31
                                    + var32
                              )
                              * 31
                           + var33
                     )
                     * 31
                  + var34
            )
            * 31
         + var27;
   }

   public override fun toString(): String {
      val var13: Int = this.acceptLabelBackgroundColor;
      val var24: Int = this.acceptLabelBorderColor;
      val var35: Int = this.acceptLabelColor;
      val var28: java.lang.String = this.acceptLabelText;
      val var8: Int = this.bodyTextColor;
      val var33: java.lang.String = this.bodyText;
      val var1: Int = this.backgroundColor;
      val var5: Int = this.borderColor;
      val var7: java.lang.Boolean = this.canBeAccepted;
      val var25: java.lang.Boolean = this.embedCanBeTapped;
      val var4: Int = this.headerColor;
      val var16: java.lang.String = this.headerText;
      val var15: Int = this.resolvingGradientEnd;
      val var22: Int = this.resolvingGradientStart;
      val var29: java.lang.Boolean = this.splashHasRadialGradient;
      val var9: Int = this.splashOpacity;
      val var34: java.lang.String = this.splashUrl;
      val var17: java.lang.String = this.inviteSplash;
      val var30: java.lang.String = this.subtitle;
      val var23: Int = this.subtitleColor;
      val var11: Int = this.thumbnailBackgroundColor;
      val var26: Int = this.thumbnailCornerRadius;
      val var18: java.lang.String = this.thumbnailText;
      val var10: java.lang.String = this.thumbnailUrl;
      val var31: Int = this.titleColor;
      val var21: java.lang.String = this.titleText;
      val var14: InviteType = this.type;
      val var27: CodedLinkExtendedType = this.extendedType;
      val var20: java.lang.String = this.memberText;
      val var12: java.lang.String = this.onlineText;
      val var2: Int = this.bannerColor;
      val var3: Int = this.bannerColorSecondary;
      val var6: Boolean = this.hasProfileOverflow;
      val var19: java.lang.String = this.badgeIconUrl;
      val var32: StringBuilder = new StringBuilder();
      var32.append("GuildProfileInviteEmbedImpl(acceptLabelBackgroundColor=");
      var32.append(var13);
      var32.append(", acceptLabelBorderColor=");
      var32.append(var24);
      var32.append(", acceptLabelColor=");
      var32.append(var35);
      var32.append(", acceptLabelText=");
      var32.append(var28);
      var32.append(", bodyTextColor=");
      var32.append(var8);
      var32.append(", bodyText=");
      var32.append(var33);
      var32.append(", backgroundColor=");
      var32.append(var1);
      var32.append(", borderColor=");
      var32.append(var5);
      var32.append(", canBeAccepted=");
      var32.append(var7);
      var32.append(", embedCanBeTapped=");
      var32.append(var25);
      var32.append(", headerColor=");
      var32.append(var4);
      var32.append(", headerText=");
      var32.append(var16);
      var32.append(", resolvingGradientEnd=");
      var32.append(var15);
      var32.append(", resolvingGradientStart=");
      var32.append(var22);
      var32.append(", splashHasRadialGradient=");
      var32.append(var29);
      var32.append(", splashOpacity=");
      var32.append(var9);
      var32.append(", splashUrl=");
      var32.append(var34);
      var32.append(", inviteSplash=");
      var32.append(var17);
      var32.append(", subtitle=");
      var32.append(var30);
      var32.append(", subtitleColor=");
      var32.append(var23);
      var32.append(", thumbnailBackgroundColor=");
      var32.append(var11);
      var32.append(", thumbnailCornerRadius=");
      var32.append(var26);
      var32.append(", thumbnailText=");
      var32.append(var18);
      var32.append(", thumbnailUrl=");
      var32.append(var10);
      var32.append(", titleColor=");
      var32.append(var31);
      var32.append(", titleText=");
      var32.append(var21);
      var32.append(", type=");
      var32.append(var14);
      var32.append(", extendedType=");
      var32.append(var27);
      var32.append(", memberText=");
      var32.append(var20);
      var32.append(", onlineText=");
      var32.append(var12);
      var32.append(", bannerColor=");
      var32.append(var2);
      var32.append(", bannerColorSecondary=");
      var32.append(var3);
      var32.append(", hasProfileOverflow=");
      var32.append(var6);
      var32.append(", badgeIconUrl=");
      var32.append(var19);
      var32.append(")");
      return var32.toString();
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
            "com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbedImpl", var0, 34
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
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var14: N = N.a;
         val var5: KSerializer = a.u(N.a);
         val var18: KSerializer = a.u(var14);
         val var27: KSerializer = a.u(var14);
         val var29: C0 = C0.a;
         val var28: KSerializer = a.u(C0.a);
         val var1: KSerializer = a.u(var14);
         val var24: KSerializer = a.u(var29);
         val var26: h = h.a;
         return new KSerializer[]{
            var5,
            var18,
            var27,
            var28,
            var1,
            var24,
            var14,
            var14,
            a.u(h.a),
            a.u(var26),
            var14,
            a.u(var29),
            a.u(var14),
            a.u(var14),
            a.u(var26),
            a.u(var14),
            a.u(var29),
            a.u(var29),
            a.u(var29),
            a.u(var14),
            a.u(var14),
            a.u(var14),
            a.u(var29),
            a.u(var29),
            a.u(var14),
            a.u(var29),
            a.u(InviteType.Serializer.INSTANCE),
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(var29),
            a.u(var29),
            var14,
            var14,
            var26,
            a.u(var29)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildProfileInviteEmbedImpl {
         q.h(var1, "decoder");
         val var45: SerialDescriptor = this.getDescriptor();
         val var46: c = var1.c(var45);
         var var3: Int;
         val var5: Int;
         var var6: Int;
         var var7: Int;
         var var8: Int;
         var var10: Int;
         var var11: Boolean;
         var var14: Any;
         var var15: java.lang.String;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: java.lang.String;
         var var20: java.lang.String;
         var var21: Any;
         var var22: Any;
         var var24: java.lang.String;
         var var25: java.lang.String;
         val var26: Int;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var33: Any;
         var var34: Any;
         var var35: java.lang.String;
         var var36: Any;
         var var37: Any;
         var var38: java.lang.String;
         var var39: java.lang.String;
         var var48: java.lang.String;
         var var55: Int;
         var var63: java.lang.String;
         var var66: java.lang.String;
         var var116: java.lang.String;
         if (var46.y()) {
            val var12: N = N.a;
            var29 = var46.v(var45, 0, N.a, null) as Int;
            var31 = var46.v(var45, 1, var12, null) as Int;
            var30 = var46.v(var45, 2, var12, null) as Int;
            val var47: C0 = C0.a;
            var24 = var46.v(var45, 3, C0.a, null) as java.lang.String;
            var21 = var46.v(var45, 4, var12, null) as Int;
            var38 = var46.v(var45, 5, var47, null) as java.lang.String;
            var7 = var46.k(var45, 6);
            var8 = var46.k(var45, 7);
            val var13: h = h.a;
            var33 = var46.v(var45, 8, h.a, null) as java.lang.Boolean;
            val var23: java.lang.Boolean = var46.v(var45, 9, var13, null) as java.lang.Boolean;
            var3 = var46.k(var45, 10);
            var35 = var46.v(var45, 11, var47, null) as java.lang.String;
            var26 = var46.v(var45, 12, var12, null) as Int;
            var36 = var46.v(var45, 13, var12, null) as Int;
            var37 = var46.v(var45, 14, var13, null) as java.lang.Boolean;
            var28 = var46.v(var45, 15, var12, null) as Int;
            var39 = var46.v(var45, 16, var47, null) as java.lang.String;
            val var32: java.lang.String = var46.v(var45, 17, var47, null) as java.lang.String;
            var25 = var46.v(var45, 18, var47, null) as java.lang.String;
            var14 = var46.v(var45, 19, var12, null) as Int;
            var27 = var46.v(var45, 20, var12, null) as Int;
            var22 = var46.v(var45, 21, var12, null) as Int;
            var20 = var46.v(var45, 22, var47, null) as java.lang.String;
            var19 = var46.v(var45, 23, var47, null) as java.lang.String;
            var18 = var46.v(var45, 24, var12, null) as Int;
            var15 = var46.v(var45, 25, var47, null) as java.lang.String;
            var17 = var46.v(var45, 26, InviteType.Serializer.INSTANCE, null) as InviteType;
            var16 = var46.m(var45, 27, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            var63 = var46.v(var45, 28, var47, null) as java.lang.String;
            var66 = var46.v(var45, 29, var47, null) as java.lang.String;
            var55 = var46.k(var45, 30);
            val var4: Int = var46.k(var45, 31);
            var11 = var46.s(var45, 32);
            var48 = var46.v(var45, 33, var47, null) as java.lang.String;
            var6 = -1;
            var5 = 3;
            var34 = var23;
            var116 = var32;
            var10 = var55;
            var55 = var4;
         } else {
            var11 = false;
            var var60: Int = 0;
            var10 = 0;
            var var9: Int = 0;
            var8 = 0;
            var7 = 0;
            var6 = 0;
            var var61: Boolean = true;
            var27 = null;
            var38 = null;
            var48 = null;
            var37 = null;
            var36 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var29 = null;
            var30 = null;
            var21 = null;
            var var130: Any = null;
            var28 = null;
            var var125: java.lang.String = null;
            var22 = null;
            var24 = null;
            var25 = null;
            var116 = null;
            var16 = null;
            var14 = null;
            var15 = null;
            var17 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var63 = null;
            var66 = null;
            var31 = null;
            var55 = 0;

            while (var61) {
               label151: {
                  label150: {
                     label193: {
                        label194: {
                           label195: {
                              label196: {
                                 var3 = var46.x(var45);
                                 switch (var3) {
                                    case -1:
                                       var61 = false;
                                       var3 = var60;
                                       break label195;
                                    case 0:
                                       var29 = var46.v(var45, 0, N.a, var29) as Int;
                                       var3 = var60 or 1;
                                       break label195;
                                    case 1:
                                       var31 = var46.v(var45, 1, N.a, var31) as Int;
                                       var3 = var60 or 2;
                                       break label195;
                                    case 2:
                                       var30 = var46.v(var45, 2, N.a, var30) as Int;
                                       var3 = var60 or 4;
                                       break label195;
                                    case 3:
                                       var21 = var46.v(var45, 3, C0.a, var21) as java.lang.String;
                                       var3 = var60 or 8;
                                       break label195;
                                    case 4:
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       var130 = var46.v(var45, 4, N.a, var130) as Int;
                                       var60 |= 16;
                                       var20 = var66;
                                       var24 = var116;
                                       var28 = var27;
                                       var63 = var48;
                                       var22 = var28;
                                       var116 = (java.lang.String)var22;
                                       var50 = var20;
                                       var66 = var19;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var63;
                                       var27 = var24;
                                       var3 = var55;
                                       break label151;
                                    case 5:
                                       var38 = var46.v(var45, 5, C0.a, var38) as java.lang.String;
                                       var3 = var60 or 32;
                                       break label195;
                                    case 6:
                                       var7 = var46.k(var45, 6);
                                       var3 = var60 or 64;
                                       break label195;
                                    case 7:
                                       var8 = var46.k(var45, 7);
                                       var3 = var60 or 128;
                                       break label195;
                                    case 8:
                                       var33 = var46.v(var45, 8, h.a, var33) as java.lang.Boolean;
                                       var3 = var60 or 256;
                                       break label195;
                                    case 9:
                                       var34 = var46.v(var45, 9, h.a, var34) as java.lang.Boolean;
                                       var3 = var60 or 512;
                                       break label195;
                                    case 10:
                                       var9 = var46.k(var45, 10);
                                       var3 = var60 or 1024;
                                       break label195;
                                    case 11:
                                       var35 = var46.v(var45, 11, C0.a, var35) as java.lang.String;
                                       var3 = var60 or 2048;
                                       break label195;
                                    case 12:
                                       var27 = var46.v(var45, 12, N.a, var27) as Int;
                                       var3 = var60 or 4096;
                                       break label195;
                                    case 13:
                                       var36 = var46.v(var45, 13, N.a, var36) as Int;
                                       var3 = var60 or 8192;
                                       break label195;
                                    case 14:
                                       var37 = var46.v(var45, 14, h.a, var37) as java.lang.Boolean;
                                       var3 = var60 or 16384;
                                       break label195;
                                    case 15:
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       val var110: Int = var46.v(var45, 15, N.a, var28) as Int;
                                       var60 |= 32768;
                                       var20 = var66;
                                       var24 = var116;
                                       var28 = var27;
                                       var63 = var48;
                                       var22 = var110;
                                       var116 = (java.lang.String)var22;
                                       var50 = var20;
                                       var66 = var19;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var63;
                                       var27 = var24;
                                       var3 = var55;
                                       break label151;
                                    case 16:
                                       var125 = var46.v(var45, 16, C0.a, var125) as java.lang.String;
                                       var60 |= 65536;
                                       break;
                                    case 17:
                                       var22 = var46.v(var45, 17, C0.a, var22) as java.lang.String;
                                       var60 |= 131072;
                                       break;
                                    case 18:
                                       var39 = var46.v(var45, 18, C0.a, var24) as java.lang.String;
                                       var60 |= 262144;
                                       var24 = (java.lang.String)var22;
                                       break label194;
                                    case 19:
                                       var25 = var46.v(var45, 19, N.a, var25) as Int;
                                       var60 |= 524288;
                                       var39 = var116;
                                       break label193;
                                    case 20:
                                       var39 = var46.v(var45, 20, N.a, var116) as Int;
                                       var60 |= 1048576;
                                       break label193;
                                    case 21:
                                       var3 = var55;
                                       var15 = (java.lang.String)var17;
                                       var17 = var14;
                                       val var109: Int = var46.v(var45, 21, N.a, var16) as Int;
                                       var55 = var60 or 2097152;
                                       var63 = var48;
                                       var50 = var20;
                                       var66 = var19;
                                       var14 = var18;
                                       var16 = var15;
                                       var18 = var109;
                                       var19 = var63;
                                       var20 = var66;
                                       break label150;
                                    case 22:
                                       var3 = var55;
                                       val var194: java.lang.String = var46.v(var45, 22, C0.a, var14) as java.lang.String;
                                       var55 = var60 or 4194304;
                                       var20 = var66;
                                       var63 = var48;
                                       var50 = var20;
                                       var66 = var19;
                                       var14 = var18;
                                       var15 = (java.lang.String)var17;
                                       var16 = var15;
                                       var17 = var194;
                                       var18 = var16;
                                       var19 = var63;
                                       break label150;
                                    case 23:
                                       var3 = var55;
                                       val var177: java.lang.String = var46.v(var45, 23, C0.a, var15) as java.lang.String;
                                       var55 = var60 or 8388608;
                                       var20 = var66;
                                       var63 = var48;
                                       var50 = var20;
                                       var66 = var19;
                                       var14 = var18;
                                       var15 = (java.lang.String)var17;
                                       var16 = var177;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var63;
                                       break label150;
                                    case 24:
                                       var3 = var55;
                                       var17 = var46.v(var45, 24, N.a, var17) as Int;
                                       var55 = var60 or 16777216;
                                       var20 = var66;
                                       var16 = var15;
                                       var63 = var48;
                                       var50 = var20;
                                       var66 = var19;
                                       var14 = var18;
                                       var15 = (java.lang.String)var17;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var63;
                                       break label150;
                                    case 25:
                                       var3 = var55;
                                       var18 = var46.v(var45, 25, C0.a, var18) as java.lang.String;
                                       var55 = var60 or 33554432;
                                       var20 = var66;
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var63 = var48;
                                       var50 = var20;
                                       var66 = var19;
                                       var14 = var18;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var63;
                                       break label150;
                                    case 26:
                                       var3 = var55;
                                       val var190: InviteType = var46.v(var45, 26, InviteType.Serializer.INSTANCE, var19) as InviteType;
                                       var55 = var60 or 67108864;
                                       var20 = var66;
                                       var19 = var63;
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       var63 = var48;
                                       var50 = var20;
                                       var66 = var190;
                                       var17 = var14;
                                       var18 = var16;
                                       break label150;
                                    case 27:
                                       var3 = var55;
                                       val var189: CodedLinkExtendedType = var46.m(var45, 27, CodedLinkExtendedType.Serializer.INSTANCE, var20) as CodedLinkExtendedType;
                                       var55 = var60 or 134217728;
                                       var20 = var66;
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       var66 = var19;
                                       var63 = var48;
                                       var50 = var189;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var63;
                                       break label150;
                                    case 28:
                                       var3 = var55;
                                       var39 = var46.v(var45, 28, C0.a, var63) as java.lang.String;
                                       var55 = var60 or 268435456;
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       var66 = var19;
                                       var63 = var48;
                                       var50 = var20;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var39;
                                       var20 = var66;
                                       break label150;
                                    case 29:
                                       var3 = var55;
                                       var39 = var46.v(var45, 29, C0.a, var66) as java.lang.String;
                                       var55 = var60 or 536870912;
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       var66 = var19;
                                       var19 = var63;
                                       var63 = var48;
                                       var50 = var20;
                                       var17 = var14;
                                       var18 = var16;
                                       var20 = var39;
                                       break label150;
                                    case 30:
                                       var3 = var55;
                                       var10 = var46.k(var45, 30);
                                       var55 = var60 or 1073741824;
                                       var39 = var48;
                                       break label196;
                                    case 31:
                                       var3 = var46.k(var45, 31);
                                       var55 = var60 or Integer.MIN_VALUE;
                                       var39 = var48;
                                       break label196;
                                    case 32:
                                       var3 = var55;
                                       var11 = var46.s(var45, 32);
                                       var6 |= 1;
                                       var39 = var48;
                                       var55 = var60;
                                       break label196;
                                    case 33:
                                       var39 = var46.v(var45, 33, C0.a, var48) as java.lang.String;
                                       var6 |= 2;
                                       var3 = var55;
                                       var55 = var60;
                                       break label196;
                                    default:
                                       throw new n(var3);
                                 }

                                 var39 = var24;
                                 var24 = (java.lang.String)var22;
                                 break label194;
                              }

                              var14 = var18;
                              var50 = var20;
                              var20 = var66;
                              var19 = var63;
                              var18 = var16;
                              var17 = var14;
                              var16 = var15;
                              var15 = (java.lang.String)var17;
                              var66 = var19;
                              var63 = var39;
                              break label150;
                           }

                           var16 = var15;
                           var15 = (java.lang.String)var17;
                           var14 = var18;
                           var20 = var66;
                           var24 = var116;
                           var28 = var27;
                           var63 = var48;
                           var60 = var3;
                           var22 = var28;
                           var116 = (java.lang.String)var22;
                           var50 = var20;
                           var66 = var19;
                           var17 = var14;
                           var18 = var16;
                           var19 = var63;
                           var27 = var24;
                           var3 = var55;
                           break label151;
                        }

                        var16 = var15;
                        var15 = (java.lang.String)var17;
                        var14 = var18;
                        var66 = var19;
                        var22 = var28;
                        var19 = var63;
                        var28 = var27;
                        var63 = var48;
                        var116 = var24;
                        var24 = var116;
                        var50 = var20;
                        var17 = var14;
                        var18 = var16;
                        var27 = var39;
                        var20 = var66;
                        var3 = var55;
                        break label151;
                     }

                     var16 = var15;
                     var15 = (java.lang.String)var17;
                     var14 = var18;
                     var66 = var19;
                     var116 = (java.lang.String)var22;
                     var22 = var28;
                     var28 = var27;
                     var63 = var48;
                     var24 = var39;
                     var50 = var20;
                     var17 = var14;
                     var18 = var16;
                     var19 = var63;
                     var27 = var24;
                     var20 = var66;
                     var3 = var55;
                     break label151;
                  }

                  var24 = var116;
                  var116 = (java.lang.String)var22;
                  var22 = var28;
                  var28 = var27;
                  var60 = var55;
                  var27 = var24;
               }

               var22 = var116;
               var116 = var24;
               var15 = (java.lang.String)var16;
               var14 = var17;
               var16 = var18;
               var24 = (java.lang.String)var27;
               var55 = var3;
               var27 = var28;
               var48 = var63;
               var28 = var22;
               var17 = var15;
               var18 = var14;
               var19 = var66;
               var20 = (java.lang.String)var50;
               var63 = var19;
               var66 = var20;
            }

            var18 = var17;
            var14 = var25;
            var25 = var24;
            var39 = var125;
            var24 = (java.lang.String)var21;
            var26 = (Integer)var27;
            var5 = var6;
            var16 = var20;
            var17 = var19;
            var15 = (java.lang.String)var18;
            var19 = var15;
            var20 = (java.lang.String)var14;
            var22 = var16;
            var27 = var116;
            var116 = (java.lang.String)var22;
            var3 = var9;
            var21 = var130;
            var6 = var60;
         }

         var46.b(var45);
         return new GuildProfileInviteEmbedImpl(
            var6,
            var5,
            (Integer)var29,
            (Integer)var31,
            (Integer)var30,
            var24,
            (Integer)var21,
            var38,
            var7,
            var8,
            (java.lang.Boolean)var33,
            (java.lang.Boolean)var34,
            var3,
            var35,
            var26,
            (Integer)var36,
            (java.lang.Boolean)var37,
            (Integer)var28,
            var39,
            var116,
            var25,
            (Integer)var14,
            (Integer)var27,
            (Integer)var22,
            var20,
            var19,
            (Integer)var18,
            var15,
            (InviteType)var17,
            (CodedLinkExtendedType)var16,
            var63,
            var66,
            var10,
            var55,
            var11,
            var48,
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
         return ia.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildProfileInviteEmbedImpl> {
         return GuildProfileInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
