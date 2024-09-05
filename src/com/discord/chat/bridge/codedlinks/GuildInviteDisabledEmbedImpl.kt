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
      val var28: Int = Integer.hashCode(this.backgroundColor);
      val var32: Int = Integer.hashCode(this.borderColor);
      val var29: Int = Integer.hashCode(this.headerColor);
      val var30: Int = this.headerText.hashCode();
      val var31: Int = this.type.hashCode();
      val var35: Int = this.titleText.hashCode();
      val var33: Int = this.subtitle.hashCode();
      val var27: Int = this.helpCenterArticleLabel.hashCode();
      val var34: Int = this.helpCenterArticleURL.hashCode();
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

      val var37: Int = this.extendedType.hashCode();
      val var36: Int = this.guildName.hashCode();
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
                                                                                                                                                                                                                                                                                                                                 var28
                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                    + var32
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
                                                                                                                                                                                                                                                                                                + var35
                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var33
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var27
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
                           + var36
                     )
                     * 31
                  + var25
            )
            * 31
         + var26;
   }

   public override fun toString(): String {
      val var2: Int = this.backgroundColor;
      val var1: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var19: java.lang.String = this.headerText;
      val var35: InviteType = this.type;
      val var10: java.lang.String = this.titleText;
      val var33: java.lang.String = this.subtitle;
      val var38: java.lang.String = this.helpCenterArticleLabel;
      val var37: java.lang.String = this.helpCenterArticleURL;
      val var23: Int = this.acceptLabelBackgroundColor;
      val var30: Int = this.acceptLabelBorderColor;
      val var18: Int = this.acceptLabelColor;
      val var25: java.lang.String = this.acceptLabelText;
      val var17: java.lang.String = this.bodyText;
      val var13: Int = this.bodyTextColor;
      val var36: java.lang.Boolean = this.canBeAccepted;
      val var8: java.lang.String = this.channelIcon;
      val var22: java.lang.String = this.channelName;
      val var31: java.lang.Boolean = this.embedCanBeTapped;
      val var12: java.lang.String = this.memberText;
      val var20: java.lang.String = this.onlineText;
      val var7: Int = this.resolvingGradientEnd;
      val var29: Int = this.resolvingGradientStart;
      val var4: java.lang.Boolean = this.splashHasRadialGradient;
      val var6: Int = this.splashOpacity;
      val var15: java.lang.String = this.splashUrl;
      val var14: java.lang.String = this.inviteSplash;
      val var16: Int = this.subtitleColor;
      val var26: Int = this.thumbnailBackgroundColor;
      val var27: Int = this.thumbnailCornerRadius;
      val var32: java.lang.String = this.thumbnailText;
      val var24: java.lang.String = this.thumbnailUrl;
      val var34: Int = this.titleColor;
      val var9: CodedLinkExtendedType = this.extendedType;
      val var28: java.lang.String = this.guildName;
      val var11: java.lang.String = this.guildIcon;
      val var21: java.lang.String = this.headerIcon;
      val var5: StringBuilder = new StringBuilder();
      var5.append("GuildInviteDisabledEmbedImpl(backgroundColor=");
      var5.append(var2);
      var5.append(", borderColor=");
      var5.append(var1);
      var5.append(", headerColor=");
      var5.append(var3);
      var5.append(", headerText=");
      var5.append(var19);
      var5.append(", type=");
      var5.append(var35);
      var5.append(", titleText=");
      var5.append(var10);
      var5.append(", subtitle=");
      var5.append(var33);
      var5.append(", helpCenterArticleLabel=");
      var5.append(var38);
      var5.append(", helpCenterArticleURL=");
      var5.append(var37);
      var5.append(", acceptLabelBackgroundColor=");
      var5.append(var23);
      var5.append(", acceptLabelBorderColor=");
      var5.append(var30);
      var5.append(", acceptLabelColor=");
      var5.append(var18);
      var5.append(", acceptLabelText=");
      var5.append(var25);
      var5.append(", bodyText=");
      var5.append(var17);
      var5.append(", bodyTextColor=");
      var5.append(var13);
      var5.append(", canBeAccepted=");
      var5.append(var36);
      var5.append(", channelIcon=");
      var5.append(var8);
      var5.append(", channelName=");
      var5.append(var22);
      var5.append(", embedCanBeTapped=");
      var5.append(var31);
      var5.append(", memberText=");
      var5.append(var12);
      var5.append(", onlineText=");
      var5.append(var20);
      var5.append(", resolvingGradientEnd=");
      var5.append(var7);
      var5.append(", resolvingGradientStart=");
      var5.append(var29);
      var5.append(", splashHasRadialGradient=");
      var5.append(var4);
      var5.append(", splashOpacity=");
      var5.append(var6);
      var5.append(", splashUrl=");
      var5.append(var15);
      var5.append(", inviteSplash=");
      var5.append(var14);
      var5.append(", subtitleColor=");
      var5.append(var16);
      var5.append(", thumbnailBackgroundColor=");
      var5.append(var26);
      var5.append(", thumbnailCornerRadius=");
      var5.append(var27);
      var5.append(", thumbnailText=");
      var5.append(var32);
      var5.append(", thumbnailUrl=");
      var5.append(var24);
      var5.append(", titleColor=");
      var5.append(var34);
      var5.append(", extendedType=");
      var5.append(var9);
      var5.append(", guildName=");
      var5.append(var28);
      var5.append(", guildIcon=");
      var5.append(var11);
      var5.append(", headerIcon=");
      var5.append(var21);
      var5.append(")");
      return var5.toString();
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
         val var7: n0 = n0.a;
         val var4: b2 = b2.a;
         val var3: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var9: KSerializer = a.u(n0.a);
         val var6: KSerializer = a.u(var7);
         val var10: KSerializer = a.u(var7);
         val var1: KSerializer = a.u(var4);
         val var5: KSerializer = a.u(var4);
         val var8: KSerializer = a.u(var7);
         val var2: h = h.a;
         return new KSerializer[]{
            var7,
            var7,
            var7,
            var4,
            var3,
            var4,
            var4,
            var4,
            var4,
            var9,
            var6,
            var10,
            var1,
            var5,
            var8,
            a.u(h.a),
            a.u(var4),
            a.u(var4),
            a.u(var2),
            a.u(var4),
            a.u(var4),
            a.u(var7),
            a.u(var7),
            a.u(var2),
            a.u(var7),
            a.u(var4),
            a.u(var4),
            a.u(var7),
            a.u(var7),
            a.u(var7),
            a.u(var4),
            a.u(var4),
            a.u(var7),
            CodedLinkExtendedType.Serializer.INSTANCE,
            var4,
            a.u(var4),
            a.u(var4)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteDisabledEmbedImpl {
         q.h(var1, "decoder");
         val var49: SerialDescriptor = this.getDescriptor();
         val var50: c = var1.b(var49);
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var11: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: java.lang.String;
         var var23: java.lang.String;
         var var24: java.lang.String;
         var var25: java.lang.String;
         var var26: java.lang.String;
         var var27: java.lang.String;
         var var28: Any;
         var var30: java.lang.String;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: java.lang.String;
         var var35: Any;
         var var36: Any;
         var var37: java.lang.String;
         var var38: java.lang.String;
         var var39: java.lang.String;
         var var40: Any;
         var var41: java.lang.String;
         var var42: Any;
         val var43: java.lang.String;
         val var44: java.lang.String;
         var var45: java.lang.String;
         val var46: CodedLinkExtendedType;
         var var56: Int;
         var var75: java.lang.String;
         var var81: Any;
         var var96: java.lang.String;
         var var103: Any;
         var var105: Any;
         var var112: java.lang.String;
         if (var50.p()) {
            var5 = var50.i(var49, 0);
            var56 = var50.i(var49, 1);
            val var2: Int = var50.i(var49, 2);
            var30 = var50.m(var49, 3);
            var31 = var50.y(var49, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var25 = var50.m(var49, 5);
            var24 = var50.m(var49, 6);
            var23 = var50.m(var49, 7);
            var22 = var50.m(var49, 8);
            val var9: n0 = n0.a;
            var103 = var50.n(var49, 9, n0.a, null) as Int;
            var81 = var50.n(var49, 10, var9, null) as Int;
            val var13: Int = var50.n(var49, 11, var9, null) as Int;
            val var51: b2 = b2.a;
            var41 = var50.n(var49, 12, b2.a, null) as java.lang.String;
            var112 = var50.n(var49, 13, var51, null) as java.lang.String;
            var35 = var50.n(var49, 14, var9, null) as Int;
            val var10: h = h.a;
            var36 = var50.n(var49, 15, h.a, null) as java.lang.Boolean;
            var96 = var50.n(var49, 16, var51, null) as java.lang.String;
            val var15: java.lang.String = var50.n(var49, 17, var51, null) as java.lang.String;
            val var12: java.lang.Boolean = var50.n(var49, 18, var10, null) as java.lang.Boolean;
            var45 = var50.n(var49, 19, var51, null) as java.lang.String;
            var44 = var50.n(var49, 20, var51, null) as java.lang.String;
            var20 = var50.n(var49, 21, var9, null) as Int;
            var105 = var50.n(var49, 22, var9, null) as Int;
            var19 = var50.n(var49, 23, var10, null) as java.lang.Boolean;
            val var67: Int = var50.n(var49, 24, var9, null) as Int;
            var43 = var50.n(var49, 25, var51, null) as java.lang.String;
            var26 = var50.n(var49, 26, var51, null) as java.lang.String;
            var33 = var50.n(var49, 27, var9, null) as Int;
            var28 = var50.n(var49, 28, var9, null) as Int;
            var21 = var50.n(var49, 29, var9, null) as Int;
            var34 = var50.n(var49, 30, var51, null) as java.lang.String;
            var38 = var50.n(var49, 31, var51, null) as java.lang.String;
            var11 = var50.n(var49, 32, var9, null) as Int;
            var46 = var50.y(var49, 33, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var63: java.lang.String = var50.m(var49, 34);
            var27 = var50.n(var49, 35, var51, null) as java.lang.String;
            val var52: java.lang.String = var50.n(var49, 36, var51, null) as java.lang.String;
            var4 = -1;
            var6 = 31;
            var7 = var56;
            var56 = var2;
            var42 = var103;
            var32 = var81;
            var81 = var13;
            var75 = var112;
            var37 = var96;
            var96 = var15;
            var40 = var12;
            var103 = var105;
            var105 = var67;
            var39 = var63;
            var112 = var52;
         } else {
            var var60: Boolean = true;
            var6 = 0;
            var4 = 0;
            var5 = 0;
            var56 = 0;
            var103 = null;
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
            var105 = null;
            var30 = null;
            var25 = null;
            var24 = null;
            var23 = null;
            var22 = null;
            var31 = null;
            var var53: Any = null;
            var var64: Any = null;
            var var68: Any = null;
            var11 = null;
            var var74: java.lang.String = null;
            var75 = null;
            var81 = null;
            var var87: java.lang.String = null;
            var96 = null;
            var40 = null;
            var21 = null;
            var112 = null;
            var26 = null;
            var28 = null;
            var27 = null;
            var38 = null;
            var var55: Int = 0;

            while (var60) {
               label189: {
                  label162: {
                     label190: {
                        label191: {
                           label119: {
                              var var8: Int = var50.o(var49);
                              switch (var8) {
                                 case -1:
                                    var60 = false;
                                    break label191;
                                 case 0:
                                    var5 = var50.i(var49, 0);
                                    var55 |= 1;
                                    break label191;
                                 case 1:
                                    var4 = var50.i(var49, 1);
                                    var55 |= 2;
                                    break label190;
                                 case 2:
                                    var6 = var50.i(var49, 2);
                                    var55 |= 4;
                                    break label190;
                                 case 3:
                                    var30 = var50.m(var49, 3);
                                    var55 |= 8;
                                    break label190;
                                 case 4:
                                    var31 = var50.y(var49, 4, InviteType.Serializer.INSTANCE, var31) as InviteType;
                                    var55 |= 16;
                                    break label190;
                                 case 5:
                                    var25 = var50.m(var49, 5);
                                    var55 |= 32;
                                    break label119;
                                 case 6:
                                    var24 = var50.m(var49, 6);
                                    var55 |= 64;
                                    break label119;
                                 case 7:
                                    var23 = var50.m(var49, 7);
                                    var55 |= 128;
                                    break label119;
                                 case 8:
                                    var22 = var50.m(var49, 8);
                                    var55 |= 256;
                                    break label119;
                                 case 9:
                                    var53 = var50.n(var49, 9, n0.a, var53) as Int;
                                    var55 |= 512;
                                    break label119;
                                 case 10:
                                    var11 = var75;
                                    var87 = (java.lang.String)var68;
                                    var81 = var50.n(var49, 10, n0.a, var64) as Int;
                                    var55 |= 1024;
                                    var53 = var96;
                                    var64 = var87;
                                    var68 = var81;
                                    var75 = (java.lang.String)var53;
                                    var96 = (java.lang.String)var11;
                                    break label189;
                                 case 11:
                                    var96 = (java.lang.String)var11;
                                    var87 = var50.n(var49, 11, n0.a, var68) as Int;
                                    var55 |= 2048;
                                    var53 = var96;
                                    var64 = var87;
                                    var68 = var81;
                                    var11 = var75;
                                    var75 = (java.lang.String)var53;
                                    var81 = var64;
                                    break label189;
                                 case 12:
                                    var96 = var50.n(var49, 12, b2.a, var11) as java.lang.String;
                                    var55 |= 4096;
                                    var53 = var96;
                                    var64 = var87;
                                    var68 = var81;
                                    var11 = var75;
                                    var75 = (java.lang.String)var53;
                                    var81 = var64;
                                    var87 = (java.lang.String)var68;
                                    break label189;
                                 case 13:
                                    var74 = var50.n(var49, 13, b2.a, var74) as java.lang.String;
                                    var55 |= 8192;
                                    var75 = (java.lang.String)var53;
                                    var53 = var96;
                                    var64 = var87;
                                    var68 = var81;
                                    var11 = var75;
                                    var81 = var64;
                                    var87 = (java.lang.String)var68;
                                    var96 = (java.lang.String)var11;
                                    break label189;
                                 case 14:
                                    val var202: Int = var50.n(var49, 14, n0.a, var75) as Int;
                                    var55 |= 16384;
                                    var75 = (java.lang.String)var53;
                                    var81 = var64;
                                    var87 = (java.lang.String)var68;
                                    var96 = (java.lang.String)var11;
                                    var53 = var96;
                                    var64 = var87;
                                    var68 = var81;
                                    var11 = var202;
                                    break label189;
                                 case 15:
                                    val var201: java.lang.Boolean = var50.n(var49, 15, h.a, var81) as java.lang.Boolean;
                                    var55 |= 32768;
                                    var87 = (java.lang.String)var68;
                                    var96 = (java.lang.String)var11;
                                    var11 = var75;
                                    var53 = var96;
                                    var64 = var87;
                                    var68 = var201;
                                    var75 = (java.lang.String)var53;
                                    var81 = var64;
                                    break label189;
                                 case 16:
                                    var45 = var50.n(var49, 16, b2.a, var87) as java.lang.String;
                                    var55 |= 65536;
                                    var87 = (java.lang.String)var68;
                                    var11 = var75;
                                    var68 = var81;
                                    var53 = var96;
                                    var64 = var45;
                                    var75 = (java.lang.String)var53;
                                    var81 = var64;
                                    var96 = (java.lang.String)var11;
                                    break label189;
                                 case 17:
                                    var42 = var50.n(var49, 17, b2.a, var96) as java.lang.String;
                                    var55 |= 131072;
                                    var96 = (java.lang.String)var11;
                                    var11 = var75;
                                    var68 = var81;
                                    var64 = var87;
                                    var87 = (java.lang.String)var68;
                                    var81 = var64;
                                    var75 = (java.lang.String)var53;
                                    var53 = var42;
                                    break label189;
                                 case 18:
                                    val var199: java.lang.Boolean = var50.n(var49, 18, h.a, var40) as java.lang.Boolean;
                                    var55 |= 262144;
                                    var11 = var75;
                                    var68 = var81;
                                    var64 = var87;
                                    var53 = var96;
                                    var75 = (java.lang.String)var53;
                                    var81 = var64;
                                    var87 = (java.lang.String)var68;
                                    var96 = (java.lang.String)var11;
                                    var40 = var199;
                                    break label189;
                                 case 19:
                                    var21 = var50.n(var49, 19, b2.a, var21) as java.lang.String;
                                    var55 |= 524288;
                                    break label162;
                                 case 20:
                                    var112 = var50.n(var49, 20, b2.a, var112) as java.lang.String;
                                    var55 |= 1048576;
                                    break label162;
                                 case 21:
                                    var28 = var50.n(var49, 21, n0.a, var28) as Int;
                                    var55 |= 2097152;
                                    break label162;
                                 case 22:
                                    var27 = var50.n(var49, 22, n0.a, var27) as Int;
                                    var55 |= 4194304;
                                    break label162;
                                 case 23:
                                    var41 = var50.n(var49, 23, h.a, var41) as java.lang.Boolean;
                                    var55 |= 8388608;
                                    break label162;
                                 case 24:
                                    var105 = var50.n(var49, 24, n0.a, var105) as Int;
                                    var55 |= 16777216;
                                    break label162;
                                 case 25:
                                    var20 = var50.n(var49, 25, b2.a, var20) as java.lang.String;
                                    var8 = 33554432;
                                    break;
                                 case 26:
                                    var32 = var50.n(var49, 26, b2.a, var32) as java.lang.String;
                                    var55 |= 67108864;
                                    break label162;
                                 case 27:
                                    var33 = var50.n(var49, 27, n0.a, var33) as Int;
                                    var55 |= 134217728;
                                    break label162;
                                 case 28:
                                    var34 = var50.n(var49, 28, n0.a, var34) as Int;
                                    var55 |= 268435456;
                                    break label162;
                                 case 29:
                                    var19 = var50.n(var49, 29, n0.a, var19) as Int;
                                    var8 = 536870912;
                                    break;
                                 case 30:
                                    var35 = var50.n(var49, 30, b2.a, var35) as java.lang.String;
                                    var55 |= 1073741824;
                                    break label162;
                                 case 31:
                                    var36 = var50.n(var49, 31, b2.a, var36) as java.lang.String;
                                    var55 |= Integer.MIN_VALUE;
                                    break label162;
                                 case 32:
                                    var37 = var50.n(var49, 32, n0.a, var37) as Int;
                                    var56 |= 1;
                                    break label162;
                                 case 33:
                                    var103 = var50.y(var49, 33, CodedLinkExtendedType.Serializer.INSTANCE, var103) as CodedLinkExtendedType;
                                    var56 |= 2;
                                    break label162;
                                 case 34:
                                    var26 = var50.m(var49, 34);
                                    var56 |= 4;
                                    break label162;
                                 case 35:
                                    var38 = var50.n(var49, 35, b2.a, var38) as java.lang.String;
                                    var56 |= 8;
                                    break label162;
                                 case 36:
                                    var39 = var50.n(var49, 36, b2.a, var39) as java.lang.String;
                                    var56 |= 16;
                                    break label162;
                                 default:
                                    throw new n(var8);
                              }

                              var55 |= var8;
                              break label162;
                           }

                           var11 = var75;
                           var68 = var81;
                           var64 = var87;
                           var75 = (java.lang.String)var53;
                           var53 = var96;
                           var81 = var64;
                           var87 = (java.lang.String)var68;
                           var96 = (java.lang.String)var11;
                           break label189;
                        }

                        var11 = var75;
                        var68 = var81;
                        var64 = var87;
                        var53 = var96;
                        var75 = (java.lang.String)var53;
                        var81 = var64;
                        var87 = (java.lang.String)var68;
                        var96 = (java.lang.String)var11;
                        break label189;
                     }

                     var11 = var75;
                     var68 = var81;
                     var64 = var87;
                     var53 = var96;
                     var75 = (java.lang.String)var53;
                     var81 = var64;
                     var87 = (java.lang.String)var68;
                     var96 = (java.lang.String)var11;
                     break label189;
                  }

                  var11 = var75;
                  var68 = var81;
                  var64 = var87;
                  var53 = var96;
                  var75 = (java.lang.String)var53;
                  var81 = var64;
                  var87 = (java.lang.String)var68;
                  var96 = (java.lang.String)var11;
               }

               var53 = var75;
               var64 = var81;
               var68 = var87;
               var11 = var96;
               var75 = (java.lang.String)var11;
               var81 = var68;
               var87 = (java.lang.String)var64;
               var96 = (java.lang.String)var53;
            }

            var45 = (java.lang.String)var21;
            var44 = var112;
            var6 = var56;
            var112 = var39;
            var27 = var38;
            var39 = var26;
            var46 = (CodedLinkExtendedType)var103;
            var11 = var37;
            var38 = (java.lang.String)var36;
            var34 = (java.lang.String)var35;
            var21 = var19;
            var28 = var34;
            var26 = (java.lang.String)var32;
            var43 = (java.lang.String)var20;
            var19 = var41;
            var103 = var27;
            var20 = var28;
            var37 = var87;
            var36 = var81;
            var35 = var75;
            var75 = var74;
            var41 = (java.lang.String)var11;
            var81 = var68;
            var32 = var64;
            var42 = var53;
            var56 = var6;
            var7 = var4;
            var4 = var55;
         }

         var50.c(var49);
         return new GuildInviteDisabledEmbedImpl(
            var4,
            var6,
            var5,
            var7,
            var56,
            var30,
            (InviteType)var31,
            var25,
            var24,
            var23,
            var22,
            (Integer)var42,
            (Integer)var32,
            (Integer)var81,
            var41,
            var75,
            (Integer)var35,
            (java.lang.Boolean)var36,
            var37,
            var96,
            (java.lang.Boolean)var40,
            var45,
            var44,
            (Integer)var20,
            (Integer)var103,
            (java.lang.Boolean)var19,
            (Integer)var105,
            var43,
            var26,
            (Integer)var33,
            (Integer)var28,
            (Integer)var21,
            var34,
            var38,
            (Integer)var11,
            var46,
            var39,
            var27,
            var112,
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
