package com.discord.chat.bridge.codedlinks

import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import ha.f
import ha.n
import ia.a
import ka.C0
import ka.G
import ka.N
import ka.h
import ka.p0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

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
      participantsText: String,
      referrerId: String,
      customId: String? = ...
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
         var35,
         var36,
         var37
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
   public open val customId: String?
   public open val description: String?
   public open val embedCanBeTapped: Boolean?
   public open val extendedType: CodedLinkExtendedType
   public open val headerColor: Int
   public open val headerText: String?
   public open val inviteSplash: String?
   public open val participantAvatarUris: List<String>
   public open val participantsText: String
   public open val referrerId: String
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
      var36: java.lang.String,
      var37: java.lang.String,
      var38: SerializationConstructorMarker
   ) {
      var var40: Boolean = false;
      val var39: Boolean;
      if (1476395023 != (var1 and 1476395023)) {
         var39 = true;
      } else {
         var39 = false;
      }

      if (3 != (var2 and 3)) {
         var40 = true;
      }

      if (var39 or var40) {
         p0.a(new int[]{var1, var2}, new int[]{1476395023, 3}, ActivityBookmarkEmbedImpl.$serializer.INSTANCE.getDescriptor());
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
      val var41: CodedLinkExtendedType;
      if ((536870912 and var1) == 0) {
         var41 = CodedLinkExtendedType.ACTIVITY_BOOKMARK;
      } else {
         var41 = var32;
      }

      this.extendedType = var41;
      this.participantAvatarUris = var33;
      if ((var1 and Integer.MIN_VALUE) == 0) {
         this.description = null;
      } else {
         this.description = var34;
      }

      this.participantsText = var35;
      this.referrerId = var36;
      if ((var2 and 4) == 0) {
         this.customId = null;
      } else {
         this.customId = var37;
      }
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
      var35: java.lang.String,
      var36: java.lang.String,
      var37: java.lang.String
   ) {
      q.h(var32, "extendedType");
      q.h(var33, "participantAvatarUris");
      q.h(var35, "participantsText");
      q.h(var36, "referrerId");
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
      this.referrerId = var36;
      this.customId = var37;
   }

   public operator fun component1(): Int {
      return this.backgroundColor;
   }

   public operator fun component10(): String? {
      return this.bodyText;
   }

   public operator fun component11(): Int? {
      return this.bodyTextColor;
   }

   public operator fun component12(): Boolean? {
      return this.canBeAccepted;
   }

   public operator fun component13(): Boolean? {
      return this.embedCanBeTapped;
   }

   public operator fun component14(): Int? {
      return this.resolvingGradientEnd;
   }

   public operator fun component15(): Int? {
      return this.resolvingGradientStart;
   }

   public operator fun component16(): Boolean? {
      return this.splashHasRadialGradient;
   }

   public operator fun component17(): Int? {
      return this.splashOpacity;
   }

   public operator fun component18(): String? {
      return this.splashUrl;
   }

   public operator fun component19(): String? {
      return this.inviteSplash;
   }

   public operator fun component2(): Int {
      return this.borderColor;
   }

   public operator fun component20(): String? {
      return this.subtitle;
   }

   public operator fun component21(): Int? {
      return this.subtitleColor;
   }

   public operator fun component22(): Int? {
      return this.thumbnailBackgroundColor;
   }

   public operator fun component23(): Int? {
      return this.thumbnailCornerRadius;
   }

   public operator fun component24(): String? {
      return this.thumbnailText;
   }

   public operator fun component25(): String? {
      return this.thumbnailUrl;
   }

   public operator fun component26(): Int? {
      return this.titleColor;
   }

   public operator fun component27(): String? {
      return this.titleText;
   }

   public operator fun component28(): ApplicationId {
      return this.applicationId;
   }

   public operator fun component29(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): Int {
      return this.headerColor;
   }

   public operator fun component30(): CodedLinkExtendedType {
      return this.extendedType;
   }

   public operator fun component31(): List<String> {
      return this.participantAvatarUris;
   }

   public operator fun component32(): String? {
      return this.description;
   }

   public operator fun component33(): String {
      return this.participantsText;
   }

   public operator fun component34(): String {
      return this.referrerId;
   }

   public operator fun component35(): String? {
      return this.customId;
   }

   public operator fun component4(): String? {
      return this.headerText;
   }

   public operator fun component5(): InviteType? {
      return this.type;
   }

   public operator fun component6(): Int? {
      return this.acceptLabelBackgroundColor;
   }

   public operator fun component7(): Int? {
      return this.acceptLabelBorderColor;
   }

   public operator fun component8(): Int? {
      return this.acceptLabelColor;
   }

   public operator fun component9(): String? {
      return this.acceptLabelText;
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
      participantsText: String = ...,
      referrerId: String = ...,
      customId: String? = ...
   ): ActivityBookmarkEmbedImpl {
      q.h(var32, "extendedType");
      q.h(var33, "participantAvatarUris");
      q.h(var35, "participantsText");
      q.h(var36, "referrerId");
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
         var36,
         var37,
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
         if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (this.borderColor != var1.borderColor) {
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
         } else if (!q.c(this.acceptLabelText, var1.acceptLabelText)) {
            return false;
         } else if (!q.c(this.bodyText, var1.bodyText)) {
            return false;
         } else if (!q.c(this.bodyTextColor, var1.bodyTextColor)) {
            return false;
         } else if (!q.c(this.canBeAccepted, var1.canBeAccepted)) {
            return false;
         } else if (!q.c(this.embedCanBeTapped, var1.embedCanBeTapped)) {
            return false;
         } else if (!q.c(this.resolvingGradientEnd, var1.resolvingGradientEnd)) {
            return false;
         } else if (!q.c(this.resolvingGradientStart, var1.resolvingGradientStart)) {
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
         } else if (!ApplicationId.equals-impl0(this.applicationId, var1.applicationId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (this.extendedType != var1.extendedType) {
            return false;
         } else if (!q.c(this.participantAvatarUris, var1.participantAvatarUris)) {
            return false;
         } else if (!q.c(this.description, var1.description)) {
            return false;
         } else if (!q.c(this.participantsText, var1.participantsText)) {
            return false;
         } else if (!q.c(this.referrerId, var1.referrerId)) {
            return false;
         } else {
            return q.c(this.customId, var1.customId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var28: Int = Integer.hashCode(this.backgroundColor);
      val var27: Int = Integer.hashCode(this.borderColor);
      val var29: Int = Integer.hashCode(this.headerColor);
      var var26: Int = 0;
      val var1: Int;
      if (this.headerText == null) {
         var1 = 0;
      } else {
         var1 = this.headerText.hashCode();
      }

      val var2: Int;
      if (this.type == null) {
         var2 = 0;
      } else {
         var2 = this.type.hashCode();
      }

      val var3: Int;
      if (this.acceptLabelBackgroundColor == null) {
         var3 = 0;
      } else {
         var3 = this.acceptLabelBackgroundColor.hashCode();
      }

      val var4: Int;
      if (this.acceptLabelBorderColor == null) {
         var4 = 0;
      } else {
         var4 = this.acceptLabelBorderColor.hashCode();
      }

      val var5: Int;
      if (this.acceptLabelColor == null) {
         var5 = 0;
      } else {
         var5 = this.acceptLabelColor.hashCode();
      }

      val var6: Int;
      if (this.acceptLabelText == null) {
         var6 = 0;
      } else {
         var6 = this.acceptLabelText.hashCode();
      }

      val var7: Int;
      if (this.bodyText == null) {
         var7 = 0;
      } else {
         var7 = this.bodyText.hashCode();
      }

      val var8: Int;
      if (this.bodyTextColor == null) {
         var8 = 0;
      } else {
         var8 = this.bodyTextColor.hashCode();
      }

      val var9: Int;
      if (this.canBeAccepted == null) {
         var9 = 0;
      } else {
         var9 = this.canBeAccepted.hashCode();
      }

      val var10: Int;
      if (this.embedCanBeTapped == null) {
         var10 = 0;
      } else {
         var10 = this.embedCanBeTapped.hashCode();
      }

      val var11: Int;
      if (this.resolvingGradientEnd == null) {
         var11 = 0;
      } else {
         var11 = this.resolvingGradientEnd.hashCode();
      }

      val var12: Int;
      if (this.resolvingGradientStart == null) {
         var12 = 0;
      } else {
         var12 = this.resolvingGradientStart.hashCode();
      }

      val var13: Int;
      if (this.splashHasRadialGradient == null) {
         var13 = 0;
      } else {
         var13 = this.splashHasRadialGradient.hashCode();
      }

      val var14: Int;
      if (this.splashOpacity == null) {
         var14 = 0;
      } else {
         var14 = this.splashOpacity.hashCode();
      }

      val var15: Int;
      if (this.splashUrl == null) {
         var15 = 0;
      } else {
         var15 = this.splashUrl.hashCode();
      }

      val var16: Int;
      if (this.inviteSplash == null) {
         var16 = 0;
      } else {
         var16 = this.inviteSplash.hashCode();
      }

      val var17: Int;
      if (this.subtitle == null) {
         var17 = 0;
      } else {
         var17 = this.subtitle.hashCode();
      }

      val var18: Int;
      if (this.subtitleColor == null) {
         var18 = 0;
      } else {
         var18 = this.subtitleColor.hashCode();
      }

      val var19: Int;
      if (this.thumbnailBackgroundColor == null) {
         var19 = 0;
      } else {
         var19 = this.thumbnailBackgroundColor.hashCode();
      }

      val var20: Int;
      if (this.thumbnailCornerRadius == null) {
         var20 = 0;
      } else {
         var20 = this.thumbnailCornerRadius.hashCode();
      }

      val var21: Int;
      if (this.thumbnailText == null) {
         var21 = 0;
      } else {
         var21 = this.thumbnailText.hashCode();
      }

      val var22: Int;
      if (this.thumbnailUrl == null) {
         var22 = 0;
      } else {
         var22 = this.thumbnailUrl.hashCode();
      }

      val var23: Int;
      if (this.titleColor == null) {
         var23 = 0;
      } else {
         var23 = this.titleColor.hashCode();
      }

      val var24: Int;
      if (this.titleText == null) {
         var24 = 0;
      } else {
         var24 = this.titleText.hashCode();
      }

      val var33: Int = ApplicationId.hashCode-impl(this.applicationId);
      val var31: Int = ChannelId.hashCode-impl(this.channelId);
      val var32: Int = this.extendedType.hashCode();
      val var30: Int = this.participantAvatarUris.hashCode();
      val var25: Int;
      if (this.description == null) {
         var25 = 0;
      } else {
         var25 = this.description.hashCode();
      }

      val var35: Int = this.participantsText.hashCode();
      val var34: Int = this.referrerId.hashCode();
      if (this.customId != null) {
         var26 = this.customId.hashCode();
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
                                                                                                                                                                                                                                                                                                               var28
                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                  + var27
                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                         + var29
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
                                                                        + var33
                                                                  )
                                                                  * 31
                                                               + var31
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
                           + var35
                     )
                     * 31
                  + var34
            )
            * 31
         + var26;
   }

   public override fun toString(): String {
      val var3: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var1: Int = this.headerColor;
      val var14: java.lang.String = this.headerText;
      val var33: InviteType = this.type;
      val var15: Int = this.acceptLabelBackgroundColor;
      val var27: Int = this.acceptLabelBorderColor;
      val var17: Int = this.acceptLabelColor;
      val var13: java.lang.String = this.acceptLabelText;
      val var26: java.lang.String = this.bodyText;
      val var4: Int = this.bodyTextColor;
      val var18: java.lang.Boolean = this.canBeAccepted;
      val var6: java.lang.Boolean = this.embedCanBeTapped;
      val var24: Int = this.resolvingGradientEnd;
      val var20: Int = this.resolvingGradientStart;
      val var21: java.lang.Boolean = this.splashHasRadialGradient;
      val var35: Int = this.splashOpacity;
      val var5: java.lang.String = this.splashUrl;
      val var19: java.lang.String = this.inviteSplash;
      val var16: java.lang.String = this.subtitle;
      val var7: Int = this.subtitleColor;
      val var36: Int = this.thumbnailBackgroundColor;
      val var12: Int = this.thumbnailCornerRadius;
      val var30: java.lang.String = this.thumbnailText;
      val var31: java.lang.String = this.thumbnailUrl;
      val var32: Int = this.titleColor;
      val var29: java.lang.String = this.titleText;
      val var9: java.lang.String = ApplicationId.toString-impl(this.applicationId);
      val var8: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var28: CodedLinkExtendedType = this.extendedType;
      val var10: java.util.List = this.participantAvatarUris;
      val var34: java.lang.String = this.description;
      val var11: java.lang.String = this.participantsText;
      val var22: java.lang.String = this.referrerId;
      val var25: java.lang.String = this.customId;
      val var23: StringBuilder = new StringBuilder();
      var23.append("ActivityBookmarkEmbedImpl(backgroundColor=");
      var23.append(var3);
      var23.append(", borderColor=");
      var23.append(var2);
      var23.append(", headerColor=");
      var23.append(var1);
      var23.append(", headerText=");
      var23.append(var14);
      var23.append(", type=");
      var23.append(var33);
      var23.append(", acceptLabelBackgroundColor=");
      var23.append(var15);
      var23.append(", acceptLabelBorderColor=");
      var23.append(var27);
      var23.append(", acceptLabelColor=");
      var23.append(var17);
      var23.append(", acceptLabelText=");
      var23.append(var13);
      var23.append(", bodyText=");
      var23.append(var26);
      var23.append(", bodyTextColor=");
      var23.append(var4);
      var23.append(", canBeAccepted=");
      var23.append(var18);
      var23.append(", embedCanBeTapped=");
      var23.append(var6);
      var23.append(", resolvingGradientEnd=");
      var23.append(var24);
      var23.append(", resolvingGradientStart=");
      var23.append(var20);
      var23.append(", splashHasRadialGradient=");
      var23.append(var21);
      var23.append(", splashOpacity=");
      var23.append(var35);
      var23.append(", splashUrl=");
      var23.append(var5);
      var23.append(", inviteSplash=");
      var23.append(var19);
      var23.append(", subtitle=");
      var23.append(var16);
      var23.append(", subtitleColor=");
      var23.append(var7);
      var23.append(", thumbnailBackgroundColor=");
      var23.append(var36);
      var23.append(", thumbnailCornerRadius=");
      var23.append(var12);
      var23.append(", thumbnailText=");
      var23.append(var30);
      var23.append(", thumbnailUrl=");
      var23.append(var31);
      var23.append(", titleColor=");
      var23.append(var32);
      var23.append(", titleText=");
      var23.append(var29);
      var23.append(", applicationId=");
      var23.append(var9);
      var23.append(", channelId=");
      var23.append(var8);
      var23.append(", extendedType=");
      var23.append(var28);
      var23.append(", participantAvatarUris=");
      var23.append(var10);
      var23.append(", description=");
      var23.append(var34);
      var23.append(", participantsText=");
      var23.append(var11);
      var23.append(", referrerId=");
      var23.append(var22);
      var23.append(", customId=");
      var23.append(var25);
      var23.append(")");
      return var23.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ActivityBookmarkEmbedImpl.$serializer = new ActivityBookmarkEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.codedlinks.ActivityBookmarkEmbedImpl", var0, 35
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
         var1.l("referrerId", false);
         var1.l("customId", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var27: Array<KSerializer> = ActivityBookmarkEmbedImpl.access$get$childSerializers$cp();
         val var7: N = N.a;
         val var4: C0 = C0.a;
         val var3: KSerializer = a.u(C0.a);
         val var5: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var6: KSerializer = a.u(var7);
         val var2: KSerializer = a.u(var7);
         val var10: KSerializer = a.u(var7);
         val var12: KSerializer = a.u(var4);
         val var13: KSerializer = a.u(var4);
         val var11: KSerializer = a.u(var7);
         val var15: h = h.a;
         return new KSerializer[]{
            var7,
            var7,
            var7,
            var3,
            var5,
            var6,
            var2,
            var10,
            var12,
            var13,
            var11,
            a.u(h.a),
            a.u(var15),
            a.u(var7),
            a.u(var7),
            a.u(var15),
            a.u(var7),
            a.u(var4),
            a.u(var4),
            a.u(var4),
            a.u(var7),
            a.u(var7),
            a.u(var7),
            a.u(var4),
            a.u(var4),
            a.u(var7),
            a.u(var4),
            ApplicationId.$serializer.INSTANCE,
            ChannelId.$serializer.INSTANCE,
            CodedLinkExtendedType.Serializer.INSTANCE,
            var27[30],
            a.u(var4),
            var4,
            var4,
            a.u(var4)
         };
      }

      public open fun deserialize(decoder: Decoder): ActivityBookmarkEmbedImpl {
         q.h(var1, "decoder");
         val var54: SerialDescriptor = this.getDescriptor();
         val var55: c = var1.c(var54);
         val var51: Array<KSerializer> = ActivityBookmarkEmbedImpl.access$get$childSerializers$cp();
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var8: Int;
         var var13: java.lang.String;
         var var14: java.lang.String;
         var var15: java.lang.String;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: java.lang.String;
         var var22: java.lang.String;
         var var24: Any;
         var var26: Any;
         var var28: java.lang.String;
         var var29: Any;
         var var30: java.lang.String;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         var var36: java.lang.String;
         var var37: java.lang.String;
         var var38: Any;
         var var39: java.lang.String;
         var var40: Any;
         var var41: Any;
         val var57: java.lang.String;
         var var62: Int;
         var var73: Any;
         var var78: java.lang.String;
         var var124: Any;
         var var144: Any;
         var var155: Any;
         var var167: java.lang.String;
         if (var55.y()) {
            var8 = var55.k(var54, 0);
            var62 = var55.k(var54, 1);
            var3 = var55.k(var54, 2);
            val var56: C0 = C0.a;
            var36 = var55.v(var54, 3, C0.a, null) as java.lang.String;
            var35 = var55.v(var54, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var73 = N.a;
            var32 = var55.v(var54, 5, N.a, null) as Int;
            var33 = var55.v(var54, 6, (DeserializationStrategy)var73, null) as Int;
            var34 = var55.v(var54, 7, (DeserializationStrategy)var73, null) as Int;
            var28 = var55.v(var54, 8, var56, null) as java.lang.String;
            var144 = var55.v(var54, 9, var56, null) as java.lang.String;
            var124 = var55.v(var54, 10, (DeserializationStrategy)var73, null) as Int;
            val var12: h = h.a;
            var41 = var55.v(var54, 11, h.a, null) as java.lang.Boolean;
            var155 = var55.v(var54, 12, var12, null) as java.lang.Boolean;
            val var43: Int = var55.v(var54, 13, (DeserializationStrategy)var73, null) as Int;
            var29 = var55.v(var54, 14, (DeserializationStrategy)var73, null) as Int;
            var38 = var55.v(var54, 15, var12, null) as java.lang.Boolean;
            val var27: Int = var55.v(var54, 16, (DeserializationStrategy)var73, null) as Int;
            var30 = var55.v(var54, 17, var56, null) as java.lang.String;
            var37 = var55.v(var54, 18, var56, null) as java.lang.String;
            val var42: java.lang.String = var55.v(var54, 19, var56, null) as java.lang.String;
            var31 = var55.v(var54, 20, (DeserializationStrategy)var73, null) as Int;
            var26 = var55.v(var54, 21, (DeserializationStrategy)var73, null) as Int;
            var24 = var55.v(var54, 22, (DeserializationStrategy)var73, null) as Int;
            var22 = var55.v(var54, 23, var56, null) as java.lang.String;
            var20 = var55.v(var54, 24, var56, null) as java.lang.String;
            var19 = var55.v(var54, 25, (DeserializationStrategy)var73, null) as Int;
            var14 = var55.v(var54, 26, var56, null) as java.lang.String;
            var18 = var55.m(var54, 27, ApplicationId.$serializer.INSTANCE, null) as ApplicationId;
            var17 = var55.m(var54, 28, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var16 = var55.m(var54, 29, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            var73 = var55.m(var54, 30, var51[30], null) as java.util.List;
            var13 = var55.v(var54, 31, var56, null) as java.lang.String;
            var78 = var55.t(var54, 32);
            var15 = var55.t(var54, 33);
            var57 = var55.v(var54, 34, var56, null) as java.lang.String;
            var4 = -1;
            var5 = 7;
            var39 = (java.lang.String)var144;
            var40 = var124;
            var144 = var155;
            var155 = var43;
            var124 = var27;
            var167 = var42;
         } else {
            var4 = 0;
            var8 = 0;
            var5 = 0;
            var var6: Int = 0;
            var var7: Boolean = true;
            var29 = null;
            var36 = null;
            var41 = null;
            var40 = null;
            var34 = null;
            var33 = null;
            var32 = null;
            var39 = null;
            var28 = null;
            var24 = null;
            var155 = null;
            var167 = null;
            var26 = null;
            var31 = null;
            var30 = null;
            var15 = null;
            var73 = null;
            var78 = null;
            var13 = null;
            var14 = null;
            var16 = null;
            var17 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var124 = null;
            var22 = null;
            var144 = null;
            var var58: java.lang.String = null;
            var38 = null;
            var37 = null;
            var35 = null;
            var3 = 0;

            while (var7) {
               label72: {
                  var var178: java.lang.String;
                  label71: {
                     label70: {
                        label69: {
                           label87: {
                              val var9: Int = var55.x(var54);
                              switch (var9) {
                                 case -1:
                                    var7 = false;
                                    break;
                                 case 0:
                                    var155 = var167;
                                    var16 = var17;
                                    var15 = (java.lang.String)var18;
                                    var14 = (java.lang.String)var19;
                                    var13 = var20;
                                    var78 = (java.lang.String)var124;
                                    var73 = var22;
                                    var8 = var55.k(var54, 0);
                                    var4 |= 1;
                                    var144 = var58;
                                    var29 = var30;
                                    var167 = (java.lang.String)var24;
                                    var26 = var155;
                                    var30 = (java.lang.String)var29;
                                    var59 = var144;
                                    var17 = var16;
                                    var18 = var14;
                                    var19 = var13;
                                    var20 = var78;
                                    var124 = var73;
                                    var22 = var15;
                                    var24 = var26;
                                    break label72;
                                 case 1:
                                    var3 = var55.k(var54, 1);
                                    var4 |= 2;
                                    break;
                                 case 2:
                                    var5 = var55.k(var54, 2);
                                    var4 |= 4;
                                    break;
                                 case 3:
                                    var36 = var55.v(var54, 3, C0.a, var36) as java.lang.String;
                                    var4 |= 8;
                                    break;
                                 case 4:
                                    var35 = var55.v(var54, 4, InviteType.Serializer.INSTANCE, var35) as InviteType;
                                    var4 |= 16;
                                    break;
                                 case 5:
                                    var32 = var55.v(var54, 5, N.a, var32) as Int;
                                    var4 |= 32;
                                    break;
                                 case 6:
                                    var33 = var55.v(var54, 6, N.a, var33) as Int;
                                    var4 |= 64;
                                    break;
                                 case 7:
                                    var34 = var55.v(var54, 7, N.a, var34) as Int;
                                    var4 |= 128;
                                    break;
                                 case 8:
                                    var28 = var55.v(var54, 8, C0.a, var28) as java.lang.String;
                                    var4 |= 256;
                                    break;
                                 case 9:
                                    var155 = var167;
                                    var39 = var55.v(var54, 9, C0.a, var39) as java.lang.String;
                                    var62 = var4 or 512;
                                    var167 = (java.lang.String)var24;
                                    var26 = var155;
                                    var24 = var26;
                                    break label87;
                                 case 10:
                                    var155 = var167;
                                    var40 = var55.v(var54, 10, N.a, var40) as Int;
                                    var62 = var4 or 1024;
                                    var167 = (java.lang.String)var24;
                                    var26 = var155;
                                    var24 = var26;
                                    break label87;
                                 case 11:
                                    var155 = var167;
                                    var41 = var55.v(var54, 11, h.a, var41) as java.lang.Boolean;
                                    var62 = var4 or 2048;
                                    var167 = (java.lang.String)var24;
                                    var26 = var155;
                                    var24 = var26;
                                    break label87;
                                 case 12:
                                    var167 = var55.v(var54, 12, h.a, var24) as java.lang.Boolean;
                                    var62 = var4 or 4096;
                                    var26 = var155;
                                    var24 = var26;
                                    var155 = var167;
                                    break label87;
                                 case 13:
                                    var26 = var55.v(var54, 13, N.a, var155) as Int;
                                    var62 = var4 or 8192;
                                    var167 = (java.lang.String)var24;
                                    var24 = var26;
                                    var155 = var167;
                                    break label87;
                                 case 14:
                                    val var241: Int = var55.v(var54, 14, N.a, var167) as Int;
                                    var62 = var4 or 16384;
                                    var167 = (java.lang.String)var24;
                                    var26 = var155;
                                    var24 = var26;
                                    var155 = var241;
                                    break label87;
                                 case 15:
                                    var26 = var55.v(var54, 15, h.a, var26) as java.lang.Boolean;
                                    var62 = var4 or '耀';
                                    var155 = var167;
                                    var24 = var26;
                                    var26 = var155;
                                    var167 = (java.lang.String)var24;
                                    break label87;
                                 case 16:
                                    var31 = var55.v(var54, 16, N.a, var31) as Int;
                                    var4 |= 65536;
                                    break label69;
                                 case 17:
                                    var30 = var55.v(var54, 17, C0.a, var30) as java.lang.String;
                                    var4 |= 131072;
                                    break label69;
                                 case 18:
                                    var16 = var17;
                                    var14 = (java.lang.String)var19;
                                    var13 = var20;
                                    var78 = (java.lang.String)var124;
                                    var124 = var73;
                                    var22 = var55.v(var54, 18, C0.a, var15) as java.lang.String;
                                    var62 = var4 or 262144;
                                    var144 = var58;
                                    var59 = var144;
                                    var73 = var22;
                                    var15 = (java.lang.String)var18;
                                    var17 = var16;
                                    var18 = var14;
                                    var19 = var13;
                                    var20 = var78;
                                    break label70;
                                 case 19:
                                    var16 = var17;
                                    var14 = (java.lang.String)var19;
                                    var13 = var20;
                                    var20 = var78;
                                    var124 = var55.v(var54, 19, C0.a, var73) as java.lang.String;
                                    var62 = var4 or 524288;
                                    var144 = var58;
                                    var22 = var15;
                                    var59 = var144;
                                    var73 = var22;
                                    var78 = (java.lang.String)var124;
                                    var15 = (java.lang.String)var18;
                                    var17 = var16;
                                    var18 = var14;
                                    var19 = var13;
                                    break label70;
                                 case 20:
                                    var16 = var17;
                                    var14 = (java.lang.String)var19;
                                    var19 = var13;
                                    val var129: Int = var55.v(var54, 20, N.a, var78) as Int;
                                    var62 = var4 or 1048576;
                                    var144 = var58;
                                    var22 = var15;
                                    var59 = var144;
                                    var73 = var22;
                                    var78 = (java.lang.String)var124;
                                    var13 = var20;
                                    var15 = (java.lang.String)var18;
                                    var17 = var16;
                                    var18 = var14;
                                    var20 = var129;
                                    var124 = var73;
                                    break label70;
                                 case 21:
                                    var16 = var17;
                                    val var233: Int = var55.v(var54, 21, N.a, var13) as Int;
                                    var62 = var4 or 2097152;
                                    var144 = var58;
                                    var22 = var15;
                                    var59 = var144;
                                    var73 = var22;
                                    var78 = (java.lang.String)var124;
                                    var13 = var20;
                                    var14 = (java.lang.String)var19;
                                    var15 = (java.lang.String)var18;
                                    var17 = var16;
                                    var18 = var14;
                                    var19 = var233;
                                    var20 = var78;
                                    var124 = var73;
                                    break label70;
                                 case 22:
                                    val var261: Int = var55.v(var54, 22, N.a, var14) as Int;
                                    var62 = var4 or 4194304;
                                    var144 = var58;
                                    var22 = var15;
                                    var59 = var144;
                                    var73 = var22;
                                    var78 = (java.lang.String)var124;
                                    var13 = var20;
                                    var14 = (java.lang.String)var19;
                                    var15 = (java.lang.String)var18;
                                    var16 = var17;
                                    var17 = var16;
                                    var18 = var261;
                                    var19 = var13;
                                    var20 = var78;
                                    var124 = var73;
                                    break label70;
                                 case 23:
                                    val var231: java.lang.String = var55.v(var54, 23, C0.a, var16) as java.lang.String;
                                    var62 = var4 or 8388608;
                                    var144 = var58;
                                    var22 = var15;
                                    var59 = var144;
                                    var73 = var22;
                                    var78 = (java.lang.String)var124;
                                    var13 = var20;
                                    var14 = (java.lang.String)var19;
                                    var15 = (java.lang.String)var18;
                                    var16 = var17;
                                    var17 = var231;
                                    var18 = var14;
                                    var19 = var13;
                                    var20 = var78;
                                    var124 = var73;
                                    break label70;
                                 case 24:
                                    var17 = var55.v(var54, 24, C0.a, var17) as java.lang.String;
                                    var62 = var4 or 16777216;
                                    var144 = var58;
                                    var22 = var15;
                                    var59 = var144;
                                    var73 = var22;
                                    var78 = (java.lang.String)var124;
                                    var13 = var20;
                                    var14 = (java.lang.String)var19;
                                    var15 = (java.lang.String)var18;
                                    var16 = var17;
                                    var17 = var16;
                                    var18 = var14;
                                    var19 = var13;
                                    var20 = var78;
                                    var124 = var73;
                                    break label70;
                                 case 25:
                                    var18 = var55.v(var54, 25, N.a, var18) as Int;
                                    var62 = var4 or 33554432;
                                    var144 = var58;
                                    var22 = var15;
                                    var16 = var17;
                                    var59 = var144;
                                    var73 = var22;
                                    var78 = (java.lang.String)var124;
                                    var13 = var20;
                                    var14 = (java.lang.String)var19;
                                    var15 = (java.lang.String)var18;
                                    var17 = var16;
                                    var18 = var14;
                                    var19 = var13;
                                    var20 = var78;
                                    var124 = var73;
                                    break label70;
                                 case 26:
                                    var19 = var55.v(var54, 26, C0.a, var19) as java.lang.String;
                                    var62 = var4 or 67108864;
                                    var144 = var58;
                                    var22 = var15;
                                    var16 = var17;
                                    var15 = (java.lang.String)var18;
                                    var59 = var144;
                                    var73 = var22;
                                    var78 = (java.lang.String)var124;
                                    var13 = var20;
                                    var14 = (java.lang.String)var19;
                                    var17 = var16;
                                    var18 = var14;
                                    var19 = var13;
                                    var20 = var78;
                                    var124 = var73;
                                    break label70;
                                 case 27:
                                    val var297: ApplicationId = var55.m(var54, 27, ApplicationId.$serializer.INSTANCE, var20) as ApplicationId;
                                    var62 = var4 or 134217728;
                                    var144 = var58;
                                    var22 = var15;
                                    var124 = var73;
                                    var20 = var78;
                                    var16 = var17;
                                    var15 = (java.lang.String)var18;
                                    var14 = (java.lang.String)var19;
                                    var59 = var144;
                                    var73 = var22;
                                    var78 = (java.lang.String)var124;
                                    var13 = var297;
                                    var17 = var16;
                                    var18 = var14;
                                    var19 = var13;
                                    break label70;
                                 case 28:
                                    val var314: ChannelId = var55.m(var54, 28, ChannelId.$serializer.INSTANCE, var124) as ChannelId;
                                    var62 = var4 or 268435456;
                                    var144 = var58;
                                    var22 = var15;
                                    var124 = var73;
                                    var16 = var17;
                                    var15 = (java.lang.String)var18;
                                    var14 = (java.lang.String)var19;
                                    var13 = var20;
                                    var59 = var144;
                                    var73 = var22;
                                    var78 = var314;
                                    var17 = var16;
                                    var18 = var14;
                                    var19 = var13;
                                    var20 = var78;
                                    break label70;
                                 case 29:
                                    val var313: CodedLinkExtendedType = var55.m(var54, 29, CodedLinkExtendedType.Serializer.INSTANCE, var22) as CodedLinkExtendedType;
                                    var62 = var4 or 536870912;
                                    var144 = var58;
                                    var22 = var15;
                                    var16 = var17;
                                    var15 = (java.lang.String)var18;
                                    var14 = (java.lang.String)var19;
                                    var13 = var20;
                                    var78 = (java.lang.String)var124;
                                    var59 = var144;
                                    var73 = var313;
                                    var17 = var16;
                                    var18 = var14;
                                    var19 = var13;
                                    var20 = var78;
                                    var124 = var73;
                                    break label70;
                                 case 30:
                                    val var329: java.util.List = var55.m(var54, 30, var51[30], var144) as java.util.List;
                                    var62 = var4 or 1073741824;
                                    var144 = var58;
                                    var16 = var17;
                                    var15 = (java.lang.String)var18;
                                    var14 = (java.lang.String)var19;
                                    var13 = var20;
                                    var78 = (java.lang.String)var124;
                                    var73 = var22;
                                    var59 = var329;
                                    var17 = var16;
                                    var18 = var14;
                                    var19 = var13;
                                    var20 = var78;
                                    var124 = var73;
                                    var22 = var15;
                                    break label70;
                                 case 31:
                                    val var252: java.lang.String = var55.v(var54, 31, C0.a, var58) as java.lang.String;
                                    var62 = var4 or Integer.MIN_VALUE;
                                    var16 = var17;
                                    var13 = var20;
                                    var144 = var252;
                                    var22 = var15;
                                    var124 = var73;
                                    var20 = var78;
                                    var19 = var13;
                                    var18 = var14;
                                    var17 = var16;
                                    var15 = (java.lang.String)var18;
                                    var14 = (java.lang.String)var19;
                                    var78 = (java.lang.String)var124;
                                    var73 = var22;
                                    var59 = var144;
                                    break label70;
                                 case 32:
                                    var38 = var55.t(var54, 32);
                                    var6 |= 1;
                                    var178 = (java.lang.String)var29;
                                    break label71;
                                 case 33:
                                    var37 = var55.t(var54, 33);
                                    var6 |= 2;
                                    var178 = (java.lang.String)var29;
                                    break label71;
                                 case 34:
                                    var178 = var55.v(var54, 34, C0.a, var29) as java.lang.String;
                                    var6 |= 4;
                                    break label71;
                                 default:
                                    throw new n(var9);
                              }

                              var16 = var17;
                              var15 = (java.lang.String)var18;
                              var14 = (java.lang.String)var19;
                              var13 = var20;
                              var78 = (java.lang.String)var124;
                              var73 = var22;
                              var144 = var58;
                              var29 = var30;
                              var167 = (java.lang.String)var24;
                              var26 = var155;
                              var30 = (java.lang.String)var29;
                              var59 = var144;
                              var17 = var16;
                              var18 = var14;
                              var19 = var13;
                              var20 = var78;
                              var124 = var73;
                              var22 = var15;
                              var24 = var26;
                              var155 = var167;
                              break label72;
                           }

                           var16 = var17;
                           var15 = (java.lang.String)var18;
                           var14 = (java.lang.String)var19;
                           var13 = var20;
                           var78 = (java.lang.String)var124;
                           var73 = var22;
                           var144 = var58;
                           var29 = var30;
                           var4 = var62;
                           var30 = (java.lang.String)var29;
                           var59 = var144;
                           var17 = var16;
                           var18 = var14;
                           var19 = var13;
                           var20 = var78;
                           var124 = var73;
                           var22 = var15;
                           break label72;
                        }

                        var16 = var17;
                        var15 = (java.lang.String)var18;
                        var14 = (java.lang.String)var19;
                        var13 = var20;
                        var78 = (java.lang.String)var124;
                        var73 = var22;
                        var59 = var144;
                        var167 = (java.lang.String)var24;
                        var29 = var30;
                        var26 = var155;
                        var30 = (java.lang.String)var29;
                        var17 = var16;
                        var18 = var14;
                        var19 = var13;
                        var20 = var78;
                        var124 = var73;
                        var22 = var15;
                        var144 = var58;
                        var24 = var26;
                        var155 = var167;
                        break label72;
                     }

                     var29 = var30;
                     var167 = (java.lang.String)var24;
                     var4 = var62;
                     var26 = var155;
                     var30 = (java.lang.String)var29;
                     var24 = var26;
                     var155 = var167;
                     break label72;
                  }

                  var155 = var167;
                  var24 = var26;
                  var29 = var30;
                  var16 = var17;
                  var15 = (java.lang.String)var18;
                  var14 = (java.lang.String)var19;
                  var13 = var20;
                  var78 = (java.lang.String)var124;
                  var73 = var22;
                  var144 = var58;
                  var167 = (java.lang.String)var24;
                  var26 = var155;
                  var30 = var178;
                  var59 = var144;
                  var17 = var16;
                  var18 = var14;
                  var19 = var13;
                  var20 = var78;
                  var124 = var73;
                  var22 = var15;
               }

               var29 = var30;
               var16 = var17;
               var14 = (java.lang.String)var18;
               var13 = (java.lang.String)var19;
               var78 = var20;
               var73 = var124;
               var15 = var22;
               var24 = var167;
               var155 = var26;
               var167 = (java.lang.String)var155;
               var26 = var24;
               var30 = (java.lang.String)var29;
               var17 = var16;
               var18 = var15;
               var19 = var14;
               var20 = var13;
               var124 = var78;
               var22 = (java.lang.String)var73;
               var144 = var59;
               var58 = (java.lang.String)var144;
            }

            var57 = (java.lang.String)var29;
            var20 = (java.lang.String)var17;
            var22 = (java.lang.String)var16;
            var124 = var31;
            var144 = var24;
            var62 = var3;
            var78 = (java.lang.String)var38;
            var15 = var37;
            var3 = var5;
            var5 = var6;
            var13 = var58;
            var73 = var144;
            var16 = var22;
            var17 = var124;
            var18 = var20;
            var14 = (java.lang.String)var19;
            var19 = var18;
            var24 = var14;
            var26 = var13;
            var31 = var78;
            var167 = (java.lang.String)var73;
            var37 = var15;
            var38 = var26;
            var29 = var167;
         }

         var55.b(var54);
         return new ActivityBookmarkEmbedImpl(
            var4,
            var5,
            var8,
            var62,
            var3,
            var36,
            (InviteType)var35,
            (Integer)var32,
            (Integer)var33,
            (Integer)var34,
            var28,
            var39,
            (Integer)var40,
            (java.lang.Boolean)var41,
            (java.lang.Boolean)var144,
            (Integer)var155,
            (Integer)var29,
            (java.lang.Boolean)var38,
            (Integer)var124,
            var30,
            var37,
            var167,
            (Integer)var31,
            (Integer)var26,
            (Integer)var24,
            var22,
            var20,
            (Integer)var19,
            var14,
            (ApplicationId)var18,
            (ChannelId)var17,
            (CodedLinkExtendedType)var16,
            (java.util.List)var73,
            var13,
            var78,
            var15,
            var57,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ActivityBookmarkEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ActivityBookmarkEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ka.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityBookmarkEmbedImpl> {
         return ActivityBookmarkEmbedImpl.$serializer.INSTANCE;
      }
   }
}
