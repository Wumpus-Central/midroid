package com.discord.chat.bridge.codedlinks

import al.b2
import al.g0
import al.h
import al.n0
import al.o1
import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import xk.f
import xk.n
import yk.a

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
      var var38: Boolean = false;
      val var37: Boolean;
      if (1476395023 != (var1 and 1476395023)) {
         var37 = true;
      } else {
         var37 = false;
      }

      if (1 != (var2 and 1)) {
         var38 = true;
      }

      if (var37 or var38) {
         o1.a(new int[]{var1, var2}, new int[]{1476395023, 1}, ActivityBookmarkEmbedImpl.$serializer.INSTANCE.getDescriptor());
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
      q.h(var32, "extendedType");
      q.h(var33, "participantAvatarUris");
      q.h(var35, "participantsText");
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
      participantsText: String = ...
   ): ActivityBookmarkEmbedImpl {
      q.h(var32, "extendedType");
      q.h(var33, "participantAvatarUris");
      q.h(var35, "participantsText");
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
         } else {
            return q.c(this.participantsText, var1.participantsText);
         }
      }
   }

   public override fun hashCode(): Int {
      val var27: Int = Integer.hashCode(this.backgroundColor);
      val var26: Int = Integer.hashCode(this.borderColor);
      val var28: Int = Integer.hashCode(this.headerColor);
      var var25: Int = 0;
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

      val var29: Int = ApplicationId.hashCode-impl(this.applicationId);
      val var31: Int = ChannelId.hashCode-impl(this.channelId);
      val var30: Int = this.extendedType.hashCode();
      val var32: Int = this.participantAvatarUris.hashCode();
      if (this.description != null) {
         var25 = this.description.hashCode();
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
                                                      + var29
                                                )
                                                * 31
                                             + var31
                                       )
                                       * 31
                                    + var30
                              )
                              * 31
                           + var32
                     )
                     * 31
                  + var25
            )
            * 31
         + this.participantsText.hashCode();
   }

   public override fun toString(): String {
      val var2: Int = this.backgroundColor;
      val var1: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var6: java.lang.String = this.headerText;
      val var27: InviteType = this.type;
      val var12: Int = this.acceptLabelBackgroundColor;
      val var24: Int = this.acceptLabelBorderColor;
      val var29: Int = this.acceptLabelColor;
      val var10: java.lang.String = this.acceptLabelText;
      val var20: java.lang.String = this.bodyText;
      val var32: Int = this.bodyTextColor;
      val var31: java.lang.Boolean = this.canBeAccepted;
      val var22: java.lang.Boolean = this.embedCanBeTapped;
      val var5: Int = this.resolvingGradientEnd;
      val var4: Int = this.resolvingGradientStart;
      val var18: java.lang.Boolean = this.splashHasRadialGradient;
      val var14: Int = this.splashOpacity;
      val var11: java.lang.String = this.splashUrl;
      val var28: java.lang.String = this.inviteSplash;
      val var7: java.lang.String = this.subtitle;
      val var13: Int = this.subtitleColor;
      val var25: Int = this.thumbnailBackgroundColor;
      val var33: Int = this.thumbnailCornerRadius;
      val var9: java.lang.String = this.thumbnailText;
      val var17: java.lang.String = this.thumbnailUrl;
      val var19: Int = this.titleColor;
      val var15: java.lang.String = this.titleText;
      val var30: java.lang.String = ApplicationId.toString-impl(this.applicationId);
      val var23: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var21: CodedLinkExtendedType = this.extendedType;
      val var26: java.util.List = this.participantAvatarUris;
      val var34: java.lang.String = this.description;
      val var8: java.lang.String = this.participantsText;
      val var16: StringBuilder = new StringBuilder();
      var16.append("ActivityBookmarkEmbedImpl(backgroundColor=");
      var16.append(var2);
      var16.append(", borderColor=");
      var16.append(var1);
      var16.append(", headerColor=");
      var16.append(var3);
      var16.append(", headerText=");
      var16.append(var6);
      var16.append(", type=");
      var16.append(var27);
      var16.append(", acceptLabelBackgroundColor=");
      var16.append(var12);
      var16.append(", acceptLabelBorderColor=");
      var16.append(var24);
      var16.append(", acceptLabelColor=");
      var16.append(var29);
      var16.append(", acceptLabelText=");
      var16.append(var10);
      var16.append(", bodyText=");
      var16.append(var20);
      var16.append(", bodyTextColor=");
      var16.append(var32);
      var16.append(", canBeAccepted=");
      var16.append(var31);
      var16.append(", embedCanBeTapped=");
      var16.append(var22);
      var16.append(", resolvingGradientEnd=");
      var16.append(var5);
      var16.append(", resolvingGradientStart=");
      var16.append(var4);
      var16.append(", splashHasRadialGradient=");
      var16.append(var18);
      var16.append(", splashOpacity=");
      var16.append(var14);
      var16.append(", splashUrl=");
      var16.append(var11);
      var16.append(", inviteSplash=");
      var16.append(var28);
      var16.append(", subtitle=");
      var16.append(var7);
      var16.append(", subtitleColor=");
      var16.append(var13);
      var16.append(", thumbnailBackgroundColor=");
      var16.append(var25);
      var16.append(", thumbnailCornerRadius=");
      var16.append(var33);
      var16.append(", thumbnailText=");
      var16.append(var9);
      var16.append(", thumbnailUrl=");
      var16.append(var17);
      var16.append(", titleColor=");
      var16.append(var19);
      var16.append(", titleText=");
      var16.append(var15);
      var16.append(", applicationId=");
      var16.append(var30);
      var16.append(", channelId=");
      var16.append(var23);
      var16.append(", extendedType=");
      var16.append(var21);
      var16.append(", participantAvatarUris=");
      var16.append(var26);
      var16.append(", description=");
      var16.append(var34);
      var16.append(", participantsText=");
      var16.append(var8);
      var16.append(")");
      return var16.toString();
   }

   public object `$serializer` : g0 {
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
         val var2: Array<KSerializer> = ActivityBookmarkEmbedImpl.access$get$childSerializers$cp();
         val var7: n0 = n0.a;
         val var9: b2 = b2.a;
         val var10: KSerializer = a.u(b2.a);
         val var12: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var3: KSerializer = a.u(var7);
         val var6: KSerializer = a.u(var7);
         val var11: KSerializer = a.u(var7);
         val var5: KSerializer = a.u(var9);
         val var8: KSerializer = a.u(var9);
         val var1: KSerializer = a.u(var7);
         val var4: h = h.a;
         return new KSerializer[]{
            var7,
            var7,
            var7,
            var10,
            var12,
            var3,
            var6,
            var11,
            var5,
            var8,
            var1,
            a.u(h.a),
            a.u(var4),
            a.u(var7),
            a.u(var7),
            a.u(var4),
            a.u(var7),
            a.u(var9),
            a.u(var9),
            a.u(var9),
            a.u(var7),
            a.u(var7),
            a.u(var7),
            a.u(var9),
            a.u(var9),
            a.u(var7),
            a.u(var9),
            ApplicationId.$serializer.INSTANCE,
            ChannelId.$serializer.INSTANCE,
            CodedLinkExtendedType.Serializer.INSTANCE,
            var2[30],
            a.u(var9),
            var9
         };
      }

      public open fun deserialize(decoder: Decoder): ActivityBookmarkEmbedImpl {
         q.h(var1, "decoder");
         val var47: SerialDescriptor = this.getDescriptor();
         val var48: c = var1.c(var47);
         var var40: Array<KSerializer> = ActivityBookmarkEmbedImpl.access$get$childSerializers$cp();
         val var9: Boolean = var48.y();
         var var5: Int = 0;
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var7: Int;
         var var17: java.lang.String;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var22: Any;
         var var23: Any;
         var var24: java.lang.String;
         var var25: InviteType;
         var var26: Any;
         var var27: Any;
         var var28: java.lang.String;
         var var29: Any;
         var var30: java.lang.String;
         var var31: java.lang.String;
         var var32: Any;
         var var33: Any;
         var var34: Any;
         var var35: Any;
         var var36: java.lang.String;
         var var37: java.lang.String;
         var var38: Any;
         var var39: Any;
         var var41: java.lang.String;
         var var42: Any;
         val var43: Any;
         val var44: java.lang.String;
         val var45: Any;
         val var46: java.lang.String;
         var var105: java.lang.String;
         if (var9) {
            var4 = var48.k(var47, 0);
            var3 = var48.k(var47, 1);
            var2 = var48.k(var47, 2);
            val var10: b2 = b2.a;
            var37 = var48.v(var47, 3, b2.a, null) as java.lang.String;
            var25 = var48.v(var47, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var49: n0 = n0.a;
            var23 = var48.v(var47, 5, n0.a, null) as Int;
            var19 = var48.v(var47, 6, var49, null) as Int;
            var20 = var48.v(var47, 7, var49, null) as Int;
            var17 = var48.v(var47, 8, var10, null) as java.lang.String;
            var24 = var48.v(var47, 9, var10, null) as java.lang.String;
            var22 = var48.v(var47, 10, var49, null) as Int;
            val var11: h = h.a;
            var33 = var48.v(var47, 11, h.a, null) as java.lang.Boolean;
            var45 = var48.v(var47, 12, var11, null) as java.lang.Boolean;
            var27 = var48.v(var47, 13, var49, null) as Int;
            var35 = var48.v(var47, 14, var49, null) as Int;
            var18 = var48.v(var47, 15, var11, null) as java.lang.Boolean;
            var29 = var48.v(var47, 16, var49, null) as Int;
            val var15: java.lang.String = var48.v(var47, 17, var10, null) as java.lang.String;
            val var14: java.lang.String = var48.v(var47, 18, var10, null) as java.lang.String;
            var105 = var48.v(var47, 19, var10, null) as java.lang.String;
            var26 = var48.v(var47, 20, var49, null) as Int;
            var39 = var48.v(var47, 21, var49, null) as Int;
            var32 = var48.v(var47, 22, var49, null) as Int;
            var41 = var48.v(var47, 23, var10, null) as java.lang.String;
            var30 = var48.v(var47, 24, var10, null) as java.lang.String;
            val var21: Int = var48.v(var47, 25, var49, null) as Int;
            val var13: java.lang.String = var48.v(var47, 26, var10, null) as java.lang.String;
            var42 = var48.m(var47, 27, ApplicationId.$serializer.INSTANCE, null) as ApplicationId;
            var43 = var48.m(var47, 28, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            val var88: CodedLinkExtendedType = var48.m(var47, 29, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var50: java.util.List = var48.m(var47, 30, var40[30], null) as java.util.List;
            val var83: java.lang.String = var48.v(var47, 31, var10, null) as java.lang.String;
            val var12: java.lang.String = var48.t(var47, 32);
            var5 = -1;
            var40 = var21;
            var7 = 1;
            var28 = var15;
            var36 = var14;
            var44 = var105;
            var105 = var13;
            var38 = var88;
            var34 = var50;
            var46 = var83;
            var31 = var12;
         } else {
            var3 = 0;
            var var6: Int = 0;
            var7 = 0;
            var25 = null;
            var24 = null;
            var23 = null;
            var37 = null;
            var22 = null;
            var var115: java.lang.String = null;
            var20 = null;
            var19 = null;
            var38 = null;
            var var102: Any = null;
            var var98: Any = null;
            var var95: Any = null;
            var var92: Any = null;
            var var89: Any = null;
            var var84: Any = null;
            var var51: java.lang.String = null;
            var36 = null;
            var18 = null;
            var35 = null;
            var34 = null;
            var33 = null;
            var32 = null;
            var31 = null;
            var30 = null;
            var29 = null;
            var28 = null;
            var27 = null;
            var26 = null;
            var105 = null;
            var17 = null;
            var var8: Boolean = true;
            var4 = 0;

            while (var8) {
               label96: {
                  label97: {
                     label71: {
                        label70: {
                           label69: {
                              var2 = var48.x(var47);
                              switch (var2) {
                                 case -1:
                                    var2 = var3;
                                    var102 = var95;
                                    var98 = var92;
                                    var95 = var89;
                                    var92 = var84;
                                    var89 = var51;
                                    var8 = false;
                                    var52 = var102;
                                    var84 = var19;
                                    var19 = var98;
                                    break label71;
                                 case 0:
                                    var102 = var95;
                                    var98 = var92;
                                    var95 = var89;
                                    var92 = var84;
                                    var89 = var51;
                                    var2 = var48.k(var47, 0);
                                    var5 |= 1;
                                    var52 = var102;
                                    var84 = var19;
                                    var19 = var98;
                                    break label71;
                                 case 1:
                                    var2 = var3;
                                    var102 = var95;
                                    var98 = var92;
                                    var95 = var89;
                                    var92 = var84;
                                    var89 = var51;
                                    var6 = var48.k(var47, 1);
                                    var5 |= 2;
                                    var52 = var102;
                                    var84 = var19;
                                    var19 = var98;
                                    break label71;
                                 case 2:
                                    var2 = var3;
                                    var102 = var95;
                                    var98 = var92;
                                    var95 = var89;
                                    var92 = var84;
                                    var89 = var51;
                                    var4 = var48.k(var47, 2);
                                    var5 |= 4;
                                    var84 = var17;
                                    var52 = var102;
                                    var41 = (java.lang.String)var19;
                                    var105 = (java.lang.String)var98;
                                    var17 = var105;
                                    break label96;
                                 case 3:
                                    var39 = var98;
                                    var102 = var95;
                                    var98 = var92;
                                    var95 = var89;
                                    var92 = var84;
                                    var89 = var51;
                                    var37 = var48.v(var47, 3, b2.a, var37) as java.lang.String;
                                    var5 |= 8;
                                    var52 = var102;
                                    var84 = var19;
                                    break label69;
                                 case 4:
                                    var102 = var98;
                                    var98 = var95;
                                    var95 = var92;
                                    var92 = var89;
                                    var89 = var84;
                                    var84 = var51;
                                    var25 = var48.v(var47, 4, InviteType.Serializer.INSTANCE, var25) as InviteType;
                                    var2 = var5 or 16;
                                    var52 = var102;
                                    break;
                                 case 5:
                                    var102 = var98;
                                    var98 = var95;
                                    var95 = var92;
                                    var92 = var89;
                                    var89 = var84;
                                    var84 = var51;
                                    var23 = var48.v(var47, 5, n0.a, var23) as Int;
                                    var2 = var5 or 32;
                                    var52 = var102;
                                    break;
                                 case 6:
                                    var102 = var98;
                                    var98 = var95;
                                    var95 = var92;
                                    var92 = var89;
                                    var89 = var84;
                                    var84 = var51;
                                    var19 = var48.v(var47, 6, n0.a, var19) as Int;
                                    var2 = var5 or 64;
                                    var52 = var102;
                                    break;
                                 case 7:
                                    var102 = var98;
                                    var98 = var95;
                                    var95 = var92;
                                    var92 = var89;
                                    var89 = var84;
                                    var84 = var51;
                                    var20 = var48.v(var47, 7, n0.a, var20) as Int;
                                    var2 = var5 or 128;
                                    var52 = var102;
                                    break;
                                 case 8:
                                    var102 = var98;
                                    var98 = var95;
                                    var95 = var92;
                                    var92 = var89;
                                    var89 = var84;
                                    var84 = var51;
                                    var115 = var48.v(var47, 8, b2.a, var115) as java.lang.String;
                                    var2 = var5 or 256;
                                    var52 = var102;
                                    break;
                                 case 9:
                                    var102 = var98;
                                    var98 = var95;
                                    var95 = var92;
                                    var92 = var89;
                                    var89 = var84;
                                    var84 = var51;
                                    var24 = var48.v(var47, 9, b2.a, var24) as java.lang.String;
                                    var2 = var5 or 512;
                                    var52 = var102;
                                    break;
                                 case 10:
                                    var102 = var98;
                                    var98 = var95;
                                    var95 = var92;
                                    var92 = var89;
                                    var89 = var84;
                                    var84 = var51;
                                    var22 = var48.v(var47, 10, n0.a, var22) as Int;
                                    var2 = var5 or 1024;
                                    var52 = var102;
                                    break;
                                 case 11:
                                    var95 = var92;
                                    var92 = var89;
                                    var89 = var84;
                                    var84 = var51;
                                    var52 = var48.v(var47, 11, h.a, var102) as java.lang.Boolean;
                                    var2 = var5 or 2048;
                                    var98 = var95;
                                    var102 = var98;
                                    break;
                                 case 12:
                                    var92 = var89;
                                    var89 = var84;
                                    var84 = var51;
                                    var42 = var48.v(var47, 12, h.a, var98) as java.lang.Boolean;
                                    var2 = var5 or 4096;
                                    var52 = var102;
                                    var95 = var92;
                                    var98 = var95;
                                    var102 = var42;
                                    break;
                                 case 13:
                                    var89 = var84;
                                    var84 = var51;
                                    var42 = var48.v(var47, 13, n0.a, var95) as Int;
                                    var2 = var5 or 8192;
                                    var52 = var102;
                                    var102 = var98;
                                    var92 = var89;
                                    var95 = var92;
                                    var98 = var42;
                                    break;
                                 case 14:
                                    var84 = var51;
                                    var42 = var48.v(var47, 14, n0.a, var92) as Int;
                                    var2 = var5 or 16384;
                                    var52 = var102;
                                    var102 = var98;
                                    var98 = var95;
                                    var89 = var84;
                                    var92 = var89;
                                    var95 = var42;
                                    break;
                                 case 15:
                                    var42 = var48.v(var47, 15, h.a, var89) as java.lang.Boolean;
                                    var2 = var5 or '耀';
                                    var52 = var102;
                                    var102 = var98;
                                    var98 = var95;
                                    var95 = var92;
                                    var84 = var51;
                                    var89 = var84;
                                    var92 = var42;
                                    break;
                                 case 16:
                                    val var169: Int = var48.v(var47, 16, n0.a, var84) as Int;
                                    var2 = var5 or 65536;
                                    var52 = var102;
                                    var102 = var98;
                                    var98 = var95;
                                    var95 = var92;
                                    var92 = var89;
                                    var84 = var51;
                                    var89 = var169;
                                    break;
                                 case 17:
                                    var39 = var48.v(var47, 17, b2.a, var51) as java.lang.String;
                                    var2 = var5 or 131072;
                                    var52 = var102;
                                    var102 = var98;
                                    var98 = var95;
                                    var95 = var92;
                                    var92 = var89;
                                    var89 = var84;
                                    var84 = var39;
                                    break;
                                 case 18:
                                    var2 = var3;
                                    var36 = var48.v(var47, 18, b2.a, var36) as java.lang.String;
                                    var5 |= 262144;
                                    var105 = (java.lang.String)var98;
                                    var98 = var92;
                                    var95 = var89;
                                    var92 = var84;
                                    var89 = var51;
                                    var52 = var102;
                                    var41 = (java.lang.String)var19;
                                    var84 = var17;
                                    var102 = var95;
                                    var17 = var105;
                                    break label96;
                                 case 19:
                                    var18 = var48.v(var47, 19, b2.a, var18) as java.lang.String;
                                    var2 = var5 or 524288;
                                    break label70;
                                 case 20:
                                    var35 = var48.v(var47, 20, n0.a, var35) as Int;
                                    var2 = var5 or 1048576;
                                    break label70;
                                 case 21:
                                    var34 = var48.v(var47, 21, n0.a, var34) as Int;
                                    var2 = var5 or 2097152;
                                    break label70;
                                 case 22:
                                    var33 = var48.v(var47, 22, n0.a, var33) as Int;
                                    var2 = var5 or 4194304;
                                    break label70;
                                 case 23:
                                    var32 = var48.v(var47, 23, b2.a, var32) as java.lang.String;
                                    var2 = var5 or 8388608;
                                    break label70;
                                 case 24:
                                    var31 = var48.v(var47, 24, b2.a, var31) as java.lang.String;
                                    var2 = var5 or 16777216;
                                    break label70;
                                 case 25:
                                    var30 = var48.v(var47, 25, n0.a, var30) as Int;
                                    var2 = var5 or 33554432;
                                    break label70;
                                 case 26:
                                    var29 = var48.v(var47, 26, b2.a, var29) as java.lang.String;
                                    var2 = var5 or 67108864;
                                    break label70;
                                 case 27:
                                    var28 = var48.m(var47, 27, ApplicationId.$serializer.INSTANCE, var28) as ApplicationId;
                                    var2 = var5 or 134217728;
                                    break label70;
                                 case 28:
                                    var27 = var48.m(var47, 28, ChannelId.$serializer.INSTANCE, var27) as ChannelId;
                                    var2 = var5 or 268435456;
                                    break label70;
                                 case 29:
                                    var26 = var48.m(var47, 29, CodedLinkExtendedType.Serializer.INSTANCE, var26) as CodedLinkExtendedType;
                                    var2 = var5 or 536870912;
                                    break label70;
                                 case 30:
                                    var105 = var48.m(var47, 30, var40[30], var105) as java.util.List;
                                    var2 = var5 or 1073741824;
                                    break label70;
                                 case 31:
                                    var39 = var48.v(var47, 31, b2.a, var17) as java.lang.String;
                                    var2 = var5 or Integer.MIN_VALUE;
                                    var17 = var105;
                                    break label97;
                                 case 32:
                                    var42 = var48.t(var47, 32);
                                    var7 |= 1;
                                    var2 = var3;
                                    var102 = var95;
                                    var98 = var92;
                                    var95 = var89;
                                    var92 = var84;
                                    var89 = var51;
                                    var84 = var17;
                                    var17 = var105;
                                    var52 = var102;
                                    var41 = (java.lang.String)var19;
                                    var105 = (java.lang.String)var98;
                                    var38 = var42;
                                    break label96;
                                 default:
                                    throw new n(var2);
                              }

                              var39 = var102;
                              var102 = var98;
                              var98 = var95;
                              var95 = var92;
                              var92 = var89;
                              var89 = var84;
                              var84 = var19;
                              var5 = var2;
                           }

                           var2 = var3;
                           var19 = var39;
                           break label71;
                        }

                        var39 = var17;
                        var17 = var105;
                        break label97;
                     }

                     var41 = (java.lang.String)var84;
                     var84 = var17;
                     var105 = (java.lang.String)var19;
                     var17 = var105;
                     break label96;
                  }

                  var105 = (java.lang.String)var98;
                  var98 = var92;
                  var95 = var89;
                  var92 = var84;
                  var89 = var51;
                  var52 = var102;
                  var5 = var2;
                  var41 = (java.lang.String)var19;
                  var84 = var39;
                  var102 = var95;
                  var2 = var3;
               }

               var51 = (java.lang.String)var89;
               var89 = var95;
               var92 = var98;
               var95 = var102;
               var98 = var105;
               var105 = var17;
               var17 = (java.lang.String)var84;
               var3 = var2;
               var19 = var41;
               var102 = var52;
               var84 = var92;
            }

            var39 = var34;
            var2 = var4;
            var31 = (java.lang.String)var38;
            var46 = var17;
            var34 = var105;
            var38 = var26;
            var43 = var27;
            var42 = var28;
            var105 = (java.lang.String)var29;
            var40 = var30;
            var30 = var31;
            var41 = (java.lang.String)var32;
            var32 = var33;
            var26 = var35;
            var44 = (java.lang.String)var18;
            var28 = var51;
            var29 = var84;
            var18 = var89;
            var35 = var92;
            var27 = var95;
            var45 = var98;
            var33 = var102;
            var17 = var115;
            var3 = var6;
            var4 = var3;
         }

         var48.b(var47);
         return new ActivityBookmarkEmbedImpl(
            var5,
            var7,
            var4,
            var3,
            var2,
            var37,
            var25,
            (Integer)var23,
            (Integer)var19,
            (Integer)var20,
            var17,
            var24,
            (Integer)var22,
            (java.lang.Boolean)var33,
            (java.lang.Boolean)var45,
            (Integer)var27,
            (Integer)var35,
            (java.lang.Boolean)var18,
            (Integer)var29,
            var28,
            var36,
            var44,
            (Integer)var26,
            (Integer)var39,
            (Integer)var32,
            var41,
            var30,
            var40,
            var105,
            (ApplicationId)var42,
            (ChannelId)var43,
            (CodedLinkExtendedType)var38,
            (java.util.List)var34,
            var46,
            var31,
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
         return al.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityBookmarkEmbedImpl> {
         return ActivityBookmarkEmbedImpl.$serializer.INSTANCE;
      }
   }
}
