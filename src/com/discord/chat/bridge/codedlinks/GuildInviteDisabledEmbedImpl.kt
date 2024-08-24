package com.discord.chat.bridge.codedlinks

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
      r.h(var4, "headerText");
      r.h(var5, "type");
      r.h(var6, "titleText");
      r.h(var7, "subtitle");
      r.h(var8, "helpCenterArticleLabel");
      r.h(var9, "helpCenterArticleURL");
      r.h(var34, "extendedType");
      r.h(var35, "guildName");
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

   @JvmStatic
   public fun `write$Self`(self: GuildInviteDisabledEmbedImpl, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.getBackgroundColor());
      var1.w(var2, 1, var0.getBorderColor());
      var1.w(var2, 2, var0.getHeaderColor());
      var1.z(var2, 3, var0.getHeaderText());
      var1.y(var2, 4, InviteType.Serializer.INSTANCE, var0.getType());
      var1.z(var2, 5, var0.getTitleText());
      var1.z(var2, 6, var0.getSubtitle());
      var1.z(var2, 7, var0.getHelpCenterArticleLabel());
      var1.z(var2, 8, var0.getHelpCenterArticleURL());
      var var5: Boolean;
      if (!var1.A(var2, 9) && var0.getAcceptLabelBackgroundColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 9, m0.a, var0.getAcceptLabelBackgroundColor());
      }

      if (!var1.A(var2, 10) && var0.getAcceptLabelBorderColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 10, m0.a, var0.getAcceptLabelBorderColor());
      }

      if (!var1.A(var2, 11) && var0.getAcceptLabelColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 11, m0.a, var0.getAcceptLabelColor());
      }

      if (!var1.A(var2, 12) && var0.getAcceptLabelText() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 12, a2.a, var0.getAcceptLabelText());
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

      if (!var1.A(var2, 18) && var0.getEmbedCanBeTapped() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 18, h.a, var0.getEmbedCanBeTapped());
      }

      if (!var1.A(var2, 19) && var0.getMemberText() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 19, a2.a, var0.getMemberText());
      }

      if (!var1.A(var2, 20) && var0.getOnlineText() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 20, a2.a, var0.getOnlineText());
      }

      if (!var1.A(var2, 21) && var0.getResolvingGradientEnd() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 21, m0.a, var0.getResolvingGradientEnd());
      }

      if (!var1.A(var2, 22) && var0.getResolvingGradientStart() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 22, m0.a, var0.getResolvingGradientStart());
      }

      if (!var1.A(var2, 23) && var0.getSplashHasRadialGradient() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 23, h.a, var0.getSplashHasRadialGradient());
      }

      if (!var1.A(var2, 24) && var0.getSplashOpacity() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 24, m0.a, var0.getSplashOpacity());
      }

      if (!var1.A(var2, 25) && var0.getSplashUrl() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 25, a2.a, var0.getSplashUrl());
      }

      if (!var1.A(var2, 26) && var0.getInviteSplash() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 26, a2.a, var0.getInviteSplash());
      }

      if (!var1.A(var2, 27) && var0.getSubtitleColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 27, m0.a, var0.getSubtitleColor());
      }

      if (!var1.A(var2, 28) && var0.getThumbnailBackgroundColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 28, m0.a, var0.getThumbnailBackgroundColor());
      }

      if (!var1.A(var2, 29) && var0.getThumbnailCornerRadius() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 29, m0.a, var0.getThumbnailCornerRadius());
      }

      if (!var1.A(var2, 30) && var0.getThumbnailText() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 30, a2.a, var0.getThumbnailText());
      }

      if (!var1.A(var2, 31) && var0.getThumbnailUrl() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 31, a2.a, var0.getThumbnailUrl());
      }

      if (!var1.A(var2, 32) && var0.getTitleColor() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 32, m0.a, var0.getTitleColor());
      }

      if (!var1.A(var2, 33) && var0.getExtendedType() === CodedLinkExtendedType.GUILD_INVITE_DISABLED) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.y(var2, 33, CodedLinkExtendedType.Serializer.INSTANCE, var0.getExtendedType());
      }

      var1.z(var2, 34, var0.getGuildName());
      if (!var1.A(var2, 35) && var0.getGuildIcon() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 35, a2.a, var0.getGuildIcon());
      }

      label224: {
         if (!var1.A(var2, 36)) {
            var5 = false;
            if (var0.getHeaderIcon() == null) {
               break label224;
            }
         }

         var5 = true;
      }

      if (var5) {
         var1.m(var2, 36, a2.a, var0.getHeaderIcon());
      }
   }

   public operator fun component1(): Int {
      return this.getBackgroundColor();
   }

   public operator fun component10(): Int? {
      return this.getAcceptLabelBackgroundColor();
   }

   public operator fun component11(): Int? {
      return this.getAcceptLabelBorderColor();
   }

   public operator fun component12(): Int? {
      return this.getAcceptLabelColor();
   }

   public operator fun component13(): String? {
      return this.getAcceptLabelText();
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

   public operator fun component19(): Boolean? {
      return this.getEmbedCanBeTapped();
   }

   public operator fun component2(): Int {
      return this.getBorderColor();
   }

   public operator fun component20(): String? {
      return this.getMemberText();
   }

   public operator fun component21(): String? {
      return this.getOnlineText();
   }

   public operator fun component22(): Int? {
      return this.getResolvingGradientEnd();
   }

   public operator fun component23(): Int? {
      return this.getResolvingGradientStart();
   }

   public operator fun component24(): Boolean? {
      return this.getSplashHasRadialGradient();
   }

   public operator fun component25(): Int? {
      return this.getSplashOpacity();
   }

   public operator fun component26(): String? {
      return this.getSplashUrl();
   }

   public operator fun component27(): String? {
      return this.getInviteSplash();
   }

   public operator fun component28(): Int? {
      return this.getSubtitleColor();
   }

   public operator fun component29(): Int? {
      return this.getThumbnailBackgroundColor();
   }

   public operator fun component3(): Int {
      return this.getHeaderColor();
   }

   public operator fun component30(): Int? {
      return this.getThumbnailCornerRadius();
   }

   public operator fun component31(): String? {
      return this.getThumbnailText();
   }

   public operator fun component32(): String? {
      return this.getThumbnailUrl();
   }

   public operator fun component33(): Int? {
      return this.getTitleColor();
   }

   public operator fun component34(): CodedLinkExtendedType {
      return this.getExtendedType();
   }

   public operator fun component35(): String {
      return this.getGuildName();
   }

   public operator fun component36(): String? {
      return this.getGuildIcon();
   }

   public operator fun component37(): String? {
      return this.getHeaderIcon();
   }

   public operator fun component4(): String {
      return this.getHeaderText();
   }

   public operator fun component5(): InviteType {
      return this.getType();
   }

   public operator fun component6(): String {
      return this.getTitleText();
   }

   public operator fun component7(): String {
      return this.getSubtitle();
   }

   public operator fun component8(): String {
      return this.getHelpCenterArticleLabel();
   }

   public operator fun component9(): String {
      return this.getHelpCenterArticleURL();
   }

   public fun copy(
      backgroundColor: Int = var0.getBackgroundColor(),
      borderColor: Int = var0.getBorderColor(),
      headerColor: Int = var0.getHeaderColor(),
      headerText: String = var0.getHeaderText(),
      type: InviteType = var0.getType(),
      titleText: String = var0.getTitleText(),
      subtitle: String = var0.getSubtitle(),
      helpCenterArticleLabel: String = var0.getHelpCenterArticleLabel(),
      helpCenterArticleURL: String = var0.getHelpCenterArticleURL(),
      acceptLabelBackgroundColor: Int? = var0.getAcceptLabelBackgroundColor(),
      acceptLabelBorderColor: Int? = var0.getAcceptLabelBorderColor(),
      acceptLabelColor: Int? = var0.getAcceptLabelColor(),
      acceptLabelText: String? = var0.getAcceptLabelText(),
      bodyText: String? = var0.getBodyText(),
      bodyTextColor: Int? = var0.getBodyTextColor(),
      canBeAccepted: Boolean? = var0.getCanBeAccepted(),
      channelIcon: String? = var0.getChannelIcon(),
      channelName: String? = var0.getChannelName(),
      embedCanBeTapped: Boolean? = var0.getEmbedCanBeTapped(),
      memberText: String? = var0.getMemberText(),
      onlineText: String? = var0.getOnlineText(),
      resolvingGradientEnd: Int? = var0.getResolvingGradientEnd(),
      resolvingGradientStart: Int? = var0.getResolvingGradientStart(),
      splashHasRadialGradient: Boolean? = var0.getSplashHasRadialGradient(),
      splashOpacity: Int? = var0.getSplashOpacity(),
      splashUrl: String? = var0.getSplashUrl(),
      inviteSplash: String? = var0.getInviteSplash(),
      subtitleColor: Int? = var0.getSubtitleColor(),
      thumbnailBackgroundColor: Int? = var0.getThumbnailBackgroundColor(),
      thumbnailCornerRadius: Int? = var0.getThumbnailCornerRadius(),
      thumbnailText: String? = var0.getThumbnailText(),
      thumbnailUrl: String? = var0.getThumbnailUrl(),
      titleColor: Int? = var0.getTitleColor(),
      extendedType: CodedLinkExtendedType = var0.getExtendedType(),
      guildName: String = var0.getGuildName(),
      guildIcon: String? = var0.getGuildIcon(),
      headerIcon: String? = var0.getHeaderIcon()
   ): GuildInviteDisabledEmbedImpl {
      r.h(var4, "headerText");
      r.h(var5, "type");
      r.h(var6, "titleText");
      r.h(var7, "subtitle");
      r.h(var8, "helpCenterArticleLabel");
      r.h(var9, "helpCenterArticleURL");
      r.h(var34, "extendedType");
      r.h(var35, "guildName");
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
         if (this.getBackgroundColor() != var1.getBackgroundColor()) {
            return false;
         } else if (this.getBorderColor() != var1.getBorderColor()) {
            return false;
         } else if (this.getHeaderColor() != var1.getHeaderColor()) {
            return false;
         } else if (!r.c(this.getHeaderText(), var1.getHeaderText())) {
            return false;
         } else if (this.getType() != var1.getType()) {
            return false;
         } else if (!r.c(this.getTitleText(), var1.getTitleText())) {
            return false;
         } else if (!r.c(this.getSubtitle(), var1.getSubtitle())) {
            return false;
         } else if (!r.c(this.getHelpCenterArticleLabel(), var1.getHelpCenterArticleLabel())) {
            return false;
         } else if (!r.c(this.getHelpCenterArticleURL(), var1.getHelpCenterArticleURL())) {
            return false;
         } else if (!r.c(this.getAcceptLabelBackgroundColor(), var1.getAcceptLabelBackgroundColor())) {
            return false;
         } else if (!r.c(this.getAcceptLabelBorderColor(), var1.getAcceptLabelBorderColor())) {
            return false;
         } else if (!r.c(this.getAcceptLabelColor(), var1.getAcceptLabelColor())) {
            return false;
         } else if (!r.c(this.getAcceptLabelText(), var1.getAcceptLabelText())) {
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
         } else if (!r.c(this.getEmbedCanBeTapped(), var1.getEmbedCanBeTapped())) {
            return false;
         } else if (!r.c(this.getMemberText(), var1.getMemberText())) {
            return false;
         } else if (!r.c(this.getOnlineText(), var1.getOnlineText())) {
            return false;
         } else if (!r.c(this.getResolvingGradientEnd(), var1.getResolvingGradientEnd())) {
            return false;
         } else if (!r.c(this.getResolvingGradientStart(), var1.getResolvingGradientStart())) {
            return false;
         } else if (!r.c(this.getSplashHasRadialGradient(), var1.getSplashHasRadialGradient())) {
            return false;
         } else if (!r.c(this.getSplashOpacity(), var1.getSplashOpacity())) {
            return false;
         } else if (!r.c(this.getSplashUrl(), var1.getSplashUrl())) {
            return false;
         } else if (!r.c(this.getInviteSplash(), var1.getInviteSplash())) {
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
         } else if (this.getExtendedType() != var1.getExtendedType()) {
            return false;
         } else if (!r.c(this.getGuildName(), var1.getGuildName())) {
            return false;
         } else if (!r.c(this.getGuildIcon(), var1.getGuildIcon())) {
            return false;
         } else {
            return r.c(this.getHeaderIcon(), var1.getHeaderIcon());
         }
      }
   }

   public override fun hashCode(): Int {
      val var27: Int = Integer.hashCode(this.getBackgroundColor());
      val var30: Int = Integer.hashCode(this.getBorderColor());
      val var28: Int = Integer.hashCode(this.getHeaderColor());
      val var32: Int = this.getHeaderText().hashCode();
      val var34: Int = this.getType().hashCode();
      val var29: Int = this.getTitleText().hashCode();
      val var31: Int = this.getSubtitle().hashCode();
      val var33: Int = this.getHelpCenterArticleLabel().hashCode();
      val var35: Int = this.getHelpCenterArticleURL().hashCode();
      val var38: Int = this.getAcceptLabelBackgroundColor();
      var var26: Int = 0;
      val var1: Int;
      if (var38 == null) {
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
      if (this.getAcceptLabelText() == null) {
         var4 = 0;
      } else {
         var4 = this.getAcceptLabelText().hashCode();
      }

      val var5: Int;
      if (this.getBodyText() == null) {
         var5 = 0;
      } else {
         var5 = this.getBodyText().hashCode();
      }

      val var6: Int;
      if (this.getBodyTextColor() == null) {
         var6 = 0;
      } else {
         var6 = this.getBodyTextColor().hashCode();
      }

      val var7: Int;
      if (this.getCanBeAccepted() == null) {
         var7 = 0;
      } else {
         var7 = this.getCanBeAccepted().hashCode();
      }

      val var8: Int;
      if (this.getChannelIcon() == null) {
         var8 = 0;
      } else {
         var8 = this.getChannelIcon().hashCode();
      }

      val var9: Int;
      if (this.getChannelName() == null) {
         var9 = 0;
      } else {
         var9 = this.getChannelName().hashCode();
      }

      val var10: Int;
      if (this.getEmbedCanBeTapped() == null) {
         var10 = 0;
      } else {
         var10 = this.getEmbedCanBeTapped().hashCode();
      }

      val var11: Int;
      if (this.getMemberText() == null) {
         var11 = 0;
      } else {
         var11 = this.getMemberText().hashCode();
      }

      val var12: Int;
      if (this.getOnlineText() == null) {
         var12 = 0;
      } else {
         var12 = this.getOnlineText().hashCode();
      }

      val var13: Int;
      if (this.getResolvingGradientEnd() == null) {
         var13 = 0;
      } else {
         var13 = this.getResolvingGradientEnd().hashCode();
      }

      val var14: Int;
      if (this.getResolvingGradientStart() == null) {
         var14 = 0;
      } else {
         var14 = this.getResolvingGradientStart().hashCode();
      }

      val var15: Int;
      if (this.getSplashHasRadialGradient() == null) {
         var15 = 0;
      } else {
         var15 = this.getSplashHasRadialGradient().hashCode();
      }

      val var16: Int;
      if (this.getSplashOpacity() == null) {
         var16 = 0;
      } else {
         var16 = this.getSplashOpacity().hashCode();
      }

      val var17: Int;
      if (this.getSplashUrl() == null) {
         var17 = 0;
      } else {
         var17 = this.getSplashUrl().hashCode();
      }

      val var18: Int;
      if (this.getInviteSplash() == null) {
         var18 = 0;
      } else {
         var18 = this.getInviteSplash().hashCode();
      }

      val var19: Int;
      if (this.getSubtitleColor() == null) {
         var19 = 0;
      } else {
         var19 = this.getSubtitleColor().hashCode();
      }

      val var20: Int;
      if (this.getThumbnailBackgroundColor() == null) {
         var20 = 0;
      } else {
         var20 = this.getThumbnailBackgroundColor().hashCode();
      }

      val var21: Int;
      if (this.getThumbnailCornerRadius() == null) {
         var21 = 0;
      } else {
         var21 = this.getThumbnailCornerRadius().hashCode();
      }

      val var22: Int;
      if (this.getThumbnailText() == null) {
         var22 = 0;
      } else {
         var22 = this.getThumbnailText().hashCode();
      }

      val var23: Int;
      if (this.getThumbnailUrl() == null) {
         var23 = 0;
      } else {
         var23 = this.getThumbnailUrl().hashCode();
      }

      val var24: Int;
      if (this.getTitleColor() == null) {
         var24 = 0;
      } else {
         var24 = this.getTitleColor().hashCode();
      }

      val var37: Int = this.getExtendedType().hashCode();
      val var36: Int = this.getGuildName().hashCode();
      val var25: Int;
      if (this.getGuildIcon() == null) {
         var25 = 0;
      } else {
         var25 = this.getGuildIcon().hashCode();
      }

      if (this.getHeaderIcon() != null) {
         var26 = this.getHeaderIcon().hashCode();
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
                                                                                                                                                                                                                                                                                                                                 var27
                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                    + var30
                                                                                                                                                                                                                                                                                                                              )
                                                                                                                                                                                                                                                                                                                              * 31
                                                                                                                                                                                                                                                                                                                           + var28
                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                  + var32
                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                         + var34
                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                + var29
                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var31
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var33
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
      val var3: Int = this.getBackgroundColor();
      val var1: Int = this.getBorderColor();
      val var2: Int = this.getHeaderColor();
      val var36: java.lang.String = this.getHeaderText();
      val var28: InviteType = this.getType();
      val var16: java.lang.String = this.getTitleText();
      val var13: java.lang.String = this.getSubtitle();
      val var14: java.lang.String = this.getHelpCenterArticleLabel();
      val var7: java.lang.String = this.getHelpCenterArticleURL();
      val var26: Int = this.getAcceptLabelBackgroundColor();
      val var23: Int = this.getAcceptLabelBorderColor();
      val var29: Int = this.getAcceptLabelColor();
      val var22: java.lang.String = this.getAcceptLabelText();
      val var30: java.lang.String = this.getBodyText();
      val var18: Int = this.getBodyTextColor();
      val var10: java.lang.Boolean = this.getCanBeAccepted();
      val var35: java.lang.String = this.getChannelIcon();
      val var11: java.lang.String = this.getChannelName();
      val var19: java.lang.Boolean = this.getEmbedCanBeTapped();
      val var5: java.lang.String = this.getMemberText();
      val var9: java.lang.String = this.getOnlineText();
      val var27: Int = this.getResolvingGradientEnd();
      val var24: Int = this.getResolvingGradientStart();
      val var32: java.lang.Boolean = this.getSplashHasRadialGradient();
      val var31: Int = this.getSplashOpacity();
      val var17: java.lang.String = this.getSplashUrl();
      val var15: java.lang.String = this.getInviteSplash();
      val var12: Int = this.getSubtitleColor();
      val var6: Int = this.getThumbnailBackgroundColor();
      val var4: Int = this.getThumbnailCornerRadius();
      val var25: java.lang.String = this.getThumbnailText();
      val var38: java.lang.String = this.getThumbnailUrl();
      val var37: Int = this.getTitleColor();
      val var20: CodedLinkExtendedType = this.getExtendedType();
      val var33: java.lang.String = this.getGuildName();
      val var34: java.lang.String = this.getGuildIcon();
      val var21: java.lang.String = this.getHeaderIcon();
      val var8: StringBuilder = new StringBuilder();
      var8.append("GuildInviteDisabledEmbedImpl(backgroundColor=");
      var8.append(var3);
      var8.append(", borderColor=");
      var8.append(var1);
      var8.append(", headerColor=");
      var8.append(var2);
      var8.append(", headerText=");
      var8.append(var36);
      var8.append(", type=");
      var8.append(var28);
      var8.append(", titleText=");
      var8.append(var16);
      var8.append(", subtitle=");
      var8.append(var13);
      var8.append(", helpCenterArticleLabel=");
      var8.append(var14);
      var8.append(", helpCenterArticleURL=");
      var8.append(var7);
      var8.append(", acceptLabelBackgroundColor=");
      var8.append(var26);
      var8.append(", acceptLabelBorderColor=");
      var8.append(var23);
      var8.append(", acceptLabelColor=");
      var8.append(var29);
      var8.append(", acceptLabelText=");
      var8.append(var22);
      var8.append(", bodyText=");
      var8.append(var30);
      var8.append(", bodyTextColor=");
      var8.append(var18);
      var8.append(", canBeAccepted=");
      var8.append(var10);
      var8.append(", channelIcon=");
      var8.append(var35);
      var8.append(", channelName=");
      var8.append(var11);
      var8.append(", embedCanBeTapped=");
      var8.append(var19);
      var8.append(", memberText=");
      var8.append(var5);
      var8.append(", onlineText=");
      var8.append(var9);
      var8.append(", resolvingGradientEnd=");
      var8.append(var27);
      var8.append(", resolvingGradientStart=");
      var8.append(var24);
      var8.append(", splashHasRadialGradient=");
      var8.append(var32);
      var8.append(", splashOpacity=");
      var8.append(var31);
      var8.append(", splashUrl=");
      var8.append(var17);
      var8.append(", inviteSplash=");
      var8.append(var15);
      var8.append(", subtitleColor=");
      var8.append(var12);
      var8.append(", thumbnailBackgroundColor=");
      var8.append(var6);
      var8.append(", thumbnailCornerRadius=");
      var8.append(var4);
      var8.append(", thumbnailText=");
      var8.append(var25);
      var8.append(", thumbnailUrl=");
      var8.append(var38);
      var8.append(", titleColor=");
      var8.append(var37);
      var8.append(", extendedType=");
      var8.append(var20);
      var8.append(", guildName=");
      var8.append(var33);
      var8.append(", guildIcon=");
      var8.append(var34);
      var8.append(", headerIcon=");
      var8.append(var21);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : f0<GuildInviteDisabledEmbedImpl> {
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
         val var2: m0 = m0.a;
         val var4: a2 = a2.a;
         val var5: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var9: KSerializer = a.u(m0.a);
         val var10: KSerializer = a.u(var2);
         val var1: KSerializer = a.u(var2);
         val var3: KSerializer = a.u(var4);
         val var6: KSerializer = a.u(var4);
         val var7: KSerializer = a.u(var2);
         val var8: h = h.a;
         return new KSerializer[]{
            var2,
            var2,
            var2,
            var4,
            var5,
            var4,
            var4,
            var4,
            var4,
            var9,
            var10,
            var1,
            var3,
            var6,
            var7,
            a.u(h.a),
            a.u(var4),
            a.u(var4),
            a.u(var8),
            a.u(var4),
            a.u(var4),
            a.u(var2),
            a.u(var2),
            a.u(var8),
            a.u(var2),
            a.u(var4),
            a.u(var4),
            a.u(var2),
            a.u(var2),
            a.u(var2),
            a.u(var4),
            a.u(var4),
            a.u(var2),
            CodedLinkExtendedType.Serializer.INSTANCE,
            var4,
            a.u(var4),
            a.u(var4)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteDisabledEmbedImpl {
         r.h(var1, "decoder");
         val var52: SerialDescriptor = this.getDescriptor();
         val var53: c = var1.b(var52);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         var var23: Any;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var35: Any;
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
         val var46: Any;
         val var47: Any;
         val var48: Any;
         val var49: Any;
         val var50: Any;
         var var55: Any;
         var var76: Any;
         var var85: Any;
         var var91: Any;
         var var125: Any;
         var var128: Any;
         var var140: Any;
         var var142: Any;
         if (var53.p()) {
            var5 = var53.i(var52, 0);
            var4 = var53.i(var52, 1);
            var2 = var53.i(var52, 2);
            var76 = var53.m(var52, 3);
            var39 = var53.y(var52, 4, InviteType.Serializer.INSTANCE, null);
            var91 = var53.m(var52, 5);
            val var12: java.lang.String = var53.m(var52, 6);
            val var10: java.lang.String = var53.m(var52, 7);
            val var19: java.lang.String = var53.m(var52, 8);
            val var9: m0 = m0.a;
            var24 = var53.n(var52, 9, m0.a, null);
            var140 = var53.n(var52, 10, var9, null);
            var85 = var53.n(var52, 11, var9, null);
            var142 = a2.a;
            var29 = var53.n(var52, 12, a2.a, null);
            var31 = var53.n(var52, 13, (DeserializationStrategy)var142, null);
            var25 = var53.n(var52, 14, var9, null);
            var55 = h.a;
            var32 = var53.n(var52, 15, h.a, null);
            var128 = var53.n(var52, 16, (DeserializationStrategy)var142, null);
            var30 = var53.n(var52, 17, (DeserializationStrategy)var142, null);
            var23 = var53.n(var52, 18, (DeserializationStrategy)var55, null);
            val var18: Any = var53.n(var52, 19, (DeserializationStrategy)var142, null);
            var125 = var53.n(var52, 20, (DeserializationStrategy)var142, null);
            val var16: Any = var53.n(var52, 21, var9, null);
            val var17: Any = var53.n(var52, 22, var9, null);
            val var15: Any = var53.n(var52, 23, (DeserializationStrategy)var55, null);
            var55 = var53.n(var52, 24, var9, null);
            var28 = var53.n(var52, 25, (DeserializationStrategy)var142, null);
            var36 = var53.n(var52, 26, (DeserializationStrategy)var142, null);
            var35 = var53.n(var52, 27, var9, null);
            var49 = var53.n(var52, 28, var9, null);
            var27 = var53.n(var52, 29, var9, null);
            var46 = var53.n(var52, 30, (DeserializationStrategy)var142, null);
            var43 = var53.n(var52, 31, (DeserializationStrategy)var142, null);
            var41 = var53.n(var52, 32, var9, null);
            val var21: Any = var53.y(var52, 33, CodedLinkExtendedType.Serializer.INSTANCE, null);
            val var68: java.lang.String = var53.m(var52, 34);
            var26 = var53.n(var52, 35, (DeserializationStrategy)var142, null);
            var37 = var53.n(var52, 36, (DeserializationStrategy)var142, null);
            var3 = -1;
            var6 = 31;
            var47 = var128;
            var128 = var140;
            var48 = var85;
            var85 = var76;
            var142 = var91;
            var44 = var12;
            var76 = var10;
            var140 = var19;
            var91 = var18;
            var40 = var125;
            var38 = var68;
            var42 = var16;
            var50 = var17;
            var125 = var15;
            var45 = var21;
         } else {
            var var7: Boolean = true;
            var6 = 0;
            var4 = 0;
            var5 = 0;
            var3 = 0;
            var55 = null;
            var var72: Any = null;
            var var122: Any = null;
            var24 = null;
            var37 = null;
            var36 = null;
            var142 = null;
            var28 = null;
            var27 = null;
            var140 = null;
            var26 = null;
            var38 = null;
            var40 = null;
            var32 = null;
            var31 = null;
            var30 = null;
            var29 = null;
            var39 = null;
            var var69: Any = null;
            var var107: Any = null;
            var var109: Any = null;
            var85 = null;
            var76 = null;
            var var81: Any = null;
            var var99: Any = null;
            var var112: Any = null;
            var91 = null;
            var41 = null;
            var125 = null;
            var23 = null;
            var25 = null;
            var128 = null;
            var var127: Any = null;
            var35 = null;
            var2 = 0;

            while (var7) {
               label226: {
                  label227: {
                     label176: {
                        label175: {
                           label174: {
                              label228: {
                                 label229: {
                                    label230: {
                                       label231: {
                                          label139: {
                                             var var8: Int = var53.o(var52);
                                             switch (var8) {
                                                case -1:
                                                   var7 = false;
                                                   break label229;
                                                case 0:
                                                   var5 = var53.i(var52, 0);
                                                   var2 |= 1;
                                                   break label229;
                                                case 1:
                                                   var4 = var53.i(var52, 1);
                                                   var2 |= 2;
                                                   break label228;
                                                case 2:
                                                   var6 = var53.i(var52, 2);
                                                   var2 |= 4;
                                                   break label228;
                                                case 3:
                                                   var40 = var53.m(var52, 3);
                                                   var2 |= 8;
                                                   break label228;
                                                case 4:
                                                   var81 = var99;
                                                   var76 = var112;
                                                   var39 = var53.y(var52, 4, InviteType.Serializer.INSTANCE, var39);
                                                   var2 |= 16;
                                                   var112 = var85;
                                                   var99 = var69;
                                                   var91 = var76;
                                                   var85 = var81;
                                                   var69 = var91;
                                                   break label174;
                                                case 5:
                                                   var32 = var53.m(var52, 5);
                                                   var2 |= 32;
                                                   break label231;
                                                case 6:
                                                   var31 = var53.m(var52, 6);
                                                   var2 |= 64;
                                                   break label231;
                                                case 7:
                                                   var30 = var53.m(var52, 7);
                                                   var2 |= 128;
                                                   break label231;
                                                case 8:
                                                   var29 = var53.m(var52, 8);
                                                   var2 |= 256;
                                                   break label231;
                                                case 9:
                                                   var69 = var53.n(var52, 9, m0.a, var69);
                                                   var2 |= 512;
                                                   break label231;
                                                case 10:
                                                   var85 = var81;
                                                   var81 = var99;
                                                   var76 = var112;
                                                   var107 = var53.n(var52, 10, m0.a, var107);
                                                   var2 |= 1024;
                                                   var99 = var69;
                                                   var69 = var91;
                                                   var91 = var76;
                                                   var112 = var85;
                                                   break label174;
                                                case 11:
                                                   var81 = var99;
                                                   var76 = var112;
                                                   var112 = var85;
                                                   var109 = var53.n(var52, 11, m0.a, var109);
                                                   var2 |= 2048;
                                                   var99 = var69;
                                                   var69 = var91;
                                                   var85 = var81;
                                                   var91 = var76;
                                                   break label174;
                                                case 12:
                                                   var81 = var99;
                                                   var91 = var76;
                                                   var112 = var53.n(var52, 12, a2.a, var85);
                                                   var2 |= 4096;
                                                   var99 = var69;
                                                   var69 = var91;
                                                   var76 = var112;
                                                   var85 = var81;
                                                   break label174;
                                                case 13:
                                                   var45 = var53.n(var52, 13, a2.a, var76);
                                                   var2 |= 8192;
                                                   var69 = var91;
                                                   var76 = var112;
                                                   var81 = var99;
                                                   var85 = var81;
                                                   var91 = var45;
                                                   var99 = var69;
                                                   var112 = var85;
                                                   break label174;
                                                case 14:
                                                   var44 = var53.n(var52, 14, m0.a, var81);
                                                   var2 |= 16384;
                                                   var99 = var69;
                                                   var112 = var85;
                                                   var69 = var91;
                                                   var76 = var112;
                                                   var81 = var99;
                                                   var85 = var44;
                                                   var91 = var76;
                                                   break label174;
                                                case 15:
                                                   var43 = var53.n(var52, 15, h.a, var99);
                                                   var2 |= 32768;
                                                   var99 = var69;
                                                   var112 = var85;
                                                   var85 = var81;
                                                   var69 = var91;
                                                   var76 = var112;
                                                   var81 = var43;
                                                   var91 = var76;
                                                   break label174;
                                                case 16:
                                                   var43 = var53.n(var52, 16, a2.a, var112);
                                                   var2 |= 65536;
                                                   var85 = var81;
                                                   var81 = var99;
                                                   var69 = var91;
                                                   var76 = var43;
                                                   var91 = var76;
                                                   var99 = var69;
                                                   var112 = var85;
                                                   break label174;
                                                case 17:
                                                   var91 = var53.n(var52, 17, a2.a, var91);
                                                   var2 |= 131072;
                                                   var85 = var81;
                                                   var81 = var99;
                                                   var76 = var112;
                                                   var69 = var91;
                                                   var91 = var76;
                                                   var99 = var69;
                                                   var112 = var85;
                                                   break label174;
                                                case 18:
                                                   var42 = var53.n(var52, 18, h.a, var41);
                                                   var2 |= 262144;
                                                   var72 = var69;
                                                   var107 = var109;
                                                   var55 = var85;
                                                   var85 = var81;
                                                   var76 = var112;
                                                   var69 = var91;
                                                   var42 = var122;
                                                   var81 = var72;
                                                   var109 = var99;
                                                   var91 = var76;
                                                   var99 = var107;
                                                   var41 = var42;
                                                   var112 = var55;
                                                   break label226;
                                                case 19:
                                                   var125 = var53.n(var52, 19, a2.a, var125);
                                                   var2 |= 524288;
                                                   break label139;
                                                case 20:
                                                   var23 = var53.n(var52, 20, a2.a, var23);
                                                   var2 |= 1048576;
                                                   break label139;
                                                case 21:
                                                   var128 = var53.n(var52, 21, m0.a, var128);
                                                   var2 |= 2097152;
                                                   break label139;
                                                case 22:
                                                   var127 = var53.n(var52, 22, m0.a, var127);
                                                   var2 |= 4194304;
                                                   break label139;
                                                case 23:
                                                   var42 = var55;
                                                   var24 = var53.n(var52, 23, h.a, var24);
                                                   var2 |= 8388608;
                                                   var55 = var72;
                                                   var72 = var122;
                                                   break label175;
                                                case 24:
                                                   var38 = var53.n(var52, 24, m0.a, var38);
                                                   var2 |= 16777216;
                                                   var55 = var72;
                                                   var72 = var122;
                                                   var122 = var55;
                                                   break label227;
                                                case 25:
                                                   var72 = var53.n(var52, 25, a2.a, var72);
                                                   var8 = 33554432;
                                                   break;
                                                case 26:
                                                   var26 = var53.n(var52, 26, a2.a, var26);
                                                   var2 |= 67108864;
                                                   var55 = var72;
                                                   var72 = var55;
                                                   break label230;
                                                case 27:
                                                   var140 = var53.n(var52, 27, m0.a, var140);
                                                   var2 |= 134217728;
                                                   var55 = var72;
                                                   var72 = var55;
                                                   break label230;
                                                case 28:
                                                   var27 = var53.n(var52, 28, m0.a, var27);
                                                   var2 |= 268435456;
                                                   var55 = var72;
                                                   var72 = var55;
                                                   break label230;
                                                case 29:
                                                   var122 = var53.n(var52, 29, m0.a, var122);
                                                   var8 = 536870912;
                                                   break;
                                                case 30:
                                                   var28 = var53.n(var52, 30, a2.a, var28);
                                                   var2 |= 1073741824;
                                                   var55 = var72;
                                                   var72 = var55;
                                                   break label230;
                                                case 31:
                                                   var142 = var53.n(var52, 31, a2.a, var142);
                                                   var2 |= Integer.MIN_VALUE;
                                                   var55 = var72;
                                                   var72 = var55;
                                                   break label230;
                                                case 32:
                                                   var36 = var53.n(var52, 32, m0.a, var36);
                                                   var3 |= 1;
                                                   var55 = var72;
                                                   var72 = var55;
                                                   break label230;
                                                case 33:
                                                   var55 = var53.y(var52, 33, CodedLinkExtendedType.Serializer.INSTANCE, var55);
                                                   var3 |= 2;
                                                   break label139;
                                                case 34:
                                                   var25 = var53.m(var52, 34);
                                                   var3 |= 4;
                                                   var55 = var72;
                                                   var72 = var55;
                                                   break label230;
                                                case 35:
                                                   var35 = var53.n(var52, 35, a2.a, var35);
                                                   var3 |= 8;
                                                   var55 = var72;
                                                   var72 = var55;
                                                   break label230;
                                                case 36:
                                                   var37 = var53.n(var52, 36, a2.a, var37);
                                                   var3 |= 16;
                                                   var55 = var72;
                                                   var72 = var55;
                                                   break label230;
                                                default:
                                                   throw new n(var8);
                                             }

                                             var2 |= var8;
                                          }

                                          var72 = var55;
                                          var55 = var72;
                                          break label230;
                                       }

                                       var85 = var81;
                                       var81 = var99;
                                       var76 = var112;
                                       var99 = var69;
                                       var69 = var91;
                                       var91 = var76;
                                       var112 = var85;
                                       break label174;
                                    }

                                    var42 = var72;
                                    var72 = var122;
                                    break label175;
                                 }

                                 var76 = var112;
                                 var109 = var85;
                                 var107 = var109;
                                 var99 = var107;
                                 var42 = var69;
                                 var91 = var76;
                                 var85 = var81;
                                 var81 = var99;
                                 var69 = var91;
                                 break label176;
                              }

                              var42 = var69;
                              var85 = var81;
                              var81 = var99;
                              var76 = var112;
                              var69 = var91;
                              var91 = var76;
                              var99 = var107;
                              var107 = var109;
                              var109 = var85;
                              break label176;
                           }

                           var42 = var99;
                           var99 = var107;
                           var107 = var109;
                           var109 = var112;
                           break label176;
                        }

                        var122 = var42;
                        break label227;
                     }

                     var112 = var55;
                     var55 = var109;
                     var72 = var42;
                     var109 = var81;
                     var81 = var72;
                     var42 = var122;
                     break label226;
                  }

                  var85 = var81;
                  var76 = var112;
                  var69 = var91;
                  var42 = var72;
                  var81 = var55;
                  var109 = var99;
                  var91 = var76;
                  var72 = var69;
                  var99 = var107;
                  var107 = var109;
                  var55 = var85;
                  var112 = var122;
               }

               var81 = var85;
               var76 = var91;
               var69 = var72;
               var109 = var107;
               var85 = var55;
               var55 = var112;
               var72 = var81;
               var122 = var42;
               var107 = var99;
               var99 = var109;
               var112 = var76;
               var91 = var69;
            }

            var44 = var31;
            var30 = var91;
            var31 = var76;
            var29 = var85;
            var35 = var140;
            var45 = var55;
            var55 = var38;
            var125 = var24;
            var6 = var3;
            var50 = var127;
            var42 = var128;
            var38 = var25;
            var40 = var23;
            var91 = var125;
            var140 = var29;
            var76 = var30;
            var142 = var32;
            var85 = var40;
            var2 = var6;
            var3 = var2;
            var43 = var142;
            var48 = var109;
            var128 = var107;
            var24 = var69;
            var23 = var41;
            var47 = var112;
            var41 = var36;
            var32 = var99;
            var36 = var26;
            var49 = var27;
            var46 = var28;
            var26 = var35;
            var27 = var122;
            var28 = var72;
            var25 = var81;
         }

         var53.c(var52);
         return new GuildInviteDisabledEmbedImpl(
            var3,
            var6,
            var5,
            var4,
            var2,
            (java.lang.String)var85,
            var39 as InviteType,
            (java.lang.String)var142,
            (java.lang.String)var44,
            (java.lang.String)var76,
            (java.lang.String)var140,
            var24 as Integer,
            var128 as Integer,
            var48 as Integer,
            var29 as java.lang.String,
            var31 as java.lang.String,
            var25 as Integer,
            var32 as java.lang.Boolean,
            var47 as java.lang.String,
            var30 as java.lang.String,
            var23 as java.lang.Boolean,
            var91 as java.lang.String,
            var40 as java.lang.String,
            var42 as Integer,
            var50 as Integer,
            var125 as java.lang.Boolean,
            var55 as Integer,
            var28 as java.lang.String,
            var36 as java.lang.String,
            var35 as Integer,
            var49 as Integer,
            var27 as Integer,
            var46 as java.lang.String,
            var43 as java.lang.String,
            var41 as Integer,
            var45 as CodedLinkExtendedType,
            (java.lang.String)var38,
            var26 as java.lang.String,
            var37 as java.lang.String,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: GuildInviteDisabledEmbedImpl) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         GuildInviteDisabledEmbedImpl.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteDisabledEmbedImpl> {
         return GuildInviteDisabledEmbedImpl.$serializer.INSTANCE;
      }
   }
}
