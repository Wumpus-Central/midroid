package com.discord.chat.bridge.codedlinks

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.h
import qn.n0

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
      headerIcon: String? = null
   )
   : CodedLinkEmbed,
   GuildDisabledInviteEmbed,
   GuildInviteExtendedEmbed {
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelText: String?
   public open val backgroundColor: Int
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
      headerIcon: String? = var0.headerIcon
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
         var37
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
         } else {
            return q.c(this.headerIcon, var1.headerIcon);
         }
      }
   }

   public override fun hashCode(): Int {
      val var31: Int = Integer.hashCode(this.backgroundColor);
      val var27: Int = Integer.hashCode(this.borderColor);
      val var30: Int = Integer.hashCode(this.headerColor);
      val var28: Int = this.headerText.hashCode();
      val var34: Int = this.type.hashCode();
      val var33: Int = this.titleText.hashCode();
      val var35: Int = this.subtitle.hashCode();
      val var29: Int = this.helpCenterArticleLabel.hashCode();
      val var32: Int = this.helpCenterArticleURL.hashCode();
      var var26: Int = 0;
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

      val var36: Int = this.extendedType.hashCode();
      val var37: Int = this.guildName.hashCode();
      val var25: Int;
      if (this.guildIcon == null) {
         var25 = 0;
      } else {
         var25 = this.guildIcon.hashCode();
      }

      if (this.headerIcon != null) {
         var26 = this.headerIcon.hashCode();
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
                                                                                                                                                                                                                                                                                                                                 var31
                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                    + var27
                                                                                                                                                                                                                                                                                                                              )
                                                                                                                                                                                                                                                                                                                              * 31
                                                                                                                                                                                                                                                                                                                           + var30
                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                  + var28
                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                         + var34
                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                + var33
                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var35
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var29
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
                                    + var36
                              )
                              * 31
                           + var37
                     )
                     * 31
                  + var25
            )
            * 31
         + var26;
   }

   public override fun toString(): String {
      val var1: Int = this.backgroundColor;
      val var3: Int = this.borderColor;
      val var2: Int = this.headerColor;
      val var32: java.lang.String = this.headerText;
      val var29: InviteType = this.type;
      val var13: java.lang.String = this.titleText;
      val var14: java.lang.String = this.subtitle;
      val var28: java.lang.String = this.helpCenterArticleLabel;
      val var36: java.lang.String = this.helpCenterArticleURL;
      val var17: Int = this.acceptLabelBackgroundColor;
      val var5: Int = this.acceptLabelBorderColor;
      val var24: Int = this.acceptLabelColor;
      val var22: java.lang.String = this.acceptLabelText;
      val var6: java.lang.String = this.bodyText;
      val var15: Int = this.bodyTextColor;
      val var8: java.lang.Boolean = this.canBeAccepted;
      val var10: java.lang.String = this.channelIcon;
      val var27: java.lang.String = this.channelName;
      val var25: java.lang.Boolean = this.embedCanBeTapped;
      val var4: java.lang.String = this.memberText;
      val var26: java.lang.String = this.onlineText;
      val var21: Int = this.resolvingGradientEnd;
      val var23: Int = this.resolvingGradientStart;
      val var34: java.lang.Boolean = this.splashHasRadialGradient;
      val var18: Int = this.splashOpacity;
      val var20: java.lang.String = this.splashUrl;
      val var11: java.lang.String = this.inviteSplash;
      val var30: Int = this.subtitleColor;
      val var37: Int = this.thumbnailBackgroundColor;
      val var31: Int = this.thumbnailCornerRadius;
      val var19: java.lang.String = this.thumbnailText;
      val var16: java.lang.String = this.thumbnailUrl;
      val var7: Int = this.titleColor;
      val var12: CodedLinkExtendedType = this.extendedType;
      val var38: java.lang.String = this.guildName;
      val var9: java.lang.String = this.guildIcon;
      val var33: java.lang.String = this.headerIcon;
      val var35: StringBuilder = new StringBuilder();
      var35.append("GuildInviteDisabledEmbedImpl(backgroundColor=");
      var35.append(var1);
      var35.append(", borderColor=");
      var35.append(var3);
      var35.append(", headerColor=");
      var35.append(var2);
      var35.append(", headerText=");
      var35.append(var32);
      var35.append(", type=");
      var35.append(var29);
      var35.append(", titleText=");
      var35.append(var13);
      var35.append(", subtitle=");
      var35.append(var14);
      var35.append(", helpCenterArticleLabel=");
      var35.append(var28);
      var35.append(", helpCenterArticleURL=");
      var35.append(var36);
      var35.append(", acceptLabelBackgroundColor=");
      var35.append(var17);
      var35.append(", acceptLabelBorderColor=");
      var35.append(var5);
      var35.append(", acceptLabelColor=");
      var35.append(var24);
      var35.append(", acceptLabelText=");
      var35.append(var22);
      var35.append(", bodyText=");
      var35.append(var6);
      var35.append(", bodyTextColor=");
      var35.append(var15);
      var35.append(", canBeAccepted=");
      var35.append(var8);
      var35.append(", channelIcon=");
      var35.append(var10);
      var35.append(", channelName=");
      var35.append(var27);
      var35.append(", embedCanBeTapped=");
      var35.append(var25);
      var35.append(", memberText=");
      var35.append(var4);
      var35.append(", onlineText=");
      var35.append(var26);
      var35.append(", resolvingGradientEnd=");
      var35.append(var21);
      var35.append(", resolvingGradientStart=");
      var35.append(var23);
      var35.append(", splashHasRadialGradient=");
      var35.append(var34);
      var35.append(", splashOpacity=");
      var35.append(var18);
      var35.append(", splashUrl=");
      var35.append(var20);
      var35.append(", inviteSplash=");
      var35.append(var11);
      var35.append(", subtitleColor=");
      var35.append(var30);
      var35.append(", thumbnailBackgroundColor=");
      var35.append(var37);
      var35.append(", thumbnailCornerRadius=");
      var35.append(var31);
      var35.append(", thumbnailText=");
      var35.append(var19);
      var35.append(", thumbnailUrl=");
      var35.append(var16);
      var35.append(", titleColor=");
      var35.append(var7);
      var35.append(", extendedType=");
      var35.append(var12);
      var35.append(", guildName=");
      var35.append(var38);
      var35.append(", guildIcon=");
      var35.append(var9);
      var35.append(", headerIcon=");
      var35.append(var33);
      var35.append(")");
      return var35.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: GuildInviteDisabledEmbedImpl.$serializer = new GuildInviteDisabledEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl", var0, 37
         );
         var1.c("backgroundColor", false);
         var1.c("borderColor", false);
         var1.c("headerColor", false);
         var1.c("headerText", false);
         var1.c("type", false);
         var1.c("titleText", false);
         var1.c("subtitle", false);
         var1.c("helpCenterArticleLabel", false);
         var1.c("helpCenterArticleURL", false);
         var1.c("acceptLabelBackgroundColor", true);
         var1.c("acceptLabelBorderColor", true);
         var1.c("acceptLabelColor", true);
         var1.c("acceptLabelText", true);
         var1.c("bodyText", true);
         var1.c("bodyTextColor", true);
         var1.c("canBeAccepted", true);
         var1.c("channelIcon", true);
         var1.c("channelName", true);
         var1.c("embedCanBeTapped", true);
         var1.c("memberText", true);
         var1.c("onlineText", true);
         var1.c("resolvingGradientEnd", true);
         var1.c("resolvingGradientStart", true);
         var1.c("splashHasRadialGradient", true);
         var1.c("splashOpacity", true);
         var1.c("splashUrl", true);
         var1.c("inviteSplash", true);
         var1.c("subtitleColor", true);
         var1.c("thumbnailBackgroundColor", true);
         var1.c("thumbnailCornerRadius", true);
         var1.c("thumbnailText", true);
         var1.c("thumbnailUrl", true);
         var1.c("titleColor", true);
         var1.c("extendedType", true);
         var1.c("guildName", false);
         var1.c("guildIcon", true);
         var1.c("headerIcon", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var4: n0 = n0.a;
         val var7: b2 = b2.a;
         val var3: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var5: KSerializer = a.u(n0.a);
         val var6: KSerializer = a.u(var4);
         val var2: KSerializer = a.u(var4);
         val var1: KSerializer = a.u(var7);
         val var10: KSerializer = a.u(var7);
         val var9: KSerializer = a.u(var4);
         val var8: h = h.a;
         return new KSerializer[]{
            var4,
            var4,
            var4,
            var7,
            var3,
            var7,
            var7,
            var7,
            var7,
            var5,
            var6,
            var2,
            var1,
            var10,
            var9,
            a.u(h.a),
            a.u(var7),
            a.u(var7),
            a.u(var8),
            a.u(var7),
            a.u(var7),
            a.u(var4),
            a.u(var4),
            a.u(var8),
            a.u(var4),
            a.u(var7),
            a.u(var7),
            a.u(var4),
            a.u(var4),
            a.u(var4),
            a.u(var7),
            a.u(var7),
            a.u(var4),
            CodedLinkExtendedType.Serializer.INSTANCE,
            var7,
            a.u(var7),
            a.u(var7)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteDisabledEmbedImpl {
         q.h(var1, "decoder");
         val var47: SerialDescriptor = this.getDescriptor();
         val var48: c = var1.b(var47);
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var14: Any;
         var var16: java.lang.String;
         val var17: java.lang.String;
         var var19: Any;
         var var20: java.lang.String;
         var var21: Any;
         var var22: java.lang.String;
         var var23: java.lang.String;
         var var24: java.lang.String;
         var var25: java.lang.String;
         var var26: java.lang.String;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var30: java.lang.String;
         var var31: Any;
         var var32: java.lang.String;
         var var33: java.lang.String;
         var var34: Any;
         var var35: java.lang.String;
         var var36: java.lang.String;
         var var37: CodedLinkExtendedType;
         var var38: java.lang.String;
         var var39: Any;
         var var40: Any;
         var var41: Any;
         var var42: Any;
         val var43: java.lang.String;
         val var44: Any;
         var var45: java.lang.String;
         val var46: java.lang.String;
         var var66: java.lang.String;
         var var71: Any;
         var var97: Any;
         if (var48.p()) {
            var7 = var48.i(var47, 0);
            var4 = var48.i(var47, 1);
            val var2: Int = var48.i(var47, 2);
            var30 = var48.m(var47, 3);
            var31 = var48.y(var47, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var25 = var48.m(var47, 5);
            var24 = var48.m(var47, 6);
            var23 = var48.m(var47, 7);
            var22 = var48.m(var47, 8);
            val var9: n0 = n0.a;
            var21 = var48.n(var47, 9, n0.a, null) as Int;
            var14 = var48.n(var47, 10, var9, null) as Int;
            var71 = var48.n(var47, 11, var9, null) as Int;
            val var49: b2 = b2.a;
            var43 = var48.n(var47, 12, b2.a, null) as java.lang.String;
            var33 = var48.n(var47, 13, var49, null) as java.lang.String;
            var97 = var48.n(var47, 14, var9, null) as Int;
            val var10: h = h.a;
            var29 = var48.n(var47, 15, h.a, null) as java.lang.Boolean;
            var16 = var48.n(var47, 16, var49, null) as java.lang.String;
            val var15: java.lang.String = var48.n(var47, 17, var49, null) as java.lang.String;
            val var12: java.lang.Boolean = var48.n(var47, 18, var10, null) as java.lang.Boolean;
            var46 = var48.n(var47, 19, var49, null) as java.lang.String;
            var20 = var48.n(var47, 20, var49, null) as java.lang.String;
            var28 = var48.n(var47, 21, var9, null) as Int;
            var27 = var48.n(var47, 22, var9, null) as Int;
            var42 = var48.n(var47, 23, var10, null) as java.lang.Boolean;
            val var62: Int = var48.n(var47, 24, var9, null) as Int;
            var36 = var48.n(var47, 25, var49, null) as java.lang.String;
            var17 = var48.n(var47, 26, var49, null) as java.lang.String;
            var44 = var48.n(var47, 27, var9, null) as Int;
            var34 = var48.n(var47, 28, var9, null) as Int;
            var19 = var48.n(var47, 29, var9, null) as Int;
            var45 = var48.n(var47, 30, var49, null) as java.lang.String;
            var26 = var48.n(var47, 31, var49, null) as java.lang.String;
            val var11: Int = var48.n(var47, 32, var9, null) as Int;
            var37 = var48.y(var47, 33, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var58: java.lang.String = var48.m(var47, 34);
            var38 = var48.n(var47, 35, var49, null) as java.lang.String;
            val var50: java.lang.String = var48.n(var47, 36, var49, null) as java.lang.String;
            var5 = -1;
            var3 = 31;
            var6 = var2;
            var39 = var71;
            var71 = var97;
            var32 = var15;
            var40 = var12;
            var97 = var62;
            var41 = var11;
            var66 = var58;
            var35 = var50;
         } else {
            var var56: Boolean = true;
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var3 = 0;
            var var96: CodedLinkExtendedType = null;
            var20 = null;
            var19 = null;
            var41 = null;
            var39 = null;
            var37 = null;
            var36 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var32 = null;
            var97 = null;
            var30 = null;
            var25 = null;
            var24 = null;
            var23 = null;
            var22 = null;
            var31 = null;
            var var51: Any = null;
            var var59: Any = null;
            var var63: Any = null;
            var66 = null;
            var var70: java.lang.String = null;
            var71 = null;
            var14 = null;
            var var80: java.lang.String = null;
            var16 = null;
            var40 = null;
            var21 = null;
            var29 = null;
            var26 = null;
            var28 = null;
            var27 = null;
            var38 = null;
            var var53: Int = 0;

            while (var56) {
               label189: {
                  label162: {
                     label190: {
                        label191: {
                           label119: {
                              var var8: Int = var48.o(var47);
                              switch (var8) {
                                 case -1:
                                    var56 = false;
                                    break label191;
                                 case 0:
                                    var4 = var48.i(var47, 0);
                                    var53 |= 1;
                                    break label191;
                                 case 1:
                                    var5 = var48.i(var47, 1);
                                    var53 |= 2;
                                    break label190;
                                 case 2:
                                    var6 = var48.i(var47, 2);
                                    var53 |= 4;
                                    break label190;
                                 case 3:
                                    var30 = var48.m(var47, 3);
                                    var53 |= 8;
                                    break label190;
                                 case 4:
                                    var31 = var48.y(var47, 4, InviteType.Serializer.INSTANCE, var31) as InviteType;
                                    var53 |= 16;
                                    break label190;
                                 case 5:
                                    var25 = var48.m(var47, 5);
                                    var53 |= 32;
                                    break label119;
                                 case 6:
                                    var24 = var48.m(var47, 6);
                                    var53 |= 64;
                                    break label119;
                                 case 7:
                                    var23 = var48.m(var47, 7);
                                    var53 |= 128;
                                    break label119;
                                 case 8:
                                    var22 = var48.m(var47, 8);
                                    var53 |= 256;
                                    break label119;
                                 case 9:
                                    var51 = var48.n(var47, 9, n0.a, var51) as Int;
                                    var53 |= 512;
                                    break label119;
                                 case 10:
                                    var66 = (java.lang.String)var71;
                                    var80 = (java.lang.String)var63;
                                    var14 = var48.n(var47, 10, n0.a, var59) as Int;
                                    var53 |= 1024;
                                    var51 = var16;
                                    var59 = var80;
                                    var63 = var14;
                                    var71 = var51;
                                    var16 = var66;
                                    break label189;
                                 case 11:
                                    var16 = var66;
                                    var80 = var48.n(var47, 11, n0.a, var63) as Int;
                                    var53 |= 2048;
                                    var51 = var16;
                                    var59 = var80;
                                    var63 = var14;
                                    var66 = (java.lang.String)var71;
                                    var71 = var51;
                                    var14 = var59;
                                    break label189;
                                 case 12:
                                    var16 = var48.n(var47, 12, b2.a, var66) as java.lang.String;
                                    var53 |= 4096;
                                    var51 = var16;
                                    var59 = var80;
                                    var63 = var14;
                                    var66 = (java.lang.String)var71;
                                    var71 = var51;
                                    var14 = var59;
                                    var80 = (java.lang.String)var63;
                                    break label189;
                                 case 13:
                                    var70 = var48.n(var47, 13, b2.a, var70) as java.lang.String;
                                    var53 |= 8192;
                                    var71 = var51;
                                    var80 = (java.lang.String)var63;
                                    var51 = var16;
                                    var59 = var80;
                                    var63 = var14;
                                    var66 = (java.lang.String)var71;
                                    var14 = var59;
                                    var16 = var66;
                                    break label189;
                                 case 14:
                                    val var188: Int = var48.n(var47, 14, n0.a, var71) as Int;
                                    var53 |= 16384;
                                    var71 = var51;
                                    var14 = var59;
                                    var80 = (java.lang.String)var63;
                                    var16 = var66;
                                    var51 = var16;
                                    var59 = var80;
                                    var63 = var14;
                                    var66 = var188;
                                    break label189;
                                 case 15:
                                    val var187: java.lang.Boolean = var48.n(var47, 15, h.a, var14) as java.lang.Boolean;
                                    var53 |= 32768;
                                    var14 = var59;
                                    var80 = (java.lang.String)var63;
                                    var66 = (java.lang.String)var71;
                                    var51 = var16;
                                    var59 = var80;
                                    var63 = var187;
                                    var71 = var51;
                                    var16 = var66;
                                    break label189;
                                 case 16:
                                    var45 = var48.n(var47, 16, b2.a, var80) as java.lang.String;
                                    var53 |= 65536;
                                    var16 = var66;
                                    var66 = (java.lang.String)var71;
                                    var63 = var14;
                                    var51 = var16;
                                    var59 = var45;
                                    var71 = var51;
                                    var14 = var59;
                                    var80 = (java.lang.String)var63;
                                    break label189;
                                 case 17:
                                    var42 = var48.n(var47, 17, b2.a, var16) as java.lang.String;
                                    var53 |= 131072;
                                    var16 = var66;
                                    var66 = (java.lang.String)var71;
                                    var63 = var14;
                                    var59 = var80;
                                    var80 = (java.lang.String)var63;
                                    var14 = var59;
                                    var71 = var51;
                                    var51 = var42;
                                    break label189;
                                 case 18:
                                    val var185: java.lang.Boolean = var48.n(var47, 18, h.a, var40) as java.lang.Boolean;
                                    var53 |= 262144;
                                    var66 = (java.lang.String)var71;
                                    var63 = var14;
                                    var59 = var80;
                                    var51 = var16;
                                    var71 = var51;
                                    var14 = var59;
                                    var80 = (java.lang.String)var63;
                                    var16 = var66;
                                    var40 = var185;
                                    break label189;
                                 case 19:
                                    var21 = var48.n(var47, 19, b2.a, var21) as java.lang.String;
                                    var53 |= 524288;
                                    break label162;
                                 case 20:
                                    var29 = var48.n(var47, 20, b2.a, var29) as java.lang.String;
                                    var53 |= 1048576;
                                    break label162;
                                 case 21:
                                    var28 = var48.n(var47, 21, n0.a, var28) as Int;
                                    var53 |= 2097152;
                                    break label162;
                                 case 22:
                                    var27 = var48.n(var47, 22, n0.a, var27) as Int;
                                    var53 |= 4194304;
                                    break label162;
                                 case 23:
                                    var41 = var48.n(var47, 23, h.a, var41) as java.lang.Boolean;
                                    var53 |= 8388608;
                                    break label162;
                                 case 24:
                                    var97 = var48.n(var47, 24, n0.a, var97) as Int;
                                    var53 |= 16777216;
                                    break label162;
                                 case 25:
                                    var20 = var48.n(var47, 25, b2.a, var20) as java.lang.String;
                                    var8 = 33554432;
                                    break;
                                 case 26:
                                    var32 = var48.n(var47, 26, b2.a, var32) as java.lang.String;
                                    var53 |= 67108864;
                                    break label162;
                                 case 27:
                                    var33 = var48.n(var47, 27, n0.a, var33) as Int;
                                    var53 |= 134217728;
                                    break label162;
                                 case 28:
                                    var34 = var48.n(var47, 28, n0.a, var34) as Int;
                                    var53 |= 268435456;
                                    break label162;
                                 case 29:
                                    var19 = var48.n(var47, 29, n0.a, var19) as Int;
                                    var8 = 536870912;
                                    break;
                                 case 30:
                                    var35 = var48.n(var47, 30, b2.a, var35) as java.lang.String;
                                    var53 |= 1073741824;
                                    break label162;
                                 case 31:
                                    var36 = var48.n(var47, 31, b2.a, var36) as java.lang.String;
                                    var53 |= Integer.MIN_VALUE;
                                    break label162;
                                 case 32:
                                    var37 = var48.n(var47, 32, n0.a, var37) as Int;
                                    var3 |= 1;
                                    break label162;
                                 case 33:
                                    var96 = var48.y(var47, 33, CodedLinkExtendedType.Serializer.INSTANCE, var96) as CodedLinkExtendedType;
                                    var3 |= 2;
                                    break label162;
                                 case 34:
                                    var26 = var48.m(var47, 34);
                                    var3 |= 4;
                                    break label162;
                                 case 35:
                                    var38 = var48.n(var47, 35, b2.a, var38) as java.lang.String;
                                    var3 |= 8;
                                    break label162;
                                 case 36:
                                    var39 = var48.n(var47, 36, b2.a, var39) as java.lang.String;
                                    var3 |= 16;
                                    break label162;
                                 default:
                                    throw new n(var8);
                              }

                              var53 |= var8;
                              break label162;
                           }

                           var66 = (java.lang.String)var71;
                           var63 = var14;
                           var59 = var80;
                           var71 = var51;
                           var51 = var16;
                           var14 = var59;
                           var80 = (java.lang.String)var63;
                           var16 = var66;
                           break label189;
                        }

                        var66 = (java.lang.String)var71;
                        var63 = var14;
                        var59 = var80;
                        var51 = var16;
                        var71 = var51;
                        var14 = var59;
                        var80 = (java.lang.String)var63;
                        var16 = var66;
                        break label189;
                     }

                     var66 = (java.lang.String)var71;
                     var63 = var14;
                     var59 = var80;
                     var51 = var16;
                     var71 = var51;
                     var14 = var59;
                     var80 = (java.lang.String)var63;
                     var16 = var66;
                     break label189;
                  }

                  var66 = (java.lang.String)var71;
                  var63 = var14;
                  var59 = var80;
                  var51 = var16;
                  var71 = var51;
                  var14 = var59;
                  var80 = (java.lang.String)var63;
                  var16 = var66;
               }

               var51 = var71;
               var59 = var14;
               var63 = var80;
               var66 = var16;
               var71 = var66;
               var14 = var63;
               var80 = (java.lang.String)var59;
               var16 = (java.lang.String)var51;
            }

            var45 = var35;
            var43 = var66;
            var7 = var4;
            var66 = var26;
            var35 = (java.lang.String)var39;
            var37 = var96;
            var41 = var37;
            var26 = var36;
            var44 = var33;
            var17 = var32;
            var36 = var20;
            var42 = var41;
            var20 = (java.lang.String)var29;
            var46 = (java.lang.String)var21;
            var32 = var16;
            var16 = var80;
            var29 = var14;
            var33 = var70;
            var39 = var63;
            var14 = var59;
            var21 = var51;
            var4 = var5;
            var5 = var53;
         }

         var48.c(var47);
         return new GuildInviteDisabledEmbedImpl(
            var5,
            var3,
            var7,
            var4,
            var6,
            var30,
            (InviteType)var31,
            var25,
            var24,
            var23,
            var22,
            (Integer)var21,
            (Integer)var14,
            (Integer)var39,
            var43,
            var33,
            (Integer)var71,
            (java.lang.Boolean)var29,
            var16,
            var32,
            (java.lang.Boolean)var40,
            var46,
            var20,
            (Integer)var28,
            (Integer)var27,
            (java.lang.Boolean)var42,
            (Integer)var97,
            var36,
            var17,
            (Integer)var44,
            (Integer)var34,
            (Integer)var19,
            var45,
            var26,
            (Integer)var41,
            var37,
            var66,
            var38,
            var35,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: GuildInviteDisabledEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         GuildInviteDisabledEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteDisabledEmbedImpl> {
         return GuildInviteDisabledEmbedImpl.$serializer.INSTANCE;
      }
   }
}
