package com.discord.chat.bridge.codedlinks

import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.h
import il.n0
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
      val var29: Int = Integer.hashCode(this.borderColor);
      val var28: Int = Integer.hashCode(this.headerColor);
      val var34: Int = this.headerText.hashCode();
      val var33: Int = this.type.hashCode();
      val var27: Int = this.titleText.hashCode();
      val var30: Int = this.subtitle.hashCode();
      val var32: Int = this.helpCenterArticleLabel.hashCode();
      val var35: Int = this.helpCenterArticleURL.hashCode();
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
                                                                                                                                                                                                                                                                                                                                    + var29
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
                                                                                                                                                                                                                                                                                                + var27
                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var30
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var32
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
      val var21: java.lang.String = this.headerText;
      val var4: InviteType = this.type;
      val var32: java.lang.String = this.titleText;
      val var15: java.lang.String = this.subtitle;
      val var23: java.lang.String = this.helpCenterArticleLabel;
      val var19: java.lang.String = this.helpCenterArticleURL;
      val var10: Int = this.acceptLabelBackgroundColor;
      val var27: Int = this.acceptLabelBorderColor;
      val var8: Int = this.acceptLabelColor;
      val var33: java.lang.String = this.acceptLabelText;
      val var24: java.lang.String = this.bodyText;
      val var28: Int = this.bodyTextColor;
      val var30: java.lang.Boolean = this.canBeAccepted;
      val var11: java.lang.String = this.channelIcon;
      val var38: java.lang.String = this.channelName;
      val var34: java.lang.Boolean = this.embedCanBeTapped;
      val var18: java.lang.String = this.memberText;
      val var22: java.lang.String = this.onlineText;
      val var6: Int = this.resolvingGradientEnd;
      val var37: Int = this.resolvingGradientStart;
      val var12: java.lang.Boolean = this.splashHasRadialGradient;
      val var20: Int = this.splashOpacity;
      val var25: java.lang.String = this.splashUrl;
      val var29: java.lang.String = this.inviteSplash;
      val var5: Int = this.subtitleColor;
      val var31: Int = this.thumbnailBackgroundColor;
      val var7: Int = this.thumbnailCornerRadius;
      val var13: java.lang.String = this.thumbnailText;
      val var35: java.lang.String = this.thumbnailUrl;
      val var16: Int = this.titleColor;
      val var14: CodedLinkExtendedType = this.extendedType;
      val var17: java.lang.String = this.guildName;
      val var26: java.lang.String = this.guildIcon;
      val var9: java.lang.String = this.headerIcon;
      val var36: StringBuilder = new StringBuilder();
      var36.append("GuildInviteDisabledEmbedImpl(backgroundColor=");
      var36.append(var1);
      var36.append(", borderColor=");
      var36.append(var2);
      var36.append(", headerColor=");
      var36.append(var3);
      var36.append(", headerText=");
      var36.append(var21);
      var36.append(", type=");
      var36.append(var4);
      var36.append(", titleText=");
      var36.append(var32);
      var36.append(", subtitle=");
      var36.append(var15);
      var36.append(", helpCenterArticleLabel=");
      var36.append(var23);
      var36.append(", helpCenterArticleURL=");
      var36.append(var19);
      var36.append(", acceptLabelBackgroundColor=");
      var36.append(var10);
      var36.append(", acceptLabelBorderColor=");
      var36.append(var27);
      var36.append(", acceptLabelColor=");
      var36.append(var8);
      var36.append(", acceptLabelText=");
      var36.append(var33);
      var36.append(", bodyText=");
      var36.append(var24);
      var36.append(", bodyTextColor=");
      var36.append(var28);
      var36.append(", canBeAccepted=");
      var36.append(var30);
      var36.append(", channelIcon=");
      var36.append(var11);
      var36.append(", channelName=");
      var36.append(var38);
      var36.append(", embedCanBeTapped=");
      var36.append(var34);
      var36.append(", memberText=");
      var36.append(var18);
      var36.append(", onlineText=");
      var36.append(var22);
      var36.append(", resolvingGradientEnd=");
      var36.append(var6);
      var36.append(", resolvingGradientStart=");
      var36.append(var37);
      var36.append(", splashHasRadialGradient=");
      var36.append(var12);
      var36.append(", splashOpacity=");
      var36.append(var20);
      var36.append(", splashUrl=");
      var36.append(var25);
      var36.append(", inviteSplash=");
      var36.append(var29);
      var36.append(", subtitleColor=");
      var36.append(var5);
      var36.append(", thumbnailBackgroundColor=");
      var36.append(var31);
      var36.append(", thumbnailCornerRadius=");
      var36.append(var7);
      var36.append(", thumbnailText=");
      var36.append(var13);
      var36.append(", thumbnailUrl=");
      var36.append(var35);
      var36.append(", titleColor=");
      var36.append(var16);
      var36.append(", extendedType=");
      var36.append(var14);
      var36.append(", guildName=");
      var36.append(var17);
      var36.append(", guildIcon=");
      var36.append(var26);
      var36.append(", headerIcon=");
      var36.append(var9);
      var36.append(")");
      return var36.toString();
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
         val var3: n0 = n0.a;
         val var7: b2 = b2.a;
         val var8: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var5: KSerializer = a.u(n0.a);
         val var9: KSerializer = a.u(var3);
         val var1: KSerializer = a.u(var3);
         val var6: KSerializer = a.u(var7);
         val var10: KSerializer = a.u(var7);
         val var4: KSerializer = a.u(var3);
         val var2: h = h.a;
         return new KSerializer[]{
            var3,
            var3,
            var3,
            var7,
            var8,
            var7,
            var7,
            var7,
            var7,
            var5,
            var9,
            var1,
            var6,
            var10,
            var4,
            a.u(h.a),
            a.u(var7),
            a.u(var7),
            a.u(var2),
            a.u(var7),
            a.u(var7),
            a.u(var3),
            a.u(var3),
            a.u(var2),
            a.u(var3),
            a.u(var7),
            a.u(var7),
            a.u(var3),
            a.u(var3),
            a.u(var3),
            a.u(var7),
            a.u(var7),
            a.u(var3),
            CodedLinkExtendedType.Serializer.INSTANCE,
            var7,
            a.u(var7),
            a.u(var7)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteDisabledEmbedImpl {
         q.h(var1, "decoder");
         val var50: SerialDescriptor = this.getDescriptor();
         val var51: c = var1.c(var50);
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var17: Any;
         var var19: java.lang.String;
         var var20: Any;
         var var21: Any;
         var var23: java.lang.String;
         var var24: java.lang.String;
         var var25: java.lang.String;
         var var26: java.lang.String;
         var var28: Any;
         var var29: java.lang.String;
         var var31: java.lang.String;
         var var32: Any;
         var var33: java.lang.String;
         var var34: Any;
         var var35: java.lang.String;
         var var36: Any;
         var var37: java.lang.String;
         var var38: Any;
         var var39: java.lang.String;
         var var40: Any;
         var var41: Any;
         var var42: CodedLinkExtendedType;
         var var43: java.lang.String;
         val var44: Any;
         val var45: Any;
         var var46: java.lang.String;
         val var47: Any;
         var var73: java.lang.String;
         var var78: java.lang.String;
         var var84: java.lang.String;
         var var105: java.lang.String;
         var var110: Any;
         var var112: java.lang.String;
         var var114: Any;
         if (var51.y()) {
            var3 = var51.k(var50, 0);
            var5 = var51.k(var50, 1);
            val var2: Int = var51.k(var50, 2);
            var31 = var51.t(var50, 3);
            var32 = var51.m(var50, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var26 = var51.t(var50, 5);
            var25 = var51.t(var50, 6);
            var24 = var51.t(var50, 7);
            var23 = var51.t(var50, 8);
            val var10: n0 = n0.a;
            var17 = var51.v(var50, 9, n0.a, null) as Int;
            val var15: Int = var51.v(var50, 10, var10, null) as Int;
            val var14: Int = var51.v(var50, 11, var10, null) as Int;
            val var52: b2 = b2.a;
            var114 = var51.v(var50, 12, b2.a, null) as java.lang.String;
            var112 = var51.v(var50, 13, var52, null) as java.lang.String;
            var40 = var51.v(var50, 14, var10, null) as Int;
            val var11: h = h.a;
            var45 = var51.v(var50, 15, h.a, null) as java.lang.Boolean;
            var105 = var51.v(var50, 16, var52, null) as java.lang.String;
            val var16: java.lang.String = var51.v(var50, 17, var52, null) as java.lang.String;
            val var13: java.lang.Boolean = var51.v(var50, 18, var11, null) as java.lang.Boolean;
            var19 = var51.v(var50, 19, var52, null) as java.lang.String;
            var33 = var51.v(var50, 20, var52, null) as java.lang.String;
            var38 = var51.v(var50, 21, var10, null) as Int;
            var28 = var51.v(var50, 22, var10, null) as Int;
            var21 = var51.v(var50, 23, var11, null) as java.lang.Boolean;
            val var69: Int = var51.v(var50, 24, var10, null) as Int;
            var46 = var51.v(var50, 25, var52, null) as java.lang.String;
            var29 = var51.v(var50, 26, var52, null) as java.lang.String;
            var34 = var51.v(var50, 27, var10, null) as Int;
            var20 = var51.v(var50, 28, var10, null) as Int;
            var36 = var51.v(var50, 29, var10, null) as Int;
            var43 = var51.v(var50, 30, var52, null) as java.lang.String;
            var110 = var51.v(var50, 31, var52, null) as java.lang.String;
            val var12: Int = var51.v(var50, 32, var10, null) as Int;
            var42 = var51.m(var50, 33, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var65: java.lang.String = var51.t(var50, 34);
            var37 = var51.v(var50, 35, var52, null) as java.lang.String;
            val var53: java.lang.String = var51.v(var50, 36, var52, null) as java.lang.String;
            var4 = -1;
            var6 = 31;
            var7 = var2;
            var47 = var15;
            var44 = var14;
            var84 = (java.lang.String)var114;
            var78 = var112;
            var39 = var105;
            var35 = var16;
            var41 = var13;
            var114 = var69;
            var105 = (java.lang.String)var110;
            var110 = var12;
            var112 = var65;
            var73 = var53;
         } else {
            var var62: Boolean = true;
            var6 = 0;
            var4 = 0;
            var5 = 0;
            var3 = 0;
            var var106: CodedLinkExtendedType = null;
            var21 = null;
            var20 = null;
            var42 = null;
            var40 = null;
            var38 = null;
            var37 = null;
            var36 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var19 = null;
            var31 = null;
            var26 = null;
            var25 = null;
            var24 = null;
            var23 = null;
            var32 = null;
            var var54: Any = null;
            var var66: Any = null;
            var var70: Any = null;
            var73 = null;
            var var77: java.lang.String = null;
            var78 = null;
            var84 = null;
            var var90: java.lang.String = null;
            var17 = null;
            var41 = null;
            var110 = null;
            var114 = null;
            var112 = null;
            var29 = null;
            var28 = null;
            var39 = null;
            var var56: Int = 0;

            while (var62) {
               label189: {
                  label162: {
                     label190: {
                        label191: {
                           label119: {
                              var var8: Int = var51.x(var50);
                              switch (var8) {
                                 case -1:
                                    var62 = false;
                                    break label191;
                                 case 0:
                                    var5 = var51.k(var50, 0);
                                    var56 |= 1;
                                    break label191;
                                 case 1:
                                    var4 = var51.k(var50, 1);
                                    var56 |= 2;
                                    break label190;
                                 case 2:
                                    var6 = var51.k(var50, 2);
                                    var56 |= 4;
                                    break label190;
                                 case 3:
                                    var31 = var51.t(var50, 3);
                                    var56 |= 8;
                                    break label190;
                                 case 4:
                                    var32 = var51.m(var50, 4, InviteType.Serializer.INSTANCE, var32) as InviteType;
                                    var56 |= 16;
                                    break label190;
                                 case 5:
                                    var26 = var51.t(var50, 5);
                                    var56 |= 32;
                                    break label119;
                                 case 6:
                                    var25 = var51.t(var50, 6);
                                    var56 |= 64;
                                    break label119;
                                 case 7:
                                    var24 = var51.t(var50, 7);
                                    var56 |= 128;
                                    break label119;
                                 case 8:
                                    var23 = var51.t(var50, 8);
                                    var56 |= 256;
                                    break label119;
                                 case 9:
                                    var54 = var51.v(var50, 9, n0.a, var54) as Int;
                                    var56 |= 512;
                                    break label119;
                                 case 10:
                                    var73 = var78;
                                    var90 = (java.lang.String)var70;
                                    var84 = var51.v(var50, 10, n0.a, var66) as Int;
                                    var56 |= 1024;
                                    var54 = var17;
                                    var66 = var90;
                                    var70 = var84;
                                    var78 = (java.lang.String)var54;
                                    var17 = var73;
                                    break label189;
                                 case 11:
                                    var17 = var73;
                                    var90 = var51.v(var50, 11, n0.a, var70) as Int;
                                    var56 |= 2048;
                                    var54 = var17;
                                    var66 = var90;
                                    var70 = var84;
                                    var73 = var78;
                                    var78 = (java.lang.String)var54;
                                    var84 = (java.lang.String)var66;
                                    break label189;
                                 case 12:
                                    var17 = var51.v(var50, 12, b2.a, var73) as java.lang.String;
                                    var56 |= 4096;
                                    var54 = var17;
                                    var66 = var90;
                                    var70 = var84;
                                    var73 = var78;
                                    var78 = (java.lang.String)var54;
                                    var84 = (java.lang.String)var66;
                                    var90 = (java.lang.String)var70;
                                    break label189;
                                 case 13:
                                    var77 = var51.v(var50, 13, b2.a, var77) as java.lang.String;
                                    var56 |= 8192;
                                    var78 = (java.lang.String)var54;
                                    var90 = (java.lang.String)var70;
                                    var17 = var73;
                                    var54 = var17;
                                    var66 = var90;
                                    var70 = var84;
                                    var73 = var78;
                                    var84 = (java.lang.String)var66;
                                    break label189;
                                 case 14:
                                    val var206: Int = var51.v(var50, 14, n0.a, var78) as Int;
                                    var56 |= 16384;
                                    var78 = (java.lang.String)var54;
                                    var84 = (java.lang.String)var66;
                                    var90 = (java.lang.String)var70;
                                    var17 = var73;
                                    var54 = var17;
                                    var66 = var90;
                                    var70 = var84;
                                    var73 = var206;
                                    break label189;
                                 case 15:
                                    val var205: java.lang.Boolean = var51.v(var50, 15, h.a, var84) as java.lang.Boolean;
                                    var56 |= 32768;
                                    var17 = var73;
                                    var73 = var78;
                                    var54 = var17;
                                    var66 = var90;
                                    var70 = var205;
                                    var78 = (java.lang.String)var54;
                                    var84 = (java.lang.String)var66;
                                    var90 = (java.lang.String)var70;
                                    break label189;
                                 case 16:
                                    var46 = var51.v(var50, 16, b2.a, var90) as java.lang.String;
                                    var56 |= 65536;
                                    var90 = (java.lang.String)var70;
                                    var73 = var78;
                                    var70 = var84;
                                    var54 = var17;
                                    var66 = var46;
                                    var78 = (java.lang.String)var54;
                                    var84 = (java.lang.String)var66;
                                    var17 = var73;
                                    break label189;
                                 case 17:
                                    var43 = var51.v(var50, 17, b2.a, var17) as java.lang.String;
                                    var56 |= 131072;
                                    var17 = var73;
                                    var73 = var78;
                                    var70 = var84;
                                    var66 = var90;
                                    var90 = (java.lang.String)var70;
                                    var84 = (java.lang.String)var66;
                                    var78 = (java.lang.String)var54;
                                    var54 = var43;
                                    break label189;
                                 case 18:
                                    val var203: java.lang.Boolean = var51.v(var50, 18, h.a, var41) as java.lang.Boolean;
                                    var56 |= 262144;
                                    var73 = var78;
                                    var70 = var84;
                                    var66 = var90;
                                    var54 = var17;
                                    var78 = (java.lang.String)var54;
                                    var84 = (java.lang.String)var66;
                                    var90 = (java.lang.String)var70;
                                    var17 = var73;
                                    var41 = var203;
                                    break label189;
                                 case 19:
                                    var110 = var51.v(var50, 19, b2.a, var110) as java.lang.String;
                                    var56 |= 524288;
                                    break label162;
                                 case 20:
                                    var114 = var51.v(var50, 20, b2.a, var114) as java.lang.String;
                                    var56 |= 1048576;
                                    break label162;
                                 case 21:
                                    var29 = var51.v(var50, 21, n0.a, var29) as Int;
                                    var56 |= 2097152;
                                    break label162;
                                 case 22:
                                    var28 = var51.v(var50, 22, n0.a, var28) as Int;
                                    var56 |= 4194304;
                                    break label162;
                                 case 23:
                                    var42 = var51.v(var50, 23, h.a, var42) as java.lang.Boolean;
                                    var56 |= 8388608;
                                    break label162;
                                 case 24:
                                    var19 = var51.v(var50, 24, n0.a, var19) as Int;
                                    var56 |= 16777216;
                                    break label162;
                                 case 25:
                                    var21 = var51.v(var50, 25, b2.a, var21) as java.lang.String;
                                    var8 = 33554432;
                                    break;
                                 case 26:
                                    var33 = var51.v(var50, 26, b2.a, var33) as java.lang.String;
                                    var56 |= 67108864;
                                    break label162;
                                 case 27:
                                    var34 = var51.v(var50, 27, n0.a, var34) as Int;
                                    var56 |= 134217728;
                                    break label162;
                                 case 28:
                                    var35 = var51.v(var50, 28, n0.a, var35) as Int;
                                    var56 |= 268435456;
                                    break label162;
                                 case 29:
                                    var20 = var51.v(var50, 29, n0.a, var20) as Int;
                                    var8 = 536870912;
                                    break;
                                 case 30:
                                    var36 = var51.v(var50, 30, b2.a, var36) as java.lang.String;
                                    var56 |= 1073741824;
                                    break label162;
                                 case 31:
                                    var37 = var51.v(var50, 31, b2.a, var37) as java.lang.String;
                                    var56 |= Integer.MIN_VALUE;
                                    break label162;
                                 case 32:
                                    var38 = var51.v(var50, 32, n0.a, var38) as Int;
                                    var3 |= 1;
                                    break label162;
                                 case 33:
                                    var106 = var51.m(var50, 33, CodedLinkExtendedType.Serializer.INSTANCE, var106) as CodedLinkExtendedType;
                                    var3 |= 2;
                                    break label162;
                                 case 34:
                                    var112 = var51.t(var50, 34);
                                    var3 |= 4;
                                    break label162;
                                 case 35:
                                    var39 = var51.v(var50, 35, b2.a, var39) as java.lang.String;
                                    var3 |= 8;
                                    break label162;
                                 case 36:
                                    var40 = var51.v(var50, 36, b2.a, var40) as java.lang.String;
                                    var3 |= 16;
                                    break label162;
                                 default:
                                    throw new n(var8);
                              }

                              var56 |= var8;
                              break label162;
                           }

                           var73 = var78;
                           var70 = var84;
                           var66 = var90;
                           var78 = (java.lang.String)var54;
                           var54 = var17;
                           var84 = (java.lang.String)var66;
                           var90 = (java.lang.String)var70;
                           var17 = var73;
                           break label189;
                        }

                        var73 = var78;
                        var70 = var84;
                        var66 = var90;
                        var54 = var17;
                        var78 = (java.lang.String)var54;
                        var84 = (java.lang.String)var66;
                        var90 = (java.lang.String)var70;
                        var17 = var73;
                        break label189;
                     }

                     var73 = var78;
                     var70 = var84;
                     var66 = var90;
                     var54 = var17;
                     var78 = (java.lang.String)var54;
                     var84 = (java.lang.String)var66;
                     var90 = (java.lang.String)var70;
                     var17 = var73;
                     break label189;
                  }

                  var73 = var78;
                  var70 = var84;
                  var66 = var90;
                  var54 = var17;
                  var78 = (java.lang.String)var54;
                  var84 = (java.lang.String)var66;
                  var90 = (java.lang.String)var70;
                  var17 = var73;
               }

               var54 = var78;
               var66 = var84;
               var70 = var90;
               var73 = (java.lang.String)var17;
               var78 = var73;
               var84 = (java.lang.String)var70;
               var90 = (java.lang.String)var66;
               var17 = var54;
            }

            var73 = (java.lang.String)var40;
            var37 = var39;
            var42 = var106;
            var110 = var38;
            var105 = var37;
            var43 = (java.lang.String)var36;
            var36 = var20;
            var20 = var35;
            var29 = var33;
            var46 = (java.lang.String)var21;
            var114 = var19;
            var21 = var42;
            var38 = var29;
            var33 = (java.lang.String)var114;
            var19 = (java.lang.String)var110;
            var35 = (java.lang.String)var17;
            var39 = var90;
            var45 = var84;
            var40 = var78;
            var78 = var77;
            var84 = var73;
            var44 = var70;
            var47 = var66;
            var17 = var54;
            var7 = var6;
            var5 = var4;
            var3 = var5;
            var6 = var3;
            var4 = var56;
         }

         var51.b(var50);
         return new GuildInviteDisabledEmbedImpl(
            var4,
            var6,
            var3,
            var5,
            var7,
            var31,
            (InviteType)var32,
            var26,
            var25,
            var24,
            var23,
            (Integer)var17,
            (Integer)var47,
            (Integer)var44,
            var84,
            var78,
            (Integer)var40,
            (java.lang.Boolean)var45,
            var39,
            var35,
            (java.lang.Boolean)var41,
            var19,
            var33,
            (Integer)var38,
            (Integer)var28,
            (java.lang.Boolean)var21,
            (Integer)var114,
            var46,
            var29,
            (Integer)var34,
            (Integer)var20,
            (Integer)var36,
            var43,
            var105,
            (Integer)var110,
            var42,
            var112,
            var37,
            var73,
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
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteDisabledEmbedImpl> {
         return GuildInviteDisabledEmbedImpl.$serializer.INSTANCE;
      }
   }
}
