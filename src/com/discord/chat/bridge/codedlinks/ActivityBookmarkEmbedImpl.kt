package com.discord.chat.bridge.codedlinks

import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.h
import xk.m0
import xk.n1

@f
public data class ActivityBookmarkEmbedImpl(backgroundColor: Int,
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
      applicationId: ApplicationId,
      channelId: ChannelId,
      extendedType: CodedLinkExtendedType = ...,
      participantAvatarUris: List<String>,
      description: String? = ...,
      participantsText: String
   ) : ActivityBookmarkEmbedImpl(
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
         var30,
         var32,
         var33,
         var34,
         var35
      ),
   ActivityBookmarkEmbed {
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelText: String?
   public open val applicationId: ApplicationId
   public open val backgroundColor: Int
   public open val bodyText: String?
   public open val bodyTextColor: Int?
   public open val borderColor: Int
   public open val canBeAccepted: Boolean?
   public open val channelId: ChannelId
   public open val description: String?
   public open val embedCanBeTapped: Boolean?
   public open val extendedType: CodedLinkExtendedType
   public open val headerColor: Int
   public open val headerText: String?
   public open val inviteSplash: String?
   public open val participantAvatarUris: List<String>
   public open val participantsText: String
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
   public open val type: InviteType?

   fun ActivityBookmarkEmbedImpl(
      var1: Int,
      var2: Int,
      var3: Int,
      var4: Int,
      var5: Int,
      var6: java.lang.String,
      var7: InviteType,
      var8: Int,
      var9: Int,
      var10: Int,
      var11: java.lang.String,
      var12: java.lang.String,
      var13: Int,
      var14: java.lang.Boolean,
      var15: java.lang.Boolean,
      var16: Int,
      var17: Int,
      var18: java.lang.Boolean,
      var19: Int,
      var20: java.lang.String,
      var21: java.lang.String,
      var22: java.lang.String,
      var23: Int,
      var24: Int,
      var25: Int,
      var26: java.lang.String,
      var27: java.lang.String,
      var28: Int,
      var29: java.lang.String,
      var30: ApplicationId,
      var31: ChannelId,
      var32: CodedLinkExtendedType,
      var33: MutableList<java.lang.String>,
      var34: java.lang.String,
      var35: java.lang.String,
      var36: SerializationConstructorMarker
   ) {
      val var37: Boolean;
      if (1476395023 != (var1 and 1476395023)) {
         var37 = true;
      } else {
         var37 = false;
      }

      val var38: Boolean;
      if (1 != (var2 and 1)) {
         var38 = true;
      } else {
         var38 = false;
      }

      if (var37 or var38) {
         n1.a(new int[]{var1, var2}, new int[]{1476395023, 1}, ActivityBookmarkEmbedImpl.$serializer.INSTANCE.getDescriptor());
      }

      super(null);
      this.backgroundColor = var3;
      this.borderColor = var4;
      this.headerColor = var5;
      this.headerText = var6;
      if ((var1 and 16) == 0) {
         this.type = null;
      } else {
         this.type = var7;
      }

      if ((var1 and 32) == 0) {
         this.acceptLabelBackgroundColor = null;
      } else {
         this.acceptLabelBackgroundColor = var8;
      }

      if ((var1 and 64) == 0) {
         this.acceptLabelBorderColor = null;
      } else {
         this.acceptLabelBorderColor = var9;
      }

      if ((var1 and 128) == 0) {
         this.acceptLabelColor = null;
      } else {
         this.acceptLabelColor = var10;
      }

      if ((var1 and 256) == 0) {
         this.acceptLabelText = null;
      } else {
         this.acceptLabelText = var11;
      }

      if ((var1 and 512) == 0) {
         this.bodyText = null;
      } else {
         this.bodyText = var12;
      }

      if ((var1 and 1024) == 0) {
         this.bodyTextColor = null;
      } else {
         this.bodyTextColor = var13;
      }

      if ((var1 and 2048) == 0) {
         this.canBeAccepted = null;
      } else {
         this.canBeAccepted = var14;
      }

      if ((var1 and 4096) == 0) {
         this.embedCanBeTapped = null;
      } else {
         this.embedCanBeTapped = var15;
      }

      if ((var1 and 8192) == 0) {
         this.resolvingGradientEnd = null;
      } else {
         this.resolvingGradientEnd = var16;
      }

      if ((var1 and 16384) == 0) {
         this.resolvingGradientStart = null;
      } else {
         this.resolvingGradientStart = var17;
      }

      if (('耀' and var1) == 0) {
         this.splashHasRadialGradient = null;
      } else {
         this.splashHasRadialGradient = var18;
      }

      if ((65536 and var1) == 0) {
         this.splashOpacity = null;
      } else {
         this.splashOpacity = var19;
      }

      if ((131072 and var1) == 0) {
         this.splashUrl = null;
      } else {
         this.splashUrl = var20;
      }

      if ((262144 and var1) == 0) {
         this.inviteSplash = null;
      } else {
         this.inviteSplash = var21;
      }

      if ((524288 and var1) == 0) {
         this.subtitle = null;
      } else {
         this.subtitle = var22;
      }

      if ((1048576 and var1) == 0) {
         this.subtitleColor = null;
      } else {
         this.subtitleColor = var23;
      }

      if ((2097152 and var1) == 0) {
         this.thumbnailBackgroundColor = null;
      } else {
         this.thumbnailBackgroundColor = var24;
      }

      if ((4194304 and var1) == 0) {
         this.thumbnailCornerRadius = null;
      } else {
         this.thumbnailCornerRadius = var25;
      }

      if ((8388608 and var1) == 0) {
         this.thumbnailText = null;
      } else {
         this.thumbnailText = var26;
      }

      if ((16777216 and var1) == 0) {
         this.thumbnailUrl = null;
      } else {
         this.thumbnailUrl = var27;
      }

      if ((33554432 and var1) == 0) {
         this.titleColor = null;
      } else {
         this.titleColor = var28;
      }

      if ((67108864 and var1) == 0) {
         this.titleText = null;
      } else {
         this.titleText = var29;
      }

      this.applicationId = var30.unbox-impl();
      this.channelId = var31.unbox-impl();
      val var39: CodedLinkExtendedType;
      if ((536870912 and var1) == 0) {
         var39 = CodedLinkExtendedType.ACTIVITY_BOOKMARK;
      } else {
         var39 = var32;
      }

      this.extendedType = var39;
      this.participantAvatarUris = var33;
      if ((var1 and Integer.MIN_VALUE) == 0) {
         this.description = null;
      } else {
         this.description = var34;
      }

      this.participantsText = var35;
   }

   fun ActivityBookmarkEmbedImpl(
      var1: Int,
      var2: Int,
      var3: Int,
      var4: java.lang.String,
      var5: InviteType,
      var6: Int,
      var7: Int,
      var8: Int,
      var9: java.lang.String,
      var10: java.lang.String,
      var11: Int,
      var12: java.lang.Boolean,
      var13: java.lang.Boolean,
      var14: Int,
      var15: Int,
      var16: java.lang.Boolean,
      var17: Int,
      var18: java.lang.String,
      var19: java.lang.String,
      var20: java.lang.String,
      var21: Int,
      var22: Int,
      var23: Int,
      var24: java.lang.String,
      var25: java.lang.String,
      var26: Int,
      var27: java.lang.String,
      var28: Long,
      var30: Long,
      var32: CodedLinkExtendedType,
      var33: MutableList<java.lang.String>,
      var34: java.lang.String,
      var35: java.lang.String
   ) {
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
      this.applicationId = var28;
      this.channelId = var30;
      this.extendedType = var32;
      this.participantAvatarUris = var33;
      this.description = var34;
      this.participantsText = var35;
   }

   @JvmStatic
   public fun `write$Self`(self: ActivityBookmarkEmbedImpl, output: CompositeEncoder, serialDesc: SerialDescriptor) {
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

      var1.y(var2, 27, com.discord.primitives.ApplicationId..serializer.INSTANCE, ApplicationId.box-impl(var0.getApplicationId-VavddsQ()));
      var1.y(var2, 28, com.discord.primitives.ChannelId..serializer.INSTANCE, ChannelId.box-impl(var0.getChannelId-o4g7jtM()));
      if (!var1.A(var2, 29) && var0.getExtendedType() === CodedLinkExtendedType.ACTIVITY_BOOKMARK) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (var6) {
         var1.y(var2, 29, CodedLinkExtendedType.Serializer.INSTANCE, var0.getExtendedType());
      }

      label208: {
         var1.y(var2, 30, new xk.f(var5), var0.getParticipantAvatarUris());
         if (!var1.A(var2, 31)) {
            var6 = false;
            if (var0.getDescription() == null) {
               break label208;
            }
         }

         var6 = true;
      }

      if (var6) {
         var1.m(var2, 31, var5, var0.getDescription());
      }

      var1.z(var2, 32, var0.getParticipantsText());
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

   public operator fun component28(): ApplicationId {
      return this.getApplicationId-VavddsQ();
   }

   public operator fun component29(): ChannelId {
      return this.getChannelId-o4g7jtM();
   }

   public operator fun component3(): Int {
      return this.getHeaderColor();
   }

   public operator fun component30(): CodedLinkExtendedType {
      return this.getExtendedType();
   }

   public operator fun component31(): List<String> {
      return this.getParticipantAvatarUris();
   }

   public operator fun component32(): String? {
      return this.getDescription();
   }

   public operator fun component33(): String {
      return this.getParticipantsText();
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
      applicationId: ApplicationId = ...,
      channelId: ChannelId = ...,
      extendedType: CodedLinkExtendedType = ...,
      participantAvatarUris: List<String> = ...,
      description: String? = ...,
      participantsText: String = ...
   ): ActivityBookmarkEmbedImpl {
      r.h(var32, "extendedType");
      r.h(var33, "participantAvatarUris");
      r.h(var35, "participantsText");
      return new ActivityBookmarkEmbedImpl(
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
         var30,
         var32,
         var33,
         var34,
         var35,
         null
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActivityBookmarkEmbedImpl) {
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
         } else if (!ApplicationId.equals-impl0(this.getApplicationId-VavddsQ(), var1.getApplicationId-VavddsQ())) {
            return false;
         } else if (!ChannelId.equals-impl0(this.getChannelId-o4g7jtM(), var1.getChannelId-o4g7jtM())) {
            return false;
         } else if (this.getExtendedType() != var1.getExtendedType()) {
            return false;
         } else if (!r.c(this.getParticipantAvatarUris(), var1.getParticipantAvatarUris())) {
            return false;
         } else if (!r.c(this.getDescription(), var1.getDescription())) {
            return false;
         } else {
            return r.c(this.getParticipantsText(), var1.getParticipantsText());
         }
      }
   }

   public override fun hashCode(): Int {
      val var27: Int = Integer.hashCode(this.getBackgroundColor());
      val var26: Int = Integer.hashCode(this.getBorderColor());
      val var28: Int = Integer.hashCode(this.getHeaderColor());
      val var33: java.lang.String = this.getHeaderText();
      var var25: Int = 0;
      val var1: Int;
      if (var33 == null) {
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

      val var31: Int = ApplicationId.hashCode-impl(this.getApplicationId-VavddsQ());
      val var29: Int = ChannelId.hashCode-impl(this.getChannelId-o4g7jtM());
      val var32: Int = this.getExtendedType().hashCode();
      val var30: Int = this.getParticipantAvatarUris().hashCode();
      if (this.getDescription() != null) {
         var25 = this.getDescription().hashCode();
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
                                                                                                                                                                                                                                                                                             var27
                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                + var26
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
                                             + var29
                                       )
                                       * 31
                                    + var32
                              )
                              * 31
                           + var30
                     )
                     * 31
                  + var25
            )
            * 31
         + this.getParticipantsText().hashCode();
   }

   public override fun toString(): String {
      val var2: Int = this.getBackgroundColor();
      val var3: Int = this.getBorderColor();
      val var1: Int = this.getHeaderColor();
      val var9: java.lang.String = this.getHeaderText();
      val var31: InviteType = this.getType();
      val var7: Int = this.getAcceptLabelBackgroundColor();
      val var33: Int = this.getAcceptLabelBorderColor();
      val var20: Int = this.getAcceptLabelColor();
      val var21: java.lang.String = this.getAcceptLabelText();
      val var14: java.lang.String = this.getBodyText();
      val var17: Int = this.getBodyTextColor();
      val var30: java.lang.Boolean = this.getCanBeAccepted();
      val var18: java.lang.Boolean = this.getEmbedCanBeTapped();
      val var11: Int = this.getResolvingGradientEnd();
      val var8: Int = this.getResolvingGradientStart();
      val var19: java.lang.Boolean = this.getSplashHasRadialGradient();
      val var12: Int = this.getSplashOpacity();
      val var34: java.lang.String = this.getSplashUrl();
      val var4: java.lang.String = this.getInviteSplash();
      val var13: java.lang.String = this.getSubtitle();
      val var15: Int = this.getSubtitleColor();
      val var28: Int = this.getThumbnailBackgroundColor();
      val var22: Int = this.getThumbnailCornerRadius();
      val var29: java.lang.String = this.getThumbnailText();
      val var16: java.lang.String = this.getThumbnailUrl();
      val var26: Int = this.getTitleColor();
      val var24: java.lang.String = this.getTitleText();
      val var32: java.lang.String = ApplicationId.toString-impl(this.getApplicationId-VavddsQ());
      val var6: java.lang.String = ChannelId.toString-impl(this.getChannelId-o4g7jtM());
      val var23: CodedLinkExtendedType = this.getExtendedType();
      val var27: java.util.List = this.getParticipantAvatarUris();
      val var5: java.lang.String = this.getDescription();
      val var25: java.lang.String = this.getParticipantsText();
      val var10: StringBuilder = new StringBuilder();
      var10.append("ActivityBookmarkEmbedImpl(backgroundColor=");
      var10.append(var2);
      var10.append(", borderColor=");
      var10.append(var3);
      var10.append(", headerColor=");
      var10.append(var1);
      var10.append(", headerText=");
      var10.append(var9);
      var10.append(", type=");
      var10.append(var31);
      var10.append(", acceptLabelBackgroundColor=");
      var10.append(var7);
      var10.append(", acceptLabelBorderColor=");
      var10.append(var33);
      var10.append(", acceptLabelColor=");
      var10.append(var20);
      var10.append(", acceptLabelText=");
      var10.append(var21);
      var10.append(", bodyText=");
      var10.append(var14);
      var10.append(", bodyTextColor=");
      var10.append(var17);
      var10.append(", canBeAccepted=");
      var10.append(var30);
      var10.append(", embedCanBeTapped=");
      var10.append(var18);
      var10.append(", resolvingGradientEnd=");
      var10.append(var11);
      var10.append(", resolvingGradientStart=");
      var10.append(var8);
      var10.append(", splashHasRadialGradient=");
      var10.append(var19);
      var10.append(", splashOpacity=");
      var10.append(var12);
      var10.append(", splashUrl=");
      var10.append(var34);
      var10.append(", inviteSplash=");
      var10.append(var4);
      var10.append(", subtitle=");
      var10.append(var13);
      var10.append(", subtitleColor=");
      var10.append(var15);
      var10.append(", thumbnailBackgroundColor=");
      var10.append(var28);
      var10.append(", thumbnailCornerRadius=");
      var10.append(var22);
      var10.append(", thumbnailText=");
      var10.append(var29);
      var10.append(", thumbnailUrl=");
      var10.append(var16);
      var10.append(", titleColor=");
      var10.append(var26);
      var10.append(", titleText=");
      var10.append(var24);
      var10.append(", applicationId=");
      var10.append(var32);
      var10.append(", channelId=");
      var10.append(var6);
      var10.append(", extendedType=");
      var10.append(var23);
      var10.append(", participantAvatarUris=");
      var10.append(var27);
      var10.append(", description=");
      var10.append(var5);
      var10.append(", participantsText=");
      var10.append(var25);
      var10.append(")");
      return var10.toString();
   }

   public object `$serializer` : f0<ActivityBookmarkEmbedImpl> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ActivityBookmarkEmbedImpl.$serializer = new ActivityBookmarkEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.codedlinks.ActivityBookmarkEmbedImpl", var0, 33
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
         var1.l("applicationId", false);
         var1.l("channelId", false);
         var1.l("extendedType", true);
         var1.l("participantAvatarUris", false);
         var1.l("description", true);
         var1.l("participantsText", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var5: m0 = m0.a;
         val var7: a2 = a2.a;
         val var9: KSerializer = a.u(a2.a);
         val var1: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var6: KSerializer = a.u(var5);
         val var2: KSerializer = a.u(var5);
         val var3: KSerializer = a.u(var5);
         val var10: KSerializer = a.u(var7);
         val var4: KSerializer = a.u(var7);
         val var11: KSerializer = a.u(var5);
         val var8: h = h.a;
         return new KSerializer[]{
            var5,
            var5,
            var5,
            var9,
            var1,
            var6,
            var2,
            var3,
            var10,
            var4,
            var11,
            a.u(h.a),
            a.u(var8),
            a.u(var5),
            a.u(var5),
            a.u(var8),
            a.u(var5),
            a.u(var7),
            a.u(var7),
            a.u(var7),
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var7),
            a.u(var7),
            a.u(var5),
            a.u(var7),
            com.discord.primitives.ApplicationId..serializer.INSTANCE,
            com.discord.primitives.ChannelId..serializer.INSTANCE,
            CodedLinkExtendedType.Serializer.INSTANCE,
            new xk.f(var7),
            a.u(var7),
            var7
         };
      }

      public open fun deserialize(decoder: Decoder): ActivityBookmarkEmbedImpl {
         r.h(var1, "decoder");
         val var47: SerialDescriptor = this.getDescriptor();
         val var48: c = var1.b(var47);
         val var9: Boolean = var48.p();
         var var2: Int = 0;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var14: Any;
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
         val var39: Any;
         var var40: Any;
         var var41: Any;
         val var42: Any;
         val var43: Any;
         val var44: Any;
         val var45: Any;
         var var85: Any;
         var var89: Any;
         var var91: Any;
         var var97: Any;
         if (var9) {
            var3 = var48.i(var47, 0);
            var5 = var48.i(var47, 1);
            var2 = var48.i(var47, 2);
            var var10: a2 = a2.a;
            var85 = var48.n(var47, 3, a2.a, null);
            var35 = var48.n(var47, 4, InviteType.Serializer.INSTANCE, null);
            val var49: m0 = m0.a;
            var34 = var48.n(var47, 5, m0.a, null);
            var22 = var48.n(var47, 6, var49, null);
            var20 = var48.n(var47, 7, var49, null);
            var25 = var48.n(var47, 8, var10, null);
            var33 = var48.n(var47, 9, var10, null);
            var40 = var48.n(var47, 10, var49, null);
            var var11: h = h.a;
            var36 = var48.n(var47, 11, h.a, null);
            var43 = var48.n(var47, 12, var11, null);
            var31 = var48.n(var47, 13, var49, null);
            var41 = var48.n(var47, 14, var49, null);
            var45 = var48.n(var47, 15, var11, null);
            var14 = var48.n(var47, 16, var49, null);
            var27 = var48.n(var47, 17, var10, null);
            var21 = var48.n(var47, 18, var10, null);
            var26 = var48.n(var47, 19, var10, null);
            var91 = var48.n(var47, 20, var49, null);
            var89 = var48.n(var47, 21, var49, null);
            val var17: Any = var48.n(var47, 22, var49, null);
            var97 = var48.n(var47, 23, var10, null);
            var23 = var48.n(var47, 24, var10, null);
            val var13: Any = var48.n(var47, 25, var49, null);
            val var12: Any = var48.n(var47, 26, var10, null);
            var38 = var48.y(var47, 27, com.discord.primitives.ApplicationId..serializer.INSTANCE, null);
            var29 = var48.y(var47, 28, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var11 = (h)var48.y(var47, 29, CodedLinkExtendedType.Serializer.INSTANCE, null);
            val var51: Any = var48.y(var47, 30, new xk.f(var10), null);
            var10 = (a2)var48.n(var47, 31, var10, null);
            val var16: java.lang.String = var48.m(var47, 32);
            var6 = -1;
            var4 = 1;
            var37 = var85;
            var85 = var97;
            var28 = var13;
            var97 = var11;
            var44 = var16;
            var30 = var91;
            var42 = var89;
            var89 = var17;
            var91 = var12;
            var32 = var51;
            var39 = var10;
            var7 = var2;
         } else {
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var35 = null;
            var34 = null;
            var31 = null;
            var37 = null;
            var36 = null;
            var33 = null;
            var27 = null;
            var26 = null;
            var29 = null;
            var38 = null;
            var85 = null;
            var var75: Any = null;
            var var73: Any = null;
            var var77: Any = null;
            var14 = null;
            var var52: Any = null;
            var var61: Any = null;
            var var87: Any = null;
            var var88: Any = null;
            var23 = null;
            var21 = null;
            var32 = null;
            var30 = null;
            var28 = null;
            var20 = null;
            var25 = null;
            var97 = null;
            var22 = null;
            var91 = null;
            var89 = null;
            var var59: Boolean = true;
            var3 = 0;

            while (var59) {
               label100: {
                  label72: {
                     label71: {
                        val var8: Int = var48.o(var47);
                        switch (var8) {
                           case -1:
                              var59 = false;
                              break;
                           case 0:
                              var6 = var48.i(var47, 0);
                              var2 |= 1;
                              break;
                           case 1:
                              var5 = var48.i(var47, 1);
                              var2 |= 2;
                              break;
                           case 2:
                              var75 = var77;
                              var73 = var14;
                              var52 = var61;
                              var3 = var48.i(var47, 2);
                              var2 |= 4;
                              var61 = var52;
                              var77 = var73;
                              var14 = var75;
                              break label100;
                           case 3:
                              var37 = var48.n(var47, 3, a2.a, var37);
                              var2 |= 8;
                              break;
                           case 4:
                              var35 = var48.n(var47, 4, InviteType.Serializer.INSTANCE, var35);
                              var2 |= 16;
                              break;
                           case 5:
                              var34 = var48.n(var47, 5, m0.a, var34);
                              var2 |= 32;
                              break;
                           case 6:
                              var29 = var48.n(var47, 6, m0.a, var29);
                              var2 |= 64;
                              break;
                           case 7:
                              var26 = var48.n(var47, 7, m0.a, var26);
                              var2 |= 128;
                              break;
                           case 8:
                              var27 = var48.n(var47, 8, a2.a, var27);
                              var2 |= 256;
                              break;
                           case 9:
                              var31 = var48.n(var47, 9, a2.a, var31);
                              var2 |= 512;
                              break;
                           case 10:
                              var33 = var48.n(var47, 10, m0.a, var33);
                              var2 |= 1024;
                              break;
                           case 11:
                              var36 = var48.n(var47, 11, h.a, var36);
                              var2 |= 2048;
                              break;
                           case 12:
                              var85 = var48.n(var47, 12, h.a, var85);
                              var2 |= 4096;
                              break label71;
                           case 13:
                              var14 = var48.n(var47, 13, m0.a, var75);
                              var2 |= 8192;
                              var77 = var73;
                              var75 = var77;
                              var73 = var14;
                              var61 = var52;
                              var52 = var61;
                              break label100;
                           case 14:
                              var52 = var61;
                              var41 = var48.n(var47, 14, m0.a, var73);
                              var2 |= 16384;
                              var61 = var52;
                              var73 = var14;
                              var75 = var77;
                              var77 = var41;
                              var14 = var75;
                              break label100;
                           case 15:
                              var52 = var61;
                              var77 = var48.n(var47, 15, h.a, var77);
                              var2 |= 32768;
                              var61 = var52;
                              var73 = var14;
                              var75 = var77;
                              var77 = var73;
                              var14 = var75;
                              break label100;
                           case 16:
                              var40 = var48.n(var47, 16, m0.a, var14);
                              var2 |= 65536;
                              var14 = var75;
                              var75 = var77;
                              var52 = var61;
                              var61 = var52;
                              var73 = var40;
                              var77 = var73;
                              break label100;
                           case 17:
                              var41 = var48.n(var47, 17, a2.a, var52);
                              var2 |= 131072;
                              var75 = var77;
                              var73 = var14;
                              var52 = var61;
                              var61 = var41;
                              var77 = var73;
                              var14 = var75;
                              break label100;
                           case 18:
                              var61 = var48.n(var47, 18, a2.a, var61);
                              var2 |= 262144;
                              var75 = var77;
                              var73 = var14;
                              var52 = var61;
                              var61 = var52;
                              var77 = var73;
                              var14 = var75;
                              break label100;
                           case 19:
                              var87 = var48.n(var47, 19, a2.a, var87);
                              var2 |= 524288;
                              break label71;
                           case 20:
                              var88 = var48.n(var47, 20, m0.a, var88);
                              var2 |= 1048576;
                              break label72;
                           case 21:
                              var23 = var48.n(var47, 21, m0.a, var23);
                              var2 |= 2097152;
                              break label72;
                           case 22:
                              var21 = var48.n(var47, 22, m0.a, var21);
                              var2 |= 4194304;
                              break label72;
                           case 23:
                              var32 = var48.n(var47, 23, a2.a, var32);
                              var2 |= 8388608;
                              break label72;
                           case 24:
                              var30 = var48.n(var47, 24, a2.a, var30);
                              var2 |= 16777216;
                              break label72;
                           case 25:
                              var28 = var48.n(var47, 25, m0.a, var28);
                              var2 |= 33554432;
                              break label72;
                           case 26:
                              var20 = var48.n(var47, 26, a2.a, var20);
                              var2 |= 67108864;
                              break label72;
                           case 27:
                              var25 = var48.y(var47, 27, com.discord.primitives.ApplicationId..serializer.INSTANCE, var25);
                              var2 |= 134217728;
                              break label72;
                           case 28:
                              var97 = var48.y(var47, 28, com.discord.primitives.ChannelId..serializer.INSTANCE, var97);
                              var2 |= 268435456;
                              break label72;
                           case 29:
                              var22 = var48.y(var47, 29, CodedLinkExtendedType.Serializer.INSTANCE, var22);
                              var2 |= 536870912;
                              break label72;
                           case 30:
                              var91 = var48.y(var47, 30, new xk.f(a2.a), var91);
                              var2 |= 1073741824;
                              break label72;
                           case 31:
                              var89 = var48.n(var47, 31, a2.a, var89);
                              var2 |= Integer.MIN_VALUE;
                              break label72;
                           case 32:
                              var38 = var48.m(var47, 32);
                              var4 |= 1;
                              break label72;
                           default:
                              throw new n(var8);
                        }

                        var75 = var77;
                        var14 = var75;
                        var77 = var73;
                        var73 = var14;
                        var61 = var52;
                        var52 = var61;
                        break label100;
                     }

                     var75 = var77;
                     var73 = var14;
                     var52 = var61;
                     var61 = var52;
                     var77 = var73;
                     var14 = var75;
                     break label100;
                  }

                  var75 = var77;
                  var73 = var14;
                  var52 = var61;
                  var61 = var52;
                  var77 = var73;
                  var14 = var75;
               }

               var52 = var61;
               var73 = var77;
               var75 = var14;
               var77 = var75;
               var14 = var73;
               var61 = var52;
            }

            var7 = var3;
            var97 = var22;
            var3 = var6;
            var43 = var85;
            var22 = var29;
            var39 = var89;
            var32 = var91;
            var91 = var20;
            var89 = var21;
            var42 = var23;
            var30 = var88;
            var44 = var38;
            var29 = var97;
            var38 = var25;
            var23 = var30;
            var85 = var32;
            var31 = var75;
            var41 = var73;
            var40 = var33;
            var33 = var31;
            var25 = var27;
            var20 = var26;
            var6 = var2;
            var26 = var87;
            var21 = var61;
            var27 = var52;
            var45 = var77;
         }

         var48.c(var47);
         return new ActivityBookmarkEmbedImpl(
            var6,
            var4,
            var3,
            var5,
            var7,
            var37 as java.lang.String,
            var35 as InviteType,
            var34 as Integer,
            var22 as Integer,
            var20 as Integer,
            var25 as java.lang.String,
            var33 as java.lang.String,
            var40 as Integer,
            var36 as java.lang.Boolean,
            var43 as java.lang.Boolean,
            var31 as Integer,
            var41 as Integer,
            var45 as java.lang.Boolean,
            var14 as Integer,
            var27 as java.lang.String,
            var21 as java.lang.String,
            var26 as java.lang.String,
            var30 as Integer,
            var42 as Integer,
            var89 as Integer,
            var85 as java.lang.String,
            var23 as java.lang.String,
            var28 as Integer,
            var91 as java.lang.String,
            var38 as ApplicationId,
            var29 as ChannelId,
            var97 as CodedLinkExtendedType,
            var32 as java.util.List,
            var39 as java.lang.String,
            (java.lang.String)var44,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ActivityBookmarkEmbedImpl) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ActivityBookmarkEmbedImpl.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityBookmarkEmbedImpl> {
         return ActivityBookmarkEmbedImpl.$serializer.INSTANCE;
      }
   }
}
