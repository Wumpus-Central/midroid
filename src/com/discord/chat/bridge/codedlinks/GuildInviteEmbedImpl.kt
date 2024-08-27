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
public data class GuildInviteEmbedImpl(backgroundColor: Int,
      borderColor: Int,
      headerColor: Int,
      headerText: String?,
      type: InviteType,
      acceptLabelBackgroundColor: Int? = null,
      acceptLabelBorderColor: Int? = null,
      acceptLabelColor: Int? = null,
      acceptLabelText: String? = null,
      bodyText: String? = null,
      bodyTextColor: Int? = null,
      canBeAccepted: Boolean? = null,
      channelIcon: String? = null,
      channelName: String? = null,
      embedCanBeTapped: Boolean? = null,
      memberText: String? = ...,
      onlineText: String? = ...,
      resolvingGradientEnd: Int? = ...,
      resolvingGradientStart: Int? = ...,
      splashHasRadialGradient: Boolean? = ...,
      splashOpacity: Int? = ...,
      splashUrl: String? = ...,
      inviteSplash: String? = ...,
      subtitle: String? = ...,
      subtitleColor: Int? = ...,
      thumbnailBackgroundColor: Int? = ...,
      thumbnailCornerRadius: Int? = ...,
      thumbnailText: String? = ...,
      thumbnailUrl: String? = ...,
      titleColor: Int? = ...,
      titleText: String? = null
   )
   : CodedLinkEmbed,
   GuildInviteEmbed {
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
   public open val headerColor: Int
   public open val headerText: String?
   public open val inviteSplash: String?
   public open val memberText: String?
   public open val onlineText: String?
   public open val resolvingGradientEnd: Int?
   public open val resolvingGradientStart: Int?
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
      r.h(var5, "type");
      super(null);
      this.backgroundColor = var1;
      this.borderColor = var2;
      this.headerColor = var3;
      this.headerText = var4;
      this.type = var5;
      this.acceptLabelBackgroundColor = var6;
      this.acceptLabelBorderColor = var7;
      this.acceptLabelColor = var8;
      this.acceptLabelText = var9;
      this.bodyText = var10;
      this.bodyTextColor = var11;
      this.canBeAccepted = var12;
      this.channelIcon = var13;
      this.channelName = var14;
      this.embedCanBeTapped = var15;
      this.memberText = var16;
      this.onlineText = var17;
      this.resolvingGradientEnd = var18;
      this.resolvingGradientStart = var19;
      this.splashHasRadialGradient = var20;
      this.splashOpacity = var21;
      this.splashUrl = var22;
      this.inviteSplash = var23;
      this.subtitle = var24;
      this.subtitleColor = var25;
      this.thumbnailBackgroundColor = var26;
      this.thumbnailCornerRadius = var27;
      this.thumbnailText = var28;
      this.thumbnailUrl = var29;
      this.titleColor = var30;
      this.titleText = var31;
   }

   @JvmStatic
   public fun `write$Self`(self: GuildInviteEmbedImpl, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.getBackgroundColor());
      var1.w(var2, 1, var0.getBorderColor());
      var1.w(var2, 2, var0.getHeaderColor());
      val var5: a2 = a2.a;
      var1.m(var2, 3, a2.a, var0.getHeaderText());
      var1.y(var2, 4, InviteType.Serializer.INSTANCE, var0.getType());
      var var6: Boolean;
      if (!var1.A(var2, 5) && var0.getAcceptLabelBackgroundColor() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 5, m0.a, var0.getAcceptLabelBackgroundColor());
      }

      if (!var1.A(var2, 6) && var0.getAcceptLabelBorderColor() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 6, m0.a, var0.getAcceptLabelBorderColor());
      }

      if (!var1.A(var2, 7) && var0.getAcceptLabelColor() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 7, m0.a, var0.getAcceptLabelColor());
      }

      if (!var1.A(var2, 8) && var0.getAcceptLabelText() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 8, var5, var0.getAcceptLabelText());
      }

      if (!var1.A(var2, 9) && var0.getBodyText() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 9, var5, var0.getBodyText());
      }

      if (!var1.A(var2, 10) && var0.getBodyTextColor() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 10, m0.a, var0.getBodyTextColor());
      }

      if (!var1.A(var2, 11) && var0.getCanBeAccepted() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 11, h.a, var0.getCanBeAccepted());
      }

      if (!var1.A(var2, 12) && var0.getChannelIcon() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 12, var5, var0.getChannelIcon());
      }

      if (!var1.A(var2, 13) && var0.getChannelName() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 13, var5, var0.getChannelName());
      }

      if (!var1.A(var2, 14) && var0.getEmbedCanBeTapped() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 14, h.a, var0.getEmbedCanBeTapped());
      }

      if (!var1.A(var2, 15) && var0.getMemberText() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 15, var5, var0.getMemberText());
      }

      if (!var1.A(var2, 16) && var0.getOnlineText() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 16, var5, var0.getOnlineText());
      }

      if (!var1.A(var2, 17) && var0.getResolvingGradientEnd() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 17, m0.a, var0.getResolvingGradientEnd());
      }

      if (!var1.A(var2, 18) && var0.getResolvingGradientStart() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 18, m0.a, var0.getResolvingGradientStart());
      }

      if (!var1.A(var2, 19) && var0.getSplashHasRadialGradient() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 19, h.a, var0.getSplashHasRadialGradient());
      }

      if (!var1.A(var2, 20) && var0.getSplashOpacity() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 20, m0.a, var0.getSplashOpacity());
      }

      if (!var1.A(var2, 21) && var0.getSplashUrl() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 21, var5, var0.getSplashUrl());
      }

      if (!var1.A(var2, 22) && var0.getInviteSplash() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 22, var5, var0.getInviteSplash());
      }

      if (!var1.A(var2, 23) && var0.getSubtitle() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 23, var5, var0.getSubtitle());
      }

      if (!var1.A(var2, 24) && var0.getSubtitleColor() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 24, m0.a, var0.getSubtitleColor());
      }

      if (!var1.A(var2, 25) && var0.getThumbnailBackgroundColor() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 25, m0.a, var0.getThumbnailBackgroundColor());
      }

      if (!var1.A(var2, 26) && var0.getThumbnailCornerRadius() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 26, m0.a, var0.getThumbnailCornerRadius());
      }

      if (!var1.A(var2, 27) && var0.getThumbnailText() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 27, var5, var0.getThumbnailText());
      }

      if (!var1.A(var2, 28) && var0.getThumbnailUrl() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 28, var5, var0.getThumbnailUrl());
      }

      if (!var1.A(var2, 29) && var0.getTitleColor() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 29, m0.a, var0.getTitleColor());
      }

      label216: {
         if (!var1.A(var2, 30)) {
            var6 = false;
            if (var0.getTitleText() == null) {
               break label216;
            }
         }

         var6 = true;
      }

      if (var6) {
         var1.m(var2, 30, var5, var0.getTitleText());
      }
   }

   public operator fun component1(): Int {
      return this.getBackgroundColor();
   }

   public operator fun component10(): String? {
      return this.getBodyText();
   }

   public operator fun component11(): Int? {
      return this.getBodyTextColor();
   }

   public operator fun component12(): Boolean? {
      return this.getCanBeAccepted();
   }

   public operator fun component13(): String? {
      return this.getChannelIcon();
   }

   public operator fun component14(): String? {
      return this.getChannelName();
   }

   public operator fun component15(): Boolean? {
      return this.getEmbedCanBeTapped();
   }

   public operator fun component16(): String? {
      return this.getMemberText();
   }

   public operator fun component17(): String? {
      return this.getOnlineText();
   }

   public operator fun component18(): Int? {
      return this.getResolvingGradientEnd();
   }

   public operator fun component19(): Int? {
      return this.getResolvingGradientStart();
   }

   public operator fun component2(): Int {
      return this.getBorderColor();
   }

   public operator fun component20(): Boolean? {
      return this.getSplashHasRadialGradient();
   }

   public operator fun component21(): Int? {
      return this.getSplashOpacity();
   }

   public operator fun component22(): String? {
      return this.getSplashUrl();
   }

   public operator fun component23(): String? {
      return this.getInviteSplash();
   }

   public operator fun component24(): String? {
      return this.getSubtitle();
   }

   public operator fun component25(): Int? {
      return this.getSubtitleColor();
   }

   public operator fun component26(): Int? {
      return this.getThumbnailBackgroundColor();
   }

   public operator fun component27(): Int? {
      return this.getThumbnailCornerRadius();
   }

   public operator fun component28(): String? {
      return this.getThumbnailText();
   }

   public operator fun component29(): String? {
      return this.getThumbnailUrl();
   }

   public operator fun component3(): Int {
      return this.getHeaderColor();
   }

   public operator fun component30(): Int? {
      return this.getTitleColor();
   }

   public operator fun component31(): String? {
      return this.getTitleText();
   }

   public operator fun component4(): String? {
      return this.getHeaderText();
   }

   public operator fun component5(): InviteType {
      return this.getType();
   }

   public operator fun component6(): Int? {
      return this.getAcceptLabelBackgroundColor();
   }

   public operator fun component7(): Int? {
      return this.getAcceptLabelBorderColor();
   }

   public operator fun component8(): Int? {
      return this.getAcceptLabelColor();
   }

   public operator fun component9(): String? {
      return this.getAcceptLabelText();
   }

   public fun copy(
      backgroundColor: Int = var0.getBackgroundColor(),
      borderColor: Int = var0.getBorderColor(),
      headerColor: Int = var0.getHeaderColor(),
      headerText: String? = var0.getHeaderText(),
      type: InviteType = var0.getType(),
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
      subtitle: String? = var0.getSubtitle(),
      subtitleColor: Int? = var0.getSubtitleColor(),
      thumbnailBackgroundColor: Int? = var0.getThumbnailBackgroundColor(),
      thumbnailCornerRadius: Int? = var0.getThumbnailCornerRadius(),
      thumbnailText: String? = var0.getThumbnailText(),
      thumbnailUrl: String? = var0.getThumbnailUrl(),
      titleColor: Int? = var0.getTitleColor(),
      titleText: String? = var0.getTitleText()
   ): GuildInviteEmbedImpl {
      r.h(var5, "type");
      return new GuildInviteEmbedImpl(
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
         var31
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildInviteEmbedImpl) {
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
      val var30: Int = Integer.hashCode(this.getBackgroundColor());
      val var29: Int = Integer.hashCode(this.getBorderColor());
      val var28: Int = Integer.hashCode(this.getHeaderColor());
      val var32: java.lang.String = this.getHeaderText();
      var var27: Int = 0;
      val var1: Int;
      if (var32 == null) {
         var1 = 0;
      } else {
         var1 = this.getHeaderText().hashCode();
      }

      val var31: Int = this.getType().hashCode();
      val var2: Int;
      if (this.getAcceptLabelBackgroundColor() == null) {
         var2 = 0;
      } else {
         var2 = this.getAcceptLabelBackgroundColor().hashCode();
      }

      val var3: Int;
      if (this.getAcceptLabelBorderColor() == null) {
         var3 = 0;
      } else {
         var3 = this.getAcceptLabelBorderColor().hashCode();
      }

      val var4: Int;
      if (this.getAcceptLabelColor() == null) {
         var4 = 0;
      } else {
         var4 = this.getAcceptLabelColor().hashCode();
      }

      val var5: Int;
      if (this.getAcceptLabelText() == null) {
         var5 = 0;
      } else {
         var5 = this.getAcceptLabelText().hashCode();
      }

      val var6: Int;
      if (this.getBodyText() == null) {
         var6 = 0;
      } else {
         var6 = this.getBodyText().hashCode();
      }

      val var7: Int;
      if (this.getBodyTextColor() == null) {
         var7 = 0;
      } else {
         var7 = this.getBodyTextColor().hashCode();
      }

      val var8: Int;
      if (this.getCanBeAccepted() == null) {
         var8 = 0;
      } else {
         var8 = this.getCanBeAccepted().hashCode();
      }

      val var9: Int;
      if (this.getChannelIcon() == null) {
         var9 = 0;
      } else {
         var9 = this.getChannelIcon().hashCode();
      }

      val var10: Int;
      if (this.getChannelName() == null) {
         var10 = 0;
      } else {
         var10 = this.getChannelName().hashCode();
      }

      val var11: Int;
      if (this.getEmbedCanBeTapped() == null) {
         var11 = 0;
      } else {
         var11 = this.getEmbedCanBeTapped().hashCode();
      }

      val var12: Int;
      if (this.getMemberText() == null) {
         var12 = 0;
      } else {
         var12 = this.getMemberText().hashCode();
      }

      val var13: Int;
      if (this.getOnlineText() == null) {
         var13 = 0;
      } else {
         var13 = this.getOnlineText().hashCode();
      }

      val var14: Int;
      if (this.getResolvingGradientEnd() == null) {
         var14 = 0;
      } else {
         var14 = this.getResolvingGradientEnd().hashCode();
      }

      val var15: Int;
      if (this.getResolvingGradientStart() == null) {
         var15 = 0;
      } else {
         var15 = this.getResolvingGradientStart().hashCode();
      }

      val var16: Int;
      if (this.getSplashHasRadialGradient() == null) {
         var16 = 0;
      } else {
         var16 = this.getSplashHasRadialGradient().hashCode();
      }

      val var17: Int;
      if (this.getSplashOpacity() == null) {
         var17 = 0;
      } else {
         var17 = this.getSplashOpacity().hashCode();
      }

      val var18: Int;
      if (this.getSplashUrl() == null) {
         var18 = 0;
      } else {
         var18 = this.getSplashUrl().hashCode();
      }

      val var19: Int;
      if (this.getInviteSplash() == null) {
         var19 = 0;
      } else {
         var19 = this.getInviteSplash().hashCode();
      }

      val var20: Int;
      if (this.getSubtitle() == null) {
         var20 = 0;
      } else {
         var20 = this.getSubtitle().hashCode();
      }

      val var21: Int;
      if (this.getSubtitleColor() == null) {
         var21 = 0;
      } else {
         var21 = this.getSubtitleColor().hashCode();
      }

      val var22: Int;
      if (this.getThumbnailBackgroundColor() == null) {
         var22 = 0;
      } else {
         var22 = this.getThumbnailBackgroundColor().hashCode();
      }

      val var23: Int;
      if (this.getThumbnailCornerRadius() == null) {
         var23 = 0;
      } else {
         var23 = this.getThumbnailCornerRadius().hashCode();
      }

      val var24: Int;
      if (this.getThumbnailText() == null) {
         var24 = 0;
      } else {
         var24 = this.getThumbnailText().hashCode();
      }

      val var25: Int;
      if (this.getThumbnailUrl() == null) {
         var25 = 0;
      } else {
         var25 = this.getThumbnailUrl().hashCode();
      }

      val var26: Int;
      if (this.getTitleColor() == null) {
         var26 = 0;
      } else {
         var26 = this.getTitleColor().hashCode();
      }

      if (this.getTitleText() != null) {
         var27 = this.getTitleText().hashCode();
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
                                                                                                                                                                                                                                                                           var30
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var29
                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                     + var28
                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                            + var1
                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                   + var31
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
         + var27;
   }

   public override fun toString(): String {
      val var1: Int = this.getBackgroundColor();
      val var3: Int = this.getBorderColor();
      val var2: Int = this.getHeaderColor();
      val var19: java.lang.String = this.getHeaderText();
      val var10: InviteType = this.getType();
      val var11: Int = this.getAcceptLabelBackgroundColor();
      val var22: Int = this.getAcceptLabelBorderColor();
      val var12: Int = this.getAcceptLabelColor();
      val var20: java.lang.String = this.getAcceptLabelText();
      val var6: java.lang.String = this.getBodyText();
      val var23: Int = this.getBodyTextColor();
      val var15: java.lang.Boolean = this.getCanBeAccepted();
      val var25: java.lang.String = this.getChannelIcon();
      val var14: java.lang.String = this.getChannelName();
      val var4: java.lang.Boolean = this.getEmbedCanBeTapped();
      val var24: java.lang.String = this.getMemberText();
      val var30: java.lang.String = this.getOnlineText();
      val var16: Int = this.getResolvingGradientEnd();
      val var27: Int = this.getResolvingGradientStart();
      val var8: java.lang.Boolean = this.getSplashHasRadialGradient();
      val var26: Int = this.getSplashOpacity();
      val var7: java.lang.String = this.getSplashUrl();
      val var9: java.lang.String = this.getInviteSplash();
      val var31: java.lang.String = this.getSubtitle();
      val var21: Int = this.getSubtitleColor();
      val var28: Int = this.getThumbnailBackgroundColor();
      val var18: Int = this.getThumbnailCornerRadius();
      val var29: java.lang.String = this.getThumbnailText();
      val var17: java.lang.String = this.getThumbnailUrl();
      val var5: Int = this.getTitleColor();
      val var32: java.lang.String = this.getTitleText();
      val var13: StringBuilder = new StringBuilder();
      var13.append("GuildInviteEmbedImpl(backgroundColor=");
      var13.append(var1);
      var13.append(", borderColor=");
      var13.append(var3);
      var13.append(", headerColor=");
      var13.append(var2);
      var13.append(", headerText=");
      var13.append(var19);
      var13.append(", type=");
      var13.append(var10);
      var13.append(", acceptLabelBackgroundColor=");
      var13.append(var11);
      var13.append(", acceptLabelBorderColor=");
      var13.append(var22);
      var13.append(", acceptLabelColor=");
      var13.append(var12);
      var13.append(", acceptLabelText=");
      var13.append(var20);
      var13.append(", bodyText=");
      var13.append(var6);
      var13.append(", bodyTextColor=");
      var13.append(var23);
      var13.append(", canBeAccepted=");
      var13.append(var15);
      var13.append(", channelIcon=");
      var13.append(var25);
      var13.append(", channelName=");
      var13.append(var14);
      var13.append(", embedCanBeTapped=");
      var13.append(var4);
      var13.append(", memberText=");
      var13.append(var24);
      var13.append(", onlineText=");
      var13.append(var30);
      var13.append(", resolvingGradientEnd=");
      var13.append(var16);
      var13.append(", resolvingGradientStart=");
      var13.append(var27);
      var13.append(", splashHasRadialGradient=");
      var13.append(var8);
      var13.append(", splashOpacity=");
      var13.append(var26);
      var13.append(", splashUrl=");
      var13.append(var7);
      var13.append(", inviteSplash=");
      var13.append(var9);
      var13.append(", subtitle=");
      var13.append(var31);
      var13.append(", subtitleColor=");
      var13.append(var21);
      var13.append(", thumbnailBackgroundColor=");
      var13.append(var28);
      var13.append(", thumbnailCornerRadius=");
      var13.append(var18);
      var13.append(", thumbnailText=");
      var13.append(var29);
      var13.append(", thumbnailUrl=");
      var13.append(var17);
      var13.append(", titleColor=");
      var13.append(var5);
      var13.append(", titleText=");
      var13.append(var32);
      var13.append(")");
      return var13.toString();
   }

   public object `$serializer` : f0<GuildInviteEmbedImpl> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: GuildInviteEmbedImpl.$serializer = new GuildInviteEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl", var0, 31);
         var1.l("backgroundColor", false);
         var1.l("borderColor", false);
         var1.l("headerColor", false);
         var1.l("headerText", false);
         var1.l("type", false);
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
         val var7: m0 = m0.a;
         val var8: a2 = a2.a;
         val var9: KSerializer = a.u(a2.a);
         val var11: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var10: KSerializer = a.u(var7);
         val var5: KSerializer = a.u(var7);
         val var6: KSerializer = a.u(var7);
         val var3: KSerializer = a.u(var8);
         val var2: KSerializer = a.u(var8);
         val var1: KSerializer = a.u(var7);
         val var4: h = h.a;
         return new KSerializer[]{
            var7,
            var7,
            var7,
            var9,
            var11,
            var10,
            var5,
            var6,
            var3,
            var2,
            var1,
            a.u(h.a),
            a.u(var8),
            a.u(var8),
            a.u(var4),
            a.u(var8),
            a.u(var8),
            a.u(var7),
            a.u(var7),
            a.u(var4),
            a.u(var7),
            a.u(var8),
            a.u(var8),
            a.u(var8),
            a.u(var7),
            a.u(var7),
            a.u(var7),
            a.u(var8),
            a.u(var8),
            a.u(var7),
            a.u(var8)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteEmbedImpl {
         r.h(var1, "decoder");
         val var44: SerialDescriptor = this.getDescriptor();
         val var45: c = var1.b(var44);
         val var8: Boolean = var45.p();
         var var2: Int = 0;
         var var27: Any = null;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         val var6: Int;
         var var10: Any;
         var var13: Any;
         var var15: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: Any;
         var var23: Any;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         var var28: Any;
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         val var36: Any;
         val var37: Any;
         var var38: Any;
         var var47: Any;
         var var54: Any;
         var var61: Any;
         if (var8) {
            var6 = var45.i(var44, 0);
            var3 = var45.i(var44, 1);
            var2 = var45.i(var44, 2);
            var54 = a2.a;
            var25 = var45.n(var44, 3, a2.a, null);
            var17 = var45.y(var44, 4, InviteType.Serializer.INSTANCE, null);
            var47 = m0.a;
            var10 = var45.n(var44, 5, m0.a, null);
            var20 = var45.n(var44, 6, (DeserializationStrategy)var47, null);
            var23 = var45.n(var44, 7, (DeserializationStrategy)var47, null);
            val var14: Any = var45.n(var44, 8, (DeserializationStrategy)var54, null);
            var22 = var45.n(var44, 9, (DeserializationStrategy)var54, null);
            var37 = var45.n(var44, 10, (DeserializationStrategy)var47, null);
            var61 = h.a;
            var36 = var45.n(var44, 11, h.a, null);
            var18 = var45.n(var44, 12, (DeserializationStrategy)var54, null);
            var19 = var45.n(var44, 13, (DeserializationStrategy)var54, null);
            var21 = var45.n(var44, 14, (DeserializationStrategy)var61, null);
            var31 = var45.n(var44, 15, (DeserializationStrategy)var54, null);
            var32 = var45.n(var44, 16, (DeserializationStrategy)var54, null);
            var38 = var45.n(var44, 17, (DeserializationStrategy)var47, null);
            var15 = var45.n(var44, 18, (DeserializationStrategy)var47, null);
            var33 = var45.n(var44, 19, (DeserializationStrategy)var61, null);
            var13 = var45.n(var44, 20, (DeserializationStrategy)var47, null);
            var28 = var45.n(var44, 21, (DeserializationStrategy)var54, null);
            var34 = var45.n(var44, 22, (DeserializationStrategy)var54, null);
            var26 = var45.n(var44, 23, (DeserializationStrategy)var54, null);
            var29 = var45.n(var44, 24, (DeserializationStrategy)var47, null);
            var35 = var45.n(var44, 25, (DeserializationStrategy)var47, null);
            val var16: Any = var45.n(var44, 26, (DeserializationStrategy)var47, null);
            val var12: Any = var45.n(var44, 27, (DeserializationStrategy)var54, null);
            var61 = var45.n(var44, 28, (DeserializationStrategy)var54, null);
            var47 = var45.n(var44, 29, (DeserializationStrategy)var47, null);
            var54 = var45.n(var44, 30, (DeserializationStrategy)var54, null);
            var5 = Integer.MAX_VALUE;
            var30 = var14;
            var24 = var16;
            var27 = var12;
            var4 = var2;
         } else {
            var var52: Boolean = true;
            var5 = 0;
            var4 = 0;
            var3 = 0;
            var47 = null;
            var54 = null;
            var24 = null;
            var33 = null;
            var26 = null;
            var32 = null;
            var30 = null;
            var31 = null;
            var35 = null;
            var29 = null;
            var34 = null;
            var28 = null;
            var25 = null;
            var var64: Any = null;
            var61 = null;
            var10 = null;
            var var74: Any = null;
            var var81: Any = null;
            var13 = null;
            var15 = null;
            var17 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var22 = null;
            var23 = null;
            var21 = null;

            while (var52) {
               label61: {
                  label60: {
                     label59: {
                        label58: {
                           var var7: Int = var45.o(var44);
                           switch (var7) {
                              case -1:
                                 var52 = false;
                                 break label59;
                              case 0:
                                 var5 = var45.i(var44, 0);
                                 var2 |= 1;
                                 break label59;
                              case 1:
                                 var3 = var45.i(var44, 1);
                                 var2 |= 2;
                                 break label59;
                              case 2:
                                 var4 = var45.i(var44, 2);
                                 var2 |= 4;
                                 break label59;
                              case 3:
                                 var25 = var45.n(var44, 3, a2.a, var25);
                                 var2 |= 8;
                                 break label59;
                              case 4:
                                 var81 = var18;
                                 var15 = var19;
                                 var64 = var45.y(var44, 4, InviteType.Serializer.INSTANCE, var64);
                                 var2 |= 16;
                                 var24 = var17;
                                 var23 = var15;
                                 var22 = var13;
                                 var21 = var81;
                                 var20 = var74;
                                 var19 = var10;
                                 var18 = var61;
                                 var17 = var64;
                                 var74 = var20;
                                 var13 = var22;
                                 var64 = var23;
                                 var61 = var21;
                                 var10 = var24;
                                 break label60;
                              case 5:
                                 var81 = var18;
                                 var15 = var19;
                                 var74 = var20;
                                 var13 = var22;
                                 var19 = var10;
                                 var18 = var45.n(var44, 5, m0.a, var61);
                                 var2 |= 32;
                                 var17 = var64;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var23;
                                 var20 = var74;
                                 var21 = var81;
                                 var22 = var13;
                                 var23 = var15;
                                 var24 = var17;
                                 break label60;
                              case 6:
                                 var81 = var18;
                                 var15 = var19;
                                 var13 = var22;
                                 var20 = var74;
                                 var19 = var45.n(var44, 6, m0.a, var10);
                                 var2 |= 64;
                                 var18 = var61;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var23;
                                 var74 = var20;
                                 var17 = var64;
                                 var21 = var81;
                                 var22 = var13;
                                 var23 = var15;
                                 var24 = var17;
                                 break label60;
                              case 7:
                                 var15 = var19;
                                 var13 = var22;
                                 var21 = var81;
                                 var22 = var45.n(var44, 7, m0.a, var74);
                                 var2 |= 128;
                                 var19 = var10;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var23;
                                 var74 = var20;
                                 var81 = var18;
                                 var17 = var64;
                                 var18 = var61;
                                 var20 = var22;
                                 var22 = var13;
                                 var23 = var15;
                                 var24 = var17;
                                 break label60;
                              case 8:
                                 var15 = var19;
                                 var22 = var13;
                                 var21 = var45.n(var44, 8, a2.a, var81);
                                 var2 |= 256;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var23;
                                 var13 = var22;
                                 var74 = var20;
                                 var81 = var18;
                                 var17 = var64;
                                 var18 = var61;
                                 var19 = var10;
                                 var20 = var74;
                                 var23 = var15;
                                 var24 = var17;
                                 break label60;
                              case 9:
                                 var23 = var15;
                                 var22 = var45.n(var44, 9, a2.a, var13);
                                 var2 |= 512;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var23;
                                 var13 = var22;
                                 var74 = var20;
                                 var15 = var19;
                                 var81 = var18;
                                 var17 = var64;
                                 var18 = var61;
                                 var19 = var10;
                                 var20 = var74;
                                 var21 = var81;
                                 var24 = var17;
                                 break label60;
                              case 10:
                                 var24 = var17;
                                 var23 = var45.n(var44, 10, m0.a, var15);
                                 var2 |= 1024;
                                 var17 = var64;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var23;
                                 var13 = var22;
                                 var74 = var20;
                                 var15 = var19;
                                 var81 = var18;
                                 var18 = var61;
                                 var19 = var10;
                                 var20 = var74;
                                 var21 = var81;
                                 var22 = var13;
                                 break label60;
                              case 11:
                                 var24 = var45.n(var44, 11, h.a, var17);
                                 var2 |= 2048;
                                 var17 = var64;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var23;
                                 var13 = var22;
                                 var74 = var20;
                                 var15 = var19;
                                 var81 = var18;
                                 var18 = var61;
                                 var19 = var10;
                                 var20 = var74;
                                 var21 = var81;
                                 var22 = var13;
                                 var23 = var15;
                                 break label60;
                              case 12:
                                 var18 = var45.n(var44, 12, a2.a, var18);
                                 var2 |= 4096;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var23;
                                 var13 = var22;
                                 var74 = var20;
                                 var15 = var19;
                                 var81 = var18;
                                 var17 = var64;
                                 var18 = var61;
                                 var19 = var10;
                                 var20 = var74;
                                 var21 = var81;
                                 var22 = var13;
                                 var23 = var15;
                                 var24 = var17;
                                 break label60;
                              case 13:
                                 var38 = var45.n(var44, 13, a2.a, var19);
                                 var2 |= 8192;
                                 var19 = var10;
                                 var81 = var18;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var23;
                                 var13 = var22;
                                 var74 = var20;
                                 var15 = var38;
                                 var17 = var64;
                                 var18 = var61;
                                 var20 = var74;
                                 var21 = var81;
                                 var22 = var13;
                                 var23 = var15;
                                 var24 = var17;
                                 break label60;
                              case 14:
                                 val var289: Any = var45.n(var44, 14, h.a, var20);
                                 var2 |= 16384;
                                 var20 = var74;
                                 var81 = var18;
                                 var15 = var19;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var23;
                                 var13 = var22;
                                 var74 = var289;
                                 var17 = var64;
                                 var18 = var61;
                                 var19 = var10;
                                 var21 = var81;
                                 var22 = var13;
                                 var23 = var15;
                                 var24 = var17;
                                 break label60;
                              case 15:
                                 val var288: Any = var45.n(var44, 15, a2.a, var22);
                                 var2 |= 32768;
                                 var24 = var17;
                                 var81 = var18;
                                 var15 = var19;
                                 var74 = var20;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var23;
                                 var13 = var288;
                                 var17 = var64;
                                 var18 = var61;
                                 var19 = var10;
                                 var20 = var74;
                                 var21 = var81;
                                 var22 = var13;
                                 var23 = var15;
                                 break label60;
                              case 16:
                                 val var287: Any = var45.n(var44, 16, a2.a, var23);
                                 var2 |= 65536;
                                 var81 = var18;
                                 var15 = var19;
                                 var74 = var20;
                                 var13 = var22;
                                 var10 = var24;
                                 var61 = var21;
                                 var64 = var287;
                                 var17 = var64;
                                 var18 = var61;
                                 var19 = var10;
                                 var20 = var74;
                                 var21 = var81;
                                 var22 = var13;
                                 var23 = var15;
                                 var24 = var17;
                                 break label60;
                              case 17:
                                 val var286: Any = var45.n(var44, 17, m0.a, var21);
                                 var2 |= 131072;
                                 var81 = var18;
                                 var15 = var19;
                                 var74 = var20;
                                 var13 = var22;
                                 var64 = var23;
                                 var10 = var24;
                                 var61 = var286;
                                 var17 = var64;
                                 var18 = var61;
                                 var19 = var10;
                                 var20 = var74;
                                 var21 = var81;
                                 var22 = var13;
                                 var23 = var15;
                                 var24 = var17;
                                 break label60;
                              case 18:
                                 val var285: Any = var45.n(var44, 18, m0.a, var24);
                                 var2 |= 262144;
                                 var81 = var18;
                                 var15 = var19;
                                 var74 = var20;
                                 var13 = var22;
                                 var64 = var23;
                                 var61 = var21;
                                 var10 = var285;
                                 var17 = var64;
                                 var18 = var61;
                                 var19 = var10;
                                 var20 = var74;
                                 var21 = var81;
                                 var22 = var13;
                                 var23 = var15;
                                 var24 = var17;
                                 break label60;
                              case 19:
                                 var33 = var45.n(var44, 19, h.a, var33);
                                 var2 |= 524288;
                                 var81 = var18;
                                 var15 = var19;
                                 var74 = var20;
                                 var13 = var22;
                                 var64 = var23;
                                 var61 = var21;
                                 var10 = var24;
                                 var17 = var64;
                                 var18 = var61;
                                 var19 = var10;
                                 var20 = var74;
                                 var21 = var81;
                                 var22 = var13;
                                 var23 = var15;
                                 var24 = var17;
                                 break label60;
                              case 20:
                                 var54 = var45.n(var44, 20, m0.a, var54);
                                 var7 = 1048576;
                                 break;
                              case 21:
                                 var28 = var45.n(var44, 21, a2.a, var28);
                                 var2 |= 2097152;
                                 break label58;
                              case 22:
                                 var34 = var45.n(var44, 22, a2.a, var34);
                                 var2 |= 4194304;
                                 break label58;
                              case 23:
                                 var26 = var45.n(var44, 23, a2.a, var26);
                                 var2 |= 8388608;
                                 break label58;
                              case 24:
                                 var29 = var45.n(var44, 24, m0.a, var29);
                                 var2 |= 16777216;
                                 break label58;
                              case 25:
                                 var35 = var45.n(var44, 25, m0.a, var35);
                                 var2 |= 33554432;
                                 break label58;
                              case 26:
                                 var47 = var45.n(var44, 26, m0.a, var47);
                                 var7 = 67108864;
                                 break;
                              case 27:
                                 var27 = var45.n(var44, 27, a2.a, var27);
                                 var2 |= 134217728;
                                 break label58;
                              case 28:
                                 var31 = var45.n(var44, 28, a2.a, var31);
                                 var2 |= 268435456;
                                 break label58;
                              case 29:
                                 var30 = var45.n(var44, 29, m0.a, var30);
                                 var2 |= 536870912;
                                 break label58;
                              case 30:
                                 var32 = var45.n(var44, 30, a2.a, var32);
                                 var2 |= 1073741824;
                                 break label58;
                              default:
                                 throw new n(var7);
                           }

                           var2 |= var7;
                        }

                        var81 = var18;
                        var15 = var19;
                        var74 = var20;
                        var13 = var22;
                        var64 = var23;
                        var61 = var21;
                        var10 = var24;
                        var17 = var64;
                        var18 = var61;
                        var19 = var10;
                        var20 = var74;
                        var21 = var81;
                        var22 = var13;
                        var23 = var15;
                        var24 = var17;
                        break label60;
                     }

                     var61 = var21;
                     var10 = var24;
                     var47 = var25;
                     var24 = var17;
                     var23 = var15;
                     var22 = var13;
                     var21 = var81;
                     var20 = var74;
                     var19 = var10;
                     var18 = var61;
                     var17 = var64;
                     var81 = var18;
                     var15 = var19;
                     var74 = var20;
                     var13 = var22;
                     var64 = var23;
                     var25 = var47;
                     break label61;
                  }

                  var25 = var47;
                  var47 = var25;
               }

               var25 = var47;
               var64 = var17;
               var61 = var18;
               var10 = var19;
               var74 = var20;
               var81 = var21;
               var13 = var22;
               var15 = var23;
               var17 = var24;
               var47 = var25;
               var24 = var10;
               var18 = var81;
               var19 = var15;
               var20 = var74;
               var22 = var13;
               var23 = var64;
               var21 = var61;
            }

            var61 = var31;
            var6 = var5;
            var37 = var15;
            var24 = var47;
            var5 = var2;
            var54 = var32;
            var47 = var30;
            var30 = var81;
            var13 = var54;
            var15 = var24;
            var38 = var21;
            var32 = var23;
            var10 = var61;
            var31 = var22;
            var36 = var17;
            var21 = var20;
            var22 = var13;
            var20 = var10;
            var23 = var74;
            var17 = var64;
         }

         var45.c(var44);
         return new GuildInviteEmbedImpl(
            var5,
            var6,
            var3,
            var4,
            var25 as java.lang.String,
            var17 as InviteType,
            var10 as Integer,
            var20 as Integer,
            var23 as Integer,
            var30 as java.lang.String,
            var22 as java.lang.String,
            var37 as Integer,
            var36 as java.lang.Boolean,
            var18 as java.lang.String,
            var19 as java.lang.String,
            var21 as java.lang.Boolean,
            var31 as java.lang.String,
            var32 as java.lang.String,
            var38 as Integer,
            var15 as Integer,
            var33 as java.lang.Boolean,
            var13 as Integer,
            var28 as java.lang.String,
            var34 as java.lang.String,
            var26 as java.lang.String,
            var29 as Integer,
            var35 as Integer,
            var24 as Integer,
            var27 as java.lang.String,
            var61 as java.lang.String,
            var47 as Integer,
            var54 as java.lang.String,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: GuildInviteEmbedImpl) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         GuildInviteEmbedImpl.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteEmbedImpl> {
         return GuildInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
