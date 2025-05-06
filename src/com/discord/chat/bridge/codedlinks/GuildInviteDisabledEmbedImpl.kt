package com.discord.chat.bridge.codedlinks

import ea.f
import ea.n
import fa.a
import ha.C0
import ha.G
import ha.N
import ha.h
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
public data class GuildInviteDisabledEmbedImpl(backgroundColor: Int,
      borderColor: Int,
      headerColor: Int,
      headerText: String,
      type: InviteType,
      titleText: String,
      subtitle: String,
      helpCenterArticleLabel: String,
      helpCenterArticleURL: String,
      acceptLabelBackgroundColor: Int? = null,
      acceptLabelBorderColor: Int? = null,
      acceptLabelColor: Int? = null,
      acceptLabelText: String? = null,
      bodyText: String? = null,
      bodyTextColor: Int? = null,
      canBeAccepted: Boolean? = ...,
      channelIcon: String? = ...,
      channelName: String? = ...,
      embedCanBeTapped: Boolean? = ...,
      memberText: String? = ...,
      onlineText: String? = ...,
      resolvingGradientEnd: Int? = ...,
      resolvingGradientStart: Int? = ...,
      splashHasRadialGradient: Boolean? = ...,
      splashOpacity: Int? = ...,
      splashUrl: String? = ...,
      inviteSplash: String? = ...,
      subtitleColor: Int? = ...,
      thumbnailBackgroundColor: Int? = ...,
      thumbnailCornerRadius: Int? = ...,
      thumbnailText: String? = ...,
      thumbnailUrl: String? = null,
      titleColor: Int? = null,
      extendedType: CodedLinkExtendedType = CodedLinkExtendedType.GUILD_INVITE_DISABLED,
      guildName: String,
      guildIcon: String? = null,
      headerIcon: String? = null,
      badgeIconUrl: String? = null
   )
   : CodedLinkEmbed,
   GuildDisabledInviteEmbed,
   GuildInviteExtendedEmbed {
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelText: String?
   public open val backgroundColor: Int
   public open val badgeIconUrl: String?
   public open val bodyText: String?
   public open val bodyTextColor: Int?
   public open val borderColor: Int
   public open val canBeAccepted: Boolean?
   public open val channelIcon: String?
   public open val channelName: String?
   public open val embedCanBeTapped: Boolean?
   public open val extendedType: CodedLinkExtendedType
   public open val guildIcon: String?
   public open val guildName: String
   public open val headerColor: Int
   public open val headerIcon: String?
   public open val headerText: String
   public open val helpCenterArticleLabel: String
   public open val helpCenterArticleURL: String
   public open val inviteSplash: String?
   public open val memberText: String?
   public open val onlineText: String?
   public open val resolvingGradientEnd: Int?
   public open val resolvingGradientStart: Int?
   public open val splashHasRadialGradient: Boolean?
   public open val splashOpacity: Int?
   public open val splashUrl: String?
   public open val subtitle: String
   public open val subtitleColor: Int?
   public open val thumbnailBackgroundColor: Int?
   public open val thumbnailCornerRadius: Int?
   public open val thumbnailText: String?
   public open val thumbnailUrl: String?
   public open val titleColor: Int?
   public open val titleText: String
   public open val type: InviteType

   init {
      q.h(var4, "headerText");
      q.h(var5, "type");
      q.h(var6, "titleText");
      q.h(var7, "subtitle");
      q.h(var8, "helpCenterArticleLabel");
      q.h(var9, "helpCenterArticleURL");
      q.h(var34, "extendedType");
      q.h(var35, "guildName");
      super(null);
      this.backgroundColor = var1;
      this.borderColor = var2;
      this.headerColor = var3;
      this.headerText = var4;
      this.type = var5;
      this.titleText = var6;
      this.subtitle = var7;
      this.helpCenterArticleLabel = var8;
      this.helpCenterArticleURL = var9;
      this.acceptLabelBackgroundColor = var10;
      this.acceptLabelBorderColor = var11;
      this.acceptLabelColor = var12;
      this.acceptLabelText = var13;
      this.bodyText = var14;
      this.bodyTextColor = var15;
      this.canBeAccepted = var16;
      this.channelIcon = var17;
      this.channelName = var18;
      this.embedCanBeTapped = var19;
      this.memberText = var20;
      this.onlineText = var21;
      this.resolvingGradientEnd = var22;
      this.resolvingGradientStart = var23;
      this.splashHasRadialGradient = var24;
      this.splashOpacity = var25;
      this.splashUrl = var26;
      this.inviteSplash = var27;
      this.subtitleColor = var28;
      this.thumbnailBackgroundColor = var29;
      this.thumbnailCornerRadius = var30;
      this.thumbnailText = var31;
      this.thumbnailUrl = var32;
      this.titleColor = var33;
      this.extendedType = var34;
      this.guildName = var35;
      this.guildIcon = var36;
      this.headerIcon = var37;
      this.badgeIconUrl = var38;
   }

   public operator fun component1(): Int {
      return this.backgroundColor;
   }

   public operator fun component10(): Int? {
      return this.acceptLabelBackgroundColor;
   }

   public operator fun component11(): Int? {
      return this.acceptLabelBorderColor;
   }

   public operator fun component12(): Int? {
      return this.acceptLabelColor;
   }

   public operator fun component13(): String? {
      return this.acceptLabelText;
   }

   public operator fun component14(): String? {
      return this.bodyText;
   }

   public operator fun component15(): Int? {
      return this.bodyTextColor;
   }

   public operator fun component16(): Boolean? {
      return this.canBeAccepted;
   }

   public operator fun component17(): String? {
      return this.channelIcon;
   }

   public operator fun component18(): String? {
      return this.channelName;
   }

   public operator fun component19(): Boolean? {
      return this.embedCanBeTapped;
   }

   public operator fun component2(): Int {
      return this.borderColor;
   }

   public operator fun component20(): String? {
      return this.memberText;
   }

   public operator fun component21(): String? {
      return this.onlineText;
   }

   public operator fun component22(): Int? {
      return this.resolvingGradientEnd;
   }

   public operator fun component23(): Int? {
      return this.resolvingGradientStart;
   }

   public operator fun component24(): Boolean? {
      return this.splashHasRadialGradient;
   }

   public operator fun component25(): Int? {
      return this.splashOpacity;
   }

   public operator fun component26(): String? {
      return this.splashUrl;
   }

   public operator fun component27(): String? {
      return this.inviteSplash;
   }

   public operator fun component28(): Int? {
      return this.subtitleColor;
   }

   public operator fun component29(): Int? {
      return this.thumbnailBackgroundColor;
   }

   public operator fun component3(): Int {
      return this.headerColor;
   }

   public operator fun component30(): Int? {
      return this.thumbnailCornerRadius;
   }

   public operator fun component31(): String? {
      return this.thumbnailText;
   }

   public operator fun component32(): String? {
      return this.thumbnailUrl;
   }

   public operator fun component33(): Int? {
      return this.titleColor;
   }

   public operator fun component34(): CodedLinkExtendedType {
      return this.extendedType;
   }

   public operator fun component35(): String {
      return this.guildName;
   }

   public operator fun component36(): String? {
      return this.guildIcon;
   }

   public operator fun component37(): String? {
      return this.headerIcon;
   }

   public operator fun component38(): String? {
      return this.badgeIconUrl;
   }

   public operator fun component4(): String {
      return this.headerText;
   }

   public operator fun component5(): InviteType {
      return this.type;
   }

   public operator fun component6(): String {
      return this.titleText;
   }

   public operator fun component7(): String {
      return this.subtitle;
   }

   public operator fun component8(): String {
      return this.helpCenterArticleLabel;
   }

   public operator fun component9(): String {
      return this.helpCenterArticleURL;
   }

   public fun copy(
      backgroundColor: Int = var0.backgroundColor,
      borderColor: Int = var0.borderColor,
      headerColor: Int = var0.headerColor,
      headerText: String = var0.headerText,
      type: InviteType = var0.type,
      titleText: String = var0.titleText,
      subtitle: String = var0.subtitle,
      helpCenterArticleLabel: String = var0.helpCenterArticleLabel,
      helpCenterArticleURL: String = var0.helpCenterArticleURL,
      acceptLabelBackgroundColor: Int? = var0.acceptLabelBackgroundColor,
      acceptLabelBorderColor: Int? = var0.acceptLabelBorderColor,
      acceptLabelColor: Int? = var0.acceptLabelColor,
      acceptLabelText: String? = var0.acceptLabelText,
      bodyText: String? = var0.bodyText,
      bodyTextColor: Int? = var0.bodyTextColor,
      canBeAccepted: Boolean? = var0.canBeAccepted,
      channelIcon: String? = var0.channelIcon,
      channelName: String? = var0.channelName,
      embedCanBeTapped: Boolean? = var0.embedCanBeTapped,
      memberText: String? = var0.memberText,
      onlineText: String? = var0.onlineText,
      resolvingGradientEnd: Int? = var0.resolvingGradientEnd,
      resolvingGradientStart: Int? = var0.resolvingGradientStart,
      splashHasRadialGradient: Boolean? = var0.splashHasRadialGradient,
      splashOpacity: Int? = var0.splashOpacity,
      splashUrl: String? = var0.splashUrl,
      inviteSplash: String? = var0.inviteSplash,
      subtitleColor: Int? = var0.subtitleColor,
      thumbnailBackgroundColor: Int? = var0.thumbnailBackgroundColor,
      thumbnailCornerRadius: Int? = var0.thumbnailCornerRadius,
      thumbnailText: String? = var0.thumbnailText,
      thumbnailUrl: String? = var0.thumbnailUrl,
      titleColor: Int? = var0.titleColor,
      extendedType: CodedLinkExtendedType = var0.extendedType,
      guildName: String = var0.guildName,
      guildIcon: String? = var0.guildIcon,
      headerIcon: String? = var0.headerIcon,
      badgeIconUrl: String? = var0.badgeIconUrl
   ): GuildInviteDisabledEmbedImpl {
      q.h(var4, "headerText");
      q.h(var5, "type");
      q.h(var6, "titleText");
      q.h(var7, "subtitle");
      q.h(var8, "helpCenterArticleLabel");
      q.h(var9, "helpCenterArticleURL");
      q.h(var34, "extendedType");
      q.h(var35, "guildName");
      return new GuildInviteDisabledEmbedImpl(
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
         var38
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildInviteDisabledEmbedImpl) {
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
         } else if (!q.c(this.titleText, var1.titleText)) {
            return false;
         } else if (!q.c(this.subtitle, var1.subtitle)) {
            return false;
         } else if (!q.c(this.helpCenterArticleLabel, var1.helpCenterArticleLabel)) {
            return false;
         } else if (!q.c(this.helpCenterArticleURL, var1.helpCenterArticleURL)) {
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
         } else if (!q.c(this.channelIcon, var1.channelIcon)) {
            return false;
         } else if (!q.c(this.channelName, var1.channelName)) {
            return false;
         } else if (!q.c(this.embedCanBeTapped, var1.embedCanBeTapped)) {
            return false;
         } else if (!q.c(this.memberText, var1.memberText)) {
            return false;
         } else if (!q.c(this.onlineText, var1.onlineText)) {
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
         } else if (this.extendedType != var1.extendedType) {
            return false;
         } else if (!q.c(this.guildName, var1.guildName)) {
            return false;
         } else if (!q.c(this.guildIcon, var1.guildIcon)) {
            return false;
         } else if (!q.c(this.headerIcon, var1.headerIcon)) {
            return false;
         } else {
            return q.c(this.badgeIconUrl, var1.badgeIconUrl);
         }
      }
   }

   public override fun hashCode(): Int {
      val var35: Int = Integer.hashCode(this.backgroundColor);
      val var29: Int = Integer.hashCode(this.borderColor);
      val var28: Int = Integer.hashCode(this.headerColor);
      val var34: Int = this.headerText.hashCode();
      val var31: Int = this.type.hashCode();
      val var36: Int = this.titleText.hashCode();
      val var33: Int = this.subtitle.hashCode();
      val var30: Int = this.helpCenterArticleLabel.hashCode();
      val var32: Int = this.helpCenterArticleURL.hashCode();
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
      if (this.bodyText == null) {
         var5 = 0;
      } else {
         var5 = this.bodyText.hashCode();
      }

      val var6: Int;
      if (this.bodyTextColor == null) {
         var6 = 0;
      } else {
         var6 = this.bodyTextColor.hashCode();
      }

      val var7: Int;
      if (this.canBeAccepted == null) {
         var7 = 0;
      } else {
         var7 = this.canBeAccepted.hashCode();
      }

      val var8: Int;
      if (this.channelIcon == null) {
         var8 = 0;
      } else {
         var8 = this.channelIcon.hashCode();
      }

      val var9: Int;
      if (this.channelName == null) {
         var9 = 0;
      } else {
         var9 = this.channelName.hashCode();
      }

      val var10: Int;
      if (this.embedCanBeTapped == null) {
         var10 = 0;
      } else {
         var10 = this.embedCanBeTapped.hashCode();
      }

      val var11: Int;
      if (this.memberText == null) {
         var11 = 0;
      } else {
         var11 = this.memberText.hashCode();
      }

      val var12: Int;
      if (this.onlineText == null) {
         var12 = 0;
      } else {
         var12 = this.onlineText.hashCode();
      }

      val var13: Int;
      if (this.resolvingGradientEnd == null) {
         var13 = 0;
      } else {
         var13 = this.resolvingGradientEnd.hashCode();
      }

      val var14: Int;
      if (this.resolvingGradientStart == null) {
         var14 = 0;
      } else {
         var14 = this.resolvingGradientStart.hashCode();
      }

      val var15: Int;
      if (this.splashHasRadialGradient == null) {
         var15 = 0;
      } else {
         var15 = this.splashHasRadialGradient.hashCode();
      }

      val var16: Int;
      if (this.splashOpacity == null) {
         var16 = 0;
      } else {
         var16 = this.splashOpacity.hashCode();
      }

      val var17: Int;
      if (this.splashUrl == null) {
         var17 = 0;
      } else {
         var17 = this.splashUrl.hashCode();
      }

      val var18: Int;
      if (this.inviteSplash == null) {
         var18 = 0;
      } else {
         var18 = this.inviteSplash.hashCode();
      }

      val var19: Int;
      if (this.subtitleColor == null) {
         var19 = 0;
      } else {
         var19 = this.subtitleColor.hashCode();
      }

      val var20: Int;
      if (this.thumbnailBackgroundColor == null) {
         var20 = 0;
      } else {
         var20 = this.thumbnailBackgroundColor.hashCode();
      }

      val var21: Int;
      if (this.thumbnailCornerRadius == null) {
         var21 = 0;
      } else {
         var21 = this.thumbnailCornerRadius.hashCode();
      }

      val var22: Int;
      if (this.thumbnailText == null) {
         var22 = 0;
      } else {
         var22 = this.thumbnailText.hashCode();
      }

      val var23: Int;
      if (this.thumbnailUrl == null) {
         var23 = 0;
      } else {
         var23 = this.thumbnailUrl.hashCode();
      }

      val var24: Int;
      if (this.titleColor == null) {
         var24 = 0;
      } else {
         var24 = this.titleColor.hashCode();
      }

      val var37: Int = this.extendedType.hashCode();
      val var38: Int = this.guildName.hashCode();
      val var25: Int;
      if (this.guildIcon == null) {
         var25 = 0;
      } else {
         var25 = this.guildIcon.hashCode();
      }

      val var26: Int;
      if (this.headerIcon == null) {
         var26 = 0;
      } else {
         var26 = this.headerIcon.hashCode();
      }

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
                                                                                                                                                                                                                                                                                                      (
                                                                                                                                                                                                                                                                                                               (
                                                                                                                                                                                                                                                                                                                        (
                                                                                                                                                                                                                                                                                                                                 (
                                                                                                                                                                                                                                                                                                                                          var35
                                                                                                                                                                                                                                                                                                                                                * 31
                                                                                                                                                                                                                                                                                                                                             + var29
                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                    + var28
                                                                                                                                                                                                                                                                                                                              )
                                                                                                                                                                                                                                                                                                                              * 31
                                                                                                                                                                                                                                                                                                                           + var34
                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                  + var31
                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                         + var36
                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                + var33
                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var30
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var32
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
         + var27;
   }

   public override fun toString(): String {
      val var3: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var1: Int = this.headerColor;
      val var30: java.lang.String = this.headerText;
      val var22: InviteType = this.type;
      val var35: java.lang.String = this.titleText;
      val var9: java.lang.String = this.subtitle;
      val var7: java.lang.String = this.helpCenterArticleLabel;
      val var12: java.lang.String = this.helpCenterArticleURL;
      val var26: Int = this.acceptLabelBackgroundColor;
      val var5: Int = this.acceptLabelBorderColor;
      val var23: Int = this.acceptLabelColor;
      val var28: java.lang.String = this.acceptLabelText;
      val var32: java.lang.String = this.bodyText;
      val var36: Int = this.bodyTextColor;
      val var37: java.lang.Boolean = this.canBeAccepted;
      val var39: java.lang.String = this.channelIcon;
      val var8: java.lang.String = this.channelName;
      val var16: java.lang.Boolean = this.embedCanBeTapped;
      val var15: java.lang.String = this.memberText;
      val var17: java.lang.String = this.onlineText;
      val var24: Int = this.resolvingGradientEnd;
      val var11: Int = this.resolvingGradientStart;
      val var33: java.lang.Boolean = this.splashHasRadialGradient;
      val var18: Int = this.splashOpacity;
      val var25: java.lang.String = this.splashUrl;
      val var6: java.lang.String = this.inviteSplash;
      val var27: Int = this.subtitleColor;
      val var31: Int = this.thumbnailBackgroundColor;
      val var21: Int = this.thumbnailCornerRadius;
      val var10: java.lang.String = this.thumbnailText;
      val var20: java.lang.String = this.thumbnailUrl;
      val var38: Int = this.titleColor;
      val var13: CodedLinkExtendedType = this.extendedType;
      val var14: java.lang.String = this.guildName;
      val var19: java.lang.String = this.guildIcon;
      val var29: java.lang.String = this.headerIcon;
      val var4: java.lang.String = this.badgeIconUrl;
      val var34: StringBuilder = new StringBuilder();
      var34.append("GuildInviteDisabledEmbedImpl(backgroundColor=");
      var34.append(var3);
      var34.append(", borderColor=");
      var34.append(var2);
      var34.append(", headerColor=");
      var34.append(var1);
      var34.append(", headerText=");
      var34.append(var30);
      var34.append(", type=");
      var34.append(var22);
      var34.append(", titleText=");
      var34.append(var35);
      var34.append(", subtitle=");
      var34.append(var9);
      var34.append(", helpCenterArticleLabel=");
      var34.append(var7);
      var34.append(", helpCenterArticleURL=");
      var34.append(var12);
      var34.append(", acceptLabelBackgroundColor=");
      var34.append(var26);
      var34.append(", acceptLabelBorderColor=");
      var34.append(var5);
      var34.append(", acceptLabelColor=");
      var34.append(var23);
      var34.append(", acceptLabelText=");
      var34.append(var28);
      var34.append(", bodyText=");
      var34.append(var32);
      var34.append(", bodyTextColor=");
      var34.append(var36);
      var34.append(", canBeAccepted=");
      var34.append(var37);
      var34.append(", channelIcon=");
      var34.append(var39);
      var34.append(", channelName=");
      var34.append(var8);
      var34.append(", embedCanBeTapped=");
      var34.append(var16);
      var34.append(", memberText=");
      var34.append(var15);
      var34.append(", onlineText=");
      var34.append(var17);
      var34.append(", resolvingGradientEnd=");
      var34.append(var24);
      var34.append(", resolvingGradientStart=");
      var34.append(var11);
      var34.append(", splashHasRadialGradient=");
      var34.append(var33);
      var34.append(", splashOpacity=");
      var34.append(var18);
      var34.append(", splashUrl=");
      var34.append(var25);
      var34.append(", inviteSplash=");
      var34.append(var6);
      var34.append(", subtitleColor=");
      var34.append(var27);
      var34.append(", thumbnailBackgroundColor=");
      var34.append(var31);
      var34.append(", thumbnailCornerRadius=");
      var34.append(var21);
      var34.append(", thumbnailText=");
      var34.append(var10);
      var34.append(", thumbnailUrl=");
      var34.append(var20);
      var34.append(", titleColor=");
      var34.append(var38);
      var34.append(", extendedType=");
      var34.append(var13);
      var34.append(", guildName=");
      var34.append(var14);
      var34.append(", guildIcon=");
      var34.append(var19);
      var34.append(", headerIcon=");
      var34.append(var29);
      var34.append(", badgeIconUrl=");
      var34.append(var4);
      var34.append(")");
      return var34.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: GuildInviteDisabledEmbedImpl.$serializer = new GuildInviteDisabledEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl", var0, 38
         );
         var1.l("backgroundColor", false);
         var1.l("borderColor", false);
         var1.l("headerColor", false);
         var1.l("headerText", false);
         var1.l("type", false);
         var1.l("titleText", false);
         var1.l("subtitle", false);
         var1.l("helpCenterArticleLabel", false);
         var1.l("helpCenterArticleURL", false);
         var1.l("acceptLabelBackgroundColor", true);
         var1.l("acceptLabelBorderColor", true);
         var1.l("acceptLabelColor", true);
         var1.l("acceptLabelText", true);
         var1.l("bodyText", true);
         var1.l("bodyTextColor", true);
         var1.l("canBeAccepted", true);
         var1.l("channelIcon", true);
         var1.l("channelName", true);
         var1.l("embedCanBeTapped", true);
         var1.l("memberText", true);
         var1.l("onlineText", true);
         var1.l("resolvingGradientEnd", true);
         var1.l("resolvingGradientStart", true);
         var1.l("splashHasRadialGradient", true);
         var1.l("splashOpacity", true);
         var1.l("splashUrl", true);
         var1.l("inviteSplash", true);
         var1.l("subtitleColor", true);
         var1.l("thumbnailBackgroundColor", true);
         var1.l("thumbnailCornerRadius", true);
         var1.l("thumbnailText", true);
         var1.l("thumbnailUrl", true);
         var1.l("titleColor", true);
         var1.l("extendedType", true);
         var1.l("guildName", false);
         var1.l("guildIcon", true);
         var1.l("headerIcon", true);
         var1.l("badgeIconUrl", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var7: N = N.a;
         val var2: C0 = C0.a;
         val var12: KSerializer = a.u(N.a);
         val var8: KSerializer = a.u(var7);
         val var16: KSerializer = a.u(var7);
         val var3: KSerializer = a.u(var2);
         val var5: KSerializer = a.u(var2);
         val var4: KSerializer = a.u(var7);
         val var17: h = h.a;
         return new KSerializer[]{
            var7,
            var7,
            var7,
            var2,
            InviteType.Serializer.INSTANCE,
            var2,
            var2,
            var2,
            var2,
            var12,
            var8,
            var16,
            var3,
            var5,
            var4,
            a.u(h.a),
            a.u(var2),
            a.u(var2),
            a.u(var17),
            a.u(var2),
            a.u(var2),
            a.u(var7),
            a.u(var7),
            a.u(var17),
            a.u(var7),
            a.u(var2),
            a.u(var2),
            a.u(var7),
            a.u(var7),
            a.u(var7),
            a.u(var2),
            a.u(var2),
            a.u(var7),
            CodedLinkExtendedType.Serializer.INSTANCE,
            var2,
            a.u(var2),
            a.u(var2),
            a.u(var2)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteDisabledEmbedImpl {
         q.h(var1, "decoder");
         val var58: SerialDescriptor = this.getDescriptor();
         val var59: c = var1.c(var58);
         val var9: Boolean = var59.y();
         var var2: Int = 0;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         val var6: Int;
         var var7: Int;
         var var12: Any;
         var var15: CodedLinkExtendedType;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: Any;
         var var23: Any;
         var var26: Any;
         var var27: Any;
         var var28: InviteType;
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         var var37: Any;
         var var38: Any;
         var var39: Any;
         var var40: Any;
         var var41: Any;
         var var42: Any;
         var var43: Any;
         var var44: Any;
         var var45: Any;
         var var61: Any;
         var var71: Any;
         var var75: Any;
         var var84: Any;
         var var89: Any;
         var var131: Any;
         var var142: Any;
         if (var9) {
            var4 = var59.k(var58, 0);
            var2 = var59.k(var58, 1);
            var5 = var59.k(var58, 2);
            var43 = var59.t(var58, 3);
            var28 = var59.m(var58, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var42 = var59.t(var58, 5);
            var39 = var59.t(var58, 6);
            var38 = var59.t(var58, 7);
            var26 = var59.t(var58, 8);
            var71 = N.a;
            var27 = var59.v(var58, 9, N.a, null) as Int;
            var131 = var59.v(var58, 10, (DeserializationStrategy)var71, null) as Int;
            var22 = var59.v(var58, 11, (DeserializationStrategy)var71, null) as Int;
            var61 = C0.a;
            var45 = var59.v(var58, 12, C0.a, null) as java.lang.String;
            var30 = var59.v(var58, 13, (DeserializationStrategy)var61, null) as java.lang.String;
            var34 = var59.v(var58, 14, (DeserializationStrategy)var71, null) as Int;
            var75 = h.a;
            var142 = var59.v(var58, 15, h.a, null) as java.lang.Boolean;
            var35 = var59.v(var58, 16, (DeserializationStrategy)var61, null) as java.lang.String;
            var33 = var59.v(var58, 17, (DeserializationStrategy)var61, null) as java.lang.String;
            var31 = var59.v(var58, 18, (DeserializationStrategy)var75, null) as java.lang.Boolean;
            var89 = var59.v(var58, 19, (DeserializationStrategy)var61, null) as java.lang.String;
            val var36: java.lang.String = var59.v(var58, 20, (DeserializationStrategy)var61, null) as java.lang.String;
            var37 = var59.v(var58, 21, (DeserializationStrategy)var71, null) as Int;
            var41 = var59.v(var58, 22, (DeserializationStrategy)var71, null) as Int;
            var44 = var59.v(var58, 23, (DeserializationStrategy)var75, null) as java.lang.Boolean;
            var84 = var59.v(var58, 24, (DeserializationStrategy)var71, null) as Int;
            val var24: java.lang.String = var59.v(var58, 25, (DeserializationStrategy)var61, null) as java.lang.String;
            var23 = var59.v(var58, 26, (DeserializationStrategy)var61, null) as java.lang.String;
            var21 = var59.v(var58, 27, (DeserializationStrategy)var71, null) as Int;
            var19 = var59.v(var58, 28, (DeserializationStrategy)var71, null) as Int;
            var18 = var59.v(var58, 29, (DeserializationStrategy)var71, null) as Int;
            var17 = var59.v(var58, 30, (DeserializationStrategy)var61, null) as java.lang.String;
            var16 = var59.v(var58, 31, (DeserializationStrategy)var61, null) as java.lang.String;
            var20 = var59.v(var58, 32, (DeserializationStrategy)var71, null) as Int;
            var15 = var59.m(var58, 33, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            var75 = var59.t(var58, 34);
            var12 = var59.v(var58, 35, (DeserializationStrategy)var61, null) as java.lang.String;
            var71 = var59.v(var58, 36, (DeserializationStrategy)var61, null) as java.lang.String;
            var61 = var59.v(var58, 37, (DeserializationStrategy)var61, null) as java.lang.String;
            var7 = 63;
            var6 = -1;
            var3 = var2;
            var29 = var131;
            var131 = var142;
            var142 = var89;
            var89 = var36;
            var40 = var84;
            var84 = var24;
         } else {
            var var69: Boolean = true;
            var5 = 0;
            var4 = 0;
            var3 = 0;
            var var130: InviteType = null;
            var71 = null;
            var75 = null;
            var35 = null;
            var33 = null;
            var31 = null;
            var34 = null;
            var30 = null;
            var29 = null;
            var28 = null;
            var27 = null;
            var22 = null;
            var43 = null;
            var42 = null;
            var39 = null;
            var38 = null;
            var var147: Any = null;
            var23 = null;
            var40 = null;
            var131 = null;
            var142 = null;
            var37 = null;
            var26 = null;
            var15 = null;
            var84 = null;
            var89 = null;
            var17 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var21 = null;
            var12 = null;
            var16 = null;
            var61 = null;
            var41 = null;
            var7 = 0;

            while (var69) {
               label156: {
                  label155: {
                     label154: {
                        label153: {
                           label192: {
                              label135: {
                                 label134: {
                                    label133: {
                                       label132: {
                                          label131: {
                                             label193: {
                                                label170: {
                                                   val var8: Int = var59.x(var58);
                                                   switch (var8) {
                                                      case -1:
                                                         var69 = false;
                                                         break label193;
                                                      case 0:
                                                         var4 = var59.k(var58, 0);
                                                         var2 |= 1;
                                                         break label193;
                                                      case 1:
                                                         var5 = var59.k(var58, 1);
                                                         var2 |= 2;
                                                         break label133;
                                                      case 2:
                                                         var3 = var59.k(var58, 2);
                                                         var2 |= 4;
                                                         break label131;
                                                      case 3:
                                                         var43 = var59.t(var58, 3);
                                                         var2 |= 8;
                                                         break label131;
                                                      case 4:
                                                         var130 = var59.m(var58, 4, InviteType.Serializer.INSTANCE, var130) as InviteType;
                                                         var2 |= 16;
                                                         break label134;
                                                      case 5:
                                                         var42 = var59.t(var58, 5);
                                                         var2 |= 32;
                                                         break label132;
                                                      case 6:
                                                         var39 = var59.t(var58, 6);
                                                         var2 |= 64;
                                                         break label132;
                                                      case 7:
                                                         var38 = var59.t(var58, 7);
                                                         var2 |= 128;
                                                         break label132;
                                                      case 8:
                                                         var147 = var59.t(var58, 8);
                                                         var2 |= 256;
                                                         break label132;
                                                      case 9:
                                                         var22 = var59.v(var58, 9, N.a, var22) as Int;
                                                         var2 |= 512;
                                                         break label133;
                                                      case 10:
                                                         var27 = var59.v(var58, 10, N.a, var27) as Int;
                                                         var2 |= 1024;
                                                         break label134;
                                                      case 11:
                                                         var28 = var59.v(var58, 11, N.a, var28) as Int;
                                                         var2 |= 2048;
                                                         break label134;
                                                      case 12:
                                                         var29 = var59.v(var58, 12, C0.a, var29) as java.lang.String;
                                                         var2 |= 4096;
                                                         break label134;
                                                      case 13:
                                                         var30 = var59.v(var58, 13, C0.a, var30) as java.lang.String;
                                                         var2 |= 8192;
                                                         break label134;
                                                      case 14:
                                                         var34 = var59.v(var58, 14, N.a, var34) as Int;
                                                         var2 |= 16384;
                                                         break label134;
                                                      case 15:
                                                         var23 = var59.v(var58, 15, h.a, var23) as java.lang.Boolean;
                                                         var2 |= 32768;
                                                         break label134;
                                                      case 16:
                                                         var40 = var59.v(var58, 16, C0.a, var40) as java.lang.String;
                                                         var2 |= 65536;
                                                         break label153;
                                                      case 17:
                                                         var131 = var59.v(var58, 17, C0.a, var131) as java.lang.String;
                                                         var2 |= 131072;
                                                         break label153;
                                                      case 18:
                                                         var142 = var59.v(var58, 18, h.a, var142) as java.lang.Boolean;
                                                         var2 |= 262144;
                                                         break label153;
                                                      case 19:
                                                         var37 = var59.v(var58, 19, C0.a, var37) as java.lang.String;
                                                         var2 |= 524288;
                                                         break label154;
                                                      case 20:
                                                         var26 = var59.v(var58, 20, C0.a, var26) as java.lang.String;
                                                         var2 |= 1048576;
                                                         break label154;
                                                      case 21:
                                                         var71 = var75;
                                                         var89 = var18;
                                                         var75 = var21;
                                                         val var228: Int = var59.v(var58, 21, N.a, var15) as Int;
                                                         var2 |= 2097152;
                                                         var21 = var61;
                                                         var20 = var16;
                                                         var61 = var71;
                                                         var12 = var20;
                                                         var84 = var19;
                                                         var15 = (CodedLinkExtendedType)var17;
                                                         var16 = var89;
                                                         var17 = var84;
                                                         var18 = var228;
                                                         var19 = var12;
                                                         break label155;
                                                      case 22:
                                                         val var227: Int = var59.v(var58, 22, N.a, var84) as Int;
                                                         var2 |= 4194304;
                                                         var21 = var61;
                                                         var61 = var71;
                                                         var71 = var75;
                                                         var75 = var21;
                                                         var12 = var20;
                                                         var84 = var19;
                                                         var89 = var18;
                                                         var15 = (CodedLinkExtendedType)var17;
                                                         var16 = var89;
                                                         var17 = var227;
                                                         var18 = var15;
                                                         var19 = var12;
                                                         var20 = var16;
                                                         break label155;
                                                      case 23:
                                                         val var242: java.lang.Boolean = var59.v(var58, 23, h.a, var89) as java.lang.Boolean;
                                                         var2 |= 8388608;
                                                         var21 = var61;
                                                         var61 = var71;
                                                         var71 = var75;
                                                         var75 = var21;
                                                         var12 = var20;
                                                         var84 = var19;
                                                         var89 = var18;
                                                         var15 = (CodedLinkExtendedType)var17;
                                                         var16 = var242;
                                                         var17 = var84;
                                                         var18 = var15;
                                                         var19 = var12;
                                                         var20 = var16;
                                                         break label155;
                                                      case 24:
                                                         var17 = var59.v(var58, 24, N.a, var17) as Int;
                                                         var2 |= 16777216;
                                                         var21 = var61;
                                                         var16 = var89;
                                                         var61 = var71;
                                                         var71 = var75;
                                                         var75 = var21;
                                                         var12 = var20;
                                                         var84 = var19;
                                                         var89 = var18;
                                                         var15 = (CodedLinkExtendedType)var17;
                                                         var17 = var84;
                                                         var18 = var15;
                                                         var19 = var12;
                                                         var20 = var16;
                                                         break label155;
                                                      case 25:
                                                         var18 = var59.v(var58, 25, C0.a, var18) as java.lang.String;
                                                         var2 |= 33554432;
                                                         var21 = var61;
                                                         var16 = var89;
                                                         var15 = (CodedLinkExtendedType)var17;
                                                         var61 = var71;
                                                         var71 = var75;
                                                         var75 = var21;
                                                         var12 = var20;
                                                         var84 = var19;
                                                         var89 = var18;
                                                         var17 = var84;
                                                         var18 = var15;
                                                         var19 = var12;
                                                         var20 = var16;
                                                         break label155;
                                                      case 26:
                                                         var75 = var21;
                                                         val var239: java.lang.String = var59.v(var58, 26, C0.a, var19) as java.lang.String;
                                                         var2 |= 67108864;
                                                         var21 = var61;
                                                         var20 = var16;
                                                         var19 = var12;
                                                         var16 = var89;
                                                         var15 = (CodedLinkExtendedType)var17;
                                                         var89 = var18;
                                                         var61 = var71;
                                                         var71 = var75;
                                                         var12 = var20;
                                                         var84 = var239;
                                                         var17 = var84;
                                                         var18 = var15;
                                                         break label155;
                                                      case 27:
                                                         val var253: Int = var59.v(var58, 27, N.a, var20) as Int;
                                                         var2 |= 134217728;
                                                         var21 = var61;
                                                         var20 = var16;
                                                         var16 = var89;
                                                         var15 = (CodedLinkExtendedType)var17;
                                                         var89 = var18;
                                                         var84 = var19;
                                                         var61 = var71;
                                                         var71 = var75;
                                                         var75 = var21;
                                                         var12 = var253;
                                                         var17 = var84;
                                                         var18 = var15;
                                                         var19 = var12;
                                                         break label155;
                                                      case 28:
                                                         var71 = var75;
                                                         var75 = var59.v(var58, 28, N.a, var21) as Int;
                                                         var2 |= 268435456;
                                                         var21 = var61;
                                                         var16 = var89;
                                                         var15 = (CodedLinkExtendedType)var17;
                                                         var89 = var18;
                                                         var84 = var19;
                                                         var12 = var20;
                                                         var61 = var71;
                                                         var17 = var84;
                                                         var18 = var15;
                                                         var19 = var12;
                                                         var20 = var16;
                                                         break label155;
                                                      case 29:
                                                         var45 = var59.v(var58, 29, N.a, var12) as Int;
                                                         var2 |= 536870912;
                                                         var16 = var89;
                                                         var15 = (CodedLinkExtendedType)var17;
                                                         var89 = var18;
                                                         var84 = var19;
                                                         var12 = var20;
                                                         var61 = var71;
                                                         var71 = var75;
                                                         var75 = var21;
                                                         var17 = var84;
                                                         var18 = var15;
                                                         var19 = var45;
                                                         var20 = var16;
                                                         var21 = var61;
                                                         break label155;
                                                      case 30:
                                                         var71 = var75;
                                                         var45 = var59.v(var58, 30, C0.a, var16) as java.lang.String;
                                                         var2 |= 1073741824;
                                                         var16 = var89;
                                                         var15 = (CodedLinkExtendedType)var17;
                                                         var89 = var18;
                                                         var84 = var19;
                                                         var75 = var21;
                                                         var19 = var12;
                                                         var61 = var71;
                                                         var12 = var20;
                                                         var17 = var84;
                                                         var18 = var15;
                                                         var20 = var45;
                                                         var21 = var61;
                                                         break label155;
                                                      case 31:
                                                         var44 = var59.v(var58, 31, C0.a, var61) as java.lang.String;
                                                         var2 |= Integer.MIN_VALUE;
                                                         var15 = (CodedLinkExtendedType)var17;
                                                         var89 = var18;
                                                         var84 = var19;
                                                         var19 = var12;
                                                         var20 = var16;
                                                         var61 = var71;
                                                         var71 = var75;
                                                         var75 = var21;
                                                         var12 = var20;
                                                         var16 = var89;
                                                         var17 = var84;
                                                         var18 = var15;
                                                         var21 = var44;
                                                         break label155;
                                                      case 32:
                                                         var33 = var59.v(var58, 32, N.a, var33) as Int;
                                                         var7 |= 1;
                                                         var44 = var31;
                                                         break;
                                                      case 33:
                                                         var71 = var59.m(var58, 33, CodedLinkExtendedType.Serializer.INSTANCE, var71) as CodedLinkExtendedType;
                                                         var7 |= 2;
                                                         var44 = var31;
                                                         var31 = var71;
                                                         break label170;
                                                      case 34:
                                                         var41 = var59.t(var58, 34);
                                                         var7 |= 4;
                                                         var44 = var31;
                                                         var31 = var71;
                                                         var71 = var75;
                                                         break label135;
                                                      case 35:
                                                         var35 = var59.v(var58, 35, C0.a, var35) as java.lang.String;
                                                         var7 |= 8;
                                                         var44 = var31;
                                                         break;
                                                      case 36:
                                                         var75 = var59.v(var58, 36, C0.a, var75) as java.lang.String;
                                                         var7 |= 16;
                                                         var44 = var31;
                                                         var31 = var71;
                                                         var71 = var75;
                                                         break label135;
                                                      case 37:
                                                         var44 = var59.v(var58, 37, C0.a, var31) as java.lang.String;
                                                         var7 |= 32;
                                                         break;
                                                      default:
                                                         throw new n(var8);
                                                   }

                                                   var31 = var71;
                                                }

                                                var71 = var75;
                                                break label135;
                                             }

                                             var23 = var22;
                                             var22 = var23;
                                             break label192;
                                          }

                                          var23 = var22;
                                          var22 = var23;
                                          break label192;
                                       }

                                       var23 = var22;
                                       var22 = var23;
                                       break label192;
                                    }

                                    var23 = var22;
                                    var22 = var23;
                                    break label192;
                                 }

                                 var22 = var23;
                                 var23 = var22;
                                 break label192;
                              }

                              var89 = var18;
                              var21 = var61;
                              var20 = var16;
                              var19 = var12;
                              var18 = var15;
                              var17 = var84;
                              var16 = var89;
                              var15 = (CodedLinkExtendedType)var17;
                              var84 = var19;
                              var12 = var20;
                              var75 = var21;
                              var61 = var31;
                              var31 = var44;
                              break label155;
                           }

                           var15 = (CodedLinkExtendedType)var17;
                           var89 = var18;
                           var84 = var19;
                           var61 = var71;
                           var20 = var16;
                           var19 = var12;
                           var44 = var27;
                           var71 = var75;
                           var75 = var21;
                           var12 = var20;
                           var16 = var89;
                           var17 = var84;
                           var18 = var15;
                           var27 = var142;
                           var21 = var61;
                           break label156;
                        }

                        var16 = var89;
                        var15 = (CodedLinkExtendedType)var17;
                        var89 = var18;
                        var84 = var19;
                        var61 = var71;
                        var19 = var12;
                        var44 = var27;
                        var23 = var22;
                        var71 = var75;
                        var75 = var21;
                        var12 = var20;
                        var17 = var84;
                        var18 = var15;
                        var27 = var142;
                        var20 = var16;
                        var21 = var61;
                        var22 = var23;
                        break label156;
                     }

                     var16 = var89;
                     var15 = (CodedLinkExtendedType)var17;
                     var89 = var18;
                     var84 = var19;
                     var12 = var20;
                     var61 = var71;
                     var44 = var27;
                     var23 = var22;
                     var71 = var75;
                     var75 = var21;
                     var17 = var84;
                     var18 = var15;
                     var19 = var12;
                     var27 = var142;
                     var20 = var16;
                     var21 = var61;
                     var22 = var23;
                     break label156;
                  }

                  var44 = var27;
                  var23 = var22;
                  var27 = var142;
                  var22 = var23;
               }

               var89 = var16;
               var84 = var17;
               var15 = (CodedLinkExtendedType)var18;
               var142 = var27;
               var71 = var61;
               var75 = var71;
               var27 = var44;
               var22 = var23;
               var23 = var22;
               var17 = var15;
               var18 = var89;
               var19 = var84;
               var20 = var12;
               var21 = var75;
               var12 = var19;
               var16 = var20;
               var61 = var21;
            }

            var71 = var75;
            var21 = var20;
            var75 = var41;
            var61 = var31;
            var12 = var35;
            var15 = (CodedLinkExtendedType)var71;
            var20 = var33;
            var16 = var61;
            var17 = var16;
            var18 = var12;
            var19 = var21;
            var23 = var19;
            var84 = var18;
            var40 = var17;
            var44 = var89;
            var41 = var84;
            var37 = var15;
            var89 = var26;
            var142 = var37;
            var31 = var142;
            var33 = var131;
            var35 = var40;
            var131 = var23;
            var45 = var29;
            var22 = var28;
            var29 = var27;
            var27 = var22;
            var26 = var147;
            var28 = var130;
            var5 = var3;
            var3 = var5;
            var6 = var2;
         }

         var59.b(var58);
         return new GuildInviteDisabledEmbedImpl(
            var6,
            var7,
            var4,
            var3,
            var5,
            (java.lang.String)var43,
            var28,
            (java.lang.String)var42,
            (java.lang.String)var39,
            (java.lang.String)var38,
            (java.lang.String)var26,
            (Integer)var27,
            (Integer)var29,
            (Integer)var22,
            (java.lang.String)var45,
            (java.lang.String)var30,
            (Integer)var34,
            (java.lang.Boolean)var131,
            (java.lang.String)var35,
            (java.lang.String)var33,
            (java.lang.Boolean)var31,
            (java.lang.String)var142,
            (java.lang.String)var89,
            (Integer)var37,
            (Integer)var41,
            (java.lang.Boolean)var44,
            (Integer)var40,
            (java.lang.String)var84,
            (java.lang.String)var23,
            (Integer)var21,
            (Integer)var19,
            (Integer)var18,
            (java.lang.String)var17,
            (java.lang.String)var16,
            (Integer)var20,
            var15,
            (java.lang.String)var75,
            (java.lang.String)var12,
            (java.lang.String)var71,
            (java.lang.String)var61,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: GuildInviteDisabledEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         GuildInviteDisabledEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ha.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteDisabledEmbedImpl> {
         return GuildInviteDisabledEmbedImpl.$serializer.INSTANCE;
      }
   }
}
