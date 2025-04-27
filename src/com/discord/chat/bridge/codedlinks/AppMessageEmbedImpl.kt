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
public data class AppMessageEmbedImpl(backgroundColor: Int,
      borderColor: Int,
      headerColor: Int,
      headerText: String?,
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
      splashHasRadialGradient: Boolean? = ...,
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
      extendedType: CodedLinkExtendedType = ...,
      appId: String = ...,
      messageId: String = ...,
      title: String? = ...,
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
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelText: String?
   public open val actions: List<AppMessageActionImpl>?
   public open val appId: String
   public open val backgroundColor: Int
   public open val bannerRatio: String
   public open val bodyText: String?
   public open val bodyTextColor: Int?
   public open val borderColor: Int
   public open val canBeAccepted: Boolean?
   public open val embedCanBeTapped: Boolean?
   public open val embedUrl: String?
   public open val extendedType: CodedLinkExtendedType
   public open val gradientColors: List<Map<String, Int>>?
   public open val header: String?
   public open val headerColor: Int
   public open val headerText: String?
   public open val iconSrc: String?
   public open val info: String?
   public open val inviteSplash: String?
   public open val messageId: String
   public open val resolvingGradientEnd: Int?
   public open val resolvingGradientStart: Int?
   public open val splashHasRadialGradient: Boolean?
   public open val splashOpacity: Int?
   public open val splashUrl: String?
   public open val staticBannerSrc: String?
   public open val subtitle: String?
   public open val subtitleColor: Int?
   public open val tagline: String?
   public open val thumbnailBackgroundColor: Int?
   public open val thumbnailCornerRadius: Int?
   public open val thumbnailText: String?
   public open val thumbnailUrl: String?
   public open val title: String?
   public open val titleColor: Int?
   public open val titleText: String?
   public open val type: InviteType?

   init {
      q.h(var28, "extendedType");
      q.h(var29, "appId");
      q.h(var30, "messageId");
      q.h(var39, "bannerRatio");
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
      this.extendedType = var28;
      this.appId = var29;
      this.messageId = var30;
      this.title = var31;
      this.header = var32;
      this.info = var33;
      this.tagline = var34;
      this.gradientColors = var35;
      this.staticBannerSrc = var36;
      this.iconSrc = var37;
      this.embedUrl = var38;
      this.bannerRatio = var39;
      this.actions = var40;
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

   public operator fun component28(): CodedLinkExtendedType {
      return this.extendedType;
   }

   public operator fun component29(): String {
      return this.appId;
   }

   public operator fun component3(): Int {
      return this.headerColor;
   }

   public operator fun component30(): String {
      return this.messageId;
   }

   public operator fun component31(): String? {
      return this.title;
   }

   public operator fun component32(): String? {
      return this.header;
   }

   public operator fun component33(): String? {
      return this.info;
   }

   public operator fun component34(): String? {
      return this.tagline;
   }

   public operator fun component35(): List<Map<String, Int>>? {
      return this.gradientColors;
   }

   public operator fun component36(): String? {
      return this.staticBannerSrc;
   }

   public operator fun component37(): String? {
      return this.iconSrc;
   }

   public operator fun component38(): String? {
      return this.embedUrl;
   }

   public operator fun component39(): String {
      return this.bannerRatio;
   }

   public operator fun component4(): String? {
      return this.headerText;
   }

   public operator fun component40(): List<AppMessageActionImpl>? {
      return this.actions;
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
      extendedType: CodedLinkExtendedType = var0.extendedType,
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
      q.h(var28, "extendedType");
      q.h(var29, "appId");
      q.h(var30, "messageId");
      q.h(var39, "bannerRatio");
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
         var39,
         var40
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
         } else if (!q.c(this.headerText, var1.headerText)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.acceptLabelBackgroundColor, var1.acceptLabelBackgroundColor)) {
            return false;
         } else if (!q.c(this.acceptLabelBorderColor, var1.acceptLabelBorderColor)) {
            return false;
         } else if (!q.c(this.acceptLabelColor, var1.acceptLabelColor)) {
            return false;
         } else if (!q.c(this.acceptLabelText, var1.acceptLabelText)) {
            return false;
         } else if (!q.c(this.bodyText, var1.bodyText)) {
            return false;
         } else if (!q.c(this.bodyTextColor, var1.bodyTextColor)) {
            return false;
         } else if (!q.c(this.canBeAccepted, var1.canBeAccepted)) {
            return false;
         } else if (!q.c(this.embedCanBeTapped, var1.embedCanBeTapped)) {
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
         } else if (this.extendedType != var1.extendedType) {
            return false;
         } else if (!q.c(this.appId, var1.appId)) {
            return false;
         } else if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.title, var1.title)) {
            return false;
         } else if (!q.c(this.header, var1.header)) {
            return false;
         } else if (!q.c(this.info, var1.info)) {
            return false;
         } else if (!q.c(this.tagline, var1.tagline)) {
            return false;
         } else if (!q.c(this.gradientColors, var1.gradientColors)) {
            return false;
         } else if (!q.c(this.staticBannerSrc, var1.staticBannerSrc)) {
            return false;
         } else if (!q.c(this.iconSrc, var1.iconSrc)) {
            return false;
         } else if (!q.c(this.embedUrl, var1.embedUrl)) {
            return false;
         } else if (!q.c(this.bannerRatio, var1.bannerRatio)) {
            return false;
         } else {
            return q.c(this.actions, var1.actions);
         }
      }
   }

   public override fun hashCode(): Int {
      val var34: Int = Integer.hashCode(this.backgroundColor);
      val var36: Int = Integer.hashCode(this.borderColor);
      val var35: Int = Integer.hashCode(this.headerColor);
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

      val var38: Int = this.extendedType.hashCode();
      val var37: Int = this.appId.hashCode();
      val var39: Int = this.messageId.hashCode();
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

      val var40: Int = this.bannerRatio.hashCode();
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
                                                                                                                                                                                                                                                                                                                                                   (
                                                                                                                                                                                                                                                                                                                                                            var34
                                                                                                                                                                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                                                                                                                                                                               + var36
                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                      + var35
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
                                                                                                   + var39
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
                  + var40
            )
            * 31
         + var33;
   }

   public override fun toString(): String {
      val var1: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var36: java.lang.String = this.headerText;
      val var29: InviteType = this.type;
      val var16: Int = this.acceptLabelBackgroundColor;
      val var8: Int = this.acceptLabelBorderColor;
      val var9: Int = this.acceptLabelColor;
      val var33: java.lang.String = this.acceptLabelText;
      val var35: java.lang.String = this.bodyText;
      val var37: Int = this.bodyTextColor;
      val var24: java.lang.Boolean = this.canBeAccepted;
      val var34: java.lang.Boolean = this.embedCanBeTapped;
      val var22: Int = this.resolvingGradientEnd;
      val var40: Int = this.resolvingGradientStart;
      val var4: java.lang.Boolean = this.splashHasRadialGradient;
      val var6: Int = this.splashOpacity;
      val var14: java.lang.String = this.splashUrl;
      val var19: java.lang.String = this.inviteSplash;
      val var26: java.lang.String = this.subtitle;
      val var20: Int = this.subtitleColor;
      val var41: Int = this.thumbnailBackgroundColor;
      val var31: Int = this.thumbnailCornerRadius;
      val var28: java.lang.String = this.thumbnailText;
      val var30: java.lang.String = this.thumbnailUrl;
      val var11: Int = this.titleColor;
      val var32: java.lang.String = this.titleText;
      val var23: CodedLinkExtendedType = this.extendedType;
      val var12: java.lang.String = this.appId;
      val var17: java.lang.String = this.messageId;
      val var21: java.lang.String = this.title;
      val var18: java.lang.String = this.header;
      val var7: java.lang.String = this.info;
      val var10: java.lang.String = this.tagline;
      val var39: java.util.List = this.gradientColors;
      val var15: java.lang.String = this.staticBannerSrc;
      val var13: java.lang.String = this.iconSrc;
      val var27: java.lang.String = this.embedUrl;
      val var5: java.lang.String = this.bannerRatio;
      val var38: java.util.List = this.actions;
      val var25: StringBuilder = new StringBuilder();
      var25.append("AppMessageEmbedImpl(backgroundColor=");
      var25.append(var1);
      var25.append(", borderColor=");
      var25.append(var2);
      var25.append(", headerColor=");
      var25.append(var3);
      var25.append(", headerText=");
      var25.append(var36);
      var25.append(", type=");
      var25.append(var29);
      var25.append(", acceptLabelBackgroundColor=");
      var25.append(var16);
      var25.append(", acceptLabelBorderColor=");
      var25.append(var8);
      var25.append(", acceptLabelColor=");
      var25.append(var9);
      var25.append(", acceptLabelText=");
      var25.append(var33);
      var25.append(", bodyText=");
      var25.append(var35);
      var25.append(", bodyTextColor=");
      var25.append(var37);
      var25.append(", canBeAccepted=");
      var25.append(var24);
      var25.append(", embedCanBeTapped=");
      var25.append(var34);
      var25.append(", resolvingGradientEnd=");
      var25.append(var22);
      var25.append(", resolvingGradientStart=");
      var25.append(var40);
      var25.append(", splashHasRadialGradient=");
      var25.append(var4);
      var25.append(", splashOpacity=");
      var25.append(var6);
      var25.append(", splashUrl=");
      var25.append(var14);
      var25.append(", inviteSplash=");
      var25.append(var19);
      var25.append(", subtitle=");
      var25.append(var26);
      var25.append(", subtitleColor=");
      var25.append(var20);
      var25.append(", thumbnailBackgroundColor=");
      var25.append(var41);
      var25.append(", thumbnailCornerRadius=");
      var25.append(var31);
      var25.append(", thumbnailText=");
      var25.append(var28);
      var25.append(", thumbnailUrl=");
      var25.append(var30);
      var25.append(", titleColor=");
      var25.append(var11);
      var25.append(", titleText=");
      var25.append(var32);
      var25.append(", extendedType=");
      var25.append(var23);
      var25.append(", appId=");
      var25.append(var12);
      var25.append(", messageId=");
      var25.append(var17);
      var25.append(", title=");
      var25.append(var21);
      var25.append(", header=");
      var25.append(var18);
      var25.append(", info=");
      var25.append(var7);
      var25.append(", tagline=");
      var25.append(var10);
      var25.append(", gradientColors=");
      var25.append(var39);
      var25.append(", staticBannerSrc=");
      var25.append(var15);
      var25.append(", iconSrc=");
      var25.append(var13);
      var25.append(", embedUrl=");
      var25.append(var27);
      var25.append(", bannerRatio=");
      var25.append(var5);
      var25.append(", actions=");
      var25.append(var38);
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
         val var0: AppMessageEmbedImpl.$serializer = new AppMessageEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl", var0, 40);
         var1.l("backgroundColor", false);
         var1.l("borderColor", false);
         var1.l("headerColor", false);
         var1.l("headerText", false);
         var1.l("type", true);
         var1.l("acceptLabelBackgroundColor", true);
         var1.l("acceptLabelBorderColor", true);
         var1.l("acceptLabelColor", true);
         var1.l("acceptLabelText", true);
         var1.l("bodyText", true);
         var1.l("bodyTextColor", true);
         var1.l("canBeAccepted", true);
         var1.l("embedCanBeTapped", true);
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
         var1.l("extendedType", true);
         var1.l("appId", true);
         var1.l("messageId", true);
         var1.l("title", true);
         var1.l("header", true);
         var1.l("info", true);
         var1.l("tagline", true);
         var1.l("gradientColors", true);
         var1.l("staticBannerSrc", true);
         var1.l("iconSrc", true);
         var1.l("embedUrl", true);
         var1.l("bannerRatio", true);
         var1.l("actions", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var17: Array<KSerializer> = AppMessageEmbedImpl.access$get$childSerializers$cp();
         val var10: N = N.a;
         val var9: C0 = C0.a;
         val var4: KSerializer = a.u(C0.a);
         val var3: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var11: KSerializer = a.u(var10);
         val var13: KSerializer = a.u(var10);
         val var2: KSerializer = a.u(var10);
         val var5: KSerializer = a.u(var9);
         val var1: KSerializer = a.u(var9);
         val var8: KSerializer = a.u(var10);
         val var15: h = h.a;
         return new KSerializer[]{
            var10,
            var10,
            var10,
            var4,
            var3,
            var11,
            var13,
            var2,
            var5,
            var1,
            var8,
            a.u(h.a),
            a.u(var15),
            a.u(var10),
            a.u(var10),
            a.u(var15),
            a.u(var10),
            a.u(var9),
            a.u(var9),
            a.u(var9),
            a.u(var10),
            a.u(var10),
            a.u(var10),
            a.u(var9),
            a.u(var9),
            a.u(var10),
            a.u(var9),
            CodedLinkExtendedType.Serializer.INSTANCE,
            var9,
            var9,
            a.u(var9),
            a.u(var9),
            a.u(var9),
            a.u(var9),
            a.u(var17[34]),
            a.u(var9),
            a.u(var9),
            a.u(var9),
            var9,
            a.u(var17[39])
         };
      }

      public open fun deserialize(decoder: Decoder): AppMessageEmbedImpl {
         q.h(var1, "decoder");
         val var62: SerialDescriptor = this.getDescriptor();
         val var63: c = var1.c(var62);
         val var56: Array<KSerializer> = AppMessageEmbedImpl.access$get$childSerializers$cp();
         val var9: Boolean = var63.y();
         var var2: Int = 0;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         val var6: Int;
         var var7: Int;
         var var15: Any;
         var var17: Any;
         var var20: Any;
         var var22: Any;
         var var26: Any;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var36: Any;
         var var37: Any;
         var var38: Any;
         var var39: Any;
         var var40: Any;
         var var42: Any;
         var var43: Any;
         var var44: Any;
         var var45: Any;
         var var46: Any;
         var var47: Any;
         var var48: Any;
         var var49: Any;
         val var50: Any;
         val var65: java.util.List;
         var var84: java.util.List;
         var var95: java.lang.String;
         var var103: Any;
         var var106: Any;
         var var119: Any;
         var var129: Any;
         var var143: Any;
         var var163: Any;
         var var165: Any;
         var var175: Any;
         if (var9) {
            var6 = var63.k(var62, 0);
            var2 = var63.k(var62, 1);
            var4 = var63.k(var62, 2);
            val var64: C0 = C0.a;
            var50 = var63.v(var62, 3, C0.a, null) as java.lang.String;
            var33 = var63.v(var62, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var10: N = N.a;
            var47 = var63.v(var62, 5, N.a, null) as Int;
            var26 = var63.v(var62, 6, var10, null) as Int;
            var32 = var63.v(var62, 7, var10, null) as Int;
            var43 = var63.v(var62, 8, var64, null) as java.lang.String;
            val var24: java.lang.String = var63.v(var62, 9, var64, null) as java.lang.String;
            var129 = var63.v(var62, 10, var10, null) as Int;
            val var11: h = h.a;
            var45 = var63.v(var62, 11, h.a, null) as java.lang.Boolean;
            var40 = var63.v(var62, 12, var11, null) as java.lang.Boolean;
            var30 = var63.v(var62, 13, var10, null) as Int;
            var36 = var63.v(var62, 14, var10, null) as Int;
            var48 = var63.v(var62, 15, var11, null) as java.lang.Boolean;
            var163 = var63.v(var62, 16, var10, null) as Int;
            var46 = var63.v(var62, 17, var64, null) as java.lang.String;
            var37 = var63.v(var62, 18, var64, null) as java.lang.String;
            var38 = var63.v(var62, 19, var64, null) as java.lang.String;
            var165 = var63.v(var62, 20, var10, null) as Int;
            var27 = var63.v(var62, 21, var10, null) as Int;
            var29 = var63.v(var62, 22, var10, null) as Int;
            var31 = var63.v(var62, 23, var64, null) as java.lang.String;
            var143 = var63.v(var62, 24, var64, null) as java.lang.String;
            var119 = var63.v(var62, 25, var10, null) as Int;
            val var13: java.lang.String = var63.v(var62, 26, var64, null) as java.lang.String;
            var106 = var63.m(var62, 27, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            var175 = var63.t(var62, 28);
            var103 = var63.t(var62, 29);
            var95 = var63.v(var62, 30, var64, null) as java.lang.String;
            var15 = var63.v(var62, 31, var64, null) as java.lang.String;
            var17 = var63.v(var62, 32, var64, null) as java.lang.String;
            val var14: java.lang.String = var63.v(var62, 33, var64, null) as java.lang.String;
            val var12: java.util.List = var63.v(var62, 34, var56[34], null) as java.util.List;
            val var77: java.lang.String = var63.v(var62, 35, var64, null) as java.lang.String;
            var20 = var63.v(var62, 36, var64, null) as java.lang.String;
            var22 = var63.v(var62, 37, var64, null) as java.lang.String;
            val var72: java.lang.String = var63.t(var62, 38);
            var65 = var63.v(var62, 39, var56[39], null) as java.util.List;
            var7 = 255;
            var5 = -1;
            var3 = var2;
            var28 = var24;
            var44 = var129;
            var129 = var163;
            var163 = var165;
            var49 = var143;
            var165 = var119;
            var42 = var13;
            var39 = var106;
            var106 = var175;
            var119 = var103;
            var143 = var95;
            var103 = var14;
            var84 = var12;
            var95 = var77;
            var175 = var72;
         } else {
            var var70: Boolean = true;
            var5 = 0;
            var3 = 0;
            var4 = 0;
            var var66: java.lang.String = null;
            var28 = null;
            var27 = null;
            var36 = null;
            var165 = null;
            var45 = null;
            var44 = null;
            var43 = null;
            var var78: Any = null;
            var26 = null;
            var42 = null;
            var175 = null;
            var var140: Any = null;
            var31 = null;
            var163 = null;
            var143 = null;
            var var88: Any = null;
            var29 = null;
            var30 = null;
            var37 = null;
            var32 = null;
            var103 = null;
            var95 = null;
            var17 = null;
            var106 = null;
            var20 = null;
            var119 = null;
            var22 = null;
            var129 = null;
            var15 = null;
            var var79: Any = null;
            var40 = null;
            var39 = null;
            var84 = null;
            var var73: Any = null;
            var38 = null;
            var33 = null;
            var7 = 0;

            while (var70) {
               label204: {
                  label203: {
                     label202: {
                        label201: {
                           label200: {
                              label199: {
                                 label253: {
                                    label254: {
                                       label255: {
                                          label256: {
                                             label257: {
                                                label163: {
                                                   label258: {
                                                      var var71: Int;
                                                      label218: {
                                                         var71 = var63.x(var62);
                                                         switch (var71) {
                                                            case -1:
                                                               var70 = false;
                                                               break;
                                                            case 0:
                                                               var3 = var63.k(var62, 0);
                                                               var2 |= 1;
                                                               break;
                                                            case 1:
                                                               var5 = var63.k(var62, 1);
                                                               var2 |= 2;
                                                               break;
                                                            case 2:
                                                               var4 = var63.k(var62, 2);
                                                               var2 |= 4;
                                                               break;
                                                            case 3:
                                                               var140 = var63.v(var62, 3, C0.a, var140) as java.lang.String;
                                                               var2 |= 8;
                                                               break;
                                                            case 4:
                                                               var46 = var63.v(var62, 4, InviteType.Serializer.INSTANCE, var33) as InviteType;
                                                               var2 |= 16;
                                                               var140 = var26;
                                                               var26 = var140;
                                                               var33 = var46;
                                                               break label258;
                                                            case 5:
                                                               var46 = var63.v(var62, 5, N.a, var31) as Int;
                                                               var2 |= 32;
                                                               var140 = var26;
                                                               var26 = var140;
                                                               var31 = var46;
                                                               break label258;
                                                            case 6:
                                                               var46 = var63.v(var62, 6, N.a, var26) as Int;
                                                               var2 |= 64;
                                                               var26 = var140;
                                                               var140 = var46;
                                                               break label258;
                                                            case 7:
                                                               var78 = var63.v(var62, 7, N.a, var78) as Int;
                                                               var2 |= 128;
                                                               var46 = var26;
                                                               break label257;
                                                            case 8:
                                                               var43 = var63.v(var62, 8, C0.a, var43) as java.lang.String;
                                                               var2 |= 256;
                                                               break label199;
                                                            case 9:
                                                               var163 = var63.v(var62, 9, C0.a, var163) as java.lang.String;
                                                               var2 |= 512;
                                                               break label199;
                                                            case 10:
                                                               var44 = var63.v(var62, 10, N.a, var44) as Int;
                                                               var2 |= 1024;
                                                               break label199;
                                                            case 11:
                                                               var45 = var63.v(var62, 11, h.a, var45) as java.lang.Boolean;
                                                               var2 |= 2048;
                                                               break label199;
                                                            case 12:
                                                               var143 = var63.v(var62, 12, h.a, var143) as java.lang.Boolean;
                                                               var2 |= 4096;
                                                               break label199;
                                                            case 13:
                                                               var46 = var63.v(var62, 13, N.a, var88) as Int;
                                                               var2 |= 8192;
                                                               var88 = var140;
                                                               var140 = var46;
                                                               break label200;
                                                            case 14:
                                                               var29 = var63.v(var62, 14, N.a, var29) as Int;
                                                               var2 |= 16384;
                                                               break label256;
                                                            case 15:
                                                               var30 = var63.v(var62, 15, h.a, var30) as java.lang.Boolean;
                                                               var2 |= 32768;
                                                               break label256;
                                                            case 16:
                                                               var37 = var63.v(var62, 16, N.a, var37) as Int;
                                                               var2 |= 65536;
                                                               break label201;
                                                            case 17:
                                                               var32 = var63.v(var62, 17, C0.a, var32) as java.lang.String;
                                                               var2 |= 131072;
                                                               break label201;
                                                            case 18:
                                                               var17 = var20;
                                                               var20 = var95;
                                                               val var128: java.lang.String = var63.v(var62, 18, C0.a, var103) as java.lang.String;
                                                               var2 |= 262144;
                                                               var129 = var73;
                                                               var73 = var129;
                                                               var15 = var22;
                                                               var95 = (java.lang.String)var119;
                                                               var103 = var106;
                                                               var106 = var17;
                                                               var119 = var128;
                                                               var22 = var15;
                                                               break label203;
                                                            case 19:
                                                               var47 = var63.v(var62, 19, C0.a, var95) as java.lang.String;
                                                               var2 |= 524288;
                                                               var129 = var73;
                                                               var73 = var129;
                                                               var15 = var22;
                                                               var95 = (java.lang.String)var119;
                                                               var17 = var20;
                                                               var103 = var106;
                                                               var106 = var17;
                                                               var20 = var47;
                                                               var119 = var103;
                                                               var22 = var15;
                                                               break label203;
                                                            case 20:
                                                               var46 = var63.v(var62, 20, N.a, var17) as Int;
                                                               var2 |= 1048576;
                                                               var129 = var73;
                                                               var73 = var129;
                                                               var15 = var22;
                                                               var95 = (java.lang.String)var119;
                                                               var17 = var20;
                                                               var103 = var106;
                                                               var106 = var46;
                                                               var20 = var95;
                                                               var119 = var103;
                                                               var22 = var15;
                                                               break label203;
                                                            case 21:
                                                               var106 = var63.v(var62, 21, N.a, var106) as Int;
                                                               var2 |= 2097152;
                                                               var129 = var73;
                                                               var73 = var129;
                                                               var15 = var22;
                                                               var95 = (java.lang.String)var119;
                                                               var17 = var20;
                                                               var103 = var106;
                                                               var106 = var17;
                                                               var20 = var95;
                                                               var119 = var103;
                                                               var22 = var15;
                                                               break label203;
                                                            case 22:
                                                               var20 = var63.v(var62, 22, N.a, var20) as Int;
                                                               var2 |= 4194304;
                                                               var129 = var73;
                                                               var103 = var106;
                                                               var73 = var129;
                                                               var15 = var22;
                                                               var95 = (java.lang.String)var119;
                                                               var17 = var20;
                                                               var106 = var17;
                                                               var20 = var95;
                                                               var119 = var103;
                                                               var22 = var15;
                                                               break label203;
                                                            case 23:
                                                               var48 = var63.v(var62, 23, C0.a, var119) as java.lang.String;
                                                               var2 |= 8388608;
                                                               var129 = var73;
                                                               var22 = var15;
                                                               var119 = var103;
                                                               var103 = var106;
                                                               var17 = var20;
                                                               var73 = var129;
                                                               var15 = var22;
                                                               var95 = (java.lang.String)var48;
                                                               var106 = var17;
                                                               var20 = var95;
                                                               break label203;
                                                            case 24:
                                                               var48 = var63.v(var62, 24, C0.a, var22) as java.lang.String;
                                                               var2 |= 16777216;
                                                               var129 = var73;
                                                               var22 = var15;
                                                               var103 = var106;
                                                               var17 = var20;
                                                               var95 = (java.lang.String)var119;
                                                               var73 = var129;
                                                               var15 = var48;
                                                               var106 = var17;
                                                               var20 = var95;
                                                               var119 = var103;
                                                               break label203;
                                                            case 25:
                                                               var49 = var63.v(var62, 25, N.a, var129) as Int;
                                                               var2 |= 33554432;
                                                               var129 = var73;
                                                               var103 = var106;
                                                               var17 = var20;
                                                               var95 = (java.lang.String)var119;
                                                               var15 = var22;
                                                               var73 = var49;
                                                               var106 = var17;
                                                               var20 = var95;
                                                               var119 = var103;
                                                               var22 = var15;
                                                               break label203;
                                                            case 26:
                                                               var47 = var63.v(var62, 26, C0.a, var15) as java.lang.String;
                                                               var2 |= 67108864;
                                                               var103 = var106;
                                                               var17 = var20;
                                                               var95 = (java.lang.String)var119;
                                                               var15 = var22;
                                                               var73 = var129;
                                                               var106 = var17;
                                                               var20 = var95;
                                                               var119 = var103;
                                                               var22 = var47;
                                                               var129 = var73;
                                                               break label203;
                                                            case 27:
                                                               var47 = var63.m(var62, 27, CodedLinkExtendedType.Serializer.INSTANCE, var79) as CodedLinkExtendedType;
                                                               var2 |= 134217728;
                                                               var46 = var36;
                                                               var79 = var165;
                                                               var36 = var47;
                                                               var165 = var84;
                                                               break label202;
                                                            case 28:
                                                               var40 = var63.t(var62, 28);
                                                               var2 |= 268435456;
                                                               break label255;
                                                            case 29:
                                                               var39 = var63.t(var62, 29);
                                                               var2 |= 536870912;
                                                               break label255;
                                                            case 30:
                                                               var84 = var63.v(var62, 30, C0.a, var84) as java.lang.String;
                                                               var2 |= 1073741824;
                                                               break label255;
                                                            case 31:
                                                               var46 = var63.v(var62, 31, C0.a, var73) as java.lang.String;
                                                               var2 |= Integer.MIN_VALUE;
                                                               var103 = var106;
                                                               var17 = var20;
                                                               var95 = (java.lang.String)var119;
                                                               var73 = var129;
                                                               var22 = var15;
                                                               var15 = var22;
                                                               var106 = var17;
                                                               var20 = var95;
                                                               var119 = var103;
                                                               var129 = var46;
                                                               break label203;
                                                            case 32:
                                                               var27 = var63.v(var62, 32, C0.a, var27) as java.lang.String;
                                                               var71 = 1;
                                                               break label218;
                                                            case 33:
                                                               var175 = var63.v(var62, 33, C0.a, var175) as java.lang.String;
                                                               var7 |= 2;
                                                               var46 = var36;
                                                               var47 = var165;
                                                               break label254;
                                                            case 34:
                                                               var28 = var63.v(var62, 34, var56[34], var28) as java.util.List;
                                                               var7 |= 4;
                                                               break label163;
                                                            case 35:
                                                               var66 = var63.v(var62, 35, C0.a, var66) as java.lang.String;
                                                               var71 = 8;
                                                               break label218;
                                                            case 36:
                                                               var36 = var63.v(var62, 36, C0.a, var36) as java.lang.String;
                                                               var71 = 16;
                                                               break label218;
                                                            case 37:
                                                               var165 = var63.v(var62, 37, C0.a, var165) as java.lang.String;
                                                               var71 = 32;
                                                               break label218;
                                                            case 38:
                                                               var38 = var63.t(var62, 38);
                                                               var7 |= 64;
                                                               break label253;
                                                            case 39:
                                                               var42 = var63.v(var62, 39, var56[39], var42) as java.util.List;
                                                               var7 |= 128;
                                                               break label253;
                                                            default:
                                                               throw new n(var71);
                                                         }

                                                         var140 = var26;
                                                         var26 = var140;
                                                         break label258;
                                                      }

                                                      var7 |= var71;
                                                      break label163;
                                                   }

                                                   var46 = var140;
                                                   var140 = var26;
                                                   break label257;
                                                }

                                                var47 = var165;
                                                var46 = var36;
                                                break label254;
                                             }

                                             var26 = var46;
                                             var88 = var140;
                                             var140 = var88;
                                             break label200;
                                          }

                                          var140 = var88;
                                          var88 = var140;
                                          break label200;
                                       }

                                       var46 = var36;
                                       var79 = var165;
                                       var36 = var79;
                                       var165 = var84;
                                       break label202;
                                    }

                                    var165 = var84;
                                    var36 = var79;
                                    var79 = var47;
                                    break label202;
                                 }

                                 var17 = var20;
                                 var129 = var73;
                                 var22 = var15;
                                 var119 = var103;
                                 var20 = var95;
                                 var106 = var17;
                                 var103 = var106;
                                 var95 = (java.lang.String)var119;
                                 var15 = var22;
                                 var73 = var129;
                                 break label203;
                              }

                              var103 = var106;
                              var17 = var20;
                              var95 = (java.lang.String)var119;
                              var88 = var28;
                              var79 = var140;
                              var22 = var15;
                              var46 = var36;
                              var47 = var165;
                              var84 = (java.util.List)var143;
                              var140 = var88;
                              var143 = var27;
                              var27 = var32;
                              var73 = var129;
                              var15 = var22;
                              var106 = var17;
                              var20 = var95;
                              var119 = var103;
                              var28 = var30;
                              var30 = var79;
                              var32 = var84;
                              var129 = var73;
                              break label204;
                           }

                           var84 = (java.util.List)var143;
                           var103 = var106;
                           var17 = var20;
                           var95 = (java.lang.String)var119;
                           var73 = var129;
                           var143 = var27;
                           var22 = var15;
                           var27 = var32;
                           var46 = var36;
                           var47 = var165;
                           var79 = var88;
                           var88 = var28;
                           var15 = var22;
                           var106 = var17;
                           var20 = var95;
                           var119 = var103;
                           var28 = var30;
                           var30 = var79;
                           var32 = var84;
                           var129 = var73;
                           break label204;
                        }

                        var103 = var106;
                        var17 = var20;
                        var95 = (java.lang.String)var119;
                        var15 = var22;
                        var73 = var129;
                        var88 = var28;
                        var79 = var140;
                        var84 = (java.util.List)var143;
                        var46 = var36;
                        var47 = var165;
                        var140 = var88;
                        var143 = var27;
                        var27 = var32;
                        var106 = var17;
                        var20 = var95;
                        var119 = var103;
                        var22 = var15;
                        var28 = var30;
                        var30 = var79;
                        var32 = var84;
                        var129 = var73;
                        break label204;
                     }

                     var103 = var106;
                     var17 = var20;
                     var95 = (java.lang.String)var119;
                     var15 = var22;
                     var73 = var129;
                     var84 = (java.util.List)var143;
                     var47 = var79;
                     var79 = var140;
                     var88 = var28;
                     var140 = var88;
                     var143 = var27;
                     var27 = var32;
                     var106 = var17;
                     var20 = var95;
                     var119 = var103;
                     var22 = var15;
                     var28 = var30;
                     var30 = var36;
                     var32 = var165;
                     var129 = var73;
                     break label204;
                  }

                  var88 = var28;
                  var84 = (java.util.List)var143;
                  var79 = var140;
                  var46 = var36;
                  var47 = var165;
                  var140 = var88;
                  var143 = var27;
                  var27 = var32;
                  var28 = var30;
                  var30 = var79;
                  var32 = var84;
               }

               var88 = var140;
               var17 = var106;
               var95 = (java.lang.String)var20;
               var103 = var119;
               var28 = var88;
               var27 = var143;
               var36 = var46;
               var165 = var47;
               var140 = var79;
               var143 = var84;
               var30 = var28;
               var32 = var27;
               var106 = var103;
               var20 = var17;
               var119 = var95;
               var22 = var15;
               var129 = var73;
               var15 = var22;
               var79 = var30;
               var84 = (java.util.List)var32;
               var73 = var129;
            }

            var42 = var15;
            var27 = var106;
            var129 = var37;
            var48 = var30;
            var28 = var163;
            var106 = var40;
            var119 = var39;
            var6 = var3;
            var65 = (java.util.List)var42;
            var175 = var38;
            var22 = var165;
            var20 = var36;
            var95 = var66;
            var84 = (java.util.List)var28;
            var103 = var175;
            var17 = var27;
            var15 = var73;
            var143 = var84;
            var39 = var79;
            var165 = var129;
            var49 = var22;
            var31 = var119;
            var29 = var20;
            var163 = var17;
            var38 = var95;
            var37 = var103;
            var46 = var32;
            var36 = var29;
            var30 = var88;
            var40 = var143;
            var32 = var78;
            var47 = var31;
            var50 = var140;
            var3 = var5;
            var5 = var2;
         }

         var63.b(var62);
         return new AppMessageEmbedImpl(
            var5,
            var7,
            var6,
            var3,
            var4,
            (java.lang.String)var50,
            (InviteType)var33,
            (Integer)var47,
            (Integer)var26,
            (Integer)var32,
            (java.lang.String)var43,
            (java.lang.String)var28,
            (Integer)var44,
            (java.lang.Boolean)var45,
            (java.lang.Boolean)var40,
            (Integer)var30,
            (Integer)var36,
            (java.lang.Boolean)var48,
            (Integer)var129,
            (java.lang.String)var46,
            (java.lang.String)var37,
            (java.lang.String)var38,
            (Integer)var163,
            (Integer)var27,
            (Integer)var29,
            (java.lang.String)var31,
            (java.lang.String)var49,
            (Integer)var165,
            (java.lang.String)var42,
            (CodedLinkExtendedType)var39,
            (java.lang.String)var106,
            (java.lang.String)var119,
            (java.lang.String)var143,
            (java.lang.String)var15,
            (java.lang.String)var17,
            (java.lang.String)var103,
            var84,
            var95,
            (java.lang.String)var20,
            (java.lang.String)var22,
            (java.lang.String)var175,
            var65,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: AppMessageEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         AppMessageEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AppMessageEmbedImpl> {
         return AppMessageEmbedImpl.$serializer.INSTANCE;
      }
   }
}
