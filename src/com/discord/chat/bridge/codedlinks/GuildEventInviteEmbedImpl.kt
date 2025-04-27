package com.discord.chat.bridge.codedlinks

import ca.f
import ca.n
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import da.a
import fa.C0
import fa.G
import fa.N
import fa.h
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
      titleText: String? = null,
      badgeIconUrl: String? = null
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
   public open val badgeIconUrl: String?
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
      this.badgeIconUrl = var44;
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

   public operator fun component44(): String? {
      return this.badgeIconUrl;
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
      titleText: String? = var0.titleText,
      badgeIconUrl: String? = var0.badgeIconUrl
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
         var43,
         var44
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
         } else if (!q.c(this.titleText, var1.titleText)) {
            return false;
         } else {
            return q.c(this.badgeIconUrl, var1.badgeIconUrl);
         }
      }
   }

   public override fun hashCode(): Int {
      val var43: Int = Integer.hashCode(this.backgroundColor);
      val var41: Int = Integer.hashCode(this.borderColor);
      val var40: Int = this.extendedType.hashCode();
      val var42: Int = Integer.hashCode(this.headerColor);
      val var39: Int = this.headerText.hashCode();
      val var44: Int = this.type.hashCode();
      var var38: Int = 0;
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

      val var37: Int;
      if (this.titleText == null) {
         var37 = 0;
      } else {
         var37 = this.titleText.hashCode();
      }

      if (this.badgeIconUrl != null) {
         var38 = this.badgeIconUrl.hashCode();
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
                                                                                                                                                                                                                                                                                                                                                                                       (
                                                                                                                                                                                                                                                                                                                                                                                                var43
                                                                                                                                                                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                                                                                                                                                                   + var41
                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                                                                                                                                                                          + var40
                                                                                                                                                                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                                                                                                                                                                 + var42
                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                                                                                                                                                                        + var39
                                                                                                                                                                                                                                                                                                                                                                  )
                                                                                                                                                                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                                                                                                                                                                               + var44
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
                  + var37
            )
            * 31
         + var38;
   }

   public override fun toString(): String {
      val var3: Int = this.backgroundColor;
      val var1: Int = this.borderColor;
      val var27: CodedLinkExtendedType = this.extendedType;
      val var2: Int = this.headerColor;
      val var41: java.lang.String = this.headerText;
      val var42: InviteType = this.type;
      val var37: Int = this.acceptLabelBackgroundColor;
      val var10: Int = this.acceptLabelBorderColor;
      val var39: Int = this.acceptLabelColor;
      val var32: java.lang.String = this.acceptLabelIcon;
      val var14: java.lang.String = this.acceptLabelText;
      val var22: java.lang.String = this.badgeCount;
      val var35: java.lang.String = this.badgeIcon;
      val var9: java.lang.String = this.bodyText;
      val var4: Int = this.bodyTextColor;
      val var20: java.lang.Boolean = this.canBeAccepted;
      val var15: java.lang.String = this.channelIcon;
      val var33: java.lang.String = this.channelName;
      val var29: StructurableText = this.content;
      val var24: java.lang.String = this.creatorAvatar;
      val var26: java.lang.Boolean = this.embedCanBeTapped;
      val var36: java.lang.String = this.guildIcon;
      val var23: java.lang.String = this.guildName;
      val var43: java.lang.String = this.headerIcon;
      val var17: Int = this.headerTextColor;
      val var38: java.lang.Boolean = this.isRsvped;
      val var7: java.lang.String = this.memberText;
      val var5: java.lang.String = this.onlineText;
      val var8: Int = this.resolvingGradientEnd;
      val var25: Int = this.resolvingGradientStart;
      val var31: java.lang.String = this.secondaryActionIcon;
      val var28: java.lang.Boolean = this.splashHasRadialGradient;
      val var44: Int = this.splashOpacity;
      val var30: java.lang.String = this.splashUrl;
      val var13: java.lang.String = this.inviteSplash;
      val var16: java.lang.String = this.subtitle;
      val var40: Int = this.subtitleColor;
      val var11: Int = this.thumbnailBackgroundColor;
      val var12: Int = this.thumbnailCornerRadius;
      val var45: java.lang.String = this.thumbnailText;
      val var21: java.lang.String = this.thumbnailUrl;
      val var19: Int = this.titleColor;
      val var34: java.lang.String = this.titleText;
      val var18: java.lang.String = this.badgeIconUrl;
      val var6: StringBuilder = new StringBuilder();
      var6.append("GuildEventInviteEmbedImpl(backgroundColor=");
      var6.append(var3);
      var6.append(", borderColor=");
      var6.append(var1);
      var6.append(", extendedType=");
      var6.append(var27);
      var6.append(", headerColor=");
      var6.append(var2);
      var6.append(", headerText=");
      var6.append(var41);
      var6.append(", type=");
      var6.append(var42);
      var6.append(", acceptLabelBackgroundColor=");
      var6.append(var37);
      var6.append(", acceptLabelBorderColor=");
      var6.append(var10);
      var6.append(", acceptLabelColor=");
      var6.append(var39);
      var6.append(", acceptLabelIcon=");
      var6.append(var32);
      var6.append(", acceptLabelText=");
      var6.append(var14);
      var6.append(", badgeCount=");
      var6.append(var22);
      var6.append(", badgeIcon=");
      var6.append(var35);
      var6.append(", bodyText=");
      var6.append(var9);
      var6.append(", bodyTextColor=");
      var6.append(var4);
      var6.append(", canBeAccepted=");
      var6.append(var20);
      var6.append(", channelIcon=");
      var6.append(var15);
      var6.append(", channelName=");
      var6.append(var33);
      var6.append(", content=");
      var6.append(var29);
      var6.append(", creatorAvatar=");
      var6.append(var24);
      var6.append(", embedCanBeTapped=");
      var6.append(var26);
      var6.append(", guildIcon=");
      var6.append(var36);
      var6.append(", guildName=");
      var6.append(var23);
      var6.append(", headerIcon=");
      var6.append(var43);
      var6.append(", headerTextColor=");
      var6.append(var17);
      var6.append(", isRsvped=");
      var6.append(var38);
      var6.append(", memberText=");
      var6.append(var7);
      var6.append(", onlineText=");
      var6.append(var5);
      var6.append(", resolvingGradientEnd=");
      var6.append(var8);
      var6.append(", resolvingGradientStart=");
      var6.append(var25);
      var6.append(", secondaryActionIcon=");
      var6.append(var31);
      var6.append(", splashHasRadialGradient=");
      var6.append(var28);
      var6.append(", splashOpacity=");
      var6.append(var44);
      var6.append(", splashUrl=");
      var6.append(var30);
      var6.append(", inviteSplash=");
      var6.append(var13);
      var6.append(", subtitle=");
      var6.append(var16);
      var6.append(", subtitleColor=");
      var6.append(var40);
      var6.append(", thumbnailBackgroundColor=");
      var6.append(var11);
      var6.append(", thumbnailCornerRadius=");
      var6.append(var12);
      var6.append(", thumbnailText=");
      var6.append(var45);
      var6.append(", thumbnailUrl=");
      var6.append(var21);
      var6.append(", titleColor=");
      var6.append(var19);
      var6.append(", titleText=");
      var6.append(var34);
      var6.append(", badgeIconUrl=");
      var6.append(var18);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: GuildEventInviteEmbedImpl.$serializer = new GuildEventInviteEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl", var0, 44
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
         var1.l("badgeIconUrl", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var14: N = N.a;
         val var25: C0 = C0.a;
         val var7: KSerializer = a.u(N.a);
         val var15: KSerializer = a.u(var14);
         val var1: KSerializer = a.u(var14);
         val var5: KSerializer = a.u(var25);
         val var11: KSerializer = a.u(var25);
         val var8: KSerializer = a.u(var25);
         val var2: KSerializer = a.u(var25);
         val var19: KSerializer = a.u(var25);
         val var26: KSerializer = a.u(var14);
         val var28: h = h.a;
         return new KSerializer[]{
            var14,
            var14,
            CodedLinkExtendedType.Serializer.INSTANCE,
            var14,
            var25,
            InviteType.Serializer.INSTANCE,
            var7,
            var15,
            var1,
            var5,
            var11,
            var8,
            var2,
            var19,
            var26,
            a.u(h.a),
            a.u(var25),
            a.u(var25),
            a.u(StructurableTextSerializer.INSTANCE),
            a.u(var25),
            a.u(var28),
            a.u(var25),
            a.u(var25),
            a.u(var25),
            a.u(var14),
            a.u(var28),
            a.u(var25),
            a.u(var25),
            a.u(var14),
            a.u(var14),
            a.u(var25),
            a.u(var28),
            a.u(var14),
            a.u(var25),
            a.u(var25),
            a.u(var25),
            a.u(var14),
            a.u(var14),
            a.u(var14),
            a.u(var25),
            a.u(var25),
            a.u(var14),
            a.u(var25),
            a.u(var25)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildEventInviteEmbedImpl {
         q.h(var1, "decoder");
         val var62: SerialDescriptor = this.getDescriptor();
         val var63: c = var1.c(var62);
         val var9: Boolean = var63.y();
         var var8: Int = 0;
         var var53: Int = null;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var12: Int;
         var var13: java.lang.String;
         var var18: Any;
         var var20: Any;
         var var21: Any;
         var var25: java.lang.String;
         var var27: Any;
         var var28: java.lang.String;
         var var29: Any;
         var var30: Any;
         var var31: java.lang.String;
         var var32: Any;
         var var33: java.lang.String;
         var var34: java.lang.String;
         var var35: java.lang.String;
         var var36: java.lang.String;
         var var37: java.lang.String;
         var var38: Any;
         var var39: Any;
         var var40: Any;
         var var41: Any;
         var var42: java.lang.String;
         var var43: java.lang.String;
         var var44: java.lang.String;
         var var45: java.lang.String;
         var var46: Any;
         var var48: java.lang.String;
         var var49: Any;
         var var50: java.lang.String;
         var var51: java.lang.String;
         var var52: Any;
         var var54: Any;
         val var55: java.lang.String;
         val var56: java.lang.String;
         val var57: Any;
         val var65: java.lang.String;
         var var68: Int;
         var var74: java.lang.String;
         var var103: Any;
         var var111: Any;
         var var348: java.lang.String;
         val var354: java.lang.String;
         if (var9) {
            var3 = var63.k(var62, 0);
            var68 = var63.k(var62, 1);
            var40 = var63.m(var62, 2, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var6: Int = var63.k(var62, 3);
            var42 = var63.t(var62, 4);
            var30 = var63.m(var62, 5, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var10: N = N.a;
            var29 = var63.v(var62, 6, N.a, null) as Int;
            var54 = var63.v(var62, 7, var10, null) as Int;
            var32 = var63.v(var62, 8, var10, null) as Int;
            val var64: C0 = C0.a;
            var35 = var63.v(var62, 9, C0.a, null) as java.lang.String;
            val var26: java.lang.String = var63.v(var62, 10, var64, null) as java.lang.String;
            var55 = var63.v(var62, 11, var64, null) as java.lang.String;
            var31 = var63.v(var62, 12, var64, null) as java.lang.String;
            var50 = var63.v(var62, 13, var64, null) as java.lang.String;
            var39 = var63.v(var62, 14, var10, null) as Int;
            val var11: h = h.a;
            var27 = var63.v(var62, 15, h.a, null) as java.lang.Boolean;
            var37 = var63.v(var62, 16, var64, null) as java.lang.String;
            var34 = var63.v(var62, 17, var64, null) as java.lang.String;
            var103 = var63.v(var62, 18, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var111 = var63.v(var62, 19, var64, null) as java.lang.String;
            val var47: java.lang.Boolean = var63.v(var62, 20, var11, null) as java.lang.Boolean;
            var33 = var63.v(var62, 21, var64, null) as java.lang.String;
            var36 = var63.v(var62, 22, var64, null) as java.lang.String;
            var28 = var63.v(var62, 23, var64, null) as java.lang.String;
            var41 = var63.v(var62, 24, var10, null) as Int;
            var38 = var63.v(var62, 25, var11, null) as java.lang.Boolean;
            var25 = var63.v(var62, 26, var64, null) as java.lang.String;
            val var24: java.lang.String = var63.v(var62, 27, var64, null) as java.lang.String;
            val var23: Int = var63.v(var62, 28, var10, null) as Int;
            var20 = var63.v(var62, 29, var10, null) as Int;
            val var19: java.lang.String = var63.v(var62, 30, var64, null) as java.lang.String;
            var18 = var63.v(var62, 31, var11, null) as java.lang.Boolean;
            val var80: Int = var63.v(var62, 32, var10, null) as Int;
            val var16: java.lang.String = var63.v(var62, 33, var64, null) as java.lang.String;
            val var14: java.lang.String = var63.v(var62, 34, var64, null) as java.lang.String;
            var13 = var63.v(var62, 35, var64, null) as java.lang.String;
            var12 = var63.v(var62, 36, var10, null) as Int;
            val var22: Int = var63.v(var62, 37, var10, null) as Int;
            var21 = var63.v(var62, 38, var10, null) as Int;
            var43 = var63.v(var62, 39, var64, null) as java.lang.String;
            var44 = var63.v(var62, 40, var64, null) as java.lang.String;
            var49 = var63.v(var62, 41, var10, null) as Int;
            var74 = var63.v(var62, 42, var64, null) as java.lang.String;
            var65 = var63.v(var62, 43, var64, null) as java.lang.String;
            var8 = 4095;
            var4 = -1;
            var5 = var68;
            var68 = var6;
            var45 = var26;
            var46 = var103;
            var56 = (java.lang.String)var111;
            var111 = var47;
            var354 = var24;
            var103 = var23;
            var51 = var19;
            var57 = var80;
            var48 = var16;
            var348 = var14;
            var52 = var22;
         } else {
            var var7: Boolean = true;
            var4 = 0;
            var var73: Int = 0;
            var5 = 0;
            var3 = 0;
            var36 = null;
            var31 = null;
            var var66: java.lang.String = null;
            var41 = null;
            var38 = null;
            var52 = null;
            var50 = null;
            var51 = null;
            var49 = null;
            var48 = null;
            var348 = null;
            var42 = null;
            var40 = null;
            var25 = null;
            var var165: java.lang.String = null;
            var var156: java.lang.String = null;
            var21 = null;
            var var168: Any = null;
            var37 = null;
            var28 = null;
            var35 = null;
            var39 = null;
            var33 = null;
            var20 = null;
            var var88: java.lang.String = null;
            var13 = null;
            var var99: Any = null;
            var103 = null;
            var var106: java.lang.String = null;
            var111 = null;
            var18 = null;
            var var126: Any = null;
            var var81: java.lang.String = null;
            var34 = null;
            var var185: Any = null;
            var29 = null;
            var30 = null;
            var32 = null;
            var74 = null;
            var27 = null;

            while (var7) {
               label234: {
                  label187: {
                     label186: {
                        label185: {
                           label235: {
                              label236: {
                                 label237: {
                                    label171: {
                                       label238: {
                                          label239: {
                                             label240: {
                                                label204: {
                                                   var68 = var63.x(var62);
                                                   switch (var68) {
                                                      case -1:
                                                         var68 = var4;
                                                         var7 = false;
                                                         break label236;
                                                      case 0:
                                                         var3 = var63.k(var62, 0);
                                                         var68 = var4 or 1;
                                                         break label236;
                                                      case 1:
                                                         var5 = var63.k(var62, 1);
                                                         var68 = var4 or 2;
                                                         break label236;
                                                      case 2:
                                                         var40 = var63.m(var62, 2, CodedLinkExtendedType.Serializer.INSTANCE, var40) as CodedLinkExtendedType;
                                                         var68 = var4 or 4;
                                                         break label236;
                                                      case 3:
                                                         var73 = var63.k(var62, 3);
                                                         var68 = var4 or 8;
                                                         break label236;
                                                      case 4:
                                                         var42 = var63.t(var62, 4);
                                                         var68 = var4 or 16;
                                                         break label236;
                                                      case 5:
                                                         var44 = (java.lang.String)var30;
                                                         var45 = (java.lang.String)var27;
                                                         var30 = var29;
                                                         var27 = var63.m(var62, 5, InviteType.Serializer.INSTANCE, var185) as InviteType;
                                                         var68 = var4 or 32;
                                                         var29 = var74;
                                                         var43 = var25;
                                                         var74 = var66;
                                                         var67 = var156;
                                                         var185 = var168;
                                                         var25 = var165;
                                                         var46 = var21;
                                                         break label235;
                                                      case 6:
                                                         var44 = (java.lang.String)var30;
                                                         var30 = var63.v(var62, 6, N.a, var29) as Int;
                                                         var68 = var4 or 64;
                                                         break label240;
                                                      case 7:
                                                         var44 = var63.v(var62, 7, N.a, var30) as Int;
                                                         var68 = var4 or 128;
                                                         var30 = var29;
                                                         break label240;
                                                      case 8:
                                                         var32 = var63.v(var62, 8, N.a, var32) as Int;
                                                         var68 = var4 or 256;
                                                         break label238;
                                                      case 9:
                                                         var45 = (java.lang.String)var27;
                                                         var46 = var63.v(var62, 9, C0.a, var25) as java.lang.String;
                                                         var68 = var4 or 512;
                                                         var27 = var185;
                                                         var74 = var66;
                                                         var67 = var156;
                                                         var185 = var168;
                                                         var25 = var165;
                                                         var29 = var74;
                                                         var30 = var29;
                                                         var44 = (java.lang.String)var30;
                                                         var43 = (java.lang.String)var46;
                                                         var46 = var21;
                                                         break label235;
                                                      case 10:
                                                         var156 = (java.lang.String)var168;
                                                         var168 = var63.v(var62, 10, C0.a, var74) as java.lang.String;
                                                         var68 = var4 or 1024;
                                                         var74 = var66;
                                                         var67 = var156;
                                                         var45 = (java.lang.String)var27;
                                                         var46 = var21;
                                                         break label239;
                                                      case 11:
                                                         var156 = (java.lang.String)var168;
                                                         var45 = var63.v(var62, 11, C0.a, var27) as java.lang.String;
                                                         var68 = var4 or 2048;
                                                         var168 = var74;
                                                         var74 = var66;
                                                         var67 = var156;
                                                         var46 = var21;
                                                         break label239;
                                                      case 12:
                                                         var168 = var21;
                                                         var21 = var156;
                                                         var165 = var63.v(var62, 12, C0.a, var165) as java.lang.String;
                                                         var68 = var4 or 4096;
                                                         var43 = var66;
                                                         var156 = (java.lang.String)var168;
                                                         break;
                                                      case 13:
                                                         var168 = var21;
                                                         var21 = var63.v(var62, 13, C0.a, var156) as java.lang.String;
                                                         var68 = var4 or 8192;
                                                         var43 = var66;
                                                         var156 = (java.lang.String)var168;
                                                         break;
                                                      case 14:
                                                         val var303: Int = var63.v(var62, 14, N.a, var21) as Int;
                                                         var68 = var4 or 16384;
                                                         var21 = var156;
                                                         var43 = var66;
                                                         var156 = (java.lang.String)var168;
                                                         var168 = var303;
                                                         break;
                                                      case 15:
                                                         val var266: java.lang.Boolean = var63.v(var62, 15, h.a, var168) as java.lang.Boolean;
                                                         var68 = var4 or '耀';
                                                         var168 = var21;
                                                         var156 = var266;
                                                         var21 = var156;
                                                         var43 = var66;
                                                         break;
                                                      case 16:
                                                         var37 = var63.v(var62, 16, C0.a, var37) as java.lang.String;
                                                         var68 = var4 or 65536;
                                                         break label238;
                                                      case 17:
                                                         var43 = var63.v(var62, 17, C0.a, var28) as java.lang.String;
                                                         var68 = var4 or 131072;
                                                         var28 = var35;
                                                         break label185;
                                                      case 18:
                                                         val var224: StructurableText = var63.v(var62, 18, StructurableTextSerializer.INSTANCE, var35) as StructurableText;
                                                         var43 = var28;
                                                         var68 = var4 or 262144;
                                                         var28 = var224;
                                                         break label185;
                                                      case 19:
                                                         var39 = var63.v(var62, 19, C0.a, var39) as java.lang.String;
                                                         var68 = var4 or 524288;
                                                         break label171;
                                                      case 20:
                                                         var33 = var63.v(var62, 20, h.a, var33) as java.lang.Boolean;
                                                         var68 = var4 or 1048576;
                                                         break label171;
                                                      case 21:
                                                         var99 = var106;
                                                         var13 = (java.lang.String)var111;
                                                         var18 = var88;
                                                         var126 = var63.v(var62, 21, C0.a, var20) as java.lang.String;
                                                         var68 = var4 or 2097152;
                                                         var20 = var81;
                                                         var81 = (java.lang.String)var126;
                                                         var12 = (Integer)var18;
                                                         var106 = (java.lang.String)var99;
                                                         var111 = var13;
                                                         break label237;
                                                      case 22:
                                                         var99 = var106;
                                                         var111 = var13;
                                                         val var140: java.lang.String = var63.v(var62, 22, C0.a, var88) as java.lang.String;
                                                         var68 = var4 or 4194304;
                                                         var81 = (java.lang.String)var126;
                                                         var12 = (Integer)var18;
                                                         var13 = (java.lang.String)var111;
                                                         var106 = (java.lang.String)var99;
                                                         var18 = var140;
                                                         var126 = var20;
                                                         var20 = var81;
                                                         break label237;
                                                      case 23:
                                                         val var138: java.lang.String = var63.v(var62, 23, C0.a, var13) as java.lang.String;
                                                         var68 = var4 or 8388608;
                                                         var81 = (java.lang.String)var126;
                                                         var12 = (Integer)var18;
                                                         var13 = (java.lang.String)var111;
                                                         var99 = var106;
                                                         var106 = (java.lang.String)var99;
                                                         var111 = var138;
                                                         var18 = var88;
                                                         var126 = var20;
                                                         var20 = var81;
                                                         break label237;
                                                      case 24:
                                                         val var319: Int = var63.v(var62, 24, N.a, var99) as Int;
                                                         var68 = var4 or 16777216;
                                                         var126 = var20;
                                                         var81 = (java.lang.String)var126;
                                                         var12 = (Integer)var18;
                                                         var13 = (java.lang.String)var111;
                                                         var99 = var106;
                                                         var106 = var319;
                                                         var111 = var13;
                                                         var18 = var88;
                                                         var20 = var81;
                                                         break label237;
                                                      case 25:
                                                         var103 = var63.v(var62, 25, h.a, var103) as java.lang.Boolean;
                                                         var68 = var4 or 33554432;
                                                         var126 = var20;
                                                         var81 = (java.lang.String)var126;
                                                         var12 = (Integer)var18;
                                                         var13 = (java.lang.String)var111;
                                                         var99 = var106;
                                                         var106 = (java.lang.String)var99;
                                                         var111 = var13;
                                                         var18 = var88;
                                                         var20 = var81;
                                                         break label237;
                                                      case 26:
                                                         var106 = var63.v(var62, 26, C0.a, var106) as java.lang.String;
                                                         var68 = var4 or 67108864;
                                                         var126 = var20;
                                                         var81 = (java.lang.String)var126;
                                                         var12 = (Integer)var18;
                                                         var13 = (java.lang.String)var111;
                                                         var99 = var106;
                                                         var106 = (java.lang.String)var99;
                                                         var111 = var13;
                                                         var18 = var88;
                                                         var20 = var81;
                                                         break label237;
                                                      case 27:
                                                         var111 = var63.v(var62, 27, C0.a, var111) as java.lang.String;
                                                         var68 = var4 or 134217728;
                                                         var126 = var20;
                                                         var99 = var106;
                                                         var81 = (java.lang.String)var126;
                                                         var12 = (Integer)var18;
                                                         var13 = (java.lang.String)var111;
                                                         var106 = (java.lang.String)var99;
                                                         var111 = var13;
                                                         var18 = var88;
                                                         var20 = var81;
                                                         break label237;
                                                      case 28:
                                                         val var315: Int = var63.v(var62, 28, N.a, var18) as Int;
                                                         var68 = var4 or 268435456;
                                                         var126 = var20;
                                                         var18 = var88;
                                                         var99 = var106;
                                                         var13 = (java.lang.String)var111;
                                                         var81 = (java.lang.String)var126;
                                                         var12 = var315;
                                                         var106 = (java.lang.String)var99;
                                                         var111 = var13;
                                                         var20 = var81;
                                                         break label237;
                                                      case 29:
                                                         val var314: Int = var63.v(var62, 29, N.a, var126) as Int;
                                                         var68 = var4 or 536870912;
                                                         var126 = var20;
                                                         var99 = var106;
                                                         var13 = (java.lang.String)var111;
                                                         var12 = (Integer)var18;
                                                         var81 = var314;
                                                         var106 = (java.lang.String)var99;
                                                         var111 = var13;
                                                         var18 = var88;
                                                         var20 = var81;
                                                         break label237;
                                                      case 30:
                                                         var43 = var63.v(var62, 30, C0.a, var81) as java.lang.String;
                                                         var68 = var4 or 1073741824;
                                                         var99 = var106;
                                                         var20 = var43;
                                                         var126 = var20;
                                                         var18 = var88;
                                                         var111 = var13;
                                                         var106 = (java.lang.String)var99;
                                                         var13 = (java.lang.String)var111;
                                                         var12 = (Integer)var18;
                                                         var81 = (java.lang.String)var126;
                                                         break label237;
                                                      case 31:
                                                         val var288: java.lang.Boolean = var63.v(var62, 31, h.a, var34) as java.lang.Boolean;
                                                         var68 = var4 or Integer.MIN_VALUE;
                                                         var165 = var35;
                                                         var21 = var20;
                                                         var20 = var88;
                                                         var103 = var111;
                                                         var99 = var18;
                                                         var13 = (java.lang.String)var126;
                                                         var29 = var74;
                                                         var34 = var31;
                                                         var35 = var66;
                                                         var67 = var156;
                                                         var74 = (java.lang.String)var38;
                                                         var81 = var28;
                                                         var12 = var33;
                                                         var111 = var103;
                                                         var18 = var99;
                                                         var126 = var13;
                                                         var156 = var81;
                                                         var168 = var288;
                                                         var185 = var168;
                                                         var27 = var185;
                                                         var28 = var165;
                                                         var30 = var29;
                                                         var31 = (java.lang.String)var30;
                                                         var44 = var25;
                                                         var25 = (java.lang.String)var27;
                                                         var43 = (java.lang.String)var32;
                                                         var32 = var21;
                                                         var33 = var36;
                                                         break label234;
                                                      case 32:
                                                         var54 = var63.v(var62, 32, N.a, var38) as Int;
                                                         var8 |= 1;
                                                         var165 = var35;
                                                         var20 = var88;
                                                         var103 = var111;
                                                         var99 = var18;
                                                         var13 = (java.lang.String)var126;
                                                         var29 = var74;
                                                         var68 = var4;
                                                         var34 = var31;
                                                         var35 = var66;
                                                         var67 = var156;
                                                         var74 = (java.lang.String)var54;
                                                         var81 = var28;
                                                         var12 = var33;
                                                         var111 = var103;
                                                         var18 = var99;
                                                         var126 = var13;
                                                         var21 = var20;
                                                         var156 = var81;
                                                         var168 = var34;
                                                         var185 = var168;
                                                         var27 = var185;
                                                         var28 = var165;
                                                         var30 = var29;
                                                         var31 = (java.lang.String)var30;
                                                         var44 = var25;
                                                         var25 = (java.lang.String)var27;
                                                         var43 = (java.lang.String)var32;
                                                         var32 = var21;
                                                         var33 = var36;
                                                         break label234;
                                                      case 33:
                                                         var31 = var63.v(var62, 33, C0.a, var31) as java.lang.String;
                                                         var71 = 2;
                                                         break label204;
                                                      case 34:
                                                         var41 = var63.v(var62, 34, C0.a, var41) as java.lang.String;
                                                         var71 = 4;
                                                         break label204;
                                                      case 35:
                                                         var66 = var63.v(var62, 35, C0.a, var66) as java.lang.String;
                                                         var71 = 8;
                                                         break label204;
                                                      case 36:
                                                         var53 = var63.v(var62, 36, N.a, var53) as Int;
                                                         var68 = var8 or 16;
                                                         break label187;
                                                      case 37:
                                                         var52 = var63.v(var62, 37, N.a, var52) as Int;
                                                         var68 = var8 or 32;
                                                         break label187;
                                                      case 38:
                                                         var50 = var63.v(var62, 38, N.a, var50) as Int;
                                                         var68 = var8 or 64;
                                                         break label187;
                                                      case 39:
                                                         var36 = var63.v(var62, 39, C0.a, var36) as java.lang.String;
                                                         var68 = var8 or 128;
                                                         break label187;
                                                      case 40:
                                                         var348 = var63.v(var62, 40, C0.a, var348) as java.lang.String;
                                                         var68 = var8 or 256;
                                                         break label187;
                                                      case 41:
                                                         var48 = var63.v(var62, 41, N.a, var48) as Int;
                                                         var68 = var8 or 512;
                                                         break label187;
                                                      case 42:
                                                         var49 = var63.v(var62, 42, C0.a, var49) as java.lang.String;
                                                         var68 = var8 or 1024;
                                                         break label187;
                                                      case 43:
                                                         var51 = var63.v(var62, 43, C0.a, var51) as java.lang.String;
                                                         var68 = var8 or 2048;
                                                         break label187;
                                                      default:
                                                         throw new n(var68);
                                                   }

                                                   var46 = var168;
                                                   var45 = (java.lang.String)var27;
                                                   var168 = var74;
                                                   var67 = (java.lang.String)var21;
                                                   var74 = var43;
                                                   break label239;
                                                }

                                                var68 = var8 or var71;
                                                break label187;
                                             }

                                             var45 = (java.lang.String)var27;
                                             var29 = var74;
                                             var27 = var185;
                                             var43 = var25;
                                             var74 = var66;
                                             var67 = var156;
                                             var185 = var168;
                                             var25 = var165;
                                             var46 = var21;
                                             break label235;
                                          }

                                          var43 = var25;
                                          var44 = (java.lang.String)var30;
                                          var30 = var29;
                                          var29 = var168;
                                          var25 = var165;
                                          var27 = var185;
                                          var185 = var156;
                                          break label235;
                                       }

                                       var43 = var28;
                                       var28 = var35;
                                       break label185;
                                    }

                                    var43 = (java.lang.String)var20;
                                    var20 = var88;
                                    var103 = var111;
                                    var99 = var18;
                                    var13 = (java.lang.String)var126;
                                    var12 = var33;
                                    var111 = var103;
                                    var18 = var99;
                                    var126 = var13;
                                    var33 = var81;
                                    break label186;
                                 }

                                 var33 = (java.lang.String)var20;
                                 var43 = (java.lang.String)var126;
                                 var20 = var18;
                                 var126 = var111;
                                 var18 = var106;
                                 var111 = var103;
                                 var106 = (java.lang.String)var99;
                                 var103 = var13;
                                 var99 = var12;
                                 var13 = var81;
                                 var12 = var33;
                                 break label186;
                              }

                              var34 = var31;
                              var31 = (java.lang.String)var30;
                              var30 = var29;
                              var28 = var165;
                              var165 = var35;
                              var21 = var20;
                              var20 = var88;
                              var103 = var111;
                              var99 = var18;
                              var13 = (java.lang.String)var126;
                              var74 = (java.lang.String)var38;
                              var156 = var81;
                              var12 = var33;
                              var35 = var66;
                              var67 = var156;
                              var81 = var28;
                              var111 = var103;
                              var18 = var99;
                              var126 = var13;
                              var168 = var34;
                              var185 = var168;
                              var27 = var185;
                              var29 = var74;
                              var44 = var25;
                              var25 = (java.lang.String)var27;
                              var43 = (java.lang.String)var32;
                              var32 = var21;
                              var33 = var36;
                              break label234;
                           }

                           var165 = var35;
                           var21 = var20;
                           var20 = var88;
                           var103 = var111;
                           var99 = var18;
                           var13 = (java.lang.String)var126;
                           var34 = var31;
                           var35 = var74;
                           var74 = (java.lang.String)var38;
                           var81 = var28;
                           var12 = var33;
                           var111 = var103;
                           var18 = var99;
                           var126 = var13;
                           var156 = var81;
                           var168 = var34;
                           var28 = var25;
                           var31 = var44;
                           var44 = var43;
                           var25 = var45;
                           var43 = (java.lang.String)var32;
                           var32 = var46;
                           var33 = var36;
                           break label234;
                        }

                        var30 = var29;
                        var29 = var74;
                        var27 = var185;
                        var185 = var168;
                        var168 = var34;
                        var21 = var20;
                        var20 = var88;
                        var103 = var111;
                        var99 = var18;
                        var13 = (java.lang.String)var126;
                        var74 = (java.lang.String)var38;
                        var156 = var81;
                        var34 = var31;
                        var35 = var66;
                        var67 = var156;
                        var81 = var43;
                        var12 = var33;
                        var111 = var103;
                        var18 = var99;
                        var126 = var13;
                        var165 = var28;
                        var28 = var165;
                        var31 = (java.lang.String)var30;
                        var44 = var25;
                        var25 = (java.lang.String)var27;
                        var43 = (java.lang.String)var32;
                        var32 = var21;
                        var33 = var36;
                        break label234;
                     }

                     var30 = var29;
                     var29 = var74;
                     var27 = var185;
                     var185 = var168;
                     var168 = var34;
                     var165 = var35;
                     var81 = var28;
                     var74 = (java.lang.String)var38;
                     var34 = var31;
                     var35 = var66;
                     var67 = var156;
                     var21 = var43;
                     var156 = var33;
                     var28 = var165;
                     var31 = (java.lang.String)var30;
                     var44 = var25;
                     var25 = (java.lang.String)var27;
                     var43 = (java.lang.String)var32;
                     var32 = var21;
                     var33 = var36;
                     break label234;
                  }

                  var165 = var35;
                  var20 = var88;
                  var103 = var111;
                  var99 = var18;
                  var13 = (java.lang.String)var126;
                  var29 = var74;
                  var74 = (java.lang.String)var38;
                  var33 = var36;
                  var34 = var31;
                  var35 = var66;
                  var8 = var68;
                  var68 = var4;
                  var67 = var156;
                  var81 = var28;
                  var12 = var33;
                  var111 = var103;
                  var18 = var99;
                  var126 = var13;
                  var21 = var20;
                  var156 = var81;
                  var168 = var34;
                  var185 = var168;
                  var27 = var185;
                  var28 = var165;
                  var30 = var29;
                  var31 = (java.lang.String)var30;
                  var44 = var25;
                  var25 = (java.lang.String)var27;
                  var43 = (java.lang.String)var32;
                  var32 = var21;
               }

               var38 = var74;
               var103 = var111;
               var99 = var18;
               var13 = (java.lang.String)var126;
               var20 = var21;
               var168 = var185;
               var185 = var27;
               var165 = var28;
               var29 = var30;
               var30 = var31;
               var21 = var32;
               var36 = var33;
               var31 = var34;
               var66 = var35;
               var4 = var68;
               var25 = var44;
               var156 = var67;
               var28 = var81;
               var35 = var165;
               var33 = var12;
               var88 = (java.lang.String)var20;
               var111 = var103;
               var18 = var99;
               var126 = var13;
               var81 = var156;
               var34 = (java.lang.String)var168;
               var32 = var43;
               var74 = (java.lang.String)var29;
               var27 = var25;
            }

            var44 = var348;
            var48 = var31;
            var13 = var66;
            var68 = var73;
            var65 = var51;
            var74 = (java.lang.String)var49;
            var49 = var48;
            var43 = var36;
            var21 = var50;
            var12 = var53;
            var348 = (java.lang.String)var41;
            var57 = var38;
            var18 = var34;
            var51 = var81;
            var20 = var126;
            var103 = var18;
            var354 = (java.lang.String)var111;
            var25 = var106;
            var38 = var103;
            var41 = var99;
            var28 = var13;
            var36 = var88;
            var33 = (java.lang.String)var20;
            var111 = var33;
            var56 = (java.lang.String)var39;
            var46 = var35;
            var34 = var28;
            var27 = var168;
            var39 = var21;
            var50 = var156;
            var31 = var165;
            var55 = (java.lang.String)var27;
            var45 = var74;
            var35 = var25;
            var54 = var30;
            var30 = var185;
         }

         var63.b(var62);
         return new GuildEventInviteEmbedImpl(
            var4,
            var8,
            var3,
            var5,
            (CodedLinkExtendedType)var40,
            var68,
            var42,
            (InviteType)var30,
            (Integer)var29,
            (Integer)var54,
            (Integer)var32,
            var35,
            var45,
            var55,
            var31,
            var50,
            (Integer)var39,
            (java.lang.Boolean)var27,
            var37,
            var34,
            (StructurableText)var46,
            var56,
            (java.lang.Boolean)var111,
            var33,
            var36,
            var28,
            (Integer)var41,
            (java.lang.Boolean)var38,
            var25,
            var354,
            (Integer)var103,
            (Integer)var20,
            var51,
            (java.lang.Boolean)var18,
            (Integer)var57,
            var48,
            var348,
            var13,
            var12,
            (Integer)var52,
            (Integer)var21,
            var43,
            var44,
            (Integer)var49,
            var74,
            var65,
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
         return fa.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildEventInviteEmbedImpl> {
         return GuildEventInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
