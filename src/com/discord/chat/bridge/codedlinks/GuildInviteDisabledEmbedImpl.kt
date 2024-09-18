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
      val var35: Int = Integer.hashCode(this.backgroundColor);
      val var28: Int = Integer.hashCode(this.borderColor);
      val var34: Int = Integer.hashCode(this.headerColor);
      val var32: Int = this.headerText.hashCode();
      val var30: Int = this.type.hashCode();
      val var33: Int = this.titleText.hashCode();
      val var31: Int = this.subtitle.hashCode();
      val var29: Int = this.helpCenterArticleLabel.hashCode();
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
                                                                                                                                                                                                                                                                                                                                 var35
                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                    + var28
                                                                                                                                                                                                                                                                                                                              )
                                                                                                                                                                                                                                                                                                                              * 31
                                                                                                                                                                                                                                                                                                                           + var34
                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                  + var32
                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                         + var30
                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                + var33
                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var31
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var29
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
      val var2: Int = this.backgroundColor;
      val var3: Int = this.borderColor;
      val var1: Int = this.headerColor;
      val var7: java.lang.String = this.headerText;
      val var10: InviteType = this.type;
      val var30: java.lang.String = this.titleText;
      val var29: java.lang.String = this.subtitle;
      val var24: java.lang.String = this.helpCenterArticleLabel;
      val var19: java.lang.String = this.helpCenterArticleURL;
      val var33: Int = this.acceptLabelBackgroundColor;
      val var11: Int = this.acceptLabelBorderColor;
      val var12: Int = this.acceptLabelColor;
      val var28: java.lang.String = this.acceptLabelText;
      val var4: java.lang.String = this.bodyText;
      val var6: Int = this.bodyTextColor;
      val var37: java.lang.Boolean = this.canBeAccepted;
      val var38: java.lang.String = this.channelIcon;
      val var15: java.lang.String = this.channelName;
      val var20: java.lang.Boolean = this.embedCanBeTapped;
      val var16: java.lang.String = this.memberText;
      val var13: java.lang.String = this.onlineText;
      val var27: Int = this.resolvingGradientEnd;
      val var25: Int = this.resolvingGradientStart;
      val var22: java.lang.Boolean = this.splashHasRadialGradient;
      val var23: Int = this.splashOpacity;
      val var18: java.lang.String = this.splashUrl;
      val var8: java.lang.String = this.inviteSplash;
      val var34: Int = this.subtitleColor;
      val var14: Int = this.thumbnailBackgroundColor;
      val var5: Int = this.thumbnailCornerRadius;
      val var32: java.lang.String = this.thumbnailText;
      val var17: java.lang.String = this.thumbnailUrl;
      val var9: Int = this.titleColor;
      val var31: CodedLinkExtendedType = this.extendedType;
      val var21: java.lang.String = this.guildName;
      val var36: java.lang.String = this.guildIcon;
      val var35: java.lang.String = this.headerIcon;
      val var26: StringBuilder = new StringBuilder();
      var26.append("GuildInviteDisabledEmbedImpl(backgroundColor=");
      var26.append(var2);
      var26.append(", borderColor=");
      var26.append(var3);
      var26.append(", headerColor=");
      var26.append(var1);
      var26.append(", headerText=");
      var26.append(var7);
      var26.append(", type=");
      var26.append(var10);
      var26.append(", titleText=");
      var26.append(var30);
      var26.append(", subtitle=");
      var26.append(var29);
      var26.append(", helpCenterArticleLabel=");
      var26.append(var24);
      var26.append(", helpCenterArticleURL=");
      var26.append(var19);
      var26.append(", acceptLabelBackgroundColor=");
      var26.append(var33);
      var26.append(", acceptLabelBorderColor=");
      var26.append(var11);
      var26.append(", acceptLabelColor=");
      var26.append(var12);
      var26.append(", acceptLabelText=");
      var26.append(var28);
      var26.append(", bodyText=");
      var26.append(var4);
      var26.append(", bodyTextColor=");
      var26.append(var6);
      var26.append(", canBeAccepted=");
      var26.append(var37);
      var26.append(", channelIcon=");
      var26.append(var38);
      var26.append(", channelName=");
      var26.append(var15);
      var26.append(", embedCanBeTapped=");
      var26.append(var20);
      var26.append(", memberText=");
      var26.append(var16);
      var26.append(", onlineText=");
      var26.append(var13);
      var26.append(", resolvingGradientEnd=");
      var26.append(var27);
      var26.append(", resolvingGradientStart=");
      var26.append(var25);
      var26.append(", splashHasRadialGradient=");
      var26.append(var22);
      var26.append(", splashOpacity=");
      var26.append(var23);
      var26.append(", splashUrl=");
      var26.append(var18);
      var26.append(", inviteSplash=");
      var26.append(var8);
      var26.append(", subtitleColor=");
      var26.append(var34);
      var26.append(", thumbnailBackgroundColor=");
      var26.append(var14);
      var26.append(", thumbnailCornerRadius=");
      var26.append(var5);
      var26.append(", thumbnailText=");
      var26.append(var32);
      var26.append(", thumbnailUrl=");
      var26.append(var17);
      var26.append(", titleColor=");
      var26.append(var9);
      var26.append(", extendedType=");
      var26.append(var31);
      var26.append(", guildName=");
      var26.append(var21);
      var26.append(", guildIcon=");
      var26.append(var36);
      var26.append(", headerIcon=");
      var26.append(var35);
      var26.append(")");
      return var26.toString();
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
         val var8: n0 = n0.a;
         val var3: b2 = b2.a;
         val var10: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var4: KSerializer = a.u(n0.a);
         val var5: KSerializer = a.u(var8);
         val var9: KSerializer = a.u(var8);
         val var6: KSerializer = a.u(var3);
         val var7: KSerializer = a.u(var3);
         val var1: KSerializer = a.u(var8);
         val var2: h = h.a;
         return new KSerializer[]{
            var8,
            var8,
            var8,
            var3,
            var10,
            var3,
            var3,
            var3,
            var3,
            var4,
            var5,
            var9,
            var6,
            var7,
            var1,
            a.u(h.a),
            a.u(var3),
            a.u(var3),
            a.u(var2),
            a.u(var3),
            a.u(var3),
            a.u(var8),
            a.u(var8),
            a.u(var2),
            a.u(var8),
            a.u(var3),
            a.u(var3),
            a.u(var8),
            a.u(var8),
            a.u(var8),
            a.u(var3),
            a.u(var3),
            a.u(var8),
            CodedLinkExtendedType.Serializer.INSTANCE,
            var3,
            a.u(var3),
            a.u(var3)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteDisabledEmbedImpl {
         q.h(var1, "decoder");
         val var48: SerialDescriptor = this.getDescriptor();
         val var49: c = var1.c(var48);
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var15: Any;
         var var18: java.lang.String;
         var var20: Any;
         var var21: Any;
         var var22: java.lang.String;
         var var23: java.lang.String;
         var var24: java.lang.String;
         var var25: java.lang.String;
         var var27: Any;
         var var28: Any;
         var var30: java.lang.String;
         var var31: Any;
         var var32: java.lang.String;
         var var33: java.lang.String;
         var var34: Any;
         val var35: CodedLinkExtendedType;
         var var36: Any;
         var var37: Any;
         var var38: Any;
         var var39: java.lang.String;
         var var40: Any;
         var var41: java.lang.String;
         var var42: Any;
         val var43: java.lang.String;
         val var44: java.lang.String;
         var var45: Any;
         val var46: java.lang.String;
         var var70: java.lang.String;
         var var75: Any;
         var var94: java.lang.String;
         var var100: java.lang.String;
         var var103: Any;
         var var107: java.lang.String;
         var var110: java.lang.String;
         if (var49.y()) {
            var6 = var49.k(var48, 0);
            var3 = var49.k(var48, 1);
            val var2: Int = var49.k(var48, 2);
            var30 = var49.t(var48, 3);
            var31 = var49.m(var48, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var25 = var49.t(var48, 5);
            var24 = var49.t(var48, 6);
            var23 = var49.t(var48, 7);
            var22 = var49.t(var48, 8);
            val var9: n0 = n0.a;
            val var16: Int = var49.v(var48, 9, n0.a, null) as Int;
            var15 = var49.v(var48, 10, var9, null) as Int;
            var75 = var49.v(var48, 11, var9, null) as Int;
            val var50: b2 = b2.a;
            var46 = var49.v(var48, 12, b2.a, null) as java.lang.String;
            var43 = var49.v(var48, 13, var50, null) as java.lang.String;
            var103 = var49.v(var48, 14, var9, null) as Int;
            val var10: h = h.a;
            var45 = var49.v(var48, 15, h.a, null) as java.lang.Boolean;
            var100 = var49.v(var48, 16, var50, null) as java.lang.String;
            val var14: java.lang.String = var49.v(var48, 17, var50, null) as java.lang.String;
            val var12: java.lang.Boolean = var49.v(var48, 18, var10, null) as java.lang.Boolean;
            var44 = var49.v(var48, 19, var50, null) as java.lang.String;
            var39 = var49.v(var48, 20, var50, null) as java.lang.String;
            var37 = var49.v(var48, 21, var9, null) as Int;
            var27 = var49.v(var48, 22, var9, null) as Int;
            var20 = var49.v(var48, 23, var10, null) as java.lang.Boolean;
            val var66: Int = var49.v(var48, 24, var9, null) as Int;
            var41 = var49.v(var48, 25, var50, null) as java.lang.String;
            var32 = var49.v(var48, 26, var50, null) as java.lang.String;
            var36 = var49.v(var48, 27, var9, null) as Int;
            var34 = var49.v(var48, 28, var9, null) as Int;
            var21 = var49.v(var48, 29, var9, null) as Int;
            var110 = var49.v(var48, 30, var50, null) as java.lang.String;
            var18 = var49.v(var48, 31, var50, null) as java.lang.String;
            val var11: Int = var49.v(var48, 32, var9, null) as Int;
            var35 = var49.m(var48, 33, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var62: java.lang.String = var49.t(var48, 34);
            var107 = var49.v(var48, 35, var50, null) as java.lang.String;
            val var51: java.lang.String = var49.v(var48, 36, var50, null) as java.lang.String;
            var4 = -1;
            var5 = 31;
            var7 = var2;
            var42 = var16;
            var28 = var75;
            var75 = var103;
            var94 = var100;
            var33 = var14;
            var40 = var12;
            var103 = var66;
            var100 = var110;
            var38 = var11;
            var110 = var62;
            var70 = var107;
            var107 = var51;
         } else {
            var var59: Boolean = true;
            var6 = 0;
            var4 = 0;
            var5 = 0;
            var3 = 0;
            var var101: CodedLinkExtendedType = null;
            var20 = null;
            var103 = null;
            var41 = null;
            var39 = null;
            var37 = null;
            var36 = null;
            var var113: java.lang.String = null;
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
            var var63: Any = null;
            var var67: Any = null;
            var70 = null;
            var var74: java.lang.String = null;
            var75 = null;
            var var80: Any = null;
            var15 = null;
            var94 = null;
            var40 = null;
            var21 = null;
            var110 = null;
            var107 = null;
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
                                    var5 = var49.k(var48, 0);
                                    var54 |= 1;
                                    break label191;
                                 case 1:
                                    var4 = var49.k(var48, 1);
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
                                    var70 = (java.lang.String)var75;
                                    var15 = var67;
                                    var80 = var49.v(var48, 10, n0.a, var63) as Int;
                                    var54 |= 1024;
                                    var52 = var94;
                                    var63 = var15;
                                    var67 = var80;
                                    var75 = var52;
                                    var94 = var70;
                                    break label189;
                                 case 11:
                                    var94 = var70;
                                    var15 = var49.v(var48, 11, n0.a, var67) as Int;
                                    var54 |= 2048;
                                    var52 = var94;
                                    var63 = var15;
                                    var67 = var80;
                                    var70 = (java.lang.String)var75;
                                    var75 = var52;
                                    var80 = var63;
                                    break label189;
                                 case 12:
                                    var94 = var49.v(var48, 12, b2.a, var70) as java.lang.String;
                                    var54 |= 4096;
                                    var52 = var94;
                                    var63 = var15;
                                    var67 = var80;
                                    var70 = (java.lang.String)var75;
                                    var75 = var52;
                                    var80 = var63;
                                    var15 = var67;
                                    break label189;
                                 case 13:
                                    var74 = var49.v(var48, 13, b2.a, var74) as java.lang.String;
                                    var54 |= 8192;
                                    var75 = var52;
                                    var15 = var67;
                                    var94 = var70;
                                    var52 = var94;
                                    var63 = var15;
                                    var67 = var80;
                                    var70 = (java.lang.String)var75;
                                    var80 = var63;
                                    break label189;
                                 case 14:
                                    var45 = var49.v(var48, 14, n0.a, var75) as Int;
                                    var54 |= 16384;
                                    var75 = var52;
                                    var80 = var63;
                                    var15 = var67;
                                    var94 = var70;
                                    var52 = var94;
                                    var63 = var15;
                                    var67 = var80;
                                    var70 = (java.lang.String)var45;
                                    break label189;
                                 case 15:
                                    var45 = var49.v(var48, 15, h.a, var80) as java.lang.Boolean;
                                    var54 |= 32768;
                                    var80 = var63;
                                    var94 = var70;
                                    var70 = (java.lang.String)var75;
                                    var52 = var94;
                                    var63 = var15;
                                    var67 = var45;
                                    var75 = var52;
                                    var15 = var67;
                                    break label189;
                                 case 16:
                                    var45 = var49.v(var48, 16, b2.a, var15) as java.lang.String;
                                    var54 |= 65536;
                                    var94 = var70;
                                    var70 = (java.lang.String)var75;
                                    var67 = var80;
                                    var52 = var94;
                                    var63 = var45;
                                    var75 = var52;
                                    var80 = var63;
                                    var15 = var67;
                                    break label189;
                                 case 17:
                                    var42 = var49.v(var48, 17, b2.a, var94) as java.lang.String;
                                    var54 |= 131072;
                                    var94 = var70;
                                    var70 = (java.lang.String)var75;
                                    var67 = var80;
                                    var63 = var15;
                                    var15 = var67;
                                    var80 = var63;
                                    var75 = var52;
                                    var52 = var42;
                                    break label189;
                                 case 18:
                                    var45 = var49.v(var48, 18, h.a, var40) as java.lang.Boolean;
                                    var54 |= 262144;
                                    var70 = (java.lang.String)var75;
                                    var67 = var80;
                                    var63 = var15;
                                    var52 = var94;
                                    var75 = var52;
                                    var80 = var63;
                                    var15 = var67;
                                    var94 = var70;
                                    var40 = var45;
                                    break label189;
                                 case 19:
                                    var21 = var49.v(var48, 19, b2.a, var21) as java.lang.String;
                                    var54 |= 524288;
                                    break label162;
                                 case 20:
                                    var110 = var49.v(var48, 20, b2.a, var110) as java.lang.String;
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
                                    var103 = var49.v(var48, 29, n0.a, var103) as Int;
                                    var8 = 536870912;
                                    break;
                                 case 30:
                                    var113 = var49.v(var48, 30, b2.a, var113) as java.lang.String;
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
                                    var101 = var49.m(var48, 33, CodedLinkExtendedType.Serializer.INSTANCE, var101) as CodedLinkExtendedType;
                                    var3 |= 2;
                                    break label162;
                                 case 34:
                                    var107 = var49.t(var48, 34);
                                    var3 |= 4;
                                    break label162;
                                 case 35:
                                    var38 = var49.v(var48, 35, b2.a, var38) as java.lang.String;
                                    var3 |= 8;
                                    break label162;
                                 case 36:
                                    var39 = var49.v(var48, 36, b2.a, var39) as java.lang.String;
                                    var3 |= 16;
                                    break label162;
                                 default:
                                    throw new n(var8);
                              }

                              var54 |= var8;
                              break label162;
                           }

                           var70 = (java.lang.String)var75;
                           var67 = var80;
                           var63 = var15;
                           var75 = var52;
                           var52 = var94;
                           var80 = var63;
                           var15 = var67;
                           var94 = var70;
                           break label189;
                        }

                        var70 = (java.lang.String)var75;
                        var67 = var80;
                        var63 = var15;
                        var52 = var94;
                        var75 = var52;
                        var80 = var63;
                        var15 = var67;
                        var94 = var70;
                        break label189;
                     }

                     var70 = (java.lang.String)var75;
                     var67 = var80;
                     var63 = var15;
                     var52 = var94;
                     var75 = var52;
                     var80 = var63;
                     var15 = var67;
                     var94 = var70;
                     break label189;
                  }

                  var70 = (java.lang.String)var75;
                  var67 = var80;
                  var63 = var15;
                  var52 = var94;
                  var75 = var52;
                  var80 = var63;
                  var15 = var67;
                  var94 = var70;
               }

               var52 = var75;
               var63 = var80;
               var67 = var15;
               var70 = var94;
               var75 = var70;
               var80 = var67;
               var15 = var63;
               var94 = (java.lang.String)var52;
            }

            var38 = var37;
            var46 = var70;
            var44 = (java.lang.String)var21;
            var110 = var107;
            var107 = var39;
            var70 = (java.lang.String)var38;
            var35 = var101;
            var18 = (java.lang.String)var36;
            var100 = var113;
            var21 = var103;
            var36 = var33;
            var41 = (java.lang.String)var20;
            var103 = var18;
            var20 = var41;
            var37 = var28;
            var39 = var110;
            var33 = var94;
            var94 = (java.lang.String)var15;
            var45 = var80;
            var43 = var74;
            var28 = var67;
            var15 = var63;
            var42 = var52;
            var7 = var6;
            var3 = var4;
            var6 = var5;
            var5 = var3;
            var4 = var54;
         }

         var49.b(var48);
         return new GuildInviteDisabledEmbedImpl(
            var4,
            var5,
            var6,
            var3,
            var7,
            var30,
            (InviteType)var31,
            var25,
            var24,
            var23,
            var22,
            (Integer)var42,
            (Integer)var15,
            (Integer)var28,
            var46,
            var43,
            (Integer)var75,
            (java.lang.Boolean)var45,
            var94,
            var33,
            (java.lang.Boolean)var40,
            var44,
            var39,
            (Integer)var37,
            (Integer)var27,
            (java.lang.Boolean)var20,
            (Integer)var103,
            var41,
            var32,
            (Integer)var36,
            (Integer)var34,
            (Integer)var21,
            var100,
            var18,
            (Integer)var38,
            var35,
            var110,
            var70,
            var107,
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
