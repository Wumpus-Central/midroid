package com.discord.chat.bridge.codedlinks

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class AppMessageEmbedImpl(backgroundColor: Int = 0,
      borderColor: Int = 0,
      headerColor: Int = 0,
      headerText: String? = null,
      type: InviteType? = null,
      acceptLabelBackgroundColor: Int? = null,
      acceptLabelBorderColor: Int? = null,
      acceptLabelColor: Int? = null,
      acceptLabelText: String? = null,
      bodyText: String? = null,
      bodyTextColor: Int? = null,
      canBeAccepted: Boolean? = null,
      embedCanBeTapped: Boolean? = null,
      resolvingGradientEnd: Int? = null,
      resolvingGradientStart: Int? = null,
      splashHasRadialGradient: Boolean? = null,
      splashOpacity: Int? = null,
      splashUrl: String? = null,
      inviteSplash: String? = null,
      subtitle: String? = null,
      subtitleColor: Int? = null,
      thumbnailBackgroundColor: Int? = null,
      thumbnailCornerRadius: Int? = null,
      thumbnailText: String? = null,
      thumbnailUrl: String? = null,
      titleColor: Int? = null,
      titleText: String? = null,
      appId: String = "",
      messageId: String = "",
      title: String? = null,
      header: String? = null,
      info: String? = null,
      tagline: String? = null,
      gradientColors: List<Map<String, Int>>? = null,
      staticBannerSrc: String? = null,
      iconSrc: String? = null,
      embedUrl: String? = null,
      bannerRatio: String = "",
      actions: List<AppMessageActionImpl>? = null
   )
   : CodedLinkEmbed,
   AppMessageEmbed {
   public open val backgroundColor: Int
   public open val borderColor: Int
   public open val headerColor: Int
   public open val headerText: String?
   public open val type: InviteType?
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelText: String?
   public open val bodyText: String?
   public open val bodyTextColor: Int?
   public open val canBeAccepted: Boolean?
   public open val embedCanBeTapped: Boolean?
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
   public open val appId: String
   public open val messageId: String
   public open val title: String?
   public open val header: String?
   public open val info: String?
   public open val tagline: String?
   public open val gradientColors: List<Map<String, Int>>?
   public open val staticBannerSrc: String?
   public open val iconSrc: String?
   public open val embedUrl: String?
   public open val bannerRatio: String
   public open val actions: List<AppMessageActionImpl>?

   fun AppMessageEmbedImpl() {
      this(
         0,
         0,
         0,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         -1,
         127,
         null
      );
   }

   init {
      r.h(var28, "appId");
      r.h(var29, "messageId");
      r.h(var38, "bannerRatio");
      super(null);
      this.backgroundColor = var1;
      this.borderColor = var2;
      this.headerColor = var3;
      this.headerText = var4;
      this.type = var5;
      this.acceptLabelBackgroundColor = var6;
      this.acceptLabelBorderColor = var7;
      this.acceptLabelColor = var8;
      this.acceptLabelText = var9;
      this.bodyText = var10;
      this.bodyTextColor = var11;
      this.canBeAccepted = var12;
      this.embedCanBeTapped = var13;
      this.resolvingGradientEnd = var14;
      this.resolvingGradientStart = var15;
      this.splashHasRadialGradient = var16;
      this.splashOpacity = var17;
      this.splashUrl = var18;
      this.inviteSplash = var19;
      this.subtitle = var20;
      this.subtitleColor = var21;
      this.thumbnailBackgroundColor = var22;
      this.thumbnailCornerRadius = var23;
      this.thumbnailText = var24;
      this.thumbnailUrl = var25;
      this.titleColor = var26;
      this.titleText = var27;
      this.appId = var28;
      this.messageId = var29;
      this.title = var30;
      this.header = var31;
      this.info = var32;
      this.tagline = var33;
      this.gradientColors = var34;
      this.staticBannerSrc = var35;
      this.iconSrc = var36;
      this.embedUrl = var37;
      this.bannerRatio = var38;
      this.actions = var39;
   }

   public operator fun component1(): Int {
      return this.backgroundColor;
   }

   public operator fun component10(): String? {
      return this.bodyText;
   }

   public operator fun component11(): Int? {
      return this.bodyTextColor;
   }

   public operator fun component12(): Boolean? {
      return this.canBeAccepted;
   }

   public operator fun component13(): Boolean? {
      return this.embedCanBeTapped;
   }

   public operator fun component14(): Int? {
      return this.resolvingGradientEnd;
   }

   public operator fun component15(): Int? {
      return this.resolvingGradientStart;
   }

   public operator fun component16(): Boolean? {
      return this.splashHasRadialGradient;
   }

   public operator fun component17(): Int? {
      return this.splashOpacity;
   }

   public operator fun component18(): String? {
      return this.splashUrl;
   }

   public operator fun component19(): String? {
      return this.inviteSplash;
   }

   public operator fun component2(): Int {
      return this.borderColor;
   }

   public operator fun component20(): String? {
      return this.subtitle;
   }

   public operator fun component21(): Int? {
      return this.subtitleColor;
   }

   public operator fun component22(): Int? {
      return this.thumbnailBackgroundColor;
   }

   public operator fun component23(): Int? {
      return this.thumbnailCornerRadius;
   }

   public operator fun component24(): String? {
      return this.thumbnailText;
   }

   public operator fun component25(): String? {
      return this.thumbnailUrl;
   }

   public operator fun component26(): Int? {
      return this.titleColor;
   }

   public operator fun component27(): String? {
      return this.titleText;
   }

   public operator fun component28(): String {
      return this.appId;
   }

   public operator fun component29(): String {
      return this.messageId;
   }

   public operator fun component3(): Int {
      return this.headerColor;
   }

   public operator fun component30(): String? {
      return this.title;
   }

   public operator fun component31(): String? {
      return this.header;
   }

   public operator fun component32(): String? {
      return this.info;
   }

   public operator fun component33(): String? {
      return this.tagline;
   }

   public operator fun component34(): List<Map<String, Int>>? {
      return this.gradientColors;
   }

   public operator fun component35(): String? {
      return this.staticBannerSrc;
   }

   public operator fun component36(): String? {
      return this.iconSrc;
   }

   public operator fun component37(): String? {
      return this.embedUrl;
   }

   public operator fun component38(): String {
      return this.bannerRatio;
   }

   public operator fun component39(): List<AppMessageActionImpl>? {
      return this.actions;
   }

   public operator fun component4(): String? {
      return this.headerText;
   }

   public operator fun component5(): InviteType? {
      return this.type;
   }

   public operator fun component6(): Int? {
      return this.acceptLabelBackgroundColor;
   }

   public operator fun component7(): Int? {
      return this.acceptLabelBorderColor;
   }

   public operator fun component8(): Int? {
      return this.acceptLabelColor;
   }

   public operator fun component9(): String? {
      return this.acceptLabelText;
   }

   public fun copy(
      backgroundColor: Int = var0.backgroundColor,
      borderColor: Int = var0.borderColor,
      headerColor: Int = var0.headerColor,
      headerText: String? = var0.headerText,
      type: InviteType? = var0.type,
      acceptLabelBackgroundColor: Int? = var0.acceptLabelBackgroundColor,
      acceptLabelBorderColor: Int? = var0.acceptLabelBorderColor,
      acceptLabelColor: Int? = var0.acceptLabelColor,
      acceptLabelText: String? = var0.acceptLabelText,
      bodyText: String? = var0.bodyText,
      bodyTextColor: Int? = var0.bodyTextColor,
      canBeAccepted: Boolean? = var0.canBeAccepted,
      embedCanBeTapped: Boolean? = var0.embedCanBeTapped,
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
      appId: String = var0.appId,
      messageId: String = var0.messageId,
      title: String? = var0.title,
      header: String? = var0.header,
      info: String? = var0.info,
      tagline: String? = var0.tagline,
      gradientColors: List<Map<String, Int>>? = var0.gradientColors,
      staticBannerSrc: String? = var0.staticBannerSrc,
      iconSrc: String? = var0.iconSrc,
      embedUrl: String? = var0.embedUrl,
      bannerRatio: String = var0.bannerRatio,
      actions: List<AppMessageActionImpl>? = var0.actions
   ): AppMessageEmbedImpl {
      r.h(var28, "appId");
      r.h(var29, "messageId");
      r.h(var38, "bannerRatio");
      return new AppMessageEmbedImpl(
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
         var35,
         var36,
         var37,
         var38,
         var39
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AppMessageEmbedImpl) {
         return false;
      } else {
         var1 = var1;
         if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (this.borderColor != var1.borderColor) {
            return false;
         } else if (this.headerColor != var1.headerColor) {
            return false;
         } else if (!r.c(this.headerText, var1.headerText)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (!r.c(this.acceptLabelBackgroundColor, var1.acceptLabelBackgroundColor)) {
            return false;
         } else if (!r.c(this.acceptLabelBorderColor, var1.acceptLabelBorderColor)) {
            return false;
         } else if (!r.c(this.acceptLabelColor, var1.acceptLabelColor)) {
            return false;
         } else if (!r.c(this.acceptLabelText, var1.acceptLabelText)) {
            return false;
         } else if (!r.c(this.bodyText, var1.bodyText)) {
            return false;
         } else if (!r.c(this.bodyTextColor, var1.bodyTextColor)) {
            return false;
         } else if (!r.c(this.canBeAccepted, var1.canBeAccepted)) {
            return false;
         } else if (!r.c(this.embedCanBeTapped, var1.embedCanBeTapped)) {
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
         } else if (!r.c(this.appId, var1.appId)) {
            return false;
         } else if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!r.c(this.title, var1.title)) {
            return false;
         } else if (!r.c(this.header, var1.header)) {
            return false;
         } else if (!r.c(this.info, var1.info)) {
            return false;
         } else if (!r.c(this.tagline, var1.tagline)) {
            return false;
         } else if (!r.c(this.gradientColors, var1.gradientColors)) {
            return false;
         } else if (!r.c(this.staticBannerSrc, var1.staticBannerSrc)) {
            return false;
         } else if (!r.c(this.iconSrc, var1.iconSrc)) {
            return false;
         } else if (!r.c(this.embedUrl, var1.embedUrl)) {
            return false;
         } else if (!r.c(this.bannerRatio, var1.bannerRatio)) {
            return false;
         } else {
            return r.c(this.actions, var1.actions);
         }
      }
   }

   public override fun hashCode(): Int {
      val var35: Int = Integer.hashCode(this.backgroundColor);
      val var34: Int = Integer.hashCode(this.borderColor);
      val var36: Int = Integer.hashCode(this.headerColor);
      var var33: Int = 0;
      val var1: Int;
      if (this.headerText == null) {
         var1 = 0;
      } else {
         var1 = this.headerText.hashCode();
      }

      val var2: Int;
      if (this.type == null) {
         var2 = 0;
      } else {
         var2 = this.type.hashCode();
      }

      val var3: Int;
      if (this.acceptLabelBackgroundColor == null) {
         var3 = 0;
      } else {
         var3 = this.acceptLabelBackgroundColor.hashCode();
      }

      val var4: Int;
      if (this.acceptLabelBorderColor == null) {
         var4 = 0;
      } else {
         var4 = this.acceptLabelBorderColor.hashCode();
      }

      val var5: Int;
      if (this.acceptLabelColor == null) {
         var5 = 0;
      } else {
         var5 = this.acceptLabelColor.hashCode();
      }

      val var6: Int;
      if (this.acceptLabelText == null) {
         var6 = 0;
      } else {
         var6 = this.acceptLabelText.hashCode();
      }

      val var7: Int;
      if (this.bodyText == null) {
         var7 = 0;
      } else {
         var7 = this.bodyText.hashCode();
      }

      val var8: Int;
      if (this.bodyTextColor == null) {
         var8 = 0;
      } else {
         var8 = this.bodyTextColor.hashCode();
      }

      val var9: Int;
      if (this.canBeAccepted == null) {
         var9 = 0;
      } else {
         var9 = this.canBeAccepted.hashCode();
      }

      val var10: Int;
      if (this.embedCanBeTapped == null) {
         var10 = 0;
      } else {
         var10 = this.embedCanBeTapped.hashCode();
      }

      val var11: Int;
      if (this.resolvingGradientEnd == null) {
         var11 = 0;
      } else {
         var11 = this.resolvingGradientEnd.hashCode();
      }

      val var12: Int;
      if (this.resolvingGradientStart == null) {
         var12 = 0;
      } else {
         var12 = this.resolvingGradientStart.hashCode();
      }

      val var13: Int;
      if (this.splashHasRadialGradient == null) {
         var13 = 0;
      } else {
         var13 = this.splashHasRadialGradient.hashCode();
      }

      val var14: Int;
      if (this.splashOpacity == null) {
         var14 = 0;
      } else {
         var14 = this.splashOpacity.hashCode();
      }

      val var15: Int;
      if (this.splashUrl == null) {
         var15 = 0;
      } else {
         var15 = this.splashUrl.hashCode();
      }

      val var16: Int;
      if (this.inviteSplash == null) {
         var16 = 0;
      } else {
         var16 = this.inviteSplash.hashCode();
      }

      val var17: Int;
      if (this.subtitle == null) {
         var17 = 0;
      } else {
         var17 = this.subtitle.hashCode();
      }

      val var18: Int;
      if (this.subtitleColor == null) {
         var18 = 0;
      } else {
         var18 = this.subtitleColor.hashCode();
      }

      val var19: Int;
      if (this.thumbnailBackgroundColor == null) {
         var19 = 0;
      } else {
         var19 = this.thumbnailBackgroundColor.hashCode();
      }

      val var20: Int;
      if (this.thumbnailCornerRadius == null) {
         var20 = 0;
      } else {
         var20 = this.thumbnailCornerRadius.hashCode();
      }

      val var21: Int;
      if (this.thumbnailText == null) {
         var21 = 0;
      } else {
         var21 = this.thumbnailText.hashCode();
      }

      val var22: Int;
      if (this.thumbnailUrl == null) {
         var22 = 0;
      } else {
         var22 = this.thumbnailUrl.hashCode();
      }

      val var23: Int;
      if (this.titleColor == null) {
         var23 = 0;
      } else {
         var23 = this.titleColor.hashCode();
      }

      val var24: Int;
      if (this.titleText == null) {
         var24 = 0;
      } else {
         var24 = this.titleText.hashCode();
      }

      val var38: Int = this.appId.hashCode();
      val var37: Int = this.messageId.hashCode();
      val var25: Int;
      if (this.title == null) {
         var25 = 0;
      } else {
         var25 = this.title.hashCode();
      }

      val var26: Int;
      if (this.header == null) {
         var26 = 0;
      } else {
         var26 = this.header.hashCode();
      }

      val var27: Int;
      if (this.info == null) {
         var27 = 0;
      } else {
         var27 = this.info.hashCode();
      }

      val var28: Int;
      if (this.tagline == null) {
         var28 = 0;
      } else {
         var28 = this.tagline.hashCode();
      }

      val var29: Int;
      if (this.gradientColors == null) {
         var29 = 0;
      } else {
         var29 = this.gradientColors.hashCode();
      }

      val var30: Int;
      if (this.staticBannerSrc == null) {
         var30 = 0;
      } else {
         var30 = this.staticBannerSrc.hashCode();
      }

      val var31: Int;
      if (this.iconSrc == null) {
         var31 = 0;
      } else {
         var31 = this.iconSrc.hashCode();
      }

      val var32: Int;
      if (this.embedUrl == null) {
         var32 = 0;
      } else {
         var32 = this.embedUrl.hashCode();
      }

      val var39: Int = this.bannerRatio.hashCode();
      if (this.actions != null) {
         var33 = this.actions.hashCode();
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
                                                                                                                                                                                                                                                                                                               (
                                                                                                                                                                                                                                                                                                                        (
                                                                                                                                                                                                                                                                                                                                 (
                                                                                                                                                                                                                                                                                                                                          (
                                                                                                                                                                                                                                                                                                                                                   var35
                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                      + var34
                                                                                                                                                                                                                                                                                                                                                )
                                                                                                                                                                                                                                                                                                                                                * 31
                                                                                                                                                                                                                                                                                                                                             + var36
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
                                                                                                            + var38
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var37
                                                                                             )
                                                                                             * 31
                                                                                          + var25
                                                                                    )
                                                                                    * 31
                                                                                 + var26
                                                                           )
                                                                           * 31
                                                                        + var27
                                                                  )
                                                                  * 31
                                                               + var28
                                                         )
                                                         * 31
                                                      + var29
                                                )
                                                * 31
                                             + var30
                                       )
                                       * 31
                                    + var31
                              )
                              * 31
                           + var32
                     )
                     * 31
                  + var39
            )
            * 31
         + var33;
   }

   public override fun toString(): String {
      val var2: Int = this.backgroundColor;
      val var1: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var25: java.lang.String = this.headerText;
      val var31: InviteType = this.type;
      val var15: Int = this.acceptLabelBackgroundColor;
      val var32: Int = this.acceptLabelBorderColor;
      val var12: Int = this.acceptLabelColor;
      val var13: java.lang.String = this.acceptLabelText;
      val var30: java.lang.String = this.bodyText;
      val var37: Int = this.bodyTextColor;
      val var10: java.lang.Boolean = this.canBeAccepted;
      val var27: java.lang.Boolean = this.embedCanBeTapped;
      val var39: Int = this.resolvingGradientEnd;
      val var16: Int = this.resolvingGradientStart;
      val var40: java.lang.Boolean = this.splashHasRadialGradient;
      val var38: Int = this.splashOpacity;
      val var33: java.lang.String = this.splashUrl;
      val var28: java.lang.String = this.inviteSplash;
      val var20: java.lang.String = this.subtitle;
      val var19: Int = this.subtitleColor;
      val var4: Int = this.thumbnailBackgroundColor;
      val var7: Int = this.thumbnailCornerRadius;
      val var17: java.lang.String = this.thumbnailText;
      val var35: java.lang.String = this.thumbnailUrl;
      val var22: Int = this.titleColor;
      val var5: java.lang.String = this.titleText;
      val var11: java.lang.String = this.appId;
      val var18: java.lang.String = this.messageId;
      val var14: java.lang.String = this.title;
      val var6: java.lang.String = this.header;
      val var23: java.lang.String = this.info;
      val var34: java.lang.String = this.tagline;
      val var29: java.util.List = this.gradientColors;
      val var26: java.lang.String = this.staticBannerSrc;
      val var21: java.lang.String = this.iconSrc;
      val var36: java.lang.String = this.embedUrl;
      val var8: java.lang.String = this.bannerRatio;
      val var24: java.util.List = this.actions;
      val var9: StringBuilder = new StringBuilder();
      var9.append("AppMessageEmbedImpl(backgroundColor=");
      var9.append(var2);
      var9.append(", borderColor=");
      var9.append(var1);
      var9.append(", headerColor=");
      var9.append(var3);
      var9.append(", headerText=");
      var9.append(var25);
      var9.append(", type=");
      var9.append(var31);
      var9.append(", acceptLabelBackgroundColor=");
      var9.append(var15);
      var9.append(", acceptLabelBorderColor=");
      var9.append(var32);
      var9.append(", acceptLabelColor=");
      var9.append(var12);
      var9.append(", acceptLabelText=");
      var9.append(var13);
      var9.append(", bodyText=");
      var9.append(var30);
      var9.append(", bodyTextColor=");
      var9.append(var37);
      var9.append(", canBeAccepted=");
      var9.append(var10);
      var9.append(", embedCanBeTapped=");
      var9.append(var27);
      var9.append(", resolvingGradientEnd=");
      var9.append(var39);
      var9.append(", resolvingGradientStart=");
      var9.append(var16);
      var9.append(", splashHasRadialGradient=");
      var9.append(var40);
      var9.append(", splashOpacity=");
      var9.append(var38);
      var9.append(", splashUrl=");
      var9.append(var33);
      var9.append(", inviteSplash=");
      var9.append(var28);
      var9.append(", subtitle=");
      var9.append(var20);
      var9.append(", subtitleColor=");
      var9.append(var19);
      var9.append(", thumbnailBackgroundColor=");
      var9.append(var4);
      var9.append(", thumbnailCornerRadius=");
      var9.append(var7);
      var9.append(", thumbnailText=");
      var9.append(var17);
      var9.append(", thumbnailUrl=");
      var9.append(var35);
      var9.append(", titleColor=");
      var9.append(var22);
      var9.append(", titleText=");
      var9.append(var5);
      var9.append(", appId=");
      var9.append(var11);
      var9.append(", messageId=");
      var9.append(var18);
      var9.append(", title=");
      var9.append(var14);
      var9.append(", header=");
      var9.append(var6);
      var9.append(", info=");
      var9.append(var23);
      var9.append(", tagline=");
      var9.append(var34);
      var9.append(", gradientColors=");
      var9.append(var29);
      var9.append(", staticBannerSrc=");
      var9.append(var26);
      var9.append(", iconSrc=");
      var9.append(var21);
      var9.append(", embedUrl=");
      var9.append(var36);
      var9.append(", bannerRatio=");
      var9.append(var8);
      var9.append(", actions=");
      var9.append(var24);
      var9.append(")");
      return var9.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AppMessageEmbedImpl> {
         return AppMessageEmbedImpl.$serializer.INSTANCE;
      }
   }
}
