package com.discord.chat.bridge.codedlinks

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.h
import qn.n0

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
      q.h(var28, "participantAvatarUris");
      q.h(var29, "extendedType");
      q.h(var31, "noParticipantsText");
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

   public operator fun component28(): List<String> {
      return this.participantAvatarUris;
   }

   public operator fun component29(): CodedLinkExtendedType {
      return this.extendedType;
   }

   public operator fun component3(): Int {
      return this.headerColor;
   }

   public operator fun component30(): AnnotatedStructurableText? {
      return this.structurableSubtitleText;
   }

   public operator fun component31(): String {
      return this.noParticipantsText;
   }

   public operator fun component32(): Boolean {
      return this.ctaEnabled;
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
      participantAvatarUris: List<String> = ...,
      extendedType: CodedLinkExtendedType = ...,
      structurableSubtitleText: AnnotatedStructurableText? = ...,
      noParticipantsText: String = ...,
      ctaEnabled: Boolean = ...
   ): EmbeddedActivityInviteEmbedImpl {
      q.h(var28, "participantAvatarUris");
      q.h(var29, "extendedType");
      q.h(var31, "noParticipantsText");
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
         } else if (!q.c(this.participantAvatarUris, var1.participantAvatarUris)) {
            return false;
         } else if (this.extendedType != var1.extendedType) {
            return false;
         } else if (!q.c(this.structurableSubtitleText, var1.structurableSubtitleText)) {
            return false;
         } else if (!q.c(this.noParticipantsText, var1.noParticipantsText)) {
            return false;
         } else {
            return this.ctaEnabled == var1.ctaEnabled;
         }
      }
   }

   public override fun hashCode(): Int {
      val var27: Int = Integer.hashCode(this.backgroundColor);
      val var28: Int = Integer.hashCode(this.borderColor);
      val var26: Int = Integer.hashCode(this.headerColor);
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

      val var30: Int = this.participantAvatarUris.hashCode();
      val var29: Int = this.extendedType.hashCode();
      if (this.structurableSubtitleText != null) {
         var25 = this.structurableSubtitleText.hashCode();
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
                                             + var30
                                       )
                                       * 31
                                    + var29
                              )
                              * 31
                           + var25
                     )
                     * 31
                  + this.noParticipantsText.hashCode()
            )
            * 31
         + java.lang.Boolean.hashCode(this.ctaEnabled);
   }

   public override fun toString(): String {
      val var1: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var11: java.lang.String = this.headerText;
      val var29: InviteType = this.type;
      val var6: Int = this.acceptLabelBackgroundColor;
      val var10: Int = this.acceptLabelBorderColor;
      val var5: Int = this.acceptLabelColor;
      val var23: java.lang.String = this.acceptLabelText;
      val var21: java.lang.String = this.bodyText;
      val var15: Int = this.bodyTextColor;
      val var30: java.lang.Boolean = this.canBeAccepted;
      val var26: java.lang.Boolean = this.embedCanBeTapped;
      val var25: Int = this.resolvingGradientEnd;
      val var28: Int = this.resolvingGradientStart;
      val var33: java.lang.Boolean = this.splashHasRadialGradient;
      val var8: Int = this.splashOpacity;
      val var13: java.lang.String = this.splashUrl;
      val var20: java.lang.String = this.inviteSplash;
      val var9: java.lang.String = this.subtitle;
      val var14: Int = this.subtitleColor;
      val var16: Int = this.thumbnailBackgroundColor;
      val var19: Int = this.thumbnailCornerRadius;
      val var24: java.lang.String = this.thumbnailText;
      val var18: java.lang.String = this.thumbnailUrl;
      val var27: Int = this.titleColor;
      val var12: java.lang.String = this.titleText;
      val var22: java.util.List = this.participantAvatarUris;
      val var7: CodedLinkExtendedType = this.extendedType;
      val var32: AnnotatedStructurableText = this.structurableSubtitleText;
      val var17: java.lang.String = this.noParticipantsText;
      val var4: Boolean = this.ctaEnabled;
      val var31: StringBuilder = new StringBuilder();
      var31.append("EmbeddedActivityInviteEmbedImpl(backgroundColor=");
      var31.append(var1);
      var31.append(", borderColor=");
      var31.append(var2);
      var31.append(", headerColor=");
      var31.append(var3);
      var31.append(", headerText=");
      var31.append(var11);
      var31.append(", type=");
      var31.append(var29);
      var31.append(", acceptLabelBackgroundColor=");
      var31.append(var6);
      var31.append(", acceptLabelBorderColor=");
      var31.append(var10);
      var31.append(", acceptLabelColor=");
      var31.append(var5);
      var31.append(", acceptLabelText=");
      var31.append(var23);
      var31.append(", bodyText=");
      var31.append(var21);
      var31.append(", bodyTextColor=");
      var31.append(var15);
      var31.append(", canBeAccepted=");
      var31.append(var30);
      var31.append(", embedCanBeTapped=");
      var31.append(var26);
      var31.append(", resolvingGradientEnd=");
      var31.append(var25);
      var31.append(", resolvingGradientStart=");
      var31.append(var28);
      var31.append(", splashHasRadialGradient=");
      var31.append(var33);
      var31.append(", splashOpacity=");
      var31.append(var8);
      var31.append(", splashUrl=");
      var31.append(var13);
      var31.append(", inviteSplash=");
      var31.append(var20);
      var31.append(", subtitle=");
      var31.append(var9);
      var31.append(", subtitleColor=");
      var31.append(var14);
      var31.append(", thumbnailBackgroundColor=");
      var31.append(var16);
      var31.append(", thumbnailCornerRadius=");
      var31.append(var19);
      var31.append(", thumbnailText=");
      var31.append(var24);
      var31.append(", thumbnailUrl=");
      var31.append(var18);
      var31.append(", titleColor=");
      var31.append(var27);
      var31.append(", titleText=");
      var31.append(var12);
      var31.append(", participantAvatarUris=");
      var31.append(var22);
      var31.append(", extendedType=");
      var31.append(var7);
      var31.append(", structurableSubtitleText=");
      var31.append(var32);
      var31.append(", noParticipantsText=");
      var31.append(var17);
      var31.append(", ctaEnabled=");
      var31.append(var4);
      var31.append(")");
      return var31.toString();
   }

   public object `$serializer` : g0 {
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
         var1.c("backgroundColor", false);
         var1.c("borderColor", false);
         var1.c("headerColor", false);
         var1.c("headerText", false);
         var1.c("type", true);
         var1.c("acceptLabelBackgroundColor", true);
         var1.c("acceptLabelBorderColor", true);
         var1.c("acceptLabelColor", true);
         var1.c("acceptLabelText", true);
         var1.c("bodyText", true);
         var1.c("bodyTextColor", true);
         var1.c("canBeAccepted", true);
         var1.c("embedCanBeTapped", true);
         var1.c("resolvingGradientEnd", true);
         var1.c("resolvingGradientStart", true);
         var1.c("splashHasRadialGradient", true);
         var1.c("splashOpacity", true);
         var1.c("splashUrl", true);
         var1.c("inviteSplash", true);
         var1.c("subtitle", true);
         var1.c("subtitleColor", true);
         var1.c("thumbnailBackgroundColor", true);
         var1.c("thumbnailCornerRadius", true);
         var1.c("thumbnailText", true);
         var1.c("thumbnailUrl", true);
         var1.c("titleColor", true);
         var1.c("titleText", true);
         var1.c("participantAvatarUris", false);
         var1.c("extendedType", true);
         var1.c("structurableSubtitleText", true);
         var1.c("noParticipantsText", false);
         var1.c("ctaEnabled", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: Array<KSerializer> = EmbeddedActivityInviteEmbedImpl.access$get$childSerializers$cp();
         val var9: n0 = n0.a;
         val var6: b2 = b2.a;
         val var10: KSerializer = a.u(b2.a);
         val var4: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var8: KSerializer = a.u(var9);
         val var7: KSerializer = a.u(var9);
         val var12: KSerializer = a.u(var9);
         val var2: KSerializer = a.u(var6);
         val var5: KSerializer = a.u(var6);
         val var11: KSerializer = a.u(var9);
         val var3: h = h.a;
         return new KSerializer[]{
            var9,
            var9,
            var9,
            var10,
            var4,
            var8,
            var7,
            var12,
            var2,
            var5,
            var11,
            a.u(h.a),
            a.u(var3),
            a.u(var9),
            a.u(var9),
            a.u(var3),
            a.u(var9),
            a.u(var6),
            a.u(var6),
            a.u(var6),
            a.u(var9),
            a.u(var9),
            a.u(var9),
            a.u(var6),
            a.u(var6),
            a.u(var9),
            a.u(var6),
            var1[27],
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(AnnotatedStructurableTextSerializer.INSTANCE),
            var6,
            var3
         };
      }

      public open fun deserialize(decoder: Decoder): EmbeddedActivityInviteEmbedImpl {
         q.h(var1, "decoder");
         val var44: SerialDescriptor = this.getDescriptor();
         val var45: c = var1.b(var44);
         val var37: Array<KSerializer> = EmbeddedActivityInviteEmbedImpl.access$get$childSerializers$cp();
         val var9: Boolean = var45.p();
         var var34: AnnotatedStructurableText = null;
         var var2: Int;
         var var3: Int;
         var var5: Int;
         var var6: Int;
         var var7: Int;
         var var13: Any;
         var var15: Any;
         var var16: Any;
         var var19: java.lang.String;
         var var20: java.lang.String;
         var var21: Any;
         var var22: Any;
         var var23: Any;
         var var24: Any;
         var var29: java.lang.String;
         var var30: Any;
         var var31: Any;
         var var33: Any;
         var var35: Any;
         var var36: java.lang.String;
         var var38: Any;
         val var39: java.lang.String;
         val var47: AnnotatedStructurableText;
         var var67: java.lang.String;
         var var77: java.lang.String;
         var var84: Any;
         var var142: java.lang.String;
         val var144: Int;
         var var146: Any;
         var var148: Any;
         var var152: java.lang.String;
         val var158: java.lang.String;
         if (var9) {
            var6 = var45.i(var44, 0);
            var5 = var45.i(var44, 1);
            var3 = var45.i(var44, 2);
            val var46: b2 = b2.a;
            var36 = var45.n(var44, 3, b2.a, null) as java.lang.String;
            var22 = var45.n(var44, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var10: n0 = n0.a;
            var16 = var45.n(var44, 5, n0.a, null) as Int;
            var33 = var45.n(var44, 6, var10, null) as Int;
            var21 = var45.n(var44, 7, var10, null) as Int;
            var20 = var45.n(var44, 8, var46, null) as java.lang.String;
            var19 = var45.n(var44, 9, var46, null) as java.lang.String;
            var84 = var45.n(var44, 10, var10, null) as Int;
            val var11: h = h.a;
            var35 = var45.n(var44, 11, h.a, null) as java.lang.Boolean;
            var23 = var45.n(var44, 12, var11, null) as java.lang.Boolean;
            var31 = var45.n(var44, 13, var10, null) as Int;
            var34 = var45.n(var44, 14, var10, null) as Int;
            val var17: java.lang.Boolean = var45.n(var44, 15, var11, null) as java.lang.Boolean;
            val var25: Int = var45.n(var44, 16, var10, null) as Int;
            var148 = var45.n(var44, 17, var46, null) as java.lang.String;
            val var26: java.lang.String = var45.n(var44, 18, var46, null) as java.lang.String;
            var39 = var45.n(var44, 19, var46, null) as java.lang.String;
            val var58: Int = var45.n(var44, 20, var10, null) as Int;
            val var40: Int = var45.n(var44, 21, var10, null) as Int;
            var15 = var45.n(var44, 22, var10, null) as Int;
            var29 = var45.n(var44, 23, var46, null) as java.lang.String;
            var152 = var45.n(var44, 24, var46, null) as java.lang.String;
            val var14: Int = var45.n(var44, 25, var10, null) as Int;
            var146 = var45.n(var44, 26, var46, null) as java.lang.String;
            var13 = var45.y(var44, 27, var37[27], null) as java.util.List;
            val var12: CodedLinkExtendedType = var45.y(var44, 28, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            var47 = var45.n(var44, 29, AnnotatedStructurableTextSerializer.INSTANCE, null) as AnnotatedStructurableText;
            val var53: java.lang.String = var45.m(var44, 30);
            var2 = var45.C(var44, 31);
            var7 = -1;
            var30 = var84;
            var24 = var17;
            var84 = var25;
            var77 = (java.lang.String)var148;
            var142 = var26;
            var38 = var58;
            var148 = var40;
            var144 = var14;
            var67 = (java.lang.String)var146;
            var158 = var152;
            var146 = var12;
            var152 = var53;
         } else {
            var var8: Boolean = true;
            var7 = 0;
            var6 = 0;
            var5 = 0;
            var var4: Int = 0;
            var3 = 0;
            var146 = null;
            var var145: java.lang.String = null;
            var30 = null;
            var31 = null;
            var29 = null;
            var148 = null;
            var142 = null;
            var var48: java.lang.String = null;
            var24 = null;
            var35 = null;
            var33 = null;
            var36 = null;
            var22 = null;
            var var54: Any = null;
            var var64: Any = null;
            var var59: Any = null;
            var20 = null;
            var16 = null;
            var15 = null;
            var84 = null;
            var19 = null;
            var23 = null;
            var67 = null;
            var13 = null;
            var77 = null;
            var152 = null;
            var21 = null;

            while (var8) {
               label108: {
                  label138: {
                     label91: {
                        label90: {
                           var2 = var45.o(var44);
                           switch (var2) {
                              case -1:
                                 var16 = var19;
                                 var59 = var21;
                                 var8 = false;
                                 var24 = var15;
                                 var23 = var16;
                                 var22 = var20;
                                 var21 = var59;
                                 var20 = (java.lang.String)var64;
                                 var19 = (java.lang.String)var54;
                                 var84 = var22;
                                 var77 = (java.lang.String)var84;
                                 var15 = var23;
                                 var64 = var77;
                                 var54 = var24;
                                 var2 = var7;
                                 break label108;
                              case 0:
                                 var22 = var20;
                                 var16 = var19;
                                 var15 = var23;
                                 var64 = var77;
                                 var59 = var21;
                                 var54 = var24;
                                 var6 = var45.i(var44, 0);
                                 var2 = var7 or 1;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = var59;
                                 var23 = var16;
                                 var24 = var15;
                                 break label108;
                              case 1:
                                 var5 = var45.i(var44, 1);
                                 var2 = var7 or 2;
                                 break label90;
                              case 2:
                                 var4 = var45.i(var44, 2);
                                 var2 = var7 or 4;
                                 break label90;
                              case 3:
                                 var36 = var45.n(var44, 3, b2.a, var36) as java.lang.String;
                                 var2 = var7 or 8;
                                 break label90;
                              case 4:
                                 var16 = var19;
                                 var15 = var23;
                                 var64 = var77;
                                 var59 = var21;
                                 var19 = (java.lang.String)var54;
                                 val var97: InviteType = var45.n(var44, 4, InviteType.Serializer.INSTANCE, var22) as InviteType;
                                 var2 = var7 or 16;
                                 var54 = var24;
                                 var77 = (java.lang.String)var84;
                                 var84 = var97;
                                 var20 = (java.lang.String)var64;
                                 var21 = var59;
                                 var22 = var20;
                                 var23 = var16;
                                 var24 = var15;
                                 break label108;
                              case 5:
                                 var16 = var19;
                                 var15 = var23;
                                 var59 = var21;
                                 var20 = (java.lang.String)var64;
                                 var19 = var45.n(var44, 5, n0.a, var54) as Int;
                                 var2 = var7 or 32;
                                 var54 = var24;
                                 var64 = var77;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var21 = var59;
                                 var22 = var20;
                                 var23 = var16;
                                 var24 = var15;
                                 break label108;
                              case 6:
                                 var16 = var19;
                                 var15 = var23;
                                 var21 = var59;
                                 var20 = var45.n(var44, 6, n0.a, var64) as Int;
                                 var2 = var7 or 64;
                                 var54 = var24;
                                 var59 = var21;
                                 var64 = var77;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var19 = (java.lang.String)var54;
                                 var22 = var20;
                                 var23 = var16;
                                 var24 = var15;
                                 break label108;
                              case 7:
                                 var16 = var19;
                                 var15 = var23;
                                 var21 = var45.n(var44, 7, n0.a, var59) as Int;
                                 var2 = var7 or 128;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var54 = var24;
                                 var59 = var21;
                                 var64 = var77;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var22 = var20;
                                 var23 = var16;
                                 var24 = var15;
                                 break label108;
                              case 8:
                                 var15 = var23;
                                 var23 = var16;
                                 val var141: java.lang.String = var45.n(var44, 8, b2.a, var20) as java.lang.String;
                                 var2 = var7 or 256;
                                 var21 = var59;
                                 var54 = var24;
                                 var59 = var21;
                                 var64 = var77;
                                 var16 = var19;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var22 = var141;
                                 var24 = var15;
                                 break label108;
                              case 9:
                                 var24 = var15;
                                 var38 = var45.n(var44, 9, b2.a, var16) as java.lang.String;
                                 var2 = var7 or 512;
                                 var22 = var20;
                                 var54 = var24;
                                 var59 = var21;
                                 var64 = var77;
                                 var15 = var23;
                                 var16 = var19;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = var59;
                                 var23 = var38;
                                 break label108;
                              case 10:
                                 var77 = (java.lang.String)var84;
                                 var24 = var45.n(var44, 10, n0.a, var15) as Int;
                                 var2 = var7 or 1024;
                                 var84 = var22;
                                 var54 = var24;
                                 var59 = var21;
                                 var64 = var77;
                                 var15 = var23;
                                 var16 = var19;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = var59;
                                 var22 = var20;
                                 var23 = var16;
                                 break label108;
                              case 11:
                                 var84 = var45.n(var44, 11, h.a, var84) as java.lang.Boolean;
                                 var2 = var7 or 2048;
                                 var54 = var24;
                                 var59 = var21;
                                 var64 = var77;
                                 var15 = var23;
                                 var16 = var19;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = var59;
                                 var22 = var20;
                                 var23 = var16;
                                 var24 = var15;
                                 break label108;
                              case 12:
                                 val var263: java.lang.Boolean = var45.n(var44, 12, h.a, var19) as java.lang.Boolean;
                                 var2 = var7 or 4096;
                                 var19 = (java.lang.String)var54;
                                 var21 = var59;
                                 var22 = var20;
                                 var24 = var15;
                                 var54 = var24;
                                 var59 = var21;
                                 var64 = var77;
                                 var15 = var23;
                                 var16 = var263;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var20 = (java.lang.String)var64;
                                 var23 = var16;
                                 break label108;
                              case 13:
                                 val var262: Int = var45.n(var44, 13, n0.a, var23) as Int;
                                 var2 = var7 or 8192;
                                 var23 = var16;
                                 var16 = var19;
                                 var54 = var24;
                                 var59 = var21;
                                 var64 = var77;
                                 var15 = var262;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = var59;
                                 var22 = var20;
                                 var24 = var15;
                                 break label108;
                              case 14:
                                 var67 = var45.n(var44, 14, n0.a, var67) as Int;
                                 var2 = var7 or 16384;
                                 var22 = var20;
                                 var16 = var19;
                                 var15 = var23;
                                 var54 = var24;
                                 var59 = var21;
                                 var64 = var77;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = var59;
                                 var23 = var16;
                                 var24 = var15;
                                 break label108;
                              case 15:
                                 var13 = var45.n(var44, 15, h.a, var13) as java.lang.Boolean;
                                 var2 = var7 or '耀';
                                 var21 = var59;
                                 var16 = var19;
                                 var15 = var23;
                                 var54 = var24;
                                 var59 = var21;
                                 var64 = var77;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var22 = var20;
                                 var23 = var16;
                                 var24 = var15;
                                 break label108;
                              case 16:
                                 val var80: Int = var45.n(var44, 16, n0.a, var77) as Int;
                                 var2 = var7 or 65536;
                                 var21 = var59;
                                 var16 = var19;
                                 var15 = var23;
                                 var54 = var24;
                                 var59 = var21;
                                 var64 = var80;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var22 = var20;
                                 var23 = var16;
                                 var24 = var15;
                                 break label108;
                              case 17:
                                 val var273: java.lang.String = var45.n(var44, 17, b2.a, var21) as java.lang.String;
                                 var2 = var7 or 131072;
                                 var16 = var19;
                                 var15 = var23;
                                 var64 = var77;
                                 var54 = var24;
                                 var59 = var273;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = var59;
                                 var22 = var20;
                                 var23 = var16;
                                 var24 = var15;
                                 break label108;
                              case 18:
                                 val var272: java.lang.String = var45.n(var44, 18, b2.a, var24) as java.lang.String;
                                 var2 = var7 or 262144;
                                 var22 = var20;
                                 var16 = var19;
                                 var15 = var23;
                                 var64 = var77;
                                 var59 = var21;
                                 var54 = var272;
                                 var77 = (java.lang.String)var84;
                                 var84 = var22;
                                 var19 = (java.lang.String)var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = var59;
                                 var23 = var16;
                                 var24 = var15;
                                 break label108;
                              case 19:
                                 var48 = var45.n(var44, 19, b2.a, var48) as java.lang.String;
                                 var2 = var7 or 524288;
                                 break label138;
                              case 20:
                                 var142 = var45.n(var44, 20, n0.a, var142) as Int;
                                 var2 = 1048576;
                                 break;
                              case 21:
                                 var148 = var45.n(var44, 21, n0.a, var148) as Int;
                                 var2 = 2097152;
                                 break;
                              case 22:
                                 var30 = var45.n(var44, 22, n0.a, var30) as Int;
                                 var2 = 4194304;
                                 break;
                              case 23:
                                 var29 = var45.n(var44, 23, b2.a, var29) as java.lang.String;
                                 var2 = 8388608;
                                 break;
                              case 24:
                                 var145 = var45.n(var44, 24, b2.a, var145) as java.lang.String;
                                 var2 = 16777216;
                                 break;
                              case 25:
                                 var146 = var45.n(var44, 25, n0.a, var146) as Int;
                                 var2 = 33554432;
                                 break;
                              case 26:
                                 var33 = var45.n(var44, 26, b2.a, var33) as java.lang.String;
                                 var2 = var7 or 67108864;
                                 break label91;
                              case 27:
                                 var31 = var45.y(var44, 27, var37[27], var31) as java.util.List;
                                 var2 = var7 or 134217728;
                                 break label91;
                              case 28:
                                 var35 = var45.y(var44, 28, CodedLinkExtendedType.Serializer.INSTANCE, var35) as CodedLinkExtendedType;
                                 var2 = var7 or 268435456;
                                 break label91;
                              case 29:
                                 var34 = var45.n(var44, 29, AnnotatedStructurableTextSerializer.INSTANCE, var34) as AnnotatedStructurableText;
                                 var2 = var7 or 536870912;
                                 break label91;
                              case 30:
                                 var152 = var45.m(var44, 30);
                                 var2 = var7 or 1073741824;
                                 break label138;
                              case 31:
                                 var3 = var45.C(var44, 31);
                                 var2 = var7 or Integer.MIN_VALUE;
                                 break label138;
                              default:
                                 throw new n(var2);
                           }

                           var2 = var7 or var2;
                           break label91;
                        }

                        var20 = (java.lang.String)var64;
                        var16 = var19;
                        var15 = var23;
                        var64 = var77;
                        var59 = var21;
                        var54 = var24;
                        var77 = (java.lang.String)var84;
                        var84 = var22;
                        var19 = (java.lang.String)var54;
                        var21 = var59;
                        var22 = var20;
                        var23 = var16;
                        var24 = var15;
                        break label108;
                     }

                     var22 = var20;
                     var16 = var19;
                     var15 = var23;
                     var64 = var77;
                     var59 = var21;
                     var54 = var24;
                     var77 = (java.lang.String)var84;
                     var84 = var22;
                     var19 = (java.lang.String)var54;
                     var20 = (java.lang.String)var64;
                     var21 = var59;
                     var23 = var16;
                     var24 = var15;
                     break label108;
                  }

                  var16 = var19;
                  var15 = var23;
                  var24 = var15;
                  var23 = var16;
                  var22 = var20;
                  var21 = var59;
                  var20 = (java.lang.String)var64;
                  var19 = (java.lang.String)var54;
                  var84 = var22;
                  var77 = (java.lang.String)var84;
                  var64 = var77;
                  var59 = var21;
                  var54 = var24;
               }

               var64 = var20;
               var59 = var21;
               var20 = (java.lang.String)var22;
               var16 = var23;
               var15 = var24;
               var7 = var2;
               var24 = var54;
               var22 = var84;
               var54 = var19;
               var84 = var77;
               var19 = (java.lang.String)var16;
               var23 = var15;
               var77 = (java.lang.String)var64;
               var21 = var59;
            }

            var146 = var35;
            var39 = var48;
            var47 = var34;
            var2 = var3;
            var34 = var67;
            var13 = var31;
            var158 = var145;
            var67 = (java.lang.String)var33;
            var144 = (Integer)var146;
            var15 = var30;
            var38 = var142;
            var35 = var84;
            var142 = (java.lang.String)var24;
            var77 = (java.lang.String)var21;
            var84 = var77;
            var24 = var13;
            var31 = var23;
            var23 = var19;
            var30 = var15;
            var19 = (java.lang.String)var16;
            var21 = var59;
            var33 = var64;
            var16 = var54;
            var3 = var4;
         }

         var45.c(var44);
         return new EmbeddedActivityInviteEmbedImpl(
            var7,
            0,
            var6,
            var5,
            var3,
            var36,
            (InviteType)var22,
            (Integer)var16,
            (Integer)var33,
            (Integer)var21,
            var20,
            var19,
            (Integer)var30,
            (java.lang.Boolean)var35,
            (java.lang.Boolean)var23,
            (Integer)var31,
            var34,
            (java.lang.Boolean)var24,
            (Integer)var84,
            var77,
            var142,
            var39,
            (Integer)var38,
            (Integer)var148,
            (Integer)var15,
            var29,
            var158,
            var144,
            var67,
            (java.util.List)var13,
            (CodedLinkExtendedType)var146,
            var47,
            var152,
            (boolean)var2,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: EmbeddedActivityInviteEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         EmbeddedActivityInviteEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbeddedActivityInviteEmbedImpl> {
         return EmbeddedActivityInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
