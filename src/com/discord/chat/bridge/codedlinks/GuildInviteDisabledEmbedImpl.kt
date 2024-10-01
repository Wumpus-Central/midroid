package com.discord.chat.bridge.codedlinks

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.h
import fl.n0
import kotlin.jvm.internal.q
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
      val var35: Int = Integer.hashCode(this.borderColor);
      val var29: Int = Integer.hashCode(this.headerColor);
      val var33: Int = this.headerText.hashCode();
      val var28: Int = this.type.hashCode();
      val var30: Int = this.titleText.hashCode();
      val var34: Int = this.subtitle.hashCode();
      val var32: Int = this.helpCenterArticleLabel.hashCode();
      val var27: Int = this.helpCenterArticleURL.hashCode();
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
                                                                                                                                                                                                                                                                                                                                 var31
                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                    + var35
                                                                                                                                                                                                                                                                                                                              )
                                                                                                                                                                                                                                                                                                                              * 31
                                                                                                                                                                                                                                                                                                                           + var29
                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                  + var33
                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                         + var28
                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                + var30
                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var34
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var32
                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                     + var27
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
      val var1: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var29: java.lang.String = this.headerText;
      val var23: InviteType = this.type;
      val var35: java.lang.String = this.titleText;
      val var16: java.lang.String = this.subtitle;
      val var38: java.lang.String = this.helpCenterArticleLabel;
      val var25: java.lang.String = this.helpCenterArticleURL;
      val var36: Int = this.acceptLabelBackgroundColor;
      val var9: Int = this.acceptLabelBorderColor;
      val var11: Int = this.acceptLabelColor;
      val var37: java.lang.String = this.acceptLabelText;
      val var34: java.lang.String = this.bodyText;
      val var26: Int = this.bodyTextColor;
      val var18: java.lang.Boolean = this.canBeAccepted;
      val var13: java.lang.String = this.channelIcon;
      val var17: java.lang.String = this.channelName;
      val var10: java.lang.Boolean = this.embedCanBeTapped;
      val var27: java.lang.String = this.memberText;
      val var19: java.lang.String = this.onlineText;
      val var6: Int = this.resolvingGradientEnd;
      val var20: Int = this.resolvingGradientStart;
      val var33: java.lang.Boolean = this.splashHasRadialGradient;
      val var31: Int = this.splashOpacity;
      val var32: java.lang.String = this.splashUrl;
      val var7: java.lang.String = this.inviteSplash;
      val var12: Int = this.subtitleColor;
      val var14: Int = this.thumbnailBackgroundColor;
      val var24: Int = this.thumbnailCornerRadius;
      val var8: java.lang.String = this.thumbnailText;
      val var30: java.lang.String = this.thumbnailUrl;
      val var4: Int = this.titleColor;
      val var21: CodedLinkExtendedType = this.extendedType;
      val var22: java.lang.String = this.guildName;
      val var5: java.lang.String = this.guildIcon;
      val var28: java.lang.String = this.headerIcon;
      val var15: StringBuilder = new StringBuilder();
      var15.append("GuildInviteDisabledEmbedImpl(backgroundColor=");
      var15.append(var1);
      var15.append(", borderColor=");
      var15.append(var2);
      var15.append(", headerColor=");
      var15.append(var3);
      var15.append(", headerText=");
      var15.append(var29);
      var15.append(", type=");
      var15.append(var23);
      var15.append(", titleText=");
      var15.append(var35);
      var15.append(", subtitle=");
      var15.append(var16);
      var15.append(", helpCenterArticleLabel=");
      var15.append(var38);
      var15.append(", helpCenterArticleURL=");
      var15.append(var25);
      var15.append(", acceptLabelBackgroundColor=");
      var15.append(var36);
      var15.append(", acceptLabelBorderColor=");
      var15.append(var9);
      var15.append(", acceptLabelColor=");
      var15.append(var11);
      var15.append(", acceptLabelText=");
      var15.append(var37);
      var15.append(", bodyText=");
      var15.append(var34);
      var15.append(", bodyTextColor=");
      var15.append(var26);
      var15.append(", canBeAccepted=");
      var15.append(var18);
      var15.append(", channelIcon=");
      var15.append(var13);
      var15.append(", channelName=");
      var15.append(var17);
      var15.append(", embedCanBeTapped=");
      var15.append(var10);
      var15.append(", memberText=");
      var15.append(var27);
      var15.append(", onlineText=");
      var15.append(var19);
      var15.append(", resolvingGradientEnd=");
      var15.append(var6);
      var15.append(", resolvingGradientStart=");
      var15.append(var20);
      var15.append(", splashHasRadialGradient=");
      var15.append(var33);
      var15.append(", splashOpacity=");
      var15.append(var31);
      var15.append(", splashUrl=");
      var15.append(var32);
      var15.append(", inviteSplash=");
      var15.append(var7);
      var15.append(", subtitleColor=");
      var15.append(var12);
      var15.append(", thumbnailBackgroundColor=");
      var15.append(var14);
      var15.append(", thumbnailCornerRadius=");
      var15.append(var24);
      var15.append(", thumbnailText=");
      var15.append(var8);
      var15.append(", thumbnailUrl=");
      var15.append(var30);
      var15.append(", titleColor=");
      var15.append(var4);
      var15.append(", extendedType=");
      var15.append(var21);
      var15.append(", guildName=");
      var15.append(var22);
      var15.append(", guildIcon=");
      var15.append(var5);
      var15.append(", headerIcon=");
      var15.append(var28);
      var15.append(")");
      return var15.toString();
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
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var6: n0 = n0.a;
         val var4: b2 = b2.a;
         val var2: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var1: KSerializer = a.u(n0.a);
         val var8: KSerializer = a.u(var6);
         val var5: KSerializer = a.u(var6);
         val var3: KSerializer = a.u(var4);
         val var7: KSerializer = a.u(var4);
         val var9: KSerializer = a.u(var6);
         val var10: h = h.a;
         return new KSerializer[]{
            var6,
            var6,
            var6,
            var4,
            var2,
            var4,
            var4,
            var4,
            var4,
            var1,
            var8,
            var5,
            var3,
            var7,
            var9,
            a.u(h.a),
            a.u(var4),
            a.u(var4),
            a.u(var10),
            a.u(var4),
            a.u(var4),
            a.u(var6),
            a.u(var6),
            a.u(var10),
            a.u(var6),
            a.u(var4),
            a.u(var4),
            a.u(var6),
            a.u(var6),
            a.u(var6),
            a.u(var4),
            a.u(var4),
            a.u(var6),
            CodedLinkExtendedType.Serializer.INSTANCE,
            var4,
            a.u(var4),
            a.u(var4)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteDisabledEmbedImpl {
         q.h(var1, "decoder");
         val var48: SerialDescriptor = this.getDescriptor();
         val var49: c = var1.c(var48);
         var var3: Int;
         var var4: Int;
         var var6: Int;
         val var7: Int;
         var var13: Any;
         var var16: java.lang.String;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: java.lang.String;
         var var21: java.lang.String;
         var var22: java.lang.String;
         var var23: java.lang.String;
         var var24: java.lang.String;
         var var25: java.lang.String;
         var var26: Any;
         var var27: Any;
         var var28: java.lang.String;
         var var30: java.lang.String;
         var var31: Any;
         var var32: java.lang.String;
         var var33: Any;
         var var34: Any;
         var var35: java.lang.String;
         var var36: java.lang.String;
         var var37: Any;
         var var38: Any;
         var var40: Any;
         var var41: Any;
         var var42: Any;
         val var43: java.lang.String;
         val var44: Any;
         var var45: java.lang.String;
         val var46: java.lang.String;
         var var56: Int;
         var var69: CodedLinkExtendedType;
         var var80: java.lang.String;
         var var107: java.lang.String;
         var var118: java.lang.String;
         if (var49.y()) {
            var6 = var49.k(var48, 0);
            var56 = var49.k(var48, 1);
            val var2: Int = var49.k(var48, 2);
            var30 = var49.t(var48, 3);
            var31 = var49.m(var48, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var25 = var49.t(var48, 5);
            var24 = var49.t(var48, 6);
            var23 = var49.t(var48, 7);
            var22 = var49.t(var48, 8);
            val var9: n0 = n0.a;
            var26 = var49.v(var48, 9, n0.a, null) as Int;
            val var14: Int = var49.v(var48, 10, var9, null) as Int;
            var13 = var49.v(var48, 11, var9, null) as Int;
            val var50: b2 = b2.a;
            var20 = var49.v(var48, 12, b2.a, null) as java.lang.String;
            var107 = var49.v(var48, 13, var50, null) as java.lang.String;
            var41 = var49.v(var48, 14, var9, null) as Int;
            val var10: h = h.a;
            var44 = var49.v(var48, 15, h.a, null) as java.lang.Boolean;
            var16 = var49.v(var48, 16, var50, null) as java.lang.String;
            val var15: java.lang.String = var49.v(var48, 17, var50, null) as java.lang.String;
            val var12: java.lang.Boolean = var49.v(var48, 18, var10, null) as java.lang.Boolean;
            var32 = var49.v(var48, 19, var50, null) as java.lang.String;
            var36 = var49.v(var48, 20, var50, null) as java.lang.String;
            var37 = var49.v(var48, 21, var9, null) as Int;
            var18 = var49.v(var48, 22, var9, null) as Int;
            var33 = var49.v(var48, 23, var10, null) as java.lang.Boolean;
            val var65: Int = var49.v(var48, 24, var9, null) as Int;
            var43 = var49.v(var48, 25, var50, null) as java.lang.String;
            var35 = var49.v(var48, 26, var50, null) as java.lang.String;
            var27 = var49.v(var48, 27, var9, null) as Int;
            var17 = var49.v(var48, 28, var9, null) as Int;
            var19 = var49.v(var48, 29, var9, null) as Int;
            var45 = var49.v(var48, 30, var50, null) as java.lang.String;
            var21 = var49.v(var48, 31, var50, null) as java.lang.String;
            val var11: Int = var49.v(var48, 32, var9, null) as Int;
            val var39: CodedLinkExtendedType = var49.m(var48, 33, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var61: java.lang.String = var49.t(var48, 34);
            var28 = var49.v(var48, 35, var50, null) as java.lang.String;
            val var51: java.lang.String = var49.v(var48, 36, var50, null) as java.lang.String;
            var4 = -1;
            var3 = 31;
            var7 = var56;
            var56 = var2;
            var38 = var14;
            var80 = var107;
            var107 = var15;
            var40 = var12;
            var42 = var65;
            var34 = var11;
            var69 = var39;
            var118 = var61;
            var46 = var51;
         } else {
            var var59: Boolean = true;
            var6 = 0;
            var56 = 0;
            var4 = 0;
            var3 = 0;
            var17 = null;
            var20 = null;
            var19 = null;
            var41 = null;
            var118 = null;
            var37 = null;
            var36 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var32 = null;
            var18 = null;
            var30 = null;
            var25 = null;
            var24 = null;
            var23 = null;
            var22 = null;
            var31 = null;
            var var52: Any = null;
            var var62: Any = null;
            var var66: Any = null;
            var var70: java.lang.String = null;
            var var74: java.lang.String = null;
            var13 = null;
            var80 = null;
            var var85: java.lang.String = null;
            var16 = null;
            var40 = null;
            var21 = null;
            var107 = null;
            var26 = null;
            var28 = null;
            var27 = null;
            var38 = null;
            var var54: Int = 0;

            while (var59) {
               label189: {
                  label162: {
                     label190: {
                        label191: {
                           label119: {
                              var var8: Int = var49.x(var48);
                              switch (var8) {
                                 case -1:
                                    var59 = false;
                                    break label191;
                                 case 0:
                                    var4 = var49.k(var48, 0);
                                    var54 |= 1;
                                    break label191;
                                 case 1:
                                    var56 = var49.k(var48, 1);
                                    var54 |= 2;
                                    break label190;
                                 case 2:
                                    var6 = var49.k(var48, 2);
                                    var54 |= 4;
                                    break label190;
                                 case 3:
                                    var30 = var49.t(var48, 3);
                                    var54 |= 8;
                                    break label190;
                                 case 4:
                                    var31 = var49.m(var48, 4, InviteType.Serializer.INSTANCE, var31) as InviteType;
                                    var54 |= 16;
                                    break label190;
                                 case 5:
                                    var25 = var49.t(var48, 5);
                                    var54 |= 32;
                                    break label119;
                                 case 6:
                                    var24 = var49.t(var48, 6);
                                    var54 |= 64;
                                    break label119;
                                 case 7:
                                    var23 = var49.t(var48, 7);
                                    var54 |= 128;
                                    break label119;
                                 case 8:
                                    var22 = var49.t(var48, 8);
                                    var54 |= 256;
                                    break label119;
                                 case 9:
                                    var52 = var49.v(var48, 9, n0.a, var52) as Int;
                                    var54 |= 512;
                                    break label119;
                                 case 10:
                                    var69 = (CodedLinkExtendedType)var13;
                                    var85 = (java.lang.String)var66;
                                    var80 = var49.v(var48, 10, n0.a, var62) as Int;
                                    var54 |= 1024;
                                    var52 = var16;
                                    var62 = var85;
                                    var66 = var80;
                                    var13 = var52;
                                    var16 = var70;
                                    break label189;
                                 case 11:
                                    var16 = var70;
                                    var85 = var49.v(var48, 11, n0.a, var66) as Int;
                                    var54 |= 2048;
                                    var52 = var16;
                                    var62 = var85;
                                    var66 = var80;
                                    var69 = (CodedLinkExtendedType)var13;
                                    var13 = var52;
                                    var80 = (java.lang.String)var62;
                                    break label189;
                                 case 12:
                                    var16 = var49.v(var48, 12, b2.a, var70) as java.lang.String;
                                    var54 |= 4096;
                                    var52 = var16;
                                    var62 = var85;
                                    var66 = var80;
                                    var69 = (CodedLinkExtendedType)var13;
                                    var13 = var52;
                                    var80 = (java.lang.String)var62;
                                    var85 = (java.lang.String)var66;
                                    break label189;
                                 case 13:
                                    var74 = var49.v(var48, 13, b2.a, var74) as java.lang.String;
                                    var54 |= 8192;
                                    var13 = var52;
                                    var85 = (java.lang.String)var66;
                                    var16 = var70;
                                    var52 = var16;
                                    var62 = var85;
                                    var66 = var80;
                                    var69 = (CodedLinkExtendedType)var13;
                                    var80 = (java.lang.String)var62;
                                    break label189;
                                 case 14:
                                    val var200: Int = var49.v(var48, 14, n0.a, var13) as Int;
                                    var54 |= 16384;
                                    var13 = var52;
                                    var80 = (java.lang.String)var62;
                                    var85 = (java.lang.String)var66;
                                    var16 = var70;
                                    var52 = var16;
                                    var62 = var85;
                                    var66 = var80;
                                    var69 = var200;
                                    break label189;
                                 case 15:
                                    val var199: java.lang.Boolean = var49.v(var48, 15, h.a, var80) as java.lang.Boolean;
                                    var54 |= 32768;
                                    var80 = (java.lang.String)var62;
                                    var85 = (java.lang.String)var66;
                                    var16 = var70;
                                    var69 = (CodedLinkExtendedType)var13;
                                    var52 = var16;
                                    var62 = var85;
                                    var66 = var199;
                                    var13 = var52;
                                    break label189;
                                 case 16:
                                    var45 = var49.v(var48, 16, b2.a, var85) as java.lang.String;
                                    var54 |= 65536;
                                    var16 = var70;
                                    var69 = (CodedLinkExtendedType)var13;
                                    var66 = var80;
                                    var52 = var16;
                                    var62 = var45;
                                    var13 = var52;
                                    var80 = (java.lang.String)var62;
                                    var85 = (java.lang.String)var66;
                                    break label189;
                                 case 17:
                                    var42 = var49.v(var48, 17, b2.a, var16) as java.lang.String;
                                    var54 |= 131072;
                                    var16 = var70;
                                    var69 = (CodedLinkExtendedType)var13;
                                    var66 = var80;
                                    var62 = var85;
                                    var85 = (java.lang.String)var66;
                                    var80 = (java.lang.String)var62;
                                    var13 = var52;
                                    var52 = var42;
                                    break label189;
                                 case 18:
                                    val var197: java.lang.Boolean = var49.v(var48, 18, h.a, var40) as java.lang.Boolean;
                                    var54 |= 262144;
                                    var69 = (CodedLinkExtendedType)var13;
                                    var66 = var80;
                                    var62 = var85;
                                    var52 = var16;
                                    var13 = var52;
                                    var80 = (java.lang.String)var62;
                                    var85 = (java.lang.String)var66;
                                    var16 = var70;
                                    var40 = var197;
                                    break label189;
                                 case 19:
                                    var21 = var49.v(var48, 19, b2.a, var21) as java.lang.String;
                                    var54 |= 524288;
                                    break label162;
                                 case 20:
                                    var107 = var49.v(var48, 20, b2.a, var107) as java.lang.String;
                                    var54 |= 1048576;
                                    break label162;
                                 case 21:
                                    var28 = var49.v(var48, 21, n0.a, var28) as Int;
                                    var54 |= 2097152;
                                    break label162;
                                 case 22:
                                    var27 = var49.v(var48, 22, n0.a, var27) as Int;
                                    var54 |= 4194304;
                                    break label162;
                                 case 23:
                                    var41 = var49.v(var48, 23, h.a, var41) as java.lang.Boolean;
                                    var54 |= 8388608;
                                    break label162;
                                 case 24:
                                    var18 = var49.v(var48, 24, n0.a, var18) as Int;
                                    var54 |= 16777216;
                                    break label162;
                                 case 25:
                                    var20 = var49.v(var48, 25, b2.a, var20) as java.lang.String;
                                    var8 = 33554432;
                                    break;
                                 case 26:
                                    var32 = var49.v(var48, 26, b2.a, var32) as java.lang.String;
                                    var54 |= 67108864;
                                    break label162;
                                 case 27:
                                    var33 = var49.v(var48, 27, n0.a, var33) as Int;
                                    var54 |= 134217728;
                                    break label162;
                                 case 28:
                                    var34 = var49.v(var48, 28, n0.a, var34) as Int;
                                    var54 |= 268435456;
                                    break label162;
                                 case 29:
                                    var19 = var49.v(var48, 29, n0.a, var19) as Int;
                                    var8 = 536870912;
                                    break;
                                 case 30:
                                    var35 = var49.v(var48, 30, b2.a, var35) as java.lang.String;
                                    var54 |= 1073741824;
                                    break label162;
                                 case 31:
                                    var36 = var49.v(var48, 31, b2.a, var36) as java.lang.String;
                                    var54 |= Integer.MIN_VALUE;
                                    break label162;
                                 case 32:
                                    var37 = var49.v(var48, 32, n0.a, var37) as Int;
                                    var3 |= 1;
                                    break label162;
                                 case 33:
                                    var17 = var49.m(var48, 33, CodedLinkExtendedType.Serializer.INSTANCE, var17) as CodedLinkExtendedType;
                                    var3 |= 2;
                                    break label162;
                                 case 34:
                                    var26 = var49.t(var48, 34);
                                    var3 |= 4;
                                    break label162;
                                 case 35:
                                    var38 = var49.v(var48, 35, b2.a, var38) as java.lang.String;
                                    var3 |= 8;
                                    break label162;
                                 case 36:
                                    var118 = var49.v(var48, 36, b2.a, var118) as java.lang.String;
                                    var3 |= 16;
                                    break label162;
                                 default:
                                    throw new n(var8);
                              }

                              var54 |= var8;
                              break label162;
                           }

                           var69 = (CodedLinkExtendedType)var13;
                           var66 = var80;
                           var62 = var85;
                           var13 = var52;
                           var52 = var16;
                           var80 = (java.lang.String)var62;
                           var85 = (java.lang.String)var66;
                           var16 = var70;
                           break label189;
                        }

                        var69 = (CodedLinkExtendedType)var13;
                        var66 = var80;
                        var62 = var85;
                        var52 = var16;
                        var13 = var52;
                        var80 = (java.lang.String)var62;
                        var85 = (java.lang.String)var66;
                        var16 = var70;
                        break label189;
                     }

                     var69 = (CodedLinkExtendedType)var13;
                     var66 = var80;
                     var62 = var85;
                     var52 = var16;
                     var13 = var52;
                     var80 = (java.lang.String)var62;
                     var85 = (java.lang.String)var66;
                     var16 = var70;
                     break label189;
                  }

                  var69 = (CodedLinkExtendedType)var13;
                  var66 = var80;
                  var62 = var85;
                  var52 = var16;
                  var13 = var52;
                  var80 = (java.lang.String)var62;
                  var85 = (java.lang.String)var66;
                  var16 = var70;
               }

               var52 = var13;
               var62 = var80;
               var66 = var85;
               var70 = var16;
               var13 = var69;
               var80 = (java.lang.String)var66;
               var85 = (java.lang.String)var62;
               var16 = (java.lang.String)var52;
            }

            var45 = var35;
            var7 = var56;
            var46 = var118;
            var28 = (java.lang.String)var38;
            var118 = (java.lang.String)var26;
            var69 = (CodedLinkExtendedType)var17;
            var34 = var37;
            var21 = var36;
            var17 = var34;
            var27 = var33;
            var35 = var32;
            var43 = var20;
            var42 = var18;
            var33 = var41;
            var18 = var27;
            var37 = var28;
            var36 = var107;
            var32 = var21;
            var107 = var16;
            var16 = var85;
            var44 = var80;
            var41 = var13;
            var80 = var74;
            var20 = var70;
            var13 = var66;
            var38 = var62;
            var26 = var52;
            var56 = var6;
            var6 = var4;
            var4 = var54;
         }

         var49.b(var48);
         return new GuildInviteDisabledEmbedImpl(
            var4,
            var3,
            var6,
            var7,
            var56,
            var30,
            (InviteType)var31,
            var25,
            var24,
            var23,
            var22,
            (Integer)var26,
            (Integer)var38,
            (Integer)var13,
            var20,
            var80,
            (Integer)var41,
            (java.lang.Boolean)var44,
            var16,
            var107,
            (java.lang.Boolean)var40,
            var32,
            var36,
            (Integer)var37,
            (Integer)var18,
            (java.lang.Boolean)var33,
            (Integer)var42,
            var43,
            var35,
            (Integer)var27,
            (Integer)var17,
            (Integer)var19,
            var45,
            var21,
            (Integer)var34,
            var69,
            var118,
            var28,
            var46,
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
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteDisabledEmbedImpl> {
         return GuildInviteDisabledEmbedImpl.$serializer.INSTANCE;
      }
   }
}
