package com.discord.chat.bridge.codedlinks

import ca.f
import ca.n
import da.a
import fa.C0
import fa.G
import fa.N
import fa.h
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

      val var29: Int = Integer.hashCode(this.backgroundColor);
      val var28: Int = Integer.hashCode(this.borderColor);
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

      val var34: Int = Integer.hashCode(this.bannerColor);
      val var33: Int = Integer.hashCode(this.bannerColorSecondary);
      val var32: Int = java.lang.Boolean.hashCode(this.hasProfileOverflow);
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
                                                                                                                                                                                                                                                            + var29
                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                   + var28
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
                                    + var34
                              )
                              * 31
                           + var33
                     )
                     * 31
                  + var32
            )
            * 31
         + var27;
   }

   public override fun toString(): String {
      val var11: Int = this.acceptLabelBackgroundColor;
      val var10: Int = this.acceptLabelBorderColor;
      val var29: Int = this.acceptLabelColor;
      val var13: java.lang.String = this.acceptLabelText;
      val var12: Int = this.bodyTextColor;
      val var21: java.lang.String = this.bodyText;
      val var3: Int = this.backgroundColor;
      val var4: Int = this.borderColor;
      val var16: java.lang.Boolean = this.canBeAccepted;
      val var26: java.lang.Boolean = this.embedCanBeTapped;
      val var2: Int = this.headerColor;
      val var15: java.lang.String = this.headerText;
      val var25: Int = this.resolvingGradientEnd;
      val var22: Int = this.resolvingGradientStart;
      val var34: java.lang.Boolean = this.splashHasRadialGradient;
      val var32: Int = this.splashOpacity;
      val var19: java.lang.String = this.splashUrl;
      val var35: java.lang.String = this.inviteSplash;
      val var24: java.lang.String = this.subtitle;
      val var23: Int = this.subtitleColor;
      val var27: Int = this.thumbnailBackgroundColor;
      val var8: Int = this.thumbnailCornerRadius;
      val var7: java.lang.String = this.thumbnailText;
      val var18: java.lang.String = this.thumbnailUrl;
      val var30: Int = this.titleColor;
      val var9: java.lang.String = this.titleText;
      val var17: InviteType = this.type;
      val var31: CodedLinkExtendedType = this.extendedType;
      val var20: java.lang.String = this.memberText;
      val var14: java.lang.String = this.onlineText;
      val var5: Int = this.bannerColor;
      val var1: Int = this.bannerColorSecondary;
      val var6: Boolean = this.hasProfileOverflow;
      val var28: java.lang.String = this.badgeIconUrl;
      val var33: StringBuilder = new StringBuilder();
      var33.append("GuildProfileInviteEmbedImpl(acceptLabelBackgroundColor=");
      var33.append(var11);
      var33.append(", acceptLabelBorderColor=");
      var33.append(var10);
      var33.append(", acceptLabelColor=");
      var33.append(var29);
      var33.append(", acceptLabelText=");
      var33.append(var13);
      var33.append(", bodyTextColor=");
      var33.append(var12);
      var33.append(", bodyText=");
      var33.append(var21);
      var33.append(", backgroundColor=");
      var33.append(var3);
      var33.append(", borderColor=");
      var33.append(var4);
      var33.append(", canBeAccepted=");
      var33.append(var16);
      var33.append(", embedCanBeTapped=");
      var33.append(var26);
      var33.append(", headerColor=");
      var33.append(var2);
      var33.append(", headerText=");
      var33.append(var15);
      var33.append(", resolvingGradientEnd=");
      var33.append(var25);
      var33.append(", resolvingGradientStart=");
      var33.append(var22);
      var33.append(", splashHasRadialGradient=");
      var33.append(var34);
      var33.append(", splashOpacity=");
      var33.append(var32);
      var33.append(", splashUrl=");
      var33.append(var19);
      var33.append(", inviteSplash=");
      var33.append(var35);
      var33.append(", subtitle=");
      var33.append(var24);
      var33.append(", subtitleColor=");
      var33.append(var23);
      var33.append(", thumbnailBackgroundColor=");
      var33.append(var27);
      var33.append(", thumbnailCornerRadius=");
      var33.append(var8);
      var33.append(", thumbnailText=");
      var33.append(var7);
      var33.append(", thumbnailUrl=");
      var33.append(var18);
      var33.append(", titleColor=");
      var33.append(var30);
      var33.append(", titleText=");
      var33.append(var9);
      var33.append(", type=");
      var33.append(var17);
      var33.append(", extendedType=");
      var33.append(var31);
      var33.append(", memberText=");
      var33.append(var20);
      var33.append(", onlineText=");
      var33.append(var14);
      var33.append(", bannerColor=");
      var33.append(var5);
      var33.append(", bannerColorSecondary=");
      var33.append(var1);
      var33.append(", hasProfileOverflow=");
      var33.append(var6);
      var33.append(", badgeIconUrl=");
      var33.append(var28);
      var33.append(")");
      return var33.toString();
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
         val var28: N = N.a;
         val var15: KSerializer = a.u(N.a);
         val var26: KSerializer = a.u(var28);
         val var4: KSerializer = a.u(var28);
         val var29: C0 = C0.a;
         val var13: KSerializer = a.u(C0.a);
         val var3: KSerializer = a.u(var28);
         val var22: KSerializer = a.u(var29);
         val var16: h = h.a;
         return new KSerializer[]{
            var15,
            var26,
            var4,
            var13,
            var3,
            var22,
            var28,
            var28,
            a.u(h.a),
            a.u(var16),
            var28,
            a.u(var29),
            a.u(var28),
            a.u(var28),
            a.u(var16),
            a.u(var28),
            a.u(var29),
            a.u(var29),
            a.u(var29),
            a.u(var28),
            a.u(var28),
            a.u(var28),
            a.u(var29),
            a.u(var29),
            a.u(var28),
            a.u(var29),
            a.u(InviteType.Serializer.INSTANCE),
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(var29),
            a.u(var29),
            var28,
            var28,
            var16,
            a.u(var29)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildProfileInviteEmbedImpl {
         q.h(var1, "decoder");
         val var46: SerialDescriptor = this.getDescriptor();
         val var47: c = var1.c(var46);
         var var3: Int;
         val var5: Int;
         var var6: Int;
         var var7: Int;
         var var8: Int;
         var var10: Int;
         var var12: Boolean;
         var var15: Any;
         var var16: java.lang.String;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: java.lang.String;
         var var21: java.lang.String;
         var var23: Any;
         var var24: Any;
         var var25: java.lang.String;
         var var26: java.lang.String;
         var var27: Any;
         var var28: java.lang.String;
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var34: Any;
         var var36: java.lang.String;
         var var37: Any;
         var var38: Any;
         var var39: java.lang.String;
         var var40: Any;
         var var41: java.lang.String;
         val var42: Int;
         var var49: java.lang.String;
         var var56: Int;
         var var67: java.lang.String;
         var var70: java.lang.String;
         if (var47.y()) {
            val var13: N = N.a;
            var30 = var47.v(var46, 0, N.a, null) as Int;
            var32 = var47.v(var46, 1, var13, null) as Int;
            var31 = var47.v(var46, 2, var13, null) as Int;
            val var48: C0 = C0.a;
            var28 = var47.v(var46, 3, C0.a, null) as java.lang.String;
            var24 = var47.v(var46, 4, var13, null) as Int;
            var39 = var47.v(var46, 5, var48, null) as java.lang.String;
            var6 = var47.k(var46, 6);
            var7 = var47.k(var46, 7);
            val var14: h = h.a;
            var34 = var47.v(var46, 8, h.a, null) as java.lang.Boolean;
            var23 = var47.v(var46, 9, var14, null) as java.lang.Boolean;
            var3 = var47.k(var46, 10);
            var36 = var47.v(var46, 11, var48, null) as java.lang.String;
            var42 = var47.v(var46, 12, var13, null) as Int;
            var37 = var47.v(var46, 13, var13, null) as Int;
            var38 = var47.v(var46, 14, var14, null) as java.lang.Boolean;
            var29 = var47.v(var46, 15, var13, null) as Int;
            var25 = var47.v(var46, 16, var48, null) as java.lang.String;
            var26 = var47.v(var46, 17, var48, null) as java.lang.String;
            var41 = var47.v(var46, 18, var48, null) as java.lang.String;
            var15 = var47.v(var46, 19, var13, null) as Int;
            var40 = var47.v(var46, 20, var13, null) as Int;
            val var22: Int = var47.v(var46, 21, var13, null) as Int;
            var21 = var47.v(var46, 22, var48, null) as java.lang.String;
            var20 = var47.v(var46, 23, var48, null) as java.lang.String;
            var19 = var47.v(var46, 24, var13, null) as Int;
            var16 = var47.v(var46, 25, var48, null) as java.lang.String;
            var18 = var47.v(var46, 26, InviteType.Serializer.INSTANCE, null) as InviteType;
            var17 = var47.m(var46, 27, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            var67 = var47.v(var46, 28, var48, null) as java.lang.String;
            var70 = var47.v(var46, 29, var48, null) as java.lang.String;
            var56 = var47.k(var46, 30);
            val var4: Int = var47.k(var46, 31);
            var12 = var47.s(var46, 32);
            var49 = var47.v(var46, 33, var48, null) as java.lang.String;
            var8 = -1;
            var5 = 3;
            var27 = var22;
            var10 = var56;
            var56 = var4;
         } else {
            var12 = false;
            var var61: Int = 0;
            var10 = 0;
            var var9: Int = 0;
            var8 = 0;
            var7 = 0;
            var6 = 0;
            var var62: Boolean = true;
            var var127: Int = null;
            var39 = null;
            var49 = null;
            var38 = null;
            var37 = null;
            var36 = null;
            var var35: Any = null;
            var34 = null;
            var30 = null;
            var31 = null;
            var var115: java.lang.String = null;
            var var33: Any = null;
            var29 = null;
            var27 = null;
            var23 = null;
            var25 = null;
            var26 = null;
            var24 = null;
            var17 = null;
            var15 = null;
            var16 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var21 = null;
            var67 = null;
            var70 = null;
            var32 = null;
            var56 = 0;

            while (var62) {
               label151: {
                  label150: {
                     label193: {
                        label194: {
                           label195: {
                              label196: {
                                 var3 = var47.x(var46);
                                 switch (var3) {
                                    case -1:
                                       var62 = false;
                                       var3 = var61;
                                       break label195;
                                    case 0:
                                       var30 = var47.v(var46, 0, N.a, var30) as Int;
                                       var3 = var61 or 1;
                                       break label195;
                                    case 1:
                                       var32 = var47.v(var46, 1, N.a, var32) as Int;
                                       var3 = var61 or 2;
                                       break label195;
                                    case 2:
                                       var31 = var47.v(var46, 2, N.a, var31) as Int;
                                       var3 = var61 or 4;
                                       break label195;
                                    case 3:
                                       var115 = var47.v(var46, 3, C0.a, var115) as java.lang.String;
                                       var3 = var61 or 8;
                                       break label195;
                                    case 4:
                                       var17 = var16;
                                       var16 = (java.lang.String)var18;
                                       var15 = var19;
                                       var33 = var47.v(var46, 4, N.a, var33) as Int;
                                       var61 |= 16;
                                       var21 = var70;
                                       var25 = (java.lang.String)var24;
                                       var29 = var127;
                                       var67 = var49;
                                       var23 = var29;
                                       var24 = var23;
                                       var51 = var21;
                                       var70 = var20;
                                       var18 = var15;
                                       var19 = var17;
                                       var20 = var67;
                                       var28 = var25;
                                       var3 = var56;
                                       break label151;
                                    case 5:
                                       var39 = var47.v(var46, 5, C0.a, var39) as java.lang.String;
                                       var3 = var61 or 32;
                                       break label195;
                                    case 6:
                                       var7 = var47.k(var46, 6);
                                       var3 = var61 or 64;
                                       break label195;
                                    case 7:
                                       var8 = var47.k(var46, 7);
                                       var3 = var61 or 128;
                                       break label195;
                                    case 8:
                                       var34 = var47.v(var46, 8, h.a, var34) as java.lang.Boolean;
                                       var3 = var61 or 256;
                                       break label195;
                                    case 9:
                                       var35 = var47.v(var46, 9, h.a, var35) as java.lang.Boolean;
                                       var3 = var61 or 512;
                                       break label195;
                                    case 10:
                                       var9 = var47.k(var46, 10);
                                       var3 = var61 or 1024;
                                       break label195;
                                    case 11:
                                       var36 = var47.v(var46, 11, C0.a, var36) as java.lang.String;
                                       var3 = var61 or 2048;
                                       break label195;
                                    case 12:
                                       var127 = var47.v(var46, 12, N.a, var127) as Int;
                                       var3 = var61 or 4096;
                                       break label195;
                                    case 13:
                                       var37 = var47.v(var46, 13, N.a, var37) as Int;
                                       var3 = var61 or 8192;
                                       break label195;
                                    case 14:
                                       var38 = var47.v(var46, 14, h.a, var38) as java.lang.Boolean;
                                       var3 = var61 or 16384;
                                       break label195;
                                    case 15:
                                       var17 = var16;
                                       var16 = (java.lang.String)var18;
                                       var15 = var19;
                                       val var113: Int = var47.v(var46, 15, N.a, var29) as Int;
                                       var61 |= 32768;
                                       var21 = var70;
                                       var25 = (java.lang.String)var24;
                                       var29 = var127;
                                       var67 = var49;
                                       var23 = var113;
                                       var24 = var23;
                                       var51 = var21;
                                       var70 = var20;
                                       var18 = var15;
                                       var19 = var17;
                                       var20 = var67;
                                       var28 = var25;
                                       var3 = var56;
                                       break label151;
                                    case 16:
                                       var27 = var47.v(var46, 16, C0.a, var27) as java.lang.String;
                                       var61 |= 65536;
                                       break;
                                    case 17:
                                       var23 = var47.v(var46, 17, C0.a, var23) as java.lang.String;
                                       var61 |= 131072;
                                       break;
                                    case 18:
                                       var40 = var47.v(var46, 18, C0.a, var25) as java.lang.String;
                                       var61 |= 262144;
                                       var25 = (java.lang.String)var23;
                                       break label194;
                                    case 19:
                                       var26 = var47.v(var46, 19, N.a, var26) as Int;
                                       var61 |= 524288;
                                       var40 = var24;
                                       break label193;
                                    case 20:
                                       var40 = var47.v(var46, 20, N.a, var24) as Int;
                                       var61 |= 1048576;
                                       break label193;
                                    case 21:
                                       var3 = var56;
                                       var16 = (java.lang.String)var18;
                                       var18 = var15;
                                       val var112: Int = var47.v(var46, 21, N.a, var17) as Int;
                                       var56 = var61 or 2097152;
                                       var67 = var49;
                                       var51 = var21;
                                       var70 = var20;
                                       var15 = var19;
                                       var17 = var16;
                                       var19 = var112;
                                       var20 = var67;
                                       var21 = var70;
                                       break label150;
                                    case 22:
                                       var3 = var56;
                                       var41 = var47.v(var46, 22, C0.a, var15) as java.lang.String;
                                       var56 = var61 or 4194304;
                                       var21 = var70;
                                       var67 = var49;
                                       var51 = var21;
                                       var70 = var20;
                                       var15 = var19;
                                       var16 = (java.lang.String)var18;
                                       var17 = var16;
                                       var18 = var41;
                                       var19 = var17;
                                       var20 = var67;
                                       break label150;
                                    case 23:
                                       var3 = var56;
                                       val var195: java.lang.String = var47.v(var46, 23, C0.a, var16) as java.lang.String;
                                       var56 = var61 or 8388608;
                                       var21 = var70;
                                       var67 = var49;
                                       var51 = var21;
                                       var70 = var20;
                                       var15 = var19;
                                       var16 = (java.lang.String)var18;
                                       var17 = var195;
                                       var18 = var15;
                                       var19 = var17;
                                       var20 = var67;
                                       break label150;
                                    case 24:
                                       var3 = var56;
                                       var18 = var47.v(var46, 24, N.a, var18) as Int;
                                       var56 = var61 or 16777216;
                                       var21 = var70;
                                       var17 = var16;
                                       var67 = var49;
                                       var51 = var21;
                                       var70 = var20;
                                       var15 = var19;
                                       var16 = (java.lang.String)var18;
                                       var18 = var15;
                                       var19 = var17;
                                       var20 = var67;
                                       break label150;
                                    case 25:
                                       var3 = var56;
                                       var19 = var47.v(var46, 25, C0.a, var19) as java.lang.String;
                                       var56 = var61 or 33554432;
                                       var21 = var70;
                                       var17 = var16;
                                       var16 = (java.lang.String)var18;
                                       var67 = var49;
                                       var51 = var21;
                                       var70 = var20;
                                       var15 = var19;
                                       var18 = var15;
                                       var19 = var17;
                                       var20 = var67;
                                       break label150;
                                    case 26:
                                       var3 = var56;
                                       val var192: InviteType = var47.v(var46, 26, InviteType.Serializer.INSTANCE, var20) as InviteType;
                                       var56 = var61 or 67108864;
                                       var21 = var70;
                                       var20 = var67;
                                       var17 = var16;
                                       var16 = (java.lang.String)var18;
                                       var15 = var19;
                                       var67 = var49;
                                       var51 = var21;
                                       var70 = var192;
                                       var18 = var15;
                                       var19 = var17;
                                       break label150;
                                    case 27:
                                       var3 = var56;
                                       val var191: CodedLinkExtendedType = var47.m(var46, 27, CodedLinkExtendedType.Serializer.INSTANCE, var21) as CodedLinkExtendedType;
                                       var56 = var61 or 134217728;
                                       var21 = var70;
                                       var17 = var16;
                                       var16 = (java.lang.String)var18;
                                       var15 = var19;
                                       var70 = var20;
                                       var67 = var49;
                                       var51 = var191;
                                       var18 = var15;
                                       var19 = var17;
                                       var20 = var67;
                                       break label150;
                                    case 28:
                                       var3 = var56;
                                       var40 = var47.v(var46, 28, C0.a, var67) as java.lang.String;
                                       var56 = var61 or 268435456;
                                       var17 = var16;
                                       var16 = (java.lang.String)var18;
                                       var15 = var19;
                                       var70 = var20;
                                       var67 = var49;
                                       var51 = var21;
                                       var18 = var15;
                                       var19 = var17;
                                       var20 = (java.lang.String)var40;
                                       var21 = var70;
                                       break label150;
                                    case 29:
                                       var3 = var56;
                                       var40 = var47.v(var46, 29, C0.a, var70) as java.lang.String;
                                       var56 = var61 or 536870912;
                                       var17 = var16;
                                       var16 = (java.lang.String)var18;
                                       var15 = var19;
                                       var70 = var20;
                                       var20 = var67;
                                       var67 = var49;
                                       var51 = var21;
                                       var18 = var15;
                                       var19 = var17;
                                       var21 = (java.lang.String)var40;
                                       break label150;
                                    case 30:
                                       var3 = var56;
                                       var10 = var47.k(var46, 30);
                                       var56 = var61 or 1073741824;
                                       var40 = var49;
                                       break label196;
                                    case 31:
                                       var3 = var47.k(var46, 31);
                                       var56 = var61 or Integer.MIN_VALUE;
                                       var40 = var49;
                                       break label196;
                                    case 32:
                                       var3 = var56;
                                       var12 = var47.s(var46, 32);
                                       var6 |= 1;
                                       var40 = var49;
                                       var56 = var61;
                                       break label196;
                                    case 33:
                                       var40 = var47.v(var46, 33, C0.a, var49) as java.lang.String;
                                       var6 |= 2;
                                       var3 = var56;
                                       var56 = var61;
                                       break label196;
                                    default:
                                       throw new n(var3);
                                 }

                                 var40 = var25;
                                 var25 = (java.lang.String)var23;
                                 break label194;
                              }

                              var51 = var21;
                              var21 = var70;
                              var20 = var67;
                              var19 = var17;
                              var18 = var15;
                              var17 = var16;
                              var16 = (java.lang.String)var18;
                              var15 = var19;
                              var70 = var20;
                              var67 = (java.lang.String)var40;
                              break label150;
                           }

                           var17 = var16;
                           var16 = (java.lang.String)var18;
                           var15 = var19;
                           var21 = var70;
                           var25 = (java.lang.String)var24;
                           var29 = var127;
                           var67 = var49;
                           var61 = var3;
                           var23 = var29;
                           var24 = var23;
                           var51 = var21;
                           var70 = var20;
                           var18 = var15;
                           var19 = var17;
                           var20 = var67;
                           var28 = var25;
                           var3 = var56;
                           break label151;
                        }

                        var17 = var16;
                        var16 = (java.lang.String)var18;
                        var15 = var19;
                        var70 = var20;
                        var23 = var29;
                        var20 = var67;
                        var29 = var127;
                        var67 = var49;
                        var24 = var25;
                        var25 = (java.lang.String)var24;
                        var51 = var21;
                        var18 = var15;
                        var19 = var17;
                        var28 = (java.lang.String)var40;
                        var21 = var70;
                        var3 = var56;
                        break label151;
                     }

                     var17 = var16;
                     var16 = (java.lang.String)var18;
                     var15 = var19;
                     var70 = var20;
                     var24 = var23;
                     var23 = var29;
                     var29 = var127;
                     var67 = var49;
                     var25 = (java.lang.String)var40;
                     var51 = var21;
                     var18 = var15;
                     var19 = var17;
                     var20 = var67;
                     var28 = var25;
                     var21 = var70;
                     var3 = var56;
                     break label151;
                  }

                  var25 = (java.lang.String)var24;
                  var24 = var23;
                  var23 = var29;
                  var29 = var127;
                  var61 = var56;
                  var28 = var25;
               }

               var23 = var24;
               var24 = var25;
               var16 = (java.lang.String)var17;
               var15 = var18;
               var17 = var19;
               var25 = var28;
               var56 = var3;
               var127 = (Integer)var29;
               var49 = var67;
               var29 = var23;
               var18 = var16;
               var19 = var15;
               var20 = var70;
               var21 = (java.lang.String)var51;
               var67 = var20;
               var70 = var21;
            }

            var19 = var18;
            var15 = var26;
            var41 = var25;
            var25 = (java.lang.String)var27;
            var5 = var6;
            var17 = var21;
            var18 = var20;
            var16 = (java.lang.String)var19;
            var20 = var16;
            var21 = (java.lang.String)var15;
            var27 = var17;
            var40 = var24;
            var26 = (java.lang.String)var23;
            var42 = var127;
            var3 = var9;
            var23 = var35;
            var7 = var8;
            var6 = var7;
            var24 = var33;
            var28 = var115;
            var8 = var61;
         }

         var47.b(var46);
         return new GuildProfileInviteEmbedImpl(
            var8,
            var5,
            (Integer)var30,
            (Integer)var32,
            (Integer)var31,
            var28,
            (Integer)var24,
            var39,
            var6,
            var7,
            (java.lang.Boolean)var34,
            (java.lang.Boolean)var23,
            var3,
            var36,
            var42,
            (Integer)var37,
            (java.lang.Boolean)var38,
            (Integer)var29,
            var25,
            var26,
            var41,
            (Integer)var15,
            (Integer)var40,
            (Integer)var27,
            var21,
            var20,
            (Integer)var19,
            var16,
            (InviteType)var18,
            (CodedLinkExtendedType)var17,
            var67,
            var70,
            var10,
            var56,
            var12,
            var49,
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
         return fa.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildProfileInviteEmbedImpl> {
         return GuildProfileInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
