package com.discord.chat.bridge.codedlinks

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.h
import xk.m0

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
      r.h(var3, "extendedType");
      r.h(var5, "headerText");
      r.h(var6, "type");
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

   @JvmStatic
   public fun `write$Self`(self: GuildEventInviteEmbedImpl, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.getBackgroundColor());
      var1.w(var2, 1, var0.getBorderColor());
      var var5: Boolean;
      if (!var1.A(var2, 2) && var0.getExtendedType() === CodedLinkExtendedType.GUILD_SCHEDULED_EVENT) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.y(var2, 2, CodedLinkExtendedType.Serializer.INSTANCE, var0.getExtendedType());
      }

      var1.w(var2, 3, var0.getHeaderColor());
      var1.z(var2, 4, var0.getHeaderText());
      var1.y(var2, 5, InviteType.Serializer.INSTANCE, var0.getType());
      if (!var1.A(var2, 6) && var0.getAcceptLabelBackgroundColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 6, m0.a, var0.getAcceptLabelBackgroundColor());
      }

      if (!var1.A(var2, 7) && var0.getAcceptLabelBorderColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 7, m0.a, var0.getAcceptLabelBorderColor());
      }

      if (!var1.A(var2, 8) && var0.getAcceptLabelColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 8, m0.a, var0.getAcceptLabelColor());
      }

      if (!var1.A(var2, 9) && var0.getAcceptLabelIcon() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 9, a2.a, var0.getAcceptLabelIcon());
      }

      if (!var1.A(var2, 10) && var0.getAcceptLabelText() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 10, a2.a, var0.getAcceptLabelText());
      }

      if (!var1.A(var2, 11) && var0.getBadgeCount() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 11, a2.a, var0.getBadgeCount());
      }

      if (!var1.A(var2, 12) && var0.getBadgeIcon() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 12, a2.a, var0.getBadgeIcon());
      }

      if (!var1.A(var2, 13) && var0.getBodyText() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 13, a2.a, var0.getBodyText());
      }

      if (!var1.A(var2, 14) && var0.getBodyTextColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 14, m0.a, var0.getBodyTextColor());
      }

      if (!var1.A(var2, 15) && var0.getCanBeAccepted() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 15, h.a, var0.getCanBeAccepted());
      }

      if (!var1.A(var2, 16) && var0.getChannelIcon() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 16, a2.a, var0.getChannelIcon());
      }

      if (!var1.A(var2, 17) && var0.getChannelName() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 17, a2.a, var0.getChannelName());
      }

      if (!var1.A(var2, 18) && var0.getContent() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 18, StructurableTextSerializer.INSTANCE, var0.getContent());
      }

      if (!var1.A(var2, 19) && var0.getCreatorAvatar() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 19, a2.a, var0.getCreatorAvatar());
      }

      if (!var1.A(var2, 20) && var0.getEmbedCanBeTapped() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 20, h.a, var0.getEmbedCanBeTapped());
      }

      if (!var1.A(var2, 21) && var0.getGuildIcon() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 21, a2.a, var0.getGuildIcon());
      }

      if (!var1.A(var2, 22) && var0.getGuildName() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 22, a2.a, var0.getGuildName());
      }

      if (!var1.A(var2, 23) && var0.getHeaderIcon() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 23, a2.a, var0.getHeaderIcon());
      }

      if (!var1.A(var2, 24) && var0.getHeaderTextColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 24, m0.a, var0.getHeaderTextColor());
      }

      if (!var1.A(var2, 25) && var0.isRsvped() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 25, h.a, var0.isRsvped());
      }

      if (!var1.A(var2, 26) && var0.getMemberText() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 26, a2.a, var0.getMemberText());
      }

      if (!var1.A(var2, 27) && var0.getOnlineText() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 27, a2.a, var0.getOnlineText());
      }

      if (!var1.A(var2, 28) && var0.getResolvingGradientEnd() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 28, m0.a, var0.getResolvingGradientEnd());
      }

      if (!var1.A(var2, 29) && var0.getResolvingGradientStart() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 29, m0.a, var0.getResolvingGradientStart());
      }

      if (!var1.A(var2, 30) && var0.getSecondaryActionIcon() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 30, a2.a, var0.getSecondaryActionIcon());
      }

      if (!var1.A(var2, 31) && var0.getSplashHasRadialGradient() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 31, h.a, var0.getSplashHasRadialGradient());
      }

      if (!var1.A(var2, 32) && var0.getSplashOpacity() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 32, m0.a, var0.getSplashOpacity());
      }

      if (!var1.A(var2, 33) && var0.getSplashUrl() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 33, a2.a, var0.getSplashUrl());
      }

      if (!var1.A(var2, 34) && var0.getInviteSplash() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 34, a2.a, var0.getInviteSplash());
      }

      if (!var1.A(var2, 35) && var0.getSubtitle() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 35, a2.a, var0.getSubtitle());
      }

      if (!var1.A(var2, 36) && var0.getSubtitleColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 36, m0.a, var0.getSubtitleColor());
      }

      if (!var1.A(var2, 37) && var0.getThumbnailBackgroundColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 37, m0.a, var0.getThumbnailBackgroundColor());
      }

      if (!var1.A(var2, 38) && var0.getThumbnailCornerRadius() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 38, m0.a, var0.getThumbnailCornerRadius());
      }

      if (!var1.A(var2, 39) && var0.getThumbnailText() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 39, a2.a, var0.getThumbnailText());
      }

      if (!var1.A(var2, 40) && var0.getThumbnailUrl() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 40, a2.a, var0.getThumbnailUrl());
      }

      if (!var1.A(var2, 41) && var0.getTitleColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 41, m0.a, var0.getTitleColor());
      }

      label312: {
         if (!var1.A(var2, 42)) {
            var5 = false;
            if (var0.getTitleText() == null) {
               break label312;
            }
         }

         var5 = true;
      }

      if (var5) {
         var1.m(var2, 42, a2.a, var0.getTitleText());
      }
   }

   public operator fun component1(): Int {
      return this.getBackgroundColor();
   }

   public operator fun component10(): String? {
      return this.getAcceptLabelIcon();
   }

   public operator fun component11(): String? {
      return this.getAcceptLabelText();
   }

   public operator fun component12(): String? {
      return this.getBadgeCount();
   }

   public operator fun component13(): String? {
      return this.getBadgeIcon();
   }

   public operator fun component14(): String? {
      return this.getBodyText();
   }

   public operator fun component15(): Int? {
      return this.getBodyTextColor();
   }

   public operator fun component16(): Boolean? {
      return this.getCanBeAccepted();
   }

   public operator fun component17(): String? {
      return this.getChannelIcon();
   }

   public operator fun component18(): String? {
      return this.getChannelName();
   }

   public operator fun component19(): StructurableText? {
      return this.getContent();
   }

   public operator fun component2(): Int {
      return this.getBorderColor();
   }

   public operator fun component20(): String? {
      return this.getCreatorAvatar();
   }

   public operator fun component21(): Boolean? {
      return this.getEmbedCanBeTapped();
   }

   public operator fun component22(): String? {
      return this.getGuildIcon();
   }

   public operator fun component23(): String? {
      return this.getGuildName();
   }

   public operator fun component24(): String? {
      return this.getHeaderIcon();
   }

   public operator fun component25(): Int? {
      return this.getHeaderTextColor();
   }

   public operator fun component26(): Boolean? {
      return this.isRsvped();
   }

   public operator fun component27(): String? {
      return this.getMemberText();
   }

   public operator fun component28(): String? {
      return this.getOnlineText();
   }

   public operator fun component29(): Int? {
      return this.getResolvingGradientEnd();
   }

   public operator fun component3(): CodedLinkExtendedType {
      return this.getExtendedType();
   }

   public operator fun component30(): Int? {
      return this.getResolvingGradientStart();
   }

   public operator fun component31(): String? {
      return this.getSecondaryActionIcon();
   }

   public operator fun component32(): Boolean? {
      return this.getSplashHasRadialGradient();
   }

   public operator fun component33(): Int? {
      return this.getSplashOpacity();
   }

   public operator fun component34(): String? {
      return this.getSplashUrl();
   }

   public operator fun component35(): String? {
      return this.getInviteSplash();
   }

   public operator fun component36(): String? {
      return this.getSubtitle();
   }

   public operator fun component37(): Int? {
      return this.getSubtitleColor();
   }

   public operator fun component38(): Int? {
      return this.getThumbnailBackgroundColor();
   }

   public operator fun component39(): Int? {
      return this.getThumbnailCornerRadius();
   }

   public operator fun component4(): Int {
      return this.getHeaderColor();
   }

   public operator fun component40(): String? {
      return this.getThumbnailText();
   }

   public operator fun component41(): String? {
      return this.getThumbnailUrl();
   }

   public operator fun component42(): Int? {
      return this.getTitleColor();
   }

   public operator fun component43(): String? {
      return this.getTitleText();
   }

   public operator fun component5(): String {
      return this.getHeaderText();
   }

   public operator fun component6(): InviteType {
      return this.getType();
   }

   public operator fun component7(): Int? {
      return this.getAcceptLabelBackgroundColor();
   }

   public operator fun component8(): Int? {
      return this.getAcceptLabelBorderColor();
   }

   public operator fun component9(): Int? {
      return this.getAcceptLabelColor();
   }

   public fun copy(
      backgroundColor: Int = var0.getBackgroundColor(),
      borderColor: Int = var0.getBorderColor(),
      extendedType: CodedLinkExtendedType = var0.getExtendedType(),
      headerColor: Int = var0.getHeaderColor(),
      headerText: String = var0.getHeaderText(),
      type: InviteType = var0.getType(),
      acceptLabelBackgroundColor: Int? = var0.getAcceptLabelBackgroundColor(),
      acceptLabelBorderColor: Int? = var0.getAcceptLabelBorderColor(),
      acceptLabelColor: Int? = var0.getAcceptLabelColor(),
      acceptLabelIcon: String? = var0.getAcceptLabelIcon(),
      acceptLabelText: String? = var0.getAcceptLabelText(),
      badgeCount: String? = var0.getBadgeCount(),
      badgeIcon: String? = var0.getBadgeIcon(),
      bodyText: String? = var0.getBodyText(),
      bodyTextColor: Int? = var0.getBodyTextColor(),
      canBeAccepted: Boolean? = var0.getCanBeAccepted(),
      channelIcon: String? = var0.getChannelIcon(),
      channelName: String? = var0.getChannelName(),
      content: StructurableText? = var0.getContent(),
      creatorAvatar: String? = var0.getCreatorAvatar(),
      embedCanBeTapped: Boolean? = var0.getEmbedCanBeTapped(),
      guildIcon: String? = var0.getGuildIcon(),
      guildName: String? = var0.getGuildName(),
      headerIcon: String? = var0.getHeaderIcon(),
      headerTextColor: Int? = var0.getHeaderTextColor(),
      isRsvped: Boolean? = var0.isRsvped(),
      memberText: String? = var0.getMemberText(),
      onlineText: String? = var0.getOnlineText(),
      resolvingGradientEnd: Int? = var0.getResolvingGradientEnd(),
      resolvingGradientStart: Int? = var0.getResolvingGradientStart(),
      secondaryActionIcon: String? = var0.getSecondaryActionIcon(),
      splashHasRadialGradient: Boolean? = var0.getSplashHasRadialGradient(),
      splashOpacity: Int? = var0.getSplashOpacity(),
      splashUrl: String? = var0.getSplashUrl(),
      inviteSplash: String? = var0.getInviteSplash(),
      subtitle: String? = var0.getSubtitle(),
      subtitleColor: Int? = var0.getSubtitleColor(),
      thumbnailBackgroundColor: Int? = var0.getThumbnailBackgroundColor(),
      thumbnailCornerRadius: Int? = var0.getThumbnailCornerRadius(),
      thumbnailText: String? = var0.getThumbnailText(),
      thumbnailUrl: String? = var0.getThumbnailUrl(),
      titleColor: Int? = var0.getTitleColor(),
      titleText: String? = var0.getTitleText()
   ): GuildEventInviteEmbedImpl {
      r.h(var3, "extendedType");
      r.h(var5, "headerText");
      r.h(var6, "type");
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
         if (this.getBackgroundColor() != var1.getBackgroundColor()) {
            return false;
         } else if (this.getBorderColor() != var1.getBorderColor()) {
            return false;
         } else if (this.getExtendedType() != var1.getExtendedType()) {
            return false;
         } else if (this.getHeaderColor() != var1.getHeaderColor()) {
            return false;
         } else if (!r.c(this.getHeaderText(), var1.getHeaderText())) {
            return false;
         } else if (this.getType() != var1.getType()) {
            return false;
         } else if (!r.c(this.getAcceptLabelBackgroundColor(), var1.getAcceptLabelBackgroundColor())) {
            return false;
         } else if (!r.c(this.getAcceptLabelBorderColor(), var1.getAcceptLabelBorderColor())) {
            return false;
         } else if (!r.c(this.getAcceptLabelColor(), var1.getAcceptLabelColor())) {
            return false;
         } else if (!r.c(this.getAcceptLabelIcon(), var1.getAcceptLabelIcon())) {
            return false;
         } else if (!r.c(this.getAcceptLabelText(), var1.getAcceptLabelText())) {
            return false;
         } else if (!r.c(this.getBadgeCount(), var1.getBadgeCount())) {
            return false;
         } else if (!r.c(this.getBadgeIcon(), var1.getBadgeIcon())) {
            return false;
         } else if (!r.c(this.getBodyText(), var1.getBodyText())) {
            return false;
         } else if (!r.c(this.getBodyTextColor(), var1.getBodyTextColor())) {
            return false;
         } else if (!r.c(this.getCanBeAccepted(), var1.getCanBeAccepted())) {
            return false;
         } else if (!r.c(this.getChannelIcon(), var1.getChannelIcon())) {
            return false;
         } else if (!r.c(this.getChannelName(), var1.getChannelName())) {
            return false;
         } else if (!r.c(this.getContent(), var1.getContent())) {
            return false;
         } else if (!r.c(this.getCreatorAvatar(), var1.getCreatorAvatar())) {
            return false;
         } else if (!r.c(this.getEmbedCanBeTapped(), var1.getEmbedCanBeTapped())) {
            return false;
         } else if (!r.c(this.getGuildIcon(), var1.getGuildIcon())) {
            return false;
         } else if (!r.c(this.getGuildName(), var1.getGuildName())) {
            return false;
         } else if (!r.c(this.getHeaderIcon(), var1.getHeaderIcon())) {
            return false;
         } else if (!r.c(this.getHeaderTextColor(), var1.getHeaderTextColor())) {
            return false;
         } else if (!r.c(this.isRsvped(), var1.isRsvped())) {
            return false;
         } else if (!r.c(this.getMemberText(), var1.getMemberText())) {
            return false;
         } else if (!r.c(this.getOnlineText(), var1.getOnlineText())) {
            return false;
         } else if (!r.c(this.getResolvingGradientEnd(), var1.getResolvingGradientEnd())) {
            return false;
         } else if (!r.c(this.getResolvingGradientStart(), var1.getResolvingGradientStart())) {
            return false;
         } else if (!r.c(this.getSecondaryActionIcon(), var1.getSecondaryActionIcon())) {
            return false;
         } else if (!r.c(this.getSplashHasRadialGradient(), var1.getSplashHasRadialGradient())) {
            return false;
         } else if (!r.c(this.getSplashOpacity(), var1.getSplashOpacity())) {
            return false;
         } else if (!r.c(this.getSplashUrl(), var1.getSplashUrl())) {
            return false;
         } else if (!r.c(this.getInviteSplash(), var1.getInviteSplash())) {
            return false;
         } else if (!r.c(this.getSubtitle(), var1.getSubtitle())) {
            return false;
         } else if (!r.c(this.getSubtitleColor(), var1.getSubtitleColor())) {
            return false;
         } else if (!r.c(this.getThumbnailBackgroundColor(), var1.getThumbnailBackgroundColor())) {
            return false;
         } else if (!r.c(this.getThumbnailCornerRadius(), var1.getThumbnailCornerRadius())) {
            return false;
         } else if (!r.c(this.getThumbnailText(), var1.getThumbnailText())) {
            return false;
         } else if (!r.c(this.getThumbnailUrl(), var1.getThumbnailUrl())) {
            return false;
         } else if (!r.c(this.getTitleColor(), var1.getTitleColor())) {
            return false;
         } else {
            return r.c(this.getTitleText(), var1.getTitleText());
         }
      }
   }

   public override fun hashCode(): Int {
      val var43: Int = Integer.hashCode(this.getBackgroundColor());
      val var42: Int = Integer.hashCode(this.getBorderColor());
      val var40: Int = this.getExtendedType().hashCode();
      val var41: Int = Integer.hashCode(this.getHeaderColor());
      val var39: Int = this.getHeaderText().hashCode();
      val var38: Int = this.getType().hashCode();
      val var44: Int = this.getAcceptLabelBackgroundColor();
      var var37: Int = 0;
      val var1: Int;
      if (var44 == null) {
         var1 = 0;
      } else {
         var1 = this.getAcceptLabelBackgroundColor().hashCode();
      }

      val var2: Int;
      if (this.getAcceptLabelBorderColor() == null) {
         var2 = 0;
      } else {
         var2 = this.getAcceptLabelBorderColor().hashCode();
      }

      val var3: Int;
      if (this.getAcceptLabelColor() == null) {
         var3 = 0;
      } else {
         var3 = this.getAcceptLabelColor().hashCode();
      }

      val var4: Int;
      if (this.getAcceptLabelIcon() == null) {
         var4 = 0;
      } else {
         var4 = this.getAcceptLabelIcon().hashCode();
      }

      val var5: Int;
      if (this.getAcceptLabelText() == null) {
         var5 = 0;
      } else {
         var5 = this.getAcceptLabelText().hashCode();
      }

      val var6: Int;
      if (this.getBadgeCount() == null) {
         var6 = 0;
      } else {
         var6 = this.getBadgeCount().hashCode();
      }

      val var7: Int;
      if (this.getBadgeIcon() == null) {
         var7 = 0;
      } else {
         var7 = this.getBadgeIcon().hashCode();
      }

      val var8: Int;
      if (this.getBodyText() == null) {
         var8 = 0;
      } else {
         var8 = this.getBodyText().hashCode();
      }

      val var9: Int;
      if (this.getBodyTextColor() == null) {
         var9 = 0;
      } else {
         var9 = this.getBodyTextColor().hashCode();
      }

      val var10: Int;
      if (this.getCanBeAccepted() == null) {
         var10 = 0;
      } else {
         var10 = this.getCanBeAccepted().hashCode();
      }

      val var11: Int;
      if (this.getChannelIcon() == null) {
         var11 = 0;
      } else {
         var11 = this.getChannelIcon().hashCode();
      }

      val var12: Int;
      if (this.getChannelName() == null) {
         var12 = 0;
      } else {
         var12 = this.getChannelName().hashCode();
      }

      val var13: Int;
      if (this.getContent() == null) {
         var13 = 0;
      } else {
         var13 = this.getContent().hashCode();
      }

      val var14: Int;
      if (this.getCreatorAvatar() == null) {
         var14 = 0;
      } else {
         var14 = this.getCreatorAvatar().hashCode();
      }

      val var15: Int;
      if (this.getEmbedCanBeTapped() == null) {
         var15 = 0;
      } else {
         var15 = this.getEmbedCanBeTapped().hashCode();
      }

      val var16: Int;
      if (this.getGuildIcon() == null) {
         var16 = 0;
      } else {
         var16 = this.getGuildIcon().hashCode();
      }

      val var17: Int;
      if (this.getGuildName() == null) {
         var17 = 0;
      } else {
         var17 = this.getGuildName().hashCode();
      }

      val var18: Int;
      if (this.getHeaderIcon() == null) {
         var18 = 0;
      } else {
         var18 = this.getHeaderIcon().hashCode();
      }

      val var19: Int;
      if (this.getHeaderTextColor() == null) {
         var19 = 0;
      } else {
         var19 = this.getHeaderTextColor().hashCode();
      }

      val var20: Int;
      if (this.isRsvped() == null) {
         var20 = 0;
      } else {
         var20 = this.isRsvped().hashCode();
      }

      val var21: Int;
      if (this.getMemberText() == null) {
         var21 = 0;
      } else {
         var21 = this.getMemberText().hashCode();
      }

      val var22: Int;
      if (this.getOnlineText() == null) {
         var22 = 0;
      } else {
         var22 = this.getOnlineText().hashCode();
      }

      val var23: Int;
      if (this.getResolvingGradientEnd() == null) {
         var23 = 0;
      } else {
         var23 = this.getResolvingGradientEnd().hashCode();
      }

      val var24: Int;
      if (this.getResolvingGradientStart() == null) {
         var24 = 0;
      } else {
         var24 = this.getResolvingGradientStart().hashCode();
      }

      val var25: Int;
      if (this.getSecondaryActionIcon() == null) {
         var25 = 0;
      } else {
         var25 = this.getSecondaryActionIcon().hashCode();
      }

      val var26: Int;
      if (this.getSplashHasRadialGradient() == null) {
         var26 = 0;
      } else {
         var26 = this.getSplashHasRadialGradient().hashCode();
      }

      val var27: Int;
      if (this.getSplashOpacity() == null) {
         var27 = 0;
      } else {
         var27 = this.getSplashOpacity().hashCode();
      }

      val var28: Int;
      if (this.getSplashUrl() == null) {
         var28 = 0;
      } else {
         var28 = this.getSplashUrl().hashCode();
      }

      val var29: Int;
      if (this.getInviteSplash() == null) {
         var29 = 0;
      } else {
         var29 = this.getInviteSplash().hashCode();
      }

      val var30: Int;
      if (this.getSubtitle() == null) {
         var30 = 0;
      } else {
         var30 = this.getSubtitle().hashCode();
      }

      val var31: Int;
      if (this.getSubtitleColor() == null) {
         var31 = 0;
      } else {
         var31 = this.getSubtitleColor().hashCode();
      }

      val var32: Int;
      if (this.getThumbnailBackgroundColor() == null) {
         var32 = 0;
      } else {
         var32 = this.getThumbnailBackgroundColor().hashCode();
      }

      val var33: Int;
      if (this.getThumbnailCornerRadius() == null) {
         var33 = 0;
      } else {
         var33 = this.getThumbnailCornerRadius().hashCode();
      }

      val var34: Int;
      if (this.getThumbnailText() == null) {
         var34 = 0;
      } else {
         var34 = this.getThumbnailText().hashCode();
      }

      val var35: Int;
      if (this.getThumbnailUrl() == null) {
         var35 = 0;
      } else {
         var35 = this.getThumbnailUrl().hashCode();
      }

      val var36: Int;
      if (this.getTitleColor() == null) {
         var36 = 0;
      } else {
         var36 = this.getTitleColor().hashCode();
      }

      if (this.getTitleText() != null) {
         var37 = this.getTitleText().hashCode();
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
                                                                                                                                                                                                                                                                                                                                                                                       var43
                                                                                                                                                                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                                                                                                                                                                          + var42
                                                                                                                                                                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                                                                                                                                                                 + var40
                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                                                                                                                                                                        + var41
                                                                                                                                                                                                                                                                                                                                                                  )
                                                                                                                                                                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                                                                                                                                                                               + var39
                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                      + var38
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
      val var3: Int = this.getBackgroundColor();
      val var2: Int = this.getBorderColor();
      val var10: CodedLinkExtendedType = this.getExtendedType();
      val var1: Int = this.getHeaderColor();
      val var27: java.lang.String = this.getHeaderText();
      val var8: InviteType = this.getType();
      val var29: Int = this.getAcceptLabelBackgroundColor();
      val var5: Int = this.getAcceptLabelBorderColor();
      val var13: Int = this.getAcceptLabelColor();
      val var11: java.lang.String = this.getAcceptLabelIcon();
      val var42: java.lang.String = this.getAcceptLabelText();
      val var43: java.lang.String = this.getBadgeCount();
      val var23: java.lang.String = this.getBadgeIcon();
      val var9: java.lang.String = this.getBodyText();
      val var37: Int = this.getBodyTextColor();
      val var18: java.lang.Boolean = this.getCanBeAccepted();
      val var20: java.lang.String = this.getChannelIcon();
      val var30: java.lang.String = this.getChannelName();
      val var7: StructurableText = this.getContent();
      val var24: java.lang.String = this.getCreatorAvatar();
      val var31: java.lang.Boolean = this.getEmbedCanBeTapped();
      val var38: java.lang.String = this.getGuildIcon();
      val var22: java.lang.String = this.getGuildName();
      val var14: java.lang.String = this.getHeaderIcon();
      val var26: Int = this.getHeaderTextColor();
      val var19: java.lang.Boolean = this.isRsvped();
      val var32: java.lang.String = this.getMemberText();
      val var44: java.lang.String = this.getOnlineText();
      val var28: Int = this.getResolvingGradientEnd();
      val var35: Int = this.getResolvingGradientStart();
      val var41: java.lang.String = this.getSecondaryActionIcon();
      val var16: java.lang.Boolean = this.getSplashHasRadialGradient();
      val var4: Int = this.getSplashOpacity();
      val var6: java.lang.String = this.getSplashUrl();
      val var39: java.lang.String = this.getInviteSplash();
      val var34: java.lang.String = this.getSubtitle();
      val var25: Int = this.getSubtitleColor();
      val var40: Int = this.getThumbnailBackgroundColor();
      val var17: Int = this.getThumbnailCornerRadius();
      val var21: java.lang.String = this.getThumbnailText();
      val var33: java.lang.String = this.getThumbnailUrl();
      val var36: Int = this.getTitleColor();
      val var12: java.lang.String = this.getTitleText();
      val var15: StringBuilder = new StringBuilder();
      var15.append("GuildEventInviteEmbedImpl(backgroundColor=");
      var15.append(var3);
      var15.append(", borderColor=");
      var15.append(var2);
      var15.append(", extendedType=");
      var15.append(var10);
      var15.append(", headerColor=");
      var15.append(var1);
      var15.append(", headerText=");
      var15.append(var27);
      var15.append(", type=");
      var15.append(var8);
      var15.append(", acceptLabelBackgroundColor=");
      var15.append(var29);
      var15.append(", acceptLabelBorderColor=");
      var15.append(var5);
      var15.append(", acceptLabelColor=");
      var15.append(var13);
      var15.append(", acceptLabelIcon=");
      var15.append(var11);
      var15.append(", acceptLabelText=");
      var15.append(var42);
      var15.append(", badgeCount=");
      var15.append(var43);
      var15.append(", badgeIcon=");
      var15.append(var23);
      var15.append(", bodyText=");
      var15.append(var9);
      var15.append(", bodyTextColor=");
      var15.append(var37);
      var15.append(", canBeAccepted=");
      var15.append(var18);
      var15.append(", channelIcon=");
      var15.append(var20);
      var15.append(", channelName=");
      var15.append(var30);
      var15.append(", content=");
      var15.append(var7);
      var15.append(", creatorAvatar=");
      var15.append(var24);
      var15.append(", embedCanBeTapped=");
      var15.append(var31);
      var15.append(", guildIcon=");
      var15.append(var38);
      var15.append(", guildName=");
      var15.append(var22);
      var15.append(", headerIcon=");
      var15.append(var14);
      var15.append(", headerTextColor=");
      var15.append(var26);
      var15.append(", isRsvped=");
      var15.append(var19);
      var15.append(", memberText=");
      var15.append(var32);
      var15.append(", onlineText=");
      var15.append(var44);
      var15.append(", resolvingGradientEnd=");
      var15.append(var28);
      var15.append(", resolvingGradientStart=");
      var15.append(var35);
      var15.append(", secondaryActionIcon=");
      var15.append(var41);
      var15.append(", splashHasRadialGradient=");
      var15.append(var16);
      var15.append(", splashOpacity=");
      var15.append(var4);
      var15.append(", splashUrl=");
      var15.append(var6);
      var15.append(", inviteSplash=");
      var15.append(var39);
      var15.append(", subtitle=");
      var15.append(var34);
      var15.append(", subtitleColor=");
      var15.append(var25);
      var15.append(", thumbnailBackgroundColor=");
      var15.append(var40);
      var15.append(", thumbnailCornerRadius=");
      var15.append(var17);
      var15.append(", thumbnailText=");
      var15.append(var21);
      var15.append(", thumbnailUrl=");
      var15.append(var33);
      var15.append(", titleColor=");
      var15.append(var36);
      var15.append(", titleText=");
      var15.append(var12);
      var15.append(")");
      return var15.toString();
   }

   public object `$serializer` : f0<GuildEventInviteEmbedImpl> {
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
         val var2: m0 = m0.a;
         val var7: CodedLinkExtendedType.Serializer = CodedLinkExtendedType.Serializer.INSTANCE;
         val var9: a2 = a2.a;
         val var13: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var4: KSerializer = a.u(m0.a);
         val var10: KSerializer = a.u(var2);
         val var3: KSerializer = a.u(var2);
         val var1: KSerializer = a.u(var9);
         val var12: KSerializer = a.u(var9);
         val var6: KSerializer = a.u(var9);
         val var8: KSerializer = a.u(var9);
         val var14: KSerializer = a.u(var9);
         val var5: KSerializer = a.u(var2);
         val var11: h = h.a;
         return new KSerializer[]{
            var2,
            var2,
            var7,
            var2,
            var9,
            var13,
            var4,
            var10,
            var3,
            var1,
            var12,
            var6,
            var8,
            var14,
            var5,
            a.u(h.a),
            a.u(var9),
            a.u(var9),
            a.u(StructurableTextSerializer.INSTANCE),
            a.u(var9),
            a.u(var11),
            a.u(var9),
            a.u(var9),
            a.u(var9),
            a.u(var2),
            a.u(var11),
            a.u(var9),
            a.u(var9),
            a.u(var2),
            a.u(var2),
            a.u(var9),
            a.u(var11),
            a.u(var2),
            a.u(var9),
            a.u(var9),
            a.u(var9),
            a.u(var2),
            a.u(var2),
            a.u(var2),
            a.u(var9),
            a.u(var9),
            a.u(var2),
            a.u(var9)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildEventInviteEmbedImpl {
         r.h(var1, "decoder");
         val var61: SerialDescriptor = this.getDescriptor();
         val var62: c = var1.b(var61);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         var var9: Any;
         var var11: Any;
         var var15: Any;
         var var17: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var24: Any;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var34: Any;
         var var36: Any;
         var var37: Any;
         var var38: Any;
         var var39: Any;
         var var40: Any;
         var var41: Any;
         var var42: Any;
         var var43: Any;
         var var44: Any;
         var var45: Any;
         var var46: Any;
         var var47: Any;
         var var48: Any;
         var var49: Any;
         var var50: Any;
         var var51: Any;
         var var52: Any;
         val var53: Any;
         val var54: Any;
         val var55: Any;
         var var81: Any;
         var var141: Any;
         var var145: Any;
         var var161: Any;
         var var178: Any;
         if (var62.p()) {
            var5 = var62.i(var61, 0);
            var4 = var62.i(var61, 1);
            var29 = var62.y(var61, 2, CodedLinkExtendedType.Serializer.INSTANCE, null);
            var2 = var62.i(var61, 3);
            var9 = var62.m(var61, 4);
            var36 = var62.y(var61, 5, InviteType.Serializer.INSTANCE, null);
            var178 = m0.a;
            var28 = var62.n(var61, 6, m0.a, null);
            var48 = var62.n(var61, 7, (DeserializationStrategy)var178, null);
            var24 = var62.n(var61, 8, (DeserializationStrategy)var178, null);
            val var63: a2 = a2.a;
            val var35: Any = var62.n(var61, 9, a2.a, null);
            var145 = var62.n(var61, 10, var63, null);
            var40 = var62.n(var61, 11, var63, null);
            var27 = var62.n(var61, 12, var63, null);
            var53 = var62.n(var61, 13, var63, null);
            var11 = var62.n(var61, 14, (DeserializationStrategy)var178, null);
            var141 = h.a;
            var39 = var62.n(var61, 15, h.a, null);
            var32 = var62.n(var61, 16, var63, null);
            var30 = var62.n(var61, 17, var63, null);
            val var26: Any = var62.n(var61, 18, StructurableTextSerializer.INSTANCE, null);
            var161 = var62.n(var61, 19, var63, null);
            var81 = var62.n(var61, 20, (DeserializationStrategy)var141, null);
            val var14: Any = var62.n(var61, 21, var63, null);
            val var13: Any = var62.n(var61, 22, var63, null);
            var21 = var62.n(var61, 23, var63, null);
            var20 = var62.n(var61, 24, (DeserializationStrategy)var178, null);
            var15 = var62.n(var61, 25, (DeserializationStrategy)var141, null);
            var17 = var62.n(var61, 26, var63, null);
            val var12: Any = var62.n(var61, 27, var63, null);
            val var18: Any = var62.n(var61, 28, (DeserializationStrategy)var178, null);
            val var16: Any = var62.n(var61, 29, (DeserializationStrategy)var178, null);
            var19 = var62.n(var61, 30, var63, null);
            var141 = var62.n(var61, 31, (DeserializationStrategy)var141, null);
            var52 = var62.n(var61, 32, (DeserializationStrategy)var178, null);
            var44 = var62.n(var61, 33, var63, null);
            var42 = var62.n(var61, 34, var63, null);
            var34 = var62.n(var61, 35, var63, null);
            var51 = var62.n(var61, 36, (DeserializationStrategy)var178, null);
            var45 = var62.n(var61, 37, (DeserializationStrategy)var178, null);
            var41 = var62.n(var61, 38, (DeserializationStrategy)var178, null);
            var46 = var62.n(var61, 39, var63, null);
            var31 = var62.n(var61, 40, var63, null);
            var37 = var62.n(var61, 41, (DeserializationStrategy)var178, null);
            val var64: Any = var62.n(var61, 42, var63, null);
            var3 = 2047;
            var6 = -1;
            var178 = var141;
            var38 = var26;
            var54 = var161;
            var141 = var35;
            var47 = var145;
            var145 = var81;
            var43 = var14;
            var161 = var13;
            var49 = var12;
            var50 = var18;
            var81 = var16;
            var55 = var64;
         } else {
            var var8: Boolean = true;
            var3 = 0;
            var5 = 0;
            var4 = 0;
            var var7: Int = 0;
            var var125: Any = null;
            var var65: Any = null;
            var28 = null;
            var27 = null;
            var var166: Any = null;
            var31 = null;
            var47 = null;
            var37 = null;
            var46 = null;
            var var181: Any = null;
            var45 = null;
            var44 = null;
            var29 = null;
            var9 = null;
            var81 = null;
            var11 = null;
            var var101: Any = null;
            var15 = null;
            var17 = null;
            var var106: Any = null;
            var var97: Any = null;
            var var91: Any = null;
            var24 = null;
            var21 = null;
            var141 = null;
            var145 = null;
            var19 = null;
            var161 = null;
            var20 = null;
            var43 = null;
            var42 = null;
            var41 = null;
            var40 = null;
            var39 = null;
            var38 = null;
            var36 = null;
            var34 = null;
            var178 = null;
            var32 = null;
            var30 = null;
            var6 = 0;

            while (var8) {
               label150: {
                  label149: {
                     label148: {
                        label184: {
                           label185: {
                              label142: {
                                 label186: {
                                    label163: {
                                       label187: {
                                          label122: {
                                             label121: {
                                                var2 = var62.o(var61);
                                                switch (var2) {
                                                   case -1:
                                                      var8 = false;
                                                      break label185;
                                                   case 0:
                                                      var5 = var62.i(var61, 0);
                                                      var6 |= 1;
                                                      break label185;
                                                   case 1:
                                                      var7 = var62.i(var61, 1);
                                                      var6 |= 2;
                                                      break label185;
                                                   case 2:
                                                      var29 = var62.y(var61, 2, CodedLinkExtendedType.Serializer.INSTANCE, var29);
                                                      var6 |= 4;
                                                      break label184;
                                                   case 3:
                                                      var4 = var62.i(var61, 3);
                                                      var2 = var6 or 8;
                                                      var17 = var106;
                                                      var106 = var17;
                                                      var97 = var11;
                                                      var91 = var81;
                                                      var11 = var9;
                                                      var51 = var44;
                                                      var81 = var97;
                                                      var9 = var91;
                                                      break label163;
                                                   case 4:
                                                      var44 = var62.m(var61, 4);
                                                      var2 = var6 or 16;
                                                      break label121;
                                                   case 5:
                                                      var9 = var62.y(var61, 5, InviteType.Serializer.INSTANCE, var9);
                                                      var2 = var6 or 32;
                                                      break label121;
                                                   case 6:
                                                      var97 = var11;
                                                      var49 = var62.n(var61, 6, m0.a, var81);
                                                      var2 = var6 or 64;
                                                      var11 = var9;
                                                      var9 = var91;
                                                      var81 = var97;
                                                      var51 = var44;
                                                      var91 = var49;
                                                      var106 = var17;
                                                      var17 = var106;
                                                      break label163;
                                                   case 7:
                                                      var17 = var106;
                                                      var106 = var62.n(var61, 7, m0.a, var11);
                                                      var2 = var6 or 128;
                                                      var11 = var9;
                                                      var9 = var91;
                                                      var81 = var97;
                                                      var51 = var44;
                                                      var91 = var81;
                                                      var97 = var106;
                                                      var106 = var17;
                                                      break label163;
                                                   case 8:
                                                      var101 = var62.n(var61, 8, m0.a, var101);
                                                      var2 = var6 or 256;
                                                      var9 = var91;
                                                      var81 = var97;
                                                      var51 = var44;
                                                      var11 = var9;
                                                      var91 = var81;
                                                      var97 = var11;
                                                      var106 = var17;
                                                      var17 = var106;
                                                      break label163;
                                                   case 9:
                                                      var106 = var17;
                                                      var15 = var62.n(var61, 9, a2.a, var15);
                                                      var2 = var6 or 512;
                                                      var9 = var91;
                                                      var81 = var97;
                                                      var51 = var44;
                                                      var11 = var9;
                                                      var91 = var81;
                                                      var97 = var11;
                                                      var17 = var106;
                                                      break label163;
                                                   case 10:
                                                      var106 = var62.n(var61, 10, a2.a, var17);
                                                      var2 = var6 or 1024;
                                                      var9 = var91;
                                                      var81 = var97;
                                                      var51 = var44;
                                                      var11 = var9;
                                                      var91 = var81;
                                                      var97 = var11;
                                                      var17 = var106;
                                                      break label163;
                                                   case 11:
                                                      var48 = var62.n(var61, 11, a2.a, var106);
                                                      var2 = var6 or 2048;
                                                      var106 = var17;
                                                      var9 = var91;
                                                      var81 = var97;
                                                      var51 = var44;
                                                      var11 = var9;
                                                      var91 = var81;
                                                      var97 = var11;
                                                      var17 = var48;
                                                      break label163;
                                                   case 12:
                                                      var97 = var62.n(var61, 12, a2.a, var97);
                                                      var2 = var6 or 4096;
                                                      var9 = var91;
                                                      var81 = var97;
                                                      var51 = var44;
                                                      var11 = var9;
                                                      var91 = var81;
                                                      var97 = var11;
                                                      var106 = var17;
                                                      var17 = var106;
                                                      break label163;
                                                   case 13:
                                                      var51 = var62.n(var61, 13, a2.a, var91);
                                                      var2 = var6 or 8192;
                                                      var81 = var97;
                                                      var9 = var51;
                                                      var51 = var44;
                                                      var11 = var9;
                                                      var91 = var81;
                                                      var97 = var11;
                                                      var106 = var17;
                                                      var17 = var106;
                                                      break label163;
                                                   case 14:
                                                      val var152: Any = var62.n(var61, 14, m0.a, var24);
                                                      var2 = var6 or 16384;
                                                      var24 = var19;
                                                      var19 = var152;
                                                      var145 = var21;
                                                      var21 = var145;
                                                      break label186;
                                                   case 15:
                                                      var48 = var62.n(var61, 15, h.a, var21);
                                                      var2 = var6 or '耀';
                                                      var19 = var24;
                                                      var21 = var145;
                                                      var145 = var48;
                                                      var24 = var19;
                                                      break label186;
                                                   case 16:
                                                      var141 = var62.n(var61, 16, a2.a, var141);
                                                      var2 = var6 or 65536;
                                                      var21 = var145;
                                                      var145 = var21;
                                                      var24 = var19;
                                                      var19 = var24;
                                                      break label186;
                                                   case 17:
                                                      var145 = var62.n(var61, 17, a2.a, var145);
                                                      var2 = var6 or 131072;
                                                      var21 = var145;
                                                      var145 = var21;
                                                      var24 = var19;
                                                      var19 = var24;
                                                      break label186;
                                                   case 18:
                                                      var19 = var62.n(var61, 18, StructurableTextSerializer.INSTANCE, var19);
                                                      var2 = var6 or 262144;
                                                      var21 = var145;
                                                      var145 = var21;
                                                      var24 = var19;
                                                      var19 = var24;
                                                      break label186;
                                                   case 19:
                                                      var51 = var62.n(var61, 19, a2.a, var161);
                                                      var49 = var81;
                                                      var161 = var11;
                                                      var81 = var97;
                                                      var106 = var91;
                                                      var101 = var21;
                                                      var97 = var141;
                                                      var91 = var145;
                                                      var15 = var19;
                                                      var2 = var6 or 524288;
                                                      var51 = var44;
                                                      var141 = var9;
                                                      var21 = var101;
                                                      var145 = var15;
                                                      var44 = var17;
                                                      var24 = var106;
                                                      var48 = var51;
                                                      var50 = var24;
                                                      break label148;
                                                   case 20:
                                                      var20 = var62.n(var61, 20, h.a, var20);
                                                      var6 |= 1048576;
                                                      break label184;
                                                   case 21:
                                                      var43 = var62.n(var61, 21, a2.a, var43);
                                                      var2 = var6 or 2097152;
                                                      break label122;
                                                   case 22:
                                                      var42 = var62.n(var61, 22, a2.a, var42);
                                                      var2 = var6 or 4194304;
                                                      break label122;
                                                   case 23:
                                                      var41 = var62.n(var61, 23, a2.a, var41);
                                                      var2 = var6 or 8388608;
                                                      break label122;
                                                   case 24:
                                                      var40 = var62.n(var61, 24, m0.a, var40);
                                                      var2 = var6 or 16777216;
                                                      break label122;
                                                   case 25:
                                                      var39 = var62.n(var61, 25, h.a, var39);
                                                      var2 = var6 or 33554432;
                                                      break label122;
                                                   case 26:
                                                      var38 = var62.n(var61, 26, a2.a, var38);
                                                      var2 = var6 or 67108864;
                                                      break label122;
                                                   case 27:
                                                      var36 = var62.n(var61, 27, a2.a, var36);
                                                      var2 = var6 or 134217728;
                                                      break label122;
                                                   case 28:
                                                      var34 = var62.n(var61, 28, m0.a, var34);
                                                      var2 = var6 or 268435456;
                                                      break label122;
                                                   case 29:
                                                      var178 = var62.n(var61, 29, m0.a, var178);
                                                      var2 = var6 or 536870912;
                                                      break label122;
                                                   case 30:
                                                      var32 = var62.n(var61, 30, a2.a, var32);
                                                      var2 = var6 or 1073741824;
                                                      break label122;
                                                   case 31:
                                                      var2 = var3;
                                                      var31 = var62.n(var61, 31, h.a, var31);
                                                      var3 = var6 or Integer.MIN_VALUE;
                                                      var48 = var27;
                                                      var27 = var166;
                                                      break label149;
                                                   case 32:
                                                      var30 = var62.n(var61, 32, m0.a, var30);
                                                      var2 = var3 or 1;
                                                      var48 = var65;
                                                      break;
                                                   case 33:
                                                      var166 = var62.n(var61, 33, a2.a, var166);
                                                      var2 = var3 or 2;
                                                      var48 = var65;
                                                      break;
                                                   case 34:
                                                      var27 = var62.n(var61, 34, a2.a, var27);
                                                      var2 = var3 or 4;
                                                      var48 = var65;
                                                      break;
                                                   case 35:
                                                      var125 = var62.n(var61, 35, a2.a, var125);
                                                      var2 = var3 or 8;
                                                      var48 = var65;
                                                      break;
                                                   case 36:
                                                      var48 = var62.n(var61, 36, m0.a, var65);
                                                      var2 = var3 or 16;
                                                      break;
                                                   case 37:
                                                      var45 = var62.n(var61, 37, m0.a, var45);
                                                      var2 = var3 or 32;
                                                      var48 = var65;
                                                      var49 = var166;
                                                      var65 = var125;
                                                      break label187;
                                                   case 38:
                                                      var181 = var62.n(var61, 38, m0.a, var181);
                                                      var2 = var3 or 64;
                                                      var48 = var65;
                                                      var49 = var166;
                                                      var65 = var125;
                                                      break label187;
                                                   case 39:
                                                      var46 = var62.n(var61, 39, a2.a, var46);
                                                      var2 = var3 or 128;
                                                      var48 = var65;
                                                      var49 = var166;
                                                      var65 = var125;
                                                      break label187;
                                                   case 40:
                                                      var28 = var62.n(var61, 40, a2.a, var28);
                                                      var2 = var3 or 256;
                                                      var48 = var65;
                                                      break;
                                                   case 41:
                                                      var37 = var62.n(var61, 41, m0.a, var37);
                                                      var2 = var3 or 512;
                                                      var48 = var65;
                                                      var49 = var166;
                                                      var65 = var125;
                                                      break label187;
                                                   case 42:
                                                      var47 = var62.n(var61, 42, a2.a, var47);
                                                      var2 = var3 or 1024;
                                                      var48 = var65;
                                                      var49 = var166;
                                                      var65 = var125;
                                                      break label187;
                                                   default:
                                                      throw new n(var2);
                                                }

                                                var65 = var125;
                                                var49 = var166;
                                                break label187;
                                             }

                                             var106 = var17;
                                             var81 = var97;
                                             var11 = var9;
                                             var9 = var91;
                                             var51 = var44;
                                             var91 = var81;
                                             var97 = var11;
                                             var17 = var106;
                                             break label163;
                                          }

                                          var6 = var3;
                                          var3 = var2;
                                          var49 = var166;
                                          var48 = var27;
                                          var166 = var65;
                                          break label142;
                                       }

                                       var3 = var6;
                                       var166 = var48;
                                       var48 = var27;
                                       var125 = var65;
                                       var6 = var2;
                                       break label142;
                                    }

                                    var50 = var24;
                                    var48 = var161;
                                    var24 = var17;
                                    var44 = var106;
                                    var145 = var15;
                                    var21 = var101;
                                    var161 = var97;
                                    var49 = var91;
                                    var141 = var11;
                                    var106 = var9;
                                    var15 = var19;
                                    var101 = var21;
                                    var97 = var141;
                                    var91 = var145;
                                    break label148;
                                 }

                                 var49 = var81;
                                 var81 = var97;
                                 var106 = var91;
                                 var91 = var21;
                                 var97 = var141;
                                 var101 = var145;
                                 var15 = var24;
                                 var51 = var44;
                                 var141 = var9;
                                 var161 = var11;
                                 var21 = var101;
                                 var145 = var15;
                                 var44 = var17;
                                 var24 = var106;
                                 var48 = var161;
                                 var50 = var19;
                                 break label148;
                              }

                              var2 = var6;
                              var27 = var49;
                              var65 = var166;
                              break label149;
                           }

                           var2 = var3;
                           var24 = var106;
                           var17 = var97;
                           var106 = var91;
                           var101 = var21;
                           var97 = var141;
                           var91 = var145;
                           var9 = var125;
                           var11 = var29;
                           var161 = var24;
                           var48 = var161;
                           var145 = var17;
                           var141 = var15;
                           var21 = var101;
                           var20 = var11;
                           var19 = var81;
                           var125 = var9;
                           var51 = var44;
                           var81 = var20;
                           var15 = var19;
                           var52 = var27;
                           break label150;
                        }

                        var2 = var3;
                        var24 = var106;
                        var17 = var97;
                        var106 = var91;
                        var15 = var19;
                        var101 = var21;
                        var97 = var141;
                        var91 = var145;
                        var9 = var125;
                        var52 = var27;
                        var11 = var29;
                        var81 = var20;
                        var51 = var44;
                        var125 = var9;
                        var19 = var81;
                        var20 = var11;
                        var21 = var101;
                        var141 = var15;
                        var145 = var17;
                        var48 = var161;
                        var161 = var24;
                        break label150;
                     }

                     var11 = var29;
                     var9 = var125;
                     var52 = var27;
                     var6 = var2;
                     var17 = var81;
                     var81 = var20;
                     var125 = var141;
                     var19 = var49;
                     var20 = var161;
                     var141 = var145;
                     var145 = var44;
                     var161 = var50;
                     var2 = var3;
                     break label150;
                  }

                  var81 = var20;
                  var17 = var97;
                  var106 = var91;
                  var15 = var19;
                  var101 = var21;
                  var97 = var141;
                  var91 = var145;
                  var11 = var29;
                  var52 = var48;
                  var166 = var27;
                  var6 = var3;
                  var9 = var125;
                  var51 = var44;
                  var125 = var9;
                  var19 = var81;
                  var20 = var11;
                  var21 = var101;
                  var141 = var15;
                  var145 = var17;
                  var24 = var106;
                  var48 = var161;
                  var161 = var24;
               }

               var91 = var106;
               var97 = var17;
               var9 = var125;
               var101 = var21;
               var15 = var141;
               var106 = var24;
               var24 = var161;
               var20 = var81;
               var3 = var2;
               var125 = var9;
               var27 = var52;
               var44 = var51;
               var29 = var11;
               var81 = var19;
               var11 = var20;
               var17 = var145;
               var21 = var101;
               var141 = var97;
               var145 = var91;
               var19 = var15;
               var161 = var48;
            }

            var30 = var145;
            var2 = var4;
            var31 = var28;
            var4 = var7;
            var9 = var44;
            var55 = var47;
            var19 = var32;
            var81 = var178;
            var50 = var34;
            var49 = var36;
            var17 = var38;
            var15 = var39;
            var20 = var40;
            var21 = var41;
            var161 = var42;
            var11 = var24;
            var145 = var20;
            var52 = var30;
            var47 = var17;
            var141 = var15;
            var24 = var101;
            var54 = var161;
            var38 = var19;
            var32 = var141;
            var39 = var21;
            var48 = var11;
            var28 = var81;
            var36 = var9;
            var178 = var31;
            var34 = var125;
            var41 = var181;
            var44 = var166;
            var42 = var27;
            var51 = var65;
            var53 = var91;
            var27 = var97;
            var40 = var106;
         }

         var62.c(var61);
         return new GuildEventInviteEmbedImpl(
            var6,
            var3,
            var5,
            var4,
            var29 as CodedLinkExtendedType,
            var2,
            (java.lang.String)var9,
            var36 as InviteType,
            var28 as Integer,
            var48 as Integer,
            var24 as Integer,
            var141 as java.lang.String,
            var47 as java.lang.String,
            var40 as java.lang.String,
            var27 as java.lang.String,
            var53 as java.lang.String,
            var11 as Integer,
            var39 as java.lang.Boolean,
            var32 as java.lang.String,
            var30 as java.lang.String,
            var38 as StructurableText,
            var54 as java.lang.String,
            var145 as java.lang.Boolean,
            var43 as java.lang.String,
            var161 as java.lang.String,
            var21 as java.lang.String,
            var20 as Integer,
            var15 as java.lang.Boolean,
            var17 as java.lang.String,
            var49 as java.lang.String,
            var50 as Integer,
            var81 as Integer,
            var19 as java.lang.String,
            var178 as java.lang.Boolean,
            var52 as Integer,
            var44 as java.lang.String,
            var42 as java.lang.String,
            var34 as java.lang.String,
            var51 as Integer,
            var45 as Integer,
            var41 as Integer,
            var46 as java.lang.String,
            var31 as java.lang.String,
            var37 as Integer,
            var55 as java.lang.String,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: GuildEventInviteEmbedImpl) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         GuildEventInviteEmbedImpl.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildEventInviteEmbedImpl> {
         return GuildEventInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
