package com.discord.chat.bridge.codedlinks

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
import ba.h
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
      val var34: Int = Integer.hashCode(this.bannerColorSecondary);
      val var33: Int = java.lang.Boolean.hashCode(this.hasProfileOverflow);
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
                           + var34
                     )
                     * 31
                  + var33
            )
            * 31
         + var27;
   }

   public override fun toString(): String {
      val var14: Int = this.acceptLabelBackgroundColor;
      val var27: Int = this.acceptLabelBorderColor;
      val var11: Int = this.acceptLabelColor;
      val var20: java.lang.String = this.acceptLabelText;
      val var7: Int = this.bodyTextColor;
      val var34: java.lang.String = this.bodyText;
      val var4: Int = this.backgroundColor;
      val var5: Int = this.borderColor;
      val var35: java.lang.Boolean = this.canBeAccepted;
      val var10: java.lang.Boolean = this.embedCanBeTapped;
      val var2: Int = this.headerColor;
      val var8: java.lang.String = this.headerText;
      val var28: Int = this.resolvingGradientEnd;
      val var19: Int = this.resolvingGradientStart;
      val var21: java.lang.Boolean = this.splashHasRadialGradient;
      val var23: Int = this.splashOpacity;
      val var9: java.lang.String = this.splashUrl;
      val var29: java.lang.String = this.inviteSplash;
      val var15: java.lang.String = this.subtitle;
      val var33: Int = this.subtitleColor;
      val var17: Int = this.thumbnailBackgroundColor;
      val var30: Int = this.thumbnailCornerRadius;
      val var18: java.lang.String = this.thumbnailText;
      val var24: java.lang.String = this.thumbnailUrl;
      val var13: Int = this.titleColor;
      val var25: java.lang.String = this.titleText;
      val var32: InviteType = this.type;
      val var31: CodedLinkExtendedType = this.extendedType;
      val var16: java.lang.String = this.memberText;
      val var12: java.lang.String = this.onlineText;
      val var3: Int = this.bannerColor;
      val var1: Int = this.bannerColorSecondary;
      val var6: Boolean = this.hasProfileOverflow;
      val var22: java.lang.String = this.badgeIconUrl;
      val var26: StringBuilder = new StringBuilder();
      var26.append("GuildProfileInviteEmbedImpl(acceptLabelBackgroundColor=");
      var26.append(var14);
      var26.append(", acceptLabelBorderColor=");
      var26.append(var27);
      var26.append(", acceptLabelColor=");
      var26.append(var11);
      var26.append(", acceptLabelText=");
      var26.append(var20);
      var26.append(", bodyTextColor=");
      var26.append(var7);
      var26.append(", bodyText=");
      var26.append(var34);
      var26.append(", backgroundColor=");
      var26.append(var4);
      var26.append(", borderColor=");
      var26.append(var5);
      var26.append(", canBeAccepted=");
      var26.append(var35);
      var26.append(", embedCanBeTapped=");
      var26.append(var10);
      var26.append(", headerColor=");
      var26.append(var2);
      var26.append(", headerText=");
      var26.append(var8);
      var26.append(", resolvingGradientEnd=");
      var26.append(var28);
      var26.append(", resolvingGradientStart=");
      var26.append(var19);
      var26.append(", splashHasRadialGradient=");
      var26.append(var21);
      var26.append(", splashOpacity=");
      var26.append(var23);
      var26.append(", splashUrl=");
      var26.append(var9);
      var26.append(", inviteSplash=");
      var26.append(var29);
      var26.append(", subtitle=");
      var26.append(var15);
      var26.append(", subtitleColor=");
      var26.append(var33);
      var26.append(", thumbnailBackgroundColor=");
      var26.append(var17);
      var26.append(", thumbnailCornerRadius=");
      var26.append(var30);
      var26.append(", thumbnailText=");
      var26.append(var18);
      var26.append(", thumbnailUrl=");
      var26.append(var24);
      var26.append(", titleColor=");
      var26.append(var13);
      var26.append(", titleText=");
      var26.append(var25);
      var26.append(", type=");
      var26.append(var32);
      var26.append(", extendedType=");
      var26.append(var31);
      var26.append(", memberText=");
      var26.append(var16);
      var26.append(", onlineText=");
      var26.append(var12);
      var26.append(", bannerColor=");
      var26.append(var3);
      var26.append(", bannerColorSecondary=");
      var26.append(var1);
      var26.append(", hasProfileOverflow=");
      var26.append(var6);
      var26.append(", badgeIconUrl=");
      var26.append(var22);
      var26.append(")");
      return var26.toString();
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
         val var5: N = N.a;
         val var25: KSerializer = a.u(N.a);
         val var15: KSerializer = a.u(var5);
         val var6: KSerializer = a.u(var5);
         val var29: C0 = C0.a;
         val var7: KSerializer = a.u(C0.a);
         val var11: KSerializer = a.u(var5);
         val var18: KSerializer = a.u(var29);
         val var2: h = h.a;
         return new KSerializer[]{
            var25,
            var15,
            var6,
            var7,
            var11,
            var18,
            var5,
            var5,
            a.u(h.a),
            a.u(var2),
            var5,
            a.u(var29),
            a.u(var5),
            a.u(var5),
            a.u(var2),
            a.u(var5),
            a.u(var29),
            a.u(var29),
            a.u(var29),
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var29),
            a.u(var29),
            a.u(var5),
            a.u(var29),
            a.u(InviteType.Serializer.INSTANCE),
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(var29),
            a.u(var29),
            var5,
            var5,
            var2,
            a.u(var29)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildProfileInviteEmbedImpl {
         q.h(var1, "decoder");
         val var45: SerialDescriptor = this.getDescriptor();
         val var46: c = var1.c(var45);
         var var4: Int;
         var var6: Int;
         var var7: Int;
         var var8: Int;
         var var9: Int;
         var var11: Boolean;
         var var14: Any;
         var var15: java.lang.String;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: java.lang.String;
         var var20: java.lang.String;
         var var23: Any;
         var var24: Any;
         var var25: Int;
         var var26: java.lang.String;
         var var27: java.lang.String;
         var var28: Any;
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: java.lang.String;
         var var36: Any;
         var var37: Any;
         var var38: java.lang.String;
         var var39: java.lang.String;
         var var48: java.lang.String;
         var var55: Int;
         var var57: Int;
         var var62: java.lang.String;
         var var65: java.lang.String;
         var var109: java.lang.String;
         if (var46.y()) {
            val var12: N = N.a;
            var29 = var46.v(var45, 0, N.a, null) as Int;
            var31 = var46.v(var45, 1, var12, null) as Int;
            var30 = var46.v(var45, 2, var12, null) as Int;
            val var47: C0 = C0.a;
            var35 = var46.v(var45, 3, C0.a, null) as java.lang.String;
            val var21: Int = var46.v(var45, 4, var12, null) as Int;
            var38 = var46.v(var45, 5, var47, null) as java.lang.String;
            var7 = var46.k(var45, 6);
            var8 = var46.k(var45, 7);
            val var13: h = h.a;
            var33 = var46.v(var45, 8, h.a, null) as java.lang.Boolean;
            val var22: java.lang.Boolean = var46.v(var45, 9, var13, null) as java.lang.Boolean;
            var57 = var46.k(var45, 10);
            var39 = var46.v(var45, 11, var47, null) as java.lang.String;
            var25 = var46.v(var45, 12, var12, null) as Int;
            var36 = var46.v(var45, 13, var12, null) as Int;
            var37 = var46.v(var45, 14, var13, null) as java.lang.Boolean;
            var28 = var46.v(var45, 15, var12, null) as Int;
            val var40: java.lang.String = var46.v(var45, 16, var47, null) as java.lang.String;
            var27 = var46.v(var45, 17, var47, null) as java.lang.String;
            var26 = var46.v(var45, 18, var47, null) as java.lang.String;
            var14 = var46.v(var45, 19, var12, null) as Int;
            var32 = var46.v(var45, 20, var12, null) as Int;
            var23 = var46.v(var45, 21, var12, null) as Int;
            var20 = var46.v(var45, 22, var47, null) as java.lang.String;
            var19 = var46.v(var45, 23, var47, null) as java.lang.String;
            var18 = var46.v(var45, 24, var12, null) as Int;
            var15 = var46.v(var45, 25, var47, null) as java.lang.String;
            var17 = var46.v(var45, 26, InviteType.Serializer.INSTANCE, null) as InviteType;
            var16 = var46.m(var45, 27, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            var62 = var46.v(var45, 28, var47, null) as java.lang.String;
            var65 = var46.v(var45, 29, var47, null) as java.lang.String;
            var55 = var46.k(var45, 30);
            val var5: Int = var46.k(var45, 31);
            var11 = var46.s(var45, 32);
            var48 = var46.v(var45, 33, var47, null) as java.lang.String;
            var4 = -1;
            var6 = 3;
            var24 = var21;
            var34 = var22;
            var9 = var57;
            var109 = var40;
            var57 = var55;
            var55 = var5;
         } else {
            var11 = false;
            var4 = 0;
            var var10: Int = 0;
            var9 = 0;
            var8 = 0;
            var7 = 0;
            var6 = 0;
            var var61: Boolean = true;
            var var121: Int = null;
            var38 = null;
            var48 = null;
            var37 = null;
            var36 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var29 = null;
            var30 = null;
            var var108: java.lang.String = null;
            var32 = null;
            var28 = null;
            var26 = null;
            var109 = null;
            var24 = null;
            var25 = null;
            var23 = null;
            var16 = null;
            var14 = null;
            var15 = null;
            var17 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var62 = null;
            var65 = null;
            var31 = null;
            var55 = 0;

            while (var61) {
               label151: {
                  label150: {
                     label193: {
                        label194: {
                           label195: {
                              label196: {
                                 var57 = var46.x(var45);
                                 switch (var57) {
                                    case -1:
                                       var61 = false;
                                       var57 = var4;
                                       break label195;
                                    case 0:
                                       var29 = var46.v(var45, 0, N.a, var29) as Int;
                                       var57 = var4 or 1;
                                       break label195;
                                    case 1:
                                       var31 = var46.v(var45, 1, N.a, var31) as Int;
                                       var57 = var4 or 2;
                                       break label195;
                                    case 2:
                                       var30 = var46.v(var45, 2, N.a, var30) as Int;
                                       var57 = var4 or 4;
                                       break label195;
                                    case 3:
                                       var108 = var46.v(var45, 3, C0.a, var108) as java.lang.String;
                                       var57 = var4 or 8;
                                       break label195;
                                    case 4:
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       var32 = var46.v(var45, 4, N.a, var32) as Int;
                                       var4 |= 16;
                                       var20 = var65;
                                       var24 = var23;
                                       var28 = var121;
                                       var62 = var48;
                                       var109 = (java.lang.String)var28;
                                       var23 = var109;
                                       var50 = var20;
                                       var65 = var19;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var62;
                                       var27 = (java.lang.String)var24;
                                       var57 = var55;
                                       break label151;
                                    case 5:
                                       var38 = var46.v(var45, 5, C0.a, var38) as java.lang.String;
                                       var57 = var4 or 32;
                                       break label195;
                                    case 6:
                                       var7 = var46.k(var45, 6);
                                       var57 = var4 or 64;
                                       break label195;
                                    case 7:
                                       var8 = var46.k(var45, 7);
                                       var57 = var4 or 128;
                                       break label195;
                                    case 8:
                                       var33 = var46.v(var45, 8, h.a, var33) as java.lang.Boolean;
                                       var57 = var4 or 256;
                                       break label195;
                                    case 9:
                                       var34 = var46.v(var45, 9, h.a, var34) as java.lang.Boolean;
                                       var57 = var4 or 512;
                                       break label195;
                                    case 10:
                                       var9 = var46.k(var45, 10);
                                       var57 = var4 or 1024;
                                       break label195;
                                    case 11:
                                       var35 = var46.v(var45, 11, C0.a, var35) as java.lang.String;
                                       var57 = var4 or 2048;
                                       break label195;
                                    case 12:
                                       var121 = var46.v(var45, 12, N.a, var121) as Int;
                                       var57 = var4 or 4096;
                                       break label195;
                                    case 13:
                                       var36 = var46.v(var45, 13, N.a, var36) as Int;
                                       var57 = var4 or 8192;
                                       break label195;
                                    case 14:
                                       var37 = var46.v(var45, 14, h.a, var37) as java.lang.Boolean;
                                       var57 = var4 or 16384;
                                       break label195;
                                    case 15:
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       val var106: Int = var46.v(var45, 15, N.a, var28) as Int;
                                       var4 |= 32768;
                                       var20 = var65;
                                       var24 = var23;
                                       var28 = var121;
                                       var62 = var48;
                                       var109 = var106;
                                       var23 = var109;
                                       var50 = var20;
                                       var65 = var19;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var62;
                                       var27 = (java.lang.String)var24;
                                       var57 = var55;
                                       break label151;
                                    case 16:
                                       var26 = var46.v(var45, 16, C0.a, var26) as java.lang.String;
                                       var4 |= 65536;
                                       break;
                                    case 17:
                                       var109 = var46.v(var45, 17, C0.a, var109) as java.lang.String;
                                       var4 |= 131072;
                                       break;
                                    case 18:
                                       var39 = var46.v(var45, 18, C0.a, var24) as java.lang.String;
                                       var4 |= 262144;
                                       var24 = var109;
                                       break label194;
                                    case 19:
                                       var25 = var46.v(var45, 19, N.a, var25) as Int;
                                       var4 |= 524288;
                                       var39 = (java.lang.String)var23;
                                       break label193;
                                    case 20:
                                       var39 = var46.v(var45, 20, N.a, var23) as Int;
                                       var4 |= 1048576;
                                       break label193;
                                    case 21:
                                       var57 = var55;
                                       var15 = (java.lang.String)var17;
                                       var17 = var14;
                                       val var177: Int = var46.v(var45, 21, N.a, var16) as Int;
                                       var55 = var4 or 2097152;
                                       var20 = var65;
                                       var62 = var48;
                                       var50 = var20;
                                       var65 = var19;
                                       var14 = var18;
                                       var16 = var15;
                                       var18 = var177;
                                       var19 = var62;
                                       break label150;
                                    case 22:
                                       var57 = var55;
                                       val var192: java.lang.String = var46.v(var45, 22, C0.a, var14) as java.lang.String;
                                       var55 = var4 or 4194304;
                                       var20 = var65;
                                       var62 = var48;
                                       var50 = var20;
                                       var65 = var19;
                                       var14 = var18;
                                       var15 = (java.lang.String)var17;
                                       var16 = var15;
                                       var17 = var192;
                                       var18 = var16;
                                       var19 = var62;
                                       break label150;
                                    case 23:
                                       var57 = var55;
                                       val var175: java.lang.String = var46.v(var45, 23, C0.a, var15) as java.lang.String;
                                       var55 = var4 or 8388608;
                                       var20 = var65;
                                       var62 = var48;
                                       var50 = var20;
                                       var65 = var19;
                                       var14 = var18;
                                       var15 = (java.lang.String)var17;
                                       var16 = var175;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var62;
                                       break label150;
                                    case 24:
                                       var57 = var55;
                                       var17 = var46.v(var45, 24, N.a, var17) as Int;
                                       var55 = var4 or 16777216;
                                       var20 = var65;
                                       var16 = var15;
                                       var62 = var48;
                                       var50 = var20;
                                       var65 = var19;
                                       var14 = var18;
                                       var15 = (java.lang.String)var17;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var62;
                                       break label150;
                                    case 25:
                                       var57 = var55;
                                       val var189: java.lang.String = var46.v(var45, 25, C0.a, var18) as java.lang.String;
                                       var55 = var4 or 33554432;
                                       var20 = var65;
                                       var18 = var16;
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var62 = var48;
                                       var50 = var20;
                                       var65 = var19;
                                       var14 = var189;
                                       var17 = var14;
                                       var19 = var62;
                                       break label150;
                                    case 26:
                                       var57 = var55;
                                       val var188: InviteType = var46.v(var45, 26, InviteType.Serializer.INSTANCE, var19) as InviteType;
                                       var55 = var4 or 67108864;
                                       var20 = var65;
                                       var19 = var62;
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       var62 = var48;
                                       var50 = var20;
                                       var65 = var188;
                                       var17 = var14;
                                       var18 = var16;
                                       break label150;
                                    case 27:
                                       var57 = var55;
                                       val var202: CodedLinkExtendedType = var46.m(var45, 27, CodedLinkExtendedType.Serializer.INSTANCE, var20) as CodedLinkExtendedType;
                                       var55 = var4 or 134217728;
                                       var20 = var65;
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       var65 = var19;
                                       var62 = var48;
                                       var50 = var202;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var62;
                                       break label150;
                                    case 28:
                                       var57 = var55;
                                       var39 = var46.v(var45, 28, C0.a, var62) as java.lang.String;
                                       var55 = var4 or 268435456;
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       var65 = var19;
                                       var62 = var48;
                                       var50 = var20;
                                       var17 = var14;
                                       var18 = var16;
                                       var19 = var39;
                                       var20 = var65;
                                       break label150;
                                    case 29:
                                       var57 = var55;
                                       var39 = var46.v(var45, 29, C0.a, var65) as java.lang.String;
                                       var55 = var4 or 536870912;
                                       var16 = var15;
                                       var15 = (java.lang.String)var17;
                                       var14 = var18;
                                       var65 = var19;
                                       var19 = var62;
                                       var62 = var48;
                                       var50 = var20;
                                       var17 = var14;
                                       var18 = var16;
                                       var20 = var39;
                                       break label150;
                                    case 30:
                                       var57 = var55;
                                       var10 = var46.k(var45, 30);
                                       var55 = var4 or 1073741824;
                                       var39 = var48;
                                       break label196;
                                    case 31:
                                       var57 = var46.k(var45, 31);
                                       var55 = var4 or Integer.MIN_VALUE;
                                       var39 = var48;
                                       break label196;
                                    case 32:
                                       var57 = var55;
                                       var11 = var46.s(var45, 32);
                                       var6 |= 1;
                                       var39 = var48;
                                       var55 = var4;
                                       break label196;
                                    case 33:
                                       var39 = var46.v(var45, 33, C0.a, var48) as java.lang.String;
                                       var6 |= 2;
                                       var57 = var55;
                                       var55 = var4;
                                       break label196;
                                    default:
                                       throw new n(var57);
                                 }

                                 var39 = (java.lang.String)var24;
                                 var24 = var109;
                                 break label194;
                              }

                              var15 = (java.lang.String)var17;
                              var14 = var18;
                              var50 = var20;
                              var20 = var65;
                              var19 = var62;
                              var18 = var16;
                              var17 = var14;
                              var16 = var15;
                              var65 = var19;
                              var62 = var39;
                              break label150;
                           }

                           var16 = var15;
                           var15 = (java.lang.String)var17;
                           var14 = var18;
                           var20 = var65;
                           var24 = var23;
                           var28 = var121;
                           var62 = var48;
                           var4 = var57;
                           var109 = (java.lang.String)var28;
                           var23 = var109;
                           var50 = var20;
                           var65 = var19;
                           var17 = var14;
                           var18 = var16;
                           var19 = var62;
                           var27 = (java.lang.String)var24;
                           var57 = var55;
                           break label151;
                        }

                        var16 = var15;
                        var15 = (java.lang.String)var17;
                        var14 = var18;
                        var65 = var19;
                        var109 = (java.lang.String)var28;
                        var19 = var62;
                        var28 = var121;
                        var62 = var48;
                        var23 = var24;
                        var24 = var23;
                        var50 = var20;
                        var17 = var14;
                        var18 = var16;
                        var27 = var39;
                        var20 = var65;
                        var57 = var55;
                        break label151;
                     }

                     var16 = var15;
                     var15 = (java.lang.String)var17;
                     var14 = var18;
                     var65 = var19;
                     var23 = var109;
                     var109 = (java.lang.String)var28;
                     var28 = var121;
                     var62 = var48;
                     var24 = var39;
                     var50 = var20;
                     var17 = var14;
                     var18 = var16;
                     var19 = var62;
                     var27 = (java.lang.String)var24;
                     var20 = var65;
                     var57 = var55;
                     break label151;
                  }

                  var24 = var23;
                  var23 = var109;
                  var109 = (java.lang.String)var28;
                  var28 = var121;
                  var4 = var55;
                  var27 = (java.lang.String)var24;
               }

               var109 = (java.lang.String)var23;
               var23 = var24;
               var15 = (java.lang.String)var16;
               var14 = var17;
               var16 = var18;
               var24 = var27;
               var55 = var57;
               var121 = (Integer)var28;
               var48 = var62;
               var28 = var109;
               var17 = var15;
               var18 = var14;
               var19 = var65;
               var20 = (java.lang.String)var50;
               var62 = var19;
               var65 = var20;
            }

            var19 = var15;
            var14 = var25;
            var24 = var32;
            var25 = var121;
            var32 = var23;
            var57 = var10;
            var16 = var20;
            var17 = var19;
            var15 = (java.lang.String)var18;
            var18 = var17;
            var20 = (java.lang.String)var14;
            var23 = var16;
            var26 = (java.lang.String)var24;
            var27 = var109;
            var109 = var26;
            var39 = var35;
            var35 = var108;
         }

         var46.b(var45);
         return new GuildProfileInviteEmbedImpl(
            var4,
            var6,
            (Integer)var29,
            (Integer)var31,
            (Integer)var30,
            var35,
            (Integer)var24,
            var38,
            var7,
            var8,
            (java.lang.Boolean)var33,
            (java.lang.Boolean)var34,
            var9,
            var39,
            var25,
            (Integer)var36,
            (java.lang.Boolean)var37,
            (Integer)var28,
            var109,
            var27,
            var26,
            (Integer)var14,
            (Integer)var32,
            (Integer)var23,
            var20,
            var19,
            (Integer)var18,
            var15,
            (InviteType)var17,
            (CodedLinkExtendedType)var16,
            var62,
            var65,
            var57,
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
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildProfileInviteEmbedImpl> {
         return GuildProfileInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
