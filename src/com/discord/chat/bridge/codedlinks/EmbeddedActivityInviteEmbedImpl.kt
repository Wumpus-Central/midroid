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
      val var26: Int = Integer.hashCode(this.borderColor);
      val var27: Int = Integer.hashCode(this.headerColor);
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
                                                                                                                                                                                                                                                                                    var28
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var26
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var27
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
      val var18: java.lang.String = this.headerText;
      val var30: InviteType = this.type;
      val var8: Int = this.acceptLabelBackgroundColor;
      val var22: Int = this.acceptLabelBorderColor;
      val var15: Int = this.acceptLabelColor;
      val var10: java.lang.String = this.acceptLabelText;
      val var19: java.lang.String = this.bodyText;
      val var13: Int = this.bodyTextColor;
      val var14: java.lang.Boolean = this.canBeAccepted;
      val var6: java.lang.Boolean = this.embedCanBeTapped;
      val var11: Int = this.resolvingGradientEnd;
      val var31: Int = this.resolvingGradientStart;
      val var23: java.lang.Boolean = this.splashHasRadialGradient;
      val var24: Int = this.splashOpacity;
      val var5: java.lang.String = this.splashUrl;
      val var27: java.lang.String = this.inviteSplash;
      val var29: java.lang.String = this.subtitle;
      val var17: Int = this.subtitleColor;
      val var7: Int = this.thumbnailBackgroundColor;
      val var33: Int = this.thumbnailCornerRadius;
      val var26: java.lang.String = this.thumbnailText;
      val var12: java.lang.String = this.thumbnailUrl;
      val var25: Int = this.titleColor;
      val var32: java.lang.String = this.titleText;
      val var28: java.util.List = this.participantAvatarUris;
      val var20: CodedLinkExtendedType = this.extendedType;
      val var21: AnnotatedStructurableText = this.structurableSubtitleText;
      val var9: java.lang.String = this.noParticipantsText;
      val var4: Boolean = this.ctaEnabled;
      val var16: StringBuilder = new StringBuilder();
      var16.append("EmbeddedActivityInviteEmbedImpl(backgroundColor=");
      var16.append(var1);
      var16.append(", borderColor=");
      var16.append(var2);
      var16.append(", headerColor=");
      var16.append(var3);
      var16.append(", headerText=");
      var16.append(var18);
      var16.append(", type=");
      var16.append(var30);
      var16.append(", acceptLabelBackgroundColor=");
      var16.append(var8);
      var16.append(", acceptLabelBorderColor=");
      var16.append(var22);
      var16.append(", acceptLabelColor=");
      var16.append(var15);
      var16.append(", acceptLabelText=");
      var16.append(var10);
      var16.append(", bodyText=");
      var16.append(var19);
      var16.append(", bodyTextColor=");
      var16.append(var13);
      var16.append(", canBeAccepted=");
      var16.append(var14);
      var16.append(", embedCanBeTapped=");
      var16.append(var6);
      var16.append(", resolvingGradientEnd=");
      var16.append(var11);
      var16.append(", resolvingGradientStart=");
      var16.append(var31);
      var16.append(", splashHasRadialGradient=");
      var16.append(var23);
      var16.append(", splashOpacity=");
      var16.append(var24);
      var16.append(", splashUrl=");
      var16.append(var5);
      var16.append(", inviteSplash=");
      var16.append(var27);
      var16.append(", subtitle=");
      var16.append(var29);
      var16.append(", subtitleColor=");
      var16.append(var17);
      var16.append(", thumbnailBackgroundColor=");
      var16.append(var7);
      var16.append(", thumbnailCornerRadius=");
      var16.append(var33);
      var16.append(", thumbnailText=");
      var16.append(var26);
      var16.append(", thumbnailUrl=");
      var16.append(var12);
      var16.append(", titleColor=");
      var16.append(var25);
      var16.append(", titleText=");
      var16.append(var32);
      var16.append(", participantAvatarUris=");
      var16.append(var28);
      var16.append(", extendedType=");
      var16.append(var20);
      var16.append(", structurableSubtitleText=");
      var16.append(var21);
      var16.append(", noParticipantsText=");
      var16.append(var9);
      var16.append(", ctaEnabled=");
      var16.append(var4);
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
         val var10: Array<KSerializer> = EmbeddedActivityInviteEmbedImpl.access$get$childSerializers$cp();
         val var1: n0 = n0.a;
         val var2: b2 = b2.a;
         val var8: KSerializer = a.u(b2.a);
         val var6: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var9: KSerializer = a.u(var1);
         val var11: KSerializer = a.u(var1);
         val var7: KSerializer = a.u(var1);
         val var3: KSerializer = a.u(var2);
         val var5: KSerializer = a.u(var2);
         val var12: KSerializer = a.u(var1);
         val var4: h = h.a;
         return new KSerializer[]{
            var1,
            var1,
            var1,
            var8,
            var6,
            var9,
            var11,
            var7,
            var3,
            var5,
            var12,
            a.u(h.a),
            a.u(var4),
            a.u(var1),
            a.u(var1),
            a.u(var4),
            a.u(var1),
            a.u(var2),
            a.u(var2),
            a.u(var2),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var2),
            a.u(var2),
            a.u(var1),
            a.u(var2),
            var10[27],
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(AnnotatedStructurableTextSerializer.INSTANCE),
            var2,
            var4
         };
      }

      public open fun deserialize(decoder: Decoder): EmbeddedActivityInviteEmbedImpl {
         q.h(var1, "decoder");
         val var45: SerialDescriptor = this.getDescriptor();
         val var46: c = var1.c(var45);
         val var37: Array<KSerializer> = EmbeddedActivityInviteEmbedImpl.access$get$childSerializers$cp();
         val var9: Boolean = var46.y();
         var var34: AnnotatedStructurableText = null;
         var var2: Int;
         var var3: Int;
         var var5: Int;
         var var6: Int;
         var var7: Int;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: java.lang.String;
         var var22: Any;
         var var23: Any;
         var var24: java.lang.String;
         var var25: java.lang.String;
         var var26: Any;
         var var27: Any;
         var var28: Any;
         var var29: java.lang.String;
         var var30: java.lang.String;
         var var31: Any;
         var var32: Any;
         var var33: java.lang.String;
         var var35: Int;
         var var36: java.lang.String;
         val var38: Any;
         var var39: Any;
         val var48: java.lang.String;
         var var67: AnnotatedStructurableText;
         var var72: Any;
         var var79: Any;
         val var163: java.lang.String;
         val var165: java.lang.String;
         if (var9) {
            var6 = var46.k(var45, 0);
            var5 = var46.k(var45, 1);
            var3 = var46.k(var45, 2);
            val var47: b2 = b2.a;
            var36 = var46.v(var45, 3, b2.a, null) as java.lang.String;
            var22 = var46.v(var45, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var10: n0 = n0.a;
            var17 = var46.v(var45, 5, n0.a, null) as Int;
            var28 = var46.v(var45, 6, var10, null) as Int;
            var27 = var46.v(var45, 7, var10, null) as Int;
            var21 = var46.v(var45, 8, var47, null) as java.lang.String;
            var25 = var46.v(var45, 9, var47, null) as java.lang.String;
            var23 = var46.v(var45, 10, var10, null) as Int;
            val var11: h = h.a;
            var19 = var46.v(var45, 11, h.a, null) as java.lang.Boolean;
            var20 = var46.v(var45, 12, var11, null) as java.lang.Boolean;
            var38 = var46.v(var45, 13, var10, null) as Int;
            var32 = var46.v(var45, 14, var10, null) as Int;
            var18 = var46.v(var45, 15, var11, null) as java.lang.Boolean;
            var16 = var46.v(var45, 16, var10, null) as Int;
            var24 = var46.v(var45, 17, var47, null) as java.lang.String;
            var30 = var46.v(var45, 18, var47, null) as java.lang.String;
            var33 = var46.v(var45, 19, var47, null) as java.lang.String;
            val var59: Int = var46.v(var45, 20, var10, null) as Int;
            var39 = var46.v(var45, 21, var10, null) as Int;
            var79 = var46.v(var45, 22, var10, null) as Int;
            var29 = var46.v(var45, 23, var47, null) as java.lang.String;
            val var40: java.lang.String = var46.v(var45, 24, var47, null) as java.lang.String;
            var72 = var46.v(var45, 25, var10, null) as Int;
            var163 = var46.v(var45, 26, var47, null) as java.lang.String;
            val var13: java.util.List = var46.m(var45, 27, var37[27], null) as java.util.List;
            val var12: CodedLinkExtendedType = var46.m(var45, 28, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var54: AnnotatedStructurableText = var46.v(var45, 29, AnnotatedStructurableTextSerializer.INSTANCE, null) as AnnotatedStructurableText;
            var48 = var46.t(var45, 30);
            var2 = var46.s(var45, 31);
            var7 = -1;
            var26 = var59;
            var31 = var79;
            var35 = (Integer)var72;
            var165 = var40;
            var79 = var13;
            var72 = var12;
            var67 = var54;
         } else {
            var var8: Boolean = true;
            var7 = 0;
            var6 = 0;
            var5 = 0;
            var var4: Int = 0;
            var3 = 0;
            var27 = null;
            var26 = null;
            var30 = null;
            var31 = null;
            var29 = null;
            var28 = null;
            var25 = null;
            var var49: java.lang.String = null;
            var24 = null;
            var35 = null;
            var33 = null;
            var36 = null;
            var22 = null;
            var var55: Any = null;
            var var65: Any = null;
            var var60: Any = null;
            var21 = null;
            var17 = null;
            var72 = null;
            var18 = null;
            var20 = null;
            var23 = null;
            var67 = null;
            var79 = null;
            var16 = null;
            var32 = null;
            var19 = null;

            while (var8) {
               label108: {
                  label138: {
                     label91: {
                        label90: {
                           var2 = var46.x(var45);
                           switch (var2) {
                              case -1:
                                 var17 = var18;
                                 var8 = false;
                                 var24 = (java.lang.String)var72;
                                 var23 = var17;
                                 var22 = var21;
                                 var21 = (java.lang.String)var60;
                                 var20 = var65;
                                 var19 = var55;
                                 var18 = var22;
                                 var16 = var20;
                                 var79 = var23;
                                 var72 = var67;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var65 = var16;
                                 var60 = var19;
                                 var55 = var24;
                                 var2 = var7;
                                 break label108;
                              case 0:
                                 var17 = var18;
                                 var72 = var67;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var65 = var16;
                                 var60 = var19;
                                 var55 = var24;
                                 var6 = var46.k(var45, 0);
                                 var2 = var7 or 1;
                                 var79 = var23;
                                 var16 = var20;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 break label108;
                              case 1:
                                 var5 = var46.k(var45, 1);
                                 var2 = var7 or 2;
                                 break label90;
                              case 2:
                                 var4 = var46.k(var45, 2);
                                 var2 = var7 or 4;
                                 break label90;
                              case 3:
                                 var36 = var46.v(var45, 3, b2.a, var36) as java.lang.String;
                                 var2 = var7 or 8;
                                 break label90;
                              case 4:
                                 var17 = var18;
                                 var72 = var67;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var65 = var16;
                                 var60 = var19;
                                 var19 = var55;
                                 var18 = var46.v(var45, 4, InviteType.Serializer.INSTANCE, var22) as InviteType;
                                 var2 = var7 or 16;
                                 var55 = var24;
                                 var79 = var23;
                                 var16 = var20;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 break label108;
                              case 5:
                                 var17 = var18;
                                 var72 = var67;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var60 = var19;
                                 var19 = var46.v(var45, 5, n0.a, var55) as Int;
                                 var2 = var7 or 32;
                                 var18 = var22;
                                 var55 = var24;
                                 var65 = var16;
                                 var79 = var23;
                                 var16 = var20;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 break label108;
                              case 6:
                                 var17 = var18;
                                 var72 = var67;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var21 = (java.lang.String)var60;
                                 val var152: Int = var46.v(var45, 6, n0.a, var65) as Int;
                                 var2 = var7 or 64;
                                 var18 = var22;
                                 var19 = var55;
                                 var55 = var24;
                                 var60 = var19;
                                 var65 = var16;
                                 var79 = var23;
                                 var16 = var20;
                                 var20 = var152;
                                 var22 = var21;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 break label108;
                              case 7:
                                 var17 = var18;
                                 var72 = var67;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var21 = var46.v(var45, 7, n0.a, var60) as Int;
                                 var2 = var7 or 128;
                                 var19 = var55;
                                 var55 = var24;
                                 var60 = var19;
                                 var65 = var16;
                                 var79 = var23;
                                 var16 = var20;
                                 var18 = var22;
                                 var20 = var65;
                                 var22 = var21;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 break label108;
                              case 8:
                                 var72 = var67;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var23 = var17;
                                 val var150: java.lang.String = var46.v(var45, 8, b2.a, var21) as java.lang.String;
                                 var2 = var7 or 256;
                                 var55 = var24;
                                 var60 = var19;
                                 var65 = var16;
                                 var79 = var23;
                                 var16 = var20;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var150;
                                 var24 = (java.lang.String)var72;
                                 break label108;
                              case 9:
                                 var67 = (AnnotatedStructurableText)var79;
                                 var24 = (java.lang.String)var72;
                                 var39 = var46.v(var45, 9, b2.a, var17) as java.lang.String;
                                 var2 = var7 or 512;
                                 var55 = var24;
                                 var60 = var19;
                                 var65 = var16;
                                 var72 = var67;
                                 var79 = var23;
                                 var16 = var20;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 var23 = var39;
                                 break label108;
                              case 10:
                                 var67 = (AnnotatedStructurableText)var79;
                                 var24 = var46.v(var45, 10, n0.a, var72) as Int;
                                 var2 = var7 or 1024;
                                 var55 = var24;
                                 var60 = var19;
                                 var65 = var16;
                                 var72 = var67;
                                 var79 = var23;
                                 var16 = var20;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 var23 = var17;
                                 break label108;
                              case 11:
                                 var67 = (AnnotatedStructurableText)var79;
                                 var16 = var20;
                                 val var273: java.lang.Boolean = var46.v(var45, 11, h.a, var18) as java.lang.Boolean;
                                 var2 = var7 or 2048;
                                 var18 = var22;
                                 var55 = var24;
                                 var60 = var19;
                                 var65 = var16;
                                 var72 = var67;
                                 var79 = var23;
                                 var17 = var273;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 break label108;
                              case 12:
                                 var67 = (AnnotatedStructurableText)var79;
                                 var79 = var23;
                                 val var272: java.lang.Boolean = var46.v(var45, 12, h.a, var20) as java.lang.Boolean;
                                 var2 = var7 or 4096;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 var17 = var18;
                                 var55 = var24;
                                 var60 = var19;
                                 var65 = var16;
                                 var72 = var67;
                                 var16 = var272;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 break label108;
                              case 13:
                                 val var287: Int = var46.v(var45, 13, n0.a, var23) as Int;
                                 var2 = var7 or 8192;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 var17 = var18;
                                 var55 = var24;
                                 var60 = var19;
                                 var65 = var16;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var72 = var67;
                                 var79 = var287;
                                 var16 = var20;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 break label108;
                              case 14:
                                 val var295: Int = var46.v(var45, 14, n0.a, var67) as Int;
                                 var2 = var7 or 16384;
                                 var19 = var55;
                                 var17 = var18;
                                 var55 = var24;
                                 var60 = var19;
                                 var65 = var16;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var72 = var295;
                                 var79 = var23;
                                 var16 = var20;
                                 var18 = var22;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 break label108;
                              case 15:
                                 var79 = var46.v(var45, 15, h.a, var79) as java.lang.Boolean;
                                 var2 = var7 or '耀';
                                 var19 = var55;
                                 var17 = var18;
                                 var72 = var67;
                                 var55 = var24;
                                 var60 = var19;
                                 var65 = var16;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var79 = var23;
                                 var16 = var20;
                                 var18 = var22;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 break label108;
                              case 16:
                                 var16 = var46.v(var45, 16, n0.a, var16) as Int;
                                 var2 = var7 or 65536;
                                 var22 = var21;
                                 var24 = (java.lang.String)var72;
                                 var17 = var18;
                                 var72 = var67;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var55 = var24;
                                 var60 = var19;
                                 var65 = var16;
                                 var79 = var23;
                                 var16 = var20;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var23 = var17;
                                 break label108;
                              case 17:
                                 val var283: java.lang.String = var46.v(var45, 17, b2.a, var19) as java.lang.String;
                                 var2 = var7 or 131072;
                                 var19 = var55;
                                 var17 = var18;
                                 var72 = var67;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var65 = var16;
                                 var55 = var24;
                                 var60 = var283;
                                 var79 = var23;
                                 var16 = var20;
                                 var18 = var22;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 break label108;
                              case 18:
                                 val var282: java.lang.String = var46.v(var45, 18, b2.a, var24) as java.lang.String;
                                 var2 = var7 or 262144;
                                 var17 = var18;
                                 var72 = var67;
                                 var67 = (AnnotatedStructurableText)var79;
                                 var65 = var16;
                                 var60 = var19;
                                 var55 = var282;
                                 var79 = var23;
                                 var16 = var20;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = (java.lang.String)var60;
                                 var22 = var21;
                                 var23 = var17;
                                 var24 = (java.lang.String)var72;
                                 break label108;
                              case 19:
                                 var49 = var46.v(var45, 19, b2.a, var49) as java.lang.String;
                                 var2 = var7 or 524288;
                                 break label138;
                              case 20:
                                 var25 = var46.v(var45, 20, n0.a, var25) as Int;
                                 var2 = 1048576;
                                 break;
                              case 21:
                                 var28 = var46.v(var45, 21, n0.a, var28) as Int;
                                 var2 = 2097152;
                                 break;
                              case 22:
                                 var30 = var46.v(var45, 22, n0.a, var30) as Int;
                                 var2 = 4194304;
                                 break;
                              case 23:
                                 var29 = var46.v(var45, 23, b2.a, var29) as java.lang.String;
                                 var2 = 8388608;
                                 break;
                              case 24:
                                 var26 = var46.v(var45, 24, b2.a, var26) as java.lang.String;
                                 var2 = 16777216;
                                 break;
                              case 25:
                                 var27 = var46.v(var45, 25, n0.a, var27) as Int;
                                 var2 = 33554432;
                                 break;
                              case 26:
                                 var33 = var46.v(var45, 26, b2.a, var33) as java.lang.String;
                                 var2 = var7 or 67108864;
                                 break label91;
                              case 27:
                                 var31 = var46.m(var45, 27, var37[27], var31) as java.util.List;
                                 var2 = var7 or 134217728;
                                 break label91;
                              case 28:
                                 var35 = var46.m(var45, 28, CodedLinkExtendedType.Serializer.INSTANCE, var35) as CodedLinkExtendedType;
                                 var2 = var7 or 268435456;
                                 break label91;
                              case 29:
                                 var34 = var46.v(var45, 29, AnnotatedStructurableTextSerializer.INSTANCE, var34) as AnnotatedStructurableText;
                                 var2 = var7 or 536870912;
                                 break label91;
                              case 30:
                                 var32 = var46.t(var45, 30);
                                 var2 = var7 or 1073741824;
                                 break label138;
                              case 31:
                                 var3 = var46.s(var45, 31);
                                 var2 = var7 or Integer.MIN_VALUE;
                                 break label138;
                              default:
                                 throw new n(var2);
                           }

                           var2 = var7 or var2;
                           break label91;
                        }

                        var21 = (java.lang.String)var60;
                        var17 = var18;
                        var72 = var67;
                        var67 = (AnnotatedStructurableText)var79;
                        var65 = var16;
                        var60 = var19;
                        var55 = var24;
                        var79 = var23;
                        var16 = var20;
                        var18 = var22;
                        var19 = var55;
                        var20 = var65;
                        var22 = var21;
                        var23 = var17;
                        var24 = (java.lang.String)var72;
                        break label108;
                     }

                     var17 = var18;
                     var72 = var67;
                     var67 = (AnnotatedStructurableText)var79;
                     var65 = var16;
                     var60 = var19;
                     var55 = var24;
                     var79 = var23;
                     var16 = var20;
                     var18 = var22;
                     var19 = var55;
                     var20 = var65;
                     var21 = (java.lang.String)var60;
                     var22 = var21;
                     var23 = var17;
                     var24 = (java.lang.String)var72;
                     break label108;
                  }

                  var17 = var18;
                  var24 = (java.lang.String)var72;
                  var23 = var17;
                  var22 = var21;
                  var21 = (java.lang.String)var60;
                  var20 = var65;
                  var19 = var55;
                  var18 = var22;
                  var16 = var20;
                  var79 = var23;
                  var72 = var67;
                  var67 = (AnnotatedStructurableText)var79;
                  var65 = var16;
                  var60 = var19;
                  var55 = var24;
               }

               var67 = (AnnotatedStructurableText)var72;
               var65 = var20;
               var60 = var21;
               var21 = (java.lang.String)var22;
               var17 = var23;
               var72 = var24;
               var7 = var2;
               var24 = (java.lang.String)var55;
               var22 = var18;
               var55 = var19;
               var18 = var17;
               var20 = var16;
               var23 = var79;
               var79 = var67;
               var16 = var65;
               var19 = var60;
            }

            var2 = var3;
            var48 = (java.lang.String)var32;
            var67 = var34;
            var72 = var35;
            var79 = var31;
            var165 = (java.lang.String)var26;
            var163 = var33;
            var35 = (Integer)var27;
            var39 = var28;
            var31 = var30;
            var26 = var25;
            var19 = var18;
            var33 = var49;
            var30 = var24;
            var24 = (java.lang.String)var19;
            var18 = var79;
            var32 = var67;
            var38 = var23;
            var23 = var72;
            var25 = (java.lang.String)var17;
            var27 = var60;
            var28 = var65;
            var17 = var55;
            var3 = var4;
         }

         var46.b(var45);
         return new EmbeddedActivityInviteEmbedImpl(
            var7,
            0,
            var6,
            var5,
            var3,
            var36,
            (InviteType)var22,
            (Integer)var17,
            (Integer)var28,
            (Integer)var27,
            var21,
            var25,
            (Integer)var23,
            (java.lang.Boolean)var19,
            (java.lang.Boolean)var20,
            (Integer)var38,
            (Integer)var32,
            (java.lang.Boolean)var18,
            (Integer)var16,
            var24,
            var30,
            var33,
            (Integer)var26,
            (Integer)var39,
            (Integer)var31,
            var29,
            var165,
            var35,
            var163,
            (java.util.List)var79,
            (CodedLinkExtendedType)var72,
            var67,
            var48,
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
