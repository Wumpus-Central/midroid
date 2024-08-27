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
      val var29: Int = Integer.hashCode(this.getBackgroundColor());
      val var28: Int = Integer.hashCode(this.getBorderColor());
      val var30: Int = Integer.hashCode(this.getHeaderColor());
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

      val var32: Int = this.getParticipantAvatarUris().hashCode();
      val var31: Int = this.getExtendedType().hashCode();
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
                                                                                                                                                                                                                                                                                    var29
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var28
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var30
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
                                             + var32
                                       )
                                       * 31
                                    + var31
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
      val var3: Int = this.getBorderColor();
      val var2: Int = this.getHeaderColor();
      val var21: java.lang.String = this.getHeaderText();
      val var18: InviteType = this.getType();
      val var17: Int = this.getAcceptLabelBackgroundColor();
      val var29: Int = this.getAcceptLabelBorderColor();
      val var24: Int = this.getAcceptLabelColor();
      val var30: java.lang.String = this.getAcceptLabelText();
      val var13: java.lang.String = this.getBodyText();
      val var11: Int = this.getBodyTextColor();
      val var26: java.lang.Boolean = this.getCanBeAccepted();
      val var27: java.lang.Boolean = this.getEmbedCanBeTapped();
      val var9: Int = this.getResolvingGradientEnd();
      val var23: Int = this.getResolvingGradientStart();
      val var19: java.lang.Boolean = this.getSplashHasRadialGradient();
      val var15: Int = this.getSplashOpacity();
      val var5: java.lang.String = this.getSplashUrl();
      val var14: java.lang.String = this.getInviteSplash();
      val var8: java.lang.String = this.getSubtitle();
      val var10: Int = this.getSubtitleColor();
      val var12: Int = this.getThumbnailBackgroundColor();
      val var20: Int = this.getThumbnailCornerRadius();
      val var16: java.lang.String = this.getThumbnailText();
      val var32: java.lang.String = this.getThumbnailUrl();
      val var6: Int = this.getTitleColor();
      val var31: java.lang.String = this.getTitleText();
      val var33: java.util.List = this.getParticipantAvatarUris();
      val var7: CodedLinkExtendedType = this.getExtendedType();
      val var28: AnnotatedStructurableText = this.getStructurableSubtitleText();
      val var25: java.lang.String = this.getNoParticipantsText();
      val var4: Boolean = this.getCtaEnabled();
      val var22: StringBuilder = new StringBuilder();
      var22.append("EmbeddedActivityInviteEmbedImpl(backgroundColor=");
      var22.append(var1);
      var22.append(", borderColor=");
      var22.append(var3);
      var22.append(", headerColor=");
      var22.append(var2);
      var22.append(", headerText=");
      var22.append(var21);
      var22.append(", type=");
      var22.append(var18);
      var22.append(", acceptLabelBackgroundColor=");
      var22.append(var17);
      var22.append(", acceptLabelBorderColor=");
      var22.append(var29);
      var22.append(", acceptLabelColor=");
      var22.append(var24);
      var22.append(", acceptLabelText=");
      var22.append(var30);
      var22.append(", bodyText=");
      var22.append(var13);
      var22.append(", bodyTextColor=");
      var22.append(var11);
      var22.append(", canBeAccepted=");
      var22.append(var26);
      var22.append(", embedCanBeTapped=");
      var22.append(var27);
      var22.append(", resolvingGradientEnd=");
      var22.append(var9);
      var22.append(", resolvingGradientStart=");
      var22.append(var23);
      var22.append(", splashHasRadialGradient=");
      var22.append(var19);
      var22.append(", splashOpacity=");
      var22.append(var15);
      var22.append(", splashUrl=");
      var22.append(var5);
      var22.append(", inviteSplash=");
      var22.append(var14);
      var22.append(", subtitle=");
      var22.append(var8);
      var22.append(", subtitleColor=");
      var22.append(var10);
      var22.append(", thumbnailBackgroundColor=");
      var22.append(var12);
      var22.append(", thumbnailCornerRadius=");
      var22.append(var20);
      var22.append(", thumbnailText=");
      var22.append(var16);
      var22.append(", thumbnailUrl=");
      var22.append(var32);
      var22.append(", titleColor=");
      var22.append(var6);
      var22.append(", titleText=");
      var22.append(var31);
      var22.append(", participantAvatarUris=");
      var22.append(var33);
      var22.append(", extendedType=");
      var22.append(var7);
      var22.append(", structurableSubtitleText=");
      var22.append(var28);
      var22.append(", noParticipantsText=");
      var22.append(var25);
      var22.append(", ctaEnabled=");
      var22.append(var4);
      var22.append(")");
      return var22.toString();
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
         val var11: m0 = m0.a;
         val var2: a2 = a2.a;
         val var10: KSerializer = a.u(a2.a);
         val var6: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var4: KSerializer = a.u(var11);
         val var3: KSerializer = a.u(var11);
         val var7: KSerializer = a.u(var11);
         val var5: KSerializer = a.u(var2);
         val var8: KSerializer = a.u(var2);
         val var1: KSerializer = a.u(var11);
         val var9: h = h.a;
         return new KSerializer[]{
            var11,
            var11,
            var11,
            var10,
            var6,
            var4,
            var3,
            var7,
            var5,
            var8,
            var1,
            a.u(h.a),
            a.u(var9),
            a.u(var11),
            a.u(var11),
            a.u(var9),
            a.u(var11),
            a.u(var2),
            a.u(var2),
            a.u(var2),
            a.u(var11),
            a.u(var11),
            a.u(var11),
            a.u(var2),
            a.u(var2),
            a.u(var11),
            a.u(var2),
            new xk.f(var2),
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(AnnotatedStructurableTextSerializer.INSTANCE),
            var2,
            var9
         };
      }

      public open fun deserialize(decoder: Decoder): EmbeddedActivityInviteEmbedImpl {
         r.h(var1, "decoder");
         val var40: SerialDescriptor = this.getDescriptor();
         val var41: c = var1.b(var40);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         var var14: Any;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: Any;
         var var23: Any;
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
         var var51: Any;
         var var56: Any;
         var var60: Any;
         var var66: Any;
         var var114: Any;
         if (var41.p()) {
            var6 = var41.i(var40, 0);
            var5 = var41.i(var40, 1);
            var2 = var41.i(var40, 2);
            val var42: a2 = a2.a;
            var33 = var41.n(var40, 3, a2.a, null);
            var32 = var41.n(var40, 4, InviteType.Serializer.INSTANCE, null);
            var51 = m0.a;
            var66 = var41.n(var40, 5, m0.a, null);
            var19 = var41.n(var40, 6, (DeserializationStrategy)var51, null);
            var21 = var41.n(var40, 7, (DeserializationStrategy)var51, null);
            var22 = var41.n(var40, 8, var42, null);
            var16 = var41.n(var40, 9, var42, null);
            var36 = var41.n(var40, 10, (DeserializationStrategy)var51, null);
            var56 = h.a;
            var38 = var41.n(var40, 11, h.a, null);
            var28 = var41.n(var40, 12, (DeserializationStrategy)var56, null);
            var17 = var41.n(var40, 13, (DeserializationStrategy)var51, null);
            var20 = var41.n(var40, 14, (DeserializationStrategy)var51, null);
            var37 = var41.n(var40, 15, (DeserializationStrategy)var56, null);
            var14 = var41.n(var40, 16, (DeserializationStrategy)var51, null);
            var18 = var41.n(var40, 17, var42, null);
            var25 = var41.n(var40, 18, var42, null);
            var34 = var41.n(var40, 19, var42, null);
            var35 = var41.n(var40, 20, (DeserializationStrategy)var51, null);
            var26 = var41.n(var40, 21, (DeserializationStrategy)var51, null);
            var29 = var41.n(var40, 22, (DeserializationStrategy)var51, null);
            var23 = var41.n(var40, 23, var42, null);
            var114 = var41.n(var40, 24, var42, null);
            var60 = var41.n(var40, 25, (DeserializationStrategy)var51, null);
            val var13: Any = var41.n(var40, 26, var42, null);
            var56 = var41.y(var40, 27, new xk.f(var42), null);
            val var15: Any = var41.y(var40, 28, CodedLinkExtendedType.Serializer.INSTANCE, null);
            var51 = var41.n(var40, 29, AnnotatedStructurableTextSerializer.INSTANCE, null);
            val var43: java.lang.String = var41.m(var40, 30);
            var3 = var41.C(var40, 31);
            var4 = -1;
            var27 = var66;
            var66 = var114;
            var31 = var60;
            var60 = var13;
            var114 = var15;
            var30 = var43;
         } else {
            var66 = null;
            var var8: Boolean = true;
            var114 = null;
            var23 = null;
            var26 = null;
            var28 = null;
            var27 = null;
            var25 = null;
            var29 = null;
            var var44: Any = null;
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
            var14 = null;
            var16 = null;
            var51 = null;
            var17 = null;
            var var68: Any = null;
            var30 = null;
            var20 = null;
            var var7: Int = 0;
            var6 = 0;
            var4 = 0;
            var5 = 0;
            var3 = 0;
            var35 = null;

            while (var8) {
               label134: {
                  label133: {
                     label171: {
                        label172: {
                           label148: {
                              var2 = var41.o(var40);
                              switch (var2) {
                                 case -1:
                                    var51 = var68;
                                    var8 = false;
                                    var81 = var14;
                                    var14 = var60;
                                    var68 = var56;
                                    var60 = var81;
                                    var56 = var51;
                                    var2 = var7;
                                    break label172;
                                 case 0:
                                    var56 = var51;
                                    var51 = var68;
                                    var6 = var41.i(var40, 0);
                                    var2 = var7 or 1;
                                    var60 = var81;
                                    var68 = var56;
                                    var14 = var60;
                                    var81 = var14;
                                    break label172;
                                 case 1:
                                    var4 = var41.i(var40, 1);
                                    var2 = var7 or 2;
                                    break label148;
                                 case 2:
                                    var5 = var41.i(var40, 2);
                                    var2 = var7 or 4;
                                    break label148;
                                 case 3:
                                    var51 = var68;
                                    var33 = var41.n(var40, 3, a2.a, var33);
                                    var2 = var7 or 8;
                                    var81 = var14;
                                    var14 = var60;
                                    var68 = var56;
                                    var60 = var81;
                                    var56 = var51;
                                    break label172;
                                 case 4:
                                    var16 = var20;
                                    var18 = var41.n(var40, 4, InviteType.Serializer.INSTANCE, var18);
                                    var2 = var7 or 16;
                                    var22 = var21;
                                    var21 = var22;
                                    var20 = var19;
                                    var19 = var18;
                                    var18 = var16;
                                    break label171;
                                 case 5:
                                    var56 = var51;
                                    var51 = var68;
                                    var60 = var41.n(var40, 5, m0.a, var81);
                                    var2 = var7 or 32;
                                    var68 = var56;
                                    var14 = var60;
                                    var81 = var14;
                                    break label172;
                                 case 6:
                                    var22 = var21;
                                    var16 = var20;
                                    var20 = var41.n(var40, 6, m0.a, var19);
                                    var2 = var7 or 64;
                                    var19 = var18;
                                    var18 = var16;
                                    var21 = var22;
                                    break label171;
                                 case 7:
                                    var51 = var68;
                                    var68 = var41.n(var40, 7, m0.a, var56);
                                    var2 = var7 or 128;
                                    var56 = var51;
                                    var60 = var81;
                                    var14 = var60;
                                    var81 = var14;
                                    break label172;
                                 case 8:
                                    var16 = var20;
                                    var22 = var41.n(var40, 8, a2.a, var22);
                                    var2 = var7 or 256;
                                    var18 = var16;
                                    var19 = var18;
                                    var20 = var19;
                                    var21 = var22;
                                    var22 = var21;
                                    break label171;
                                 case 9:
                                    var51 = var68;
                                    var37 = var41.n(var40, 9, a2.a, var60);
                                    var2 = var7 or 512;
                                    var60 = var81;
                                    var68 = var56;
                                    var56 = var51;
                                    var14 = var37;
                                    var81 = var14;
                                    break label172;
                                 case 10:
                                    var16 = var20;
                                    var37 = var41.n(var40, 10, m0.a, var21);
                                    var2 = var7 or 1024;
                                    var20 = var19;
                                    var21 = var22;
                                    var18 = var16;
                                    var19 = var18;
                                    var22 = var37;
                                    break label171;
                                 case 11:
                                    var51 = var68;
                                    var37 = var41.n(var40, 11, h.a, var14);
                                    var2 = var7 or 2048;
                                    var68 = var56;
                                    var14 = var60;
                                    var56 = var51;
                                    var60 = var81;
                                    var81 = var37;
                                    break label172;
                                 case 12:
                                    var38 = var41.n(var40, 12, h.a, var16);
                                    var2 = var7 or 4096;
                                    var16 = var20;
                                    var18 = var38;
                                    var19 = var18;
                                    var20 = var19;
                                    var21 = var22;
                                    var22 = var21;
                                    break label171;
                                 case 13:
                                    var36 = var41.n(var40, 13, m0.a, var51);
                                    var2 = var7 or 8192;
                                    var81 = var14;
                                    var51 = var68;
                                    var56 = var36;
                                    var60 = var81;
                                    var68 = var56;
                                    var14 = var60;
                                    break label172;
                                 case 14:
                                    var17 = var41.n(var40, 14, m0.a, var17);
                                    var2 = var7 or 16384;
                                    var18 = var16;
                                    var16 = var20;
                                    var19 = var18;
                                    var20 = var19;
                                    var21 = var22;
                                    var22 = var21;
                                    break label171;
                                 case 15:
                                    var38 = var41.n(var40, 15, h.a, var68);
                                    var2 = var7 or '耀';
                                    var56 = var51;
                                    var51 = var38;
                                    var60 = var81;
                                    var68 = var56;
                                    var14 = var60;
                                    var81 = var14;
                                    break label172;
                                 case 16:
                                    var38 = var41.n(var40, 16, m0.a, var20);
                                    var2 = var7 or 65536;
                                    var20 = var19;
                                    var22 = var21;
                                    var18 = var16;
                                    var16 = var38;
                                    var19 = var18;
                                    var21 = var22;
                                    break label171;
                                 case 17:
                                    var44 = var41.n(var40, 17, a2.a, var44);
                                    var2 = var7 or 131072;
                                    var56 = var51;
                                    var51 = var68;
                                    var60 = var81;
                                    var68 = var56;
                                    var14 = var60;
                                    var81 = var14;
                                    break label172;
                                 case 18:
                                    var66 = var41.n(var40, 18, a2.a, var66);
                                    var2 = var7 or 262144;
                                    var22 = var21;
                                    var18 = var16;
                                    var16 = var20;
                                    var19 = var18;
                                    var20 = var19;
                                    var21 = var22;
                                    break label171;
                                 case 19:
                                    var34 = var41.n(var40, 19, a2.a, var34);
                                    var2 = var7 or 524288;
                                    var56 = var51;
                                    var51 = var68;
                                    var60 = var81;
                                    var68 = var56;
                                    var14 = var60;
                                    var81 = var14;
                                    break label172;
                                 case 20:
                                    var35 = var41.n(var40, 20, m0.a, var35);
                                    var2 = var7 or 1048576;
                                    break label133;
                                 case 21:
                                    var114 = var41.n(var40, 21, m0.a, var114);
                                    var2 = 2097152;
                                    break;
                                 case 22:
                                    var29 = var41.n(var40, 22, m0.a, var29);
                                    var2 = 4194304;
                                    break;
                                 case 23:
                                    var28 = var41.n(var40, 23, a2.a, var28);
                                    var2 = 8388608;
                                    break;
                                 case 24:
                                    var27 = var41.n(var40, 24, a2.a, var27);
                                    var2 = 16777216;
                                    break;
                                 case 25:
                                    var23 = var41.n(var40, 25, m0.a, var23);
                                    var2 = 33554432;
                                    break;
                                 case 26:
                                    var26 = var41.n(var40, 26, a2.a, var26);
                                    var2 = 67108864;
                                    break;
                                 case 27:
                                    var32 = var41.y(var40, 27, new xk.f(a2.a), var32);
                                    var2 = var7 or 134217728;
                                    break label133;
                                 case 28:
                                    var25 = var41.y(var40, 28, CodedLinkExtendedType.Serializer.INSTANCE, var25);
                                    var2 = 268435456;
                                    break;
                                 case 29:
                                    var31 = var41.n(var40, 29, AnnotatedStructurableTextSerializer.INSTANCE, var31);
                                    var2 = var7 or 536870912;
                                    break label133;
                                 case 30:
                                    var30 = var41.m(var40, 30);
                                    var2 = var7 or 1073741824;
                                    break label133;
                                 case 31:
                                    var3 = var41.C(var40, 31);
                                    var2 = var7 or Integer.MIN_VALUE;
                                    break label133;
                                 default:
                                    throw new n(var2);
                              }

                              var2 = var7 or var2;
                              break label133;
                           }

                           var14 = var60;
                           var60 = var81;
                           var56 = var51;
                           var51 = var68;
                           var68 = var56;
                           var81 = var14;
                        }

                        var21 = var22;
                        var19 = var18;
                        var18 = var16;
                        var16 = var20;
                        var22 = var21;
                        var20 = var19;
                        var114 = var51;
                        var23 = var44;
                        var51 = var23;
                        var44 = var114;
                        break label134;
                     }

                     var14 = var60;
                     var60 = var81;
                     var56 = var51;
                     var51 = var23;
                     var44 = var114;
                     var23 = var44;
                     var114 = var68;
                     var68 = var56;
                     var81 = var14;
                     break label134;
                  }

                  var14 = var60;
                  var21 = var22;
                  var60 = var81;
                  var19 = var18;
                  var18 = var16;
                  var56 = var51;
                  var16 = var20;
                  var44 = var114;
                  var51 = var23;
                  var23 = var44;
                  var114 = var68;
                  var20 = var19;
                  var68 = var56;
                  var22 = var21;
                  var81 = var14;
               }

               var44 = var23;
               var51 = var56;
               var16 = var18;
               var18 = var19;
               var19 = var20;
               var56 = var68;
               var14 = var81;
               var114 = var44;
               var23 = var51;
               var7 = var2;
               var81 = var60;
               var22 = var21;
               var60 = var14;
               var21 = var22;
               var68 = var114;
               var20 = var16;
            }

            var17 = var51;
            var16 = var60;
            var38 = var14;
            var60 = var26;
            var25 = var66;
            var26 = var114;
            var2 = var5;
            var5 = var4;
            var56 = var32;
            var4 = var7;
            var51 = var31;
            var114 = var25;
            var31 = var23;
            var66 = var27;
            var23 = var28;
            var27 = var81;
            var14 = var20;
            var28 = var16;
            var37 = var68;
            var20 = var17;
            var36 = var21;
            var21 = var56;
            var32 = var18;
            var18 = var44;
         }

         var41.c(var40);
         return new EmbeddedActivityInviteEmbedImpl(
            var4,
            0,
            var6,
            var5,
            var2,
            var33 as java.lang.String,
            var32 as InviteType,
            var27 as Integer,
            var19 as Integer,
            var21 as Integer,
            var22 as java.lang.String,
            var16 as java.lang.String,
            var36 as Integer,
            var38 as java.lang.Boolean,
            var28 as java.lang.Boolean,
            var17 as Integer,
            var20 as Integer,
            var37 as java.lang.Boolean,
            var14 as Integer,
            var18 as java.lang.String,
            var25 as java.lang.String,
            var34 as java.lang.String,
            var35 as Integer,
            var26 as Integer,
            var29 as Integer,
            var23 as java.lang.String,
            var66 as java.lang.String,
            var31 as Integer,
            var60 as java.lang.String,
            var56 as java.util.List,
            var114 as CodedLinkExtendedType,
            var51 as AnnotatedStructurableText,
            (java.lang.String)var30,
            (boolean)var3,
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
