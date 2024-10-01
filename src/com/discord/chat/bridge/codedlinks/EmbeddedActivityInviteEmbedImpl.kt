package com.discord.chat.bridge.codedlinks

import cl.f
import cl.n
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer
import dl.a
import fl.b2
import fl.g0
import fl.h
import fl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var28: Int = Integer.hashCode(this.backgroundColor);
      val var27: Int = Integer.hashCode(this.borderColor);
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

      val var29: Int = this.participantAvatarUris.hashCode();
      val var30: Int = this.extendedType.hashCode();
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
                                                                                                                                                                                                                                                                                    var28
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var27
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
                                             + var29
                                       )
                                       * 31
                                    + var30
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
      val var2: Int = this.backgroundColor;
      val var3: Int = this.borderColor;
      val var1: Int = this.headerColor;
      val var16: java.lang.String = this.headerText;
      val var5: InviteType = this.type;
      val var20: Int = this.acceptLabelBackgroundColor;
      val var13: Int = this.acceptLabelBorderColor;
      val var18: Int = this.acceptLabelColor;
      val var14: java.lang.String = this.acceptLabelText;
      val var11: java.lang.String = this.bodyText;
      val var29: Int = this.bodyTextColor;
      val var22: java.lang.Boolean = this.canBeAccepted;
      val var25: java.lang.Boolean = this.embedCanBeTapped;
      val var23: Int = this.resolvingGradientEnd;
      val var21: Int = this.resolvingGradientStart;
      val var27: java.lang.Boolean = this.splashHasRadialGradient;
      val var19: Int = this.splashOpacity;
      val var12: java.lang.String = this.splashUrl;
      val var28: java.lang.String = this.inviteSplash;
      val var8: java.lang.String = this.subtitle;
      val var10: Int = this.subtitleColor;
      val var17: Int = this.thumbnailBackgroundColor;
      val var6: Int = this.thumbnailCornerRadius;
      val var31: java.lang.String = this.thumbnailText;
      val var9: java.lang.String = this.thumbnailUrl;
      val var33: Int = this.titleColor;
      val var15: java.lang.String = this.titleText;
      val var26: java.util.List = this.participantAvatarUris;
      val var30: CodedLinkExtendedType = this.extendedType;
      val var24: AnnotatedStructurableText = this.structurableSubtitleText;
      val var7: java.lang.String = this.noParticipantsText;
      val var4: Boolean = this.ctaEnabled;
      val var32: StringBuilder = new StringBuilder();
      var32.append("EmbeddedActivityInviteEmbedImpl(backgroundColor=");
      var32.append(var2);
      var32.append(", borderColor=");
      var32.append(var3);
      var32.append(", headerColor=");
      var32.append(var1);
      var32.append(", headerText=");
      var32.append(var16);
      var32.append(", type=");
      var32.append(var5);
      var32.append(", acceptLabelBackgroundColor=");
      var32.append(var20);
      var32.append(", acceptLabelBorderColor=");
      var32.append(var13);
      var32.append(", acceptLabelColor=");
      var32.append(var18);
      var32.append(", acceptLabelText=");
      var32.append(var14);
      var32.append(", bodyText=");
      var32.append(var11);
      var32.append(", bodyTextColor=");
      var32.append(var29);
      var32.append(", canBeAccepted=");
      var32.append(var22);
      var32.append(", embedCanBeTapped=");
      var32.append(var25);
      var32.append(", resolvingGradientEnd=");
      var32.append(var23);
      var32.append(", resolvingGradientStart=");
      var32.append(var21);
      var32.append(", splashHasRadialGradient=");
      var32.append(var27);
      var32.append(", splashOpacity=");
      var32.append(var19);
      var32.append(", splashUrl=");
      var32.append(var12);
      var32.append(", inviteSplash=");
      var32.append(var28);
      var32.append(", subtitle=");
      var32.append(var8);
      var32.append(", subtitleColor=");
      var32.append(var10);
      var32.append(", thumbnailBackgroundColor=");
      var32.append(var17);
      var32.append(", thumbnailCornerRadius=");
      var32.append(var6);
      var32.append(", thumbnailText=");
      var32.append(var31);
      var32.append(", thumbnailUrl=");
      var32.append(var9);
      var32.append(", titleColor=");
      var32.append(var33);
      var32.append(", titleText=");
      var32.append(var15);
      var32.append(", participantAvatarUris=");
      var32.append(var26);
      var32.append(", extendedType=");
      var32.append(var30);
      var32.append(", structurableSubtitleText=");
      var32.append(var24);
      var32.append(", noParticipantsText=");
      var32.append(var7);
      var32.append(", ctaEnabled=");
      var32.append(var4);
      var32.append(")");
      return var32.toString();
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
         val var3: Array<KSerializer> = EmbeddedActivityInviteEmbedImpl.access$get$childSerializers$cp();
         val var10: n0 = n0.a;
         val var5: b2 = b2.a;
         val var11: KSerializer = a.u(b2.a);
         val var9: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var1: KSerializer = a.u(var10);
         val var12: KSerializer = a.u(var10);
         val var6: KSerializer = a.u(var10);
         val var7: KSerializer = a.u(var5);
         val var4: KSerializer = a.u(var5);
         val var2: KSerializer = a.u(var10);
         val var8: h = h.a;
         return new KSerializer[]{
            var10,
            var10,
            var10,
            var11,
            var9,
            var1,
            var12,
            var6,
            var7,
            var4,
            var2,
            a.u(h.a),
            a.u(var8),
            a.u(var10),
            a.u(var10),
            a.u(var8),
            a.u(var10),
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var10),
            a.u(var10),
            a.u(var10),
            a.u(var5),
            a.u(var5),
            a.u(var10),
            a.u(var5),
            var3[27],
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(AnnotatedStructurableTextSerializer.INSTANCE),
            var5,
            var8
         };
      }

      public open fun deserialize(decoder: Decoder): EmbeddedActivityInviteEmbedImpl {
         q.h(var1, "decoder");
         val var44: SerialDescriptor = this.getDescriptor();
         val var45: c = var1.c(var44);
         val var37: Array<KSerializer> = EmbeddedActivityInviteEmbedImpl.access$get$childSerializers$cp();
         val var9: Boolean = var45.y();
         var var34: AnnotatedStructurableText = null;
         var var2: Int;
         var var3: Int;
         var var5: Int;
         var var6: Int;
         var var7: Int;
         var var14: Int;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: java.lang.String;
         var var21: java.lang.String;
         var var22: Any;
         var var23: Any;
         var var26: Any;
         var var29: java.lang.String;
         var var30: Any;
         var var31: Any;
         var var32: java.lang.String;
         var var33: Any;
         var var36: java.lang.String;
         var var38: Any;
         val var39: Any;
         val var47: AnnotatedStructurableText;
         var var66: Any;
         var var69: java.lang.String;
         var var75: Any;
         var var134: Any;
         var var149: java.lang.String;
         var var153: java.lang.String;
         var var155: Any;
         val var161: java.lang.String;
         var var163: Any;
         val var165: java.lang.String;
         if (var9) {
            var6 = var45.k(var44, 0);
            var5 = var45.k(var44, 1);
            var3 = var45.k(var44, 2);
            val var46: b2 = b2.a;
            var36 = var45.v(var44, 3, b2.a, null) as java.lang.String;
            var22 = var45.v(var44, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var10: n0 = n0.a;
            var17 = var45.v(var44, 5, n0.a, null) as Int;
            var23 = var45.v(var44, 6, var10, null) as Int;
            var19 = var45.v(var44, 7, var10, null) as Int;
            var21 = var45.v(var44, 8, var46, null) as java.lang.String;
            var20 = var45.v(var44, 9, var46, null) as java.lang.String;
            var75 = var45.v(var44, 10, var10, null) as Int;
            val var11: h = h.a;
            var31 = var45.v(var44, 11, h.a, null) as java.lang.Boolean;
            var26 = var45.v(var44, 12, var11, null) as java.lang.Boolean;
            var33 = var45.v(var44, 13, var10, null) as Int;
            var18 = var45.v(var44, 14, var10, null) as Int;
            var134 = var45.v(var44, 15, var11, null) as java.lang.Boolean;
            val var25: Int = var45.v(var44, 16, var10, null) as Int;
            var32 = var45.v(var44, 17, var46, null) as java.lang.String;
            var161 = var45.v(var44, 18, var46, null) as java.lang.String;
            var155 = var45.v(var44, 19, var46, null) as java.lang.String;
            val var58: Int = var45.v(var44, 20, var10, null) as Int;
            val var40: Int = var45.v(var44, 21, var10, null) as Int;
            val var15: Int = var45.v(var44, 22, var10, null) as Int;
            var29 = var45.v(var44, 23, var46, null) as java.lang.String;
            var163 = var45.v(var44, 24, var46, null) as java.lang.String;
            var14 = var45.v(var44, 25, var10, null) as Int;
            var153 = var45.v(var44, 26, var46, null) as java.lang.String;
            var66 = var45.m(var44, 27, var37[27], null) as java.util.List;
            val var12: CodedLinkExtendedType = var45.m(var44, 28, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            var47 = var45.v(var44, 29, AnnotatedStructurableTextSerializer.INSTANCE, null) as AnnotatedStructurableText;
            val var53: java.lang.String = var45.t(var44, 30);
            var2 = var45.s(var44, 31);
            var7 = -1;
            var38 = var75;
            var75 = var134;
            var134 = var25;
            var149 = (java.lang.String)var155;
            var39 = var58;
            var30 = var15;
            var155 = var40;
            var69 = var153;
            var153 = (java.lang.String)var163;
            var163 = var66;
            var66 = var12;
            var165 = var53;
         } else {
            var var8: Boolean = true;
            var7 = 0;
            var6 = 0;
            var5 = 0;
            var var4: Int = 0;
            var3 = 0;
            var var154: Int = null;
            var26 = null;
            var30 = null;
            var31 = null;
            var29 = null;
            var155 = null;
            var149 = null;
            var var48: java.lang.String = null;
            var134 = null;
            var163 = null;
            var33 = null;
            var36 = null;
            var22 = null;
            var var54: Any = null;
            var var64: Any = null;
            var var59: Any = null;
            var21 = null;
            var17 = null;
            var69 = null;
            var18 = null;
            var19 = null;
            var23 = null;
            var14 = null;
            var66 = null;
            var75 = null;
            var32 = null;
            var20 = null;

            while (var8) {
               label108: {
                  label138: {
                     label91: {
                        label90: {
                           var2 = var45.x(var44);
                           switch (var2) {
                              case -1:
                                 var17 = var18;
                                 var8 = false;
                                 var134 = var69;
                                 var23 = var17;
                                 var22 = var21;
                                 var21 = (java.lang.String)var59;
                                 var20 = (java.lang.String)var64;
                                 var19 = var54;
                                 var18 = var22;
                                 var75 = var19;
                                 var69 = (java.lang.String)var23;
                                 var64 = var75;
                                 var59 = var20;
                                 var54 = var134;
                                 var2 = var7;
                                 break label108;
                              case 0:
                                 var17 = var18;
                                 var69 = (java.lang.String)var23;
                                 var64 = var75;
                                 var59 = var20;
                                 var54 = var134;
                                 var6 = var45.k(var44, 0);
                                 var2 = var7 or 1;
                                 var75 = var19;
                                 var18 = var22;
                                 var19 = var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = (java.lang.String)var59;
                                 var22 = var21;
                                 var23 = var17;
                                 var134 = var69;
                                 break label108;
                              case 1:
                                 var5 = var45.k(var44, 1);
                                 var2 = var7 or 2;
                                 break label90;
                              case 2:
                                 var4 = var45.k(var44, 2);
                                 var2 = var7 or 4;
                                 break label90;
                              case 3:
                                 var36 = var45.v(var44, 3, b2.a, var36) as java.lang.String;
                                 var2 = var7 or 8;
                                 break label90;
                              case 4:
                                 var17 = var18;
                                 var69 = (java.lang.String)var23;
                                 var64 = var75;
                                 var59 = var20;
                                 var18 = var45.v(var44, 4, InviteType.Serializer.INSTANCE, var22) as InviteType;
                                 var2 = var7 or 16;
                                 var54 = var134;
                                 var75 = var19;
                                 var19 = var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = (java.lang.String)var59;
                                 var22 = var21;
                                 var23 = var17;
                                 var134 = var69;
                                 break label108;
                              case 5:
                                 var17 = var18;
                                 var69 = (java.lang.String)var23;
                                 var59 = var20;
                                 var20 = (java.lang.String)var64;
                                 val var115: Int = var45.v(var44, 5, n0.a, var54) as Int;
                                 var2 = var7 or 32;
                                 var18 = var22;
                                 var54 = var134;
                                 var64 = var75;
                                 var75 = var19;
                                 var19 = var115;
                                 var21 = (java.lang.String)var59;
                                 var22 = var21;
                                 var23 = var17;
                                 var134 = var69;
                                 break label108;
                              case 6:
                                 var17 = var18;
                                 var69 = (java.lang.String)var23;
                                 var21 = (java.lang.String)var59;
                                 var20 = var45.v(var44, 6, n0.a, var64) as Int;
                                 var2 = var7 or 64;
                                 var18 = var22;
                                 var54 = var134;
                                 var59 = var20;
                                 var64 = var75;
                                 var75 = var19;
                                 var19 = var54;
                                 var22 = var21;
                                 var23 = var17;
                                 var134 = var69;
                                 break label108;
                              case 7:
                                 var17 = var18;
                                 var69 = (java.lang.String)var23;
                                 var21 = var45.v(var44, 7, n0.a, var59) as Int;
                                 var2 = var7 or 128;
                                 var18 = var22;
                                 var54 = var134;
                                 var59 = var20;
                                 var64 = var75;
                                 var75 = var19;
                                 var19 = var54;
                                 var20 = (java.lang.String)var64;
                                 var22 = var21;
                                 var23 = var17;
                                 var134 = var69;
                                 break label108;
                              case 8:
                                 var69 = (java.lang.String)var23;
                                 var23 = var17;
                                 val var147: java.lang.String = var45.v(var44, 8, b2.a, var21) as java.lang.String;
                                 var2 = var7 or 256;
                                 var21 = (java.lang.String)var59;
                                 var54 = var134;
                                 var59 = var20;
                                 var64 = var75;
                                 var75 = var19;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var54;
                                 var20 = (java.lang.String)var64;
                                 var22 = var147;
                                 var134 = var69;
                                 break label108;
                              case 9:
                                 var134 = var69;
                                 var38 = var45.v(var44, 9, b2.a, var17) as java.lang.String;
                                 var2 = var7 or 512;
                                 var20 = (java.lang.String)var64;
                                 var54 = var134;
                                 var59 = var20;
                                 var64 = var75;
                                 var69 = (java.lang.String)var23;
                                 var75 = var19;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var54;
                                 var21 = (java.lang.String)var59;
                                 var22 = var21;
                                 var23 = var38;
                                 break label108;
                              case 10:
                                 var134 = var45.v(var44, 10, n0.a, var69) as Int;
                                 var2 = var7 or 1024;
                                 var54 = var134;
                                 var59 = var20;
                                 var64 = var75;
                                 var69 = (java.lang.String)var23;
                                 var75 = var19;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = (java.lang.String)var59;
                                 var22 = var21;
                                 var23 = var17;
                                 break label108;
                              case 11:
                                 var75 = var19;
                                 var19 = var45.v(var44, 11, h.a, var18) as java.lang.Boolean;
                                 var2 = var7 or 2048;
                                 var18 = var22;
                                 var134 = var69;
                                 var54 = var134;
                                 var59 = var20;
                                 var64 = var75;
                                 var69 = (java.lang.String)var23;
                                 var17 = var19;
                                 var19 = var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = (java.lang.String)var59;
                                 var22 = var21;
                                 var23 = var17;
                                 break label108;
                              case 12:
                                 val var269: java.lang.Boolean = var45.v(var44, 12, h.a, var19) as java.lang.Boolean;
                                 var2 = var7 or 4096;
                                 var17 = var18;
                                 var54 = var134;
                                 var59 = var20;
                                 var64 = var75;
                                 var69 = (java.lang.String)var23;
                                 var75 = var269;
                                 var18 = var22;
                                 var19 = var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = (java.lang.String)var59;
                                 var22 = var21;
                                 var23 = var17;
                                 var134 = var69;
                                 break label108;
                              case 13:
                                 val var283: Int = var45.v(var44, 13, n0.a, var23) as Int;
                                 var2 = var7 or 8192;
                                 var20 = (java.lang.String)var64;
                                 var22 = var21;
                                 var23 = var17;
                                 var134 = var69;
                                 var17 = var18;
                                 var54 = var134;
                                 var59 = var20;
                                 var64 = var75;
                                 var69 = var283;
                                 var75 = var19;
                                 var18 = var22;
                                 var19 = var54;
                                 var21 = (java.lang.String)var59;
                                 break label108;
                              case 14:
                                 var14 = var45.v(var44, 14, n0.a, var14) as Int;
                                 var2 = var7 or 16384;
                                 var134 = var69;
                                 var17 = var18;
                                 var69 = (java.lang.String)var23;
                                 var54 = var134;
                                 var59 = var20;
                                 var64 = var75;
                                 var75 = var19;
                                 var18 = var22;
                                 var19 = var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = (java.lang.String)var59;
                                 var22 = var21;
                                 var23 = var17;
                                 break label108;
                              case 15:
                                 var66 = var45.v(var44, 15, h.a, var66) as java.lang.Boolean;
                                 var2 = var7 or '耀';
                                 var20 = (java.lang.String)var64;
                                 var17 = var18;
                                 var69 = (java.lang.String)var23;
                                 var54 = var134;
                                 var59 = var20;
                                 var64 = var75;
                                 var75 = var19;
                                 var18 = var22;
                                 var19 = var54;
                                 var21 = (java.lang.String)var59;
                                 var22 = var21;
                                 var23 = var17;
                                 var134 = var69;
                                 break label108;
                              case 16:
                                 var75 = var45.v(var44, 16, n0.a, var75) as Int;
                                 var2 = var7 or 65536;
                                 var17 = var18;
                                 var69 = (java.lang.String)var23;
                                 var54 = var134;
                                 var59 = var20;
                                 var64 = var75;
                                 var75 = var19;
                                 var18 = var22;
                                 var19 = var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = (java.lang.String)var59;
                                 var22 = var21;
                                 var23 = var17;
                                 var134 = var69;
                                 break label108;
                              case 17:
                                 val var279: java.lang.String = var45.v(var44, 17, b2.a, var20) as java.lang.String;
                                 var2 = var7 or 131072;
                                 var17 = var18;
                                 var69 = (java.lang.String)var23;
                                 var64 = var75;
                                 var54 = var134;
                                 var59 = var279;
                                 var75 = var19;
                                 var18 = var22;
                                 var19 = var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = (java.lang.String)var59;
                                 var22 = var21;
                                 var23 = var17;
                                 var134 = var69;
                                 break label108;
                              case 18:
                                 val var278: java.lang.String = var45.v(var44, 18, b2.a, var134) as java.lang.String;
                                 var2 = var7 or 262144;
                                 var22 = var21;
                                 var17 = var18;
                                 var69 = (java.lang.String)var23;
                                 var64 = var75;
                                 var59 = var20;
                                 var54 = var278;
                                 var75 = var19;
                                 var18 = var22;
                                 var19 = var54;
                                 var20 = (java.lang.String)var64;
                                 var21 = (java.lang.String)var59;
                                 var23 = var17;
                                 var134 = var69;
                                 break label108;
                              case 19:
                                 var48 = var45.v(var44, 19, b2.a, var48) as java.lang.String;
                                 var2 = var7 or 524288;
                                 break label138;
                              case 20:
                                 var149 = var45.v(var44, 20, n0.a, var149) as Int;
                                 var2 = 1048576;
                                 break;
                              case 21:
                                 var155 = var45.v(var44, 21, n0.a, var155) as Int;
                                 var2 = 2097152;
                                 break;
                              case 22:
                                 var30 = var45.v(var44, 22, n0.a, var30) as Int;
                                 var2 = 4194304;
                                 break;
                              case 23:
                                 var29 = var45.v(var44, 23, b2.a, var29) as java.lang.String;
                                 var2 = 8388608;
                                 break;
                              case 24:
                                 var26 = var45.v(var44, 24, b2.a, var26) as java.lang.String;
                                 var2 = 16777216;
                                 break;
                              case 25:
                                 var154 = var45.v(var44, 25, n0.a, var154) as Int;
                                 var2 = 33554432;
                                 break;
                              case 26:
                                 var33 = var45.v(var44, 26, b2.a, var33) as java.lang.String;
                                 var2 = var7 or 67108864;
                                 break label91;
                              case 27:
                                 var31 = var45.m(var44, 27, var37[27], var31) as java.util.List;
                                 var2 = var7 or 134217728;
                                 break label91;
                              case 28:
                                 var163 = var45.m(var44, 28, CodedLinkExtendedType.Serializer.INSTANCE, var163) as CodedLinkExtendedType;
                                 var2 = var7 or 268435456;
                                 break label91;
                              case 29:
                                 var34 = var45.v(var44, 29, AnnotatedStructurableTextSerializer.INSTANCE, var34) as AnnotatedStructurableText;
                                 var2 = var7 or 536870912;
                                 break label91;
                              case 30:
                                 var32 = var45.t(var44, 30);
                                 var2 = var7 or 1073741824;
                                 break label138;
                              case 31:
                                 var3 = var45.s(var44, 31);
                                 var2 = var7 or Integer.MIN_VALUE;
                                 break label138;
                              default:
                                 throw new n(var2);
                           }

                           var2 = var7 or var2;
                           break label91;
                        }

                        var21 = (java.lang.String)var59;
                        var17 = var18;
                        var69 = (java.lang.String)var23;
                        var64 = var75;
                        var59 = var20;
                        var54 = var134;
                        var75 = var19;
                        var18 = var22;
                        var19 = var54;
                        var20 = (java.lang.String)var64;
                        var22 = var21;
                        var23 = var17;
                        var134 = var69;
                        break label108;
                     }

                     var17 = var18;
                     var69 = (java.lang.String)var23;
                     var64 = var75;
                     var59 = var20;
                     var54 = var134;
                     var75 = var19;
                     var18 = var22;
                     var19 = var54;
                     var20 = (java.lang.String)var64;
                     var21 = (java.lang.String)var59;
                     var22 = var21;
                     var23 = var17;
                     var134 = var69;
                     break label108;
                  }

                  var17 = var18;
                  var69 = (java.lang.String)var23;
                  var134 = var69;
                  var23 = var17;
                  var22 = var21;
                  var21 = (java.lang.String)var59;
                  var20 = (java.lang.String)var64;
                  var19 = var54;
                  var18 = var22;
                  var75 = var19;
                  var64 = var75;
                  var59 = var20;
                  var54 = var134;
               }

               var64 = var20;
               var59 = var21;
               var21 = (java.lang.String)var22;
               var17 = var23;
               var69 = (java.lang.String)var134;
               var7 = var2;
               var134 = var54;
               var22 = var18;
               var54 = var19;
               var18 = var17;
               var19 = var75;
               var23 = var69;
               var75 = var64;
               var20 = (java.lang.String)var59;
            }

            var153 = (java.lang.String)var26;
            var47 = var34;
            var38 = var69;
            var2 = var3;
            var75 = var66;
            var165 = var32;
            var66 = var163;
            var163 = var31;
            var69 = (java.lang.String)var33;
            var14 = var154;
            var39 = var149;
            var31 = var18;
            var149 = var48;
            var161 = (java.lang.String)var134;
            var32 = var20;
            var134 = var75;
            var18 = var14;
            var33 = var23;
            var26 = var19;
            var20 = (java.lang.String)var17;
            var19 = var59;
            var23 = var64;
            var17 = var54;
            var3 = var4;
         }

         var45.b(var44);
         return new EmbeddedActivityInviteEmbedImpl(
            var7,
            0,
            var6,
            var5,
            var3,
            var36,
            (InviteType)var22,
            (Integer)var17,
            (Integer)var23,
            (Integer)var19,
            var21,
            var20,
            (Integer)var38,
            (java.lang.Boolean)var31,
            (java.lang.Boolean)var26,
            (Integer)var33,
            (Integer)var18,
            (java.lang.Boolean)var75,
            (Integer)var134,
            var32,
            var161,
            var149,
            (Integer)var39,
            (Integer)var155,
            (Integer)var30,
            var29,
            var153,
            var14,
            var69,
            (java.util.List)var163,
            (CodedLinkExtendedType)var66,
            var47,
            var165,
            (boolean)var2,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: EmbeddedActivityInviteEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         EmbeddedActivityInviteEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbeddedActivityInviteEmbedImpl> {
         return EmbeddedActivityInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}
