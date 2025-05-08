package com.discord.chat.bridge.codedlinks

import ha.f
import ha.n
import ia.a
import ka.C0
import ka.G
import ka.N
import ka.h
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
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
      q.h(var28, "appId");
      q.h(var29, "messageId");
      q.h(var38, "bannerRatio");
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
      q.h(var28, "appId");
      q.h(var29, "messageId");
      q.h(var38, "bannerRatio");
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
      val var35: Int = Integer.hashCode(this.borderColor);
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
                                                                                                                                                                                                                                                                                                                                                   var34
                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                      + var35
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
      val var12: java.lang.String = this.headerText;
      val var22: InviteType = this.type;
      val var31: Int = this.acceptLabelBackgroundColor;
      val var19: Int = this.acceptLabelBorderColor;
      val var33: Int = this.acceptLabelColor;
      val var28: java.lang.String = this.acceptLabelText;
      val var38: java.lang.String = this.bodyText;
      val var27: Int = this.bodyTextColor;
      val var4: java.lang.Boolean = this.canBeAccepted;
      val var32: java.lang.Boolean = this.embedCanBeTapped;
      val var29: Int = this.resolvingGradientEnd;
      val var35: Int = this.resolvingGradientStart;
      val var6: java.lang.Boolean = this.splashHasRadialGradient;
      val var11: Int = this.splashOpacity;
      val var20: java.lang.String = this.splashUrl;
      val var37: java.lang.String = this.inviteSplash;
      val var23: java.lang.String = this.subtitle;
      val var24: Int = this.subtitleColor;
      val var5: Int = this.thumbnailBackgroundColor;
      val var40: Int = this.thumbnailCornerRadius;
      val var17: java.lang.String = this.thumbnailText;
      val var18: java.lang.String = this.thumbnailUrl;
      val var10: Int = this.titleColor;
      val var8: java.lang.String = this.titleText;
      val var39: java.lang.String = this.appId;
      val var14: java.lang.String = this.messageId;
      val var26: java.lang.String = this.title;
      val var7: java.lang.String = this.header;
      val var36: java.lang.String = this.info;
      val var15: java.lang.String = this.tagline;
      val var21: java.util.List = this.gradientColors;
      val var34: java.lang.String = this.staticBannerSrc;
      val var16: java.lang.String = this.iconSrc;
      val var13: java.lang.String = this.embedUrl;
      val var30: java.lang.String = this.bannerRatio;
      val var9: java.util.List = this.actions;
      val var25: StringBuilder = new StringBuilder();
      var25.append("AppMessageEmbedImpl(backgroundColor=");
      var25.append(var2);
      var25.append(", borderColor=");
      var25.append(var1);
      var25.append(", headerColor=");
      var25.append(var3);
      var25.append(", headerText=");
      var25.append(var12);
      var25.append(", type=");
      var25.append(var22);
      var25.append(", acceptLabelBackgroundColor=");
      var25.append(var31);
      var25.append(", acceptLabelBorderColor=");
      var25.append(var19);
      var25.append(", acceptLabelColor=");
      var25.append(var33);
      var25.append(", acceptLabelText=");
      var25.append(var28);
      var25.append(", bodyText=");
      var25.append(var38);
      var25.append(", bodyTextColor=");
      var25.append(var27);
      var25.append(", canBeAccepted=");
      var25.append(var4);
      var25.append(", embedCanBeTapped=");
      var25.append(var32);
      var25.append(", resolvingGradientEnd=");
      var25.append(var29);
      var25.append(", resolvingGradientStart=");
      var25.append(var35);
      var25.append(", splashHasRadialGradient=");
      var25.append(var6);
      var25.append(", splashOpacity=");
      var25.append(var11);
      var25.append(", splashUrl=");
      var25.append(var20);
      var25.append(", inviteSplash=");
      var25.append(var37);
      var25.append(", subtitle=");
      var25.append(var23);
      var25.append(", subtitleColor=");
      var25.append(var24);
      var25.append(", thumbnailBackgroundColor=");
      var25.append(var5);
      var25.append(", thumbnailCornerRadius=");
      var25.append(var40);
      var25.append(", thumbnailText=");
      var25.append(var17);
      var25.append(", thumbnailUrl=");
      var25.append(var18);
      var25.append(", titleColor=");
      var25.append(var10);
      var25.append(", titleText=");
      var25.append(var8);
      var25.append(", appId=");
      var25.append(var39);
      var25.append(", messageId=");
      var25.append(var14);
      var25.append(", title=");
      var25.append(var26);
      var25.append(", header=");
      var25.append(var7);
      var25.append(", info=");
      var25.append(var36);
      var25.append(", tagline=");
      var25.append(var15);
      var25.append(", gradientColors=");
      var25.append(var21);
      var25.append(", staticBannerSrc=");
      var25.append(var34);
      var25.append(", iconSrc=");
      var25.append(var16);
      var25.append(", embedUrl=");
      var25.append(var13);
      var25.append(", bannerRatio=");
      var25.append(var30);
      var25.append(", actions=");
      var25.append(var9);
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
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl", var0, 39);
         var1.l("backgroundColor", true);
         var1.l("borderColor", true);
         var1.l("headerColor", true);
         var1.l("headerText", true);
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
         val var6: Array<KSerializer> = AppMessageEmbedImpl.access$get$childSerializers$cp();
         val var12: N = N.a;
         val var4: C0 = C0.a;
         val var10: KSerializer = a.u(C0.a);
         val var2: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var1: KSerializer = a.u(var12);
         val var5: KSerializer = a.u(var12);
         val var11: KSerializer = a.u(var12);
         val var9: KSerializer = a.u(var4);
         val var7: KSerializer = a.u(var4);
         val var8: KSerializer = a.u(var12);
         val var3: h = h.a;
         return new KSerializer[]{
            var12,
            var12,
            var12,
            var10,
            var2,
            var1,
            var5,
            var11,
            var9,
            var7,
            var8,
            a.u(h.a),
            a.u(var3),
            a.u(var12),
            a.u(var12),
            a.u(var3),
            a.u(var12),
            a.u(var4),
            a.u(var4),
            a.u(var4),
            a.u(var12),
            a.u(var12),
            a.u(var12),
            a.u(var4),
            a.u(var4),
            a.u(var12),
            a.u(var4),
            var4,
            var4,
            a.u(var4),
            a.u(var4),
            a.u(var4),
            a.u(var4),
            a.u(var6[33]),
            a.u(var4),
            a.u(var4),
            a.u(var4),
            var4,
            a.u(var6[38])
         };
      }

      public open fun deserialize(decoder: Decoder): AppMessageEmbedImpl {
         q.h(var1, "decoder");
         val var59: SerialDescriptor = this.getDescriptor();
         val var60: c = var1.c(var59);
         val var56: Array<KSerializer> = AppMessageEmbedImpl.access$get$childSerializers$cp();
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var8: Int;
         var var12: java.lang.String;
         var var16: java.lang.String;
         var var17: java.lang.String;
         var var18: java.lang.String;
         var var19: java.lang.String;
         var var20: java.lang.String;
         var var23: java.lang.String;
         var var24: java.lang.String;
         var var25: Any;
         var var26: java.lang.String;
         var var27: Any;
         var var28: Any;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         var var36: java.lang.String;
         var var37: Any;
         var var38: java.lang.String;
         var var39: Any;
         var var40: java.lang.String;
         var var41: Any;
         var var42: Any;
         var var43: Any;
         var var44: java.lang.String;
         var var45: java.lang.String;
         var var46: Any;
         var var62: Any;
         var var75: java.lang.String;
         var var84: java.lang.String;
         var var91: java.lang.String;
         var var118: java.lang.String;
         var var126: java.lang.String;
         var var160: Any;
         if (var60.y()) {
            var8 = var60.k(var59, 0);
            val var2: Int = var60.k(var59, 1);
            val var3: Int = var60.k(var59, 2);
            var62 = C0.a;
            var38 = var60.v(var59, 3, C0.a, null) as java.lang.String;
            var31 = var60.v(var59, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var9: N = N.a;
            var33 = var60.v(var59, 5, N.a, null) as Int;
            var25 = var60.v(var59, 6, var9, null) as Int;
            var32 = var60.v(var59, 7, var9, null) as Int;
            var45 = var60.v(var59, 8, (DeserializationStrategy)var62, null) as java.lang.String;
            var24 = var60.v(var59, 9, (DeserializationStrategy)var62, null) as java.lang.String;
            val var22: Int = var60.v(var59, 10, var9, null) as Int;
            val var10: h = h.a;
            var35 = var60.v(var59, 11, h.a, null) as java.lang.Boolean;
            var37 = var60.v(var59, 12, var10, null) as java.lang.Boolean;
            var41 = var60.v(var59, 13, var9, null) as Int;
            var39 = var60.v(var59, 14, var9, null) as Int;
            var28 = var60.v(var59, 15, var10, null) as java.lang.Boolean;
            var46 = var60.v(var59, 16, var9, null) as Int;
            var160 = var60.v(var59, 17, (DeserializationStrategy)var62, null) as java.lang.String;
            var44 = var60.v(var59, 18, (DeserializationStrategy)var62, null) as java.lang.String;
            var36 = var60.v(var59, 19, (DeserializationStrategy)var62, null) as java.lang.String;
            var27 = var60.v(var59, 20, var9, null) as Int;
            var43 = var60.v(var59, 21, var9, null) as Int;
            var30 = var60.v(var59, 22, var9, null) as Int;
            var26 = var60.v(var59, 23, (DeserializationStrategy)var62, null) as java.lang.String;
            var23 = var60.v(var59, 24, (DeserializationStrategy)var62, null) as java.lang.String;
            val var21: Int = var60.v(var59, 25, var9, null) as Int;
            var84 = var60.v(var59, 26, (DeserializationStrategy)var62, null) as java.lang.String;
            val var11: java.lang.String = var60.t(var59, 27);
            var18 = var60.t(var59, 28);
            var19 = var60.v(var59, 29, (DeserializationStrategy)var62, null) as java.lang.String;
            var16 = var60.v(var59, 30, (DeserializationStrategy)var62, null) as java.lang.String;
            var91 = var60.v(var59, 31, (DeserializationStrategy)var62, null) as java.lang.String;
            var17 = var60.v(var59, 32, (DeserializationStrategy)var62, null) as java.lang.String;
            val var14: java.util.List = var60.v(var59, 33, var56[33], null) as java.util.List;
            var75 = var60.v(var59, 34, (DeserializationStrategy)var62, null) as java.lang.String;
            var12 = var60.v(var59, 35, (DeserializationStrategy)var62, null) as java.lang.String;
            var20 = var60.v(var59, 36, (DeserializationStrategy)var62, null) as java.lang.String;
            val var77: java.lang.String = var60.t(var59, 37);
            var62 = var60.v(var59, 38, var56[38], null) as java.util.List;
            var4 = 127;
            var5 = -1;
            var6 = var2;
            var7 = var3;
            var34 = var22;
            var126 = (java.lang.String)var160;
            var160 = var21;
            var118 = var84;
            var84 = var11;
            var40 = var91;
            var42 = var14;
            var91 = var75;
            var75 = var77;
         } else {
            var var71: Boolean = true;
            var24 = null;
            var25 = null;
            var75 = null;
            var37 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var32 = null;
            var var78: Any = null;
            var31 = null;
            var43 = null;
            var160 = null;
            var23 = null;
            var12 = null;
            var var89: Any = null;
            var27 = null;
            var28 = null;
            var36 = null;
            var30 = null;
            var17 = null;
            var91 = null;
            var16 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var118 = null;
            var126 = null;
            var var79: java.lang.String = null;
            var42 = null;
            var41 = null;
            var26 = null;
            var62 = null;
            var84 = null;
            var40 = null;
            var38 = null;
            var var68: Int = 0;
            var var69: Int = 0;
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var39 = null;

            while (var71) {
               var var53: java.lang.String;
               label225: {
                  label224: {
                     var var47: java.lang.String;
                     var var48: java.lang.String;
                     var var49: java.lang.String;
                     var var50: Any;
                     var var51: Any;
                     var var52: java.lang.String;
                     label223: {
                        label222: {
                           label221: {
                              label283: {
                                 label284: {
                                    label216: {
                                       label215: {
                                          label285: {
                                             label286: {
                                                label182: {
                                                   label287: {
                                                      var8 = var60.x(var59);
                                                      switch (var8) {
                                                         case -1:
                                                            var71 = false;
                                                            break label221;
                                                         case 0:
                                                            var69 = var60.k(var59, 0);
                                                            var68 |= 1;
                                                            break label221;
                                                         case 1:
                                                            var6 = var60.k(var59, 1);
                                                            var68 |= 2;
                                                            break label221;
                                                         case 2:
                                                            var5 = var60.k(var59, 2);
                                                            var68 |= 4;
                                                            break label221;
                                                         case 3:
                                                            var38 = var60.v(var59, 3, C0.a, var38) as java.lang.String;
                                                            var68 |= 8;
                                                            break label221;
                                                         case 4:
                                                            var27 = var28;
                                                            var31 = var60.v(var59, 4, InviteType.Serializer.INSTANCE, var31) as InviteType;
                                                            var68 |= 16;
                                                            var28 = var27;
                                                            break label222;
                                                         case 5:
                                                            var160 = var60.v(var59, 5, N.a, var160) as Int;
                                                            var68 |= 32;
                                                            break label286;
                                                         case 6:
                                                            var78 = var60.v(var59, 6, N.a, var78) as Int;
                                                            var68 |= 64;
                                                            break label286;
                                                         case 7:
                                                            var32 = var60.v(var59, 7, N.a, var32) as Int;
                                                            var68 |= 128;
                                                            break;
                                                         case 8:
                                                            var33 = var60.v(var59, 8, C0.a, var33) as java.lang.String;
                                                            var68 |= 256;
                                                            break;
                                                         case 9:
                                                            var23 = var60.v(var59, 9, C0.a, var23) as java.lang.String;
                                                            var68 |= 512;
                                                            break label286;
                                                         case 10:
                                                            var34 = var60.v(var59, 10, N.a, var34) as Int;
                                                            var68 |= 1024;
                                                            break;
                                                         case 11:
                                                            var35 = var60.v(var59, 11, h.a, var35) as java.lang.Boolean;
                                                            var68 |= 2048;
                                                            break;
                                                         case 12:
                                                            var12 = var60.v(var59, 12, h.a, var12) as java.lang.Boolean;
                                                            var68 |= 4096;
                                                            break label286;
                                                         case 13:
                                                            var28 = var27;
                                                            var89 = var60.v(var59, 13, N.a, var89) as Int;
                                                            var68 |= 8192;
                                                            var27 = var28;
                                                            break label222;
                                                         case 14:
                                                            val var202: Int = var60.v(var59, 14, N.a, var27) as Int;
                                                            var68 |= 16384;
                                                            var27 = var28;
                                                            var28 = var202;
                                                            break label222;
                                                         case 15:
                                                            val var200: java.lang.Boolean = var60.v(var59, 15, h.a, var28) as java.lang.Boolean;
                                                            var68 |= 32768;
                                                            var28 = var27;
                                                            var27 = var200;
                                                            break label222;
                                                         case 16:
                                                            var36 = var60.v(var59, 16, N.a, var36) as Int;
                                                            var68 |= 65536;
                                                            var52 = (java.lang.String)var30;
                                                            break label285;
                                                         case 17:
                                                            var52 = var60.v(var59, 17, C0.a, var30) as java.lang.String;
                                                            var68 |= 131072;
                                                            break label285;
                                                         case 18:
                                                            var18 = var19;
                                                            var16 = var118;
                                                            var118 = var91;
                                                            var126 = var60.v(var59, 18, C0.a, var17) as java.lang.String;
                                                            var68 |= 262144;
                                                            var91 = var126;
                                                            var17 = var20;
                                                            var19 = var18;
                                                            var20 = var16;
                                                            break label215;
                                                         case 19:
                                                            var18 = var19;
                                                            var45 = var60.v(var59, 19, C0.a, var91) as java.lang.String;
                                                            var68 |= 524288;
                                                            var126 = var17;
                                                            var91 = var126;
                                                            var16 = var118;
                                                            var17 = var20;
                                                            var19 = var18;
                                                            var20 = var16;
                                                            var118 = var45;
                                                            break label215;
                                                         case 20:
                                                            var46 = var60.v(var59, 20, N.a, var16) as Int;
                                                            var68 |= 1048576;
                                                            var126 = var17;
                                                            var91 = var126;
                                                            var16 = var118;
                                                            var17 = var20;
                                                            var18 = var19;
                                                            var19 = var18;
                                                            var20 = (java.lang.String)var46;
                                                            var118 = var91;
                                                            break label215;
                                                         case 21:
                                                            var46 = var60.v(var59, 21, N.a, var18) as Int;
                                                            var68 |= 2097152;
                                                            var126 = var17;
                                                            var91 = var126;
                                                            var16 = var118;
                                                            var17 = var20;
                                                            var18 = var19;
                                                            var19 = (java.lang.String)var46;
                                                            var20 = var16;
                                                            var118 = var91;
                                                            break label215;
                                                         case 22:
                                                            val var110: Int = var60.v(var59, 22, N.a, var19) as Int;
                                                            var68 |= 4194304;
                                                            var126 = var17;
                                                            var91 = var126;
                                                            var16 = var118;
                                                            var17 = var20;
                                                            var18 = var110;
                                                            var19 = var18;
                                                            var20 = var16;
                                                            var118 = var91;
                                                            break label215;
                                                         case 23:
                                                            var46 = var60.v(var59, 23, C0.a, var20) as java.lang.String;
                                                            var68 |= 8388608;
                                                            var126 = var17;
                                                            var20 = var16;
                                                            var18 = var19;
                                                            var91 = var126;
                                                            var16 = var118;
                                                            var17 = (java.lang.String)var46;
                                                            var19 = var18;
                                                            var118 = var91;
                                                            break label215;
                                                         case 24:
                                                            var46 = var60.v(var59, 24, C0.a, var118) as java.lang.String;
                                                            var68 |= 16777216;
                                                            var126 = var17;
                                                            var118 = var91;
                                                            var18 = var19;
                                                            var17 = var20;
                                                            var91 = var126;
                                                            var16 = (java.lang.String)var46;
                                                            var19 = var18;
                                                            var20 = var16;
                                                            break label215;
                                                         case 25:
                                                            val var191: Int = var60.v(var59, 25, N.a, var126) as Int;
                                                            var68 |= 33554432;
                                                            var126 = var17;
                                                            var18 = var19;
                                                            var17 = var20;
                                                            var118 = var91;
                                                            var20 = var16;
                                                            var19 = var18;
                                                            var16 = var118;
                                                            var91 = var191;
                                                            break label215;
                                                         case 26:
                                                            var45 = var60.v(var59, 26, C0.a, var79) as java.lang.String;
                                                            var68 |= 67108864;
                                                            var62 = var37;
                                                            var79 = var24;
                                                            var37 = var25;
                                                            var26 = var45;
                                                            var25 = var26;
                                                            var24 = (java.lang.String)var62;
                                                            break label224;
                                                         case 27:
                                                            var42 = var60.t(var59, 27);
                                                            var68 |= 134217728;
                                                            var44 = var26;
                                                            break label216;
                                                         case 28:
                                                            var41 = var60.t(var59, 28);
                                                            var68 |= 268435456;
                                                            var44 = var26;
                                                            break label216;
                                                         case 29:
                                                            var44 = var60.v(var59, 29, C0.a, var26) as java.lang.String;
                                                            var68 |= 536870912;
                                                            break label216;
                                                         case 30:
                                                            var44 = var60.v(var59, 30, C0.a, var62) as java.lang.String;
                                                            var68 |= 1073741824;
                                                            var62 = var37;
                                                            var79 = var24;
                                                            var37 = var25;
                                                            var26 = var79;
                                                            var25 = var26;
                                                            var24 = var44;
                                                            break label224;
                                                         case 31:
                                                            var84 = var60.v(var59, 31, C0.a, var84) as java.lang.String;
                                                            var68 |= Integer.MIN_VALUE;
                                                            break label284;
                                                         case 32:
                                                            var75 = var60.v(var59, 32, C0.a, var75) as java.lang.String;
                                                            var73 = 1;
                                                            break label287;
                                                         case 33:
                                                            var43 = var60.v(var59, 33, var56[33], var43) as java.util.List;
                                                            var4 |= 2;
                                                            var44 = (java.lang.String)var37;
                                                            var45 = var24;
                                                            var37 = var25;
                                                            break label283;
                                                         case 34:
                                                            var25 = var60.v(var59, 34, C0.a, var25) as java.lang.String;
                                                            var73 = 4;
                                                            break label287;
                                                         case 35:
                                                            var24 = var60.v(var59, 35, C0.a, var24) as java.lang.String;
                                                            var73 = 8;
                                                            break label287;
                                                         case 36:
                                                            var37 = var60.v(var59, 36, C0.a, var37) as java.lang.String;
                                                            var73 = 16;
                                                            break label287;
                                                         case 37:
                                                            var40 = var60.t(var59, 37);
                                                            var4 |= 32;
                                                            break label284;
                                                         case 38:
                                                            var39 = var60.v(var59, 38, var56[38], var39) as java.util.List;
                                                            var4 |= 64;
                                                            var44 = (java.lang.String)var37;
                                                            break label182;
                                                         default:
                                                            throw new n(var8);
                                                      }

                                                      var27 = var28;
                                                      var28 = var27;
                                                      break label222;
                                                   }

                                                   var4 |= var73;
                                                   var44 = (java.lang.String)var37;
                                                }

                                                var37 = var25;
                                                var45 = var24;
                                                break label283;
                                             }

                                             var27 = var28;
                                             var28 = var27;
                                             break label222;
                                          }

                                          var45 = var126;
                                          var47 = var118;
                                          var48 = var20;
                                          var46 = var19;
                                          var50 = var18;
                                          var51 = var16;
                                          var49 = var91;
                                          var44 = var17;
                                          var30 = var84;
                                          break label223;
                                       }

                                       var52 = (java.lang.String)var30;
                                       var45 = var91;
                                       var47 = var16;
                                       var48 = var17;
                                       var46 = var18;
                                       var50 = var19;
                                       var51 = var20;
                                       var49 = var118;
                                       var44 = var126;
                                       var30 = var84;
                                       break label223;
                                    }

                                    var26 = var79;
                                    var62 = var37;
                                    var79 = var24;
                                    var37 = var25;
                                    var25 = var44;
                                    var24 = (java.lang.String)var62;
                                    break label224;
                                 }

                                 var52 = (java.lang.String)var30;
                                 var30 = var84;
                                 var44 = var17;
                                 var49 = var91;
                                 var51 = var16;
                                 var50 = var18;
                                 var46 = var19;
                                 var48 = var20;
                                 var47 = var118;
                                 var45 = var126;
                                 break label223;
                              }

                              var25 = var26;
                              var24 = (java.lang.String)var62;
                              var26 = var79;
                              var79 = var45;
                              var62 = var44;
                              break label224;
                           }

                           var62 = var12;
                           var27 = var28;
                           var18 = var20;
                           var17 = var118;
                           var16 = var126;
                           var12 = (java.lang.String)var25;
                           var79 = var24;
                           var25 = var26;
                           var53 = (java.lang.String)var37;
                           var84 = (java.lang.String)var89;
                           var89 = var30;
                           var91 = var79;
                           var20 = var18;
                           var118 = var16;
                           var126 = var91;
                           var26 = var17;
                           var28 = var27;
                           var24 = (java.lang.String)var62;
                           var30 = var84;
                           var44 = (java.lang.String)var160;
                           var160 = var38;
                           break label225;
                        }

                        var18 = var20;
                        var17 = var118;
                        var16 = var126;
                        var79 = var24;
                        var25 = var26;
                        var53 = (java.lang.String)var37;
                        var62 = var12;
                        var12 = (java.lang.String)var25;
                        var84 = (java.lang.String)var89;
                        var89 = var30;
                        var91 = var79;
                        var20 = var18;
                        var118 = var16;
                        var126 = var91;
                        var26 = var17;
                        var24 = (java.lang.String)var62;
                        var30 = var84;
                        var44 = (java.lang.String)var160;
                        var160 = var38;
                        break label225;
                     }

                     var91 = var79;
                     var27 = var28;
                     var84 = (java.lang.String)var89;
                     var79 = var24;
                     var62 = var12;
                     var53 = (java.lang.String)var37;
                     var12 = (java.lang.String)var25;
                     var89 = var52;
                     var16 = var45;
                     var17 = var47;
                     var18 = var48;
                     var19 = (java.lang.String)var46;
                     var20 = (java.lang.String)var50;
                     var118 = (java.lang.String)var51;
                     var126 = var49;
                     var26 = var44;
                     var25 = var26;
                     var28 = var27;
                     var24 = (java.lang.String)var62;
                     var44 = (java.lang.String)var160;
                     var160 = var38;
                     break label225;
                  }

                  var27 = var28;
                  var18 = var20;
                  var17 = var118;
                  var16 = var126;
                  var84 = (java.lang.String)var89;
                  var53 = (java.lang.String)var62;
                  var62 = var12;
                  var12 = (java.lang.String)var37;
                  var89 = var30;
                  var91 = var26;
                  var20 = var18;
                  var118 = var16;
                  var126 = var91;
                  var26 = var17;
                  var28 = var27;
                  var30 = var84;
                  var44 = (java.lang.String)var160;
                  var160 = var38;
               }

               var79 = var91;
               var18 = var20;
               var16 = var118;
               var91 = var126;
               var17 = var26;
               var26 = (java.lang.String)var25;
               var27 = var28;
               var24 = var79;
               var25 = var12;
               var37 = var53;
               var160 = var44;
               var12 = (java.lang.String)var62;
               var89 = var84;
               var28 = var27;
               var30 = var89;
               var20 = var18;
               var118 = var17;
               var126 = var16;
               var62 = var24;
               var84 = (java.lang.String)var30;
               var38 = (java.lang.String)var160;
            }

            var43 = var18;
            var44 = var17;
            var46 = var36;
            var24 = var23;
            var18 = (java.lang.String)var41;
            var75 = var40;
            var62 = var39;
            var20 = (java.lang.String)var37;
            var12 = var24;
            var91 = (java.lang.String)var25;
            var42 = var43;
            var17 = var75;
            var40 = var84;
            var16 = (java.lang.String)var62;
            var19 = var26;
            var84 = (java.lang.String)var42;
            var118 = var79;
            var160 = var126;
            var23 = var118;
            var26 = var20;
            var30 = var19;
            var27 = var16;
            var36 = var91;
            var126 = (java.lang.String)var30;
            var39 = var27;
            var41 = var89;
            var37 = var12;
            var45 = (java.lang.String)var33;
            var25 = var78;
            var33 = var160;
            var7 = var5;
            var8 = var69;
            var5 = var68;
         }

         var60.b(var59);
         return new AppMessageEmbedImpl(
            var5,
            var4,
            var8,
            var6,
            var7,
            var38,
            (InviteType)var31,
            (Integer)var33,
            (Integer)var25,
            (Integer)var32,
            var45,
            var24,
            (Integer)var34,
            (java.lang.Boolean)var35,
            (java.lang.Boolean)var37,
            (Integer)var41,
            (Integer)var39,
            (java.lang.Boolean)var28,
            (Integer)var46,
            var126,
            var44,
            var36,
            (Integer)var27,
            (Integer)var43,
            (Integer)var30,
            var26,
            var23,
            (Integer)var160,
            var118,
            var84,
            var18,
            var19,
            var16,
            var40,
            var17,
            (java.util.List)var42,
            var91,
            var12,
            var20,
            var75,
            (java.util.List)var62,
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
         return ka.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AppMessageEmbedImpl> {
         return AppMessageEmbedImpl.$serializer.INSTANCE;
      }
   }
}
