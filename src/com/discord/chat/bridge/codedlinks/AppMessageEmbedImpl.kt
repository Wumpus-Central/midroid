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
      val var3: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var1: Int = this.headerColor;
      val var31: java.lang.String = this.headerText;
      val var9: InviteType = this.type;
      val var24: Int = this.acceptLabelBackgroundColor;
      val var25: Int = this.acceptLabelBorderColor;
      val var27: Int = this.acceptLabelColor;
      val var20: java.lang.String = this.acceptLabelText;
      val var21: java.lang.String = this.bodyText;
      val var32: Int = this.bodyTextColor;
      val var23: java.lang.Boolean = this.canBeAccepted;
      val var12: java.lang.Boolean = this.embedCanBeTapped;
      val var35: Int = this.resolvingGradientEnd;
      val var37: Int = this.resolvingGradientStart;
      val var18: java.lang.Boolean = this.splashHasRadialGradient;
      val var39: Int = this.splashOpacity;
      val var28: java.lang.String = this.splashUrl;
      val var16: java.lang.String = this.inviteSplash;
      val var38: java.lang.String = this.subtitle;
      val var15: Int = this.subtitleColor;
      val var33: Int = this.thumbnailBackgroundColor;
      val var19: Int = this.thumbnailCornerRadius;
      val var11: java.lang.String = this.thumbnailText;
      val var7: java.lang.String = this.thumbnailUrl;
      val var5: Int = this.titleColor;
      val var8: java.lang.String = this.titleText;
      val var40: java.lang.String = this.appId;
      val var13: java.lang.String = this.messageId;
      val var29: java.lang.String = this.title;
      val var34: java.lang.String = this.header;
      val var14: java.lang.String = this.info;
      val var26: java.lang.String = this.tagline;
      val var22: java.util.List = this.gradientColors;
      val var10: java.lang.String = this.staticBannerSrc;
      val var36: java.lang.String = this.iconSrc;
      val var4: java.lang.String = this.embedUrl;
      val var30: java.lang.String = this.bannerRatio;
      val var6: java.util.List = this.actions;
      val var17: StringBuilder = new StringBuilder();
      var17.append("AppMessageEmbedImpl(backgroundColor=");
      var17.append(var3);
      var17.append(", borderColor=");
      var17.append(var2);
      var17.append(", headerColor=");
      var17.append(var1);
      var17.append(", headerText=");
      var17.append(var31);
      var17.append(", type=");
      var17.append(var9);
      var17.append(", acceptLabelBackgroundColor=");
      var17.append(var24);
      var17.append(", acceptLabelBorderColor=");
      var17.append(var25);
      var17.append(", acceptLabelColor=");
      var17.append(var27);
      var17.append(", acceptLabelText=");
      var17.append(var20);
      var17.append(", bodyText=");
      var17.append(var21);
      var17.append(", bodyTextColor=");
      var17.append(var32);
      var17.append(", canBeAccepted=");
      var17.append(var23);
      var17.append(", embedCanBeTapped=");
      var17.append(var12);
      var17.append(", resolvingGradientEnd=");
      var17.append(var35);
      var17.append(", resolvingGradientStart=");
      var17.append(var37);
      var17.append(", splashHasRadialGradient=");
      var17.append(var18);
      var17.append(", splashOpacity=");
      var17.append(var39);
      var17.append(", splashUrl=");
      var17.append(var28);
      var17.append(", inviteSplash=");
      var17.append(var16);
      var17.append(", subtitle=");
      var17.append(var38);
      var17.append(", subtitleColor=");
      var17.append(var15);
      var17.append(", thumbnailBackgroundColor=");
      var17.append(var33);
      var17.append(", thumbnailCornerRadius=");
      var17.append(var19);
      var17.append(", thumbnailText=");
      var17.append(var11);
      var17.append(", thumbnailUrl=");
      var17.append(var7);
      var17.append(", titleColor=");
      var17.append(var5);
      var17.append(", titleText=");
      var17.append(var8);
      var17.append(", appId=");
      var17.append(var40);
      var17.append(", messageId=");
      var17.append(var13);
      var17.append(", title=");
      var17.append(var29);
      var17.append(", header=");
      var17.append(var34);
      var17.append(", info=");
      var17.append(var14);
      var17.append(", tagline=");
      var17.append(var26);
      var17.append(", gradientColors=");
      var17.append(var22);
      var17.append(", staticBannerSrc=");
      var17.append(var10);
      var17.append(", iconSrc=");
      var17.append(var36);
      var17.append(", embedUrl=");
      var17.append(var4);
      var17.append(", bannerRatio=");
      var17.append(var30);
      var17.append(", actions=");
      var17.append(var6);
      var17.append(")");
      return var17.toString();
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
         val var11: Array<KSerializer> = AppMessageEmbedImpl.access$get$childSerializers$cp();
         val var7: N = N.a;
         val var8: C0 = C0.a;
         val var2: KSerializer = a.u(C0.a);
         val var1: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var9: KSerializer = a.u(var7);
         val var6: KSerializer = a.u(var7);
         val var12: KSerializer = a.u(var7);
         val var4: KSerializer = a.u(var8);
         val var10: KSerializer = a.u(var8);
         val var3: KSerializer = a.u(var7);
         val var5: h = h.a;
         return new KSerializer[]{
            var7,
            var7,
            var7,
            var2,
            var1,
            var9,
            var6,
            var12,
            var4,
            var10,
            var3,
            a.u(h.a),
            a.u(var5),
            a.u(var7),
            a.u(var7),
            a.u(var5),
            a.u(var7),
            a.u(var8),
            a.u(var8),
            a.u(var8),
            a.u(var7),
            a.u(var7),
            a.u(var7),
            a.u(var8),
            a.u(var8),
            a.u(var7),
            a.u(var8),
            var8,
            var8,
            a.u(var8),
            a.u(var8),
            a.u(var8),
            a.u(var8),
            a.u(var11[33]),
            a.u(var8),
            a.u(var8),
            a.u(var8),
            var8,
            a.u(var11[38])
         };
      }

      public open fun deserialize(decoder: Decoder): AppMessageEmbedImpl {
         q.h(var1, "decoder");
         val var57: SerialDescriptor = this.getDescriptor();
         val var58: c = var1.c(var57);
         val var56: Array<KSerializer> = AppMessageEmbedImpl.access$get$childSerializers$cp();
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var12: java.lang.String;
         var var13: java.lang.String;
         var var16: java.lang.String;
         var var17: java.lang.String;
         var var20: java.lang.String;
         var var23: java.lang.String;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         var var27: java.lang.String;
         var var28: Any;
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var33: java.lang.String;
         var var34: Any;
         var var35: Any;
         var var37: Any;
         var var38: java.lang.String;
         var var39: java.lang.String;
         var var40: java.lang.String;
         var var41: Any;
         var var42: Any;
         var var44: java.lang.String;
         var var45: Any;
         var var46: java.lang.String;
         var var60: Any;
         var var67: Int;
         var var73: java.lang.String;
         var var87: java.lang.String;
         var var102: java.lang.String;
         var var106: Any;
         var var116: java.lang.String;
         var var122: Any;
         var var163: java.lang.String;
         var var174: java.lang.String;
         if (var58.y()) {
            var7 = var58.k(var57, 0);
            var67 = var58.k(var57, 1);
            val var2: Int = var58.k(var57, 2);
            var60 = C0.a;
            var38 = var58.v(var57, 3, C0.a, null) as java.lang.String;
            var31 = var58.v(var57, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var9: N = N.a;
            var32 = var58.v(var57, 5, N.a, null) as Int;
            var29 = var58.v(var57, 6, var9, null) as Int;
            var41 = var58.v(var57, 7, var9, null) as Int;
            var33 = var58.v(var57, 8, (DeserializationStrategy)var60, null) as java.lang.String;
            var27 = var58.v(var57, 9, (DeserializationStrategy)var60, null) as java.lang.String;
            var122 = var58.v(var57, 10, var9, null) as Int;
            val var10: h = h.a;
            var35 = var58.v(var57, 11, h.a, null) as java.lang.Boolean;
            var26 = var58.v(var57, 12, var10, null) as java.lang.Boolean;
            var28 = var58.v(var57, 13, var9, null) as Int;
            var24 = var58.v(var57, 14, var9, null) as Int;
            var30 = var58.v(var57, 15, var10, null) as java.lang.Boolean;
            val var36: Int = var58.v(var57, 16, var9, null) as Int;
            var174 = var58.v(var57, 17, (DeserializationStrategy)var60, null) as java.lang.String;
            var39 = var58.v(var57, 18, (DeserializationStrategy)var60, null) as java.lang.String;
            var40 = var58.v(var57, 19, (DeserializationStrategy)var60, null) as java.lang.String;
            var42 = var58.v(var57, 20, var9, null) as Int;
            var37 = var58.v(var57, 21, var9, null) as Int;
            var25 = var58.v(var57, 22, var9, null) as Int;
            var46 = var58.v(var57, 23, (DeserializationStrategy)var60, null) as java.lang.String;
            var23 = var58.v(var57, 24, (DeserializationStrategy)var60, null) as java.lang.String;
            val var21: Int = var58.v(var57, 25, var9, null) as Int;
            var13 = var58.v(var57, 26, (DeserializationStrategy)var60, null) as java.lang.String;
            val var11: java.lang.String = var58.t(var57, 27);
            var102 = var58.t(var57, 28);
            var106 = var58.v(var57, 29, (DeserializationStrategy)var60, null) as java.lang.String;
            var16 = var58.v(var57, 30, (DeserializationStrategy)var60, null) as java.lang.String;
            var87 = var58.v(var57, 31, (DeserializationStrategy)var60, null) as java.lang.String;
            var17 = var58.v(var57, 32, (DeserializationStrategy)var60, null) as java.lang.String;
            val var14: java.util.List = var58.v(var57, 33, var56[33], null) as java.util.List;
            val var75: java.lang.String = var58.v(var57, 34, (DeserializationStrategy)var60, null) as java.lang.String;
            var12 = var58.v(var57, 35, (DeserializationStrategy)var60, null) as java.lang.String;
            var20 = var58.v(var57, 36, (DeserializationStrategy)var60, null) as java.lang.String;
            var73 = var58.t(var57, 37);
            var60 = var58.v(var57, 38, var56[38], null) as java.util.List;
            var4 = 127;
            var6 = -1;
            var5 = var67;
            var67 = var2;
            var34 = var122;
            var122 = var36;
            var163 = var174;
            var45 = var21;
            var44 = var11;
            var116 = var102;
            var174 = (java.lang.String)var106;
            var102 = var87;
            var106 = var14;
            var87 = var75;
         } else {
            var var71: Boolean = true;
            var25 = null;
            var24 = null;
            var73 = null;
            var37 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var32 = null;
            var var76: Any = null;
            var31 = null;
            var174 = null;
            var29 = null;
            var23 = null;
            var12 = null;
            var var85: Any = null;
            var27 = null;
            var28 = null;
            var163 = null;
            var30 = null;
            var102 = null;
            var87 = null;
            var16 = null;
            var17 = null;
            var106 = null;
            var20 = null;
            var116 = null;
            var122 = null;
            var var77: java.lang.String = null;
            var42 = null;
            var41 = null;
            var26 = null;
            var60 = null;
            var13 = null;
            var40 = null;
            var38 = null;
            var var66: Int = 0;
            var67 = 0;
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var39 = null;

            while (var71) {
               var var53: java.lang.String;
               label225: {
                  label224: {
                     var var47: Any;
                     var var48: java.lang.String;
                     var var49: java.lang.String;
                     var var50: java.lang.String;
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
                                                   var var72: Int;
                                                   label287: {
                                                      var72 = var58.x(var57);
                                                      switch (var72) {
                                                         case -1:
                                                            var71 = false;
                                                            break label221;
                                                         case 0:
                                                            var67 = var58.k(var57, 0);
                                                            var66 |= 1;
                                                            break label221;
                                                         case 1:
                                                            var6 = var58.k(var57, 1);
                                                            var66 |= 2;
                                                            break label221;
                                                         case 2:
                                                            var5 = var58.k(var57, 2);
                                                            var66 |= 4;
                                                            break label221;
                                                         case 3:
                                                            var38 = var58.v(var57, 3, C0.a, var38) as java.lang.String;
                                                            var66 |= 8;
                                                            break label221;
                                                         case 4:
                                                            var27 = (java.lang.String)var28;
                                                            var31 = var58.v(var57, 4, InviteType.Serializer.INSTANCE, var31) as InviteType;
                                                            var66 |= 16;
                                                            var28 = var27;
                                                            break label222;
                                                         case 5:
                                                            var29 = var58.v(var57, 5, N.a, var29) as Int;
                                                            var66 |= 32;
                                                            break label286;
                                                         case 6:
                                                            var76 = var58.v(var57, 6, N.a, var76) as Int;
                                                            var66 |= 64;
                                                            break label286;
                                                         case 7:
                                                            var32 = var58.v(var57, 7, N.a, var32) as Int;
                                                            var66 |= 128;
                                                            break;
                                                         case 8:
                                                            var33 = var58.v(var57, 8, C0.a, var33) as java.lang.String;
                                                            var66 |= 256;
                                                            break;
                                                         case 9:
                                                            var23 = var58.v(var57, 9, C0.a, var23) as java.lang.String;
                                                            var66 |= 512;
                                                            break label286;
                                                         case 10:
                                                            var34 = var58.v(var57, 10, N.a, var34) as Int;
                                                            var66 |= 1024;
                                                            break;
                                                         case 11:
                                                            var35 = var58.v(var57, 11, h.a, var35) as java.lang.Boolean;
                                                            var66 |= 2048;
                                                            break;
                                                         case 12:
                                                            var12 = var58.v(var57, 12, h.a, var12) as java.lang.Boolean;
                                                            var66 |= 4096;
                                                            break label286;
                                                         case 13:
                                                            var28 = var27;
                                                            var85 = var58.v(var57, 13, N.a, var85) as Int;
                                                            var66 |= 8192;
                                                            var27 = (java.lang.String)var28;
                                                            break label222;
                                                         case 14:
                                                            val var200: Int = var58.v(var57, 14, N.a, var27) as Int;
                                                            var66 |= 16384;
                                                            var27 = (java.lang.String)var28;
                                                            var28 = var200;
                                                            break label222;
                                                         case 15:
                                                            val var198: java.lang.Boolean = var58.v(var57, 15, h.a, var28) as java.lang.Boolean;
                                                            var66 |= 32768;
                                                            var28 = var27;
                                                            var27 = var198;
                                                            break label222;
                                                         case 16:
                                                            var163 = var58.v(var57, 16, N.a, var163) as Int;
                                                            var66 |= 65536;
                                                            var52 = (java.lang.String)var30;
                                                            break label285;
                                                         case 17:
                                                            var52 = var58.v(var57, 17, C0.a, var30) as java.lang.String;
                                                            var66 |= 131072;
                                                            break label285;
                                                         case 18:
                                                            var17 = var20;
                                                            var16 = var116;
                                                            var116 = var87;
                                                            var122 = var58.v(var57, 18, C0.a, var102) as java.lang.String;
                                                            var66 |= 262144;
                                                            var87 = (java.lang.String)var122;
                                                            var102 = (java.lang.String)var106;
                                                            var106 = var17;
                                                            var20 = var16;
                                                            break label215;
                                                         case 19:
                                                            var17 = var20;
                                                            var20 = var16;
                                                            val var133: java.lang.String = var58.v(var57, 19, C0.a, var87) as java.lang.String;
                                                            var66 |= 524288;
                                                            var87 = (java.lang.String)var122;
                                                            var16 = var116;
                                                            var102 = (java.lang.String)var106;
                                                            var106 = var17;
                                                            var116 = var133;
                                                            var122 = var102;
                                                            break label215;
                                                         case 20:
                                                            val var249: Int = var58.v(var57, 20, N.a, var16) as Int;
                                                            var66 |= 1048576;
                                                            var122 = var102;
                                                            var87 = (java.lang.String)var122;
                                                            var16 = var116;
                                                            var17 = var20;
                                                            var102 = (java.lang.String)var106;
                                                            var106 = var17;
                                                            var20 = var249;
                                                            var116 = var87;
                                                            break label215;
                                                         case 21:
                                                            val var248: Int = var58.v(var57, 21, N.a, var17) as Int;
                                                            var66 |= 2097152;
                                                            var122 = var102;
                                                            var87 = (java.lang.String)var122;
                                                            var16 = var116;
                                                            var17 = var20;
                                                            var102 = (java.lang.String)var106;
                                                            var106 = var248;
                                                            var20 = var16;
                                                            var116 = var87;
                                                            break label215;
                                                         case 22:
                                                            var106 = var58.v(var57, 22, N.a, var106) as Int;
                                                            var66 |= 4194304;
                                                            var122 = var102;
                                                            var87 = (java.lang.String)var122;
                                                            var16 = var116;
                                                            var17 = var20;
                                                            var102 = (java.lang.String)var106;
                                                            var106 = var17;
                                                            var20 = var16;
                                                            var116 = var87;
                                                            break label215;
                                                         case 23:
                                                            var46 = var58.v(var57, 23, C0.a, var20) as java.lang.String;
                                                            var66 |= 8388608;
                                                            var122 = var102;
                                                            var20 = var16;
                                                            var102 = (java.lang.String)var106;
                                                            var87 = (java.lang.String)var122;
                                                            var16 = var116;
                                                            var17 = var46;
                                                            var106 = var17;
                                                            var116 = var87;
                                                            break label215;
                                                         case 24:
                                                            var46 = var58.v(var57, 24, C0.a, var116) as java.lang.String;
                                                            var66 |= 16777216;
                                                            var122 = var102;
                                                            var116 = var87;
                                                            var102 = (java.lang.String)var106;
                                                            var17 = var20;
                                                            var87 = (java.lang.String)var122;
                                                            var16 = var46;
                                                            var106 = var17;
                                                            var20 = var16;
                                                            break label215;
                                                         case 25:
                                                            val var189: Int = var58.v(var57, 25, N.a, var122) as Int;
                                                            var66 |= 33554432;
                                                            var17 = var20;
                                                            var122 = var102;
                                                            var116 = var87;
                                                            var20 = var16;
                                                            var106 = var17;
                                                            var102 = (java.lang.String)var106;
                                                            var16 = var116;
                                                            var87 = var189;
                                                            break label215;
                                                         case 26:
                                                            var45 = var58.v(var57, 26, C0.a, var77) as java.lang.String;
                                                            var66 |= 67108864;
                                                            var60 = var37;
                                                            var77 = (java.lang.String)var25;
                                                            var37 = var24;
                                                            var26 = var45;
                                                            var25 = var26;
                                                            var24 = var60;
                                                            break label224;
                                                         case 27:
                                                            var42 = var58.t(var57, 27);
                                                            var66 |= 134217728;
                                                            var44 = (java.lang.String)var26;
                                                            break label216;
                                                         case 28:
                                                            var41 = var58.t(var57, 28);
                                                            var66 |= 268435456;
                                                            var44 = (java.lang.String)var26;
                                                            break label216;
                                                         case 29:
                                                            var44 = var58.v(var57, 29, C0.a, var26) as java.lang.String;
                                                            var66 |= 536870912;
                                                            break label216;
                                                         case 30:
                                                            var44 = var58.v(var57, 30, C0.a, var60) as java.lang.String;
                                                            var66 |= 1073741824;
                                                            var60 = var37;
                                                            var77 = (java.lang.String)var25;
                                                            var37 = var24;
                                                            var26 = var77;
                                                            var25 = var26;
                                                            var24 = var44;
                                                            break label224;
                                                         case 31:
                                                            var13 = var58.v(var57, 31, C0.a, var13) as java.lang.String;
                                                            var66 |= Integer.MIN_VALUE;
                                                            break label284;
                                                         case 32:
                                                            var73 = var58.v(var57, 32, C0.a, var73) as java.lang.String;
                                                            var72 = 1;
                                                            break label287;
                                                         case 33:
                                                            var174 = var58.v(var57, 33, var56[33], var174) as java.util.List;
                                                            var4 |= 2;
                                                            var44 = (java.lang.String)var37;
                                                            var45 = var25;
                                                            var37 = var24;
                                                            break label283;
                                                         case 34:
                                                            var24 = var58.v(var57, 34, C0.a, var24) as java.lang.String;
                                                            var72 = 4;
                                                            break label287;
                                                         case 35:
                                                            var25 = var58.v(var57, 35, C0.a, var25) as java.lang.String;
                                                            var72 = 8;
                                                            break label287;
                                                         case 36:
                                                            var37 = var58.v(var57, 36, C0.a, var37) as java.lang.String;
                                                            var72 = 16;
                                                            break label287;
                                                         case 37:
                                                            var40 = var58.t(var57, 37);
                                                            var4 |= 32;
                                                            break label284;
                                                         case 38:
                                                            var39 = var58.v(var57, 38, var56[38], var39) as java.util.List;
                                                            var4 |= 64;
                                                            var44 = (java.lang.String)var37;
                                                            break label182;
                                                         default:
                                                            throw new n(var72);
                                                      }

                                                      var27 = (java.lang.String)var28;
                                                      var28 = var27;
                                                      break label222;
                                                   }

                                                   var4 |= var72;
                                                   var44 = (java.lang.String)var37;
                                                }

                                                var37 = var24;
                                                var45 = var25;
                                                break label283;
                                             }

                                             var27 = (java.lang.String)var28;
                                             var28 = var27;
                                             break label222;
                                          }

                                          var47 = var122;
                                          var45 = var116;
                                          var50 = var20;
                                          var46 = (java.lang.String)var106;
                                          var44 = var17;
                                          var51 = var16;
                                          var49 = var87;
                                          var48 = var102;
                                          var30 = var13;
                                          break label223;
                                       }

                                       var52 = (java.lang.String)var30;
                                       var47 = var87;
                                       var45 = var16;
                                       var50 = var17;
                                       var46 = var102;
                                       var44 = (java.lang.String)var106;
                                       var51 = var20;
                                       var49 = var116;
                                       var48 = (java.lang.String)var122;
                                       var30 = var13;
                                       break label223;
                                    }

                                    var26 = var77;
                                    var60 = var37;
                                    var77 = (java.lang.String)var25;
                                    var37 = var24;
                                    var25 = var44;
                                    var24 = var60;
                                    break label224;
                                 }

                                 var52 = (java.lang.String)var30;
                                 var30 = var13;
                                 var48 = var102;
                                 var49 = var87;
                                 var51 = var16;
                                 var44 = var17;
                                 var46 = (java.lang.String)var106;
                                 var50 = var20;
                                 var45 = var116;
                                 var47 = var122;
                                 break label223;
                              }

                              var25 = var26;
                              var24 = var60;
                              var26 = var77;
                              var77 = (java.lang.String)var45;
                              var60 = var44;
                              break label224;
                           }

                           var60 = var12;
                           var27 = (java.lang.String)var28;
                           var102 = var20;
                           var17 = var116;
                           var16 = (java.lang.String)var122;
                           var12 = (java.lang.String)var24;
                           var77 = (java.lang.String)var25;
                           var25 = var26;
                           var53 = (java.lang.String)var37;
                           var13 = (java.lang.String)var85;
                           var85 = var30;
                           var87 = var77;
                           var20 = var17;
                           var116 = var16;
                           var122 = var87;
                           var26 = var102;
                           var28 = var27;
                           var24 = var60;
                           var30 = var13;
                           var44 = (java.lang.String)var29;
                           var29 = var38;
                           break label225;
                        }

                        var102 = var20;
                        var17 = var116;
                        var16 = (java.lang.String)var122;
                        var77 = (java.lang.String)var25;
                        var25 = var26;
                        var53 = (java.lang.String)var37;
                        var60 = var12;
                        var12 = (java.lang.String)var24;
                        var13 = (java.lang.String)var85;
                        var85 = var30;
                        var87 = var77;
                        var20 = var17;
                        var116 = var16;
                        var122 = var87;
                        var26 = var102;
                        var24 = var60;
                        var30 = var13;
                        var44 = (java.lang.String)var29;
                        var29 = var38;
                        break label225;
                     }

                     var87 = var77;
                     var27 = (java.lang.String)var28;
                     var13 = (java.lang.String)var85;
                     var77 = (java.lang.String)var25;
                     var60 = var12;
                     var53 = (java.lang.String)var37;
                     var12 = (java.lang.String)var24;
                     var85 = var52;
                     var16 = (java.lang.String)var47;
                     var17 = (java.lang.String)var45;
                     var102 = var50;
                     var106 = var46;
                     var20 = var44;
                     var116 = (java.lang.String)var51;
                     var122 = var49;
                     var26 = var48;
                     var25 = var26;
                     var28 = var27;
                     var24 = var60;
                     var44 = (java.lang.String)var29;
                     var29 = var38;
                     break label225;
                  }

                  var27 = (java.lang.String)var28;
                  var102 = var20;
                  var17 = var116;
                  var16 = (java.lang.String)var122;
                  var13 = (java.lang.String)var85;
                  var53 = (java.lang.String)var60;
                  var60 = var12;
                  var12 = (java.lang.String)var37;
                  var85 = var30;
                  var87 = (java.lang.String)var26;
                  var20 = var17;
                  var116 = var16;
                  var122 = var87;
                  var26 = var102;
                  var28 = var27;
                  var30 = var13;
                  var44 = (java.lang.String)var29;
                  var29 = var38;
               }

               var77 = var87;
               var17 = var20;
               var16 = var116;
               var87 = (java.lang.String)var122;
               var102 = (java.lang.String)var26;
               var26 = var25;
               var27 = (java.lang.String)var28;
               var25 = var77;
               var24 = var12;
               var37 = var53;
               var29 = var44;
               var12 = (java.lang.String)var60;
               var85 = var13;
               var28 = var27;
               var30 = var85;
               var20 = var102;
               var116 = var17;
               var122 = var16;
               var60 = var24;
               var13 = (java.lang.String)var30;
               var38 = (java.lang.String)var29;
            }

            var45 = var122;
            var46 = var20;
            var122 = var163;
            var24 = var27;
            var7 = var67;
            var27 = var23;
            var116 = (java.lang.String)var41;
            var73 = var40;
            var67 = var5;
            var60 = var39;
            var20 = (java.lang.String)var37;
            var12 = (java.lang.String)var25;
            var87 = (java.lang.String)var24;
            var106 = var174;
            var17 = var73;
            var102 = var13;
            var16 = (java.lang.String)var60;
            var174 = (java.lang.String)var26;
            var44 = (java.lang.String)var42;
            var13 = var77;
            var23 = var116;
            var25 = var106;
            var37 = var17;
            var42 = var16;
            var40 = var87;
            var39 = var102;
            var163 = (java.lang.String)var30;
            var30 = var28;
            var28 = var85;
            var26 = var12;
            var41 = var32;
            var29 = var76;
            var32 = var29;
            var5 = var6;
            var6 = var66;
         }

         var58.b(var57);
         return new AppMessageEmbedImpl(
            var6,
            var4,
            var7,
            var5,
            var67,
            var38,
            (InviteType)var31,
            (Integer)var32,
            (Integer)var29,
            (Integer)var41,
            var33,
            var27,
            (Integer)var34,
            (java.lang.Boolean)var35,
            (java.lang.Boolean)var26,
            (Integer)var28,
            (Integer)var24,
            (java.lang.Boolean)var30,
            (Integer)var122,
            var163,
            var39,
            var40,
            (Integer)var42,
            (Integer)var37,
            (Integer)var25,
            var46,
            var23,
            (Integer)var45,
            var13,
            var44,
            var116,
            var174,
            var16,
            var102,
            var17,
            (java.util.List)var106,
            var87,
            var12,
            var20,
            var73,
            (java.util.List)var60,
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
