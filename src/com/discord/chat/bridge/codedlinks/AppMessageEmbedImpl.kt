package com.discord.chat.bridge.codedlinks

import fa.f
import fa.n
import ga.a
import ia.C0
import ia.G
import ia.N
import ia.h
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
      val var36: Int = Integer.hashCode(this.backgroundColor);
      val var35: Int = Integer.hashCode(this.borderColor);
      val var34: Int = Integer.hashCode(this.headerColor);
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

      val var37: Int = this.appId.hashCode();
      val var38: Int = this.messageId.hashCode();
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
                                                                                                                                                                                                                                                                                                                                                   var36
                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                      + var35
                                                                                                                                                                                                                                                                                                                                                )
                                                                                                                                                                                                                                                                                                                                                * 31
                                                                                                                                                                                                                                                                                                                                             + var34
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
                                                                                                            + var37
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var38
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
      val var1: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var4: java.lang.String = this.headerText;
      val var24: InviteType = this.type;
      val var33: Int = this.acceptLabelBackgroundColor;
      val var9: Int = this.acceptLabelBorderColor;
      val var10: Int = this.acceptLabelColor;
      val var31: java.lang.String = this.acceptLabelText;
      val var12: java.lang.String = this.bodyText;
      val var29: Int = this.bodyTextColor;
      val var5: java.lang.Boolean = this.canBeAccepted;
      val var26: java.lang.Boolean = this.embedCanBeTapped;
      val var35: Int = this.resolvingGradientEnd;
      val var17: Int = this.resolvingGradientStart;
      val var27: java.lang.Boolean = this.splashHasRadialGradient;
      val var11: Int = this.splashOpacity;
      val var32: java.lang.String = this.splashUrl;
      val var14: java.lang.String = this.inviteSplash;
      val var39: java.lang.String = this.subtitle;
      val var22: Int = this.subtitleColor;
      val var37: Int = this.thumbnailBackgroundColor;
      val var7: Int = this.thumbnailCornerRadius;
      val var36: java.lang.String = this.thumbnailText;
      val var15: java.lang.String = this.thumbnailUrl;
      val var40: Int = this.titleColor;
      val var18: java.lang.String = this.titleText;
      val var21: java.lang.String = this.appId;
      val var6: java.lang.String = this.messageId;
      val var16: java.lang.String = this.title;
      val var38: java.lang.String = this.header;
      val var13: java.lang.String = this.info;
      val var23: java.lang.String = this.tagline;
      val var34: java.util.List = this.gradientColors;
      val var30: java.lang.String = this.staticBannerSrc;
      val var19: java.lang.String = this.iconSrc;
      val var20: java.lang.String = this.embedUrl;
      val var8: java.lang.String = this.bannerRatio;
      val var28: java.util.List = this.actions;
      val var25: StringBuilder = new StringBuilder();
      var25.append("AppMessageEmbedImpl(backgroundColor=");
      var25.append(var1);
      var25.append(", borderColor=");
      var25.append(var2);
      var25.append(", headerColor=");
      var25.append(var3);
      var25.append(", headerText=");
      var25.append(var4);
      var25.append(", type=");
      var25.append(var24);
      var25.append(", acceptLabelBackgroundColor=");
      var25.append(var33);
      var25.append(", acceptLabelBorderColor=");
      var25.append(var9);
      var25.append(", acceptLabelColor=");
      var25.append(var10);
      var25.append(", acceptLabelText=");
      var25.append(var31);
      var25.append(", bodyText=");
      var25.append(var12);
      var25.append(", bodyTextColor=");
      var25.append(var29);
      var25.append(", canBeAccepted=");
      var25.append(var5);
      var25.append(", embedCanBeTapped=");
      var25.append(var26);
      var25.append(", resolvingGradientEnd=");
      var25.append(var35);
      var25.append(", resolvingGradientStart=");
      var25.append(var17);
      var25.append(", splashHasRadialGradient=");
      var25.append(var27);
      var25.append(", splashOpacity=");
      var25.append(var11);
      var25.append(", splashUrl=");
      var25.append(var32);
      var25.append(", inviteSplash=");
      var25.append(var14);
      var25.append(", subtitle=");
      var25.append(var39);
      var25.append(", subtitleColor=");
      var25.append(var22);
      var25.append(", thumbnailBackgroundColor=");
      var25.append(var37);
      var25.append(", thumbnailCornerRadius=");
      var25.append(var7);
      var25.append(", thumbnailText=");
      var25.append(var36);
      var25.append(", thumbnailUrl=");
      var25.append(var15);
      var25.append(", titleColor=");
      var25.append(var40);
      var25.append(", titleText=");
      var25.append(var18);
      var25.append(", appId=");
      var25.append(var21);
      var25.append(", messageId=");
      var25.append(var6);
      var25.append(", title=");
      var25.append(var16);
      var25.append(", header=");
      var25.append(var38);
      var25.append(", info=");
      var25.append(var13);
      var25.append(", tagline=");
      var25.append(var23);
      var25.append(", gradientColors=");
      var25.append(var34);
      var25.append(", staticBannerSrc=");
      var25.append(var30);
      var25.append(", iconSrc=");
      var25.append(var19);
      var25.append(", embedUrl=");
      var25.append(var20);
      var25.append(", bannerRatio=");
      var25.append(var8);
      var25.append(", actions=");
      var25.append(var28);
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
         val var9: Array<KSerializer> = AppMessageEmbedImpl.access$get$childSerializers$cp();
         val var2: N = N.a;
         val var12: C0 = C0.a;
         val var5: KSerializer = a.u(C0.a);
         val var6: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var4: KSerializer = a.u(var2);
         val var10: KSerializer = a.u(var2);
         val var11: KSerializer = a.u(var2);
         val var3: KSerializer = a.u(var12);
         val var8: KSerializer = a.u(var12);
         val var7: KSerializer = a.u(var2);
         val var1: h = h.a;
         return new KSerializer[]{
            var2,
            var2,
            var2,
            var5,
            var6,
            var4,
            var10,
            var11,
            var3,
            var8,
            var7,
            a.u(h.a),
            a.u(var1),
            a.u(var2),
            a.u(var2),
            a.u(var1),
            a.u(var2),
            a.u(var12),
            a.u(var12),
            a.u(var12),
            a.u(var2),
            a.u(var2),
            a.u(var2),
            a.u(var12),
            a.u(var12),
            a.u(var2),
            a.u(var12),
            var12,
            var12,
            a.u(var12),
            a.u(var12),
            a.u(var12),
            a.u(var12),
            a.u(var9[33]),
            a.u(var12),
            a.u(var12),
            a.u(var12),
            var12,
            a.u(var9[38])
         };
      }

      public open fun deserialize(decoder: Decoder): AppMessageEmbedImpl {
         q.h(var1, "decoder");
         val var58: SerialDescriptor = this.getDescriptor();
         val var59: c = var1.c(var58);
         val var56: Array<KSerializer> = AppMessageEmbedImpl.access$get$childSerializers$cp();
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var12: java.lang.String;
         var var16: java.lang.String;
         var var17: java.lang.String;
         var var18: java.lang.String;
         var var19: java.lang.String;
         var var20: java.lang.String;
         var var21: Any;
         var var23: java.lang.String;
         var var24: Any;
         var var25: Any;
         var var26: java.lang.String;
         var var27: Any;
         var var28: Any;
         var var29: java.lang.String;
         var var30: java.lang.String;
         var var31: Any;
         var var32: Any;
         var var33: java.lang.String;
         var var34: Any;
         var var35: Any;
         var var36: Any;
         var var37: Any;
         var var38: java.lang.String;
         var var40: java.lang.String;
         var var41: Any;
         var var42: java.lang.String;
         var var43: Any;
         var var44: Any;
         var var45: java.lang.String;
         var var46: java.lang.String;
         var var47: java.lang.String;
         var var76: Any;
         var var85: java.lang.String;
         var var91: Any;
         var var124: Any;
         var var171: java.lang.String;
         if (var59.y()) {
            var5 = var59.k(var58, 0);
            var3 = var59.k(var58, 1);
            val var2: Int = var59.k(var58, 2);
            val var60: C0 = C0.a;
            var38 = var59.v(var58, 3, C0.a, null) as java.lang.String;
            var31 = var59.v(var58, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var76 = N.a;
            var25 = var59.v(var58, 5, N.a, null) as Int;
            var34 = var59.v(var58, 6, (DeserializationStrategy)var76, null) as Int;
            var32 = var59.v(var58, 7, (DeserializationStrategy)var76, null) as Int;
            var33 = var59.v(var58, 8, var60, null) as java.lang.String;
            var29 = var59.v(var58, 9, var60, null) as java.lang.String;
            var124 = var59.v(var58, 10, (DeserializationStrategy)var76, null) as Int;
            val var10: h = h.a;
            var35 = var59.v(var58, 11, h.a, null) as java.lang.Boolean;
            var27 = var59.v(var58, 12, var10, null) as java.lang.Boolean;
            var41 = var59.v(var58, 13, (DeserializationStrategy)var76, null) as Int;
            var43 = var59.v(var58, 14, (DeserializationStrategy)var76, null) as Int;
            var36 = var59.v(var58, 15, var10, null) as java.lang.Boolean;
            val var39: Int = var59.v(var58, 16, (DeserializationStrategy)var76, null) as Int;
            var45 = var59.v(var58, 17, var60, null) as java.lang.String;
            var40 = var59.v(var58, 18, var60, null) as java.lang.String;
            var26 = var59.v(var58, 19, var60, null) as java.lang.String;
            var28 = var59.v(var58, 20, (DeserializationStrategy)var76, null) as Int;
            var37 = var59.v(var58, 21, (DeserializationStrategy)var76, null) as Int;
            var24 = var59.v(var58, 22, (DeserializationStrategy)var76, null) as Int;
            var30 = var59.v(var58, 23, var60, null) as java.lang.String;
            var23 = var59.v(var58, 24, var60, null) as java.lang.String;
            var21 = var59.v(var58, 25, (DeserializationStrategy)var76, null) as Int;
            var85 = var59.v(var58, 26, var60, null) as java.lang.String;
            val var11: java.lang.String = var59.t(var58, 27);
            var18 = var59.t(var58, 28);
            var19 = var59.v(var58, 29, var60, null) as java.lang.String;
            var16 = var59.v(var58, 30, var60, null) as java.lang.String;
            var91 = var59.v(var58, 31, var60, null) as java.lang.String;
            var17 = var59.v(var58, 32, var60, null) as java.lang.String;
            val var14: java.util.List = var59.v(var58, 33, var56[33], null) as java.util.List;
            val var78: java.lang.String = var59.v(var58, 34, var60, null) as java.lang.String;
            var12 = var59.v(var58, 35, var60, null) as java.lang.String;
            var20 = var59.v(var58, 36, var60, null) as java.lang.String;
            var76 = var59.t(var58, 37);
            val var61: java.util.List = var59.v(var58, 38, var56[38], null) as java.util.List;
            var4 = 127;
            var7 = -1;
            var6 = var2;
            var44 = var124;
            var124 = var39;
            var171 = var85;
            var42 = var11;
            var46 = (java.lang.String)var91;
            var91 = var14;
            var85 = var78;
            var47 = (java.lang.String)var76;
            var76 = var61;
         } else {
            var var72: Boolean = true;
            var25 = null;
            var24 = null;
            var76 = null;
            var37 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var32 = null;
            var var79: Any = null;
            var31 = null;
            var43 = null;
            var29 = null;
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
            var21 = null;
            var124 = null;
            var var80: java.lang.String = null;
            var42 = null;
            var41 = null;
            var26 = null;
            var var62: java.lang.String = null;
            var85 = null;
            var40 = null;
            var38 = null;
            var var68: Int = 0;
            var3 = 0;
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var171 = null;

            while (var72) {
               var var53: java.lang.String;
               label225: {
                  label224: {
                     var var48: Any;
                     var var49: java.lang.String;
                     var var50: Any;
                     var var51: java.lang.String;
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
                                                   var var74: Int;
                                                   label287: {
                                                      var74 = var59.x(var58);
                                                      switch (var74) {
                                                         case -1:
                                                            var72 = false;
                                                            break label221;
                                                         case 0:
                                                            var3 = var59.k(var58, 0);
                                                            var68 |= 1;
                                                            break label221;
                                                         case 1:
                                                            var6 = var59.k(var58, 1);
                                                            var68 |= 2;
                                                            break label221;
                                                         case 2:
                                                            var5 = var59.k(var58, 2);
                                                            var68 |= 4;
                                                            break label221;
                                                         case 3:
                                                            var38 = var59.v(var58, 3, C0.a, var38) as java.lang.String;
                                                            var68 |= 8;
                                                            break label221;
                                                         case 4:
                                                            var27 = var28;
                                                            var31 = var59.v(var58, 4, InviteType.Serializer.INSTANCE, var31) as InviteType;
                                                            var68 |= 16;
                                                            var28 = var27;
                                                            break label222;
                                                         case 5:
                                                            var29 = var59.v(var58, 5, N.a, var29) as Int;
                                                            var68 |= 32;
                                                            break label286;
                                                         case 6:
                                                            var79 = var59.v(var58, 6, N.a, var79) as Int;
                                                            var68 |= 64;
                                                            break label286;
                                                         case 7:
                                                            var32 = var59.v(var58, 7, N.a, var32) as Int;
                                                            var68 |= 128;
                                                            break;
                                                         case 8:
                                                            var33 = var59.v(var58, 8, C0.a, var33) as java.lang.String;
                                                            var68 |= 256;
                                                            break;
                                                         case 9:
                                                            var23 = var59.v(var58, 9, C0.a, var23) as java.lang.String;
                                                            var68 |= 512;
                                                            break label286;
                                                         case 10:
                                                            var34 = var59.v(var58, 10, N.a, var34) as Int;
                                                            var68 |= 1024;
                                                            break;
                                                         case 11:
                                                            var35 = var59.v(var58, 11, h.a, var35) as java.lang.Boolean;
                                                            var68 |= 2048;
                                                            break;
                                                         case 12:
                                                            var12 = var59.v(var58, 12, h.a, var12) as java.lang.Boolean;
                                                            var68 |= 4096;
                                                            break label286;
                                                         case 13:
                                                            var89 = var59.v(var58, 13, N.a, var89) as Int;
                                                            var68 |= 8192;
                                                            var27 = var28;
                                                            var28 = var27;
                                                            break label222;
                                                         case 14:
                                                            var44 = var59.v(var58, 14, N.a, var27) as Int;
                                                            var68 |= 16384;
                                                            var27 = var28;
                                                            var28 = var44;
                                                            break label222;
                                                         case 15:
                                                            var44 = var59.v(var58, 15, h.a, var28) as java.lang.Boolean;
                                                            var68 |= 32768;
                                                            var28 = var27;
                                                            var27 = var44;
                                                            break label222;
                                                         case 16:
                                                            var36 = var59.v(var58, 16, N.a, var36) as Int;
                                                            var68 |= 65536;
                                                            var52 = var30;
                                                            break label285;
                                                         case 17:
                                                            var52 = var59.v(var58, 17, C0.a, var30) as java.lang.String;
                                                            var68 |= 131072;
                                                            break label285;
                                                         case 18:
                                                            var18 = var19;
                                                            var16 = (java.lang.String)var21;
                                                            var21 = var91;
                                                            var124 = var59.v(var58, 18, C0.a, var17) as java.lang.String;
                                                            var68 |= 262144;
                                                            var91 = var124;
                                                            var17 = var20;
                                                            var19 = var18;
                                                            var20 = var16;
                                                            break label215;
                                                         case 19:
                                                            var18 = var19;
                                                            var20 = var16;
                                                            val var135: java.lang.String = var59.v(var58, 19, C0.a, var91) as java.lang.String;
                                                            var68 |= 524288;
                                                            var91 = var124;
                                                            var16 = (java.lang.String)var21;
                                                            var17 = var20;
                                                            var19 = var18;
                                                            var21 = var135;
                                                            var124 = var17;
                                                            break label215;
                                                         case 20:
                                                            val var234: Int = var59.v(var58, 20, N.a, var16) as Int;
                                                            var68 |= 1048576;
                                                            var124 = var17;
                                                            var91 = var124;
                                                            var16 = (java.lang.String)var21;
                                                            var17 = var20;
                                                            var18 = var19;
                                                            var19 = var18;
                                                            var20 = var234;
                                                            var21 = var91;
                                                            break label215;
                                                         case 21:
                                                            val var233: Int = var59.v(var58, 21, N.a, var18) as Int;
                                                            var68 |= 2097152;
                                                            var124 = var17;
                                                            var91 = var124;
                                                            var16 = (java.lang.String)var21;
                                                            var17 = var20;
                                                            var18 = var19;
                                                            var19 = var233;
                                                            var20 = var16;
                                                            var21 = var91;
                                                            break label215;
                                                         case 22:
                                                            val var111: Int = var59.v(var58, 22, N.a, var19) as Int;
                                                            var68 |= 4194304;
                                                            var124 = var17;
                                                            var91 = var124;
                                                            var16 = (java.lang.String)var21;
                                                            var17 = var20;
                                                            var18 = var111;
                                                            var19 = var18;
                                                            var20 = var16;
                                                            var21 = var91;
                                                            break label215;
                                                         case 23:
                                                            var46 = var59.v(var58, 23, C0.a, var20) as java.lang.String;
                                                            var68 |= 8388608;
                                                            var124 = var17;
                                                            var20 = var16;
                                                            var18 = var19;
                                                            var91 = var124;
                                                            var16 = (java.lang.String)var21;
                                                            var17 = var46;
                                                            var19 = var18;
                                                            var21 = var91;
                                                            break label215;
                                                         case 24:
                                                            var46 = var59.v(var58, 24, C0.a, var21) as java.lang.String;
                                                            var68 |= 16777216;
                                                            var124 = var17;
                                                            var21 = var91;
                                                            var18 = var19;
                                                            var17 = var20;
                                                            var91 = var124;
                                                            var16 = var46;
                                                            var19 = var18;
                                                            var20 = var16;
                                                            break label215;
                                                         case 25:
                                                            var44 = var59.v(var58, 25, N.a, var124) as Int;
                                                            var68 |= 33554432;
                                                            var124 = var17;
                                                            var18 = var19;
                                                            var21 = var91;
                                                            var20 = var16;
                                                            var19 = var18;
                                                            var17 = var20;
                                                            var16 = (java.lang.String)var21;
                                                            var91 = var44;
                                                            break label215;
                                                         case 26:
                                                            var45 = var59.v(var58, 26, C0.a, var80) as java.lang.String;
                                                            var68 |= 67108864;
                                                            var63 = (java.lang.String)var37;
                                                            var80 = (java.lang.String)var25;
                                                            var37 = var24;
                                                            var26 = var45;
                                                            var25 = var26;
                                                            var24 = var62;
                                                            break label224;
                                                         case 27:
                                                            var42 = var59.t(var58, 27);
                                                            var68 |= 134217728;
                                                            var44 = var26;
                                                            break label216;
                                                         case 28:
                                                            var41 = var59.t(var58, 28);
                                                            var68 |= 268435456;
                                                            var44 = var26;
                                                            break label216;
                                                         case 29:
                                                            var44 = var59.v(var58, 29, C0.a, var26) as java.lang.String;
                                                            var68 |= 536870912;
                                                            break label216;
                                                         case 30:
                                                            var44 = var59.v(var58, 30, C0.a, var62) as java.lang.String;
                                                            var68 |= 1073741824;
                                                            var63 = (java.lang.String)var37;
                                                            var80 = (java.lang.String)var25;
                                                            var37 = var24;
                                                            var26 = var80;
                                                            var25 = var26;
                                                            var24 = var44;
                                                            break label224;
                                                         case 31:
                                                            var85 = var59.v(var58, 31, C0.a, var85) as java.lang.String;
                                                            var68 |= Integer.MIN_VALUE;
                                                            break label284;
                                                         case 32:
                                                            var76 = var59.v(var58, 32, C0.a, var76) as java.lang.String;
                                                            var74 = 1;
                                                            break label287;
                                                         case 33:
                                                            var43 = var59.v(var58, 33, var56[33], var43) as java.util.List;
                                                            var4 |= 2;
                                                            var44 = var37;
                                                            var45 = (java.lang.String)var25;
                                                            var37 = var24;
                                                            break label283;
                                                         case 34:
                                                            var24 = var59.v(var58, 34, C0.a, var24) as java.lang.String;
                                                            var74 = 4;
                                                            break label287;
                                                         case 35:
                                                            var25 = var59.v(var58, 35, C0.a, var25) as java.lang.String;
                                                            var74 = 8;
                                                            break label287;
                                                         case 36:
                                                            var37 = var59.v(var58, 36, C0.a, var37) as java.lang.String;
                                                            var74 = 16;
                                                            break label287;
                                                         case 37:
                                                            var40 = var59.t(var58, 37);
                                                            var4 |= 32;
                                                            break label284;
                                                         case 38:
                                                            var171 = var59.v(var58, 38, var56[38], var171) as java.util.List;
                                                            var4 |= 64;
                                                            var44 = var37;
                                                            break label182;
                                                         default:
                                                            throw new n(var74);
                                                      }

                                                      var27 = var28;
                                                      var28 = var27;
                                                      break label222;
                                                   }

                                                   var4 |= var74;
                                                   var44 = var37;
                                                }

                                                var37 = var24;
                                                var45 = (java.lang.String)var25;
                                                break label283;
                                             }

                                             var27 = var28;
                                             var28 = var27;
                                             break label222;
                                          }

                                          var44 = var124;
                                          var47 = (java.lang.String)var21;
                                          var49 = var20;
                                          var48 = var19;
                                          var45 = var18;
                                          var50 = var16;
                                          var51 = (java.lang.String)var91;
                                          var46 = var17;
                                          var30 = var85;
                                          break label223;
                                       }

                                       var52 = var30;
                                       var44 = var91;
                                       var47 = var16;
                                       var49 = var17;
                                       var48 = var18;
                                       var45 = var19;
                                       var50 = var20;
                                       var51 = (java.lang.String)var21;
                                       var46 = (java.lang.String)var124;
                                       var30 = var85;
                                       break label223;
                                    }

                                    var26 = var80;
                                    var63 = (java.lang.String)var37;
                                    var80 = (java.lang.String)var25;
                                    var37 = var24;
                                    var25 = var44;
                                    var24 = var62;
                                    break label224;
                                 }

                                 var52 = var30;
                                 var30 = var85;
                                 var46 = var17;
                                 var51 = (java.lang.String)var91;
                                 var50 = var16;
                                 var45 = var18;
                                 var48 = var19;
                                 var49 = var20;
                                 var47 = (java.lang.String)var21;
                                 var44 = var124;
                                 break label223;
                              }

                              var25 = var26;
                              var24 = var62;
                              var26 = var80;
                              var80 = var45;
                              var63 = (java.lang.String)var44;
                              break label224;
                           }

                           var65 = var12;
                           var27 = var28;
                           var18 = var20;
                           var17 = (java.lang.String)var21;
                           var16 = (java.lang.String)var124;
                           var12 = (java.lang.String)var24;
                           var80 = (java.lang.String)var25;
                           var25 = var26;
                           var53 = (java.lang.String)var37;
                           var85 = (java.lang.String)var89;
                           var89 = var30;
                           var91 = var80;
                           var20 = var18;
                           var21 = var16;
                           var124 = var91;
                           var26 = var17;
                           var28 = var27;
                           var24 = var62;
                           var30 = var85;
                           var44 = var29;
                           var29 = var38;
                           break label225;
                        }

                        var18 = var20;
                        var17 = (java.lang.String)var21;
                        var16 = (java.lang.String)var124;
                        var80 = (java.lang.String)var25;
                        var25 = var26;
                        var53 = (java.lang.String)var37;
                        var65 = var12;
                        var12 = (java.lang.String)var24;
                        var85 = (java.lang.String)var89;
                        var89 = var30;
                        var91 = var80;
                        var20 = var18;
                        var21 = var16;
                        var124 = var91;
                        var26 = var17;
                        var24 = var62;
                        var30 = var85;
                        var44 = var29;
                        var29 = var38;
                        break label225;
                     }

                     var91 = var80;
                     var27 = var28;
                     var85 = (java.lang.String)var89;
                     var80 = (java.lang.String)var25;
                     var65 = var12;
                     var53 = (java.lang.String)var37;
                     var12 = (java.lang.String)var24;
                     var89 = var52;
                     var16 = (java.lang.String)var44;
                     var17 = var47;
                     var18 = var49;
                     var19 = (java.lang.String)var48;
                     var20 = var45;
                     var21 = var50;
                     var124 = var51;
                     var26 = var46;
                     var25 = var26;
                     var28 = var27;
                     var24 = var62;
                     var44 = var29;
                     var29 = var38;
                     break label225;
                  }

                  var27 = var28;
                  var18 = var20;
                  var17 = (java.lang.String)var21;
                  var16 = (java.lang.String)var124;
                  var85 = (java.lang.String)var89;
                  var53 = var63;
                  var65 = var12;
                  var12 = (java.lang.String)var37;
                  var89 = var30;
                  var91 = var26;
                  var20 = var18;
                  var21 = var16;
                  var124 = var91;
                  var26 = var17;
                  var28 = var27;
                  var30 = var85;
                  var44 = var29;
                  var29 = var38;
               }

               var80 = (java.lang.String)var91;
               var18 = var20;
               var16 = (java.lang.String)var21;
               var91 = var124;
               var17 = var26;
               var26 = (java.lang.String)var25;
               var27 = var28;
               var25 = var80;
               var24 = var12;
               var37 = var53;
               var29 = (java.lang.String)var44;
               var12 = (java.lang.String)var65;
               var89 = var85;
               var28 = var27;
               var30 = (java.lang.String)var89;
               var20 = var18;
               var21 = var17;
               var124 = var16;
               var62 = (java.lang.String)var24;
               var85 = var30;
               var38 = var29;
            }

            var46 = var85;
            var85 = (java.lang.String)var24;
            var124 = var36;
            var36 = var28;
            var18 = (java.lang.String)var41;
            var3 = var6;
            var25 = var29;
            var76 = var171;
            var47 = var40;
            var20 = (java.lang.String)var37;
            var12 = (java.lang.String)var25;
            var91 = var43;
            var17 = (java.lang.String)var76;
            var16 = var62;
            var19 = var26;
            var171 = var80;
            var21 = var124;
            var23 = (java.lang.String)var21;
            var30 = var20;
            var24 = var19;
            var37 = var18;
            var28 = var16;
            var26 = (java.lang.String)var91;
            var40 = var17;
            var45 = var30;
            var43 = var27;
            var41 = var89;
            var27 = var12;
            var44 = var34;
            var29 = var23;
            var34 = var79;
            var6 = var5;
            var5 = var3;
            var7 = var68;
         }

         var59.b(var58);
         return new AppMessageEmbedImpl(
            var7,
            var4,
            var5,
            var3,
            var6,
            var38,
            (InviteType)var31,
            (Integer)var25,
            (Integer)var34,
            (Integer)var32,
            var33,
            var29,
            (Integer)var44,
            (java.lang.Boolean)var35,
            (java.lang.Boolean)var27,
            (Integer)var41,
            (Integer)var43,
            (java.lang.Boolean)var36,
            (Integer)var124,
            var45,
            var40,
            var26,
            (Integer)var28,
            (Integer)var37,
            (Integer)var24,
            var30,
            var23,
            (Integer)var21,
            var171,
            var42,
            var18,
            var19,
            var16,
            var46,
            var17,
            (java.util.List)var91,
            var85,
            var12,
            var20,
            var47,
            (java.util.List)var76,
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
         return ia.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AppMessageEmbedImpl> {
         return AppMessageEmbedImpl.$serializer.INSTANCE;
      }
   }
}
