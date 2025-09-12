package com.discord.chat.bridge.codedlinks

import kotlinx.serialization.KSerializer
import nb.g

@g
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
   ) : CodedLinkEmbed(),
   GuildDisabledInviteEmbed,
   GuildInviteExtendedEmbed {
   public open val backgroundColor: Int
   public open val borderColor: Int
   public open val headerColor: Int
   public open val headerText: String
   public open val type: InviteType
   public open val titleText: String
   public open val subtitle: String
   public open val helpCenterArticleLabel: String
   public open val helpCenterArticleURL: String
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelText: String?
   public open val bodyText: String?
   public open val bodyTextColor: Int?
   public open val canBeAccepted: Boolean?
   public open val channelIcon: String?
   public open val channelName: String?
   public open val embedCanBeTapped: Boolean?
   public open val memberText: String?
   public open val onlineText: String?
   public open val resolvingGradientEnd: Int?
   public open val resolvingGradientStart: Int?
   public open val splashHasRadialGradient: Boolean?
   public open val splashOpacity: Int?
   public open val splashUrl: String?
   public open val inviteSplash: String?
   public open val subtitleColor: Int?
   public open val thumbnailBackgroundColor: Int?
   public open val thumbnailCornerRadius: Int?
   public open val thumbnailText: String?
   public open val thumbnailUrl: String?
   public open val titleColor: Int?
   public open val extendedType: CodedLinkExtendedType
   public open val guildName: String
   public open val guildIcon: String?
   public open val headerIcon: String?
   public open val badgeIconUrl: String?

   init {
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
         } else if (!(this.headerText == var1.headerText)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (!(this.titleText == var1.titleText)) {
            return false;
         } else if (!(this.subtitle == var1.subtitle)) {
            return false;
         } else if (!(this.helpCenterArticleLabel == var1.helpCenterArticleLabel)) {
            return false;
         } else if (!(this.helpCenterArticleURL == var1.helpCenterArticleURL)) {
            return false;
         } else if (!(this.acceptLabelBackgroundColor == var1.acceptLabelBackgroundColor)) {
            return false;
         } else if (!(this.acceptLabelBorderColor == var1.acceptLabelBorderColor)) {
            return false;
         } else if (!(this.acceptLabelColor == var1.acceptLabelColor)) {
            return false;
         } else if (!(this.acceptLabelText == var1.acceptLabelText)) {
            return false;
         } else if (!(this.bodyText == var1.bodyText)) {
            return false;
         } else if (!(this.bodyTextColor == var1.bodyTextColor)) {
            return false;
         } else if (!(this.canBeAccepted == var1.canBeAccepted)) {
            return false;
         } else if (!(this.channelIcon == var1.channelIcon)) {
            return false;
         } else if (!(this.channelName == var1.channelName)) {
            return false;
         } else if (!(this.embedCanBeTapped == var1.embedCanBeTapped)) {
            return false;
         } else if (!(this.memberText == var1.memberText)) {
            return false;
         } else if (!(this.onlineText == var1.onlineText)) {
            return false;
         } else if (!(this.resolvingGradientEnd == var1.resolvingGradientEnd)) {
            return false;
         } else if (!(this.resolvingGradientStart == var1.resolvingGradientStart)) {
            return false;
         } else if (!(this.splashHasRadialGradient == var1.splashHasRadialGradient)) {
            return false;
         } else if (!(this.splashOpacity == var1.splashOpacity)) {
            return false;
         } else if (!(this.splashUrl == var1.splashUrl)) {
            return false;
         } else if (!(this.inviteSplash == var1.inviteSplash)) {
            return false;
         } else if (!(this.subtitleColor == var1.subtitleColor)) {
            return false;
         } else if (!(this.thumbnailBackgroundColor == var1.thumbnailBackgroundColor)) {
            return false;
         } else if (!(this.thumbnailCornerRadius == var1.thumbnailCornerRadius)) {
            return false;
         } else if (!(this.thumbnailText == var1.thumbnailText)) {
            return false;
         } else if (!(this.thumbnailUrl == var1.thumbnailUrl)) {
            return false;
         } else if (!(this.titleColor == var1.titleColor)) {
            return false;
         } else if (this.extendedType != var1.extendedType) {
            return false;
         } else if (!(this.guildName == var1.guildName)) {
            return false;
         } else if (!(this.guildIcon == var1.guildIcon)) {
            return false;
         } else if (!(this.headerIcon == var1.headerIcon)) {
            return false;
         } else {
            return this.badgeIconUrl == var1.badgeIconUrl;
         }
      }
   }

   public override fun hashCode(): Int {
      val var29: Int = Integer.hashCode(this.backgroundColor);
      val var35: Int = Integer.hashCode(this.borderColor);
      val var30: Int = Integer.hashCode(this.headerColor);
      val var33: Int = this.headerText.hashCode();
      val var28: Int = this.type.hashCode();
      val var31: Int = this.titleText.hashCode();
      val var36: Int = this.subtitle.hashCode();
      val var34: Int = this.helpCenterArticleLabel.hashCode();
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

      val var38: Int = this.extendedType.hashCode();
      val var37: Int = this.guildName.hashCode();
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
                                                                                                                                                                                                                                                                                                                                          var29
                                                                                                                                                                                                                                                                                                                                                * 31
                                                                                                                                                                                                                                                                                                                                             + var35
                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                    + var30
                                                                                                                                                                                                                                                                                                                              )
                                                                                                                                                                                                                                                                                                                              * 31
                                                                                                                                                                                                                                                                                                                           + var33
                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                  + var28
                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                         + var31
                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                + var36
                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var34
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
         + var27;
   }

   public override fun toString(): String {
      val var2: Int = this.backgroundColor;
      val var1: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var13: java.lang.String = this.headerText;
      val var24: InviteType = this.type;
      val var8: java.lang.String = this.titleText;
      val var33: java.lang.String = this.subtitle;
      val var23: java.lang.String = this.helpCenterArticleLabel;
      val var28: java.lang.String = this.helpCenterArticleURL;
      val var29: Int = this.acceptLabelBackgroundColor;
      val var7: Int = this.acceptLabelBorderColor;
      val var34: Int = this.acceptLabelColor;
      val var9: java.lang.String = this.acceptLabelText;
      val var31: java.lang.String = this.bodyText;
      val var6: Int = this.bodyTextColor;
      val var16: java.lang.Boolean = this.canBeAccepted;
      val var4: java.lang.String = this.channelIcon;
      val var27: java.lang.String = this.channelName;
      val var26: java.lang.Boolean = this.embedCanBeTapped;
      val var19: java.lang.String = this.memberText;
      val var5: java.lang.String = this.onlineText;
      val var35: Int = this.resolvingGradientEnd;
      val var37: Int = this.resolvingGradientStart;
      val var20: java.lang.Boolean = this.splashHasRadialGradient;
      val var38: Int = this.splashOpacity;
      val var18: java.lang.String = this.splashUrl;
      val var21: java.lang.String = this.inviteSplash;
      val var22: Int = this.subtitleColor;
      val var36: Int = this.thumbnailBackgroundColor;
      val var17: Int = this.thumbnailCornerRadius;
      val var25: java.lang.String = this.thumbnailText;
      val var10: java.lang.String = this.thumbnailUrl;
      val var12: Int = this.titleColor;
      val var32: CodedLinkExtendedType = this.extendedType;
      val var11: java.lang.String = this.guildName;
      val var30: java.lang.String = this.guildIcon;
      val var39: java.lang.String = this.headerIcon;
      val var14: java.lang.String = this.badgeIconUrl;
      val var15: StringBuilder = new StringBuilder();
      var15.append("GuildInviteDisabledEmbedImpl(backgroundColor=");
      var15.append(var2);
      var15.append(", borderColor=");
      var15.append(var1);
      var15.append(", headerColor=");
      var15.append(var3);
      var15.append(", headerText=");
      var15.append(var13);
      var15.append(", type=");
      var15.append(var24);
      var15.append(", titleText=");
      var15.append(var8);
      var15.append(", subtitle=");
      var15.append(var33);
      var15.append(", helpCenterArticleLabel=");
      var15.append(var23);
      var15.append(", helpCenterArticleURL=");
      var15.append(var28);
      var15.append(", acceptLabelBackgroundColor=");
      var15.append(var29);
      var15.append(", acceptLabelBorderColor=");
      var15.append(var7);
      var15.append(", acceptLabelColor=");
      var15.append(var34);
      var15.append(", acceptLabelText=");
      var15.append(var9);
      var15.append(", bodyText=");
      var15.append(var31);
      var15.append(", bodyTextColor=");
      var15.append(var6);
      var15.append(", canBeAccepted=");
      var15.append(var16);
      var15.append(", channelIcon=");
      var15.append(var4);
      var15.append(", channelName=");
      var15.append(var27);
      var15.append(", embedCanBeTapped=");
      var15.append(var26);
      var15.append(", memberText=");
      var15.append(var19);
      var15.append(", onlineText=");
      var15.append(var5);
      var15.append(", resolvingGradientEnd=");
      var15.append(var35);
      var15.append(", resolvingGradientStart=");
      var15.append(var37);
      var15.append(", splashHasRadialGradient=");
      var15.append(var20);
      var15.append(", splashOpacity=");
      var15.append(var38);
      var15.append(", splashUrl=");
      var15.append(var18);
      var15.append(", inviteSplash=");
      var15.append(var21);
      var15.append(", subtitleColor=");
      var15.append(var22);
      var15.append(", thumbnailBackgroundColor=");
      var15.append(var36);
      var15.append(", thumbnailCornerRadius=");
      var15.append(var17);
      var15.append(", thumbnailText=");
      var15.append(var25);
      var15.append(", thumbnailUrl=");
      var15.append(var10);
      var15.append(", titleColor=");
      var15.append(var12);
      var15.append(", extendedType=");
      var15.append(var32);
      var15.append(", guildName=");
      var15.append(var11);
      var15.append(", guildIcon=");
      var15.append(var30);
      var15.append(", headerIcon=");
      var15.append(var39);
      var15.append(", badgeIconUrl=");
      var15.append(var14);
      var15.append(")");
      return var15.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteDisabledEmbedImpl> {
         return GuildInviteDisabledEmbedImpl.$serializer.INSTANCE;
      }
   }
}
