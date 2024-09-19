package com.discord.chat.bridge.codedlinks

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
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
      val var38: Int = Integer.hashCode(this.borderColor);
      val var43: Int = this.extendedType.hashCode();
      val var42: Int = Integer.hashCode(this.headerColor);
      val var39: Int = this.headerText.hashCode();
      val var40: Int = this.type.hashCode();
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
                                                                                                                                                                                                                                                                                                                                                      + var40
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
      val var1: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var31: CodedLinkExtendedType = this.extendedType;
      val var3: Int = this.headerColor;
      val var4: java.lang.String = this.headerText;
      val var11: InviteType = this.type;
      val var25: Int = this.acceptLabelBackgroundColor;
      val var26: Int = this.acceptLabelBorderColor;
      val var38: Int = this.acceptLabelColor;
      val var20: java.lang.String = this.acceptLabelIcon;
      val var10: java.lang.String = this.acceptLabelText;
      val var15: java.lang.String = this.badgeCount;
      val var37: java.lang.String = this.badgeIcon;
      val var39: java.lang.String = this.bodyText;
      val var27: Int = this.bodyTextColor;
      val var7: java.lang.Boolean = this.canBeAccepted;
      val var24: java.lang.String = this.channelIcon;
      val var12: java.lang.String = this.channelName;
      val var5: StructurableText = this.content;
      val var8: java.lang.String = this.creatorAvatar;
      val var30: java.lang.Boolean = this.embedCanBeTapped;
      val var28: java.lang.String = this.guildIcon;
      val var35: java.lang.String = this.guildName;
      val var40: java.lang.String = this.headerIcon;
      val var18: Int = this.headerTextColor;
      val var13: java.lang.Boolean = this.isRsvped;
      val var17: java.lang.String = this.memberText;
      val var16: java.lang.String = this.onlineText;
      val var23: Int = this.resolvingGradientEnd;
      val var21: Int = this.resolvingGradientStart;
      val var36: java.lang.String = this.secondaryActionIcon;
      val var42: java.lang.Boolean = this.splashHasRadialGradient;
      val var43: Int = this.splashOpacity;
      val var9: java.lang.String = this.splashUrl;
      val var33: java.lang.String = this.inviteSplash;
      val var6: java.lang.String = this.subtitle;
      val var41: Int = this.subtitleColor;
      val var14: Int = this.thumbnailBackgroundColor;
      val var34: Int = this.thumbnailCornerRadius;
      val var44: java.lang.String = this.thumbnailText;
      val var19: java.lang.String = this.thumbnailUrl;
      val var22: Int = this.titleColor;
      val var29: java.lang.String = this.titleText;
      val var32: StringBuilder = new StringBuilder();
      var32.append("GuildEventInviteEmbedImpl(backgroundColor=");
      var32.append(var1);
      var32.append(", borderColor=");
      var32.append(var2);
      var32.append(", extendedType=");
      var32.append(var31);
      var32.append(", headerColor=");
      var32.append(var3);
      var32.append(", headerText=");
      var32.append(var4);
      var32.append(", type=");
      var32.append(var11);
      var32.append(", acceptLabelBackgroundColor=");
      var32.append(var25);
      var32.append(", acceptLabelBorderColor=");
      var32.append(var26);
      var32.append(", acceptLabelColor=");
      var32.append(var38);
      var32.append(", acceptLabelIcon=");
      var32.append(var20);
      var32.append(", acceptLabelText=");
      var32.append(var10);
      var32.append(", badgeCount=");
      var32.append(var15);
      var32.append(", badgeIcon=");
      var32.append(var37);
      var32.append(", bodyText=");
      var32.append(var39);
      var32.append(", bodyTextColor=");
      var32.append(var27);
      var32.append(", canBeAccepted=");
      var32.append(var7);
      var32.append(", channelIcon=");
      var32.append(var24);
      var32.append(", channelName=");
      var32.append(var12);
      var32.append(", content=");
      var32.append(var5);
      var32.append(", creatorAvatar=");
      var32.append(var8);
      var32.append(", embedCanBeTapped=");
      var32.append(var30);
      var32.append(", guildIcon=");
      var32.append(var28);
      var32.append(", guildName=");
      var32.append(var35);
      var32.append(", headerIcon=");
      var32.append(var40);
      var32.append(", headerTextColor=");
      var32.append(var18);
      var32.append(", isRsvped=");
      var32.append(var13);
      var32.append(", memberText=");
      var32.append(var17);
      var32.append(", onlineText=");
      var32.append(var16);
      var32.append(", resolvingGradientEnd=");
      var32.append(var23);
      var32.append(", resolvingGradientStart=");
      var32.append(var21);
      var32.append(", secondaryActionIcon=");
      var32.append(var36);
      var32.append(", splashHasRadialGradient=");
      var32.append(var42);
      var32.append(", splashOpacity=");
      var32.append(var43);
      var32.append(", splashUrl=");
      var32.append(var9);
      var32.append(", inviteSplash=");
      var32.append(var33);
      var32.append(", subtitle=");
      var32.append(var6);
      var32.append(", subtitleColor=");
      var32.append(var41);
      var32.append(", thumbnailBackgroundColor=");
      var32.append(var14);
      var32.append(", thumbnailCornerRadius=");
      var32.append(var34);
      var32.append(", thumbnailText=");
      var32.append(var44);
      var32.append(", thumbnailUrl=");
      var32.append(var19);
      var32.append(", titleColor=");
      var32.append(var22);
      var32.append(", titleText=");
      var32.append(var29);
      var32.append(")");
      return var32.toString();
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
         val var11: n0 = n0.a;
         val var1: CodedLinkExtendedType.Serializer = CodedLinkExtendedType.Serializer.INSTANCE;
         val var5: b2 = b2.a;
         val var10: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var3: KSerializer = a.u(n0.a);
         val var7: KSerializer = a.u(var11);
         val var13: KSerializer = a.u(var11);
         val var8: KSerializer = a.u(var5);
         val var12: KSerializer = a.u(var5);
         val var2: KSerializer = a.u(var5);
         val var4: KSerializer = a.u(var5);
         val var14: KSerializer = a.u(var5);
         val var6: KSerializer = a.u(var11);
         val var9: h = h.a;
         return new KSerializer[]{
            var11,
            var11,
            var1,
            var11,
            var5,
            var10,
            var3,
            var7,
            var13,
            var8,
            var12,
            var2,
            var4,
            var14,
            var6,
            a.u(h.a),
            a.u(var5),
            a.u(var5),
            a.u(StructurableTextSerializer.INSTANCE),
            a.u(var5),
            a.u(var9),
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var11),
            a.u(var9),
            a.u(var5),
            a.u(var5),
            a.u(var11),
            a.u(var11),
            a.u(var5),
            a.u(var9),
            a.u(var11),
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var11),
            a.u(var11),
            a.u(var11),
            a.u(var5),
            a.u(var5),
            a.u(var11),
            a.u(var5)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildEventInviteEmbedImpl {
         q.h(var1, "decoder");
         val var58: SerialDescriptor = this.getDescriptor();
         val var59: c = var1.c(var58);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var7: Int;
         var var16: Int;
         var var17: Any;
         var var20: Any;
         var var21: Any;
         var var22: Any;
         var var23: Any;
         var var24: Any;
         var var25: Any;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var30: Int;
         var var31: Int;
         var var32: Int;
         var var33: Int;
         var var34: Any;
         var var35: Int;
         var var36: Any;
         var var37: Any;
         var var38: Any;
         var var39: Int;
         var var40: Any;
         var var41: Any;
         var var42: Any;
         var var43: Int;
         var var44: Any;
         var var45: Any;
         val var46: java.lang.String;
         var var47: Any;
         var var48: Int;
         var var49: Any;
         val var50: Int;
         val var51: Int;
         val var52: Int;
         val var53: Any;
         var var54: Any;
         var var55: Any;
         var var102: Any;
         var var119: Any;
         var var156: Any;
         if (var59.y()) {
            var7 = var59.k(var58, 0);
            var2 = var59.k(var58, 1);
            var24 = var59.m(var58, 2, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            var5 = var59.k(var58, 3);
            var42 = var59.t(var58, 4);
            var17 = var59.m(var58, 5, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var60: n0 = n0.a;
            var16 = var59.v(var58, 6, n0.a, null) as Int;
            var48 = var59.v(var58, 7, var60, null) as Int;
            var102 = var59.v(var58, 8, var60, null) as Int;
            val var9: b2 = b2.a;
            var53 = var59.v(var58, 9, b2.a, null) as java.lang.String;
            var119 = var59.v(var58, 10, var9, null) as java.lang.String;
            var156 = var59.v(var58, 11, var9, null) as java.lang.String;
            var20 = var59.v(var58, 12, var9, null) as java.lang.String;
            var21 = var59.v(var58, 13, var9, null) as java.lang.String;
            var51 = var59.v(var58, 14, var60, null) as Int;
            val var10: h = h.a;
            var37 = var59.v(var58, 15, h.a, null) as java.lang.Boolean;
            var45 = var59.v(var58, 16, var9, null) as java.lang.String;
            val var19: java.lang.String = var59.v(var58, 17, var9, null) as java.lang.String;
            val var11: StructurableText = var59.v(var58, 18, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            val var13: java.lang.String = var59.v(var58, 19, var9, null) as java.lang.String;
            val var14: java.lang.Boolean = var59.v(var58, 20, var10, null) as java.lang.Boolean;
            var25 = var59.v(var58, 21, var9, null) as java.lang.String;
            var34 = var59.v(var58, 22, var9, null) as java.lang.String;
            var27 = var59.v(var58, 23, var9, null) as java.lang.String;
            var35 = var59.v(var58, 24, var60, null) as Int;
            var38 = var59.v(var58, 25, var10, null) as java.lang.Boolean;
            var40 = var59.v(var58, 26, var9, null) as java.lang.String;
            var22 = var59.v(var58, 27, var9, null) as java.lang.String;
            var32 = var59.v(var58, 28, var60, null) as Int;
            var50 = var59.v(var58, 29, var60, null) as Int;
            var28 = var59.v(var58, 30, var9, null) as java.lang.String;
            val var12: java.lang.Boolean = var59.v(var58, 31, var10, null) as java.lang.Boolean;
            val var73: Int = var59.v(var58, 32, var60, null) as Int;
            var41 = var59.v(var58, 33, var9, null) as java.lang.String;
            var29 = var59.v(var58, 34, var9, null) as java.lang.String;
            var46 = var59.v(var58, 35, var9, null) as java.lang.String;
            var52 = var59.v(var58, 36, var60, null) as Int;
            var31 = var59.v(var58, 37, var60, null) as Int;
            var39 = var59.v(var58, 38, var60, null) as Int;
            var36 = var59.v(var58, 39, var9, null) as java.lang.String;
            var23 = var59.v(var58, 40, var9, null) as java.lang.String;
            val var61: Int = var59.v(var58, 41, var60, null) as Int;
            val var68: java.lang.String = var59.v(var58, 42, var9, null) as java.lang.String;
            var3 = 2047;
            var4 = -1;
            var43 = (Integer)var102;
            var102 = var119;
            var119 = var156;
            var49 = var19;
            var55 = var11;
            var156 = var13;
            var47 = var14;
            var44 = var12;
            var30 = var73;
            var33 = var61;
            var54 = var68;
         } else {
            var var8: Boolean = true;
            var3 = 0;
            var7 = 0;
            var var6: Int = 0;
            var5 = 0;
            var22 = null;
            var30 = null;
            var31 = null;
            var29 = null;
            var28 = null;
            var23 = null;
            var47 = null;
            var var176: Int = null;
            var45 = null;
            var44 = null;
            var43 = null;
            var42 = null;
            var24 = null;
            var var62: Any = null;
            var var74: Int = null;
            var var69: Int = null;
            var var77: Int = null;
            var var94: Any = null;
            var102 = null;
            var17 = null;
            var var97: Any = null;
            var16 = null;
            var var81: Int = null;
            var119 = null;
            var var125: Any = null;
            var20 = null;
            var21 = null;
            var156 = null;
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
                                       var2 = var59.x(var58);
                                       switch (var2) {
                                          case -1:
                                             var2 = var4;
                                             var8 = false;
                                             break label124;
                                          case 0:
                                             var7 = var59.k(var58, 0);
                                             var2 = var4 or 1;
                                             break label124;
                                          case 1:
                                             var5 = var59.k(var58, 1);
                                             var2 = var4 or 2;
                                             break label124;
                                          case 2:
                                             var24 = var59.m(var58, 2, CodedLinkExtendedType.Serializer.INSTANCE, var24) as CodedLinkExtendedType;
                                             var2 = var4 or 4;
                                             break label126;
                                          case 3:
                                             var94 = var97;
                                             var77 = (Integer)var119;
                                             var74 = (Integer)var125;
                                             var69 = (Integer)var20;
                                             var21 = var81;
                                             var6 = var59.k(var58, 3);
                                             var2 = var4 or 8;
                                             var97 = var62;
                                             var62 = var21;
                                             var81 = var16;
                                             var102 = var74;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var94;
                                             var125 = var102;
                                             var20 = var17;
                                             break label125;
                                          case 4:
                                             var42 = var59.t(var58, 4);
                                             var2 = var4 or 16;
                                             break label107;
                                          case 5:
                                             var62 = var59.m(var58, 5, InviteType.Serializer.INSTANCE, var62) as InviteType;
                                             var2 = var4 or 32;
                                             break label107;
                                          case 6:
                                             var94 = var97;
                                             var77 = (Integer)var119;
                                             var21 = var81;
                                             var102 = var59.v(var58, 6, n0.a, var74) as Int;
                                             var2 = var4 or 64;
                                             var62 = var21;
                                             var69 = (Integer)var20;
                                             var74 = (Integer)var125;
                                             var81 = var16;
                                             var97 = var62;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var94;
                                             var125 = var102;
                                             var20 = var17;
                                             break label125;
                                          case 7:
                                             var94 = var97;
                                             var21 = var81;
                                             var17 = var77;
                                             val var135: Int = var59.v(var58, 7, n0.a, var69) as Int;
                                             var2 = var4 or 128;
                                             var62 = var21;
                                             var69 = (Integer)var20;
                                             var74 = (Integer)var125;
                                             var77 = (Integer)var119;
                                             var81 = var16;
                                             var97 = var62;
                                             var102 = var74;
                                             var16 = var135;
                                             var119 = var94;
                                             var125 = var102;
                                             var20 = var17;
                                             break label125;
                                          case 8:
                                             var21 = var81;
                                             var119 = var94;
                                             var17 = var59.v(var58, 8, n0.a, var77) as Int;
                                             var2 = var4 or 256;
                                             var62 = var21;
                                             var69 = (Integer)var20;
                                             var74 = (Integer)var125;
                                             var77 = (Integer)var119;
                                             var81 = var16;
                                             var94 = var97;
                                             var97 = var62;
                                             var102 = var74;
                                             var16 = var69;
                                             var125 = var102;
                                             var20 = var17;
                                             break label125;
                                          case 9:
                                             var21 = var81;
                                             var125 = var102;
                                             val var134: java.lang.String = var59.v(var58, 9, b2.a, var94) as java.lang.String;
                                             var2 = var4 or 512;
                                             var62 = var21;
                                             var69 = (Integer)var20;
                                             var74 = (Integer)var125;
                                             var77 = (Integer)var119;
                                             var81 = var16;
                                             var94 = var97;
                                             var97 = var62;
                                             var102 = var74;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var134;
                                             var20 = var17;
                                             break label125;
                                          case 10:
                                             var21 = var81;
                                             var20 = var17;
                                             var125 = var59.v(var58, 10, b2.a, var102) as java.lang.String;
                                             var2 = var4 or 1024;
                                             var102 = var74;
                                             var62 = var21;
                                             var69 = (Integer)var20;
                                             var74 = (Integer)var125;
                                             var77 = (Integer)var119;
                                             var81 = var16;
                                             var94 = var97;
                                             var97 = var62;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var94;
                                             break label125;
                                          case 11:
                                             var21 = var81;
                                             var20 = var59.v(var58, 11, b2.a, var17) as java.lang.String;
                                             var2 = var4 or 2048;
                                             var62 = var21;
                                             var69 = (Integer)var20;
                                             var74 = (Integer)var125;
                                             var77 = (Integer)var119;
                                             var81 = var16;
                                             var94 = var97;
                                             var97 = var62;
                                             var102 = var74;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var94;
                                             var125 = var102;
                                             break label125;
                                          case 12:
                                             var21 = var81;
                                             var81 = var16;
                                             var54 = var59.v(var58, 12, b2.a, var97) as java.lang.String;
                                             var2 = var4 or 4096;
                                             var97 = var62;
                                             var62 = var21;
                                             var69 = (Integer)var20;
                                             var74 = (Integer)var125;
                                             var77 = (Integer)var119;
                                             var94 = var54;
                                             var102 = var74;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var94;
                                             var125 = var102;
                                             var20 = var17;
                                             break label125;
                                          case 13:
                                             var21 = var81;
                                             var81 = var59.v(var58, 13, b2.a, var16) as java.lang.String;
                                             var2 = var4 or 8192;
                                             var94 = var97;
                                             var62 = var21;
                                             var69 = (Integer)var20;
                                             var74 = (Integer)var125;
                                             var77 = (Integer)var119;
                                             var97 = var62;
                                             var102 = var74;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var94;
                                             var125 = var102;
                                             var20 = var17;
                                             break label125;
                                          case 14:
                                             var21 = var59.v(var58, 14, n0.a, var81) as Int;
                                             var2 = var4 or 16384;
                                             var94 = var97;
                                             var81 = var16;
                                             var62 = var21;
                                             var69 = (Integer)var20;
                                             var74 = (Integer)var125;
                                             var77 = (Integer)var119;
                                             var97 = var62;
                                             var102 = var74;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var94;
                                             var125 = var102;
                                             var20 = var17;
                                             break label125;
                                          case 15:
                                             var55 = var59.v(var58, 15, h.a, var119) as java.lang.Boolean;
                                             var2 = var4 or '耀';
                                             var125 = var102;
                                             var94 = var97;
                                             var62 = var21;
                                             var69 = (Integer)var20;
                                             var74 = (Integer)var125;
                                             var77 = (Integer)var55;
                                             var81 = var16;
                                             var97 = var62;
                                             var102 = var74;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var94;
                                             var20 = var17;
                                             var21 = var81;
                                             break label125;
                                          case 16:
                                             var55 = var59.v(var58, 16, b2.a, var125) as java.lang.String;
                                             var2 = var4 or 65536;
                                             var94 = var97;
                                             var77 = (Integer)var119;
                                             var62 = var21;
                                             var69 = (Integer)var20;
                                             var74 = (Integer)var55;
                                             var81 = var16;
                                             var97 = var62;
                                             var102 = var74;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var94;
                                             var125 = var102;
                                             var20 = var17;
                                             var21 = var81;
                                             break label125;
                                          case 17:
                                             var55 = var59.v(var58, 17, b2.a, var20) as java.lang.String;
                                             var2 = var4 or 131072;
                                             var94 = var97;
                                             var77 = (Integer)var119;
                                             var74 = (Integer)var125;
                                             var62 = var21;
                                             var69 = (Integer)var55;
                                             var81 = var16;
                                             var97 = var62;
                                             var102 = var74;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var94;
                                             var125 = var102;
                                             var20 = var17;
                                             var21 = var81;
                                             break label125;
                                          case 18:
                                             val var199: StructurableText = var59.v(var58, 18, StructurableTextSerializer.INSTANCE, var21) as StructurableText;
                                             var2 = var4 or 262144;
                                             var94 = var97;
                                             var21 = var81;
                                             var20 = var17;
                                             var125 = var102;
                                             var119 = var94;
                                             var17 = var77;
                                             var16 = var69;
                                             var102 = var74;
                                             var97 = var62;
                                             var81 = var16;
                                             var77 = (Integer)var119;
                                             var74 = (Integer)var125;
                                             var69 = (Integer)var20;
                                             var62 = var199;
                                             break label125;
                                          case 19:
                                             var156 = var59.v(var58, 19, b2.a, var156) as java.lang.String;
                                             var2 = var4 or 524288;
                                             break label126;
                                          case 20:
                                             val var57: java.lang.Boolean = var59.v(var58, 20, h.a, var25) as java.lang.Boolean;
                                             var2 = var4 or 1048576;
                                             var94 = var97;
                                             var77 = (Integer)var119;
                                             var69 = (Integer)var20;
                                             var62 = var21;
                                             var25 = var22;
                                             var48 = (Integer)var27;
                                             var22 = var24;
                                             var23 = var125;
                                             var74 = var57;
                                             var81 = var16;
                                             var97 = var62;
                                             var102 = var74;
                                             var16 = var69;
                                             var17 = var77;
                                             var119 = var94;
                                             var125 = var102;
                                             var20 = var17;
                                             var21 = var81;
                                             var24 = var23;
                                             break label159;
                                          case 21:
                                             var41 = var59.v(var58, 21, b2.a, var41) as java.lang.String;
                                             var2 = var4 or 2097152;
                                             break label108;
                                          case 22:
                                             var40 = var59.v(var58, 22, b2.a, var40) as java.lang.String;
                                             var2 = var4 or 4194304;
                                             break label108;
                                          case 23:
                                             var39 = var59.v(var58, 23, b2.a, var39) as java.lang.String;
                                             var2 = var4 or 8388608;
                                             break label108;
                                          case 24:
                                             var38 = var59.v(var58, 24, n0.a, var38) as Int;
                                             var2 = var4 or 16777216;
                                             break label108;
                                          case 25:
                                             var37 = var59.v(var58, 25, h.a, var37) as java.lang.Boolean;
                                             var2 = var4 or 33554432;
                                             break label108;
                                          case 26:
                                             var36 = var59.v(var58, 26, b2.a, var36) as java.lang.String;
                                             var2 = var4 or 67108864;
                                             break label108;
                                          case 27:
                                             var35 = var59.v(var58, 27, b2.a, var35) as java.lang.String;
                                             var2 = var4 or 134217728;
                                             break label108;
                                          case 28:
                                             var34 = var59.v(var58, 28, n0.a, var34) as Int;
                                             var2 = var4 or 268435456;
                                             break label108;
                                          case 29:
                                             var33 = var59.v(var58, 29, n0.a, var33) as Int;
                                             var2 = var4 or 536870912;
                                             break label108;
                                          case 30:
                                             var32 = var59.v(var58, 30, b2.a, var32) as java.lang.String;
                                             var2 = var4 or 1073741824;
                                             break label108;
                                          case 31:
                                             var23 = var59.v(var58, 31, h.a, var23) as java.lang.Boolean;
                                             var2 = var4 or Integer.MIN_VALUE;
                                             break label108;
                                          case 32:
                                             var27 = var59.v(var58, 32, n0.a, var27) as Int;
                                             var2 = var3 or 1;
                                             break;
                                          case 33:
                                             var28 = var59.v(var58, 33, b2.a, var28) as java.lang.String;
                                             var2 = var3 or 2;
                                             break;
                                          case 34:
                                             var29 = var59.v(var58, 34, b2.a, var29) as java.lang.String;
                                             var2 = var3 or 4;
                                             break;
                                          case 35:
                                             var22 = var59.v(var58, 35, b2.a, var22) as java.lang.String;
                                             var2 = var3 or 8;
                                             break;
                                          case 36:
                                             var30 = var59.v(var58, 36, n0.a, var30) as Int;
                                             var2 = var3 or 16;
                                             break;
                                          case 37:
                                             var43 = var59.v(var58, 37, n0.a, var43) as Int;
                                             var2 = var3 or 32;
                                             var179 = (java.lang.String)var22;
                                             var49 = var27;
                                             break label160;
                                          case 38:
                                             var44 = var59.v(var58, 38, n0.a, var44) as Int;
                                             var2 = var3 or 64;
                                             var179 = (java.lang.String)var22;
                                             var49 = var27;
                                             break label160;
                                          case 39:
                                             var45 = var59.v(var58, 39, b2.a, var45) as java.lang.String;
                                             var2 = var3 or 128;
                                             var179 = (java.lang.String)var22;
                                             var49 = var27;
                                             break label160;
                                          case 40:
                                             var31 = var59.v(var58, 40, b2.a, var31) as java.lang.String;
                                             var2 = var3 or 256;
                                             break;
                                          case 41:
                                             var176 = var59.v(var58, 41, n0.a, var176) as Int;
                                             var2 = var3 or 512;
                                             var179 = (java.lang.String)var22;
                                             var49 = var27;
                                             break label160;
                                          case 42:
                                             var47 = var59.v(var58, 42, b2.a, var47) as java.lang.String;
                                             var2 = var3 or 1024;
                                             var49 = var27;
                                             var179 = (java.lang.String)var22;
                                             break label160;
                                          default:
                                             throw new n(var2);
                                       }

                                       var179 = (java.lang.String)var22;
                                       var49 = var27;
                                       break label160;
                                    }

                                    var17 = var77;
                                    var102 = var74;
                                    var94 = var97;
                                    var81 = var16;
                                    var77 = (Integer)var119;
                                    var74 = (Integer)var125;
                                    var69 = (Integer)var20;
                                    var97 = var62;
                                    var62 = var21;
                                    var16 = var69;
                                    var119 = var94;
                                    var125 = var102;
                                    var20 = var17;
                                    var21 = var81;
                                    break label125;
                                 }

                                 var179 = (java.lang.String)var22;
                                 var22 = var27;
                                 var27 = var23;
                                 break label127;
                              }

                              var3 = var2;
                              var27 = var23;
                              var2 = var4;
                              var22 = var49;
                              break label127;
                           }

                           var17 = var77;
                           var102 = var74;
                           var94 = var97;
                           var81 = var16;
                           var77 = (Integer)var119;
                           var69 = (Integer)var20;
                           var62 = var21;
                           var74 = (Integer)var25;
                           var25 = var22;
                           var48 = (Integer)var27;
                           var22 = var24;
                           var23 = var125;
                           var97 = var62;
                           var16 = var69;
                           var119 = var94;
                           var125 = var102;
                           var20 = var17;
                           var21 = var81;
                           var24 = var23;
                           break label159;
                        }

                        var25 = var22;
                        var48 = (Integer)var27;
                        var22 = var24;
                        var23 = var74;
                        var74 = (Integer)var25;
                        var24 = var23;
                        break label159;
                     }

                     var17 = var77;
                     var102 = var74;
                     var94 = var97;
                     var81 = var16;
                     var74 = (Integer)var25;
                     var77 = (Integer)var119;
                     var69 = (Integer)var20;
                     var62 = var21;
                     var25 = var22;
                     var48 = (Integer)var27;
                     var22 = var24;
                     var23 = var125;
                     var97 = var62;
                     var16 = var69;
                     var119 = var94;
                     var125 = var102;
                     var20 = var17;
                     var21 = var81;
                     var24 = var23;
                     break label159;
                  }

                  var17 = var77;
                  var102 = var74;
                  var94 = var97;
                  var74 = (Integer)var25;
                  var77 = (Integer)var119;
                  var69 = (Integer)var20;
                  var62 = var21;
                  var21 = var81;
                  var25 = var179;
                  var48 = (Integer)var22;
                  var22 = var24;
                  var23 = var125;
                  var81 = var16;
                  var97 = var62;
                  var16 = var69;
                  var119 = var94;
                  var125 = var102;
                  var20 = var17;
                  var24 = var27;
               }

               var62 = var97;
               var69 = var16;
               var77 = (Integer)var17;
               var102 = var125;
               var17 = var20;
               var23 = var24;
               var22 = var25;
               var27 = var48;
               var4 = var2;
               var24 = var22;
               var74 = (Integer)var102;
               var94 = var119;
               var97 = var94;
               var16 = var81;
               var81 = (Integer)var21;
               var119 = var77;
               var125 = var23;
               var20 = var69;
               var21 = var62;
               var25 = var74;
            }

            var54 = var47;
            var2 = var5;
            var47 = var25;
            var25 = var41;
            var40 = var36;
            var50 = var33;
            var33 = var176;
            var23 = var31;
            var36 = var45;
            var39 = (Integer)var44;
            var31 = var43;
            var52 = var30;
            var46 = (java.lang.String)var22;
            var41 = var28;
            var30 = (Integer)var27;
            var44 = var23;
            var28 = var32;
            var32 = (Integer)var34;
            var22 = var35;
            var38 = var37;
            var35 = (Integer)var38;
            var27 = var39;
            var34 = var40;
            var55 = var21;
            var49 = var20;
            var45 = var125;
            var37 = var119;
            var51 = var81;
            var21 = var16;
            var20 = var97;
            var119 = var17;
            var53 = var94;
            var43 = var77;
            var48 = var69;
            var16 = var74;
            var17 = var62;
            var5 = var6;
         }

         var59.b(var58);
         return new GuildEventInviteEmbedImpl(
            var4,
            var3,
            var7,
            var2,
            (CodedLinkExtendedType)var24,
            var5,
            (java.lang.String)var42,
            (InviteType)var17,
            var16,
            var48,
            var43,
            (java.lang.String)var53,
            (java.lang.String)var102,
            (java.lang.String)var119,
            (java.lang.String)var20,
            (java.lang.String)var21,
            var51,
            (java.lang.Boolean)var37,
            (java.lang.String)var45,
            (java.lang.String)var49,
            (StructurableText)var55,
            (java.lang.String)var156,
            (java.lang.Boolean)var47,
            (java.lang.String)var25,
            (java.lang.String)var34,
            (java.lang.String)var27,
            var35,
            (java.lang.Boolean)var38,
            (java.lang.String)var40,
            (java.lang.String)var22,
            var32,
            var50,
            (java.lang.String)var28,
            (java.lang.Boolean)var44,
            var30,
            (java.lang.String)var41,
            (java.lang.String)var29,
            var46,
            var52,
            var31,
            var39,
            (java.lang.String)var36,
            (java.lang.String)var23,
            var33,
            (java.lang.String)var54,
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
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildEventInviteEmbedImpl> {
         return GuildEventInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
