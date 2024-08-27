package com.discord.chat.bridge.codedlinks

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer
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
public data class EmbeddedActivityInviteEmbedImpl(backgroundColor: Int,
      borderColor: Int,
      headerColor: Int,
      headerText: String?,
      type: InviteType? = ...,
      acceptLabelBackgroundColor: Int? = ...,
      acceptLabelBorderColor: Int? = ...,
      acceptLabelColor: Int? = ...,
      acceptLabelText: String? = ...,
      bodyText: String? = ...,
      bodyTextColor: Int? = ...,
      canBeAccepted: Boolean? = ...,
      embedCanBeTapped: Boolean? = ...,
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
      titleText: String? = ...,
      participantAvatarUris: List<String>,
      extendedType: CodedLinkExtendedType = ...,
      structurableSubtitleText: AnnotatedStructurableText? = ...,
      noParticipantsText: String,
      ctaEnabled: Boolean
   )
   : CodedLinkEmbed,
   EmbeddedActivityInviteEmbed {
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelText: String?
   public open val backgroundColor: Int
   public open val bodyText: String?
   public open val bodyTextColor: Int?
   public open val borderColor: Int
   public open val canBeAccepted: Boolean?
   public open val ctaEnabled: Boolean
   public open val embedCanBeTapped: Boolean?
   public open val extendedType: CodedLinkExtendedType
   public open val headerColor: Int
   public open val headerText: String?
   public open val inviteSplash: String?
   public open val noParticipantsText: String
   public open val participantAvatarUris: List<String>
   public open val resolvingGradientEnd: Int?
   public open val resolvingGradientStart: Int?
   public open val splashHasRadialGradient: Boolean?
   public open val splashOpacity: Int?
   public open val splashUrl: String?
   public open val structurableSubtitleText: AnnotatedStructurableText?
   public open val subtitle: String?
   public open val subtitleColor: Int?
   public open val thumbnailBackgroundColor: Int?
   public open val thumbnailCornerRadius: Int?
   public open val thumbnailText: String?
   public open val thumbnailUrl: String?
   public open val titleColor: Int?
   public open val titleText: String?
   public open val type: InviteType?

   init {
      r.h(var28, "participantAvatarUris");
      r.h(var29, "extendedType");
      r.h(var31, "noParticipantsText");
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
      this.embedCanBeTapped = var13;
      this.resolvingGradientEnd = var14;
      this.resolvingGradientStart = var15;
      this.splashHasRadialGradient = var16;
      this.splashOpacity = var17;
      this.splashUrl = var18;
      this.inviteSplash = var19;
      this.subtitle = var20;
      this.subtitleColor = var21;
      this.thumbnailBackgroundColor = var22;
      this.thumbnailCornerRadius = var23;
      this.thumbnailText = var24;
      this.thumbnailUrl = var25;
      this.titleColor = var26;
      this.titleText = var27;
      this.participantAvatarUris = var28;
      this.extendedType = var29;
      this.structurableSubtitleText = var30;
      this.noParticipantsText = var31;
      this.ctaEnabled = var32;
   }

   @JvmStatic
   public fun `write$Self`(self: EmbeddedActivityInviteEmbedImpl, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.getBackgroundColor());
      var1.w(var2, 1, var0.getBorderColor());
      var1.w(var2, 2, var0.getHeaderColor());
      val var5: a2 = a2.a;
      var1.m(var2, 3, a2.a, var0.getHeaderText());
      var var6: Boolean;
      if (!var1.A(var2, 4) && var0.getType() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 4, InviteType.Serializer.INSTANCE, var0.getType());
      }

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

      if (!var1.A(var2, 12) && var0.getEmbedCanBeTapped() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 12, h.a, var0.getEmbedCanBeTapped());
      }

      if (!var1.A(var2, 13) && var0.getResolvingGradientEnd() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 13, m0.a, var0.getResolvingGradientEnd());
      }

      if (!var1.A(var2, 14) && var0.getResolvingGradientStart() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 14, m0.a, var0.getResolvingGradientStart());
      }

      if (!var1.A(var2, 15) && var0.getSplashHasRadialGradient() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 15, h.a, var0.getSplashHasRadialGradient());
      }

      if (!var1.A(var2, 16) && var0.getSplashOpacity() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 16, m0.a, var0.getSplashOpacity());
      }

      if (!var1.A(var2, 17) && var0.getSplashUrl() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 17, var5, var0.getSplashUrl());
      }

      if (!var1.A(var2, 18) && var0.getInviteSplash() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 18, var5, var0.getInviteSplash());
      }

      if (!var1.A(var2, 19) && var0.getSubtitle() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 19, var5, var0.getSubtitle());
      }

      if (!var1.A(var2, 20) && var0.getSubtitleColor() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 20, m0.a, var0.getSubtitleColor());
      }

      if (!var1.A(var2, 21) && var0.getThumbnailBackgroundColor() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 21, m0.a, var0.getThumbnailBackgroundColor());
      }

      if (!var1.A(var2, 22) && var0.getThumbnailCornerRadius() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 22, m0.a, var0.getThumbnailCornerRadius());
      }

      if (!var1.A(var2, 23) && var0.getThumbnailText() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 23, var5, var0.getThumbnailText());
      }

      if (!var1.A(var2, 24) && var0.getThumbnailUrl() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 24, var5, var0.getThumbnailUrl());
      }

      if (!var1.A(var2, 25) && var0.getTitleColor() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 25, m0.a, var0.getTitleColor());
      }

      if (!var1.A(var2, 26) && var0.getTitleText() == null) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.m(var2, 26, var5, var0.getTitleText());
      }

      var1.y(var2, 27, new xk.f(var5), var0.getParticipantAvatarUris());
      if (!var1.A(var2, 28) && var0.getExtendedType() === CodedLinkExtendedType.ACTIVITY_BOOKMARK) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.y(var2, 28, CodedLinkExtendedType.Serializer.INSTANCE, var0.getExtendedType());
      }

      label208: {
         if (!var1.A(var2, 29)) {
            var6 = false;
            if (var0.getStructurableSubtitleText() == null) {
               break label208;
            }
         }

         var6 = true;
      }

      if (var6) {
         var1.m(var2, 29, AnnotatedStructurableTextSerializer.INSTANCE, var0.getStructurableSubtitleText());
      }

      var1.z(var2, 30, var0.getNoParticipantsText());
      var1.x(var2, 31, var0.getCtaEnabled());
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

   public operator fun component13(): Boolean? {
      return this.getEmbedCanBeTapped();
   }

   public operator fun component14(): Int? {
      return this.getResolvingGradientEnd();
   }

   public operator fun component15(): Int? {
      return this.getResolvingGradientStart();
   }

   public operator fun component16(): Boolean? {
      return this.getSplashHasRadialGradient();
   }

   public operator fun component17(): Int? {
      return this.getSplashOpacity();
   }

   public operator fun component18(): String? {
      return this.getSplashUrl();
   }

   public operator fun component19(): String? {
      return this.getInviteSplash();
   }

   public operator fun component2(): Int {
      return this.getBorderColor();
   }

   public operator fun component20(): String? {
      return this.getSubtitle();
   }

   public operator fun component21(): Int? {
      return this.getSubtitleColor();
   }

   public operator fun component22(): Int? {
      return this.getThumbnailBackgroundColor();
   }

   public operator fun component23(): Int? {
      return this.getThumbnailCornerRadius();
   }

   public operator fun component24(): String? {
      return this.getThumbnailText();
   }

   public operator fun component25(): String? {
      return this.getThumbnailUrl();
   }

   public operator fun component26(): Int? {
      return this.getTitleColor();
   }

   public operator fun component27(): String? {
      return this.getTitleText();
   }

   public operator fun component28(): List<String> {
      return this.getParticipantAvatarUris();
   }

   public operator fun component29(): CodedLinkExtendedType {
      return this.getExtendedType();
   }

   public operator fun component3(): Int {
      return this.getHeaderColor();
   }

   public operator fun component30(): AnnotatedStructurableText? {
      return this.getStructurableSubtitleText();
   }

   public operator fun component31(): String {
      return this.getNoParticipantsText();
   }

   public operator fun component32(): Boolean {
      return this.getCtaEnabled();
   }

   public operator fun component4(): String? {
      return this.getHeaderText();
   }

   public operator fun component5(): InviteType? {
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
      backgroundColor: Int = ...,
      borderColor: Int = ...,
      headerColor: Int = ...,
      headerText: String? = ...,
      type: InviteType? = ...,
      acceptLabelBackgroundColor: Int? = ...,
      acceptLabelBorderColor: Int? = ...,
      acceptLabelColor: Int? = ...,
      acceptLabelText: String? = ...,
      bodyText: String? = ...,
      bodyTextColor: Int? = ...,
      canBeAccepted: Boolean? = ...,
      embedCanBeTapped: Boolean? = ...,
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
      titleText: String? = ...,
      participantAvatarUris: List<String> = ...,
      extendedType: CodedLinkExtendedType = ...,
      structurableSubtitleText: AnnotatedStructurableText? = ...,
      noParticipantsText: String = ...,
      ctaEnabled: Boolean = ...
   ): EmbeddedActivityInviteEmbedImpl {
      r.h(var28, "participantAvatarUris");
      r.h(var29, "extendedType");
      r.h(var31, "noParticipantsText");
      return new EmbeddedActivityInviteEmbedImpl(
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
         var32
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbeddedActivityInviteEmbedImpl) {
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
         } else if (!r.c(this.getEmbedCanBeTapped(), var1.getEmbedCanBeTapped())) {
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
         } else if (!r.c(this.getTitleText(), var1.getTitleText())) {
            return false;
         } else if (!r.c(this.getParticipantAvatarUris(), var1.getParticipantAvatarUris())) {
            return false;
         } else if (this.getExtendedType() != var1.getExtendedType()) {
            return false;
         } else if (!r.c(this.getStructurableSubtitleText(), var1.getStructurableSubtitleText())) {
            return false;
         } else if (!r.c(this.getNoParticipantsText(), var1.getNoParticipantsText())) {
            return false;
         } else {
            return this.getCtaEnabled() == var1.getCtaEnabled();
         }
      }
   }

   public override fun hashCode(): Int {
      val var30: Int = Integer.hashCode(this.getBackgroundColor());
      val var29: Int = Integer.hashCode(this.getBorderColor());
      val var28: Int = Integer.hashCode(this.getHeaderColor());
      val var34: java.lang.String = this.getHeaderText();
      var var25: Int = 0;
      val var1: Int;
      if (var34 == null) {
         var1 = 0;
      } else {
         var1 = this.getHeaderText().hashCode();
      }

      val var2: Int;
      if (this.getType() == null) {
         var2 = 0;
      } else {
         var2 = this.getType().hashCode();
      }

      val var3: Int;
      if (this.getAcceptLabelBackgroundColor() == null) {
         var3 = 0;
      } else {
         var3 = this.getAcceptLabelBackgroundColor().hashCode();
      }

      val var4: Int;
      if (this.getAcceptLabelBorderColor() == null) {
         var4 = 0;
      } else {
         var4 = this.getAcceptLabelBorderColor().hashCode();
      }

      val var5: Int;
      if (this.getAcceptLabelColor() == null) {
         var5 = 0;
      } else {
         var5 = this.getAcceptLabelColor().hashCode();
      }

      val var6: Int;
      if (this.getAcceptLabelText() == null) {
         var6 = 0;
      } else {
         var6 = this.getAcceptLabelText().hashCode();
      }

      val var7: Int;
      if (this.getBodyText() == null) {
         var7 = 0;
      } else {
         var7 = this.getBodyText().hashCode();
      }

      val var8: Int;
      if (this.getBodyTextColor() == null) {
         var8 = 0;
      } else {
         var8 = this.getBodyTextColor().hashCode();
      }

      val var9: Int;
      if (this.getCanBeAccepted() == null) {
         var9 = 0;
      } else {
         var9 = this.getCanBeAccepted().hashCode();
      }

      val var10: Int;
      if (this.getEmbedCanBeTapped() == null) {
         var10 = 0;
      } else {
         var10 = this.getEmbedCanBeTapped().hashCode();
      }

      val var11: Int;
      if (this.getResolvingGradientEnd() == null) {
         var11 = 0;
      } else {
         var11 = this.getResolvingGradientEnd().hashCode();
      }

      val var12: Int;
      if (this.getResolvingGradientStart() == null) {
         var12 = 0;
      } else {
         var12 = this.getResolvingGradientStart().hashCode();
      }

      val var13: Int;
      if (this.getSplashHasRadialGradient() == null) {
         var13 = 0;
      } else {
         var13 = this.getSplashHasRadialGradient().hashCode();
      }

      val var14: Int;
      if (this.getSplashOpacity() == null) {
         var14 = 0;
      } else {
         var14 = this.getSplashOpacity().hashCode();
      }

      val var15: Int;
      if (this.getSplashUrl() == null) {
         var15 = 0;
      } else {
         var15 = this.getSplashUrl().hashCode();
      }

      val var16: Int;
      if (this.getInviteSplash() == null) {
         var16 = 0;
      } else {
         var16 = this.getInviteSplash().hashCode();
      }

      val var17: Int;
      if (this.getSubtitle() == null) {
         var17 = 0;
      } else {
         var17 = this.getSubtitle().hashCode();
      }

      val var18: Int;
      if (this.getSubtitleColor() == null) {
         var18 = 0;
      } else {
         var18 = this.getSubtitleColor().hashCode();
      }

      val var19: Int;
      if (this.getThumbnailBackgroundColor() == null) {
         var19 = 0;
      } else {
         var19 = this.getThumbnailBackgroundColor().hashCode();
      }

      val var20: Int;
      if (this.getThumbnailCornerRadius() == null) {
         var20 = 0;
      } else {
         var20 = this.getThumbnailCornerRadius().hashCode();
      }

      val var21: Int;
      if (this.getThumbnailText() == null) {
         var21 = 0;
      } else {
         var21 = this.getThumbnailText().hashCode();
      }

      val var22: Int;
      if (this.getThumbnailUrl() == null) {
         var22 = 0;
      } else {
         var22 = this.getThumbnailUrl().hashCode();
      }

      val var23: Int;
      if (this.getTitleColor() == null) {
         var23 = 0;
      } else {
         var23 = this.getTitleColor().hashCode();
      }

      val var24: Int;
      if (this.getTitleText() == null) {
         var24 = 0;
      } else {
         var24 = this.getTitleText().hashCode();
      }

      val var31: Int = this.getParticipantAvatarUris().hashCode();
      val var32: Int = this.getExtendedType().hashCode();
      if (this.getStructurableSubtitleText() != null) {
         var25 = this.getStructurableSubtitleText().hashCode();
      }

      val var33: Int = this.getNoParticipantsText().hashCode();
      val var27: Byte = this.getCtaEnabled();
      var var26: Byte = var27;
      if (var27 != 0) {
         var26 = 1;
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
                                             + var31
                                       )
                                       * 31
                                    + var32
                              )
                              * 31
                           + var25
                     )
                     * 31
                  + var33
            )
            * 31
         + var26;
   }

   public override fun toString(): String {
      val var1: Int = this.getBackgroundColor();
      val var2: Int = this.getBorderColor();
      val var3: Int = this.getHeaderColor();
      val var23: java.lang.String = this.getHeaderText();
      val var7: InviteType = this.getType();
      val var13: Int = this.getAcceptLabelBackgroundColor();
      val var21: Int = this.getAcceptLabelBorderColor();
      val var8: Int = this.getAcceptLabelColor();
      val var14: java.lang.String = this.getAcceptLabelText();
      val var31: java.lang.String = this.getBodyText();
      val var26: Int = this.getBodyTextColor();
      val var17: java.lang.Boolean = this.getCanBeAccepted();
      val var16: java.lang.Boolean = this.getEmbedCanBeTapped();
      val var28: Int = this.getResolvingGradientEnd();
      val var29: Int = this.getResolvingGradientStart();
      val var27: java.lang.Boolean = this.getSplashHasRadialGradient();
      val var15: Int = this.getSplashOpacity();
      val var32: java.lang.String = this.getSplashUrl();
      val var5: java.lang.String = this.getInviteSplash();
      val var20: java.lang.String = this.getSubtitle();
      val var9: Int = this.getSubtitleColor();
      val var19: Int = this.getThumbnailBackgroundColor();
      val var30: Int = this.getThumbnailCornerRadius();
      val var24: java.lang.String = this.getThumbnailText();
      val var25: java.lang.String = this.getThumbnailUrl();
      val var22: Int = this.getTitleColor();
      val var11: java.lang.String = this.getTitleText();
      val var33: java.util.List = this.getParticipantAvatarUris();
      val var18: CodedLinkExtendedType = this.getExtendedType();
      val var10: AnnotatedStructurableText = this.getStructurableSubtitleText();
      val var6: java.lang.String = this.getNoParticipantsText();
      val var4: Boolean = this.getCtaEnabled();
      val var12: StringBuilder = new StringBuilder();
      var12.append("EmbeddedActivityInviteEmbedImpl(backgroundColor=");
      var12.append(var1);
      var12.append(", borderColor=");
      var12.append(var2);
      var12.append(", headerColor=");
      var12.append(var3);
      var12.append(", headerText=");
      var12.append(var23);
      var12.append(", type=");
      var12.append(var7);
      var12.append(", acceptLabelBackgroundColor=");
      var12.append(var13);
      var12.append(", acceptLabelBorderColor=");
      var12.append(var21);
      var12.append(", acceptLabelColor=");
      var12.append(var8);
      var12.append(", acceptLabelText=");
      var12.append(var14);
      var12.append(", bodyText=");
      var12.append(var31);
      var12.append(", bodyTextColor=");
      var12.append(var26);
      var12.append(", canBeAccepted=");
      var12.append(var17);
      var12.append(", embedCanBeTapped=");
      var12.append(var16);
      var12.append(", resolvingGradientEnd=");
      var12.append(var28);
      var12.append(", resolvingGradientStart=");
      var12.append(var29);
      var12.append(", splashHasRadialGradient=");
      var12.append(var27);
      var12.append(", splashOpacity=");
      var12.append(var15);
      var12.append(", splashUrl=");
      var12.append(var32);
      var12.append(", inviteSplash=");
      var12.append(var5);
      var12.append(", subtitle=");
      var12.append(var20);
      var12.append(", subtitleColor=");
      var12.append(var9);
      var12.append(", thumbnailBackgroundColor=");
      var12.append(var19);
      var12.append(", thumbnailCornerRadius=");
      var12.append(var30);
      var12.append(", thumbnailText=");
      var12.append(var24);
      var12.append(", thumbnailUrl=");
      var12.append(var25);
      var12.append(", titleColor=");
      var12.append(var22);
      var12.append(", titleText=");
      var12.append(var11);
      var12.append(", participantAvatarUris=");
      var12.append(var33);
      var12.append(", extendedType=");
      var12.append(var18);
      var12.append(", structurableSubtitleText=");
      var12.append(var10);
      var12.append(", noParticipantsText=");
      var12.append(var6);
      var12.append(", ctaEnabled=");
      var12.append(var4);
      var12.append(")");
      return var12.toString();
   }

   public object `$serializer` : f0<EmbeddedActivityInviteEmbedImpl> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: EmbeddedActivityInviteEmbedImpl.$serializer = new EmbeddedActivityInviteEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl", var0, 32
         );
         var1.l("backgroundColor", false);
         var1.l("borderColor", false);
         var1.l("headerColor", false);
         var1.l("headerText", false);
         var1.l("type", true);
         var1.l("acceptLabelBackgroundColor", true);
         var1.l("acceptLabelBorderColor", true);
         var1.l("acceptLabelColor", true);
         var1.l("acceptLabelText", true);
         var1.l("bodyText", true);
         var1.l("bodyTextColor", true);
         var1.l("canBeAccepted", true);
         var1.l("embedCanBeTapped", true);
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
         var1.l("participantAvatarUris", false);
         var1.l("extendedType", true);
         var1.l("structurableSubtitleText", true);
         var1.l("noParticipantsText", false);
         var1.l("ctaEnabled", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var10: m0 = m0.a;
         val var6: a2 = a2.a;
         val var9: KSerializer = a.u(a2.a);
         val var5: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var7: KSerializer = a.u(var10);
         val var3: KSerializer = a.u(var10);
         val var2: KSerializer = a.u(var10);
         val var4: KSerializer = a.u(var6);
         val var1: KSerializer = a.u(var6);
         val var8: KSerializer = a.u(var10);
         val var11: h = h.a;
         return new KSerializer[]{
            var10,
            var10,
            var10,
            var9,
            var5,
            var7,
            var3,
            var2,
            var4,
            var1,
            var8,
            a.u(h.a),
            a.u(var11),
            a.u(var10),
            a.u(var10),
            a.u(var11),
            a.u(var10),
            a.u(var6),
            a.u(var6),
            a.u(var6),
            a.u(var10),
            a.u(var10),
            a.u(var10),
            a.u(var6),
            a.u(var6),
            a.u(var10),
            a.u(var6),
            new xk.f(var6),
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(AnnotatedStructurableTextSerializer.INSTANCE),
            var6,
            var11
         };
      }

      public open fun deserialize(decoder: Decoder): EmbeddedActivityInviteEmbedImpl {
         r.h(var1, "decoder");
         val var42: SerialDescriptor = this.getDescriptor();
         val var43: c = var1.b(var42);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var6: Int;
         var var7: Int;
         var var16: Any;
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
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         var var36: Any;
         var var37: Any;
         var var38: Any;
         val var39: Any;
         var var52: Any;
         var var56: Any;
         var var60: Any;
         var var77: Any;
         if (var43.p()) {
            var6 = var43.i(var42, 0);
            var4 = var43.i(var42, 1);
            var3 = var43.i(var42, 2);
            val var44: a2 = a2.a;
            var33 = var43.n(var42, 3, a2.a, null);
            var39 = var43.n(var42, 4, InviteType.Serializer.INSTANCE, null);
            var52 = m0.a;
            var60 = var43.n(var42, 5, m0.a, null);
            var37 = var43.n(var42, 6, (DeserializationStrategy)var52, null);
            var20 = var43.n(var42, 7, (DeserializationStrategy)var52, null);
            var17 = var43.n(var42, 8, var44, null);
            var21 = var43.n(var42, 9, var44, null);
            var31 = var43.n(var42, 10, (DeserializationStrategy)var52, null);
            var56 = h.a;
            var28 = var43.n(var42, 11, h.a, null);
            var38 = var43.n(var42, 12, (DeserializationStrategy)var56, null);
            var26 = var43.n(var42, 13, (DeserializationStrategy)var52, null);
            var32 = var43.n(var42, 14, (DeserializationStrategy)var52, null);
            var22 = var43.n(var42, 15, (DeserializationStrategy)var56, null);
            var77 = var43.n(var42, 16, (DeserializationStrategy)var52, null);
            var19 = var43.n(var42, 17, var44, null);
            var18 = var43.n(var42, 18, var44, null);
            var34 = var43.n(var42, 19, var44, null);
            var35 = var43.n(var42, 20, (DeserializationStrategy)var52, null);
            var16 = var43.n(var42, 21, (DeserializationStrategy)var52, null);
            var29 = var43.n(var42, 22, (DeserializationStrategy)var52, null);
            var23 = var43.n(var42, 23, var44, null);
            var24 = var43.n(var42, 24, var44, null);
            val var12: Any = var43.n(var42, 25, (DeserializationStrategy)var52, null);
            val var13: Any = var43.n(var42, 26, var44, null);
            var56 = var43.y(var42, 27, new xk.f(var44), null);
            val var15: Any = var43.y(var42, 28, CodedLinkExtendedType.Serializer.INSTANCE, null);
            var52 = var43.n(var42, 29, AnnotatedStructurableTextSerializer.INSTANCE, null);
            val var45: java.lang.String = var43.m(var42, 30);
            var2 = var43.C(var42, 31);
            var7 = -1;
            var36 = var77;
            var27 = var60;
            var25 = var12;
            var77 = var13;
            var60 = var15;
            var30 = var45;
         } else {
            var var66: Any = null;
            var var8: Boolean = true;
            var24 = null;
            var23 = null;
            var26 = null;
            var28 = null;
            var27 = null;
            var25 = null;
            var29 = null;
            var var46: Any = null;
            var34 = null;
            var31 = null;
            var32 = null;
            var33 = null;
            var18 = null;
            var var81: Any = null;
            var19 = null;
            var56 = null;
            var22 = null;
            var60 = null;
            var21 = null;
            var77 = null;
            var16 = null;
            var52 = null;
            var17 = null;
            var var67: Any = null;
            var30 = null;
            var20 = null;
            var7 = 0;
            var6 = 0;
            var4 = 0;
            var var5: Int = 0;
            var3 = 0;
            var35 = null;

            while (var8) {
               label134: {
                  label133: {
                     label171: {
                        label172: {
                           label148: {
                              var2 = var43.o(var42);
                              switch (var2) {
                                 case -1:
                                    var52 = var67;
                                    var8 = false;
                                    var81 = var77;
                                    var77 = var60;
                                    var67 = var56;
                                    var60 = var81;
                                    var56 = var52;
                                    var2 = var7;
                                    break label172;
                                 case 0:
                                    var56 = var52;
                                    var52 = var67;
                                    var6 = var43.i(var42, 0);
                                    var2 = var7 or 1;
                                    var60 = var81;
                                    var67 = var56;
                                    var77 = var60;
                                    var81 = var77;
                                    break label172;
                                 case 1:
                                    var4 = var43.i(var42, 1);
                                    var2 = var7 or 2;
                                    break label148;
                                 case 2:
                                    var5 = var43.i(var42, 2);
                                    var2 = var7 or 4;
                                    break label148;
                                 case 3:
                                    var33 = var43.n(var42, 3, a2.a, var33);
                                    var2 = var7 or 8;
                                    var81 = var77;
                                    var77 = var60;
                                    var67 = var56;
                                    var60 = var81;
                                    var56 = var52;
                                    var52 = var67;
                                    break label172;
                                 case 4:
                                    var16 = var20;
                                    var18 = var43.n(var42, 4, InviteType.Serializer.INSTANCE, var18);
                                    var2 = var7 or 16;
                                    var22 = var21;
                                    var21 = var22;
                                    var20 = var19;
                                    var19 = var18;
                                    var18 = var16;
                                    break label171;
                                 case 5:
                                    var56 = var52;
                                    var52 = var67;
                                    var60 = var43.n(var42, 5, m0.a, var81);
                                    var2 = var7 or 32;
                                    var67 = var56;
                                    var77 = var60;
                                    var81 = var77;
                                    break label172;
                                 case 6:
                                    var16 = var20;
                                    var20 = var43.n(var42, 6, m0.a, var19);
                                    var2 = var7 or 64;
                                    var19 = var18;
                                    var18 = var16;
                                    var21 = var22;
                                    var22 = var21;
                                    break label171;
                                 case 7:
                                    var52 = var67;
                                    var67 = var43.n(var42, 7, m0.a, var56);
                                    var2 = var7 or 128;
                                    var56 = var52;
                                    var60 = var81;
                                    var77 = var60;
                                    var81 = var77;
                                    break label172;
                                 case 8:
                                    var16 = var20;
                                    var22 = var43.n(var42, 8, a2.a, var22);
                                    var2 = var7 or 256;
                                    var18 = var16;
                                    var19 = var18;
                                    var20 = var19;
                                    var21 = var22;
                                    var22 = var21;
                                    break label171;
                                 case 9:
                                    var52 = var67;
                                    var37 = var43.n(var42, 9, a2.a, var60);
                                    var2 = var7 or 512;
                                    var60 = var81;
                                    var67 = var56;
                                    var56 = var52;
                                    var77 = var37;
                                    var81 = var77;
                                    break label172;
                                 case 10:
                                    var16 = var20;
                                    var37 = var43.n(var42, 10, m0.a, var21);
                                    var2 = var7 or 1024;
                                    var20 = var19;
                                    var18 = var16;
                                    var19 = var18;
                                    var21 = var22;
                                    var22 = var37;
                                    break label171;
                                 case 11:
                                    var52 = var67;
                                    var37 = var43.n(var42, 11, h.a, var77);
                                    var2 = var7 or 2048;
                                    var67 = var56;
                                    var77 = var60;
                                    var56 = var52;
                                    var60 = var81;
                                    var81 = var37;
                                    break label172;
                                 case 12:
                                    var36 = var43.n(var42, 12, h.a, var16);
                                    var2 = var7 or 4096;
                                    var22 = var21;
                                    var16 = var20;
                                    var18 = var36;
                                    var19 = var18;
                                    var20 = var19;
                                    var21 = var22;
                                    break label171;
                                 case 13:
                                    var37 = var43.n(var42, 13, m0.a, var52);
                                    var2 = var7 or 8192;
                                    var52 = var67;
                                    var56 = var37;
                                    var60 = var81;
                                    var67 = var56;
                                    var77 = var60;
                                    var81 = var77;
                                    break label172;
                                 case 14:
                                    var17 = var43.n(var42, 14, m0.a, var17);
                                    var2 = var7 or 16384;
                                    var18 = var16;
                                    var16 = var20;
                                    var19 = var18;
                                    var20 = var19;
                                    var21 = var22;
                                    var22 = var21;
                                    break label171;
                                 case 15:
                                    var38 = var43.n(var42, 15, h.a, var67);
                                    var2 = var7 or '耀';
                                    var67 = var56;
                                    var56 = var52;
                                    var52 = var38;
                                    var60 = var81;
                                    var77 = var60;
                                    var81 = var77;
                                    break label172;
                                 case 16:
                                    var38 = var43.n(var42, 16, m0.a, var20);
                                    var2 = var7 or 65536;
                                    var20 = var19;
                                    var18 = var16;
                                    var16 = var38;
                                    var19 = var18;
                                    var21 = var22;
                                    var22 = var21;
                                    break label171;
                                 case 17:
                                    var46 = var43.n(var42, 17, a2.a, var46);
                                    var2 = var7 or 131072;
                                    var56 = var52;
                                    var52 = var67;
                                    var60 = var81;
                                    var67 = var56;
                                    var77 = var60;
                                    var81 = var77;
                                    break label172;
                                 case 18:
                                    var66 = var43.n(var42, 18, a2.a, var66);
                                    var2 = var7 or 262144;
                                    var22 = var21;
                                    var18 = var16;
                                    var16 = var20;
                                    var19 = var18;
                                    var20 = var19;
                                    var21 = var22;
                                    break label171;
                                 case 19:
                                    var34 = var43.n(var42, 19, a2.a, var34);
                                    var2 = var7 or 524288;
                                    var56 = var52;
                                    var52 = var67;
                                    var60 = var81;
                                    var67 = var56;
                                    var77 = var60;
                                    var81 = var77;
                                    break label172;
                                 case 20:
                                    var35 = var43.n(var42, 20, m0.a, var35);
                                    var2 = var7 or 1048576;
                                    break label133;
                                 case 21:
                                    var24 = var43.n(var42, 21, m0.a, var24);
                                    var2 = 2097152;
                                    break;
                                 case 22:
                                    var29 = var43.n(var42, 22, m0.a, var29);
                                    var2 = 4194304;
                                    break;
                                 case 23:
                                    var28 = var43.n(var42, 23, a2.a, var28);
                                    var2 = 8388608;
                                    break;
                                 case 24:
                                    var27 = var43.n(var42, 24, a2.a, var27);
                                    var2 = 16777216;
                                    break;
                                 case 25:
                                    var23 = var43.n(var42, 25, m0.a, var23);
                                    var2 = 33554432;
                                    break;
                                 case 26:
                                    var26 = var43.n(var42, 26, a2.a, var26);
                                    var2 = 67108864;
                                    break;
                                 case 27:
                                    var32 = var43.y(var42, 27, new xk.f(a2.a), var32);
                                    var2 = var7 or 134217728;
                                    break label133;
                                 case 28:
                                    var25 = var43.y(var42, 28, CodedLinkExtendedType.Serializer.INSTANCE, var25);
                                    var2 = 268435456;
                                    break;
                                 case 29:
                                    var31 = var43.n(var42, 29, AnnotatedStructurableTextSerializer.INSTANCE, var31);
                                    var2 = var7 or 536870912;
                                    break label133;
                                 case 30:
                                    var30 = var43.m(var42, 30);
                                    var2 = var7 or 1073741824;
                                    break label133;
                                 case 31:
                                    var3 = var43.C(var42, 31);
                                    var2 = var7 or Integer.MIN_VALUE;
                                    break label133;
                                 default:
                                    throw new n(var2);
                              }

                              var2 = var7 or var2;
                              break label133;
                           }

                           var77 = var60;
                           var60 = var81;
                           var56 = var52;
                           var52 = var67;
                           var67 = var56;
                           var81 = var77;
                        }

                        var21 = var22;
                        var19 = var18;
                        var18 = var16;
                        var16 = var81;
                        var22 = var21;
                        var20 = var19;
                        var24 = var20;
                        var23 = var46;
                        var81 = var23;
                        var46 = var24;
                        break label134;
                     }

                     var77 = var60;
                     var60 = var81;
                     var56 = var52;
                     var52 = var67;
                     var81 = var23;
                     var46 = var24;
                     var23 = var46;
                     var24 = var16;
                     var67 = var56;
                     var16 = var77;
                     break label134;
                  }

                  var77 = var60;
                  var21 = var22;
                  var60 = var81;
                  var19 = var18;
                  var56 = var52;
                  var52 = var67;
                  var46 = var24;
                  var81 = var23;
                  var23 = var46;
                  var24 = var20;
                  var18 = var16;
                  var20 = var19;
                  var67 = var56;
                  var22 = var21;
                  var16 = var77;
               }

               var46 = var23;
               var52 = var56;
               var18 = var19;
               var19 = var20;
               var56 = var67;
               var24 = var46;
               var23 = var81;
               var7 = var2;
               var81 = var60;
               var22 = var21;
               var60 = var77;
               var21 = var22;
               var77 = var16;
               var16 = var18;
               var67 = var52;
               var20 = var24;
            }

            var32 = var17;
            var38 = var16;
            var77 = var26;
            var60 = var25;
            var2 = var3;
            var3 = var5;
            var56 = var32;
            var52 = var31;
            var17 = var22;
            var25 = var23;
            var24 = var27;
            var23 = var28;
            var27 = var81;
            var36 = var20;
            var28 = var77;
            var26 = var52;
            var22 = var67;
            var31 = var21;
            var21 = var60;
            var20 = var56;
            var37 = var19;
            var39 = var18;
            var16 = var24;
            var18 = var66;
            var19 = var46;
         }

         var43.c(var42);
         return new EmbeddedActivityInviteEmbedImpl(
            var7,
            0,
            var6,
            var4,
            var3,
            var33 as java.lang.String,
            var39 as InviteType,
            var27 as Int,
            var37 as Int,
            var20 as Int,
            var17 as java.lang.String,
            var21 as java.lang.String,
            var31 as Int,
            var28 as java.lang.Boolean,
            var38 as java.lang.Boolean,
            var26 as Int,
            var32 as Int,
            var22 as java.lang.Boolean,
            var36 as Int,
            var19 as java.lang.String,
            var18 as java.lang.String,
            var34 as java.lang.String,
            var35 as Int,
            var16 as Int,
            var29 as Int,
            var23 as java.lang.String,
            var24 as java.lang.String,
            var25 as Int,
            var77 as java.lang.String,
            var56 as java.util.List,
            var60 as CodedLinkExtendedType,
            var52 as AnnotatedStructurableText,
            (java.lang.String)var30,
            (boolean)var2,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: EmbeddedActivityInviteEmbedImpl) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         EmbeddedActivityInviteEmbedImpl.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbeddedActivityInviteEmbedImpl> {
         return EmbeddedActivityInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
