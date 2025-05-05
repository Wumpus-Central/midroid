package com.discord.chat.bridge.codedlinks

import aa.f
import aa.n
import ba.a
import da.C0
import da.G
import da.N
import da.h
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
      val var36: Int = Integer.hashCode(this.borderColor);
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
                                                                                                                                                                                                                                                                                                                                                      + var36
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
      val var1: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var19: java.lang.String = this.headerText;
      val var25: InviteType = this.type;
      val var5: Int = this.acceptLabelBackgroundColor;
      val var10: Int = this.acceptLabelBorderColor;
      val var29: Int = this.acceptLabelColor;
      val var18: java.lang.String = this.acceptLabelText;
      val var28: java.lang.String = this.bodyText;
      val var34: Int = this.bodyTextColor;
      val var13: java.lang.Boolean = this.canBeAccepted;
      val var8: java.lang.Boolean = this.embedCanBeTapped;
      val var32: Int = this.resolvingGradientEnd;
      val var6: Int = this.resolvingGradientStart;
      val var24: java.lang.Boolean = this.splashHasRadialGradient;
      val var30: Int = this.splashOpacity;
      val var20: java.lang.String = this.splashUrl;
      val var12: java.lang.String = this.inviteSplash;
      val var40: java.lang.String = this.subtitle;
      val var14: Int = this.subtitleColor;
      val var37: Int = this.thumbnailBackgroundColor;
      val var11: Int = this.thumbnailCornerRadius;
      val var39: java.lang.String = this.thumbnailText;
      val var22: java.lang.String = this.thumbnailUrl;
      val var33: Int = this.titleColor;
      val var26: java.lang.String = this.titleText;
      val var35: java.lang.String = this.appId;
      val var31: java.lang.String = this.messageId;
      val var17: java.lang.String = this.title;
      val var9: java.lang.String = this.header;
      val var23: java.lang.String = this.info;
      val var27: java.lang.String = this.tagline;
      val var7: java.util.List = this.gradientColors;
      val var15: java.lang.String = this.staticBannerSrc;
      val var36: java.lang.String = this.iconSrc;
      val var21: java.lang.String = this.embedUrl;
      val var16: java.lang.String = this.bannerRatio;
      val var38: java.util.List = this.actions;
      val var4: StringBuilder = new StringBuilder();
      var4.append("AppMessageEmbedImpl(backgroundColor=");
      var4.append(var1);
      var4.append(", borderColor=");
      var4.append(var2);
      var4.append(", headerColor=");
      var4.append(var3);
      var4.append(", headerText=");
      var4.append(var19);
      var4.append(", type=");
      var4.append(var25);
      var4.append(", acceptLabelBackgroundColor=");
      var4.append(var5);
      var4.append(", acceptLabelBorderColor=");
      var4.append(var10);
      var4.append(", acceptLabelColor=");
      var4.append(var29);
      var4.append(", acceptLabelText=");
      var4.append(var18);
      var4.append(", bodyText=");
      var4.append(var28);
      var4.append(", bodyTextColor=");
      var4.append(var34);
      var4.append(", canBeAccepted=");
      var4.append(var13);
      var4.append(", embedCanBeTapped=");
      var4.append(var8);
      var4.append(", resolvingGradientEnd=");
      var4.append(var32);
      var4.append(", resolvingGradientStart=");
      var4.append(var6);
      var4.append(", splashHasRadialGradient=");
      var4.append(var24);
      var4.append(", splashOpacity=");
      var4.append(var30);
      var4.append(", splashUrl=");
      var4.append(var20);
      var4.append(", inviteSplash=");
      var4.append(var12);
      var4.append(", subtitle=");
      var4.append(var40);
      var4.append(", subtitleColor=");
      var4.append(var14);
      var4.append(", thumbnailBackgroundColor=");
      var4.append(var37);
      var4.append(", thumbnailCornerRadius=");
      var4.append(var11);
      var4.append(", thumbnailText=");
      var4.append(var39);
      var4.append(", thumbnailUrl=");
      var4.append(var22);
      var4.append(", titleColor=");
      var4.append(var33);
      var4.append(", titleText=");
      var4.append(var26);
      var4.append(", appId=");
      var4.append(var35);
      var4.append(", messageId=");
      var4.append(var31);
      var4.append(", title=");
      var4.append(var17);
      var4.append(", header=");
      var4.append(var9);
      var4.append(", info=");
      var4.append(var23);
      var4.append(", tagline=");
      var4.append(var27);
      var4.append(", gradientColors=");
      var4.append(var7);
      var4.append(", staticBannerSrc=");
      var4.append(var15);
      var4.append(", iconSrc=");
      var4.append(var36);
      var4.append(", embedUrl=");
      var4.append(var21);
      var4.append(", bannerRatio=");
      var4.append(var16);
      var4.append(", actions=");
      var4.append(var38);
      var4.append(")");
      return var4.toString();
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
         val var9: N = N.a;
         val var10: C0 = C0.a;
         val var7: KSerializer = a.u(C0.a);
         val var12: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var8: KSerializer = a.u(var9);
         val var4: KSerializer = a.u(var9);
         val var5: KSerializer = a.u(var9);
         val var11: KSerializer = a.u(var10);
         val var1: KSerializer = a.u(var10);
         val var2: KSerializer = a.u(var9);
         val var3: h = h.a;
         return new KSerializer[]{
            var9,
            var9,
            var9,
            var7,
            var12,
            var8,
            var4,
            var5,
            var11,
            var1,
            var2,
            a.u(h.a),
            a.u(var3),
            a.u(var9),
            a.u(var9),
            a.u(var3),
            a.u(var9),
            a.u(var10),
            a.u(var10),
            a.u(var10),
            a.u(var9),
            a.u(var9),
            a.u(var9),
            a.u(var10),
            a.u(var10),
            a.u(var9),
            a.u(var10),
            var10,
            var10,
            a.u(var10),
            a.u(var10),
            a.u(var10),
            a.u(var10),
            a.u(var6[33]),
            a.u(var10),
            a.u(var10),
            a.u(var10),
            var10,
            a.u(var6[38])
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
         var var15: java.lang.String;
         var var17: java.lang.String;
         var var18: java.lang.String;
         var var19: java.lang.String;
         var var20: java.lang.String;
         var var21: Any;
         var var24: Any;
         var var26: Any;
         var var27: Any;
         var var28: java.lang.String;
         var var30: java.lang.String;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: java.lang.String;
         var var35: Any;
         var var37: java.lang.String;
         var var38: java.lang.String;
         var var39: java.lang.String;
         var var40: java.lang.String;
         var var41: Any;
         var var42: Any;
         var var43: Any;
         var var44: Any;
         var var45: java.lang.String;
         var var46: Any;
         var var47: java.lang.String;
         var var60: Any;
         var var67: Int;
         var var74: java.lang.String;
         var var83: Any;
         var var94: java.lang.String;
         var var120: Any;
         var var136: Any;
         var var154: java.lang.String;
         var var162: java.lang.String;
         if (var58.y()) {
            var5 = var58.k(var57, 0);
            var67 = var58.k(var57, 1);
            val var2: Int = var58.k(var57, 2);
            var60 = C0.a;
            var38 = var58.v(var57, 3, C0.a, null) as java.lang.String;
            var31 = var58.v(var57, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var9: N = N.a;
            var33 = var58.v(var57, 5, N.a, null) as Int;
            var24 = var58.v(var57, 6, var9, null) as Int;
            var32 = var58.v(var57, 7, var9, null) as Int;
            var34 = var58.v(var57, 8, (DeserializationStrategy)var60, null) as java.lang.String;
            var136 = var58.v(var57, 9, (DeserializationStrategy)var60, null) as java.lang.String;
            var120 = var58.v(var57, 10, var9, null) as Int;
            val var10: h = h.a;
            var35 = var58.v(var57, 11, h.a, null) as java.lang.Boolean;
            var43 = var58.v(var57, 12, var10, null) as java.lang.Boolean;
            var27 = var58.v(var57, 13, var9, null) as Int;
            var42 = var58.v(var57, 14, var9, null) as Int;
            var41 = var58.v(var57, 15, var10, null) as java.lang.Boolean;
            val var36: Int = var58.v(var57, 16, var9, null) as Int;
            var47 = var58.v(var57, 17, (DeserializationStrategy)var60, null) as java.lang.String;
            var45 = var58.v(var57, 18, (DeserializationStrategy)var60, null) as java.lang.String;
            var37 = var58.v(var57, 19, (DeserializationStrategy)var60, null) as java.lang.String;
            var26 = var58.v(var57, 20, var9, null) as Int;
            val var29: Int = var58.v(var57, 21, var9, null) as Int;
            var46 = var58.v(var57, 22, var9, null) as Int;
            var30 = var58.v(var57, 23, (DeserializationStrategy)var60, null) as java.lang.String;
            val var23: java.lang.String = var58.v(var57, 24, (DeserializationStrategy)var60, null) as java.lang.String;
            var21 = var58.v(var57, 25, var9, null) as Int;
            var83 = var58.v(var57, 26, (DeserializationStrategy)var60, null) as java.lang.String;
            val var11: java.lang.String = var58.t(var57, 27);
            var18 = var58.t(var57, 28);
            var19 = var58.v(var57, 29, (DeserializationStrategy)var60, null) as java.lang.String;
            var94 = var58.v(var57, 30, (DeserializationStrategy)var60, null) as java.lang.String;
            var15 = var58.v(var57, 31, (DeserializationStrategy)var60, null) as java.lang.String;
            var17 = var58.v(var57, 32, (DeserializationStrategy)var60, null) as java.lang.String;
            val var14: java.util.List = var58.v(var57, 33, var56[33], null) as java.util.List;
            var74 = var58.v(var57, 34, (DeserializationStrategy)var60, null) as java.lang.String;
            var12 = var58.v(var57, 35, (DeserializationStrategy)var60, null) as java.lang.String;
            var20 = var58.v(var57, 36, (DeserializationStrategy)var60, null) as java.lang.String;
            val var76: java.lang.String = var58.t(var57, 37);
            var60 = var58.v(var57, 38, var56[38], null) as java.util.List;
            var4 = 127;
            var7 = -1;
            var6 = var67;
            var67 = var2;
            var28 = (java.lang.String)var136;
            var44 = var120;
            var120 = var36;
            var136 = var29;
            var39 = var23;
            var154 = (java.lang.String)var83;
            var40 = var11;
            var162 = var94;
            var83 = var14;
            var94 = var74;
            var74 = var76;
         } else {
            var var70: Boolean = true;
            var136 = null;
            var24 = null;
            var74 = null;
            var37 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var32 = null;
            var var77: Any = null;
            var31 = null;
            var43 = null;
            var154 = null;
            var var132: java.lang.String = null;
            var12 = null;
            var var87: Any = null;
            var27 = null;
            var28 = null;
            var162 = null;
            var30 = null;
            var18 = null;
            var15 = null;
            var94 = null;
            var17 = null;
            var19 = null;
            var20 = null;
            var21 = null;
            var120 = null;
            var var78: java.lang.String = null;
            var42 = null;
            var41 = null;
            var26 = null;
            var60 = null;
            var83 = null;
            var40 = null;
            var38 = null;
            var var66: Int = 0;
            var67 = 0;
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var39 = null;

            while (var70) {
               var var53: java.lang.String;
               label225: {
                  label224: {
                     var var48: java.lang.String;
                     var var49: Any;
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
                                                   var var72: Int;
                                                   label287: {
                                                      var72 = var58.x(var57);
                                                      switch (var72) {
                                                         case -1:
                                                            var70 = false;
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
                                                            var27 = var28;
                                                            var31 = var58.v(var57, 4, InviteType.Serializer.INSTANCE, var31) as InviteType;
                                                            var66 |= 16;
                                                            var28 = (java.lang.String)var27;
                                                            break label222;
                                                         case 5:
                                                            var154 = var58.v(var57, 5, N.a, var154) as Int;
                                                            var66 |= 32;
                                                            break label286;
                                                         case 6:
                                                            var77 = var58.v(var57, 6, N.a, var77) as Int;
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
                                                            var132 = var58.v(var57, 9, C0.a, var132) as java.lang.String;
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
                                                            var28 = (java.lang.String)var27;
                                                            var87 = var58.v(var57, 13, N.a, var87) as Int;
                                                            var66 |= 8192;
                                                            var27 = var28;
                                                            break label222;
                                                         case 14:
                                                            var44 = var58.v(var57, 14, N.a, var27) as Int;
                                                            var66 |= 16384;
                                                            var27 = var28;
                                                            var28 = (java.lang.String)var44;
                                                            break label222;
                                                         case 15:
                                                            var44 = var58.v(var57, 15, h.a, var28) as java.lang.Boolean;
                                                            var66 |= 32768;
                                                            var28 = (java.lang.String)var27;
                                                            var27 = var44;
                                                            break label222;
                                                         case 16:
                                                            var162 = var58.v(var57, 16, N.a, var162) as Int;
                                                            var66 |= 65536;
                                                            var52 = var30;
                                                            break label285;
                                                         case 17:
                                                            var52 = var58.v(var57, 17, C0.a, var30) as java.lang.String;
                                                            var66 |= 131072;
                                                            break label285;
                                                         case 18:
                                                            var17 = var20;
                                                            var94 = (java.lang.String)var21;
                                                            var21 = var15;
                                                            var120 = var58.v(var57, 18, C0.a, var18) as java.lang.String;
                                                            var66 |= 262144;
                                                            var15 = (java.lang.String)var120;
                                                            var18 = var19;
                                                            var19 = var17;
                                                            var20 = var94;
                                                            break label215;
                                                         case 19:
                                                            var17 = var20;
                                                            var20 = var94;
                                                            var45 = var58.v(var57, 19, C0.a, var15) as java.lang.String;
                                                            var66 |= 524288;
                                                            var120 = var18;
                                                            var15 = (java.lang.String)var120;
                                                            var94 = (java.lang.String)var21;
                                                            var18 = var19;
                                                            var19 = var17;
                                                            var21 = var45;
                                                            break label215;
                                                         case 20:
                                                            var46 = var58.v(var57, 20, N.a, var94) as Int;
                                                            var66 |= 1048576;
                                                            var120 = var18;
                                                            var15 = (java.lang.String)var120;
                                                            var94 = (java.lang.String)var21;
                                                            var17 = var20;
                                                            var18 = var19;
                                                            var19 = var17;
                                                            var20 = (java.lang.String)var46;
                                                            var21 = var15;
                                                            break label215;
                                                         case 21:
                                                            val var232: Int = var58.v(var57, 21, N.a, var17) as Int;
                                                            var66 |= 2097152;
                                                            var120 = var18;
                                                            var15 = (java.lang.String)var120;
                                                            var94 = (java.lang.String)var21;
                                                            var17 = var20;
                                                            var18 = var19;
                                                            var19 = var232;
                                                            var20 = var94;
                                                            var21 = var15;
                                                            break label215;
                                                         case 22:
                                                            val var108: Int = var58.v(var57, 22, N.a, var19) as Int;
                                                            var66 |= 4194304;
                                                            var120 = var18;
                                                            var15 = (java.lang.String)var120;
                                                            var94 = (java.lang.String)var21;
                                                            var17 = var20;
                                                            var18 = var108;
                                                            var19 = var17;
                                                            var20 = var94;
                                                            var21 = var15;
                                                            break label215;
                                                         case 23:
                                                            var46 = var58.v(var57, 23, C0.a, var20) as java.lang.String;
                                                            var66 |= 8388608;
                                                            var120 = var18;
                                                            var20 = var94;
                                                            var18 = var19;
                                                            var15 = (java.lang.String)var120;
                                                            var94 = (java.lang.String)var21;
                                                            var17 = (java.lang.String)var46;
                                                            var19 = var17;
                                                            var21 = var15;
                                                            break label215;
                                                         case 24:
                                                            var46 = var58.v(var57, 24, C0.a, var21) as java.lang.String;
                                                            var66 |= 16777216;
                                                            var120 = var18;
                                                            var21 = var15;
                                                            var18 = var19;
                                                            var17 = var20;
                                                            var15 = (java.lang.String)var120;
                                                            var94 = (java.lang.String)var46;
                                                            var19 = var17;
                                                            var20 = var94;
                                                            break label215;
                                                         case 25:
                                                            var44 = var58.v(var57, 25, N.a, var120) as Int;
                                                            var66 |= 33554432;
                                                            var120 = var18;
                                                            var18 = var19;
                                                            var17 = var20;
                                                            var94 = (java.lang.String)var21;
                                                            var21 = var15;
                                                            var20 = var94;
                                                            var19 = var17;
                                                            var15 = (java.lang.String)var44;
                                                            break label215;
                                                         case 26:
                                                            var45 = var58.v(var57, 26, C0.a, var78) as java.lang.String;
                                                            var66 |= 67108864;
                                                            var60 = var37;
                                                            var78 = (java.lang.String)var136;
                                                            var37 = (java.lang.String)var24;
                                                            var26 = var45;
                                                            var136 = var26;
                                                            var24 = var60;
                                                            break label224;
                                                         case 27:
                                                            var42 = var58.t(var57, 27);
                                                            var66 |= 134217728;
                                                            var44 = var26;
                                                            break label216;
                                                         case 28:
                                                            var41 = var58.t(var57, 28);
                                                            var66 |= 268435456;
                                                            var44 = var26;
                                                            break label216;
                                                         case 29:
                                                            var44 = var58.v(var57, 29, C0.a, var26) as java.lang.String;
                                                            var66 |= 536870912;
                                                            break label216;
                                                         case 30:
                                                            var44 = var58.v(var57, 30, C0.a, var60) as java.lang.String;
                                                            var66 |= 1073741824;
                                                            var60 = var37;
                                                            var78 = (java.lang.String)var136;
                                                            var37 = (java.lang.String)var24;
                                                            var26 = var78;
                                                            var136 = var26;
                                                            var24 = var44;
                                                            break label224;
                                                         case 31:
                                                            var83 = var58.v(var57, 31, C0.a, var83) as java.lang.String;
                                                            var66 |= Integer.MIN_VALUE;
                                                            break label284;
                                                         case 32:
                                                            var74 = var58.v(var57, 32, C0.a, var74) as java.lang.String;
                                                            var72 = 1;
                                                            break label287;
                                                         case 33:
                                                            var43 = var58.v(var57, 33, var56[33], var43) as java.util.List;
                                                            var4 |= 2;
                                                            var44 = var37;
                                                            var45 = (java.lang.String)var136;
                                                            var37 = (java.lang.String)var24;
                                                            break label283;
                                                         case 34:
                                                            var24 = var58.v(var57, 34, C0.a, var24) as java.lang.String;
                                                            var72 = 4;
                                                            break label287;
                                                         case 35:
                                                            var136 = var58.v(var57, 35, C0.a, var136) as java.lang.String;
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
                                                            var44 = var37;
                                                            break label182;
                                                         default:
                                                            throw new n(var72);
                                                      }

                                                      var27 = var28;
                                                      var28 = (java.lang.String)var27;
                                                      break label222;
                                                   }

                                                   var4 |= var72;
                                                   var44 = var37;
                                                }

                                                var37 = (java.lang.String)var24;
                                                var45 = (java.lang.String)var136;
                                                break label283;
                                             }

                                             var27 = var28;
                                             var28 = (java.lang.String)var27;
                                             break label222;
                                          }

                                          var49 = var120;
                                          var47 = (java.lang.String)var21;
                                          var48 = var20;
                                          var45 = var19;
                                          var50 = var17;
                                          var51 = var94;
                                          var44 = var15;
                                          var46 = var18;
                                          var30 = (java.lang.String)var83;
                                          break label223;
                                       }

                                       var52 = var30;
                                       var49 = var15;
                                       var47 = var94;
                                       var48 = var17;
                                       var45 = var18;
                                       var50 = var19;
                                       var51 = var20;
                                       var44 = var21;
                                       var46 = var120;
                                       var30 = (java.lang.String)var83;
                                       break label223;
                                    }

                                    var26 = var78;
                                    var60 = var37;
                                    var78 = (java.lang.String)var136;
                                    var37 = (java.lang.String)var24;
                                    var136 = var44;
                                    var24 = var60;
                                    break label224;
                                 }

                                 var52 = var30;
                                 var30 = (java.lang.String)var83;
                                 var46 = var18;
                                 var44 = var15;
                                 var51 = var94;
                                 var50 = var17;
                                 var45 = var19;
                                 var48 = var20;
                                 var47 = (java.lang.String)var21;
                                 var49 = var120;
                                 break label223;
                              }

                              var136 = var26;
                              var24 = var60;
                              var26 = var78;
                              var78 = var45;
                              var60 = var44;
                              break label224;
                           }

                           var60 = var12;
                           var27 = var28;
                           var18 = var20;
                           var17 = (java.lang.String)var21;
                           var94 = (java.lang.String)var120;
                           var12 = (java.lang.String)var24;
                           var78 = (java.lang.String)var136;
                           var136 = var26;
                           var53 = var37;
                           var83 = var87;
                           var87 = var30;
                           var15 = var78;
                           var20 = var17;
                           var21 = var94;
                           var120 = var15;
                           var26 = var18;
                           var28 = (java.lang.String)var27;
                           var24 = var60;
                           var30 = (java.lang.String)var83;
                           var44 = var154;
                           var154 = var38;
                           break label225;
                        }

                        var18 = var20;
                        var17 = (java.lang.String)var21;
                        var94 = (java.lang.String)var120;
                        var78 = (java.lang.String)var136;
                        var136 = var26;
                        var53 = var37;
                        var60 = var12;
                        var12 = (java.lang.String)var24;
                        var83 = var87;
                        var87 = var30;
                        var15 = var78;
                        var20 = var17;
                        var21 = var94;
                        var120 = var15;
                        var26 = var18;
                        var24 = var60;
                        var30 = (java.lang.String)var83;
                        var44 = var154;
                        var154 = var38;
                        break label225;
                     }

                     var15 = var78;
                     var27 = var28;
                     var83 = var87;
                     var78 = (java.lang.String)var136;
                     var60 = var12;
                     var53 = var37;
                     var12 = (java.lang.String)var24;
                     var87 = var52;
                     var94 = (java.lang.String)var49;
                     var17 = var47;
                     var18 = var48;
                     var19 = var45;
                     var20 = (java.lang.String)var50;
                     var21 = var51;
                     var120 = var44;
                     var26 = var46;
                     var136 = var26;
                     var28 = (java.lang.String)var27;
                     var24 = var60;
                     var44 = var154;
                     var154 = var38;
                     break label225;
                  }

                  var27 = var28;
                  var18 = var20;
                  var17 = (java.lang.String)var21;
                  var94 = (java.lang.String)var120;
                  var83 = var87;
                  var53 = (java.lang.String)var60;
                  var60 = var12;
                  var12 = var37;
                  var87 = var30;
                  var15 = (java.lang.String)var26;
                  var20 = var17;
                  var21 = var94;
                  var120 = var15;
                  var26 = var18;
                  var28 = (java.lang.String)var27;
                  var30 = (java.lang.String)var83;
                  var44 = var154;
                  var154 = var38;
               }

               var78 = var15;
               var17 = var20;
               var94 = (java.lang.String)var21;
               var15 = (java.lang.String)var120;
               var18 = (java.lang.String)var26;
               var26 = var136;
               var27 = var28;
               var136 = var78;
               var24 = var12;
               var37 = var53;
               var154 = (java.lang.String)var44;
               var12 = (java.lang.String)var60;
               var87 = var83;
               var28 = (java.lang.String)var27;
               var30 = (java.lang.String)var87;
               var20 = var18;
               var21 = var17;
               var120 = var94;
               var60 = var24;
               var83 = var30;
               var38 = var154;
            }

            var83 = var43;
            var46 = var19;
            var136 = var17;
            var26 = var94;
            var45 = var18;
            var120 = var162;
            var18 = (java.lang.String)var41;
            var74 = var40;
            var67 = var5;
            var60 = var39;
            var20 = var37;
            var12 = (java.lang.String)var136;
            var94 = (java.lang.String)var24;
            var17 = var74;
            var15 = (java.lang.String)var83;
            var162 = (java.lang.String)var60;
            var19 = (java.lang.String)var26;
            var40 = (java.lang.String)var42;
            var154 = var78;
            var21 = var120;
            var39 = (java.lang.String)var21;
            var30 = var20;
            var37 = var15;
            var47 = var30;
            var41 = var28;
            var42 = var27;
            var27 = var87;
            var43 = var12;
            var44 = var34;
            var28 = var132;
            var34 = (java.lang.String)var33;
            var24 = var77;
            var33 = var154;
            var5 = var67;
            var7 = var66;
         }

         var58.b(var57);
         return new AppMessageEmbedImpl(
            var7,
            var4,
            var5,
            var6,
            var67,
            var38,
            (InviteType)var31,
            (Integer)var33,
            (Integer)var24,
            (Integer)var32,
            var34,
            var28,
            (Integer)var44,
            (java.lang.Boolean)var35,
            (java.lang.Boolean)var43,
            (Integer)var27,
            (Integer)var42,
            (java.lang.Boolean)var41,
            (Integer)var120,
            var47,
            var45,
            var37,
            (Integer)var26,
            (Integer)var136,
            (Integer)var46,
            var30,
            var39,
            (Integer)var21,
            var154,
            var40,
            var18,
            var19,
            var162,
            var15,
            var17,
            (java.util.List)var83,
            var94,
            var12,
            var20,
            var74,
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
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AppMessageEmbedImpl> {
         return AppMessageEmbedImpl.$serializer.INSTANCE;
      }
   }
}
