package com.discord.chat.bridge.codedlinks

import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
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
      val var28: Int = Integer.hashCode(this.getBorderColor());
      val var26: Int = Integer.hashCode(this.getHeaderColor());
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

      val var32: Int = ApplicationId.hashCode-impl(this.getApplicationId-VavddsQ());
      val var29: Int = ChannelId.hashCode-impl(this.getChannelId-o4g7jtM());
      val var30: Int = this.getExtendedType().hashCode();
      val var31: Int = this.getParticipantAvatarUris().hashCode();
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
                                                                                                                                                                                                                                                                                                + var28
                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var26
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
                                             + var29
                                       )
                                       * 31
                                    + var30
                              )
                              * 31
                           + var31
                     )
                     * 31
                  + var25
            )
            * 31
         + this.getParticipantsText().hashCode();
   }

   public override fun toString(): String {
      val var3: Int = this.getBackgroundColor();
      val var2: Int = this.getBorderColor();
      val var1: Int = this.getHeaderColor();
      val var33: java.lang.String = this.getHeaderText();
      val var12: InviteType = this.getType();
      val var18: Int = this.getAcceptLabelBackgroundColor();
      val var15: Int = this.getAcceptLabelBorderColor();
      val var34: Int = this.getAcceptLabelColor();
      val var23: java.lang.String = this.getAcceptLabelText();
      val var27: java.lang.String = this.getBodyText();
      val var26: Int = this.getBodyTextColor();
      val var14: java.lang.Boolean = this.getCanBeAccepted();
      val var30: java.lang.Boolean = this.getEmbedCanBeTapped();
      val var16: Int = this.getResolvingGradientEnd();
      val var9: Int = this.getResolvingGradientStart();
      val var28: java.lang.Boolean = this.getSplashHasRadialGradient();
      val var19: Int = this.getSplashOpacity();
      val var5: java.lang.String = this.getSplashUrl();
      val var10: java.lang.String = this.getInviteSplash();
      val var17: java.lang.String = this.getSubtitle();
      val var11: Int = this.getSubtitleColor();
      val var20: Int = this.getThumbnailBackgroundColor();
      val var7: Int = this.getThumbnailCornerRadius();
      val var6: java.lang.String = this.getThumbnailText();
      val var22: java.lang.String = this.getThumbnailUrl();
      val var8: Int = this.getTitleColor();
      val var24: java.lang.String = this.getTitleText();
      val var25: java.lang.String = ApplicationId.toString-impl(this.getApplicationId-VavddsQ());
      val var13: java.lang.String = ChannelId.toString-impl(this.getChannelId-o4g7jtM());
      val var4: CodedLinkExtendedType = this.getExtendedType();
      val var31: java.util.List = this.getParticipantAvatarUris();
      val var21: java.lang.String = this.getDescription();
      val var32: java.lang.String = this.getParticipantsText();
      val var29: StringBuilder = new StringBuilder();
      var29.append("ActivityBookmarkEmbedImpl(backgroundColor=");
      var29.append(var3);
      var29.append(", borderColor=");
      var29.append(var2);
      var29.append(", headerColor=");
      var29.append(var1);
      var29.append(", headerText=");
      var29.append(var33);
      var29.append(", type=");
      var29.append(var12);
      var29.append(", acceptLabelBackgroundColor=");
      var29.append(var18);
      var29.append(", acceptLabelBorderColor=");
      var29.append(var15);
      var29.append(", acceptLabelColor=");
      var29.append(var34);
      var29.append(", acceptLabelText=");
      var29.append(var23);
      var29.append(", bodyText=");
      var29.append(var27);
      var29.append(", bodyTextColor=");
      var29.append(var26);
      var29.append(", canBeAccepted=");
      var29.append(var14);
      var29.append(", embedCanBeTapped=");
      var29.append(var30);
      var29.append(", resolvingGradientEnd=");
      var29.append(var16);
      var29.append(", resolvingGradientStart=");
      var29.append(var9);
      var29.append(", splashHasRadialGradient=");
      var29.append(var28);
      var29.append(", splashOpacity=");
      var29.append(var19);
      var29.append(", splashUrl=");
      var29.append(var5);
      var29.append(", inviteSplash=");
      var29.append(var10);
      var29.append(", subtitle=");
      var29.append(var17);
      var29.append(", subtitleColor=");
      var29.append(var11);
      var29.append(", thumbnailBackgroundColor=");
      var29.append(var20);
      var29.append(", thumbnailCornerRadius=");
      var29.append(var7);
      var29.append(", thumbnailText=");
      var29.append(var6);
      var29.append(", thumbnailUrl=");
      var29.append(var22);
      var29.append(", titleColor=");
      var29.append(var8);
      var29.append(", titleText=");
      var29.append(var24);
      var29.append(", applicationId=");
      var29.append(var25);
      var29.append(", channelId=");
      var29.append(var13);
      var29.append(", extendedType=");
      var29.append(var4);
      var29.append(", participantAvatarUris=");
      var29.append(var31);
      var29.append(", description=");
      var29.append(var21);
      var29.append(", participantsText=");
      var29.append(var32);
      var29.append(")");
      return var29.toString();
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
         val var10: KSerializer = a.u(a2.a);
         val var1: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var9: KSerializer = a.u(var5);
         val var3: KSerializer = a.u(var5);
         val var4: KSerializer = a.u(var5);
         val var6: KSerializer = a.u(var7);
         val var8: KSerializer = a.u(var7);
         val var2: KSerializer = a.u(var5);
         val var11: h = h.a;
         return new KSerializer[]{
            var5,
            var5,
            var5,
            var10,
            var1,
            var9,
            var3,
            var4,
            var6,
            var8,
            var2,
            a.u(h.a),
            a.u(var11),
            a.u(var5),
            a.u(var5),
            a.u(var11),
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
         val var48: SerialDescriptor = this.getDescriptor();
         val var49: c = var1.b(var48);
         val var9: Boolean = var49.p();
         var var2: Int = 0;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
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
         var var40: Any;
         var var41: Any;
         val var42: Any;
         val var43: Any;
         var var61: Any;
         var var85: Any;
         var var87: Any;
         if (var9) {
            var6 = var49.i(var48, 0);
            var4 = var49.i(var48, 1);
            var2 = var49.i(var48, 2);
            var61 = a2.a;
            val var13: Any = var49.n(var48, 3, a2.a, null);
            var35 = var49.n(var48, 4, InviteType.Serializer.INSTANCE, null);
            val var50: m0 = m0.a;
            var34 = var49.n(var48, 5, m0.a, null);
            var33 = var49.n(var48, 6, var50, null);
            var24 = var49.n(var48, 7, var50, null);
            var38 = var49.n(var48, 8, (DeserializationStrategy)var61, null);
            var23 = var49.n(var48, 9, (DeserializationStrategy)var61, null);
            var20 = var49.n(var48, 10, var50, null);
            var var11: h = h.a;
            var36 = var49.n(var48, 11, h.a, null);
            var31 = var49.n(var48, 12, var11, null);
            var30 = var49.n(var48, 13, var50, null);
            var27 = var49.n(var48, 14, var50, null);
            var39 = var49.n(var48, 15, var11, null);
            var87 = var49.n(var48, 16, var50, null);
            var43 = var49.n(var48, 17, (DeserializationStrategy)var61, null);
            var22 = var49.n(var48, 18, (DeserializationStrategy)var61, null);
            var21 = var49.n(var48, 19, (DeserializationStrategy)var61, null);
            var17 = var49.n(var48, 20, var50, null);
            var19 = var49.n(var48, 21, var50, null);
            var18 = var49.n(var48, 22, var50, null);
            var32 = var49.n(var48, 23, (DeserializationStrategy)var61, null);
            var25 = var49.n(var48, 24, (DeserializationStrategy)var61, null);
            var85 = var49.n(var48, 25, var50, null);
            val var12: Any = var49.n(var48, 26, (DeserializationStrategy)var61, null);
            var29 = var49.y(var48, 27, com.discord.primitives.ApplicationId..serializer.INSTANCE, null);
            var41 = var49.y(var48, 28, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var11 = (h)var49.y(var48, 29, CodedLinkExtendedType.Serializer.INSTANCE, null);
            val var52: Any = var49.y(var48, 30, new xk.f((KSerializer)var61), null);
            var61 = var49.n(var48, 31, (DeserializationStrategy)var61, null);
            val var16: java.lang.String = var49.m(var48, 32);
            var5 = -1;
            var7 = 1;
            var37 = var13;
            var26 = var85;
            var85 = var87;
            var87 = var11;
            var28 = var16;
            var42 = var12;
            var40 = var52;
            var3 = var2;
         } else {
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var35 = null;
            var34 = null;
            var32 = null;
            var37 = null;
            var36 = null;
            var31 = null;
            var28 = null;
            var26 = null;
            var29 = null;
            var38 = null;
            var87 = null;
            var var76: Any = null;
            var var74: Any = null;
            var var78: Any = null;
            var85 = null;
            var var53: Any = null;
            var61 = null;
            var var89: Any = null;
            var17 = null;
            var23 = null;
            var21 = null;
            var33 = null;
            var30 = null;
            var27 = null;
            var20 = null;
            var25 = null;
            var24 = null;
            var22 = null;
            var19 = null;
            var18 = null;
            var var60: Boolean = true;
            var3 = 0;

            while (var60) {
               label100: {
                  label72: {
                     label71: {
                        val var8: Int = var49.o(var48);
                        switch (var8) {
                           case -1:
                              var60 = false;
                              break;
                           case 0:
                              var6 = var49.i(var48, 0);
                              var2 |= 1;
                              break;
                           case 1:
                              var5 = var49.i(var48, 1);
                              var2 |= 2;
                              break;
                           case 2:
                              var76 = var78;
                              var74 = var85;
                              var53 = var61;
                              var3 = var49.i(var48, 2);
                              var2 |= 4;
                              var61 = var53;
                              var78 = var74;
                              var85 = var76;
                              break label100;
                           case 3:
                              var37 = var49.n(var48, 3, a2.a, var37);
                              var2 |= 8;
                              break;
                           case 4:
                              var35 = var49.n(var48, 4, InviteType.Serializer.INSTANCE, var35);
                              var2 |= 16;
                              break;
                           case 5:
                              var34 = var49.n(var48, 5, m0.a, var34);
                              var2 |= 32;
                              break;
                           case 6:
                              var29 = var49.n(var48, 6, m0.a, var29);
                              var2 |= 64;
                              break;
                           case 7:
                              var26 = var49.n(var48, 7, m0.a, var26);
                              var2 |= 128;
                              break;
                           case 8:
                              var28 = var49.n(var48, 8, a2.a, var28);
                              var2 |= 256;
                              break;
                           case 9:
                              var32 = var49.n(var48, 9, a2.a, var32);
                              var2 |= 512;
                              break;
                           case 10:
                              var31 = var49.n(var48, 10, m0.a, var31);
                              var2 |= 1024;
                              break;
                           case 11:
                              var36 = var49.n(var48, 11, h.a, var36);
                              var2 |= 2048;
                              break;
                           case 12:
                              var87 = var49.n(var48, 12, h.a, var87);
                              var2 |= 4096;
                              break label71;
                           case 13:
                              var85 = var49.n(var48, 13, m0.a, var76);
                              var2 |= 8192;
                              var78 = var74;
                              var76 = var78;
                              var74 = var85;
                              var61 = var53;
                              var53 = var61;
                              break label100;
                           case 14:
                              var53 = var61;
                              var40 = var49.n(var48, 14, m0.a, var74);
                              var2 |= 16384;
                              var61 = var53;
                              var74 = var85;
                              var76 = var78;
                              var78 = var40;
                              var85 = var76;
                              break label100;
                           case 15:
                              var53 = var61;
                              var78 = var49.n(var48, 15, h.a, var78);
                              var2 |= 32768;
                              var61 = var53;
                              var74 = var85;
                              var76 = var78;
                              var78 = var74;
                              var85 = var76;
                              break label100;
                           case 16:
                              var61 = var53;
                              var41 = var49.n(var48, 16, m0.a, var85);
                              var2 |= 65536;
                              var85 = var76;
                              var76 = var78;
                              var53 = var61;
                              var74 = var41;
                              var78 = var74;
                              break label100;
                           case 17:
                              var41 = var49.n(var48, 17, a2.a, var53);
                              var2 |= 131072;
                              var76 = var78;
                              var74 = var85;
                              var53 = var61;
                              var61 = var41;
                              var78 = var74;
                              var85 = var76;
                              break label100;
                           case 18:
                              var61 = var49.n(var48, 18, a2.a, var61);
                              var2 |= 262144;
                              var76 = var78;
                              var74 = var85;
                              var53 = var61;
                              var61 = var53;
                              var78 = var74;
                              var85 = var76;
                              break label100;
                           case 19:
                              var89 = var49.n(var48, 19, a2.a, var89);
                              var2 |= 524288;
                              break label71;
                           case 20:
                              var17 = var49.n(var48, 20, m0.a, var17);
                              var2 |= 1048576;
                              break label72;
                           case 21:
                              var23 = var49.n(var48, 21, m0.a, var23);
                              var2 |= 2097152;
                              break label72;
                           case 22:
                              var21 = var49.n(var48, 22, m0.a, var21);
                              var2 |= 4194304;
                              break label72;
                           case 23:
                              var33 = var49.n(var48, 23, a2.a, var33);
                              var2 |= 8388608;
                              break label72;
                           case 24:
                              var30 = var49.n(var48, 24, a2.a, var30);
                              var2 |= 16777216;
                              break label72;
                           case 25:
                              var27 = var49.n(var48, 25, m0.a, var27);
                              var2 |= 33554432;
                              break label72;
                           case 26:
                              var20 = var49.n(var48, 26, a2.a, var20);
                              var2 |= 67108864;
                              break label72;
                           case 27:
                              var25 = var49.y(var48, 27, com.discord.primitives.ApplicationId..serializer.INSTANCE, var25);
                              var2 |= 134217728;
                              break label72;
                           case 28:
                              var24 = var49.y(var48, 28, com.discord.primitives.ChannelId..serializer.INSTANCE, var24);
                              var2 |= 268435456;
                              break label72;
                           case 29:
                              var22 = var49.y(var48, 29, CodedLinkExtendedType.Serializer.INSTANCE, var22);
                              var2 |= 536870912;
                              break label72;
                           case 30:
                              var19 = var49.y(var48, 30, new xk.f(a2.a), var19);
                              var2 |= 1073741824;
                              break label72;
                           case 31:
                              var18 = var49.n(var48, 31, a2.a, var18);
                              var2 |= Integer.MIN_VALUE;
                              break label72;
                           case 32:
                              var38 = var49.m(var48, 32);
                              var4 |= 1;
                              break label72;
                           default:
                              throw new n(var8);
                        }

                        var76 = var78;
                        var74 = var85;
                        var53 = var61;
                        var85 = var76;
                        var78 = var74;
                        var61 = var53;
                        break label100;
                     }

                     var76 = var78;
                     var74 = var85;
                     var53 = var61;
                     var61 = var53;
                     var78 = var74;
                     var85 = var76;
                     break label100;
                  }

                  var76 = var78;
                  var74 = var85;
                  var53 = var61;
                  var61 = var53;
                  var78 = var74;
                  var85 = var76;
               }

               var53 = var61;
               var74 = var78;
               var76 = var85;
               var78 = var76;
               var85 = var74;
               var61 = var53;
            }

            var33 = var29;
            var22 = var61;
            var7 = var4;
            var61 = var18;
            var40 = var19;
            var42 = var20;
            var18 = var21;
            var19 = var23;
            var28 = var38;
            var4 = var5;
            var87 = var22;
            var41 = var24;
            var29 = var25;
            var26 = var27;
            var25 = var30;
            var32 = var33;
            var31 = var87;
            var30 = var76;
            var27 = var74;
            var20 = var31;
            var23 = var32;
            var38 = var28;
            var24 = var26;
            var5 = var2;
            var21 = var89;
            var43 = var53;
            var39 = var78;
         }

         var49.c(var48);
         return new ActivityBookmarkEmbedImpl(
            var5,
            var7,
            var6,
            var4,
            var3,
            var37 as java.lang.String,
            var35 as InviteType,
            var34 as Integer,
            var33 as Integer,
            var24 as Integer,
            var38 as java.lang.String,
            var23 as java.lang.String,
            var20 as Integer,
            var36 as java.lang.Boolean,
            var31 as java.lang.Boolean,
            var30 as Integer,
            var27 as Integer,
            var39 as java.lang.Boolean,
            var85 as Integer,
            var43 as java.lang.String,
            var22 as java.lang.String,
            var21 as java.lang.String,
            var17 as Integer,
            var19 as Integer,
            var18 as Integer,
            var32 as java.lang.String,
            var25 as java.lang.String,
            var26 as Integer,
            var42 as java.lang.String,
            var29 as ApplicationId,
            var41 as ChannelId,
            var87 as CodedLinkExtendedType,
            var40 as java.util.List,
            var61 as java.lang.String,
            (java.lang.String)var28,
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
