package com.discord.chat.bridge.codedlinks

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import gn.h
import gn.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var41: Int = Integer.hashCode(this.backgroundColor);
      val var40: Int = Integer.hashCode(this.borderColor);
      val var38: Int = this.extendedType.hashCode();
      val var43: Int = Integer.hashCode(this.headerColor);
      val var42: Int = this.headerText.hashCode();
      val var39: Int = this.type.hashCode();
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
                                                                                                                                                                                                                                                                                                                                                                                       var41
                                                                                                                                                                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                                                                                                                                                                          + var40
                                                                                                                                                                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                                                                                                                                                                 + var38
                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                                                                                                                                                                        + var43
                                                                                                                                                                                                                                                                                                                                                                  )
                                                                                                                                                                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                                                                                                                                                                               + var42
                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                      + var39
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
      val var2: Int = this.backgroundColor;
      val var3: Int = this.borderColor;
      val var11: CodedLinkExtendedType = this.extendedType;
      val var1: Int = this.headerColor;
      val var33: java.lang.String = this.headerText;
      val var14: InviteType = this.type;
      val var6: Int = this.acceptLabelBackgroundColor;
      val var37: Int = this.acceptLabelBorderColor;
      val var19: Int = this.acceptLabelColor;
      val var41: java.lang.String = this.acceptLabelIcon;
      val var25: java.lang.String = this.acceptLabelText;
      val var28: java.lang.String = this.badgeCount;
      val var16: java.lang.String = this.badgeIcon;
      val var5: java.lang.String = this.bodyText;
      val var24: Int = this.bodyTextColor;
      val var21: java.lang.Boolean = this.canBeAccepted;
      val var12: java.lang.String = this.channelIcon;
      val var18: java.lang.String = this.channelName;
      val var27: StructurableText = this.content;
      val var30: java.lang.String = this.creatorAvatar;
      val var29: java.lang.Boolean = this.embedCanBeTapped;
      val var22: java.lang.String = this.guildIcon;
      val var13: java.lang.String = this.guildName;
      val var34: java.lang.String = this.headerIcon;
      val var43: Int = this.headerTextColor;
      val var42: java.lang.Boolean = this.isRsvped;
      val var36: java.lang.String = this.memberText;
      val var4: java.lang.String = this.onlineText;
      val var35: Int = this.resolvingGradientEnd;
      val var9: Int = this.resolvingGradientStart;
      val var15: java.lang.String = this.secondaryActionIcon;
      val var23: java.lang.Boolean = this.splashHasRadialGradient;
      val var8: Int = this.splashOpacity;
      val var26: java.lang.String = this.splashUrl;
      val var32: java.lang.String = this.inviteSplash;
      val var44: java.lang.String = this.subtitle;
      val var20: Int = this.subtitleColor;
      val var10: Int = this.thumbnailBackgroundColor;
      val var40: Int = this.thumbnailCornerRadius;
      val var17: java.lang.String = this.thumbnailText;
      val var7: java.lang.String = this.thumbnailUrl;
      val var39: Int = this.titleColor;
      val var38: java.lang.String = this.titleText;
      val var31: StringBuilder = new StringBuilder();
      var31.append("GuildEventInviteEmbedImpl(backgroundColor=");
      var31.append(var2);
      var31.append(", borderColor=");
      var31.append(var3);
      var31.append(", extendedType=");
      var31.append(var11);
      var31.append(", headerColor=");
      var31.append(var1);
      var31.append(", headerText=");
      var31.append(var33);
      var31.append(", type=");
      var31.append(var14);
      var31.append(", acceptLabelBackgroundColor=");
      var31.append(var6);
      var31.append(", acceptLabelBorderColor=");
      var31.append(var37);
      var31.append(", acceptLabelColor=");
      var31.append(var19);
      var31.append(", acceptLabelIcon=");
      var31.append(var41);
      var31.append(", acceptLabelText=");
      var31.append(var25);
      var31.append(", badgeCount=");
      var31.append(var28);
      var31.append(", badgeIcon=");
      var31.append(var16);
      var31.append(", bodyText=");
      var31.append(var5);
      var31.append(", bodyTextColor=");
      var31.append(var24);
      var31.append(", canBeAccepted=");
      var31.append(var21);
      var31.append(", channelIcon=");
      var31.append(var12);
      var31.append(", channelName=");
      var31.append(var18);
      var31.append(", content=");
      var31.append(var27);
      var31.append(", creatorAvatar=");
      var31.append(var30);
      var31.append(", embedCanBeTapped=");
      var31.append(var29);
      var31.append(", guildIcon=");
      var31.append(var22);
      var31.append(", guildName=");
      var31.append(var13);
      var31.append(", headerIcon=");
      var31.append(var34);
      var31.append(", headerTextColor=");
      var31.append(var43);
      var31.append(", isRsvped=");
      var31.append(var42);
      var31.append(", memberText=");
      var31.append(var36);
      var31.append(", onlineText=");
      var31.append(var4);
      var31.append(", resolvingGradientEnd=");
      var31.append(var35);
      var31.append(", resolvingGradientStart=");
      var31.append(var9);
      var31.append(", secondaryActionIcon=");
      var31.append(var15);
      var31.append(", splashHasRadialGradient=");
      var31.append(var23);
      var31.append(", splashOpacity=");
      var31.append(var8);
      var31.append(", splashUrl=");
      var31.append(var26);
      var31.append(", inviteSplash=");
      var31.append(var32);
      var31.append(", subtitle=");
      var31.append(var44);
      var31.append(", subtitleColor=");
      var31.append(var20);
      var31.append(", thumbnailBackgroundColor=");
      var31.append(var10);
      var31.append(", thumbnailCornerRadius=");
      var31.append(var40);
      var31.append(", thumbnailText=");
      var31.append(var17);
      var31.append(", thumbnailUrl=");
      var31.append(var7);
      var31.append(", titleColor=");
      var31.append(var39);
      var31.append(", titleText=");
      var31.append(var38);
      var31.append(")");
      return var31.toString();
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
         val var4: n0 = n0.a;
         val var12: CodedLinkExtendedType.Serializer = CodedLinkExtendedType.Serializer.INSTANCE;
         val var1: b2 = b2.a;
         val var6: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var2: KSerializer = a.u(n0.a);
         val var14: KSerializer = a.u(var4);
         val var3: KSerializer = a.u(var4);
         val var7: KSerializer = a.u(var1);
         val var8: KSerializer = a.u(var1);
         val var13: KSerializer = a.u(var1);
         val var10: KSerializer = a.u(var1);
         val var5: KSerializer = a.u(var1);
         val var9: KSerializer = a.u(var4);
         val var11: h = h.a;
         return new KSerializer[]{
            var4,
            var4,
            var12,
            var4,
            var1,
            var6,
            var2,
            var14,
            var3,
            var7,
            var8,
            var13,
            var10,
            var5,
            var9,
            a.u(h.a),
            a.u(var1),
            a.u(var1),
            a.u(StructurableTextSerializer.INSTANCE),
            a.u(var1),
            a.u(var11),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var4),
            a.u(var11),
            a.u(var1),
            a.u(var1),
            a.u(var4),
            a.u(var4),
            a.u(var1),
            a.u(var11),
            a.u(var4),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var4),
            a.u(var4),
            a.u(var4),
            a.u(var1),
            a.u(var1),
            a.u(var4),
            a.u(var1)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildEventInviteEmbedImpl {
         q.h(var1, "decoder");
         val var58: SerialDescriptor = this.getDescriptor();
         val var59: c = var1.b(var58);
         var var4: Int;
         var var5: Int;
         var var6: Int;
         var var7: Int;
         var var12: Any;
         var var18: Int;
         var var19: Any;
         var var21: Any;
         var var22: Int;
         var var23: Int;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         var var27: Any;
         var var28: Int;
         var var29: Any;
         var var30: Int;
         var var31: Any;
         var var32: Int;
         var var33: Any;
         var var34: Any;
         var var35: Int;
         var var36: Any;
         var var37: Int;
         var var38: Any;
         var var39: Any;
         var var40: Int;
         var var41: Any;
         var var42: Any;
         var var43: Int;
         var var44: Any;
         var var45: Any;
         var var46: Int;
         var var47: Any;
         var var48: Any;
         var var49: Any;
         val var50: Int;
         val var51: java.lang.String;
         val var52: Any;
         val var53: Any;
         val var54: Any;
         var var64: Int;
         var var107: Any;
         var var113: Any;
         var var131: Any;
         if (var59.p()) {
            var7 = var59.i(var58, 0);
            var64 = var59.i(var58, 1);
            var24 = var59.y(var58, 2, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var3: Int = var59.i(var58, 3);
            var42 = var59.m(var58, 4);
            var38 = var59.y(var58, 5, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var60: n0 = n0.a;
            var18 = var59.n(var58, 6, n0.a, null) as Int;
            var50 = var59.n(var58, 7, var60, null) as Int;
            var107 = var59.n(var58, 8, var60, null) as Int;
            val var9: b2 = b2.a;
            var26 = var59.n(var58, 9, b2.a, null) as java.lang.String;
            var113 = var59.n(var58, 10, var9, null) as java.lang.String;
            var21 = var59.n(var58, 11, var9, null) as java.lang.String;
            var49 = var59.n(var58, 12, var9, null) as java.lang.String;
            var131 = var59.n(var58, 13, var9, null) as java.lang.String;
            var43 = var59.n(var58, 14, var60, null) as Int;
            val var10: h = h.a;
            var52 = var59.n(var58, 15, h.a, null) as java.lang.Boolean;
            var19 = var59.n(var58, 16, var9, null) as java.lang.String;
            val var17: java.lang.String = var59.n(var58, 17, var9, null) as java.lang.String;
            var12 = var59.n(var58, 18, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            val var13: java.lang.String = var59.n(var58, 19, var9, null) as java.lang.String;
            val var14: java.lang.Boolean = var59.n(var58, 20, var10, null) as java.lang.Boolean;
            var36 = var59.n(var58, 21, var9, null) as java.lang.String;
            var48 = var59.n(var58, 22, var9, null) as java.lang.String;
            var33 = var59.n(var58, 23, var9, null) as java.lang.String;
            var40 = var59.n(var58, 24, var60, null) as Int;
            var54 = var59.n(var58, 25, var10, null) as java.lang.Boolean;
            var27 = var59.n(var58, 26, var9, null) as java.lang.String;
            var25 = var59.n(var58, 27, var9, null) as java.lang.String;
            var23 = var59.n(var58, 28, var60, null) as Int;
            var28 = var59.n(var58, 29, var60, null) as Int;
            var53 = var59.n(var58, 30, var9, null) as java.lang.String;
            val var11: java.lang.Boolean = var59.n(var58, 31, var10, null) as java.lang.Boolean;
            val var76: Int = var59.n(var58, 32, var60, null) as Int;
            var29 = var59.n(var58, 33, var9, null) as java.lang.String;
            var34 = var59.n(var58, 34, var9, null) as java.lang.String;
            var51 = var59.n(var58, 35, var9, null) as java.lang.String;
            var30 = var59.n(var58, 36, var60, null) as Int;
            var46 = var59.n(var58, 37, var60, null) as Int;
            var32 = var59.n(var58, 38, var60, null) as Int;
            var41 = var59.n(var58, 39, var9, null) as java.lang.String;
            var31 = var59.n(var58, 40, var9, null) as java.lang.String;
            val var61: Int = var59.n(var58, 41, var60, null) as Int;
            val var71: java.lang.String = var59.n(var58, 42, var9, null) as java.lang.String;
            var5 = 2047;
            var4 = -1;
            var6 = var64;
            var64 = var3;
            var37 = (Integer)var107;
            var107 = var113;
            var113 = var131;
            var131 = var17;
            var45 = var13;
            var44 = var14;
            var47 = var11;
            var35 = var76;
            var22 = var61;
            var39 = var71;
         } else {
            var var8: Boolean = true;
            var var68: Int = 0;
            var7 = 0;
            var6 = 0;
            var5 = 0;
            var var147: java.lang.String = null;
            var30 = null;
            var31 = null;
            var29 = null;
            var28 = null;
            var23 = null;
            var47 = null;
            var46 = null;
            var45 = null;
            var44 = null;
            var43 = null;
            var42 = null;
            var24 = null;
            var var62: Any = null;
            var var77: Int = null;
            var var72: Int = null;
            var var80: Int = null;
            var var99: Any = null;
            var107 = null;
            var var118: Any = null;
            var var102: Any = null;
            var113 = null;
            var12 = null;
            var18 = null;
            var19 = null;
            var131 = null;
            var21 = null;
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
                                       var64 = var59.o(var58);
                                       switch (var64) {
                                          case -1:
                                             var64 = var4;
                                             var8 = false;
                                             break label124;
                                          case 0:
                                             var7 = var59.i(var58, 0);
                                             var64 = var4 or 1;
                                             break label124;
                                          case 1:
                                             var5 = var59.i(var58, 1);
                                             var64 = var4 or 2;
                                             break label124;
                                          case 2:
                                             var24 = var59.y(var58, 2, CodedLinkExtendedType.Serializer.INSTANCE, var24) as CodedLinkExtendedType;
                                             var64 = var4 or 4;
                                             break label126;
                                          case 3:
                                             var99 = var102;
                                             var80 = var18;
                                             var77 = (Integer)var19;
                                             var72 = (Integer)var131;
                                             var21 = var12;
                                             var6 = var59.i(var58, 3);
                                             var64 = var4 or 8;
                                             var102 = var62;
                                             var62 = var21;
                                             var12 = var113;
                                             var107 = var77;
                                             var113 = var72;
                                             var118 = var80;
                                             var18 = (Integer)var99;
                                             var19 = var107;
                                             var131 = var118;
                                             break label125;
                                          case 4:
                                             var42 = var59.m(var58, 4);
                                             var64 = var4 or 16;
                                             break label107;
                                          case 5:
                                             var62 = var59.y(var58, 5, InviteType.Serializer.INSTANCE, var62) as InviteType;
                                             var64 = var4 or 32;
                                             break label107;
                                          case 6:
                                             var99 = var102;
                                             var80 = var18;
                                             var21 = var12;
                                             var107 = var59.n(var58, 6, n0.a, var77) as Int;
                                             var64 = var4 or 64;
                                             var62 = var21;
                                             var72 = (Integer)var131;
                                             var77 = (Integer)var19;
                                             var12 = var113;
                                             var102 = var62;
                                             var113 = var72;
                                             var118 = var80;
                                             var18 = (Integer)var99;
                                             var19 = var107;
                                             var131 = var118;
                                             break label125;
                                          case 7:
                                             var99 = var102;
                                             var21 = var12;
                                             var118 = var80;
                                             val var137: Int = var59.n(var58, 7, n0.a, var72) as Int;
                                             var64 = var4 or 128;
                                             var62 = var21;
                                             var72 = (Integer)var131;
                                             var77 = (Integer)var19;
                                             var80 = var18;
                                             var12 = var113;
                                             var102 = var62;
                                             var107 = var77;
                                             var113 = var137;
                                             var18 = (Integer)var99;
                                             var19 = var107;
                                             var131 = var118;
                                             break label125;
                                          case 8:
                                             var21 = var12;
                                             var18 = (Integer)var99;
                                             var118 = var59.n(var58, 8, n0.a, var80) as Int;
                                             var64 = var4 or 256;
                                             var62 = var21;
                                             var72 = (Integer)var131;
                                             var77 = (Integer)var19;
                                             var80 = var18;
                                             var12 = var113;
                                             var99 = var102;
                                             var102 = var62;
                                             var107 = var77;
                                             var113 = var72;
                                             var19 = var107;
                                             var131 = var118;
                                             break label125;
                                          case 9:
                                             var21 = var12;
                                             var19 = var107;
                                             val var136: java.lang.String = var59.n(var58, 9, b2.a, var99) as java.lang.String;
                                             var64 = var4 or 512;
                                             var62 = var21;
                                             var72 = (Integer)var131;
                                             var77 = (Integer)var19;
                                             var80 = var18;
                                             var12 = var113;
                                             var99 = var102;
                                             var102 = var62;
                                             var107 = var77;
                                             var113 = var72;
                                             var118 = var80;
                                             var18 = var136;
                                             var131 = var118;
                                             break label125;
                                          case 10:
                                             var21 = var12;
                                             var131 = var118;
                                             var19 = var59.n(var58, 10, b2.a, var107) as java.lang.String;
                                             var64 = var4 or 1024;
                                             var107 = var77;
                                             var118 = var80;
                                             var62 = var21;
                                             var72 = (Integer)var131;
                                             var77 = (Integer)var19;
                                             var80 = var18;
                                             var12 = var113;
                                             var99 = var102;
                                             var102 = var62;
                                             var113 = var72;
                                             var18 = (Integer)var99;
                                             break label125;
                                          case 11:
                                             var21 = var12;
                                             var131 = var59.n(var58, 11, b2.a, var118) as java.lang.String;
                                             var64 = var4 or 2048;
                                             var62 = var21;
                                             var72 = (Integer)var131;
                                             var77 = (Integer)var19;
                                             var80 = var18;
                                             var12 = var113;
                                             var99 = var102;
                                             var102 = var62;
                                             var107 = var77;
                                             var113 = var72;
                                             var118 = var80;
                                             var18 = (Integer)var99;
                                             var19 = var107;
                                             break label125;
                                          case 12:
                                             var21 = var12;
                                             var12 = var113;
                                             var102 = var59.n(var58, 12, b2.a, var102) as java.lang.String;
                                             var64 = var4 or 4096;
                                             var113 = var72;
                                             var62 = var21;
                                             var72 = (Integer)var131;
                                             var77 = (Integer)var19;
                                             var80 = var18;
                                             var99 = var102;
                                             var102 = var62;
                                             var107 = var77;
                                             var118 = var80;
                                             var18 = (Integer)var99;
                                             var19 = var107;
                                             var131 = var118;
                                             break label125;
                                          case 13:
                                             var21 = var12;
                                             var12 = var59.n(var58, 13, b2.a, var113) as java.lang.String;
                                             var64 = var4 or 8192;
                                             var99 = var102;
                                             var62 = var21;
                                             var72 = (Integer)var131;
                                             var77 = (Integer)var19;
                                             var80 = var18;
                                             var102 = var62;
                                             var107 = var77;
                                             var113 = var72;
                                             var118 = var80;
                                             var18 = (Integer)var99;
                                             var19 = var107;
                                             var131 = var118;
                                             break label125;
                                          case 14:
                                             var21 = var59.n(var58, 14, n0.a, var12) as Int;
                                             var64 = var4 or 16384;
                                             var99 = var102;
                                             var12 = var113;
                                             var62 = var21;
                                             var72 = (Integer)var131;
                                             var77 = (Integer)var19;
                                             var80 = var18;
                                             var102 = var62;
                                             var107 = var77;
                                             var113 = var72;
                                             var118 = var80;
                                             var18 = (Integer)var99;
                                             var19 = var107;
                                             var131 = var118;
                                             break label125;
                                          case 15:
                                             val var342: java.lang.Boolean = var59.n(var58, 15, h.a, var18) as java.lang.Boolean;
                                             var64 = var4 or '耀';
                                             var99 = var102;
                                             var62 = var21;
                                             var72 = (Integer)var131;
                                             var77 = (Integer)var19;
                                             var80 = var342;
                                             var12 = var113;
                                             var102 = var62;
                                             var107 = var77;
                                             var113 = var72;
                                             var118 = var80;
                                             var18 = (Integer)var99;
                                             var19 = var107;
                                             var131 = var118;
                                             var21 = var12;
                                             break label125;
                                          case 16:
                                             val var341: java.lang.String = var59.n(var58, 16, b2.a, var19) as java.lang.String;
                                             var64 = var4 or 65536;
                                             var19 = var107;
                                             var99 = var102;
                                             var80 = var18;
                                             var62 = var21;
                                             var72 = (Integer)var131;
                                             var77 = var341;
                                             var12 = var113;
                                             var102 = var62;
                                             var107 = var77;
                                             var113 = var72;
                                             var118 = var80;
                                             var18 = (Integer)var99;
                                             var131 = var118;
                                             var21 = var12;
                                             break label125;
                                          case 17:
                                             val var340: java.lang.String = var59.n(var58, 17, b2.a, var131) as java.lang.String;
                                             var64 = var4 or 131072;
                                             var99 = var102;
                                             var80 = var18;
                                             var77 = (Integer)var19;
                                             var62 = var21;
                                             var72 = var340;
                                             var12 = var113;
                                             var102 = var62;
                                             var107 = var77;
                                             var113 = var72;
                                             var118 = var80;
                                             var18 = (Integer)var99;
                                             var19 = var107;
                                             var131 = var118;
                                             var21 = var12;
                                             break label125;
                                          case 18:
                                             var48 = var59.n(var58, 18, StructurableTextSerializer.INSTANCE, var21) as StructurableText;
                                             var64 = var4 or 262144;
                                             var99 = var102;
                                             var21 = var12;
                                             var131 = var118;
                                             var19 = var107;
                                             var18 = (Integer)var99;
                                             var118 = var80;
                                             var113 = var72;
                                             var107 = var77;
                                             var102 = var62;
                                             var12 = var113;
                                             var80 = var18;
                                             var77 = (Integer)var19;
                                             var72 = (Integer)var131;
                                             var62 = var48;
                                             break label125;
                                          case 19:
                                             var26 = var59.n(var58, 19, b2.a, var26) as java.lang.String;
                                             var64 = var4 or 524288;
                                             break label126;
                                          case 20:
                                             val var57: java.lang.Boolean = var59.n(var58, 20, h.a, var25) as java.lang.Boolean;
                                             var64 = var4 or 1048576;
                                             var99 = var102;
                                             var80 = var18;
                                             var72 = (Integer)var131;
                                             var62 = var21;
                                             var25 = var147;
                                             var48 = var27;
                                             var22 = (Integer)var24;
                                             var23 = (Integer)var19;
                                             var77 = var57;
                                             var12 = var113;
                                             var102 = var62;
                                             var107 = var77;
                                             var113 = var72;
                                             var118 = var80;
                                             var18 = (Integer)var99;
                                             var19 = var107;
                                             var131 = var118;
                                             var21 = var12;
                                             var24 = var23;
                                             break label159;
                                          case 21:
                                             var41 = var59.n(var58, 21, b2.a, var41) as java.lang.String;
                                             var64 = var4 or 2097152;
                                             break label108;
                                          case 22:
                                             var40 = var59.n(var58, 22, b2.a, var40) as java.lang.String;
                                             var64 = var4 or 4194304;
                                             break label108;
                                          case 23:
                                             var39 = var59.n(var58, 23, b2.a, var39) as java.lang.String;
                                             var64 = var4 or 8388608;
                                             break label108;
                                          case 24:
                                             var38 = var59.n(var58, 24, n0.a, var38) as Int;
                                             var64 = var4 or 16777216;
                                             break label108;
                                          case 25:
                                             var37 = var59.n(var58, 25, h.a, var37) as java.lang.Boolean;
                                             var64 = var4 or 33554432;
                                             break label108;
                                          case 26:
                                             var36 = var59.n(var58, 26, b2.a, var36) as java.lang.String;
                                             var64 = var4 or 67108864;
                                             break label108;
                                          case 27:
                                             var35 = var59.n(var58, 27, b2.a, var35) as java.lang.String;
                                             var64 = var4 or 134217728;
                                             break label108;
                                          case 28:
                                             var34 = var59.n(var58, 28, n0.a, var34) as Int;
                                             var64 = var4 or 268435456;
                                             break label108;
                                          case 29:
                                             var33 = var59.n(var58, 29, n0.a, var33) as Int;
                                             var64 = var4 or 536870912;
                                             break label108;
                                          case 30:
                                             var32 = var59.n(var58, 30, b2.a, var32) as java.lang.String;
                                             var64 = var4 or 1073741824;
                                             break label108;
                                          case 31:
                                             var23 = var59.n(var58, 31, h.a, var23) as java.lang.Boolean;
                                             var64 = var4 or Integer.MIN_VALUE;
                                             break label108;
                                          case 32:
                                             var27 = var59.n(var58, 32, n0.a, var27) as Int;
                                             var64 = var68 or 1;
                                             break;
                                          case 33:
                                             var28 = var59.n(var58, 33, b2.a, var28) as java.lang.String;
                                             var64 = var68 or 2;
                                             break;
                                          case 34:
                                             var29 = var59.n(var58, 34, b2.a, var29) as java.lang.String;
                                             var64 = var68 or 4;
                                             break;
                                          case 35:
                                             var147 = var59.n(var58, 35, b2.a, var147) as java.lang.String;
                                             var64 = var68 or 8;
                                             break;
                                          case 36:
                                             var30 = var59.n(var58, 36, n0.a, var30) as Int;
                                             var64 = var68 or 16;
                                             break;
                                          case 37:
                                             var43 = var59.n(var58, 37, n0.a, var43) as Int;
                                             var64 = var68 or 32;
                                             var48 = var147;
                                             var49 = var27;
                                             break label160;
                                          case 38:
                                             var44 = var59.n(var58, 38, n0.a, var44) as Int;
                                             var64 = var68 or 64;
                                             var48 = var147;
                                             var49 = var27;
                                             break label160;
                                          case 39:
                                             var45 = var59.n(var58, 39, b2.a, var45) as java.lang.String;
                                             var64 = var68 or 128;
                                             var48 = var147;
                                             var49 = var27;
                                             break label160;
                                          case 40:
                                             var31 = var59.n(var58, 40, b2.a, var31) as java.lang.String;
                                             var64 = var68 or 256;
                                             break;
                                          case 41:
                                             var46 = var59.n(var58, 41, n0.a, var46) as Int;
                                             var64 = var68 or 512;
                                             var48 = var147;
                                             var49 = var27;
                                             break label160;
                                          case 42:
                                             var47 = var59.n(var58, 42, b2.a, var47) as java.lang.String;
                                             var64 = var68 or 1024;
                                             var49 = var27;
                                             var48 = var147;
                                             break label160;
                                          default:
                                             throw new n(var64);
                                       }

                                       var48 = var147;
                                       var49 = var27;
                                       break label160;
                                    }

                                    var118 = var80;
                                    var107 = var77;
                                    var99 = var102;
                                    var12 = var113;
                                    var80 = var18;
                                    var77 = (Integer)var19;
                                    var72 = (Integer)var131;
                                    var102 = var62;
                                    var62 = var21;
                                    var113 = var72;
                                    var18 = (Integer)var99;
                                    var19 = var107;
                                    var131 = var118;
                                    var21 = var12;
                                    break label125;
                                 }

                                 var48 = var147;
                                 var22 = (Integer)var27;
                                 var27 = var23;
                                 break label127;
                              }

                              var68 = var64;
                              var27 = var23;
                              var64 = var4;
                              var22 = (Integer)var49;
                              break label127;
                           }

                           var118 = var80;
                           var107 = var77;
                           var99 = var102;
                           var12 = var113;
                           var80 = var18;
                           var72 = (Integer)var131;
                           var62 = var21;
                           var77 = (Integer)var25;
                           var25 = var147;
                           var48 = var27;
                           var22 = (Integer)var24;
                           var23 = (Integer)var19;
                           var102 = var62;
                           var113 = var72;
                           var18 = (Integer)var99;
                           var19 = var107;
                           var131 = var118;
                           var21 = var12;
                           var24 = var23;
                           break label159;
                        }

                        var25 = var147;
                        var48 = var27;
                        var22 = (Integer)var24;
                        var23 = var77;
                        var77 = (Integer)var25;
                        var24 = var23;
                        break label159;
                     }

                     var118 = var80;
                     var107 = var77;
                     var99 = var102;
                     var12 = var113;
                     var77 = (Integer)var25;
                     var80 = var18;
                     var72 = (Integer)var131;
                     var62 = var21;
                     var25 = var147;
                     var48 = var27;
                     var22 = (Integer)var24;
                     var23 = (Integer)var19;
                     var102 = var62;
                     var113 = var72;
                     var18 = (Integer)var99;
                     var19 = var107;
                     var131 = var118;
                     var21 = var12;
                     var24 = var23;
                     break label159;
                  }

                  var118 = var80;
                  var107 = var77;
                  var99 = var102;
                  var77 = (Integer)var25;
                  var80 = var18;
                  var72 = (Integer)var131;
                  var62 = var21;
                  var21 = var12;
                  var25 = var48;
                  var48 = var22;
                  var22 = (Integer)var24;
                  var23 = (Integer)var19;
                  var12 = var113;
                  var102 = var62;
                  var113 = var72;
                  var18 = (Integer)var99;
                  var19 = var107;
                  var131 = var118;
                  var24 = var27;
               }

               var62 = var102;
               var72 = (Integer)var113;
               var107 = var19;
               var118 = var131;
               var23 = (Integer)var24;
               var147 = (java.lang.String)var25;
               var27 = var48;
               var4 = var64;
               var24 = var22;
               var77 = (Integer)var107;
               var80 = (Integer)var118;
               var99 = var18;
               var102 = var99;
               var113 = var12;
               var12 = var21;
               var18 = var80;
               var19 = var23;
               var131 = var72;
               var21 = var62;
               var25 = var77;
            }

            var46 = var43;
            var51 = var147;
            var64 = var6;
            var44 = var25;
            var43 = (Integer)var12;
            var25 = var35;
            var53 = var32;
            var39 = var47;
            var22 = var46;
            var41 = var45;
            var32 = (Integer)var44;
            var34 = var29;
            var29 = var28;
            var35 = (Integer)var27;
            var47 = var23;
            var28 = (Integer)var33;
            var23 = (Integer)var34;
            var27 = var36;
            var54 = var37;
            var40 = (Integer)var38;
            var33 = var39;
            var48 = var40;
            var36 = var41;
            var45 = var26;
            var12 = var21;
            var52 = var18;
            var49 = var102;
            var21 = var118;
            var26 = var99;
            var37 = var80;
            var50 = var72;
            var18 = var77;
            var38 = var62;
            var6 = var5;
            var5 = var68;
         }

         var59.c(var58);
         return new GuildEventInviteEmbedImpl(
            var4,
            var5,
            var7,
            var6,
            (CodedLinkExtendedType)var24,
            var64,
            (java.lang.String)var42,
            (InviteType)var38,
            var18,
            var50,
            var37,
            (java.lang.String)var26,
            (java.lang.String)var107,
            (java.lang.String)var21,
            (java.lang.String)var49,
            (java.lang.String)var113,
            var43,
            (java.lang.Boolean)var52,
            (java.lang.String)var19,
            (java.lang.String)var131,
            (StructurableText)var12,
            (java.lang.String)var45,
            (java.lang.Boolean)var44,
            (java.lang.String)var36,
            (java.lang.String)var48,
            (java.lang.String)var33,
            var40,
            (java.lang.Boolean)var54,
            (java.lang.String)var27,
            (java.lang.String)var25,
            var23,
            var28,
            (java.lang.String)var53,
            (java.lang.Boolean)var47,
            var35,
            (java.lang.String)var29,
            (java.lang.String)var34,
            var51,
            var30,
            var46,
            var32,
            (java.lang.String)var41,
            (java.lang.String)var31,
            var22,
            (java.lang.String)var39,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: GuildEventInviteEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         GuildEventInviteEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildEventInviteEmbedImpl> {
         return GuildEventInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
