package com.discord.chat.bridge.codedlinks

import al.b2
import al.g0
import al.h
import al.n0
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import xk.f
import xk.n
import yk.a

@f
public data class GuildEventInviteEmbedImpl(backgroundColor: Int,
      borderColor: Int,
      extendedType: CodedLinkExtendedType = CodedLinkExtendedType.GUILD_SCHEDULED_EVENT,
      headerColor: Int,
      headerText: String,
      type: InviteType,
      acceptLabelBackgroundColor: Int? = null,
      acceptLabelBorderColor: Int? = null,
      acceptLabelColor: Int? = null,
      acceptLabelIcon: String? = null,
      acceptLabelText: String? = null,
      badgeCount: String? = null,
      badgeIcon: String? = null,
      bodyText: String? = null,
      bodyTextColor: Int? = null,
      canBeAccepted: Boolean? = ...,
      channelIcon: String? = ...,
      channelName: String? = ...,
      content: StructurableText? = ...,
      creatorAvatar: String? = ...,
      embedCanBeTapped: Boolean? = ...,
      guildIcon: String? = ...,
      guildName: String? = ...,
      headerIcon: String? = ...,
      headerTextColor: Int? = ...,
      isRsvped: Boolean? = ...,
      memberText: String? = ...,
      onlineText: String? = ...,
      resolvingGradientEnd: Int? = ...,
      resolvingGradientStart: Int? = ...,
      secondaryActionIcon: String? = ...,
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
      titleText: String? = null
   )
   : CodedLinkEmbed,
   GuildEventInviteEmbed,
   GuildInviteExtendedEmbed {
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelIcon: String?
   public open val acceptLabelText: String?
   public open val backgroundColor: Int
   public open val badgeCount: String?
   public open val badgeIcon: String?
   public open val bodyText: String?
   public open val bodyTextColor: Int?
   public open val borderColor: Int
   public open val canBeAccepted: Boolean?
   public open val channelIcon: String?
   public open val channelName: String?
   public open val content: StructurableText?
   public open val creatorAvatar: String?
   public open val embedCanBeTapped: Boolean?
   public open val extendedType: CodedLinkExtendedType
   public open val guildIcon: String?
   public open val guildName: String?
   public open val headerColor: Int
   public open val headerIcon: String?
   public open val headerText: String
   public open val headerTextColor: Int?
   public open val inviteSplash: String?
   public open val isRsvped: Boolean?
   public open val memberText: String?
   public open val onlineText: String?
   public open val resolvingGradientEnd: Int?
   public open val resolvingGradientStart: Int?
   public open val secondaryActionIcon: String?
   public open val splashHasRadialGradient: Boolean?
   public open val splashOpacity: Int?
   public open val splashUrl: String?
   public open val subtitle: String?
   public open val subtitleColor: Int?
   public open val thumbnailBackgroundColor: Int?
   public open val thumbnailCornerRadius: Int?
   public open val thumbnailText: String?
   public open val thumbnailUrl: String?
   public open val titleColor: Int?
   public open val titleText: String?
   public open val type: InviteType

   init {
      q.h(var3, "extendedType");
      q.h(var5, "headerText");
      q.h(var6, "type");
      super(null);
      this.backgroundColor = var1;
      this.borderColor = var2;
      this.extendedType = var3;
      this.headerColor = var4;
      this.headerText = var5;
      this.type = var6;
      this.acceptLabelBackgroundColor = var7;
      this.acceptLabelBorderColor = var8;
      this.acceptLabelColor = var9;
      this.acceptLabelIcon = var10;
      this.acceptLabelText = var11;
      this.badgeCount = var12;
      this.badgeIcon = var13;
      this.bodyText = var14;
      this.bodyTextColor = var15;
      this.canBeAccepted = var16;
      this.channelIcon = var17;
      this.channelName = var18;
      this.content = var19;
      this.creatorAvatar = var20;
      this.embedCanBeTapped = var21;
      this.guildIcon = var22;
      this.guildName = var23;
      this.headerIcon = var24;
      this.headerTextColor = var25;
      this.isRsvped = var26;
      this.memberText = var27;
      this.onlineText = var28;
      this.resolvingGradientEnd = var29;
      this.resolvingGradientStart = var30;
      this.secondaryActionIcon = var31;
      this.splashHasRadialGradient = var32;
      this.splashOpacity = var33;
      this.splashUrl = var34;
      this.inviteSplash = var35;
      this.subtitle = var36;
      this.subtitleColor = var37;
      this.thumbnailBackgroundColor = var38;
      this.thumbnailCornerRadius = var39;
      this.thumbnailText = var40;
      this.thumbnailUrl = var41;
      this.titleColor = var42;
      this.titleText = var43;
   }

   public operator fun component1(): Int {
      return this.backgroundColor;
   }

   public operator fun component10(): String? {
      return this.acceptLabelIcon;
   }

   public operator fun component11(): String? {
      return this.acceptLabelText;
   }

   public operator fun component12(): String? {
      return this.badgeCount;
   }

   public operator fun component13(): String? {
      return this.badgeIcon;
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

   public operator fun component19(): StructurableText? {
      return this.content;
   }

   public operator fun component2(): Int {
      return this.borderColor;
   }

   public operator fun component20(): String? {
      return this.creatorAvatar;
   }

   public operator fun component21(): Boolean? {
      return this.embedCanBeTapped;
   }

   public operator fun component22(): String? {
      return this.guildIcon;
   }

   public operator fun component23(): String? {
      return this.guildName;
   }

   public operator fun component24(): String? {
      return this.headerIcon;
   }

   public operator fun component25(): Int? {
      return this.headerTextColor;
   }

   public operator fun component26(): Boolean? {
      return this.isRsvped;
   }

   public operator fun component27(): String? {
      return this.memberText;
   }

   public operator fun component28(): String? {
      return this.onlineText;
   }

   public operator fun component29(): Int? {
      return this.resolvingGradientEnd;
   }

   public operator fun component3(): CodedLinkExtendedType {
      return this.extendedType;
   }

   public operator fun component30(): Int? {
      return this.resolvingGradientStart;
   }

   public operator fun component31(): String? {
      return this.secondaryActionIcon;
   }

   public operator fun component32(): Boolean? {
      return this.splashHasRadialGradient;
   }

   public operator fun component33(): Int? {
      return this.splashOpacity;
   }

   public operator fun component34(): String? {
      return this.splashUrl;
   }

   public operator fun component35(): String? {
      return this.inviteSplash;
   }

   public operator fun component36(): String? {
      return this.subtitle;
   }

   public operator fun component37(): Int? {
      return this.subtitleColor;
   }

   public operator fun component38(): Int? {
      return this.thumbnailBackgroundColor;
   }

   public operator fun component39(): Int? {
      return this.thumbnailCornerRadius;
   }

   public operator fun component4(): Int {
      return this.headerColor;
   }

   public operator fun component40(): String? {
      return this.thumbnailText;
   }

   public operator fun component41(): String? {
      return this.thumbnailUrl;
   }

   public operator fun component42(): Int? {
      return this.titleColor;
   }

   public operator fun component43(): String? {
      return this.titleText;
   }

   public operator fun component5(): String {
      return this.headerText;
   }

   public operator fun component6(): InviteType {
      return this.type;
   }

   public operator fun component7(): Int? {
      return this.acceptLabelBackgroundColor;
   }

   public operator fun component8(): Int? {
      return this.acceptLabelBorderColor;
   }

   public operator fun component9(): Int? {
      return this.acceptLabelColor;
   }

   public fun copy(
      backgroundColor: Int = var0.backgroundColor,
      borderColor: Int = var0.borderColor,
      extendedType: CodedLinkExtendedType = var0.extendedType,
      headerColor: Int = var0.headerColor,
      headerText: String = var0.headerText,
      type: InviteType = var0.type,
      acceptLabelBackgroundColor: Int? = var0.acceptLabelBackgroundColor,
      acceptLabelBorderColor: Int? = var0.acceptLabelBorderColor,
      acceptLabelColor: Int? = var0.acceptLabelColor,
      acceptLabelIcon: String? = var0.acceptLabelIcon,
      acceptLabelText: String? = var0.acceptLabelText,
      badgeCount: String? = var0.badgeCount,
      badgeIcon: String? = var0.badgeIcon,
      bodyText: String? = var0.bodyText,
      bodyTextColor: Int? = var0.bodyTextColor,
      canBeAccepted: Boolean? = var0.canBeAccepted,
      channelIcon: String? = var0.channelIcon,
      channelName: String? = var0.channelName,
      content: StructurableText? = var0.content,
      creatorAvatar: String? = var0.creatorAvatar,
      embedCanBeTapped: Boolean? = var0.embedCanBeTapped,
      guildIcon: String? = var0.guildIcon,
      guildName: String? = var0.guildName,
      headerIcon: String? = var0.headerIcon,
      headerTextColor: Int? = var0.headerTextColor,
      isRsvped: Boolean? = var0.isRsvped,
      memberText: String? = var0.memberText,
      onlineText: String? = var0.onlineText,
      resolvingGradientEnd: Int? = var0.resolvingGradientEnd,
      resolvingGradientStart: Int? = var0.resolvingGradientStart,
      secondaryActionIcon: String? = var0.secondaryActionIcon,
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
      titleText: String? = var0.titleText
   ): GuildEventInviteEmbedImpl {
      q.h(var3, "extendedType");
      q.h(var5, "headerText");
      q.h(var6, "type");
      return new GuildEventInviteEmbedImpl(
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
         var39,
         var40,
         var41,
         var42,
         var43
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildEventInviteEmbedImpl) {
         return false;
      } else {
         var1 = var1;
         if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (this.borderColor != var1.borderColor) {
            return false;
         } else if (this.extendedType != var1.extendedType) {
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
         } else if (!q.c(this.acceptLabelIcon, var1.acceptLabelIcon)) {
            return false;
         } else if (!q.c(this.acceptLabelText, var1.acceptLabelText)) {
            return false;
         } else if (!q.c(this.badgeCount, var1.badgeCount)) {
            return false;
         } else if (!q.c(this.badgeIcon, var1.badgeIcon)) {
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
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else if (!q.c(this.creatorAvatar, var1.creatorAvatar)) {
            return false;
         } else if (!q.c(this.embedCanBeTapped, var1.embedCanBeTapped)) {
            return false;
         } else if (!q.c(this.guildIcon, var1.guildIcon)) {
            return false;
         } else if (!q.c(this.guildName, var1.guildName)) {
            return false;
         } else if (!q.c(this.headerIcon, var1.headerIcon)) {
            return false;
         } else if (!q.c(this.headerTextColor, var1.headerTextColor)) {
            return false;
         } else if (!q.c(this.isRsvped, var1.isRsvped)) {
            return false;
         } else if (!q.c(this.memberText, var1.memberText)) {
            return false;
         } else if (!q.c(this.onlineText, var1.onlineText)) {
            return false;
         } else if (!q.c(this.resolvingGradientEnd, var1.resolvingGradientEnd)) {
            return false;
         } else if (!q.c(this.resolvingGradientStart, var1.resolvingGradientStart)) {
            return false;
         } else if (!q.c(this.secondaryActionIcon, var1.secondaryActionIcon)) {
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
         } else {
            return q.c(this.titleText, var1.titleText);
         }
      }
   }

   public override fun hashCode(): Int {
      val var38: Int = Integer.hashCode(this.backgroundColor);
      val var39: Int = Integer.hashCode(this.borderColor);
      val var40: Int = this.extendedType.hashCode();
      val var42: Int = Integer.hashCode(this.headerColor);
      val var41: Int = this.headerText.hashCode();
      val var43: Int = this.type.hashCode();
      var var37: Int = 0;
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
      if (this.acceptLabelIcon == null) {
         var4 = 0;
      } else {
         var4 = this.acceptLabelIcon.hashCode();
      }

      val var5: Int;
      if (this.acceptLabelText == null) {
         var5 = 0;
      } else {
         var5 = this.acceptLabelText.hashCode();
      }

      val var6: Int;
      if (this.badgeCount == null) {
         var6 = 0;
      } else {
         var6 = this.badgeCount.hashCode();
      }

      val var7: Int;
      if (this.badgeIcon == null) {
         var7 = 0;
      } else {
         var7 = this.badgeIcon.hashCode();
      }

      val var8: Int;
      if (this.bodyText == null) {
         var8 = 0;
      } else {
         var8 = this.bodyText.hashCode();
      }

      val var9: Int;
      if (this.bodyTextColor == null) {
         var9 = 0;
      } else {
         var9 = this.bodyTextColor.hashCode();
      }

      val var10: Int;
      if (this.canBeAccepted == null) {
         var10 = 0;
      } else {
         var10 = this.canBeAccepted.hashCode();
      }

      val var11: Int;
      if (this.channelIcon == null) {
         var11 = 0;
      } else {
         var11 = this.channelIcon.hashCode();
      }

      val var12: Int;
      if (this.channelName == null) {
         var12 = 0;
      } else {
         var12 = this.channelName.hashCode();
      }

      val var13: Int;
      if (this.content == null) {
         var13 = 0;
      } else {
         var13 = this.content.hashCode();
      }

      val var14: Int;
      if (this.creatorAvatar == null) {
         var14 = 0;
      } else {
         var14 = this.creatorAvatar.hashCode();
      }

      val var15: Int;
      if (this.embedCanBeTapped == null) {
         var15 = 0;
      } else {
         var15 = this.embedCanBeTapped.hashCode();
      }

      val var16: Int;
      if (this.guildIcon == null) {
         var16 = 0;
      } else {
         var16 = this.guildIcon.hashCode();
      }

      val var17: Int;
      if (this.guildName == null) {
         var17 = 0;
      } else {
         var17 = this.guildName.hashCode();
      }

      val var18: Int;
      if (this.headerIcon == null) {
         var18 = 0;
      } else {
         var18 = this.headerIcon.hashCode();
      }

      val var19: Int;
      if (this.headerTextColor == null) {
         var19 = 0;
      } else {
         var19 = this.headerTextColor.hashCode();
      }

      val var20: Int;
      if (this.isRsvped == null) {
         var20 = 0;
      } else {
         var20 = this.isRsvped.hashCode();
      }

      val var21: Int;
      if (this.memberText == null) {
         var21 = 0;
      } else {
         var21 = this.memberText.hashCode();
      }

      val var22: Int;
      if (this.onlineText == null) {
         var22 = 0;
      } else {
         var22 = this.onlineText.hashCode();
      }

      val var23: Int;
      if (this.resolvingGradientEnd == null) {
         var23 = 0;
      } else {
         var23 = this.resolvingGradientEnd.hashCode();
      }

      val var24: Int;
      if (this.resolvingGradientStart == null) {
         var24 = 0;
      } else {
         var24 = this.resolvingGradientStart.hashCode();
      }

      val var25: Int;
      if (this.secondaryActionIcon == null) {
         var25 = 0;
      } else {
         var25 = this.secondaryActionIcon.hashCode();
      }

      val var26: Int;
      if (this.splashHasRadialGradient == null) {
         var26 = 0;
      } else {
         var26 = this.splashHasRadialGradient.hashCode();
      }

      val var27: Int;
      if (this.splashOpacity == null) {
         var27 = 0;
      } else {
         var27 = this.splashOpacity.hashCode();
      }

      val var28: Int;
      if (this.splashUrl == null) {
         var28 = 0;
      } else {
         var28 = this.splashUrl.hashCode();
      }

      val var29: Int;
      if (this.inviteSplash == null) {
         var29 = 0;
      } else {
         var29 = this.inviteSplash.hashCode();
      }

      val var30: Int;
      if (this.subtitle == null) {
         var30 = 0;
      } else {
         var30 = this.subtitle.hashCode();
      }

      val var31: Int;
      if (this.subtitleColor == null) {
         var31 = 0;
      } else {
         var31 = this.subtitleColor.hashCode();
      }

      val var32: Int;
      if (this.thumbnailBackgroundColor == null) {
         var32 = 0;
      } else {
         var32 = this.thumbnailBackgroundColor.hashCode();
      }

      val var33: Int;
      if (this.thumbnailCornerRadius == null) {
         var33 = 0;
      } else {
         var33 = this.thumbnailCornerRadius.hashCode();
      }

      val var34: Int;
      if (this.thumbnailText == null) {
         var34 = 0;
      } else {
         var34 = this.thumbnailText.hashCode();
      }

      val var35: Int;
      if (this.thumbnailUrl == null) {
         var35 = 0;
      } else {
         var35 = this.thumbnailUrl.hashCode();
      }

      val var36: Int;
      if (this.titleColor == null) {
         var36 = 0;
      } else {
         var36 = this.titleColor.hashCode();
      }

      if (this.titleText != null) {
         var37 = this.titleText.hashCode();
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
                                                                                                                                                                                                                                                                                                                                                   (
                                                                                                                                                                                                                                                                                                                                                            (
                                                                                                                                                                                                                                                                                                                                                                     (
                                                                                                                                                                                                                                                                                                                                                                              (
                                                                                                                                                                                                                                                                                                                                                                                       var38
                                                                                                                                                                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                                                                                                                                                                          + var39
                                                                                                                                                                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                                                                                                                                                                 + var40
                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                                                                                                                                                                        + var42
                                                                                                                                                                                                                                                                                                                                                                  )
                                                                                                                                                                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                                                                                                                                                                               + var41
                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                      + var43
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
                                             + var33
                                       )
                                       * 31
                                    + var34
                              )
                              * 31
                           + var35
                     )
                     * 31
                  + var36
            )
            * 31
         + var37;
   }

   public override fun toString(): String {
      val var3: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var43: CodedLinkExtendedType = this.extendedType;
      val var1: Int = this.headerColor;
      val var13: java.lang.String = this.headerText;
      val var8: InviteType = this.type;
      val var16: Int = this.acceptLabelBackgroundColor;
      val var5: Int = this.acceptLabelBorderColor;
      val var44: Int = this.acceptLabelColor;
      val var25: java.lang.String = this.acceptLabelIcon;
      val var11: java.lang.String = this.acceptLabelText;
      val var23: java.lang.String = this.badgeCount;
      val var29: java.lang.String = this.badgeIcon;
      val var17: java.lang.String = this.bodyText;
      val var6: Int = this.bodyTextColor;
      val var21: java.lang.Boolean = this.canBeAccepted;
      val var35: java.lang.String = this.channelIcon;
      val var28: java.lang.String = this.channelName;
      val var22: StructurableText = this.content;
      val var19: java.lang.String = this.creatorAvatar;
      val var30: java.lang.Boolean = this.embedCanBeTapped;
      val var20: java.lang.String = this.guildIcon;
      val var36: java.lang.String = this.guildName;
      val var14: java.lang.String = this.headerIcon;
      val var40: Int = this.headerTextColor;
      val var24: java.lang.Boolean = this.isRsvped;
      val var42: java.lang.String = this.memberText;
      val var41: java.lang.String = this.onlineText;
      val var9: Int = this.resolvingGradientEnd;
      val var37: Int = this.resolvingGradientStart;
      val var32: java.lang.String = this.secondaryActionIcon;
      val var38: java.lang.Boolean = this.splashHasRadialGradient;
      val var39: Int = this.splashOpacity;
      val var4: java.lang.String = this.splashUrl;
      val var15: java.lang.String = this.inviteSplash;
      val var10: java.lang.String = this.subtitle;
      val var12: Int = this.subtitleColor;
      val var26: Int = this.thumbnailBackgroundColor;
      val var33: Int = this.thumbnailCornerRadius;
      val var18: java.lang.String = this.thumbnailText;
      val var31: java.lang.String = this.thumbnailUrl;
      val var7: Int = this.titleColor;
      val var27: java.lang.String = this.titleText;
      val var34: StringBuilder = new StringBuilder();
      var34.append("GuildEventInviteEmbedImpl(backgroundColor=");
      var34.append(var3);
      var34.append(", borderColor=");
      var34.append(var2);
      var34.append(", extendedType=");
      var34.append(var43);
      var34.append(", headerColor=");
      var34.append(var1);
      var34.append(", headerText=");
      var34.append(var13);
      var34.append(", type=");
      var34.append(var8);
      var34.append(", acceptLabelBackgroundColor=");
      var34.append(var16);
      var34.append(", acceptLabelBorderColor=");
      var34.append(var5);
      var34.append(", acceptLabelColor=");
      var34.append(var44);
      var34.append(", acceptLabelIcon=");
      var34.append(var25);
      var34.append(", acceptLabelText=");
      var34.append(var11);
      var34.append(", badgeCount=");
      var34.append(var23);
      var34.append(", badgeIcon=");
      var34.append(var29);
      var34.append(", bodyText=");
      var34.append(var17);
      var34.append(", bodyTextColor=");
      var34.append(var6);
      var34.append(", canBeAccepted=");
      var34.append(var21);
      var34.append(", channelIcon=");
      var34.append(var35);
      var34.append(", channelName=");
      var34.append(var28);
      var34.append(", content=");
      var34.append(var22);
      var34.append(", creatorAvatar=");
      var34.append(var19);
      var34.append(", embedCanBeTapped=");
      var34.append(var30);
      var34.append(", guildIcon=");
      var34.append(var20);
      var34.append(", guildName=");
      var34.append(var36);
      var34.append(", headerIcon=");
      var34.append(var14);
      var34.append(", headerTextColor=");
      var34.append(var40);
      var34.append(", isRsvped=");
      var34.append(var24);
      var34.append(", memberText=");
      var34.append(var42);
      var34.append(", onlineText=");
      var34.append(var41);
      var34.append(", resolvingGradientEnd=");
      var34.append(var9);
      var34.append(", resolvingGradientStart=");
      var34.append(var37);
      var34.append(", secondaryActionIcon=");
      var34.append(var32);
      var34.append(", splashHasRadialGradient=");
      var34.append(var38);
      var34.append(", splashOpacity=");
      var34.append(var39);
      var34.append(", splashUrl=");
      var34.append(var4);
      var34.append(", inviteSplash=");
      var34.append(var15);
      var34.append(", subtitle=");
      var34.append(var10);
      var34.append(", subtitleColor=");
      var34.append(var12);
      var34.append(", thumbnailBackgroundColor=");
      var34.append(var26);
      var34.append(", thumbnailCornerRadius=");
      var34.append(var33);
      var34.append(", thumbnailText=");
      var34.append(var18);
      var34.append(", thumbnailUrl=");
      var34.append(var31);
      var34.append(", titleColor=");
      var34.append(var7);
      var34.append(", titleText=");
      var34.append(var27);
      var34.append(")");
      return var34.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: GuildEventInviteEmbedImpl.$serializer = new GuildEventInviteEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl", var0, 43
         );
         var1.l("backgroundColor", false);
         var1.l("borderColor", false);
         var1.l("extendedType", true);
         var1.l("headerColor", false);
         var1.l("headerText", false);
         var1.l("type", false);
         var1.l("acceptLabelBackgroundColor", true);
         var1.l("acceptLabelBorderColor", true);
         var1.l("acceptLabelColor", true);
         var1.l("acceptLabelIcon", true);
         var1.l("acceptLabelText", true);
         var1.l("badgeCount", true);
         var1.l("badgeIcon", true);
         var1.l("bodyText", true);
         var1.l("bodyTextColor", true);
         var1.l("canBeAccepted", true);
         var1.l("channelIcon", true);
         var1.l("channelName", true);
         var1.l("content", true);
         var1.l("creatorAvatar", true);
         var1.l("embedCanBeTapped", true);
         var1.l("guildIcon", true);
         var1.l("guildName", true);
         var1.l("headerIcon", true);
         var1.l("headerTextColor", true);
         var1.l("isRsvped", true);
         var1.l("memberText", true);
         var1.l("onlineText", true);
         var1.l("resolvingGradientEnd", true);
         var1.l("resolvingGradientStart", true);
         var1.l("secondaryActionIcon", true);
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
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: n0 = n0.a;
         val var8: CodedLinkExtendedType.Serializer = CodedLinkExtendedType.Serializer.INSTANCE;
         val var3: b2 = b2.a;
         val var11: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var4: KSerializer = a.u(n0.a);
         val var7: KSerializer = a.u(var2);
         val var13: KSerializer = a.u(var2);
         val var5: KSerializer = a.u(var3);
         val var6: KSerializer = a.u(var3);
         val var9: KSerializer = a.u(var3);
         val var14: KSerializer = a.u(var3);
         val var1: KSerializer = a.u(var3);
         val var10: KSerializer = a.u(var2);
         val var12: h = h.a;
         return new KSerializer[]{
            var2,
            var2,
            var8,
            var2,
            var3,
            var11,
            var4,
            var7,
            var13,
            var5,
            var6,
            var9,
            var14,
            var1,
            var10,
            a.u(h.a),
            a.u(var3),
            a.u(var3),
            a.u(StructurableTextSerializer.INSTANCE),
            a.u(var3),
            a.u(var12),
            a.u(var3),
            a.u(var3),
            a.u(var3),
            a.u(var2),
            a.u(var12),
            a.u(var3),
            a.u(var3),
            a.u(var2),
            a.u(var2),
            a.u(var3),
            a.u(var12),
            a.u(var2),
            a.u(var3),
            a.u(var3),
            a.u(var3),
            a.u(var2),
            a.u(var2),
            a.u(var2),
            a.u(var3),
            a.u(var3),
            a.u(var2),
            a.u(var3)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildEventInviteEmbedImpl {
         q.h(var1, "decoder");
         val var58: SerialDescriptor = this.getDescriptor();
         val var59: c = var1.c(var58);
         var var3: Int;
         var var4: Int;
         var var6: Int;
         var var7: Int;
         var var17: Int;
         var var19: Any;
         var var20: Any;
         var var22: Int;
         var var23: Any;
         var var24: Any;
         var var25: Any;
         var var26: Int;
         var var27: Int;
         var var28: Any;
         var var29: Any;
         var var30: Any;
         var var31: Int;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         var var36: Any;
         var var37: Any;
         var var38: Int;
         var var39: Any;
         var var40: Int;
         var var41: Int;
         var var42: Any;
         var var43: Any;
         val var44: java.lang.String;
         var var45: Int;
         var var46: Any;
         var var47: Any;
         var var48: Int;
         var var49: Any;
         val var50: Any;
         val var51: Any;
         val var52: Int;
         val var53: Int;
         var var54: Any;
         var var64: Int;
         var var85: Any;
         var var106: Any;
         var var124: Any;
         var var138: Any;
         if (var59.y()) {
            var7 = var59.k(var58, 0);
            var64 = var59.k(var58, 1);
            var24 = var59.m(var58, 2, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var5: Int = var59.k(var58, 3);
            var42 = var59.t(var58, 4);
            var43 = var59.m(var58, 5, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var60: n0 = n0.a;
            var38 = var59.v(var58, 6, n0.a, null) as Int;
            var17 = var59.v(var58, 7, var60, null) as Int;
            var106 = var59.v(var58, 8, var60, null) as Int;
            val var9: b2 = b2.a;
            var124 = var59.v(var58, 9, b2.a, null) as java.lang.String;
            var54 = var59.v(var58, 10, var9, null) as java.lang.String;
            var36 = var59.v(var58, 11, var9, null) as java.lang.String;
            var47 = var59.v(var58, 12, var9, null) as java.lang.String;
            var20 = var59.v(var58, 13, var9, null) as java.lang.String;
            var26 = var59.v(var58, 14, var60, null) as Int;
            val var10: h = h.a;
            var138 = var59.v(var58, 15, h.a, null) as java.lang.Boolean;
            var19 = var59.v(var58, 16, var9, null) as java.lang.String;
            val var16: java.lang.String = var59.v(var58, 17, var9, null) as java.lang.String;
            val var11: StructurableText = var59.v(var58, 18, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            val var13: java.lang.String = var59.v(var58, 19, var9, null) as java.lang.String;
            val var14: java.lang.Boolean = var59.v(var58, 20, var10, null) as java.lang.Boolean;
            var37 = var59.v(var58, 21, var9, null) as java.lang.String;
            var35 = var59.v(var58, 22, var9, null) as java.lang.String;
            var34 = var59.v(var58, 23, var9, null) as java.lang.String;
            var53 = var59.v(var58, 24, var60, null) as Int;
            var25 = var59.v(var58, 25, var10, null) as java.lang.Boolean;
            var50 = var59.v(var58, 26, var9, null) as java.lang.String;
            var28 = var59.v(var58, 27, var9, null) as java.lang.String;
            var27 = var59.v(var58, 28, var60, null) as Int;
            var22 = var59.v(var58, 29, var60, null) as Int;
            var23 = var59.v(var58, 30, var9, null) as java.lang.String;
            var85 = var59.v(var58, 31, var10, null) as java.lang.Boolean;
            val var77: Int = var59.v(var58, 32, var60, null) as Int;
            var33 = var59.v(var58, 33, var9, null) as java.lang.String;
            var29 = var59.v(var58, 34, var9, null) as java.lang.String;
            var44 = var59.v(var58, 35, var9, null) as java.lang.String;
            var40 = var59.v(var58, 36, var60, null) as Int;
            var48 = var59.v(var58, 37, var60, null) as Int;
            var45 = var59.v(var58, 38, var60, null) as Int;
            var32 = var59.v(var58, 39, var9, null) as java.lang.String;
            var30 = var59.v(var58, 40, var9, null) as java.lang.String;
            val var61: Int = var59.v(var58, 41, var60, null) as Int;
            val var71: java.lang.String = var59.v(var58, 42, var9, null) as java.lang.String;
            var6 = 2047;
            var4 = -1;
            var3 = var64;
            var64 = var5;
            var52 = (Integer)var106;
            var106 = var124;
            var124 = var138;
            var39 = var16;
            var138 = var11;
            var51 = var13;
            var46 = var14;
            var49 = var85;
            var31 = var77;
            var41 = var61;
            var85 = var71;
         } else {
            var var8: Boolean = true;
            var3 = 0;
            var7 = 0;
            var6 = 0;
            var var69: Int = 0;
            var var147: java.lang.String = null;
            var31 = null;
            var30 = null;
            var29 = null;
            var28 = null;
            var23 = null;
            var47 = null;
            var46 = null;
            var45 = null;
            var var176: Int = null;
            var43 = null;
            var42 = null;
            var24 = null;
            var var62: Any = null;
            var var78: Int = null;
            var var72: Int = null;
            var var81: Int = null;
            var var99: Any = null;
            var106 = null;
            var17 = null;
            var var101: Any = null;
            var var114: Any = null;
            var85 = null;
            var124 = null;
            var19 = null;
            var20 = null;
            var138 = null;
            var26 = null;
            var25 = null;
            var41 = null;
            var40 = null;
            var39 = null;
            var38 = null;
            var37 = null;
            var36 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var32 = null;
            var27 = null;
            var4 = 0;

            while (var8) {
               label159: {
                  label127: {
                     label126: {
                        label125: {
                           label124: {
                              label160: {
                                 label108: {
                                    label107: {
                                       var64 = var59.x(var58);
                                       switch (var64) {
                                          case -1:
                                             var64 = var4;
                                             var8 = false;
                                             break label124;
                                          case 0:
                                             var7 = var59.k(var58, 0);
                                             var64 = var4 or 1;
                                             break label124;
                                          case 1:
                                             var69 = var59.k(var58, 1);
                                             var64 = var4 or 2;
                                             break label124;
                                          case 2:
                                             var24 = var59.m(var58, 2, CodedLinkExtendedType.Serializer.INSTANCE, var24) as CodedLinkExtendedType;
                                             var64 = var4 or 4;
                                             break label126;
                                          case 3:
                                             var99 = var101;
                                             var81 = (Integer)var124;
                                             var78 = (Integer)var19;
                                             var72 = (Integer)var20;
                                             var138 = var85;
                                             var6 = var59.k(var58, 3);
                                             var64 = var4 or 8;
                                             var101 = var62;
                                             var62 = var138;
                                             var85 = var114;
                                             var106 = var78;
                                             var114 = var72;
                                             var17 = var81;
                                             var124 = var99;
                                             var19 = var106;
                                             var20 = var17;
                                             break label125;
                                          case 4:
                                             var42 = var59.t(var58, 4);
                                             var64 = var4 or 16;
                                             break label107;
                                          case 5:
                                             var62 = var59.m(var58, 5, InviteType.Serializer.INSTANCE, var62) as InviteType;
                                             var64 = var4 or 32;
                                             break label107;
                                          case 6:
                                             var99 = var101;
                                             var81 = (Integer)var124;
                                             var138 = var85;
                                             var106 = var59.v(var58, 6, n0.a, var78) as Int;
                                             var64 = var4 or 64;
                                             var62 = var138;
                                             var72 = (Integer)var20;
                                             var78 = (Integer)var19;
                                             var85 = var114;
                                             var101 = var62;
                                             var114 = var72;
                                             var17 = var81;
                                             var124 = var99;
                                             var19 = var106;
                                             var20 = var17;
                                             break label125;
                                          case 7:
                                             var99 = var101;
                                             var138 = var85;
                                             var17 = var81;
                                             val var137: Int = var59.v(var58, 7, n0.a, var72) as Int;
                                             var64 = var4 or 128;
                                             var62 = var138;
                                             var72 = (Integer)var20;
                                             var78 = (Integer)var19;
                                             var81 = (Integer)var124;
                                             var85 = var114;
                                             var101 = var62;
                                             var106 = var78;
                                             var114 = var137;
                                             var124 = var99;
                                             var19 = var106;
                                             var20 = var17;
                                             break label125;
                                          case 8:
                                             var138 = var85;
                                             var124 = var99;
                                             var17 = var59.v(var58, 8, n0.a, var81) as Int;
                                             var64 = var4 or 256;
                                             var62 = var138;
                                             var72 = (Integer)var20;
                                             var78 = (Integer)var19;
                                             var81 = (Integer)var124;
                                             var85 = var114;
                                             var99 = var101;
                                             var101 = var62;
                                             var106 = var78;
                                             var114 = var72;
                                             var19 = var106;
                                             var20 = var17;
                                             break label125;
                                          case 9:
                                             var138 = var85;
                                             var19 = var106;
                                             val var136: java.lang.String = var59.v(var58, 9, b2.a, var99) as java.lang.String;
                                             var64 = var4 or 512;
                                             var62 = var138;
                                             var72 = (Integer)var20;
                                             var78 = (Integer)var19;
                                             var81 = (Integer)var124;
                                             var85 = var114;
                                             var99 = var101;
                                             var101 = var62;
                                             var106 = var78;
                                             var114 = var72;
                                             var17 = var81;
                                             var124 = var136;
                                             var20 = var17;
                                             break label125;
                                          case 10:
                                             var138 = var85;
                                             var20 = var17;
                                             var19 = var59.v(var58, 10, b2.a, var106) as java.lang.String;
                                             var64 = var4 or 1024;
                                             var17 = var81;
                                             var62 = var138;
                                             var72 = (Integer)var20;
                                             var78 = (Integer)var19;
                                             var81 = (Integer)var124;
                                             var85 = var114;
                                             var99 = var101;
                                             var101 = var62;
                                             var106 = var78;
                                             var114 = var72;
                                             var124 = var99;
                                             break label125;
                                          case 11:
                                             var138 = var85;
                                             var20 = var59.v(var58, 11, b2.a, var17) as java.lang.String;
                                             var64 = var4 or 2048;
                                             var62 = var138;
                                             var72 = (Integer)var20;
                                             var78 = (Integer)var19;
                                             var81 = (Integer)var124;
                                             var85 = var114;
                                             var99 = var101;
                                             var101 = var62;
                                             var106 = var78;
                                             var114 = var72;
                                             var17 = var81;
                                             var124 = var99;
                                             var19 = var106;
                                             break label125;
                                          case 12:
                                             var138 = var85;
                                             var85 = var114;
                                             var54 = var59.v(var58, 12, b2.a, var101) as java.lang.String;
                                             var64 = var4 or 4096;
                                             var101 = var62;
                                             var62 = var138;
                                             var72 = (Integer)var20;
                                             var78 = (Integer)var19;
                                             var81 = (Integer)var124;
                                             var99 = var54;
                                             var106 = var78;
                                             var114 = var72;
                                             var17 = var81;
                                             var124 = var99;
                                             var19 = var106;
                                             var20 = var17;
                                             break label125;
                                          case 13:
                                             var138 = var85;
                                             var85 = var59.v(var58, 13, b2.a, var114) as java.lang.String;
                                             var64 = var4 or 8192;
                                             var99 = var101;
                                             var62 = var138;
                                             var72 = (Integer)var20;
                                             var78 = (Integer)var19;
                                             var81 = (Integer)var124;
                                             var101 = var62;
                                             var106 = var78;
                                             var114 = var72;
                                             var17 = var81;
                                             var124 = var99;
                                             var19 = var106;
                                             var20 = var17;
                                             break label125;
                                          case 14:
                                             var138 = var59.v(var58, 14, n0.a, var85) as Int;
                                             var64 = var4 or 16384;
                                             var99 = var101;
                                             var85 = var114;
                                             var62 = var138;
                                             var72 = (Integer)var20;
                                             var78 = (Integer)var19;
                                             var81 = (Integer)var124;
                                             var101 = var62;
                                             var106 = var78;
                                             var114 = var72;
                                             var17 = var81;
                                             var124 = var99;
                                             var19 = var106;
                                             var20 = var17;
                                             break label125;
                                          case 15:
                                             val var342: java.lang.Boolean = var59.v(var58, 15, h.a, var124) as java.lang.Boolean;
                                             var64 = var4 or '耀';
                                             var124 = var99;
                                             var99 = var101;
                                             var62 = var138;
                                             var72 = (Integer)var20;
                                             var78 = (Integer)var19;
                                             var81 = var342;
                                             var85 = var114;
                                             var101 = var62;
                                             var106 = var78;
                                             var114 = var72;
                                             var17 = var81;
                                             var19 = var106;
                                             var20 = var17;
                                             var138 = var85;
                                             break label125;
                                          case 16:
                                             val var341: java.lang.String = var59.v(var58, 16, b2.a, var19) as java.lang.String;
                                             var64 = var4 or 65536;
                                             var99 = var101;
                                             var81 = (Integer)var124;
                                             var62 = var138;
                                             var72 = (Integer)var20;
                                             var78 = var341;
                                             var85 = var114;
                                             var101 = var62;
                                             var106 = var78;
                                             var114 = var72;
                                             var17 = var81;
                                             var124 = var99;
                                             var19 = var106;
                                             var20 = var17;
                                             var138 = var85;
                                             break label125;
                                          case 17:
                                             val var340: java.lang.String = var59.v(var58, 17, b2.a, var20) as java.lang.String;
                                             var64 = var4 or 131072;
                                             var20 = var17;
                                             var99 = var101;
                                             var81 = (Integer)var124;
                                             var78 = (Integer)var19;
                                             var62 = var138;
                                             var72 = var340;
                                             var85 = var114;
                                             var101 = var62;
                                             var106 = var78;
                                             var114 = var72;
                                             var17 = var81;
                                             var124 = var99;
                                             var19 = var106;
                                             var138 = var85;
                                             break label125;
                                          case 18:
                                             val var202: StructurableText = var59.v(var58, 18, StructurableTextSerializer.INSTANCE, var138) as StructurableText;
                                             var64 = var4 or 262144;
                                             var99 = var101;
                                             var138 = var85;
                                             var20 = var17;
                                             var19 = var106;
                                             var124 = var99;
                                             var17 = var81;
                                             var114 = var72;
                                             var106 = var78;
                                             var101 = var62;
                                             var85 = var114;
                                             var81 = (Integer)var124;
                                             var78 = (Integer)var19;
                                             var72 = (Integer)var20;
                                             var62 = var202;
                                             break label125;
                                          case 19:
                                             var26 = var59.v(var58, 19, b2.a, var26) as java.lang.String;
                                             var64 = var4 or 524288;
                                             break label126;
                                          case 20:
                                             val var57: java.lang.Boolean = var59.v(var58, 20, h.a, var25) as java.lang.Boolean;
                                             var64 = var4 or 1048576;
                                             var99 = var101;
                                             var81 = (Integer)var124;
                                             var72 = (Integer)var20;
                                             var62 = var138;
                                             var25 = var147;
                                             var48 = var27;
                                             var22 = (Integer)var24;
                                             var23 = var19;
                                             var78 = var57;
                                             var85 = var114;
                                             var101 = var62;
                                             var106 = var78;
                                             var114 = var72;
                                             var17 = var81;
                                             var124 = var99;
                                             var19 = var106;
                                             var20 = var17;
                                             var138 = var85;
                                             var24 = var23;
                                             break label159;
                                          case 21:
                                             var41 = var59.v(var58, 21, b2.a, var41) as java.lang.String;
                                             var64 = var4 or 2097152;
                                             break label108;
                                          case 22:
                                             var40 = var59.v(var58, 22, b2.a, var40) as java.lang.String;
                                             var64 = var4 or 4194304;
                                             break label108;
                                          case 23:
                                             var39 = var59.v(var58, 23, b2.a, var39) as java.lang.String;
                                             var64 = var4 or 8388608;
                                             break label108;
                                          case 24:
                                             var38 = var59.v(var58, 24, n0.a, var38) as Int;
                                             var64 = var4 or 16777216;
                                             break label108;
                                          case 25:
                                             var37 = var59.v(var58, 25, h.a, var37) as java.lang.Boolean;
                                             var64 = var4 or 33554432;
                                             break label108;
                                          case 26:
                                             var36 = var59.v(var58, 26, b2.a, var36) as java.lang.String;
                                             var64 = var4 or 67108864;
                                             break label108;
                                          case 27:
                                             var35 = var59.v(var58, 27, b2.a, var35) as java.lang.String;
                                             var64 = var4 or 134217728;
                                             break label108;
                                          case 28:
                                             var34 = var59.v(var58, 28, n0.a, var34) as Int;
                                             var64 = var4 or 268435456;
                                             break label108;
                                          case 29:
                                             var33 = var59.v(var58, 29, n0.a, var33) as Int;
                                             var64 = var4 or 536870912;
                                             break label108;
                                          case 30:
                                             var32 = var59.v(var58, 30, b2.a, var32) as java.lang.String;
                                             var64 = var4 or 1073741824;
                                             break label108;
                                          case 31:
                                             var23 = var59.v(var58, 31, h.a, var23) as java.lang.Boolean;
                                             var64 = var4 or Integer.MIN_VALUE;
                                             break label108;
                                          case 32:
                                             var27 = var59.v(var58, 32, n0.a, var27) as Int;
                                             var64 = var3 or 1;
                                             break;
                                          case 33:
                                             var28 = var59.v(var58, 33, b2.a, var28) as java.lang.String;
                                             var64 = var3 or 2;
                                             break;
                                          case 34:
                                             var29 = var59.v(var58, 34, b2.a, var29) as java.lang.String;
                                             var64 = var3 or 4;
                                             break;
                                          case 35:
                                             var147 = var59.v(var58, 35, b2.a, var147) as java.lang.String;
                                             var64 = var3 or 8;
                                             break;
                                          case 36:
                                             var31 = var59.v(var58, 36, n0.a, var31) as Int;
                                             var64 = var3 or 16;
                                             break;
                                          case 37:
                                             var43 = var59.v(var58, 37, n0.a, var43) as Int;
                                             var64 = var3 or 32;
                                             var182 = var147;
                                             var49 = var27;
                                             break label160;
                                          case 38:
                                             var176 = var59.v(var58, 38, n0.a, var176) as Int;
                                             var64 = var3 or 64;
                                             var182 = var147;
                                             var49 = var27;
                                             break label160;
                                          case 39:
                                             var45 = var59.v(var58, 39, b2.a, var45) as java.lang.String;
                                             var64 = var3 or 128;
                                             var182 = var147;
                                             var49 = var27;
                                             break label160;
                                          case 40:
                                             var30 = var59.v(var58, 40, b2.a, var30) as java.lang.String;
                                             var64 = var3 or 256;
                                             break;
                                          case 41:
                                             var46 = var59.v(var58, 41, n0.a, var46) as Int;
                                             var64 = var3 or 512;
                                             var182 = var147;
                                             var49 = var27;
                                             break label160;
                                          case 42:
                                             var47 = var59.v(var58, 42, b2.a, var47) as java.lang.String;
                                             var64 = var3 or 1024;
                                             var49 = var27;
                                             var182 = var147;
                                             break label160;
                                          default:
                                             throw new n(var64);
                                       }

                                       var182 = var147;
                                       var49 = var27;
                                       break label160;
                                    }

                                    var17 = var81;
                                    var106 = var78;
                                    var99 = var101;
                                    var85 = var114;
                                    var81 = (Integer)var124;
                                    var78 = (Integer)var19;
                                    var72 = (Integer)var20;
                                    var101 = var62;
                                    var62 = var138;
                                    var114 = var72;
                                    var124 = var99;
                                    var19 = var106;
                                    var20 = var17;
                                    var138 = var85;
                                    break label125;
                                 }

                                 var182 = var147;
                                 var22 = var27;
                                 var27 = (Integer)var23;
                                 break label127;
                              }

                              var3 = var64;
                              var27 = (Integer)var23;
                              var64 = var4;
                              var22 = (Integer)var49;
                              break label127;
                           }

                           var17 = var81;
                           var106 = var78;
                           var99 = var101;
                           var85 = var114;
                           var81 = (Integer)var124;
                           var72 = (Integer)var20;
                           var62 = var138;
                           var78 = (Integer)var25;
                           var25 = var147;
                           var48 = var27;
                           var22 = (Integer)var24;
                           var23 = var19;
                           var101 = var62;
                           var114 = var72;
                           var124 = var99;
                           var19 = var106;
                           var20 = var17;
                           var138 = var85;
                           var24 = var23;
                           break label159;
                        }

                        var25 = var147;
                        var48 = var27;
                        var22 = (Integer)var24;
                        var23 = var78;
                        var78 = (Integer)var25;
                        var24 = var23;
                        break label159;
                     }

                     var17 = var81;
                     var106 = var78;
                     var99 = var101;
                     var85 = var114;
                     var78 = (Integer)var25;
                     var81 = (Integer)var124;
                     var72 = (Integer)var20;
                     var62 = var138;
                     var25 = var147;
                     var48 = var27;
                     var22 = (Integer)var24;
                     var23 = var19;
                     var101 = var62;
                     var114 = var72;
                     var124 = var99;
                     var19 = var106;
                     var20 = var17;
                     var138 = var85;
                     var24 = var23;
                     break label159;
                  }

                  var17 = var81;
                  var106 = var78;
                  var99 = var101;
                  var78 = (Integer)var25;
                  var81 = (Integer)var124;
                  var72 = (Integer)var20;
                  var62 = var138;
                  var138 = var85;
                  var25 = var182;
                  var48 = var22;
                  var22 = (Integer)var24;
                  var23 = var19;
                  var85 = var114;
                  var101 = var62;
                  var114 = var72;
                  var124 = var99;
                  var19 = var106;
                  var20 = var17;
                  var24 = var27;
               }

               var62 = var101;
               var81 = var17;
               var99 = var124;
               var106 = var19;
               var17 = (Integer)var20;
               var23 = var24;
               var147 = (java.lang.String)var25;
               var27 = var48;
               var4 = var64;
               var24 = var22;
               var78 = (Integer)var106;
               var72 = (Integer)var114;
               var101 = var99;
               var114 = var85;
               var85 = var138;
               var124 = var81;
               var19 = var23;
               var20 = var72;
               var138 = var62;
               var25 = var78;
            }

            var48 = (Integer)var43;
            var64 = var6;
            var46 = var25;
            var25 = var37;
            var6 = var3;
            var85 = var47;
            var41 = (Integer)var46;
            var32 = var45;
            var45 = var176;
            var40 = var31;
            var44 = var147;
            var33 = var28;
            var31 = var27;
            var49 = var23;
            var23 = var32;
            var22 = (Integer)var33;
            var27 = (Integer)var34;
            var28 = var35;
            var50 = var36;
            var53 = var38;
            var34 = var39;
            var35 = var40;
            var37 = var41;
            var51 = var26;
            var39 = var20;
            var26 = (Integer)var85;
            var20 = var114;
            var47 = var101;
            var36 = var17;
            var54 = var106;
            var106 = var99;
            var52 = var81;
            var17 = var72;
            var38 = var78;
            var43 = var62;
            var3 = var69;
         }

         var59.b(var58);
         return new GuildEventInviteEmbedImpl(
            var4,
            var6,
            var7,
            var3,
            (CodedLinkExtendedType)var24,
            var64,
            (java.lang.String)var42,
            (InviteType)var43,
            var38,
            var17,
            var52,
            (java.lang.String)var106,
            (java.lang.String)var54,
            (java.lang.String)var36,
            (java.lang.String)var47,
            (java.lang.String)var20,
            var26,
            (java.lang.Boolean)var124,
            (java.lang.String)var19,
            (java.lang.String)var39,
            (StructurableText)var138,
            (java.lang.String)var51,
            (java.lang.Boolean)var46,
            (java.lang.String)var37,
            (java.lang.String)var35,
            (java.lang.String)var34,
            var53,
            (java.lang.Boolean)var25,
            (java.lang.String)var50,
            (java.lang.String)var28,
            var27,
            var22,
            (java.lang.String)var23,
            (java.lang.Boolean)var49,
            var31,
            (java.lang.String)var33,
            (java.lang.String)var29,
            var44,
            var40,
            var48,
            var45,
            (java.lang.String)var32,
            (java.lang.String)var30,
            var41,
            (java.lang.String)var85,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: GuildEventInviteEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         GuildEventInviteEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return al.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildEventInviteEmbedImpl> {
         return GuildEventInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
